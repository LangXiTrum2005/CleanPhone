package p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a2 f47841b;

    public /* synthetic */ w1(a2 a2Var, int i10) {
        this.f47840a = i10;
        this.f47841b = a2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f47840a) {
            case 0:
                n1 n1Var = this.f47841b.f47596c;
                if (n1Var != null) {
                    n1Var.setListSelectionHidden(true);
                    n1Var.requestLayout();
                }
                break;
            default:
                a2 a2Var = this.f47841b;
                n1 n1Var2 = a2Var.f47596c;
                if (n1Var2 != null && n1Var2.isAttachedToWindow() && a2Var.f47596c.getCount() > a2Var.f47596c.getChildCount() && a2Var.f47596c.getChildCount() <= a2Var.f47605m) {
                    a2Var.f47617y.setInputMethodMode(2);
                    a2Var.show();
                    break;
                }
                break;
        }
    }
}
