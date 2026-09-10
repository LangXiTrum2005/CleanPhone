package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class DX implements InterfaceC2434Gb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4463r70 f2973a;
    public final C4848vb b;
    public boolean c;

    public DX(InterfaceC4463r70 interfaceC4463r70) {
        AbstractC2995aW.q(interfaceC4463r70, "sink");
        this.f2973a = interfaceC4463r70;
        this.b = new C4848vb();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2434Gb
    public final InterfaceC2434Gb A(String str) {
        AbstractC2995aW.q(str, TypedValues.Custom.S_STRING);
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.b.Y(str);
        z();
        return this;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2434Gb
    public final long B(InterfaceC3588h80 interfaceC3588h80) {
        long j = 0;
        while (true) {
            long j2 = interfaceC3588h80.read(this.b, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (j2 == -1) {
                return j;
            }
            j += j2;
            z();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2434Gb
    public final InterfaceC2434Gb E(long j) {
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.b.S(j);
        z();
        return this;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2434Gb
    public final InterfaceC2434Gb I(C3971lc c3971lc) {
        AbstractC2995aW.q(c3971lc, "byteString");
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.b.x(c3971lc);
        z();
        return this;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2434Gb
    public final InterfaceC2434Gb M(long j) {
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.b.T(j);
        z();
        return this;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4463r70, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        InterfaceC4463r70 interfaceC4463r70 = this.f2973a;
        if (this.c) {
            return;
        }
        C4848vb c4848vb = this.b;
        long j = c4848vb.b;
        if (j > 0) {
            interfaceC4463r70.d(c4848vb, j);
        }
        th = null;
        try {
            interfaceC4463r70.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4463r70
    public final void d(C4848vb c4848vb, long j) {
        AbstractC2995aW.q(c4848vb, "source");
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.b.d(c4848vb, j);
        z();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2434Gb, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4463r70, java.io.Flushable
    public final void flush() {
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        C4848vb c4848vb = this.b;
        long j = c4848vb.b;
        InterfaceC4463r70 interfaceC4463r70 = this.f2973a;
        if (j > 0) {
            interfaceC4463r70.d(c4848vb, j);
        }
        interfaceC4463r70.flush();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2434Gb
    public final C4848vb getBuffer() {
        return this.b;
    }

    public final InterfaceC2434Gb h() {
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        C4848vb c4848vb = this.b;
        long j = c4848vb.b;
        if (j > 0) {
            this.f2973a.d(c4848vb, j);
        }
        return this;
    }

    public final void i(int i) {
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.b.U(AbstractC2845Vx.h0(i));
        z();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4463r70
    public final Ic0 timeout() {
        return this.f2973a.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f2973a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        AbstractC2995aW.q(byteBuffer, "source");
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        int iWrite = this.b.write(byteBuffer);
        z();
        return iWrite;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2434Gb
    public final InterfaceC2434Gb writeByte(int i) {
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.b.R(i);
        z();
        return this;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2434Gb
    public final InterfaceC2434Gb writeInt(int i) {
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.b.U(i);
        z();
        return this;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2434Gb
    public final InterfaceC2434Gb writeShort(int i) {
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.b.V(i);
        z();
        return this;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2434Gb
    public final InterfaceC2434Gb z() {
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        C4848vb c4848vb = this.b;
        long jK = c4848vb.k();
        if (jK > 0) {
            this.f2973a.d(c4848vb, jK);
        }
        return this;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2434Gb
    public final InterfaceC2434Gb write(byte[] bArr, int i, int i2) {
        AbstractC2995aW.q(bArr, "source");
        if (!this.c) {
            this.b.y(bArr, i, i2);
            z();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2434Gb
    public final InterfaceC2434Gb write(byte[] bArr) {
        if (!this.c) {
            C4848vb c4848vb = this.b;
            c4848vb.getClass();
            c4848vb.y(bArr, 0, bArr.length);
            z();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }
}
