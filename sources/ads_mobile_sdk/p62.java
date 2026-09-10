package ads_mobile_sdk;

import android.content.Context;
import com.google.common.base.formularize;
import java.lang.reflect.Method;
import saneness.bochum;
import saneness.counters;

/* JADX INFO: loaded from: classes.dex */
public final class p62 extends ys2 {
    public final Context f;

    public p62(bochum bochumVar, counters countersVar, Context context, u13 u13Var) {
        super("gd2XEZRm+RIFQBQle7Rb8A6s9WC+tCTI3pAvXA6bXzNJfJiDunYQ3i3DqrWRE6e6", "2TKNQaw6zlczhA49aZ1p9DXt4Q95bnDY3qfw4TbCZcI=", bochumVar, countersVar, u13Var.a(gf0.EVENT_ID_PROCESS_INFO_SIGNALS_TASK));
        this.f = context;
    }

    @Override // ads_mobile_sdk.ys2
    public final void a(Method method, bochum bochumVar) {
        Object[] objArr = (Object[]) formularize.triweekly((Object[]) method.invoke("", this.f));
        synchronized (bochumVar) {
            bochumVar.oilcan(((Long) objArr[0]).longValue());
            bochumVar.premeiotic(((Long) objArr[1]).longValue());
        }
    }
}
