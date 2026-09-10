package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.bk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2805bk {
    public static final Ea a;
    public static int b;
    public static Integer c;

    static {
        Ea eaA;
        Context context = Ji.a;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = Ea.b;
            eaA = Da.a(context, "imtelemetrydboverflow");
        } else {
            eaA = null;
        }
        a = eaA;
        b = -1;
    }

    public static int a() {
        if (b == -1) {
            Ea ea = a;
            int i = 0;
            if (ea != null) {
                Intrinsics.checkNotNullParameter("count", com.ironsource.X3.i.W);
                i = ea.a.getInt("count", 0);
            }
            b = i;
        }
        return b;
    }
}
