package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* JADX INFO: compiled from: CircularRevealWidget.java */
/* JADX INFO: loaded from: classes3.dex */
public interface dern extends com.google.android.material.circularreveal.saneness.attabal {

    /* JADX INFO: renamed from: com.google.android.material.circularreveal.dern$dern, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CircularRevealWidget.java */
    public static class C0300dern extends Property<dern, marial> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final Property<dern, marial> f19993attabal = new C0300dern("circularReveal");

        public C0300dern(String str) {
            super(marial.class, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public marial get(dern dernVar) {
            return dernVar.getRevealInfo();
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public void set(dern dernVar, marial marialVar) {
            dernVar.setRevealInfo(marialVar);
        }
    }

    /* JADX INFO: compiled from: CircularRevealWidget.java */
    public static class marial {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public float f19994attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public float f19995dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public float f19996saneness;

        public boolean attabal() {
            return this.f19995dern == Float.MAX_VALUE;
        }

        public void dern(marial marialVar) {
            saneness(marialVar.f19994attabal, marialVar.f19996saneness, marialVar.f19995dern);
        }

        public void saneness(float f, float f2, float f3) {
            this.f19994attabal = f;
            this.f19996saneness = f2;
            this.f19995dern = f3;
        }

        public marial() {
        }

        public marial(float f, float f2, float f3) {
            this.f19994attabal = f;
            this.f19996saneness = f2;
            this.f19995dern = f3;
        }

        public marial(marial marialVar) {
            this(marialVar.f19994attabal, marialVar.f19996saneness, marialVar.f19995dern);
        }
    }

    /* JADX INFO: compiled from: CircularRevealWidget.java */
    public static class saneness implements TypeEvaluator<marial> {

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final TypeEvaluator<marial> f19997saneness = new saneness();

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final marial f19998attabal = new marial();

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public marial evaluate(float f, marial marialVar, marial marialVar2) {
            this.f19998attabal.saneness(othin.attabal.beachfront(marialVar.f19994attabal, marialVar2.f19994attabal, f), othin.attabal.beachfront(marialVar.f19996saneness, marialVar2.f19996saneness, f), othin.attabal.beachfront(marialVar.f19995dern, marialVar2.f19995dern, f));
            return this.f19998attabal;
        }
    }

    /* JADX INFO: compiled from: CircularRevealWidget.java */
    public static class wireman extends Property<dern, Integer> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final Property<dern, Integer> f19999attabal = new wireman("circularRevealScrimColor");

        public wireman(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public Integer get(dern dernVar) {
            return Integer.valueOf(dernVar.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public void set(dern dernVar, Integer num) {
            dernVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    void buildCircularRevealCache();

    void destroyCircularRevealCache();

    int getCircularRevealScrimColor();

    marial getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(marial marialVar);
}
