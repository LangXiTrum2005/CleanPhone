package com.umeng.commonsdk.statistics.proto;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.umeng.analytics.pro.bn;
import com.umeng.analytics.pro.bq;
import com.umeng.analytics.pro.bw;
import com.umeng.analytics.pro.bx;
import com.umeng.analytics.pro.cc;
import com.umeng.analytics.pro.cd;
import com.umeng.analytics.pro.cj;
import com.umeng.analytics.pro.ck;
import com.umeng.analytics.pro.cp;
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
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class e implements bq<e, EnumC0291e>, Serializable, Cloneable {
    public static final Map<EnumC0291e, cc> d;
    private static final long e = 7501688097813630241L;
    private static final cu f = new cu("ImprintValue");
    private static final ck g = new ck(AppMeasurementSdk.ConditionalUserProperty.VALUE, (byte) 11, 1);
    private static final ck h = new ck("ts", (byte) 10, 2);
    private static final ck i = new ck("guid", (byte) 11, 3);
    private static final Map<Class<? extends cx>, cy> j;
    private static final int k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f2697a;
    public long b;
    public String c;
    private byte l;
    private EnumC0291e[] m;

    public static class a extends cz<e> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.cx
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(cp cpVar, e eVar) throws bw {
            cpVar.j();
            while (true) {
                ck ckVarL = cpVar.l();
                byte b = ckVarL.b;
                if (b == 0) {
                    cpVar.k();
                    eVar.k();
                    return;
                }
                short s = ckVarL.c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            cs.a(cpVar, b);
                        } else if (b == 11) {
                            eVar.c = cpVar.z();
                            eVar.c(true);
                        } else {
                            cs.a(cpVar, b);
                        }
                    } else if (b == 10) {
                        eVar.b = cpVar.x();
                        eVar.b(true);
                    } else {
                        cs.a(cpVar, b);
                    }
                } else if (b == 11) {
                    eVar.f2697a = cpVar.z();
                    eVar.a(true);
                } else {
                    cs.a(cpVar, b);
                }
                cpVar.m();
            }
        }

        @Override // com.umeng.analytics.pro.cx
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(cp cpVar, e eVar) throws bw {
            eVar.k();
            cpVar.a(e.f);
            if (eVar.f2697a != null && eVar.d()) {
                cpVar.a(e.g);
                cpVar.a(eVar.f2697a);
                cpVar.c();
            }
            if (eVar.g()) {
                cpVar.a(e.h);
                cpVar.a(eVar.b);
                cpVar.c();
            }
            if (eVar.c != null && eVar.j()) {
                cpVar.a(e.i);
                cpVar.a(eVar.c);
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

    public static class c extends da<e> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.cx
        public void a(cp cpVar, e eVar) throws bw {
            cv cvVar = (cv) cpVar;
            BitSet bitSet = new BitSet();
            if (eVar.d()) {
                bitSet.set(0);
            }
            if (eVar.g()) {
                bitSet.set(1);
            }
            if (eVar.j()) {
                bitSet.set(2);
            }
            cvVar.a(bitSet, 3);
            if (eVar.d()) {
                cvVar.a(eVar.f2697a);
            }
            if (eVar.g()) {
                cvVar.a(eVar.b);
            }
            if (eVar.j()) {
                cvVar.a(eVar.c);
            }
        }

        @Override // com.umeng.analytics.pro.cx
        public void b(cp cpVar, e eVar) throws bw {
            cv cvVar = (cv) cpVar;
            BitSet bitSetB = cvVar.b(3);
            if (bitSetB.get(0)) {
                eVar.f2697a = cvVar.z();
                eVar.a(true);
            }
            if (bitSetB.get(1)) {
                eVar.b = cvVar.x();
                eVar.b(true);
            }
            if (bitSetB.get(2)) {
                eVar.c = cvVar.z();
                eVar.c(true);
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
        j = map;
        map.put(cz.class, new b());
        map.put(da.class, new d());
        EnumMap enumMap = new EnumMap(EnumC0291e.class);
        enumMap.put(EnumC0291e.VALUE, new cc(AppMeasurementSdk.ConditionalUserProperty.VALUE, (byte) 2, new cd((byte) 11)));
        enumMap.put(EnumC0291e.TS, new cc("ts", (byte) 2, new cd((byte) 10)));
        enumMap.put(EnumC0291e.GUID, new cc("guid", (byte) 2, new cd((byte) 11)));
        Map<EnumC0291e, cc> mapUnmodifiableMap = Collections.unmodifiableMap(enumMap);
        d = mapUnmodifiableMap;
        cc.a(e.class, mapUnmodifiableMap);
    }

    public e() {
        this.l = (byte) 0;
        this.m = new EnumC0291e[]{EnumC0291e.VALUE, EnumC0291e.TS, EnumC0291e.GUID};
    }

    @Override // com.umeng.analytics.pro.bq
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public e deepCopy() {
        return new e(this);
    }

    public String b() {
        return this.f2697a;
    }

    public void c() {
        this.f2697a = null;
    }

    @Override // com.umeng.analytics.pro.bq
    public void clear() {
        this.f2697a = null;
        b(false);
        this.b = 0L;
        this.c = null;
    }

    public boolean d() {
        return this.f2697a != null;
    }

    public long e() {
        return this.b;
    }

    public void f() {
        this.l = bn.b(this.l, 0);
    }

    public boolean g() {
        return bn.a(this.l, 0);
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

    public void k() throws bw {
    }

    @Override // com.umeng.analytics.pro.bq
    public void read(cp cpVar) throws bw {
        j.get(cpVar.D()).b().b(cpVar, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ImprintValue(");
        if (d()) {
            sb.append("value:");
            String str = this.f2697a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            sb.append(", ");
        }
        sb.append("ts:");
        sb.append(this.b);
        sb.append(", ");
        sb.append("guid:");
        String str2 = this.c;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // com.umeng.analytics.pro.bq
    public void write(cp cpVar) throws bw {
        j.get(cpVar.D()).b().a(cpVar, this);
    }

    public e a(String str) {
        this.f2697a = str;
        return this;
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

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.e$e, reason: collision with other inner class name */
    public enum EnumC0291e implements bx {
        VALUE(1, AppMeasurementSdk.ConditionalUserProperty.VALUE),
        TS(2, "ts"),
        GUID(3, "guid");

        private static final Map<String, EnumC0291e> d = new HashMap();
        private final short e;
        private final String f;

        static {
            for (EnumC0291e enumC0291e : EnumSet.allOf(EnumC0291e.class)) {
                d.put(enumC0291e.b(), enumC0291e);
            }
        }

        EnumC0291e(short s, String str) {
            this.e = s;
            this.f = str;
        }

        public static EnumC0291e a(int i) {
            if (i == 1) {
                return VALUE;
            }
            if (i == 2) {
                return TS;
            }
            if (i != 3) {
                return null;
            }
            return GUID;
        }

        public static EnumC0291e b(int i) {
            EnumC0291e enumC0291eA = a(i);
            if (enumC0291eA != null) {
                return enumC0291eA;
            }
            throw new IllegalArgumentException(AbstractC5044xl.g("Field ", i, " doesn't exist!"));
        }

        public static EnumC0291e a(String str) {
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

    public void a(boolean z) {
        if (z) {
            return;
        }
        this.f2697a = null;
    }

    public e b(String str) {
        this.c = str;
        return this;
    }

    public e(long j2, String str) {
        this();
        this.b = j2;
        b(true);
        this.c = str;
    }

    public e a(long j2) {
        this.b = j2;
        b(true);
        return this;
    }

    @Override // com.umeng.analytics.pro.bq
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public EnumC0291e fieldForId(int i2) {
        return EnumC0291e.a(i2);
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new cj(new db(objectOutputStream)));
        } catch (bw e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public e(e eVar) {
        this.l = (byte) 0;
        this.m = new EnumC0291e[]{EnumC0291e.VALUE, EnumC0291e.TS, EnumC0291e.GUID};
        this.l = eVar.l;
        if (eVar.d()) {
            this.f2697a = eVar.f2697a;
        }
        this.b = eVar.b;
        if (eVar.j()) {
            this.c = eVar.c;
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
