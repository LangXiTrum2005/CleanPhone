package A;

import com.inmobi.media.T7;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class G implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ T7 f3138Y;

    public /* synthetic */ G(T7 t7, int i2) {
        this.X = i2;
        this.f3138Y = t7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                T7.b(this.f3138Y);
                break;
            case 1:
                T7.a(this.f3138Y);
                break;
            default:
                T7.d(this.f3138Y);
                break;
        }
    }
}
