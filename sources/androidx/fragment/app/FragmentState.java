package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new AnonymousClass1();
    public final String X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final String f5147Y;
    public final boolean Z;
    public final int e0;
    public final int f0;
    public final String g0;
    public final boolean h0;
    public final boolean i0;
    public final boolean j0;
    public final boolean k0;
    public final int l0;
    public final String m0;
    public final int n0;
    public final boolean o0;

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentState$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<FragmentState> {
        @Override // android.os.Parcelable.Creator
        public final FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final FragmentState[] newArray(int i2) {
            return new FragmentState[i2];
        }
    }

    public FragmentState(Fragment fragment) {
        this.X = fragment.getClass().getName();
        this.f5147Y = fragment.mWho;
        this.Z = fragment.mFromLayout;
        this.e0 = fragment.mFragmentId;
        this.f0 = fragment.mContainerId;
        this.g0 = fragment.mTag;
        this.h0 = fragment.mRetainInstance;
        this.i0 = fragment.mRemoving;
        this.j0 = fragment.mDetached;
        this.k0 = fragment.mHidden;
        this.l0 = fragment.mMaxState.ordinal();
        this.m0 = fragment.mTargetWho;
        this.n0 = fragment.mTargetRequestCode;
        this.o0 = fragment.mUserVisibleHint;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.X);
        sb.append(" (");
        sb.append(this.f5147Y);
        sb.append(")}:");
        if (this.Z) {
            sb.append(" fromLayout");
        }
        int i2 = this.f0;
        if (i2 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i2));
        }
        String str = this.g0;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.h0) {
            sb.append(" retainInstance");
        }
        if (this.i0) {
            sb.append(" removing");
        }
        if (this.j0) {
            sb.append(" detached");
        }
        if (this.k0) {
            sb.append(" hidden");
        }
        String str2 = this.m0;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.n0);
        }
        if (this.o0) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.X);
        parcel.writeString(this.f5147Y);
        parcel.writeInt(this.Z ? 1 : 0);
        parcel.writeInt(this.e0);
        parcel.writeInt(this.f0);
        parcel.writeString(this.g0);
        parcel.writeInt(this.h0 ? 1 : 0);
        parcel.writeInt(this.i0 ? 1 : 0);
        parcel.writeInt(this.j0 ? 1 : 0);
        parcel.writeInt(this.k0 ? 1 : 0);
        parcel.writeInt(this.l0);
        parcel.writeString(this.m0);
        parcel.writeInt(this.n0);
        parcel.writeInt(this.o0 ? 1 : 0);
    }

    public FragmentState(Parcel parcel) {
        this.X = parcel.readString();
        this.f5147Y = parcel.readString();
        this.Z = parcel.readInt() != 0;
        this.e0 = parcel.readInt();
        this.f0 = parcel.readInt();
        this.g0 = parcel.readString();
        this.h0 = parcel.readInt() != 0;
        this.i0 = parcel.readInt() != 0;
        this.j0 = parcel.readInt() != 0;
        this.k0 = parcel.readInt() != 0;
        this.l0 = parcel.readInt();
        this.m0 = parcel.readString();
        this.n0 = parcel.readInt();
        this.o0 = parcel.readInt() != 0;
    }
}
