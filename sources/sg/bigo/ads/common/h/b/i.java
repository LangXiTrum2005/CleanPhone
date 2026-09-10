package sg.bigo.ads.common.h.b;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, a> f47296a = new HashMap();

    public static void a() {
        f47296a.clear();
    }

    public static Collection<a> b() {
        return f47296a.values();
    }

    public static a c(String str) {
        if (f47296a.containsKey(str)) {
            return f47296a.get(str);
        }
        return null;
    }

    public static void a(String str) {
        a aVarC = c(str);
        if (aVarC == null) {
            sg.bigo.ads.common.t.a.a(0, "TaskManager", "you add " + str + " to TaskQueue ?");
            return;
        }
        int i2 = aVarC.f47282e;
        if (i2 == h.d || i2 == h.f) {
            sg.bigo.ads.common.t.a.a(0, 3, "TaskManager", "start downloadBean = ".concat(String.valueOf(aVarC)));
            return;
        }
        aVarC.f47282e = h.f47292b;
        f.a().a(aVarC.f47279a);
        g.f47290a.execute(aVarC.f47281c);
    }

    public static void b(String str) {
        a aVarC = c(str);
        if (aVarC != null) {
            a(aVarC);
        } else {
            sg.bigo.ads.common.t.a.a(0, "TaskManager", "you add " + str + " to TaskQueue ?");
        }
        if (f47296a.containsKey(str)) {
            f47296a.remove(str);
        }
    }

    public static void a(a aVar) {
        aVar.f = "It's remove !!!";
        if (aVar.f47282e != h.f) {
            aVar.f47282e = h.g;
            f.a().a(aVar.f47279a);
        }
        f.a().b(aVar.f47279a);
        g.a(aVar.f47281c);
    }

    public static void b(a aVar) {
        if (f47296a.containsKey(aVar.f47279a)) {
            return;
        }
        sg.bigo.ads.common.t.a.a(0, 3, "TaskManager", " " + f47296a.keySet().size());
        f47296a.put(aVar.f47279a, aVar);
    }
}
