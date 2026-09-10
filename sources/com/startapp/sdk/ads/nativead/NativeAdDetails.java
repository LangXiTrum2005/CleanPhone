package com.startapp.sdk.ads.nativead;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.startio.adsession.AdSession;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdDetails;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.ag;
import com.startapp.sdk.internal.e9;
import com.startapp.sdk.internal.h0;
import com.startapp.sdk.internal.ik;
import com.startapp.sdk.internal.k2;
import com.startapp.sdk.internal.vd;
import com.startapp.sdk.internal.w6;
import com.startapp.sdk.internal.zf;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class NativeAdDetails implements NativeAdInterface {
    private static final float DEFAULT_RATING = 5.0f;
    private final AdDetails adDetails;
    private String adTag;
    private NativeAdDisplayListener displayListener;
    private Bitmap imgBitmap;
    private vd omAdSession;
    private Bitmap secondaryImgBitmap;
    private ik viewabilityRunner;
    private boolean impressionSent = false;
    private boolean hiddenSent = false;
    private WeakReference<View> nativeAdView = new WeakReference<>(null);
    private final View.OnAttachStateChangeListener onAttachStateChangeListener = new h(this);
    private final zf impressionListener = new b(this);

    public NativeAdDetails(AdDetails adDetails) {
        this.adDetails = adDetails;
    }

    private void associateWithImpression(View view) {
        this.nativeAdView = new WeakReference<>(view);
        view.addOnAttachStateChangeListener(this.onAttachStateChangeListener);
        if (view.isAttachedToWindow()) {
            this.onAttachStateChangeListener.onViewAttachedToWindow(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishOmAdSession() {
        vd vdVar = this.omAdSession;
        if (vdVar != null) {
            AdSession adSession = vdVar.f41579a;
            if (adSession != null) {
                adSession.finish();
            }
            new Handler(Looper.getMainLooper()).postDelayed(new c0.a(new Object[]{this.omAdSession, this.nativeAdView.get()}, 27), MetaData.E().N());
            this.omAdSession = null;
        }
    }

    private long getImpressionDelayMillis() {
        AdDetails adDetails = getAdDetails();
        return (adDetails == null || adDetails.i() == null) ? TimeUnit.SECONDS.toMillis(MetaData.E().z()) : TimeUnit.SECONDS.toMillis(adDetails.i().longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleClickOnView(View view) {
        sendClickImpl(view.getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$finishOmAdSession$0(Object[] objArr) {
        if (objArr[0] != null) {
            objArr[0] = null;
        }
        if (objArr[1] != null) {
            objArr[1] = null;
        }
    }

    private void sendClickImpl(Context context) {
        int i2 = g.f40511a[getCampaignAction().ordinal()];
        if (i2 == 1) {
            AdPreferences.Placement placement = AdPreferences.Placement.INAPP_FULL_SCREEN;
            boolean zA = h0.a(context);
            if (!this.adDetails.D() || zA) {
                h0.a(context, this.adDetails.h(), this.adDetails.y(), new TrackingParams(this.adTag), this.adDetails.E() && !zA, false);
            } else {
                h0.a(context, this.adDetails.h(), this.adDetails.y(), this.adDetails.s(), new TrackingParams(this.adTag), AdsCommonMetaData.k().y(), AdsCommonMetaData.k().x(), this.adDetails.E(), this.adDetails.F(), false, null);
            }
        } else if (i2 == 2) {
            h0.a(getPackageName(), this.adDetails.o(), this.adDetails.h(), context, new TrackingParams(this.adTag));
        }
        NativeAdDisplayListener nativeAdDisplayListener = this.displayListener;
        if (nativeAdDisplayListener != null) {
            nativeAdDisplayListener.adClicked(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startCheckingVisibility() {
        if (this.viewabilityRunner != null || this.impressionSent) {
            return;
        }
        View view = this.nativeAdView.get();
        if (view == null) {
            NativeAdDisplayListener nativeAdDisplayListener = this.displayListener;
            if (nativeAdDisplayListener != null) {
                nativeAdDisplayListener.adNotDisplayed(this);
                return;
            }
            return;
        }
        ag agVar = new ag(view.getContext(), AdPreferences.Placement.INAPP_NATIVE, getAdDetails() != null ? getAdDetails().t() : null, new TrackingParams(this.adTag), getImpressionDelayMillis(), false, this.impressionListener);
        Context context = view.getContext();
        String[] strArrC = getAdDetails() != null ? getAdDetails().c() : null;
        TrackingParams trackingParams = new TrackingParams(this.adTag);
        if (context != null && strArrC != null) {
            e9.a(context, Arrays.asList(strArrC), trackingParams);
        }
        ik ikVar = new ik(this.nativeAdView, agVar, BannerMetaData.c().a());
        this.viewabilityRunner = ikVar;
        ikVar.f41121c = new f(this);
        if (ikVar.c()) {
            ikVar.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startOmAdSession() {
        View view;
        AdDetails adDetails;
        List listB;
        if (!MetaData.E().j0() || (view = this.nativeAdView.get()) == null || (adDetails = this.adDetails) == null || (listB = adDetails.b()) == null) {
            return;
        }
        vd vdVar = new vd(view.getContext(), listB, false);
        this.omAdSession = vdVar;
        AdSession adSession = vdVar.f41579a;
        if (adSession != null) {
            adSession.start();
            AdSession adSession2 = this.omAdSession.f41579a;
            if (adSession2 != null) {
                adSession2.registerAdView(view);
            }
            vd vdVar2 = this.omAdSession;
            if (vdVar2.f41580b != null && vdVar2.f41582e.compareAndSet(false, true)) {
                vdVar2.f41580b.loaded();
            }
            this.omAdSession.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopCheckingVisibility() {
        ik ikVar = this.viewabilityRunner;
        if (ikVar != null) {
            ikVar.a();
            this.viewabilityRunner = null;
        }
    }

    public void finalize() throws Throwable {
        super.finalize();
        unregisterView();
    }

    public AdDetails getAdDetails() {
        return this.adDetails;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public String getCallToAction() {
        String strF;
        AdDetails adDetails = this.adDetails;
        return (adDetails == null || (strF = adDetails.f()) == null) ? "" : strF;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public StartAppNativeAd.CampaignAction getCampaignAction() {
        StartAppNativeAd.CampaignAction campaignAction = StartAppNativeAd.CampaignAction.OPEN_MARKET;
        AdDetails adDetails = this.adDetails;
        return (adDetails == null || !adDetails.C()) ? campaignAction : StartAppNativeAd.CampaignAction.LAUNCH_APP;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public String getCategory() {
        String strG;
        AdDetails adDetails = this.adDetails;
        return (adDetails == null || (strG = adDetails.g()) == null) ? "" : strG;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public String getDescription() {
        String strJ;
        AdDetails adDetails = this.adDetails;
        return (adDetails == null || (strJ = adDetails.j()) == null) ? "" : strJ;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public String getErid() {
        AdDetails adDetails = this.adDetails;
        if (adDetails != null) {
            return adDetails.k();
        }
        return null;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public String getEridUrl() {
        AdDetails adDetails = this.adDetails;
        if (adDetails != null) {
            return adDetails.l();
        }
        return null;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public Bitmap getImageBitmap() {
        return this.imgBitmap;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public String getImageUrl() {
        AdDetails adDetails = this.adDetails;
        if (adDetails != null) {
            return adDetails.m();
        }
        return null;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public String getInstalls() {
        String strN;
        AdDetails adDetails = this.adDetails;
        return (adDetails == null || (strN = adDetails.n()) == null) ? "" : strN;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public String getPackageName() {
        String strS;
        AdDetails adDetails = this.adDetails;
        return (adDetails == null || (strS = adDetails.s()) == null) ? "" : strS;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public float getRating() {
        AdDetails adDetails = this.adDetails;
        return adDetails != null ? adDetails.u() : DEFAULT_RATING;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public Bitmap getSecondaryImageBitmap() {
        return this.secondaryImgBitmap;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public String getSecondaryImageUrl() {
        AdDetails adDetails = this.adDetails;
        if (adDetails != null) {
            return adDetails.v();
        }
        return null;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public String getTitle() {
        String strX;
        AdDetails adDetails = this.adDetails;
        return (adDetails == null || (strX = adDetails.x()) == null) ? "" : strX;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public boolean isApp() {
        AdDetails adDetails = this.adDetails;
        if (adDetails != null) {
            return adDetails.B();
        }
        return true;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public boolean isBelowMinCPM() {
        AdDetails adDetails = this.adDetails;
        return adDetails != null && adDetails.q();
    }

    public void loadImages(Context context, Runnable runnable) {
        c cVar = new c(this, runnable);
        new k2(context, getImageUrl(), cVar, 0).a();
        new k2(context, getSecondaryImageUrl(), cVar, 1).a();
    }

    public void onImpressionSent(String str) {
        this.impressionSent = true;
        w6.a("onShow", this.displayListener != null, str, null);
        NativeAdDisplayListener nativeAdDisplayListener = this.displayListener;
        if (nativeAdDisplayListener != null) {
            nativeAdDisplayListener.adDisplayed(this);
        }
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public void registerViewForInteraction(View view) {
        associateWithImpression(view);
        this.nativeAdView.get().setOnClickListener(new d(this));
    }

    public void setAdTag(String str) {
        this.adTag = str;
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.imgBitmap = bitmap;
    }

    public void setSecondaryImageBitmap(Bitmap bitmap) {
        this.secondaryImgBitmap = bitmap;
    }

    public String toString() {
        return super.toString();
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public void unregisterView() {
        stopCheckingVisibility();
        finishOmAdSession();
        View view = this.nativeAdView.get();
        this.nativeAdView.clear();
        if (view != null) {
            view.removeOnAttachStateChangeListener(this.onAttachStateChangeListener);
        }
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public void registerViewForInteraction(View view, List<View> list) {
        registerViewForInteraction(view, list, null);
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public void registerViewForInteraction(View view, List<View> list, NativeAdDisplayListener nativeAdDisplayListener) {
        if (list != null && !list.isEmpty() && this.nativeAdView.get() == null) {
            e eVar = new e(this);
            Iterator<View> it = list.iterator();
            while (it.hasNext()) {
                it.next().setOnClickListener(eVar);
            }
            associateWithImpression(view);
        } else {
            registerViewForInteraction(view);
        }
        this.displayListener = nativeAdDisplayListener;
    }
}
