package A;

import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.profileinstaller.DeviceProfileWriter;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer;
import com.inmobi.media.GestureDetectorOnGestureListenerC3005ec;
import com.inmobi.media.M1;
import com.p004ironsource.AbstractC3389z;
import com.p004ironsource.id;
import com.startapp.sdk.ads.banner.BannerRequest;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandard;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.internal.i7;
import java.io.Serializable;
import java.util.Collection;

/* JADX INFO: renamed from: A.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC0914v implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ int f3198Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object e0;

    public /* synthetic */ RunnableC0914v(Object obj, int i2, Object obj2, int i3) {
        this.X = i3;
        this.Z = obj;
        this.f3198Y = i2;
        this.e0 = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.media3.exoplayer.drm.DrmSessionEventListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.google.android.exoplayer2.drm.DrmSessionEventListener, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                M1.a((M1) this.Z, (GestureDetectorOnGestureListenerC3005ec) this.e0, this.f3198Y);
                break;
            case 1:
                DrmSessionEventListener.EventDispatcher eventDispatcher = (DrmSessionEventListener.EventDispatcher) this.Z;
                int i2 = eventDispatcher.f6224a;
                ?? r2 = this.e0;
                r2.getClass();
                r2.D(i2, eventDispatcher.f6225b, this.f3198Y);
                break;
            case 2:
                ((DeviceProfileWriter) this.Z).f7967b.a(this.f3198Y, (Serializable) this.e0);
                break;
            case 3:
                ((MaxAdPlacer) this.Z).a(this.f3198Y, (Collection) this.e0);
                break;
            case 4:
                com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher eventDispatcher2 = (com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher) this.Z;
                int i3 = eventDispatcher2.f17476a;
                ?? r3 = this.e0;
                r3.getClass();
                r3.M(i3, eventDispatcher2.f17477b, this.f3198Y);
                break;
            case 5:
                id.a((id) this.Z, this.f3198Y, (String) this.e0);
                break;
            case 6:
                AbstractC3389z.a((AbstractC3389z) this.Z, this.f3198Y, (String) this.e0);
                break;
            case 7:
                ((BannerRequest) this.Z).lambda$loadExternalAd$4((BannerRequest.Callback) this.e0, this.f3198Y);
                break;
            case 8:
                ((BannerStandard) this.Z).lambda$loadExternalInline$1((i7) this.e0, this.f3198Y);
                break;
            default:
                ((StartAppAd) this.Z).a((AdEventListener) this.e0, this.f3198Y);
                break;
        }
    }

    public /* synthetic */ RunnableC0914v(Object obj, Object obj2, int i2, int i3) {
        this.X = i3;
        this.Z = obj;
        this.e0 = obj2;
        this.f3198Y = i2;
    }
}
