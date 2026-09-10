package ads_mobile_sdk;

import android.webkit.WebView;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONObject;
import saneness.huckleberry;
import saneness.transitional;

/* JADX INFO: loaded from: classes.dex */
public final class o implements huckleberry {
    public static final o f = new o(new xg());
    public final transitional a = new transitional();
    public Date b;
    public boolean c;
    public final xg d;
    public boolean e;

    public o(xg xgVar) {
        this.d = xgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // saneness.huckleberry
    public final void a(boolean z) {
        if (!this.e && z) {
            this.a.getClass();
            Date date = new Date();
            Date date2 = this.b;
            if (date2 == null || date.after(date2)) {
                this.b = date;
                if (this.c) {
                    Iterator it = Collections.unmodifiableCollection(s4.c.b).iterator();
                    while (it.hasNext()) {
                        t4 t4Var = ((r4) it.next()).d;
                        Date date3 = this.b;
                        Date date4 = date3 != null ? (Date) date3.clone() : null;
                        t4Var.getClass();
                        if (date4 != null) {
                            JSONObject jSONObject = new JSONObject();
                            nw1.a(jSONObject, "timestamp", Long.valueOf(date4.getTime()));
                            rv1.a.a((WebView) t4Var.b.get(), "setLastActivity", jSONObject);
                        }
                    }
                }
            }
        }
        this.e = z;
    }
}
