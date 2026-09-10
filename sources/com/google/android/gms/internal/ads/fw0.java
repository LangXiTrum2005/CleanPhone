package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.nonagon.signalgeneration.zzv;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public interface fw0 {
    static fw0 d(Context context, int i10, int i11, zzm zzmVar) {
        boolean zMatches;
        fw0 fw0VarF = f(context, i10);
        if (fw0VarF instanceof gw0) {
            gw0 gw0Var = (gw0) fw0VarF;
            gw0Var.h();
            gw0Var.g(i11);
            gw0Var.e(zzv.zzd(zzmVar.zzm));
            String str = zzmVar.zzp;
            if (TextUtils.isEmpty(str)) {
                zMatches = false;
            } else {
                zMatches = Pattern.matches((String) zzba.zzc().a(am.f12198ia), str);
            }
            if (zMatches) {
                gw0Var.zze(str);
            }
        }
        return fw0VarF;
    }

    static fw0 f(Context context, int i10) {
        boolean zBooleanValue;
        if (kw0.a()) {
            int i11 = i10 - 2;
            if (i11 == 20 || i11 == 21) {
                zBooleanValue = ((Boolean) an.f12468e.o()).booleanValue();
            } else if (i11 != 110) {
                switch (i11) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        zBooleanValue = ((Boolean) an.f12466c.o()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        zBooleanValue = ((Boolean) an.f12467d.o()).booleanValue();
                        break;
                    case 5:
                        zBooleanValue = ((Boolean) an.f12465b.o()).booleanValue();
                        break;
                }
            } else {
                zBooleanValue = ((Boolean) zzba.zzc().a(am.f12318qa)).booleanValue();
            }
            if (zBooleanValue) {
                return new gw0(context, i10);
            }
        }
        return new xw0();
    }

    fw0 a(Throwable th2);

    fw0 b(uw uwVar);

    fw0 c(zze zzeVar);

    fw0 e(mw0 mw0Var);

    fw0 g(int i10);

    fw0 zza();

    boolean zzb();

    fw0 zzc();

    fw0 zzd(boolean z10);

    fw0 zze(String str);

    fw0 zzi(String str);

    fw0 zzk(String str);

    boolean zzl();

    hw0 zzm();
}
