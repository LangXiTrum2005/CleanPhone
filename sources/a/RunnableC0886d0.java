package A;

import com.inmobi.media.C3114l9;

/* JADX INFO: renamed from: A.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC0886d0 implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ C3114l9 f3171Y;

    public /* synthetic */ RunnableC0886d0(C3114l9 c3114l9, int i2) {
        this.X = i2;
        this.f3171Y = c3114l9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                C3114l9.c(this.f3171Y);
                break;
            case 1:
                C3114l9.b(this.f3171Y);
                break;
            case 2:
                C3114l9.a(this.f3171Y);
                break;
            default:
                C3114l9.e(this.f3171Y);
                break;
        }
    }
}
