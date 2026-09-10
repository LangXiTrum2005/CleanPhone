package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.Closeable;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.f10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3398f10 implements Closeable {
    public static final Charset g = AbstractC2333Ce.c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3133c10 f4345a;
    public final OI b = new OI("ExoPlayer:RtspMessageChannel:ReceiverLoader");
    public final Map c = Collections.synchronizedMap(new HashMap());
    public C3310e10 d;
    public Socket e;
    public volatile boolean f;

    public C3398f10(O00 o00) {
        this.f4345a = o00;
    }

    public final void a(Socket socket) {
        this.e = socket;
        this.d = new C3310e10(this, socket.getOutputStream());
        this.b.f(new C3222d10(this, socket.getInputStream()), new C3045b10(this), 0);
    }

    public final void b(C3965lY c3965lY) {
        FW.t(this.d);
        C3310e10 c3310e10 = this.d;
        c3310e10.getClass();
        c3310e10.c.post(new RunnableC4746uO(c3310e10, SE.c(AbstractC3486g10.h).b(c3965lY).getBytes(g), c3965lY, 7));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f) {
            return;
        }
        try {
            C3310e10 c3310e10 = this.d;
            if (c3310e10 != null) {
                c3310e10.close();
            }
            this.b.e(null);
            Socket socket = this.e;
            if (socket != null) {
                socket.close();
            }
        } finally {
            this.f = true;
        }
    }
}
