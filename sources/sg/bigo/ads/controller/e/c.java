package sg.bigo.ads.controller.e;

import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c f48089c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Map<String, Long> f48090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f48091b = new AtomicInteger(0);

    private c() {
    }

    public static c a() {
        return f48089c;
    }

    public final void b() {
        Map<String, Long> map = this.f48090a;
        if (map != null) {
            map.clear();
        }
        this.f48091b.set(1);
    }

    public final boolean a(String str) {
        return a(this.f48090a, str);
    }

    public static boolean a(Map<String, Long> map, String str) {
        Long l2;
        return map == null || str == null || (l2 = map.get(str)) == null || SystemClock.elapsedRealtime() - l2.longValue() > TTAdConstant.AD_MAX_EVENT_TIME;
    }
}
