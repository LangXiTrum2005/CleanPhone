package com.applovin.impl;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t8 implements s.a, u4.b, v0.c, u3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9806b;

    public /* synthetic */ t8(Object obj, int i10) {
        this.f9805a = i10;
        this.f9806b = obj;
    }

    @Override // com.applovin.impl.u3.b
    public Object a(Object obj) {
        return w3.a((Long) this.f9806b, (Long) obj);
    }

    @Override // s.a
    public Object apply(Object obj) {
        int i10 = this.f9805a;
        Object obj2 = this.f9806b;
        switch (i10) {
            case 0:
                return ((a3) obj2).c((j5) obj);
            default:
                return ((r7) obj2).o((j5) obj);
        }
    }

    @Override // com.applovin.impl.v0.c
    public void a(v0.b bVar) {
        ((v0) this.f9806b).a(bVar);
    }

    @Override // com.applovin.impl.u4.b
    public void a(boolean z10, Object obj, Object obj2) {
        int i10 = this.f9805a;
        Object obj3 = this.f9806b;
        switch (i10) {
            case 1:
                ((e6) obj3).a(z10, (r2) obj, (Exception) obj2);
                break;
            case 2:
            default:
                ((y1) obj3).a(z10, (Void) obj, (Void) obj2);
                break;
            case 3:
                u4.a((Runnable) obj3, z10, obj, obj2);
                break;
            case 4:
                u4.a((u4.a) obj3, z10, obj, obj2);
                break;
        }
    }
}
