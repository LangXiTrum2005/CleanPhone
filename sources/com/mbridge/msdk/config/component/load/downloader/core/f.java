package com.mbridge.msdk.config.component.load.downloader.core;

import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, d> f32164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<String, CopyOnWriteArrayList<d>> f32165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicInteger f32166c;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final f f32167a = new f();
    }

    public static f a() {
        return b.f32167a;
    }

    private int b() {
        return this.f32166c.incrementAndGet();
    }

    private f() {
        this.f32164a = new ConcurrentHashMap<>();
        this.f32166c = new AtomicInteger();
        this.f32165b = new ConcurrentHashMap<>();
    }

    public synchronized void a(d dVar) {
        try {
            String strE = dVar.e();
            dVar.a(b());
            if (this.f32164a.containsKey(strE)) {
                dVar.b(dVar.i() != 7 ? 8 : 7);
                if (this.f32165b.containsKey(strE)) {
                    CopyOnWriteArrayList<d> copyOnWriteArrayList = this.f32165b.get(strE);
                    if (copyOnWriteArrayList != null) {
                        copyOnWriteArrayList.add(dVar);
                        this.f32165b.remove(strE);
                        this.f32165b.put(strE, copyOnWriteArrayList);
                    }
                } else {
                    CopyOnWriteArrayList<d> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
                    copyOnWriteArrayList2.add(dVar);
                    this.f32165b.put(strE, copyOnWriteArrayList2);
                }
            } else {
                dVar.b(dVar.i() != 7 ? 2 : 7);
                this.f32164a.put(strE, dVar);
                dVar.a(i.b().a().getDownloadTasks().submit(new h(dVar)));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void b(d dVar) {
        CopyOnWriteArrayList<d> copyOnWriteArrayListRemove;
        String strE = dVar.e();
        this.f32164a.remove(strE);
        if (this.f32165b.containsKey(strE) && (copyOnWriteArrayListRemove = this.f32165b.remove(strE)) != null && !copyOnWriteArrayListRemove.isEmpty()) {
            d dVarRemove = copyOnWriteArrayListRemove.remove(0);
            dVarRemove.b(2);
            this.f32164a.put(strE, dVarRemove);
            dVarRemove.a(i.b().a().getDownloadTasks().submit(new h(dVarRemove)));
            if (!copyOnWriteArrayListRemove.isEmpty()) {
                this.f32165b.put(strE, copyOnWriteArrayListRemove);
            }
        }
    }

    public synchronized void a(String str) {
        CopyOnWriteArrayList<d> copyOnWriteArrayList;
        try {
            if (!TextUtils.isEmpty(str) && this.f32165b.containsKey(str) && (copyOnWriteArrayList = this.f32165b.get(str)) != null && !copyOnWriteArrayList.isEmpty()) {
                for (d dVar : copyOnWriteArrayList) {
                    copyOnWriteArrayList.remove(dVar);
                    dVar.b(dVar.c());
                }
                if (!copyOnWriteArrayList.isEmpty()) {
                    this.f32165b.remove(str);
                    this.f32165b.put(str, copyOnWriteArrayList);
                } else {
                    this.f32165b.remove(str);
                }
            }
            if (!TextUtils.isEmpty(str)) {
                a(this.f32164a.get(str), str);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void c() {
    }

    private void a(d dVar, String str) {
        if (dVar != null) {
            dVar.a(dVar.c());
            this.f32164a.remove(str);
        }
    }
}
