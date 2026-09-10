package e0;

import android.content.res.Resources;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f39002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources.Theme f39003b;

    public i(Resources resources, Resources.Theme theme) {
        this.f39002a = resources;
        this.f39003b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f39002a.equals(iVar.f39002a) && Objects.equals(this.f39003b, iVar.f39003b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f39002a, this.f39003b);
    }
}
