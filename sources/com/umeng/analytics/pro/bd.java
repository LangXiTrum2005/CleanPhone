package com.umeng.analytics.pro;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class bd implements bq<bd, e>, Serializable, Cloneable {
    private static final int A = 2;
    private static final int B = 3;
    public static final Map<e, cc> k;
    private static final long l = 420342210744516016L;
    private static final cu m = new cu("UMEnvelope");
    private static final ck n = new ck("version", (byte) 11, 1);
    private static final ck o = new ck("address", (byte) 11, 2);
    private static final ck p = new ck("signature", (byte) 11, 3);
    private static final ck q = new ck("serial_num", (byte) 8, 4);
    private static final ck r = new ck("ts_secs", (byte) 8, 5);
    private static final ck s = new ck("length", (byte) 8, 6);
    private static final ck t = new ck("entity", (byte) 11, 7);
    private static final ck u = new ck("guid", (byte) 11, 8);
    private static final ck v = new ck("checksum", (byte) 11, 9);
    private static final ck w = new ck("codex", (byte) 8, 10);
    private static final Map<Class<? extends cx>, cy> x;
    private static final int y = 0;
    private static final int z = 1;
    private byte C;
    private e[] D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f2509a;
    public String b;
    public String c;
    public int d;
    public int e;
    public int f;
    public ByteBuffer g;
    public String h;
    public String i;
    public int j;

    public static class a extends cz<bd> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.cx
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(cp cpVar, bd bdVar) throws bw {
            cpVar.j();
            while (true) {
                ck ckVarL = cpVar.l();
                byte b = ckVarL.b;
                if (b == 0) {
                    cpVar.k();
                    if (!bdVar.m()) {
                        throw new cq("Required field 'serial_num' was not found in serialized data! Struct: " + toString());
                    }
                    if (!bdVar.p()) {
                        throw new cq("Required field 'ts_secs' was not found in serialized data! Struct: " + toString());
                    }
                    if (!bdVar.s()) {
                        throw new cq("Required field 'length' was not found in serialized data! Struct: " + toString());
                    }
                    bdVar.G();
                    return;
                }
                switch (ckVarL.c) {
                    case 1:
                        if (b != 11) {
                            cs.a(cpVar, b);
                        } else {
                            bdVar.f2509a = cpVar.z();
                            bdVar.a(true);
                        }
                        break;
                    case 2:
                        if (b != 11) {
                            cs.a(cpVar, b);
                        } else {
                            bdVar.b = cpVar.z();
                            bdVar.b(true);
                        }
                        break;
                    case 3:
                        if (b != 11) {
                            cs.a(cpVar, b);
                        } else {
                            bdVar.c = cpVar.z();
                            bdVar.c(true);
                        }
                        break;
                    case 4:
                        if (b != 8) {
                            cs.a(cpVar, b);
                        } else {
                            bdVar.d = cpVar.w();
                            bdVar.d(true);
                        }
                        break;
                    case 5:
                        if (b != 8) {
                            cs.a(cpVar, b);
                        } else {
                            bdVar.e = cpVar.w();
                            bdVar.e(true);
                        }
                        break;
                    case 6:
                        if (b != 8) {
                            cs.a(cpVar, b);
                        } else {
                            bdVar.f = cpVar.w();
                            bdVar.f(true);
                        }
                        break;
                    case 7:
                        if (b != 11) {
                            cs.a(cpVar, b);
                        } else {
                            bdVar.g = cpVar.A();
                            bdVar.g(true);
                        }
                        break;
                    case 8:
                        if (b != 11) {
                            cs.a(cpVar, b);
                        } else {
                            bdVar.h = cpVar.z();
                            bdVar.h(true);
                        }
                        break;
                    case 9:
                        if (b != 11) {
                            cs.a(cpVar, b);
                        } else {
                            bdVar.i = cpVar.z();
                            bdVar.i(true);
                        }
                        break;
                    case 10:
                        if (b != 8) {
                            cs.a(cpVar, b);
                        } else {
                            bdVar.j = cpVar.w();
                            bdVar.j(true);
                        }
                        break;
                    default:
                        cs.a(cpVar, b);
                        break;
                }
                cpVar.m();
            }
        }

        @Override // com.umeng.analytics.pro.cx
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(cp cpVar, bd bdVar) throws bw {
            bdVar.G();
            cpVar.a(bd.m);
            if (bdVar.f2509a != null) {
                cpVar.a(bd.n);
                cpVar.a(bdVar.f2509a);
                cpVar.c();
            }
            if (bdVar.b != null) {
                cpVar.a(bd.o);
                cpVar.a(bdVar.b);
                cpVar.c();
            }
            if (bdVar.c != null) {
                cpVar.a(bd.p);
                cpVar.a(bdVar.c);
                cpVar.c();
            }
            cpVar.a(bd.q);
            cpVar.a(bdVar.d);
            cpVar.c();
            cpVar.a(bd.r);
            cpVar.a(bdVar.e);
            cpVar.c();
            cpVar.a(bd.s);
            cpVar.a(bdVar.f);
            cpVar.c();
            if (bdVar.g != null) {
                cpVar.a(bd.t);
                cpVar.a(bdVar.g);
                cpVar.c();
            }
            if (bdVar.h != null) {
                cpVar.a(bd.u);
                cpVar.a(bdVar.h);
                cpVar.c();
            }
            if (bdVar.i != null) {
                cpVar.a(bd.v);
                cpVar.a(bdVar.i);
                cpVar.c();
            }
            if (bdVar.F()) {
                cpVar.a(bd.w);
                cpVar.a(bdVar.j);
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

    public static class c extends da<bd> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.cx
        public void a(cp cpVar, bd bdVar) throws bw {
            cv cvVar = (cv) cpVar;
            cvVar.a(bdVar.f2509a);
            cvVar.a(bdVar.b);
            cvVar.a(bdVar.c);
            cvVar.a(bdVar.d);
            cvVar.a(bdVar.e);
            cvVar.a(bdVar.f);
            cvVar.a(bdVar.g);
            cvVar.a(bdVar.h);
            cvVar.a(bdVar.i);
            BitSet bitSet = new BitSet();
            if (bdVar.F()) {
                bitSet.set(0);
            }
            cvVar.a(bitSet, 1);
            if (bdVar.F()) {
                cvVar.a(bdVar.j);
            }
        }

        @Override // com.umeng.analytics.pro.cx
        public void b(cp cpVar, bd bdVar) throws bw {
            cv cvVar = (cv) cpVar;
            bdVar.f2509a = cvVar.z();
            bdVar.a(true);
            bdVar.b = cvVar.z();
            bdVar.b(true);
            bdVar.c = cvVar.z();
            bdVar.c(true);
            bdVar.d = cvVar.w();
            bdVar.d(true);
            bdVar.e = cvVar.w();
            bdVar.e(true);
            bdVar.f = cvVar.w();
            bdVar.f(true);
            bdVar.g = cvVar.A();
            bdVar.g(true);
            bdVar.h = cvVar.z();
            bdVar.h(true);
            bdVar.i = cvVar.z();
            bdVar.i(true);
            if (cvVar.b(1).get(0)) {
                bdVar.j = cvVar.w();
                bdVar.j(true);
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
        x = map;
        map.put(cz.class, new b());
        map.put(da.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put(e.VERSION, new cc("version", (byte) 1, new cd((byte) 11)));
        enumMap.put(e.ADDRESS, new cc("address", (byte) 1, new cd((byte) 11)));
        enumMap.put(e.SIGNATURE, new cc("signature", (byte) 1, new cd((byte) 11)));
        enumMap.put(e.SERIAL_NUM, new cc("serial_num", (byte) 1, new cd((byte) 8)));
        enumMap.put(e.TS_SECS, new cc("ts_secs", (byte) 1, new cd((byte) 8)));
        enumMap.put(e.LENGTH, new cc("length", (byte) 1, new cd((byte) 8)));
        enumMap.put(e.ENTITY, new cc("entity", (byte) 1, new cd((byte) 11, true)));
        enumMap.put(e.GUID, new cc("guid", (byte) 1, new cd((byte) 11)));
        enumMap.put(e.CHECKSUM, new cc("checksum", (byte) 1, new cd((byte) 11)));
        enumMap.put(e.CODEX, new cc("codex", (byte) 2, new cd((byte) 8)));
        Map<e, cc> mapUnmodifiableMap = Collections.unmodifiableMap(enumMap);
        k = mapUnmodifiableMap;
        cc.a(bd.class, mapUnmodifiableMap);
    }

    public bd() {
        this.C = (byte) 0;
        this.D = new e[]{e.CODEX};
    }

    public String A() {
        return this.i;
    }

    public void B() {
        this.i = null;
    }

    public boolean C() {
        return this.i != null;
    }

    public int D() {
        return this.j;
    }

    public void E() {
        this.C = bn.b(this.C, 3);
    }

    public boolean F() {
        return bn.a(this.C, 3);
    }

    public void G() throws bw {
        if (this.f2509a == null) {
            throw new cq("Required field 'version' was not present! Struct: " + toString());
        }
        if (this.b == null) {
            throw new cq("Required field 'address' was not present! Struct: " + toString());
        }
        if (this.c == null) {
            throw new cq("Required field 'signature' was not present! Struct: " + toString());
        }
        if (this.g == null) {
            throw new cq("Required field 'entity' was not present! Struct: " + toString());
        }
        if (this.h == null) {
            throw new cq("Required field 'guid' was not present! Struct: " + toString());
        }
        if (this.i != null) {
            return;
        }
        throw new cq("Required field 'checksum' was not present! Struct: " + toString());
    }

    @Override // com.umeng.analytics.pro.bq
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public bd deepCopy() {
        return new bd(this);
    }

    public String b() {
        return this.f2509a;
    }

    public void c() {
        this.f2509a = null;
    }

    @Override // com.umeng.analytics.pro.bq
    public void clear() {
        this.f2509a = null;
        this.b = null;
        this.c = null;
        d(false);
        this.d = 0;
        e(false);
        this.e = 0;
        f(false);
        this.f = 0;
        this.g = null;
        this.h = null;
        this.i = null;
        j(false);
        this.j = 0;
    }

    public boolean d() {
        return this.f2509a != null;
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

    public int k() {
        return this.d;
    }

    public void l() {
        this.C = bn.b(this.C, 0);
    }

    public boolean m() {
        return bn.a(this.C, 0);
    }

    public int n() {
        return this.e;
    }

    public void o() {
        this.C = bn.b(this.C, 1);
    }

    public boolean p() {
        return bn.a(this.C, 1);
    }

    public int q() {
        return this.f;
    }

    public void r() {
        this.C = bn.b(this.C, 2);
    }

    @Override // com.umeng.analytics.pro.bq
    public void read(cp cpVar) throws bw {
        x.get(cpVar.D()).b().b(cpVar, this);
    }

    public boolean s() {
        return bn.a(this.C, 2);
    }

    public byte[] t() {
        a(br.c(this.g));
        ByteBuffer byteBuffer = this.g;
        if (byteBuffer == null) {
            return null;
        }
        return byteBuffer.array();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UMEnvelope(");
        sb.append("version:");
        String str = this.f2509a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("address:");
        String str2 = this.b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("signature:");
        String str3 = this.c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("serial_num:");
        sb.append(this.d);
        sb.append(", ");
        sb.append("ts_secs:");
        sb.append(this.e);
        sb.append(", ");
        sb.append("length:");
        sb.append(this.f);
        sb.append(", ");
        sb.append("entity:");
        ByteBuffer byteBuffer = this.g;
        if (byteBuffer == null) {
            sb.append("null");
        } else {
            br.a(byteBuffer, sb);
        }
        sb.append(", ");
        sb.append("guid:");
        String str4 = this.h;
        if (str4 == null) {
            sb.append("null");
        } else {
            sb.append(str4);
        }
        sb.append(", ");
        sb.append("checksum:");
        String str5 = this.i;
        if (str5 == null) {
            sb.append("null");
        } else {
            sb.append(str5);
        }
        if (F()) {
            sb.append(", ");
            sb.append("codex:");
            sb.append(this.j);
        }
        sb.append(")");
        return sb.toString();
    }

    public ByteBuffer u() {
        return this.g;
    }

    public void v() {
        this.g = null;
    }

    public boolean w() {
        return this.g != null;
    }

    @Override // com.umeng.analytics.pro.bq
    public void write(cp cpVar) throws bw {
        x.get(cpVar.D()).b().a(cpVar, this);
    }

    public String x() {
        return this.h;
    }

    public void y() {
        this.h = null;
    }

    public boolean z() {
        return this.h != null;
    }

    public bd a(String str) {
        this.f2509a = str;
        return this;
    }

    public bd b(String str) {
        this.b = str;
        return this;
    }

    public bd c(String str) {
        this.c = str;
        return this;
    }

    public void d(boolean z2) {
        this.C = bn.a(this.C, 0, z2);
    }

    public void e(boolean z2) {
        this.C = bn.a(this.C, 1, z2);
    }

    public void f(boolean z2) {
        this.C = bn.a(this.C, 2, z2);
    }

    public void g(boolean z2) {
        if (z2) {
            return;
        }
        this.g = null;
    }

    public void h(boolean z2) {
        if (z2) {
            return;
        }
        this.h = null;
    }

    public void i(boolean z2) {
        if (z2) {
            return;
        }
        this.i = null;
    }

    public void j(boolean z2) {
        this.C = bn.a(this.C, 3, z2);
    }

    public void a(boolean z2) {
        if (z2) {
            return;
        }
        this.f2509a = null;
    }

    public void b(boolean z2) {
        if (z2) {
            return;
        }
        this.b = null;
    }

    public void c(boolean z2) {
        if (z2) {
            return;
        }
        this.c = null;
    }

    public bd d(String str) {
        this.h = str;
        return this;
    }

    public bd e(String str) {
        this.i = str;
        return this;
    }

    public bd(String str, String str2, String str3, int i, int i2, int i3, ByteBuffer byteBuffer, String str4, String str5) {
        this();
        this.f2509a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        d(true);
        this.e = i2;
        e(true);
        this.f = i3;
        f(true);
        this.g = byteBuffer;
        this.h = str4;
        this.i = str5;
    }

    public bd a(int i) {
        this.d = i;
        d(true);
        return this;
    }

    public bd b(int i) {
        this.e = i;
        e(true);
        return this;
    }

    public bd c(int i) {
        this.f = i;
        f(true);
        return this;
    }

    public bd d(int i) {
        this.j = i;
        j(true);
        return this;
    }

    @Override // com.umeng.analytics.pro.bq
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public e fieldForId(int i) {
        return e.a(i);
    }

    public bd a(byte[] bArr) {
        a(bArr == null ? null : ByteBuffer.wrap(bArr));
        return this;
    }

    public bd a(ByteBuffer byteBuffer) {
        this.g = byteBuffer;
        return this;
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new cj(new db(objectOutputStream)));
        } catch (bw e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public enum e implements bx {
        VERSION(1, "version"),
        ADDRESS(2, "address"),
        SIGNATURE(3, "signature"),
        SERIAL_NUM(4, "serial_num"),
        TS_SECS(5, "ts_secs"),
        LENGTH(6, "length"),
        ENTITY(7, "entity"),
        GUID(8, "guid"),
        CHECKSUM(9, "checksum"),
        CODEX(10, "codex");

        private static final Map<String, e> k = new HashMap();
        private final short l;
        private final String m;

        static {
            for (e eVar : EnumSet.allOf(e.class)) {
                k.put(eVar.b(), eVar);
            }
        }

        e(short s, String str) {
            this.l = s;
            this.m = str;
        }

        public static e a(int i) {
            switch (i) {
                case 1:
                    return VERSION;
                case 2:
                    return ADDRESS;
                case 3:
                    return SIGNATURE;
                case 4:
                    return SERIAL_NUM;
                case 5:
                    return TS_SECS;
                case 6:
                    return LENGTH;
                case 7:
                    return ENTITY;
                case 8:
                    return GUID;
                case 9:
                    return CHECKSUM;
                case 10:
                    return CODEX;
                default:
                    return null;
            }
        }

        public static e b(int i) {
            e eVarA = a(i);
            if (eVarA != null) {
                return eVarA;
            }
            throw new IllegalArgumentException(AbstractC5044xl.g("Field ", i, " doesn't exist!"));
        }

        @Override // com.umeng.analytics.pro.bx
        public String b() {
            return this.m;
        }

        public static e a(String str) {
            return k.get(str);
        }

        @Override // com.umeng.analytics.pro.bx
        public short a() {
            return this.l;
        }
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.C = (byte) 0;
            read(new cj(new db(objectInputStream)));
        } catch (bw e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public bd(bd bdVar) {
        this.C = (byte) 0;
        this.D = new e[]{e.CODEX};
        this.C = bdVar.C;
        if (bdVar.d()) {
            this.f2509a = bdVar.f2509a;
        }
        if (bdVar.g()) {
            this.b = bdVar.b;
        }
        if (bdVar.j()) {
            this.c = bdVar.c;
        }
        this.d = bdVar.d;
        this.e = bdVar.e;
        this.f = bdVar.f;
        if (bdVar.w()) {
            this.g = br.d(bdVar.g);
        }
        if (bdVar.z()) {
            this.h = bdVar.h;
        }
        if (bdVar.C()) {
            this.i = bdVar.i;
        }
        this.j = bdVar.j;
    }
}
