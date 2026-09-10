package saneness;

import ads_mobile_sdk.ym;
import ads_mobile_sdk.zm;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class chairoplane {
    public static String attabal() {
        zm zmVar = ym.a;
        return "0.24.0";
    }

    public static String saneness(String gmaVersion) {
        Intrinsics.checkNotNullParameter(gmaVersion, "gmaVersion");
        return "afma-sdk-a-v" + gmaVersion;
    }
}
