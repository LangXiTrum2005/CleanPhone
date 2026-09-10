package com.smartdigimkt.m4;

import com.smartdigimkt.j4.f0;
import com.smartdigimkt.w3.z;

/* JADX INFO: loaded from: classes4.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f36689a;

    public interface a {
        void a();
    }

    public abstract i a(z[] zVarArr, f0 f0Var) throws com.smartdigimkt.w3.g;

    public final void a(a aVar) {
        this.f36689a = aVar;
    }

    public abstract void a(Object obj);

    public final void a() {
        a aVar = this.f36689a;
        if (aVar != null) {
            aVar.a();
        }
    }
}
