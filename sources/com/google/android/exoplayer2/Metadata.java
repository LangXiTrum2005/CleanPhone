package com.google.android.exoplayer2;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.core.AbstractC1600gE;
import com.facebook.ads.redexgen.core.AbstractC2098oq;
import com.facebook.ads.redexgen.core.C0973Pw;
import com.facebook.ads.redexgen.core.ZM;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Metadata implements Parcelable {
    public static byte[] A02;
    public static String[] A03 = {"kxpCHiuqwb319ak", "hgYNR9xwmJzTrUmvWP", "UjmNBGqzXVqaRhPhc8nQaNa2XIkQwrwf", "xuyEXqw6", "W6L28k2zs6J7xz43Q8FyavLwnrCoVUxT", "3PD7MaxC1L2qejFeayFzDYwxsQrmYkdz", "8KOMv12NqSZVxDUxecZ7L61I2P", "NeqdYL3o"};
    public static final Parcelable.Creator<Metadata> CREATOR;
    public final long A00;
    public final Entry[] A01;

    public interface Entry extends Parcelable {
        byte[] A9Q();

        ZM A9R();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 11);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{114, 102, -74, -72, -85, -71, -85, -76, -70, -89, -70, -81, -75, -76, -102, -81, -77, -85, -101, -71, -125, -46, -37, -31, -33, -42, -46, -32, -86};
    }

    static {
        A01();
        CREATOR = new C0973Pw();
    }

    public Metadata(long j, Entry... entryArr) {
        this.A00 = j;
        this.A01 = entryArr;
    }

    public Metadata(Parcel parcel) {
        this.A01 = new Entry[parcel.readInt()];
        for (int i = 0; i < i; i++) {
            this.A01[i] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
        }
        this.A00 = parcel.readLong();
    }

    public Metadata(List<? extends Entry> entries) {
        this((Entry[]) entries.toArray(new Entry[0]));
    }

    public Metadata(Entry... entryArr) {
        this(C.TIME_UNSET, entryArr);
    }

    public final int A02() {
        return this.A01.length;
    }

    public final Entry A03(int i) {
        return this.A01[i];
    }

    public final Metadata A04(Metadata metadata) {
        if (metadata == null) {
            return this;
        }
        Entry[] entryArr = metadata.A01;
        if (A03[5].charAt(29) != 'k') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[7] = "C8Evhzao";
        strArr[3] = "QbaOJa3F";
        return A05(entryArr);
    }

    public final Metadata A05(Entry... entryArr) {
        if (entryArr.length == 0) {
            return this;
        }
        return new Metadata(this.A00, (Entry[]) AbstractC1600gE.A1K(this.A01, entryArr));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Metadata metadata = (Metadata) obj;
        return Arrays.equals(this.A01, metadata.A01) && this.A00 == metadata.A00;
    }

    public final int hashCode() {
        int result = Arrays.hashCode(this.A01);
        int i = result * 31;
        int result2 = AbstractC2098oq.A00(this.A00);
        return i + result2;
    }

    public final String toString() {
        return A00(21, 8, 98) + Arrays.toString(this.A01) + (this.A00 == C.TIME_UNSET ? A00(0, 0, 99) : A00(0, 21, 59) + this.A00);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01.length);
        for (Entry entry : this.A01) {
            parcel.writeParcelable(entry, 0);
        }
        parcel.writeLong(this.A00);
        if (A03[5].charAt(29) != 'k') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[7] = "nLRRremv";
        strArr[3] = "2IGzY6dk";
    }
}
