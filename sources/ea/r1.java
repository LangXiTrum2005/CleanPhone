package ea;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class r1 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n4 f39742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f39743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s1 f39744d;

    public /* synthetic */ r1(s1 s1Var, n4 n4Var, Bundle bundle, int i10) {
        this.f39741a = i10;
        this.f39742b = n4Var;
        this.f39743c = bundle;
        this.f39744d = s1Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        switch (this.f39741a) {
            case 0:
                s1 s1Var = this.f39744d;
                s1Var.f39761a.V();
                return s1Var.f39761a.d0(this.f39743c, this.f39742b);
            default:
                s1 s1Var2 = this.f39744d;
                s1Var2.f39761a.V();
                return s1Var2.f39761a.d0(this.f39743c, this.f39742b);
        }
    }
}
