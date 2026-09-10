package A;

import com.inmobi.media.C3159o6;

/* JADX INFO: renamed from: A.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC0904m0 implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ C3159o6 f3185Y;

    public /* synthetic */ RunnableC0904m0(C3159o6 c3159o6, int i2) {
        this.X = i2;
        this.f3185Y = c3159o6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                C3159o6.c(this.f3185Y);
                break;
            case 1:
                C3159o6.b(this.f3185Y);
                break;
            default:
                C3159o6.a(this.f3185Y);
                break;
        }
    }
}
