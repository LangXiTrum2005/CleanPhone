package A;

import com.inmobi.media.C3039ge;

/* JADX INFO: renamed from: A.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC0881b implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ byte f3166Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ RunnableC0881b(Object obj, byte b2, int i2) {
        this.X = i2;
        this.Z = obj;
        this.f3166Y = b2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                com.inmobi.media.A0.a((com.inmobi.media.B0) this.Z, this.f3166Y);
                break;
            default:
                C3039ge.a((C3039ge) this.Z, this.f3166Y);
                break;
        }
    }
}
