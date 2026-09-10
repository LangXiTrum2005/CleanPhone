package p1;

import com.google.android.gms.internal.ads.az1;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f48103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f48104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f48105c;

    public k0(az1 az1Var) {
        this.f48103a = az1Var.f12554a;
        this.f48104b = az1Var.f12555b;
        this.f48105c = az1Var.f12556c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return this.f48103a == k0Var.f48103a && this.f48104b == k0Var.f48104b && this.f48105c == k0Var.f48105c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f48103a), Float.valueOf(this.f48104b), Long.valueOf(this.f48105c));
    }
}
