package t;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50289a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f50290b;

    public f(l lVar, o oVar) {
        this.f50290b = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f50289a) {
            case 0:
                t tVar = this.f50290b.f50295a;
                if (tVar.f50306e == null) {
                    tVar.f50306e = new q();
                }
                tVar.f50306e.getClass();
                break;
            default:
                t tVar2 = this.f50290b.f50295a;
                if (tVar2.f50306e == null) {
                    tVar2.f50306e = new q();
                }
                tVar2.f50306e.B();
                break;
        }
    }

    public f(l lVar) {
        this.f50290b = lVar;
    }
}
