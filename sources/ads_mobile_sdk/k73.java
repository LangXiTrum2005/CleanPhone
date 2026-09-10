package ads_mobile_sdk;

import android.util.DisplayMetrics;
import android.view.View;
import com.google.common.base.formularize;
import java.lang.reflect.Method;
import saneness.bochum;
import saneness.counters;
import saneness.dispatchbox;

/* JADX INFO: loaded from: classes.dex */
public final class k73 extends ys2 {
    public final DisplayMetrics f;
    public final View g;

    public k73(bochum bochumVar, counters countersVar, DisplayMetrics displayMetrics, View view, u13 u13Var) {
        super("T9/3l9iSXB/Z/wSbpUyr6Oqh8phk4M2eSsXORFRNo8rS3NuA7PoYu9wZIVGnd1io", "/r36IXs5QyyS+yKlu0e3SxgGaHtLCgsyjVyabNnNN3g=", bochumVar, countersVar, u13Var.a(gf0.EVENT_ID_VIEW_SIGNALS_TASK));
        this.f = displayMetrics;
        this.g = view;
    }

    @Override // ads_mobile_sdk.ys2
    public final void a(Method method, bochum bochumVar) {
        View view = this.g;
        if (view == null) {
            return;
        }
        Long[] lArr = (Long[]) formularize.triweekly(method.invoke("", this.f, view));
        dispatchbox dispatchboxVarO = qa.o();
        dispatchboxVarO.dern(lArr[2].longValue()).marial(lArr[1].longValue()).beachfront(lArr[0].longValue()).wireman(lArr[3].longValue()).attabal(lArr[4].longValue());
        bochumVar.graveside((qa) dispatchboxVarO.a());
    }
}
