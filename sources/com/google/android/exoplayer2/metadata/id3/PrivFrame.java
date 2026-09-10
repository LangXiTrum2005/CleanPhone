package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.Util;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class PrivFrame extends Id3Frame {
    public static final Parcelable.Creator<PrivFrame> CREATOR = new AnonymousClass1();

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final String f18223Y;
    public final byte[] Z;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.id3.PrivFrame$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<PrivFrame> {
        @Override // android.os.Parcelable.Creator
        public final PrivFrame createFromParcel(Parcel parcel) {
            return new PrivFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PrivFrame[] newArray(int i2) {
            return new PrivFrame[i2];
        }
    }

    public PrivFrame(String str, byte[] bArr) {
        super("PRIV");
        this.f18223Y = str;
        this.Z = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PrivFrame.class == obj.getClass()) {
            PrivFrame privFrame = (PrivFrame) obj;
            if (Util.a(this.f18223Y, privFrame.f18223Y) && Arrays.equals(this.Z, privFrame.Z)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f18223Y;
        return Arrays.hashCode(this.Z) + ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return this.X + ": owner=" + this.f18223Y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f18223Y);
        parcel.writeByteArray(this.Z);
    }

    public PrivFrame(Parcel parcel) {
        super("PRIV");
        String string = parcel.readString();
        int i2 = Util.f18979a;
        this.f18223Y = string;
        this.Z = parcel.createByteArray();
    }
}
