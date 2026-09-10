package sg.bigo.ads.core.e.a;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.api.core.r;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static g f48453a = new g(0);
    }

    private g() {
    }

    public static List<f> a(long j, r rVar) {
        sg.bigo.ads.common.g.c.c.b(System.currentTimeMillis() - 86400000);
        Cursor cursorA = sg.bigo.ads.common.g.c.c.a(j);
        ArrayList arrayList = new ArrayList();
        if (cursorA == null) {
            return arrayList;
        }
        while (cursorA.moveToNext()) {
            f fVar = new f(rVar, cursorA);
            arrayList.add(fVar);
            sg.bigo.ads.common.t.a.a(0, 3, "TrackerManager", "getList:" + fVar.toString());
        }
        cursorA.close();
        return arrayList;
    }

    public static void b(f fVar) {
        if (fVar.g()) {
            c(fVar);
        } else {
            sg.bigo.ads.common.g.c.c.b(fVar);
        }
    }

    private static void c(f fVar) {
        sg.bigo.ads.common.g.c.c.a(String.valueOf(fVar.f47246a));
    }

    public /* synthetic */ g(byte b2) {
        this();
    }

    public static void a(f fVar) {
        if (sg.bigo.ads.common.g.c.c.c(fVar)) {
            sg.bigo.ads.common.g.c.c.b(fVar);
        } else {
            fVar.f47246a = sg.bigo.ads.common.g.c.c.a(fVar);
        }
    }
}
