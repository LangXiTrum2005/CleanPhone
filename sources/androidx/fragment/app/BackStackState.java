package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new AnonymousClass1();
    public final ArrayList X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final ArrayList f5078Y;

    /* JADX INFO: renamed from: androidx.fragment.app.BackStackState$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<BackStackState> {
        @Override // android.os.Parcelable.Creator
        public final BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BackStackState[] newArray(int i2) {
            return new BackStackState[i2];
        }
    }

    public BackStackState(Parcel parcel) {
        this.X = parcel.createStringArrayList();
        this.f5078Y = parcel.createTypedArrayList(BackStackRecordState.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeStringList(this.X);
        parcel.writeTypedList(this.f5078Y);
    }
}
