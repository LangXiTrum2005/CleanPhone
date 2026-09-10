package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.zzt;
import java.math.BigInteger;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h00 implements ii {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzj f15013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final md0 f15014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g00 f15015d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15012a = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f15016e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashSet f15017f = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f15018g = false;

    public h00(String str, zzj zzjVar) {
        this.f15015d = new g00(str, zzjVar);
        this.f15013b = zzjVar;
        md0 md0Var = new md0(11);
        md0Var.f17399b = BigInteger.ONE;
        md0Var.f17400c = "0";
        this.f15014c = md0Var;
    }

    public final void a(b00 b00Var) {
        synchronized (this.f15012a) {
            this.f15016e.add(b00Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.ii
    public final void zza(boolean z10) {
        ((p9.b) zzt.zzk()).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzj zzjVar = this.f15013b;
        g00 g00Var = this.f15015d;
        if (!z10) {
            zzjVar.zzl(jCurrentTimeMillis);
            zzjVar.zzn(g00Var.f14631d);
            return;
        }
        if (jCurrentTimeMillis - zzjVar.zzm() > ((Long) zzba.zzc().a(am.L1)).longValue()) {
            g00Var.f14631d = -1;
        } else {
            g00Var.f14631d = zzjVar.zzo();
        }
        this.f15018g = true;
    }
}
