package s5;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f50149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f50150b;

    public e(int i10, String str) {
        this.f50149a = i10;
        this.f50150b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f50149a == eVar.f50149a && this.f50150b.equals(eVar.f50150b);
    }

    public final int hashCode() {
        return this.f50150b.hashCode() + (Integer.hashCode(this.f50149a) * 31);
    }

    public final String toString() {
        return "PhoneLabelPair(label=" + this.f50149a + ", customLabel=" + this.f50150b + ")";
    }
}
