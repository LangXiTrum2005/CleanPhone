package com.umeng.commonsdk.statistics.proto;

import com.umeng.analytics.pro.bq;
import com.umeng.analytics.pro.bw;
import com.umeng.analytics.pro.bx;
import com.umeng.analytics.pro.cc;
import com.umeng.analytics.pro.cd;
import com.umeng.analytics.pro.ce;
import com.umeng.analytics.pro.cf;
import com.umeng.analytics.pro.ch;
import com.umeng.analytics.pro.cj;
import com.umeng.analytics.pro.ck;
import com.umeng.analytics.pro.cl;
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
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class c implements bq<c, e>, Serializable, Cloneable {
    public static final Map<e, cc> d;
    private static final long e = -5764118265293965743L;
    private static final cu f = new cu("IdTracking");
    private static final ck g = new ck("snapshots", cw.k, 1);
    private static final ck h = new ck("journals", cw.m, 2);
    private static final ck i = new ck("checksum", (byte) 11, 3);
    private static final Map<Class<? extends cx>, cy> j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, com.umeng.commonsdk.statistics.proto.b> f2693a;
    public List<com.umeng.commonsdk.statistics.proto.a> b;
    public String c;
    private e[] k;

    public static class a extends cz<c> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.cx
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(cp cpVar, c cVar) throws bw {
            cpVar.j();
            while (true) {
                ck ckVarL = cpVar.l();
                byte b = ckVarL.b;
                if (b == 0) {
                    cpVar.k();
                    cVar.n();
                    return;
                }
                short s = ckVarL.c;
                int i = 0;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            cs.a(cpVar, b);
                        } else if (b == 11) {
                            cVar.c = cpVar.z();
                            cVar.c(true);
                        } else {
                            cs.a(cpVar, b);
                        }
                    } else if (b == 15) {
                        cl clVarP = cpVar.p();
                        cVar.b = new ArrayList(clVarP.b);
                        while (i < clVarP.b) {
                            com.umeng.commonsdk.statistics.proto.a aVar = new com.umeng.commonsdk.statistics.proto.a();
                            aVar.read(cpVar);
                            cVar.b.add(aVar);
                            i++;
                        }
                        cpVar.q();
                        cVar.b(true);
                    } else {
                        cs.a(cpVar, b);
                    }
                } else if (b == 13) {
                    cm cmVarN = cpVar.n();
                    cVar.f2693a = new HashMap(cmVarN.c * 2);
                    while (i < cmVarN.c) {
                        String strZ = cpVar.z();
                        com.umeng.commonsdk.statistics.proto.b bVar = new com.umeng.commonsdk.statistics.proto.b();
                        bVar.read(cpVar);
                        cVar.f2693a.put(strZ, bVar);
                        i++;
                    }
                    cpVar.o();
                    cVar.a(true);
                } else {
                    cs.a(cpVar, b);
                }
                cpVar.m();
            }
        }

        @Override // com.umeng.analytics.pro.cx
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(cp cpVar, c cVar) throws bw {
            cVar.n();
            cpVar.a(c.f);
            if (cVar.f2693a != null) {
                cpVar.a(c.g);
                cpVar.a(new cm((byte) 11, (byte) 12, cVar.f2693a.size()));
                for (Map.Entry<String, com.umeng.commonsdk.statistics.proto.b> entry : cVar.f2693a.entrySet()) {
                    cpVar.a(entry.getKey());
                    entry.getValue().write(cpVar);
                }
                cpVar.e();
                cpVar.c();
            }
            if (cVar.b != null && cVar.j()) {
                cpVar.a(c.h);
                cpVar.a(new cl((byte) 12, cVar.b.size()));
                Iterator<com.umeng.commonsdk.statistics.proto.a> it = cVar.b.iterator();
                while (it.hasNext()) {
                    it.next().write(cpVar);
                }
                cpVar.f();
                cpVar.c();
            }
            if (cVar.c != null && cVar.m()) {
                cpVar.a(c.i);
                cpVar.a(cVar.c);
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

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.c$c, reason: collision with other inner class name */
    public static class C0289c extends da<c> {
        private C0289c() {
        }

        @Override // com.umeng.analytics.pro.cx
        public void a(cp cpVar, c cVar) throws bw {
            cv cvVar = (cv) cpVar;
            cvVar.a(cVar.f2693a.size());
            for (Map.Entry<String, com.umeng.commonsdk.statistics.proto.b> entry : cVar.f2693a.entrySet()) {
                cvVar.a(entry.getKey());
                entry.getValue().write(cvVar);
            }
            BitSet bitSet = new BitSet();
            if (cVar.j()) {
                bitSet.set(0);
            }
            if (cVar.m()) {
                bitSet.set(1);
            }
            cvVar.a(bitSet, 2);
            if (cVar.j()) {
                cvVar.a(cVar.b.size());
                Iterator<com.umeng.commonsdk.statistics.proto.a> it = cVar.b.iterator();
                while (it.hasNext()) {
                    it.next().write(cvVar);
                }
            }
            if (cVar.m()) {
                cvVar.a(cVar.c);
            }
        }

        @Override // com.umeng.analytics.pro.cx
        public void b(cp cpVar, c cVar) throws bw {
            cv cvVar = (cv) cpVar;
            cm cmVar = new cm((byte) 11, (byte) 12, cvVar.w());
            cVar.f2693a = new HashMap(cmVar.c * 2);
            for (int i = 0; i < cmVar.c; i++) {
                String strZ = cvVar.z();
                com.umeng.commonsdk.statistics.proto.b bVar = new com.umeng.commonsdk.statistics.proto.b();
                bVar.read(cvVar);
                cVar.f2693a.put(strZ, bVar);
            }
            cVar.a(true);
            BitSet bitSetB = cvVar.b(2);
            if (bitSetB.get(0)) {
                cl clVar = new cl((byte) 12, cvVar.w());
                cVar.b = new ArrayList(clVar.b);
                for (int i2 = 0; i2 < clVar.b; i2++) {
                    com.umeng.commonsdk.statistics.proto.a aVar = new com.umeng.commonsdk.statistics.proto.a();
                    aVar.read(cvVar);
                    cVar.b.add(aVar);
                }
                cVar.b(true);
            }
            if (bitSetB.get(1)) {
                cVar.c = cvVar.z();
                cVar.c(true);
            }
        }
    }

    public static class d implements cy {
        private d() {
        }

        @Override // com.umeng.analytics.pro.cy
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0289c b() {
            return new C0289c();
        }
    }

    static {
        HashMap map = new HashMap();
        j = map;
        map.put(cz.class, new b());
        map.put(da.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put(e.SNAPSHOTS, new cc("snapshots", (byte) 1, new cf(cw.k, new cd((byte) 11), new ch((byte) 12, com.umeng.commonsdk.statistics.proto.b.class))));
        enumMap.put(e.JOURNALS, new cc("journals", (byte) 2, new ce(cw.m, new ch((byte) 12, com.umeng.commonsdk.statistics.proto.a.class))));
        enumMap.put(e.CHECKSUM, new cc("checksum", (byte) 2, new cd((byte) 11)));
        Map<e, cc> mapUnmodifiableMap = Collections.unmodifiableMap(enumMap);
        d = mapUnmodifiableMap;
        cc.a(c.class, mapUnmodifiableMap);
    }

    public c() {
        this.k = new e[]{e.JOURNALS, e.CHECKSUM};
    }

    @Override // com.umeng.analytics.pro.bq
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public c deepCopy() {
        return new c(this);
    }

    public int b() {
        Map<String, com.umeng.commonsdk.statistics.proto.b> map = this.f2693a;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public Map<String, com.umeng.commonsdk.statistics.proto.b> c() {
        return this.f2693a;
    }

    @Override // com.umeng.analytics.pro.bq
    public void clear() {
        this.f2693a = null;
        this.b = null;
        this.c = null;
    }

    public void d() {
        this.f2693a = null;
    }

    public boolean e() {
        return this.f2693a != null;
    }

    public int f() {
        List<com.umeng.commonsdk.statistics.proto.a> list = this.b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public Iterator<com.umeng.commonsdk.statistics.proto.a> g() {
        List<com.umeng.commonsdk.statistics.proto.a> list = this.b;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public List<com.umeng.commonsdk.statistics.proto.a> h() {
        return this.b;
    }

    public void i() {
        this.b = null;
    }

    public boolean j() {
        return this.b != null;
    }

    public String k() {
        return this.c;
    }

    public void l() {
        this.c = null;
    }

    public boolean m() {
        return this.c != null;
    }

    public void n() throws bw {
        if (this.f2693a != null) {
            return;
        }
        throw new cq("Required field 'snapshots' was not present! Struct: " + toString());
    }

    @Override // com.umeng.analytics.pro.bq
    public void read(cp cpVar) throws bw {
        j.get(cpVar.D()).b().b(cpVar, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IdTracking(snapshots:");
        Map<String, com.umeng.commonsdk.statistics.proto.b> map = this.f2693a;
        if (map == null) {
            sb.append("null");
        } else {
            sb.append(map);
        }
        if (j()) {
            sb.append(", ");
            sb.append("journals:");
            List<com.umeng.commonsdk.statistics.proto.a> list = this.b;
            if (list == null) {
                sb.append("null");
            } else {
                sb.append(list);
            }
        }
        if (m()) {
            sb.append(", ");
            sb.append("checksum:");
            String str = this.c;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // com.umeng.analytics.pro.bq
    public void write(cp cpVar) throws bw {
        j.get(cpVar.D()).b().a(cpVar, this);
    }

    public void a(String str, com.umeng.commonsdk.statistics.proto.b bVar) {
        if (this.f2693a == null) {
            this.f2693a = new HashMap();
        }
        this.f2693a.put(str, bVar);
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
        SNAPSHOTS(1, "snapshots"),
        JOURNALS(2, "journals"),
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
                return SNAPSHOTS;
            }
            if (i == 2) {
                return JOURNALS;
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

    public c(Map<String, com.umeng.commonsdk.statistics.proto.b> map) {
        this();
        this.f2693a = map;
    }

    public c(c cVar) {
        this.k = new e[]{e.JOURNALS, e.CHECKSUM};
        if (cVar.e()) {
            HashMap map = new HashMap();
            for (Map.Entry<String, com.umeng.commonsdk.statistics.proto.b> entry : cVar.f2693a.entrySet()) {
                map.put(entry.getKey(), new com.umeng.commonsdk.statistics.proto.b(entry.getValue()));
            }
            this.f2693a = map;
        }
        if (cVar.j()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.umeng.commonsdk.statistics.proto.a> it = cVar.b.iterator();
            while (it.hasNext()) {
                arrayList.add(new com.umeng.commonsdk.statistics.proto.a(it.next()));
            }
            this.b = arrayList;
        }
        if (cVar.m()) {
            this.c = cVar.c;
        }
    }

    public c a(Map<String, com.umeng.commonsdk.statistics.proto.b> map) {
        this.f2693a = map;
        return this;
    }

    public void a(boolean z) {
        if (z) {
            return;
        }
        this.f2693a = null;
    }

    public void a(com.umeng.commonsdk.statistics.proto.a aVar) {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        this.b.add(aVar);
    }

    public c a(List<com.umeng.commonsdk.statistics.proto.a> list) {
        this.b = list;
        return this;
    }

    public c a(String str) {
        this.c = str;
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

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            read(new cj(new db(objectInputStream)));
        } catch (bw e2) {
            throw new IOException(e2.getMessage());
        }
    }
}
