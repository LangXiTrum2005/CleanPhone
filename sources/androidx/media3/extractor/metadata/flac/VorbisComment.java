package androidx.media3.extractor.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.datastore.preferences.protobuf.a;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.Util;
import com.google.common.base.Ascii;
import com.p004ironsource.d9;
import com.p004ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class VorbisComment implements Metadata.Entry {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new AnonymousClass1();
    public final String X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final String f6920Y;

    /* JADX INFO: renamed from: androidx.media3.extractor.metadata.flac.VorbisComment$1, reason: invalid class name */
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
        this.X = Ascii.c(str);
        this.f6920Y = str2;
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
            if (this.X.equals(vorbisComment.X) && this.f6920Y.equals(vorbisComment.f6920Y)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f6920Y.hashCode() + a.b(this.X, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31);
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final void n0(MediaMetadata.Builder builder) {
        String str = this.X;
        str.getClass();
        String str2 = this.f6920Y;
        switch (str) {
            case "ALBUM":
                builder.f5478c = str2;
                break;
            case "TITLE":
                builder.f5476a = str2;
                break;
            case "DESCRIPTION":
                builder.f5479e = str2;
                break;
            case "ALBUMARTIST":
                builder.d = str2;
                break;
            case "ARTIST":
                builder.f5477b = str2;
                break;
        }
    }

    public final String toString() {
        return "VC: " + this.X + d9.i.f24747b + this.f6920Y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.X);
        parcel.writeString(this.f6920Y);
    }

    public VorbisComment(Parcel parcel) {
        String string = parcel.readString();
        int i2 = Util.f5683a;
        this.X = string;
        this.f6920Y = parcel.readString();
    }
}
