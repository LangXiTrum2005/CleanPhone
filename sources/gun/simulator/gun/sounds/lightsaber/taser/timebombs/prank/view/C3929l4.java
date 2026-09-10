package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.l4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3929l4 {
    private static boolean ASSUME_ANDROID;
    private static final boolean IS_ROBOLECTRIC;
    private static final Class<?> MEMORY_CLASS = getClassForName("libcore.io.Memory");

    static {
        IS_ROBOLECTRIC = (ASSUME_ANDROID || getClassForName("org.robolectric.Robolectric") == null) ? false : true;
    }

    private C3929l4() {
    }

    private static <T> Class<T> getClassForName(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class<?> getMemoryClass() {
        return MEMORY_CLASS;
    }

    public static boolean isOnAndroidDevice() {
        return ASSUME_ANDROID || !(MEMORY_CLASS == null || IS_ROBOLECTRIC);
    }
}
