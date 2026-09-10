package com.umeng.commonsdk.statistics.proto;

import androidx.core.app.NotificationCompat;
import com.umeng.analytics.pro.bc;
import com.umeng.analytics.pro.bn;
import com.umeng.analytics.pro.bq;
import com.umeng.analytics.pro.bw;
import com.umeng.analytics.pro.bx;
import com.umeng.analytics.pro.cc;
import com.umeng.analytics.pro.cd;
import com.umeng.analytics.pro.ch;
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
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class Response implements bq<Response, e>, Serializable, Cloneable {
    private static final int __RESP_CODE_ISSET_ID = 0;
    public static final Map<e, cc> metaDataMap;
    private static final Map<Class<? extends cx>, cy> schemes;
    private static final long serialVersionUID = -4549277923241195391L;
    private byte __isset_bitfield;
    public com.umeng.commonsdk.statistics.proto.d imprint;
    public String msg;
    private e[] optionals;
    public int resp_code;
    private static final cu STRUCT_DESC = new cu("Response");
    private static final ck RESP_CODE_FIELD_DESC = new ck("resp_code", (byte) 8, 1);
    private static final ck MSG_FIELD_DESC = new ck(NotificationCompat.CATEGORY_MESSAGE, (byte) 11, 2);
    private static final ck IMPRINT_FIELD_DESC = new ck(bc.X, (byte) 12, 3);

    public static class a extends cz<Response> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.cx
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(cp cpVar, Response response) throws bw {
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
                        } else if (b == 12) {
                            com.umeng.commonsdk.statistics.proto.d dVar = new com.umeng.commonsdk.statistics.proto.d();
                            response.imprint = dVar;
                            dVar.read(cpVar);
                            response.setImprintIsSet(true);
                        } else {
                            cs.a(cpVar, b);
                        }
                    } else if (b == 11) {
                        response.msg = cpVar.z();
                        response.setMsgIsSet(true);
                    } else {
                        cs.a(cpVar, b);
                    }
                } else if (b == 8) {
                    response.resp_code = cpVar.w();
                    response.setResp_codeIsSet(true);
                } else {
                    cs.a(cpVar, b);
                }
                cpVar.m();
            }
            cpVar.k();
            if (response.isSetResp_code()) {
                response.validate();
            } else {
                throw new cq("Required field 'resp_code' was not found in serialized data! Struct: " + toString());
            }
        }

        @Override // com.umeng.analytics.pro.cx
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(cp cpVar, Response response) throws bw {
            response.validate();
            cpVar.a(Response.STRUCT_DESC);
            cpVar.a(Response.RESP_CODE_FIELD_DESC);
            cpVar.a(response.resp_code);
            cpVar.c();
            if (response.msg != null && response.isSetMsg()) {
                cpVar.a(Response.MSG_FIELD_DESC);
                cpVar.a(response.msg);
                cpVar.c();
            }
            if (response.imprint != null && response.isSetImprint()) {
                cpVar.a(Response.IMPRINT_FIELD_DESC);
                response.imprint.write(cpVar);
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

    public static class c extends da<Response> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.cx
        public void a(cp cpVar, Response response) throws bw {
            cv cvVar = (cv) cpVar;
            cvVar.a(response.resp_code);
            BitSet bitSet = new BitSet();
            if (response.isSetMsg()) {
                bitSet.set(0);
            }
            if (response.isSetImprint()) {
                bitSet.set(1);
            }
            cvVar.a(bitSet, 2);
            if (response.isSetMsg()) {
                cvVar.a(response.msg);
            }
            if (response.isSetImprint()) {
                response.imprint.write(cvVar);
            }
        }

        @Override // com.umeng.analytics.pro.cx
        public void b(cp cpVar, Response response) throws bw {
            cv cvVar = (cv) cpVar;
            response.resp_code = cvVar.w();
            response.setResp_codeIsSet(true);
            BitSet bitSetB = cvVar.b(2);
            if (bitSetB.get(0)) {
                response.msg = cvVar.z();
                response.setMsgIsSet(true);
            }
            if (bitSetB.get(1)) {
                com.umeng.commonsdk.statistics.proto.d dVar = new com.umeng.commonsdk.statistics.proto.d();
                response.imprint = dVar;
                dVar.read(cvVar);
                response.setImprintIsSet(true);
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
        schemes = map;
        map.put(cz.class, new b());
        map.put(da.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put(e.RESP_CODE, new cc("resp_code", (byte) 1, new cd((byte) 8)));
        enumMap.put(e.MSG, new cc(NotificationCompat.CATEGORY_MESSAGE, (byte) 2, new cd((byte) 11)));
        enumMap.put(e.IMPRINT, new cc(bc.X, (byte) 2, new ch((byte) 12, com.umeng.commonsdk.statistics.proto.d.class)));
        Map<e, cc> mapUnmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = mapUnmodifiableMap;
        cc.a(Response.class, mapUnmodifiableMap);
    }

    public Response() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new e[]{e.MSG, e.IMPRINT};
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.__isset_bitfield = (byte) 0;
            read(new cj(new db(objectInputStream)));
        } catch (bw e2) {
            throw new IOException(e2.getMessage());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new cj(new db(objectOutputStream)));
        } catch (bw e2) {
            throw new IOException(e2.getMessage());
        }
    }

    @Override // com.umeng.analytics.pro.bq
    public void clear() {
        setResp_codeIsSet(false);
        this.resp_code = 0;
        this.msg = null;
        this.imprint = null;
    }

    public com.umeng.commonsdk.statistics.proto.d getImprint() {
        return this.imprint;
    }

    public String getMsg() {
        return this.msg;
    }

    public int getResp_code() {
        return this.resp_code;
    }

    public boolean isSetImprint() {
        return this.imprint != null;
    }

    public boolean isSetMsg() {
        return this.msg != null;
    }

    public boolean isSetResp_code() {
        return bn.a(this.__isset_bitfield, 0);
    }

    @Override // com.umeng.analytics.pro.bq
    public void read(cp cpVar) throws bw {
        schemes.get(cpVar.D()).b().b(cpVar, this);
    }

    public Response setImprint(com.umeng.commonsdk.statistics.proto.d dVar) {
        this.imprint = dVar;
        return this;
    }

    public void setImprintIsSet(boolean z) {
        if (z) {
            return;
        }
        this.imprint = null;
    }

    public Response setMsg(String str) {
        this.msg = str;
        return this;
    }

    public void setMsgIsSet(boolean z) {
        if (z) {
            return;
        }
        this.msg = null;
    }

    public Response setResp_code(int i) {
        this.resp_code = i;
        setResp_codeIsSet(true);
        return this;
    }

    public void setResp_codeIsSet(boolean z) {
        this.__isset_bitfield = bn.a(this.__isset_bitfield, 0, z);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Response(resp_code:");
        sb.append(this.resp_code);
        if (isSetMsg()) {
            sb.append(", ");
            sb.append("msg:");
            String str = this.msg;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
        }
        if (isSetImprint()) {
            sb.append(", ");
            sb.append("imprint:");
            com.umeng.commonsdk.statistics.proto.d dVar = this.imprint;
            if (dVar == null) {
                sb.append("null");
            } else {
                sb.append(dVar);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public void unsetImprint() {
        this.imprint = null;
    }

    public void unsetMsg() {
        this.msg = null;
    }

    public void unsetResp_code() {
        this.__isset_bitfield = bn.b(this.__isset_bitfield, 0);
    }

    public void validate() throws bw {
        com.umeng.commonsdk.statistics.proto.d dVar = this.imprint;
        if (dVar != null) {
            dVar.l();
        }
    }

    @Override // com.umeng.analytics.pro.bq
    public void write(cp cpVar) throws bw {
        schemes.get(cpVar.D()).b().a(cpVar, this);
    }

    @Override // com.umeng.analytics.pro.bq
    public Response deepCopy() {
        return new Response(this);
    }

    @Override // com.umeng.analytics.pro.bq
    public e fieldForId(int i) {
        return e.a(i);
    }

    public enum e implements bx {
        RESP_CODE(1, "resp_code"),
        MSG(2, NotificationCompat.CATEGORY_MESSAGE),
        IMPRINT(3, bc.X);

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
                return RESP_CODE;
            }
            if (i == 2) {
                return MSG;
            }
            if (i != 3) {
                return null;
            }
            return IMPRINT;
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

    public Response(int i) {
        this();
        this.resp_code = i;
        setResp_codeIsSet(true);
    }

    public Response(Response response) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new e[]{e.MSG, e.IMPRINT};
        this.__isset_bitfield = response.__isset_bitfield;
        this.resp_code = response.resp_code;
        if (response.isSetMsg()) {
            this.msg = response.msg;
        }
        if (response.isSetImprint()) {
            this.imprint = new com.umeng.commonsdk.statistics.proto.d(response.imprint);
        }
    }
}
