package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.R;
import com.inmobi.commons.core.configs.CrashConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class s0 extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i5 f15068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f15069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f15070c;
    public final Mediation d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ga f15071e;
    public final wj f;
    public final v4 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u4 f15072h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d2 f15073i;
    public final jg j;
    public w0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f15074l;
    public long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public sg f15075n;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(String it) {
            Intrinsics.f(it, "it");
            w0 adViewOverlayListener = s0.this.getAdViewOverlayListener();
            if (adViewOverlayListener != null) {
                adViewOverlayListener.g();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return Unit.f43263a;
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        public final void a(boolean z2) {
            w0 adViewOverlayListener = s0.this.getAdViewOverlayListener();
            if (adViewOverlayListener != null) {
                adViewOverlayListener.a(z2);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Boolean) obj).booleanValue());
            return Unit.f43263a;
        }
    }

    public static final class c extends Lambda implements Function0 {
        public c() {
            super(0);
        }

        public final void a() {
            w0 adViewOverlayListener = s0.this.getAdViewOverlayListener();
            if (adViewOverlayListener != null) {
                adViewOverlayListener.e();
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public static final class d extends Lambda implements Function0 {
        public d() {
            super(0);
        }

        public final void a() {
            w0 adViewOverlayListener = s0.this.getAdViewOverlayListener();
            if (adViewOverlayListener != null) {
                adViewOverlayListener.c();
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public static final class e extends Lambda implements Function0 {
        public e() {
            super(0);
        }

        public final void a() {
            w0 adViewOverlayListener = s0.this.getAdViewOverlayListener();
            if (adViewOverlayListener != null) {
                adViewOverlayListener.b();
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public /* synthetic */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15081a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f15082b;

        static {
            int[] iArr = new int[u0.values().length];
            try {
                iArr[u0.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u0.TOP_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[u0.BOTTOM_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[u0.BOTTOM_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f15081a = iArr;
            int[] iArr2 = new int[v0.values().length];
            try {
                iArr2[v0.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[v0.VOLUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[v0.CLOSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[v0.SKIP.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[v0.TIMER.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[v0.CTA.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            f15082b = iArr2;
        }
    }

    public static final class g extends Lambda implements Function0 {
        public g() {
            super(0);
        }

        public final void a() {
            s0.this.a(v0.CLOSE, true);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public static final class h extends Lambda implements Function0 {
        public h() {
            super(0);
        }

        public final void a() {
            w0 adViewOverlayListener = s0.this.getAdViewOverlayListener();
            if (adViewOverlayListener != null) {
                adViewOverlayListener.d();
            }
            jg jgVar = s0.this.j;
            o6 o6Var = new o6(s0.this.f15070c.a(), EmptyList.X, p6.COUNTDOWN_COMPLETE, null, null, null, null, s0.this.d, 120, null);
            List listC = s0.this.f15070c.c();
            ArrayList<x6> arrayList = new ArrayList();
            for (Object obj : listC) {
                if (Intrinsics.a(((x6) obj).d(), x6.b.ENGAGEMENT.b())) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.n(arrayList, 10));
            for (x6 x6Var : arrayList) {
                arrayList2.add(new wg(x6Var.e(), x6Var.c(), x6Var.a(), null, 8, null));
            }
            jgVar.a(o6Var, arrayList2);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(Context context, i5 i5Var, r adFormat, w adMarkupConfig, Mediation mediation) {
        super(context);
        Intrinsics.f(context, "context");
        Intrinsics.f(adFormat, "adFormat");
        Intrinsics.f(adMarkupConfig, "adMarkupConfig");
        this.f15068a = i5Var;
        this.f15069b = adFormat;
        this.f15070c = adMarkupConfig;
        this.d = mediation;
        this.j = w3.f15454b.a().q();
        this.m = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
        this.f15075n = sg.ARC;
        r rVar = r.BANNER;
        if (adFormat != rVar) {
            setPadding(a(16), a(4), a(16), a(0));
        }
        ga gaVar = new ga(context, null, 0, null, new a(), 14, null);
        this.f15071e = gaVar;
        if (adFormat == rVar) {
            gaVar.a(false);
        }
        wj wjVar = new wj(context, null, 0, null, null, new b(), 30, null);
        this.f = wjVar;
        String string = context.getString(R.string.timer_notification_icon_description);
        Intrinsics.e(string, "getString(...)");
        String string2 = context.getString(R.string.close_button_description);
        Intrinsics.e(string2, "getString(...)");
        String string3 = context.getString(R.string.skip_button_description);
        Intrinsics.e(string3, "getString(...)");
        v4 v4Var = new v4(context, null, 0, string, string2, string3, null, new c(), new d(), 70, null);
        v4.a(v4Var, false, 1, null);
        this.g = v4Var;
        this.f15072h = new u4(v4Var);
        if (i5Var != null) {
            d2 d2VarA = td.f15202a.a(context, i5Var, new e());
            this.f15073i = d2VarA;
            addView(d2VarA);
            a(this, true, (String) null, 2, (Object) null);
        }
        addView(gaVar);
        addView(wjVar);
        addView(v4Var);
        g();
        f();
    }

    private final void setTimerRunning(boolean z2) {
    }

    public final void d(boolean z2) {
        this.g.b(z2);
        this.g.setImportantForAccessibility(z2 ? 1 : 2);
    }

    public final void e(boolean z2) {
        this.g.c(z2);
        this.g.setImportantForAccessibility(z2 ? 1 : 2);
    }

    public final void f(boolean z2) {
        this.f.setVisibility(z2 ? 0 : 8);
        this.f.setImportantForAccessibility(z2 ? 1 : 2);
    }

    public final void g() {
        this.f15071e.setId(View.generateViewId());
        this.f.setId(View.generateViewId());
        this.g.setId(View.generateViewId());
        d2 d2Var = this.f15073i;
        if (d2Var != null) {
            d2Var.setId(View.generateViewId());
        }
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.e(this);
        constraintSet.h(this.f15071e.getId(), -2);
        constraintSet.k(this.f15071e.getId()).d.d = -2;
        constraintSet.f(this.f15071e.getId(), 1, 0, 1);
        constraintSet.f(this.f15071e.getId(), 3, 0, 3);
        constraintSet.h(this.f.getId(), -2);
        constraintSet.k(this.f.getId()).d.d = -2;
        constraintSet.g(this.f.getId(), 1, this.f15071e.getId(), 2, (int) (8 * getResources().getDisplayMetrics().density));
        constraintSet.f(this.f.getId(), 3, 0, 3);
        constraintSet.h(this.g.getId(), -2);
        constraintSet.k(this.g.getId()).d.d = -2;
        constraintSet.f(this.g.getId(), 2, 0, 2);
        constraintSet.f(this.g.getId(), 3, 0, 3);
        d2 d2Var2 = this.f15073i;
        if (d2Var2 != null) {
            constraintSet.h(d2Var2.getId(), 0);
            constraintSet.f(d2Var2.getId(), 1, 0, 1);
            constraintSet.f(d2Var2.getId(), 2, 0, 2);
            constraintSet.f(d2Var2.getId(), 4, 0, 4);
        }
        constraintSet.b(this);
    }

    public final w0 getAdViewOverlayListener() {
        return this.k;
    }

    public final boolean getShouldOnlyShowOneButtonForCloseChip() {
        return this.g.getShouldOnlyShowOneButton();
    }

    public final void h() {
        this.f15072h.e();
    }

    public final void setAdViewOverlayListener(w0 w0Var) {
        this.k = w0Var;
    }

    public final void setRewardedMode(boolean z2) {
        this.f15074l = z2;
        if (!z2) {
            this.g.setShouldOnlyShowOneButton(false);
        } else {
            this.g.setShouldOnlyShowOneButton(true);
            this.f15072h.a(new g());
        }
    }

    public final void setShouldOnlyShowOneButtonForCloseChip(boolean z2) {
        this.g.setShouldOnlyShowOneButton(z2);
    }

    public final void setTimer(long j) {
        String string = getContext().getString(R.string.reward_timer_running);
        Intrinsics.e(string, "getString(...)");
        String string2 = getContext().getString(R.string.reward_timer_complete);
        Intrinsics.e(string2, "getString(...)");
        this.f15072h.a(j, this.f15075n, string, string2, new h());
    }

    public final void setTimerDuration(long j) {
        this.m = j;
    }

    public final void a() {
        this.f15072h.a();
    }

    public final void b(boolean z2) {
        d2 d2Var = this.f15073i;
        if (d2Var != null) {
            d2Var.setVisibility(z2 ? 0 : 8);
            d2Var.setImportantForAccessibility(z2 ? 1 : 2);
            if (z2) {
                jg jgVar = this.j;
                o6 o6Var = new o6(this.f15070c.a(), EmptyList.X, p6.CTA_SHOW, null, null, null, null, this.d, 120, null);
                List listC = this.f15070c.c();
                ArrayList<x6> arrayList = new ArrayList();
                for (Object obj : listC) {
                    if (Intrinsics.a(((x6) obj).d(), x6.b.ENGAGEMENT.b())) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.n(arrayList, 10));
                for (x6 x6Var : arrayList) {
                    arrayList2.add(new wg(x6Var.e(), x6Var.c(), x6Var.a(), null, 8, null));
                }
                jgVar.a(o6Var, arrayList2);
            }
        }
    }

    public final void c(boolean z2) {
        this.f15071e.setVisibility(z2 ? 0 : 8);
        this.f15071e.setImportantForAccessibility(z2 ? 1 : 2);
    }

    public final void a(boolean z2, u0 position, t0 margin, t0 padding, t0 size) {
        Intrinsics.f(position, "position");
        Intrinsics.f(margin, "margin");
        Intrinsics.f(padding, "padding");
        Intrinsics.f(size, "size");
        if (z2) {
            if (this.f15074l) {
                this.g.setShouldOnlyShowOneButton(true);
            } else {
                this.g.setShouldOnlyShowOneButton(false);
            }
        } else {
            this.g.setVisibility(8);
        }
        if (z2) {
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.e(this);
            constraintSet.d(this.g.getId(), 1);
            constraintSet.d(this.g.getId(), 2);
            constraintSet.d(this.g.getId(), 3);
            constraintSet.d(this.g.getId(), 4);
            int i2 = f.f15081a[position.ordinal()];
            if (i2 == 1) {
                constraintSet.g(this.g.getId(), 1, 0, 1, a(margin.b()));
                constraintSet.g(this.g.getId(), 3, 0, 3, a(margin.a()));
            } else if (i2 == 2) {
                constraintSet.g(this.g.getId(), 2, 0, 2, a(margin.b()));
                constraintSet.g(this.g.getId(), 3, 0, 3, a(margin.a()));
            } else if (i2 == 3) {
                constraintSet.g(this.g.getId(), 1, 0, 1, a(margin.b()));
                constraintSet.g(this.g.getId(), 4, 0, 4, a(margin.a()));
            } else if (i2 == 4) {
                constraintSet.g(this.g.getId(), 2, 0, 2, a(margin.b()));
                constraintSet.g(this.g.getId(), 4, 0, 4, a(margin.a()));
            }
            constraintSet.b(this);
        }
    }

    public final void d() {
        this.f15072h.c();
    }

    public final void e() {
        this.f15072h.d();
    }

    public final void f() {
        this.f15071e.setAccessibilityTraversalBefore(this.f.getId());
        this.f.setAccessibilityTraversalBefore(this.g.getId());
        d2 d2Var = this.f15073i;
        if (d2Var != null) {
            this.g.setAccessibilityTraversalBefore(d2Var.getId());
        }
    }

    public final boolean c() {
        pg pgVarB = this.f15072h.b();
        return (pgVarB != null ? pgVarB.d() : null) == pg.b.STARTED;
    }

    public final boolean b() {
        return this.g.getCloseButton().getVisibility() == 0;
    }

    public final void g(boolean z2) {
        this.f.setMuted(z2);
    }

    public final void a(boolean z2, String ctaTextTitle) {
        d2 d2Var;
        Intrinsics.f(ctaTextTitle, "ctaTextTitle");
        if (this.f15073i == null) {
            return;
        }
        a(v0.CTA, z2);
        if (z2 && (d2Var = this.f15073i) != null) {
            d2Var.setCustomContentDescription(ctaTextTitle);
        }
    }

    public static /* synthetic */ void a(s0 s0Var, boolean z2, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = "";
        }
        s0Var.a(z2, str);
    }

    public final void a(boolean z2, u0 position, t0 margin, t0 padding, t0 size, String imageUrl, String clickthroughUrl, boolean z3) {
        Intrinsics.f(position, "position");
        Intrinsics.f(margin, "margin");
        Intrinsics.f(padding, "padding");
        Intrinsics.f(size, "size");
        Intrinsics.f(imageUrl, "imageUrl");
        Intrinsics.f(clickthroughUrl, "clickthroughUrl");
        a(v0.INFO, z2);
        if (z2) {
            this.f15071e.a(size);
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.e(this);
            constraintSet.d(this.f15071e.getId(), 1);
            constraintSet.d(this.f15071e.getId(), 2);
            constraintSet.d(this.f15071e.getId(), 3);
            constraintSet.d(this.f15071e.getId(), 4);
            int i2 = f.f15081a[position.ordinal()];
            if (i2 == 1) {
                constraintSet.g(this.f15071e.getId(), 1, 0, 1, a(margin.b()));
                constraintSet.g(this.f15071e.getId(), 3, 0, 3, a(margin.a()));
                constraintSet.g(this.f.getId(), 3, 0, 3, a(margin.a()));
                constraintSet.g(this.g.getId(), 3, 0, 3, a(margin.a()));
            } else if (i2 == 2) {
                constraintSet.g(this.f15071e.getId(), 2, 0, 2, a(margin.b()));
                constraintSet.g(this.f15071e.getId(), 3, 0, 3, a(margin.a()));
            } else if (i2 == 3) {
                constraintSet.g(this.f15071e.getId(), 1, 0, 1, a(margin.b()));
                constraintSet.g(this.f15071e.getId(), 4, 0, 4, a(margin.a()));
            } else if (i2 == 4) {
                constraintSet.g(this.f15071e.getId(), 2, 0, 2, a(margin.b()));
                constraintSet.g(this.f15071e.getId(), 4, 0, 4, a(margin.a()));
            }
            constraintSet.b(this);
            if (imageUrl.length() > 0) {
                this.f15071e.a(imageUrl);
            }
            this.f15071e.setClickthroughUrl(clickthroughUrl);
            this.f15071e.setEnableSponsorText(z3);
        }
    }

    public final void a(v0 chip, boolean z2) {
        Intrinsics.f(chip, "chip");
        switch (f.f15082b[chip.ordinal()]) {
            case 1:
                c(z2);
                break;
            case 2:
                f(z2);
                break;
            case 3:
                a(z2);
                break;
            case 4:
                d(z2);
                break;
            case 5:
                e(z2);
                break;
            case 6:
                b(z2);
                break;
        }
    }

    public final void a(boolean z2) {
        this.g.a(z2);
        this.g.setImportantForAccessibility(z2 ? 1 : 2);
    }

    public final int a(double d2) {
        return (int) (d2 * ((double) getContext().getResources().getDisplayMetrics().density));
    }

    public final int a(int i2) {
        return (int) (i2 * getContext().getResources().getDisplayMetrics().density);
    }

    public final void a(oj tracker) {
        Intrinsics.f(tracker, "tracker");
        tracker.a(this, mj.f14515i);
        this.f15071e.a(tracker, mj.g);
        this.f.a(tracker, mj.f14512c);
        this.g.getTimerChipView().a(tracker, mj.f14514h);
        this.g.getCloseButton().a(tracker, mj.d);
        this.g.getSkipButton().a(tracker, mj.f);
        d2 d2Var = this.f15073i;
        if (d2Var != null) {
            d2Var.a(tracker, mj.f14513e);
        }
    }
}
