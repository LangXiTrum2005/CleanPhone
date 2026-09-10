package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes3.dex */
public final class FR {
    private static final DR FULL_SCHEMA = loadSchemaForFullRuntime();
    private static final DR LITE_SCHEMA = new ER();

    public static DR full() {
        return FULL_SCHEMA;
    }

    public static DR lite() {
        return LITE_SCHEMA;
    }

    private static DR loadSchemaForFullRuntime() {
        try {
            return (DR) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
