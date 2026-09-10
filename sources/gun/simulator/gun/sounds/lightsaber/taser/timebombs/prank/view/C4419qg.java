package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.core.app.NotificationCompat;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.qg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4419qg {
    public static final C4331pg Companion = new C4331pg(null);
    private final String status;

    public /* synthetic */ C4419qg(int i, String str, O40 o40) {
        if (1 == (i & 1)) {
            this.status = str;
        } else {
            AbstractC4496rb.B(i, 1, C4243og.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ C4419qg copy$default(C4419qg c4419qg, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4419qg.status;
        }
        return c4419qg.copy(str);
    }

    public static final void write$Self(C4419qg c4419qg, InterfaceC4596sh interfaceC4596sh, D40 d40) {
        AbstractC2995aW.q(c4419qg, "self");
        AbstractC2995aW.q(interfaceC4596sh, "output");
        AbstractC2995aW.q(d40, "serialDesc");
        interfaceC4596sh.o(0, c4419qg.status, d40);
    }

    public final String component1() {
        return this.status;
    }

    public final C4419qg copy(String str) {
        AbstractC2995aW.q(str, NotificationCompat.CATEGORY_STATUS);
        return new C4419qg(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4419qg) && AbstractC2995aW.i(this.status, ((C4419qg) obj).status);
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.status.hashCode();
    }

    public String toString() {
        return DM.l(new StringBuilder("CCPA(status="), this.status, ')');
    }

    public C4419qg(String str) {
        AbstractC2995aW.q(str, NotificationCompat.CATEGORY_STATUS);
        this.status = str;
    }
}
