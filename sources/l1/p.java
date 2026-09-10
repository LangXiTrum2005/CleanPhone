package l1;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static p f44803f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f44804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f44805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f44806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f44807d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f44808e;

    public p(Context context) {
        Executor executorG = a.g();
        this.f44804a = executorG;
        this.f44805b = new CopyOnWriteArrayList();
        this.f44806c = new Object();
        this.f44807d = 0;
        executorG.execute(new com.unity3d.services.ads.operation.show.b(25, this, context));
    }

    public static synchronized p a(Context context) {
        try {
            if (f44803f == null) {
                f44803f = new p(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f44803f;
    }

    public final int b() {
        int i10;
        synchronized (this.f44806c) {
            i10 = this.f44807d;
        }
        return i10;
    }

    public final void c(int i10) {
        CopyOnWriteArrayList<o> copyOnWriteArrayList = this.f44805b;
        for (o oVar : copyOnWriteArrayList) {
            if (oVar.f44800a.get() == null) {
                copyOnWriteArrayList.remove(oVar);
            }
        }
        synchronized (this.f44806c) {
            try {
                if (this.f44808e && this.f44807d == i10) {
                    return;
                }
                this.f44808e = true;
                this.f44807d = i10;
                for (o oVar2 : this.f44805b) {
                    oVar2.f44801b.execute(new com.mbridge.msdk.config.component.info.provider.subprovider.f(oVar2, 19));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
