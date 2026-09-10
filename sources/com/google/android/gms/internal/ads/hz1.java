package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hz1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15444e;

    public /* synthetic */ hz1(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f15440a = i10;
        this.f15441b = obj;
        this.f15442c = obj2;
        this.f15443d = obj3;
        this.f15444e = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fj fjVar;
        boolean z10;
        long j10;
        switch (this.f15440a) {
            case 0:
                Pair pair = (Pair) this.f15442c;
                ((d02) ((jz1) this.f15441b).f16227b.f17089j).a(((Integer) pair.first).intValue(), (r32) pair.second, (j32) this.f15443d, (o32) this.f15444e);
                return;
            case 1:
                Pair pair2 = (Pair) this.f15442c;
                ((d02) ((jz1) this.f15441b).f16227b.f17089j).b(((Integer) pair2.first).intValue(), (r32) pair2.second, (j32) this.f15443d, (o32) this.f15444e);
                return;
            default:
                kj kjVar = (kj) this.f15444e;
                hj hjVar = (hj) this.f15442c;
                vu0 vu0Var = (vu0) this.f15441b;
                try {
                    jj jjVar = (jj) hjVar.getService();
                    boolean zJ = hjVar.j();
                    ij ijVar = (ij) this.f15443d;
                    if (zJ) {
                        Parcel parcelQ = jjVar.q();
                        rh.c(parcelQ, ijVar);
                        Parcel parcelR = jjVar.r(parcelQ, 2);
                        fjVar = (fj) rh.b(parcelR, fj.CREATOR);
                        parcelR.recycle();
                    } else {
                        Parcel parcelQ2 = jjVar.q();
                        rh.c(parcelQ2, ijVar);
                        Parcel parcelR2 = jjVar.r(parcelQ2, 1);
                        fjVar = (fj) rh.b(parcelR2, fj.CREATOR);
                        parcelR2.recycle();
                    }
                    fj fjVar2 = fjVar;
                    if (!fjVar2.zza()) {
                        kjVar.zzd(new RuntimeException("No entry contents."));
                        ((t6.l) vu0Var.f21276d).i();
                        return;
                    }
                    lj ljVar = new lj(vu0Var, fjVar2.b());
                    int i10 = ljVar.read();
                    if (i10 == -1) {
                        throw new IOException("Unable to read from cache.");
                    }
                    ljVar.unread(i10);
                    synchronized (fjVar2) {
                        z10 = fjVar2.f14445b;
                    }
                    boolean zM = fjVar2.m();
                    synchronized (fjVar2) {
                        j10 = fjVar2.f14447d;
                    }
                    kjVar.zzc(new nj(ljVar, z10, zM, j10, fjVar2.h()));
                    return;
                } catch (RemoteException | IOException e10) {
                    int i11 = zze.zza;
                    zzo.zzg("Unable to obtain a cache service instance.", e10);
                    kjVar.zzd(e10);
                    ((t6.l) vu0Var.f21276d).i();
                    return;
                }
        }
    }
}
