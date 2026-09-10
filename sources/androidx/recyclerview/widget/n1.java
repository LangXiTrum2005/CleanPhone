package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 implements Parcelable {
    public static final Parcelable.Creator<n1> CREATOR = new android.support.v4.media.a(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f4841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4842e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f4843f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f4844g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f4845h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f4846i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f4847j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f4838a);
        parcel.writeInt(this.f4839b);
        parcel.writeInt(this.f4840c);
        if (this.f4840c > 0) {
            parcel.writeIntArray(this.f4841d);
        }
        parcel.writeInt(this.f4842e);
        if (this.f4842e > 0) {
            parcel.writeIntArray(this.f4843f);
        }
        parcel.writeInt(this.f4845h ? 1 : 0);
        parcel.writeInt(this.f4846i ? 1 : 0);
        parcel.writeInt(this.f4847j ? 1 : 0);
        parcel.writeList(this.f4844g);
    }
}
