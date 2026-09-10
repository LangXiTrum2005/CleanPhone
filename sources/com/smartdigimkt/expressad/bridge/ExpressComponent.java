package com.smartdigimkt.expressad.bridge;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import com.smartdigimkt.c5.b;
import com.smartdigimkt.expressad.advanced.view.ATOutNativeAdvancedViewGroup;
import com.smartdigimkt.expressad.out.TemplateBannerView;
import com.smartdigimkt.expressad.reward.player.ATRewardVideoActivity;
import com.smartdigimkt.f1.h;
import com.smartdigimkt.f1.p;
import com.smartdigimkt.f5.e;
import com.smartdigimkt.f5.j;
import com.smartdigimkt.m3.g;
import com.smartdigimkt.sdk.api.IOfferClickHandler;
import com.smartdigimkt.sdk.api.business.express.IExpressComponent;
import com.smartdigimkt.u1.c;
import com.smartdigimkt.v3.i;
import com.smartdigimkt.v3.l;
import com.smartdigimkt.v6.a;
import com.smartdigimkt.w6.f;
import com.smartdigimkt.x.d;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public class ExpressComponent extends IExpressComponent {
    f mBaseAdContent;
    a mBaseAdRequestInfo;
    Context mContext;
    b mExpressObjectInterface;
    public com.smartdigimkt.f5.a mListener;
    protected ConcurrentHashMap<String, g> mMoreOfferClickControllerMap;
    protected g mOfferClickController;
    final String TAG = "ExpressComponent";
    private boolean mHasSendImpTracking = false;

    /* JADX INFO: renamed from: com.smartdigimkt.expressad.bridge.ExpressComponent$5, reason: invalid class name */
    public class AnonymousClass5 extends com.smartdigimkt.e3.b {
        final /* synthetic */ boolean[] val$hasSendOnVideoAdPlayEnd;
        final /* synthetic */ String val$scenario;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(Map map, String str, String str2, boolean[] zArr) {
            super(map, str);
            this.val$scenario = str2;
            this.val$hasSendOnVideoAdPlayEnd = zArr;
        }

        @Override // com.smartdigimkt.e3.b, com.smartdigimkt.e3.a
        public void onAdClose(boolean z2, String str, float f) {
            super.onAdClose(z2, str, f);
            com.smartdigimkt.f5.a aVar = ExpressComponent.this.mListener;
            if (aVar != null) {
                aVar.onAdClosed();
            }
            ExpressComponent.this.releaseExpressOfferClick();
        }

        @Override // com.smartdigimkt.e3.a
        public void onAdCloseWithIVReward(boolean z2, int i2) {
        }

        @Override // com.smartdigimkt.e3.a
        public void onAdShow() {
            com.smartdigimkt.f5.a aVar = ExpressComponent.this.mListener;
            if (aVar != null) {
                aVar.onAdShow(new j());
            }
            if (!ExpressComponent.this.mHasSendImpTracking) {
                ExpressComponent.this.mHasSendImpTracking = true;
                ExpressComponent.this.sendOfferAdTracking(8);
            }
            ExpressComponent.this.mBaseAdContent = null;
        }

        @Override // com.smartdigimkt.e3.a
        public void onEndcardShow() {
        }

        @Override // com.smartdigimkt.e3.a
        public void onLoadSuccess() {
        }

        @Override // com.smartdigimkt.e3.a
        public void onShowFail(String str) {
            com.smartdigimkt.f5.a aVar = ExpressComponent.this.mListener;
            if (aVar != null) {
                aVar.onShowFailed(i.a("40002", str));
            }
            ExpressComponent.this.mBaseAdContent = null;
        }

        @Override // com.smartdigimkt.e3.a
        public void onVideoAdClicked(final d dVar) {
            com.smartdigimkt.l7.b.a().g(new Runnable() { // from class: com.smartdigimkt.expressad.bridge.ExpressComponent.5.1
                @Override // java.lang.Runnable
                public void run() {
                    AnonymousClass5 anonymousClass5 = AnonymousClass5.this;
                    ExpressComponent.this.startExpressOfferClick(dVar, anonymousClass5.val$scenario, new Runnable() { // from class: com.smartdigimkt.expressad.bridge.ExpressComponent.5.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            com.smartdigimkt.w6.g gVar;
                            try {
                                a aVar = ExpressComponent.this.mBaseAdRequestInfo;
                                if (aVar == null || (gVar = aVar.t) == null || !gVar.d()) {
                                    return;
                                }
                                String str = ExpressComponent.this.TAG;
                                Intent intent = new Intent();
                                intent.setAction(ATRewardVideoActivity.q1);
                                if (ExpressComponent.this.mBaseAdRequestInfo != null) {
                                    intent.setAction(ATRewardVideoActivity.q1 + ExpressComponent.this.mBaseAdRequestInfo.f);
                                }
                                com.smartdigimkt.s6.b.a(ExpressComponent.this.mContext).a(intent);
                            } catch (Exception unused) {
                            }
                        }
                    });
                }
            });
        }

        @Override // com.smartdigimkt.e3.a
        public void onVideoComplete() {
            com.smartdigimkt.f5.a aVar = ExpressComponent.this.mListener;
            if (aVar == null || !(aVar instanceof e)) {
                return;
            }
            boolean[] zArr = this.val$hasSendOnVideoAdPlayEnd;
            if (zArr[0]) {
                return;
            }
            zArr[0] = true;
            ((e) aVar).onVideoAdPlayEnd();
        }

        @Override // com.smartdigimkt.e3.a
        public void onVideoLoadFail(String str) {
        }

        @Override // com.smartdigimkt.e3.a
        public void onVideoLoadSuccess() {
        }
    }

    /* JADX INFO: renamed from: com.smartdigimkt.expressad.bridge.ExpressComponent$7, reason: invalid class name */
    public class AnonymousClass7 implements com.smartdigimkt.f1.e {
        final /* synthetic */ boolean[] val$dismissCallbacked;
        final /* synthetic */ boolean[] val$enableClickClose;
        final /* synthetic */ Map val$mAdExtraInfoMap;

        /* JADX INFO: renamed from: com.smartdigimkt.expressad.bridge.ExpressComponent$7$1, reason: invalid class name */
        public class AnonymousClass1 implements Runnable {
            final /* synthetic */ d val$campaignEx;

            public AnonymousClass1(d dVar) {
                this.val$campaignEx = dVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                AnonymousClass7 anonymousClass7 = AnonymousClass7.this;
                if (anonymousClass7.val$enableClickClose[0]) {
                    ExpressComponent.this.startExpressOfferClick(this.val$campaignEx, "", new Runnable() { // from class: com.smartdigimkt.expressad.bridge.ExpressComponent.7.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            com.smartdigimkt.l7.b.a().e(new Runnable() { // from class: com.smartdigimkt.expressad.bridge.ExpressComponent.7.1.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    ((c) ExpressComponent.this.mExpressObjectInterface).a(6);
                                }
                            });
                        }
                    });
                } else {
                    ExpressComponent.this.startExpressOfferClick(this.val$campaignEx, "");
                }
            }
        }

        public AnonymousClass7(boolean[] zArr, boolean[] zArr2, Map map) {
            this.val$enableClickClose = zArr;
            this.val$dismissCallbacked = zArr2;
            this.val$mAdExtraInfoMap = map;
        }

        @Override // com.smartdigimkt.f1.e
        public void onAdClicked(d dVar) {
            com.smartdigimkt.l7.b.a().g(new AnonymousClass1(dVar));
        }

        @Override // com.smartdigimkt.f1.e
        public void onAdTick(long j) {
        }

        @Override // com.smartdigimkt.f1.e
        public void onDismiss(int i2) {
            this.val$dismissCallbacked[0] = true;
            this.val$mAdExtraInfoMap.put("close_scene", Integer.valueOf(i2));
            com.smartdigimkt.f5.a aVar = ExpressComponent.this.mListener;
            if (aVar != null) {
                aVar.onAdClosed();
            }
            ExpressComponent.this.releaseExpressOfferClick();
        }

        @Override // com.smartdigimkt.f1.e
        public void onShowFailed(String str) {
            com.smartdigimkt.f5.a aVar = ExpressComponent.this.mListener;
            if (aVar != null) {
                aVar.onShowFailed(i.a("40002", str));
            }
        }

        @Override // com.smartdigimkt.f1.e
        public void onShowSuccessed() {
            com.smartdigimkt.f5.a aVar = ExpressComponent.this.mListener;
            if (aVar != null) {
                aVar.onAdShow(new j());
            }
            if (ExpressComponent.this.mHasSendImpTracking) {
                return;
            }
            ExpressComponent.this.mHasSendImpTracking = true;
            ExpressComponent.this.sendOfferAdTracking(8);
        }

        @Override // com.smartdigimkt.f1.e
        public void onZoomOutPlayFinish() {
        }

        @Override // com.smartdigimkt.f1.e
        public void onZoomOutPlayStart() {
        }
    }

    public ExpressComponent(Context context, a aVar, f fVar, b bVar) {
        this.mExpressObjectInterface = bVar;
        this.mContext = context;
        this.mBaseAdRequestInfo = aVar;
        this.mBaseAdContent = fVar;
        g gVar = new g(context, aVar, fVar, null);
        this.mOfferClickController = gVar;
        gVar.a(new g.d() { // from class: com.smartdigimkt.expressad.bridge.ExpressComponent.1
            @Override // com.smartdigimkt.m3.g.d
            public void clickCallback() {
                com.smartdigimkt.f5.a aVar2 = ExpressComponent.this.mListener;
                if (aVar2 != null) {
                    aVar2.onAdClick(new j().a(1, 13));
                }
            }

            @Override // com.smartdigimkt.m3.g.d
            public void clickEndUI() {
            }

            @Override // com.smartdigimkt.m3.g.d
            public void clickStartUI() {
            }

            @Override // com.smartdigimkt.m3.g.d
            public void deeplinkCallback(boolean z2) {
                com.smartdigimkt.f5.a aVar2 = ExpressComponent.this.mListener;
                if (aVar2 != null) {
                    aVar2.onDeeplinkCallback(z2);
                }
            }

            @Override // com.smartdigimkt.m3.g.d
            public boolean openInternalWebView(String str, IOfferClickHandler iOfferClickHandler) {
                return false;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendOfferAdTracking(int i2) {
        com.smartdigimkt.m3.f.a(i2, this.mBaseAdContent, new l(this.mBaseAdRequestInfo, ""));
    }

    @Override // com.smartdigimkt.sdk.api.business.express.IExpressComponent
    public void destroy() {
        b bVar = this.mExpressObjectInterface;
        if (bVar instanceof TemplateBannerView) {
            ((TemplateBannerView) bVar).release();
            this.mExpressObjectInterface = null;
        }
        b bVar2 = this.mExpressObjectInterface;
        if (bVar2 != null && (bVar2 instanceof c)) {
            ((c) bVar2).a();
        }
        b bVar3 = this.mExpressObjectInterface;
        if (bVar3 != null && (bVar3 instanceof com.smartdigimkt.f.c)) {
            ((com.smartdigimkt.f.c) bVar3).b();
        }
        this.mListener = null;
    }

    @Override // com.smartdigimkt.sdk.api.business.express.IExpressComponent
    public int getAdType() {
        b bVar = this.mExpressObjectInterface;
        if (bVar instanceof com.smartdigimkt.f.c) {
            return ((com.smartdigimkt.f.c) bVar).c();
        }
        return 0;
    }

    @Override // com.smartdigimkt.sdk.api.business.express.IExpressComponent
    public View getBannerView() {
        b bVar = this.mExpressObjectInterface;
        if (bVar == null || !(bVar instanceof TemplateBannerView)) {
            return null;
        }
        return (TemplateBannerView) bVar;
    }

    @Override // com.smartdigimkt.sdk.api.business.express.IExpressComponent
    public View getMBOutNativeAdvancedViewGroup() {
        b bVar = this.mExpressObjectInterface;
        if (bVar instanceof com.smartdigimkt.f.c) {
            return ((com.smartdigimkt.f.c) bVar).d();
        }
        return null;
    }

    @Override // com.smartdigimkt.sdk.api.business.express.IExpressComponent
    public boolean isReady() {
        b bVar = this.mExpressObjectInterface;
        return bVar != null && bVar.isReady();
    }

    @Override // com.smartdigimkt.sdk.api.business.express.IExpressComponent
    public void registerBannerListener() {
        b bVar = this.mExpressObjectInterface;
        if (bVar == null || !(bVar instanceof TemplateBannerView)) {
            return;
        }
        ((TemplateBannerView) bVar).setBannerAdListener(new h() { // from class: com.smartdigimkt.expressad.bridge.ExpressComponent.4
            @Override // com.smartdigimkt.f1.h
            public void closeFullScreen() {
            }

            @Override // com.smartdigimkt.f1.h
            public void onClick(final d dVar) {
                com.smartdigimkt.l7.b.a().g(new Runnable() { // from class: com.smartdigimkt.expressad.bridge.ExpressComponent.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ExpressComponent.this.startExpressOfferClick(dVar, "");
                    }
                });
            }

            @Override // com.smartdigimkt.f1.h
            public void onCloseBanner() {
                com.smartdigimkt.f5.a aVar = ExpressComponent.this.mListener;
                if (aVar != null) {
                    aVar.onAdClosed();
                }
                ExpressComponent.this.releaseExpressOfferClick();
            }

            @Override // com.smartdigimkt.f1.h
            public void onLeaveApp() {
            }

            @Override // com.smartdigimkt.f1.h
            public void onLoadFailed(String str) {
            }

            @Override // com.smartdigimkt.f1.h
            public void onLoadSuccessed() {
            }

            @Override // com.smartdigimkt.f1.h
            public void onLogImpression() {
                com.smartdigimkt.f5.a aVar = ExpressComponent.this.mListener;
                if (aVar != null) {
                    aVar.onAdShow(new j());
                }
                if (ExpressComponent.this.mHasSendImpTracking) {
                    return;
                }
                ExpressComponent.this.mHasSendImpTracking = true;
                ExpressComponent.this.sendOfferAdTracking(8);
            }

            @Override // com.smartdigimkt.f1.h
            public void showFullScreen() {
            }
        });
    }

    @Override // com.smartdigimkt.sdk.api.business.express.IExpressComponent
    public void registerNativeTemplateListener() {
        b bVar = this.mExpressObjectInterface;
        if (bVar instanceof com.smartdigimkt.f.c) {
            ((com.smartdigimkt.f.c) bVar).a(new p() { // from class: com.smartdigimkt.expressad.bridge.ExpressComponent.3
                @Override // com.smartdigimkt.f1.p
                public void closeFullScreen() {
                }

                @Override // com.smartdigimkt.f1.p
                public void onClick(d dVar) {
                    ExpressComponent.this.startExpressOfferClick(dVar, "");
                }

                @Override // com.smartdigimkt.f1.p
                public void onClose() {
                    com.smartdigimkt.f5.a aVar = ExpressComponent.this.mListener;
                    if (aVar != null) {
                        aVar.onAdClosed();
                    }
                }

                @Override // com.smartdigimkt.f1.p
                public void onLeaveApp() {
                }

                @Override // com.smartdigimkt.f1.p
                public void onLoadFailed(String str) {
                }

                @Override // com.smartdigimkt.f1.p
                public void onLoadSuccessed() {
                }

                @Override // com.smartdigimkt.f1.p
                public void onLogImpression() {
                    com.smartdigimkt.f5.a aVar = ExpressComponent.this.mListener;
                    if (aVar != null) {
                        aVar.onAdShow(new j());
                    }
                    if (ExpressComponent.this.mHasSendImpTracking) {
                        return;
                    }
                    ExpressComponent.this.mHasSendImpTracking = true;
                    ExpressComponent.this.sendOfferAdTracking(8);
                }

                @Override // com.smartdigimkt.f1.p
                public void showFullScreen() {
                }
            });
        }
    }

    public void releaseExpressOfferClick() {
        g gVar = this.mOfferClickController;
        if (gVar != null) {
            gVar.a();
            this.mOfferClickController = null;
        }
        ConcurrentHashMap<String, g> concurrentHashMap = this.mMoreOfferClickControllerMap;
        if (concurrentHashMap == null || concurrentHashMap.size() <= 0) {
            return;
        }
        Iterator<Map.Entry<String, g>> it = this.mMoreOfferClickControllerMap.entrySet().iterator();
        while (it.hasNext()) {
            g value = it.next().getValue();
            if (value != null) {
                value.a();
                it.remove();
            }
        }
    }

    @Override // com.smartdigimkt.sdk.api.business.express.IExpressComponent
    public void setCloseBtnSateFromOut(int i2) {
        b bVar = this.mExpressObjectInterface;
        if (bVar instanceof com.smartdigimkt.f.c) {
            ((com.smartdigimkt.f.c) bVar).b(i2);
        }
    }

    @Override // com.smartdigimkt.sdk.api.business.express.IExpressComponent
    public void setListener(com.smartdigimkt.f5.a aVar) {
        this.mListener = aVar;
    }

    @Override // com.smartdigimkt.sdk.api.business.express.IExpressComponent
    public void setLogoSizeHAndW(int i2, int i3) {
        b bVar = this.mExpressObjectInterface;
        if (bVar instanceof com.smartdigimkt.f.c) {
            ((com.smartdigimkt.f.c) bVar).b(i2, i3);
        }
    }

    @Override // com.smartdigimkt.sdk.api.business.express.IExpressComponent
    public void setMuteStateFromOut(int i2) {
        b bVar = this.mExpressObjectInterface;
        if (bVar instanceof com.smartdigimkt.f.c) {
            ((com.smartdigimkt.f.c) bVar).d(i2);
        }
    }

    @Override // com.smartdigimkt.sdk.api.business.express.IExpressComponent
    public void setPauseState(int i2) {
        b bVar = this.mExpressObjectInterface;
        if (bVar instanceof com.smartdigimkt.f.c) {
            ((com.smartdigimkt.f.c) bVar).f(i2);
        }
    }

    @Override // com.smartdigimkt.sdk.api.business.express.IExpressComponent
    public void setPlayModeFromOut(int i2) {
        b bVar = this.mExpressObjectInterface;
        if (bVar instanceof com.smartdigimkt.f.c) {
            ((com.smartdigimkt.f.c) bVar).h(i2);
        }
    }

    @Override // com.smartdigimkt.sdk.api.business.express.IExpressComponent
    public void setResumeState(int i2) {
        b bVar = this.mExpressObjectInterface;
        if (bVar instanceof com.smartdigimkt.f.c) {
            ((com.smartdigimkt.f.c) bVar).i(i2);
        }
    }

    @Override // com.smartdigimkt.sdk.api.business.express.IExpressComponent
    public boolean showInterstitial(Activity activity, Map<String, Object> map, String str, String str2) {
        b bVar = this.mExpressObjectInterface;
        if (!(bVar instanceof com.smartdigimkt.h1.a)) {
            return false;
        }
        ((com.smartdigimkt.h1.a) bVar).a(new AnonymousClass5(map, str, str2, new boolean[]{false}));
        ((com.smartdigimkt.h1.a) this.mExpressObjectInterface).a(activity, "", "", "", this.mBaseAdRequestInfo);
        return true;
    }

    @Override // com.smartdigimkt.sdk.api.business.express.IExpressComponent
    public boolean showRewardedVideo(Activity activity, Map<String, Object> map, String str, final String str2) {
        final boolean[] zArr = {false};
        final boolean[] zArr2 = {false};
        b bVar = this.mExpressObjectInterface;
        if (!(bVar instanceof com.smartdigimkt.h1.a)) {
            return false;
        }
        ((com.smartdigimkt.h1.a) bVar).a(new com.smartdigimkt.e3.b(map, str) { // from class: com.smartdigimkt.expressad.bridge.ExpressComponent.6
            boolean hasRewardedAdShowFail;

            @Override // com.smartdigimkt.e3.b, com.smartdigimkt.e3.a
            public void onAdClose(boolean z2, String str3, float f) {
                com.smartdigimkt.w6.g gVar;
                super.onAdClose(z2, str3, f);
                ExpressComponent expressComponent = ExpressComponent.this;
                com.smartdigimkt.f5.a aVar = expressComponent.mListener;
                if (aVar != null && (aVar instanceof e)) {
                    if (z2) {
                        ((e) aVar).onRewarded();
                    } else if (this.hasRewardedAdShowFail && (gVar = expressComponent.mBaseAdRequestInfo.t) != null && gVar.s0() == 1) {
                        ((e) ExpressComponent.this.mListener).onRewarded();
                    }
                }
                com.smartdigimkt.f5.a aVar2 = ExpressComponent.this.mListener;
                if (aVar2 != null) {
                    aVar2.onAdClosed();
                }
                ExpressComponent.this.releaseExpressOfferClick();
            }

            @Override // com.smartdigimkt.e3.a
            public void onAdCloseWithIVReward(boolean z2, int i2) {
            }

            @Override // com.smartdigimkt.e3.a
            public void onAdShow() {
                this.hasRewardedAdShowFail = false;
                com.smartdigimkt.f5.a aVar = ExpressComponent.this.mListener;
                if (aVar != null) {
                    aVar.onAdShow(new j().d(9));
                }
                if (!ExpressComponent.this.mHasSendImpTracking) {
                    ExpressComponent.this.mHasSendImpTracking = true;
                    ExpressComponent.this.sendOfferAdTracking(8);
                }
                com.smartdigimkt.f5.a aVar2 = ExpressComponent.this.mListener;
                if (aVar2 != null && (aVar2 instanceof e)) {
                    boolean[] zArr3 = zArr2;
                    if (!zArr3[0]) {
                        zArr3[0] = true;
                        ((e) aVar2).onVideoAdPlayStart();
                    }
                }
                ExpressComponent.this.mBaseAdContent = null;
            }

            @Override // com.smartdigimkt.e3.a
            public void onEndcardShow() {
            }

            @Override // com.smartdigimkt.e3.a
            public void onLoadSuccess() {
            }

            @Override // com.smartdigimkt.e3.a
            public void onShowFail(String str3) {
                this.hasRewardedAdShowFail = true;
                com.smartdigimkt.f5.a aVar = ExpressComponent.this.mListener;
                if (aVar != null) {
                    aVar.onShowFailed(i.a("40002", str3));
                }
                ExpressComponent.this.mBaseAdContent = null;
            }

            @Override // com.smartdigimkt.e3.a
            public void onVideoAdClicked(final d dVar) {
                com.smartdigimkt.l7.b.a().g(new Runnable() { // from class: com.smartdigimkt.expressad.bridge.ExpressComponent.6.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                        ExpressComponent.this.startExpressOfferClick(dVar, str2);
                    }
                });
            }

            @Override // com.smartdigimkt.e3.a
            public void onVideoComplete() {
                com.smartdigimkt.f5.a aVar = ExpressComponent.this.mListener;
                if (aVar == null || !(aVar instanceof e)) {
                    return;
                }
                boolean[] zArr3 = zArr;
                if (zArr3[0]) {
                    return;
                }
                zArr3[0] = true;
                ((e) aVar).onVideoAdPlayEnd();
            }

            @Override // com.smartdigimkt.e3.a
            public void onVideoLoadFail(String str3) {
            }

            @Override // com.smartdigimkt.e3.a
            public void onVideoLoadSuccess() {
            }
        });
        ((com.smartdigimkt.h1.a) this.mExpressObjectInterface).a(activity, "", "", "", this.mBaseAdRequestInfo);
        return true;
    }

    @Override // com.smartdigimkt.sdk.api.business.express.IExpressComponent
    public boolean showSplash(ViewGroup viewGroup, final Map<String, Object> map) {
        if (!(this.mExpressObjectInterface instanceof c)) {
            return false;
        }
        final boolean[] zArr = {false};
        boolean[] zArr2 = {false};
        f fVar = this.mBaseAdContent;
        if (fVar != null && fVar.i() != null) {
            zArr2[0] = this.mBaseAdContent.i().d();
        }
        ((c) this.mExpressObjectInterface).a(new AnonymousClass7(zArr2, zArr, map));
        viewGroup.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.smartdigimkt.expressad.bridge.ExpressComponent.8
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                String str = ExpressComponent.this.TAG;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                String str = ExpressComponent.this.TAG;
                if (zArr[0]) {
                    return;
                }
                try {
                    map.put("close_scene", 3);
                    com.smartdigimkt.f5.a aVar = ExpressComponent.this.mListener;
                    if (aVar != null) {
                        aVar.onAdClosed();
                    }
                    ExpressComponent.this.releaseExpressOfferClick();
                } catch (Throwable unused) {
                }
            }
        });
        ((c) this.mExpressObjectInterface).b(viewGroup);
        return true;
    }

    public synchronized void startExpressOfferClick(d dVar, String str) {
        startExpressOfferClick(dVar, str, null);
    }

    public synchronized void startExpressOfferClick(d dVar, String str, final Runnable runnable) {
        try {
            if (this.mOfferClickController == null) {
                return;
            }
            if (this.mMoreOfferClickControllerMap == null) {
                this.mMoreOfferClickControllerMap = new ConcurrentHashMap<>(2);
            }
            g gVarSyncOfferClickControll = this.mMoreOfferClickControllerMap.get(dVar.j());
            if (gVarSyncOfferClickControll == null) {
                gVarSyncOfferClickControll = ExpressResourceHandle.syncOfferClickControll(this.mOfferClickController, dVar);
                this.mMoreOfferClickControllerMap.put(dVar.j(), gVarSyncOfferClickControll);
            }
            if (gVarSyncOfferClickControll != null) {
                l lVar = new l(this.mBaseAdRequestInfo, str);
                b bVar = this.mExpressObjectInterface;
                ATOutNativeAdvancedViewGroup aTOutNativeAdvancedViewGroupD = bVar instanceof com.smartdigimkt.f.c ? ((com.smartdigimkt.f.c) bVar).d() : null;
                if (aTOutNativeAdvancedViewGroupD != null) {
                    lVar.f39136h = aTOutNativeAdvancedViewGroupD.getHeight();
                    lVar.g = aTOutNativeAdvancedViewGroupD.getWidth();
                    try {
                        int[] iArr = new int[2];
                        aTOutNativeAdvancedViewGroupD.getLocationOnScreen(iArr);
                        lVar.f39139n = iArr[0];
                        lVar.o = iArr[1];
                    } catch (Throwable unused) {
                    }
                    lVar.f39140p = 100;
                }
                lVar.f39137i = new com.smartdigimkt.v3.a();
                gVarSyncOfferClickControll.a(new g.d() { // from class: com.smartdigimkt.expressad.bridge.ExpressComponent.2
                    @Override // com.smartdigimkt.m3.g.d
                    public void clickCallback() {
                        com.smartdigimkt.f5.a aVar = ExpressComponent.this.mListener;
                        if (aVar != null) {
                            aVar.onAdClick(new j().a(1, 13));
                        }
                        Runnable runnable2 = runnable;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }

                    @Override // com.smartdigimkt.m3.g.d
                    public void clickEndUI() {
                    }

                    @Override // com.smartdigimkt.m3.g.d
                    public void clickStartUI() {
                    }

                    @Override // com.smartdigimkt.m3.g.d
                    public void deeplinkCallback(boolean z2) {
                        com.smartdigimkt.f5.a aVar = ExpressComponent.this.mListener;
                        if (aVar != null) {
                            aVar.onDeeplinkCallback(z2);
                        }
                    }

                    @Override // com.smartdigimkt.m3.g.d
                    public boolean openInternalWebView(String str2, IOfferClickHandler iOfferClickHandler) {
                        return false;
                    }
                });
                gVarSyncOfferClickControll.a(lVar);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
