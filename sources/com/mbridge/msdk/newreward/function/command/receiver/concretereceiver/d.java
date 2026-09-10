package com.mbridge.msdk.newreward.function.command.receiver.concretereceiver;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.work.WorkRequest;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import com.mbridge.msdk.newreward.function.common.MBridgeOffsetManager;
import com.mbridge.msdk.newreward.function.core.resource.n;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class d implements com.mbridge.msdk.newreward.function.command.receiver.a, com.mbridge.msdk.newreward.adapter.timeout.a.InterfaceC0203a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    com.mbridge.msdk.newreward.function.command.concretecommand.a f1630a;
    com.mbridge.msdk.newreward.adapter.req.b b;
    com.mbridge.msdk.newreward.function.command.c c;
    com.mbridge.msdk.newreward.adapter.e d;
    com.mbridge.msdk.newreward.function.command.receiver.strategy.c e;
    private Map i;
    private String f = UUID.randomUUID().toString();
    private String g = UUID.randomUUID().toString();
    private long h = WorkRequest.MIN_BACKOFF_MILLIS;
    private volatile boolean j = false;
    private volatile boolean k = false;
    private final int l = 1;
    private final int m = 1;
    private final int n = 2;
    private boolean o = false;
    private final Handler p = new a(Looper.getMainLooper());

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            if (message.what == 1) {
                com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880049, "second request reason miss");
                try {
                    Object obj = message.obj;
                    if (obj instanceof com.mbridge.msdk.foundation.error.b) {
                        bVarA = (com.mbridge.msdk.foundation.error.b) obj;
                    }
                    if (message.arg1 == 2) {
                        com.mbridge.msdk.newreward.adapter.timeout.a.a().a(d.this.f);
                        com.mbridge.msdk.newreward.function.database.c.c().a().b(d.this.d.d(), d.this.d.G(), d.this.d.R(), d.this.d.A(), 404);
                    } else if (bVarA != null && bVarA.a((Object) "campaign_request_error_type") != null) {
                        com.mbridge.msdk.newreward.function.database.c.c().a().b(d.this.d.d(), d.this.d.G(), d.this.d.R(), d.this.d.A(), ((Integer) bVarA.a((Object) "campaign_request_error_type")).intValue());
                    }
                } catch (Exception unused) {
                }
                d.this.b.reqFailed(bVarA);
            }
        }
    }

    public final class c implements com.mbridge.msdk.newreward.adapter.req.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.function.command.b f1633a;
        private final Map b;

        public c(com.mbridge.msdk.newreward.function.command.b bVar, Map map) {
            this.f1633a = bVar;
            this.b = map;
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
        @Override // com.mbridge.msdk.newreward.adapter.req.b
        public void reqFailed(com.mbridge.msdk.foundation.error.b bVar) {
            d dVar = d.this;
            com.mbridge.msdk.newreward.function.command.receiver.strategy.e eVar = new com.mbridge.msdk.newreward.function.command.receiver.strategy.e(bVar, dVar.d, dVar.c, 1);
            if (d.this.e.a(eVar)) {
                d.this.e.a(eVar, this);
                return;
            }
            com.mbridge.msdk.newreward.adapter.timeout.a.a().a(d.this.g);
            com.mbridge.msdk.newreward.adapter.timeout.a.a().a(d.this.f);
            if (d.this.k) {
                return;
            }
            d.this.k = true;
            try {
                d dVar2 = d.this;
                com.mbridge.msdk.newreward.function.command.c cVar = dVar2.c;
                com.mbridge.msdk.newreward.adapter.e eVar2 = dVar2.d;
                com.mbridge.msdk.newreward.function.command.f fVar = com.mbridge.msdk.newreward.function.command.f.REPORT_LOAD_V3_RES_FAIL;
                Object[] objArr = new Object[20];
                objArr[0] = "auto_load";
                objArr[1] = Integer.valueOf(eVar2.X() ? 2 : 1);
                objArr[2] = "result";
                objArr[3] = Integer.valueOf(bVar.m() ? 1 : 2);
                objArr[4] = "code";
                objArr[5] = Integer.valueOf(bVar.j());
                objArr[6] = "reason";
                objArr[7] = bVar.h();
                objArr[8] = "timeout";
                objArr[9] = Integer.valueOf(d.this.d.i());
                objArr[10] = "hst";
                objArr[11] = bVar.d();
                objArr[12] = "err_desc";
                objArr[13] = bVar.e();
                objArr[14] = com.mbridge.msdk.foundation.entity.b.JSON_KEY_SECOND_REQUEST_INDEX;
                objArr[15] = 0;
                objArr[16] = com.mbridge.msdk.foundation.entity.b.JSON_KEY_SECOND_SHOW_INDEX;
                objArr[17] = 0;
                objArr[18] = CampaignEx.KEY_SECOND_REQUEST_CALLBACK_STATE;
                objArr[19] = 0;
                cVar.a(eVar2, fVar, cVar.a(objArr));
            } catch (Exception e) {
                e.printStackTrace();
            }
            ((MBridgeOffsetManager) d.this.c.a((Object) null, com.mbridge.msdk.newreward.function.command.f.CREATE_OFFSET)).resetOffset();
            d.this.a(bVar, true, null);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x006c  */
        /* JADX WARN: Code duplicated, block: B:17:0x006e  */
        /* JADX WARN: Code duplicated, block: B:20:0x00aa  */
        /* JADX WARN: Code duplicated, block: B:21:0x00af  */
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
        @Override // com.mbridge.msdk.newreward.adapter.req.b
        public void reqSuccessful(Object obj) {
            int iV;
            int iW;
            int filterCallBackState;
            com.mbridge.msdk.newreward.adapter.e eVar;
            int i;
            String strF;
            com.mbridge.msdk.foundation.error.b bVarA;
            com.mbridge.msdk.newreward.adapter.timeout.a.a().a(d.this.g);
            if (d.this.k) {
                return;
            }
            d.this.k = true;
            com.mbridge.msdk.newreward.function.core.campaign.b bVar = (com.mbridge.msdk.newreward.function.core.campaign.b) obj;
            try {
                if (bVar != null) {
                    iV = bVar.v();
                    iW = bVar.w();
                    if (bVar.f() != null && !bVar.f().isEmpty()) {
                        filterCallBackState = bVar.f().get(0).getFilterCallBackState();
                    }
                    d dVar = d.this;
                    com.mbridge.msdk.newreward.function.command.c cVar = dVar.c;
                    eVar = dVar.d;
                    com.mbridge.msdk.newreward.function.command.f fVar = com.mbridge.msdk.newreward.function.command.f.REPORT_LOAD_V3_RES_SUCCESS;
                    Object[] objArr = new Object[18];
                    objArr[0] = "metrics_data";
                    objArr[1] = bVar;
                    objArr[2] = "auto_load";
                    if (eVar.X()) {
                        i = 2;
                    } else {
                        i = 1;
                    }
                    objArr[3] = Integer.valueOf(i);
                    objArr[4] = "result";
                    objArr[5] = 1;
                    objArr[6] = "cache";
                    objArr[7] = 2;
                    objArr[8] = "timeout";
                    objArr[9] = Integer.valueOf(d.this.d.i());
                    objArr[10] = "hst";
                    if (bVar != null) {
                        strF = bVar.F();
                    } else {
                        strF = "";
                    }
                    objArr[11] = strF;
                    objArr[12] = com.mbridge.msdk.foundation.entity.b.JSON_KEY_SECOND_REQUEST_INDEX;
                    objArr[13] = Integer.valueOf(iV);
                    objArr[14] = com.mbridge.msdk.foundation.entity.b.JSON_KEY_SECOND_SHOW_INDEX;
                    objArr[15] = Integer.valueOf(iW);
                    objArr[16] = CampaignEx.KEY_SECOND_REQUEST_CALLBACK_STATE;
                    objArr[17] = Integer.valueOf(filterCallBackState);
                    cVar.a(eVar, fVar, cVar.a(objArr));
                    ((MBridgeOffsetManager) d.this.c.a((Object) null, com.mbridge.msdk.newreward.function.command.f.CREATE_OFFSET)).increaseOffset(bVar.g().size());
                    d dVar2 = d.this;
                    com.mbridge.msdk.newreward.function.command.c cVar2 = dVar2.c;
                    cVar2.d(cVar2.a("adapter_model", dVar2.d, MBInterstitialActivity.INTENT_CAMAPIGN, bVar));
                    d dVar3 = d.this;
                    com.mbridge.msdk.newreward.function.command.c cVar3 = dVar3.c;
                    cVar3.c(cVar3.a("adapter_model", dVar3.d, MBInterstitialActivity.INTENT_CAMAPIGN, bVar));
                    d dVar4 = d.this;
                    dVar4.b.reqSuccessful(dVar4.c.a("type", 1, "object", bVar));
                    this.f1633a.a(com.mbridge.msdk.newreward.function.command.f.REQ_DOWN_CAMPAIGN);
                    this.b.put(MBInterstitialActivity.INTENT_CAMAPIGN, bVar);
                    this.f1633a.a(this.b);
                    d dVar5 = d.this;
                    dVar5.f1630a.a(this.f1633a, dVar5.new e(bVar));
                    return;
                }
                iV = 0;
                iW = 0;
                d dVar6 = d.this;
                com.mbridge.msdk.newreward.function.command.c cVar4 = dVar6.c;
                cVar4.c(cVar4.a("adapter_model", dVar6.d, MBInterstitialActivity.INTENT_CAMAPIGN, bVar));
                d dVar7 = d.this;
                dVar7.b.reqSuccessful(dVar7.c.a("type", 1, "object", bVar));
                this.f1633a.a(com.mbridge.msdk.newreward.function.command.f.REQ_DOWN_CAMPAIGN);
                this.b.put(MBInterstitialActivity.INTENT_CAMAPIGN, bVar);
                this.f1633a.a(this.b);
                d dVar8 = d.this;
                dVar8.f1630a.a(this.f1633a, dVar8.new e(bVar));
                return;
            } catch (MBridgeError e) {
                com.mbridge.msdk.newreward.adapter.timeout.a.a().a(d.this.f);
                com.mbridge.msdk.newreward.function.database.c.c().a().b(bVar.a(), bVar.s(), bVar.E(), bVar.p(), 403);
                if (e.getErrorMessage().contains("APP ALREADY INSTALLED")) {
                    bVarA = com.mbridge.msdk.foundation.error.a.a(e.getErrorCode(), 880021, "errorCode: 3507 errorMessage: data load failed, errorMsg is " + e.getErrorMessage());
                } else {
                    bVarA = com.mbridge.msdk.foundation.error.a.a(e.getErrorCode(), 880003, "errorCode: 3507 errorMessage: data load failed, errorMsg is " + e.getErrorMessage());
                }
                d.this.b.reqFailed(bVarA);
                return;
            }
            filterCallBackState = 0;
            d dVar9 = d.this;
            com.mbridge.msdk.newreward.function.command.c cVar5 = dVar9.c;
            eVar = dVar9.d;
            com.mbridge.msdk.newreward.function.command.f fVar2 = com.mbridge.msdk.newreward.function.command.f.REPORT_LOAD_V3_RES_SUCCESS;
            Object[] objArr2 = new Object[18];
            objArr2[0] = "metrics_data";
            objArr2[1] = bVar;
            objArr2[2] = "auto_load";
            if (eVar.X()) {
                i = 2;
            } else {
                i = 1;
            }
            objArr2[3] = Integer.valueOf(i);
            objArr2[4] = "result";
            objArr2[5] = 1;
            objArr2[6] = "cache";
            objArr2[7] = 2;
            objArr2[8] = "timeout";
            objArr2[9] = Integer.valueOf(d.this.d.i());
            objArr2[10] = "hst";
            if (bVar != null) {
                strF = bVar.F();
            } else {
                strF = "";
            }
            objArr2[11] = strF;
            objArr2[12] = com.mbridge.msdk.foundation.entity.b.JSON_KEY_SECOND_REQUEST_INDEX;
            objArr2[13] = Integer.valueOf(iV);
            objArr2[14] = com.mbridge.msdk.foundation.entity.b.JSON_KEY_SECOND_SHOW_INDEX;
            objArr2[15] = Integer.valueOf(iW);
            objArr2[16] = CampaignEx.KEY_SECOND_REQUEST_CALLBACK_STATE;
            objArr2[17] = Integer.valueOf(filterCallBackState);
            cVar5.a(eVar, fVar2, cVar5.a(objArr2));
            ((MBridgeOffsetManager) d.this.c.a((Object) null, com.mbridge.msdk.newreward.function.command.f.CREATE_OFFSET)).increaseOffset(bVar.g().size());
            d dVar10 = d.this;
            com.mbridge.msdk.newreward.function.command.c cVar6 = dVar10.c;
            cVar6.d(cVar6.a("adapter_model", dVar10.d, MBInterstitialActivity.INTENT_CAMAPIGN, bVar));
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.newreward.function.command.receiver.concretereceiver.d$d, reason: collision with other inner class name */
    public class C0207d implements com.mbridge.msdk.newreward.adapter.req.b {
        private C0207d() {
        }

        @Override // com.mbridge.msdk.newreward.adapter.req.b
        public void reqFailed(com.mbridge.msdk.foundation.error.b bVar) {
            d dVar = d.this;
            com.mbridge.msdk.newreward.function.command.receiver.strategy.e eVar = new com.mbridge.msdk.newreward.function.command.receiver.strategy.e(bVar, dVar.d, dVar.c, 2);
            com.mbridge.msdk.newreward.function.command.receiver.strategy.c cVar = d.this.e;
            if (cVar == null || !cVar.a(eVar)) {
                d.this.a(bVar, false, null);
            } else {
                d.this.e.a(eVar, this);
            }
        }

        @Override // com.mbridge.msdk.newreward.adapter.req.b
        public void reqSuccessful(Object obj) {
            d.this.p.removeMessages(1);
            com.mbridge.msdk.newreward.adapter.timeout.a.a().a(d.this.f);
            d dVar = d.this;
            dVar.b.reqSuccessful(dVar.c.a("type", 2, "object", obj));
        }

        public /* synthetic */ C0207d(d dVar, a aVar) {
            this();
        }
    }

    public class e implements com.mbridge.msdk.newreward.adapter.req.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.newreward.function.core.campaign.b f1635a;

        public e(com.mbridge.msdk.newreward.function.core.campaign.b bVar) {
            this.f1635a = bVar;
        }

        @Override // com.mbridge.msdk.newreward.adapter.req.b
        public void reqFailed(com.mbridge.msdk.foundation.error.b bVar) {
            d dVar = d.this;
            com.mbridge.msdk.newreward.function.command.receiver.strategy.e eVar = new com.mbridge.msdk.newreward.function.command.receiver.strategy.e(bVar, dVar.d, dVar.c, 2);
            com.mbridge.msdk.newreward.function.command.receiver.strategy.c cVar = d.this.e;
            if (cVar == null || !cVar.a(eVar)) {
                d.this.a(bVar, false, this.f1635a);
            } else {
                d.this.e.a(eVar, this);
            }
        }

        @Override // com.mbridge.msdk.newreward.adapter.req.b
        public void reqSuccessful(Object obj) {
            d.this.p.removeMessages(1);
            com.mbridge.msdk.newreward.function.core.campaign.b bVar = this.f1635a;
            if (bVar != null && bVar.v() == 0) {
                this.f1635a.h(3);
                d.this.d.g().b(this.f1635a);
                com.mbridge.msdk.newreward.function.database.c.c().a().b(this.f1635a);
            }
            com.mbridge.msdk.newreward.adapter.timeout.a.a().a(d.this.f);
            d dVar = d.this;
            dVar.b.reqSuccessful(dVar.c.a("type", 2, "object", obj));
        }
    }

    private String b() {
        StringBuilder sb = new StringBuilder();
        try {
            com.mbridge.msdk.newreward.adapter.e eVar = this.d;
            if (eVar != null && eVar.g() != null) {
                com.mbridge.msdk.newreward.function.core.campaign.b bVarA = this.d.g().a();
                if (bVarA != null && bVarA.g() != null && bVarA.g().size() > 0) {
                    for (com.mbridge.msdk.newreward.function.core.campaign.a aVar : bVarA.g()) {
                        if (aVar != null) {
                            n nVarF = aVar.f();
                            if (nVarF != null && !nVarF.j()) {
                                sb.append(" video timeout ");
                            }
                            com.mbridge.msdk.newreward.function.core.resource.d<?> dVarG = aVar.g();
                            if (dVarG != null && !dVarG.j()) {
                                sb.append(" video_template timeout ");
                            }
                            com.mbridge.msdk.newreward.function.core.resource.d<?> dVarB = aVar.b();
                            if (dVarB != null && !dVarB.j()) {
                                sb.append(" ec_template timeout ");
                            }
                        }
                    }
                } else {
                    sb.append(" load timeout ");
                }
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
        return sb.toString();
    }

    public void a(com.mbridge.msdk.newreward.function.command.concretecommand.a aVar) {
        this.f1630a = aVar;
        this.e = new com.mbridge.msdk.newreward.function.command.receiver.strategy.c(aVar);
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
    @Override // com.mbridge.msdk.newreward.function.command.receiver.a
    public void a(com.mbridge.msdk.newreward.function.command.b bVar, com.mbridge.msdk.newreward.adapter.req.b bVar2) {
        try {
            this.b = bVar2;
            bVar.a(com.mbridge.msdk.newreward.function.command.f.REQ_CAMPAIGN);
            Map map = (Map) bVar.b();
            this.i = map;
            this.c = (com.mbridge.msdk.newreward.function.command.c) map.get("command_manager");
            this.d = (com.mbridge.msdk.newreward.adapter.e) this.i.get("adapter_model");
            int iA = a();
            com.mbridge.msdk.newreward.adapter.timeout.a.a().a(this.f, iA, this);
            this.d.i(iA);
            com.mbridge.msdk.newreward.function.command.c cVar = this.c;
            com.mbridge.msdk.newreward.adapter.e eVar = this.d;
            com.mbridge.msdk.newreward.function.command.f fVar = com.mbridge.msdk.newreward.function.command.f.REPORT_LOAD_V3_START;
            Object[] objArr = new Object[10];
            objArr[0] = "auto_load";
            objArr[1] = Integer.valueOf(eVar.X() ? 2 : 1);
            objArr[2] = "hst";
            objArr[3] = com.mbridge.msdk.foundation.same.net.utils.d.h().b(this.d.f());
            objArr[4] = com.mbridge.msdk.foundation.entity.b.JSON_KEY_SECOND_REQUEST_INDEX;
            objArr[5] = 0;
            objArr[6] = com.mbridge.msdk.foundation.entity.b.JSON_KEY_SECOND_SHOW_INDEX;
            objArr[7] = 0;
            objArr[8] = CampaignEx.KEY_SECOND_REQUEST_CALLBACK_STATE;
            objArr[9] = 0;
            cVar.a(eVar, fVar, cVar.a(objArr));
            this.f1630a.a(bVar, new b(bVar, this.i));
            long jB = q0.a().b(MBridgeCommon.SettingConfig.KEY_SETTING_CONFIG_RETRY_STRATEGY, MBridgeCommon.SettingConfig.KEY_SETTING_CONFIG_RETRY_STRATEGY_CAMPAIGN_RETRY_TIMEOUT, 0);
            this.h = jB;
            if (jB > 0) {
                com.mbridge.msdk.newreward.adapter.timeout.a.a().a(this.g, this.h, this);
            }
            com.mbridge.msdk.newreward.function.database.c.c().a().c(this.d.d(), this.d.G(), this.d.R(), this.d.A(), !TextUtils.isEmpty(this.d.f()), this.d.f(), this.d.o());
        } catch (Exception e2) {
            o0.b("LoadControllerReceiver", com.umeng.ccg.a.w, e2);
            if (this.d != null) {
                com.mbridge.msdk.newreward.function.database.c.c().a().b(this.d.d(), this.d.G(), this.d.R(), this.d.A(), 8);
            }
            com.mbridge.msdk.newreward.adapter.timeout.a.a().a(this.g);
            com.mbridge.msdk.newreward.adapter.timeout.a.a().a(this.f);
            if (bVar2 != null) {
                bVar2.reqFailed(new com.mbridge.msdk.foundation.error.b(880020, e2.getMessage()));
            }
        }
    }

    public final class b implements com.mbridge.msdk.newreward.adapter.req.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.function.command.b f1632a;
        private final Map b;

        public b(com.mbridge.msdk.newreward.function.command.b bVar, Map map) {
            this.f1632a = bVar;
            this.b = map;
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
        private void a(com.mbridge.msdk.newreward.function.core.campaign.b bVar) {
            try {
                if (bVar.v() > 0) {
                    HashMap map = new HashMap();
                    map.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_SECOND_REQUEST_INDEX, bVar.v() + "");
                    map.put("invalid_ad_ids", d.this.d.n());
                    this.b.put("params_ext_map_key", map);
                    this.f1632a.a(this.b);
                    int iV = bVar.v();
                    int iW = bVar.w();
                    int filterCallBackState = (bVar.f() == null || bVar.f().isEmpty()) ? 0 : bVar.f().get(0).getFilterCallBackState();
                    d dVar = d.this;
                    com.mbridge.msdk.newreward.function.command.c cVar = dVar.c;
                    com.mbridge.msdk.newreward.adapter.e eVar = dVar.d;
                    com.mbridge.msdk.newreward.function.command.f fVar = com.mbridge.msdk.newreward.function.command.f.REPORT_LOAD_V3_START;
                    Object[] objArr = new Object[10];
                    objArr[0] = "auto_load";
                    objArr[1] = Integer.valueOf(eVar.X() ? 2 : 1);
                    objArr[2] = "hst";
                    objArr[3] = com.mbridge.msdk.foundation.same.net.utils.d.h().b(d.this.d.f());
                    objArr[4] = com.mbridge.msdk.foundation.entity.b.JSON_KEY_SECOND_REQUEST_INDEX;
                    objArr[5] = Integer.valueOf(iV);
                    objArr[6] = com.mbridge.msdk.foundation.entity.b.JSON_KEY_SECOND_SHOW_INDEX;
                    objArr[7] = Integer.valueOf(iW);
                    objArr[8] = CampaignEx.KEY_SECOND_REQUEST_CALLBACK_STATE;
                    objArr[9] = Integer.valueOf(filterCallBackState);
                    cVar.a(eVar, fVar, cVar.a(objArr));
                    com.mbridge.msdk.newreward.function.command.b bVar2 = new com.mbridge.msdk.newreward.function.command.b();
                    bVar2.a(this.f1632a);
                    d.this.o = true;
                    d dVar2 = d.this;
                    dVar2.f1630a.a(bVar2, dVar2.new c(bVar2, this.b));
                }
            } catch (Exception unused) {
            }
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
        @Override // com.mbridge.msdk.newreward.adapter.req.b
        public void reqFailed(com.mbridge.msdk.foundation.error.b bVar) {
            d dVar = d.this;
            int i = 1;
            com.mbridge.msdk.newreward.function.command.receiver.strategy.e eVar = new com.mbridge.msdk.newreward.function.command.receiver.strategy.e(bVar, dVar.d, dVar.c, 1);
            if (d.this.e.a(eVar)) {
                d.this.e.a(eVar, this);
                return;
            }
            com.mbridge.msdk.newreward.adapter.timeout.a.a().a(d.this.g);
            com.mbridge.msdk.newreward.adapter.timeout.a.a().a(d.this.f);
            if (d.this.j) {
                return;
            }
            d.this.j = true;
            try {
                d dVar2 = d.this;
                com.mbridge.msdk.newreward.function.command.c cVar = dVar2.c;
                com.mbridge.msdk.newreward.adapter.e eVar2 = dVar2.d;
                com.mbridge.msdk.newreward.function.command.f fVar = com.mbridge.msdk.newreward.function.command.f.REPORT_LOAD_V3_RES_FAIL;
                Object[] objArr = new Object[20];
                objArr[0] = "auto_load";
                objArr[1] = Integer.valueOf(eVar2.X() ? 2 : 1);
                objArr[2] = "result";
                if (!bVar.m()) {
                    i = 2;
                }
                objArr[3] = Integer.valueOf(i);
                objArr[4] = "code";
                objArr[5] = Integer.valueOf(bVar.j());
                objArr[6] = "reason";
                objArr[7] = bVar.h();
                objArr[8] = "timeout";
                objArr[9] = Integer.valueOf(d.this.d.i());
                objArr[10] = "hst";
                objArr[11] = bVar.d();
                objArr[12] = "err_desc";
                objArr[13] = bVar.e();
                objArr[14] = com.mbridge.msdk.foundation.entity.b.JSON_KEY_SECOND_REQUEST_INDEX;
                objArr[15] = 0;
                objArr[16] = com.mbridge.msdk.foundation.entity.b.JSON_KEY_SECOND_SHOW_INDEX;
                objArr[17] = 0;
                objArr[18] = CampaignEx.KEY_SECOND_REQUEST_CALLBACK_STATE;
                objArr[19] = 0;
                cVar.a(eVar2, fVar, cVar.a(objArr));
            } catch (Exception e) {
                e.printStackTrace();
            }
            ((MBridgeOffsetManager) d.this.c.a((Object) null, com.mbridge.msdk.newreward.function.command.f.CREATE_OFFSET)).resetOffset();
            a(bVar);
            d.this.b.reqFailed(bVar);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0070  */
        /* JADX WARN: Code duplicated, block: B:17:0x0072  */
        /* JADX WARN: Code duplicated, block: B:20:0x00d8  */
        /* JADX WARN: Code duplicated, block: B:21:0x00dd  */
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
        @Override // com.mbridge.msdk.newreward.adapter.req.b
        public void reqSuccessful(Object obj) {
            int iV;
            int iW;
            int filterCallBackState;
            com.mbridge.msdk.newreward.adapter.e eVar;
            int i;
            String strF;
            com.mbridge.msdk.newreward.adapter.timeout.a.a().a(d.this.g);
            if (d.this.j) {
                return;
            }
            d.this.j = true;
            com.mbridge.msdk.newreward.function.core.campaign.b bVar = (com.mbridge.msdk.newreward.function.core.campaign.b) obj;
            try {
                if (bVar != null) {
                    iV = bVar.v();
                    iW = bVar.w();
                    if (bVar.f() != null && !bVar.f().isEmpty()) {
                        filterCallBackState = bVar.f().get(0).getFilterCallBackState();
                    }
                    d dVar = d.this;
                    com.mbridge.msdk.newreward.function.command.c cVar = dVar.c;
                    eVar = dVar.d;
                    com.mbridge.msdk.newreward.function.command.f fVar = com.mbridge.msdk.newreward.function.command.f.REPORT_LOAD_V3_RES_SUCCESS;
                    Object[] objArr = new Object[18];
                    objArr[0] = "metrics_data";
                    objArr[1] = bVar;
                    objArr[2] = "auto_load";
                    if (eVar.X()) {
                        i = 2;
                    } else {
                        i = 1;
                    }
                    objArr[3] = Integer.valueOf(i);
                    objArr[4] = "result";
                    objArr[5] = 1;
                    objArr[6] = "cache";
                    objArr[7] = 2;
                    objArr[8] = "timeout";
                    objArr[9] = Integer.valueOf(d.this.d.i());
                    objArr[10] = com.mbridge.msdk.foundation.entity.b.JSON_KEY_SECOND_REQUEST_INDEX;
                    objArr[11] = Integer.valueOf(iV);
                    objArr[12] = com.mbridge.msdk.foundation.entity.b.JSON_KEY_SECOND_SHOW_INDEX;
                    objArr[13] = Integer.valueOf(iW);
                    objArr[14] = CampaignEx.KEY_SECOND_REQUEST_CALLBACK_STATE;
                    objArr[15] = Integer.valueOf(filterCallBackState);
                    objArr[16] = "hst";
                    if (bVar != null) {
                        strF = bVar.F();
                    } else {
                        strF = "";
                    }
                    objArr[17] = strF;
                    cVar.a(eVar, fVar, cVar.a(objArr));
                    a aVar = null;
                    ((MBridgeOffsetManager) d.this.c.a((Object) null, com.mbridge.msdk.newreward.function.command.f.CREATE_OFFSET)).increaseOffset(bVar.g().size());
                    d dVar2 = d.this;
                    com.mbridge.msdk.newreward.function.command.c cVar2 = dVar2.c;
                    cVar2.d(cVar2.a("adapter_model", dVar2.d, MBInterstitialActivity.INTENT_CAMAPIGN, bVar));
                    d dVar3 = d.this;
                    com.mbridge.msdk.newreward.function.command.c cVar3 = dVar3.c;
                    cVar3.b(cVar3.a("adapter_model", dVar3.d, MBInterstitialActivity.INTENT_CAMAPIGN, bVar));
                    d dVar4 = d.this;
                    dVar4.b.reqSuccessful(dVar4.c.a("type", 1, "object", bVar));
                    this.f1632a.a(com.mbridge.msdk.newreward.function.command.f.REQ_DOWN_CAMPAIGN);
                    this.b.put(MBInterstitialActivity.INTENT_CAMAPIGN, bVar);
                    this.f1632a.a(this.b);
                    d dVar5 = d.this;
                    dVar5.f1630a.a(this.f1632a, new C0207d(dVar5, aVar));
                }
                iV = 0;
                iW = 0;
                d dVar6 = d.this;
                com.mbridge.msdk.newreward.function.command.c cVar4 = dVar6.c;
                cVar4.b(cVar4.a("adapter_model", dVar6.d, MBInterstitialActivity.INTENT_CAMAPIGN, bVar));
            } catch (MBridgeError e) {
                com.mbridge.msdk.newreward.adapter.timeout.a.a().a(d.this.f);
                if (e.getErrorMessage().contains("APP ALREADY INSTALLED")) {
                    com.mbridge.msdk.newreward.function.database.c.c().a().b(bVar.a(), bVar.s(), bVar.E(), bVar.p(), 403);
                    a(bVar);
                    d.this.b.reqFailed(com.mbridge.msdk.foundation.error.a.a(e.getErrorCode(), 880021, "errorCode: 3507 errorMessage: data load failed, errorMsg is " + e.getErrorMessage()));
                    return;
                }
                if (!e.getErrorMessage().contains("FILTER BUT CALLBACK SUCCEED")) {
                    com.mbridge.msdk.newreward.function.database.c.c().a().b(bVar.a(), bVar.s(), bVar.E(), bVar.p(), 403);
                    d.this.b.reqFailed(com.mbridge.msdk.foundation.error.a.a(e.getErrorCode(), 880003, "errorCode: 3507 errorMessage: data load failed, errorMsg is " + e.getErrorMessage()));
                    return;
                }
                a(bVar);
            }
            filterCallBackState = 0;
            d dVar7 = d.this;
            com.mbridge.msdk.newreward.function.command.c cVar5 = dVar7.c;
            eVar = dVar7.d;
            com.mbridge.msdk.newreward.function.command.f fVar2 = com.mbridge.msdk.newreward.function.command.f.REPORT_LOAD_V3_RES_SUCCESS;
            Object[] objArr2 = new Object[18];
            objArr2[0] = "metrics_data";
            objArr2[1] = bVar;
            objArr2[2] = "auto_load";
            if (eVar.X()) {
                i = 2;
            } else {
                i = 1;
            }
            objArr2[3] = Integer.valueOf(i);
            objArr2[4] = "result";
            objArr2[5] = 1;
            objArr2[6] = "cache";
            objArr2[7] = 2;
            objArr2[8] = "timeout";
            objArr2[9] = Integer.valueOf(d.this.d.i());
            objArr2[10] = com.mbridge.msdk.foundation.entity.b.JSON_KEY_SECOND_REQUEST_INDEX;
            objArr2[11] = Integer.valueOf(iV);
            objArr2[12] = com.mbridge.msdk.foundation.entity.b.JSON_KEY_SECOND_SHOW_INDEX;
            objArr2[13] = Integer.valueOf(iW);
            objArr2[14] = CampaignEx.KEY_SECOND_REQUEST_CALLBACK_STATE;
            objArr2[15] = Integer.valueOf(filterCallBackState);
            objArr2[16] = "hst";
            if (bVar != null) {
                strF = bVar.F();
            } else {
                strF = "";
            }
            objArr2[17] = strF;
            cVar5.a(eVar, fVar2, cVar5.a(objArr2));
            a aVar2 = null;
            ((MBridgeOffsetManager) d.this.c.a((Object) null, com.mbridge.msdk.newreward.function.command.f.CREATE_OFFSET)).increaseOffset(bVar.g().size());
            d dVar8 = d.this;
            com.mbridge.msdk.newreward.function.command.c cVar6 = dVar8.c;
            cVar6.d(cVar6.a("adapter_model", dVar8.d, MBInterstitialActivity.INTENT_CAMAPIGN, bVar));
            d dVar9 = d.this;
            dVar9.b.reqSuccessful(dVar9.c.a("type", 1, "object", bVar));
            this.f1632a.a(com.mbridge.msdk.newreward.function.command.f.REQ_DOWN_CAMPAIGN);
            this.b.put(MBInterstitialActivity.INTENT_CAMAPIGN, bVar);
            this.f1632a.a(this.b);
            d dVar10 = d.this;
            dVar10.f1630a.a(this.f1632a, new C0207d(dVar10, aVar2));
        }

        private void a(com.mbridge.msdk.foundation.error.b bVar) {
            if (bVar != null) {
                try {
                    if (bVar.a("campaign_request_error_type") != null) {
                        com.mbridge.msdk.newreward.function.database.c.c().a().b(d.this.d.d(), d.this.d.G(), d.this.d.R(), d.this.d.A(), ((Integer) bVar.a("campaign_request_error_type")).intValue());
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.adapter.timeout.a.InterfaceC0203a
    public void a(String str, long j) {
        if (TextUtils.equals(str, this.f)) {
            com.mbridge.msdk.newreward.function.database.c.c().a().b(this.d.d(), this.d.G(), this.d.R(), this.d.A(), 405);
            this.b.reqFailed(new com.mbridge.msdk.foundation.error.b(880010, AbstractC3888ke0.i("errorCode: 3401 errorMessage: ", b())));
        } else {
            if (!TextUtils.equals(str, this.g) || this.e == null) {
                return;
            }
            com.mbridge.msdk.newreward.function.command.receiver.strategy.e eVar = new com.mbridge.msdk.newreward.function.command.receiver.strategy.e(null, this.d, this.c, 3);
            com.mbridge.msdk.newreward.function.command.b bVar = new com.mbridge.msdk.newreward.function.command.b();
            bVar.a(com.mbridge.msdk.newreward.function.command.f.REQ_CAMPAIGN);
            com.mbridge.msdk.newreward.function.command.c cVar = this.c;
            bVar.a(cVar.a("adapter_model", this.d, "command_manager", cVar));
            this.e.a(eVar, new b(bVar, this.i));
        }
    }

    private int a() {
        com.mbridge.msdk.newreward.function.model.f fVarO;
        com.mbridge.msdk.videocommon.setting.c cVarC;
        try {
            com.mbridge.msdk.newreward.adapter.e eVar = this.d;
            return (eVar == null || (fVarO = eVar.O()) == null || (cVarC = fVarO.c()) == null) ? MBridgeCommon.DEFAULT_LOAD_TIMEOUT : cVarC.n() * 1000;
        } catch (Exception unused) {
            return MBridgeCommon.DEFAULT_LOAD_TIMEOUT;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.foundation.error.b bVar, boolean z, com.mbridge.msdk.newreward.function.core.campaign.b bVar2) {
        com.mbridge.msdk.newreward.adapter.e eVar = this.d;
        if (eVar != null && eVar.g() != null && this.d.g().a() != null && this.d.g().a().v() != 0 && this.o) {
            if (!this.p.hasMessages(1)) {
                Message messageObtainMessage = this.p.obtainMessage(1);
                messageObtainMessage.obj = bVar;
                messageObtainMessage.arg1 = z ? 1 : 2;
                this.p.sendMessageDelayed(messageObtainMessage, ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
                return;
            }
        }
        if (!z) {
            if (bVar2 != null && bVar2.v() == 0) {
                this.d.g().b(bVar2);
                com.mbridge.msdk.newreward.function.database.c.c().a().b(bVar2);
            }
            com.mbridge.msdk.newreward.adapter.timeout.a.a().a(this.f);
            com.mbridge.msdk.newreward.function.database.c.c().a().b(this.d.d(), this.d.G(), this.d.R(), this.d.A(), 404);
        } else if (bVar != null) {
            try {
                if (bVar.a("campaign_request_error_type") != null) {
                    com.mbridge.msdk.newreward.function.database.c.c().a().b(this.d.d(), this.d.G(), this.d.R(), this.d.A(), ((Integer) bVar.a("campaign_request_error_type")).intValue());
                }
            } catch (Exception unused) {
            }
        }
        this.b.reqFailed(bVar);
    }
}
