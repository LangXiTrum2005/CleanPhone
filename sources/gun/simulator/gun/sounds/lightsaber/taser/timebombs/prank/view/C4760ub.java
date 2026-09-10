package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ub, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4760ub extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5086a;
    public final /* synthetic */ InterfaceC2460Hb b;

    public /* synthetic */ C4760ub(InterfaceC2460Hb interfaceC2460Hb, int i) {
        this.f5086a = i;
        this.b = interfaceC2460Hb;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        int i = this.f5086a;
        InterfaceC2460Hb interfaceC2460Hb = this.b;
        switch (i) {
            case 0:
                return (int) Math.min(((C4848vb) interfaceC2460Hb).b, Integer.MAX_VALUE);
            default:
                EX ex = (EX) interfaceC2460Hb;
                if (ex.c) {
                    throw new IOException("closed");
                }
                return (int) Math.min(ex.b.b, Integer.MAX_VALUE);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f5086a) {
            case 0:
                break;
            default:
                ((EX) this.b).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.f5086a;
        InterfaceC2460Hb interfaceC2460Hb = this.b;
        switch (i) {
            case 0:
                C4848vb c4848vb = (C4848vb) interfaceC2460Hb;
                if (c4848vb.b > 0) {
                    return c4848vb.readByte() & 255;
                }
                return -1;
            default:
                EX ex = (EX) interfaceC2460Hb;
                if (ex.c) {
                    throw new IOException("closed");
                }
                C4848vb c4848vb2 = ex.b;
                if (c4848vb2.b == 0 && ex.f3026a.read(c4848vb2, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    return -1;
                }
                return c4848vb2.readByte() & 255;
        }
    }

    public final String toString() {
        int i = this.f5086a;
        InterfaceC2460Hb interfaceC2460Hb = this.b;
        switch (i) {
            case 0:
                return ((C4848vb) interfaceC2460Hb) + ".inputStream()";
            default:
                return ((EX) interfaceC2460Hb) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f5086a;
        InterfaceC2460Hb interfaceC2460Hb = this.b;
        switch (i3) {
            case 0:
                AbstractC2995aW.q(bArr, "sink");
                return ((C4848vb) interfaceC2460Hb).read(bArr, i, i2);
            default:
                AbstractC2995aW.q(bArr, "data");
                EX ex = (EX) interfaceC2460Hb;
                if (!ex.c) {
                    AbstractC2845Vx.P(bArr.length, i, i2);
                    C4848vb c4848vb = ex.b;
                    if (c4848vb.b == 0 && ex.f3026a.read(c4848vb, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                        return -1;
                    }
                    return c4848vb.read(bArr, i, i2);
                }
                throw new IOException("closed");
        }
    }
}
