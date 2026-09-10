package chinny;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: AbsoluteCornerSize.java */
/* JADX INFO: loaded from: classes3.dex */
public final class attabal implements wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final float f15458attabal;

    public attabal(float f) {
        this.f15458attabal = f;
    }

    @Override // chinny.wireman
    public float attabal(RectF rectF) {
        return this.f15458attabal;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof attabal) && this.f15458attabal == ((attabal) obj).f15458attabal;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f15458attabal)});
    }

    public float saneness() {
        return this.f15458attabal;
    }

    public String toString() {
        return saneness() + "px";
    }
}
