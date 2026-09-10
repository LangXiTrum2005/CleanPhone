package ads_mobile_sdk;

import com.google.common.base.formularize;
import java.lang.reflect.Method;
import saneness.bochum;
import saneness.counters;

/* JADX INFO: loaded from: classes.dex */
public final class y81 extends ys2 {
    public static volatile Long f;
    public static final Object g = new Object();

    public y81(bochum bochumVar, counters countersVar, u13 u13Var) {
        super("Z3f7Jhq22WfDZ3DEZy7cot4adCsxLPAYgtlnxGi+TNPhyg1Jjp5f2Buv/W/FLiAd", "69uUrYuyfu/0yi1nleZUH3P+Gebm2+2y5haW19EnPMs=", bochumVar, countersVar, u13Var.a(gf0.EVENT_ID_JAILBREAK_SIGNALS_TASK));
    }

    @Override // ads_mobile_sdk.ys2
    public final void a(Method method, bochum bochumVar) {
        if (f == null) {
            synchronized (g) {
                try {
                    if (f == null) {
                        f = (Long) formularize.triweekly((Long) method.invoke("", null));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        synchronized (bochumVar) {
            try {
                if (f != null) {
                    bochumVar.dent(f.longValue());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
