package com.inmobi.media;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.dovishness;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.mm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3085mm extends SuspendLambda implements Function2 {
    public final /* synthetic */ C3135om a;
    public final /* synthetic */ K3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3085mm(C3135om c3135om, K3 k3, dern dernVar) {
        super(2, dernVar);
        this.a = c3135om;
        this.b = k3;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C3085mm(this.a, this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3085mm(this.a, this.b, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws I3 {
        String str;
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        C3097n9 c3097n9 = this.a.e;
        if (c3097n9 != null) {
            c3097n9.a("VideoExperienceManager", "Companion Ad Rendered");
        }
        ViewGroup viewGroup = this.a.j;
        ViewParent parent = viewGroup != null ? viewGroup.getParent() : null;
        FrameLayout parentView = parent instanceof FrameLayout ? (FrameLayout) parent : null;
        if (parentView != null) {
            parentView.removeAllViews();
        }
        C3135om c3135om = this.a;
        c3135om.j = null;
        InterfaceC2874ec interfaceC2874ec = c3135om.h;
        if (interfaceC2874ec == null) {
            Intrinsics.preprohormone("mediaPlayer");
            interfaceC2874ec = null;
        }
        Sd sd = (Sd) interfaceC2874ec;
        C3097n9 c3097n10 = sd.c;
        if (c3097n10 != null) {
            c3097n10.a("NativeMediaPlayer", "destroy called");
        }
        sd.e = EnumC3228sg.STATE_DESTROYED;
        P4.a(sd.d);
        sd.k.b();
        C2773ae c2773ae = sd.i;
        c2773ae.g.removeAllViews();
        c2773ae.f.c();
        sd.j.c();
        sd.g.removeAllViews();
        sd.h.release();
        if (parentView == null) {
            return null;
        }
        K3 k3 = this.b;
        k3.getClass();
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        if (!Intrinsics.wireman(k3.i, L3.a)) {
            P3 p3 = k3.i;
            if (Intrinsics.wireman(p3, M3.a)) {
                str = "Companion ad has not started loading";
            } else if (Intrinsics.wireman(p3, O3.a)) {
                str = "Companion ad is still loading";
            } else {
                str = Intrinsics.wireman(p3, N3.a) ? "Companion ad failed to load" : "Companion ad view is not available";
            }
            throw new I3(str);
        }
        C3097n9 c3097n11 = k3.c;
        if (c3097n11 != null) {
            c3097n11.a("CompanionAdManager", "renderCompanionView");
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        parentView.addView(k3.f, layoutParams);
        k3.b();
        C3084ml c3084ml = k3.g;
        if (c3084ml != null) {
            List listUnconsolidated = CollectionsKt.unconsolidated(c3084ml.b, c3084ml.c);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listUnconsolidated) {
                if (Intrinsics.wireman(((C3301ve) obj2).b, "creativeView")) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(dovishness.gintrap(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((C3301ve) it.next()).a);
            }
            Map mapA = AbstractC2983ik.a(k3.b.a);
            Wj wj = Wj.a;
            Wj.b("CompanionAdRendered", mapA, EnumC2779ak.SDK);
            P4.a(k3.d, k3.a, new W3(arrayList2));
        }
        return Unit.f29295attabal;
    }
}
