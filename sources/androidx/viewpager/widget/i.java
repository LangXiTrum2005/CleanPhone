package androidx.viewpager.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.g0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends q0.b {
    public static final Parcelable.Creator<i> CREATOR = new g0(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Parcelable f5000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ClassLoader f5001e;

    public i(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? i.class.getClassLoader() : classLoader;
        this.f4999c = parcel.readInt();
        this.f5000d = parcel.readParcelable(classLoader);
        this.f5001e = classLoader;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentPager.SavedState{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" position=");
        return l1.d.i(sb2, this.f4999c, "}");
    }

    @Override // q0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f4999c);
        parcel.writeParcelable(this.f5000d, i10);
    }
}
