package com.bykv.vk.openvk.preload.a;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class g<T> extends d<List<T>, T> {
    @Override // com.bykv.vk.openvk.preload.a.d
    public final /* synthetic */ Object a(final b bVar, Object obj) throws Throwable {
        List list = (List) obj;
        final CountDownLatch countDownLatch = new CountDownLatch(list.size());
        final CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        final CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        for (final Object obj2 : list) {
            com.bykv.vk.openvk.preload.geckox.b.t().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.a.g.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        try {
                            try {
                                copyOnWriteArrayList.add(bVar.a(obj2));
                            } catch (Throwable th) {
                                copyOnWriteArrayList2.add(th);
                                g.this.d(th);
                            }
                        } catch (i.a e2) {
                            Throwable cause = e2.getCause();
                            copyOnWriteArrayList2.add(cause);
                            g.this.d(cause);
                        }
                    } finally {
                        countDownLatch.countDown();
                    }
                }
            });
        }
        countDownLatch.await();
        if (copyOnWriteArrayList2.isEmpty()) {
            return copyOnWriteArrayList;
        }
        throw new com.bykv.vk.openvk.preload.a.a.a(copyOnWriteArrayList2);
    }

    @Override // com.bykv.vk.openvk.preload.a.d
    public final void a(Object... objArr) {
        super.a(objArr);
        if (objArr != null) {
            if (objArr.length == 1) {
                if (!(objArr[0] instanceof Executor)) {
                    throw new IllegalArgumentException("ParallelInterceptor args must be instance of Executor");
                }
                return;
            }
            throw new IllegalArgumentException("ParallelInterceptor only need one param");
        }
    }
}
