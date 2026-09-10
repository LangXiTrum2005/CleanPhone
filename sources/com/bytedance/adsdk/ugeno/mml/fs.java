package com.bytedance.adsdk.ugeno.mml;

import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class fs {
    public static mo.qdl qdl(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        mo.qdl qdlVar = new mo.qdl();
        String strQdl = com.bytedance.adsdk.ugeno.lnr.ud.qdl(str, jSONObject);
        if (strQdl.contains("#")) {
            strQdl = strQdl.replace("#", "%23");
        }
        Uri uri = Uri.parse(strQdl);
        if (uri == null) {
            return null;
        }
        qdlVar.lnr(strQdl);
        if (!TextUtils.isEmpty(uri.getScheme())) {
            qdlVar.qdl(uri.getScheme());
        }
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            authority = uri.getPath();
        }
        qdlVar.ud(authority);
        qdlVar.mml(qdlVar.qdl() + "://" + qdlVar.ud());
        HashMap map = new HashMap();
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames != null && queryParameterNames.size() > 0) {
            for (String str2 : queryParameterNames) {
                map.put(str2, com.bytedance.adsdk.ugeno.lnr.ud.qdl(uri.getQueryParameter(str2), jSONObject));
            }
        }
        qdlVar.qdl(map);
        return qdlVar;
    }
}
