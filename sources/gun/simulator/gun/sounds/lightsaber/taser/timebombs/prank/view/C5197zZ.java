package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.zZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5197zZ extends Reader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2460Hb f5329a;
    public final Charset b;
    public boolean c;
    public InputStreamReader d;

    public C5197zZ(InterfaceC2460Hb interfaceC2460Hb, Charset charset) {
        AbstractC2995aW.q(interfaceC2460Hb, "source");
        AbstractC2995aW.q(charset, "charset");
        this.f5329a = interfaceC2460Hb;
        this.b = charset;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        C5033xf0 c5033xf0;
        this.c = true;
        InputStreamReader inputStreamReader = this.d;
        if (inputStreamReader == null) {
            c5033xf0 = null;
        } else {
            inputStreamReader.close();
            c5033xf0 = C5033xf0.f5238a;
        }
        if (c5033xf0 == null) {
            this.f5329a.close();
        }
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) throws IOException {
        AbstractC2995aW.q(cArr, "cbuf");
        if (this.c) {
            throw new IOException("Stream closed");
        }
        InputStreamReader inputStreamReader = this.d;
        if (inputStreamReader == null) {
            InterfaceC2460Hb interfaceC2460Hb = this.f5329a;
            inputStreamReader = new InputStreamReader(interfaceC2460Hb.Q(), Vg0.r(interfaceC2460Hb, this.b));
            this.d = inputStreamReader;
        }
        return inputStreamReader.read(cArr, i, i2);
    }
}
