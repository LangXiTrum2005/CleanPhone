package androidx.fragment.app;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4466b;

    public /* synthetic */ s(Object obj, int i10) {
        this.f4465a = i10;
        this.f4466b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4465a) {
            case 0:
                w wVar = (w) this.f4466b;
                wVar.f4490d.onDismiss(wVar.l);
                break;
            case 1:
                r rVar = (r) this.f4466b;
                if (!rVar.f4456b.isEmpty()) {
                    rVar.e();
                }
                break;
            default:
                ((g1) this.f4466b).z(true);
                break;
        }
    }
}
