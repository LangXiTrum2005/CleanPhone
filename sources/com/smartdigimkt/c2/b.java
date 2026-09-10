package com.smartdigimkt.c2;

import android.content.Context;
import android.view.View;
import com.smartdigimkt.i2.h;
import com.smartdigimkt.x.d;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile b f34044b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, SoftReference<View>> f34045a = new HashMap();

    private b() {
    }

    public void a(d dVar, String str, int i2) {
    }

    public void b() {
        com.smartdigimkt.e2.b.a().b();
        com.smartdigimkt.e2.a.a().e();
    }

    public static b a() {
        b bVar;
        if (f34044b != null) {
            return f34044b;
        }
        synchronized (b.class) {
            try {
                if (f34044b == null) {
                    f34044b = new b();
                }
                bVar = f34044b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    public void a(Context context, List<d> list, h hVar, Map<String, Object> map) {
        new com.smartdigimkt.l2.a(context, list, hVar, map);
    }

    public void a(c cVar, h hVar) {
        new com.smartdigimkt.l2.a(cVar, hVar, new HashMap());
    }

    public void a(c cVar, h hVar, Map<String, Object> map) {
        new com.smartdigimkt.l2.a(cVar, hVar, map);
    }
}
