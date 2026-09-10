package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.ci0;
import com.google.android.gms.internal.ads.ju0;
import com.google.android.gms.internal.ads.l00;
import com.google.android.gms.internal.ads.mw0;
import com.google.android.gms.internal.ads.ou0;
import com.google.android.gms.internal.ads.wh0;
import com.ironsource.Gc;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzv {
    public static boolean zza(ju0 ju0Var) {
        return zzg((ou0) ju0Var.f16195a.f20839b) != 1;
    }

    public static String zzb(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return "unspecified";
        }
        switch (str.hashCode()) {
            case 1743582862:
                return str.equals("requester_type_0") ? "0" : str;
            case 1743582863:
                return str.equals("requester_type_1") ? "1" : str;
            case 1743582864:
                return str.equals("requester_type_2") ? "2" : str;
            case 1743582865:
                return str.equals("requester_type_3") ? "3" : str;
            case 1743582866:
                return str.equals("requester_type_4") ? "4" : str;
            case 1743582867:
                return str.equals("requester_type_5") ? CampaignEx.CLICKMODE_ON : str;
            case 1743582868:
                return str.equals("requester_type_6") ? "6" : str;
            case 1743582869:
                return str.equals("requester_type_7") ? Gc.f26168e : str;
            case 1743582870:
                return str.equals("requester_type_8") ? "8" : str;
            default:
                return str;
        }
    }

    @Nullable
    public static String zzc(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        Bundle bundle;
        return (zzmVar == null || (bundle = zzmVar.zzc) == null) ? "unspecified" : bundle.getString("query_info_type");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static mw0 zzd(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 != null) {
            bundle = bundle2;
        }
        String string = bundle.getString("query_info_type");
        boolean zIsEmpty = TextUtils.isEmpty(string);
        mw0 mw0Var = mw0.SCAR_REQUEST_TYPE_UNSPECIFIED;
        if (zIsEmpty) {
            return mw0Var;
        }
        switch (string.hashCode()) {
            case 1743582862:
                if (string.equals("requester_type_0")) {
                    return mw0.SCAR_REQUEST_TYPE_ADMOB;
                }
                return mw0Var;
            case 1743582863:
                if (string.equals("requester_type_1")) {
                    return mw0.SCAR_REQUEST_TYPE_INBOUND_MEDIATION;
                }
                return mw0Var;
            case 1743582864:
                if (string.equals("requester_type_2")) {
                    return mw0.SCAR_REQUEST_TYPE_GBID;
                }
                return mw0Var;
            case 1743582865:
                if (string.equals("requester_type_3")) {
                    return mw0.SCAR_REQUEST_TYPE_GOLDENEYE;
                }
                return mw0Var;
            case 1743582866:
                if (string.equals("requester_type_4")) {
                    return mw0.SCAR_REQUEST_TYPE_YAVIN;
                }
                return mw0Var;
            case 1743582867:
                if (string.equals("requester_type_5")) {
                    return mw0.SCAR_REQUEST_TYPE_UNITY;
                }
                return mw0Var;
            case 1743582868:
                if (string.equals("requester_type_6")) {
                    return mw0.SCAR_REQUEST_TYPE_PAW;
                }
                return mw0Var;
            case 1743582869:
                if (string.equals("requester_type_7")) {
                    return mw0.SCAR_REQUEST_TYPE_GUILDER;
                }
                return mw0Var;
            case 1743582870:
                if (string.equals("requester_type_8")) {
                    return mw0.SCAR_REQUEST_TYPE_GAM_S2S;
                }
                return mw0Var;
            default:
                return mw0Var;
        }
    }

    public static void zze(final ci0 ci0Var, @Nullable wh0 wh0Var, final String str, final Pair... pairArr) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.Z7)).booleanValue()) {
            l00.f16608a.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzu
                @Override // java.lang.Runnable
                public final void run() {
                    ci0 ci0Var2 = ci0Var;
                    ci0Var2.getClass();
                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(ci0Var2.f13169a);
                    if (!TextUtils.isEmpty("action")) {
                        String str2 = str;
                        if (!TextUtils.isEmpty(str2)) {
                            concurrentHashMap.put("action", str2);
                        }
                    }
                    int i10 = 0;
                    while (true) {
                        Pair[] pairArr2 = pairArr;
                        if (i10 >= pairArr2.length) {
                            ci0Var2.b(concurrentHashMap);
                            return;
                        }
                        Pair pair = pairArr2[i10];
                        String str3 = (String) pair.first;
                        String str4 = (String) pair.second;
                        if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                            concurrentHashMap.put(str3, str4);
                        }
                        i10++;
                    }
                }
            });
        }
    }

    public static int zzg(ou0 ou0Var) {
        if (ou0Var.f18377s) {
            return 2;
        }
        com.google.android.gms.ads.internal.client.zzm zzmVar = ou0Var.f18363d;
        com.google.android.gms.ads.internal.client.zzc zzcVar = zzmVar.zzs;
        if (zzcVar == null && zzmVar.zzx == null) {
            return 1;
        }
        if (zzcVar == null || zzmVar.zzx == null) {
            return zzcVar != null ? 3 : 4;
        }
        return 5;
    }
}
