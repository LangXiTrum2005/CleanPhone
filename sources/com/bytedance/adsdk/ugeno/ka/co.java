package com.bytedance.adsdk.ugeno.ka;

import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class co {
    public static di.ri ri(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        di.ri riVar = new di.ri();
        String strRi = com.bytedance.adsdk.ugeno.ik.lr.ri(str, jSONObject);
        if (strRi.contains("#")) {
            strRi = strRi.replace("#", "%23");
        }
        Uri uri = Uri.parse(strRi);
        if (uri == null) {
            return null;
        }
        riVar.ik(strRi);
        if (!TextUtils.isEmpty(uri.getScheme())) {
            riVar.ri(uri.getScheme());
        }
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            authority = uri.getPath();
        }
        riVar.lr(authority);
        riVar.ka(riVar.ri() + "://" + riVar.lr());
        HashMap map = new HashMap();
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames != null && queryParameterNames.size() > 0) {
            for (String str2 : queryParameterNames) {
                map.put(str2, com.bytedance.adsdk.ugeno.ik.lr.ri(uri.getQueryParameter(str2), jSONObject));
            }
        }
        riVar.ri(map);
        return riVar;
    }
}
