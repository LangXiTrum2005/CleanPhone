package A;

import com.inmobi.media.V8;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class J implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ V8 f3142Y;

    public /* synthetic */ J(V8 v8, int i2) {
        this.X = i2;
        this.f3142Y = v8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                V8.c(this.f3142Y);
                break;
            case 1:
                V8.b(this.f3142Y);
                break;
            default:
                V8.a(this.f3142Y);
                break;
        }
    }
}
