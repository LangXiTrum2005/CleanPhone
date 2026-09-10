package k9;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements j9.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f44502b = new q(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44503a;

    public /* synthetic */ q(String str) {
        this.f44503a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            return c0.l(this.f44503a, ((q) obj).f44503a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44503a});
    }
}
