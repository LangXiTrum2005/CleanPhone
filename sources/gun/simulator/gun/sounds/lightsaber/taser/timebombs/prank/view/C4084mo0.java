package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.mo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4084mo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutputStream f4717a;
    public int b;
    public boolean c;

    public C4084mo0(OutputStream outputStream, int i) {
        this.f4717a = outputStream;
        this.b = i;
    }

    public final void a(byte[] bArr, int i) throws C4695tm0 {
        if (this.c) {
            return;
        }
        try {
            this.f4717a.write(bArr, 0, i);
            this.c = true;
        } catch (IOException e) {
            throw new C4695tm0(e);
        }
    }
}
