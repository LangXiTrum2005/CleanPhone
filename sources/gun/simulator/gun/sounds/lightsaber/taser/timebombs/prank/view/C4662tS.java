package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.tS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4662tS implements InterfaceC2435Gc {
    public static final C4223oS Companion = new C4223oS(null);
    private static final String TAG = "OkHttpCall";
    private volatile boolean canceled;
    private final InterfaceC2409Fc rawCall;
    private final InterfaceC2935Zj responseConverter;

    public C4662tS(InterfaceC2409Fc interfaceC2409Fc, InterfaceC2935Zj interfaceC2935Zj) {
        AbstractC2995aW.q(interfaceC2409Fc, "rawCall");
        AbstractC2995aW.q(interfaceC2935Zj, "responseConverter");
        this.rawCall = interfaceC2409Fc;
        this.responseConverter = interfaceC2935Zj;
    }

    private final CZ buffer(CZ cz) throws IOException {
        C4848vb c4848vb = new C4848vb();
        cz.source().H(c4848vb);
        BZ bz = CZ.Companion;
        RO roContentType = cz.contentType();
        long jContentLength = cz.contentLength();
        bz.getClass();
        return BZ.a(c4848vb, roContentType, jContentLength);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2435Gc
    public void cancel() {
        InterfaceC2409Fc interfaceC2409Fc;
        this.canceled = true;
        synchronized (this) {
            interfaceC2409Fc = this.rawCall;
        }
        ((IX) interfaceC2409Fc).cancel();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2435Gc
    public void enqueue(InterfaceC2565Lc interfaceC2565Lc) {
        InterfaceC2409Fc interfaceC2409Fc;
        AbstractC2995aW.q(interfaceC2565Lc, "callback");
        synchronized (this) {
            interfaceC2409Fc = this.rawCall;
        }
        if (this.canceled) {
            ((IX) interfaceC2409Fc).cancel();
        }
        ((IX) interfaceC2409Fc).d(new C4574sS(this, interfaceC2565Lc));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2435Gc
    public C5109yZ execute() throws IOException {
        InterfaceC2409Fc interfaceC2409Fc;
        synchronized (this) {
            interfaceC2409Fc = this.rawCall;
        }
        if (this.canceled) {
            ((IX) interfaceC2409Fc).cancel();
        }
        return parseResponse(((IX) interfaceC2409Fc).e());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2435Gc
    public boolean isCanceled() {
        boolean z;
        if (this.canceled) {
            return true;
        }
        synchronized (this) {
            z = ((IX) this.rawCall).p;
        }
        return z;
    }

    public final C5109yZ parseResponse(C5021xZ c5021xZ) throws IllegalAccessException, IOException, InvocationTargetException {
        AbstractC2995aW.q(c5021xZ, "rawResp");
        CZ cz = c5021xZ.g;
        if (cz == null) {
            return null;
        }
        C4845vZ c4845vZM = c5021xZ.m();
        c4845vZM.g = new C4486rS(cz.contentType(), cz.contentLength());
        C5021xZ c5021xZA = c4845vZM.a();
        int i = c5021xZA.d;
        if (i < 200 || i >= 300) {
            try {
                C5109yZ c5109yZError = C5109yZ.Companion.error(buffer(cz), c5021xZA);
                AbstractC3375el.n(cz, null);
                return c5109yZError;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3375el.n(cz, th);
                    throw th2;
                }
            }
        }
        if (i == 204 || i == 205) {
            cz.close();
            return C5109yZ.Companion.success(null, c5021xZA);
        }
        C4399qS c4399qS = new C4399qS(cz);
        try {
            return C5109yZ.Companion.success(this.responseConverter.convert(c4399qS), c5021xZA);
        } catch (RuntimeException e) {
            c4399qS.throwIfCaught();
            throw e;
        }
    }
}
