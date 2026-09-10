package com.umeng.analytics.pro;

import com.umeng.analytics.pro.bx;
import com.umeng.analytics.pro.ca;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ca<T extends ca<?, ?>, F extends bx> implements bq<T, F> {
    private static final Map<Class<? extends cx>, cy> c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Object f2530a;
    protected F b;

    public static class a extends cz<ca> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.cx
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(cp cpVar, ca caVar) throws bw {
            caVar.b = null;
            caVar.f2530a = null;
            cpVar.j();
            ck ckVarL = cpVar.l();
            Object objA = caVar.a(cpVar, ckVarL);
            caVar.f2530a = objA;
            if (objA != null) {
                caVar.b = (F) caVar.a(ckVarL.c);
            }
            cpVar.m();
            cpVar.l();
            cpVar.k();
        }

        @Override // com.umeng.analytics.pro.cx
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(cp cpVar, ca caVar) throws bw {
            if (caVar.a() == null || caVar.b() == null) {
                throw new cq("Cannot write a TUnion with no set value!");
            }
            cpVar.a(caVar.d());
            cpVar.a(caVar.c(caVar.b));
            caVar.a(cpVar);
            cpVar.c();
            cpVar.d();
            cpVar.b();
        }
    }

    public static class b implements cy {
        private b() {
        }

        @Override // com.umeng.analytics.pro.cy
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a b() {
            return new a();
        }
    }

    public static class c extends da<ca> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.cx
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(cp cpVar, ca caVar) throws bw {
            caVar.b = null;
            caVar.f2530a = null;
            short sV = cpVar.v();
            Object objA = caVar.a(cpVar, sV);
            caVar.f2530a = objA;
            if (objA != null) {
                caVar.b = (F) caVar.a(sV);
            }
        }

        @Override // com.umeng.analytics.pro.cx
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(cp cpVar, ca caVar) throws bw {
            if (caVar.a() == null || caVar.b() == null) {
                throw new cq("Cannot write a TUnion with no set value!");
            }
            cpVar.a(caVar.b.a());
            caVar.b(cpVar);
        }
    }

    public static class d implements cy {
        private d() {
        }

        @Override // com.umeng.analytics.pro.cy
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c b() {
            return new c();
        }
    }

    static {
        HashMap map = new HashMap();
        c = map;
        map.put(cz.class, new b());
        map.put(da.class, new d());
    }

    public ca() {
        this.b = null;
        this.f2530a = null;
    }

    private static Object a(Object obj) {
        if (obj instanceof bq) {
            return ((bq) obj).deepCopy();
        }
        if (obj instanceof ByteBuffer) {
            return br.d((ByteBuffer) obj);
        }
        if (obj instanceof List) {
            return a((List) obj);
        }
        if (obj instanceof Set) {
            return a((Set) obj);
        }
        return obj instanceof Map ? a((Map<Object, Object>) obj) : obj;
    }

    public abstract F a(short s);

    public abstract Object a(cp cpVar, ck ckVar) throws bw;

    public abstract Object a(cp cpVar, short s) throws bw;

    public abstract void a(cp cpVar) throws bw;

    public Object b() {
        return this.f2530a;
    }

    public abstract void b(F f, Object obj) throws ClassCastException;

    public abstract void b(cp cpVar) throws bw;

    public abstract ck c(F f);

    public boolean c() {
        return this.b != null;
    }

    @Override // com.umeng.analytics.pro.bq
    public final void clear() {
        this.b = null;
        this.f2530a = null;
    }

    public abstract cu d();

    @Override // com.umeng.analytics.pro.bq
    public void read(cp cpVar) throws bw {
        c.get(cpVar.D()).b().b(cpVar, this);
    }

    public String toString() {
        StringBuilder sbO = DM.o("<");
        sbO.append(getClass().getSimpleName());
        sbO.append(" ");
        if (a() != null) {
            Object objB = b();
            sbO.append(c(a()).f2543a);
            sbO.append(":");
            if (objB instanceof ByteBuffer) {
                br.a((ByteBuffer) objB, sbO);
            } else {
                sbO.append(objB.toString());
            }
        }
        sbO.append(">");
        return sbO.toString();
    }

    @Override // com.umeng.analytics.pro.bq
    public void write(cp cpVar) throws bw {
        c.get(cpVar.D()).b().a(cpVar, this);
    }

    public boolean b(F f) {
        return this.b == f;
    }

    public boolean b(int i) {
        return b(a((short) i));
    }

    public ca(F f, Object obj) {
        a(f, obj);
    }

    public ca(ca<T, F> caVar) {
        if (caVar.getClass().equals(getClass())) {
            this.b = caVar.b;
            this.f2530a = a(caVar.f2530a);
            return;
        }
        throw new ClassCastException();
    }

    private static Map a(Map<Object, Object> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            map2.put(a(entry.getKey()), a(entry.getValue()));
        }
        return map2;
    }

    private static Set a(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(a(it.next()));
        }
        return hashSet;
    }

    private static List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a(it.next()));
        }
        return arrayList;
    }

    public F a() {
        return this.b;
    }

    public Object a(F f) {
        if (f == this.b) {
            return b();
        }
        throw new IllegalArgumentException("Cannot get the value of field " + f + " because union's set field is " + this.b);
    }

    public Object a(int i) {
        return a(a((short) i));
    }

    public void a(F f, Object obj) {
        b(f, obj);
        this.b = f;
        this.f2530a = obj;
    }

    public void a(int i, Object obj) {
        a(a((short) i), obj);
    }
}
