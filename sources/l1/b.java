package l1;

import com.google.android.gms.internal.ads.kj1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kj1 f44776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f44777c;

    public /* synthetic */ b(kj1 kj1Var, Object obj, int i10) {
        this.f44775a = i10;
        this.f44776b = kj1Var;
        this.f44777c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f44775a) {
            case 0:
                kj1 kj1Var = this.f44776b;
                if (kj1Var.f16462a == 0) {
                    kj1Var.s(this.f44777c);
                }
                break;
            default:
                kj1 kj1Var2 = this.f44776b;
                int i10 = kj1Var2.f16462a - 1;
                kj1Var2.f16462a = i10;
                if (i10 == 0) {
                    kj1Var2.s(this.f44777c);
                }
                break;
        }
    }
}
