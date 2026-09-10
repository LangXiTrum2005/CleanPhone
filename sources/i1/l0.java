package i1;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements Comparable, Parcelable {
    public static final Parcelable.Creator<l0> CREATOR = new k(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f42575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f42576c;

    static {
        l1.y.G(0);
        l1.y.G(1);
        l1.y.G(2);
    }

    public l0() {
        this.f42574a = -1;
        this.f42575b = -1;
        this.f42576c = -1;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        l0 l0Var = (l0) obj;
        int i10 = this.f42574a - l0Var.f42574a;
        return (i10 == 0 && (i10 = this.f42575b - l0Var.f42575b) == 0) ? this.f42576c - l0Var.f42576c : i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l0.class == obj.getClass()) {
            l0 l0Var = (l0) obj;
            if (this.f42574a == l0Var.f42574a && this.f42575b == l0Var.f42575b && this.f42576c == l0Var.f42576c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f42574a * 31) + this.f42575b) * 31) + this.f42576c;
    }

    public final String toString() {
        return this.f42574a + "." + this.f42575b + "." + this.f42576c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f42574a);
        parcel.writeInt(this.f42575b);
        parcel.writeInt(this.f42576c);
    }

    public l0(Parcel parcel) {
        this.f42574a = parcel.readInt();
        this.f42575b = parcel.readInt();
        this.f42576c = parcel.readInt();
    }
}
