package sg.bigo.ads.common.form;

import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.common.j;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final b f47166c = new b();
    private static final Map<Integer, Map<String, Object>> d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f47167a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f47168b;

    public interface a {
        void a(int i2);

        void a(Map<String, Object> map);
    }

    private b() {
    }

    public static Map<String, Object> a(int i2) {
        Map<Integer, Map<String, Object>> map = d;
        if (map.containsKey(Integer.valueOf(i2))) {
            return map.get(Integer.valueOf(i2));
        }
        return null;
    }

    public static void b(int i2) {
        d.remove(Integer.valueOf(i2));
    }

    public static b a() {
        return f47166c;
    }

    public static void a(int i2, Map<String, Object> map) {
        d.put(Integer.valueOf(i2), map);
    }

    public final void a(final Map<String, Object> map, final a aVar, final int i2) {
        if (this.f47168b == null || map == null) {
            return;
        }
        sg.bigo.ads.core.d.b.b(1, i2, "");
        this.f47168b.a(map, new j.a() { // from class: sg.bigo.ads.common.form.b.1
            @Override // sg.bigo.ads.common.j.a
            public final void a() {
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a(i2);
                }
                sg.bigo.ads.core.d.b.b(2, i2, "");
            }

            @Override // sg.bigo.ads.common.j.a
            public final void a(int i3, int i4, String str) {
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a(map);
                }
                int i5 = i2;
                Locale locale = Locale.ENGLISH;
                StringBuilder sbP = androidx.datastore.preferences.protobuf.a.p(i3, i4, "code: ", ", subcode: ", ", error msg: ");
                sbP.append(str);
                sg.bigo.ads.core.d.b.b(3, i5, sbP.toString());
            }
        });
    }
}
