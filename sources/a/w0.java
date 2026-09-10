package A;

import com.inmobi.media.C3233t1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class w0 implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ String f3201Y;

    public /* synthetic */ w0(String str, int i2) {
        this.X = i2;
        this.f3201Y = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                C3233t1.b(this.f3201Y);
                break;
            default:
                com.mbridge.msdk.config.component.common.file.a.k(this.f3201Y);
                break;
        }
    }
}
