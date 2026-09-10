package saneness;

import ads_mobile_sdk.k41;
import ads_mobile_sdk.nn0;
import ads_mobile_sdk.rn0;
import ads_mobile_sdk.tn0;
import ads_mobile_sdk.xm;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.ironsource.mediationsdk.metadata.a;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class vocationalize {
    public static spartacist attabal(spartacist jsResult) {
        String asString;
        String asString2;
        Intrinsics.checkNotNullParameter(jsResult, "jsResult");
        if (!(jsResult instanceof tn0)) {
            if (jsResult instanceof nn0) {
                return jsResult;
            }
            throw new NoWhenBranchMatchedException();
        }
        JsonObject jsonObject = (JsonObject) ((tn0) jsResult).a();
        JsonElement jsonElement = jsonObject.get("errors");
        String asString3 = jsonElement != null ? jsonElement.getAsString() : null;
        JsonElement jsonElement2 = jsonObject.get("valid");
        if (jsonElement2 != null) {
            boolean z = true;
            if (jsonElement2.getAsInt() == 1) {
                JsonElement jsonElement3 = jsonObject.get("url");
                String asString4 = jsonElement3 != null ? jsonElement3.getAsString() : null;
                if (asString4 == null) {
                    return new rn0("BuildAdUrlResult url is null");
                }
                JsonElement jsonElement4 = jsonObject.get("base_uri");
                String asString5 = jsonElement4 != null ? jsonElement4.getAsString() : null;
                JsonElement jsonElement5 = jsonObject.get("post_parameters");
                String asString6 = jsonElement5 != null ? jsonElement5.getAsString() : null;
                JsonElement jsonElement6 = jsonObject.get("cookies_include");
                if (jsonElement6 != null && (asString2 = jsonElement6.getAsString()) != null && !Intrinsics.wireman(asString2, "1") && !Intrinsics.wireman(asString2, a.g)) {
                    z = false;
                }
                boolean z2 = z;
                JsonElement jsonElement7 = jsonObject.get("csrb_errors");
                return new tn0(new xm(asString3 != null ? StringsKt.split$default(asString3, new String[]{","}, false, 0, 6, null) : null, asString5, asString6, z2, asString4, null, (jsonElement7 == null || (asString = jsonElement7.getAsString()) == null) ? null : StringsKt.split$default(asString, new String[]{","}, false, 0, 6, null)));
            }
        }
        return new rn0("Error building request URL: " + asString3, k41.INVALID_REQUEST);
    }
}
