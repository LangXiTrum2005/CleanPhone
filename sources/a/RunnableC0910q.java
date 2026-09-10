package A;

import com.inmobi.media.E6;

/* JADX INFO: renamed from: A.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC0910q implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ E6 f3191Y;

    public /* synthetic */ RunnableC0910q(E6 e6, int i2) {
        this.X = i2;
        this.f3191Y = e6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                E6.b(this.f3191Y);
                break;
            default:
                E6.a(this.f3191Y);
                break;
        }
    }
}
