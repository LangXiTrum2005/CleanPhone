package decarock;

import com.inmobi.media.core.config.models.AdConfig;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: ParsableBitArray.java */
/* JADX INFO: loaded from: classes.dex */
public final class cuirassed {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public byte[] f25071attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int f25072dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public int f25073saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int f25074wireman;

    public cuirassed() {
        this.f25071attabal = grimness.f25081beachfront;
    }

    public void apical(byte[] bArr, int i, int i2) {
        attabal.competently(this.f25072dern == 0);
        System.arraycopy(this.f25071attabal, this.f25073saneness, bArr, i, i2);
        this.f25073saneness += i2;
        attabal();
    }

    public void arytenoidectomy(int i) {
        int i2 = i / 8;
        this.f25073saneness = i2;
        this.f25072dern = i - (i2 * 8);
        attabal();
    }

    public final void attabal() {
        int i;
        int i2 = this.f25073saneness;
        attabal.competently(i2 >= 0 && (i2 < (i = this.f25074wireman) || (i2 == i && this.f25072dern == 0)));
    }

    public void beachfront(int i, int i2) {
        if (i2 < 32) {
            i &= (1 << i2) - 1;
        }
        int iMin = Math.min(8 - this.f25072dern, i2);
        int i3 = this.f25072dern;
        int i4 = (8 - i3) - iMin;
        byte[] bArr = this.f25071attabal;
        int i5 = this.f25073saneness;
        byte b = (byte) (((65280 >> i3) | ((1 << i4) - 1)) & bArr[i5]);
        bArr[i5] = b;
        int i6 = i2 - iMin;
        bArr[i5] = (byte) (b | ((i >>> i6) << i4));
        int i7 = i5 + 1;
        while (i6 > 8) {
            this.f25071attabal[i7] = (byte) (i >>> (i6 - 8));
            i6 -= 8;
            i7++;
        }
        int i8 = 8 - i6;
        byte[] bArr2 = this.f25071attabal;
        byte b2 = (byte) (bArr2[i7] & ((1 << i8) - 1));
        bArr2[i7] = b2;
        bArr2[i7] = (byte) (((i & ((1 << i6) - 1)) << i8) | b2);
        polloi(i2);
        attabal();
    }

    public boolean competently() {
        boolean z = (this.f25071attabal[this.f25073saneness] & (128 >> this.f25072dern)) != 0;
        monoploid();
        return z;
    }

    public long cutely(int i) {
        return i <= 32 ? grimness.cig(impromptu(i)) : grimness.tarboosh(impromptu(i - 32), impromptu(32));
    }

    public void dern() {
        if (this.f25072dern == 0) {
            return;
        }
        this.f25072dern = 0;
        this.f25073saneness++;
        attabal();
    }

    public String formularize(int i, Charset charset) {
        byte[] bArr = new byte[i];
        apical(bArr, 0, i);
        return new String(bArr, charset);
    }

    public void impassible(stratoscope stratoscopeVar) {
        kowloon(stratoscopeVar.marial(), stratoscopeVar.competently());
        arytenoidectomy(stratoscopeVar.beachfront() * 8);
    }

    public int impromptu(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.f25072dern += i;
        int i3 = 0;
        while (true) {
            i2 = this.f25072dern;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f25072dern = i4;
            byte[] bArr = this.f25071attabal;
            int i5 = this.f25073saneness;
            this.f25073saneness = i5 + 1;
            i3 |= (bArr[i5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << i4;
        }
        byte[] bArr2 = this.f25071attabal;
        int i6 = this.f25073saneness;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> (8 - i2)));
        if (i2 == 8) {
            this.f25072dern = 0;
            this.f25073saneness = i6 + 1;
        }
        attabal();
        return i7;
    }

    public void kowloon(byte[] bArr, int i) {
        this.f25071attabal = bArr;
        this.f25073saneness = 0;
        this.f25072dern = 0;
        this.f25074wireman = i;
    }

    public int marial() {
        return (this.f25073saneness * 8) + this.f25072dern;
    }

    public void molybdenite(int i) {
        attabal.competently(this.f25072dern == 0);
        this.f25073saneness += i;
        attabal();
    }

    public void monoploid() {
        int i = this.f25072dern + 1;
        this.f25072dern = i;
        if (i == 8) {
            this.f25072dern = 0;
            this.f25073saneness++;
        }
        attabal();
    }

    public void polloi(int i) {
        int i2 = i / 8;
        int i3 = this.f25073saneness + i2;
        this.f25073saneness = i3;
        int i4 = this.f25072dern + (i - (i2 * 8));
        this.f25072dern = i4;
        if (i4 > 7) {
            this.f25073saneness = i3 + 1;
            this.f25072dern = i4 - 8;
        }
        attabal();
    }

    public int saneness() {
        return ((this.f25074wireman - this.f25073saneness) * 8) - this.f25072dern;
    }

    public void taiyuan(byte[] bArr, int i, int i2) {
        int i3 = (i2 >> 3) + i;
        while (i < i3) {
            byte[] bArr2 = this.f25071attabal;
            int i4 = this.f25073saneness;
            int i5 = i4 + 1;
            this.f25073saneness = i5;
            byte b = bArr2[i4];
            int i6 = this.f25072dern;
            byte b2 = (byte) (b << i6);
            bArr[i] = b2;
            bArr[i] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | b2);
            i++;
        }
        int i7 = i2 & 7;
        if (i7 == 0) {
            return;
        }
        byte b3 = (byte) (bArr[i3] & (255 >> i7));
        bArr[i3] = b3;
        int i8 = this.f25072dern;
        if (i8 + i7 > 8) {
            byte[] bArr3 = this.f25071attabal;
            int i9 = this.f25073saneness;
            this.f25073saneness = i9 + 1;
            bArr[i3] = (byte) (b3 | ((bArr3[i9] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << i8));
            this.f25072dern = i8 - 8;
        }
        int i10 = this.f25072dern + i7;
        this.f25072dern = i10;
        byte[] bArr4 = this.f25071attabal;
        int i11 = this.f25073saneness;
        bArr[i3] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | bArr[i3]);
        if (i10 == 8) {
            this.f25072dern = 0;
            this.f25073saneness = i11 + 1;
        }
        attabal();
    }

    public void triweekly(byte[] bArr) {
        kowloon(bArr, bArr.length);
    }

    public int wireman() {
        attabal.competently(this.f25072dern == 0);
        return this.f25073saneness;
    }

    public cuirassed(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public cuirassed(byte[] bArr, int i) {
        this.f25071attabal = bArr;
        this.f25074wireman = i;
    }
}
