package com.google.android.exoplayer2;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.core.AbstractC1517es;
import com.facebook.ads.redexgen.core.AbstractC1600gE;
import com.facebook.ads.redexgen.core.O5;
import com.facebook.ads.redexgen.core.OL;
import com.facebook.ads.redexgen.core.OM;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static String[] A04 = {"5gwvBKKpz9ZGxWVKS6Ecb33KblAvGL2B", "hoix", "jl1VFGToMKSc1tj4OZIpCjBR23vvUysc", "8L2JGnSfNY2oQ2UAIqJ6Br5In7Ypv1aP", "wuD3", "6CxfGk5AYTOGGY7086ohnohTnVcgFFO0", "ztl3kAXrkB0HopUu75cZKg9pf3q7CiiP", "TgHxrSlRZFF6m0oPJlt2Kvfs4"};
    public static final Parcelable.Creator<DrmInitData> CREATOR = new OL();
    public int A00;
    public final int A01;
    public final String A02;

    @MetaExoPlayerCustomization("Making the schemeDatas public")
    public final SchemeData[] A03;

    public static final class SchemeData implements Parcelable {
        public static String[] A05 = {"389ijLwHA2ViXYKM38wak9Q90Su", "jNWhm1aMVbhsdqNzO0JAx1bkiOMbDcgN", "ankAHZZA", "W5uDfUTVZLo9MDHt6T5oXyivvKiIWIev", "VkVgW3RanK2VDNugBs", "wvW2mITcZAEr07Fj6He9okPzOV8", "FELKB7Q0cem", "QTcnfPS9xeJL0W5B3B"};
        public static final Parcelable.Creator<SchemeData> CREATOR = new OM();
        public int A00;
        public final String A01;
        public final String A02;
        public final UUID A03;
        public final byte[] A04;

        public SchemeData(Parcel parcel) {
            this.A03 = new UUID(parcel.readLong(), parcel.readLong());
            this.A01 = parcel.readString();
            this.A02 = (String) AbstractC1600gE.A0f(parcel.readString());
            this.A04 = parcel.createByteArray();
        }

        public SchemeData(UUID uuid, String str, String str2, byte[] bArr) {
            this.A03 = (UUID) AbstractC1517es.A01(uuid);
            this.A01 = str;
            this.A02 = (String) AbstractC1517es.A01(str2);
            this.A04 = bArr;
        }

        public SchemeData(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            return AbstractC1600gE.A1E(this.A01, schemeData.A01) && AbstractC1600gE.A1E(this.A02, schemeData.A02) && AbstractC1600gE.A1E(this.A03, schemeData.A03) && Arrays.equals(this.A04, schemeData.A04);
        }

        public final int hashCode() {
            if (this.A00 == 0) {
                int result = this.A03.hashCode();
                int i = result * 31;
                int result2 = this.A01 == null ? 0 : this.A01.hashCode();
                int result3 = (((i + result2) * 31) + this.A02.hashCode()) * 31;
                int result4 = Arrays.hashCode(this.A04);
                this.A00 = result3 + result4;
            }
            int i2 = this.A00;
            if (A05[1].charAt(18) != 'J') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[7] = "oBfSvSNobbYdmWKy8z";
            strArr[4] = "D9ta70w70jEEvMSdP9";
            return i2;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.A03.getMostSignificantBits());
            parcel.writeLong(this.A03.getLeastSignificantBits());
            parcel.writeString(this.A01);
            parcel.writeString(this.A02);
            parcel.writeByteArray(this.A04);
        }
    }

    public DrmInitData(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A03 = (SchemeData[]) AbstractC1600gE.A0f((SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR));
        this.A01 = this.A03.length;
    }

    public DrmInitData(String str, boolean z, SchemeData... schemeDataArr) {
        this.A02 = str;
        schemeDataArr = z ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.A03 = schemeDataArr;
        this.A01 = schemeDataArr.length;
        Arrays.sort(this.A03, this);
    }

    public DrmInitData(String str, SchemeData... schemeDataArr) {
        this(str, true, schemeDataArr);
    }

    public DrmInitData(List<SchemeData> schemeDatas) {
        this(null, false, (SchemeData[]) schemeDatas.toArray(new SchemeData[0]));
    }

    public DrmInitData(SchemeData... schemeDataArr) {
        this(null, schemeDataArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compare(SchemeData schemeData, SchemeData schemeData2) {
        if (O5.A03.equals(schemeData.A03)) {
            return O5.A03.equals(schemeData2.A03) ? 0 : 1;
        }
        return schemeData.A03.compareTo(schemeData2.A03);
    }

    public final DrmInitData A01(String str) {
        if (AbstractC1600gE.A1E(this.A02, str)) {
            return this;
        }
        return new DrmInitData(str, false, this.A03);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DrmInitData drmInitData = (DrmInitData) obj;
        if (AbstractC1600gE.A1E(this.A02, drmInitData.A02) && Arrays.equals(this.A03, drmInitData.A03)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int result;
        if (this.A00 == 0) {
            if (this.A02 == null) {
                result = 0;
            } else {
                String str = this.A02;
                if (A04[3].charAt(22) != '5') {
                    throw new RuntimeException();
                }
                String[] strArr = A04;
                strArr[5] = "0Fe4cgWnO4IGrRLvKNZ0dbAMVJHwrvOh";
                strArr[0] = "H9OZgGmyJiXGopF3bhGJjGkmM0dZz21S";
                result = str.hashCode();
            }
            int i = result * 31;
            int result2 = Arrays.hashCode(this.A03);
            this.A00 = i + result2;
        }
        return this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeTypedArray(this.A03, 0);
    }
}
