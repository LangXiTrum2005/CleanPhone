package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.nf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4154nf0 {
    public static final C4066mf0 Companion = new C4066mf0(null);
    private final String eventId;
    private String sessionId;

    public /* synthetic */ C4154nf0(int i, String str, String str2, O40 o40) {
        if (1 != (i & 1)) {
            AbstractC4496rb.B(i, 1, C3978lf0.INSTANCE.getDescriptor());
            throw null;
        }
        this.eventId = str;
        if ((i & 2) == 0) {
            this.sessionId = "";
        } else {
            this.sessionId = str2;
        }
    }

    public static /* synthetic */ C4154nf0 copy$default(C4154nf0 c4154nf0, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4154nf0.eventId;
        }
        if ((i & 2) != 0) {
            str2 = c4154nf0.sessionId;
        }
        return c4154nf0.copy(str, str2);
    }

    public static final void write$Self(C4154nf0 c4154nf0, InterfaceC4596sh interfaceC4596sh, D40 d40) {
        AbstractC2995aW.q(c4154nf0, "self");
        AbstractC2995aW.q(interfaceC4596sh, "output");
        AbstractC2995aW.q(d40, "serialDesc");
        interfaceC4596sh.o(0, c4154nf0.eventId, d40);
        if (!interfaceC4596sh.j(d40) && AbstractC2995aW.i(c4154nf0.sessionId, "")) {
            return;
        }
        interfaceC4596sh.o(1, c4154nf0.sessionId, d40);
    }

    public final String component1() {
        return this.eventId;
    }

    public final String component2() {
        return this.sessionId;
    }

    public final C4154nf0 copy(String str, String str2) {
        AbstractC2995aW.q(str, "eventId");
        AbstractC2995aW.q(str2, JsonStorageKeyNames.SESSION_ID_KEY);
        return new C4154nf0(str, str2);
    }

    public boolean equals(Object obj) {
        if (obj == null || !AbstractC2995aW.i(C4154nf0.class, obj.getClass())) {
            return false;
        }
        C4154nf0 c4154nf0 = (C4154nf0) obj;
        return AbstractC2995aW.i(this.eventId, c4154nf0.eventId) && AbstractC2995aW.i(this.sessionId, c4154nf0.sessionId);
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return this.sessionId.hashCode() + (this.eventId.hashCode() * 31);
    }

    public final void setSessionId(String str) {
        AbstractC2995aW.q(str, "<set-?>");
        this.sessionId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UnclosedAd(eventId=");
        sb.append(this.eventId);
        sb.append(", sessionId=");
        return DM.l(sb, this.sessionId, ')');
    }

    public C4154nf0(String str, String str2) {
        AbstractC2995aW.q(str, "eventId");
        AbstractC2995aW.q(str2, JsonStorageKeyNames.SESSION_ID_KEY);
        this.eventId = str;
        this.sessionId = str2;
    }

    public /* synthetic */ C4154nf0(String str, String str2, int i, AbstractC2471Hm abstractC2471Hm) {
        this(str, (i & 2) != 0 ? "" : str2);
    }

    public static /* synthetic */ void getEventId$annotations() {
    }

    public static /* synthetic */ void getSessionId$annotations() {
    }
}
