package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes2.dex */
public final class JN implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f3264a;
    public final /* synthetic */ KN b;

    public JN(KN kn, InterfaceC4306pN interfaceC4306pN) {
        this.b = kn;
        Handler handlerM = Ug0.m(this);
        this.f3264a = handlerM;
        interfaceC4306pN.d(this, handlerM);
    }

    public final void a(long j) {
        KN kn = this.b;
        if (this != kn.H1 || kn.G == null) {
            return;
        }
        if (j == Long.MAX_VALUE) {
            kn.v0 = true;
            return;
        }
        try {
            kn.m0(j);
            kn.v0();
            kn.x0.e++;
            kn.u0();
            kn.V(j);
        } catch (C2321Bs e) {
            kn.w0 = e;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i = message.arg1;
        int i2 = message.arg2;
        int i3 = Ug0.f3833a;
        a(((((long) i) & 4294967295L) << 32) | (4294967295L & ((long) i2)));
        return true;
    }
}
