package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.ironsource.O6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class yo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f22331a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f22332b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f22333c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f22334d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f22335e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Executor f22336f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public JSONObject f22337g;

    public yo0(k00 k00Var) {
        this.f22336f = k00Var;
    }

    public static final Bundle j(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle.putString(next, jSONObject.optString(next, ""));
            }
        }
        return bundle;
    }

    public final synchronized db1 a(String str, String str2) {
        Map map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(zzt.zzh().g().zzi().f12961e) && (map = (Map) this.f22333c.get(str)) != null) {
                List<zo0> list = (List) map.get(str2);
                if (list == null) {
                    String strG = dv.g(this.f22337g, str2, str);
                    if (((Boolean) zzba.zzc().a(am.Ac)).booleanValue()) {
                        strG = strG.toLowerCase(Locale.ROOT);
                    }
                    list = (List) map.get(strG);
                }
                if (list != null) {
                    HashMap map2 = new HashMap();
                    for (zo0 zo0Var : list) {
                        String str3 = zo0Var.f22680a;
                        if (!map2.containsKey(str3)) {
                            map2.put(str3, new ArrayList());
                        }
                        ((List) map2.get(str3)).add(zo0Var.f22681b);
                    }
                    return db1.a(map2);
                }
            }
            return db1.f13484g;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(String str) {
        if (!TextUtils.isEmpty(str)) {
            HashMap map = this.f22331a;
            if (!map.containsKey(str)) {
                map.put(str, new zo0(new Bundle(), str));
            }
        }
    }

    public final synchronized void c() {
        this.f22332b.clear();
        this.f22331a.clear();
        this.f22335e.clear();
        this.f22334d.clear();
        f();
        d();
        e();
    }

    public final synchronized void d() {
        JSONObject jSONObject;
        if (!((Boolean) mn.f17491g.o()).booleanValue()) {
            if (((Boolean) zzba.zzc().a(am.B2)).booleanValue() && (jSONObject = zzt.zzh().g().zzi().f12963g) != null) {
                try {
                    JSONArray jSONArray = jSONObject.getJSONArray("signal_adapters");
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                        Bundle bundleJ = j(jSONObject2.optJSONObject("data"));
                        String strOptString = jSONObject2.optString("adapter_class_name");
                        boolean zOptBoolean = jSONObject2.optBoolean("render", false);
                        boolean zOptBoolean2 = jSONObject2.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(strOptString)) {
                            this.f22332b.put(strOptString, new bp0(strOptString, zOptBoolean2, zOptBoolean, true, bundleJ));
                        }
                    }
                } catch (JSONException e10) {
                    zze.zzb("Malformed config loading JSON.", e10);
                }
            }
        }
    }

    public final synchronized void e() {
        JSONObject jSONObject;
        try {
            if (!((Boolean) mn.f17486b.o()).booleanValue()) {
                if (((Boolean) zzba.zzc().a(am.C2)).booleanValue() && (jSONObject = zzt.zzh().g().zzi().f12963g) != null) {
                    try {
                        JSONArray jSONArray = jSONObject.getJSONArray("adapter_settings");
                        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                            String strOptString = jSONObject2.optString("adapter_class_name");
                            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("permission_set");
                            if (!TextUtils.isEmpty(strOptString) && jSONArrayOptJSONArray != null) {
                                for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                                    JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i11);
                                    boolean zOptBoolean = jSONObject3.optBoolean("enable_rendering", false);
                                    boolean zOptBoolean2 = jSONObject3.optBoolean("collect_secure_signals", false);
                                    boolean zOptBoolean3 = jSONObject3.optBoolean("collect_secure_signals_on_full_app", false);
                                    String strOptString2 = jSONObject3.optString(O6.H);
                                    bp0 bp0Var = new bp0(strOptString, zOptBoolean2, zOptBoolean, zOptBoolean3, new Bundle());
                                    if (strOptString2.equals("ADMOB")) {
                                        this.f22334d.put(strOptString, bp0Var);
                                    } else if (strOptString2.equals("AD_MANAGER")) {
                                        this.f22335e.put(strOptString, bp0Var);
                                    }
                                }
                            }
                        }
                    } catch (JSONException e10) {
                        zze.zzb("Malformed config loading JSON.", e10);
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void f() {
        JSONArray jSONArrayOptJSONArray;
        try {
            JSONObject jSONObject = zzt.zzh().g().zzi().f12963g;
            if (jSONObject != null) {
                try {
                    JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("ad_unit_id_settings");
                    this.f22337g = jSONObject.optJSONObject("ad_unit_patterns");
                    if (jSONArrayOptJSONArray2 != null) {
                        for (int i10 = 0; i10 < jSONArrayOptJSONArray2.length(); i10++) {
                            JSONObject jSONObject2 = jSONArrayOptJSONArray2.getJSONObject(i10);
                            String lowerCase = ((Boolean) zzba.zzc().a(am.Ac)).booleanValue() ? jSONObject2.optString("ad_unit_id", "").toLowerCase(Locale.ROOT) : jSONObject2.optString("ad_unit_id", "");
                            String strOptString = jSONObject2.optString("format", "");
                            ArrayList arrayList = new ArrayList();
                            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("mediation_config");
                            if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("ad_networks")) != null) {
                                for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                                    arrayList.addAll(g(jSONArrayOptJSONArray.getJSONObject(i11)));
                                }
                            }
                            h(strOptString, lowerCase, arrayList);
                        }
                    }
                } catch (JSONException e10) {
                    zze.zzb("Malformed config loading JSON.", e10);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized ArrayList g(JSONObject jSONObject) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            if (jSONObject != null) {
                Bundle bundleJ = j(jSONObject.optJSONObject("data"));
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rtb_adapters");
                if (jSONArrayOptJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                        String strOptString = jSONArrayOptJSONArray.optString(i10, "");
                        if (!TextUtils.isEmpty(strOptString)) {
                            arrayList2.add(strOptString);
                        }
                    }
                    int size = arrayList2.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        String str = (String) arrayList2.get(i11);
                        b(str);
                        if (((zo0) this.f22331a.get(str)) != null) {
                            arrayList.add(new zo0(bundleJ, str));
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    public final synchronized void h(String str, String str2, ArrayList arrayList) {
        try {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            HashMap map = this.f22333c;
            Map map2 = (Map) map.get(str);
            if (map2 == null) {
                map2 = new HashMap();
            }
            map.put(str, map2);
            List arrayList2 = (List) map2.get(str2);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
            }
            arrayList2.addAll(arrayList);
            map2.put(str2, arrayList2);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized db1 i(String str) {
        HashMap map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(zzt.zzh().g().zzi().f12961e)) {
                boolean zMatches = Pattern.matches((String) zzba.zzc().a(am.f12252m4), str);
                boolean zMatches2 = Pattern.matches((String) zzba.zzc().a(am.f12266n4), str);
                if (zMatches) {
                    map = new HashMap(this.f22335e);
                } else if (zMatches2) {
                    map = new HashMap(this.f22334d);
                }
                return db1.a(map);
            }
            return db1.f13484g;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
