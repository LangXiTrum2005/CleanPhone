package com.facebook.ads.redexgen.core;

import com.p004ironsource.mediationsdk.demandOnly.b;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class WU {
    public static final Set<Object> A00 = Collections.newSetFromMap(new WeakHashMap());
    public static final AtomicBoolean A01 = new AtomicBoolean(true);
    public static final AtomicReference<WS> A02 = new AtomicReference<>();

    public static void A00(Throwable th, Object obj) throws Throwable {
        if (A01.get()) {
            A00.add(obj);
            AbstractC1794Wj.A00().AAx(b.C0288b.INSTANCE_LOAD_NO_FILL, th);
            WS contextRepairHelper = A02.get();
            if (contextRepairHelper != null) {
                contextRepairHelper.AIZ(th, obj);
                return;
            }
            return;
        }
        throw th;
    }

    public static void A01(boolean z2, WS ws) {
        A01.set(z2);
        A02.set(ws);
    }

    public static boolean A02(Object obj) {
        return A00.contains(obj);
    }
}
