package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.Util;
import com.p004ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes3.dex */
public final class CommentFrame extends Id3Frame {
    public static final Parcelable.Creator<CommentFrame> CREATOR = new AnonymousClass1();

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final String f18214Y;
    public final String Z;
    public final String e0;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.id3.CommentFrame$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<CommentFrame> {
        @Override // android.os.Parcelable.Creator
        public final CommentFrame createFromParcel(Parcel parcel) {
            return new CommentFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final CommentFrame[] newArray(int i2) {
            return new CommentFrame[i2];
        }
    }

    public CommentFrame(String str, String str2, String str3) {
        super("COMM");
        this.f18214Y = str;
        this.Z = str2;
        this.e0 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && CommentFrame.class == obj.getClass()) {
            CommentFrame commentFrame = (CommentFrame) obj;
            if (Util.a(this.Z, commentFrame.Z) && Util.a(this.f18214Y, commentFrame.f18214Y) && Util.a(this.e0, commentFrame.e0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f18214Y;
        int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.Z;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.e0;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return this.X + ": language=" + this.f18214Y + ", description=" + this.Z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.X);
        parcel.writeString(this.f18214Y);
        parcel.writeString(this.e0);
    }

    public CommentFrame(Parcel parcel) {
        super("COMM");
        String string = parcel.readString();
        int i2 = Util.f18979a;
        this.f18214Y = string;
        this.Z = parcel.readString();
        this.e0 = parcel.readString();
    }
}
