package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ot {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f18356a;

    public ot(JSONObject jSONObject) throws JSONException {
        if (zzo.zzm(2)) {
            zze.zza("Mediation Response JSON: ".concat(String.valueOf(jSONObject.toString(2))));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i10 = -1;
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            try {
                nt ntVar = new nt(jSONArray.getJSONObject(i11));
                "banner".equalsIgnoreCase(ntVar.f17946c);
                arrayList.add(ntVar);
                if (i10 < 0) {
                    Iterator it = ntVar.f17944a.iterator();
                    while (it.hasNext()) {
                        if (((String) it.next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                            i10 = i11;
                            break;
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        jSONArray.length();
        this.f18356a = Collections.unmodifiableList(arrayList);
        jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1L);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("settings");
        if (jSONObjectOptJSONObject != null) {
            jSONObjectOptJSONObject.optLong("ad_network_timeout_millis", -1L);
            zzt.zzx();
            pt.a("click_urls", jSONObjectOptJSONObject);
            zzt.zzx();
            pt.a("imp_urls", jSONObjectOptJSONObject);
            zzt.zzx();
            pt.a("downloaded_imp_urls", jSONObjectOptJSONObject);
            zzt.zzx();
            pt.a("nofill_urls", jSONObjectOptJSONObject);
            zzt.zzx();
            pt.a("remote_ping_urls", jSONObjectOptJSONObject);
            jSONObjectOptJSONObject.optBoolean("render_in_browser", false);
            jSONObjectOptJSONObject.optLong(ToolBar.REFRESH, -1L);
            dy.b(jSONObjectOptJSONObject.optJSONArray("rewards"));
            jSONObjectOptJSONObject.optBoolean("use_displayed_impression", false);
            jSONObjectOptJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            jSONObjectOptJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            jSONObjectOptJSONObject.optBoolean("allow_custom_click_gesture", false);
        }
    }
}
