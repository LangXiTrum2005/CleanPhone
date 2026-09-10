package A;

import com.applovin.impl.c3;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;
import com.inmobi.media.C3298x2;
import com.inmobi.media.InterfaceC3333z5;
import com.inmobi.media.Z1;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class K0 implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ boolean f3145Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object e0;
    public final /* synthetic */ Object f0;
    public final /* synthetic */ Object g0;

    public /* synthetic */ K0(Object obj, Object obj2, boolean z2, Object obj3, Object obj4, int i2) {
        this.X = i2;
        this.Z = obj;
        this.e0 = obj2;
        this.f3145Y = z2;
        this.f0 = obj3;
        this.g0 = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                C3298x2.a((String) this.Z, (Map) this.e0, this.f3145Y, (InterfaceC3333z5) this.f0, (Z1) this.g0);
                break;
            default:
                ((MaxFullscreenAdImpl.b) this.Z).a((MaxAd) this.e0, this.f3145Y, (c3) this.f0, (MaxError) this.g0);
                break;
        }
    }
}
