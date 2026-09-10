package androidx.media3.exoplayer.scheduler;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
public final class Requirements implements Parcelable {
    public static final Parcelable.Creator<Requirements> CREATOR = new AnonymousClass1();
    public final int X;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.scheduler.Requirements$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<Requirements> {
        @Override // android.os.Parcelable.Creator
        public final Requirements createFromParcel(Parcel parcel) {
            return new Requirements(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Requirements[] newArray(int i2) {
            return new Requirements[i2];
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface RequirementFlags {
    }

    public Requirements(int i2) {
        this.X = (i2 & 2) != 0 ? i2 | 1 : i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Requirements.class == obj.getClass()) {
            if (this.X == ((Requirements) obj).X) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.X;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.X);
    }
}
