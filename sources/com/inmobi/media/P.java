package com.inmobi.media;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.widget.RelativeLayout;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes5.dex */
public abstract class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f23055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public EnumC3179pa f23056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f23057c;
    public boolean d;

    public P(RelativeLayout adBackgroundView) {
        Intrinsics.f(adBackgroundView, "adBackgroundView");
        this.f23055a = adBackgroundView;
        this.f23056b = AbstractC3195qa.a(U3.g());
        this.f23057c = 1.0f;
    }

    public abstract void a();

    public void a(EnumC3179pa orientation) {
        Intrinsics.f(orientation, "orientation");
        this.f23056b = orientation;
    }

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public final void e() {
        T3 t3;
        T3 t4;
        RelativeLayout.LayoutParams layoutParams;
        if (this.f23057c == 1.0f) {
            this.f23055a.setLayoutParams(androidx.media3.extractor.text.ttml.a.f(-1, -1, 10));
            return;
        }
        if (this.d) {
            V3 v3 = U3.f23253a;
            Context context = this.f23055a.getContext();
            Intrinsics.e(context, "getContext(...)");
            Display displayA = U3.a(context);
            if (displayA == null) {
                t4 = U3.f23254b;
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                displayA.getRealMetrics(displayMetrics);
                t3 = new T3(displayMetrics.widthPixels, displayMetrics.heightPixels);
                t4 = t3;
            }
        } else {
            V3 v4 = U3.f23253a;
            Context context2 = this.f23055a.getContext();
            Intrinsics.e(context2, "getContext(...)");
            Display displayA2 = U3.a(context2);
            if (displayA2 == null) {
                t4 = U3.f23254b;
            } else {
                DisplayMetrics displayMetrics2 = new DisplayMetrics();
                displayA2.getMetrics(displayMetrics2);
                t3 = new T3(displayMetrics2.widthPixels, displayMetrics2.heightPixels);
                t4 = t3;
            }
        }
        Objects.toString(this.f23056b);
        if (AbstractC3195qa.b(this.f23056b)) {
            layoutParams = new RelativeLayout.LayoutParams(MathKt.b(t4.f23197a * this.f23057c), -1);
            layoutParams.addRule(9);
        } else {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, MathKt.b(t4.f23198b * this.f23057c));
            layoutParams2.addRule(10);
            layoutParams = layoutParams2;
        }
        this.f23055a.setLayoutParams(layoutParams);
    }

    public abstract void f();

    public abstract void g();
}
