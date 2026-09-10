package A;

import com.inmobi.media.C3270v6;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class B0 implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ C3270v6 f3129Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ String e0;

    public /* synthetic */ B0(C3270v6 c3270v6, String str, String str2, int i2) {
        this.X = i2;
        this.f3129Y = c3270v6;
        this.Z = str;
        this.e0 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                C3270v6.b(this.f3129Y, this.Z, this.e0);
                break;
            case 1:
                C3270v6.f(this.f3129Y, this.Z, this.e0);
                break;
            case 2:
                C3270v6.d(this.f3129Y, this.Z, this.e0);
                break;
            case 3:
                C3270v6.e(this.f3129Y, this.Z, this.e0);
                break;
            case 4:
                C3270v6.a(this.f3129Y, this.Z, this.e0);
                break;
            default:
                C3270v6.c(this.f3129Y, this.Z, this.e0);
                break;
        }
    }
}
