package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.Omid;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.inmobi.adsession.media.VastProperties;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.ma, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3131ma extends We {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final We f23816e;
    public C3035ga f;
    public final VastProperties g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InterfaceC3333z5 f23817h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f23818i;
    public final float j;
    public final WeakReference k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public WeakReference f23819l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3131ma(Context context, We mViewableAd, C2934a9 adContainer, C3035ga c3035ga, VastProperties mVastProperties, InterfaceC3333z5 interfaceC3333z5) {
        super(adContainer);
        Intrinsics.f(context, "context");
        Intrinsics.f(mViewableAd, "mViewableAd");
        Intrinsics.f(adContainer, "adContainer");
        Intrinsics.f(mVastProperties, "mVastProperties");
        this.f23816e = mViewableAd;
        this.f = c3035ga;
        this.g = mVastProperties;
        this.f23817h = interfaceC3333z5;
        this.f23818i = "ma";
        this.j = 1.0f;
        this.k = new WeakReference(context);
    }

    @Override // com.inmobi.media.Xe
    public final View a(View view, ViewGroup parent, boolean z2) {
        Intrinsics.f(parent, "parent");
        return this.f23816e.a(view, parent, z2);
    }

    @Override // com.inmobi.media.Xe
    public final View b() {
        return this.f23816e.b();
    }

    @Override // com.inmobi.media.Xe
    public final C3304x8 c() {
        return this.f23816e.c();
    }

    @Override // com.inmobi.media.Xe
    public final View d() {
        return this.f23816e.d();
    }

    @Override // com.inmobi.media.Xe
    public final void e() {
        try {
            InterfaceC3295x interfaceC3295x = this.f23351a;
            if ((interfaceC3295x instanceof C2934a9) && !((C2934a9) interfaceC3295x).k()) {
                C3035ga c3035ga = this.f;
                if (c3035ga != null && C3035ga.a(c3035ga.f23637e, (byte) 2)) {
                    AdSession adSession = c3035ga.f;
                    if (adSession != null) {
                        adSession.finish();
                    }
                    c3035ga.f = null;
                    c3035ga.f23637e = (byte) 3;
                }
                InterfaceC3333z5 interfaceC3333z5 = this.f23817h;
                if (interfaceC3333z5 != null) {
                    String TAG = this.f23818i;
                    Intrinsics.e(TAG, "TAG");
                    StringBuilder sb = new StringBuilder("Unregistered VideoView to OMID AdSession : ");
                    C3035ga c3035ga2 = this.f;
                    sb.append(c3035ga2 != null ? c3035ga2.hashCode() : 0);
                    ((A5) interfaceC3333z5).a(TAG, sb.toString());
                }
            }
        } catch (Exception e2) {
            InterfaceC3333z5 interfaceC3333z6 = this.f23817h;
            if (interfaceC3333z6 != null) {
                String TAG2 = this.f23818i;
                Intrinsics.e(TAG2, "TAG");
                ((A5) interfaceC3333z6).b(TAG2, "Exception in stopTrackingForImpression with message : " + e2.getMessage());
            }
            S5 s5 = S5.f23167a;
            S5.d.a(new C3011f2(e2));
        } finally {
            this.f23816e.e();
        }
    }

    @Override // com.inmobi.media.Xe
    public final void a(View childView, FriendlyObstructionPurpose obstructionCode) {
        Intrinsics.f(childView, "childView");
        Intrinsics.f(obstructionCode, "obstructionCode");
        C3035ga c3035ga = this.f;
        if (c3035ga != null) {
            c3035ga.a(childView, obstructionCode);
        }
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
                    return;
                }
                return;
            }
            S5 s5 = S5.f23167a;
            S5.d.a(new C3011f2(new Exception(androidx.datastore.preferences.protobuf.a.k("Omid AdSession State Error currentState :: ", b2, ", expectedState :: 1"))));
        }
    }

    @Override // com.inmobi.media.Xe
    public final void a(Map map) {
        try {
            InterfaceC3333z5 interfaceC3333z5 = this.f23817h;
            if (interfaceC3333z5 != null) {
                String TAG = this.f23818i;
                Intrinsics.e(TAG, "TAG");
                ((A5) interfaceC3333z5).c(TAG, "startTrackingForImpression");
            }
            if (this.d.getViewability().getOmidConfig().isOmidEnabled()) {
                AbstractC3147na.f23833a.getClass();
                if (Omid.isActive()) {
                    InterfaceC3333z5 interfaceC3333z6 = this.f23817h;
                    if (interfaceC3333z6 != null) {
                        String TAG2 = this.f23818i;
                        Intrinsics.e(TAG2, "TAG");
                        ((A5) interfaceC3333z6).a(TAG2, "OMID enabled and OM SDK initialised");
                    }
                    InterfaceC3295x interfaceC3295x = this.f23351a;
                    if (interfaceC3295x instanceof C2934a9) {
                        View videoContainerView = ((C2934a9) interfaceC3295x).getVideoContainerView();
                        C3130m9 c3130m9 = videoContainerView instanceof C3130m9 ? (C3130m9) videoContainerView : null;
                        if (c3130m9 != null) {
                            C3002e9 mediaController = c3130m9.getVideoView().getMediaController();
                            this.f23819l = new WeakReference(c3130m9);
                            InterfaceC3333z5 interfaceC3333z7 = this.f23817h;
                            if (interfaceC3333z7 != null) {
                                String TAG3 = this.f23818i;
                                Intrinsics.e(TAG3, "TAG");
                                ((A5) interfaceC3333z7).a(TAG3, "creating new OM SDK ad session");
                            }
                            C3035ga c3035ga = this.f;
                            if (c3035ga != null) {
                                c3035ga.a(c3130m9, mediaController != null ? mediaController.getFriendlyViews() : null, this.f23816e.b());
                            }
                            InterfaceC3333z5 interfaceC3333z8 = this.f23817h;
                            if (interfaceC3333z8 != null) {
                                String TAG4 = this.f23818i;
                                Intrinsics.e(TAG4, "TAG");
                                StringBuilder sb = new StringBuilder("Registered ad view with OMID Video AdSession ");
                                C3035ga c3035ga2 = this.f;
                                sb.append(c3035ga2 != null ? c3035ga2.hashCode() : 0);
                                ((A5) interfaceC3333z8).a(TAG4, sb.toString());
                            }
                        }
                    }
                }
            }
        } catch (Exception e2) {
            InterfaceC3333z5 interfaceC3333z9 = this.f23817h;
            if (interfaceC3333z9 != null) {
                String TAG5 = this.f23818i;
                Intrinsics.e(TAG5, "TAG");
                ((A5) interfaceC3333z9).b(TAG5, "Exception in startTrackingForImpression with message : " + e2.getMessage());
            }
            S5 s5 = S5.f23167a;
            S5.d.a(new C3011f2(e2));
        } finally {
            this.f23816e.a(map);
        }
    }

    @Override // com.inmobi.media.Xe
    public final void a(byte b2) {
        try {
            InterfaceC3333z5 interfaceC3333z5 = this.f23817h;
            if (interfaceC3333z5 != null) {
                String TAG = this.f23818i;
                Intrinsics.e(TAG, "TAG");
                ((A5) interfaceC3333z5).a(TAG, "onAdView - event - " + ((int) b2));
            }
            float fA = this.j;
            int duration = 0;
            if (b2 == 13) {
                fA = 0.0f;
            } else if (b2 != 14) {
                if (b2 == 6) {
                    InterfaceC3295x interfaceC3295x = this.f23351a;
                    if (interfaceC3295x instanceof C2934a9) {
                        View videoContainerView = ((C2934a9) interfaceC3295x).getVideoContainerView();
                        C3130m9 c3130m9 = videoContainerView instanceof C3130m9 ? (C3130m9) videoContainerView : null;
                        if (c3130m9 != null) {
                            duration = c3130m9.getVideoView().getDuration();
                            Object tag = c3130m9.getVideoView().getTag();
                            fA = a(tag instanceof C2968c9 ? (C2968c9) tag : null);
                        }
                    }
                } else if (b2 == 5) {
                    InterfaceC3295x interfaceC3295x2 = this.f23351a;
                    if ((interfaceC3295x2 instanceof C2934a9) && ((C2934a9) interfaceC3295x2).k()) {
                        return;
                    }
                }
            }
            C3035ga c3035ga = this.f;
            if (c3035ga != null) {
                c3035ga.a(b2, duration, fA, this.g);
            }
        } catch (Exception e2) {
            InterfaceC3333z5 interfaceC3333z6 = this.f23817h;
            if (interfaceC3333z6 != null) {
                String TAG2 = this.f23818i;
                Intrinsics.e(TAG2, "TAG");
                ((A5) interfaceC3333z6).b(TAG2, "Exception in onAdEvent with message : " + e2.getMessage());
            }
            S5 s5 = S5.f23167a;
            S5.d.a(new C3011f2(e2));
        } finally {
            this.f23816e.a(b2);
        }
    }

    @Override // com.inmobi.media.Xe
    public final void a(Context context, byte b2) {
        Intrinsics.f(context, "context");
        InterfaceC3333z5 interfaceC3333z5 = this.f23817h;
        if (interfaceC3333z5 != null) {
            String str = this.f23818i;
            ((A5) interfaceC3333z5).c(str, X8.a(str, "TAG", "onActivityStateChanged - state - ", b2));
        }
        this.f23816e.a(context, b2);
    }

    @Override // com.inmobi.media.Xe
    public final void a() {
        super.a();
        InterfaceC3333z5 interfaceC3333z5 = this.f23817h;
        if (interfaceC3333z5 != null) {
            String TAG = this.f23818i;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).a(TAG, "destroy");
        }
        try {
            try {
                this.k.clear();
                WeakReference weakReference = this.f23819l;
                if (weakReference != null) {
                    weakReference.clear();
                }
                this.f = null;
            } catch (Exception e2) {
                InterfaceC3333z5 interfaceC3333z6 = this.f23817h;
                if (interfaceC3333z6 != null) {
                    String TAG2 = this.f23818i;
                    Intrinsics.e(TAG2, "TAG");
                    ((A5) interfaceC3333z6).b(TAG2, "Exception in destroy with message : " + e2.getMessage());
                }
                S5 s5 = S5.f23167a;
                S5.d.a(new C3011f2(e2));
            }
        } finally {
            this.f23816e.a();
        }
    }

    public final float a(C2968c9 c2968c9) {
        if (c2968c9 == null) {
            return 0.0f;
        }
        Object obj = c2968c9.t.get("currentMediaVolume");
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        Object obj2 = c2968c9.t.get("lastMediaVolume");
        Integer num2 = obj2 instanceof Integer ? (Integer) obj2 : null;
        if (num == null || num2 == null || num.intValue() <= 0 || num2.intValue() != 0) {
            return 0.0f;
        }
        return this.j;
    }
}
