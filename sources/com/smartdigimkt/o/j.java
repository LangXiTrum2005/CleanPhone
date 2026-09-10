package com.smartdigimkt.o;

import android.content.Context;
import android.text.TextUtils;
import com.smartdigimkt.v0.u;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes.dex */
public class j {
    public static void a(com.smartdigimkt.x.d dVar, com.smartdigimkt.p.b bVar, com.smartdigimkt.p.a aVar, String str, String str2, Context context, l.f fVar, h hVar, Semaphore semaphore) {
        if (!a(bVar.j()) && !u.a.b(bVar.j()) && 200 == aVar.f && !TextUtils.isEmpty(bVar.c()) && !bVar.c().contains(com.smartdigimkt.b0.a.Y1)) {
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
        String strJ = bVar.j();
        if (u.a.b(strJ)) {
            bVar.a(1);
            bVar.g(strJ);
            bVar.c(true);
        } else if (a(strJ)) {
            bVar.a(3);
            bVar.g(strJ);
            bVar.c(true);
        } else {
            bVar.a(2);
            bVar.g(strJ);
        }
        if (hVar != null) {
            hVar.a(bVar);
        }
    }

    private static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains(".apk") || str.contains(".APK");
    }

    public static boolean a(String str, com.smartdigimkt.x.d dVar, com.smartdigimkt.p.b bVar) {
        if (u.a.b(bVar.j())) {
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
