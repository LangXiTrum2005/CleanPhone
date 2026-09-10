package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.applovin.impl.Z;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import com.p004ironsource.e9;
import com.smartdigimkt.x.d;
import com.smartdigimkt.y4.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdqu {
    private final Context zza;
    private final zzdqa zzb;
    private final zzayq zzc;
    private final VersionInfoParcel zzd;
    private final com.google.android.gms.ads.internal.zza zze;
    private final zzbfj zzf;
    private final Executor zzg;
    private final zzbjn zzh;
    private final zzdrm zzi;
    private final zzdua zzj;
    private final ScheduledExecutorService zzk;
    private final zzdsv zzl;
    private final zzdxe zzm;
    private final zzfpi zzn;
    private final zzehu zzo;
    private final zzeif zzp;
    private final zzfio zzq;
    private final zzdwy zzr;
    private final zzdyh zzs;

    public zzdqu(Context context, zzdqa zzdqaVar, zzayq zzayqVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzbfj zzbfjVar, Executor executor, zzfik zzfikVar, zzdrm zzdrmVar, zzdua zzduaVar, ScheduledExecutorService scheduledExecutorService, zzdxe zzdxeVar, zzfpi zzfpiVar, zzehu zzehuVar, zzdsv zzdsvVar, zzeif zzeifVar, zzfio zzfioVar, zzdwy zzdwyVar, zzdyh zzdyhVar) {
        this.zza = context;
        this.zzb = zzdqaVar;
        this.zzc = zzayqVar;
        this.zzd = versionInfoParcel;
        this.zze = zzaVar;
        this.zzf = zzbfjVar;
        this.zzg = executor;
        this.zzh = zzfikVar.zzj;
        this.zzi = zzdrmVar;
        this.zzj = zzduaVar;
        this.zzk = scheduledExecutorService;
        this.zzm = zzdxeVar;
        this.zzn = zzfpiVar;
        this.zzo = zzehuVar;
        this.zzl = zzdsvVar;
        this.zzp = zzeifVar;
        this.zzq = zzfioVar;
        this.zzr = zzdwyVar;
        this.zzs = zzdyhVar;
    }

    public static final com.google.android.gms.ads.internal.client.zzez zzk(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("mute");
        if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return zzt(jSONObjectOptJSONObject);
    }

    public static final List zzl(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("mute");
        if (jSONObjectOptJSONObject == null) {
            return zzgtd.zzi();
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("reasons");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return zzgtd.zzi();
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
            com.google.android.gms.ads.internal.client.zzez zzezVarZzt = zzt(jSONArrayOptJSONArray.optJSONObject(i2));
            if (zzezVarZzt != null) {
                arrayList.add(zzezVarZzt);
            }
        }
        return zzgtd.zzq(arrayList);
    }

    private final ListenableFuture zzm(JSONArray jSONArray, boolean z2, boolean z3, zzdwm zzdwmVar) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzgym.zza(Collections.EMPTY_LIST);
        }
        ArrayList arrayList = new ArrayList();
        int length = z3 ? jSONArray.length() : 1;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcP)).booleanValue()) {
            Z.t(this.zzr.zze(), zzdwmVar.zza());
        }
        for (int i2 = 0; i2 < length; i2++) {
            arrayList.add(zzn(jSONArray.optJSONObject(i2), z2, null));
        }
        return zzgym.zzk(zzgym.zzm(arrayList), zzdqt.zza, this.zzg);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0055  */
    private final ListenableFuture zzn(JSONObject jSONObject, boolean z2, zzdwm zzdwmVar) {
        HashMap map;
        if (jSONObject == null) {
            return zzgym.zza(null);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzeM)).booleanValue()) {
            if (jSONObject.has((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzeN))) {
                HashMap map2 = new HashMap();
                for (String str : ((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzeO)).split(",")) {
                    try {
                        map2.put(str, jSONObject.getString(str));
                    } catch (JSONException unused) {
                    }
                }
                map = map2;
            } else {
                map = null;
            }
        } else {
            map = null;
        }
        final String strOptString = jSONObject.optString("url");
        if (TextUtils.isEmpty(strOptString) && map == null) {
            return zzgym.zza(null);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcP)).booleanValue() && zzdwmVar != null) {
            Z.t(this.zzr.zze(), zzdwmVar.zza());
        }
        final double dOptDouble = jSONObject.optDouble("scale", 1.0d);
        boolean zOptBoolean = jSONObject.optBoolean("is_transparent", true);
        final int iOptInt = jSONObject.optInt("width", -1);
        final int iOptInt2 = jSONObject.optInt("height", -1);
        if (z2 || map != null) {
            return zzgym.zza(new zzbjj(null, Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2, map));
        }
        return zzr(jSONObject.optBoolean("require"), zzgym.zzk(this.zzb.zza(strOptString, dOptDouble, zOptBoolean), new zzgpr() { // from class: com.google.android.gms.internal.ads.zzdqj
            @Override // com.google.android.gms.internal.ads.zzgpr
            public final /* synthetic */ Object apply(Object obj) {
                return new zzbjj(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2, null);
            }
        }, this.zzg), null);
    }

    private static Integer zzo(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt(g.f40227p), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    private final ListenableFuture zzp(JSONObject jSONObject, zzfhr zzfhrVar, zzfhu zzfhuVar, com.google.android.gms.ads.internal.zzb zzbVar, zzcbk zzcbkVar) {
        final ListenableFuture listenableFutureZzb = this.zzi.zzb(jSONObject.optString("base_url"), jSONObject.optString("html"), zzfhrVar, zzfhuVar, zzs(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)), zzbVar, zzcbkVar);
        return zzgym.zzj(listenableFutureZzb, new zzgxu() { // from class: com.google.android.gms.internal.ads.zzdqo
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj) throws zzemv {
                zzcir zzcirVar = (zzcir) obj;
                if (zzcirVar == null || zzcirVar.zzh() == null) {
                    throw new zzemv(1, "Retrieve video view in html5 ad response failed.");
                }
                return listenableFutureZzb;
            }
        }, zzcdo.zzg);
    }

    private static ListenableFuture zzq(ListenableFuture listenableFuture, Object obj) {
        final Object obj2 = null;
        return zzgym.zzh(listenableFuture, Exception.class, new zzgxu(obj2) { // from class: com.google.android.gms.internal.ads.zzdqp
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj3) {
                com.google.android.gms.ads.internal.util.zze.zzb("Error during loading assets.", (Exception) obj3);
                return zzgym.zza(null);
            }
        }, zzcdo.zzg);
    }

    private static ListenableFuture zzr(boolean z2, final ListenableFuture listenableFuture, Object obj) {
        return z2 ? zzgym.zzj(listenableFuture, new zzgxu() { // from class: com.google.android.gms.internal.ads.zzdqq
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj2) {
                return obj2 != null ? listenableFuture : zzgym.zzc(new zzemv(1, "Retrieve required value in native ad response failed."));
            }
        }, zzcdo.zzg) : zzq(listenableFuture, null);
    }

    private final com.google.android.gms.ads.internal.client.zzr zzs(int i2, int i3) {
        if (i2 == 0) {
            if (i3 == 0) {
                return com.google.android.gms.ads.internal.client.zzr.zzb();
            }
            i2 = 0;
        }
        return new com.google.android.gms.ads.internal.client.zzr(this.zza, new AdSize(i2, i3));
    }

    private static final com.google.android.gms.ads.internal.client.zzez zzt(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("reason");
        String strOptString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            return null;
        }
        return new com.google.android.gms.ads.internal.client.zzez(strOptString, strOptString2);
    }

    public final ListenableFuture zza(JSONObject jSONObject, String str, zzdwm zzdwmVar) {
        return zzn(jSONObject.optJSONObject(str), this.zzh.zzb, zzdwmVar);
    }

    public final ListenableFuture zzb(JSONObject jSONObject, String str, zzdwm zzdwmVar) {
        zzbjn zzbjnVar = this.zzh;
        return zzm(jSONObject.optJSONArray("images"), zzbjnVar.zzb, zzbjnVar.zzd, zzdwmVar);
    }

    public final ListenableFuture zzc(JSONObject jSONObject, String str, final zzfhr zzfhrVar, final zzfhu zzfhuVar, final com.google.android.gms.ads.internal.zzb zzbVar, final zzcbk zzcbkVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzls)).booleanValue()) {
            return zzgym.zza(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return zzgym.zza(null);
        }
        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0);
        if (jSONObjectOptJSONObject == null) {
            return zzgym.zza(null);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzeM)).booleanValue()) {
            if (jSONObjectOptJSONObject.has((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzeN))) {
                return zzgym.zza(null);
            }
        }
        final String strOptString = jSONObjectOptJSONObject.optString("base_url");
        final String strOptString2 = jSONObjectOptJSONObject.optString("html");
        final com.google.android.gms.ads.internal.client.zzr zzrVarZzs = zzs(jSONObjectOptJSONObject.optInt("width", 0), jSONObjectOptJSONObject.optInt("height", 0));
        if (TextUtils.isEmpty(strOptString2)) {
            return zzgym.zza(null);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcP)).booleanValue()) {
            Z.t(this.zzr.zze(), zzdwm.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_START.zza());
        }
        final ListenableFuture listenableFutureZzj = zzgym.zzj(zzgym.zza(null), new zzgxu() { // from class: com.google.android.gms.internal.ads.zzdqk
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzh(zzrVarZzs, zzfhrVar, zzfhuVar, zzbVar, zzcbkVar, strOptString, strOptString2, obj);
            }
        }, zzcdo.zzf);
        return zzgym.zzj(listenableFutureZzj, new zzgxu() { // from class: com.google.android.gms.internal.ads.zzdql
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj) throws zzemv {
                if (((zzcir) obj) != null) {
                    return listenableFutureZzj;
                }
                throw new zzemv(1, "Retrieve Web View from image ad response failed.");
            }
        }, zzcdo.zzg);
    }

    public final ListenableFuture zzd(JSONObject jSONObject, String str, zzdwm zzdwmVar) {
        final JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(e9.ATTRIBUTION);
        if (jSONObjectOptJSONObject == null) {
            return zzgym.zza(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("images");
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(d.c.k);
        if (jSONArrayOptJSONArray == null && jSONObjectOptJSONObject2 != null) {
            jSONArrayOptJSONArray = new JSONArray();
            jSONArrayOptJSONArray.put(jSONObjectOptJSONObject2);
        }
        return zzr(jSONObjectOptJSONObject.optBoolean("require"), zzgym.zzk(zzm(jSONArrayOptJSONArray, false, true, zzdwmVar), new zzgpr() { // from class: com.google.android.gms.internal.ads.zzdqm
            @Override // com.google.android.gms.internal.ads.zzgpr
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzi(jSONObjectOptJSONObject, (List) obj);
            }
        }, this.zzg), null);
    }

    public final ListenableFuture zze(JSONObject jSONObject, final com.google.android.gms.ads.internal.zzb zzbVar, final zzcbk zzcbkVar) {
        if (!jSONObject.optBoolean("enable_omid")) {
            return zzgym.zza(null);
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings");
        if (jSONObjectOptJSONObject == null) {
            return zzgym.zza(null);
        }
        final String strOptString = jSONObjectOptJSONObject.optString("omid_html");
        if (TextUtils.isEmpty(strOptString)) {
            return zzgym.zza(null);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcP)).booleanValue()) {
            Z.t(this.zzr.zze(), zzdwm.NATIVE_ASSETS_LOADING_OMID_START.zza());
        }
        return zzgym.zzj(zzgym.zza(null), new zzgxu() { // from class: com.google.android.gms.internal.ads.zzdqn
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzj(strOptString, zzcbkVar, zzbVar, obj);
            }
        }, zzcdo.zzf);
    }

    public final ListenableFuture zzf(ListenableFuture listenableFuture) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcP)).booleanValue()) {
            Z.t(this.zzr.zze(), zzdwm.NATIVE_ASSETS_LOADING_MEDIA_START.zza());
        }
        zzcdt zzcdtVar = new zzcdt();
        zzgym.zzr(listenableFuture, new zzdqi(this, zzcdtVar), zzcdo.zzf);
        return zzcdtVar;
    }

    public final ListenableFuture zzg(JSONObject jSONObject, zzfhr zzfhrVar, zzfhu zzfhuVar, com.google.android.gms.ads.internal.zzb zzbVar, zzcbk zzcbkVar) {
        ListenableFuture listenableFutureZza;
        zzdqu zzdquVar;
        JSONObject jSONObjectZzi = com.google.android.gms.ads.internal.util.zzbp.zzi(jSONObject, "html_containers", "instream");
        if (jSONObjectZzi != null) {
            return zzp(jSONObjectZzi, zzfhrVar, zzfhuVar, zzbVar, zzcbkVar);
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("video");
        if (jSONObjectOptJSONObject == null) {
            return zzgym.zza(null);
        }
        String strOptString = jSONObjectOptJSONObject.optString("vast_xml");
        boolean z2 = false;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzlr)).booleanValue() && jSONObjectOptJSONObject.has("html")) {
            z2 = true;
        }
        if (!TextUtils.isEmpty(strOptString)) {
            if (!z2) {
                listenableFutureZza = this.zzi.zza(jSONObjectOptJSONObject, zzbVar, zzcbkVar);
                zzdquVar = this;
            }
            return zzq(zzgym.zzi(listenableFutureZza, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzeE)).intValue(), TimeUnit.SECONDS, zzdquVar.zzk), null);
        }
        if (!z2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Required field 'vast_xml' or 'html' is missing");
            return zzgym.zza(null);
        }
        zzdquVar = this;
        listenableFutureZza = zzdquVar.zzp(jSONObjectOptJSONObject, zzfhrVar, zzfhuVar, zzbVar, zzcbkVar);
        return zzq(zzgym.zzi(listenableFutureZza, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzeE)).intValue(), TimeUnit.SECONDS, zzdquVar.zzk), null);
    }

    public final /* synthetic */ ListenableFuture zzh(com.google.android.gms.ads.internal.client.zzr zzrVar, zzfhr zzfhrVar, zzfhu zzfhuVar, com.google.android.gms.ads.internal.zzb zzbVar, zzcbk zzcbkVar, String str, String str2, Object obj) throws zzcjg {
        zzdyh zzdyhVar;
        zzcir zzcirVarZza = this.zzj.zza(zzrVar, zzfhrVar, zzfhuVar);
        final zzcds zzcdsVarZza = zzcds.zza(zzcirVarZza);
        zzdss zzdssVarZza = this.zzl.zza();
        zzckp zzckpVarZzP = zzcirVarZza.zzP();
        zzbgb zzbgbVar = zzbgk.zzpa;
        zzckpVarZzP.zzab(zzdssVarZza, zzdssVarZza, zzdssVarZza, zzdssVarZza, zzdssVarZza, false, null, !((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgbVar)).booleanValue() ? new com.google.android.gms.ads.internal.zzb(this.zza, null, null) : zzbVar, null, true != ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgbVar)).booleanValue() ? null : zzcbkVar, this.zzo, this.zzn, this.zzm, null, zzdssVarZza, null, null, null, null, null, null, null);
        zzcirVarZza.zzab("/getNativeAdViewSignals", zzbnm.zzs);
        zzcirVarZza.zzab("/getNativeClickMeta", zzbnm.zzt);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zziK)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zziM)).booleanValue() && (zzdyhVar = this.zzs) != null) {
                zzcirVarZza.zzab("/onDeviceStorageEvent", new zzbnv(zzdyhVar));
            }
        }
        zzcirVarZza.zzP().zzS(true);
        zzcirVarZza.zzP().zzG(new zzckn() { // from class: com.google.android.gms.internal.ads.zzdqs
            @Override // com.google.android.gms.internal.ads.zzckn
            public final /* synthetic */ void zza(boolean z2, int i2, String str3, String str4) {
                zzcds zzcdsVar = zzcdsVarZza;
                if (z2) {
                    zzcdsVar.zzb();
                    return;
                }
                int length = String.valueOf(i2).length();
                StringBuilder sb = new StringBuilder(length + 58 + String.valueOf(str3).length() + 15 + String.valueOf(str4).length());
                sb.append("Image Web View failed to load. Error code: ");
                sb.append(i2);
                sb.append(", Description: ");
                sb.append(str3);
                zzcdsVar.zzd(new zzemv(1, android.support.v4.media.a.r(sb, ", Failing URL: ", str4)));
            }
        });
        zzcirVarZza.zzau(str, str2, null);
        return zzcdsVarZza;
    }

    public final /* synthetic */ zzbjg zzi(JSONObject jSONObject, List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String strOptString = jSONObject.optString("text");
        Integer numZzo = zzo(jSONObject, "bg_color");
        Integer numZzo2 = zzo(jSONObject, "text_color");
        int iOptInt = jSONObject.optInt("text_size", -1);
        boolean zOptBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int iOptInt2 = jSONObject.optInt("animation_ms", 1000);
        return new zzbjg(strOptString, list, numZzo, numZzo2, iOptInt > 0 ? Integer.valueOf(iOptInt) : null, jSONObject.optInt("presentation_ms", 4000) + iOptInt2, this.zzh.zze, zOptBoolean);
    }

    public final /* synthetic */ ListenableFuture zzj(String str, zzcbk zzcbkVar, com.google.android.gms.ads.internal.zzb zzbVar, Object obj) throws zzcjg {
        com.google.android.gms.ads.internal.zzt.zzd();
        Context context = this.zza;
        zzeif zzeifVar = this.zzp;
        zzcir zzcirVarZza = zzcjh.zza(context, zzclb.zzb(), "native-omid", false, false, this.zzc, null, this.zzd, null, null, this.zze, this.zzf, null, null, zzeifVar, this.zzq, this.zzm);
        final zzcds zzcdsVarZza = zzcds.zza(zzcirVarZza);
        zzcirVarZza.zzP().zzG(new zzckn() { // from class: com.google.android.gms.internal.ads.zzdqr
            @Override // com.google.android.gms.internal.ads.zzckn
            public final /* synthetic */ void zza(boolean z2, int i2, String str2, String str3) {
                zzcdsVarZza.zzb();
            }
        });
        zzcirVarZza.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzpa)).booleanValue()) {
            if (zzcbkVar != null) {
                zzcirVarZza.zzP().zzj(zzcbkVar);
            }
            zzcirVarZza.zzP().zzi(zzbVar);
        }
        return zzcdsVarZza;
    }
}
