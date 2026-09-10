package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.datastore.preferences.protobuf.a;
import com.google.android.exoplayer2.util.Util;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class BinaryFrame extends Id3Frame {
    public static final Parcelable.Creator<BinaryFrame> CREATOR = new AnonymousClass1();

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final byte[] f18211Y;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.id3.BinaryFrame$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<BinaryFrame> {
        @Override // android.os.Parcelable.Creator
        public final BinaryFrame createFromParcel(Parcel parcel) {
            return new BinaryFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BinaryFrame[] newArray(int i2) {
            return new BinaryFrame[i2];
        }
    }

    public BinaryFrame(String str, byte[] bArr) {
        super(str);
        this.f18211Y = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && BinaryFrame.class == obj.getClass()) {
            BinaryFrame binaryFrame = (BinaryFrame) obj;
            if (this.X.equals(binaryFrame.X) && Arrays.equals(this.f18211Y, binaryFrame.f18211Y)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f18211Y) + a.b(this.X, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.X);
        parcel.writeByteArray(this.f18211Y);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BinaryFrame(Parcel parcel) {
        String string = parcel.readString();
        int i2 = Util.f18979a;
        super(string);
        this.f18211Y = parcel.createByteArray();
    }
}
