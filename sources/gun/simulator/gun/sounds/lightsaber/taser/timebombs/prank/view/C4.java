package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes4.dex */
public class C4 implements InterfaceC3236d80 {
    public static final B4 f = new B4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f2905a;
    public final Method b;
    public final Method c;
    public final Method d;
    public final Method e;

    public C4(Class cls) throws NoSuchMethodException {
        this.f2905a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        AbstractC2995aW.p(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.b = declaredMethod;
        this.c = cls.getMethod("setHostname", String.class);
        this.d = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3236d80
    public final boolean a(SSLSocket sSLSocket) {
        return this.f2905a.isInstance(sSLSocket);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3236d80
    public final String b(SSLSocket sSLSocket) {
        if (!this.f2905a.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.d.invoke(sSLSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            return new String(bArr, AbstractC2307Be.f2881a);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if ((cause instanceof NullPointerException) && AbstractC2995aW.i(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e2);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3236d80
    public final void c(SSLSocket sSLSocket, String str, List list) {
        AbstractC2995aW.q(list, "protocols");
        if (this.f2905a.isInstance(sSLSocket)) {
            try {
                this.b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.c.invoke(sSLSocket, str);
                }
                Method method = this.e;
                C5104yU c5104yU = C5104yU.f5278a;
                method.invoke(sSLSocket, C3887ke.k(list));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3236d80
    public final boolean isSupported() {
        return C5072y4.e.n();
    }
}
