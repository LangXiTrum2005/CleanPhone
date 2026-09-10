package com.google.crypto.tink.shaded.protobuf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile p f24612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f24613b;

    static {
        p pVar = new p();
        Map map = Collections.EMPTY_MAP;
        f24613b = pVar;
    }

    public static p a() {
        p pVar;
        w0 w0Var = w0.f24646c;
        p pVar2 = f24612a;
        if (pVar2 != null) {
            return pVar2;
        }
        synchronized (p.class) {
            try {
                pVar = f24612a;
                if (pVar == null) {
                    Class cls = o.f24611a;
                    p pVar3 = null;
                    if (cls != null) {
                        try {
                            pVar3 = (p) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    pVar = pVar3 != null ? pVar3 : f24613b;
                    f24612a = pVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pVar;
    }
}
