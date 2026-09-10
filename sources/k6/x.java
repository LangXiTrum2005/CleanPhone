package k6;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a0 f44385e = new a0(10);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b0 f44386f = new b0(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v9.e f44390d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f44387a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f44389c = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f44388b = f44385e;

    public x(v9.e eVar) {
        this.f44390d = eVar;
    }

    public final synchronized ArrayList a(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (w wVar : this.f44387a) {
                if (!this.f44389c.contains(wVar) && wVar.f44382a.isAssignableFrom(cls)) {
                    this.f44389c.add(wVar);
                    arrayList.add(wVar.f44384c.M(this));
                    this.f44389c.remove(wVar);
                }
            }
        } catch (Throwable th2) {
            this.f44389c.clear();
            throw th2;
        }
        return arrayList;
    }

    public final synchronized r b(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z10 = false;
            for (w wVar : this.f44387a) {
                if (this.f44389c.contains(wVar)) {
                    z10 = true;
                } else if (wVar.f44382a.isAssignableFrom(cls) && wVar.f44383b.isAssignableFrom(cls2)) {
                    this.f44389c.add(wVar);
                    arrayList.add(wVar.f44384c.M(this));
                    this.f44389c.remove(wVar);
                }
            }
            if (arrayList.size() > 1) {
                a0 a0Var = this.f44388b;
                v9.e eVar = this.f44390d;
                a0Var.getClass();
                return new b(2, arrayList, eVar);
            }
            if (arrayList.size() == 1) {
                return (r) arrayList.get(0);
            }
            if (z10) {
                return f44386f;
            }
            throw new com.bumptech.glide.g("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        } catch (Throwable th2) {
            this.f44389c.clear();
            throw th2;
        }
    }

    public final synchronized ArrayList c(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (w wVar : this.f44387a) {
            if (!arrayList.contains(wVar.f44383b) && wVar.f44382a.isAssignableFrom(cls)) {
                arrayList.add(wVar.f44383b);
            }
        }
        return arrayList;
    }
}
