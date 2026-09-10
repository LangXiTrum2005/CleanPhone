package androidx.cardview.widget;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: RoundRectDrawableWithShadow.java */
/* JADX INFO: loaded from: classes.dex */
public class marial extends Drawable {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final double f5627attabal = Math.cos(Math.toRadians(45.0d));

    public static float attabal(float f, float f2, boolean z) {
        return z ? (float) (((double) f) + ((1.0d - f5627attabal) * ((double) f2))) : f;
    }

    public static float saneness(float f, float f2, boolean z) {
        return z ? (float) (((double) (f * 1.5f)) + ((1.0d - f5627attabal) * ((double) f2))) : f * 1.5f;
    }
}
