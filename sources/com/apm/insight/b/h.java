package com.apm.insight.b;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Printer;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile boolean f10043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Printer f10044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final CopyOnWriteArrayList<e> f10045c = new CopyOnWriteArrayList<>();
    private static volatile boolean d = false;

    public interface a {
        String a();

        String b();

        String c();
    }

    public static void a() {
        if (f10043a) {
            return;
        }
        f10043a = true;
        f10044b = new Printer() { // from class: com.apm.insight.b.h.1
            @Override // android.util.Printer
            public final void println(String str) {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (str.charAt(0) == '>') {
                    h.a(true, str);
                } else if (str.charAt(0) == '<') {
                    h.a(false, str);
                }
            }
        };
        i.a();
        i.a(f10044b);
    }

    public static void a(e eVar) {
        CopyOnWriteArrayList<e> copyOnWriteArrayList = f10045c;
        synchronized (copyOnWriteArrayList) {
            copyOnWriteArrayList.add(eVar);
        }
    }

    public static void a(boolean z2, String str) {
        e.f10008a = System.nanoTime() / 1000000;
        e.f10009b = SystemClock.currentThreadTimeMillis();
        CopyOnWriteArrayList<e> copyOnWriteArrayList = f10045c;
        for (int i2 = 0; i2 < copyOnWriteArrayList.size(); i2++) {
            e eVar = copyOnWriteArrayList.get(i2);
            if (eVar == null || !eVar.a()) {
                if (!z2 && eVar.f10010c) {
                    eVar.b("");
                }
            } else if (z2) {
                if (!eVar.f10010c) {
                    eVar.a(str);
                }
            } else if (eVar.f10010c) {
                eVar.b(str);
            }
        }
    }
}
