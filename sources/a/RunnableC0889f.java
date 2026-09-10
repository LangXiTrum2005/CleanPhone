package A;

import com.inmobi.media.Ab;

/* JADX INFO: renamed from: A.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC0889f implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Ab f3174Y;

    public /* synthetic */ RunnableC0889f(Ab ab, int i2) {
        this.X = i2;
        this.f3174Y = ab;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                Ab.a(this.f3174Y);
                break;
            default:
                Ab.b(this.f3174Y);
                break;
        }
    }
}
