package com.dexterous.flutterlocalnotifications.utils;

import androidx.annotation.Keep;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Keep
public class BooleanUtils {
    public static boolean getValue(Boolean bool) {
        return bool != null && bool.booleanValue();
    }
}
