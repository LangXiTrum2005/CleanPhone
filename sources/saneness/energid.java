package saneness;

import ads_mobile_sdk.dq2;
import ads_mobile_sdk.on0;
import ads_mobile_sdk.tn0;
import com.google.gson.JsonObject;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class energid {
    public static spartacist attabal(JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        dq2 block = new dq2(jsonObject);
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            return new tn0(block.invoke());
        } catch (Exception e) {
            return new on0(e, null, null, 6);
        }
    }
}
