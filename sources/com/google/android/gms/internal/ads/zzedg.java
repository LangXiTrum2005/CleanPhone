package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.applovin.impl.Z;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import com.p004ironsource.d9;
import com.p004ironsource.qt;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzedg {
    private static final Pattern zza = Pattern.compile("\\?");
    private final zzclg zzb;
    private final Context zzc;
    private final VersionInfoParcel zzd;
    private final zzfik zze;
    private final Executor zzf;
    private final ScheduledExecutorService zzg;
    private final String zzh;
    private final zzfno zzi;
    private final zzdwy zzj;
    private final zzfpi zzk;
    private final zzddo zzl;
    private final Object zzm = new Object();
    private String zzn;
    private List zzo;
    private Bundle zzp;
    private final zzbzi zzq;

    public zzedg(zzclg zzclgVar, Context context, VersionInfoParcel versionInfoParcel, zzfik zzfikVar, Executor executor, String str, zzfno zzfnoVar, zzdwy zzdwyVar, zzbzi zzbziVar, zzegb zzegbVar, ScheduledExecutorService scheduledExecutorService, zzfpi zzfpiVar, zzddo zzddoVar) {
        this.zzb = zzclgVar;
        this.zzc = context;
        this.zzd = versionInfoParcel;
        this.zze = zzfikVar;
        this.zzf = executor;
        this.zzh = str;
        this.zzi = zzfnoVar;
        zzclgVar.zzB();
        this.zzj = zzdwyVar;
        this.zzq = zzbziVar;
        this.zzg = scheduledExecutorService;
        this.zzk = zzfpiVar;
        this.zzl = zzddoVar;
    }

    private final ListenableFuture zzg(String str, final String str2) {
        ListenableFuture listenableFutureZza;
        String str3;
        String str4 = "";
        if (TextUtils.isEmpty(str)) {
            return zzgym.zzc(new zzemv(15, "Invalid ad string."));
        }
        Context context = this.zzc;
        zzfne zzfneVarZzn = zzfne.zzn(context, 11);
        zzfneVarZzn.zza();
        zzbsf zzbsfVarZzb = com.google.android.gms.ads.internal.zzt.zzr().zzb(context, this.zzd, this.zzb.zzx());
        zzbrz zzbrzVar = zzbsc.zza;
        final zzbrv zzbrvVarZza = zzbsfVarZzb.zza("google.afma.response.normalize", zzbrzVar, zzbrzVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhV)).booleanValue()) {
            try {
                str3 = str;
                try {
                    JSONObject jSONObject = new JSONObject(str3);
                    this.zzn = jSONObject.optString("fetch_url", "");
                    this.zzo = com.google.android.gms.ads.internal.util.zzbp.zza(new JSONObject(jSONObject.optString("settings", "")).getJSONArray("nofill_urls"), null);
                } catch (JSONException unused) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Invalid ad response.");
                }
            } catch (JSONException unused2) {
                str3 = str;
            }
            String string = this.zzn;
            final List list = this.zzo;
            if (TextUtils.isEmpty(string)) {
                listenableFutureZza = zzgym.zza(str3);
                this.zzj.zzd("sst", "1");
            } else {
                this.zzj.zzd("sst", "2");
                String str5 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhX);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhW)).booleanValue()) {
                    List listZze = zzgqp.zzb(zza).zze(string);
                    if (listZze.size() < 2) {
                        listenableFutureZza = zzgym.zzc(new zzemv(1, "Invalid fetch URL."));
                    } else {
                        str4 = (String) listZze.get(1);
                        com.google.android.gms.ads.internal.zzt.zzc();
                        string = Uri.parse(string).buildUpon().query(null).build().toString();
                        final zzefy zzefyVar = new zzefy(string, 60000, new HashMap(), str4.getBytes(StandardCharsets.UTF_8), str5, false);
                        listenableFutureZza = (zzgye) zzgym.zzh((zzgye) zzgym.zzi(zzgye.zzw(zzcdo.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzedd
                            @Override // java.util.concurrent.Callable
                            public final /* synthetic */ Object call() {
                                return this.zza.zzd(zzefyVar);
                            }
                        })), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhY)).intValue(), TimeUnit.MILLISECONDS, this.zzg), Exception.class, new zzgxu() { // from class: com.google.android.gms.internal.ads.zzede
                            @Override // com.google.android.gms.internal.ads.zzgxu
                            public final /* synthetic */ ListenableFuture zza(Object obj) {
                                return this.zza.zze(list, (Exception) obj);
                            }
                        }, this.zzf);
                    }
                } else {
                    final zzefy zzefyVar2 = new zzefy(string, 60000, new HashMap(), str4.getBytes(StandardCharsets.UTF_8), str5, false);
                    listenableFutureZza = (zzgye) zzgym.zzh((zzgye) zzgym.zzi(zzgye.zzw(zzcdo.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzedd
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            return this.zza.zzd(zzefyVar2);
                        }
                    })), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhY)).intValue(), TimeUnit.MILLISECONDS, this.zzg), Exception.class, new zzgxu() { // from class: com.google.android.gms.internal.ads.zzede
                        @Override // com.google.android.gms.internal.ads.zzgxu
                        public final /* synthetic */ ListenableFuture zza(Object obj) {
                            return this.zza.zze(list, (Exception) obj);
                        }
                    }, this.zzf);
                }
            }
        } else {
            listenableFutureZza = zzgym.zza(str);
            this.zzj.zzd("sst", "1");
        }
        zzgxu zzgxuVar = new zzgxu(this) { // from class: com.google.android.gms.internal.ads.zzedf
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj) throws JSONException {
                String str6 = (String) obj;
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = new JSONObject();
                String str7 = str2;
                try {
                    jSONObject4.put("headers", new JSONObject());
                    jSONObject4.put("body", str6);
                    jSONObject3.put("base_url", "");
                    jSONObject3.put("signals", new JSONObject(str7));
                    jSONObject2.put("request", jSONObject3);
                    jSONObject2.put(qt.f26623n, jSONObject4);
                    jSONObject2.put("flags", new JSONObject());
                    return zzgym.zza(jSONObject2);
                } catch (JSONException e2) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(e2.getCause())));
                }
            }
        };
        Executor executor = this.zzf;
        ListenableFuture listenableFutureZzj = zzgym.zzj(zzgym.zzj(zzgym.zzj(listenableFutureZza, zzgxuVar, executor), new zzgxu() { // from class: com.google.android.gms.internal.ads.zzedb
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzb(zzbrvVarZza, (JSONObject) obj);
            }
        }, executor), new zzgxu() { // from class: com.google.android.gms.internal.ads.zzedc
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc((JSONObject) obj);
            }
        }, executor);
        zzfnn.zzd(listenableFutureZzj, this.zzi, zzfneVarZzn);
        zzgym.zzr(listenableFutureZzj, new zzeda(this), zzcdo.zzg);
        return listenableFutureZzj;
    }

    private final void zzh(zzdwm zzdwmVar) {
        Bundle bundleZze = this.zzj.zze();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzia)).booleanValue()) {
            Z.t(bundleZze, zzdwmVar.zza());
        }
    }

    private final String zzi(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.zzh));
            }
            return jSONObject.toString();
        } catch (JSONException e2) {
            String strConcat = "Failed to update the ad types for rendering. ".concat(e2.toString());
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(strConcat);
            return str;
        }
    }

    private static final String zzj(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX WARN: Code duplicated, block: B:90:0x022c A[Catch: all -> 0x00dc, TryCatch #5 {all -> 0x00dc, blocks: (B:21:0x0078, B:23:0x0096, B:25:0x009e, B:27:0x00ab, B:29:0x00c5, B:33:0x00f5, B:36:0x0101, B:38:0x0109, B:40:0x010f, B:44:0x0118, B:55:0x0152, B:47:0x012c, B:54:0x013d, B:57:0x0157, B:32:0x00df, B:58:0x016b, B:65:0x0188, B:68:0x0190, B:72:0x01b2, B:74:0x01c7, B:78:0x01e8, B:80:0x01fd, B:83:0x0211, B:85:0x0217, B:86:0x0224, B:88:0x0226, B:91:0x022f, B:90:0x022c, B:79:0x01f2, B:75:0x01da, B:71:0x019e, B:62:0x0178, B:63:0x017d), top: B:123:0x0078, inners: #3 }] */
    public final ListenableFuture zza() {
        String strOptString;
        int i2;
        List listAsList;
        String string;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcK)).booleanValue()) {
            this.zzp = this.zze.zzt;
            Z.t(this.zzj.zze(), zzdwm.SCAR_PRELOADER_READY.zza());
        }
        String strZzb = this.zze.zzd.zzx;
        if (!TextUtils.isEmpty(strZzb)) {
            String strZzj = zzj(strZzb);
            zzbgb zzbgbVar = zzbgk.zzhR;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgbVar)).booleanValue() && strZzj.isEmpty()) {
                int iLastIndexOf = strZzb.lastIndexOf("&request_id=");
                strZzj = iLastIndexOf != -1 ? strZzb.substring(iLastIndexOf + 12) : "";
            }
            if (TextUtils.isEmpty(strZzj)) {
                return zzgym.zzc(new zzemv(15, "Invalid ad string."));
            }
            synchronized (this.zzm) {
                try {
                    com.google.android.gms.ads.nonagon.signalgeneration.zzv zzvVarZzt = this.zzb.zzt();
                    zzdwy zzdwyVar = this.zzj;
                    String strZzb2 = zzvVarZzt.zzb(strZzj, zzdwyVar);
                    String str = null;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgbVar)).booleanValue() && !TextUtils.isEmpty(strZzb2)) {
                        try {
                            JSONObject jSONObjectOptJSONObject = new JSONObject(strZzb2).optJSONObject("extras");
                            if (jSONObjectOptJSONObject != null) {
                                String strOptString2 = jSONObjectOptJSONObject.optString("query_info_type", "");
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhT)).booleanValue()) {
                                    listAsList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhU)).split(","));
                                } else {
                                    listAsList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhS)).split(","));
                                }
                                if (listAsList.contains(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzb(strOptString2))) {
                                    int iLastIndexOf2 = strZzb.lastIndexOf(d9.i.f24749c);
                                    String strSubstring = iLastIndexOf2 != -1 ? strZzb.substring(0, iLastIndexOf2) : null;
                                    if (!TextUtils.isEmpty(strSubstring)) {
                                        try {
                                            byte[] bArrDecode = Base64.decode(strSubstring, 11);
                                            byte[] bytes = strZzj.getBytes("UTF-8");
                                            if (TextUtils.isEmpty(strZzb2)) {
                                                string = null;
                                            } else {
                                                try {
                                                    string = new JSONObject(strZzb2).getString("arek");
                                                } catch (JSONException e2) {
                                                    com.google.android.gms.ads.internal.util.zze.zza("Failed to get key from QueryJSONMap".concat(e2.toString()));
                                                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "CryptoUtils.getKeyFromQueryJsonMap");
                                                    string = null;
                                                }
                                            }
                                            strZzb = zzfja.zzb(bArrDecode, bytes, string, zzdwyVar);
                                        } catch (UnsupportedEncodingException | IllegalArgumentException e3) {
                                            com.google.android.gms.ads.internal.util.zze.zza("Failed to decode the adResponse. ".concat(e3.toString()));
                                            com.google.android.gms.ads.internal.zzt.zzh().zzg(e3, "PreloadedLoader.decryptAdResponseIfNecessary");
                                        }
                                    }
                                }
                            }
                        } catch (JSONException unused) {
                        }
                    }
                    if (TextUtils.isEmpty(strZzb)) {
                        strOptString = "";
                    } else {
                        try {
                            strOptString = new JSONObject(strZzb).optString("render_id", "");
                        } catch (JSONException unused2) {
                            strOptString = "";
                        }
                    }
                    if (TextUtils.isEmpty(strOptString)) {
                        i2 = 0;
                    } else {
                        String str2 = "";
                        try {
                            str2 = new String(Base64.decode(strOptString, 0), StandardCharsets.UTF_8);
                        } catch (IllegalArgumentException e4) {
                            com.google.android.gms.ads.internal.util.zze.zza("Ad grouping: Has render_id, but not base64 encoded: ".concat(String.valueOf(strOptString)));
                            com.google.android.gms.ads.internal.zzt.zzh().zzg(e4, "PreloadedLoader.decodeRenderId");
                        }
                        List listZze = zzgqp.zza(zzgpo.zzc(AbstractJsonLexerKt.COLON)).zze(str2);
                        if (listZze.size() == 2) {
                            str = (String) listZze.get(0);
                            i2 = Integer.parseInt((String) listZze.get(1));
                        } else {
                            com.google.android.gms.ads.internal.util.zze.zza("Ad grouping: Has render_id, but invalid format: ".concat(String.valueOf(strOptString)));
                            i2 = 0;
                        }
                    }
                    Pair pair = str != null ? new Pair(str, Integer.valueOf(i2)) : new Pair("", 0);
                    String str3 = (String) pair.first;
                    int iIntValue = ((Integer) pair.second).intValue();
                    if (TextUtils.isEmpty(str3) || iIntValue <= 0) {
                        zzvVarZzt.zzc(strZzj);
                    } else {
                        if (zzvVarZzt.zzd(strZzj, str3)) {
                            return zzgym.zzc(new zzemv(10, "The ad has already been shown."));
                        }
                        if (!zzvVarZzt.zze(strZzj, str3, iIntValue)) {
                            zzvVarZzt.zzc(strZzj);
                        }
                    }
                    if (!TextUtils.isEmpty(strZzb2)) {
                        return zzg(strZzb, zzi(strZzb2));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        com.google.android.gms.ads.internal.client.zzc zzcVar = this.zze.zzd.zzs;
        if (zzcVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhJ)).booleanValue()) {
                String str4 = zzcVar.zza;
                String str5 = zzcVar.zzb;
                String strZzj2 = zzj(str4);
                String strZzj3 = zzj(str5);
                if (TextUtils.isEmpty(strZzj3) || !strZzj2.equals(strZzj3)) {
                    this.zzj.zzc().put("ridmm", com.p004ironsource.mediationsdk.metadata.a.g);
                } else {
                    this.zzb.zzt().zzc(strZzj2);
                    this.zzj.zzc().put("request_id", strZzj2);
                }
            }
            return zzg(zzcVar.zza, zzi(zzcVar.zzb));
        }
        return zzgym.zzc(new zzemv(14, "Mismatch request IDs."));
    }

    public final /* synthetic */ ListenableFuture zzb(zzbrv zzbrvVar, JSONObject jSONObject) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcK)).booleanValue()) {
            Z.t(this.zzj.zze(), zzdwm.SCAR_PRELOADER_PROCESSING_DONE.zza());
        }
        return zzbrvVar.zzb(jSONObject);
    }

    public final /* synthetic */ ListenableFuture zzc(JSONObject jSONObject) {
        zzfhz zzfhzVar = new zzfhz(this.zze);
        String string = jSONObject.toString();
        return zzgym.zza(new zzfic(zzfhzVar, zzfib.zza(new StringReader(string), this.zzp)));
    }

    public final /* synthetic */ String zzd(zzefy zzefyVar) throws zzemv {
        zzh(zzdwm.RENDERING_ADSTRING_TYPE2_FETCH_START);
        int i2 = 0;
        int i3 = -1;
        while (true) {
            try {
                if (i2 >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhZ)).intValue()) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 40);
                    sb.append("Received HTTP error code from ad server:");
                    sb.append(i3);
                    throw new zzemv(1, sb.toString());
                }
                zzefz zzefzVarZzb = new zzega(this.zzc, this.zzd.afmaVersion, this.zzq, Binder.getCallingUid(), null).zza(zzefyVar);
                int i4 = zzefzVarZzb.zza;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzia)).booleanValue()) {
                    this.zzj.zzd(com.smartdigimkt.d2.a.W, String.valueOf(i2));
                }
                if (i4 == 200) {
                    zzh(zzdwm.RENDERING_ADSTRING_TYPE2_FETCH_END);
                    return zzefzVarZzb.zzc;
                }
                i2++;
                i3 = i4;
            } catch (Exception e2) {
                throw new zzemv(1, e2.getMessage() == null ? "Fetch failed." : e2.getMessage(), e2);
            }
        }
    }

    public final /* synthetic */ ListenableFuture zze(List list, Exception exc) {
        zzemv zzemvVar;
        com.google.android.gms.ads.internal.zzt.zzh().zzh(exc, "PreloadedLoader.getTypeTwoAdResponseString");
        if (exc instanceof TimeoutException) {
            zzemvVar = new zzemv(1, "Timed out waiting for ad response.");
        } else if (exc instanceof zzemv) {
            zzemvVar = (zzemv) exc;
        } else {
            zzemvVar = new zzemv(1, exc.getMessage() == null ? "Fetch failed." : exc.getMessage());
        }
        String message = zzemvVar.getMessage() == null ? "" : zzemvVar.getMessage();
        if (list != null && !list.isEmpty()) {
            String str = "0.6.0.0";
            if (!TextUtils.isEmpty(message)) {
                if (message.contains("Timed out waiting for ad response.")) {
                    message = "timeout";
                    str = "0.2.0.0";
                } else if (message.contains("Received HTTP error code from ad server:")) {
                    List listZze = zzgqp.zza(zzgpo.zzc(AbstractJsonLexerKt.COLON)).zze(message);
                    if (listZze.size() == 2) {
                        message = (String) listZze.get(1);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(zzfpe.zzd(zzfpe.zzd((String) it.next(), "@gw_adnetstatus@", str), "@error_code@", message));
            }
            this.zzk.zza(arrayList, null);
        }
        return zzgym.zzc(zzemvVar);
    }

    public final /* synthetic */ zzddo zzf() {
        return this.zzl;
    }
}
