package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.NotificationChannel;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import dalvik.system.InMemoryDexClassLoader;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ig, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC3716ig {
    public static /* bridge */ /* synthetic */ boolean A(Drawable drawable) {
        return drawable instanceof AdaptiveIconDrawable;
    }

    public static /* synthetic */ NotificationChannel d(String str) {
        return new NotificationChannel("com.google.android.gms.availability", str, 4);
    }

    public static /* synthetic */ InMemoryDexClassLoader l(ByteBuffer byteBuffer, ClassLoader classLoader) {
        return new InMemoryDexClassLoader(byteBuffer, classLoader);
    }

    public static /* synthetic */ void p() {
    }
}
