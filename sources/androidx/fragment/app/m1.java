package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 implements Parcelable {
    public static final Parcelable.Creator<m1> CREATOR = new android.support.v4.media.a(13);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f4389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f4391f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f4392g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f4393h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f4394i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f4395j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f4396k;
    public final int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f4397m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f4398n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f4399o;

    public m1(Fragment fragment) {
        this.f4386a = fragment.getClass().getName();
        this.f4387b = fragment.mWho;
        this.f4388c = fragment.mFromLayout;
        this.f4389d = fragment.mInDynamicContainer;
        this.f4390e = fragment.mFragmentId;
        this.f4391f = fragment.mContainerId;
        this.f4392g = fragment.mTag;
        this.f4393h = fragment.mRetainInstance;
        this.f4394i = fragment.mRemoving;
        this.f4395j = fragment.mDetached;
        this.f4396k = fragment.mHidden;
        this.l = fragment.mMaxState.ordinal();
        this.f4397m = fragment.mTargetWho;
        this.f4398n = fragment.mTargetRequestCode;
        this.f4399o = fragment.mUserVisibleHint;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f4386a);
        sb2.append(" (");
        sb2.append(this.f4387b);
        sb2.append(")}:");
        if (this.f4388c) {
            sb2.append(" fromLayout");
        }
        if (this.f4389d) {
            sb2.append(" dynamicContainer");
        }
        int i10 = this.f4391f;
        if (i10 != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(i10));
        }
        String str = this.f4392g;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(str);
        }
        if (this.f4393h) {
            sb2.append(" retainInstance");
        }
        if (this.f4394i) {
            sb2.append(" removing");
        }
        if (this.f4395j) {
            sb2.append(" detached");
        }
        if (this.f4396k) {
            sb2.append(" hidden");
        }
        String str2 = this.f4397m;
        if (str2 != null) {
            sb2.append(" targetWho=");
            sb2.append(str2);
            sb2.append(" targetRequestCode=");
            sb2.append(this.f4398n);
        }
        if (this.f4399o) {
            sb2.append(" userVisibleHint");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f4386a);
        parcel.writeString(this.f4387b);
        parcel.writeInt(this.f4388c ? 1 : 0);
        parcel.writeInt(this.f4389d ? 1 : 0);
        parcel.writeInt(this.f4390e);
        parcel.writeInt(this.f4391f);
        parcel.writeString(this.f4392g);
        parcel.writeInt(this.f4393h ? 1 : 0);
        parcel.writeInt(this.f4394i ? 1 : 0);
        parcel.writeInt(this.f4395j ? 1 : 0);
        parcel.writeInt(this.f4396k ? 1 : 0);
        parcel.writeInt(this.l);
        parcel.writeString(this.f4397m);
        parcel.writeInt(this.f4398n);
        parcel.writeInt(this.f4399o ? 1 : 0);
    }

    public m1(Parcel parcel) {
        this.f4386a = parcel.readString();
        this.f4387b = parcel.readString();
        this.f4388c = parcel.readInt() != 0;
        this.f4389d = parcel.readInt() != 0;
        this.f4390e = parcel.readInt();
        this.f4391f = parcel.readInt();
        this.f4392g = parcel.readString();
        this.f4393h = parcel.readInt() != 0;
        this.f4394i = parcel.readInt() != 0;
        this.f4395j = parcel.readInt() != 0;
        this.f4396k = parcel.readInt() != 0;
        this.l = parcel.readInt();
        this.f4397m = parcel.readString();
        this.f4398n = parcel.readInt();
        this.f4399o = parcel.readInt() != 0;
    }
}
