package com.inmobi.media;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C2943b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23457a = "b1";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f23458b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f23459c;

    public static C2926a1 a(ValueAnimator valueAnimator, C2984d8 c2984d8) {
        valueAnimator.setDuration(0L);
        valueAnimator.setStartDelay(0L);
        P8 p8 = c2984d8.d.k;
        if (p8 != null) {
            O8 o8 = p8.f23068a;
            O8 o9 = p8.f23069b;
            if (o9 != null) {
                valueAnimator.setDuration(o9.a() * ((long) 1000));
            }
            if (o8 != null) {
                valueAnimator.setStartDelay(o8.a() * ((long) 1000));
            }
        }
        return new C2926a1(valueAnimator);
    }

    public static ValueAnimator b(View view, float f, float f2) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        valueAnimatorOfFloat.addUpdateListener(new A.V(view, 1, layoutParams instanceof C3065i8 ? (C3065i8) layoutParams : null));
        return valueAnimatorOfFloat;
    }

    public static final void b(C3065i8 c3065i8, View view, ValueAnimator valueAnimator) {
        Intrinsics.f(view, "$view");
        Intrinsics.f(valueAnimator, "valueAnimator");
        if (c3065i8 != null) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            Intrinsics.d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            c3065i8.f23693b = (int) ((Float) animatedValue).floatValue();
        }
        view.setLayoutParams(c3065i8);
        view.requestLayout();
    }

    public static ValueAnimator a(View view, float f, float f2) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        valueAnimatorOfFloat.addUpdateListener(new A.V(view, 0, layoutParams instanceof C3065i8 ? (C3065i8) layoutParams : null));
        return valueAnimatorOfFloat;
    }

    public static final void a(C3065i8 c3065i8, View view, ValueAnimator valueAnimator) {
        Intrinsics.f(view, "$view");
        Intrinsics.f(valueAnimator, "valueAnimator");
        if (c3065i8 != null) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            Intrinsics.d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            c3065i8.f23692a = (int) ((Float) animatedValue).floatValue();
        }
        view.setLayoutParams(c3065i8);
        view.requestLayout();
    }

    public final void a(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C2926a1 c2926a1 = (C2926a1) it.next();
            if (!c2926a1.f23423c) {
                ValueAnimator valueAnimator = c2926a1.f23421a;
                Intrinsics.d(valueAnimator, "null cannot be cast to non-null type android.animation.ValueAnimator");
                valueAnimator.setCurrentPlayTime(c2926a1.f23422b);
                valueAnimator.start();
            }
            if (!this.f23458b.contains(c2926a1)) {
                this.f23458b.add(c2926a1);
            }
        }
    }

    public final void a() {
        if (this.f23459c) {
            this.f23459c = false;
            for (C2926a1 c2926a1 : this.f23458b) {
                ValueAnimator valueAnimator = c2926a1.f23421a;
                Intrinsics.d(valueAnimator, "null cannot be cast to non-null type android.animation.ValueAnimator");
                c2926a1.f23422b = valueAnimator.getCurrentPlayTime();
                if (valueAnimator.getAnimatedFraction() == 1.0d) {
                    c2926a1.f23423c = true;
                }
                valueAnimator.cancel();
            }
        }
    }
}
