package A;

import com.inmobi.media.AbstractC3294we;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class F0 implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ AbstractC3294we f3137Y;

    public /* synthetic */ F0(AbstractC3294we abstractC3294we, int i2) {
        this.X = i2;
        this.f3137Y = abstractC3294we;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                AbstractC3294we.c(this.f3137Y);
                break;
            case 1:
                AbstractC3294we.a(this.f3137Y);
                break;
            default:
                AbstractC3294we.b(this.f3137Y);
                break;
        }
    }
}
