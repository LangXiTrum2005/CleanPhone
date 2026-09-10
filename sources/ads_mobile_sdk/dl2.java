package ads_mobile_sdk;

import android.app.KeyguardManager;
import android.content.Context;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class dl2 {
    public static final dl2 d = new dl2();
    public WeakReference a;
    public boolean b = false;
    public boolean c = false;

    public final void a() {
        KeyguardManager keyguardManager;
        Context context = (Context) this.a.get();
        if (context == null || (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) == null) {
            return;
        }
        boolean zIsDeviceLocked = keyguardManager.isDeviceLocked();
        a(this.b, zIsDeviceLocked);
        this.c = zIsDeviceLocked;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(boolean z, boolean z2) {
        if ((z2 || z) == (this.c || this.b)) {
            return;
        }
        Iterator it = Collections.unmodifiableCollection(s4.c.a).iterator();
        while (it.hasNext()) {
            t4 t4Var = ((r4) it.next()).d;
            boolean z3 = z2 || z;
            if (t4Var.b.get() != 0) {
                rv1.a.a((WebView) t4Var.b.get(), "setDeviceLockState", z3 ? "locked" : "unlocked");
            }
        }
    }
}
