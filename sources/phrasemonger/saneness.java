package phrasemonger;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: compiled from: AnimationUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final TimeInterpolator f35307attabal = new LinearInterpolator();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final TimeInterpolator f35310saneness = new fastrack.saneness();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final TimeInterpolator f35308dern = new fastrack.attabal();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final TimeInterpolator f35311wireman = new fastrack.dern();

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final TimeInterpolator f35309marial = new DecelerateInterpolator();

    public static float attabal(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    public static int dern(int i, int i2, float f) {
        return i + Math.round(f * (i2 - i));
    }

    public static float saneness(float f, float f2, float f3, float f4, float f5) {
        if (f5 <= f3) {
            return f;
        }
        return f5 >= f4 ? f2 : attabal(f, f2, (f5 - f3) / (f4 - f3));
    }
}
