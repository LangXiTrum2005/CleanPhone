package com.smartdigimkt.j4;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class f<T> extends com.smartdigimkt.j4.c {
    private final HashMap<T, c> g0 = new HashMap<>();
    private com.smartdigimkt.w3.h h0;
    private Handler i0;

    public class a implements s.b {
        final /* synthetic */ Object X;

        public a(Object obj) {
            this.X = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.smartdigimkt.j4.s.b
        public void a(s sVar, com.smartdigimkt.w3.e0 e0Var, Object obj) {
            f.this.a(this.X, sVar, e0Var, obj);
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s f35971a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final s.b f35972b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final t f35973c;

        public c(s sVar, s.b bVar, t tVar) {
            this.f35971a = sVar;
            this.f35972b = bVar;
            this.f35973c = tVar;
        }
    }

    public int a(T t, int i2) {
        return i2;
    }

    public abstract void a(T t, s sVar, com.smartdigimkt.w3.e0 e0Var, Object obj);

    @Override // com.smartdigimkt.j4.s
    public void b() throws IOException {
        Iterator<c> it = this.g0.values().iterator();
        while (it.hasNext()) {
            it.next().f35971a.b();
        }
    }

    @Override // com.smartdigimkt.j4.c
    public void g() {
        for (c cVar : this.g0.values()) {
            cVar.f35971a.a(cVar.f35972b);
            cVar.f35971a.a(cVar.f35973c);
        }
        this.g0.clear();
        this.h0 = null;
    }

    public final class b implements t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final T f35968a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private t.a f35969b;

        public b(T t) {
            this.f35969b = f.this.a((s.a) null);
            this.f35968a = t;
        }

        private boolean d(int i2, s.a aVar) {
            s.a aVarA;
            if (aVar != null) {
                aVarA = f.this.a(this.f35968a, aVar);
                if (aVarA == null) {
                    return false;
                }
            } else {
                aVarA = null;
            }
            int iA = f.this.a((Object) this.f35968a, i2);
            t.a aVar2 = this.f35969b;
            if (aVar2.f36018a == iA && com.smartdigimkt.p4.f0.a(aVar2.f36019b, aVarA)) {
                return true;
            }
            this.f35969b = f.this.a(iA, aVarA, 0L);
            return true;
        }

        @Override // com.smartdigimkt.j4.t
        public void a(int i2, s.a aVar, t.b bVar, t.c cVar) {
            if (d(i2, aVar)) {
                this.f35969b.c(bVar, a(cVar));
            }
        }

        @Override // com.smartdigimkt.j4.t
        public void b(int i2, s.a aVar) {
            if (d(i2, aVar)) {
                this.f35969b.a();
            }
        }

        @Override // com.smartdigimkt.j4.t
        public void c(int i2, s.a aVar) {
            if (d(i2, aVar)) {
                this.f35969b.b();
            }
        }

        @Override // com.smartdigimkt.j4.t
        public void a(int i2, s.a aVar, t.b bVar, t.c cVar, IOException iOException, boolean z2) {
            if (d(i2, aVar)) {
                this.f35969b.a(bVar, a(cVar), iOException, z2);
            }
        }

        @Override // com.smartdigimkt.j4.t
        public void b(int i2, s.a aVar, t.b bVar, t.c cVar) {
            if (d(i2, aVar)) {
                this.f35969b.b(bVar, a(cVar));
            }
        }

        @Override // com.smartdigimkt.j4.t
        public void c(int i2, s.a aVar, t.b bVar, t.c cVar) {
            if (d(i2, aVar)) {
                this.f35969b.a(bVar, a(cVar));
            }
        }

        @Override // com.smartdigimkt.j4.t
        public void b(int i2, s.a aVar, t.c cVar) {
            if (d(i2, aVar)) {
                this.f35969b.a(a(cVar));
            }
        }

        @Override // com.smartdigimkt.j4.t
        public void a(int i2, s.a aVar) {
            if (d(i2, aVar)) {
                this.f35969b.c();
            }
        }

        @Override // com.smartdigimkt.j4.t
        public void a(int i2, s.a aVar, t.c cVar) {
            if (d(i2, aVar)) {
                this.f35969b.b(a(cVar));
            }
        }

        private t.c a(t.c cVar) {
            long jA = f.this.a(this.f35968a, cVar.f);
            long jA2 = f.this.a(this.f35968a, cVar.g);
            return (jA == cVar.f && jA2 == cVar.g) ? cVar : new t.c(cVar.f36035a, cVar.f36036b, cVar.f36037c, cVar.d, cVar.f36038e, jA, jA2);
        }
    }

    public long a(T t, long j) {
        return j;
    }

    public s.a a(T t, s.a aVar) {
        return aVar;
    }

    @Override // com.smartdigimkt.j4.c
    public void a(com.smartdigimkt.w3.h hVar, boolean z2) {
        this.h0 = hVar;
        this.i0 = new Handler();
    }

    public final void a(T t, s sVar) {
        com.smartdigimkt.p4.a.a(!this.g0.containsKey(t));
        a aVar = new a(t);
        b bVar = new b(t);
        this.g0.put(t, new c(sVar, aVar, bVar));
        sVar.a(this.i0, bVar);
        sVar.a(this.h0, false, aVar);
    }

    public final void a(T t) {
        c cVarRemove = this.g0.remove(t);
        cVarRemove.f35971a.a(cVarRemove.f35972b);
        cVarRemove.f35971a.a(cVarRemove.f35973c);
    }
}
