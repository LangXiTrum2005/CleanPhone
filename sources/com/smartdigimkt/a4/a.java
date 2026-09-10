package com.smartdigimkt.a4;

import android.util.Log;
import com.smartdigimkt.p4.f0;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f33605a = "ClearKeyUtil";

    private a() {
    }

    public static byte[] a(byte[] bArr) {
        return f0.f37540a >= 27 ? bArr : f0.e(a(f0.a(bArr)));
    }

    public static byte[] b(byte[] bArr) {
        if (f0.f37540a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(f0.a(bArr));
            StringBuilder sb = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                if (i2 != 0) {
                    sb.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                sb.append("{\"k\":\"");
                sb.append(b(jSONObject2.getString("k")));
                sb.append("\",\"kid\":\"");
                sb.append(b(jSONObject2.getString("kid")));
                sb.append("\",\"kty\":\"");
                sb.append(jSONObject2.getString("kty"));
                sb.append("\"}");
            }
            sb.append("]}");
            return f0.e(sb.toString());
        } catch (JSONException e2) {
            Log.e(f33605a, "Failed to adjust response data: " + f0.a(bArr), e2);
            return bArr;
        }
    }

    private static String a(String str) {
        return str.replace('+', '-').replace(IOUtils.DIR_SEPARATOR_UNIX, '_');
    }

    private static String b(String str) {
        return str.replace('-', '+').replace('_', IOUtils.DIR_SEPARATOR_UNIX);
    }
}
