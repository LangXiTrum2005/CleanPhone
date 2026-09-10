package tailoring;

import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: compiled from: ParsableNalUnitBitArray.java */
/* JADX INFO: loaded from: classes.dex */
public final class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public byte[] f38592attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int f38593dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public int f38594saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int f38595wireman;

    public saneness(byte[] bArr, int i, int i2) {
        taiyuan(bArr, i, i2);
    }

    public void apical() {
        int i = this.f38595wireman + 1;
        this.f38595wireman = i;
        if (i == 8) {
            this.f38595wireman = 0;
            int i2 = this.f38593dern;
            this.f38593dern = i2 + (cutely(i2 + 1) ? 2 : 1);
        }
        attabal();
    }

    public final void attabal() {
        int i;
        int i2 = this.f38593dern;
        decarock.attabal.competently(i2 >= 0 && (i2 < (i = this.f38594saneness) || (i2 == i && this.f38595wireman == 0)));
    }

    public final int beachfront() {
        int i = 0;
        while (!wireman()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? marial(i) : 0);
    }

    public int competently() {
        int iBeachfront = beachfront();
        return (iBeachfront % 2 == 0 ? -1 : 1) * ((iBeachfront + 1) / 2);
    }

    public final boolean cutely(int i) {
        if (2 > i || i >= this.f38594saneness) {
            return false;
        }
        byte[] bArr = this.f38592attabal;
        return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i - 1] == 0;
    }

    public boolean dern() {
        int i = this.f38593dern;
        int i2 = this.f38595wireman;
        int i3 = 0;
        while (this.f38593dern < this.f38594saneness && !wireman()) {
            i3++;
        }
        boolean z = this.f38593dern == this.f38594saneness;
        this.f38593dern = i;
        this.f38595wireman = i2;
        return !z && saneness((i3 * 2) + 1);
    }

    public void formularize(int i) {
        int i2 = this.f38593dern;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f38593dern = i4;
        int i5 = this.f38595wireman + (i - (i3 * 8));
        this.f38595wireman = i5;
        if (i5 > 7) {
            this.f38593dern = i4 + 1;
            this.f38595wireman = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f38593dern) {
                attabal();
                return;
            } else if (cutely(i2)) {
                this.f38593dern++;
                i2 += 2;
            }
        }
    }

    public int impromptu() {
        return beachfront();
    }

    public int marial(int i) {
        int i2;
        this.f38595wireman += i;
        int i3 = 0;
        while (true) {
            i2 = this.f38595wireman;
            int i4 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.f38595wireman = i5;
            byte[] bArr = this.f38592attabal;
            int i6 = this.f38593dern;
            i3 |= (bArr[i6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << i5;
            if (!cutely(i6 + 1)) {
                i4 = 1;
            }
            this.f38593dern = i6 + i4;
        }
        byte[] bArr2 = this.f38592attabal;
        int i7 = this.f38593dern;
        int i8 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i7] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> (8 - i2)));
        if (i2 == 8) {
            this.f38595wireman = 0;
            this.f38593dern = i7 + (cutely(i7 + 1) ? 2 : 1);
        }
        attabal();
        return i8;
    }

    public boolean saneness(int i) {
        int i2 = this.f38593dern;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.f38595wireman + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.f38594saneness) {
                break;
            }
            if (cutely(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.f38594saneness;
        if (i4 >= i6) {
            return i4 == i6 && i5 == 0;
        }
        return true;
    }

    public void taiyuan(byte[] bArr, int i, int i2) {
        this.f38592attabal = bArr;
        this.f38593dern = i;
        this.f38594saneness = i2;
        this.f38595wireman = 0;
        attabal();
    }

    public boolean wireman() {
        boolean z = (this.f38592attabal[this.f38593dern] & (128 >> this.f38595wireman)) != 0;
        apical();
        return z;
    }
}
