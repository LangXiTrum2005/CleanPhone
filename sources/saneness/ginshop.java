package saneness;

import ads_mobile_sdk.yf2;
import java.util.LinkedHashMap;
import java.util.Locale;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ginshop {
    public static yf2 attabal(String format) {
        Intrinsics.checkNotNullParameter(format, "format");
        LinkedHashMap linkedHashMap = yf2.c;
        String lowerCase = format.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return (yf2) linkedHashMap.get(lowerCase);
    }
}
