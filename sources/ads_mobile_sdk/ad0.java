package ads_mobile_sdk;

import android.webkit.WebView;
import java.util.Collections;
import java.util.Iterator;
import saneness.baptize;

/* JADX INFO: loaded from: classes.dex */
public final class ad0 implements Runnable {
    public final /* synthetic */ float a;
    public final /* synthetic */ bd0 b;

    public ad0(bd0 bd0Var, float f) {
        this.b = bd0Var;
        this.a = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        baptize baptizeVar = this.b.a.e;
        float f = this.a;
        ax1 ax1Var = (ax1) baptizeVar;
        ax1Var.a = f;
        if (ax1Var.e == null) {
            ax1Var.e = s4.c;
        }
        Iterator it = Collections.unmodifiableCollection(ax1Var.e.b).iterator();
        while (it.hasNext()) {
            t4 t4Var = ((r4) it.next()).d;
            rv1.a.a((WebView) t4Var.b.get(), "setDeviceVolume", Float.valueOf(f), t4Var.a);
        }
    }
}
