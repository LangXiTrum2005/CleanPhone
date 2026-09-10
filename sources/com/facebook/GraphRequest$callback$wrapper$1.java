package com.facebook;

import android.support.v4.media.a;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import com.p004ironsource.qt;
import java.util.HashMap;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", qt.f26623n, "Lcom/facebook/GraphResponse;", "onCompleted"}, k = 3, mv = {1, 5, 1})
final class GraphRequest$callback$wrapper$1 implements GraphRequest.Callback {
    @Override // com.facebook.GraphRequest.Callback
    public final void a(GraphResponse graphResponse) {
        JSONObject jSONObject = graphResponse.f15952c;
        JSONObject jSONObjectOptJSONObject = jSONObject != null ? jSONObject.optJSONObject("__debug__") : null;
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONArray("messages") : null;
        if (jSONArrayOptJSONArray == null) {
            throw null;
        }
        int length = jSONArrayOptJSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i2);
            String strOptString = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString(PglCryptUtils.KEY_MESSAGE) : null;
            String strOptString2 = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("type") : null;
            String strOptString3 = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("link") : null;
            if (strOptString != null && strOptString2 != null) {
                LoggingBehavior loggingBehavior = LoggingBehavior.i0;
                if (strOptString2.equals("warning")) {
                    loggingBehavior = LoggingBehavior.h0;
                }
                if (!Utility.C(strOptString3)) {
                    strOptString = a.D(strOptString, " Link: ", strOptString3);
                }
                HashMap map = Logger.d;
                String str = GraphRequest.j;
                Logger.Companion.a(loggingBehavior, "GraphRequest", strOptString);
            }
        }
        throw null;
    }
}
