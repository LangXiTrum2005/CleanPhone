package com.google.android.exoplayer2.extractor.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.exifinterface.media.ExifInterface;
import com.badlogic.gdx.Input;
import com.facebook.ads.redexgen.core.AbstractC1600gE;
import com.facebook.ads.redexgen.core.P5;
import com.facebook.ads.redexgen.core.VA;
import com.facebook.ads.redexgen.core.ZM;
import com.google.android.exoplayer2.Metadata;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class EventMessage implements Metadata.Entry {
    public static byte[] A06;
    public static String[] A07 = {"70xUEf5LdQCK5cfkZ8s3n36ePKqcfe7C", "UVoMNFm2RsUwqWsGOrKYknt2uUA6ycfW", "w", "bk8lwu0Mlsy3f6pI8enlcSjwsPJh", "MVHkBF5nquHz1cn80cBz", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "KT4JYvE7N1GCPHJ0WtUkksIoosTYcKCe", "z7xr8MsMaAoa6OG53e5pK3KzKaIIP5Oc"};
    public static final ZM A08;
    public static final ZM A09;
    public static final Parcelable.Creator<EventMessage> CREATOR;
    public int A00;
    public final long A01;
    public final long A02;
    public final String A03;
    public final String A04;
    public final byte[] A05;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 86);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{-109, -121, -53, -36, -39, -56, -37, -48, -42, -43, -76, -38, -92, -90, -102, -29, -34, -73, -88, -100, -14, -35, -24, -15, -31, -71, -82, -74, -68, -80, -93, -119, -36, -52, -47, -50, -42, -50, -90, -30, -15, -15, -19, -22, -28, -30, -11, -22, -16, -17, -80, -22, -27, -76, -49, -34, -34, -38, -41, -47, -49, -30, -41, -35, -36, -99, -26, -101, -31, -47, -30, -45, -95, -93, -29, -17, -17, -21, -18, -75, -86, -86, -36, -22, -24, -32, -33, -28, -36, -87, -22, -19, -30, -86, -32, -24, -18, -30, -86, -60, -65, -82, -6, 6, 6, 2, 5, -52, -63, -63, -10, -9, 8, -9, -2, 1, 2, -9, 4, -64, -13, 2, 2, -2, -9, -64, -11, 1, -1, -63, 5, 6, 4, -9, -13, -1, -5, 0, -7, -63, -9, -1, 5, -7, -65, -5, -10, -59, 59, 56, 52, 0, 57, 41, 58, 43, 0, 57, 41, 58, 43, -7, -5, 0, -8, -10, -9, -6, 0, 40, 47, 52};
    }

    static {
        A01();
        A08 = new P5().A11(A00(39, 15, 43)).A14();
        A09 = new P5().A11(A00(54, 20, 24)).A14();
        CREATOR = new VA();
    }

    public EventMessage(Parcel parcel) {
        this.A03 = (String) AbstractC1600gE.A0f(parcel.readString());
        this.A04 = (String) AbstractC1600gE.A0f(parcel.readString());
        this.A01 = parcel.readLong();
        this.A02 = parcel.readLong();
        this.A05 = (byte[]) AbstractC1600gE.A0f(parcel.createByteArray());
    }

    public EventMessage(String str, String str2, long j, long j2, byte[] bArr) {
        this.A03 = str;
        this.A04 = str2;
        this.A01 = j;
        this.A02 = j2;
        this.A05 = bArr;
    }

    @Override // com.google.android.exoplayer2.Metadata.Entry
    public final byte[] A9Q() {
        if (A9R() != null) {
            return this.A05;
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x0009  */
    @Override // com.google.android.exoplayer2.Metadata.Entry
    public final ZM A9R() {
        byte b;
        String str = this.A03;
        switch (str.hashCode()) {
            case -1468477611:
                if (!str.equals(A00(Input.Keys.NUMPAD_4, 24, 112))) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case -795945609:
                if (!str.equals(A00(74, 28, 37))) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case 1303648457:
                if (!str.equals(A00(102, 46, 60))) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
            case 1:
                return A08;
            case 2:
                return A09;
            default:
                return null;
        }
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
        EventMessage eventMessage = (EventMessage) obj;
        if (this.A01 == eventMessage.A01 && this.A02 == eventMessage.A02 && AbstractC1600gE.A1E(this.A03, eventMessage.A03)) {
            boolean zA1E = AbstractC1600gE.A1E(this.A04, eventMessage.A04);
            String[] strArr = A07;
            if (strArr[1].charAt(20) != strArr[6].charAt(20)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[2] = ExifInterface.LONGITUDE_WEST;
            strArr2[5] = CampaignEx.JSON_KEY_AD_K;
            if (zA1E && Arrays.equals(this.A05, eventMessage.A05)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            int i = 17 * 31;
            int result = this.A03 != null ? this.A03.hashCode() : 0;
            int iHashCode = (((i + result) * 31) + (this.A04 != null ? this.A04.hashCode() : 0)) * 31;
            int result2 = (int) (this.A01 ^ (this.A01 >>> 32));
            int result3 = (((iHashCode + result2) * 31) + ((int) (this.A02 ^ (this.A02 >>> 32)))) * 31;
            int result4 = Arrays.hashCode(this.A05);
            this.A00 = result3 + result4;
        }
        return this.A00;
    }

    public final String toString() {
        return A00(26, 13, 19) + this.A03 + A00(13, 5, 36) + this.A02 + A00(0, 13, 17) + this.A01 + A00(18, 8, 38) + this.A04;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A02);
        parcel.writeByteArray(this.A05);
    }
}
