package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.util.Util;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ChapterTocFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterTocFrame> CREATOR = new AnonymousClass1();

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final String f6929Y;
    public final boolean Z;
    public final boolean e0;
    public final String[] f0;
    public final Id3Frame[] g0;

    /* JADX INFO: renamed from: androidx.media3.extractor.metadata.id3.ChapterTocFrame$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<ChapterTocFrame> {
        @Override // android.os.Parcelable.Creator
        public final ChapterTocFrame createFromParcel(Parcel parcel) {
            return new ChapterTocFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ChapterTocFrame[] newArray(int i2) {
            return new ChapterTocFrame[i2];
        }
    }

    public ChapterTocFrame(String str, boolean z2, boolean z3, String[] strArr, Id3Frame[] id3FrameArr) {
        super("CTOC");
        this.f6929Y = str;
        this.Z = z2;
        this.e0 = z3;
        this.f0 = strArr;
        this.g0 = id3FrameArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ChapterTocFrame.class == obj.getClass()) {
            ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
            if (this.Z == chapterTocFrame.Z && this.e0 == chapterTocFrame.e0 && Util.a(this.f6929Y, chapterTocFrame.f6929Y) && Arrays.equals(this.f0, chapterTocFrame.f0) && Arrays.equals(this.g0, chapterTocFrame.g0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = (((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (this.Z ? 1 : 0)) * 31) + (this.e0 ? 1 : 0)) * 31;
        String str = this.f6929Y;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f6929Y);
        parcel.writeByte(this.Z ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.e0 ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f0);
        Id3Frame[] id3FrameArr = this.g0;
        parcel.writeInt(id3FrameArr.length);
        for (Id3Frame id3Frame : id3FrameArr) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    public ChapterTocFrame(Parcel parcel) {
        super("CTOC");
        String string = parcel.readString();
        int i2 = Util.f5683a;
        this.f6929Y = string;
        this.Z = parcel.readByte() != 0;
        this.e0 = parcel.readByte() != 0;
        this.f0 = parcel.createStringArray();
        int i3 = parcel.readInt();
        this.g0 = new Id3Frame[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            this.g0[i4] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
