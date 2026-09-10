package androidx.media3.container;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.Assertions;
import com.p004ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes.dex */
public final class Mp4LocationData implements Metadata.Entry {
    public static final Parcelable.Creator<Mp4LocationData> CREATOR = new AnonymousClass1();
    public final float X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final float f5693Y;

    /* JADX INFO: renamed from: androidx.media3.container.Mp4LocationData$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<Mp4LocationData> {
        @Override // android.os.Parcelable.Creator
        public final Mp4LocationData createFromParcel(Parcel parcel) {
            return new Mp4LocationData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Mp4LocationData[] newArray(int i2) {
            return new Mp4LocationData[i2];
        }
    }

    public Mp4LocationData(float f, float f2) {
        Assertions.a("Invalid latitude or longitude", f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f);
        this.X = f;
        this.f5693Y = f2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Mp4LocationData.class == obj.getClass()) {
            Mp4LocationData mp4LocationData = (Mp4LocationData) obj;
            if (this.X == mp4LocationData.X && this.f5693Y == mp4LocationData.f5693Y) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.f5693Y).hashCode() + ((Float.valueOf(this.X).hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.X + ", longitude=" + this.f5693Y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeFloat(this.X);
        parcel.writeFloat(this.f5693Y);
    }

    public Mp4LocationData(Parcel parcel) {
        this.X = parcel.readFloat();
        this.f5693Y = parcel.readFloat();
    }
}
