package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.net.HttpRequestHeader;
import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Hc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2461Hc implements JD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3177a;

    public C2461Hc(boolean z) {
        this.f3177a = z;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JD
    public final C5021xZ intercept(ID id) throws IOException {
        C4845vZ c4845vZF;
        C5021xZ c5021xZA;
        boolean z;
        MX mx = (MX) id;
        C4813v60 c4813v60 = mx.d;
        AbstractC2995aW.n(c4813v60);
        Object obj = c4813v60.e;
        Object obj2 = c4813v60.c;
        Object obj3 = c4813v60.b;
        HY hy = mx.e;
        NY ny = hy.d;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            ((AbstractC2865Wr) obj2).requestHeadersStart((IX) obj3);
            ((InterfaceC4264os) obj).e(hy);
            ((AbstractC2865Wr) obj2).requestHeadersEnd((IX) obj3, hy);
            boolean zK = WD.K(hy.b);
            boolean z2 = true;
            Object obj4 = c4813v60.f;
            if (!zK || ny == null) {
                ((IX) obj3).h(c4813v60, true, false, null);
                c4845vZF = null;
            } else {
                if (AbstractC3089ba0.o0("100-continue", hy.c.a(HttpRequestHeader.Expect))) {
                    c4813v60.d();
                    c4845vZF = c4813v60.f(true);
                    ((AbstractC2865Wr) obj2).responseHeadersStart((IX) obj3);
                    z = false;
                } else {
                    c4845vZF = null;
                    z = true;
                }
                if (c4845vZF != null) {
                    ((IX) obj3).h(c4813v60, true, false, null);
                    if (((KX) obj4).g == null) {
                        ((InterfaceC4264os) obj).d().l();
                    }
                } else if (ny.isDuplex()) {
                    c4813v60.d();
                    ny.writeTo(AbstractC4496rb.e(c4813v60.c(hy, true)));
                } else {
                    DX dxE = AbstractC4496rb.e(c4813v60.c(hy, false));
                    ny.writeTo(dxE);
                    dxE.close();
                }
                z2 = z;
            }
            if (ny == null || !ny.isDuplex()) {
                try {
                    ((InterfaceC4264os) obj).a();
                } catch (IOException e) {
                    ((AbstractC2865Wr) obj2).requestFailed((IX) obj3, e);
                    c4813v60.h(e);
                    throw e;
                }
            }
            if (c4845vZF == null) {
                c4845vZF = c4813v60.f(false);
                AbstractC2995aW.n(c4845vZF);
                if (z2) {
                    ((AbstractC2865Wr) obj2).responseHeadersStart((IX) obj3);
                    z2 = false;
                }
            }
            c4845vZF.f5136a = hy;
            KX kx = (KX) obj4;
            c4845vZF.e = kx.e;
            c4845vZF.k = jCurrentTimeMillis;
            c4845vZF.l = System.currentTimeMillis();
            C5021xZ c5021xZA2 = c4845vZF.a();
            int i = c5021xZA2.d;
            if (i == 100) {
                C4845vZ c4845vZF2 = c4813v60.f(false);
                AbstractC2995aW.n(c4845vZF2);
                if (z2) {
                    ((AbstractC2865Wr) obj2).responseHeadersStart((IX) obj3);
                }
                c4845vZF2.f5136a = hy;
                c4845vZF2.e = kx.e;
                c4845vZF2.k = jCurrentTimeMillis;
                c4845vZF2.l = System.currentTimeMillis();
                c5021xZA2 = c4845vZF2.a();
                i = c5021xZA2.d;
            }
            AbstractC2865Wr abstractC2865Wr = (AbstractC2865Wr) obj2;
            IX ix = (IX) obj3;
            abstractC2865Wr.responseHeadersEnd(ix, c5021xZA2);
            if (this.f3177a && i == 101) {
                C4845vZ c4845vZM = c5021xZA2.m();
                c4845vZM.g = Vg0.c;
                c5021xZA = c4845vZM.a();
            } else {
                C4845vZ c4845vZM2 = c5021xZA2.m();
                try {
                    String strI = C5021xZ.i(c5021xZA2, "Content-Type");
                    long jC = ((InterfaceC4264os) obj).c(c5021xZA2);
                    c4845vZM2.g = new AZ(strI, jC, AbstractC4496rb.f(new C4176ns(c4813v60, ((InterfaceC4264os) obj).b(c5021xZA2), jC)));
                    c5021xZA = c4845vZM2.a();
                } catch (IOException e2) {
                    abstractC2865Wr.responseFailed(ix, e2);
                    c4813v60.h(e2);
                    throw e2;
                }
            }
            if (AbstractC3089ba0.o0("close", c5021xZA.f5227a.c.a("Connection")) || AbstractC3089ba0.o0("close", C5021xZ.i(c5021xZA, "Connection"))) {
                ((InterfaceC4264os) obj).d().l();
            }
            if (i == 204 || i == 205) {
                CZ cz = c5021xZA.g;
                if ((cz == null ? -1L : cz.contentLength()) > 0) {
                    StringBuilder sbQ = AbstractC5044xl.q("HTTP ", i, " had non-zero Content-Length: ");
                    sbQ.append(cz != null ? Long.valueOf(cz.contentLength()) : null);
                    throw new ProtocolException(sbQ.toString());
                }
            }
            return c5021xZA;
        } catch (IOException e3) {
            ((AbstractC2865Wr) obj2).requestFailed((IX) obj3, e3);
            c4813v60.h(e3);
            throw e3;
        }
    }
}
