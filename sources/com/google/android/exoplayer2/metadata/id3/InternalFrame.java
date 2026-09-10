package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.Util;
import com.p004ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes3.dex */
public final class InternalFrame extends Id3Frame {
    public static final Parcelable.Creator<InternalFrame> CREATOR = new AnonymousClass1();

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final String f18221Y;
    public final String Z;
    public final String e0;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.id3.InternalFrame$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<InternalFrame> {
        @Override // android.os.Parcelable.Creator
        public final InternalFrame createFromParcel(Parcel parcel) {
            return new InternalFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final InternalFrame[] newArray(int i2) {
            return new InternalFrame[i2];
        }
    }

    public InternalFrame(String str, String str2, String str3) {
        super("----");
        this.f18221Y = str;
        this.Z = str2;
        this.e0 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && InternalFrame.class == obj.getClass()) {
            InternalFrame internalFrame = (InternalFrame) obj;
            if (Util.a(this.Z, internalFrame.Z) && Util.a(this.f18221Y, internalFrame.f18221Y) && Util.a(this.e0, internalFrame.e0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f18221Y;
        int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.Z;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.e0;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return this.X + ": domain=" + this.f18221Y + ", description=" + this.Z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.X);
        parcel.writeString(this.f18221Y);
        parcel.writeString(this.e0);
    }

    public InternalFrame(Parcel parcel) {
        super("----");
        String string = parcel.readString();
        int i2 = Util.f18979a;
        this.f18221Y = string;
        this.Z = parcel.readString();
        this.e0 = parcel.readString();
    }
}
