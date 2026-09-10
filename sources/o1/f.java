package o1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f47042a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar) {
        super("ExoPlayer:SimpleDecoder");
        this.f47042a = gVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        do {
            try {
            } catch (InterruptedException e10) {
                throw new IllegalStateException(e10);
            }
        } while (this.f47042a.g());
    }
}
