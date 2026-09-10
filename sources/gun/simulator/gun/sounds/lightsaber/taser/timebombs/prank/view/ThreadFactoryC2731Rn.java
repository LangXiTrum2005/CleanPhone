package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Rn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class ThreadFactoryC2731Rn implements ThreadFactory {
    public static final String b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f3680a = new AtomicInteger(0);

    static {
        byte[] bArr = {-83, -63, 87, -88, -10, 24};
        byte[] bArr2 = {-2, -123, 28, -117, -45, 124, -59, -52};
        int length = bArr.length;
        int length2 = bArr2.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            if (i2 >= length2) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        b = new String(bArr, StandardCharsets.UTF_8);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName(String.format(b, Integer.valueOf(this.f3680a.getAndIncrement())));
        return thread;
    }
}
