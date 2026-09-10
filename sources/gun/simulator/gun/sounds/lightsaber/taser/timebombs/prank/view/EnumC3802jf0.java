package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.jf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC3802jf0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC3802jf0 f4563a;
    public static final Handler b;
    public static final /* synthetic */ EnumC3802jf0[] c;

    static {
        EnumC3802jf0 enumC3802jf0 = new EnumC3802jf0("INSTANCE", 0);
        f4563a = enumC3802jf0;
        c = new EnumC3802jf0[]{enumC3802jf0};
        b = new Handler(Looper.getMainLooper());
    }

    public static EnumC3802jf0 valueOf(String str) {
        return (EnumC3802jf0) Enum.valueOf(EnumC3802jf0.class, str);
    }

    public static EnumC3802jf0[] values() {
        return (EnumC3802jf0[]) c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b.post(runnable);
    }
}
