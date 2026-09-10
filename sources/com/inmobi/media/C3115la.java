package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.Omid;
import com.iab.omid.library.inmobi.adsession.AdEvents;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.la, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3115la extends We {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final We f23786e;
    public C3035ga f;
    public final InterfaceC3333z5 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f23787h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3115la(T7 adContainer, We mViewableAd, C3035ga c3035ga, InterfaceC3333z5 interfaceC3333z5) {
        super(adContainer);
        Intrinsics.f(adContainer, "adContainer");
        Intrinsics.f(mViewableAd, "mViewableAd");
        this.f23786e = mViewableAd;
        this.f = c3035ga;
        this.g = interfaceC3333z5;
        this.f23787h = "la";
    }

    @Override // com.inmobi.media.Xe
    public final View a(View view, ViewGroup parent, boolean z2) {
        Intrinsics.f(parent, "parent");
        return this.f23786e.a(view, parent, z2);
    }

    @Override // com.inmobi.media.Xe
    public final View b() {
        return this.f23786e.b();
    }

    @Override // com.inmobi.media.Xe
    public final View d() {
        InterfaceC3333z5 interfaceC3333z5 = this.g;
        if (interfaceC3333z5 != null) {
            String TAG = this.f23787h;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).c(TAG, "inflateView");
        }
        return this.f23786e.d();
    }

    @Override // com.inmobi.media.Xe
    public final void e() {
        try {
            try {
                InterfaceC3333z5 interfaceC3333z5 = this.g;
                if (interfaceC3333z5 != null) {
                    String TAG = this.f23787h;
                    Intrinsics.e(TAG, "TAG");
                    ((A5) interfaceC3333z5).c(TAG, "stopTrackingForImpression");
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
                    String TAG2 = this.f23787h;
                    Intrinsics.e(TAG2, "TAG");
                    ((A5) interfaceC3333z6).b(TAG2, "Exception in stopTrackingForImpression with message : " + e2.getMessage());
                }
            }
        } finally {
            this.f23786e.e();
        }
    }

    @Override // com.inmobi.media.Xe
    public final void a(View childView, FriendlyObstructionPurpose obstructionCode) {
        Intrinsics.f(childView, "childView");
        Intrinsics.f(obstructionCode, "obstructionCode");
        this.f23786e.a(childView, obstructionCode);
    }

    public final void b(Map map) {
        View viewG;
        InterfaceC3333z5 interfaceC3333z5 = this.g;
        if (interfaceC3333z5 != null) {
            String TAG = this.f23787h;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).c(TAG, "registerView");
        }
        InterfaceC3295x interfaceC3295x = this.f23351a;
        if (!(interfaceC3295x instanceof T7) || (viewG = ((T7) interfaceC3295x).g()) == null) {
            return;
        }
        InterfaceC3333z5 interfaceC3333z6 = this.g;
        if (interfaceC3333z6 != null) {
            String TAG2 = this.f23787h;
            Intrinsics.e(TAG2, "TAG");
            ((A5) interfaceC3333z6).a(TAG2, "creating AD session");
        }
        C3035ga c3035ga = this.f;
        if (c3035ga != null) {
            c3035ga.a(viewG, map, this.f23786e.b());
        }
    }

    @Override // com.inmobi.media.Xe
    public final void a(View childView) {
        Intrinsics.f(childView, "childView");
        this.f23786e.a(childView);
    }

    @Override // com.inmobi.media.Xe
    public final void a(Map map) {
        InterfaceC3333z5 interfaceC3333z5 = this.g;
        if (interfaceC3333z5 != null) {
            String TAG = this.f23787h;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).a(TAG, "startTrackingForImpression");
        }
        try {
            try {
                if (this.d.getViewability().getOmidConfig().isOmidEnabled()) {
                    AbstractC3147na.f23833a.getClass();
                    if (Omid.isActive()) {
                        InterfaceC3333z5 interfaceC3333z6 = this.g;
                        if (interfaceC3333z6 != null) {
                            String TAG2 = this.f23787h;
                            Intrinsics.e(TAG2, "TAG");
                            ((A5) interfaceC3333z6).a(TAG2, "OMID enabled and initialised");
                        }
                        b(map);
                        a((byte) 19);
                    }
                }
            } catch (Exception e2) {
                InterfaceC3333z5 interfaceC3333z7 = this.g;
                if (interfaceC3333z7 != null) {
                    String TAG3 = this.f23787h;
                    Intrinsics.e(TAG3, "TAG");
                    ((A5) interfaceC3333z7).b(TAG3, "Exception in startTrackingForImpression with message : " + e2.getMessage());
                }
            }
        } finally {
            this.f23786e.a(map);
        }
    }

    @Override // com.inmobi.media.Xe
    public final void a(byte b2) {
        C3311y c3311y;
        AdEvents adEvents;
        AdEvents adEvents2;
        try {
            try {
                InterfaceC3333z5 interfaceC3333z5 = this.g;
                if (interfaceC3333z5 != null) {
                    String TAG = this.f23787h;
                    Intrinsics.e(TAG, "TAG");
                    ((A5) interfaceC3333z5).c(TAG, "onAdEvent - event - " + ((int) b2));
                }
                C3035ga c3035ga = this.f;
                if (c3035ga != null && C3035ga.a(c3035ga.f23637e, (byte) 2)) {
                    byte b3 = b2;
                    if (b3 == 0) {
                        C3311y c3311y2 = c3035ga.g;
                        if (c3311y2 != null && (adEvents2 = c3311y2.f24111a) != null) {
                            adEvents2.impressionOccurred();
                        }
                    } else if (b3 == 19 && (c3311y = c3035ga.g) != null && (adEvents = c3311y.f24111a) != null) {
                        adEvents.loaded();
                    }
                }
            } catch (Exception e2) {
                InterfaceC3333z5 interfaceC3333z6 = this.g;
                if (interfaceC3333z6 != null) {
                    String TAG2 = this.f23787h;
                    Intrinsics.e(TAG2, "TAG");
                    ((A5) interfaceC3333z6).b(TAG2, "Exception in onAdEvent with message : " + e2.getMessage());
                }
            }
        } finally {
            this.f23786e.a(b2);
        }
    }

    @Override // com.inmobi.media.Xe
    public final void a(Context context, byte b2) {
        Intrinsics.f(context, "context");
        this.f23786e.a(context, b2);
    }

    @Override // com.inmobi.media.Xe
    public final void a() {
        super.a();
        InterfaceC3333z5 interfaceC3333z5 = this.g;
        if (interfaceC3333z5 != null) {
            String TAG = this.f23787h;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).c(TAG, "destroy");
        }
        try {
            this.f = null;
        } catch (Exception e2) {
            InterfaceC3333z5 interfaceC3333z6 = this.g;
            if (interfaceC3333z6 != null) {
                String TAG2 = this.f23787h;
                Intrinsics.e(TAG2, "TAG");
                ((A5) interfaceC3333z6).b(TAG2, "Exception in destroy with message : " + e2.getMessage());
            }
        } finally {
            this.f23786e.a();
        }
    }
}
