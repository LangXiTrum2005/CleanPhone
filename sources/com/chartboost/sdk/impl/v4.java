package com.chartboost.sdk.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.chartboost.sdk.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class v4 extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f15363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f15364c;
    public final t5 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function0 f15365e;
    public final Function0 f;
    public final rg g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j4 f15366h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ag f15367i;
    public boolean j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f15368l;

    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f15369b = new a();

        public a() {
            super(0);
        }

        public final void a() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f15370b = new b();

        public b() {
            super(0);
        }

        public final void a() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(Context context, AttributeSet attributeSet, int i2, String timerContentDescription, String closeContentDescription, String skipContentDescription, t5 densityProvider, Function0 onCloseClicked, Function0 onSkipClicked) {
        super(context, attributeSet, i2);
        Intrinsics.f(context, "context");
        Intrinsics.f(timerContentDescription, "timerContentDescription");
        Intrinsics.f(closeContentDescription, "closeContentDescription");
        Intrinsics.f(skipContentDescription, "skipContentDescription");
        Intrinsics.f(densityProvider, "densityProvider");
        Intrinsics.f(onCloseClicked, "onCloseClicked");
        Intrinsics.f(onSkipClicked, "onSkipClicked");
        this.f15362a = timerContentDescription;
        this.f15363b = closeContentDescription;
        this.f15364c = skipContentDescription;
        this.d = densityProvider;
        this.f15365e = onCloseClicked;
        this.f = onSkipClicked;
        this.k = 28;
        this.f15368l = 8;
        setId(View.generateViewId());
        setLayoutParams(new ConstraintLayout.LayoutParams(-2, -2));
        n5 n5Var = new n5(context);
        int iA = n5Var.a(28);
        int iA2 = n5Var.a(8);
        rg rgVar = new rg(context, null, 0, null, null, 30, null);
        rgVar.setId(View.generateViewId());
        rgVar.setLayoutParams(new ConstraintLayout.LayoutParams(iA, iA));
        rgVar.setVisibility(8);
        this.g = rgVar;
        addView(rgVar);
        ag agVar = new ag(context, null, 0, 0, null, null, onSkipClicked, 62, null);
        agVar.setId(View.generateViewId());
        agVar.setLayoutParams(new ConstraintLayout.LayoutParams(iA, iA));
        agVar.setVisibility(8);
        this.f15367i = agVar;
        addView(agVar);
        j4 j4Var = new j4(context, null, 0, null, onCloseClicked, 14, null);
        j4Var.setId(View.generateViewId());
        j4Var.setLayoutParams(new ConstraintLayout.LayoutParams(iA, iA));
        j4Var.setVisibility(8);
        this.f15366h = j4Var;
        addView(j4Var);
        setupConstraints(iA2);
        a();
    }

    private final void setupConstraints(int i2) {
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.e(this);
        constraintSet.f(this.g.getId(), 1, 0, 1);
        constraintSet.f(this.g.getId(), 3, 0, 3);
        constraintSet.f(this.g.getId(), 4, 0, 4);
        constraintSet.g(this.f15367i.getId(), 1, this.g.getId(), 2, i2);
        constraintSet.f(this.f15367i.getId(), 3, 0, 3);
        constraintSet.f(this.f15367i.getId(), 4, 0, 4);
        constraintSet.g(this.f15366h.getId(), 1, this.f15367i.getId(), 2, i2);
        constraintSet.f(this.f15366h.getId(), 3, 0, 3);
        constraintSet.f(this.f15366h.getId(), 4, 0, 4);
        constraintSet.f(this.f15366h.getId(), 2, 0, 2);
        constraintSet.b(this);
    }

    public final void a(boolean z2) {
        this.f15366h.setVisibility(z2 ? 0 : 8);
        if (z2 && this.j) {
            c(false);
            b(false);
        }
    }

    public final void b(boolean z2) {
        this.f15367i.setVisibility(z2 ? 0 : 8);
        if (z2 && this.j) {
            c(false);
            a(false);
        }
    }

    public final void c(boolean z2) {
        this.g.setVisibility(z2 ? 0 : 8);
        if (z2 && this.j) {
            a(false);
            b(false);
        }
    }

    public final j4 getCloseButton() {
        return this.f15366h;
    }

    public final boolean getShouldOnlyShowOneButton() {
        return this.j;
    }

    public final ag getSkipButton() {
        return this.f15367i;
    }

    public final rg getTimerChipView() {
        return this.g;
    }

    public final void setShouldOnlyShowOneButton(boolean z2) {
        this.j = z2;
    }

    public static /* synthetic */ void a(v4 v4Var, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        v4Var.c(z2);
    }

    public final void a() {
        String str;
        if (this.g.getVisibility() == 0) {
            str = this.f15362a;
        } else if (this.f15366h.getVisibility() == 0) {
            str = this.f15363b;
        } else {
            str = this.f15367i.getVisibility() == 0 ? this.f15364c : null;
        }
        setContentDescription(str);
        setFocusable(getContentDescription() != null);
        setClickable(getContentDescription() != null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ v4(Context context, AttributeSet attributeSet, int i2, String str, String str2, String str3, t5 t5Var, Function0 function0, Function0 function1, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        String string;
        String string2;
        String string3;
        AttributeSet attributeSet2 = (i3 & 2) != 0 ? null : attributeSet;
        int i4 = (i3 & 4) != 0 ? 0 : i2;
        if ((i3 & 8) != 0) {
            string = context.getString(R.string.timer_notification_icon_description);
            Intrinsics.e(string, "getString(...)");
        } else {
            string = str;
        }
        if ((i3 & 16) != 0) {
            string2 = context.getString(R.string.close_button_description);
            Intrinsics.e(string2, "getString(...)");
        } else {
            string2 = str2;
        }
        if ((i3 & 32) != 0) {
            string3 = context.getString(R.string.skip_button_description);
            Intrinsics.e(string3, "getString(...)");
        } else {
            string3 = str3;
        }
        this(context, attributeSet2, i4, string, string2, string3, (i3 & 64) != 0 ? new n5(context) : t5Var, (i3 & 128) != 0 ? a.f15369b : function0, (i3 & 256) != 0 ? b.f15370b : function1);
    }
}
