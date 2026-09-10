package x0;

import android.os.Build;
import java.util.ArrayList;
import zc.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends com.bumptech.glide.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vb.b f53512a;

    public c(vb.b bVar) {
        this.f53512a = bVar;
    }

    @Override // com.bumptech.glide.c
    public final void y(Throwable th2) {
        ((g) this.f53512a.f52530a).d(th2);
    }

    @Override // com.bumptech.glide.c
    public final void z(u uVar) {
        vb.b bVar = this.f53512a;
        bVar.f52532c = uVar;
        u uVar2 = (u) bVar.f52532c;
        g gVar = (g) bVar.f52530a;
        bVar.f52531b = new qd.i(uVar2, gVar.f53521g, gVar.f53523i, Build.VERSION.SDK_INT >= 34 ? j.a() : com.bumptech.glide.d.x());
        g gVar2 = (g) bVar.f52530a;
        gVar2.getClass();
        ArrayList arrayList = new ArrayList();
        gVar2.f53515a.writeLock().lock();
        try {
            gVar2.f53517c = 1;
            arrayList.addAll(gVar2.f53516b);
            gVar2.f53516b.clear();
            gVar2.f53515a.writeLock().unlock();
            gVar2.f53518d.post(new com.google.android.gms.common.api.internal.q(arrayList, gVar2.f53517c, (Throwable) null));
        } catch (Throwable th2) {
            gVar2.f53515a.writeLock().unlock();
            throw th2;
        }
    }
}
