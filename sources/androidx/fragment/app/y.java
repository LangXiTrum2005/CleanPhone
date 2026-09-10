package androidx.fragment.app;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Fragment f4512b;

    public /* synthetic */ y(Fragment fragment, int i10) {
        this.f4511a = i10;
        this.f4512b = fragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4511a) {
            case 0:
                this.f4512b.startPostponedEnterTransition();
                break;
            default:
                this.f4512b.callStartTransitionListener(false);
                break;
        }
    }
}
