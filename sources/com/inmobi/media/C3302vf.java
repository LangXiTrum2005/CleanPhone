package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.iab.omid.library.inmobi.Omid;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.Map;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.vf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3302vf extends En {
    public static final /* synthetic */ int g = 0;
    public final Fn d;
    public InterfaceC2889f1 e;
    public final InterfaceC3072m9 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3302vf(GestureDetectorOnGestureListenerC2829ci adContainer, Fn mViewableAd, InterfaceC2889f1 interfaceC2889f1, InterfaceC3072m9 interfaceC3072m9) {
        super(adContainer);
        Intrinsics.checkNotNullParameter(adContainer, "adContainer");
        Intrinsics.checkNotNullParameter(mViewableAd, "mViewableAd");
        this.d = mViewableAd;
        this.e = interfaceC2889f1;
        this.f = interfaceC3072m9;
    }

    @Override // com.inmobi.media.Fn
    public final void a(View childView, FriendlyObstructionPurpose obstructionCode) {
        AdSession adSession;
        Intrinsics.checkNotNullParameter(childView, "childView");
        Intrinsics.checkNotNullParameter(obstructionCode, "obstructionCode");
        InterfaceC3072m9 interfaceC3072m9 = this.f;
        if (interfaceC3072m9 != null) {
            Intrinsics.checkNotNullExpressionValue("vf", "TAG");
            ((C3097n9) interfaceC3072m9).a("vf", "addFriendlyView with obstruction code: " + obstructionCode);
        }
        InterfaceC2889f1 interfaceC2889f1 = this.e;
        if (interfaceC2889f1 != null) {
            C3003jf c3003jf = (C3003jf) interfaceC2889f1;
            Intrinsics.checkNotNullParameter(childView, "childView");
            Intrinsics.checkNotNullParameter(obstructionCode, "obstructionCode");
            if (C3003jf.a(c3003jf.e) && (adSession = c3003jf.f) != null) {
                adSession.addFriendlyObstruction(childView, obstructionCode, null);
            }
        }
        this.d.a(childView, obstructionCode);
    }

    @Override // com.inmobi.media.Fn
    public final View b() {
        return this.d.b();
    }

    @Override // com.inmobi.media.Fn
    public final View c() {
        InterfaceC3072m9 interfaceC3072m9 = this.f;
        if (interfaceC3072m9 != null) {
            Intrinsics.checkNotNullExpressionValue("vf", "TAG");
            ((C3097n9) interfaceC3072m9).c("vf", "inflateView called");
        }
        return this.d.c();
    }

    @Override // com.inmobi.media.Fn
    public final void d() {
        try {
            InterfaceC3072m9 interfaceC3072m9 = this.f;
            if (interfaceC3072m9 != null) {
                Intrinsics.checkNotNullExpressionValue("vf", "TAG");
                ((C3097n9) interfaceC3072m9).a("vf", "stopTrackingForImpression");
            }
            InterfaceC2889f1 interfaceC2889f1 = this.e;
            if (interfaceC2889f1 != null) {
                C3003jf c3003jf = (C3003jf) interfaceC2889f1;
                if (C3003jf.a(c3003jf.e, (byte) 2)) {
                    AdSession adSession = c3003jf.f;
                    if (adSession != null) {
                        adSession.finish();
                    }
                    c3003jf.f = null;
                    c3003jf.e = (byte) 3;
                }
            }
        } catch (Exception e) {
            InterfaceC3072m9 interfaceC3072m10 = this.f;
            if (interfaceC3072m10 != null) {
                Intrinsics.checkNotNullExpressionValue("vf", "TAG");
                ((C3097n9) interfaceC3072m10).b("vf", "Exception in stopTrackingForImpression with message : " + e.getMessage());
            }
        } finally {
            this.d.d();
        }
    }

    @Override // com.inmobi.media.Fn
    public final void a(View childView) {
        AdSession adSession;
        Intrinsics.checkNotNullParameter(childView, "childView");
        InterfaceC2889f1 interfaceC2889f1 = this.e;
        if (interfaceC2889f1 != null) {
            C3003jf c3003jf = (C3003jf) interfaceC2889f1;
            Intrinsics.checkNotNullParameter(childView, "childView");
            if (C3003jf.a(c3003jf.e) && (adSession = c3003jf.f) != null) {
                adSession.removeFriendlyObstruction(childView);
            }
        }
        this.d.a(childView);
    }

    @Override // com.inmobi.media.Fn
    public final void a(Map map) {
        InterfaceC3072m9 interfaceC3072m9 = this.f;
        if (interfaceC3072m9 != null) {
            Intrinsics.checkNotNullExpressionValue("vf", "TAG");
            ((C3097n9) interfaceC3072m9).a("vf", "startTrackingForImpression");
        }
        try {
            if (this.c.getViewability().getOmidConfig().isOmidEnabled()) {
                Bf.a.getClass();
                if (Omid.isActive()) {
                    View viewB = this.d.b();
                    WebView webView = viewB instanceof WebView ? (WebView) viewB : null;
                    if (webView != null) {
                        InterfaceC3072m9 interfaceC3072m10 = this.f;
                        if (interfaceC3072m10 != null) {
                            Intrinsics.checkNotNullExpressionValue("vf", "TAG");
                            ((C3097n9) interfaceC3072m10).a("vf", "creating OMSDK session");
                        }
                        InterfaceC2889f1 interfaceC2889f1 = this.e;
                        if (interfaceC2889f1 != null) {
                            ((C3003jf) interfaceC2889f1).a(webView, map);
                        }
                    }
                }
            }
        } catch (Exception e) {
            InterfaceC3072m9 interfaceC3072m11 = this.f;
            if (interfaceC3072m11 != null) {
                Intrinsics.checkNotNullExpressionValue("vf", "TAG");
                ((C3097n9) interfaceC3072m11).b("vf", "Exception in startTrackingForImpression with message : " + e.getMessage());
            }
        } finally {
            this.d.a(map);
        }
    }

    @Override // com.inmobi.media.Fn
    public final void a(Context context, byte b) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.d.a(context, b);
    }

    @Override // com.inmobi.media.Fn
    public final void a() {
        InterfaceC3072m9 interfaceC3072m9 = this.f;
        if (interfaceC3072m9 != null) {
            Intrinsics.checkNotNullExpressionValue("vf", "TAG");
            ((C3097n9) interfaceC3072m9).c("vf", "destroy");
        }
        WeakReference weakReference = this.b;
        if (weakReference != null) {
            weakReference.clear();
        }
        try {
            this.e = null;
        } catch (Exception e) {
            InterfaceC3072m9 interfaceC3072m10 = this.f;
            if (interfaceC3072m10 != null) {
                Intrinsics.checkNotNullExpressionValue("vf", "TAG");
                ((C3097n9) interfaceC3072m10).a("vf", "Exception in destroy with message", e);
            }
        } finally {
            this.d.a();
        }
    }
}
