package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes3.dex */
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new AnonymousClass1();
    public final long X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final long f18230Y;
    public final byte[] Z;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.scte35.PrivateCommand$1, reason: invalid class name */
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
        this.f18230Y = j;
        this.Z = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.X);
        parcel.writeLong(this.f18230Y);
        parcel.writeByteArray(this.Z);
    }

    public PrivateCommand(Parcel parcel) {
        this.X = parcel.readLong();
        this.f18230Y = parcel.readLong();
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i2 = Util.f18979a;
        this.Z = bArrCreateByteArray;
    }
}
