package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.iab.omid.library.inmobi.Omid;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.ka, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3099ka extends We {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f23749h = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Xe f23750e;
    public C3035ga f;
    public final InterfaceC3333z5 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3099ka(InterfaceC3295x adContainer, Xe mViewableAd, C3035ga c3035ga, InterfaceC3333z5 interfaceC3333z5) {
        super(adContainer);
        Intrinsics.f(adContainer, "adContainer");
        Intrinsics.f(mViewableAd, "mViewableAd");
        this.f23750e = mViewableAd;
        this.f = c3035ga;
        this.g = interfaceC3333z5;
    }

    @Override // com.inmobi.media.Xe
    public final View a(View view, ViewGroup parent, boolean z2) {
        Intrinsics.f(parent, "parent");
        return this.f23750e.a(view, parent, z2);
    }

    @Override // com.inmobi.media.Xe
    public final View b() {
        return this.f23750e.b();
    }

    @Override // com.inmobi.media.Xe
    public final View d() {
        InterfaceC3333z5 interfaceC3333z5 = this.g;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("ka", "inflateView called");
        }
        return this.f23750e.d();
    }

    @Override // com.inmobi.media.Xe
    public final void e() {
        try {
            try {
                InterfaceC3333z5 interfaceC3333z5 = this.g;
                if (interfaceC3333z5 != null) {
                    ((A5) interfaceC3333z5).a("ka", "stopTrackingForImpression");
                }
                C3035ga c3035ga = this.f;
                if (c3035ga != null && C3035ga.a(c3035ga.f23637e, (byte) 2)) {
                    AdSession adSession = c3035ga.f;
                    if (adSession != null) {
                        adSession.finish();
                    }
                    c3035ga.f = null;
                    c3035ga.f23637e = (byte) 3;
                }
            } catch (Exception e2) {
                InterfaceC3333z5 interfaceC3333z6 = this.g;
                if (interfaceC3333z6 != null) {
                    ((A5) interfaceC3333z6).b("ka", "Exception in stopTrackingForImpression with message : " + e2.getMessage());
                }
            }
        } finally {
            this.f23750e.e();
        }
    }

    @Override // com.inmobi.media.Xe
    public final void a(View childView, FriendlyObstructionPurpose obstructionCode) {
        Intrinsics.f(childView, "childView");
        Intrinsics.f(obstructionCode, "obstructionCode");
        InterfaceC3333z5 interfaceC3333z5 = this.g;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("ka", "addFriendlyView with obstruction code: " + obstructionCode);
        }
        C3035ga c3035ga = this.f;
        if (c3035ga != null) {
            c3035ga.a(childView, obstructionCode);
        }
        this.f23750e.a(childView, obstructionCode);
    }

    @Override // com.inmobi.media.Xe
    public final void a(View childView) {
        Intrinsics.f(childView, "childView");
        C3035ga c3035ga = this.f;
        if (c3035ga != null) {
            byte b2 = c3035ga.f23637e;
            if (b2 > 0) {
                AdSession adSession = c3035ga.f;
                if (adSession != null) {
                    adSession.removeFriendlyObstruction(childView);
                }
            } else {
                S5 s5 = S5.f23167a;
                S5.d.a(new C3011f2(new Exception(androidx.datastore.preferences.protobuf.a.k("Omid AdSession State Error currentState :: ", b2, ", expectedState :: 1"))));
            }
        }
        this.f23750e.a(childView);
    }

    @Override // com.inmobi.media.Xe
    public final void a(Map map) {
        View view;
        InterfaceC3333z5 interfaceC3333z5 = this.g;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("ka", "startTrackingForImpression");
        }
        try {
            try {
                if (this.d.getViewability().getOmidConfig().isOmidEnabled()) {
                    AbstractC3147na.f23833a.getClass();
                    if (Omid.isActive()) {
                        InterfaceC3295x interfaceC3295x = this.f23351a;
                        if (interfaceC3295x instanceof T7) {
                            T7 t7 = (T7) interfaceC3295x;
                            view = t7.H;
                            if (view == null) {
                                view = t7.f23205I;
                            }
                        } else {
                            View viewB = this.f23750e.b();
                            view = viewB instanceof WebView ? (WebView) viewB : null;
                        }
                        if (view != null) {
                            InterfaceC3333z5 interfaceC3333z6 = this.g;
                            if (interfaceC3333z6 != null) {
                                ((A5) interfaceC3333z6).a("ka", "creating OMSDK session");
                            }
                            C3035ga c3035ga = this.f;
                            if (c3035ga != null) {
                                c3035ga.a(view, map, (View) null);
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                InterfaceC3333z5 interfaceC3333z7 = this.g;
                if (interfaceC3333z7 != null) {
                    ((A5) interfaceC3333z7).b("ka", "Exception in startTrackingForImpression with message : " + e2.getMessage());
                }
            }
        } finally {
            this.f23750e.a(map);
        }
    }

    @Override // com.inmobi.media.Xe
    public final void a(byte b2) {
        this.f23750e.a(b2);
    }

    @Override // com.inmobi.media.Xe
    public final void a(Context context, byte b2) {
        Intrinsics.f(context, "context");
        this.f23750e.a(context, b2);
    }

    @Override // com.inmobi.media.Xe
    public final void a() {
        InterfaceC3333z5 interfaceC3333z5 = this.g;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("ka", "destroy");
        }
        super.a();
        try {
            this.f = null;
        } catch (Exception e2) {
            InterfaceC3333z5 interfaceC3333z6 = this.g;
            if (interfaceC3333z6 != null) {
                ((A5) interfaceC3333z6).a("ka", "Exception in destroy with message", e2);
            }
        } finally {
            this.f23750e.a();
        }
    }
}
