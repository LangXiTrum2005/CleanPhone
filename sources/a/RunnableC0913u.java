package A;

import com.inmobi.media.S0;

/* JADX INFO: renamed from: A.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC0913u implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ S0 f3196Y;

    public /* synthetic */ RunnableC0913u(S0 s0, int i2) {
        this.X = i2;
        this.f3196Y = s0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                com.inmobi.media.K0.a(this.f3196Y);
                break;
            case 1:
                com.inmobi.media.K0.b(this.f3196Y);
                break;
            default:
                S0.e(this.f3196Y);
                break;
        }
    }
}
