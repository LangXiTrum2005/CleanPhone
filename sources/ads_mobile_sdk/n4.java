package ads_mobile_sdk;

import android.view.View;
import android.webkit.WebView;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class n4 extends xg {
    public static final n4 d = new n4();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ads_mobile_sdk.xg
    public final boolean a() {
        Iterator it = Collections.unmodifiableCollection(s4.c.b).iterator();
        while (it.hasNext()) {
            View view = (View) ((r4) it.next()).c.get();
            if (view != null && view.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ads_mobile_sdk.xg
    public final void a(boolean z) {
        Iterator it = Collections.unmodifiableCollection(s4.c.a).iterator();
        while (it.hasNext()) {
            t4 t4Var = ((r4) it.next()).d;
            if (t4Var.b.get() != 0) {
                rv1.a.a((WebView) t4Var.b.get(), "setState", z ? "foregrounded" : "backgrounded", t4Var.a);
            }
        }
    }
}
