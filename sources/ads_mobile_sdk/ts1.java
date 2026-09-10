package ads_mobile_sdk;

import android.net.NetworkCapabilities;
import com.google.common.base.formularize;
import java.lang.reflect.Method;
import java.util.Map;
import saneness.bochum;
import saneness.counters;

/* JADX INFO: loaded from: classes.dex */
public final class ts1 extends ys2 {
    public final Map f;

    public ts1(bochum bochumVar, counters countersVar, Map map, u13 u13Var) {
        super("gTE8LxGzFlxMvGJbHIYypitm6Evr4u1MIuDmU5bWw+RAEXsUo3Z5GPpv1bsO8CzC", "I38uYIq7spnbOl5NCpEECytsC4ASFeJHWpV2LxmFXaE=", bochumVar, countersVar, u13Var.a(gf0.EVENT_ID_NETWORK_SIGNALS_TASK));
        this.f = map;
    }

    @Override // ads_mobile_sdk.ys2
    public final void a(Method method, bochum bochumVar) {
        Object[] objArr = (Object[]) formularize.triweekly((Object[]) method.invoke("", (NetworkCapabilities) this.f.get("ntc"), (Long) this.f.get("vs"), (Long) this.f.get("vf")));
        synchronized (bochumVar) {
            try {
                bochumVar.permissivist(((Long) objArr[0]).longValue());
                long jLongValue = ((Long) objArr[1]).longValue();
                if (jLongValue >= 0) {
                    bochumVar.competently(jLongValue);
                }
                long jLongValue2 = ((Long) objArr[2]).longValue();
                if (jLongValue2 >= 0) {
                    bochumVar.cord(jLongValue2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
