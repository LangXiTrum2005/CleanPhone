package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class Cd0 extends AbstractC3763j9 implements InterfaceC4977x00 {
    public final LinkedBlockingQueue e;
    public final long f;
    public byte[] g;
    public int h;

    public Cd0(long j) {
        super(true);
        this.f = j;
        this.e = new LinkedBlockingQueue();
        this.g = new byte[0];
        this.h = -1;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4977x00
    public final String a() {
        FW.s(this.h != -1);
        int i = this.h;
        int i2 = this.h + 1;
        int i3 = Ug0.f3833a;
        Locale locale = Locale.US;
        return AbstractC3888ke0.h("RTP/AVP/TCP;unicast;interleaved=", i, "-", i2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4977x00
    public final int b() {
        return this.h;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4429ql
    public final long d(C4868vl c4868vl) {
        this.h = c4868vl.f5150a.getPort();
        return -1L;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4429ql
    public final Uri getUri() {
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3813jl
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int iMin = Math.min(i2, this.g.length);
        System.arraycopy(this.g, 0, bArr, i, iMin);
        byte[] bArr2 = this.g;
        this.g = Arrays.copyOfRange(bArr2, iMin, bArr2.length);
        if (iMin == i2) {
            return iMin;
        }
        try {
            byte[] bArr3 = (byte[]) this.e.poll(this.f, TimeUnit.MILLISECONDS);
            if (bArr3 == null) {
                return -1;
            }
            int iMin2 = Math.min(i2 - iMin, bArr3.length);
            System.arraycopy(bArr3, 0, bArr, i + iMin, iMin2);
            if (iMin2 < bArr3.length) {
                this.g = Arrays.copyOfRange(bArr3, iMin2, bArr3.length);
            }
            return iMin + iMin2;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return -1;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4429ql
    public final void close() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4977x00
    public final Cd0 e() {
        return this;
    }
}
