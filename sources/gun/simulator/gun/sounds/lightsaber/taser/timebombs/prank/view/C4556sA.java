package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.net.HttpResponseHeader;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.sA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4556sA implements InterfaceC4264os {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4838vS f4966a;
    public final KX b;
    public final InterfaceC2460Hb c;
    public final InterfaceC2434Gb d;
    public int e;
    public final C4622sz f;
    public C4447qz g;

    public C4556sA(C4838vS c4838vS, KX kx, InterfaceC2460Hb interfaceC2460Hb, InterfaceC2434Gb interfaceC2434Gb) {
        AbstractC2995aW.q(kx, "connection");
        this.f4966a = c4838vS;
        this.b = kx;
        this.c = interfaceC2460Hb;
        this.d = interfaceC2434Gb;
        this.f = new C4622sz(interfaceC2460Hb);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4264os
    public final void a() {
        this.d.flush();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4264os
    public final InterfaceC3588h80 b(C5021xZ c5021xZ) {
        if (!UA.a(c5021xZ)) {
            return i(0L);
        }
        if (AbstractC3089ba0.o0("chunked", C5021xZ.i(c5021xZ, HttpResponseHeader.TransferEncoding))) {
            ZA za = c5021xZ.f5227a.f3175a;
            int i = this.e;
            if (i != 4) {
                throw new IllegalStateException(AbstractC2995aW.v0(Integer.valueOf(i), "state: ").toString());
            }
            this.e = 5;
            return new C4205oA(this, za);
        }
        long j = Vg0.j(c5021xZ);
        if (j != -1) {
            return i(j);
        }
        int i2 = this.e;
        if (i2 != 4) {
            throw new IllegalStateException(AbstractC2995aW.v0(Integer.valueOf(i2), "state: ").toString());
        }
        this.e = 5;
        this.b.l();
        return new C4468rA(this);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4264os
    public final long c(C5021xZ c5021xZ) {
        if (!UA.a(c5021xZ)) {
            return 0L;
        }
        if (AbstractC3089ba0.o0("chunked", C5021xZ.i(c5021xZ, HttpResponseHeader.TransferEncoding))) {
            return -1L;
        }
        return Vg0.j(c5021xZ);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4264os
    public final void cancel() {
        Socket socket = this.b.c;
        if (socket == null) {
            return;
        }
        Vg0.d(socket);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4264os
    public final KX d() {
        return this.b;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4264os
    public final void e(HY hy) {
        Proxy.Type type = this.b.b.b.type();
        AbstractC2995aW.p(type, "connection.route().proxy.type()");
        StringBuilder sb = new StringBuilder();
        sb.append(hy.b);
        sb.append(' ');
        ZA za = hy.f3175a;
        if (za.j || type != Proxy.Type.HTTP) {
            String strB = za.b();
            String strD = za.d();
            if (strD != null) {
                strB = strB + '?' + ((Object) strD);
            }
            sb.append(strB);
        } else {
            sb.append(za);
        }
        sb.append(" HTTP/1.1");
        String string = sb.toString();
        AbstractC2995aW.p(string, "StringBuilder().apply(builderAction).toString()");
        j(hy.c, string);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4264os
    public final C4845vZ f(boolean z) {
        C4622sz c4622sz = this.f;
        int i = this.e;
        if (i != 1 && i != 3) {
            throw new IllegalStateException(AbstractC2995aW.v0(Integer.valueOf(i), "state: ").toString());
        }
        try {
            String strJ = c4622sz.f5007a.j(c4622sz.b);
            c4622sz.b -= (long) strJ.length();
            C90 c90V = C3887ke.v(strJ);
            int i2 = c90V.b;
            C4845vZ c4845vZ = new C4845vZ();
            EnumC5106yW enumC5106yW = c90V.f2913a;
            AbstractC2995aW.q(enumC5106yW, "protocol");
            c4845vZ.b = enumC5106yW;
            c4845vZ.c = i2;
            String str = c90V.c;
            AbstractC2995aW.q(str, PglCryptUtils.KEY_MESSAGE);
            c4845vZ.d = str;
            C5036xh c5036xh = new C5036xh();
            while (true) {
                String strJ2 = c4622sz.f5007a.j(c4622sz.b);
                c4622sz.b -= (long) strJ2.length();
                if (strJ2.length() == 0) {
                    break;
                }
                c5036xh.b(strJ2);
            }
            c4845vZ.c(c5036xh.e());
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.e = 3;
                return c4845vZ;
            }
            this.e = 4;
            return c4845vZ;
        } catch (EOFException e) {
            throw new IOException(AbstractC2995aW.v0(this.b.b.f4578a.i.g(), "unexpected end of stream on "), e);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4264os
    public final void g() {
        this.d.flush();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4264os
    public final InterfaceC4463r70 h(HY hy, long j) throws ProtocolException {
        NY ny = hy.d;
        if (ny != null && ny.isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (AbstractC3089ba0.o0("chunked", hy.c.a(HttpResponseHeader.TransferEncoding))) {
            int i = this.e;
            if (i != 1) {
                throw new IllegalStateException(AbstractC2995aW.v0(Integer.valueOf(i), "state: ").toString());
            }
            this.e = 2;
            return new C4117nA(this);
        }
        if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        int i2 = this.e;
        if (i2 != 1) {
            throw new IllegalStateException(AbstractC2995aW.v0(Integer.valueOf(i2), "state: ").toString());
        }
        this.e = 2;
        return new C4381qA(this);
    }

    public final C4293pA i(long j) {
        int i = this.e;
        if (i != 4) {
            throw new IllegalStateException(AbstractC2995aW.v0(Integer.valueOf(i), "state: ").toString());
        }
        this.e = 5;
        return new C4293pA(this, j);
    }

    public final void j(C4447qz c4447qz, String str) {
        AbstractC2995aW.q(c4447qz, "headers");
        AbstractC2995aW.q(str, "requestLine");
        int i = this.e;
        if (i != 0) {
            throw new IllegalStateException(AbstractC2995aW.v0(Integer.valueOf(i), "state: ").toString());
        }
        InterfaceC2434Gb interfaceC2434Gb = this.d;
        interfaceC2434Gb.A(str).A("\r\n");
        int size = c4447qz.size();
        for (int i2 = 0; i2 < size; i2++) {
            interfaceC2434Gb.A(c4447qz.b(i2)).A(": ").A(c4447qz.e(i2)).A("\r\n");
        }
        interfaceC2434Gb.A("\r\n");
        this.e = 1;
    }
}
