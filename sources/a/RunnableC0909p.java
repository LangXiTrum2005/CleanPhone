package A;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.media.E1;

/* JADX INFO: renamed from: A.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC0909p implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ E1 f3189Y;
    public final /* synthetic */ AdMetaInfo Z;

    public /* synthetic */ RunnableC0909p(E1 e1, AdMetaInfo adMetaInfo, int i2) {
        this.X = i2;
        this.f3189Y = e1;
        this.Z = adMetaInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                E1.b(this.f3189Y, this.Z);
                break;
            default:
                E1.a(this.f3189Y, this.Z);
                break;
        }
    }
}
