package m0;

import android.view.DisplayCutout;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisplayCutout f45716a;

    public j(DisplayCutout displayCutout) {
        this.f45716a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f45716a, ((j) obj).f45716a);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f45716a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f45716a + "}";
    }
}
