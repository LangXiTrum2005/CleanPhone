package A;

import com.applovin.impl.C0937g0;
import com.applovin.impl.t2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.inmobi.media.C3101kc;
import com.inmobi.media.C3117lc;
import com.inmobi.media.C3298x2;
import com.inmobi.media.Cc;
import com.inmobi.media.D7;
import com.inmobi.media.F7;
import com.inmobi.media.InterfaceC3333z5;
import com.p004ironsource.ml;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: renamed from: A.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC0899k implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ boolean f3180Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object e0;

    public /* synthetic */ RunnableC0899k(Object obj, Object obj2, boolean z2, int i2) {
        this.X = i2;
        this.Z = obj;
        this.e0 = obj2;
        this.f3180Y = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                D7.a((D7) this.Z, (F7) this.e0, this.f3180Y);
                break;
            case 1:
                C3101kc.a((C3117lc) this.Z, (Cc) this.e0, this.f3180Y);
                break;
            case 2:
                C3298x2.c((String) this.Z, this.f3180Y, (InterfaceC3333z5) this.e0);
                break;
            case 3:
                ((C0937g0) this.Z).a(this.f3180Y, (Runnable) this.e0);
                break;
            case 4:
                t2.a(this.f3180Y, (MaxAdRequestListener) this.Z, (String) this.e0);
                break;
            case 5:
                t2.a(this.f3180Y, (MaxAdRevenueListener) this.Z, (MaxAd) this.e0);
                break;
            case 6:
                ml.a(this.f3180Y, (LevelPlayAdInfo) this.Z, (ml) this.e0);
                break;
            default:
                ((com.ironsource.sdk.controller.v.r) this.Z).a(this.f3180Y, (String) this.e0);
                break;
        }
    }

    public /* synthetic */ RunnableC0899k(Object obj, boolean z2, Object obj2, int i2) {
        this.X = i2;
        this.Z = obj;
        this.f3180Y = z2;
        this.e0 = obj2;
    }

    public /* synthetic */ RunnableC0899k(boolean z2, Object obj, Object obj2, int i2) {
        this.X = i2;
        this.f3180Y = z2;
        this.Z = obj;
        this.e0 = obj2;
    }
}
