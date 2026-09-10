package ghoulish;

import java.util.Arrays;

/* JADX INFO: compiled from: NalUnitTargetBuffer.java */
/* JADX INFO: loaded from: classes.dex */
public final class gintrap {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f26887attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public boolean f26888dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public int f26889marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public boolean f26890saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public byte[] f26891wireman;

    public gintrap(int i, int i2) {
        this.f26887attabal = i;
        byte[] bArr = new byte[i2 + 3];
        this.f26891wireman = bArr;
        bArr[2] = 1;
    }

    public void attabal(byte[] bArr, int i, int i2) {
        if (this.f26890saneness) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f26891wireman;
            int length = bArr2.length;
            int i4 = this.f26889marial;
            if (length < i4 + i3) {
                this.f26891wireman = Arrays.copyOf(bArr2, (i4 + i3) * 2);
            }
            System.arraycopy(bArr, i, this.f26891wireman, this.f26889marial, i3);
            this.f26889marial += i3;
        }
    }

    public boolean dern() {
        return this.f26888dern;
    }

    public void marial(int i) {
        decarock.attabal.competently(!this.f26890saneness);
        boolean z = i == this.f26887attabal;
        this.f26890saneness = z;
        if (z) {
            this.f26889marial = 3;
            this.f26888dern = false;
        }
    }

    public boolean saneness(int i) {
        if (!this.f26890saneness) {
            return false;
        }
        this.f26889marial -= i;
        this.f26890saneness = false;
        this.f26888dern = true;
        return true;
    }

    public void wireman() {
        this.f26890saneness = false;
        this.f26888dern = false;
    }
}
