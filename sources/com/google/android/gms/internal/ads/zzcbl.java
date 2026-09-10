package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.p004ironsource.x4;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcbl implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final Context zza;
    private final SharedPreferences zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;
    private String zzd = x4.DISABLED_AUCTION_FALLBACK_ID;
    private int zze = -1;

    public zzcbl(Context context, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzb = PreferenceManager.getDefaultSharedPreferences(context);
        this.zzc = zzgVar;
        this.zza = context;
    }

    private final void zzb(String str, int i2) {
        Context context;
        boolean z2 = true;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzbd)).booleanValue() ? !(str.isEmpty() || str.charAt(0) != '1') : !(i2 == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals(x4.DISABLED_AUCTION_FALLBACK_ID)))) {
            z2 = false;
        }
        this.zzc.zzw(z2);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzha)).booleanValue() && z2 && (context = this.zza) != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
    }

    private final void zzc() {
        this.zzc.zzw(true);
        com.google.android.gms.ads.internal.util.zzac.zza(this.zza);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0081  */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        byte b2;
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzbf)).booleanValue()) {
                if (Objects.equals(str, "gad_has_consent_for_cookies")) {
                    int i2 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
                    com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzc;
                    if (i2 != zzgVar.zzD()) {
                        zzc();
                    }
                    zzgVar.zzC(i2);
                    return;
                }
                if (Objects.equals(str, "IABTCF_TCString")) {
                    String string = sharedPreferences.getString(str, x4.DISABLED_AUCTION_FALLBACK_ID);
                    com.google.android.gms.ads.internal.util.zzg zzgVar2 = this.zzc;
                    if (!Objects.equals(string, zzgVar2.zzB())) {
                        zzc();
                    }
                    zzgVar2.zzA(string);
                    return;
                }
                return;
            }
            String string2 = sharedPreferences.getString("IABTCF_PurposeConsents", x4.DISABLED_AUCTION_FALLBACK_ID);
            int i3 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
            String strValueOf = String.valueOf(str);
            int iHashCode = strValueOf.hashCode();
            if (iHashCode != -2004976699) {
                if (iHashCode == -527267622 && strValueOf.equals("gad_has_consent_for_cookies")) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
            } else if (strValueOf.equals("IABTCF_PurposeConsents")) {
                b2 = 0;
            } else {
                b2 = -1;
            }
            if (b2 == 0) {
                if (string2.equals(x4.DISABLED_AUCTION_FALLBACK_ID) || this.zzd.equals(string2)) {
                    return;
                }
                this.zzd = string2;
                zzb(string2, i3);
                return;
            }
            if (b2 != 1) {
                return;
            }
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzbd)).booleanValue() || i3 == -1 || this.zze == i3) {
                return;
            }
            this.zze = i3;
            zzb(string2, i3);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "AdMobPlusIdlessListener.onSharedPreferenceChanged");
            com.google.android.gms.ads.internal.util.zze.zzb("onSharedPreferenceChanged, errorMessage = ", th);
        }
    }

    public final void zza() {
        SharedPreferences sharedPreferences = this.zzb;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(sharedPreferences, "gad_has_consent_for_cookies");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzbf)).booleanValue()) {
            onSharedPreferenceChanged(sharedPreferences, "IABTCF_TCString");
        } else {
            onSharedPreferenceChanged(sharedPreferences, "IABTCF_PurposeConsents");
        }
    }
}
