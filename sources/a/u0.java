package A;

import com.inmobi.media.C3215s;
import com.inmobi.media.Ib;
import com.inmobi.media.InterfaceC3333z5;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class u0 implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3333z5 f3197Y;
    public final /* synthetic */ Ib Z;

    public /* synthetic */ u0(InterfaceC3333z5 interfaceC3333z5, Ib ib, int i2) {
        this.X = i2;
        this.f3197Y = interfaceC3333z5;
        this.Z = ib;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                C3215s.b(this.f3197Y, this.Z);
                break;
            default:
                C3215s.d(this.f3197Y, this.Z);
                break;
        }
    }
}
