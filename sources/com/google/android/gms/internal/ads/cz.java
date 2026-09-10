package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzac;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import com.ironsource.C0239a2;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class cz implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f13313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzg f13314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f13315d = C0239a2.f28156f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13316e = -1;

    public cz(Context context, zzg zzgVar) {
        this.f13313b = PreferenceManager.getDefaultSharedPreferences(context);
        this.f13314c = zzgVar;
        this.f13312a = context;
    }

    public final void a(int i10, String str) {
        Context context;
        boolean z10 = true;
        boolean z11 = (((Boolean) zzba.zzc().a(am.f12324r1)).booleanValue() && this.f13313b.getInt("IABTCF_gdprApplies", -1) == 0) ? false : true;
        if (!((Boolean) zzba.zzc().a(am.f12279o1)).booleanValue() ? !((str.isEmpty() || str.charAt(0) != '1') && z11) : !(i10 == 0 || ((str.isEmpty() || (str.charAt(0) != '1' && !str.equals(C0239a2.f28156f))) && z11))) {
            z10 = false;
        }
        this.f13314c.zzw(z10);
        if (((Boolean) zzba.zzc().a(am.f12269n7)).booleanValue() && z10 && (context = this.f13312a) != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        try {
            if (((Boolean) zzba.zzc().a(am.f12310q1)).booleanValue()) {
                boolean zEquals = Objects.equals(str, "gad_has_consent_for_cookies");
                Context context = this.f13312a;
                zzg zzgVar = this.f13314c;
                if (zEquals) {
                    int i10 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
                    if (i10 != zzgVar.zzD()) {
                        zzgVar.zzw(true);
                        zzac.zza(context);
                    }
                    zzgVar.zzC(i10);
                    return;
                }
                if (Objects.equals(str, AndroidTcfDataSource.TCF_TCSTRING_KEY)) {
                    String string = sharedPreferences.getString(str, C0239a2.f28156f);
                    String strZzB = zzgVar.zzB();
                    zzgVar.zzA(string);
                    if ((((Boolean) zzba.zzc().a(am.f12324r1)).booleanValue() && sharedPreferences.getInt("IABTCF_gdprApplies", -1) == 0) || Objects.equals(string, strZzB)) {
                        return;
                    }
                    zzgVar.zzw(true);
                    zzac.zza(context);
                    return;
                }
                return;
            }
            String string2 = sharedPreferences.getString("IABTCF_PurposeConsents", C0239a2.f28156f);
            int i11 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
            String strValueOf = String.valueOf(str);
            int iHashCode = strValueOf.hashCode();
            if (iHashCode == -2004976699) {
                if (!strValueOf.equals("IABTCF_PurposeConsents") || string2.equals(C0239a2.f28156f) || this.f13315d.equals(string2)) {
                    return;
                }
                this.f13315d = string2;
                a(i11, string2);
                return;
            }
            if (iHashCode == -527267622 && strValueOf.equals("gad_has_consent_for_cookies")) {
                if (!((Boolean) zzba.zzc().a(am.f12279o1)).booleanValue() || i11 == -1 || this.f13316e == i11) {
                    return;
                }
                this.f13316e = i11;
                a(i11, string2);
            }
        } catch (Throwable th2) {
            zzt.zzh().d("AdMobPlusIdlessListener.onSharedPreferenceChanged", th2);
            zze.zzb("onSharedPreferenceChanged, errorMessage = ", th2);
        }
    }
}
