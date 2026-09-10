package monroe;

import android.graphics.Insets;
import android.graphics.Rect;

/* JADX INFO: compiled from: Insets.java */
/* JADX INFO: loaded from: classes.dex */
public final class wireman {

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final wireman f33603marial = new wireman(0, 0, 0, 0);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f33604attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final int f33605dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f33606saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final int f33607wireman;

    /* JADX INFO: compiled from: Insets.java */
    public static class attabal {
        public static Insets attabal(int i, int i2, int i3, int i4) {
            return Insets.of(i, i2, i3, i4);
        }
    }

    public wireman(int i, int i2, int i3, int i4) {
        this.f33604attabal = i;
        this.f33606saneness = i2;
        this.f33605dern = i3;
        this.f33607wireman = i4;
    }

    public static wireman attabal(wireman wiremanVar, wireman wiremanVar2) {
        return dern(Math.max(wiremanVar.f33604attabal, wiremanVar2.f33604attabal), Math.max(wiremanVar.f33606saneness, wiremanVar2.f33606saneness), Math.max(wiremanVar.f33605dern, wiremanVar2.f33605dern), Math.max(wiremanVar.f33607wireman, wiremanVar2.f33607wireman));
    }

    public static wireman dern(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f33603marial : new wireman(i, i2, i3, i4);
    }

    public static wireman marial(Insets insets) {
        return dern(insets.left, insets.top, insets.right, insets.bottom);
    }

    public static wireman saneness(wireman wiremanVar, wireman wiremanVar2) {
        return dern(Math.min(wiremanVar.f33604attabal, wiremanVar2.f33604attabal), Math.min(wiremanVar.f33606saneness, wiremanVar2.f33606saneness), Math.min(wiremanVar.f33605dern, wiremanVar2.f33605dern), Math.min(wiremanVar.f33607wireman, wiremanVar2.f33607wireman));
    }

    public static wireman wireman(Rect rect) {
        return dern(rect.left, rect.top, rect.right, rect.bottom);
    }

    public Insets beachfront() {
        return attabal.attabal(this.f33604attabal, this.f33606saneness, this.f33605dern, this.f33607wireman);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wireman.class != obj.getClass()) {
            return false;
        }
        wireman wiremanVar = (wireman) obj;
        return this.f33607wireman == wiremanVar.f33607wireman && this.f33604attabal == wiremanVar.f33604attabal && this.f33605dern == wiremanVar.f33605dern && this.f33606saneness == wiremanVar.f33606saneness;
    }

    public int hashCode() {
        return (((((this.f33604attabal * 31) + this.f33606saneness) * 31) + this.f33605dern) * 31) + this.f33607wireman;
    }

    public String toString() {
        return "Insets{left=" + this.f33604attabal + ", top=" + this.f33606saneness + ", right=" + this.f33605dern + ", bottom=" + this.f33607wireman + '}';
    }
}
