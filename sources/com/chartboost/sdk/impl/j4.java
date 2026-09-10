package com.chartboost.sdk.impl;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.chartboost.sdk.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class j4 extends FrameLayout {
    public static final b d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f14229e = -15262682;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t5 f14230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f14231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f14232c;

    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f14233b = new a();

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
    public j4(Context context, AttributeSet attributeSet, int i2, t5 densityProvider, Function0 onCloseClicked) {
        super(context, attributeSet, i2);
        Intrinsics.f(context, "context");
        Intrinsics.f(densityProvider, "densityProvider");
        Intrinsics.f(onCloseClicked, "onCloseClicked");
        this.f14230a = densityProvider;
        this.f14231b = onCloseClicked;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(f14229e);
        setBackground(gradientDrawable);
        ImageView imageView = new ImageView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(densityProvider.a(28), densityProvider.a(28));
        layoutParams.gravity = 17;
        imageView.setLayoutParams(layoutParams);
        imageView.setImageResource(R.drawable.cb_close_icon);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f14232c = imageView;
        addView(imageView);
    }

    public final void a(oj tracker, mj purpose) {
        Intrinsics.f(tracker, "tracker");
        Intrinsics.f(purpose, "purpose");
        tracker.a(this, purpose);
        tracker.a(this.f14232c, purpose);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.f(event, "event");
        if (event.getAction() == 1) {
            this.f14231b.invoke();
        }
        return true;
    }

    public /* synthetic */ j4(Context context, AttributeSet attributeSet, int i2, t5 t5Var, Function0 function0, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? new n5(context) : t5Var, (i3 & 16) != 0 ? a.f14233b : function0);
    }
}
