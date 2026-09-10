package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.graphics.Insets;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.events.ChartboostError;
import com.chartboost.sdk.internal.interruption.InterruptionController;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends FrameLayout implements na, m6, w0, xe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pc f14433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f14434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f14435c;
    public final Mediation d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t5 f14436e;
    public View f;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f14437h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public GestureDetector f14438i;
    public boolean j;
    public final s0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public bf f14439l;
    public Job m;

    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        public final void a() {
            m.this.f14433a.a(true);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public static final class b extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14441b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f14442c;

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = m.this.new b(continuation);
            bVar.f14442c = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.f14441b;
            if (i2 == 0) {
                ResultKt.b(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.f14442c;
                long jR = m.this.f14433a.r() * 1000;
                this.f14442c = coroutineScope2;
                this.f14441b = 1;
                if (DelayKt.a(jR, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                coroutineScope = coroutineScope2;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.f14442c;
                ResultKt.b(obj);
            }
            if (CoroutineScopeKt.e(coroutineScope)) {
                m.this.k.a(v0.TIMER, true);
            }
            return Unit.f43263a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, pc multiRenderable, l lVar, r adFormat, Mediation mediation, t5 densityProvider) {
        Object next;
        List<Object> listV;
        oj ojVarB;
        oj ojVarB2;
        xh xhVarO;
        ue ueVarV;
        xh xhVarO2;
        xh xhVarO3;
        super(context);
        Intrinsics.f(context, "context");
        Intrinsics.f(multiRenderable, "multiRenderable");
        Intrinsics.f(adFormat, "adFormat");
        Intrinsics.f(densityProvider, "densityProvider");
        this.f14433a = multiRenderable;
        this.f14434b = lVar;
        this.f14435c = adFormat;
        this.d = mediation;
        this.f14436e = densityProvider;
        Iterator it = multiRenderable.v().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                xhVarO3 = ((f2) next).v().o();
            }
        } while ((xhVarO3 != null ? xhVarO3.a() : null) == null);
        f2 f2Var = (f2) next;
        s0 s0Var = new s0(context, (f2Var == null || (ueVarV = f2Var.v()) == null || (xhVarO2 = ueVarV.o()) == null) ? null : xhVarO2.a(), this.f14435c, this.f14433a.q(), this.d);
        this.k = s0Var;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setBackgroundColor(-16777216);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (this.f14433a.q().b()) {
            this.f14433a.j();
        } else {
            te.a(this.f14433a, 0.0f, 1, null);
        }
        addView(s0Var, layoutParams);
        InterruptionController interruptionController = InterruptionController.f15836a;
        interruptionController.a((na) this);
        interruptionController.a((m6) this);
        s0Var.setAdViewOverlayListener(this);
        this.f14433a.a(this);
        View viewK = this.f14433a.k();
        if (viewK != null) {
            a(viewK);
        }
        o();
        f2 f2VarT = this.f14433a.t();
        if (f2VarT != null && ((xhVarO = f2VarT.v().o()) == null || xhVarO.f())) {
            a(this, this, false, 2, null);
        }
        for (Object obj : this.f14433a.v()) {
            if (obj instanceof zh) {
                pc pcVarZ = ((zh) obj).z();
                if (pcVarZ != null && (listV = pcVarZ.v()) != null) {
                    for (Object obj2 : listV) {
                        if ((obj2 instanceof nj) && (ojVarB = ((nj) obj2).b()) != null) {
                            this.k.a(ojVarB);
                        }
                    }
                }
            } else if ((obj instanceof nj) && (ojVarB2 = ((nj) obj).b()) != null) {
                this.k.a(ojVarB2);
            }
        }
    }

    @Override // com.chartboost.sdk.impl.w0
    public void c() {
        this.f14433a.c(true);
        f2 f2VarT = this.f14433a.t();
        if (f2VarT != null) {
            f2VarT.a(fg.SKIP);
        }
        if (this.f14433a.h()) {
            q();
        } else {
            h();
        }
    }

    @Override // com.chartboost.sdk.impl.w0
    public void d() {
        Unit unit;
        l lVar = this.f14434b;
        if (lVar != null) {
            lVar.c();
        }
        if (this.f14435c == r.REWARDED && !this.j) {
            this.j = true;
            l lVar2 = this.f14434b;
            if (lVar2 != null) {
                lVar2.d();
                unit = Unit.f43263a;
            } else {
                unit = null;
            }
            if (unit == null) {
                za.e("AdContainerListener null when onAdRewarded()", null, 2, null);
            }
        }
        this.k.a(v0.TIMER, false);
        if (this.f14433a.h()) {
            this.k.a(v0.SKIP, true);
        } else if (this.f14435c != r.BANNER) {
            this.k.a(v0.CLOSE, true);
        }
        this.f14433a.a(q6.COUNTDOWN_COMPLETE);
    }

    @Override // com.chartboost.sdk.impl.w0
    public void e() {
        h();
    }

    @Override // com.chartboost.sdk.impl.xe
    public void f() {
        l lVar = this.f14434b;
        if (lVar != null) {
            lVar.a();
        }
    }

    @Override // com.chartboost.sdk.impl.w0
    public void g() {
        l lVar;
        String strA = this.f14433a.q().e().a();
        if (strA.length() <= 0 || (lVar = this.f14434b) == null) {
            return;
        }
        lVar.a(strA);
    }

    public final l getAdContainerListener$ChartboostMonetization_9_10_2_productionRelease() {
        return this.f14434b;
    }

    public final bf getRenderingContainerCalculator() {
        return this.f14439l;
    }

    public final void h() {
        Unit unit;
        Integer numG = this.f14433a.q().g();
        int iIntValue = numG != null ? numG.intValue() : -1;
        r rVar = this.f14435c;
        r rVar2 = r.REWARDED;
        Unit unit2 = Unit.f43263a;
        if (rVar == rVar2 && iIntValue < 0) {
            l lVar = this.f14434b;
            if (lVar != null) {
                lVar.d();
                unit = unit2;
            } else {
                unit = null;
            }
            if (unit == null) {
                za.e("AdContainerListener null when onAdClosed()", null, 2, null);
            }
        }
        this.f14433a.a(fg.CLOSE);
        l lVar2 = this.f14434b;
        if (lVar2 != null) {
            lVar2.b();
        } else {
            unit2 = null;
        }
        if (unit2 == null) {
            za.e("AdContainerListener null when onAdClosed()", null, 2, null);
        }
    }

    public final void i() {
        this.f14433a.a(fg.CLOSE);
        removeAllViews();
    }

    public final boolean j() {
        return this.k.b();
    }

    public final boolean k() {
        return this.f14433a.t() instanceof xj;
    }

    public final void l() {
        this.f14433a.l();
    }

    public final void m() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.f14433a.m();
        this.k.d();
    }

    public final void n() {
        if (this.g) {
            this.g = false;
            this.f14433a.n();
            s();
            this.k.g(this.f14433a.w());
            this.k.h();
        }
    }

    public final void o() {
        w wVarQ;
        Number numberValueOf;
        ue ueVarV;
        f2 f2VarT = this.f14433a.t();
        if (f2VarT != null && (ueVarV = f2VarT.v()) != null) {
            ueVarV.g();
        }
        f2 f2VarT2 = this.f14433a.t();
        if (f2VarT2 == null || (wVarQ = f2VarT2.q()) == null) {
            wVarQ = this.f14433a.q();
        }
        fa faVarE = wVarQ.e();
        h2 h2VarH = wVarQ.h();
        if (h2VarH == null) {
            h2VarH = h2.d.a();
        }
        s0 s0Var = this.k;
        u0 u0Var = u0.TOP_LEFT;
        t0 t0Var = new t0(h2VarH.e().b(), h2VarH.e().a());
        t0 t0Var2 = new t0(h2VarH.f().b(), h2VarH.f().a());
        t0 t0Var3 = new t0(h2VarH.g().b(), h2VarH.g().a());
        String strB = faVarE.b();
        if (strB == null) {
            strB = "";
        }
        String str = strB;
        String strA = faVarE.a();
        if (strA == null) {
            strA = "https://docs.chartboost.com/opt-out";
        }
        s0Var.a(true, u0Var, t0Var, t0Var2, t0Var3, str, strA, (128 & 128) != 0 ? false : false);
        s0 s0Var2 = this.k;
        v0 v0Var = v0.VOLUME;
        s0Var2.a(v0Var, false);
        s0 s0Var3 = this.k;
        v0 v0Var2 = v0.TIMER;
        s0Var3.a(v0Var2, false);
        s0 s0Var4 = this.k;
        v0 v0Var3 = v0.SKIP;
        s0Var4.a(v0Var3, false);
        s0 s0Var5 = this.k;
        v0 v0Var4 = v0.CLOSE;
        s0Var5.a(v0Var4, false);
        if (this.f14435c == r.BANNER) {
            return;
        }
        Integer numG = wVarQ.g();
        int iIntValue = numG != null ? numG.intValue() : -1;
        r rVar = this.f14435c;
        r rVar2 = r.REWARDED;
        boolean z2 = (rVar != rVar2 || iIntValue >= 0) && (this.f14433a.g() > 0 || iIntValue > 0 || this.f14433a.s() > 0);
        if (!this.k.c()) {
            if (z2 && !this.k.c()) {
                if (this.j || iIntValue < 0) {
                    numberValueOf = this.f14433a.s() > 0 ? Long.valueOf(this.f14433a.s()) : Long.valueOf(this.f14433a.g());
                } else {
                    numberValueOf = Integer.valueOf(iIntValue);
                }
                this.k.setTimer(numberValueOf.longValue() * 1000);
            } else if (this.f14435c == rVar2 && iIntValue < 0) {
                this.k.a(v0Var2, false);
                this.k.a(v0Var3, false);
                this.k.a(v0Var4, true);
            } else if (this.f14433a.h()) {
                this.k.a(v0Var3, true);
                this.k.a(v0Var4, false);
            } else {
                this.k.a(v0Var3, false);
                this.k.a(v0Var4, true);
            }
        }
        this.k.a(v0Var, (this.f14433a.t() instanceof cj) || (this.f14433a.t() instanceof zh));
        h2 h2VarI = wVarQ.i();
        if (h2VarI == null) {
            h2VarI = h2.d.a();
        }
        this.k.a(true, u0.TOP_RIGHT, new t0(h2VarI.e().b(), h2VarI.e().a()), new t0(h2VarI.f().b(), h2VarI.f().a()), new t0(h2VarI.g().b(), h2VarI.g().a()));
        if (this.f14435c != rVar2 || iIntValue < 0) {
            return;
        }
        this.k.setRewardedMode(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterruptionController interruptionController = InterruptionController.f15836a;
        interruptionController.b((na) this);
        if (!k()) {
            interruptionController.a();
        }
        interruptionController.b((m6) this);
        this.k.a();
        if (this.f14435c != r.BANNER) {
            this.f14433a.a(fg.CLOSE);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.f(event, "event");
        GestureDetector gestureDetector = this.f14438i;
        return gestureDetector != null ? gestureDetector.onTouchEvent(event) : super.onTouchEvent(event);
    }

    public final void p() {
        if (this.f14437h) {
            return;
        }
        this.f14437h = true;
        if (!k()) {
            InterruptionController.f15836a.h();
        }
        this.f14433a.x();
        this.k.g(this.f14433a.w());
        r();
    }

    public final void q() {
        View viewK = this.f14433a.k();
        if (viewK != null) {
            a(viewK);
            o();
            r();
        }
    }

    public final void r() {
        if (this.f14435c == r.BANNER) {
            return;
        }
        if (this.k.c() || this.f14433a.r() <= 0) {
            this.k.a(v0.TIMER, true);
        } else {
            Job job = this.m;
            if (job != null) {
                job.a(null);
            }
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            this.m = BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a), null, null, new b(null), 3);
        }
        this.k.h();
    }

    public final void s() {
        if (this.f14439l == null || this.f14435c == r.BANNER) {
            return;
        }
        f2 f2VarT = this.f14433a.t();
        int iU = f2VarT != null ? f2VarT.u() : 0;
        bf bfVar = this.f14439l;
        af afVarB = bfVar != null ? bfVar.b() : null;
        Insets insetsC = afVarB != null ? afVarB.c() : null;
        if (insetsC != null) {
            a9.a aVar = a9.f13415c;
            setPadding(aVar.b(iU) ? 0 : Math.max(insetsC.f4297a, getPaddingLeft()), aVar.d(iU) ? 0 : Math.max(insetsC.f4298b, getPaddingTop()), aVar.c(iU) ? 0 : Math.max(insetsC.f4299c, getPaddingRight()), aVar.a(iU) ? 0 : Math.max(insetsC.d, getPaddingBottom()));
            View view = this.f;
            if (view != null) {
                post(new p008p.h(this, view, 0));
            }
        }
    }

    public final void setAdContainerListener$ChartboostMonetization_9_10_2_productionRelease(l lVar) {
        this.f14434b = lVar;
    }

    public final void setRenderingContainerCalculator(bf bfVar) {
        this.f14439l = bfVar;
        s();
    }

    public final void a(View view) {
        removeView(this.f);
        this.f = view;
        addView(view, 0, new FrameLayout.LayoutParams(-1, -1));
        if (this.f14433a.t() instanceof xj) {
            post(new p008p.h(this, view, 1));
        }
        o();
    }

    public final void b(View view) {
        f2 f2VarT = this.f14433a.t();
        if (f2VarT instanceof xj) {
            ue ueVarV = ((xj) f2VarT).v();
            if (ueVarV.h() == ue.b.FILL) {
                return;
            }
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            if (width <= 0 || height <= 0) {
                return;
            }
            c6 c6VarB = ve.f15422a.b(ueVarV, this.f14436e, width, height);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(c6VarB.b(), c6VarB.a());
            layoutParams.gravity = 17;
            view.setLayoutParams(layoutParams);
        }
    }

    public static final void a(m this$0, View adView) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(adView, "$adView");
        this$0.b(adView);
    }

    @Override // com.chartboost.sdk.impl.xe
    public void a() {
        if (!k()) {
            InterruptionController.f15836a.a();
        }
        f2 f2VarT = this.f14433a.t();
        if (f2VarT != null) {
            f2VarT.a(fg.AD_COMPLETE);
        }
        if (this.f14433a.h()) {
            View viewK = this.f14433a.k();
            if (viewK != null) {
                this.f14433a.c(false);
                a(viewK);
                if (!this.k.c()) {
                    this.k.e();
                }
                o();
                r();
            }
            this.f14433a.x();
            f2 f2VarT2 = this.f14433a.t();
            if (f2VarT2 != null) {
                xh xhVarO = f2VarT2.v().o();
                a(this, xhVarO != null ? xhVarO.f() : true);
            }
        }
    }

    @Override // com.chartboost.sdk.impl.w0
    public void b() {
        List listC;
        l lVar;
        ti tiVarB;
        List listB;
        f2 f2VarT = this.f14433a.t();
        if (f2VarT == null) {
            za.e("CTA clicked but currentAd is null.", null, 2, null);
            return;
        }
        zh zhVar = f2VarT instanceof zh ? (zh) f2VarT : null;
        f2VarT.a(true);
        xh xhVarO = f2VarT.v().o();
        i5 i5VarA = xhVarO != null ? xhVarO.a() : null;
        List list = EmptyList.X;
        if (i5VarA == null || (listC = i5VarA.c()) == null) {
            listC = list;
        }
        if (zhVar != null && (tiVarB = zhVar.B()) != null && (listB = tiVarB.b()) != null) {
            list = listB;
        }
        if (!f2VarT.r().a((y3) new y3.a(CollectionsKt.q(CollectionsKt.O(list, listC))), true) || (lVar = this.f14434b) == null) {
            return;
        }
        lVar.a();
    }

    @Override // com.chartboost.sdk.impl.m6
    public void b(boolean z2) {
        this.f14433a.b(z2);
        this.k.g(this.f14433a.w());
    }

    @Override // com.chartboost.sdk.impl.na
    public void a(Set activeInterruptions) {
        Intrinsics.f(activeInterruptions, "activeInterruptions");
        if (activeInterruptions.isEmpty()) {
            n();
        } else {
            m();
        }
    }

    @Override // com.chartboost.sdk.impl.xe
    public void b(Throwable error) {
        Intrinsics.f(error, "error");
        if (error instanceof ChartboostError.Render.WebViewMraidUnload) {
            za.a("MRAID unload() called. Skipping the current renderable.", (Throwable) null, 2, (Object) null);
            Job job = this.m;
            if (job != null) {
                job.a(null);
            }
            d();
        }
    }

    @Override // com.chartboost.sdk.impl.xe
    public void a(rd request) {
        Intrinsics.f(request, "request");
        l lVar = this.f14434b;
        if (lVar != null) {
            lVar.a(request);
        }
    }

    public static final void b(m this$0, View view) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(view, "$view");
        this$0.b(view);
    }

    @Override // com.chartboost.sdk.impl.w0
    public void a(boolean z2) {
        if (z2) {
            this.f14433a.j();
        } else {
            te.a(this.f14433a, 0.0f, 1, null);
        }
    }

    public final void a(View view, boolean z2) {
        this.f14438i = z2 ? new GestureDetector(view.getContext(), new n(0.0f, new a(), 1, null)) : null;
    }

    public static /* synthetic */ void a(m mVar, View view, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        mVar.a(view, z2);
    }

    public /* synthetic */ m(Context context, pc pcVar, l lVar, r rVar, Mediation mediation, t5 t5Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, pcVar, lVar, (i2 & 8) != 0 ? r.BANNER : rVar, mediation, (i2 & 32) != 0 ? new n5(context) : t5Var);
    }
}
