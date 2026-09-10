package com.mbridge.msdk.newreward.adapter.logiccontroller;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.newout.RewardVideoListener;
import com.mbridge.msdk.newreward.adapter.e;
import com.mbridge.msdk.newreward.function.command.c;
import com.mbridge.msdk.newreward.function.command.f;
import com.mbridge.msdk.out.MBridgeIds;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements com.mbridge.msdk.newreward.adapter.req.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected c f1569a;
    private RewardVideoListener b;
    protected MBridgeIds c;
    protected e d;

    /* JADX INFO: renamed from: com.mbridge.msdk.newreward.adapter.logiccontroller.a$a, reason: collision with other inner class name */
    public class C0201a implements com.mbridge.msdk.newreward.adapter.req.b {
        public C0201a() {
        }

        @Override // com.mbridge.msdk.newreward.adapter.req.b
        public void reqFailed(com.mbridge.msdk.foundation.error.b bVar) {
            a aVar = a.this;
            aVar.a(aVar.c, bVar);
        }

        @Override // com.mbridge.msdk.newreward.adapter.req.b
        public void reqSuccessful(Object obj) {
            a aVar = a.this;
            c cVar = aVar.f1569a;
            cVar.a(cVar.a("command_manager", cVar, "adapter_model", aVar.d), a.this);
        }
    }

    public class b implements com.mbridge.msdk.newreward.adapter.req.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.foundation.error.b f1571a;

        public b(com.mbridge.msdk.foundation.error.b bVar) {
            this.f1571a = bVar;
        }

        @Override // com.mbridge.msdk.newreward.adapter.req.b
        public void reqFailed(com.mbridge.msdk.foundation.error.b bVar) {
            a aVar = a.this;
            aVar.a(aVar.c, this.f1571a);
        }

        @Override // com.mbridge.msdk.newreward.adapter.req.b
        public void reqSuccessful(Object obj) {
            a.this.a(1, obj);
            a.this.a(2, obj);
        }
    }

    public a(c cVar) {
        this.f1569a = cVar;
    }

    private void a(e eVar) {
        eVar.c(1);
        this.d = eVar;
        this.b = eVar.M();
        MBridgeIds mBridgeIds = (MBridgeIds) this.f1569a.a((Object) null, f.CREATE_BIDS);
        this.c = mBridgeIds;
        mBridgeIds.setBidToken(this.d.f());
    }

    public void b(e eVar) {
        a(eVar);
        c cVar = this.f1569a;
        cVar.c(cVar.a("command_type", f.PRE_HANDLE_LOAD, "command_manager", cVar, "adapter_model", this.d), new C0201a());
    }

    public void a(com.mbridge.msdk.foundation.error.b bVar) {
        c cVar = this.f1569a;
        cVar.e(cVar.a("adapter_model", this.d, "command_manager", cVar, com.umeng.ccg.a.j, 2, "reason", bVar), new b(bVar));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void a(int i, Object obj) {
        int iW;
        int iV;
        int iW2;
        int filterCallBackState;
        int iV2;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            this.d.c(2);
            if (this.d.f0()) {
                return;
            }
            if (this.d.g() == null || this.d.g().a() == null) {
                iW2 = 0;
                filterCallBackState = 0;
                iV2 = 0;
            } else {
                com.mbridge.msdk.newreward.function.core.campaign.b bVarA = this.d.g().a();
                iV2 = bVarA.v();
                iW2 = bVarA.w();
                filterCallBackState = (this.d.g().b() == null || this.d.g().b().isEmpty()) ? 0 : this.d.g().b().get(0).getFilterCallBackState();
            }
            c cVar = this.f1569a;
            cVar.a(this.d, f.REPORT_LOAD_VIDEO_CAMPAIGN_SUCCESS, cVar.a("cache", 2, com.mbridge.msdk.foundation.entity.b.JSON_KEY_SECOND_REQUEST_INDEX, Integer.valueOf(iV2), com.mbridge.msdk.foundation.entity.b.JSON_KEY_SECOND_SHOW_INDEX, Integer.valueOf(iW2), CampaignEx.KEY_SECOND_REQUEST_CALLBACK_STATE, Integer.valueOf(filterCallBackState)));
            if (this.b != null) {
                a();
                this.d.k(true);
                this.b.onVideoLoadSuccess(this.c);
                return;
            }
            return;
        }
        if (this.d.Y() || this.d.f0()) {
            return;
        }
        List<CampaignEx> listB = this.d.g() != null ? this.d.g().b() : null;
        if (this.d.g() == null || this.d.g().a() == null) {
            iW = 0;
            iV = 0;
        } else {
            com.mbridge.msdk.newreward.function.core.campaign.b bVarA2 = this.d.g().a();
            iV = bVarA2.v();
            iW = bVarA2.w();
        }
        int filterCallBackState2 = (listB == null || listB.isEmpty()) ? 0 : listB.get(0).getFilterCallBackState();
        c cVar2 = this.f1569a;
        e eVar = this.d;
        f fVar = f.REPORT_LOAD_V3_CAMPAIGN_SUCCESS;
        Object[] objArr = new Object[12];
        objArr[0] = "metrics_data";
        objArr[1] = obj;
        objArr[2] = "auto_load";
        objArr[3] = Integer.valueOf(eVar.X() ? 2 : 1);
        objArr[4] = com.mbridge.msdk.foundation.entity.b.JSON_KEY_SECOND_REQUEST_INDEX;
        objArr[5] = Integer.valueOf(iV);
        objArr[6] = com.mbridge.msdk.foundation.entity.b.JSON_KEY_SECOND_SHOW_INDEX;
        objArr[7] = Integer.valueOf(iW);
        objArr[8] = CampaignEx.KEY_SECOND_REQUEST_CALLBACK_STATE;
        objArr[9] = Integer.valueOf(filterCallBackState2);
        objArr[10] = "cache";
        objArr[11] = 2;
        cVar2.a(eVar, fVar, cVar2.a(objArr));
        if (this.b != null) {
            this.d.d(true);
            this.b.onLoadSuccess(this.c);
        }
    }

    private void a() {
        e eVar = this.d;
        if (eVar == null) {
            return;
        }
        try {
            e eVarJ = eVar.J();
            if (eVarJ == null) {
                return;
            }
            com.mbridge.msdk.newreward.function.model.a aVarG = this.d.g();
            com.mbridge.msdk.newreward.function.model.a aVarG2 = eVarJ.g();
            c cVar = this.f1569a;
            e eVar2 = this.d;
            f fVar = f.REPORT_LOAD_OVERWRITE;
            Object[] objArr = new Object[16];
            objArr[0] = BidResponsedEx.KEY_CID;
            objArr[1] = com.mbridge.msdk.foundation.same.c.a(aVarG == null ? null : aVarG.b());
            objArr[2] = "price";
            objArr[3] = "";
            objArr[4] = "bid_tk";
            objArr[5] = this.d.f();
            objArr[6] = "lrid";
            objArr[7] = this.d.A();
            objArr[8] = "cid_old";
            objArr[9] = com.mbridge.msdk.foundation.same.c.a(aVarG2 == null ? null : aVarG2.b());
            objArr[10] = "price_old";
            objArr[11] = "";
            objArr[12] = "bid_tk_old";
            objArr[13] = eVarJ.f();
            objArr[14] = "lrid_old";
            objArr[15] = eVarJ.A();
            cVar.a(eVar2, fVar, cVar.a(objArr));
            this.d.a((e) null);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                o0.b("LoadController", "reportRemovedCampaignInfo error", e);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:19:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:? A[RETURN, SYNTHETIC] */
    public void a(MBridgeIds mBridgeIds, com.mbridge.msdk.foundation.error.b bVar) {
        int iW;
        int iV;
        int filterCallBackState;
        RewardVideoListener rewardVideoListener;
        this.d.c(2);
        if (this.d.f0()) {
            return;
        }
        if (this.d.g() != null && this.d.g().a() != null) {
            com.mbridge.msdk.newreward.function.core.campaign.b bVarA = this.d.g().a();
            iV = bVarA.v();
            iW = bVarA.w();
            if (this.d.g().b() != null && !this.d.g().b().isEmpty()) {
                filterCallBackState = this.d.g().b().get(0).getFilterCallBackState();
            }
            c cVar = this.f1569a;
            cVar.a(this.d, f.REPORT_LOAD_FAILED, cVar.a("metrics_data", bVar, com.mbridge.msdk.foundation.entity.b.JSON_KEY_SECOND_REQUEST_INDEX, Integer.valueOf(iV), com.mbridge.msdk.foundation.entity.b.JSON_KEY_SECOND_SHOW_INDEX, Integer.valueOf(iW), CampaignEx.KEY_SECOND_REQUEST_CALLBACK_STATE, Integer.valueOf(filterCallBackState)));
            if (this.b != null) {
                this.d.k(true);
                rewardVideoListener = this.b;
                if (rewardVideoListener != null) {
                    rewardVideoListener.onVideoLoadFail(mBridgeIds, bVar.h());
                }
            }
        }
        iW = 0;
        iV = 0;
        filterCallBackState = 0;
        c cVar2 = this.f1569a;
        cVar2.a(this.d, f.REPORT_LOAD_FAILED, cVar2.a("metrics_data", bVar, com.mbridge.msdk.foundation.entity.b.JSON_KEY_SECOND_REQUEST_INDEX, Integer.valueOf(iV), com.mbridge.msdk.foundation.entity.b.JSON_KEY_SECOND_SHOW_INDEX, Integer.valueOf(iW), CampaignEx.KEY_SECOND_REQUEST_CALLBACK_STATE, Integer.valueOf(filterCallBackState)));
        if (this.b != null) {
            this.d.k(true);
            rewardVideoListener = this.b;
            if (rewardVideoListener != null) {
                rewardVideoListener.onVideoLoadFail(mBridgeIds, bVar.h());
            }
        }
    }
}
