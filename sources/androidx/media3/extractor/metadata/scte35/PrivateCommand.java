package androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import androidx.media3.common.util.Util;

/* JADX INFO: loaded from: classes.dex */
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new AnonymousClass1();
    public final long X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final long f6946Y;
    public final byte[] Z;

    /* JADX INFO: renamed from: androidx.media3.extractor.metadata.scte35.PrivateCommand$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<PrivateCommand> {
        @Override // android.os.Parcelable.Creator
        public final PrivateCommand createFromParcel(Parcel parcel) {
            return new PrivateCommand(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PrivateCommand[] newArray(int i2) {
            return new PrivateCommand[i2];
        }
    }

    public PrivateCommand(long j, byte[] bArr, long j2) {
        this.X = j2;
        this.f6946Y = j;
        this.Z = bArr;
    }

    @Override // androidx.media3.extractor.metadata.scte35.SpliceCommand
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
        sb.append(this.X);
        sb.append(", identifier= ");
        return a.j(this.f6946Y, " }", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.X);
        parcel.writeLong(this.f6946Y);
        parcel.writeByteArray(this.Z);
    }

    public PrivateCommand(Parcel parcel) {
        this.X = parcel.readLong();
        this.f6946Y = parcel.readLong();
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i2 = Util.f5683a;
        this.Z = bArrCreateByteArray;
    }
}
