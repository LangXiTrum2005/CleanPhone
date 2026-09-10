package puffin;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import decarock.grimness;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: compiled from: ClearKeyUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class attabal {
    public static byte[] attabal(byte[] bArr) {
        return grimness.f25080attabal >= 27 ? bArr : grimness.czestochowa(dern(grimness.kattegat(bArr)));
    }

    public static String dern(String str) {
        return str.replace(SignatureVisitor.EXTENDS, SignatureVisitor.SUPER).replace('/', '_');
    }

    public static byte[] saneness(byte[] bArr) {
        if (grimness.f25080attabal >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(grimness.kattegat(bArr));
            StringBuilder sb = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i = 0; i < jSONArray.length(); i++) {
                if (i != 0) {
                    sb.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                sb.append("{\"k\":\"");
                sb.append(wireman(jSONObject2.getString(CampaignEx.JSON_KEY_AD_K)));
                sb.append("\",\"kid\":\"");
                sb.append(wireman(jSONObject2.getString("kid")));
                sb.append("\",\"kty\":\"");
                sb.append(jSONObject2.getString("kty"));
                sb.append("\"}");
            }
            sb.append("]}");
            return grimness.czestochowa(sb.toString());
        } catch (JSONException e) {
            decarock.triweekly.wireman("ClearKeyUtil", "Failed to adjust response data: " + grimness.kattegat(bArr), e);
            return bArr;
        }
    }

    public static String wireman(String str) {
        return str.replace(SignatureVisitor.SUPER, SignatureVisitor.EXTENDS).replace('_', '/');
    }
}
