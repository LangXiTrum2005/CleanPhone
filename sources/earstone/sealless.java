package earstone;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* JADX INFO: compiled from: ViewUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class sealless {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final restrictive f25555attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final Property<View, Rect> f25556dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final Property<View, Float> f25557saneness;

    /* JADX INFO: compiled from: ViewUtils.java */
    public class attabal extends Property<View, Float> {
        public attabal(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(sealless.saneness(view));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f) {
            sealless.beachfront(view, f.floatValue());
        }
    }

    /* JADX INFO: compiled from: ViewUtils.java */
    public class saneness extends Property<View, Rect> {
        public saneness(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return view.getClipBounds();
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f25555attabal = new starveling();
        } else {
            f25555attabal = new creditor();
        }
        f25557saneness = new attabal(Float.class, "translationAlpha");
        f25556dern = new saneness(Rect.class, "clipBounds");
    }

    public static void attabal(View view) {
        f25555attabal.attabal(view);
    }

    public static void beachfront(View view, float f) {
        f25555attabal.beachfront(view, f);
    }

    public static void competently(View view, int i) {
        f25555attabal.competently(view, i);
    }

    public static void dern(View view) {
        f25555attabal.dern(view);
    }

    public static void impromptu(View view, Matrix matrix) {
        f25555attabal.impromptu(view, matrix);
    }

    public static void marial(View view, int i, int i2, int i3, int i4) {
        f25555attabal.marial(view, i, i2, i3, i4);
    }

    public static float saneness(View view) {
        return f25555attabal.saneness(view);
    }

    public static void taiyuan(View view, Matrix matrix) {
        f25555attabal.taiyuan(view, matrix);
    }

    public static void wireman(View view, Matrix matrix) {
        f25555attabal.wireman(view, matrix);
    }
}
