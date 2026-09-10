package com.smartdigimkt.e2;

import android.view.View;
import com.smartdigimkt.c2.c;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile b f34607a;

    private b() {
    }

    public static b a() {
        b bVar;
        if (f34607a != null) {
            return f34607a;
        }
        synchronized (b.class) {
            try {
                if (f34607a == null) {
                    f34607a = new b();
                }
                bVar = f34607a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    private void b(View view, c cVar) {
        new com.smartdigimkt.r2.b().b(view, cVar);
    }

    private void c(View view, c cVar, Map<String, Object> map) {
        new com.smartdigimkt.r2.b().a(view, cVar, map);
    }

    private void b(View view, c cVar, Map<String, Object> map) {
        new com.smartdigimkt.r2.b().b(view, cVar, map);
    }

    public void b() {
        if (f34607a != null) {
            f34607a = null;
        }
    }

    public void a(View view, c cVar, Map<String, Object> map) {
        if (cVar == null) {
            return;
        }
        int iH = cVar.h();
        if (iH == 1) {
            a(view, map);
            return;
        }
        if (iH == 2) {
            c(view, cVar, map);
            return;
        }
        if (iH == 3) {
            b(view, cVar);
        } else if (iH == 4) {
            b(view, cVar, map);
        } else {
            if (iH != 5) {
                return;
            }
            a(view, cVar);
        }
    }

    private void a(View view, Map<String, Object> map) {
        new com.smartdigimkt.r2.b().a(view, map);
    }

    private void a(View view, c cVar) {
        new com.smartdigimkt.r2.b().a(view, cVar);
    }
}
