package g6;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements h, com.bumptech.glide.load.data.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f41557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f41558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f41559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f41560d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e6.f f41561e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f41562f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f41563g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile k6.q f41564h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public File f41565i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c0 f41566j;

    public b0(i iVar, j jVar) {
        this.f41558b = iVar;
        this.f41557a = jVar;
    }

    @Override // g6.h
    public final boolean a() {
        List list;
        ArrayList arrayListC;
        ArrayList arrayListA = this.f41558b.a();
        boolean z10 = false;
        if (!arrayListA.isEmpty()) {
            i iVar = this.f41558b;
            com.bumptech.glide.h hVarA = iVar.f41599c.a();
            Class<?> cls = iVar.f41600d.getClass();
            Class cls2 = iVar.f41603g;
            Class cls3 = iVar.f41607k;
            v6.c cVar = hVarA.f10487h;
            a7.n nVar = (a7.n) ((AtomicReference) cVar.f52487a).getAndSet(null);
            if (nVar == null) {
                nVar = new a7.n(cls, cls2, cls3);
            } else {
                nVar.f3440a = cls;
                nVar.f3441b = cls2;
                nVar.f3442c = cls3;
            }
            synchronized (((x.e) cVar.f52488b)) {
                list = (List) ((x.e) cVar.f52488b).get(nVar);
            }
            ((AtomicReference) cVar.f52487a).set(nVar);
            List list2 = list;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                k6.u uVar = hVarA.f10480a;
                synchronized (uVar) {
                    arrayListC = uVar.f44373a.c(cls);
                }
                Iterator it = arrayListC.iterator();
                while (it.hasNext()) {
                    for (Class cls4 : hVarA.f10482c.y((Class) it.next(), cls2)) {
                        if (!hVarA.f10485f.b(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                            arrayList.add(cls4);
                        }
                    }
                }
                v6.c cVar2 = hVarA.f10487h;
                List listUnmodifiableList = Collections.unmodifiableList(arrayList);
                synchronized (((x.e) cVar2.f52488b)) {
                    ((x.e) cVar2.f52488b).put(new a7.n(cls, cls2, cls3), listUnmodifiableList);
                }
                list2 = arrayList;
            }
            if (!list2.isEmpty()) {
                while (true) {
                    List list3 = this.f41562f;
                    if (list3 != null && this.f41563g < list3.size()) {
                        this.f41564h = null;
                        while (!z10 && this.f41563g < this.f41562f.size()) {
                            List list4 = this.f41562f;
                            int i10 = this.f41563g;
                            this.f41563g = i10 + 1;
                            k6.r rVar = (k6.r) list4.get(i10);
                            File file = this.f41565i;
                            i iVar2 = this.f41558b;
                            this.f41564h = rVar.b(file, iVar2.f41601e, iVar2.f41602f, iVar2.f41605i);
                            if (this.f41564h != null && this.f41558b.c(this.f41564h.f44371c.a()) != null) {
                                this.f41564h.f44371c.d(this.f41558b.f41610o, this);
                                z10 = true;
                            }
                        }
                        return z10;
                    }
                    int i11 = this.f41560d + 1;
                    this.f41560d = i11;
                    if (i11 >= list2.size()) {
                        int i12 = this.f41559c + 1;
                        this.f41559c = i12;
                        if (i12 >= arrayListA.size()) {
                            break;
                        }
                        this.f41560d = 0;
                    }
                    e6.f fVar = (e6.f) arrayListA.get(this.f41559c);
                    Class cls5 = (Class) list2.get(this.f41560d);
                    e6.m mVarE = this.f41558b.e(cls5);
                    i iVar3 = this.f41558b;
                    this.f41566j = new c0(iVar3.f41599c.f10466a, fVar, iVar3.f41609n, iVar3.f41601e, iVar3.f41602f, mVarE, cls5, iVar3.f41605i);
                    File fileJ = iVar3.f41604h.a().j(this.f41566j);
                    this.f41565i = fileJ;
                    if (fileJ != null) {
                        this.f41561e = fVar;
                        this.f41562f = this.f41558b.f41599c.a().f(fileJ);
                        this.f41563g = 0;
                    }
                }
            } else if (!File.class.equals(this.f41558b.f41607k)) {
                throw new IllegalStateException("Failed to find any load path from " + this.f41558b.f41600d.getClass() + " to " + this.f41558b.f41607k);
            }
        }
        return false;
    }

    @Override // g6.h
    public final void cancel() {
        k6.q qVar = this.f41564h;
        if (qVar != null) {
            qVar.f44371c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void h(Exception exc) {
        this.f41557a.c(this.f41566j, exc, this.f41564h.f44371c, 4);
    }

    @Override // com.bumptech.glide.load.data.d
    public final void z0(Object obj) {
        this.f41557a.b(this.f41561e, obj, this.f41564h.f44371c, 4, this.f41566j);
    }
}
