package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzcv;
import com.google.android.gms.ads.internal.client.zzez;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q40 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o40 f18923a;

    public q40(o40 o40Var) {
        this.f18923a = o40Var;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String zzb() {
        zzez liteSdkVersion;
        zzcv zzcvVar = (zzcv) vu0.h(this.f18923a.a()).f21275c;
        if (zzcvVar != null) {
            try {
                liteSdkVersion = zzcvVar.getLiteSdkVersion();
            } catch (RemoteException unused) {
                liteSdkVersion = null;
            }
        } else {
            liteSdkVersion = null;
        }
        if (liteSdkVersion != null) {
            return liteSdkVersion.zzb();
        }
        return null;
    }
}
