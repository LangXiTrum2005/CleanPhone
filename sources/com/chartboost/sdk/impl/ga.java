package com.chartboost.sdk.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.chartboost.sdk.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class ga extends x0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f14006i = new b(null);
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function1 f14007e;
    public final ImageView f;
    public final TextView g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f14008h;

    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f14009b = new a();

        public a() {
            super(1);
        }

        public final void a(String it) {
            Intrinsics.f(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
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
    public ga(Context context, AttributeSet attributeSet, int i2, String infoIconContentDescription, Function1 onInfoIconClicked) {
        super(context, attributeSet, i2, null, null, 24, null);
        Intrinsics.f(context, "context");
        Intrinsics.f(infoIconContentDescription, "infoIconContentDescription");
        Intrinsics.f(onInfoIconClicked, "onInfoIconClicked");
        this.d = infoIconContentDescription;
        this.f14007e = onInfoIconClicked;
        this.f14008h = "";
        setId(View.generateViewId());
        setLayoutParams(new ConstraintLayout.LayoutParams(-2, -2));
        setCornerRadius(a(14));
        setContentDescription(infoIconContentDescription);
        ImageView imageView = new ImageView(context);
        imageView.setId(View.generateViewId());
        imageView.setLayoutParams(new ConstraintLayout.LayoutParams(a(28), a(28)));
        imageView.setImageResource(R.drawable.cb_info_icon);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImportantForAccessibility(2);
        this.f = imageView;
        TextView textView = new TextView(context);
        textView.setId(View.generateViewId());
        textView.setText(context.getString(R.string.sponsored_text));
        textView.setTextSize(12.0f);
        textView.setTextColor(-1);
        textView.setGravity(16);
        textView.setLayoutParams(new ConstraintLayout.LayoutParams(-2, -2));
        textView.setVisibility(8);
        textView.setImportantForAccessibility(2);
        this.g = textView;
        addView(imageView);
        addView(textView);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.e(this);
        constraintSet.f(imageView.getId(), 1, 0, 1);
        constraintSet.f(imageView.getId(), 3, 0, 3);
        constraintSet.f(imageView.getId(), 4, 0, 4);
        constraintSet.f(textView.getId(), 1, imageView.getId(), 2);
        constraintSet.f(textView.getId(), 3, 0, 3);
        constraintSet.f(textView.getId(), 4, 0, 4);
        constraintSet.f(textView.getId(), 2, 0, 2);
        constraintSet.k(textView.getId()).d.f4083E = a(8);
        constraintSet.b(this);
        setFocusable(true);
        setClickable(true);
    }

    public final void a(String url) {
        Intrinsics.f(url, "url");
        if (url.length() > 0) {
            return;
        }
        this.f.setImageResource(R.drawable.cb_info_icon);
    }

    public final void b() {
        String str;
        if (this.g.getVisibility() == 0) {
            str = this.d + ": " + ((Object) this.g.getText());
        } else {
            str = this.d;
        }
        setContentDescription(str);
    }

    public final String getClickthroughUrl() {
        return this.f14008h;
    }

    public final ImageView getIconView() {
        return this.f;
    }

    public final TextView getSponsorText() {
        return this.g;
    }

    @Override // android.view.View
    public boolean performClick() {
        this.f14007e.invoke(this.f14008h);
        return super.performClick();
    }

    public final void setClickthroughUrl(String url) {
        Intrinsics.f(url, "url");
        this.f14008h = url;
    }

    public final void setCustomContentDescription(String description) {
        Intrinsics.f(description, "description");
        b();
    }

    public final void setEnableSponsorText(boolean z2) {
        this.g.setVisibility(z2 ? 0 : 8);
        b();
    }

    public final void a(oj tracker, mj purpose) {
        Intrinsics.f(tracker, "tracker");
        Intrinsics.f(purpose, "purpose");
        tracker.a(this, purpose);
        tracker.a(this.f, purpose);
        tracker.a(this.g, purpose);
    }

    public final void a(t0 size) {
        Intrinsics.f(size, "size");
        ViewGroup.LayoutParams layoutParams = this.f.getLayoutParams();
        layoutParams.width = a(size.b());
        layoutParams.height = a(size.a());
        this.f.setLayoutParams(layoutParams);
        setCornerRadius(a(size.a() / ((double) 2)));
        requestLayout();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ga(Context context, AttributeSet attributeSet, int i2, String str, Function1 function1, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        AttributeSet attributeSet2 = (i3 & 2) != 0 ? null : attributeSet;
        int i4 = (i3 & 4) != 0 ? 0 : i2;
        if ((i3 & 8) != 0) {
            str = context.getString(R.string.info_icon_view_description);
            Intrinsics.e(str, "getString(...)");
        }
        this(context, attributeSet2, i4, str, (i3 & 16) != 0 ? a.f14009b : function1);
    }
}
