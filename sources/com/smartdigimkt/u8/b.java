package com.smartdigimkt.u8;

import com.smartdigimkt.n8.n;
import com.smartdigimkt.sdk.api.ISDMAdManager;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class b extends com.smartdigimkt.s8.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f38939e = getClass().getSimpleName();
    private final AtomicBoolean f = new AtomicBoolean(false);
    private d g;

    public class a implements Runnable {
        final /* synthetic */ com.smartdigimkt.s8.b X;

        public a(com.smartdigimkt.s8.b bVar) {
            this.X = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.f.set(true);
            this.X.a(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.g));
            b.this.d(this.X);
        }
    }

    public class c implements Runnable {
        final /* synthetic */ com.smartdigimkt.s8.b X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.l8.f f38946Y;

        public c(com.smartdigimkt.s8.b bVar, com.smartdigimkt.l8.f fVar) {
            this.X = bVar;
            this.f38946Y = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.smartdigimkt.a7.a aVarA = this.X.d().a();
            String unused = b.this.f38939e;
            JSONArray jSONArray = new JSONArray();
            com.smartdigimkt.t8.b bVarP = this.X.p();
            if (bVarP != null) {
                aVarA.k(bVarP.c());
            }
            aVarA.j(System.currentTimeMillis());
            aVarA.r(2);
            if (this.f38946Y.t0() == 67 || !this.f38946Y.m1() || this.f38946Y.D() == null) {
                return;
            }
            try {
                int iT0 = this.f38946Y.T0();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("sorttype", iT0);
                jSONObject.put("unit_id", this.f38946Y.h());
                jSONObject.put("bidresult", this.f38946Y.D().i() ? "1" : "0");
                if (bVarP != null) {
                    jSONObject.put("bid_token_succ_t", bVarP.d());
                    jSONObject.put("bid_start_t", bVarP.c());
                }
                jSONObject.put("bidprice", this.f38946Y.b() ? String.valueOf(this.f38946Y.V()) : "0");
                jSONObject.put("bidprice_cny", this.f38946Y.b() ? String.valueOf(this.f38946Y.I0()) : "0");
                jSONObject.put("s_pty", this.f38946Y.b() ? String.valueOf(this.f38946Y.R0()) : "0");
                jSONObject.put("nw_firm_id", String.valueOf(this.f38946Y.t0()));
                jSONObject.put("tp_bid_id", this.f38946Y.D() != null ? this.f38946Y.D().v : null);
                jSONObject.put("rl_bid_status", this.f38946Y.C());
                jSONObject.put("errormsg", this.f38946Y.Z());
                jSONObject.put("ad_type", -1);
                jSONObject.put("ads_list_type", this.f38946Y.j());
                jSONObject.put("unit_type", this.f38946Y.A());
                com.smartdigimkt.y6.b bVarD = this.f38946Y.D();
                jSONObject.put("dd_ori_price", bVarD != null ? String.valueOf(bVarD.f40231b) : "0");
                jSONObject.put("dd_dis_rate", this.f38946Y.Q());
                jSONObject.put("dy_bidfloor_sw", this.f38946Y.U());
                jSONObject.put("bid_floor", this.f38946Y.q());
                jSONObject.put("en_p", bVarD != null ? bVarD.c() : "");
                if (bVarD != null && bVarD.q() != 0) {
                    jSONObject.put("deal_id", bVarD.o());
                    jSONObject.put("deal_type", bVarD.r());
                    aVarA.h(bVarD.r());
                    aVarA.g(bVarD.o());
                }
                jSONObject.put("bid_req_delay_t", this.f38946Y.R());
                jSONObject.put("p_coef", this.f38946Y.S0());
                jSONObject.put("network_pl_id", aVarA.Y());
                jSONArray.put(jSONObject);
            } catch (Exception unused2) {
            }
            aVarA.m(this.X.d().I());
            aVarA.r(jSONArray.toString());
            com.smartdigimkt.i7.c.a(com.smartdigimkt.m6.b.p().k()).a(11, aVarA);
        }
    }

    public static class d implements com.smartdigimkt.h7.b {
        Runnable X;

        public d(Runnable runnable) {
            this.X = runnable;
        }

        @Override // com.smartdigimkt.h7.b
        public boolean a() {
            return false;
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable = this.X;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    @Override // com.smartdigimkt.s8.c
    public boolean b(com.smartdigimkt.s8.b bVar) {
        a("start", bVar);
        if (bVar.t()) {
            a("success", bVar);
            return true;
        }
        bVar.e(System.currentTimeMillis());
        String strO = bVar.o();
        com.smartdigimkt.l8.e eVarM = bVar.m();
        if (eVarM == null) {
            bVar.a(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.f39189h, "The placeStrategy is null."));
            return false;
        }
        com.smartdigimkt.l8.f fVarQ = bVar.q();
        if (fVarQ == null) {
            bVar.a(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.f39189h, "The placeStrategy does not has ADX ad source"));
            return false;
        }
        long jW = eVarM.w();
        if (jW < 0) {
            jW = 10000;
        }
        this.g = new d(new a(bVar));
        com.smartdigimkt.h7.e.b().a(this.g, jW);
        ArrayList arrayList = new ArrayList();
        com.smartdigimkt.n7.b.a().a(fVarQ.M(), com.smartdigimkt.v6.a.a(strO, eVarM, fVarQ), new C0629b(bVar, arrayList, strO, eVarM, fVarQ));
        return false;
    }

    public void a(com.smartdigimkt.s8.b bVar, com.smartdigimkt.l8.f fVar) {
        if (bVar == null) {
            return;
        }
        com.smartdigimkt.l7.b.a().g(new c(bVar, fVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, com.smartdigimkt.s8.b bVar) {
        com.smartdigimkt.l8.f fVarQ = bVar.q();
        if (fVarQ != null && bVar.h() != null) {
            fVarQ.g(bVar.h().getErrorInfo());
        }
        n.a(str, bVar.n(), com.smartdigimkt.n8.f.a(String.valueOf(bVar.i())), bVar.q(), bVar.f());
    }

    /* JADX INFO: renamed from: com.smartdigimkt.u8.b$b, reason: collision with other inner class name */
    public class C0629b implements ISDMAdManager.BidTokenCallBack {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.s8.b f38941a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f38942b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f38943c;
        final /* synthetic */ com.smartdigimkt.l8.e d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.l8.f f38944e;

        public C0629b(com.smartdigimkt.s8.b bVar, List list, String str, com.smartdigimkt.l8.e eVar, com.smartdigimkt.l8.f fVar) {
            this.f38941a = bVar;
            this.f38942b = list;
            this.f38943c = str;
            this.d = eVar;
            this.f38944e = fVar;
        }

        @Override // com.smartdigimkt.sdk.api.ISDMAdManager.BidTokenCallBack
        public void onComplete(JSONObject jSONObject) {
            if (jSONObject == null) {
                this.f38941a.a(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.f39189h, "bid token is empty"));
                b.this.a("fail", this.f38941a);
                b.this.a(this.f38941a);
                return;
            }
            try {
                jSONObject.put("get_offer", 2);
                this.f38941a.d(System.currentTimeMillis());
                this.f38942b.add(jSONObject);
                com.smartdigimkt.k8.b.b().a(new com.smartdigimkt.c8.e(this.f38943c, this.d, this.f38942b), new a());
            } catch (Throwable unused) {
                this.f38941a.a(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.f39189h, "bid token handle fail"));
                b.this.a("fail", this.f38941a);
                b.this.a(this.f38941a);
            }
        }

        /* JADX INFO: renamed from: com.smartdigimkt.u8.b$b$a */
        public class a implements com.smartdigimkt.k8.b.a {
            public a() {
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.smartdigimkt.k8.b.a
            public void a(List<com.smartdigimkt.y6.b> list) {
                C0629b.this.f38941a.f(System.currentTimeMillis());
                com.smartdigimkt.h7.e.b().a(b.this.g);
                if (b.this.f.get()) {
                    return;
                }
                if (list != null && !list.isEmpty()) {
                    com.smartdigimkt.y6.b bVar = list.get(0);
                    C0629b.this.f38941a.a(bVar);
                    C0629b.this.f38944e.a(bVar);
                    C0629b.this.f38944e.a(bVar, 0, bVar.i() ? 1 : 0);
                    C0629b c0629b = C0629b.this;
                    C0629b.this.f38941a.a(com.smartdigimkt.v6.a.a(c0629b.f38943c, c0629b.d, c0629b.f38944e));
                    C0629b c0629b2 = C0629b.this;
                    b.this.a(c0629b2.f38941a, c0629b2.f38944e);
                }
                C0629b c0629b3 = C0629b.this;
                b.this.a("success", c0629b3.f38941a);
                C0629b c0629b4 = C0629b.this;
                b.this.a(c0629b4.f38941a);
            }

            @Override // com.smartdigimkt.k8.b.a
            public void b() {
            }

            @Override // com.smartdigimkt.k8.b.a
            public void a(com.smartdigimkt.v7.a aVar) {
                C0629b.this.f38941a.f(System.currentTimeMillis());
                com.smartdigimkt.h7.e.b().a(b.this.g);
                if (b.this.f.get()) {
                    return;
                }
                if (aVar != null) {
                    C0629b.this.f38941a.a(aVar);
                } else {
                    C0629b.this.f38941a.a(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.f39189h));
                }
                C0629b c0629b = C0629b.this;
                b.this.a("fail", c0629b.f38941a);
                C0629b c0629b2 = C0629b.this;
                b.this.a(c0629b2.f38941a);
            }

            @Override // com.smartdigimkt.k8.b.a
            public void a() {
                C0629b.this.f38941a.f(System.currentTimeMillis());
                com.smartdigimkt.h7.e.b().a(b.this.g);
                C0629b.this.f38941a.a(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.f39189h, "Bid request was canceled."));
                C0629b c0629b = C0629b.this;
                b.this.a(c0629b.f38941a);
            }
        }
    }
}
