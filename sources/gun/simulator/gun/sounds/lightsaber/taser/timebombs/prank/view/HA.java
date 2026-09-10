package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.net.HttpRequestHeader;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class HA implements InterfaceC4264os {
    public static final List g = Vg0.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List h = Vg0.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KX f3160a;
    public final MX b;
    public final GA c;
    public volatile MA d;
    public final EnumC5106yW e;
    public volatile boolean f;

    public HA(C4838vS c4838vS, KX kx, MX mx, GA ga) {
        AbstractC2995aW.q(kx, "connection");
        this.f3160a = kx;
        this.b = mx;
        this.c = ga;
        EnumC5106yW enumC5106yW = EnumC5106yW.H2_PRIOR_KNOWLEDGE;
        this.e = c4838vS.t.contains(enumC5106yW) ? enumC5106yW : EnumC5106yW.HTTP_2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4264os
    public final void a() {
        MA ma = this.d;
        AbstractC2995aW.n(ma);
        ma.g().close();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4264os
    public final InterfaceC3588h80 b(C5021xZ c5021xZ) {
        MA ma = this.d;
        AbstractC2995aW.n(ma);
        return ma.i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4264os
    public final long c(C5021xZ c5021xZ) {
        if (UA.a(c5021xZ)) {
            return Vg0.j(c5021xZ);
        }
        return 0L;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4264os
    public final void cancel() {
        this.f = true;
        MA ma = this.d;
        if (ma == null) {
            return;
        }
        ma.e(EnumC2502Ir.CANCEL);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4264os
    public final KX d() {
        return this.f3160a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4264os
    public final void e(HY hy) throws IOException {
        int i;
        MA ma;
        if (this.d != null) {
            return;
        }
        boolean z = true;
        boolean z2 = hy.d != null;
        C4447qz c4447qz = hy.c;
        ArrayList arrayList = new ArrayList(c4447qz.size() + 4);
        arrayList.add(new C4183nz(C4183nz.f, hy.b));
        C3971lc c3971lc = C4183nz.g;
        ZA za = hy.f3175a;
        AbstractC2995aW.q(za, "url");
        String strB = za.b();
        String strD = za.d();
        if (strD != null) {
            strB = strB + '?' + ((Object) strD);
        }
        arrayList.add(new C4183nz(c3971lc, strB));
        String strA = hy.c.a(HttpRequestHeader.Host);
        if (strA != null) {
            arrayList.add(new C4183nz(C4183nz.i, strA));
        }
        arrayList.add(new C4183nz(C4183nz.h, za.f4058a));
        int size = c4447qz.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            String strB2 = c4447qz.b(i2);
            Locale locale = Locale.US;
            AbstractC2995aW.p(locale, "US");
            String lowerCase = strB2.toLowerCase(locale);
            AbstractC2995aW.p(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!g.contains(lowerCase) || (AbstractC2995aW.i(lowerCase, "te") && AbstractC2995aW.i(c4447qz.e(i2), "trailers"))) {
                arrayList.add(new C4183nz(lowerCase, c4447qz.e(i2)));
            }
            i2 = i3;
        }
        GA ga = this.c;
        ga.getClass();
        boolean z3 = !z2;
        synchronized (ga.y) {
            synchronized (ga) {
                try {
                    if (ga.f > 1073741823) {
                        ga.h(EnumC2502Ir.REFUSED_STREAM);
                    }
                    if (ga.g) {
                        throw new C3809jj();
                    }
                    i = ga.f;
                    ga.f = i + 2;
                    ma = new MA(i, ga, z3, false, null);
                    if (z2 && ga.v < ga.w && ma.e < ma.f) {
                        z = false;
                    }
                    if (ma.i()) {
                        ga.c.put(Integer.valueOf(i), ma);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ga.y.f(i, arrayList, z3);
        }
        if (z) {
            ga.y.flush();
        }
        this.d = ma;
        if (this.f) {
            MA ma2 = this.d;
            AbstractC2995aW.n(ma2);
            ma2.e(EnumC2502Ir.CANCEL);
            throw new IOException("Canceled");
        }
        MA ma3 = this.d;
        AbstractC2995aW.n(ma3);
        HX hx = ma3.k;
        long j = this.b.g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        hx.g(j, timeUnit);
        MA ma4 = this.d;
        AbstractC2995aW.n(ma4);
        ma4.l.g(this.b.h, timeUnit);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4264os
    public final C4845vZ f(boolean z) throws IOException {
        C4447qz c4447qz;
        MA ma = this.d;
        AbstractC2995aW.n(ma);
        synchronized (ma) {
            ma.k.h();
            while (ma.g.isEmpty() && ma.m == null) {
                try {
                    ma.l();
                } catch (Throwable th) {
                    ma.k.l();
                    throw th;
                }
            }
            ma.k.l();
            if (!(!ma.g.isEmpty())) {
                IOException iOException = ma.n;
                if (iOException != null) {
                    throw iOException;
                }
                EnumC2502Ir enumC2502Ir = ma.m;
                AbstractC2995aW.n(enumC2502Ir);
                throw new L90(enumC2502Ir);
            }
            Object objRemoveFirst = ma.g.removeFirst();
            AbstractC2995aW.p(objRemoveFirst, "headersQueue.removeFirst()");
            c4447qz = (C4447qz) objRemoveFirst;
        }
        EnumC5106yW enumC5106yW = this.e;
        AbstractC2995aW.q(enumC5106yW, "protocol");
        ArrayList arrayList = new ArrayList(20);
        int size = c4447qz.size();
        C90 c90V = null;
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            String strB = c4447qz.b(i);
            String strE = c4447qz.e(i);
            if (AbstractC2995aW.i(strB, ":status")) {
                c90V = C3887ke.v(AbstractC2995aW.v0(strE, "HTTP/1.1 "));
            } else if (!h.contains(strB)) {
                AbstractC2995aW.q(strB, "name");
                AbstractC2995aW.q(strE, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                arrayList.add(strB);
                arrayList.add(AbstractC3089ba0.V0(strE).toString());
            }
            i = i2;
        }
        if (c90V == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        C4845vZ c4845vZ = new C4845vZ();
        c4845vZ.b = enumC5106yW;
        c4845vZ.c = c90V.b;
        String str = c90V.c;
        AbstractC2995aW.q(str, PglCryptUtils.KEY_MESSAGE);
        c4845vZ.d = str;
        Object[] array = arrayList.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        c4845vZ.c(new C4447qz((String[]) array));
        if (z && c4845vZ.c == 100) {
            return null;
        }
        return c4845vZ;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4264os
    public final void g() {
        this.c.flush();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4264os
    public final InterfaceC4463r70 h(HY hy, long j) {
        MA ma = this.d;
        AbstractC2995aW.n(ma);
        return ma.g();
    }
}
