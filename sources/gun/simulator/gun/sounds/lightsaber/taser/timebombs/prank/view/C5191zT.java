package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerRequest;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.google.ads.mediation.pangle.PangleConstants;
import com.google.ads.mediation.pangle.PangleInitializer;
import com.google.ads.mediation.pangle.PangleRequestHelper;
import com.google.ads.mediation.pangle.renderer.PangleBannerAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MediationUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.zT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5191zT implements PangleInitializer.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f5326a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ PangleBannerAd d;

    public C5191zT(PangleBannerAd pangleBannerAd, Context context, String str, String str2) {
        this.d = pangleBannerAd;
        this.f5326a = context;
        this.b = str;
        this.c = str2;
    }

    @Override // com.google.ads.mediation.pangle.PangleInitializer.Listener
    public final void onInitializeError(AdError adError) {
        adError.toString();
        this.d.b.onFailure(adError);
    }

    @Override // com.google.ads.mediation.pangle.PangleInitializer.Listener
    public final void onInitializeSuccess() {
        PangleBannerAd pangleBannerAd = this.d;
        AdSize adSize = pangleBannerAd.f775a.getAdSize();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new AdSize(EnumC4719u30.WEBVIEW_ERROR_VALUE, 50));
        arrayList.add(new AdSize(300, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION));
        arrayList.add(new AdSize(728, 90));
        Context context = this.f5326a;
        AdSize adSizeFindClosestSize = MediationUtils.findClosestSize(context, adSize, arrayList);
        if (adSizeFindClosestSize == null) {
            AdError adErrorCreateAdapterError = PangleConstants.createAdapterError(102, PangleBannerAd.ERROR_MESSAGE_BANNER_SIZE_MISMATCH);
            adErrorCreateAdapterError.toString();
            pangleBannerAd.b.onFailure(adErrorCreateAdapterError);
            return;
        }
        pangleBannerAd.h = new FrameLayout(context);
        PAGBannerRequest pAGBannerRequestCreatePagBannerRequest = pangleBannerAd.e.createPagBannerRequest(new PAGBannerSize(adSizeFindClosestSize.getWidth(), adSizeFindClosestSize.getHeight()));
        String str = this.b;
        pAGBannerRequestCreatePagBannerRequest.setAdString(str);
        PangleRequestHelper.setWatermarkString(pAGBannerRequestCreatePagBannerRequest, str, pangleBannerAd.f775a);
        pangleBannerAd.d.loadBannerAd(this.c, pAGBannerRequestCreatePagBannerRequest, new C5103yT(this));
    }
}
