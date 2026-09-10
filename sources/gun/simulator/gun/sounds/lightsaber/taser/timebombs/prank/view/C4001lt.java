package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.lt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4001lt {
    private static final AbstractC3913kt LITE_SCHEMA = new com.google.protobuf.K();
    private static final AbstractC3913kt FULL_SCHEMA = loadSchemaForFullRuntime();

    public static AbstractC3913kt full() {
        AbstractC3913kt abstractC3913kt = FULL_SCHEMA;
        if (abstractC3913kt != null) {
            return abstractC3913kt;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static AbstractC3913kt lite() {
        return LITE_SCHEMA;
    }

    private static AbstractC3913kt loadSchemaForFullRuntime() {
        try {
            return (AbstractC3913kt) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
