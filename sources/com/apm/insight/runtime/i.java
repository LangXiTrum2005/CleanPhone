package com.apm.insight.runtime;

import android.os.SystemClock;
import android.util.Printer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static i f10334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f10335b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<Printer> f10336c = new ArrayList();
    private final List<Printer> d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f10337e = false;

    static {
        new Printer() { // from class: com.apm.insight.runtime.i.1
            @Override // android.util.Printer
            public final void println(String str) {
                if (str == null) {
                    return;
                }
                if (str.charAt(0) == '>') {
                    i.a().a(str);
                } else if (str.charAt(0) == '<') {
                    i.a().b(str);
                }
                i.c();
            }
        };
    }

    private i() {
    }

    public static i a() {
        if (f10334a == null) {
            synchronized (i.class) {
                try {
                    if (f10334a == null) {
                        f10334a = new i();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f10334a;
    }

    public static /* synthetic */ Printer c() {
        return null;
    }

    public final boolean b() {
        return this.f10335b != -1 && SystemClock.uptimeMillis() - this.f10335b > 5000;
    }

    public final void b(String str) {
        this.f10335b = SystemClock.uptimeMillis();
        try {
            a(this.d, str);
        } catch (Exception e2) {
            com.apm.insight.a.b((Throwable) e2);
        }
    }

    public final void a(String str) {
        this.f10335b = -1L;
        try {
            a(this.f10336c, str);
        } catch (Exception e2) {
            com.apm.insight.a.a((Throwable) e2);
        }
    }

    private static void a(List<? extends Printer> list, String str) {
        if (list == null || list.isEmpty()) {
            return;
        }
        try {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Printer printer = list.get(i2);
                if (printer == null) {
                    return;
                }
                printer.println(str);
            }
        } catch (Throwable th) {
            com.apm.insight.a.a(th);
        }
    }
}
