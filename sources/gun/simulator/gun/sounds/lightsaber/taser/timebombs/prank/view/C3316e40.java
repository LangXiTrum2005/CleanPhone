package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.e40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3316e40 extends C3971lc {
    public final transient byte[][] e;
    public final transient int[] f;

    public C3316e40(byte[][] bArr, int[] iArr) {
        super(C3971lc.d.f4653a);
        this.e = bArr;
        this.f = iArr;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3971lc
    public final String a() {
        throw null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3971lc
    public final C3971lc b(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.e;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] bArrDigest = messageDigest.digest();
        AbstractC2995aW.p(bArrDigest, "digestBytes");
        return new C3971lc(bArrDigest);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3971lc
    public final int c() {
        return this.f[this.e.length - 1];
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3971lc
    public final String d() {
        return new C3971lc(l()).d();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3971lc
    public final byte[] e() {
        return l();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3971lc
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3971lc) {
            C3971lc c3971lc = (C3971lc) obj;
            if (c3971lc.c() == c() && h(c3971lc, c())) {
                return true;
            }
        }
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3971lc
    public final byte f(int i) {
        byte[][] bArr = this.e;
        int length = bArr.length - 1;
        int[] iArr = this.f;
        AbstractC2845Vx.P(iArr[length], i, 1L);
        int iP0 = AbstractC2871Wx.p0(this, i);
        return bArr[iP0][(i - (iP0 == 0 ? 0 : iArr[iP0 - 1])) + iArr[bArr.length + iP0]];
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3971lc
    public final boolean g(int i, int i2, int i3, byte[] bArr) {
        AbstractC2995aW.q(bArr, "other");
        if (i < 0 || i > c() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int iP0 = AbstractC2871Wx.p0(this, i);
        while (i < i4) {
            int[] iArr = this.f;
            int i5 = iP0 == 0 ? 0 : iArr[iP0 - 1];
            int i6 = iArr[iP0] - i5;
            byte[][] bArr2 = this.e;
            int i7 = iArr[bArr2.length + iP0];
            int iMin = Math.min(i4, i6 + i5) - i;
            if (!AbstractC2845Vx.J((i - i5) + i7, bArr2[iP0], i2, bArr, iMin)) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            iP0++;
        }
        return true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3971lc
    public final boolean h(C3971lc c3971lc, int i) {
        AbstractC2995aW.q(c3971lc, "other");
        if (c() - i < 0) {
            return false;
        }
        int iP0 = AbstractC2871Wx.p0(this, 0);
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int[] iArr = this.f;
            int i4 = iP0 == 0 ? 0 : iArr[iP0 - 1];
            int i5 = iArr[iP0] - i4;
            byte[][] bArr = this.e;
            int i6 = iArr[bArr.length + iP0];
            int iMin = Math.min(i, i5 + i4) - i2;
            if (!c3971lc.g(i3, (i2 - i4) + i6, iMin, bArr[iP0])) {
                return false;
            }
            i3 += iMin;
            i2 += iMin;
            iP0++;
        }
        return true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3971lc
    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.e;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.b = i3;
        return i3;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3971lc
    public final C3971lc i() {
        return new C3971lc(l()).i();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3971lc
    public final void k(C4848vb c4848vb, int i) {
        AbstractC2995aW.q(c4848vb, "buffer");
        int iP0 = AbstractC2871Wx.p0(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.f;
            int i3 = iP0 == 0 ? 0 : iArr[iP0 - 1];
            int i4 = iArr[iP0] - i3;
            byte[][] bArr = this.e;
            int i5 = iArr[bArr.length + iP0];
            int iMin = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            V30 v30 = new V30(bArr[iP0], i6, i6 + iMin, true);
            V30 v31 = c4848vb.f5139a;
            if (v31 == null) {
                v30.g = v30;
                v30.f = v30;
                c4848vb.f5139a = v30;
            } else {
                V30 v32 = v31.g;
                AbstractC2995aW.n(v32);
                v32.b(v30);
            }
            i2 += iMin;
            iP0++;
        }
        c4848vb.b += (long) i;
    }

    public final byte[] l() {
        byte[] bArr = new byte[c()];
        byte[][] bArr2 = this.e;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.f;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            U5.j0(i3, bArr2[i], i4, bArr, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3971lc
    public final String toString() {
        return new C3971lc(l()).toString();
    }
}
