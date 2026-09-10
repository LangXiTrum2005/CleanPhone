package androidx.core.view;

import android.os.Build;
import android.view.DisplayCutout;

/* JADX INFO: compiled from: DisplayCutoutCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class polloi {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final DisplayCutout f9386attabal;

    /* JADX INFO: compiled from: DisplayCutoutCompat.java */
    public static class attabal {
        public static int attabal(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        public static int dern(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        public static int saneness(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        public static int wireman(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    public polloi(DisplayCutout displayCutout) {
        this.f9386attabal = displayCutout;
    }

    public static polloi marial(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new polloi(displayCutout);
    }

    public int attabal() {
        if (Build.VERSION.SDK_INT >= 28) {
            return attabal.attabal(this.f9386attabal);
        }
        return 0;
    }

    public int dern() {
        if (Build.VERSION.SDK_INT >= 28) {
            return attabal.dern(this.f9386attabal);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || polloi.class != obj.getClass()) {
            return false;
        }
        return technofreak.marial.attabal(this.f9386attabal, ((polloi) obj).f9386attabal);
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.f9386attabal;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public int saneness() {
        if (Build.VERSION.SDK_INT >= 28) {
            return attabal.saneness(this.f9386attabal);
        }
        return 0;
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f9386attabal + "}";
    }

    public int wireman() {
        if (Build.VERSION.SDK_INT >= 28) {
            return attabal.wireman(this.f9386attabal);
        }
        return 0;
    }
}
