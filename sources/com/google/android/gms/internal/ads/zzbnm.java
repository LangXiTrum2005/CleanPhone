package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.smartdigimkt.o1.b;
import com.smartdigimkt.q8.i;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbnm {
    public static final zzbnn zza = zzbnl.zza;
    public static final zzbnn zzb = zzbnc.zza;
    public static final zzbnn zzc = zzbnd.zza;
    public static final zzbnn zzd = new zzbmu();
    public static final zzbnn zze = new zzbmv();
    public static final zzbnn zzf = zzbni.zza;
    public static final zzbnn zzg = new zzbmw();
    public static final zzbnn zzh = new zzbmx();
    public static final zzbnn zzi = zzbnj.zza;
    public static final zzbnn zzj = new zzbmy();
    public static final zzbnn zzk = new zzbmz();
    public static final zzbnn zzl = new zzcgl();
    public static final zzbnn zzm = new zzcgm();
    public static final zzbnn zzn = new zzbmg();
    public static final zzboe zzo = new zzboe();
    public static final zzbnn zzp = new zzbna();
    public static final zzbnn zzq = new zzbnb();
    public static final zzbnn zzr = new zzbmh();
    public static final zzbnn zzs = new zzbmi();
    public static final zzbnn zzt = new zzbmj();
    public static final zzbnn zzu = new zzbmk();
    public static final zzbnn zzv = new zzbml();
    public static final zzbnn zzw = new zzbmm();
    public static final zzbnn zzx = new zzbmn();
    public static final zzbnn zzy = new zzbmo();
    public static final zzbnn zzz = new zzbmp();
    public static final zzbnn zzA = new zzbmq();
    public static final zzbnn zzB = new zzbms();
    public static final zzbnn zzC = new zzbmt();

    public static ListenableFuture zza(zzcir zzcirVar, String str) {
        Uri uriZzd = Uri.parse(str);
        try {
            zzayq zzayqVarZzS = zzcirVar.zzS();
            zzfio zzfioVarZzT = zzcirVar.zzT();
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zznq)).booleanValue() || zzfioVarZzT == null) {
                if (zzayqVarZzS != null && zzayqVarZzS.zza(uriZzd)) {
                    uriZzd = zzayqVarZzS.zzd(uriZzd, zzcirVar.getContext(), zzcirVar.zzE(), zzcirVar.zzj());
                }
            } else if (zzayqVarZzS != null && zzayqVarZzS.zza(uriZzd)) {
                uriZzd = zzfioVarZzT.zza(uriZzd, zzcirVar.getContext(), zzcirVar.zzE(), zzcirVar.zzj());
            }
        } catch (zzayr unused) {
            String strConcat = "Unable to append parameter to URL: ".concat(str);
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(strConcat);
        }
        Map map = new HashMap();
        if (zzcirVar.zzC() != null) {
            map = zzcirVar.zzC().zzaw;
        }
        final String strZzb = zzcby.zzb(uriZzd, zzcirVar.getContext(), map);
        long jLongValue = ((Long) zzbij.zze.zze()).longValue();
        if (jLongValue <= 0 || jLongValue > 254380000) {
            return zzgym.zza(strZzb);
        }
        zzgye zzgyeVarZzw = zzgye.zzw(zzcirVar.zzaF());
        zzbne zzbneVar = zzbne.zza;
        zzgyw zzgywVar = zzcdo.zzg;
        return (zzgye) zzgym.zzg((zzgye) zzgym.zzk((zzgye) zzgym.zzg(zzgyeVarZzw, Throwable.class, zzbneVar, zzgywVar), new zzgpr() { // from class: com.google.android.gms.internal.ads.zzbnf
            /* JADX WARN: Code duplicated, block: B:16:0x004f  */
            /* JADX WARN: Code duplicated, block: B:19:0x0059  */
            /* JADX WARN: Code duplicated, block: B:21:0x0067  */
            @Override // com.google.android.gms.internal.ads.zzgpr
            public final /* synthetic */ Object apply(Object obj) {
                String str2;
                String str3;
                Uri uri;
                String str4 = (String) obj;
                zzbnn zzbnnVar = zzbnm.zza;
                String strReplace = strZzb;
                if (str4 != null) {
                    if (((Boolean) zzbij.zzf.zze()).booleanValue()) {
                        String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                        String host = Uri.parse(strReplace).getHost();
                        for (int i3 = 0; i3 < 3; i3++) {
                            if (host.endsWith(strArr[i3])) {
                                str2 = (String) zzbij.zza.zze();
                                str3 = (String) zzbij.zzb.zze();
                                if (!TextUtils.isEmpty(str2)) {
                                    strReplace = strReplace.replace(str2, str4);
                                }
                                if (!TextUtils.isEmpty(str3)) {
                                    uri = Uri.parse(strReplace);
                                    if (!TextUtils.isEmpty(uri.getQueryParameter(str3))) {
                                        break;
                                    }
                                    return uri.buildUpon().appendQueryParameter(str3, str4).toString();
                                }
                                break;
                            }
                        }
                    } else {
                        str2 = (String) zzbij.zza.zze();
                        str3 = (String) zzbij.zzb.zze();
                        if (!TextUtils.isEmpty(str2)) {
                            strReplace = strReplace.replace(str2, str4);
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            uri = Uri.parse(strReplace);
                            if (!TextUtils.isEmpty(uri.getQueryParameter(str3))) {
                                return uri.buildUpon().appendQueryParameter(str3, str4).toString();
                            }
                        }
                    }
                }
                return strReplace;
            }
        }, zzgywVar), Throwable.class, new zzgpr() { // from class: com.google.android.gms.internal.ads.zzbng
            @Override // com.google.android.gms.internal.ads.zzgpr
            public final /* synthetic */ Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                zzbnn zzbnnVar = zzbnm.zza;
                if (((Boolean) zzbij.zzi.zze()).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "prepareClickUrl.attestation2");
                }
                return strZzb;
            }
        }, zzgywVar);
    }

    public static zzbnn zzb(final zzdir zzdirVar, final zzcra zzcraVar) {
        return new zzbnn() { // from class: com.google.android.gms.internal.ads.zzbnh
            @Override // com.google.android.gms.internal.ads.zzbnn
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzcir zzcirVar = (zzcir) obj;
                zzbnm.zzc(map, zzdirVar);
                final String str = (String) map.get("u");
                if (str == null) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("URL missing from click GMSG.");
                    return;
                }
                final zzcra zzcraVar2 = zzcraVar;
                zzgye zzgyeVarZzw = zzgye.zzw(zzbnm.zza(zzcirVar, str));
                zzgxu zzgxuVar = new zzgxu() { // from class: com.google.android.gms.internal.ads.zzbnk
                    @Override // com.google.android.gms.internal.ads.zzgxu
                    public final /* synthetic */ ListenableFuture zza(Object obj2) {
                        zzcra zzcraVar3;
                        String str2 = (String) obj2;
                        zzbnn zzbnnVar = zzbnm.zza;
                        return (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzlt)).booleanValue() && (zzcraVar3 = zzcraVar2) != null && zzcra.zzc(str)) ? zzcraVar3.zzb(str2, com.google.android.gms.ads.internal.client.zzbb.zzh()) : zzgym.zza(str2);
                    }
                };
                zzgyw zzgywVar = zzcdo.zza;
                zzgym.zzr((zzgye) zzgym.zzj(zzgyeVarZzw, zzgxuVar, zzgywVar), new zzbmr(zzcirVar), zzgywVar);
            }
        };
    }

    public static void zzc(Map map, zzdir zzdirVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzmd)).booleanValue() && map.containsKey(b.I1) && ((String) map.get(b.I1)).equals("1") && zzdirVar != null) {
            zzdirVar.zzdu();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:18:0x0081  */
    /* JADX WARN: Code duplicated, block: B:20:0x008c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0099  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00be  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e3  */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void zze(zzckd zzckdVar, Map map) {
        char c2;
        Intent uri;
        Intent intent;
        boolean z2;
        String[] strArrSplit;
        PackageManager packageManager = zzckdVar.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                        String strOptString = jSONObject2.optString("id");
                        String strOptString2 = jSONObject2.optString("u");
                        String strOptString3 = jSONObject2.optString(i.f37957c);
                        String strOptString4 = jSONObject2.optString("m");
                        String strOptString5 = jSONObject2.optString("p");
                        String strOptString6 = jSONObject2.optString("c");
                        String strOptString7 = jSONObject2.optString("intent_url");
                        ResolveInfo resolveInfoResolveActivity = null;
                        try {
                            try {
                                if (TextUtils.isEmpty(strOptString7)) {
                                    c2 = 1;
                                } else {
                                    try {
                                        uri = Intent.parseUri(strOptString7, 0);
                                        c2 = 1;
                                    } catch (URISyntaxException e2) {
                                        String strValueOf = String.valueOf(strOptString7);
                                        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                                        c2 = 1;
                                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error parsing the url: ".concat(strValueOf), e2);
                                        uri = null;
                                    }
                                    if (uri == null) {
                                        uri = new Intent();
                                        if (!TextUtils.isEmpty(strOptString2)) {
                                            uri.setData(Uri.parse(strOptString2));
                                        }
                                        if (!TextUtils.isEmpty(strOptString3)) {
                                            uri.setAction(strOptString3);
                                        }
                                        if (!TextUtils.isEmpty(strOptString4)) {
                                            uri.setType(strOptString4);
                                        }
                                        if (!TextUtils.isEmpty(strOptString5)) {
                                            uri.setPackage(strOptString5);
                                        }
                                        if (!TextUtils.isEmpty(strOptString6)) {
                                            strArrSplit = strOptString6.split("/", 2);
                                            if (strArrSplit.length == 2) {
                                                uri.setComponent(new ComponentName(strArrSplit[0], strArrSplit[c2]));
                                            }
                                        }
                                    }
                                    intent = uri;
                                    resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
                                    if (resolveInfoResolveActivity != null) {
                                        z2 = c2;
                                    } else {
                                        z2 = 0;
                                    }
                                    jSONObject.put(strOptString, z2);
                                }
                                resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
                            } catch (NullPointerException e3) {
                                com.google.android.gms.ads.internal.zzt.zzh().zzg(e3, intent.toString());
                            }
                            jSONObject.put(strOptString, z2);
                        } catch (JSONException e4) {
                            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error constructing openable urls response.", e4);
                        }
                        uri = null;
                        if (uri == null) {
                            uri = new Intent();
                            if (!TextUtils.isEmpty(strOptString2)) {
                                uri.setData(Uri.parse(strOptString2));
                            }
                            if (!TextUtils.isEmpty(strOptString3)) {
                                uri.setAction(strOptString3);
                            }
                            if (!TextUtils.isEmpty(strOptString4)) {
                                uri.setType(strOptString4);
                            }
                            if (!TextUtils.isEmpty(strOptString5)) {
                                uri.setPackage(strOptString5);
                            }
                            if (!TextUtils.isEmpty(strOptString6)) {
                                strArrSplit = strOptString6.split("/", 2);
                                if (strArrSplit.length == 2) {
                                    uri.setComponent(new ComponentName(strArrSplit[0], strArrSplit[c2]));
                                }
                            }
                        }
                        intent = uri;
                        if (resolveInfoResolveActivity != null) {
                            z2 = c2;
                        } else {
                            z2 = 0;
                        }
                    } catch (JSONException e5) {
                        int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error parsing the intent data.", e5);
                    }
                }
                ((zzbqj) zzckdVar).zzd("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((zzbqj) zzckdVar).zzd("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((zzbqj) zzckdVar).zzd("openableIntents", new JSONObject());
        }
    }
}
