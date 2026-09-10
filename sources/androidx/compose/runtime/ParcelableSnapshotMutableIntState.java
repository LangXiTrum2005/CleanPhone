package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: SnapshotIntState.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0003\u0018\u0000 \u000f2\u00020\u00012\u00020\u0002:\u0001\u0010B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableIntState;", "Landroidx/compose/runtime/stupefactive;", "Landroid/os/Parcelable;", "", "value", "<init>", "(I)V", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "monoploid", "saneness", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ParcelableSnapshotMutableIntState extends MutableIntState implements Parcelable {
    public static final Parcelable.Creator<ParcelableSnapshotMutableIntState> CREATOR = new attabal();

    /* JADX INFO: compiled from: SnapshotIntState.android.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"androidx/compose/runtime/ParcelableSnapshotMutableIntState$attabal", "Landroid/os/Parcelable$Creator;", "Landroidx/compose/runtime/ParcelableSnapshotMutableIntState;", "Landroid/os/Parcel;", "parcel", "attabal", "(Landroid/os/Parcel;)Landroidx/compose/runtime/ParcelableSnapshotMutableIntState;", "", "size", "", "saneness", "(I)[Landroidx/compose/runtime/ParcelableSnapshotMutableIntState;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class attabal implements Parcelable.Creator<ParcelableSnapshotMutableIntState> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableIntState createFromParcel(Parcel parcel) {
            return new ParcelableSnapshotMutableIntState(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableIntState[] newArray(int size) {
            return new ParcelableSnapshotMutableIntState[size];
        }
    }

    public ParcelableSnapshotMutableIntState(int i) {
        super(i);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeInt(getIntValue());
    }
}
