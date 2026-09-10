package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import java.net.DatagramSocket;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.if0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3715if0 implements InterfaceC4977x00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3628hf0 f4513a;
    public C3715if0 b;

    public C3715if0(long j) {
        this.f4513a = new C3628hf0(AbstractC2995aW.r(j));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4977x00
    public final String a() {
        int iB = b();
        FW.s(iB != -1);
        int i = Ug0.f3833a;
        Locale locale = Locale.US;
        return AbstractC3888ke0.h("RTP/AVP;unicast;client_port=", iB, "-", iB + 1);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4977x00
    public final int b() {
        DatagramSocket datagramSocket = this.f4513a.i;
        int localPort = datagramSocket == null ? -1 : datagramSocket.getLocalPort();
        if (localPort == -1) {
            return -1;
        }
        return localPort;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4429ql
    public final void c(Bd0 bd0) {
        this.f4513a.c(bd0);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4429ql
    public final void close() {
        this.f4513a.close();
        C3715if0 c3715if0 = this.b;
        if (c3715if0 != null) {
            c3715if0.close();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4429ql
    public final long d(C4868vl c4868vl) {
        this.f4513a.d(c4868vl);
        return -1L;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4977x00
    public final Cd0 e() {
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4429ql
    public final Map getResponseHeaders() {
        return Collections.emptyMap();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4429ql
    public final Uri getUri() {
        return this.f4513a.h;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3813jl
    public final int read(byte[] bArr, int i, int i2) throws C3540gf0 {
        try {
            return this.f4513a.read(bArr, i, i2);
        } catch (C3540gf0 e) {
            if (e.f4995a == 2002) {
                return -1;
            }
            throw e;
        }
    }
}
