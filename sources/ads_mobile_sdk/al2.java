package ads_mobile_sdk;

import android.content.Context;
import com.google.common.base.competently;
import com.google.common.base.formularize;
import java.lang.reflect.Method;
import java.util.Map;
import saneness.bochum;
import saneness.counters;

/* JADX INFO: loaded from: classes.dex */
public final class al2 extends ys2 {
    public final yu2 f;
    public final Context g;
    public final Map h;

    public al2(bochum bochumVar, counters countersVar, yu2 yu2Var, Context context, Map map, u13 u13Var) {
        super("kWGQQT02q+wF2P0aBbXJCI0X53Txp3qAPk8esA4lk0InVYkwkYbQ+Jy1KkMA3cTx", "KYgSlSWWUfzbEbclowh/kYrZYsmhkfBZkLKualo85XU=", bochumVar, countersVar, u13Var.a(gf0.EVENT_ID_SCREEN_SIGNALS_TASK));
        this.f = yu2Var;
        this.g = context;
        this.h = map;
    }

    @Override // ads_mobile_sdk.ys2
    public final void a(Method method, bochum bochumVar) {
        Object[] objArr = (Object[]) formularize.triweekly((Object[]) method.invoke("", Integer.valueOf(this.f.ordinal()), this.g, competently.attabal(this.h.get("up"), Boolean.TRUE)));
        synchronized (bochumVar) {
            try {
                if (this.f == yu2.QUERY) {
                    bochumVar.impassible(((Long) competently.attabal(objArr[0], -1L)).longValue());
                    bochumVar.impromptu(((Long) competently.attabal(objArr[1], -1L)).longValue());
                }
                bochumVar.cultivated(((Long) objArr[2]).longValue());
                bochumVar.treadless(((Long) objArr[3]).longValue());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
