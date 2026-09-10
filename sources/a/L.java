package A;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.media.V8;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class L implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ V8 f3146Y;
    public final /* synthetic */ AdMetaInfo Z;

    public /* synthetic */ L(V8 v8, AdMetaInfo adMetaInfo, int i2) {
        this.X = i2;
        this.f3146Y = v8;
        this.Z = adMetaInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                V8.b(this.f3146Y, this.Z);
                break;
            default:
                V8.a(this.f3146Y, this.Z);
                break;
        }
    }
}
