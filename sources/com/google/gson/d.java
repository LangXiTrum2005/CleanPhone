package com.google.gson;

import be.a1;
import be.b0;
import be.g0;
import be.i1;
import be.v;
import be.y0;
import eb.d0;
import java.io.EOFException;
import java.io.IOException;
import java.io.Serializable;
import java.io.StringReader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f24742h = a.f24735d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final n f24743i = r.f24756a;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final o f24744j = r.f24757b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadLocal f24745a = new ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f24746b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0 f24747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final be.l f24748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f24749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f24750f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f24751g;

    public d(ae.e eVar, HashMap map, a aVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, r rVar, r rVar2, ArrayList arrayList4) {
        d0 d0Var = new d0((Object) map, false, (Object) arrayList4, 1);
        this.f24747c = d0Var;
        this.f24750f = true;
        this.f24751g = aVar;
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(i1.A);
        arrayList5.add(rVar == r.f24756a ? be.u.f5676c : new be.s(rVar, 1));
        arrayList5.add(eVar);
        arrayList5.addAll(arrayList3);
        arrayList5.add(i1.f5637p);
        arrayList5.add(i1.f5629g);
        arrayList5.add(i1.f5626d);
        arrayList5.add(i1.f5627e);
        arrayList5.add(i1.f5628f);
        g0 g0Var = i1.f5633k;
        arrayList5.add(new a1(Long.TYPE, Long.class, g0Var));
        arrayList5.add(new a1(Double.TYPE, Double.class, new v(1)));
        arrayList5.add(new a1(Float.TYPE, Float.class, new v(2)));
        arrayList5.add(rVar2 == r.f24757b ? be.t.f5674b : new be.s(new be.t(rVar2), 0));
        arrayList5.add(i1.f5630h);
        arrayList5.add(i1.f5631i);
        arrayList5.add(new y0(AtomicLong.class, new b(g0Var, 0).a(), 0));
        int i10 = 0;
        arrayList5.add(new y0(AtomicLongArray.class, new b(g0Var, 1).a(), i10));
        arrayList5.add(i1.f5632j);
        arrayList5.add(i1.l);
        arrayList5.add(i1.f5638q);
        arrayList5.add(i1.f5639r);
        arrayList5.add(new y0(BigDecimal.class, i1.f5634m, i10));
        arrayList5.add(new y0(BigInteger.class, i1.f5635n, i10));
        arrayList5.add(new y0(ae.k.class, i1.f5636o, i10));
        arrayList5.add(i1.f5640s);
        arrayList5.add(i1.f5641t);
        arrayList5.add(i1.f5643v);
        arrayList5.add(i1.f5644w);
        arrayList5.add(i1.f5646y);
        arrayList5.add(i1.f5642u);
        arrayList5.add(i1.f5624b);
        arrayList5.add(be.h.f5620c);
        arrayList5.add(i1.f5645x);
        if (ee.f.f40033a) {
            arrayList5.add(ee.f.f40035c);
            arrayList5.add(ee.f.f40034b);
            arrayList5.add(ee.f.f40036d);
        }
        arrayList5.add(be.b.f5598c);
        arrayList5.add(i1.f5623a);
        arrayList5.add(new be.d(d0Var, 0));
        arrayList5.add(new be.d(d0Var, 1));
        be.l lVar = new be.l(d0Var);
        this.f24748d = lVar;
        arrayList5.add(lVar);
        arrayList5.add(i1.B);
        arrayList5.add(new b0(d0Var, eVar, lVar, arrayList4));
        this.f24749e = Collections.unmodifiableList(arrayList5);
    }

    public static void a(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final Object b(String str, Type type) {
        fe.a aVar = new fe.a(type);
        Object obj = null;
        if (str == null) {
            return null;
        }
        ge.a aVar2 = new ge.a(new StringReader(str));
        aVar2.f41876o = 2;
        boolean z10 = true;
        aVar2.f41876o = 1;
        try {
            try {
                try {
                    try {
                        aVar2.H();
                        z10 = false;
                        t tVarC = c(aVar);
                        Class cls = aVar.f40809a;
                        Object objB = tVarC.b(aVar2);
                        Class clsM = ae.i.m(cls);
                        if (objB != null && !clsM.isInstance(objB)) {
                            throw new ClassCastException("Type adapter '" + tVarC + "' returned wrong type; requested " + cls + " but got instance of " + objB.getClass() + "\nVerify that the adapter was registered for the correct type.");
                        }
                        aVar2.f41876o = 2;
                        obj = objB;
                    } catch (EOFException e10) {
                        if (!z10) {
                            throw new m(e10);
                        }
                        aVar2.f41876o = 2;
                    } catch (IOException e11) {
                        throw new m(e11);
                    }
                    if (obj != null) {
                        try {
                            if (aVar2.H() != 10) {
                                throw new m("JSON document was not fully consumed.");
                            }
                        } catch (ge.c e12) {
                            throw new m(e12);
                        } catch (IOException e13) {
                            throw new h(e13);
                        }
                    }
                    return obj;
                } catch (AssertionError e14) {
                    throw new AssertionError("AssertionError (GSON 2.13.2): " + e14.getMessage(), e14);
                }
            } catch (IllegalStateException e15) {
                throw new m(e15);
            }
        } catch (Throwable th2) {
            aVar2.f41876o = 2;
            throw th2;
        }
    }

    public final t c(fe.a aVar) {
        boolean z10;
        Objects.requireNonNull(aVar, "type must not be null");
        ConcurrentHashMap concurrentHashMap = this.f24746b;
        t tVar = (t) concurrentHashMap.get(aVar);
        if (tVar != null) {
            return tVar;
        }
        ThreadLocal threadLocal = this.f24745a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z10 = true;
        } else {
            t tVar2 = (t) map.get(aVar);
            if (tVar2 != null) {
                return tVar2;
            }
            z10 = false;
        }
        try {
            c cVar = new c();
            map.put(aVar, cVar);
            Iterator it = this.f24749e.iterator();
            t tVarCreate = null;
            while (it.hasNext()) {
                tVarCreate = ((u) it.next()).create(this, aVar);
                if (tVarCreate != null) {
                    if (cVar.f24741a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    cVar.f24741a = tVarCreate;
                    map.put(aVar, tVarCreate);
                    break;
                }
            }
            if (z10) {
                threadLocal.remove();
            }
            if (tVarCreate != null) {
                if (z10) {
                    concurrentHashMap.putAll(map);
                }
                return tVarCreate;
            }
            throw new IllegalArgumentException("GSON (2.13.2) cannot handle " + aVar);
        } catch (Throwable th2) {
            if (z10) {
                threadLocal.remove();
            }
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0058  */
    public final t d(u uVar, fe.a aVar) {
        Objects.requireNonNull(uVar, "skipPast must not be null");
        Objects.requireNonNull(aVar, "type must not be null");
        be.l lVar = this.f24748d;
        lVar.getClass();
        ConcurrentHashMap concurrentHashMap = lVar.f5655b;
        if (uVar == be.l.f5652c) {
            uVar = lVar;
        } else {
            Class cls = aVar.f40809a;
            u uVar2 = (u) concurrentHashMap.get(cls);
            if (uVar2 == null) {
                zd.a aVar2 = (zd.a) cls.getAnnotation(zd.a.class);
                if (aVar2 != null) {
                    Class clsValue = aVar2.value();
                    if (u.class.isAssignableFrom(clsValue)) {
                        u uVar3 = (u) lVar.f5654a.T0(new fe.a(clsValue), true).d();
                        u uVar4 = (u) concurrentHashMap.putIfAbsent(cls, uVar3);
                        if (uVar4 != null) {
                            uVar3 = uVar4;
                        }
                        if (uVar3 == uVar) {
                            uVar = lVar;
                        }
                    }
                }
            } else if (uVar2 == uVar) {
                uVar = lVar;
            }
        }
        boolean z10 = false;
        for (u uVar5 : this.f24749e) {
            if (z10) {
                t tVarCreate = uVar5.create(this, aVar);
                if (tVarCreate != null) {
                    return tVarCreate;
                }
            } else if (uVar5 == uVar) {
                z10 = true;
            }
        }
        if (!z10) {
            return c(aVar);
        }
        throw new IllegalArgumentException("GSON cannot serialize or deserialize " + aVar);
    }

    public final ge.b e(Writer writer) {
        ge.b bVar = new ge.b(writer);
        bVar.u(this.f24751g);
        bVar.f41887i = this.f24750f;
        bVar.v(2);
        bVar.f41889k = false;
        return bVar;
    }

    public final String f(Serializable serializable) {
        if (serializable == null) {
            StringBuilder sb2 = new StringBuilder();
            try {
                g(e(new ae.t(sb2, 0)));
                return sb2.toString();
            } catch (IOException e10) {
                throw new h(e10);
            }
        }
        Class<?> cls = serializable.getClass();
        StringBuilder sb3 = new StringBuilder();
        try {
            h(serializable, cls, e(new ae.t(sb3, 0)));
            return sb3.toString();
        } catch (IOException e11) {
            throw new h(e11);
        }
    }

    public final void g(ge.b bVar) {
        i iVar = i.f24753a;
        int i10 = bVar.f41886h;
        boolean z10 = bVar.f41887i;
        boolean z11 = bVar.f41889k;
        bVar.f41887i = this.f24750f;
        bVar.f41889k = false;
        if (i10 == 2) {
            bVar.f41886h = 1;
        }
        try {
            try {
                i1.f5647z.getClass();
                be.m.e(bVar, iVar);
                bVar.v(i10);
                bVar.f41887i = z10;
                bVar.f41889k = z11;
            } catch (IOException e10) {
                throw new h(e10);
            } catch (AssertionError e11) {
                throw new AssertionError("AssertionError (GSON 2.13.2): " + e11.getMessage(), e11);
            }
        } catch (Throwable th2) {
            bVar.v(i10);
            bVar.f41887i = z10;
            bVar.f41889k = z11;
            throw th2;
        }
    }

    public final void h(Object obj, Class cls, ge.b bVar) {
        t tVarC = c(new fe.a(cls));
        int i10 = bVar.f41886h;
        if (i10 == 2) {
            bVar.f41886h = 1;
        }
        boolean z10 = bVar.f41887i;
        boolean z11 = bVar.f41889k;
        bVar.f41887i = this.f24750f;
        bVar.f41889k = false;
        try {
            try {
                tVarC.c(bVar, obj);
                bVar.v(i10);
                bVar.f41887i = z10;
                bVar.f41889k = z11;
            } catch (IOException e10) {
                throw new h(e10);
            } catch (AssertionError e11) {
                throw new AssertionError("AssertionError (GSON 2.13.2): " + e11.getMessage(), e11);
            }
        } catch (Throwable th2) {
            bVar.v(i10);
            bVar.f41887i = z10;
            bVar.f41889k = z11;
            throw th2;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f24749e + ",instanceCreators:" + this.f24747c + "}";
    }
}
