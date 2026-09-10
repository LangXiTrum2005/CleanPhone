package A;

import com.inmobi.media.C3270v6;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C0 implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ C3270v6 f3131Y;

    public /* synthetic */ C0(C3270v6 c3270v6, int i2) {
        this.X = i2;
        this.f3131Y = c3270v6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                C3270v6.a(this.f3131Y);
                break;
            case 1:
                C3270v6.b(this.f3131Y);
                break;
            default:
                C3270v6.c(this.f3131Y);
                break;
        }
    }
}
