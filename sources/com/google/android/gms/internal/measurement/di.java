package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class di {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bi f23396e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ci f23397f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f23398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f23399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bi f23400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ci f23401d;

    static {
        int i10 = 0;
        f23396e = new bi(i10);
        f23397f = new ci(i10);
    }

    public di(di diVar) {
        HashMap map = new HashMap();
        this.f23398a = map;
        HashMap map2 = new HashMap();
        this.f23399b = map2;
        map.putAll(diVar.f23398a);
        map2.putAll(diVar.f23399b);
        this.f23400c = diVar.f23400c;
        this.f23401d = diVar.f23401d;
    }

    public void a(mh mhVar, Object obj, yh yhVar) {
        bi biVar = (bi) this.f23398a.get(mhVar);
        if (biVar != null) {
            biVar.a(mhVar, obj, yhVar);
        } else {
            this.f23400c.a(mhVar, obj, yhVar);
        }
    }

    public void b(mh mhVar, Iterator it, yh yhVar) {
        ci ciVar = (ci) this.f23399b.get(mhVar);
        if (ciVar != null) {
            ciVar.a(mhVar, it, yhVar);
            return;
        }
        ci ciVar2 = this.f23401d;
        if (ciVar2 != null && !this.f23398a.containsKey(mhVar)) {
            ciVar2.a(mhVar, it, yhVar);
        } else {
            while (it.hasNext()) {
                a(mhVar, it.next(), yhVar);
            }
        }
    }

    public /* synthetic */ di() {
        this.f23398a = new HashMap();
        this.f23399b = new HashMap();
        this.f23401d = null;
        this.f23400c = yg.f24182a;
    }
}
