package com.umeng.commonsdk.statistics.proto;

import com.umeng.analytics.pro.bn;
import com.umeng.analytics.pro.bq;
import com.umeng.analytics.pro.bw;
import com.umeng.analytics.pro.bx;
import com.umeng.analytics.pro.cc;
import com.umeng.analytics.pro.cd;
import com.umeng.analytics.pro.cj;
import com.umeng.analytics.pro.ck;
import com.umeng.analytics.pro.cp;
import com.umeng.analytics.pro.cq;
import com.umeng.analytics.pro.cs;
import com.umeng.analytics.pro.cu;
import com.umeng.analytics.pro.cv;
import com.umeng.analytics.pro.cx;
import com.umeng.analytics.pro.cy;
import com.umeng.analytics.pro.cz;
import com.umeng.analytics.pro.da;
import com.umeng.analytics.pro.db;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class a implements bq<a, e>, Serializable, Cloneable {
    public static final Map<e, cc> e;
    private static final long f = 9132678615281394583L;
    private static final cu g = new cu("IdJournal");
    private static final ck h = new ck("domain", (byte) 11, 1);
    private static final ck i = new ck("old_id", (byte) 11, 2);
    private static final ck j = new ck("new_id", (byte) 11, 3);
    private static final ck k = new ck("ts", (byte) 10, 4);
    private static final Map<Class<? extends cx>, cy> l;
    private static final int m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f2689a;
    public String b;
    public String c;
    public long d;
    private byte n;
    private e[] o;

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.a$a, reason: collision with other inner class name */
    public static class C0287a extends cz<a> {
        private C0287a() {
        }

        @Override // com.umeng.analytics.pro.cx
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(cp cpVar, a aVar) throws bw {
            cpVar.j();
            while (true) {
                ck ckVarL = cpVar.l();
                byte b = ckVarL.b;
                if (b == 0) {
                    break;
                }
                short s = ckVarL.c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                cs.a(cpVar, b);
                            } else if (b == 10) {
                                aVar.d = cpVar.x();
                                aVar.d(true);
                            } else {
                                cs.a(cpVar, b);
                            }
                        } else if (b == 11) {
                            aVar.c = cpVar.z();
                            aVar.c(true);
                        } else {
                            cs.a(cpVar, b);
                        }
                    } else if (b == 11) {
                        aVar.b = cpVar.z();
                        aVar.b(true);
                    } else {
                        cs.a(cpVar, b);
                    }
                } else if (b == 11) {
                    aVar.f2689a = cpVar.z();
                    aVar.a(true);
                } else {
                    cs.a(cpVar, b);
                }
                cpVar.m();
            }
            cpVar.k();
            if (aVar.m()) {
                aVar.n();
            } else {
                throw new cq("Required field 'ts' was not found in serialized data! Struct: " + toString());
            }
        }

        @Override // com.umeng.analytics.pro.cx
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(cp cpVar, a aVar) throws bw {
            aVar.n();
            cpVar.a(a.g);
            if (aVar.f2689a != null) {
                cpVar.a(a.h);
                cpVar.a(aVar.f2689a);
                cpVar.c();
            }
            if (aVar.b != null && aVar.g()) {
                cpVar.a(a.i);
                cpVar.a(aVar.b);
                cpVar.c();
            }
            if (aVar.c != null) {
                cpVar.a(a.j);
                cpVar.a(aVar.c);
                cpVar.c();
            }
            cpVar.a(a.k);
            cpVar.a(aVar.d);
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
        public C0287a b() {
            return new C0287a();
        }
    }

    public static class c extends da<a> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.cx
        public void a(cp cpVar, a aVar) throws bw {
            cv cvVar = (cv) cpVar;
            cvVar.a(aVar.f2689a);
            cvVar.a(aVar.c);
            cvVar.a(aVar.d);
            BitSet bitSet = new BitSet();
            if (aVar.g()) {
                bitSet.set(0);
            }
            cvVar.a(bitSet, 1);
            if (aVar.g()) {
                cvVar.a(aVar.b);
            }
        }

        @Override // com.umeng.analytics.pro.cx
        public void b(cp cpVar, a aVar) throws bw {
            cv cvVar = (cv) cpVar;
            aVar.f2689a = cvVar.z();
            aVar.a(true);
            aVar.c = cvVar.z();
            aVar.c(true);
            aVar.d = cvVar.x();
            aVar.d(true);
            if (cvVar.b(1).get(0)) {
                aVar.b = cvVar.z();
                aVar.b(true);
            }
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
        l = map;
        map.put(cz.class, new b());
        map.put(da.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put(e.DOMAIN, new cc("domain", (byte) 1, new cd((byte) 11)));
        enumMap.put(e.OLD_ID, new cc("old_id", (byte) 2, new cd((byte) 11)));
        enumMap.put(e.NEW_ID, new cc("new_id", (byte) 1, new cd((byte) 11)));
        enumMap.put(e.TS, new cc("ts", (byte) 1, new cd((byte) 10)));
        Map<e, cc> mapUnmodifiableMap = Collections.unmodifiableMap(enumMap);
        e = mapUnmodifiableMap;
        cc.a(a.class, mapUnmodifiableMap);
    }

    public a() {
        this.n = (byte) 0;
        this.o = new e[]{e.OLD_ID};
    }

    @Override // com.umeng.analytics.pro.bq
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a deepCopy() {
        return new a(this);
    }

    public String b() {
        return this.f2689a;
    }

    public void c() {
        this.f2689a = null;
    }

    @Override // com.umeng.analytics.pro.bq
    public void clear() {
        this.f2689a = null;
        this.b = null;
        this.c = null;
        d(false);
        this.d = 0L;
    }

    public boolean d() {
        return this.f2689a != null;
    }

    public String e() {
        return this.b;
    }

    public void f() {
        this.b = null;
    }

    public boolean g() {
        return this.b != null;
    }

    public String h() {
        return this.c;
    }

    public void i() {
        this.c = null;
    }

    public boolean j() {
        return this.c != null;
    }

    public long k() {
        return this.d;
    }

    public void l() {
        this.n = bn.b(this.n, 0);
    }

    public boolean m() {
        return bn.a(this.n, 0);
    }

    public void n() throws bw {
        if (this.f2689a == null) {
            throw new cq("Required field 'domain' was not present! Struct: " + toString());
        }
        if (this.c != null) {
            return;
        }
        throw new cq("Required field 'new_id' was not present! Struct: " + toString());
    }

    @Override // com.umeng.analytics.pro.bq
    public void read(cp cpVar) throws bw {
        l.get(cpVar.D()).b().b(cpVar, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IdJournal(domain:");
        String str = this.f2689a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        if (g()) {
            sb.append(", ");
            sb.append("old_id:");
            String str2 = this.b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
        }
        sb.append(", ");
        sb.append("new_id:");
        String str3 = this.c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("ts:");
        return AbstractC3950lJ.s(sb, this.d, ")");
    }

    @Override // com.umeng.analytics.pro.bq
    public void write(cp cpVar) throws bw {
        l.get(cpVar.D()).b().a(cpVar, this);
    }

    public a a(String str) {
        this.f2689a = str;
        return this;
    }

    public a b(String str) {
        this.b = str;
        return this;
    }

    public a c(String str) {
        this.c = str;
        return this;
    }

    public void d(boolean z) {
        this.n = bn.a(this.n, 0, z);
    }

    public void a(boolean z) {
        if (z) {
            return;
        }
        this.f2689a = null;
    }

    public void b(boolean z) {
        if (z) {
            return;
        }
        this.b = null;
    }

    public void c(boolean z) {
        if (z) {
            return;
        }
        this.c = null;
    }

    public enum e implements bx {
        DOMAIN(1, "domain"),
        OLD_ID(2, "old_id"),
        NEW_ID(3, "new_id"),
        TS(4, "ts");

        private static final Map<String, e> e = new HashMap();
        private final short f;
        private final String g;

        static {
            for (e eVar : EnumSet.allOf(e.class)) {
                e.put(eVar.b(), eVar);
            }
        }

        e(short s, String str) {
            this.f = s;
            this.g = str;
        }

        public static e a(int i) {
            if (i == 1) {
                return DOMAIN;
            }
            if (i == 2) {
                return OLD_ID;
            }
            if (i == 3) {
                return NEW_ID;
            }
            if (i != 4) {
                return null;
            }
            return TS;
        }

        public static e b(int i) {
            e eVarA = a(i);
            if (eVarA != null) {
                return eVarA;
            }
            throw new IllegalArgumentException(AbstractC5044xl.g("Field ", i, " doesn't exist!"));
        }

        public static e a(String str) {
            return e.get(str);
        }

        @Override // com.umeng.analytics.pro.bx
        public short a() {
            return this.f;
        }

        @Override // com.umeng.analytics.pro.bx
        public String b() {
            return this.g;
        }
    }

    public a(String str, String str2, long j2) {
        this();
        this.f2689a = str;
        this.c = str2;
        this.d = j2;
        d(true);
    }

    public a a(long j2) {
        this.d = j2;
        d(true);
        return this;
    }

    @Override // com.umeng.analytics.pro.bq
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public e fieldForId(int i2) {
        return e.a(i2);
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new cj(new db(objectOutputStream)));
        } catch (bw e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public a(a aVar) {
        this.n = (byte) 0;
        this.o = new e[]{e.OLD_ID};
        this.n = aVar.n;
        if (aVar.d()) {
            this.f2689a = aVar.f2689a;
        }
        if (aVar.g()) {
            this.b = aVar.b;
        }
        if (aVar.j()) {
            this.c = aVar.c;
        }
        this.d = aVar.d;
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.n = (byte) 0;
            read(new cj(new db(objectInputStream)));
        } catch (bw e2) {
            throw new IOException(e2.getMessage());
        }
    }
}
