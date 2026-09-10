package com.inmobi.media;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlinx.coroutines.saran;
import patroclinal.taiyuan;

/* JADX INFO: renamed from: com.inmobi.media.o9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3122o9 {
    public static void a() {
        Context context;
        try {
            Iterator it = AbstractC3172q9.a.iterator();
            while (it.hasNext()) {
                Jb jb = (Jb) ((WeakReference) it.next()).get();
                if (jb != null && (context = (Context) jb.f.get()) != null) {
                    saran saranVar = Sb.a;
                    Rb.a(new Ib(jb, context, null));
                }
            }
        } catch (Exception e) {
            taiyuan taiyuanVar = P9.a;
            AbstractC2973i9.a(e);
        }
    }
}
