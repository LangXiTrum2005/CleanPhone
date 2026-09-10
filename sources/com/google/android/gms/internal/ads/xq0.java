package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.O6;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class xq0 implements bs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f21966a = new AtomicReference();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f21967b = new AtomicReference(Boolean.FALSE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p9.a f21968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f21969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final bs0 f21970e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f21971f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final yh0 f21972g;

    public xq0(bs0 bs0Var, long j10, p9.a aVar, k00 k00Var, yh0 yh0Var) {
        this.f21968c = aVar;
        this.f21970e = bs0Var;
        this.f21971f = j10;
        this.f21969d = k00Var;
        this.f21972g = yh0Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x002d  */
    @Override // com.google.android.gms.internal.ads.bs0
    public final ListenableFuture zza() {
        vq0 vq0Var;
        if (((Boolean) zzba.zzc().a(am.f12410wd)).booleanValue()) {
            if (((Boolean) zzba.zzc().a(am.f12396vd)).booleanValue() && !((Boolean) this.f21967b.getAndSet(Boolean.TRUE)).booleanValue()) {
                j00 j00Var = l00.f16611d;
                wq0 wq0Var = new wq0(this, 1);
                long j10 = this.f21971f;
                j00Var.scheduleWithFixedDelay(wq0Var, j10, j10, TimeUnit.MILLISECONDS);
            }
            synchronized (this) {
                try {
                    AtomicReference atomicReference = this.f21966a;
                    vq0Var = (vq0) atomicReference.get();
                    if (vq0Var == null) {
                        ListenableFuture listenableFutureZza = this.f21970e.zza();
                        atomicReference.set(new vq0(listenableFutureZza, this.f21971f, this.f21968c));
                        return listenableFutureZza;
                    }
                    if (!((Boolean) this.f21967b.get()).booleanValue()) {
                        p9.a aVar = vq0Var.f21253c;
                        long j11 = vq0Var.f21252b;
                        ((p9.b) aVar).getClass();
                        if (j11 < SystemClock.elapsedRealtime()) {
                            ListenableFuture listenableFuture = vq0Var.f21251a;
                            bs0 bs0Var = this.f21970e;
                            vq0 vq0Var2 = new vq0(bs0Var.zza(), this.f21971f, this.f21968c);
                            this.f21966a.set(vq0Var2);
                            if (((Boolean) zzba.zzc().a(am.f12426xd)).booleanValue()) {
                                if (((Boolean) zzba.zzc().a(am.yd)).booleanValue()) {
                                    lj1 lj1VarA = this.f21972g.a();
                                    lj1VarA.l("action", "scs");
                                    lj1VarA.l(O6.f26710e1, String.valueOf(bs0Var.zzb()));
                                    lj1VarA.m();
                                }
                                return listenableFuture;
                            }
                            vq0Var = vq0Var2;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            AtomicReference atomicReference2 = this.f21966a;
            vq0Var = (vq0) atomicReference2.get();
            if (vq0Var != null) {
                p9.a aVar2 = vq0Var.f21253c;
                long j12 = vq0Var.f21252b;
                ((p9.b) aVar2).getClass();
                if (j12 < SystemClock.elapsedRealtime()) {
                    bs0 bs0Var2 = this.f21970e;
                    vq0 vq0Var3 = new vq0(bs0Var2.zza(), this.f21971f, this.f21968c);
                    atomicReference2.set(vq0Var3);
                    vq0Var = vq0Var3;
                }
            } else {
                bs0 bs0Var3 = this.f21970e;
                vq0 vq0Var4 = new vq0(bs0Var3.zza(), this.f21971f, this.f21968c);
                atomicReference2.set(vq0Var4);
                vq0Var = vq0Var4;
            }
        }
        return vq0Var.f21251a;
    }

    @Override // com.google.android.gms.internal.ads.bs0
    public final int zzb() {
        return this.f21970e.zzb();
    }
}
