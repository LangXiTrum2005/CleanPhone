package com.chartboost.sdk.impl;

import A.ViewOnClickListenerC0885d;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.chartboost.sdk.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class wj extends x0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f15492i = new a(null);
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f15493e;
    public final Function1 f;
    public final ImageView g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f15494h;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wj(Context context, AttributeSet attributeSet, int i2, String volumeOnContentDescription, String volumeOffContentDescription, Function1 function1) {
        super(context, attributeSet, i2, null, null, 24, null);
        Intrinsics.f(context, "context");
        Intrinsics.f(volumeOnContentDescription, "volumeOnContentDescription");
        Intrinsics.f(volumeOffContentDescription, "volumeOffContentDescription");
        this.d = volumeOnContentDescription;
        this.f15493e = volumeOffContentDescription;
        this.f = function1;
        setId(View.generateViewId());
        setCornerRadius(a(14));
        c();
        setFocusable(true);
        setClickable(true);
        ImageView imageView = new ImageView(context);
        imageView.setId(View.generateViewId());
        imageView.setLayoutParams(new ConstraintLayout.LayoutParams(a(28), a(28)));
        imageView.setImageResource(R.drawable.cb_volume_on_icon);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImportantForAccessibility(2);
        this.g = imageView;
        addView(imageView);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.e(this);
        constraintSet.f(imageView.getId(), 1, 0, 1);
        constraintSet.f(imageView.getId(), 2, 0, 2);
        constraintSet.f(imageView.getId(), 3, 0, 3);
        constraintSet.f(imageView.getId(), 4, 0, 4);
        constraintSet.b(this);
        setOnClickListener(new ViewOnClickListenerC0885d(this, 25));
    }

    public static final void a(wj this$0, View view) {
        Intrinsics.f(this$0, "this$0");
        this$0.b();
    }

    private final void c() {
        setContentDescription(this.f15494h ? this.f15493e : this.d);
    }

    public final void b() {
        boolean z2 = this.f15494h;
        this.f15494h = !z2;
        this.g.setImageResource(!z2 ? R.drawable.cb_volume_off_icon : R.drawable.cb_volume_on_icon);
        c();
        Function1 function1 = this.f;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(this.f15494h));
        }
    }

    public final ImageView getIconView() {
        return this.g;
    }

    public final void setMuted(boolean z2) {
        if (this.f15494h != z2) {
            this.f15494h = z2;
            this.g.setImageResource(z2 ? R.drawable.cb_volume_off_icon : R.drawable.cb_volume_on_icon);
            c();
            Function1 function1 = this.f;
            if (function1 != null) {
                function1.invoke(Boolean.valueOf(z2));
            }
        }
    }

    public final void a(oj tracker, mj purpose) {
        Intrinsics.f(tracker, "tracker");
        Intrinsics.f(purpose, "purpose");
        tracker.a(this, purpose);
        tracker.a(this.g, purpose);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ wj(Context context, AttributeSet attributeSet, int i2, String str, String str2, Function1 function1, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        attributeSet = (i3 & 2) != 0 ? null : attributeSet;
        i2 = (i3 & 4) != 0 ? 0 : i2;
        if ((i3 & 8) != 0) {
            str = context.getString(R.string.volume_on_description);
            Intrinsics.e(str, "getString(...)");
        }
        if ((i3 & 16) != 0) {
            str2 = context.getString(R.string.volume_off_description);
            Intrinsics.e(str2, "getString(...)");
        }
        this(context, attributeSet, i2, str, str2, (i3 & 32) != 0 ? null : function1);
    }
}
