package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.r50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4459r50 {
    public static final C4372q50 Companion = new C4372q50(null);
    private final int sessionCount;
    private long sessionCreationTime;
    private int sessionDepthCounter;
    private long sessionDuration;
    private final String sessionId;
    private List<O60> signaledAd;
    private List<C4154nf0> unclosedAd;

    public /* synthetic */ C4459r50(int i, int i2, String str, long j, List list, long j2, int i3, List list2, O40 o40) {
        if (1 != (i & 1)) {
            AbstractC4496rb.B(i, 1, C4284p50.INSTANCE.getDescriptor());
            throw null;
        }
        this.sessionCount = i2;
        if ((i & 2) == 0) {
            this.sessionId = AbstractC5044xl.f("randomUUID().toString()");
        } else {
            this.sessionId = str;
        }
        if ((i & 4) == 0) {
            this.sessionCreationTime = System.currentTimeMillis() / 1000;
        } else {
            this.sessionCreationTime = j;
        }
        if ((i & 8) == 0) {
            this.signaledAd = new ArrayList();
        } else {
            this.signaledAd = list;
        }
        if ((i & 16) == 0) {
            this.sessionDuration = 0L;
        } else {
            this.sessionDuration = j2;
        }
        if ((i & 32) == 0) {
            this.sessionDepthCounter = 0;
        } else {
            this.sessionDepthCounter = i3;
        }
        if ((i & 64) == 0) {
            this.unclosedAd = new ArrayList();
        } else {
            this.unclosedAd = list2;
        }
    }

    public static /* synthetic */ C4459r50 copy$default(C4459r50 c4459r50, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = c4459r50.sessionCount;
        }
        return c4459r50.copy(i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0031  */
    public static final void write$Self(C4459r50 c4459r50, InterfaceC4596sh interfaceC4596sh, D40 d40) {
        AbstractC2995aW.q(c4459r50, "self");
        AbstractC2995aW.q(interfaceC4596sh, "output");
        AbstractC2995aW.q(d40, "serialDesc");
        interfaceC4596sh.g(0, c4459r50.sessionCount, d40);
        if (interfaceC4596sh.j(d40)) {
            interfaceC4596sh.o(1, c4459r50.sessionId, d40);
        } else {
            String str = c4459r50.sessionId;
            String string = UUID.randomUUID().toString();
            AbstractC2995aW.p(string, "randomUUID().toString()");
            if (!AbstractC2995aW.i(str, string)) {
                interfaceC4596sh.o(1, c4459r50.sessionId, d40);
            }
        }
        if (interfaceC4596sh.j(d40) || c4459r50.sessionCreationTime != System.currentTimeMillis() / 1000) {
            interfaceC4596sh.l(d40, 2, c4459r50.sessionCreationTime);
        }
        if (interfaceC4596sh.j(d40) || !AbstractC2995aW.i(c4459r50.signaledAd, new ArrayList())) {
            interfaceC4596sh.B(d40, 3, new T5(M60.INSTANCE, 0), c4459r50.signaledAd);
        }
        if (interfaceC4596sh.j(d40) || c4459r50.sessionDuration != 0) {
            interfaceC4596sh.l(d40, 4, c4459r50.sessionDuration);
        }
        if (interfaceC4596sh.j(d40) || c4459r50.sessionDepthCounter != 0) {
            interfaceC4596sh.g(5, c4459r50.sessionDepthCounter, d40);
        }
        if (!interfaceC4596sh.j(d40) && AbstractC2995aW.i(c4459r50.unclosedAd, new ArrayList())) {
            return;
        }
        interfaceC4596sh.B(d40, 6, new T5(C3978lf0.INSTANCE, 0), c4459r50.unclosedAd);
    }

    public final int component1() {
        return this.sessionCount;
    }

    public final C4459r50 copy(int i) {
        return new C4459r50(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4459r50) && this.sessionCount == ((C4459r50) obj).sessionCount;
    }

    public final int getSessionCount() {
        return this.sessionCount;
    }

    public final long getSessionCreationTime() {
        return this.sessionCreationTime;
    }

    public final int getSessionDepthCounter() {
        return this.sessionDepthCounter;
    }

    public final long getSessionDuration() {
        return this.sessionDuration;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final List<O60> getSignaledAd() {
        return this.signaledAd;
    }

    public final List<C4154nf0> getUnclosedAd() {
        return this.unclosedAd;
    }

    public int hashCode() {
        return this.sessionCount;
    }

    public final void setSessionCreationTime(long j) {
        this.sessionCreationTime = j;
    }

    public final void setSessionDepthCounter(int i) {
        this.sessionDepthCounter = i;
    }

    public final void setSessionDuration(long j) {
        this.sessionDuration = j;
    }

    public final void setSignaledAd(List<O60> list) {
        AbstractC2995aW.q(list, "<set-?>");
        this.signaledAd = list;
    }

    public final void setUnclosedAd(List<C4154nf0> list) {
        AbstractC2995aW.q(list, "<set-?>");
        this.unclosedAd = list;
    }

    public String toString() {
        return DM.k(new StringBuilder("SessionData(sessionCount="), this.sessionCount, ')');
    }

    public C4459r50(int i) {
        this.sessionCount = i;
        this.sessionId = AbstractC5044xl.f("randomUUID().toString()");
        this.sessionCreationTime = System.currentTimeMillis() / 1000;
        this.signaledAd = new ArrayList();
        this.unclosedAd = new ArrayList();
    }

    public static /* synthetic */ void getSessionCount$annotations() {
    }

    public static /* synthetic */ void getSessionCreationTime$annotations() {
    }

    public static /* synthetic */ void getSessionDepthCounter$annotations() {
    }

    public static /* synthetic */ void getSessionDuration$annotations() {
    }

    public static /* synthetic */ void getSessionId$annotations() {
    }

    public static /* synthetic */ void getSignaledAd$annotations() {
    }

    public static /* synthetic */ void getUnclosedAd$annotations() {
    }
}
