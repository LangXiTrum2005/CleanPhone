package com.chartboost.sdk.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.chartboost.sdk.R;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes3.dex */
public final class rg extends x0 {
    public static final a k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f15062l = -14669512;
    public static final int m = -436207617;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f15063n = -1;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t5 f15064e;
    public final qg f;
    public final TextView g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public sg f15065h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f15066i;
    public String j;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15067a;

        static {
            int[] iArr = new int[sg.values().length];
            try {
                iArr[sg.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[sg.ARC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f15067a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rg(Context context, AttributeSet attributeSet, int i2, String timerContentDescription, t5 densityProvider) {
        super(context, attributeSet, i2, null, densityProvider, 8, null);
        Intrinsics.f(context, "context");
        Intrinsics.f(timerContentDescription, "timerContentDescription");
        Intrinsics.f(densityProvider, "densityProvider");
        this.d = timerContentDescription;
        this.f15064e = densityProvider;
        this.f15065h = sg.ARC;
        this.f15066i = "Reward in %d seconds";
        this.j = "Reward granted";
        setId(View.generateViewId());
        setLayoutParams(new ConstraintLayout.LayoutParams(a(28), a(28)));
        setCornerRadius(a(14));
        setContentDescription((CharSequence) timerContentDescription);
        qg qgVar = new qg(context, attributeSet, i2, densityProvider);
        qgVar.setId(View.generateViewId());
        qgVar.setLayoutParams(new ConstraintLayout.LayoutParams(a(28), a(28)));
        qgVar.setBackgroundPaintColor(-15262682);
        qgVar.setArcColor(m);
        this.f = qgVar;
        TextView textView = new TextView(context);
        textView.setId(View.generateViewId());
        textView.setLayoutParams(new ConstraintLayout.LayoutParams(-2, -2));
        textView.setTextSize(12.0f);
        textView.setTextColor(f15063n);
        textView.setIncludeFontPadding(false);
        textView.setGravity(17);
        textView.setImportantForAccessibility(2);
        this.g = textView;
        addView(qgVar);
        addView(textView);
        setFocusable(true);
        setClickable(true);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.e(this);
        constraintSet.f(qgVar.getId(), 1, 0, 1);
        constraintSet.f(qgVar.getId(), 2, 0, 2);
        constraintSet.f(qgVar.getId(), 3, 0, 3);
        constraintSet.f(qgVar.getId(), 4, 0, 4);
        constraintSet.f(textView.getId(), 1, 0, 1);
        constraintSet.f(textView.getId(), 2, 0, 2);
        constraintSet.f(textView.getId(), 3, 0, 3);
        constraintSet.f(textView.getId(), 4, 0, 4);
        constraintSet.b(this);
    }

    public final String a(long j) {
        return String.valueOf((int) Math.rint(j / 1000.0f));
    }

    public final void b(long j) {
        int i2 = b.f15067a[this.f15065h.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                return;
            }
            this.g.setText(a(j));
        } else if (j <= 0) {
            this.g.setText(this.j);
        } else {
            this.g.setText(String.format(this.f15066i, Arrays.copyOf(new Object[]{Long.valueOf(j / ((long) 1000))}, 1)));
        }
    }

    public final qg getTimerArc() {
        return this.f;
    }

    public final TextView getTimerText() {
        return this.g;
    }

    public final void setContentDescription(String description) {
        Intrinsics.f(description, "description");
        setContentDescription((CharSequence) description);
    }

    public final void setDurationMs(long j) {
        this.f.setProgress(1.0f);
        b(j);
    }

    public final void a(oj tracker, mj purpose) {
        Intrinsics.f(tracker, "tracker");
        Intrinsics.f(purpose, "purpose");
        tracker.a(this, purpose);
        tracker.a(this.f, purpose);
        tracker.a(this.g, purpose);
    }

    public final void a(sg mode, String str, String str2) {
        Intrinsics.f(mode, "mode");
        this.f15065h = mode;
        int i2 = b.f15067a[mode.ordinal()];
        if (i2 == 1) {
            setLayoutParams(new ConstraintLayout.LayoutParams(-2, a(28)));
            this.f.setVisibility(8);
            this.g.setVisibility(0);
            setCornerRadius(a(14));
            getBackgroundDrawable().setColor(f15062l);
            if (str != null) {
                this.f15066i = str;
            }
            if (str2 != null) {
                this.j = str2;
            }
            this.g.setPadding(a(12), a(8), a(12), a(8));
        } else if (i2 == 2) {
            setLayoutParams(new ConstraintLayout.LayoutParams(a(28), a(28)));
            this.f.setVisibility(0);
            this.g.setVisibility(0);
            setCornerRadius(a(14));
            getBackgroundDrawable().setColor(-15262682);
            this.g.setPadding(0, 0, 0, 0);
        }
        requestLayout();
    }

    public final void a(long j, long j2) {
        this.f.setProgress(RangesKt.a(j / j2));
        b(j);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ rg(Context context, AttributeSet attributeSet, int i2, String str, t5 t5Var, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        AttributeSet attributeSet2 = (i3 & 2) != 0 ? null : attributeSet;
        int i4 = (i3 & 4) != 0 ? 0 : i2;
        if ((i3 & 8) != 0) {
            str = context.getString(R.string.timer_notification_icon_description);
            Intrinsics.e(str, "getString(...)");
        }
        this(context, attributeSet2, i4, str, (i3 & 16) != 0 ? new n5(context) : t5Var);
    }
}
