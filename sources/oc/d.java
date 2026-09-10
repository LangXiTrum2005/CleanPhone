package oc;

import java.util.Date;
import java.util.HashMap;
import mc.g;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements nc.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f47367f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f47368g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f47370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f47371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f47372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f47373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f47366e = new a(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f47369h = new c();

    /* JADX WARN: Type inference failed for: r0v1, types: [oc.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [oc.b] */
    static {
        final int i10 = 0;
        f47367f = new mc.f() { // from class: oc.b
            @Override // mc.a
            public final void a(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        ((g) obj2).b((String) obj);
                        break;
                    default:
                        ((g) obj2).d(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i11 = 1;
        f47368g = new mc.f() { // from class: oc.b
            @Override // mc.a
            public final void a(Object obj, Object obj2) {
                switch (i11) {
                    case 0:
                        ((g) obj2).b((String) obj);
                        break;
                    default:
                        ((g) obj2).d(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public d() {
        HashMap map = new HashMap();
        this.f47370a = map;
        HashMap map2 = new HashMap();
        this.f47371b = map2;
        this.f47372c = f47366e;
        this.f47373d = false;
        map2.put(String.class, f47367f);
        map.remove(String.class);
        map2.put(Boolean.class, f47368g);
        map.remove(Boolean.class);
        map2.put(Date.class, f47369h);
        map.remove(Date.class);
    }

    public final nc.a a(Class cls, mc.d dVar) {
        this.f47370a.put(cls, dVar);
        this.f47371b.remove(cls);
        return this;
    }
}
