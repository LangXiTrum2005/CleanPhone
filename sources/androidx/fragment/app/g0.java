package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import p.v2;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4321a;

    public /* synthetic */ g0(int i10) {
        this.f4321a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f4321a) {
            case 0:
                return new h0(parcel, null);
            case 1:
                return new androidx.recyclerview.widget.b1(parcel, null);
            case 2:
                return new androidx.viewpager.widget.i(parcel, null);
            case 3:
                return new v2(parcel, null);
            default:
                if (parcel.readParcelable(null) == null) {
                    return q0.b.f48513b;
                }
                throw new IllegalStateException("superState must be null");
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f4321a) {
            case 0:
                return new h0[i10];
            case 1:
                return new androidx.recyclerview.widget.b1[i10];
            case 2:
                return new androidx.viewpager.widget.i[i10];
            case 3:
                return new v2[i10];
            default:
                return new q0.b[i10];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f4321a) {
            case 0:
                return new h0(parcel, classLoader);
            case 1:
                return new androidx.recyclerview.widget.b1(parcel, classLoader);
            case 2:
                return new androidx.viewpager.widget.i(parcel, classLoader);
            case 3:
                return new v2(parcel, classLoader);
            default:
                if (parcel.readParcelable(classLoader) == null) {
                    return q0.b.f48513b;
                }
                throw new IllegalStateException("superState must be null");
        }
    }
}
