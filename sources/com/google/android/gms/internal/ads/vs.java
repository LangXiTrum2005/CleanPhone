package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class vs extends q00 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f21264c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f21265d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21266e = 0;

    public vs(jq jqVar) {
    }

    public final us t() {
        us usVar = new us(this);
        zze.zza("createNewReference: Trying to acquire lock");
        synchronized (this.f21264c) {
            zze.zza("createNewReference: Lock acquired");
            q(new x11(this, usVar), new b21(this, usVar));
            k9.c0.k(this.f21266e >= 0);
            this.f21266e++;
        }
        zze.zza("createNewReference: Lock released");
        return usVar;
    }

    public final void u() {
        zze.zza("releaseOneReference: Trying to acquire lock");
        synchronized (this.f21264c) {
            zze.zza("releaseOneReference: Lock acquired");
            k9.c0.k(this.f21266e > 0);
            zze.zza("Releasing 1 reference for JS Engine");
            this.f21266e--;
            w();
        }
        zze.zza("releaseOneReference: Lock released");
    }

    public final void v() {
        zze.zza("markAsDestroyable: Trying to acquire lock");
        synchronized (this.f21264c) {
            zze.zza("markAsDestroyable: Lock acquired");
            k9.c0.k(this.f21266e >= 0);
            zze.zza("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.f21265d = true;
            w();
        }
        zze.zza("markAsDestroyable: Lock released");
    }

    public final void w() {
        zze.zza("maybeDestroy: Trying to acquire lock");
        synchronized (this.f21264c) {
            try {
                zze.zza("maybeDestroy: Lock acquired");
                k9.c0.k(this.f21266e >= 0);
                if (this.f21265d && this.f21266e == 0) {
                    zze.zza("No reference is left (including root). Cleaning up engine.");
                    q(new jq(3), new jq(14));
                } else {
                    zze.zza("There are still references to the engine. Not destroying.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        zze.zza("maybeDestroy: Lock released");
    }
}
