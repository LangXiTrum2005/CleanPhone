package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ms implements js, xs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b30 f17535a;

    public static final void v(Runnable runnable) {
        zzay.zza();
        if (zzf.zzB()) {
            zze.zza("runOnUiThread > the UI thread is the main thread, the runnable will be run now");
            runnable.run();
        } else {
            zze.zza("runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue");
            if (zzs.zza.post(runnable)) {
                return;
            }
            zzo.zzi("runOnUiThread > the runnable could not be placed to the message queue");
        }
    }

    @Override // com.google.android.gms.internal.ads.xs
    public final void k(String str, oq oqVar) {
        b30 b30Var = this.f17535a;
        if (b30Var != null) {
            b30Var.h0(str, new x11(oqVar, 7));
        }
    }

    @Override // com.google.android.gms.internal.ads.xs
    public final void z(String str, oq oqVar) {
        b30 b30Var = this.f17535a;
        if (b30Var != null) {
            b30Var.D(str, new ks(this, oqVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.js, com.google.android.gms.internal.ads.ns
    public final void zza(String str) {
        zze.zza("invokeJavascript on adWebView from js");
        v(new ls(this, str, 3));
    }
}
