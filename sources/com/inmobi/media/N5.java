package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.commons.core.configs.AdConfig;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class N5 extends We {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2934a9 f22998e;
    public final C2974cf f;
    public final InterfaceC3333z5 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f22999h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final WeakReference f23000i;
    public final Z7 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N5(C2934a9 mAdContainer, C2974cf mViewableAd, InterfaceC3333z5 interfaceC3333z5) {
        super(mAdContainer);
        Intrinsics.f(mAdContainer, "mAdContainer");
        Intrinsics.f(mViewableAd, "mViewableAd");
        this.f22998e = mAdContainer;
        this.f = mViewableAd;
        this.g = interfaceC3333z5;
        this.f22999h = "N5";
        this.f23000i = new WeakReference(mAdContainer.j());
        this.j = new Z7((byte) 0, interfaceC3333z5);
    }

    @Override // com.inmobi.media.Xe
    public final View a(View view, ViewGroup parent, boolean z2) {
        Intrinsics.f(parent, "parent");
        InterfaceC3333z5 interfaceC3333z5 = this.g;
        if (interfaceC3333z5 != null) {
            String TAG = this.f22999h;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).c(TAG, "inflate view");
        }
        View viewB = this.f.b();
        Context context = (Context) this.f23000i.get();
        if (viewB != null && context != null) {
            this.j.a(context, viewB, this.f22998e);
        }
        return this.f.a(view, parent, z2);
    }

    @Override // com.inmobi.media.Xe
    public final View b() {
        return this.f.b();
    }

    @Override // com.inmobi.media.Xe
    public final C3304x8 c() {
        return this.f.f23352b;
    }

    @Override // com.inmobi.media.Xe
    public final void e() {
        InterfaceC3333z5 interfaceC3333z5 = this.g;
        if (interfaceC3333z5 != null) {
            String TAG = this.f22999h;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).a(TAG, "stop tracking for impression");
        }
        try {
            Context context = (Context) this.f23000i.get();
            if (context != null) {
                InterfaceC3333z5 interfaceC3333z6 = this.g;
                if (interfaceC3333z6 != null) {
                    String TAG2 = this.f22999h;
                    Intrinsics.e(TAG2, "TAG");
                    ((A5) interfaceC3333z6).a(TAG2, "stop tracking");
                }
                this.j.a(context, this.f22998e);
            }
        } catch (Exception e2) {
            InterfaceC3333z5 interfaceC3333z7 = this.g;
            if (interfaceC3333z7 != null) {
                String TAG3 = this.f22999h;
                Intrinsics.e(TAG3, "TAG");
                ((A5) interfaceC3333z7).b(TAG3, "Exception in stopTrackingForImpression with message : " + e2.getMessage());
            }
            S5 s5 = S5.f23167a;
            S5.d.a(new C3011f2(e2));
        } finally {
            this.f.getClass();
        }
    }

    @Override // com.inmobi.media.Xe
    public final void a(View childView, FriendlyObstructionPurpose obstructionCode) {
        Intrinsics.f(childView, "childView");
        Intrinsics.f(obstructionCode, "obstructionCode");
        this.f.getClass();
    }

    @Override // com.inmobi.media.Xe
    public final void a(View childView) {
        Intrinsics.f(childView, "childView");
        this.f.getClass();
    }

    @Override // com.inmobi.media.Xe
    public final void a(Map map) {
        InterfaceC3333z5 interfaceC3333z5 = this.g;
        if (interfaceC3333z5 != null) {
            String str = this.f22999h;
            StringBuilder sbA = H6.a(str, "TAG", "start tracking impression with ");
            sbA.append(map != null ? Integer.valueOf(map.size()) : null);
            sbA.append(" friendlyViews");
            ((A5) interfaceC3333z5).a(str, sbA.toString());
        }
        try {
            try {
                View videoContainerView = this.f23351a.getVideoContainerView();
                C3130m9 c3130m9 = videoContainerView instanceof C3130m9 ? (C3130m9) videoContainerView : null;
                Context context = (Context) this.f23000i.get();
                AdConfig.ViewabilityConfig viewability = this.d.getViewability();
                if (context != null && c3130m9 != null && !this.f22998e.t) {
                    C3114l9 videoView = c3130m9.getVideoView();
                    InterfaceC3333z5 interfaceC3333z6 = this.g;
                    if (interfaceC3333z6 != null) {
                        String TAG = this.f22999h;
                        Intrinsics.e(TAG, "TAG");
                        ((A5) interfaceC3333z6).a(TAG, "start tracking");
                    }
                    this.j.a(context, videoView, this.f22998e, viewability);
                    View viewB = this.f.b();
                    Object tag = videoView.getTag();
                    C2968c9 c2968c9 = tag instanceof C2968c9 ? (C2968c9) tag : null;
                    if (c2968c9 != null && viewB != null && a(c2968c9)) {
                        InterfaceC3333z5 interfaceC3333z7 = this.g;
                        if (interfaceC3333z7 != null) {
                            String TAG2 = this.f22999h;
                            Intrinsics.e(TAG2, "TAG");
                            ((A5) interfaceC3333z7).a(TAG2, "start tracking inline ad");
                        }
                        Z7 z7 = this.j;
                        C2934a9 c2934a9 = this.f22998e;
                        z7.a(context, viewB, c2934a9, c2934a9.f23439b0, viewability);
                    }
                }
            } catch (Exception e2) {
                InterfaceC3333z5 interfaceC3333z8 = this.g;
                if (interfaceC3333z8 != null) {
                    String TAG3 = this.f22999h;
                    Intrinsics.e(TAG3, "TAG");
                    ((A5) interfaceC3333z8).b(TAG3, "Exception in startTrackingForImpression with message : " + e2.getMessage());
                }
                S5 s5 = S5.f23167a;
                S5.d.a(new C3011f2(e2));
            }
        } finally {
            this.f.getClass();
        }
    }

    @Override // com.inmobi.media.Xe
    public final void a(byte b2) {
        InterfaceC3333z5 interfaceC3333z5 = this.g;
        if (interfaceC3333z5 != null) {
            String str = this.f22999h;
            ((A5) interfaceC3333z5).a(str, X8.a(str, "TAG", "Received event : ", b2));
        }
        this.f.getClass();
    }

    @Override // com.inmobi.media.Xe
    public final void a(Context context, byte b2) {
        C2974cf c2974cf;
        Intrinsics.f(context, "context");
        InterfaceC3333z5 interfaceC3333z5 = this.g;
        if (interfaceC3333z5 != null) {
            String str = this.f22999h;
            ((A5) interfaceC3333z5).c(str, X8.a(str, "TAG", "onActivityStateChanged state - ", b2));
        }
        try {
            try {
                if (b2 == 0) {
                    Z7 z7 = this.j;
                    z7.getClass();
                    C3030g5 c3030g5 = (C3030g5) z7.d.get(context);
                    if (c3030g5 != null) {
                        Intrinsics.e(c3030g5.d, "TAG");
                        for (Map.Entry entry : c3030g5.f23625a.entrySet()) {
                            View view = (View) entry.getKey();
                            C2998e5 c2998e5 = (C2998e5) entry.getValue();
                            c3030g5.f23627c.a(view, c2998e5.f23546a, c2998e5.f23547b);
                        }
                        if (!c3030g5.f23628e.hasMessages(0)) {
                            c3030g5.f23628e.postDelayed(c3030g5.f, c3030g5.g);
                        }
                        c3030g5.f23627c.f();
                    }
                } else if (b2 == 1) {
                    Z7 z8 = this.j;
                    z8.getClass();
                    C3030g5 c3030g6 = (C3030g5) z8.d.get(context);
                    if (c3030g6 != null) {
                        Intrinsics.e(c3030g6.d, "TAG");
                        c3030g6.f23627c.a();
                        c3030g6.f23628e.removeCallbacksAndMessages(null);
                        c3030g6.f23626b.clear();
                    }
                } else if (b2 == 2) {
                    Z7 z9 = this.j;
                    z9.getClass();
                    InterfaceC3333z5 interfaceC3333z6 = z9.f23401b;
                    if (interfaceC3333z6 != null) {
                        String TAG = z9.f23402c;
                        Intrinsics.e(TAG, "TAG");
                        ((A5) interfaceC3333z6).a(TAG, "Activity destroyed, removing impression tracker");
                    }
                    C3030g5 c3030g7 = (C3030g5) z9.d.remove(context);
                    if (c3030g7 != null) {
                        c3030g7.f23625a.clear();
                        c3030g7.f23626b.clear();
                        c3030g7.f23627c.a();
                        c3030g7.f23628e.removeMessages(0);
                        c3030g7.f23627c.b();
                    }
                    if (context instanceof Activity) {
                        z9.d.isEmpty();
                    }
                } else {
                    InterfaceC3333z5 interfaceC3333z7 = this.g;
                    if (interfaceC3333z7 != null) {
                        String TAG2 = this.f22999h;
                        Intrinsics.e(TAG2, "TAG");
                        ((A5) interfaceC3333z7).b(TAG2, "UnHandled sate ( " + ((int) b2) + " ) received in onActivityStateChanged()");
                    }
                }
                c2974cf = this.f;
            } catch (Exception e2) {
                InterfaceC3333z5 interfaceC3333z8 = this.g;
                if (interfaceC3333z8 != null) {
                    String TAG3 = this.f22999h;
                    Intrinsics.e(TAG3, "TAG");
                    ((A5) interfaceC3333z8).b(TAG3, "Exception in onActivityStateChanged with message : " + e2.getMessage());
                }
                S5 s5 = S5.f23167a;
                S5.d.a(new C3011f2(e2));
                c2974cf = this.f;
            }
            c2974cf.getClass();
        } catch (Throwable th) {
            this.f.getClass();
            throw th;
        }
    }

    @Override // com.inmobi.media.Xe
    public final void a() {
        InterfaceC3333z5 interfaceC3333z5 = this.g;
        if (interfaceC3333z5 != null) {
            String TAG = this.f22999h;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).a(TAG, "destroy");
        }
        Context context = (Context) this.f23000i.get();
        View viewB = this.f.b();
        if (context != null && viewB != null) {
            this.j.a(context, viewB, this.f22998e);
        }
        super.a();
        this.f23000i.clear();
        this.f.a();
    }

    public final boolean a(C2968c9 c2968c9) {
        Object obj = c2968c9.t.get("isFullScreen");
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        return this.f22998e.f23211a == 0 && !(bool != null ? bool.booleanValue() : false);
    }
}
