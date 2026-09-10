package chinny;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: RelativeCornerSize.java */
/* JADX INFO: loaded from: classes3.dex */
public final class impassible implements wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final float f15486attabal;

    public impassible(float f) {
        this.f15486attabal = f;
    }

    private static float saneness(RectF rectF) {
        return Math.min(rectF.width(), rectF.height());
    }

    @Override // chinny.wireman
    public float attabal(RectF rectF) {
        return this.f15486attabal * saneness(rectF);
    }

    public float dern() {
        return this.f15486attabal;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof impassible) && this.f15486attabal == ((impassible) obj).f15486attabal;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f15486attabal)});
    }

    public String toString() {
        return ((int) (dern() * 100.0f)) + "%";
    }
}
