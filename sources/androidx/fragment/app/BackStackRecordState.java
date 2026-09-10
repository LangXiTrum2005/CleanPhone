package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new AnonymousClass1();
    public final int[] X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final ArrayList f5077Y;
    public final int[] Z;
    public final int[] e0;
    public final int f0;
    public final String g0;
    public final int h0;
    public final int i0;
    public final CharSequence j0;
    public final int k0;
    public final CharSequence l0;
    public final ArrayList m0;
    public final ArrayList n0;
    public final boolean o0;

    /* JADX INFO: renamed from: androidx.fragment.app.BackStackRecordState$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<BackStackRecordState> {
        @Override // android.os.Parcelable.Creator
        public final BackStackRecordState createFromParcel(Parcel parcel) {
            return new BackStackRecordState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BackStackRecordState[] newArray(int i2) {
            return new BackStackRecordState[i2];
        }
    }

    public BackStackRecordState(BackStackRecord backStackRecord) {
        int size = backStackRecord.f5157a.size();
        this.X = new int[size * 6];
        if (!backStackRecord.g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f5077Y = new ArrayList(size);
        this.Z = new int[size];
        this.e0 = new int[size];
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            FragmentTransaction.Op op = (FragmentTransaction.Op) backStackRecord.f5157a.get(i3);
            int i4 = i2 + 1;
            this.X[i2] = op.f5165a;
            ArrayList arrayList = this.f5077Y;
            Fragment fragment = op.f5166b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.X;
            iArr[i4] = op.f5167c ? 1 : 0;
            iArr[i2 + 2] = op.d;
            iArr[i2 + 3] = op.f5168e;
            int i5 = i2 + 5;
            iArr[i2 + 4] = op.f;
            i2 += 6;
            iArr[i5] = op.g;
            this.Z[i3] = op.f5169h.ordinal();
            this.e0[i3] = op.f5170i.ordinal();
        }
        this.f0 = backStackRecord.f;
        this.g0 = backStackRecord.f5161h;
        this.h0 = backStackRecord.r;
        this.i0 = backStackRecord.f5162i;
        this.j0 = backStackRecord.j;
        this.k0 = backStackRecord.k;
        this.l0 = backStackRecord.f5163l;
        this.m0 = backStackRecord.m;
        this.n0 = backStackRecord.f5164n;
        this.o0 = backStackRecord.o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.X);
        parcel.writeStringList(this.f5077Y);
        parcel.writeIntArray(this.Z);
        parcel.writeIntArray(this.e0);
        parcel.writeInt(this.f0);
        parcel.writeString(this.g0);
        parcel.writeInt(this.h0);
        parcel.writeInt(this.i0);
        TextUtils.writeToParcel(this.j0, parcel, 0);
        parcel.writeInt(this.k0);
        TextUtils.writeToParcel(this.l0, parcel, 0);
        parcel.writeStringList(this.m0);
        parcel.writeStringList(this.n0);
        parcel.writeInt(this.o0 ? 1 : 0);
    }

    public BackStackRecordState(Parcel parcel) {
        this.X = parcel.createIntArray();
        this.f5077Y = parcel.createStringArrayList();
        this.Z = parcel.createIntArray();
        this.e0 = parcel.createIntArray();
        this.f0 = parcel.readInt();
        this.g0 = parcel.readString();
        this.h0 = parcel.readInt();
        this.i0 = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.j0 = (CharSequence) creator.createFromParcel(parcel);
        this.k0 = parcel.readInt();
        this.l0 = (CharSequence) creator.createFromParcel(parcel);
        this.m0 = parcel.createStringArrayList();
        this.n0 = parcel.createStringArrayList();
        this.o0 = parcel.readInt() != 0;
    }
}
