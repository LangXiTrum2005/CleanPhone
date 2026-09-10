package l2;

import android.os.Handler;
import com.google.android.gms.internal.ads.xx1;
import i1.z0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f44941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p1.v f44942b;

    public v(Handler handler, p1.v vVar, int i10) {
        switch (i10) {
            case 1:
                this.f44941a = handler;
                this.f44942b = vVar;
                break;
            default:
                if (vVar != null) {
                    handler.getClass();
                } else {
                    handler = null;
                }
                this.f44941a = handler;
                this.f44942b = vVar;
                break;
        }
    }

    public void a(xx1 xx1Var) {
        synchronized (xx1Var) {
        }
        Handler handler = this.f44941a;
        if (handler != null) {
            handler.post(new u(18, this, xx1Var));
        }
    }

    public void b(z0 z0Var) {
        Handler handler = this.f44941a;
        if (handler != null) {
            handler.post(new u(1, this, z0Var));
        }
    }
}
