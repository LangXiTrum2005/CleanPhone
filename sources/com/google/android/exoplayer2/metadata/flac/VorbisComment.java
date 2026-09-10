package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.datastore.preferences.protobuf.a;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.Util;
import com.p004ironsource.d9;
import com.p004ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class VorbisComment implements Metadata.Entry {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new AnonymousClass1();
    public final String X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final String f18204Y;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.flac.VorbisComment$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<VorbisComment> {
        @Override // android.os.Parcelable.Creator
        public final VorbisComment createFromParcel(Parcel parcel) {
            return new VorbisComment(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final VorbisComment[] newArray(int i2) {
            return new VorbisComment[i2];
        }
    }

    public VorbisComment(String str, String str2) {
        this.X = str;
        this.f18204Y = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            VorbisComment vorbisComment = (VorbisComment) obj;
            if (this.X.equals(vorbisComment.X) && this.f18204Y.equals(vorbisComment.f18204Y)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f18204Y.hashCode() + a.b(this.X, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final void l(MediaMetadata.Builder builder) {
        String str = this.X;
        str.getClass();
        String str2 = this.f18204Y;
        switch (str) {
            case "ALBUM":
                builder.f17127c = str2;
                break;
            case "TITLE":
                builder.f17125a = str2;
                break;
            case "DESCRIPTION":
                builder.g = str2;
                break;
            case "ALBUMARTIST":
                builder.d = str2;
                break;
            case "ARTIST":
                builder.f17126b = str2;
                break;
        }
    }

    public final String toString() {
        return "VC: " + this.X + d9.i.f24747b + this.f18204Y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.X);
        parcel.writeString(this.f18204Y);
    }

    public VorbisComment(Parcel parcel) {
        String string = parcel.readString();
        int i2 = Util.f18979a;
        this.X = string;
        this.f18204Y = parcel.readString();
    }
}
