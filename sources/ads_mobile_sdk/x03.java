package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.loun;

/* JADX INFO: loaded from: classes.dex */
public final class x03 {
    public static loun a;

    public static void a(String message) {
        loun lounVar;
        Intrinsics.checkNotNullParameter(message, "message");
        kn0.b(message, null);
        IllegalStateException illegalStateException = new IllegalStateException(message);
        illegalStateException.printStackTrace();
        zm zmVar = ym.a;
        if (zmVar == zm.DEVELOPMENT || zmVar == zm.INTEGRATION_TEST) {
            throw illegalStateException;
        }
        if (zmVar != zm.PRODUCTION || (lounVar = a) == null) {
            return;
        }
        ((d13) lounVar).a(message, illegalStateException);
    }
}
