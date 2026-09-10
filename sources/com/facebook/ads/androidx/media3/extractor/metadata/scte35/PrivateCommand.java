package com.facebook.ads.androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.core.C11074v;
import com.facebook.ads.redexgen.core.C5C;
import com.facebook.ads.redexgen.core.IV;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new IV();
    public final long A00;
    public final long A01;
    public final byte[] A02;

    public PrivateCommand(long j, byte[] bArr, long j2) {
        this.A01 = j2;
        this.A00 = j;
        this.A02 = bArr;
    }

    public PrivateCommand(Parcel parcel) {
        this.A01 = parcel.readLong();
        this.A00 = parcel.readLong();
        this.A02 = (byte[]) C5C.A0f(parcel.createByteArray());
    }

    public /* synthetic */ PrivateCommand(Parcel parcel, IV iv) {
        this(parcel);
    }

    public static PrivateCommand A00(C11074v c11074v, int i2, long j) {
        long jA0Q = c11074v.A0Q();
        byte[] bArr = new byte[i2 - 4];
        c11074v.A0k(bArr, 0, bArr.length);
        return new PrivateCommand(jA0Q, bArr, j);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
        parcel.writeByteArray(this.A02);
    }
}
