package com.smartdigimkt.j4;

import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class v extends f<Integer> {
    private static final int q0 = -1;
    private final s[] j0;
    private final ArrayList<s> k0;
    private final h l0;
    private com.smartdigimkt.w3.e0 m0;
    private Object n0;
    private int o0;
    private a p0;

    public static final class a extends IOException {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f36040b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f36041a;

        /* JADX INFO: renamed from: com.smartdigimkt.j4.v$a$a, reason: collision with other inner class name */
        @Retention(RetentionPolicy.SOURCE)
        public @interface InterfaceC0511a {
        }

        public a(int i2) {
            this.f36041a = i2;
        }
    }

    public v(s... sVarArr) {
        this(new j(), sVarArr);
    }

    @Override // com.smartdigimkt.j4.f, com.smartdigimkt.j4.s
    public void b() throws IOException {
        a aVar = this.p0;
        if (aVar != null) {
            throw aVar;
        }
        super.b();
    }

    @Override // com.smartdigimkt.j4.f, com.smartdigimkt.j4.c
    public void g() {
        super.g();
        this.m0 = null;
        this.n0 = null;
        this.o0 = -1;
        this.p0 = null;
        this.k0.clear();
        Collections.addAll(this.k0, this.j0);
    }

    public v(h hVar, s... sVarArr) {
        this.j0 = sVarArr;
        this.l0 = hVar;
        this.k0 = new ArrayList<>(Arrays.asList(sVarArr));
        this.o0 = -1;
    }

    @Override // com.smartdigimkt.j4.f, com.smartdigimkt.j4.c
    public void a(com.smartdigimkt.w3.h hVar, boolean z2) {
        super.a(hVar, z2);
        for (int i2 = 0; i2 < this.j0.length; i2++) {
            a(Integer.valueOf(i2), this.j0[i2]);
        }
    }

    @Override // com.smartdigimkt.j4.s
    public r a(s.a aVar, com.smartdigimkt.n4.b bVar) {
        int length = this.j0.length;
        r[] rVarArr = new r[length];
        for (int i2 = 0; i2 < length; i2++) {
            rVarArr[i2] = this.j0[i2].a(aVar, bVar);
        }
        return new u(this.l0, rVarArr);
    }

    @Override // com.smartdigimkt.j4.s
    public void a(r rVar) {
        u uVar = (u) rVar;
        int i2 = 0;
        while (true) {
            s[] sVarArr = this.j0;
            if (i2 >= sVarArr.length) {
                return;
            }
            sVarArr[i2].a(uVar.X[i2]);
            i2++;
        }
    }

    @Override // com.smartdigimkt.j4.f
    public void a(Integer num, s sVar, com.smartdigimkt.w3.e0 e0Var, Object obj) {
        if (this.p0 == null) {
            this.p0 = a(e0Var);
        }
        if (this.p0 != null) {
            return;
        }
        this.k0.remove(sVar);
        if (sVar == this.j0[0]) {
            this.m0 = e0Var;
            this.n0 = obj;
        }
        if (this.k0.isEmpty()) {
            a(this.m0, this.n0);
        }
    }

    private a a(com.smartdigimkt.w3.e0 e0Var) {
        if (this.o0 == -1) {
            this.o0 = e0Var.a();
            return null;
        }
        if (e0Var.a() != this.o0) {
            return new a(0);
        }
        return null;
    }
}
