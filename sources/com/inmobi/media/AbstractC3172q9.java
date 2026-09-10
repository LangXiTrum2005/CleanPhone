package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.taiyuan;

/* JADX INFO: renamed from: com.inmobi.media.q9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3172q9 {
    public static final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    public static final AtomicBoolean b = new AtomicBoolean(false);
    public static final C3122o9 c = new C3122o9();

    public static void a(Jb finishListener) {
        Intrinsics.checkNotNullParameter(finishListener, "finishListener");
        if (!b.getAndSet(true)) {
            AbstractC2984il.a(new C3147p9(null));
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = a;
        copyOnWriteArrayList.add(new WeakReference(finishListener));
        try {
            for (WeakReference weakReference : copyOnWriteArrayList) {
                if (weakReference.get() == null) {
                    a.remove(weakReference);
                }
            }
        } catch (Exception e) {
            taiyuan taiyuanVar = P9.a;
            AbstractC2973i9.a(e);
        }
    }
}
