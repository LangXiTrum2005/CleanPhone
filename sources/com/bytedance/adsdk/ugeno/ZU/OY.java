package com.bytedance.adsdk.ugeno.ZU;

import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class OY {
    public static LD.Lxb Lxb(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        LD.Lxb lxb = new LD.Lxb();
        Uri uri = Uri.parse(str);
        if (uri == null) {
            return null;
        }
        if (!TextUtils.isEmpty(uri.getScheme())) {
            lxb.Lxb(uri.getScheme());
        }
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            authority = uri.getPath();
        }
        lxb.LD(authority);
        HashMap map = new HashMap();
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames != null && queryParameterNames.size() > 0) {
            for (String str2 : queryParameterNames) {
                map.put(str2, com.bytedance.adsdk.ugeno.lk.LD.Lxb(uri.getQueryParameter(str2), jSONObject));
            }
        }
        lxb.Lxb(map);
        return lxb;
    }
}
