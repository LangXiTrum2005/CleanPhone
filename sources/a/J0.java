package A;

import com.inmobi.media.C3298x2;
import com.inmobi.media.InterfaceC3333z5;
import com.inmobi.media.Z1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class J0 implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ String f3143Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ InterfaceC3333z5 e0;
    public final /* synthetic */ Z1 f0;

    public /* synthetic */ J0(String str, boolean z2, InterfaceC3333z5 interfaceC3333z5, Z1 z1, int i2) {
        this.X = i2;
        this.f3143Y = str;
        this.Z = z2;
        this.e0 = interfaceC3333z5;
        this.f0 = z1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                C3298x2.a(this.f3143Y, this.Z, this.e0, this.f0);
                break;
            default:
                C3298x2.b(this.f3143Y, this.Z, this.e0, this.f0);
                break;
        }
    }
}
