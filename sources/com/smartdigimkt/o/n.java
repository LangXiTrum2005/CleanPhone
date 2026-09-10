package com.smartdigimkt.o;

import android.content.Context;
import android.text.TextUtils;
import com.smartdigimkt.v0.u;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes.dex */
public class n {
    public static void a(com.smartdigimkt.x.d dVar, com.smartdigimkt.p.b bVar, com.smartdigimkt.p.a aVar, String str, String str2, Context context, l.f fVar, Semaphore semaphore) {
        if (!a(bVar.j()) && !b(bVar.j()) && 200 == aVar.f && !TextUtils.isEmpty(bVar.c()) && !bVar.c().contains(com.smartdigimkt.b0.a.Y1)) {
            bVar.c(2);
            if (TextUtils.isEmpty(bVar.c())) {
                try {
                    new l().a(str, str2, context, bVar.j(), fVar);
                } catch (Exception unused) {
                }
            } else {
                new l().a(str, str2, context, bVar.j(), bVar.c(), fVar);
            }
            semaphore.acquireUninterruptibly();
            return;
        }
        if (aVar != null) {
            bVar.c(1);
            bVar.c(aVar.f37478h);
            bVar.b(aVar.f);
            bVar.d(aVar.a());
            bVar.b(aVar.g);
        }
        a(bVar.j(), dVar, bVar);
    }

    private static boolean b(String str) {
        return u.a.b(str);
    }

    private static boolean a(String str) {
        return !TextUtils.isEmpty(str) && str.toLowerCase().contains("apk");
    }

    public static boolean a(String str, com.smartdigimkt.x.d dVar, com.smartdigimkt.p.b bVar) {
        if (dVar != null) {
            dVar.e1();
        }
        if (b(str)) {
            bVar.a(1);
            bVar.g(str);
            bVar.c(true);
            return true;
        }
        if (a(str)) {
            bVar.a(3);
            bVar.g(str);
            bVar.c(true);
            return true;
        }
        bVar.a(2);
        bVar.g(str);
        return false;
    }

    public static String a(com.smartdigimkt.x.d dVar, String str) {
        try {
            return dVar.l(str);
        } catch (Exception unused) {
            return str;
        }
    }
}
