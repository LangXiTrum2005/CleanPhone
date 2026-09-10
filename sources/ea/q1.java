package ea;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class q1 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f39724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f39725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f39726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s1 f39727e;

    public /* synthetic */ q1(s1 s1Var, String str, String str2, String str3, int i10) {
        this.f39723a = i10;
        this.f39724b = str;
        this.f39725c = str2;
        this.f39726d = str3;
        this.f39727e = s1Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f39723a) {
            case 0:
                s1 s1Var = this.f39727e;
                s1Var.f39761a.V();
                m mVar = s1Var.f39761a.f39373c;
                e4.T(mVar);
                return mVar.E1(this.f39724b, this.f39725c, this.f39726d);
            case 1:
                s1 s1Var2 = this.f39727e;
                s1Var2.f39761a.V();
                m mVar2 = s1Var2.f39761a.f39373c;
                e4.T(mVar2);
                return mVar2.E1(this.f39724b, this.f39725c, this.f39726d);
            case 2:
                s1 s1Var3 = this.f39727e;
                s1Var3.f39761a.V();
                m mVar3 = s1Var3.f39761a.f39373c;
                e4.T(mVar3);
                return mVar3.I1(this.f39724b, this.f39725c, this.f39726d);
            default:
                s1 s1Var4 = this.f39727e;
                s1Var4.f39761a.V();
                m mVar4 = s1Var4.f39761a.f39373c;
                e4.T(mVar4);
                return mVar4.I1(this.f39724b, this.f39725c, this.f39726d);
        }
    }
}
