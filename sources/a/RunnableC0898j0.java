package A;

import com.inmobi.media.C3127m6;

/* JADX INFO: renamed from: A.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC0898j0 implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ C3127m6 f3179Y;

    public /* synthetic */ RunnableC0898j0(C3127m6 c3127m6, int i2) {
        this.X = i2;
        this.f3179Y = c3127m6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                C3127m6.e(this.f3179Y);
                break;
            case 1:
                C3127m6.b(this.f3179Y);
                break;
            case 2:
                C3127m6.c(this.f3179Y);
                break;
            default:
                C3127m6.d(this.f3179Y);
                break;
        }
    }
}
