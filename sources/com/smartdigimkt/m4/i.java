package com.smartdigimkt.m4;

import com.smartdigimkt.p4.f0;
import com.smartdigimkt.w3.a0;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0[] f36691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f36692c;
    public final Object d;

    public i(a0[] a0VarArr, f[] fVarArr, Object obj) {
        this.f36691b = a0VarArr;
        this.f36692c = new g(fVarArr);
        this.d = obj;
        this.f36690a = a0VarArr.length;
    }

    public boolean a(int i2) {
        return this.f36691b[i2] != null;
    }

    public boolean a(i iVar) {
        if (iVar == null || iVar.f36692c.f36686a != this.f36692c.f36686a) {
            return false;
        }
        for (int i2 = 0; i2 < this.f36692c.f36686a; i2++) {
            if (!a(iVar, i2)) {
                return false;
            }
        }
        return true;
    }

    public boolean a(i iVar, int i2) {
        return iVar != null && f0.a(this.f36691b[i2], iVar.f36691b[i2]) && f0.a(this.f36692c.a(i2), iVar.f36692c.a(i2));
    }
}
