package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class C5 {
    public static void a() {
        try {
            Iterator it = D5.f22759a.iterator();
            while (it.hasNext()) {
                C3016f7 c3016f7 = (C3016f7) ((WeakReference) it.next()).get();
                if (c3016f7 != null) {
                    c3016f7.a();
                }
            }
        } catch (Exception e2) {
            S5 s5 = S5.f23167a;
            S5.d.a(AbstractC3285w5.a(e2, "event"));
        }
    }
}
