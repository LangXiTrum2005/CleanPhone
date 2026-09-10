package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.iM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3691iM {
    private static final InterfaceC3515gM FULL_SCHEMA = loadSchemaForFullRuntime();
    private static final InterfaceC3515gM LITE_SCHEMA = new C3603hM();

    public static InterfaceC3515gM full() {
        return FULL_SCHEMA;
    }

    public static InterfaceC3515gM lite() {
        return LITE_SCHEMA;
    }

    private static InterfaceC3515gM loadSchemaForFullRuntime() {
        try {
            return (InterfaceC3515gM) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
