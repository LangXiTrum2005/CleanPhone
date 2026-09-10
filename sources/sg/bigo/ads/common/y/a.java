package sg.bigo.ads.common.y;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f47743a = new AtomicInteger();

    public static int a() {
        return f47743a.incrementAndGet();
    }

    public static void a(int i2) {
        f47743a.set(i2);
    }
}
