package com.inmobi.media;

import A.RunnableC0895i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class D5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArrayList f22759a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f22760b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C5 f22761c = new C5();

    public static void a(C3016f7 finishListener) {
        Intrinsics.f(finishListener, "finishListener");
        if (!f22760b.getAndSet(true)) {
            b();
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = f22759a;
        copyOnWriteArrayList.add(new WeakReference(finishListener));
        try {
            for (WeakReference weakReference : copyOnWriteArrayList) {
                if (weakReference.get() == null) {
                    f22759a.remove(weakReference);
                }
            }
        } catch (Exception e2) {
            S5 s5 = S5.f23167a;
            S5.d.a(AbstractC3285w5.a(e2, "event"));
        }
    }

    public static void b() {
        Ie.f22893a.execute(new RunnableC0895i(2));
    }

    public static final void c() {
        Z6 z6D = Nc.d();
        C5 listener = f22761c;
        z6D.getClass();
        Intrinsics.f(listener, "listener");
        z6D.f23399b = listener;
    }

    public static ArrayList a() {
        ArrayList arrayList = new ArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList = AbstractC3080j7.f23723a;
        ArrayList arrayList2 = new ArrayList();
        try {
            Iterator it = AbstractC3080j7.f23723a.iterator();
            while (it.hasNext()) {
                Ab ab = (Ab) ((WeakReference) it.next()).get();
                if (ab != null) {
                    arrayList2.add(ab);
                }
            }
        } catch (Exception e2) {
            S5 s5 = S5.f23167a;
            S5.d.a(AbstractC3285w5.a(e2, "event"));
        }
        CopyOnWriteArrayList copyOnWriteArrayList2 = AbstractC3080j7.f23723a;
        arrayList2.toString();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList.add(new Fc((Ab) it2.next()));
        }
        return arrayList;
    }
}
