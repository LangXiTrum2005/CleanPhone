package com.thinkup.core.o.m;

import android.os.Bundle;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.on.o0mm;
import com.thinkup.core.o.m.m.AnonymousClass4;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public class o {
    public static int m = 6;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f42427n = 7;
    public static int o = 5;
    private static volatile o oo;
    private final String o0 = "o";

    private o() {
    }

    public static o o() {
        if (oo == null) {
            synchronized (o.class) {
                try {
                    if (oo == null) {
                        oo = new o();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return oo;
    }

    public static void o(TUBaseAdAdapter tUBaseAdAdapter, int i2, String str) {
        try {
            Objects.toString(tUBaseAdAdapter);
            if (tUBaseAdAdapter != null) {
                Bundle bundle = new Bundle();
                bundle.putString("format", str);
                o0mm unitGroupInfo = tUBaseAdAdapter.getUnitGroupInfo();
                if (unitGroupInfo != null) {
                    bundle.putInt("networkId", unitGroupInfo.nm());
                }
                com.thinkup.core.common.ooo.m.m.o().m((Runnable) m.o().new AnonymousClass4(i2, o0n.m().on(), bundle), 2);
            }
        } catch (Throwable unused) {
        }
    }
}
