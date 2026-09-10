package A;

import com.inmobi.media.C3270v6;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class A0 implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ C3270v6 f3127Y;
    public final /* synthetic */ String Z;

    public /* synthetic */ A0(C3270v6 c3270v6, String str, int i2) {
        this.X = i2;
        this.f3127Y = c3270v6;
        this.Z = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                C3270v6.a(this.f3127Y, this.Z);
                break;
            case 1:
                C3270v6.b(this.f3127Y, this.Z);
                break;
            default:
                C3270v6.c(this.f3127Y, this.Z);
                break;
        }
    }
}
