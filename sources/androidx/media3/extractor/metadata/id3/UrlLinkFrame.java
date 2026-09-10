package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.datastore.preferences.protobuf.a;
import androidx.media3.common.util.Util;
import com.p004ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes.dex */
public final class UrlLinkFrame extends Id3Frame {
    public static final Parcelable.Creator<UrlLinkFrame> CREATOR = new AnonymousClass1();

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final String f6942Y;
    public final String Z;

    /* JADX INFO: renamed from: androidx.media3.extractor.metadata.id3.UrlLinkFrame$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<UrlLinkFrame> {
        @Override // android.os.Parcelable.Creator
        public final UrlLinkFrame createFromParcel(Parcel parcel) {
            return new UrlLinkFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final UrlLinkFrame[] newArray(int i2) {
            return new UrlLinkFrame[i2];
        }
    }

    public UrlLinkFrame(String str, String str2, String str3) {
        super(str);
        this.f6942Y = str2;
        this.Z = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && UrlLinkFrame.class == obj.getClass()) {
            UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
            if (this.X.equals(urlLinkFrame.X) && Util.a(this.f6942Y, urlLinkFrame.f6942Y) && Util.a(this.Z, urlLinkFrame.Z)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iB = a.b(this.X, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31);
        String str = this.f6942Y;
        int iHashCode = (iB + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.Z;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return this.X + ": url=" + this.Z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.X);
        parcel.writeString(this.f6942Y);
        parcel.writeString(this.Z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public UrlLinkFrame(Parcel parcel) {
        String string = parcel.readString();
        int i2 = Util.f5683a;
        super(string);
        this.f6942Y = parcel.readString();
        this.Z = parcel.readString();
    }
}
