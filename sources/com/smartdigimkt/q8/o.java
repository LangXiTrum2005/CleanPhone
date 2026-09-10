package com.smartdigimkt.q8;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.smartdigimkt.sdk.api.AdError;
import com.smartdigimkt.sdk.api.format.SDMAd;
import com.smartdigimkt.sdk.api.format.SDMLossInfo;
import com.smartdigimkt.sdk.api.format.SDMNativeAd;
import com.smartdigimkt.sdk.api.format.SDMNativeAdListener;
import com.smartdigimkt.sdk.api.format.SDMNativeAdMediaViewListener;
import com.smartdigimkt.sdk.api.format.SDMWinInfo;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class o implements SDMNativeAd {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    com.smartdigimkt.y4.f f37967Y;
    com.smartdigimkt.y4.a Z;
    private WeakReference<View> f0;
    private final d X = new com.smartdigimkt.q8.a();
    boolean e0 = false;

    public class a implements SDMNativeAdMediaViewListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SDMNativeAdMediaViewListener f37968a;

        public a(SDMNativeAdMediaViewListener sDMNativeAdMediaViewListener) {
            this.f37968a = sDMNativeAdMediaViewListener;
        }

        @Override // com.smartdigimkt.sdk.api.format.SDMNativeAdMediaViewListener
        public void onProgressUpdate(long j, long j2) {
            SDMNativeAdMediaViewListener sDMNativeAdMediaViewListener = this.f37968a;
            if (sDMNativeAdMediaViewListener != null) {
                sDMNativeAdMediaViewListener.onProgressUpdate(j, j2);
            }
        }

        @Override // com.smartdigimkt.sdk.api.format.SDMNativeAdMediaViewListener
        public void onVideoAdComplete() {
            SDMNativeAdMediaViewListener sDMNativeAdMediaViewListener = this.f37968a;
            if (sDMNativeAdMediaViewListener != null) {
                sDMNativeAdMediaViewListener.onVideoAdComplete();
            }
        }

        @Override // com.smartdigimkt.sdk.api.format.SDMNativeAdMediaViewListener
        public void onVideoAdStartPlay(long j) {
            SDMNativeAdMediaViewListener sDMNativeAdMediaViewListener = this.f37968a;
            if (sDMNativeAdMediaViewListener != null) {
                sDMNativeAdMediaViewListener.onVideoAdStartPlay(j);
            }
        }

        @Override // com.smartdigimkt.sdk.api.format.SDMNativeAdMediaViewListener
        public void onVideoError(String str, String str2) {
            SDMNativeAdMediaViewListener sDMNativeAdMediaViewListener = this.f37968a;
            if (sDMNativeAdMediaViewListener != null) {
                sDMNativeAdMediaViewListener.onVideoError(str, str2);
            }
        }
    }

    public class b implements com.smartdigimkt.f5.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SDMNativeAdListener f37970a;

        public b(SDMNativeAdListener sDMNativeAdListener) {
            this.f37970a = sDMNativeAdListener;
        }

        @Override // com.smartdigimkt.f5.h
        public void a(int i2) {
            if (o.this.f37967Y.g() != null && o.this.f37967Y.g().O() == 2 && (o.this.f37967Y.g() instanceof com.smartdigimkt.w6.l)) {
                com.smartdigimkt.i7.d.a(o.this.f37967Y.f(), ((com.smartdigimkt.w6.l) o.this.f37967Y.g()).I0(), o.this.f37967Y.g().L(), i2);
            }
        }

        @Override // com.smartdigimkt.f5.a
        public void onAdClick(com.smartdigimkt.f5.j jVar) {
            o.this.a("click", "success", "");
            if (o.this.Z.getBaseAdContent().I() == 67) {
                if (o.this.Z.a(true, false)) {
                    com.smartdigimkt.q6.c.a(com.smartdigimkt.m6.b.p().k()).a(o.this.Z.getBaseAdContent().L(), 1, 0);
                }
                if (o.this.Z.a(false, false)) {
                    com.smartdigimkt.q6.b.a(com.smartdigimkt.m6.b.p().k()).a(o.this.Z.getBaseAdContent().L(), 1, 0);
                }
            }
            SDMNativeAdListener sDMNativeAdListener = this.f37970a;
            if (sDMNativeAdListener != null) {
                sDMNativeAdListener.onAdClick();
            }
        }

        @Override // com.smartdigimkt.f5.a
        public void onAdClosed() {
            o.this.a("close", "success", "");
            SDMNativeAdListener sDMNativeAdListener = this.f37970a;
            if (sDMNativeAdListener != null) {
                sDMNativeAdListener.onAdClosed();
            }
        }

        @Override // com.smartdigimkt.f5.a
        public void onAdShow(com.smartdigimkt.f5.j jVar) {
            o.this.a("impression", "success", "");
            if (o.this.f37967Y.g().I() == 67) {
                if (o.this.Z.a(true, true)) {
                    com.smartdigimkt.q6.c.a(com.smartdigimkt.m6.b.p().k()).a(o.this.Z.getBaseAdContent().L(), 0, 1);
                }
                if (o.this.Z.a(false, true)) {
                    com.smartdigimkt.q6.b.a(com.smartdigimkt.m6.b.p().k()).a(o.this.Z.getBaseAdContent().L(), 0, 1);
                }
            }
            SDMNativeAdListener sDMNativeAdListener = this.f37970a;
            if (sDMNativeAdListener != null) {
                sDMNativeAdListener.onAdShow();
            }
        }

        @Override // com.smartdigimkt.f5.a
        public void onDeeplinkCallback(boolean z2) {
            o.this.a(com.smartdigimkt.m6.a.r.j, z2 ? "success" : "fail", "");
            SDMNativeAdListener sDMNativeAdListener = this.f37970a;
            if (sDMNativeAdListener != null) {
                sDMNativeAdListener.onDeeplinkCallback(z2);
            }
        }

        @Override // com.smartdigimkt.f5.a
        public void onShowFailed(com.smartdigimkt.v3.h hVar) {
            String strB = hVar != null ? hVar.b() : "";
            o.this.a(com.smartdigimkt.m6.a.r.f36795l, "fail", hVar != null ? hVar.c() : "", new com.smartdigimkt.v7.a(hVar != null ? hVar.a() : "", strB));
            SDMNativeAdListener sDMNativeAdListener = this.f37970a;
            if (sDMNativeAdListener != null) {
                if (hVar != null) {
                    sDMNativeAdListener.onShowFailed(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.f39191l, hVar.b()));
                } else {
                    sDMNativeAdListener.onShowFailed(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.f39191l));
                }
            }
        }
    }

    public o(com.smartdigimkt.y4.f fVar) {
        this.f37967Y = fVar;
        this.Z = fVar.p();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001a  */
    /* JADX WARN: Code duplicated, block: B:15:0x002b  */
    private void a(com.smartdigimkt.y4.c cVar, boolean z2) {
        String str;
        int i2;
        if (cVar != null) {
            com.smartdigimkt.v6.a aVarH = cVar.h();
            str = aVarH != null ? aVarH.f39163a : "";
            if (aVarH != null) {
                i2 = aVarH.f39164b;
            }
            if (z2) {
                com.smartdigimkt.n8.n.a(str, com.smartdigimkt.n8.f.a(String.valueOf(i2)), com.smartdigimkt.m6.a.r.x, String.valueOf(true), "");
            } else {
                com.smartdigimkt.n8.n.a(str, com.smartdigimkt.n8.f.a(String.valueOf(i2)), com.smartdigimkt.m6.a.r.x, String.valueOf(false), "");
            }
            com.smartdigimkt.n8.d.a(cVar, "isAdReady");
        }
        str = "";
        i2 = 0;
        if (z2) {
            com.smartdigimkt.n8.n.a(str, com.smartdigimkt.n8.f.a(String.valueOf(i2)), com.smartdigimkt.m6.a.r.x, String.valueOf(true), "");
        } else {
            com.smartdigimkt.n8.n.a(str, com.smartdigimkt.n8.f.a(String.valueOf(i2)), com.smartdigimkt.m6.a.r.x, String.valueOf(false), "");
        }
        com.smartdigimkt.n8.d.a(cVar, "isAdReady");
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public void destroy() {
        this.Z.destroy();
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public View generateShakeViewContainer() {
        return this.Z.generateShakeViewContainer();
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public String getAdChoiceIconUrl() {
        return this.Z.getAdChoiceIconUrl();
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public int getAdImageHeight() {
        return this.Z.getAdImageHeight();
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public int getAdImageWidth() {
        return this.Z.getAdImageWidth();
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public int getAdType() {
        return this.Z.getAdType();
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public int getAdVideoHeight() {
        return this.Z.getAdVideoHeight();
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public int getAdVideoWidth() {
        return this.Z.getAdVideoWidth();
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public String getAppName() {
        return this.Z.getAppName();
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public String getAppVersion() {
        return this.Z.getAppVersion();
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public String getCallToAction() {
        return this.Z.getCallToAction();
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public ViewGroup getCustomAdContainer() {
        return this.Z.getCustomAdContainer();
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public String getDescription() {
        return this.Z.getDescription();
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public int getDownloadStatus() {
        return this.Z.getDownloadStatus();
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public String getFunctionUrl() {
        return this.Z.getFunctionUrl();
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public String getIcon() {
        return this.Z.getIcon();
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public int getInteractionType() {
        return this.Z.getInteractionType();
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public String getMainImageUrl() {
        return this.Z.getMainImageUrl();
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public View getMediaView(Context context, SDMNativeAdMediaViewListener sDMNativeAdMediaViewListener) {
        View mediaView = this.Z.getMediaView(context, new a(sDMNativeAdMediaViewListener));
        this.f0 = new WeakReference<>(mediaView);
        return mediaView;
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public String getPermissionUrl() {
        return this.Z.getPermissionUrl();
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public String getPrivacyUrl() {
        return this.Z.getPrivacyUrl();
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public String getPublisher() {
        return this.Z.getPublisher();
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMAdHandler
    public SDMAd getSDMAd() {
        com.smartdigimkt.y4.f fVar = this.f37967Y;
        if (fVar != null) {
            return g.a(fVar);
        }
        return null;
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public String getTitle() {
        return this.Z.getTitle();
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public long getVideoCurrentPosition() {
        return this.Z.getVideoCurrentPosition();
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public long getVideoDuration() {
        return this.Z.getVideoDuration();
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public boolean isAdReady() {
        boolean zA;
        int i2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        com.smartdigimkt.y4.f fVar = this.f37967Y;
        String strY = "";
        if (fVar != null) {
            strY = fVar.f() != null ? this.f37967Y.f().Y() : "";
            int iK = this.f37967Y.k();
            zA = this.f37967Y.a(iK);
            if (iK == 1) {
                notifyLoss(new SDMLossInfo(SDMLossInfo.LOSS_REASON.LOSS_TO_EXPIRE, 0.0d));
                destroy();
            }
            i2 = iK;
        } else {
            zA = false;
            i2 = 0;
        }
        com.smartdigimkt.i7.d.a(zA, strY, this.f37967Y, System.currentTimeMillis() - jCurrentTimeMillis, i2);
        a(this.f37967Y, zA);
        return zA;
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public boolean isDownloadApp() {
        return this.Z.isDownloadApp();
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public boolean isTemplateAd() {
        return this.Z.isTemplateAd();
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMAdHandler
    public void notifyLoss(SDMLossInfo sDMLossInfo) {
        p.d(this.f37967Y, sDMLossInfo);
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMAdHandler
    public void notifyWin(SDMWinInfo sDMWinInfo) {
        p.d(this.f37967Y, sDMWinInfo);
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public void onPause() {
        this.Z.onPause();
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public void onResume() {
        this.Z.onResume();
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public void pauseVideo() {
        this.Z.pauseVideo();
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public void registerAdView(View view, List<View> list, List<View> list2, FrameLayout.LayoutParams layoutParams, View view2) {
        if (!this.e0) {
            this.e0 = true;
            com.smartdigimkt.y4.f fVar = this.f37967Y;
            if (fVar != null) {
                fVar.o();
            }
            com.smartdigimkt.i7.c.a(com.smartdigimkt.m6.b.p().k()).a(13, this.f37967Y.f());
        }
        this.Z.onResume();
        this.Z.registerAdView(view, list, list2, layoutParams, view2);
        if (isTemplateAd() || this.f37967Y.g() == null || this.f37967Y.g().O() != 2 || !(this.f37967Y.g() instanceof com.smartdigimkt.w6.l)) {
            return;
        }
        WeakReference<View> weakReference = this.f0;
        View view3 = weakReference != null ? weakReference.get() : null;
        com.smartdigimkt.i7.d.a(this.f37967Y.f(), ((com.smartdigimkt.w6.l) this.f37967Y.g()).I0(), this.f37967Y.g().L(), (view3 == null || view3.getParent() == null) ? false : true);
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public void resumeVideo() {
        this.Z.resumeVideo();
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public void setAutoPlay(String str) {
        this.Z.setAutoPlay(str);
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public void setListener(SDMNativeAdListener sDMNativeAdListener) {
        this.Z.a(new com.smartdigimkt.f5.g(this.f37967Y, new b(sDMNativeAdListener)));
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public void setMute(boolean z2) {
        this.Z.setMute(z2);
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public void unregisterView() {
        this.Z.unregisterView();
    }

    public void a(String str, String str2, String str3) {
        a(str, str2, str3, null);
    }

    public void a(String str, String str2, String str3, AdError adError) {
        this.X.a(this.f37967Y);
        com.smartdigimkt.q8.a.a(this.X, str, str2, adError);
        com.smartdigimkt.y4.f fVar = this.f37967Y;
        com.smartdigimkt.n8.n.a(fVar != null ? fVar.f() : null, str, str2, str3);
    }
}
