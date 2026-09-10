package androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class SpliceNullCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceNullCommand> CREATOR = new AnonymousClass1();

    /* JADX INFO: renamed from: androidx.media3.extractor.metadata.scte35.SpliceNullCommand$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<SpliceNullCommand> {
        @Override // android.os.Parcelable.Creator
        public final SpliceNullCommand createFromParcel(Parcel parcel) {
            return new SpliceNullCommand();
        }

        @Override // android.os.Parcelable.Creator
        public final SpliceNullCommand[] newArray(int i2) {
            return new SpliceNullCommand[i2];
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
    }
}
