package com.google.android.gms.internal.measurement;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f23368a;

    static {
        e eVar;
        try {
            eVar = j.f23599a;
        } catch (NoClassDefFoundError unused) {
            eVar = null;
        }
        if (eVar == null) {
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < 3; i10++) {
                String str = e.f23402a[i10];
                try {
                    eVar = (e) Class.forName(str).getConstructor(null).newInstance(null);
                } catch (Throwable th2) {
                    th = th2;
                    sb2.append('\n');
                    sb2.append(str);
                    sb2.append(": ");
                    if (th instanceof InvocationTargetException) {
                        th = th.getCause();
                    }
                    sb2.append(th);
                }
            }
            throw new IllegalStateException(sb2.insert(0, "No logging platforms found:").toString());
        }
        f23368a = eVar;
    }
}
