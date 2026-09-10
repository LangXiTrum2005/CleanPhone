package com.umeng.commonsdk.statistics.proto;

import com.umeng.analytics.pro.bn;
import com.umeng.analytics.pro.bq;
import com.umeng.analytics.pro.bw;
import com.umeng.analytics.pro.bx;
import com.umeng.analytics.pro.cc;
import com.umeng.analytics.pro.cd;
import com.umeng.analytics.pro.cf;
import com.umeng.analytics.pro.ch;
import com.umeng.analytics.pro.cj;
import com.umeng.analytics.pro.ck;
import com.umeng.analytics.pro.cm;
import com.umeng.analytics.pro.cp;
import com.umeng.analytics.pro.cq;
import com.umeng.analytics.pro.cs;
import com.umeng.analytics.pro.cu;
import com.umeng.analytics.pro.cv;
import com.umeng.analytics.pro.cw;
import com.umeng.analytics.pro.cx;
import com.umeng.analytics.pro.cy;
import com.umeng.analytics.pro.cz;
import com.umeng.analytics.pro.da;
import com.umeng.analytics.pro.db;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class d implements bq<d, e>, Serializable, Cloneable {
    public static final Map<e, cc> d;
    private static final long e = 2846460275012375038L;
    private static final cu f = new cu("Imprint");
    private static final ck g = new ck("property", cw.k, 1);
    private static final ck h = new ck("version", (byte) 8, 2);
    private static final ck i = new ck("checksum", (byte) 11, 3);
    private static final Map<Class<? extends cx>, cy> j;
    private static final int k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, com.umeng.commonsdk.statistics.proto.e> f2695a;
    public int b;
    public String c;
    private byte l;

    public static class a extends cz<d> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.cx
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(cp cpVar, d dVar) throws bw {
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
                            cs.a(cpVar, b);
                        } else if (b == 11) {
                            dVar.c = cpVar.z();
                            dVar.c(true);
                        } else {
                            cs.a(cpVar, b);
                        }
                    } else if (b == 8) {
                        dVar.b = cpVar.w();
                        dVar.b(true);
                    } else {
                        cs.a(cpVar, b);
                    }
                } else if (b == 13) {
                    cm cmVarN = cpVar.n();
                    dVar.f2695a = new HashMap(cmVarN.c * 2);
                    for (int i = 0; i < cmVarN.c; i++) {
                        String strZ = cpVar.z();
                        com.umeng.commonsdk.statistics.proto.e eVar = new com.umeng.commonsdk.statistics.proto.e();
                        eVar.read(cpVar);
                        dVar.f2695a.put(strZ, eVar);
                    }
                    cpVar.o();
                    dVar.a(true);
                } else {
                    cs.a(cpVar, b);
                }
                cpVar.m();
            }
            cpVar.k();
            if (!dVar.h()) {
                throw new cq("Required field 'version' was not found in serialized data! Struct: " + toString());
            }
            dVar.l();
        }

        @Override // com.umeng.analytics.pro.cx
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(cp cpVar, d dVar) throws bw {
            dVar.l();
            cpVar.a(d.f);
            if (dVar.f2695a != null) {
                cpVar.a(d.g);
                cpVar.a(new cm((byte) 11, (byte) 12, dVar.f2695a.size()));
                for (Map.Entry<String, com.umeng.commonsdk.statistics.proto.e> entry : dVar.f2695a.entrySet()) {
                    cpVar.a(entry.getKey());
                    entry.getValue().write(cpVar);
                }
                cpVar.e();
                cpVar.c();
            }
            cpVar.a(d.h);
            cpVar.a(dVar.b);
            cpVar.c();
            if (dVar.c != null) {
                cpVar.a(d.i);
                cpVar.a(dVar.c);
                cpVar.c();
            }
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

    public static class c extends da<d> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.cx
        public void a(cp cpVar, d dVar) throws bw {
            cv cvVar = (cv) cpVar;
            cvVar.a(dVar.f2695a.size());
            for (Map.Entry<String, com.umeng.commonsdk.statistics.proto.e> entry : dVar.f2695a.entrySet()) {
                cvVar.a(entry.getKey());
                entry.getValue().write(cvVar);
            }
            cvVar.a(dVar.b);
            cvVar.a(dVar.c);
        }

        @Override // com.umeng.analytics.pro.cx
        public void b(cp cpVar, d dVar) throws bw {
            cv cvVar = (cv) cpVar;
            cm cmVar = new cm((byte) 11, (byte) 12, cvVar.w());
            dVar.f2695a = new HashMap(cmVar.c * 2);
            for (int i = 0; i < cmVar.c; i++) {
                String strZ = cvVar.z();
                com.umeng.commonsdk.statistics.proto.e eVar = new com.umeng.commonsdk.statistics.proto.e();
                eVar.read(cvVar);
                dVar.f2695a.put(strZ, eVar);
            }
            dVar.a(true);
            dVar.b = cvVar.w();
            dVar.b(true);
            dVar.c = cvVar.z();
            dVar.c(true);
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.d$d, reason: collision with other inner class name */
    public static class C0290d implements cy {
        private C0290d() {
        }

        @Override // com.umeng.analytics.pro.cy
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c b() {
            return new c();
        }
    }

    static {
        HashMap map = new HashMap();
        j = map;
        map.put(cz.class, new b());
        map.put(da.class, new C0290d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put(e.PROPERTY, new cc("property", (byte) 1, new cf(cw.k, new cd((byte) 11), new ch((byte) 12, com.umeng.commonsdk.statistics.proto.e.class))));
        enumMap.put(e.VERSION, new cc("version", (byte) 1, new cd((byte) 8)));
        enumMap.put(e.CHECKSUM, new cc("checksum", (byte) 1, new cd((byte) 11)));
        Map<e, cc> mapUnmodifiableMap = Collections.unmodifiableMap(enumMap);
        d = mapUnmodifiableMap;
        cc.a(d.class, mapUnmodifiableMap);
    }

    public d() {
        this.l = (byte) 0;
    }

    @Override // com.umeng.analytics.pro.bq
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public d deepCopy() {
        return new d(this);
    }

    public int b() {
        Map<String, com.umeng.commonsdk.statistics.proto.e> map = this.f2695a;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public Map<String, com.umeng.commonsdk.statistics.proto.e> c() {
        return this.f2695a;
    }

    @Override // com.umeng.analytics.pro.bq
    public void clear() {
        this.f2695a = null;
        b(false);
        this.b = 0;
        this.c = null;
    }

    public void d() {
        this.f2695a = null;
    }

    public boolean e() {
        return this.f2695a != null;
    }

    public int f() {
        return this.b;
    }

    public void g() {
        this.l = bn.b(this.l, 0);
    }

    public boolean h() {
        return bn.a(this.l, 0);
    }

    public String i() {
        return this.c;
    }

    public void j() {
        this.c = null;
    }

    public boolean k() {
        return this.c != null;
    }

    public void l() throws bw {
        if (this.f2695a == null) {
            throw new cq("Required field 'property' was not present! Struct: " + toString());
        }
        if (this.c != null) {
            return;
        }
        throw new cq("Required field 'checksum' was not present! Struct: " + toString());
    }

    @Override // com.umeng.analytics.pro.bq
    public void read(cp cpVar) throws bw {
        j.get(cpVar.D()).b().b(cpVar, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Imprint(property:");
        Map<String, com.umeng.commonsdk.statistics.proto.e> map = this.f2695a;
        if (map == null) {
            sb.append("null");
        } else {
            sb.append(map);
        }
        sb.append(", ");
        sb.append("version:");
        sb.append(this.b);
        sb.append(", ");
        sb.append("checksum:");
        String str = this.c;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // com.umeng.analytics.pro.bq
    public void write(cp cpVar) throws bw {
        j.get(cpVar.D()).b().a(cpVar, this);
    }

    public void a(String str, com.umeng.commonsdk.statistics.proto.e eVar) {
        if (this.f2695a == null) {
            this.f2695a = new HashMap();
        }
        this.f2695a.put(str, eVar);
    }

    public void b(boolean z) {
        this.l = bn.a(this.l, 0, z);
    }

    public void c(boolean z) {
        if (z) {
            return;
        }
        this.c = null;
    }

    public enum e implements bx {
        PROPERTY(1, "property"),
        VERSION(2, "version"),
        CHECKSUM(3, "checksum");

        private static final Map<String, e> d = new HashMap();
        private final short e;
        private final String f;

        static {
            for (e eVar : EnumSet.allOf(e.class)) {
                d.put(eVar.b(), eVar);
            }
        }

        e(short s, String str) {
            this.e = s;
            this.f = str;
        }

        public static e a(int i) {
            if (i == 1) {
                return PROPERTY;
            }
            if (i == 2) {
                return VERSION;
            }
            if (i != 3) {
                return null;
            }
            return CHECKSUM;
        }

        public static e b(int i) {
            e eVarA = a(i);
            if (eVarA != null) {
                return eVarA;
            }
            throw new IllegalArgumentException(AbstractC5044xl.g("Field ", i, " doesn't exist!"));
        }

        public static e a(String str) {
            return d.get(str);
        }

        @Override // com.umeng.analytics.pro.bx
        public short a() {
            return this.e;
        }

        @Override // com.umeng.analytics.pro.bx
        public String b() {
            return this.f;
        }
    }

    public d(Map<String, com.umeng.commonsdk.statistics.proto.e> map, int i2, String str) {
        this();
        this.f2695a = map;
        this.b = i2;
        b(true);
        this.c = str;
    }

    @Override // com.umeng.analytics.pro.bq
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e fieldForId(int i2) {
        return e.a(i2);
    }

    public d a(Map<String, com.umeng.commonsdk.statistics.proto.e> map) {
        this.f2695a = map;
        return this;
    }

    public void a(boolean z) {
        if (z) {
            return;
        }
        this.f2695a = null;
    }

    public d a(int i2) {
        this.b = i2;
        b(true);
        return this;
    }

    public d(d dVar) {
        this.l = (byte) 0;
        this.l = dVar.l;
        if (dVar.e()) {
            HashMap map = new HashMap();
            for (Map.Entry<String, com.umeng.commonsdk.statistics.proto.e> entry : dVar.f2695a.entrySet()) {
                map.put(entry.getKey(), new com.umeng.commonsdk.statistics.proto.e(entry.getValue()));
            }
            this.f2695a = map;
        }
        this.b = dVar.b;
        if (dVar.k()) {
            this.c = dVar.c;
        }
    }

    public d a(String str) {
        this.c = str;
        return this;
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new cj(new db(objectOutputStream)));
        } catch (bw e2) {
            throw new IOException(e2.getMessage());
        }
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.l = (byte) 0;
            read(new cj(new db(objectInputStream)));
        } catch (bw e2) {
            throw new IOException(e2.getMessage());
        }
    }
}
