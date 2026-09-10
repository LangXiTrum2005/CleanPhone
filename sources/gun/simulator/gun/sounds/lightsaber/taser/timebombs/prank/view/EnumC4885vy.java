package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.core.view.GravityCompat;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.vy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC4885vy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC4885vy f5163a;
    public static final EnumC4885vy b;
    public static final EnumC4885vy c;
    public static final /* synthetic */ EnumC4885vy[] d;

    static {
        EnumC4885vy enumC4885vy = new EnumC4885vy("START", 0);
        f5163a = enumC4885vy;
        EnumC4885vy enumC4885vy2 = new EnumC4885vy("CENTER", 1);
        b = enumC4885vy2;
        EnumC4885vy enumC4885vy3 = new EnumC4885vy("END", 2);
        c = enumC4885vy3;
        d = new EnumC4885vy[]{enumC4885vy, enumC4885vy2, enumC4885vy3};
    }

    public static EnumC4885vy valueOf(String str) {
        return (EnumC4885vy) Enum.valueOf(EnumC4885vy.class, str);
    }

    public static EnumC4885vy[] values() {
        return (EnumC4885vy[]) d.clone();
    }

    public final int a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return GravityCompat.START;
        }
        if (iOrdinal == 1) {
            return 1;
        }
        if (iOrdinal == 2) {
            return GravityCompat.END;
        }
        throw new IllegalStateException("Invalid gravity constant");
    }
}
