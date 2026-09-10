package saneness;

import ads_mobile_sdk.q6;
import java.util.Locale;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class monocoque {
    public static q6 attabal(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        String lowerCase = value.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return Intrinsics.wireman(lowerCase, "app_open_ad") ? q6.APP_OPEN : (q6) Enum.valueOf(q6.class, value);
    }
}
