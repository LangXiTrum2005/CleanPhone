package com.inmobi.media;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import kotlinx.coroutines.flow.formularize;
import kotlinx.coroutines.flow.marial;
import p002kotlin.Pair;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.re, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3201re extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ C3251te b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3201re(C3251te c3251te, dern dernVar) {
        super(2, dernVar);
        this.b = c3251te;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C3201re(this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3201re(this.b, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            InterfaceC3072m9 interfaceC3072m9L = this.b.l();
            if (interfaceC3072m9L != null) {
                ((C3097n9) interfaceC3072m9L).a("NativeRenderedState", "Track Views Attached to Telemetry Started - waiting for window state change");
            }
            formularize formularizeVar = ((yo) this.b.b.l.getValue()).b;
            C3177qe c3177qe = new C3177qe(null);
            this.a = 1;
            if (marial.polloi(formularizeVar, c3177qe, this) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        C3276ue c3276ue = this.b.b;
        c3276ue.b.b = true;
        c3276ue.f.b.e.a(Te.a);
        C3251te c3251te = this.b;
        Wc.a(c3251te.b.c, c3251te.l());
        C2811c0 c2811c0 = this.b.a.a.d;
        c2811c0.getClass();
        c2811c0.e = SystemClock.elapsedRealtime();
        Dc dc = (Dc) this.b.b.g.f.getValue();
        Sg publisherNativeViewData = this.b.b.c;
        dc.getClass();
        Intrinsics.checkNotNullParameter(publisherNativeViewData, "publisherNativeViewData");
        Map mapA = AbstractC2983ik.a(dc.a);
        ViewGroup parentView = publisherNativeViewData.a.getParentView();
        int i2 = 0;
        for (Pair pair : Wc.a(publisherNativeViewData)) {
            View view = (View) pair.component1();
            short sShortValue = ((Number) pair.component2()).shortValue();
            if (view != null && view.getVisibility() == 0 && AbstractC3310vn.a(view, parentView)) {
                i2 |= 1 << sShortValue;
            }
        }
        mapA.put("viewState", Integer.valueOf(i2));
        Wj wj = Wj.a;
        Wj.b("ViewStateOnParentAttached", mapA, EnumC2779ak.SDK);
        return Unit.f29295attabal;
    }
}
