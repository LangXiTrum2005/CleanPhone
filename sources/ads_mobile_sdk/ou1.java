package ads_mobile_sdk;

import android.view.View;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.coreopsis;
import saneness.igo;

/* JADX INFO: loaded from: classes.dex */
public final class ou1 implements MediationBannerListener {
    public final /* synthetic */ coreopsis a;
    public final /* synthetic */ su1 b;
    public final /* synthetic */ yb0 c;

    public ou1(yb0 yb0Var, fx2 fx2Var, su1 su1Var) {
        this.a = fx2Var;
        this.b = su1Var;
        this.c = yb0Var;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdClicked(MediationBannerAdapter adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.c.d();
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdClosed(MediationBannerAdapter adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.c.b();
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdFailedToLoad(MediationBannerAdapter adapter, int i) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        fx2 fx2Var = (fx2) this.a;
        String errorMessage = fx2Var.c.a(i);
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        fx2Var.a(new AdError(i, errorMessage, AdError.UNDEFINED_DOMAIN));
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdLeftApplication(MediationBannerAdapter adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.c.a();
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdLoaded(MediationBannerAdapter adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        View bannerView = adapter.getBannerView();
        if (bannerView == null) {
            ((fx2) this.a).a(new AdError(0, "Adapter returned a non-null View for getBannerView() after invoking the onAdLoaded() callback.", AdError.GOOGLE_MOBILE_ADS_DOMAIN));
        } else {
            su1 su1Var = this.b;
            su1Var.getClass();
            Intrinsics.checkNotNullParameter(bannerView, "<set-?>");
            su1Var.b = bannerView;
            ((fx2) this.a).a();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdOpened(MediationBannerAdapter adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.c.c();
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAppEvent(MediationBannerAdapter adapter, String name, String data) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(data, "data");
        yb0 yb0Var = this.c;
        yb0Var.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(data, "data");
        igo igoVarA = yb0Var.a();
        if (igoVarA != null) {
            hy2 hy2Var = (hy2) igoVarA;
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(data, "data");
            saran saranVar = hy2Var.a;
            yx2 block = new yx2(hy2Var, name, data, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdFailedToLoad(MediationBannerAdapter adapter, AdError adError) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(adError, "adError");
        ((fx2) this.a).a(adError);
    }
}
