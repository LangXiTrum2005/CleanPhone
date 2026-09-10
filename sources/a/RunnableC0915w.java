package A;

import com.inmobi.media.M1;

/* JADX INFO: renamed from: A.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC0915w implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ M1 f3200Y;

    public /* synthetic */ RunnableC0915w(M1 m1, int i2) {
        this.X = i2;
        this.f3200Y = m1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                M1.c(this.f3200Y);
                break;
            case 1:
                M1.g(this.f3200Y);
                break;
            case 2:
                M1.d(this.f3200Y);
                break;
            case 3:
                M1.f(this.f3200Y);
                break;
            default:
                M1.e(this.f3200Y);
                break;
        }
    }
}
