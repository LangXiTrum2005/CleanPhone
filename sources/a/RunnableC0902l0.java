package A;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.media.C3159o6;

/* JADX INFO: renamed from: A.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC0902l0 implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ C3159o6 f3183Y;
    public final /* synthetic */ AdMetaInfo Z;

    public /* synthetic */ RunnableC0902l0(C3159o6 c3159o6, AdMetaInfo adMetaInfo, int i2) {
        this.X = i2;
        this.f3183Y = c3159o6;
        this.Z = adMetaInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                C3159o6.b(this.f3183Y, this.Z);
                break;
            default:
                C3159o6.a(this.f3183Y, this.Z);
                break;
        }
    }
}
