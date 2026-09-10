package com.willy.ratingbar;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
class RatingBarUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static DecimalFormat f42869a;

    public static float a(PartialView partialView, float f, float f2) {
        if (f42869a == null) {
            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.ENGLISH);
            decimalFormatSymbols.setDecimalSeparator('.');
            f42869a = new DecimalFormat("#.##", decimalFormatSymbols);
        }
        DecimalFormat decimalFormat = f42869a;
        return Float.parseFloat(decimalFormat.format(((Integer) partialView.getTag()).intValue() - (1.0f - (Math.round(Float.parseFloat(decimalFormat.format((f2 - partialView.getLeft()) / partialView.getWidth())) / f) * f))));
    }
}
