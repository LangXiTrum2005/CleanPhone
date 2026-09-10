package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.annotation.RecentlyNonNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Aj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC2286Aj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC2286Aj f2830a;
    public static final EnumC2286Aj b;
    public static final EnumC2286Aj c;
    public static final /* synthetic */ EnumC2286Aj[] d;

    static {
        EnumC2286Aj enumC2286Aj = new EnumC2286Aj("UNKNOWN", 0);
        f2830a = enumC2286Aj;
        EnumC2286Aj enumC2286Aj2 = new EnumC2286Aj("NOT_REQUIRED", 1);
        b = enumC2286Aj2;
        EnumC2286Aj enumC2286Aj3 = new EnumC2286Aj("REQUIRED", 2);
        c = enumC2286Aj3;
        d = new EnumC2286Aj[]{enumC2286Aj, enumC2286Aj2, enumC2286Aj3};
    }

    @RecentlyNonNull
    public static EnumC2286Aj valueOf(@RecentlyNonNull String str) {
        return (EnumC2286Aj) Enum.valueOf(EnumC2286Aj.class, str);
    }

    @RecentlyNonNull
    public static EnumC2286Aj[] values() {
        return (EnumC2286Aj[]) d.clone();
    }
}
