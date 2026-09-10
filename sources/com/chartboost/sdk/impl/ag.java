package com.chartboost.sdk.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.chartboost.sdk.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class ag extends x0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f13457i = new b(null);
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f13458e;
    public final t5 f;
    public final Function0 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f13459h;

    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f13460b = new a();

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

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(Context context, AttributeSet attributeSet, int i2, int i3, String skipButtonContentDescription, t5 densityProvider, Function0 onSkipClicked) {
        super(context, attributeSet, i2, null, densityProvider, 8, null);
        Intrinsics.f(context, "context");
        Intrinsics.f(skipButtonContentDescription, "skipButtonContentDescription");
        Intrinsics.f(densityProvider, "densityProvider");
        Intrinsics.f(onSkipClicked, "onSkipClicked");
        this.d = i3;
        this.f13458e = skipButtonContentDescription;
        this.f = densityProvider;
        this.g = onSkipClicked;
        setId(View.generateViewId());
        setCornerRadius(a(14));
        setContentDescription((CharSequence) skipButtonContentDescription);
        ImageView imageView = new ImageView(context);
        imageView.setId(View.generateViewId());
        imageView.setLayoutParams(new ConstraintLayout.LayoutParams(a(28), a(28)));
        imageView.setImageResource(i3);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImportantForAccessibility(2);
        this.f13459h = imageView;
        addView(imageView);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.e(this);
        constraintSet.f(imageView.getId(), 1, 0, 1);
        constraintSet.f(imageView.getId(), 2, 0, 2);
        constraintSet.f(imageView.getId(), 3, 0, 3);
        constraintSet.f(imageView.getId(), 4, 0, 4);
        constraintSet.b(this);
        setFocusable(true);
        setClickable(true);
    }

    public final void a(oj tracker, mj purpose) {
        Intrinsics.f(tracker, "tracker");
        Intrinsics.f(purpose, "purpose");
        tracker.a(this, purpose);
        tracker.a(this.f13459h, purpose);
    }

    public final ImageView getIconView() {
        return this.f13459h;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.f(event, "event");
        if (event.getAction() == 1) {
            this.g.invoke();
        }
        return true;
    }

    public final void setContentDescription(String description) {
        Intrinsics.f(description, "description");
        setContentDescription((CharSequence) description);
    }

    public final void setSkipIcon(int i2) {
        this.f13459h.setImageResource(i2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ag(Context context, AttributeSet attributeSet, int i2, int i3, String str, t5 t5Var, Function0 function0, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        String string;
        AttributeSet attributeSet2 = (i4 & 2) != 0 ? null : attributeSet;
        int i5 = (i4 & 4) != 0 ? 0 : i2;
        int i6 = (i4 & 8) != 0 ? R.drawable.cb_skip_icon : i3;
        if ((i4 & 16) != 0) {
            string = context.getString(R.string.skip_button_description);
            Intrinsics.e(string, "getString(...)");
        } else {
            string = str;
        }
        this(context, attributeSet2, i5, i6, string, (i4 & 32) != 0 ? new n5(context) : t5Var, (i4 & 64) != 0 ? a.f13460b : function0);
    }
}
