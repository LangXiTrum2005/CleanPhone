package y7;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new l7.h(11);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f54230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f54231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f54232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f54233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f54234e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.n.f(dest, "dest");
        dest.writeString(this.f54230a);
        dest.writeString(this.f54231b);
        dest.writeString(this.f54232c);
        dest.writeLong(this.f54233d);
        dest.writeLong(this.f54234e);
    }
}
