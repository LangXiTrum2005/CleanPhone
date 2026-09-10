package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes4.dex */
public final class B4 implements InterfaceC3907ko {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f2852a;

    public B4(String str, int i) {
        if (i != 1) {
            this.f2852a = AbstractC3950lJ.q("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat(str);
        } else {
            this.f2852a = str;
        }
    }

    public static String d(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException unused) {
                "Unable to format ".concat(str2);
                str2 = AbstractC3888ke0.j(str2, " [", TextUtils.join(", ", objArr), "]");
            }
        }
        return DM.i(str, " : ", str2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3907ko
    public boolean a(SSLSocket sSLSocket) {
        return AbstractC3089ba0.N0(sSLSocket.getClass().getName(), AbstractC2995aW.v0(".", this.f2852a), false);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3907ko
    public InterfaceC3236d80 b(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!AbstractC2995aW.i(superclass.getSimpleName(), "OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError(AbstractC2995aW.v0(cls, "No OpenSSLSocketImpl superclass of socket of type "));
            }
        }
        return new C4(superclass);
    }

    public void c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            d(this.f2852a, str, objArr);
        }
    }

    public B4() {
        this.f2852a = "com.google.android.gms.org.conscrypt";
    }

    public B4(String str, Map map) {
        this.f2852a = str;
    }
}
