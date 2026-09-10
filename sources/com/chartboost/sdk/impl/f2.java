package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.events.ChartboostError;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f2 extends te {
    public final ue d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w f13849e;
    public final jg f;
    public final r g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Mediation f13850h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Lazy f13851i;
    public final uh j;
    public final z6 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f13852l;
    public final long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f13853n;

    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z3 invoke() {
            return new z3(f2.this.v(), f2.this.q(), w3.f15454b.a().q(), f2.this.f13850h);
        }
    }

    public f2(ue renderableConfig, w adMarkupConfig, vg trackerComponent, jg telemetryManager, r adFormat, Mediation mediation) {
        Intrinsics.f(renderableConfig, "renderableConfig");
        Intrinsics.f(adMarkupConfig, "adMarkupConfig");
        Intrinsics.f(trackerComponent, "trackerComponent");
        Intrinsics.f(telemetryManager, "telemetryManager");
        Intrinsics.f(adFormat, "adFormat");
        this.d = renderableConfig;
        this.f13849e = adMarkupConfig;
        this.f = telemetryManager;
        this.g = adFormat;
        this.f13850h = mediation;
        this.f13851i = LazyKt.b(new a());
        this.j = new uh(new th(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), null, null, 6, null);
        this.k = trackerComponent.a();
        c5 c5VarD = renderableConfig.d();
        this.f13852l = c5VarD != null ? c5VarD.b() : 0L;
        c5 c5VarD2 = renderableConfig.d();
        this.m = c5VarD2 != null ? c5VarD2.a() : 0L;
        this.f13853n = renderableConfig.k();
    }

    public void b(String str, boolean z2) {
        xe xeVarI;
        a(str, z2);
        if (!r().a(new y3.b(str != null ? CollectionsKt.H(str) : EmptyList.X), z2) || (xeVarI = i()) == null) {
            return;
        }
        xeVarI.f();
    }

    public final r p() {
        return this.g;
    }

    public final w q() {
        return this.f13849e;
    }

    public final z3 r() {
        return (z3) this.f13851i.getX();
    }

    public long s() {
        return this.m;
    }

    public long t() {
        return this.f13852l;
    }

    public int u() {
        return this.f13853n;
    }

    public final ue v() {
        return this.d;
    }

    public final jg w() {
        return this.f;
    }

    public void x() {
        jg jgVar = this.f;
        r9 r9Var = new r9(this.f13849e.a(), EmptyList.X, null, null, null, null, this.f13850h, 60, null);
        List listF = this.d.f();
        ArrayList<x6> arrayList = new ArrayList();
        for (Object obj : listF) {
            if (Intrinsics.a(((x6) obj).d(), x6.b.IMPRESSION.b())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.n(arrayList, 10));
        for (x6 x6Var : arrayList) {
            arrayList2.add(new wg(x6Var.e(), x6Var.c(), x6Var.a(), x6Var.b()));
        }
        jgVar.a(r9Var, arrayList2);
        a(this, (ChartboostError.Render) null, 1, (Object) null);
    }

    public final void a(String str, boolean z2) {
        if (str != null) {
            try {
                new URL(str);
                this.j.a(str, c4.CLICK_PREFERENCE_EMBEDDED, new h4(this.g.toString(), str, null, this.k, 4, null), z2);
            } catch (MalformedURLException e2) {
                a(new ChartboostError.Render.InvalidClickthroughUrl(str, "Invalid clickthrough URL format", e2));
            }
        }
    }

    public void b(boolean z2) {
        jg jgVar = this.f;
        String str = null;
        String str2 = null;
        bg bgVar = new bg(this.f13849e.a(), EmptyList.X, z2, str, str2, null, null, this.f13850h, 120, null);
        ArrayList arrayListO = CollectionsKt.O(this.f13849e.c(), this.d.f());
        ArrayList<x6> arrayList = new ArrayList();
        for (Object obj : arrayListO) {
            if (Intrinsics.a(((x6) obj).d(), x6.b.SKIP.b())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.n(arrayList, 10));
        for (x6 x6Var : arrayList) {
            arrayList2.add(new wg(x6Var.e(), x6Var.c(), x6Var.a(), x6Var.b()));
        }
        jgVar.a(bgVar, arrayList2);
    }

    public void a(q6 type) {
        Intrinsics.f(type, "type");
        jg jgVar = this.f;
        o6 o6Var = new o6(this.f13849e.a(), EmptyList.X, type == q6.COUNTDOWN_COMPLETE ? p6.COUNTDOWN_COMPLETE : p6.CTA_SHOW, null, null, null, null, this.f13850h, 120, null);
        List listF = this.d.f();
        ArrayList<x6> arrayList = new ArrayList();
        for (Object obj : listF) {
            if (Intrinsics.a(((x6) obj).d(), x6.b.ENGAGEMENT.b())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.n(arrayList, 10));
        for (x6 x6Var : arrayList) {
            arrayList2.add(new wg(x6Var.e(), x6Var.c(), x6Var.a(), x6Var.b()));
        }
        jgVar.a(o6Var, arrayList2);
    }

    public final void a(ChartboostError.Render render) {
        jg jgVar = this.f;
        re reVar = new re(this.f13849e.a(), "", render != null ? render.getMessage() : null, render != null ? render.getCode() : null, render != null ? render.getConstant() : null, render != null ? render.getCauseDescription() : null, this.f13850h);
        List listF = this.d.f();
        ArrayList<x6> arrayList = new ArrayList();
        for (Object obj : listF) {
            if (Intrinsics.a(((x6) obj).d(), x6.b.RENDER.b())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.n(arrayList, 10));
        for (x6 x6Var : arrayList) {
            arrayList2.add(new wg(x6Var.e(), x6Var.c(), x6Var.a(), x6Var.b()));
        }
        jgVar.a(reVar, arrayList2);
    }

    public static /* synthetic */ void a(f2 f2Var, ChartboostError.Render render, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackRender");
        }
        if ((i2 & 1) != 0) {
            render = null;
        }
        f2Var.a(render);
    }
}
