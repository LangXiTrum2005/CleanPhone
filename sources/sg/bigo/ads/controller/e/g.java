package sg.bigo.ads.controller.e;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final g f48124b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map<String, a> f48125a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f48126c = false;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicInteger f48127a = new AtomicInteger(0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicInteger f48128b = new AtomicInteger(0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicInteger f48129c = new AtomicInteger(0);

        public a() {
        }
    }

    public final a a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = AbstractJsonLexerKt.NULL;
        }
        a aVar = this.f48125a.get(str);
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a();
        this.f48125a.put(str, aVar2);
        return aVar2;
    }

    public static g a() {
        return f48124b;
    }

    public final void a(boolean z2) {
        this.f48126c = z2;
        if (z2) {
            Iterator<Map.Entry<String, a>> it = this.f48125a.entrySet().iterator();
            while (it.hasNext()) {
                a value = it.next().getValue();
                if (value != null) {
                    value.f48129c.set(0);
                }
            }
        }
    }
}
