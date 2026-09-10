package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: SnapshotLongState.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0003\u0018\u0000 \u00102\u00020\u00012\u00020\u0002:\u0001\u0011B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableLongState;", "Landroidx/compose/runtime/libya;", "Landroid/os/Parcelable;", "", "value", "<init>", "(J)V", "Landroid/os/Parcel;", "parcel", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "monoploid", "saneness", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ParcelableSnapshotMutableLongState extends MutableLongState implements Parcelable {
    public static final Parcelable.Creator<ParcelableSnapshotMutableLongState> CREATOR = new attabal();

    /* JADX INFO: compiled from: SnapshotLongState.android.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"androidx/compose/runtime/ParcelableSnapshotMutableLongState$attabal", "Landroid/os/Parcelable$Creator;", "Landroidx/compose/runtime/ParcelableSnapshotMutableLongState;", "Landroid/os/Parcel;", "parcel", "attabal", "(Landroid/os/Parcel;)Landroidx/compose/runtime/ParcelableSnapshotMutableLongState;", "", "size", "", "saneness", "(I)[Landroidx/compose/runtime/ParcelableSnapshotMutableLongState;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class attabal implements Parcelable.Creator<ParcelableSnapshotMutableLongState> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableLongState createFromParcel(Parcel parcel) {
            return new ParcelableSnapshotMutableLongState(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableLongState[] newArray(int size) {
            return new ParcelableSnapshotMutableLongState[size];
        }
    }

    public ParcelableSnapshotMutableLongState(long j) {
        super(j);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeLong(apical());
    }
}
