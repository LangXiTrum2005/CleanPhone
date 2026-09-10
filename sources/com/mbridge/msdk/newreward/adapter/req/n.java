package com.mbridge.msdk.newreward.adapter.req;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import com.mbridge.msdk.newreward.function.core.resource.q;
import com.mbridge.msdk.newreward.function.core.resource.x;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class n implements com.mbridge.msdk.newreward.adapter.req.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.command.c f1602a;
    private com.mbridge.msdk.newreward.adapter.e b;
    private int c = 0;

    public class a implements x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.newreward.adapter.req.b f1603a;
        final /* synthetic */ com.mbridge.msdk.newreward.function.core.resource.n b;

        public a(com.mbridge.msdk.newreward.adapter.req.b bVar, com.mbridge.msdk.newreward.function.core.resource.n nVar) {
            this.f1603a = bVar;
            this.b = nVar;
        }

        @Override // com.mbridge.msdk.newreward.function.core.resource.x
        public void a(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.function.core.campaign.a aVar, q qVar) {
        }

        @Override // com.mbridge.msdk.newreward.function.core.resource.x
        public void b(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.function.core.campaign.a aVar, q qVar) {
            n.this.a(com.mbridge.msdk.newreward.function.command.f.REPORT_DOWNLOAD_END, 1, aVar, null);
            try {
                if (bVar.I()) {
                    this.f1603a.reqSuccessful(aVar);
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    o0.b("ReqVideoService", "doReq: ", e);
                }
            }
        }

        @Override // com.mbridge.msdk.newreward.function.core.resource.x
        public void a(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.function.core.campaign.a aVar, q qVar, MBridgeError mBridgeError) {
            n.this.a(com.mbridge.msdk.newreward.function.command.f.REPORT_DOWNLOAD_END, 3, aVar, mBridgeError);
            a(bVar, this.f1603a, aVar, mBridgeError);
        }

        private void a(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.adapter.req.b bVar2, com.mbridge.msdk.newreward.function.core.campaign.a aVar, MBridgeError mBridgeError) {
            if (bVar.I()) {
                try {
                    bVar2.reqSuccessful(aVar);
                    return;
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        o0.b("ReqVideoService", "doReq: ", e);
                        return;
                    }
                    return;
                }
            }
            try {
                if (this.b.j()) {
                    return;
                }
                bVar2.reqFailed(com.mbridge.msdk.foundation.error.a.a(mBridgeError.getErrorCode(), 880004, mBridgeError.getErrorMessage()));
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    o0.b("ReqVideoService", "doReq: ", e2);
                }
            }
        }

        @Override // com.mbridge.msdk.newreward.function.core.resource.x
        public void b(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.function.core.campaign.a aVar, q qVar, MBridgeError mBridgeError) {
            n.this.a(com.mbridge.msdk.newreward.function.command.f.REPORT_DOWNLOAD_END, 2, aVar, mBridgeError);
            a(bVar, this.f1603a, aVar, mBridgeError);
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1604a;

        static {
            int[] iArr = new int[com.mbridge.msdk.newreward.function.command.f.values().length];
            f1604a = iArr;
            try {
                iArr[com.mbridge.msdk.newreward.function.command.f.REPORT_DOWNLOAD_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1604a[com.mbridge.msdk.newreward.function.command.f.REPORT_DOWNLOAD_END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.adapter.req.a
    public void a(Object obj, com.mbridge.msdk.newreward.adapter.req.b bVar) throws IOException {
        com.mbridge.msdk.newreward.function.core.campaign.a aVar = (com.mbridge.msdk.newreward.function.core.campaign.a) obj;
        com.mbridge.msdk.newreward.function.core.resource.n nVarF = aVar.f();
        if (aVar.h().l() != null) {
            if (aVar.h().l().containsKey("command_manager")) {
                this.f1602a = (com.mbridge.msdk.newreward.function.command.c) aVar.h().l().get("command_manager");
            }
            if (aVar.h().l().containsKey("adapter_model")) {
                this.b = (com.mbridge.msdk.newreward.adapter.e) aVar.h().l().get("adapter_model");
            }
        }
        if (nVarF == null) {
            bVar.reqSuccessful(aVar);
            return;
        }
        if (nVarF.i() == 1) {
            this.c = 1;
        } else {
            this.c = 2;
        }
        a(com.mbridge.msdk.newreward.function.command.f.REPORT_DOWNLOAD_START, 0, aVar, null);
        nVarF.g().a(0, new a(bVar, nVarF));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.newreward.function.command.f fVar, int i, com.mbridge.msdk.newreward.function.core.campaign.a aVar, MBridgeError mBridgeError) {
        com.mbridge.msdk.newreward.function.command.c cVar = this.f1602a;
        if (cVar == null || this.b == null) {
            return;
        }
        try {
            Map mapA = cVar.a("resource_type", 4, "scenes", 1, "url", aVar.f().c(), "resumed_breakpoint", "2", CampaignEx.JSON_KEY_READY_RATE, 100, "mraid_type", Integer.valueOf(aVar.k() ? 1 : 0));
            int i2 = b.f1604a[fVar.ordinal()];
            if (i2 != 1) {
                if (i2 == 2 && this.c == 2) {
                    mapA.put("result", Integer.valueOf(i));
                    if (i != 1 && mBridgeError != null) {
                        mapA.put("reason", mBridgeError.getErrorMessage());
                    }
                    this.f1602a.a(this.b, fVar, mapA);
                    return;
                }
                return;
            }
            mapA.put("cache", Integer.valueOf(this.c));
            this.f1602a.a(this.b, fVar, mapA);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }
}
