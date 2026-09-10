package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m80 implements co0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ju0 f17334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final du0 f17335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pa0 f17336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sa0 f17337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final it0 f17338e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final aa0 f17339f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final nb0 f17340g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ua0 f17341h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final lc0 f17342i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n90 f17343j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ji0 f17344k;

    public m80(k80 k80Var) {
        this.f17334a = k80Var.f16364a;
        this.f17335b = (du0) k80Var.f16365b;
        this.f17336c = (pa0) k80Var.f16366c;
        this.f17337d = (sa0) k80Var.f16367d;
        this.f17338e = (it0) k80Var.f16368e;
        this.f17339f = (aa0) k80Var.f16369f;
        this.f17340g = (nb0) k80Var.f16370g;
        this.f17341h = (ua0) k80Var.f16371h;
        this.f17342i = (lc0) k80Var.f16372i;
        this.f17343j = (n90) k80Var.f16373j;
        this.f17344k = (ji0) k80Var.f16374k;
    }

    public void a() {
        this.f17337d.zzg();
        this.f17341h.J(this);
    }

    public final void b() {
        ji0 ji0Var;
        ya1 ya1Var = this.f17335b.C0;
        if (ya1Var == null || ya1Var.isEmpty() || (ji0Var = this.f17344k) == null) {
            return;
        }
        if (!((Boolean) zzba.zzc().a(am.R8)).booleanValue() || ya1Var.isEmpty()) {
            return;
        }
        aa1 aa1VarListIterator = ya1Var.listIterator(0);
        while (aa1VarListIterator.hasNext()) {
            ki0 ki0Var = (ki0) aa1VarListIterator.next();
            for (int i10 : ki0Var.f16451b) {
                if (i10 == 1) {
                    long j10 = ki0Var.f16450a;
                    ((p9.b) zzt.zzk()).getClass();
                    ji0Var.a(1, j10, System.currentTimeMillis());
                    break;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.co0
    public final void zzm() {
        this.f17342i.zzi();
    }
}
