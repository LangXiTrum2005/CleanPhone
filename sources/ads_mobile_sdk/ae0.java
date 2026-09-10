package ads_mobile_sdk;

import android.content.Context;
import com.google.common.base.formularize;
import java.lang.reflect.Method;
import saneness.bochum;
import saneness.counters;

/* JADX INFO: loaded from: classes.dex */
public final class ae0 extends ys2 {
    public final Context f;

    public ae0(bochum bochumVar, counters countersVar, Context context, u13 u13Var) {
        super("BgiJ/3o5ozRufDuBC4lsW0Wx0ZuXubHxUMFmr2L2m+jdkDUpr9XVzB/lpe1flDwh", "3O9MW9JA3xArII0/S+kVPF02B6DYIB2wC5XVH7AE6fg=", bochumVar, countersVar, u13Var.a(gf0.EVENT_ID_DYNAMIC_DEVICE_SIGNALS_TASK));
        this.f = context;
    }

    @Override // ads_mobile_sdk.ys2
    public final void a(Method method, bochum bochumVar) {
        Object[] objArr = (Object[]) formularize.triweekly((Object[]) method.invoke("", this.f));
        synchronized (bochumVar) {
            try {
                bochumVar.sealless(((Integer) objArr[0]).intValue());
                bochumVar.seminary(((Integer) objArr[1]).intValue());
                bochumVar.polder(((Integer) objArr[2]).intValue());
                bochumVar.supplicat(((Integer) objArr[3]).intValue());
                Boolean bool = (Boolean) objArr[4];
                if (bool == null) {
                    bochumVar.monoploid(db.ENUM_FAILURE);
                } else {
                    bochumVar.monoploid(bool.booleanValue() ? db.ENUM_TRUE : db.ENUM_FALSE);
                }
                Boolean bool2 = (Boolean) objArr[5];
                if (bool2 == null) {
                    bochumVar.cuirassed(db.ENUM_FAILURE);
                } else {
                    bochumVar.cuirassed(bool2.booleanValue() ? db.ENUM_TRUE : db.ENUM_FALSE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
