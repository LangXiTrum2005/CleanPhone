package androidx.media3.extractor.metadata.dvbsi;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import androidx.media3.common.Metadata;

/* JADX INFO: loaded from: classes.dex */
public final class AppInfoTable implements Metadata.Entry {
    public static final Parcelable.Creator<AppInfoTable> CREATOR = new AnonymousClass1();
    public final int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final String f6915Y;

    /* JADX INFO: renamed from: androidx.media3.extractor.metadata.dvbsi.AppInfoTable$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<AppInfoTable> {
        @Override // android.os.Parcelable.Creator
        public final AppInfoTable createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            string.getClass();
            return new AppInfoTable(parcel.readInt(), string);
        }

        @Override // android.os.Parcelable.Creator
        public final AppInfoTable[] newArray(int i2) {
            return new AppInfoTable[i2];
        }
    }

    public AppInfoTable(int i2, String str) {
        this.X = i2;
        this.f6915Y = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ait(controlCode=");
        sb.append(this.X);
        sb.append(",url=");
        return a.r(sb, this.f6915Y, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f6915Y);
        parcel.writeInt(this.X);
    }
}
