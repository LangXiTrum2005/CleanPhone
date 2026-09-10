package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public final class XF {
    public static final XF INSTANCE = new XF();

    private XF() {
    }

    public final String getContentStringValue(FF ff, String str) {
        AbstractC2995aW.q(ff, "json");
        AbstractC2995aW.q(str, "key");
        try {
            AbstractC4122nF abstractC4122nF = (AbstractC4122nF) U5.q0(ff, str);
            AbstractC2995aW.q(abstractC4122nF, "<this>");
            IF r3 = abstractC4122nF instanceof IF ? (IF) abstractC4122nF : null;
            if (r3 != null) {
                return r3.a();
            }
            AbstractC4496rb.o("JsonPrimitive", abstractC4122nF);
            throw null;
        } catch (Exception unused) {
            return null;
        }
    }
}
