package cybernatic;

import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: compiled from: VorbisBitArray.java */
/* JADX INFO: loaded from: classes.dex */
public final class starveling {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final byte[] f24780attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int f24781dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f24782saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int f24783wireman;

    public starveling(byte[] bArr) {
        this.f24780attabal = bArr;
        this.f24782saneness = bArr.length;
    }

    public final void attabal() {
        int i;
        int i2 = this.f24781dern;
        decarock.attabal.competently(i2 >= 0 && (i2 < (i = this.f24782saneness) || (i2 == i && this.f24783wireman == 0)));
    }

    public boolean dern() {
        boolean z = (((this.f24780attabal[this.f24781dern] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> this.f24783wireman) & 1) == 1;
        marial(1);
        return z;
    }

    public void marial(int i) {
        int i2 = i / 8;
        int i3 = this.f24781dern + i2;
        this.f24781dern = i3;
        int i4 = this.f24783wireman + (i - (i2 * 8));
        this.f24783wireman = i4;
        if (i4 > 7) {
            this.f24781dern = i3 + 1;
            this.f24783wireman = i4 - 8;
        }
        attabal();
    }

    public int saneness() {
        return (this.f24781dern * 8) + this.f24783wireman;
    }

    public int wireman(int i) {
        int i2 = this.f24781dern;
        int iMin = Math.min(i, 8 - this.f24783wireman);
        int i3 = i2 + 1;
        int i4 = ((this.f24780attabal[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> this.f24783wireman) & (255 >> (8 - iMin));
        while (iMin < i) {
            i4 |= (this.f24780attabal[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << iMin;
            iMin += 8;
            i3++;
        }
        int i5 = i4 & ((-1) >>> (32 - i));
        marial(i);
        return i5;
    }
}
