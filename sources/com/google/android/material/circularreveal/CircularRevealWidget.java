package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import com.google.android.material.math.MathUtils;

/* JADX INFO: loaded from: classes4.dex */
public interface CircularRevealWidget extends CircularRevealHelper.Delegate {

    public static class CircularRevealEvaluator implements TypeEvaluator<RevealInfo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RevealInfo f19212a = new RevealInfo();

        static {
            new CircularRevealEvaluator();
        }

        @Override // android.animation.TypeEvaluator
        public final RevealInfo evaluate(float f, RevealInfo revealInfo, RevealInfo revealInfo2) {
            RevealInfo revealInfo3 = revealInfo;
            RevealInfo revealInfo4 = revealInfo2;
            float fA = MathUtils.a(revealInfo3.f19213a, revealInfo4.f19213a, f);
            float fA2 = MathUtils.a(revealInfo3.f19214b, revealInfo4.f19214b, f);
            float fA3 = MathUtils.a(revealInfo3.f19215c, revealInfo4.f19215c, f);
            RevealInfo revealInfo5 = this.f19212a;
            revealInfo5.f19213a = fA;
            revealInfo5.f19214b = fA2;
            revealInfo5.f19215c = fA3;
            return revealInfo5;
        }
    }

    public static class CircularRevealProperty extends Property<CircularRevealWidget, RevealInfo> {
        static {
            new CircularRevealProperty(RevealInfo.class, "circularReveal");
        }

        @Override // android.util.Property
        public final RevealInfo get(CircularRevealWidget circularRevealWidget) {
            return circularRevealWidget.getRevealInfo();
        }

        @Override // android.util.Property
        public final void set(CircularRevealWidget circularRevealWidget, RevealInfo revealInfo) {
            circularRevealWidget.setRevealInfo(revealInfo);
        }
    }

    public static class CircularRevealScrimColorProperty extends Property<CircularRevealWidget, Integer> {
        static {
            new CircularRevealScrimColorProperty(Integer.class, "circularRevealScrimColor");
        }

        @Override // android.util.Property
        public final Integer get(CircularRevealWidget circularRevealWidget) {
            return Integer.valueOf(circularRevealWidget.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        public final void set(CircularRevealWidget circularRevealWidget, Integer num) {
            circularRevealWidget.setCircularRevealScrimColor(num.intValue());
        }
    }

    public static class RevealInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f19213a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f19214b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f19215c;
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    RevealInfo getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i2);

    void setRevealInfo(RevealInfo revealInfo);
}
