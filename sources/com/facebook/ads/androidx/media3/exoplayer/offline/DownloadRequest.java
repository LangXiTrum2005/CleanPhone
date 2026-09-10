package com.facebook.ads.androidx.media3.exoplayer.offline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.androidx.media3.common.StreamKey;
import com.facebook.ads.redexgen.core.AbstractC10843y;
import com.facebook.ads.redexgen.core.C5C;
import com.facebook.ads.redexgen.core.C7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class DownloadRequest implements Parcelable {
    public static byte[] A07;
    public static final Parcelable.Creator<DownloadRequest> CREATOR;
    public final Uri A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final List<StreamKey> A04;
    public final byte[] A05;
    public final byte[] A06;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 67);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{-37, 36, 54, 52, 53, 48, 46, 4, 34, 36, 41, 38, 12, 38, 58, -31, 46, 54, 52, 53, -31, 35, 38, -31, 47, 54, 45, 45, -31, 39, 48, 51, -31, 53, 58, 49, 38, -5, -31};
    }

    static {
        A01();
        CREATOR = new C7();
    }

    public DownloadRequest(Parcel parcel) {
        this.A02 = (String) C5C.A0f(parcel.readString());
        this.A00 = Uri.parse((String) C5C.A0f(parcel.readString()));
        this.A03 = parcel.readString();
        int i2 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add((StreamKey) parcel.readParcelable(StreamKey.class.getClassLoader()));
        }
        this.A04 = Collections.unmodifiableList(arrayList);
        this.A06 = parcel.createByteArray();
        this.A01 = parcel.readString();
        this.A05 = (byte[]) C5C.A0f(parcel.createByteArray());
    }

    public DownloadRequest(String str, Uri uri, String str2, List<StreamKey> list, byte[] bArr, String str3, byte[] bArr2) {
        byte[] bArrCopyOf;
        byte[] bArrCopyOf2;
        int iA0B = C5C.A0B(uri, str2);
        if (iA0B == 0 || iA0B == 2 || iA0B == 1) {
            AbstractC10843y.A09(str3 == null, A00(1, 38, 126) + iA0B);
        }
        this.A02 = str;
        this.A00 = uri;
        this.A03 = str2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.A04 = Collections.unmodifiableList(arrayList);
        if (bArr != null) {
            int contentType = bArr.length;
            bArrCopyOf = Arrays.copyOf(bArr, contentType);
        } else {
            bArrCopyOf = null;
        }
        this.A06 = bArrCopyOf;
        this.A01 = str3;
        if (bArr2 != null) {
            int contentType2 = bArr2.length;
            bArrCopyOf2 = Arrays.copyOf(bArr2, contentType2);
        } else {
            bArrCopyOf2 = C5C.A07;
        }
        this.A05 = bArrCopyOf2;
    }

    public /* synthetic */ DownloadRequest(String str, Uri uri, String str2, List list, byte[] bArr, String str3, byte[] bArr2, C7 c7) {
        this(str, uri, str2, list, bArr, str3, bArr2);
    }

    public final DownloadRequest A02(DownloadRequest downloadRequest) {
        List listEmptyList;
        AbstractC10843y.A07(this.A02.equals(downloadRequest.A02));
        if (this.A04.isEmpty() || downloadRequest.A04.isEmpty()) {
            listEmptyList = Collections.emptyList();
        } else {
            listEmptyList = new ArrayList(this.A04);
            for (int i2 = 0; i2 < mergedKeys.size(); i2++) {
                List<StreamKey> mergedKeys = downloadRequest.A04;
                StreamKey streamKey = mergedKeys.get(i2);
                if (!listEmptyList.contains(streamKey)) {
                    listEmptyList.add(streamKey);
                }
            }
        }
        return new DownloadRequest(this.A02, downloadRequest.A00, downloadRequest.A03, listEmptyList, downloadRequest.A06, downloadRequest.A01, downloadRequest.A05);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DownloadRequest)) {
            return false;
        }
        DownloadRequest downloadRequest = (DownloadRequest) obj;
        return this.A02.equals(downloadRequest.A02) && this.A00.equals(downloadRequest.A00) && C5C.A1E(this.A03, downloadRequest.A03) && this.A04.equals(downloadRequest.A04) && Arrays.equals(this.A06, downloadRequest.A06) && C5C.A1E(this.A01, downloadRequest.A01) && Arrays.equals(this.A05, downloadRequest.A05);
    }

    public final int hashCode() {
        int result = this.A02.hashCode() * 31;
        int i2 = result * 31;
        int result2 = this.A00.hashCode();
        int result3 = (i2 + result2) * 31;
        int result4 = this.A03 != null ? this.A03.hashCode() : 0;
        int result5 = (result3 + result4) * 31;
        int result6 = this.A04.hashCode();
        return ((((((result5 + result6) * 31) + Arrays.hashCode(this.A06)) * 31) + (this.A01 != null ? this.A01.hashCode() : 0)) * 31) + Arrays.hashCode(this.A05);
    }

    public final String toString() {
        return this.A03 + A00(0, 1, 94) + this.A02;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A00.toString());
        parcel.writeString(this.A03);
        parcel.writeInt(this.A04.size());
        for (int i3 = 0; i3 < i; i3++) {
            parcel.writeParcelable(this.A04.get(i3), 0);
        }
        parcel.writeByteArray(this.A06);
        parcel.writeString(this.A01);
        parcel.writeByteArray(this.A05);
    }
}
