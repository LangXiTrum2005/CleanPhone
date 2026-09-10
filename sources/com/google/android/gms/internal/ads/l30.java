package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzn;
import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l30 {
    public static final b30 a(final Context context, final t0 t0Var, final String str, final boolean z10, final boolean z11, final qf qfVar, final sm smVar, final VersionInfoParcel versionInfoParcel, final x11 x11Var, final zza zzaVar, final pj pjVar, final du0 du0Var, final fu0 fu0Var, final zl0 zl0Var, final pu0 pu0Var, final yh0 yh0Var) {
        am.a(context);
        try {
            q81 q81Var = new q81() { // from class: com.google.android.gms.internal.ads.h30
                @Override // com.google.android.gms.internal.ads.q81
                public final Object zza() {
                    t0 t0Var2 = t0Var;
                    String str2 = str;
                    boolean z12 = z10;
                    boolean z13 = z11;
                    zl0 zl0Var2 = zl0Var;
                    yh0 yh0Var2 = yh0Var;
                    zzn zznVar = x11Var;
                    zza zzaVar2 = zzaVar;
                    pj pjVar2 = pjVar;
                    du0 du0Var2 = du0Var;
                    fu0 fu0Var2 = fu0Var;
                    pu0 pu0Var2 = pu0Var;
                    qf qfVar2 = qfVar;
                    sm smVar2 = smVar;
                    VersionInfoParcel versionInfoParcel2 = versionInfoParcel;
                    Context context2 = context;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i10 = r30.f19324c0;
                        c40 c40Var = new c40(context2);
                        c40Var.setBaseContext(context2);
                        n30 n30Var = new n30(new r30(c40Var, t0Var2, str2, z12, qfVar2, smVar2, versionInfoParcel2, zznVar, zzaVar2, pjVar2, du0Var2, fu0Var2, pu0Var2), yh0Var2);
                        n30Var.setWebViewClient(zzt.zzf().zzb(n30Var, pjVar2, z13, zl0Var2));
                        n30Var.setWebChromeClient(new a30(n30Var));
                        return n30Var;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return (b30) q81Var.zza();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th2) {
            throw new k30("Webview initialization failed.", th2);
        }
    }
}
