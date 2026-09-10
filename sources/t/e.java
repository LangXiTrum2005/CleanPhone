package t;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f50287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f50288b;

    public e(int i10, CharSequence charSequence) {
        this.f50287a = i10;
        this.f50288b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f50287a != eVar.f50287a) {
            return false;
        }
        CharSequence charSequence = eVar.f50288b;
        CharSequence charSequence2 = this.f50288b;
        String string = charSequence2 != null ? charSequence2.toString() : null;
        String string2 = charSequence != null ? charSequence.toString() : null;
        if (string == null && string2 == null) {
            return true;
        }
        return string != null && string.equals(string2);
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.f50287a);
        CharSequence charSequence = this.f50288b;
        return Arrays.hashCode(new Object[]{numValueOf, charSequence != null ? charSequence.toString() : null});
    }
}
