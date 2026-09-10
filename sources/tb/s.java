package tb;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class s implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f50717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f50718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f50719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f50720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f50721e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set f50722f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f50723g;

    public s(a aVar, b bVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        Set<h> set = aVar.f50675c;
        Set set2 = aVar.f50679g;
        for (h hVar : set) {
            int i10 = hVar.f50697c;
            int i11 = hVar.f50696b;
            boolean z10 = i10 == 0;
            q qVar = hVar.f50695a;
            if (z10) {
                if (i11 == 2) {
                    hashSet4.add(qVar);
                } else {
                    hashSet.add(qVar);
                }
            } else if (i10 == 2) {
                hashSet3.add(qVar);
            } else if (i11 == 2) {
                hashSet5.add(qVar);
            } else {
                hashSet2.add(qVar);
            }
        }
        if (!set2.isEmpty()) {
            hashSet.add(q.a(qc.c.class));
        }
        this.f50717a = Collections.unmodifiableSet(hashSet);
        this.f50718b = Collections.unmodifiableSet(hashSet2);
        this.f50719c = Collections.unmodifiableSet(hashSet3);
        this.f50720d = Collections.unmodifiableSet(hashSet4);
        this.f50721e = Collections.unmodifiableSet(hashSet5);
        this.f50722f = set2;
        this.f50723g = bVar;
    }

    @Override // tb.b
    public final Object a(Class cls) {
        if (this.f50717a.contains(q.a(cls))) {
            Object objA = this.f50723g.a(cls);
            return !cls.equals(qc.c.class) ? objA : new r(this.f50722f, (qc.c) objA);
        }
        throw new aa.b("Attempting to request an undeclared dependency " + cls + ".", 18);
    }

    @Override // tb.b
    public final tc.b b(q qVar) {
        if (this.f50718b.contains(qVar)) {
            return this.f50723g.b(qVar);
        }
        throw new aa.b("Attempting to request an undeclared dependency Provider<" + qVar + ">.", 18);
    }

    @Override // tb.b
    public final o c(q qVar) {
        if (this.f50719c.contains(qVar)) {
            return this.f50723g.c(qVar);
        }
        throw new aa.b("Attempting to request an undeclared dependency Deferred<" + qVar + ">.", 18);
    }

    @Override // tb.b
    public final tc.b d(Class cls) {
        return b(q.a(cls));
    }

    @Override // tb.b
    public final tc.b e(q qVar) {
        if (this.f50721e.contains(qVar)) {
            return this.f50723g.e(qVar);
        }
        throw new aa.b("Attempting to request an undeclared dependency Provider<Set<" + qVar + ">>.", 18);
    }

    @Override // tb.b
    public final Set f(q qVar) {
        if (this.f50720d.contains(qVar)) {
            return this.f50723g.f(qVar);
        }
        throw new aa.b("Attempting to request an undeclared dependency Set<" + qVar + ">.", 18);
    }

    @Override // tb.b
    public final Object g(q qVar) {
        if (this.f50717a.contains(qVar)) {
            return this.f50723g.g(qVar);
        }
        throw new aa.b("Attempting to request an undeclared dependency " + qVar + ".", 18);
    }

    public final o h(Class cls) {
        return c(q.a(cls));
    }
}
