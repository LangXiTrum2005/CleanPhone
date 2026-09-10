package com.smartdigimkt.e2;

import android.view.View;
import com.smartdigimkt.c2.c;
import com.smartdigimkt.i2.e;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile a f34605b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.smartdigimkt.h2.a f34606a;

    private a() {
    }

    public static a a() {
        a aVar;
        if (f34605b != null) {
            return f34605b;
        }
        synchronized (a.class) {
            try {
                if (f34605b == null) {
                    f34605b = new a();
                }
                aVar = f34605b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    private void b(c cVar, View view, Map map, e eVar) {
        new com.smartdigimkt.r2.a().b(cVar, view, map, eVar);
    }

    private void c(c cVar, View view, Map map, e eVar) {
        new com.smartdigimkt.r2.a().c(cVar, view, map, eVar);
    }

    public void d() {
        com.smartdigimkt.h2.a aVar = this.f34606a;
        if (aVar != null) {
            aVar.c();
        }
    }

    public void e() {
        if (f34605b != null) {
            f34605b = null;
        }
    }

    public void b() {
        com.smartdigimkt.h2.a aVar = this.f34606a;
        if (aVar != null) {
            aVar.b();
        }
    }

    public void c() {
        com.smartdigimkt.h2.a aVar = this.f34606a;
        if (aVar != null) {
            aVar.a();
        }
    }

    public void a(View view, c cVar, Map map, e eVar) {
        int iH = cVar.h();
        if (iH == 1) {
            a(cVar, view, map, eVar);
            return;
        }
        if (iH == 2) {
            b(cVar, view, map, eVar);
            return;
        }
        if (iH == 4) {
            a(cVar, view, eVar);
        } else if (iH != 5) {
            eVar.a(view, new ArrayList());
        } else {
            c(cVar, view, map, eVar);
        }
    }

    private void a(c cVar, View view, Map map, e eVar) {
        com.smartdigimkt.r2.a aVar = new com.smartdigimkt.r2.a();
        aVar.a(cVar, view, map, eVar);
        this.f34606a = aVar.f37991l;
    }

    private void a(c cVar, View view, e eVar) {
        new com.smartdigimkt.r2.a().a(cVar, view, eVar);
    }
}
