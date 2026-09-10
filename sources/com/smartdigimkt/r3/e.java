package com.smartdigimkt.r3;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38056b = "e";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile e f38057c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<a> f38058a = new CopyOnWriteArrayList();

    public interface a {
        void a(String str, int i2);

        void a(String str, com.smartdigimkt.v3.h hVar);
    }

    private e() {
    }

    public static e a() {
        if (f38057c == null) {
            synchronized (e.class) {
                try {
                    if (f38057c == null) {
                        f38057c = new e();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f38057c;
    }

    public synchronized void b(a aVar) {
        try {
            int size = this.f38058a.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (aVar == this.f38058a.get(i2)) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 != -1) {
                this.f38058a.remove(i2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void a(a aVar) {
        this.f38058a.add(aVar);
    }

    public void a(String str, int i2) {
        List<a> list = this.f38058a;
        if (list != null) {
            Iterator<a> it = list.iterator();
            while (it.hasNext()) {
                it.next().a(str, i2);
            }
        }
    }

    public void a(String str, com.smartdigimkt.v3.h hVar) {
        List<a> list = this.f38058a;
        if (list != null) {
            Iterator<a> it = list.iterator();
            while (it.hasNext()) {
                it.next().a(str, hVar);
            }
        }
    }
}
