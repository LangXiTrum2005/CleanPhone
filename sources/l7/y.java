package l7;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements Parcelable {
    public static final Parcelable.Creator<y> CREATOR = new h(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Parcelable f45235b;

    public y(Parcelable parcelable) {
        this.f45234a = "image/png";
        this.f45235b = parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        kotlin.jvm.internal.n.f(out, "out");
        out.writeString(this.f45234a);
        out.writeParcelable(this.f45235b, i10);
    }

    public y(Parcel parcel) {
        this.f45234a = parcel.readString();
        this.f45235b = parcel.readParcelable(s.b().getClassLoader());
    }
}
