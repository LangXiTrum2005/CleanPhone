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
public class f implements com.mbridge.msdk.newreward.adapter.req.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.command.c f1582a;
    private com.mbridge.msdk.newreward.adapter.e b;
    private int c = 0;

    public class a implements x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.newreward.function.core.resource.d f1583a;
        final /* synthetic */ com.mbridge.msdk.newreward.adapter.req.b b;

        public a(com.mbridge.msdk.newreward.function.core.resource.d dVar, com.mbridge.msdk.newreward.adapter.req.b bVar) {
            this.f1583a = dVar;
            this.b = bVar;
        }

        @Override // com.mbridge.msdk.newreward.function.core.resource.x
        public void a(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.function.core.campaign.a aVar, q qVar) {
        }

        @Override // com.mbridge.msdk.newreward.function.core.resource.x
        public void b(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.function.core.campaign.a aVar, q qVar) {
            f.this.a(com.mbridge.msdk.newreward.function.command.f.REPORT_DOWNLOAD_END, 1, aVar, null);
            if (this.f1583a.j()) {
                this.b.reqSuccessful(aVar);
            }
        }

        @Override // com.mbridge.msdk.newreward.function.core.resource.x
        public void a(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.function.core.campaign.a aVar, q qVar, MBridgeError mBridgeError) {
            f.this.a(com.mbridge.msdk.newreward.function.command.f.REPORT_DOWNLOAD_END, 3, aVar, mBridgeError);
            a(bVar, this.b, aVar, mBridgeError, "errorCode: 3202 errorMessage: ");
        }

        private void a(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.adapter.req.b bVar2, com.mbridge.msdk.newreward.function.core.campaign.a aVar, MBridgeError mBridgeError, String str) {
            if (bVar.I()) {
                try {
                    bVar2.reqSuccessful(aVar);
                    return;
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        o0.b("ReqEcService", "doReq: ", e);
                        return;
                    }
                    return;
                }
            }
            try {
                if (this.f1583a.j()) {
                    return;
                }
                bVar2.reqFailed(com.mbridge.msdk.foundation.error.a.a(mBridgeError.getErrorCode(), 880007, str + mBridgeError.getErrorMessage()));
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    o0.b("ReqEcService", "doReq: ", e2);
                }
            }
        }

        @Override // com.mbridge.msdk.newreward.function.core.resource.x
        public void b(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.function.core.campaign.a aVar, q qVar, MBridgeError mBridgeError) {
            f.this.a(com.mbridge.msdk.newreward.function.command.f.REPORT_DOWNLOAD_END, 2, aVar, mBridgeError);
            a(bVar, this.b, aVar, mBridgeError, "errorCode: 3401 errorMessage: ");
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1584a;

        static {
            int[] iArr = new int[com.mbridge.msdk.newreward.function.command.f.values().length];
            f1584a = iArr;
            try {
                iArr[com.mbridge.msdk.newreward.function.command.f.REPORT_DOWNLOAD_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1584a[com.mbridge.msdk.newreward.function.command.f.REPORT_DOWNLOAD_END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.adapter.req.a
    public void a(Object obj, com.mbridge.msdk.newreward.adapter.req.b bVar) throws IOException {
        com.mbridge.msdk.newreward.function.core.campaign.a aVar = (com.mbridge.msdk.newreward.function.core.campaign.a) obj;
        com.mbridge.msdk.newreward.function.core.resource.d<?> dVarB = aVar.b();
        if (aVar.h().l() != null) {
            if (aVar.h().l().containsKey("command_manager")) {
                this.f1582a = (com.mbridge.msdk.newreward.function.command.c) aVar.h().l().get("command_manager");
            }
            if (aVar.h().l().containsKey("adapter_model")) {
                this.b = (com.mbridge.msdk.newreward.adapter.e) aVar.h().l().get("adapter_model");
            }
        }
        if (dVarB == null) {
            bVar.reqSuccessful(aVar);
            return;
        }
        if (dVarB.i() == 1) {
            this.c = 1;
        } else {
            this.c = 2;
        }
        a(com.mbridge.msdk.newreward.function.command.f.REPORT_DOWNLOAD_START, 0, aVar, null);
        dVarB.g().a(0, new a(dVarB, bVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.newreward.function.command.f fVar, int i, com.mbridge.msdk.newreward.function.core.campaign.a aVar, MBridgeError mBridgeError) {
        if (this.f1582a == null || this.b == null) {
            return;
        }
        try {
            Map mapA = this.f1582a.a("resource_type", 3, "scenes", 1, "url", aVar.b().c(), CampaignEx.JSON_KEY_READY_RATE, 100, "mraid_type", Integer.valueOf(aVar.k() ? 1 : 0));
            int i2 = b.f1584a[fVar.ordinal()];
            if (i2 != 1) {
                if (i2 == 2 && this.c == 2) {
                    mapA.put("result", Integer.valueOf(i));
                    if (i != 1 && mBridgeError != null) {
                        mapA.put("reason", mBridgeError.getErrorMessage());
                    }
                    this.f1582a.a(this.b, fVar, mapA);
                    return;
                }
                return;
            }
            mapA.put("cache", Integer.valueOf(this.c));
            this.f1582a.a(this.b, fVar, mapA);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }
}
