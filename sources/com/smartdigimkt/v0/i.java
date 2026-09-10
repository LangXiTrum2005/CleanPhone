package com.smartdigimkt.v0;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f38985a = "JSONUtils";

    public static ArrayList<String> a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        ArrayList<String> arrayList = new ArrayList<>(length);
        for (int i2 = 0; i2 < length; i2++) {
            arrayList.add(jSONArray.optString(i2));
        }
        return arrayList;
    }

    public static String a(int i2, int i3, int i4, int i5, int i6) {
        JSONObject jSONObject = new JSONObject();
        try {
            try {
                jSONObject.put("code", 0);
                jSONObject.put(PglCryptUtils.KEY_MESSAGE, "Sucess");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("rotateAngle", i2);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(TtmlNode.LEFT, i3);
                jSONObject3.put(TtmlNode.RIGHT, i4);
                jSONObject3.put("top", i5);
                jSONObject3.put("bottom", i6);
                jSONObject2.put("cutoutInfo", jSONObject3);
                jSONObject.put("data", jSONObject2);
            } catch (Exception e2) {
                e2.getMessage();
            }
        } catch (Throwable th) {
            th.getMessage();
            try {
                jSONObject.put("code", 1);
                jSONObject.put(PglCryptUtils.KEY_MESSAGE, "Fail");
            } catch (JSONException e3) {
                e3.getMessage();
            }
        }
        return jSONObject.toString();
    }
}
