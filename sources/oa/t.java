package oa;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class t extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f47311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f47312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f47313c;

    public t(u uVar, int i10) {
        this.f47313c = uVar;
        Object obj = u.f47315j;
        this.f47311a = uVar.p()[i10];
        this.f47312b = i10;
    }

    public final void d() {
        int i10 = this.f47312b;
        Object obj = this.f47311a;
        u uVar = this.f47313c;
        if (i10 != -1 && i10 < uVar.size()) {
            if (d0.c.h(obj, uVar.p()[this.f47312b])) {
                return;
            }
        }
        Object obj2 = u.f47315j;
        this.f47312b = uVar.i(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f47311a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        u uVar = this.f47313c;
        Map mapG = uVar.g();
        if (mapG != null) {
            return mapG.get(this.f47311a);
        }
        d();
        int i10 = this.f47312b;
        if (i10 == -1) {
            return null;
        }
        return uVar.q()[i10];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        u uVar = this.f47313c;
        Map mapG = uVar.g();
        Object obj2 = this.f47311a;
        if (mapG != null) {
            return mapG.put(obj2, obj);
        }
        d();
        int i10 = this.f47312b;
        if (i10 == -1) {
            uVar.put(obj2, obj);
            return null;
        }
        Object obj3 = uVar.q()[i10];
        uVar.q()[this.f47312b] = obj;
        return obj3;
    }
}
