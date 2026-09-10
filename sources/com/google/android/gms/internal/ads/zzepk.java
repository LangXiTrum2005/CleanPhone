package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
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

/* JADX INFO: loaded from: classes4.dex */
public final class zzepk {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private final Map zze = new HashMap();
    private final Executor zzf;
    private JSONObject zzg;

    public zzepk(Executor executor) {
        this.zzf = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzi, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized void zzh() {
        this.zzb.clear();
        this.zza.clear();
        this.zze.clear();
        this.zzd.clear();
        zzl();
        zzj();
        zzk();
    }

    private final synchronized void zzj() {
        JSONObject jSONObjectZzg;
        if (!((Boolean) zzbiq.zzf.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcp)).booleanValue() && (jSONObjectZzg = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzg()) != null) {
                try {
                    JSONArray jSONArray = jSONObjectZzg.getJSONArray("signal_adapters");
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i2);
                        Bundle bundleZzp = zzp(jSONObject.optJSONObject("data"));
                        String strOptString = jSONObject.optString("adapter_class_name");
                        boolean zOptBoolean = jSONObject.optBoolean("render", false);
                        boolean zOptBoolean2 = jSONObject.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(strOptString)) {
                            this.zzb.put(strOptString, new zzepo(strOptString, zOptBoolean2, zOptBoolean, true, bundleZzp));
                        }
                    }
                } catch (JSONException e2) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Malformed config loading JSON.", e2);
                }
            }
        }
    }

    private final synchronized void zzk() {
        JSONObject jSONObjectZzg;
        try {
            if (!((Boolean) zzbiq.zzb.zze()).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcq)).booleanValue() && (jSONObjectZzg = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzg()) != null) {
                    try {
                        JSONArray jSONArray = jSONObjectZzg.getJSONArray("adapter_settings");
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i2);
                            String strOptString = jSONObject.optString("adapter_class_name");
                            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("permission_set");
                            if (!TextUtils.isEmpty(strOptString) && jSONArrayOptJSONArray != null) {
                                for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i3);
                                    boolean zOptBoolean = jSONObject2.optBoolean("enable_rendering", false);
                                    boolean zOptBoolean2 = jSONObject2.optBoolean("collect_secure_signals", false);
                                    boolean zOptBoolean3 = jSONObject2.optBoolean("collect_secure_signals_on_full_app", false);
                                    String strOptString2 = jSONObject2.optString("platform");
                                    zzepo zzepoVar = new zzepo(strOptString, zOptBoolean2, zOptBoolean, zOptBoolean3, new Bundle());
                                    if (strOptString2.equals("ADMOB")) {
                                        this.zzd.put(strOptString, zzepoVar);
                                    } else if (strOptString2.equals("AD_MANAGER")) {
                                        this.zze.put(strOptString, zzepoVar);
                                    }
                                }
                            }
                        }
                    } catch (JSONException e2) {
                        com.google.android.gms.ads.internal.util.zze.zzb("Malformed config loading JSON.", e2);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzl() {
        JSONArray jSONArrayOptJSONArray;
        try {
            JSONObject jSONObjectZzg = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzg();
            if (jSONObjectZzg != null) {
                try {
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectZzg.optJSONArray("ad_unit_id_settings");
                    this.zzg = jSONObjectZzg.optJSONObject("ad_unit_patterns");
                    if (jSONArrayOptJSONArray2 != null) {
                        for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                            JSONObject jSONObject = jSONArrayOptJSONArray2.getJSONObject(i2);
                            String lowerCase = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzmm)).booleanValue() ? jSONObject.optString("ad_unit_id", "").toLowerCase(Locale.ROOT) : jSONObject.optString("ad_unit_id", "");
                            String strOptString = jSONObject.optString("format", "");
                            ArrayList arrayList = new ArrayList();
                            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("mediation_config");
                            if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("ad_networks")) != null) {
                                for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                                    arrayList.addAll(zzm(jSONArrayOptJSONArray.getJSONObject(i3), strOptString));
                                }
                            }
                            zzn(strOptString, lowerCase, arrayList);
                        }
                    }
                } catch (JSONException e2) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Malformed config loading JSON.", e2);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized List zzm(JSONObject jSONObject, String str) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            if (jSONObject != null) {
                Bundle bundleZzp = zzp(jSONObject.optJSONObject("data"));
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rtb_adapters");
                if (jSONArrayOptJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                        String strOptString = jSONArrayOptJSONArray.optString(i2, "");
                        if (!TextUtils.isEmpty(strOptString)) {
                            arrayList2.add(strOptString);
                        }
                    }
                    int size = arrayList2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        String str2 = (String) arrayList2.get(i3);
                        zze(str2);
                        if (((zzepm) this.zza.get(str2)) != null) {
                            arrayList.add(new zzepm(str2, str, bundleZzp));
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    private final synchronized void zzn(String str, String str2, List list) {
        try {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            Map map = this.zzc;
            Map map2 = (Map) map.get(str);
            if (map2 == null) {
                map2 = new HashMap();
            }
            map.put(str, map2);
            List arrayList = (List) map2.get(str2);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.addAll(list);
            map2.put(str2, arrayList);
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized zzgtg zzo(String str) {
        HashMap map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzd())) {
                boolean zMatches = Pattern.matches((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdY), str);
                boolean zMatches2 = Pattern.matches((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdZ), str);
                if (zMatches) {
                    map = new HashMap(this.zze);
                } else if (zMatches2) {
                    map = new HashMap(this.zzd);
                }
                return zzgtg.zzc(map);
            }
            return zzgtg.zza();
        } catch (Throwable th) {
            throw th;
        }
    }

    private static final Bundle zzp(JSONObject jSONObject) {
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

    public final void zza() {
        com.google.android.gms.ads.internal.zzt.zzh().zzo().zzk(new Runnable() { // from class: com.google.android.gms.internal.ads.zzepj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzf();
            }
        });
        this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeph
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzg();
            }
        });
    }

    public final synchronized Map zzb() {
        if (TextUtils.isEmpty(com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzd())) {
            return zzgtg.zza();
        }
        return zzgtg.zzc(this.zzb);
    }

    public final synchronized Map zzc(String str, String str2) {
        Map map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzd()) && (map = (Map) this.zzc.get(str)) != null) {
                List<zzepm> list = (List) map.get(str2);
                if (list == null) {
                    String strZza = zzdvb.zza(this.zzg, str2, str);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzmm)).booleanValue()) {
                        strZza = strZza.toLowerCase(Locale.ROOT);
                    }
                    list = (List) map.get(strZza);
                }
                if (list != null) {
                    HashMap map2 = new HashMap();
                    for (zzepm zzepmVar : list) {
                        String str3 = zzepmVar.zza;
                        if (!map2.containsKey(str3)) {
                            map2.put(str3, new ArrayList());
                        }
                        ((List) map2.get(str3)).add(zzepmVar.zzb);
                    }
                    return zzgtg.zzc(map2);
                }
            }
            return zzgtg.zza();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Map zzd(String str, String str2) {
        HashMap map;
        try {
            Map mapZzc = zzc(str, str2);
            zzgtg zzgtgVarZzo = zzo(str2);
            map = new HashMap();
            for (Map.Entry entry : mapZzc.entrySet()) {
                String str3 = (String) entry.getKey();
                if (zzgtgVarZzo.containsKey(str3)) {
                    zzepo zzepoVar = (zzepo) zzgtgVarZzo.get(str3);
                    List list = (List) entry.getValue();
                    map.put(str3, new zzepo(str3, zzepoVar.zzb, zzepoVar.zzc, zzepoVar.zzd, (list == null || list.isEmpty()) ? new Bundle() : (Bundle) list.get(0)));
                }
            }
            zzgvr it = zzgtgVarZzo.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it.next();
                String str4 = (String) entry2.getKey();
                if (!map.containsKey(str4) && ((zzepo) entry2.getValue()).zzd) {
                    map.put(str4, (zzepo) entry2.getValue());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return map;
    }

    public final synchronized void zze(String str) {
        if (!TextUtils.isEmpty(str)) {
            Map map = this.zza;
            if (!map.containsKey(str)) {
                map.put(str, new zzepm(str, "", new Bundle()));
            }
        }
    }

    public final /* synthetic */ void zzf() {
        this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzepi
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzh();
            }
        });
    }
}
