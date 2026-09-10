package xj;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e0 extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f53843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f53844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f0 f53845e;

    public e0(f0 f0Var) {
        this.f53845e = f0Var;
        this.f53843c = f0Var.size();
        this.f53844d = f0Var.f53848c;
    }

    @Override // xj.b
    public final void a() {
        int i10 = this.f53843c;
        if (i10 == 0) {
            this.f53834a = 2;
            return;
        }
        f0 f0Var = this.f53845e;
        Object[] objArr = f0Var.f53846a;
        int i11 = this.f53844d;
        this.f53835b = objArr[i11];
        this.f53834a = 1;
        this.f53844d = (i11 + 1) % f0Var.f53847b;
        this.f53843c = i10 - 1;
    }
}
