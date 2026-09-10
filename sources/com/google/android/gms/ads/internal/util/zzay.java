package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.fb;
import com.google.android.gms.internal.ads.hb;
import com.google.android.gms.internal.ads.ib;
import com.google.android.gms.internal.ads.lb;
import com.google.android.gms.internal.ads.md0;
import com.google.android.gms.internal.ads.s6;
import com.google.android.gms.internal.ads.tb;
import i9.i;
import java.io.File;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzay extends md0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f11065d;

    public zzay(Context context, s6 s6Var) {
        super(s6Var);
        this.f11065d = context;
    }

    public static ib zzb(Context context) {
        ib ibVar = new ib(new tb(new File(new File(context.getCacheDir(), "admob_volley").getPath())), new zzay(context, new s6(20)));
        ibVar.a();
        return ibVar;
    }

    @Override // com.google.android.gms.internal.ads.md0, com.google.android.gms.internal.ads.cb
    public final fb zza(hb hbVar) throws lb {
        if (hbVar.zza() == 0) {
            if (Pattern.matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.f12451z5), hbVar.zzh())) {
                com.google.android.gms.ads.internal.client.zzay.zza();
                Context context = this.f11065d;
                if (com.google.android.gms.ads.internal.util.client.zzf.zzz(context, 13400000)) {
                    fb fbVarZza = new i(context).zza(hbVar);
                    if (fbVarZza != null) {
                        zze.zza("Got gmscore asset response: ".concat(String.valueOf(hbVar.zzh())));
                        return fbVarZza;
                    }
                    zze.zza("Failed to get gmscore asset response: ".concat(String.valueOf(hbVar.zzh())));
                }
            }
        }
        return super.zza(hbVar);
    }
}
