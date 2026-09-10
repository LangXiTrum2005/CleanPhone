package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.util.Util;
import com.google.common.primitives.Longs;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new AnonymousClass1();
    public final Entry[] X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final long f5487Y;

    /* JADX INFO: renamed from: androidx.media3.common.Metadata$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<Metadata> {
        @Override // android.os.Parcelable.Creator
        public final Metadata createFromParcel(Parcel parcel) {
            return new Metadata(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Metadata[] newArray(int i2) {
            return new Metadata[i2];
        }
    }

    public interface Entry extends Parcelable {
        default Format G() {
            return null;
        }

        default byte[] H() {
            return null;
        }

        default void n0(MediaMetadata.Builder builder) {
        }
    }

    public Metadata(Entry... entryArr) {
        this(-9223372036854775807L, entryArr);
    }

    public final Metadata a(Entry... entryArr) {
        if (entryArr.length == 0) {
            return this;
        }
        int i2 = Util.f5683a;
        Entry[] entryArr2 = this.X;
        Object[] objArrCopyOf = Arrays.copyOf(entryArr2, entryArr2.length + entryArr.length);
        System.arraycopy(entryArr, 0, objArrCopyOf, entryArr2.length, entryArr.length);
        return new Metadata(this.f5487Y, (Entry[]) objArrCopyOf);
    }

    public final Metadata b(Metadata metadata) {
        return metadata == null ? this : a(metadata.X);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Metadata.class == obj.getClass()) {
            Metadata metadata = (Metadata) obj;
            if (Arrays.equals(this.X, metadata.X) && this.f5487Y == metadata.f5487Y) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Longs.a(this.f5487Y) + (Arrays.hashCode(this.X) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.X));
        long j = this.f5487Y;
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        Entry[] entryArr = this.X;
        parcel.writeInt(entryArr.length);
        for (Entry entry : entryArr) {
            parcel.writeParcelable(entry, 0);
        }
        parcel.writeLong(this.f5487Y);
    }

    public Metadata(long j, Entry... entryArr) {
        this.f5487Y = j;
        this.X = entryArr;
    }

    public Metadata(List list) {
        this((Entry[]) list.toArray(new Entry[0]));
    }

    public Metadata(Parcel parcel) {
        this.X = new Entry[parcel.readInt()];
        int i2 = 0;
        while (true) {
            Entry[] entryArr = this.X;
            if (i2 < entryArr.length) {
                entryArr[i2] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
                i2++;
            } else {
                this.f5487Y = parcel.readLong();
                return;
            }
        }
    }
}
