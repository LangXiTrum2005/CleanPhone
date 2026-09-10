package com.inmobi.media;

import android.view.ViewGroup;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import java.util.Map;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.flow.formularize;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.te, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3251te extends AbstractC3361y implements InterfaceC2830cj, Ck, InterfaceC2887f {
    public final C3276ue b;
    public final Jc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3251te(C3276ue provider, Jc stateMachine) {
        super(provider.g.a);
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.b = provider;
        this.c = stateMachine;
    }

    @Override // com.inmobi.media.InterfaceC2830cj
    public final void a() {
        InterfaceC3072m9 interfaceC3072m9L = l();
        if (interfaceC3072m9L != null) {
            ((C3097n9) interfaceC3072m9L).a("NativeRenderedState", "Initialize Called");
        }
        InterfaceC2830cj interfaceC2830cj = this.b.g.c.c;
        I i = interfaceC2830cj instanceof I ? (I) interfaceC2830cj : null;
        if (i != null) {
            i.g();
        }
        C3276ue c3276ue = this.b;
        C3230si c3230si = c3276ue.b;
        if (!c3230si.a) {
            c3230si.a = true;
            AbstractC2863e1 abstractC2863e1 = c3276ue.e;
            if (abstractC2863e1.c == null) {
                InterfaceC3072m9 interfaceC3072m9 = abstractC2863e1.b;
                if (interfaceC3072m9 != null) {
                    ((C3097n9) interfaceC3072m9).a(AbstractC2863e1.f, "Failed to startAdSession. adSession is null");
                }
            } else {
                InterfaceC3072m9 interfaceC3072m10 = abstractC2863e1.b;
                if (interfaceC3072m10 != null) {
                    ((C3097n9) interfaceC3072m10).a(AbstractC2863e1.f, "startAdSession");
                }
                P4.a(abstractC2863e1.a, new C2786b1(abstractC2863e1, null));
            }
            C3276ue c3276ue2 = this.b;
            AbstractC2863e1 abstractC2863e2 = c3276ue2.e;
            ViewGroup adView = c3276ue2.c.a.getParentView();
            abstractC2863e2.getClass();
            Intrinsics.checkNotNullParameter(adView, "adView");
            if (abstractC2863e2.c == null) {
                InterfaceC3072m9 interfaceC3072m11 = abstractC2863e2.b;
                if (interfaceC3072m11 != null) {
                    ((C3097n9) interfaceC3072m11).a(AbstractC2863e1.f, "Failed to registerAdView. adSession is null");
                }
            } else {
                InterfaceC3072m9 interfaceC3072m12 = abstractC2863e2.b;
                if (interfaceC3072m12 != null) {
                    ((C3097n9) interfaceC3072m12).a(AbstractC2863e1.f, "registerAdView");
                }
                P4.a(abstractC2863e2.a, new Y0(abstractC2863e2, adView, null));
            }
            G g = this.a.b;
            Intrinsics.checkNotNullParameter(g, "<this>");
            MetaInfo metaInfo = g.d;
            if (Intrinsics.wireman(metaInfo != null ? metaInfo.getCreativeType() : null, "video")) {
                this.b.e.a(true);
            } else {
                this.b.e.a();
            }
        }
        InterfaceC3072m9 interfaceC3072m9L2 = l();
        if (interfaceC3072m9L2 != null) {
            ((C3097n9) interfaceC3072m9L2).a("NativeRenderedState", "listenMediaEvents - setting up media event listener");
        }
        cutely.wireman(this.b.h, null, null, new C2902fe(((C3050lc) this.b.g.g.getValue()).e, null, this), 3, null);
        P4.a(this.b.h, new C2825ce(this, null));
        C3276ue c3276ue3 = this.b;
        if (c3276ue3.b.b) {
            InterfaceC3072m9 interfaceC3072m9L3 = l();
            if (interfaceC3072m9L3 != null) {
                ((C3097n9) interfaceC3072m9L3).a("NativeRenderedState", "Track Views Attached to Telemetry - Already triggered, skipping");
            }
        } else {
            cutely.wireman(c3276ue3.h, null, null, new C3201re(this, null), 3, null);
        }
        if (this.b.b.c) {
            InterfaceC3072m9 interfaceC3072m9L4 = l();
            if (interfaceC3072m9L4 != null) {
                ((C3097n9) interfaceC3072m9L4).a("NativeRenderedState", "Impression Tracking - Already triggered, skipping");
            }
        } else {
            G g2 = this.a.b;
            Intrinsics.checkNotNullParameter(g2, "<this>");
            if (g2.m.a == 0) {
                InterfaceC3072m9 interfaceC3072m9L5 = l();
                if (interfaceC3072m9L5 != null) {
                    ((C3097n9) interfaceC3072m9L5).a("NativeRenderedState", "Impression Event Occurred - Load (immediate fire)");
                }
                m();
            } else {
                cutely.wireman(this.b.h, null, null, new C3102ne(this, null), 3, null);
            }
        }
        if (!this.b.b.d) {
            if (AbstractC3391z4.a(this.a.b, "mrc50").isEmpty()) {
                InterfaceC3072m9 interfaceC3072m9L6 = l();
                if (interfaceC3072m9L6 != null) {
                    ((C3097n9) interfaceC3072m9L6).a("NativeRenderedState", "MRC50 Trackers unavailable");
                }
            } else {
                Map mapA = AbstractC2983ik.a(((Dc) this.b.g.f.getValue()).a);
                Wj wj = Wj.a;
                Wj.b("MRCViewable50Started", mapA, EnumC2779ak.SDK);
                cutely.wireman(this.b.h, null, null, new C3152pe(this, null), 3, null);
            }
        }
        C3050lc c3050lc = (C3050lc) this.b.g.g.getValue();
        formularize windowFlow = ((yo) this.b.l.getValue()).b;
        c3050lc.getClass();
        Intrinsics.checkNotNullParameter(windowFlow, "windowFlow");
        C3097n9 c3097n9 = c3050lc.a;
        if (c3097n9 != null) {
            c3097n9.a("MediaViewManager", "attachWindowLifecycleObserver called");
        }
        AbstractC2990j2 abstractC2990j2 = c3050lc.b;
        if (abstractC2990j2 != null) {
            abstractC2990j2.a(windowFlow);
        }
    }

    @Override // com.inmobi.media.InterfaceC2830cj
    public final void c() {
        InterfaceC3072m9 interfaceC3072m9L = l();
        if (interfaceC3072m9L != null) {
            ((C3097n9) interfaceC3072m9L).a("NativeRenderedState", "Finalize Called");
        }
        P4.a(this.b.k(), new C2851de(this, null));
        F3.a(this.b.h);
        ((Fd) this.b.k.getValue()).a.a();
        ((C2901fd) this.b.j.getValue()).a();
        H6.a(((yo) this.b.l.getValue()).a);
    }

    @Override // com.inmobi.media.Ck
    public final void d() {
        InterfaceC3072m9 interfaceC3072m9L = l();
        if (interfaceC3072m9L != null) {
            ((C3097n9) interfaceC3072m9L).a("NativeRenderedState", "unTrackViews");
        }
        C3050lc c3050lc = (C3050lc) this.b.g.g.getValue();
        C3097n9 c3097n9 = c3050lc.a;
        if (c3097n9 != null) {
            c3097n9.a("MediaViewManager", "detachObserversAndPause called");
        }
        AbstractC2990j2 abstractC2990j2 = c3050lc.b;
        if (abstractC2990j2 != null) {
            abstractC2990j2.b();
        }
        C3276ue c3276ue = this.b;
        Sg sg = c3276ue.c;
        this.c.a(new C3376ye(sg.c, sg.b, c3276ue.b, c3276ue.e, c3276ue.d, c3276ue.f, c3276ue.g, this.c), this);
    }

    public final void m() {
        InterfaceC3072m9 interfaceC3072m9L = l();
        if (interfaceC3072m9L != null) {
            ((C3097n9) interfaceC3072m9L).a("NativeRenderedState", "fireNativeImpression - Starting impression fire");
        }
        C3276ue c3276ue = this.b;
        c3276ue.b.c = true;
        Map mapA = AbstractC2983ik.a(((Dc) c3276ue.g.f.getValue()).a);
        Wj wj = Wj.a;
        Wj.b("AdImpressionSuccessful", mapA, EnumC2779ak.SDK);
        this.b.g.c.g();
        this.b.f.b.f.a(Te.a);
        AbstractC2863e1 abstractC2863e1 = this.b.e;
        if (abstractC2863e1.e == null) {
            InterfaceC3072m9 interfaceC3072m9 = abstractC2863e1.b;
            if (interfaceC3072m9 != null) {
                ((C3097n9) interfaceC3072m9).a(AbstractC2863e1.f, "Failed to registerImpression: AdEvent is null");
                return;
            }
            return;
        }
        InterfaceC3072m9 interfaceC3072m10 = abstractC2863e1.b;
        if (interfaceC3072m10 != null) {
            ((C3097n9) interfaceC3072m10).a(AbstractC2863e1.f, "registerImpression");
        }
        P4.a(abstractC2863e1.a, new Z0(abstractC2863e1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0122, code lost:
    
        if (r9.a(r2, r8, r0) == r1) goto L57;
     */
    @Override // com.inmobi.media.InterfaceC2887f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(wretchedly.dern r9) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3251te.a(wretchedly.dern):java.lang.Object");
    }
}
