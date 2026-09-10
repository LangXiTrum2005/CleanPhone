package A;

import androidx.collection.ArrayMap;
import androidx.fragment.app.FragmentTransition;
import androidx.fragment.app.SpecialEffectsController;
import com.applovin.impl.sdk.EventServiceImpl;
import com.applovin.impl.t2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.inmobi.media.C2934a9;
import com.inmobi.media.C2968c9;
import com.inmobi.media.C3114l9;
import com.vungle.ads.internal.network.TpatRequest;
import com.vungle.ads.internal.network.TpatSender;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class U implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ boolean f3159Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object e0;
    public final /* synthetic */ Object f0;

    public /* synthetic */ U(SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2, boolean z2, ArrayMap arrayMap) {
        this.X = 1;
        this.Z = operation;
        this.e0 = operation2;
        this.f3159Y = z2;
        this.f0 = arrayMap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                C2934a9.a((C2968c9) this.Z, this.f3159Y, (C2934a9) this.e0, (C3114l9) this.f0);
                break;
            case 1:
                ArrayMap arrayMap = (ArrayMap) this.f0;
                SpecialEffectsController.Operation operation = (SpecialEffectsController.Operation) this.Z;
                SpecialEffectsController.Operation operation2 = (SpecialEffectsController.Operation) this.e0;
                FragmentTransition.a(operation.f5193c, operation2.f5193c, this.f3159Y, arrayMap);
                break;
            case 2:
                ((EventServiceImpl) this.Z).a((String) this.e0, (Map) this.f0, this.f3159Y);
                break;
            case 3:
                String str = (String) this.e0;
                t2.a(this.f3159Y, (MaxAdListener) this.Z, str, (MaxError) this.f0);
                break;
            case 4:
                MaxAd maxAd = (MaxAd) this.f0;
                t2.a(this.f3159Y, (MaxNativeAdListener) this.Z, (MaxNativeAdView) this.e0, maxAd);
                break;
            case 5:
                MaxAd maxAd2 = (MaxAd) this.e0;
                t2.a(this.f3159Y, (MaxAdListener) this.Z, maxAd2, (MaxError) this.f0);
                break;
            case 6:
                String str2 = (String) this.e0;
                t2.a(this.f3159Y, (MaxNativeAdListener) this.Z, str2, (MaxError) this.f0);
                break;
            case 7:
                MaxAd maxAd3 = (MaxAd) this.e0;
                MaxAd maxAd4 = (MaxAd) this.f0;
                t2.a(this.f3159Y, (MaxAdExpirationListener) this.Z, maxAd3, maxAd4);
                break;
            case 8:
                t2.a(this.f3159Y, (MaxRewardedAdListener) this.Z, (MaxAd) this.e0, (MaxReward) this.f0);
                break;
            case 9:
                ((com.ironsource.sdk.controller.v.r) this.Z).a(this.f3159Y, (String) this.e0, (String) this.f0);
                break;
            default:
                TpatSender.m3225sendTpat$lambda1((TpatSender) this.Z, (TpatRequest) this.e0, (String) this.f0, this.f3159Y);
                break;
        }
    }

    public /* synthetic */ U(Object obj, Object obj2, Object obj3, boolean z2, int i2) {
        this.X = i2;
        this.Z = obj;
        this.e0 = obj2;
        this.f0 = obj3;
        this.f3159Y = z2;
    }

    public /* synthetic */ U(Object obj, boolean z2, Object obj2, Object obj3, int i2) {
        this.X = i2;
        this.Z = obj;
        this.f3159Y = z2;
        this.e0 = obj2;
        this.f0 = obj3;
    }

    public /* synthetic */ U(boolean z2, Object obj, Object obj2, Object obj3, int i2) {
        this.X = i2;
        this.f3159Y = z2;
        this.Z = obj;
        this.e0 = obj2;
        this.f0 = obj3;
    }
}
