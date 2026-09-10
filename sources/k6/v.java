package k6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements com.bumptech.glide.load.data.e, com.bumptech.glide.load.data.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f44375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0.b f44376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f44377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.bumptech.glide.f f44378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.bumptech.glide.load.data.d f44379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f44380f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f44381g;

    public v(ArrayList arrayList, l0.b bVar) {
        this.f44376b = bVar;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f44375a = arrayList;
        this.f44377c = 0;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return ((com.bumptech.glide.load.data.e) this.f44375a.get(0)).a();
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
        List list = this.f44380f;
        if (list != null) {
            this.f44376b.e(list);
        }
        this.f44380f = null;
        Iterator it = this.f44375a.iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.load.data.e) it.next()).b();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final int c() {
        return ((com.bumptech.glide.load.data.e) this.f44375a.get(0)).c();
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        this.f44381g = true;
        Iterator it = this.f44375a.iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.load.data.e) it.next()).cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void d(com.bumptech.glide.f fVar, com.bumptech.glide.load.data.d dVar) {
        this.f44378d = fVar;
        this.f44379e = dVar;
        this.f44380f = (List) this.f44376b.g();
        ((com.bumptech.glide.load.data.e) this.f44375a.get(this.f44377c)).d(fVar, this);
        if (this.f44381g) {
            cancel();
        }
    }

    public final void e() {
        if (this.f44381g) {
            return;
        }
        if (this.f44377c < this.f44375a.size() - 1) {
            this.f44377c++;
            d(this.f44378d, this.f44379e);
        } else {
            a7.h.b(this.f44380f);
            this.f44379e.h(new g6.w("Fetch failed", new ArrayList(this.f44380f)));
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void h(Exception exc) {
        List list = this.f44380f;
        a7.h.c(list, "Argument must not be null");
        list.add(exc);
        e();
    }

    @Override // com.bumptech.glide.load.data.d
    public final void z0(Object obj) {
        if (obj != null) {
            this.f44379e.z0(obj);
        } else {
            e();
        }
    }
}
