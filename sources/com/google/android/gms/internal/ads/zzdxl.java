package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.J0;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdxl {
    private static final Pattern zza = Pattern.compile("\\?");
    private final zzcgx zzb;
    private final Context zzc;
    private final VersionInfoParcel zzd;
    private final zzfcj zze;
    private final Executor zzf;
    private final ScheduledExecutorService zzg;
    private final String zzh;
    private final zzfhh zzi;
    private final zzdrq zzj;
    private final Object zzk = new Object();
    private final zzbvs zzl;

    public zzdxl(zzcgx zzcgxVar, Context context, VersionInfoParcel versionInfoParcel, zzfcj zzfcjVar, Executor executor, String str, zzfhh zzfhhVar, zzdrq zzdrqVar, zzbvs zzbvsVar, zzdzq zzdzqVar, ScheduledExecutorService scheduledExecutorService) {
        this.zzb = zzcgxVar;
        this.zzc = context;
        this.zzd = versionInfoParcel;
        this.zze = zzfcjVar;
        this.zzf = executor;
        this.zzh = str;
        this.zzi = zzfhhVar;
        zzcgxVar.zzx();
        this.zzj = zzdrqVar;
        this.zzl = zzbvsVar;
        this.zzg = scheduledExecutorService;
    }

    private final AI zzd(@Nullable String str, final String str2) {
        String string;
        AI aiZzh;
        String str3 = "";
        if (TextUtils.isEmpty(str)) {
            return zzgch.zzg(new zzegu(15, "Invalid ad string."));
        }
        zzfgw zzfgwVarZza = zzfgv.zza(this.zzc, 11);
        zzfgwVarZza.zzi();
        zzbog zzbogVarZza = com.google.android.gms.ads.internal.zzv.zzg().zza(this.zzc, this.zzd, this.zzb.zzz());
        zzboa zzboaVar = zzbod.zza;
        final zzbnw zzbnwVarZza = zzbogVarZza.zza("google.afma.response.normalize", zzboaVar, zzboaVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgS)).booleanValue()) {
            try {
                string = new JSONObject(str).optString("fetch_url", "");
            } catch (JSONException unused) {
                string = "";
            }
            if (TextUtils.isEmpty(string)) {
                aiZzh = zzgch.zzh(str);
                this.zzj.zzc("sst", "1");
            } else {
                this.zzj.zzc("sst", "2");
                String str4 = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgU);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgT)).booleanValue()) {
                    List listZzf = zzfvc.zzc(zza).zzf(string);
                    if (listZzf.size() < 2) {
                        aiZzh = zzgch.zzg(new zzegu(1, "Invalid fetch URL."));
                    } else {
                        str3 = (String) listZzf.get(1);
                        com.google.android.gms.ads.internal.zzv.zzq();
                        string = Uri.parse(string).buildUpon().query(null).build().toString();
                        final zzdzn zzdznVar = new zzdzn(string, MBridgeCommon.DEFAULT_LOAD_TIMEOUT, new HashMap(), str3.getBytes(StandardCharsets.UTF_8), str4, false);
                        aiZzh = (zzgby) zzgch.zzf((zzgby) zzgch.zzo(zzgby.zzu(zzbzw.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdxj
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return this.zza.zzc(zzdznVar);
                            }
                        })), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgV)).intValue(), TimeUnit.MILLISECONDS, this.zzg), Exception.class, new zzgbo() { // from class: com.google.android.gms.internal.ads.zzdxk
                            @Override // com.google.android.gms.internal.ads.zzgbo
                            public final AI zza(Object obj) {
                                zzegu zzeguVar;
                                Exception exc = (Exception) obj;
                                com.google.android.gms.ads.internal.zzv.zzp().zzv(exc, "PreloadedLoader.getTypeTwoAdResponseString");
                                if (exc instanceof TimeoutException) {
                                    zzeguVar = new zzegu(1, "Timed out waiting for ad response.");
                                } else if (exc instanceof zzegu) {
                                    zzeguVar = (zzegu) exc;
                                } else {
                                    zzeguVar = new zzegu(1, exc.getMessage() == null ? "Fetch failed." : exc.getMessage());
                                }
                                return zzgch.zzg(zzeguVar);
                            }
                        }, this.zzf);
                    }
                } else {
                    final zzdzn zzdznVar2 = new zzdzn(string, MBridgeCommon.DEFAULT_LOAD_TIMEOUT, new HashMap(), str3.getBytes(StandardCharsets.UTF_8), str4, false);
                    aiZzh = (zzgby) zzgch.zzf((zzgby) zzgch.zzo(zzgby.zzu(zzbzw.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdxj
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.zza.zzc(zzdznVar2);
                        }
                    })), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgV)).intValue(), TimeUnit.MILLISECONDS, this.zzg), Exception.class, new zzgbo() { // from class: com.google.android.gms.internal.ads.zzdxk
                        @Override // com.google.android.gms.internal.ads.zzgbo
                        public final AI zza(Object obj) {
                            zzegu zzeguVar;
                            Exception exc = (Exception) obj;
                            com.google.android.gms.ads.internal.zzv.zzp().zzv(exc, "PreloadedLoader.getTypeTwoAdResponseString");
                            if (exc instanceof TimeoutException) {
                                zzeguVar = new zzegu(1, "Timed out waiting for ad response.");
                            } else if (exc instanceof zzegu) {
                                zzeguVar = (zzegu) exc;
                            } else {
                                zzeguVar = new zzegu(1, exc.getMessage() == null ? "Fetch failed." : exc.getMessage());
                            }
                            return zzgch.zzg(zzeguVar);
                        }
                    }, this.zzf);
                }
            }
        } else {
            aiZzh = zzgch.zzh(str);
            this.zzj.zzc("sst", "1");
        }
        AI aiZzn = zzgch.zzn(zzgch.zzn(zzgch.zzn(aiZzh, new zzgbo(this) { // from class: com.google.android.gms.internal.ads.zzdxg
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final AI zza(Object obj) throws JSONException {
                String str5 = (String) obj;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                String str6 = str2;
                try {
                    jSONObject3.put("headers", new JSONObject());
                    jSONObject3.put(TtmlNode.TAG_BODY, str5);
                    jSONObject2.put("base_url", "");
                    jSONObject2.put("signals", new JSONObject(str6));
                    jSONObject.put(J0.REQUEST_KEY_EXTRA, jSONObject2);
                    jSONObject.put("response", jSONObject3);
                    jSONObject.put("flags", new JSONObject());
                    return zzgch.zzh(jSONObject);
                } catch (JSONException e) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(e.getCause())));
                }
            }
        }, this.zzf), new zzgbo() { // from class: com.google.android.gms.internal.ads.zzdxh
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final AI zza(Object obj) {
                return zzbnwVarZza.zzb((JSONObject) obj);
            }
        }, this.zzf), new zzgbo() { // from class: com.google.android.gms.internal.ads.zzdxi
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final AI zza(Object obj) {
                return this.zza.zzb((JSONObject) obj);
            }
        }, this.zzf);
        zzfhg.zza(aiZzn, this.zzi, zzfgwVarZza);
        return aiZzn;
    }

    private final String zze(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.zzh));
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to update the ad types for rendering. ".concat(e.toString()));
            return str;
        }
    }

    private final void zzf(zzdre zzdreVar) {
        Bundle bundleZza = this.zzj.zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgX)).booleanValue()) {
            AbstractC3888ke0.o(bundleZza, zzdreVar.zza());
        }
    }

    private static final String zzg(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX WARN: Code duplicated, block: B:84:0x01c5 A[Catch: all -> 0x008d, TryCatch #4 {, blocks: (B:18:0x0051, B:20:0x006f, B:22:0x0077, B:24:0x008a, B:29:0x0092, B:32:0x009a, B:34:0x00a2, B:36:0x00a8, B:40:0x00b1, B:49:0x00e9, B:43:0x00c3, B:48:0x00d2, B:51:0x00ee, B:28:0x0090, B:52:0x0104, B:59:0x011d, B:62:0x0125, B:66:0x0149, B:68:0x015e, B:72:0x0181, B:74:0x0196, B:77:0x01aa, B:79:0x01b0, B:80:0x01bd, B:82:0x01bf, B:85:0x01c8, B:84:0x01c5, B:73:0x018b, B:69:0x0171, B:65:0x0133, B:56:0x010d, B:57:0x0112), top: B:117:0x0051, inners: #0, #3 }] */
    public final AI zza() {
        String strOptString;
        int i;
        Boolean bool;
        String string;
        String strZzb = this.zze.zzd.zzx;
        if (!TextUtils.isEmpty(strZzb)) {
            String strZzg = zzg(strZzb);
            zzbcc zzbccVar = zzbcl.zzgR;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar)).booleanValue() && strZzg.isEmpty()) {
                int iLastIndexOf = strZzb.lastIndexOf("&request_id=");
                strZzg = iLastIndexOf != -1 ? strZzb.substring(iLastIndexOf + 12) : "";
            }
            if (TextUtils.isEmpty(strZzg)) {
                return zzgch.zzg(new zzegu(15, "Invalid ad string."));
            }
            synchronized (this.zzk) {
                com.google.android.gms.ads.nonagon.signalgeneration.zzv zzvVarZzo = this.zzb.zzo();
                String strZzb2 = zzvVarZzo.zzb(strZzg, this.zzj);
                String str = null;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar)).booleanValue()) {
                    zzdrq zzdrqVar = this.zzj;
                    if (!TextUtils.isEmpty(strZzb2)) {
                        try {
                            bool = new JSONObject(strZzb2).optString("is_gbid").equals("true") ? Boolean.TRUE : Boolean.FALSE;
                        } catch (JSONException unused) {
                        }
                        if (bool.booleanValue()) {
                            int iLastIndexOf2 = strZzb.lastIndexOf("&");
                            String strSubstring = iLastIndexOf2 != -1 ? strZzb.substring(0, iLastIndexOf2) : null;
                            if (!TextUtils.isEmpty(strSubstring)) {
                                try {
                                    byte[] bArrDecode = Base64.decode(strSubstring, 11);
                                    byte[] bytes = strZzg.getBytes(C.UTF8_NAME);
                                    if (TextUtils.isEmpty(strZzb2)) {
                                        string = null;
                                    } else {
                                        try {
                                            string = new JSONObject(strZzb2).getString("arek");
                                        } catch (JSONException e) {
                                            com.google.android.gms.ads.internal.util.zze.zza("Failed to get key from QueryJSONMap".concat(e.toString()));
                                            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "CryptoUtils.getKeyFromQueryJsonMap");
                                            string = null;
                                        }
                                    }
                                    strZzb = zzfcy.zzb(bArrDecode, bytes, string, zzdrqVar);
                                } catch (UnsupportedEncodingException e2) {
                                    com.google.android.gms.ads.internal.util.zze.zza("Failed to decode the adResponse. ".concat(e2.toString()));
                                    com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "PreloadedLoader.decryptAdResponseIfNecessary");
                                }
                            }
                        }
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
                    i = 0;
                } else {
                    String str2 = "";
                    try {
                        str2 = new String(Base64.decode(strOptString, 0), StandardCharsets.UTF_8);
                    } catch (IllegalArgumentException e3) {
                        com.google.android.gms.ads.internal.util.zze.zza("Ad grouping: Has render_id, but not base64 encoded: ".concat(String.valueOf(strOptString)));
                        com.google.android.gms.ads.internal.zzv.zzp().zzw(e3, "PreloadedLoader.decodeRenderId");
                    }
                    List listZzf = zzfvc.zzb(zzfty.zzc(':')).zzf(str2);
                    if (listZzf.size() == 2) {
                        str = (String) listZzf.get(0);
                        i = Integer.parseInt((String) listZzf.get(1));
                    } else {
                        com.google.android.gms.ads.internal.util.zze.zza("Ad grouping: Has render_id, but invalid format: ".concat(String.valueOf(strOptString)));
                        i = 0;
                    }
                }
                Pair pair = str != null ? new Pair(str, Integer.valueOf(i)) : new Pair("", 0);
                String str3 = (String) pair.first;
                int iIntValue = ((Integer) pair.second).intValue();
                if (TextUtils.isEmpty(str3) || iIntValue <= 0) {
                    zzvVarZzo.zzf(strZzg);
                } else {
                    if (zzvVarZzo.zzh(strZzg, str3)) {
                        return zzgch.zzg(new zzegu(10, "The ad has already been shown."));
                    }
                    if (!zzvVarZzo.zzg(strZzg, str3, iIntValue)) {
                        zzvVarZzo.zzf(strZzg);
                    }
                }
                if (!TextUtils.isEmpty(strZzb2)) {
                    return zzd(strZzb, zze(strZzb2));
                }
            }
        }
        com.google.android.gms.ads.internal.client.zzc zzcVar = this.zze.zzd.zzs;
        if (zzcVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgJ)).booleanValue()) {
                String str4 = zzcVar.zza;
                String str5 = zzcVar.zzb;
                String strZzg2 = zzg(str4);
                String strZzg3 = zzg(str5);
                if (TextUtils.isEmpty(strZzg3) || !strZzg2.equals(strZzg3)) {
                    this.zzj.zzb().put("ridmm", "true");
                } else {
                    this.zzb.zzo().zzf(strZzg2);
                    this.zzj.zzb().put("request_id", strZzg2);
                }
            }
            return zzd(zzcVar.zza, zze(zzcVar.zzb));
        }
        return zzgch.zzg(new zzegu(14, "Mismatch request IDs."));
    }

    public final /* synthetic */ AI zzb(JSONObject jSONObject) throws Exception {
        return zzgch.zzh(new zzfca(new zzfbx(this.zze), zzfbz.zza(new StringReader(jSONObject.toString()), null)));
    }

    public final /* synthetic */ String zzc(zzdzn zzdznVar) throws Exception {
        zzf(zzdre.RENDERING_ADSTRING_TYPE2_FETCH_START);
        int i = 0;
        int i2 = -1;
        while (true) {
            try {
                if (i >= ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgW)).intValue()) {
                    throw new zzegu(1, "Received HTTP error code from ad server: " + i2);
                }
                zzdzo zzdzoVarZzb = new zzdzp(this.zzc, this.zzd.afmaVersion, this.zzl, Binder.getCallingUid()).zza(zzdznVar);
                int i3 = zzdzoVarZzb.zza;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgX)).booleanValue()) {
                    this.zzj.zzc("fr", String.valueOf(i));
                }
                if (i3 == 200) {
                    zzf(zzdre.RENDERING_ADSTRING_TYPE2_FETCH_END);
                    return zzdzoVarZzb.zzc;
                }
                i++;
                i2 = i3;
            } catch (Exception e) {
                throw new zzegu(1, e.getMessage() == null ? "Fetch failed." : e.getMessage(), e);
            }
        }
    }
}
