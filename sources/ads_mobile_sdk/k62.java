package ads_mobile_sdk;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import java.util.ArrayList;
import saneness.resplend;

/* JADX INFO: loaded from: classes.dex */
public final class k62 {
    public static final hc1 c = new hc1("PrewarmService");
    public static final Intent d = new Intent("com.google.android.play.core.prewarm.BIND_PREWARM_SERVICE").setPackage("com.android.vending");
    public final qm2 a;
    public final String b;

    public k62(Context context) {
        if (z12.a(context)) {
            this.a = new qm2(context.getApplicationContext(), c, d, new resplend() { // from class: saneness.inblowing
                @Override // saneness.resplend
                public final Object attabal(IBinder iBinder) {
                    return revolt.cutely(iBinder);
                }
            });
        } else {
            this.a = null;
        }
        this.b = context.getPackageName();
    }

    public static ArrayList a(b42 b42Var) {
        ArrayList arrayList = new ArrayList();
        b42Var.getClass();
        for (String str : new ArrayList(b42Var.a)) {
            Bundle bundle = new Bundle();
            bundle.putString("url", str);
            arrayList.add(bundle);
        }
        return arrayList;
    }
}
