package com.inmobi.media;

import A.RunnableC0879a;
import android.os.Looper;
import android.util.SparseArray;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A f22668a = new A();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SparseArray f22669b = new SparseArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ThreadPoolExecutor f22670c;

    static {
        LinkedHashMap linkedHashMap = O2.f23027a;
        AdConfig adConfig = (AdConfig) AbstractC3174p5.a("ads", "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig", null);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(adConfig.getMaxPoolSize(), adConfig.getMaxPoolSize(), 5L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new K5("A".concat("-AD")));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f22670c = threadPoolExecutor;
    }

    public static void a(int i2, G1 task) {
        Intrinsics.f(task, "task");
        if (Intrinsics.a(Looper.myLooper(), Looper.getMainLooper())) {
            c(i2, task);
            return;
        }
        ExecutorC3160o7 executorC3160o7 = (ExecutorC3160o7) AbstractC3332z4.d.getX();
        RunnableC0879a runnableC0879a = new RunnableC0879a(i2, task);
        executorC3160o7.getClass();
        executorC3160o7.f23866a.post(runnableC0879a);
    }

    public static final void b(int i2, G1 task) {
        Intrinsics.f(task, "$task");
        c(i2, task);
    }

    public static void c(int i2, G1 g1) {
        try {
            SparseArray sparseArray = f22669b;
            Queue linkedList = (Queue) sparseArray.get(i2);
            if (linkedList == null) {
                linkedList = new LinkedList();
                sparseArray.put(i2, linkedList);
            }
            linkedList.add(g1);
            G1 g2 = (G1) linkedList.peek();
            if (linkedList.size() != 1 || g2 == null) {
                return;
            }
            try {
                f22670c.execute(g2);
            } catch (OutOfMemoryError unused) {
                g2.c();
            }
        } catch (Exception e2) {
            S5 s5 = S5.f23167a;
            S5.d.a(AbstractC3285w5.a(e2, "event"));
        }
    }
}
