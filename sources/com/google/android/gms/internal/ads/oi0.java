package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.JsonReader;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class oi0 extends fr {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g50 f18277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final so0 f18278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f18279d = new HashMap();

    public oi0(g50 g50Var, so0 so0Var) {
        this.f18277b = g50Var;
        this.f18278c = so0Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static zzm x1(Map map) {
        zzn zznVar = new zzn();
        String str = (String) map.get("ad_request");
        if (str == null) {
            return zznVar.zza();
        }
        JsonReader jsonReader = new JsonReader(new StringReader(Uri.decode(str)));
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                switch (strNextName.hashCode()) {
                    case -1289032093:
                        if (!strNextName.equals(HandleInvocationsFromAdViewer.KEY_EXTRAS)) {
                            jsonReader.skipValue();
                        } else {
                            jsonReader.beginObject();
                            Bundle bundle = new Bundle();
                            while (jsonReader.hasNext()) {
                                bundle.putString(jsonReader.nextName(), jsonReader.nextString());
                            }
                            jsonReader.endObject();
                            zznVar.zzb(bundle);
                        }
                        break;
                    case -839117230:
                        if (!strNextName.equals("isTestDevice")) {
                            jsonReader.skipValue();
                        } else {
                            zznVar.zzd(jsonReader.nextBoolean());
                        }
                        break;
                    case -733436947:
                        if (!strNextName.equals("tagForUnderAgeOfConsent")) {
                            jsonReader.skipValue();
                        } else if (!jsonReader.nextBoolean()) {
                            zznVar.zzf(0);
                        } else {
                            zznVar.zzf(1);
                        }
                        break;
                    case -99890337:
                        if (!strNextName.equals("httpTimeoutMillis")) {
                            jsonReader.skipValue();
                        } else {
                            zznVar.zzh(jsonReader.nextInt());
                        }
                        break;
                    case 523149226:
                        if (!strNextName.equals("keywords")) {
                            jsonReader.skipValue();
                        } else {
                            jsonReader.beginArray();
                            ArrayList arrayList = new ArrayList();
                            while (jsonReader.hasNext()) {
                                arrayList.add(jsonReader.nextString());
                            }
                            jsonReader.endArray();
                            zznVar.zzc(arrayList);
                        }
                        break;
                    case 597632527:
                        if (!strNextName.equals("maxAdContentRating")) {
                            jsonReader.skipValue();
                        } else {
                            String strNextString = jsonReader.nextString();
                            if (RequestConfiguration.zza.contains(strNextString)) {
                                zznVar.zzg(strNextString);
                            }
                        }
                        break;
                    case 1411582723:
                        if (!strNextName.equals("tagForChildDirectedTreatment")) {
                            jsonReader.skipValue();
                        } else if (!jsonReader.nextBoolean()) {
                            zznVar.zze(0);
                        } else {
                            zznVar.zze(1);
                        }
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
        } catch (IOException unused) {
            int i10 = zze.zza;
            zzo.zzd("Ad Request json was malformed, parsing ended early.");
        }
        zzm zzmVarZza = zznVar.zza();
        Bundle bundle2 = zzmVarZza.zzm;
        Bundle bundle3 = bundle2.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle3 == null) {
            bundle3 = zzmVarZza.zzc;
            bundle2.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle3);
        }
        return new zzm(zzmVarZza.zza, zzmVarZza.zzb, bundle3, zzmVarZza.zzd, zzmVarZza.zze, zzmVarZza.zzf, zzmVarZza.zzg, zzmVarZza.zzh, zzmVarZza.zzi, zzmVarZza.zzj, zzmVarZza.zzk, zzmVarZza.zzl, bundle2, zzmVarZza.zzn, zzmVarZza.zzo, zzmVarZza.zzp, zzmVarZza.zzq, zzmVarZza.zzr, zzmVarZza.zzs, zzmVarZza.zzt, zzmVarZza.zzu, zzmVarZza.zzv, zzmVarZza.zzw, zzmVarZza.zzx, zzmVarZza.zzy, zzmVarZza.zzz, zzmVarZza.zzA, zzmVarZza.zzB);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.hr
    public final void zze(String str) {
        if (((Boolean) zzba.zzc().a(am.Bb)).booleanValue()) {
            zze.zza("Received H5 gmsg: ".concat(String.valueOf(str)));
            Uri uri = Uri.parse(str);
            zzt.zzc();
            Map mapZzT = zzs.zzT(uri);
            String str2 = (String) mapZzT.get("action");
            if (TextUtils.isEmpty(str2)) {
                zzo.zzd("H5 gmsg did not contain an action");
                return;
            }
            int iHashCode = str2.hashCode();
            HashMap map = this.f18279d;
            so0 so0Var = this.f18278c;
            if (iHashCode != 579053441) {
                if (iHashCode == 871091088 && str2.equals(MobileAdsBridgeBase.initializeMethodName)) {
                    map.clear();
                    so0Var.getClass();
                    so0Var.n(new v90(MobileAdsBridgeBase.initializeMethodName));
                    return;
                }
            } else if (str2.equals("dispose_all")) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((mi0) it.next()).zzc();
                }
                map.clear();
                return;
            }
            String str3 = (String) mapZzT.get("obj_id");
            try {
                Objects.requireNonNull(str3);
                long j10 = Long.parseLong(str3);
                int iHashCode2 = str2.hashCode();
                g50 g50Var = this.f18277b;
                switch (iHashCode2) {
                    case -1790951212:
                        if (str2.equals("show_interstitial_ad")) {
                            mi0 mi0Var = (mi0) map.get(Long.valueOf(j10));
                            if (mi0Var != null) {
                                mi0Var.zzb();
                                return;
                            }
                            zzo.zzd("Could not show H5 ad, object ID does not exist");
                            so0Var.getClass();
                            v90 v90Var = new v90("interstitial");
                            v90Var.f21135a = Long.valueOf(j10);
                            v90Var.f21137c = "onNativeAdObjectNotAvailable";
                            so0Var.n(v90Var);
                            return;
                        }
                        break;
                    case -1266374734:
                        if (str2.equals("show_rewarded_ad")) {
                            mi0 mi0Var2 = (mi0) map.get(Long.valueOf(j10));
                            if (mi0Var2 != null) {
                                mi0Var2.zzb();
                                return;
                            }
                            zzo.zzd("Could not show H5 ad, object ID does not exist");
                            so0Var.getClass();
                            v90 v90Var2 = new v90("rewarded");
                            v90Var2.f21135a = Long.valueOf(j10);
                            v90Var2.f21137c = "onNativeAdObjectNotAvailable";
                            so0Var.n(v90Var2);
                            return;
                        }
                        break;
                    case -257098725:
                        if (str2.equals("load_rewarded_ad")) {
                            mi0 mi0Var3 = (mi0) map.get(Long.valueOf(j10));
                            if (mi0Var3 != null) {
                                mi0Var3.a(x1(mapZzT));
                                return;
                            }
                            zzo.zzd("Could not load H5 ad, object ID does not exist");
                            so0Var.getClass();
                            v90 v90Var3 = new v90("rewarded");
                            v90Var3.f21135a = Long.valueOf(j10);
                            v90Var3.f21137c = "onNativeAdObjectNotAvailable";
                            so0Var.n(v90Var3);
                            return;
                        }
                        break;
                    case 393881811:
                        if (str2.equals("create_interstitial_ad")) {
                            if (map.size() >= ((Integer) zzba.zzc().a(am.Cb)).intValue()) {
                                zzo.zzi("Could not create H5 ad, too many existing objects");
                                so0Var.k(j10);
                                return;
                            }
                            Long lValueOf = Long.valueOf(j10);
                            if (map.containsKey(lValueOf)) {
                                zzo.zzd("Could not create H5 ad, object ID already exists");
                                so0Var.k(j10);
                                return;
                            }
                            String str4 = (String) mapZzT.get("ad_unit");
                            if (TextUtils.isEmpty(str4)) {
                                zzo.zzi("Could not create H5 ad, missing ad unit id");
                                so0Var.k(j10);
                                return;
                            }
                            a50 a50Var = g50Var.f14763c;
                            g50 g50Var2 = g50Var.f14764d;
                            str4.getClass();
                            map.put(lValueOf, new qi0(j10, g50Var2.f14761a, new so0(g50Var2.f14762b, 24), a50Var, str4));
                            so0Var.getClass();
                            v90 v90Var4 = new v90("creation");
                            v90Var4.f21135a = Long.valueOf(j10);
                            v90Var4.f21137c = "nativeObjectCreated";
                            so0Var.n(v90Var4);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 39 + str4.length());
                            q4.a.r(sb2, "Created H5 interstitial #", j10, " with ad unit ");
                            sb2.append(str4);
                            zze.zza(sb2.toString());
                            return;
                        }
                        break;
                    case 585513149:
                        if (str2.equals("load_interstitial_ad")) {
                            mi0 mi0Var4 = (mi0) map.get(Long.valueOf(j10));
                            if (mi0Var4 != null) {
                                mi0Var4.a(x1(mapZzT));
                                return;
                            }
                            zzo.zzd("Could not load H5 ad, object ID does not exist");
                            so0Var.getClass();
                            v90 v90Var5 = new v90("interstitial");
                            v90Var5.f21135a = Long.valueOf(j10);
                            v90Var5.f21137c = "onNativeAdObjectNotAvailable";
                            so0Var.n(v90Var5);
                            return;
                        }
                        break;
                    case 1671767583:
                        if (str2.equals("dispose")) {
                            Long lValueOf2 = Long.valueOf(j10);
                            mi0 mi0Var5 = (mi0) map.get(lValueOf2);
                            if (mi0Var5 == null) {
                                zzo.zzd("Could not dispose H5 ad, object ID does not exist");
                                return;
                            }
                            mi0Var5.zzc();
                            map.remove(lValueOf2);
                            StringBuilder sb3 = new StringBuilder(String.valueOf(j10).length() + 16);
                            sb3.append("Disposed H5 ad #");
                            sb3.append(j10);
                            zze.zza(sb3.toString());
                            return;
                        }
                        break;
                    case 2109237041:
                        if (str2.equals("create_rewarded_ad")) {
                            if (map.size() >= ((Integer) zzba.zzc().a(am.Cb)).intValue()) {
                                zzo.zzi("Could not create H5 ad, too many existing objects");
                                so0Var.k(j10);
                                return;
                            }
                            Long lValueOf3 = Long.valueOf(j10);
                            if (map.containsKey(lValueOf3)) {
                                zzo.zzd("Could not create H5 ad, object ID already exists");
                                so0Var.k(j10);
                                return;
                            }
                            String str5 = (String) mapZzT.get("ad_unit");
                            if (TextUtils.isEmpty(str5)) {
                                zzo.zzi("Could not create H5 ad, missing ad unit id");
                                so0Var.k(j10);
                                return;
                            }
                            a50 a50Var2 = g50Var.f14763c;
                            g50 g50Var3 = g50Var.f14764d;
                            str5.getClass();
                            map.put(lValueOf3, new ti0(j10, g50Var3.f14761a, new so0(g50Var3.f14762b, 24), a50Var2, str5));
                            so0Var.getClass();
                            v90 v90Var6 = new v90("creation");
                            v90Var6.f21135a = Long.valueOf(j10);
                            v90Var6.f21137c = "nativeObjectCreated";
                            so0Var.n(v90Var6);
                            StringBuilder sb4 = new StringBuilder(String.valueOf(j10).length() + 35 + str5.length());
                            q4.a.r(sb4, "Created H5 rewarded #", j10, " with ad unit ");
                            sb4.append(str5);
                            zze.zza(sb4.toString());
                            return;
                        }
                        break;
                }
                zzo.zzd("H5 gmsg contained invalid action: ".concat(str2));
            } catch (NullPointerException | NumberFormatException unused) {
                zzo.zzd("H5 gmsg did not contain a valid object id: ".concat(String.valueOf(str3)));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.hr
    public final void zzf() {
        this.f18279d.clear();
    }
}
