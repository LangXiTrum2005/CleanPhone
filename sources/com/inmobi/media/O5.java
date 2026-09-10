package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class O5 extends Xe {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3117lc f23034e;
    public final S4 f;
    public final InterfaceC3333z5 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f23035h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O5(C3117lc container, C3117lc renderView, S4 htmlAdTracker, InterfaceC3333z5 interfaceC3333z5) {
        super(container);
        Intrinsics.f(container, "container");
        Intrinsics.f(renderView, "renderView");
        Intrinsics.f(htmlAdTracker, "htmlAdTracker");
        this.f23034e = renderView;
        this.f = htmlAdTracker;
        this.g = interfaceC3333z5;
        this.f23035h = "O5";
    }

    @Override // com.inmobi.media.Xe
    public final void a(byte b2) {
    }

    @Override // com.inmobi.media.Xe
    public final View d() {
        this.f23353c = new WeakReference(this.f23034e);
        return this.f23034e;
    }

    @Override // com.inmobi.media.Xe
    public final void e() {
        InterfaceC3333z5 interfaceC3333z5 = this.g;
        if (interfaceC3333z5 != null) {
            String TAG = this.f23035h;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).a(TAG, "stopTrackingForImpression");
        }
        InterfaceC3333z5 interfaceC3333z6 = this.g;
        if (interfaceC3333z6 != null) {
            String TAG2 = this.f23035h;
            Intrinsics.e(TAG2, "TAG");
            ((A5) interfaceC3333z6).a(TAG2, "stopTrackingForVisibility");
        }
        S4 s4 = this.f;
        View viewB = b();
        if (viewB == null) {
            return;
        }
        s4.b(viewB);
    }

    @Override // com.inmobi.media.Xe
    public final View a(View view, ViewGroup parent, boolean z2) {
        Intrinsics.f(parent, "parent");
        return d();
    }

    @Override // com.inmobi.media.Xe
    public final void a(Map map) {
        View viewB;
        InterfaceC3333z5 interfaceC3333z5 = this.g;
        if (interfaceC3333z5 != null) {
            String str = this.f23035h;
            StringBuilder sbA = H6.a(str, "TAG", "startTrackingForImpression with ");
            sbA.append(map != null ? Integer.valueOf(map.size()) : null);
            sbA.append(" friendly views");
            ((A5) interfaceC3333z5).a(str, sbA.toString());
        }
        this.f23034e.setFriendlyViews(map);
        InterfaceC3333z5 interfaceC3333z6 = this.g;
        if (interfaceC3333z6 != null) {
            String TAG = this.f23035h;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z6).a(TAG, "startTrackingVisibility");
        }
        InterfaceC3295x interfaceC3295x = this.f23351a;
        C3117lc c3117lc = interfaceC3295x instanceof C3117lc ? (C3117lc) interfaceC3295x : null;
        if (c3117lc == null) {
            return;
        }
        S4 s4 = this.f;
        View viewB2 = b();
        if (viewB2 == null || (viewB = b()) == null) {
            return;
        }
        s4.a(viewB2, viewB, c3117lc.getVISIBILITY_CHANGE_LISTENER(), this.d.getViewability(), true);
    }

    @Override // com.inmobi.media.Xe
    public final void a(View childView, FriendlyObstructionPurpose obstructionCode) {
        Intrinsics.f(childView, "childView");
        Intrinsics.f(obstructionCode, "obstructionCode");
        InterfaceC3333z5 interfaceC3333z5 = this.g;
        if (interfaceC3333z5 != null) {
            String TAG = this.f23035h;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).a(TAG, "addFriendlyView - childView: " + childView + ", obstructionCode: " + obstructionCode);
        }
        Map<View, FriendlyObstructionPurpose> friendlyViews = this.f23034e.getFriendlyViews();
        if (friendlyViews != null) {
            friendlyViews.put(childView, obstructionCode);
        }
        I exposureTracker = this.f23034e.getExposureTracker();
        if (exposureTracker != null) {
            InterfaceC3333z5 interfaceC3333z6 = exposureTracker.f22869e;
            if (interfaceC3333z6 != null) {
                ((A5) interfaceC3333z6).c("AdExposureTracker", "Adding friendly view: " + childView);
            }
            Set set = exposureTracker.f22867b;
            if (set != null) {
                set.add(childView);
            }
        }
    }

    @Override // com.inmobi.media.Xe
    public final void a(View childView) {
        Intrinsics.f(childView, "childView");
        Map<View, FriendlyObstructionPurpose> friendlyViews = this.f23034e.getFriendlyViews();
        if (friendlyViews != null) {
            friendlyViews.remove(childView);
        }
        I exposureTracker = this.f23034e.getExposureTracker();
        if (exposureTracker != null) {
            InterfaceC3333z5 interfaceC3333z5 = exposureTracker.f22869e;
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).c("AdExposureTracker", "Removing friendly view: " + childView);
            }
            Set set = exposureTracker.f22867b;
            if (set != null) {
                set.remove(childView);
            }
        }
    }

    @Override // com.inmobi.media.Xe
    public final void a(Context context, byte b2) {
        Intrinsics.f(context, "context");
        InterfaceC3333z5 interfaceC3333z5 = this.g;
        if (interfaceC3333z5 != null) {
            String str = this.f23035h;
            ((A5) interfaceC3333z5).a(str, X8.a(str, "TAG", "onActivityStateChanged - state - ", b2));
        }
        try {
            if (b2 == 0) {
                S4 s4 = this.f;
                InterfaceC3333z5 interfaceC3333z6 = s4.f;
                if (interfaceC3333z6 != null) {
                    ((A5) interfaceC3333z6).c("HtmlAdTracker", "onActivityStarted");
                }
                C3030g5 c3030g5 = s4.g;
                if (c3030g5 != null) {
                    String TAG = c3030g5.d;
                    Intrinsics.e(TAG, "TAG");
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
                X4 x4 = s4.f23165h;
                if (x4 != null) {
                    x4.f();
                    return;
                }
                return;
            }
            if (b2 == 1) {
                S4 s5 = this.f;
                InterfaceC3333z5 interfaceC3333z7 = s5.f;
                if (interfaceC3333z7 != null) {
                    ((A5) interfaceC3333z7).c("HtmlAdTracker", "onActivityStopped");
                }
                C3030g5 c3030g6 = s5.g;
                if (c3030g6 != null) {
                    String TAG2 = c3030g6.d;
                    Intrinsics.e(TAG2, "TAG");
                    c3030g6.f23627c.a();
                    c3030g6.f23628e.removeCallbacksAndMessages(null);
                    c3030g6.f23626b.clear();
                }
                X4 x5 = s5.f23165h;
                if (x5 != null) {
                    x5.e();
                    return;
                }
                return;
            }
            if (b2 == 2) {
                S4 s6 = this.f;
                InterfaceC3333z5 interfaceC3333z8 = s6.f;
                if (interfaceC3333z8 != null) {
                    ((A5) interfaceC3333z8).c("HtmlAdTracker", "onActivityDestroyed");
                }
                C3030g5 c3030g7 = s6.g;
                if (c3030g7 != null) {
                    c3030g7.f23625a.clear();
                    c3030g7.f23626b.clear();
                    c3030g7.f23627c.a();
                    c3030g7.f23628e.removeMessages(0);
                    c3030g7.f23627c.b();
                }
                s6.g = null;
                X4 x6 = s6.f23165h;
                if (x6 != null) {
                    x6.b();
                }
                s6.f23165h = null;
                return;
            }
            String TAG3 = this.f23035h;
            Intrinsics.e(TAG3, "TAG");
        } catch (Exception e2) {
            InterfaceC3333z5 interfaceC3333z9 = this.g;
            if (interfaceC3333z9 != null) {
                String str2 = this.f23035h;
                ((A5) interfaceC3333z9).b(str2, rf.a(e2, H6.a(str2, "TAG", "Exception in onActivityStateChanged with message : ")));
            }
            S5 s7 = S5.f23167a;
            S5.d.a(AbstractC3285w5.a(e2, "event"));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.inmobi.media.Xe
    public final void a() {
        InterfaceC3333z5 interfaceC3333z5 = this.g;
        if (interfaceC3333z5 != null) {
            String TAG = this.f23035h;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).a(TAG, "destroy");
        }
        if (b() != null) {
            InterfaceC3333z5 interfaceC3333z6 = this.g;
            if (interfaceC3333z6 != null) {
                String TAG2 = this.f23035h;
                Intrinsics.e(TAG2, "TAG");
                ((A5) interfaceC3333z6).a(TAG2, "stopTrackingForVisibility");
            }
            S4 s4 = this.f;
            View viewB = b();
            if (viewB != null) {
                s4.b(viewB);
            }
        }
        super.a();
    }
}
