package ads_mobile_sdk;

import android.app.Activity;
import android.view.View;
import com.google.common.base.formularize;
import java.lang.reflect.Method;
import saneness.bochum;
import saneness.counters;

/* JADX INFO: loaded from: classes.dex */
public final class p extends ys2 {
    public final Activity f;
    public final View g;

    public p(bochum bochumVar, counters countersVar, View view, Activity activity, u13 u13Var) {
        super("xoApWgQ48QzK9FPVc+HMnwjWnM8FDnIuQpdjTGE7ELgH6UAcWPIdHF5reZo5QOdv", "1p8X4wnPxXHLD5dZQ+vDTxY41Nlj9QxDLnUwDx73fUk=", bochumVar, countersVar, u13Var.a(gf0.EVENT_ID_ACTIVITY_SIGNALS_TASK));
        this.g = view;
        this.f = activity;
    }

    @Override // ads_mobile_sdk.ys2
    public final void a(Method method, bochum bochumVar) {
        Object[] objArr = (Object[]) formularize.triweekly((Object[]) method.invoke("", this.g, this.f));
        synchronized (bochumVar) {
            bochumVar.kowloon(((Long) objArr[0]).longValue());
            bochumVar.gintrap(((Long) objArr[1]).longValue());
            bochumVar.adultoid((String) objArr[2]);
        }
    }
}
