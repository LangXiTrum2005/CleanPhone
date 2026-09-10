package com.applovin.impl;

import com.ironsource.Jf;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f9116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9117c;

    public /* synthetic */ q9(int i10, Object obj, boolean z10) {
        this.f9115a = i10;
        this.f9117c = obj;
        this.f9116b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f9115a;
        final boolean z10 = this.f9116b;
        Object obj = this.f9117c;
        switch (i10) {
            case 0:
                ((n4) obj).a(z10);
                break;
            case 1:
                Jf.b((Runnable) obj, z10);
                break;
            case 2:
                ((com.mbridge.msdk.system.a) obj).lambda$init$2(z10);
                break;
            default:
                p1.v vVar = ((l2.v) obj).f44942b;
                String str = l1.y.f44830a;
                p1.b0 b0Var = vVar.f48170a;
                if (b0Var.f47928a0 != z10) {
                    b0Var.f47928a0 = z10;
                    b0Var.f47947m.e(23, new l1.k() { // from class: p1.u
                        @Override // l1.k
                        public final void invoke(Object obj2) {
                            ((i1.i0) obj2).m(z10);
                        }
                    });
                    break;
                }
                break;
        }
    }
}
