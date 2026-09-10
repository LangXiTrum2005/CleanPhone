package A;

import com.inmobi.media.AbstractC3294we;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class G0 implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ AbstractC3294we f3139Y;
    public final /* synthetic */ Map Z;

    public /* synthetic */ G0(AbstractC3294we abstractC3294we, Map map, int i2) {
        this.X = i2;
        this.f3139Y = abstractC3294we;
        this.Z = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                AbstractC3294we.b(this.f3139Y, this.Z);
                break;
            default:
                AbstractC3294we.a(this.f3139Y, this.Z);
                break;
        }
    }
}
