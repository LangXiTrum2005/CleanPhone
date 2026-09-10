package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.util.Util;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ChapterFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterFrame> CREATOR = new AnonymousClass1();

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final String f6928Y;
    public final int Z;
    public final int e0;
    public final long f0;
    public final long g0;
    public final Id3Frame[] h0;

    /* JADX INFO: renamed from: androidx.media3.extractor.metadata.id3.ChapterFrame$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<ChapterFrame> {
        @Override // android.os.Parcelable.Creator
        public final ChapterFrame createFromParcel(Parcel parcel) {
            return new ChapterFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ChapterFrame[] newArray(int i2) {
            return new ChapterFrame[i2];
        }
    }

    public ChapterFrame(String str, int i2, int i3, long j, long j2, Id3Frame[] id3FrameArr) {
        super("CHAP");
        this.f6928Y = str;
        this.Z = i2;
        this.e0 = i3;
        this.f0 = j;
        this.g0 = j2;
        this.h0 = id3FrameArr;
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ChapterFrame.class == obj.getClass()) {
            ChapterFrame chapterFrame = (ChapterFrame) obj;
            if (this.Z == chapterFrame.Z && this.e0 == chapterFrame.e0 && this.f0 == chapterFrame.f0 && this.g0 == chapterFrame.g0 && Util.a(this.f6928Y, chapterFrame.f6928Y) && Arrays.equals(this.h0, chapterFrame.h0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = (((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.Z) * 31) + this.e0) * 31) + ((int) this.f0)) * 31) + ((int) this.g0)) * 31;
        String str = this.f6928Y;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f6928Y);
        parcel.writeInt(this.Z);
        parcel.writeInt(this.e0);
        parcel.writeLong(this.f0);
        parcel.writeLong(this.g0);
        Id3Frame[] id3FrameArr = this.h0;
        parcel.writeInt(id3FrameArr.length);
        for (Id3Frame id3Frame : id3FrameArr) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    public ChapterFrame(Parcel parcel) {
        super("CHAP");
        String string = parcel.readString();
        int i2 = Util.f5683a;
        this.f6928Y = string;
        this.Z = parcel.readInt();
        this.e0 = parcel.readInt();
        this.f0 = parcel.readLong();
        this.g0 = parcel.readLong();
        int i3 = parcel.readInt();
        this.h0 = new Id3Frame[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            this.h0[i4] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
