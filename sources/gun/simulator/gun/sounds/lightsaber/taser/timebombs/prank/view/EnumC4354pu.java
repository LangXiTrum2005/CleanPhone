package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.pu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC4354pu implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC4354pu f4856a;
    public static final /* synthetic */ EnumC4354pu[] b;

    static {
        EnumC4354pu enumC4354pu = new EnumC4354pu("INSTANCE", 0);
        f4856a = enumC4354pu;
        b = new EnumC4354pu[]{enumC4354pu};
    }

    public static EnumC4354pu valueOf(String str) {
        return (EnumC4354pu) Enum.valueOf(EnumC4354pu.class, str);
    }

    public static EnumC4354pu[] values() {
        return (EnumC4354pu[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
