package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzs;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class u00 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w00 f20560b;

    public /* synthetic */ u00(w00 w00Var, int i10) {
        this.f20559a = i10;
        this.f20560b = w00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20559a) {
            case 0:
                d10 d10Var = this.f20560b.f21350q;
                if (d10Var != null) {
                    d10Var.h();
                }
                break;
            case 1:
                d10 d10Var2 = this.f20560b.f21350q;
                if (d10Var2 != null) {
                    c10 c10Var = d10Var2.f13339e;
                    c10Var.f12989c = false;
                    y01 y01Var = zzs.zza;
                    y01Var.removeCallbacks(c10Var);
                    y01Var.postDelayed(c10Var, 250L);
                    y01Var.post(new b10(d10Var2, 0));
                }
                break;
            case 2:
                w00 w00Var = this.f20560b;
                d10 d10Var3 = w00Var.f21350q;
                if (d10Var3 != null) {
                    d10Var3.g();
                    w00Var.f21350q.i();
                }
                break;
            case 3:
                w00 w00Var2 = this.f20560b;
                d10 d10Var4 = w00Var2.f21350q;
                if (d10Var4 != null) {
                    if (!w00Var2.f21351r) {
                        d10Var4.k();
                        w00Var2.f21351r = true;
                    }
                    w00Var2.f21350q.f();
                }
                break;
            default:
                d10 d10Var5 = this.f20560b.f21350q;
                if (d10Var5 != null) {
                    d10Var5.g();
                }
                break;
        }
    }
}
