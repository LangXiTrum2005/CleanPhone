package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 implements Parcelable {
    public static final Parcelable.Creator<i1> CREATOR = new android.support.v4.media.a(12);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f4357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f4358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b[] f4359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f4361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f4362f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f4363g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f4364h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f4357a);
        parcel.writeStringList(this.f4358b);
        parcel.writeTypedArray(this.f4359c, i10);
        parcel.writeInt(this.f4360d);
        parcel.writeString(this.f4361e);
        parcel.writeStringList(this.f4362f);
        parcel.writeTypedList(this.f4363g);
        parcel.writeTypedList(this.f4364h);
    }
}
