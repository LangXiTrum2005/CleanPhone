package sg.bigo.ads.common.p;

import android.content.Context;
import android.util.LruCache;
import java.util.concurrent.atomic.AtomicInteger;
import sg.bigo.ads.common.utils.p;

/* JADX INFO: loaded from: classes7.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final AtomicInteger f47413a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final LruCache<String, sg.bigo.ads.common.c> f47414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final LruCache<String, sg.bigo.ads.common.c> f47415c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final c f47418a = new c(0);
    }

    private c() {
        AtomicInteger atomicInteger = f47413a;
        this.f47414b = new LruCache<String, sg.bigo.ads.common.c>(atomicInteger.get()) { // from class: sg.bigo.ads.common.p.c.1
            @Override // android.util.LruCache
            public final /* synthetic */ int sizeOf(String str, sg.bigo.ads.common.c cVar) {
                return cVar.f47116a.getByteCount();
            }
        };
        this.f47415c = new LruCache<String, sg.bigo.ads.common.c>(atomicInteger.get()) { // from class: sg.bigo.ads.common.p.c.2
            @Override // android.util.LruCache
            public final /* synthetic */ int sizeOf(String str, sg.bigo.ads.common.c cVar) {
                return cVar.f47116a.getByteCount();
            }
        };
    }

    public static c a(Context context) {
        AtomicInteger atomicInteger = f47413a;
        if (atomicInteger.get() == 0) {
            atomicInteger.set(p.c(context));
            sg.bigo.ads.common.t.a.a(0, 3, "BitmapCacheManager", "Total cache size: " + atomicInteger.get());
        }
        return a.f47418a;
    }

    public /* synthetic */ c(byte b2) {
        this();
    }
}
