package n5;

import android.content.Context;
import androidx.work.ListenableWorker;
import com.google.android.gms.internal.consent_sdk.m7;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o5.j f46540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f46541c;

    public /* synthetic */ m(n nVar, o5.j jVar, int i10) {
        this.f46539a = i10;
        this.f46541c = nVar;
        this.f46540b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f46539a) {
            case 0:
                this.f46540b.j(this.f46541c.f46546d.getForegroundInfoAsync());
                return;
            default:
                n nVar = this.f46541c;
                o5.j jVar = nVar.f46543a;
                ListenableWorker listenableWorker = nVar.f46546d;
                m5.i iVar = nVar.f46545c;
                try {
                    d5.h hVar = (d5.h) this.f46540b.get();
                    if (hVar == null) {
                        throw new IllegalStateException("Worker was marked important (" + iVar.f45884c + ") but did not provide ForegroundInfo");
                    }
                    d5.o.g().e(n.f46542g, "Updating notification for " + iVar.f45884c, new Throwable[0]);
                    listenableWorker.setRunInForeground(true);
                    o oVar = nVar.f46547e;
                    Context context = nVar.f46544b;
                    UUID id2 = listenableWorker.getId();
                    oVar.getClass();
                    o5.j jVar2 = new o5.j();
                    ((g9.k) oVar.f46549a).k(new m7(oVar, jVar2, id2, hVar, context, 4, false));
                    jVar.j(jVar2);
                    return;
                } catch (Throwable th2) {
                    jVar.i(th2);
                    return;
                }
        }
    }
}
