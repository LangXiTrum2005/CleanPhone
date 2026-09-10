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
public class b implements bq<b, e>, Serializable, Cloneable {
    public static final Map<e, cc> d;
    private static final long e = -6496538196005191531L;
    private static final cu f = new cu("IdSnapshot");
    private static final ck g = new ck("identity", (byte) 11, 1);
    private static final ck h = new ck("ts", (byte) 10, 2);
    private static final ck i = new ck("version", (byte) 8, 3);
    private static final Map<Class<? extends cx>, cy> j;
    private static final int k = 0;
    private static final int l = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f2691a;
    public long b;
    public int c;
    private byte m;

    public static class a extends cz<b> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.cx
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(cp cpVar, b bVar) throws bw {
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
                        } else if (b == 8) {
                            bVar.c = cpVar.w();
                            bVar.c(true);
                        } else {
                            cs.a(cpVar, b);
                        }
                    } else if (b == 10) {
                        bVar.b = cpVar.x();
                        bVar.b(true);
                    } else {
                        cs.a(cpVar, b);
                    }
                } else if (b == 11) {
                    bVar.f2691a = cpVar.z();
                    bVar.a(true);
                } else {
                    cs.a(cpVar, b);
                }
                cpVar.m();
            }
            cpVar.k();
            if (!bVar.g()) {
                throw new cq("Required field 'ts' was not found in serialized data! Struct: " + toString());
            }
            if (bVar.j()) {
                bVar.k();
            } else {
                throw new cq("Required field 'version' was not found in serialized data! Struct: " + toString());
            }
        }

        @Override // com.umeng.analytics.pro.cx
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(cp cpVar, b bVar) throws bw {
            bVar.k();
            cpVar.a(b.f);
            if (bVar.f2691a != null) {
                cpVar.a(b.g);
                cpVar.a(bVar.f2691a);
                cpVar.c();
            }
            cpVar.a(b.h);
            cpVar.a(bVar.b);
            cpVar.c();
            cpVar.a(b.i);
            cpVar.a(bVar.c);
            cpVar.c();
            cpVar.d();
            cpVar.b();
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.b$b, reason: collision with other inner class name */
    public static class C0288b implements cy {
        private C0288b() {
        }

        @Override // com.umeng.analytics.pro.cy
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a b() {
            return new a();
        }
    }

    public static class c extends da<b> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.cx
        public void a(cp cpVar, b bVar) throws bw {
            cv cvVar = (cv) cpVar;
            cvVar.a(bVar.f2691a);
            cvVar.a(bVar.b);
            cvVar.a(bVar.c);
        }

        @Override // com.umeng.analytics.pro.cx
        public void b(cp cpVar, b bVar) throws bw {
            cv cvVar = (cv) cpVar;
            bVar.f2691a = cvVar.z();
            bVar.a(true);
            bVar.b = cvVar.x();
            bVar.b(true);
            bVar.c = cvVar.w();
            bVar.c(true);
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
        j = map;
        map.put(cz.class, new C0288b());
        map.put(da.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put(e.IDENTITY, new cc("identity", (byte) 1, new cd((byte) 11)));
        enumMap.put(e.TS, new cc("ts", (byte) 1, new cd((byte) 10)));
        enumMap.put(e.VERSION, new cc("version", (byte) 1, new cd((byte) 8)));
        Map<e, cc> mapUnmodifiableMap = Collections.unmodifiableMap(enumMap);
        d = mapUnmodifiableMap;
        cc.a(b.class, mapUnmodifiableMap);
    }

    public b() {
        this.m = (byte) 0;
    }

    @Override // com.umeng.analytics.pro.bq
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public b deepCopy() {
        return new b(this);
    }

    public String b() {
        return this.f2691a;
    }

    public void c() {
        this.f2691a = null;
    }

    @Override // com.umeng.analytics.pro.bq
    public void clear() {
        this.f2691a = null;
        b(false);
        this.b = 0L;
        c(false);
        this.c = 0;
    }

    public boolean d() {
        return this.f2691a != null;
    }

    public long e() {
        return this.b;
    }

    public void f() {
        this.m = bn.b(this.m, 0);
    }

    public boolean g() {
        return bn.a(this.m, 0);
    }

    public int h() {
        return this.c;
    }

    public void i() {
        this.m = bn.b(this.m, 1);
    }

    public boolean j() {
        return bn.a(this.m, 1);
    }

    public void k() throws bw {
        if (this.f2691a != null) {
            return;
        }
        throw new cq("Required field 'identity' was not present! Struct: " + toString());
    }

    @Override // com.umeng.analytics.pro.bq
    public void read(cp cpVar) throws bw {
        j.get(cpVar.D()).b().b(cpVar, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IdSnapshot(identity:");
        String str = this.f2691a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("ts:");
        sb.append(this.b);
        sb.append(", ");
        sb.append("version:");
        return AbstractC5044xl.o(sb, this.c, ")");
    }

    @Override // com.umeng.analytics.pro.bq
    public void write(cp cpVar) throws bw {
        j.get(cpVar.D()).b().a(cpVar, this);
    }

    public b a(String str) {
        this.f2691a = str;
        return this;
    }

    public void b(boolean z) {
        this.m = bn.a(this.m, 0, z);
    }

    public void c(boolean z) {
        this.m = bn.a(this.m, 1, z);
    }

    public enum e implements bx {
        IDENTITY(1, "identity"),
        TS(2, "ts"),
        VERSION(3, "version");

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
                return IDENTITY;
            }
            if (i == 2) {
                return TS;
            }
            if (i != 3) {
                return null;
            }
            return VERSION;
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

    public b(String str, long j2, int i2) {
        this();
        this.f2691a = str;
        this.b = j2;
        b(true);
        this.c = i2;
        c(true);
    }

    public void a(boolean z) {
        if (z) {
            return;
        }
        this.f2691a = null;
    }

    @Override // com.umeng.analytics.pro.bq
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e fieldForId(int i2) {
        return e.a(i2);
    }

    public b a(long j2) {
        this.b = j2;
        b(true);
        return this;
    }

    public b a(int i2) {
        this.c = i2;
        c(true);
        return this;
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new cj(new db(objectOutputStream)));
        } catch (bw e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public b(b bVar) {
        this.m = (byte) 0;
        this.m = bVar.m;
        if (bVar.d()) {
            this.f2691a = bVar.f2691a;
        }
        this.b = bVar.b;
        this.c = bVar.c;
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.m = (byte) 0;
            read(new cj(new db(objectInputStream)));
        } catch (bw e2) {
            throw new IOException(e2.getMessage());
        }
    }
}
