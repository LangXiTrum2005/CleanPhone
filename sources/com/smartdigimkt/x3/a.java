package com.smartdigimkt.x3;

import android.net.NetworkInfo;
import android.view.Surface;
import com.smartdigimkt.e4.f;
import com.smartdigimkt.j4.f0;
import com.smartdigimkt.j4.s;
import com.smartdigimkt.j4.t;
import com.smartdigimkt.n4.d;
import com.smartdigimkt.q4.h;
import com.smartdigimkt.w3.e0;
import com.smartdigimkt.w3.m;
import com.smartdigimkt.w3.v;
import com.smartdigimkt.w3.w;
import com.smartdigimkt.y3.g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes6.dex */
public class a implements w.c, f, g, h, t, d.a, com.smartdigimkt.a4.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.smartdigimkt.p4.c f39898b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private w f39900e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArraySet<com.smartdigimkt.x3.b> f39897a = new CopyOnWriteArraySet<>();
    private final b d = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e0.c f39899c = new e0.c();

    /* JADX INFO: renamed from: com.smartdigimkt.x3.a$a, reason: collision with other inner class name */
    public static class C0638a {
        public a a(w wVar, com.smartdigimkt.p4.c cVar) {
            return new a(wVar, cVar);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private c f39903c;
        private c d;
        private boolean f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ArrayList<c> f39901a = new ArrayList<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final e0.b f39902b = new e0.b();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private e0 f39904e = e0.f39262a;

        private void h() {
            if (this.f39901a.isEmpty()) {
                return;
            }
            this.f39903c = this.f39901a.get(0);
        }

        public c b() {
            if (this.f39901a.isEmpty()) {
                return null;
            }
            return (c) android.support.v4.media.a.d(1, this.f39901a);
        }

        public c c() {
            if (this.f39901a.isEmpty() || this.f39904e.c() || this.f) {
                return null;
            }
            return this.f39901a.get(0);
        }

        public c d() {
            return this.d;
        }

        public boolean e() {
            return this.f;
        }

        public void f() {
            this.f = false;
            h();
        }

        public void g() {
            this.f = true;
        }

        public c a() {
            return this.f39903c;
        }

        public void a(int i2) {
            h();
        }

        public void c(int i2, s.a aVar) {
            this.d = new c(i2, aVar);
        }

        public void a(e0 e0Var) {
            for (int i2 = 0; i2 < this.f39901a.size(); i2++) {
                ArrayList<c> arrayList = this.f39901a;
                arrayList.set(i2, a(arrayList.get(i2), e0Var));
            }
            c cVar = this.d;
            if (cVar != null) {
                this.d = a(cVar, e0Var);
            }
            this.f39904e = e0Var;
            h();
        }

        public s.a b(int i2) {
            e0 e0Var = this.f39904e;
            if (e0Var == null) {
                return null;
            }
            int iA = e0Var.a();
            s.a aVar = null;
            for (int i3 = 0; i3 < this.f39901a.size(); i3++) {
                c cVar = this.f39901a.get(i3);
                int i4 = cVar.f39906b.f36015a;
                if (i4 < iA && this.f39904e.a(i4, this.f39902b).f39265c == i2) {
                    if (aVar != null) {
                        return null;
                    }
                    aVar = cVar.f39906b;
                }
            }
            return aVar;
        }

        public void a(int i2, s.a aVar) {
            this.f39901a.add(new c(i2, aVar));
            if (this.f39901a.size() != 1 || this.f39904e.c()) {
                return;
            }
            h();
        }

        private c a(c cVar, e0 e0Var) {
            int iA;
            return (e0Var.c() || this.f39904e.c() || (iA = e0Var.a(this.f39904e.a(cVar.f39906b.f36015a, this.f39902b, true).f39264b)) == -1) ? cVar : new c(e0Var.a(iA, this.f39902b).f39265c, cVar.f39906b.a(iA));
        }

        public void b(int i2, s.a aVar) {
            c cVar = new c(i2, aVar);
            this.f39901a.remove(cVar);
            if (cVar.equals(this.d)) {
                this.d = this.f39901a.isEmpty() ? null : this.f39901a.get(0);
            }
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f39905a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final s.a f39906b;

        public c(int i2, s.a aVar) {
            this.f39905a = i2;
            this.f39906b = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && c.class == obj.getClass()) {
                c cVar = (c) obj;
                if (this.f39905a == cVar.f39905a && this.f39906b.equals(cVar.f39906b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f39906b.hashCode() + (this.f39905a * 31);
        }
    }

    public a(w wVar, com.smartdigimkt.p4.c cVar) {
        this.f39900e = wVar;
        this.f39898b = (com.smartdigimkt.p4.c) com.smartdigimkt.p4.a.a(cVar);
    }

    private com.smartdigimkt.x3.b.a e() {
        return a(this.d.b());
    }

    private com.smartdigimkt.x3.b.a f() {
        return a(this.d.c());
    }

    private com.smartdigimkt.x3.b.a g() {
        return a(this.d.d());
    }

    public void a(com.smartdigimkt.x3.b bVar) {
        this.f39897a.add(bVar);
    }

    public void b(com.smartdigimkt.x3.b bVar) {
        this.f39897a.remove(bVar);
    }

    @Override // com.smartdigimkt.q4.h
    public final void c(com.smartdigimkt.z3.d dVar) {
        com.smartdigimkt.x3.b.a aVarD = d();
        Iterator<com.smartdigimkt.x3.b> it = this.f39897a.iterator();
        while (it.hasNext()) {
            it.next().a(aVarD, 2, dVar);
        }
    }

    @Override // com.smartdigimkt.q4.h
    public final void d(com.smartdigimkt.z3.d dVar) {
        com.smartdigimkt.x3.b.a aVarF = f();
        Iterator<com.smartdigimkt.x3.b> it = this.f39897a.iterator();
        while (it.hasNext()) {
            it.next().b(aVarF, 2, dVar);
        }
    }

    public Set<com.smartdigimkt.x3.b> h() {
        return Collections.unmodifiableSet(this.f39897a);
    }

    public final void i() {
        if (this.d.e()) {
            return;
        }
        com.smartdigimkt.x3.b.a aVarF = f();
        this.d.g();
        Iterator<com.smartdigimkt.x3.b> it = this.f39897a.iterator();
        while (it.hasNext()) {
            it.next().b(aVarF);
        }
    }

    public final void j() {
        for (c cVar : new ArrayList(this.d.f39901a)) {
            c(cVar.f39905a, cVar.f39906b);
        }
    }

    @Override // com.smartdigimkt.w3.w.c
    public final void onLoadingChanged(boolean z2) {
        com.smartdigimkt.x3.b.a aVarF = f();
        Iterator<com.smartdigimkt.x3.b> it = this.f39897a.iterator();
        while (it.hasNext()) {
            it.next().a(aVarF, z2);
        }
    }

    @Override // com.smartdigimkt.w3.w.c
    public final void onPlaybackParametersChanged(v vVar) {
        com.smartdigimkt.x3.b.a aVarF = f();
        Iterator<com.smartdigimkt.x3.b> it = this.f39897a.iterator();
        while (it.hasNext()) {
            it.next().a(aVarF, vVar);
        }
    }

    @Override // com.smartdigimkt.w3.w.c
    public final void onPlayerError(com.smartdigimkt.w3.g gVar) {
        com.smartdigimkt.x3.b.a aVarF = f();
        Iterator<com.smartdigimkt.x3.b> it = this.f39897a.iterator();
        while (it.hasNext()) {
            it.next().a(aVarF, gVar);
        }
    }

    @Override // com.smartdigimkt.w3.w.c
    public final void onPlayerStateChanged(boolean z2, int i2) {
        com.smartdigimkt.x3.b.a aVarF = f();
        Iterator<com.smartdigimkt.x3.b> it = this.f39897a.iterator();
        while (it.hasNext()) {
            it.next().a(aVarF, z2, i2);
        }
    }

    @Override // com.smartdigimkt.w3.w.c
    public final void onPositionDiscontinuity(int i2) {
        this.d.a(i2);
        com.smartdigimkt.x3.b.a aVarF = f();
        Iterator<com.smartdigimkt.x3.b> it = this.f39897a.iterator();
        while (it.hasNext()) {
            it.next().a(aVarF, i2);
        }
    }

    @Override // com.smartdigimkt.w3.w.c
    public final void onRepeatModeChanged(int i2) {
        com.smartdigimkt.x3.b.a aVarF = f();
        Iterator<com.smartdigimkt.x3.b> it = this.f39897a.iterator();
        while (it.hasNext()) {
            it.next().c(aVarF, i2);
        }
    }

    @Override // com.smartdigimkt.w3.w.c
    public final void onSeekProcessed() {
        if (this.d.e()) {
            this.d.f();
            com.smartdigimkt.x3.b.a aVarF = f();
            Iterator<com.smartdigimkt.x3.b> it = this.f39897a.iterator();
            while (it.hasNext()) {
                it.next().c(aVarF);
            }
        }
    }

    @Override // com.smartdigimkt.w3.w.c
    public final void onShuffleModeEnabledChanged(boolean z2) {
        com.smartdigimkt.x3.b.a aVarF = f();
        Iterator<com.smartdigimkt.x3.b> it = this.f39897a.iterator();
        while (it.hasNext()) {
            it.next().b(aVarF, z2);
        }
    }

    @Override // com.smartdigimkt.w3.w.c
    public final void onTimelineChanged(e0 e0Var, Object obj, int i2) {
        this.d.a(e0Var);
        com.smartdigimkt.x3.b.a aVarF = f();
        Iterator<com.smartdigimkt.x3.b> it = this.f39897a.iterator();
        while (it.hasNext()) {
            it.next().b(aVarF, i2);
        }
    }

    @Override // com.smartdigimkt.w3.w.c
    public final void onTracksChanged(f0 f0Var, com.smartdigimkt.m4.g gVar) {
        com.smartdigimkt.x3.b.a aVarF = f();
        Iterator<com.smartdigimkt.x3.b> it = this.f39897a.iterator();
        while (it.hasNext()) {
            it.next().a(aVarF, f0Var, gVar);
        }
    }

    public void a(w wVar) {
        com.smartdigimkt.p4.a.b(this.f39900e == null);
        this.f39900e = (w) com.smartdigimkt.p4.a.a(wVar);
    }

    @Override // com.smartdigimkt.y3.g
    public final void b(com.smartdigimkt.z3.d dVar) {
        com.smartdigimkt.x3.b.a aVarF = f();
        Iterator<com.smartdigimkt.x3.b> it = this.f39897a.iterator();
        while (it.hasNext()) {
            it.next().b(aVarF, 1, dVar);
        }
    }

    public final void a(int i2, int i3) {
        com.smartdigimkt.x3.b.a aVarF = f();
        Iterator<com.smartdigimkt.x3.b> it = this.f39897a.iterator();
        while (it.hasNext()) {
            it.next().a(aVarF, i2, i3);
        }
    }

    @Override // com.smartdigimkt.j4.t
    public final void c(int i2, s.a aVar) {
        this.d.b(i2, aVar);
        com.smartdigimkt.x3.b.a aVarD = d(i2, aVar);
        Iterator<com.smartdigimkt.x3.b> it = this.f39897a.iterator();
        while (it.hasNext()) {
            it.next().h(aVarD);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    public com.smartdigimkt.x3.b.a d(int i2, s.a aVar) {
        long jA;
        com.smartdigimkt.p4.a.a(this.f39900e);
        long jB = this.f39898b.b();
        e0 e0VarZ = this.f39900e.z();
        if (i2 == this.f39900e.D()) {
            if (aVar != null && aVar.a()) {
                if (this.f39900e.r() == aVar.f36016b && this.f39900e.t() == aVar.f36017c) {
                    jA = this.f39900e.F();
                } else {
                    jA = 0;
                }
            } else {
                jA = this.f39900e.e();
            }
        } else if (i2 >= e0VarZ.b() || (aVar != null && aVar.a())) {
            jA = 0;
        } else {
            jA = e0VarZ.a(i2, this.f39899c).a();
        }
        return new com.smartdigimkt.x3.b.a(jB, e0VarZ, i2, aVar, jA, this.f39900e.F(), this.f39900e.h() - this.f39900e.e());
    }

    @Override // com.smartdigimkt.y3.g
    public final void b(String str, long j, long j2) {
        com.smartdigimkt.x3.b.a aVarG = g();
        Iterator<com.smartdigimkt.x3.b> it = this.f39897a.iterator();
        while (it.hasNext()) {
            it.next().a(aVarG, 1, str, j2);
        }
    }

    public final void a(NetworkInfo networkInfo) {
        com.smartdigimkt.x3.b.a aVarF = f();
        Iterator<com.smartdigimkt.x3.b> it = this.f39897a.iterator();
        while (it.hasNext()) {
            it.next().a(aVarF, networkInfo);
        }
    }

    @Override // com.smartdigimkt.q4.h
    public final void b(m mVar) {
        com.smartdigimkt.x3.b.a aVarG = g();
        Iterator<com.smartdigimkt.x3.b> it = this.f39897a.iterator();
        while (it.hasNext()) {
            it.next().a(aVarG, 2, mVar);
        }
    }

    @Override // com.smartdigimkt.j4.t
    public final void c(int i2, s.a aVar, t.b bVar, t.c cVar) {
        com.smartdigimkt.x3.b.a aVarD = d(i2, aVar);
        Iterator<com.smartdigimkt.x3.b> it = this.f39897a.iterator();
        while (it.hasNext()) {
            it.next().a(aVarD, bVar, cVar);
        }
    }

    @Override // com.smartdigimkt.e4.f
    public final void a(com.smartdigimkt.e4.a aVar) {
        com.smartdigimkt.x3.b.a aVarF = f();
        Iterator<com.smartdigimkt.x3.b> it = this.f39897a.iterator();
        while (it.hasNext()) {
            it.next().a(aVarF, aVar);
        }
    }

    @Override // com.smartdigimkt.j4.t
    public final void b(int i2, s.a aVar) {
        this.d.a(i2, aVar);
        com.smartdigimkt.x3.b.a aVarD = d(i2, aVar);
        Iterator<com.smartdigimkt.x3.b> it = this.f39897a.iterator();
        while (it.hasNext()) {
            it.next().e(aVarD);
        }
    }

    @Override // com.smartdigimkt.a4.c
    public final void c() {
        com.smartdigimkt.x3.b.a aVarG = g();
        Iterator<com.smartdigimkt.x3.b> it = this.f39897a.iterator();
        while (it.hasNext()) {
            it.next().g(aVarG);
        }
    }

    @Override // com.smartdigimkt.y3.g
    public final void a(int i2) {
        com.smartdigimkt.x3.b.a aVarG = g();
        Iterator<com.smartdigimkt.x3.b> it = this.f39897a.iterator();
        while (it.hasNext()) {
            it.next().d(aVarG, i2);
        }
    }

    @Override // com.smartdigimkt.j4.t
    public final void b(int i2, s.a aVar, t.b bVar, t.c cVar) {
        com.smartdigimkt.x3.b.a aVarD = d(i2, aVar);
        Iterator<com.smartdigimkt.x3.b> it = this.f39897a.iterator();
        while (it.hasNext()) {
            it.next().b(aVarD, bVar, cVar);
        }
    }

    @Override // com.smartdigimkt.y3.g
    public final void a(m mVar) {
        com.smartdigimkt.x3.b.a aVarG = g();
        Iterator<com.smartdigimkt.x3.b> it = this.f39897a.iterator();
        while (it.hasNext()) {
            it.next().a(aVarG, 1, mVar);
        }
    }

    @Override // com.smartdigimkt.j4.t
    public final void b(int i2, s.a aVar, t.c cVar) {
        com.smartdigimkt.x3.b.a aVarD = d(i2, aVar);
        Iterator<com.smartdigimkt.x3.b> it = this.f39897a.iterator();
        while (it.hasNext()) {
            it.next().b(aVarD, cVar);
        }
    }

    @Override // com.smartdigimkt.y3.g
    public final void a(int i2, long j, long j2) {
        com.smartdigimkt.x3.b.a aVarG = g();
        Iterator<com.smartdigimkt.x3.b> it = this.f39897a.iterator();
        while (it.hasNext()) {
            it.next().a(aVarG, i2, j, j2);
        }
    }

    private com.smartdigimkt.x3.b.a d() {
        return a(this.d.a());
    }

    @Override // com.smartdigimkt.n4.d.a
    public final void b(int i2, long j, long j2) {
        com.smartdigimkt.x3.b.a aVarE = e();
        Iterator<com.smartdigimkt.x3.b> it = this.f39897a.iterator();
        while (it.hasNext()) {
            it.next().b(aVarE, i2, j, j2);
        }
    }

    @Override // com.smartdigimkt.y3.g
    public final void a(com.smartdigimkt.z3.d dVar) {
        com.smartdigimkt.x3.b.a aVarD = d();
        Iterator<com.smartdigimkt.x3.b> it = this.f39897a.iterator();
        while (it.hasNext()) {
            it.next().a(aVarD, 1, dVar);
        }
    }

    @Override // com.smartdigimkt.a4.c
    public final void b() {
        com.smartdigimkt.x3.b.a aVarG = g();
        Iterator<com.smartdigimkt.x3.b> it = this.f39897a.iterator();
        while (it.hasNext()) {
            it.next().a(aVarG);
        }
    }

    @Override // com.smartdigimkt.q4.h
    public final void a(String str, long j, long j2) {
        com.smartdigimkt.x3.b.a aVarG = g();
        Iterator<com.smartdigimkt.x3.b> it = this.f39897a.iterator();
        while (it.hasNext()) {
            it.next().a(aVarG, 2, str, j2);
        }
    }

    @Override // com.smartdigimkt.q4.h
    public final void a(int i2, long j) {
        com.smartdigimkt.x3.b.a aVarD = d();
        Iterator<com.smartdigimkt.x3.b> it = this.f39897a.iterator();
        while (it.hasNext()) {
            it.next().a(aVarD, i2, j);
        }
    }

    @Override // com.smartdigimkt.q4.h
    public final void a(int i2, int i3, int i4, float f) {
        com.smartdigimkt.x3.b.a aVarG = g();
        Iterator<com.smartdigimkt.x3.b> it = this.f39897a.iterator();
        while (it.hasNext()) {
            it.next().a(aVarG, i2, i3, i4, f);
        }
    }

    @Override // com.smartdigimkt.q4.h
    public final void a(Surface surface) {
        com.smartdigimkt.x3.b.a aVarG = g();
        Iterator<com.smartdigimkt.x3.b> it = this.f39897a.iterator();
        while (it.hasNext()) {
            it.next().a(aVarG, surface);
        }
    }

    @Override // com.smartdigimkt.j4.t
    public final void a(int i2, s.a aVar, t.b bVar, t.c cVar) {
        com.smartdigimkt.x3.b.a aVarD = d(i2, aVar);
        Iterator<com.smartdigimkt.x3.b> it = this.f39897a.iterator();
        while (it.hasNext()) {
            it.next().c(aVarD, bVar, cVar);
        }
    }

    @Override // com.smartdigimkt.j4.t
    public final void a(int i2, s.a aVar, t.b bVar, t.c cVar, IOException iOException, boolean z2) {
        com.smartdigimkt.x3.b.a aVarD = d(i2, aVar);
        Iterator<com.smartdigimkt.x3.b> it = this.f39897a.iterator();
        while (it.hasNext()) {
            it.next().a(aVarD, bVar, cVar, iOException, z2);
        }
    }

    @Override // com.smartdigimkt.j4.t
    public final void a(int i2, s.a aVar) {
        this.d.c(i2, aVar);
        com.smartdigimkt.x3.b.a aVarD = d(i2, aVar);
        Iterator<com.smartdigimkt.x3.b> it = this.f39897a.iterator();
        while (it.hasNext()) {
            it.next().f(aVarD);
        }
    }

    @Override // com.smartdigimkt.j4.t
    public final void a(int i2, s.a aVar, t.c cVar) {
        com.smartdigimkt.x3.b.a aVarD = d(i2, aVar);
        Iterator<com.smartdigimkt.x3.b> it = this.f39897a.iterator();
        while (it.hasNext()) {
            it.next().a(aVarD, cVar);
        }
    }

    @Override // com.smartdigimkt.a4.c
    public final void a(Exception exc) {
        com.smartdigimkt.x3.b.a aVarG = g();
        Iterator<com.smartdigimkt.x3.b> it = this.f39897a.iterator();
        while (it.hasNext()) {
            it.next().a(aVarG, exc);
        }
    }

    @Override // com.smartdigimkt.a4.c
    public final void a() {
        com.smartdigimkt.x3.b.a aVarG = g();
        Iterator<com.smartdigimkt.x3.b> it = this.f39897a.iterator();
        while (it.hasNext()) {
            it.next().d(aVarG);
        }
    }

    private com.smartdigimkt.x3.b.a a(c cVar) {
        if (cVar == null) {
            int iD = ((w) com.smartdigimkt.p4.a.a(this.f39900e)).D();
            return d(iD, this.d.b(iD));
        }
        return d(cVar.f39905a, cVar.f39906b);
    }
}
