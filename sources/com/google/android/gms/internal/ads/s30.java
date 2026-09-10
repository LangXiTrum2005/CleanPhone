package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzed;
import com.google.android.gms.ads.internal.util.client.zzo;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s30 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t30 f19813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f19815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f19816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f19817e;

    public /* synthetic */ s30(t30 t30Var, int i10, int i11, boolean z10, boolean z11) {
        this.f19813a = t30Var;
        this.f19814b = i10;
        this.f19815c = i11;
        this.f19816d = z10;
        this.f19817e = z11;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i10;
        boolean z10;
        boolean z11;
        zzed zzedVar;
        zzed zzedVar2;
        zzed zzedVar3;
        t30 t30Var = this.f19813a;
        int i11 = this.f19814b;
        int i12 = this.f19815c;
        boolean z12 = this.f19816d;
        boolean z13 = this.f19817e;
        synchronized (t30Var.f20140b) {
            try {
                boolean z14 = t30Var.f20145g;
                if (z14 || i12 != 1) {
                    i10 = i12;
                    z10 = false;
                } else {
                    i12 = 1;
                    i10 = 1;
                    z10 = true;
                }
                boolean z15 = i11 != i12;
                if (z15 && i10 == 1) {
                    z11 = true;
                    i10 = 1;
                } else {
                    z11 = false;
                }
                boolean z16 = z15 && i10 == 2;
                boolean z17 = z15 && i10 == 3;
                t30Var.f20145g = z14 || z10;
                if (z10) {
                    try {
                        zzed zzedVar4 = t30Var.f20144f;
                        if (zzedVar4 != null) {
                            zzedVar4.zze();
                        }
                    } catch (RemoteException e10) {
                        zzo.zzl("#007 Could not call remote method.", e10);
                    }
                }
                if (z11 && (zzedVar3 = t30Var.f20144f) != null) {
                    zzedVar3.zzf();
                }
                if (z16 && (zzedVar2 = t30Var.f20144f) != null) {
                    zzedVar2.zzg();
                }
                if (z17) {
                    zzed zzedVar5 = t30Var.f20144f;
                    if (zzedVar5 != null) {
                        zzedVar5.zzh();
                    }
                    t30Var.f20139a.zzz();
                }
                if (z12 != z13 && (zzedVar = t30Var.f20144f) != null) {
                    zzedVar.zzi(z13);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
