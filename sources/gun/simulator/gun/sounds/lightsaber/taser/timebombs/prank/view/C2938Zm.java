package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Zm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2938Zm implements InterfaceC4265ot {
    public final InterfaceC3813jl b;
    public final long c;
    public long d;
    public int f;
    public int g;
    public byte[] e = new byte[65536];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f4091a = new byte[4096];

    static {
        AbstractC2944Zs.a("goog.exo.extractor");
    }

    public C2938Zm(InterfaceC3813jl interfaceC3813jl, long j, long j2) {
        this.b = interfaceC3813jl;
        this.d = j;
        this.c = j2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4265ot
    public final void advancePeekPosition(int i) throws EOFException, InterruptedIOException {
        advancePeekPosition(i, false);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4265ot
    public final int f(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        int iMin;
        g(i2);
        int i3 = this.g;
        int i4 = this.f;
        int i5 = i3 - i4;
        if (i5 == 0) {
            iMin = h(this.e, i4, i2, 0, true);
            if (iMin == -1) {
                return -1;
            }
            this.g += iMin;
        } else {
            iMin = Math.min(i2, i5);
        }
        System.arraycopy(this.e, this.f, bArr, i, iMin);
        this.f += iMin;
        return iMin;
    }

    public final void g(int i) {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (i2 > bArr.length) {
            this.e = Arrays.copyOf(this.e, Ug0.j(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4265ot
    public final long getLength() {
        return this.c;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4265ot
    public final long getPeekPosition() {
        return this.d + ((long) this.f);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4265ot
    public final long getPosition() {
        return this.d;
    }

    public final int h(byte[] bArr, int i, int i2, int i3, boolean z) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i4 = this.b.read(bArr, i + i3, i2 - i3);
        if (i4 != -1) {
            return i3 + i4;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    public final void i(int i) {
        int i2 = this.g - i;
        this.g = i2;
        this.f = 0;
        byte[] bArr = this.e;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.e = bArr2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4265ot
    public final void peekFully(byte[] bArr, int i, int i2) {
        peekFully(bArr, i, i2, false);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3813jl
    public final int read(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        int i3 = this.g;
        int iH = 0;
        if (i3 != 0) {
            int iMin = Math.min(i3, i2);
            System.arraycopy(this.e, 0, bArr, i, iMin);
            i(iMin);
            iH = iMin;
        }
        if (iH == 0) {
            iH = h(bArr, i, i2, 0, true);
        }
        if (iH != -1) {
            this.d += (long) iH;
        }
        return iH;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4265ot
    public final void readFully(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        readFully(bArr, i, i2, false);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4265ot
    public final void resetPeekPosition() {
        this.f = 0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4265ot
    public final int skip(int i) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.g, i);
        i(iMin);
        if (iMin == 0) {
            byte[] bArr = this.f4091a;
            iMin = h(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        if (iMin != -1) {
            this.d += (long) iMin;
        }
        return iMin;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4265ot
    public final void skipFully(int i) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.g, i);
        i(iMin);
        int iH = iMin;
        while (iH < i && iH != -1) {
            iH = h(this.f4091a, -iH, Math.min(i, this.f4091a.length + iH), iH, false);
        }
        if (iH != -1) {
            this.d += (long) iH;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4265ot
    public final boolean advancePeekPosition(int i, boolean z) throws EOFException, InterruptedIOException {
        g(i);
        int iH = this.g - this.f;
        while (iH < i) {
            iH = h(this.e, this.f, i, iH, z);
            if (iH == -1) {
                return false;
            }
            this.g = this.f + iH;
        }
        this.f += i;
        return true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4265ot
    public final boolean peekFully(byte[] bArr, int i, int i2, boolean z) {
        if (!advancePeekPosition(i2, z)) {
            return false;
        }
        System.arraycopy(this.e, this.f - i2, bArr, i, i2);
        return true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4265ot
    public final boolean readFully(byte[] bArr, int i, int i2, boolean z) throws EOFException, InterruptedIOException {
        int iMin;
        int i3 = this.g;
        if (i3 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i3, i2);
            System.arraycopy(this.e, 0, bArr, i, iMin);
            i(iMin);
        }
        int iH = iMin;
        while (iH < i2 && iH != -1) {
            iH = h(bArr, i, i2, iH, z);
        }
        if (iH != -1) {
            this.d += (long) iH;
        }
        return iH != -1;
    }
}
