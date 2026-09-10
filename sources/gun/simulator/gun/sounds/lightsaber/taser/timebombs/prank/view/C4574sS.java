package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.core.app.NotificationCompat;
import java.io.IOException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.sS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4574sS implements InterfaceC2539Kc {
    final /* synthetic */ InterfaceC2565Lc $callback;
    final /* synthetic */ C4662tS this$0;

    public C4574sS(C4662tS c4662tS, InterfaceC2565Lc interfaceC2565Lc) {
        this.this$0 = c4662tS;
        this.$callback = interfaceC2565Lc;
    }

    private final void callFailure(Throwable th) throws Throwable {
        try {
            this.$callback.onFailure(this.this$0, th);
        } catch (Throwable th2) {
            C4662tS.Companion.throwIfFatal(th2);
            C4917wJ.Companion.e("OkHttpCall", "Cannot pass failure to callback", th2);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2539Kc
    public void onFailure(InterfaceC2409Fc interfaceC2409Fc, IOException iOException) throws Throwable {
        AbstractC2995aW.q(interfaceC2409Fc, NotificationCompat.CATEGORY_CALL);
        AbstractC2995aW.q(iOException, "e");
        callFailure(iOException);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2539Kc
    public void onResponse(InterfaceC2409Fc interfaceC2409Fc, C5021xZ c5021xZ) throws Throwable {
        AbstractC2995aW.q(interfaceC2409Fc, NotificationCompat.CATEGORY_CALL);
        AbstractC2995aW.q(c5021xZ, "response");
        try {
            try {
                this.$callback.onResponse(this.this$0, this.this$0.parseResponse(c5021xZ));
            } catch (Throwable th) {
                C4662tS.Companion.throwIfFatal(th);
                C4917wJ.Companion.e("OkHttpCall", "Cannot pass response to callback", th);
            }
        } catch (Throwable th2) {
            C4662tS.Companion.throwIfFatal(th2);
            callFailure(th2);
        }
    }
}
