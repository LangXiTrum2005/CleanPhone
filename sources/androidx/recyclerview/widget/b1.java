package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends q0.b {
    public static final Parcelable.Creator<b1> CREATOR = new androidx.fragment.app.g0(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Parcelable f4726c;

    public b1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f4726c = parcel.readParcelable(classLoader == null ? r0.class.getClassLoader() : classLoader);
    }

    @Override // q0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeParcelable(this.f4726c, 0);
    }
}
