package saneness;

import ads_mobile_sdk.j71;
import ads_mobile_sdk.l13;
import ads_mobile_sdk.le2;
import ads_mobile_sdk.no0;
import ads_mobile_sdk.o6;
import ads_mobile_sdk.rf1;
import ads_mobile_sdk.xb2;
import java.util.List;
import java.util.UUID;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class asosan {
    public static rf1 attabal(no0 cuiName, List tags, boolean z) {
        Intrinsics.checkNotNullParameter(cuiName, "cuiName");
        Intrinsics.checkNotNullParameter(tags, "tags");
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        return new rf1(cuiName, tags, uuidRandomUUID, new l13(new xb2(), new j71(), new le2(), new o6()), 0, 0, null, z);
    }
}
