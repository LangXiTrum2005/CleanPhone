package A;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.media.R1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class B implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ R1 f3128Y;
    public final /* synthetic */ AdMetaInfo Z;

    public /* synthetic */ B(R1 r1, AdMetaInfo adMetaInfo, int i2) {
        this.X = i2;
        this.f3128Y = r1;
        this.Z = adMetaInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                R1.b(this.f3128Y, this.Z);
                break;
            default:
                R1.a(this.f3128Y, this.Z);
                break;
        }
    }
}
