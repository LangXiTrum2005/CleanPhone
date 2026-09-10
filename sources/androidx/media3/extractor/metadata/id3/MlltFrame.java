package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.util.Util;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class MlltFrame extends Id3Frame {
    public static final Parcelable.Creator<MlltFrame> CREATOR = new AnonymousClass1();

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final int f6939Y;
    public final int Z;
    public final int e0;
    public final int[] f0;
    public final int[] g0;

    /* JADX INFO: renamed from: androidx.media3.extractor.metadata.id3.MlltFrame$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<MlltFrame> {
        @Override // android.os.Parcelable.Creator
        public final MlltFrame createFromParcel(Parcel parcel) {
            return new MlltFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final MlltFrame[] newArray(int i2) {
            return new MlltFrame[i2];
        }
    }

    public MlltFrame(int i2, int i3, int i4, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f6939Y = i2;
        this.Z = i3;
        this.e0 = i4;
        this.f0 = iArr;
        this.g0 = iArr2;
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && MlltFrame.class == obj.getClass()) {
            MlltFrame mlltFrame = (MlltFrame) obj;
            if (this.f6939Y == mlltFrame.f6939Y && this.Z == mlltFrame.Z && this.e0 == mlltFrame.e0 && Arrays.equals(this.f0, mlltFrame.f0) && Arrays.equals(this.g0, mlltFrame.g0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.g0) + ((Arrays.hashCode(this.f0) + ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f6939Y) * 31) + this.Z) * 31) + this.e0) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f6939Y);
        parcel.writeInt(this.Z);
        parcel.writeInt(this.e0);
        parcel.writeIntArray(this.f0);
        parcel.writeIntArray(this.g0);
    }

    public MlltFrame(Parcel parcel) {
        super("MLLT");
        this.f6939Y = parcel.readInt();
        this.Z = parcel.readInt();
        this.e0 = parcel.readInt();
        int[] iArrCreateIntArray = parcel.createIntArray();
        int i2 = Util.f5683a;
        this.f0 = iArrCreateIntArray;
        this.g0 = parcel.createIntArray();
    }
}
