package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new AnonymousClass1();
    public ArrayList X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public ArrayList f5141Y;
    public BackStackRecordState[] Z;
    public int e0;
    public String f0;
    public ArrayList g0;
    public ArrayList h0;
    public ArrayList i0;

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManagerState$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<FragmentManagerState> {
        @Override // android.os.Parcelable.Creator
        public final FragmentManagerState createFromParcel(Parcel parcel) {
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.f0 = null;
            fragmentManagerState.g0 = new ArrayList();
            fragmentManagerState.h0 = new ArrayList();
            fragmentManagerState.X = parcel.createStringArrayList();
            fragmentManagerState.f5141Y = parcel.createStringArrayList();
            fragmentManagerState.Z = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
            fragmentManagerState.e0 = parcel.readInt();
            fragmentManagerState.f0 = parcel.readString();
            fragmentManagerState.g0 = parcel.createStringArrayList();
            fragmentManagerState.h0 = parcel.createTypedArrayList(BackStackState.CREATOR);
            fragmentManagerState.i0 = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
            return fragmentManagerState;
        }

        @Override // android.os.Parcelable.Creator
        public final FragmentManagerState[] newArray(int i2) {
            return new FragmentManagerState[i2];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeStringList(this.X);
        parcel.writeStringList(this.f5141Y);
        parcel.writeTypedArray(this.Z, i2);
        parcel.writeInt(this.e0);
        parcel.writeString(this.f0);
        parcel.writeStringList(this.g0);
        parcel.writeTypedList(this.h0);
        parcel.writeTypedList(this.i0);
    }
}
