package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.i7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3064i7 {
    public static void a(Ab ab) {
        CopyOnWriteArrayList copyOnWriteArrayList = AbstractC3080j7.f23723a;
        Objects.toString(ab);
        if (ab == null) {
            return;
        }
        try {
            for (WeakReference weakReference : AbstractC3080j7.f23723a) {
                if (weakReference.get() == null || Intrinsics.a(weakReference.get(), ab)) {
                    AbstractC3080j7.f23723a.remove(weakReference);
                }
            }
        } catch (Exception e2) {
            S5 s5 = S5.f23167a;
            S5.d.a(AbstractC3285w5.a(e2, "event"));
        }
    }
}
