package ads_mobile_sdk;

import android.content.Context;
import android.os.Build;
import com.google.common.base.formularize;
import com.google.common.util.concurrent.adultoid;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import saneness.bochum;
import saneness.counters;

/* JADX INFO: loaded from: classes.dex */
public final class oc2 extends ys2 {
    public final Context f;
    public final Map g;

    public oc2(bochum bochumVar, counters countersVar, Map map, Context context, u13 u13Var) {
        super("I1WxHEw3oQhlmBXYGuCcrFYK76EUuO6I25Q7KOXcfSayUTEq90csonZBWqK1sdvD", "DrUmYRbqubM7I7D3EGoy8ZfcLUpFWpJWaqY0qGbV/mU=", bochumVar, countersVar, u13Var.a(gf0.EVENT_ID_RECENT_FOREGROUND_TIME_SIGNALS_TASK));
        this.f = context;
        this.g = map;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ads_mobile_sdk.ys2
    public final void a(Method method, bochum bochumVar) {
        Long lValueOf;
        Long l = -1L;
        try {
            if (Build.VERSION.SDK_INT < 30) {
                adultoid adultoidVar = (adultoid) this.g.get("gs");
                if (adultoidVar != null && adultoidVar.isDone()) {
                    lValueOf = Long.valueOf(((ra) adultoidVar.get()).r());
                }
                synchronized (bochumVar) {
                    bochumVar.milliradian(l.longValue());
                }
            }
            lValueOf = (Long) formularize.triweekly((Long) method.invoke("", this.f));
            l = lValueOf;
        } catch (InterruptedException | ExecutionException unused) {
        }
        synchronized (bochumVar) {
            bochumVar.milliradian(l.longValue());
        }
    }
}
