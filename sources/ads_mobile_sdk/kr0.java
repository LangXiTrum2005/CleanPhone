package ads_mobile_sdk;

import android.content.Context;
import saneness.invest;

/* JADX INFO: loaded from: classes.dex */
public final class kr0 implements invest {
    public static kr0 b;
    public final lr0 a;

    public kr0(Context context) {
        this.a = lr0.a(context);
    }

    public final boolean a() {
        boolean z;
        synchronized (kr0.class) {
            z = this.a.b.getBoolean("paidv2_publisher_option", true);
        }
        return z;
    }

    public final boolean b() {
        boolean z;
        synchronized (kr0.class) {
            z = this.a.b.getBoolean("paidv2_user_option", true);
        }
        return z;
    }

    public static final kr0 a(Context context) {
        kr0 kr0Var;
        synchronized (kr0.class) {
            try {
                if (b == null) {
                    b = new kr0(context);
                }
                kr0Var = b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return kr0Var;
    }
}
