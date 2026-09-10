package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class us extends q00 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f20878c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vs f20879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f20880e;

    public us(vs vsVar) {
        this.f20879d = vsVar;
    }

    public final void t() {
        zze.zza("release: Trying to acquire lock");
        synchronized (this.f20878c) {
            try {
                zze.zza("release: Lock acquired");
                if (this.f20880e) {
                    zze.zza("release: Lock already released");
                    return;
                }
                this.f20880e = true;
                q(new jq(2), new jq(14));
                q(new vf(this), new so0(this));
                zze.zza("release: Lock released");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
