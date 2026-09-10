package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.JsonReader;
import com.google.android.gms.ads.RequestConfiguration;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdyt extends zzbop {
    private final zzdyw zza;
    private final zzdyr zzb;
    private final Map zzc = new HashMap();

    public zzdyt(zzdyw zzdywVar, zzdyr zzdyrVar) {
        this.zza = zzdywVar;
        this.zzb = zzdyrVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x0081  */
    private static com.google.android.gms.ads.internal.client.zzm zzc(Map map) {
        com.google.android.gms.ads.internal.client.zzn zznVar = new com.google.android.gms.ads.internal.client.zzn();
        String str = (String) map.get("ad_request");
        if (str == null) {
            return zznVar.zza();
        }
        JsonReader jsonReader = new JsonReader(new StringReader(Uri.decode(str)));
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                switch (jsonReader.nextName()) {
                    case "extras":
                        jsonReader.beginObject();
                        Bundle bundle = new Bundle();
                        while (jsonReader.hasNext()) {
                            bundle.putString(jsonReader.nextName(), jsonReader.nextString());
                        }
                        jsonReader.endObject();
                        zznVar.zzb(bundle);
                        break;
                    case "keywords":
                        jsonReader.beginArray();
                        ArrayList arrayList = new ArrayList();
                        while (jsonReader.hasNext()) {
                            arrayList.add(jsonReader.nextString());
                        }
                        jsonReader.endArray();
                        zznVar.zzc(arrayList);
                        break;
                    case "isTestDevice":
                        zznVar.zzd(jsonReader.nextBoolean());
                        break;
                    case "tagForChildDirectedTreatment":
                        if (!jsonReader.nextBoolean()) {
                            zznVar.zze(0);
                            break;
                        } else {
                            zznVar.zze(1);
                            break;
                        }
                        break;
                    case "tagForUnderAgeOfConsent":
                        if (!jsonReader.nextBoolean()) {
                            zznVar.zzf(0);
                            break;
                        } else {
                            zznVar.zzf(1);
                            break;
                        }
                        break;
                    case "maxAdContentRating":
                        String strNextString = jsonReader.nextString();
                        if (!RequestConfiguration.zza.contains(strNextString)) {
                            break;
                        } else {
                            zznVar.zzg(strNextString);
                            break;
                        }
                        break;
                    case "httpTimeoutMillis":
                        zznVar.zzh(jsonReader.nextInt());
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
        } catch (IOException unused) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad Request json was malformed, parsing ended early.");
        }
        com.google.android.gms.ads.internal.client.zzm zzmVarZza = zznVar.zza();
        Bundle bundle2 = zzmVarZza.zzm;
        Bundle bundle3 = bundle2.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle3 == null) {
            bundle3 = zzmVarZza.zzc;
            bundle2.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle3);
        }
        return new com.google.android.gms.ads.internal.client.zzm(zzmVarZza.zza, zzmVarZza.zzb, bundle3, zzmVarZza.zzd, zzmVarZza.zze, zzmVarZza.zzf, zzmVarZza.zzg, zzmVarZza.zzh, zzmVarZza.zzi, zzmVarZza.zzj, zzmVarZza.zzk, zzmVarZza.zzl, bundle2, zzmVarZza.zzn, zzmVarZza.zzo, zzmVarZza.zzp, zzmVarZza.zzq, zzmVarZza.zzr, zzmVarZza.zzs, zzmVarZza.zzt, zzmVarZza.zzu, zzmVarZza.zzv, zzmVarZza.zzw, zzmVarZza.zzx, zzmVarZza.zzy, zzmVarZza.zzz, zzmVarZza.zzA);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0065  */
    @Override // com.google.android.gms.internal.ads.zzboq
    public final void zze(String str) throws RemoteException {
        byte b2;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzln)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zza("Received H5 gmsg: ".concat(String.valueOf(str)));
            Uri uri = Uri.parse(str);
            com.google.android.gms.ads.internal.zzt.zzc();
            Map mapZzV = com.google.android.gms.ads.internal.util.zzs.zzV(uri);
            String str2 = (String) mapZzV.get("action");
            if (TextUtils.isEmpty(str2)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzd("H5 gmsg did not contain an action");
                return;
            }
            int iHashCode = str2.hashCode();
            if (iHashCode != 579053441) {
                if (iHashCode == 871091088 && str2.equals(MobileAdsBridgeBase.initializeMethodName)) {
                    b2 = 0;
                } else {
                    b2 = -1;
                }
            } else if (str2.equals("dispose_all")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
            if (b2 == 0) {
                this.zzc.clear();
                this.zzb.zza();
                return;
            }
            if (b2 == 1) {
                Map map = this.zzc;
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((zzdyn) it.next()).zzc();
                }
                map.clear();
                return;
            }
            String str3 = (String) mapZzV.get("obj_id");
            try {
                Objects.requireNonNull(str3);
                long j = Long.parseLong(str3);
                switch (str2) {
                    case "create_interstitial_ad":
                        Map map2 = this.zzc;
                        if (map2.size() >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzlo)).intValue()) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not create H5 ad, too many existing objects");
                            this.zzb.zzc(j);
                            break;
                        } else {
                            Long lValueOf = Long.valueOf(j);
                            if (!map2.containsKey(lValueOf)) {
                                String str4 = (String) mapZzV.get("ad_unit");
                                if (!TextUtils.isEmpty(str4)) {
                                    zzdyo zzdyoVarZzc = this.zza.zzc();
                                    zzdyoVarZzc.zzc(j);
                                    zzdyoVarZzc.zzb(str4);
                                    map2.put(lValueOf, zzdyoVarZzc.zza().zza());
                                    this.zzb.zzb(j);
                                    StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 39 + String.valueOf(str4).length());
                                    androidx.datastore.preferences.protobuf.a.A(sb, "Created H5 interstitial #", j, " with ad unit ");
                                    sb.append(str4);
                                    com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
                                } else {
                                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not create H5 ad, missing ad unit id");
                                    this.zzb.zzc(j);
                                }
                            } else {
                                com.google.android.gms.ads.internal.util.client.zzo.zzd("Could not create H5 ad, object ID already exists");
                                this.zzb.zzc(j);
                            }
                            break;
                        }
                        break;
                    case "load_interstitial_ad":
                        zzdyn zzdynVar = (zzdyn) this.zzc.get(Long.valueOf(j));
                        if (zzdynVar == null) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzd("Could not load H5 ad, object ID does not exist");
                            this.zzb.zzd(j);
                            break;
                        } else {
                            zzdynVar.zza(zzc(mapZzV));
                            break;
                        }
                        break;
                    case "show_interstitial_ad":
                        zzdyn zzdynVar2 = (zzdyn) this.zzc.get(Long.valueOf(j));
                        if (zzdynVar2 == null) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzd("Could not show H5 ad, object ID does not exist");
                            this.zzb.zzd(j);
                            break;
                        } else {
                            zzdynVar2.zzb();
                            break;
                        }
                        break;
                    case "create_rewarded_ad":
                        Map map3 = this.zzc;
                        if (map3.size() >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzlo)).intValue()) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not create H5 ad, too many existing objects");
                            this.zzb.zzc(j);
                            break;
                        } else {
                            Long lValueOf2 = Long.valueOf(j);
                            if (!map3.containsKey(lValueOf2)) {
                                String str5 = (String) mapZzV.get("ad_unit");
                                if (!TextUtils.isEmpty(str5)) {
                                    zzdyo zzdyoVarZzc2 = this.zza.zzc();
                                    zzdyoVarZzc2.zzc(j);
                                    zzdyoVarZzc2.zzb(str5);
                                    map3.put(lValueOf2, zzdyoVarZzc2.zza().zzb());
                                    this.zzb.zzb(j);
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(j).length() + 35 + String.valueOf(str5).length());
                                    androidx.datastore.preferences.protobuf.a.A(sb2, "Created H5 rewarded #", j, " with ad unit ");
                                    sb2.append(str5);
                                    com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
                                } else {
                                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not create H5 ad, missing ad unit id");
                                    this.zzb.zzc(j);
                                }
                            } else {
                                com.google.android.gms.ads.internal.util.client.zzo.zzd("Could not create H5 ad, object ID already exists");
                                this.zzb.zzc(j);
                            }
                            break;
                        }
                        break;
                    case "load_rewarded_ad":
                        zzdyn zzdynVar3 = (zzdyn) this.zzc.get(Long.valueOf(j));
                        if (zzdynVar3 == null) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzd("Could not load H5 ad, object ID does not exist");
                            this.zzb.zzj(j);
                            break;
                        } else {
                            zzdynVar3.zza(zzc(mapZzV));
                            break;
                        }
                        break;
                    case "show_rewarded_ad":
                        zzdyn zzdynVar4 = (zzdyn) this.zzc.get(Long.valueOf(j));
                        if (zzdynVar4 == null) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzd("Could not show H5 ad, object ID does not exist");
                            this.zzb.zzj(j);
                            break;
                        } else {
                            zzdynVar4.zzb();
                            break;
                        }
                        break;
                    case "dispose":
                        Map map4 = this.zzc;
                        Long lValueOf3 = Long.valueOf(j);
                        zzdyn zzdynVar5 = (zzdyn) map4.get(lValueOf3);
                        if (zzdynVar5 == null) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzd("Could not dispose H5 ad, object ID does not exist");
                            break;
                        } else {
                            zzdynVar5.zzc();
                            map4.remove(lValueOf3);
                            StringBuilder sb3 = new StringBuilder(String.valueOf(j).length() + 16);
                            sb3.append("Disposed H5 ad #");
                            sb3.append(j);
                            com.google.android.gms.ads.internal.util.zze.zza(sb3.toString());
                            break;
                        }
                        break;
                    default:
                        com.google.android.gms.ads.internal.util.client.zzo.zzd("H5 gmsg contained invalid action: ".concat(str2));
                        break;
                }
            } catch (NullPointerException | NumberFormatException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzd("H5 gmsg did not contain a valid object id: ".concat(String.valueOf(str3)));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboq
    public final void zzf() {
        this.zzc.clear();
    }
}
