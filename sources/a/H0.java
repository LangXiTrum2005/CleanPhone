package A;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.AbstractC3294we;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class H0 implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ AbstractC3294we f3140Y;
    public final /* synthetic */ InMobiAdRequestStatus Z;

    public /* synthetic */ H0(AbstractC3294we abstractC3294we, InMobiAdRequestStatus inMobiAdRequestStatus, int i2) {
        this.X = i2;
        this.f3140Y = abstractC3294we;
        this.Z = inMobiAdRequestStatus;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                AbstractC3294we.a(this.f3140Y, this.Z);
                break;
            default:
                AbstractC3294we.b(this.f3140Y, this.Z);
                break;
        }
    }
}
