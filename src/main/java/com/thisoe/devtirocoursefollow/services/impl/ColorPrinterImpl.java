package com.thisoe.devtirocoursefollow.services.impl;

import com.thisoe.devtirocoursefollow.services.BluePrinter;
import com.thisoe.devtirocoursefollow.services.ColorPrinter;
import com.thisoe.devtirocoursefollow.services.GreenPrinter;
import com.thisoe.devtirocoursefollow.services.RedPrinter;

public class ColorPrinterImpl implements ColorPrinter {
    private RedPrinter redPrinter;
    private BluePrinter bluePrinter;
    private GreenPrinter greenPrinter;

    public ColorPrinterImpl(RedPrinter redPrinter, BluePrinter bluePrinter, GreenPrinter greenPrinter) {
        this.bluePrinter = bluePrinter;
        this.greenPrinter = greenPrinter;
        this.redPrinter = redPrinter;
    }

    @Override
    public String print() {
        return String.join(", ", redPrinter.print(), bluePrinter.print(), greenPrinter.print());
    }
}