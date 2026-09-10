package com.smartdigimkt.j4;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements s {
    private final ArrayList<s.b> X = new ArrayList<>(1);

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private final t.a f35945Y = new t.a();
    private com.smartdigimkt.w3.h Z;
    private com.smartdigimkt.w3.e0 e0;
    private Object f0;

    public final void a(com.smartdigimkt.w3.e0 e0Var, Object obj) {
        this.e0 = e0Var;
        this.f0 = obj;
        Iterator<s.b> it = this.X.iterator();
        while (it.hasNext()) {
            it.next().a(this, e0Var, obj);
        }
    }

    public abstract void a(com.smartdigimkt.w3.h hVar, boolean z2);

    public abstract void g();

    public final t.a a(s.a aVar) {
        return this.f35945Y.a(0, aVar, 0L);
    }

    public final t.a a(s.a aVar, long j) {
        com.smartdigimkt.p4.a.a(aVar != null);
        return this.f35945Y.a(0, aVar, j);
    }

    public final t.a a(int i2, s.a aVar, long j) {
        return this.f35945Y.a(i2, aVar, j);
    }

    @Override // com.smartdigimkt.j4.s
    public final void a(Handler handler, t tVar) {
        this.f35945Y.a(handler, tVar);
    }

    @Override // com.smartdigimkt.j4.s
    public final void a(t tVar) {
        this.f35945Y.a(tVar);
    }

    @Override // com.smartdigimkt.j4.s
    public final void a(com.smartdigimkt.w3.h hVar, boolean z2, s.b bVar) {
        com.smartdigimkt.w3.h hVar2 = this.Z;
        com.smartdigimkt.p4.a.a(hVar2 == null || hVar2 == hVar);
        this.X.add(bVar);
        if (this.Z == null) {
            this.Z = hVar;
            a(hVar, z2);
        } else {
            com.smartdigimkt.w3.e0 e0Var = this.e0;
            if (e0Var != null) {
                bVar.a(this, e0Var, this.f0);
            }
        }
    }

    @Override // com.smartdigimkt.j4.s
    public final void a(s.b bVar) {
        this.X.remove(bVar);
        if (this.X.isEmpty()) {
            this.Z = null;
            this.e0 = null;
            this.f0 = null;
            g();
        }
    }
}
