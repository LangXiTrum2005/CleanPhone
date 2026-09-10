package com.mbridge.msdk.newreward.adapter.req;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import com.mbridge.msdk.newreward.function.core.resource.q;
import com.mbridge.msdk.newreward.function.core.resource.x;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class d implements com.mbridge.msdk.newreward.adapter.req.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.command.c f1576a;
    private com.mbridge.msdk.newreward.adapter.e b;
    private int c = 0;

    public class a implements x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.newreward.adapter.req.b f1577a;
        final /* synthetic */ com.mbridge.msdk.newreward.function.core.resource.d b;

        public a(com.mbridge.msdk.newreward.adapter.req.b bVar, com.mbridge.msdk.newreward.function.core.resource.d dVar) {
            this.f1577a = bVar;
            this.b = dVar;
        }

        @Override // com.mbridge.msdk.newreward.function.core.resource.x
        public void a(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.function.core.campaign.a aVar, q qVar) {
        }

        @Override // com.mbridge.msdk.newreward.function.core.resource.x
        public void b(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.function.core.campaign.a aVar, q qVar) {
            if (bVar.I()) {
                this.f1577a.reqSuccessful(bVar);
            }
            d.this.a(com.mbridge.msdk.newreward.function.command.f.REPORT_DOWNLOAD_END, bVar, 1, "");
        }

        @Override // com.mbridge.msdk.newreward.function.core.resource.x
        public void a(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.function.core.campaign.a aVar, q qVar, MBridgeError mBridgeError) {
            d.this.a(com.mbridge.msdk.newreward.function.command.f.REPORT_DOWNLOAD_END, bVar, 3, mBridgeError != null ? mBridgeError.getErrorMessage() : "");
            a(bVar, this.f1577a, mBridgeError, "errorCode: 3203 errorMessage:");
        }

        @Override // com.mbridge.msdk.newreward.function.core.resource.x
        public void b(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.function.core.campaign.a aVar, q qVar, MBridgeError mBridgeError) {
            String errorMessage;
            if (mBridgeError != null) {
                errorMessage = mBridgeError.getErrorMessage();
            } else {
                errorMessage = "";
            }
            d.this.a(com.mbridge.msdk.newreward.function.command.f.REPORT_DOWNLOAD_END, bVar, 2, errorMessage);
            a(bVar, this.f1577a, mBridgeError, "errorCode: 3401 errorMessage: ");
        }

        private void a(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.adapter.req.b bVar2, MBridgeError mBridgeError, String str) {
            int errorCode;
            String errorMessage;
            if (bVar.I()) {
                try {
                    bVar2.reqSuccessful(bVar);
                    return;
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        o0.b("ReqDownBigTempleService", "doReq: ", e);
                        return;
                    }
                    return;
                }
            }
            if (mBridgeError == null) {
                errorMessage = "big temp load fail ";
                errorCode = -1;
            } else {
                try {
                    errorCode = mBridgeError.getErrorCode();
                    errorMessage = mBridgeError.getErrorMessage();
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        o0.b("ReqDownBigTempleService", "doReq: ", e2);
                        return;
                    }
                    return;
                }
            }
            if (this.b.j()) {
                return;
            }
            bVar2.reqFailed(com.mbridge.msdk.foundation.error.a.a(errorCode, 880005, str + errorMessage));
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1578a;

        static {
            int[] iArr = new int[com.mbridge.msdk.newreward.function.command.f.values().length];
            f1578a = iArr;
            try {
                iArr[com.mbridge.msdk.newreward.function.command.f.REPORT_DOWNLOAD_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1578a[com.mbridge.msdk.newreward.function.command.f.REPORT_DOWNLOAD_END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.adapter.req.a
    public void a(Object obj, com.mbridge.msdk.newreward.adapter.req.b bVar) throws IOException {
        com.mbridge.msdk.newreward.function.core.campaign.b bVar2 = (com.mbridge.msdk.newreward.function.core.campaign.b) obj;
        com.mbridge.msdk.newreward.function.core.resource.d<?> dVarH = bVar2.h();
        if (bVar2.l() != null) {
            if (bVar2.l().containsKey("command_manager")) {
                this.f1576a = (com.mbridge.msdk.newreward.function.command.c) bVar2.l().get("command_manager");
            }
            if (bVar2.l().containsKey("adapter_model")) {
                this.b = (com.mbridge.msdk.newreward.adapter.e) bVar2.l().get("adapter_model");
            }
        }
        if (dVarH == null) {
            bVar.reqSuccessful(bVar2);
            return;
        }
        if (dVarH.i() == 1) {
            this.c = 1;
        } else {
            this.c = 2;
        }
        a(com.mbridge.msdk.newreward.function.command.f.REPORT_DOWNLOAD_START, bVar2, 0, "");
        dVarH.g().a(0, new a(bVar, dVarH));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.newreward.function.command.f fVar, com.mbridge.msdk.newreward.function.core.campaign.b bVar, int i, String str) {
        com.mbridge.msdk.newreward.function.command.c cVar = this.f1576a;
        if (cVar == null || this.b == null) {
            return;
        }
        try {
            Map mapA = cVar.a("resource_type", 1, "url", bVar.h().c());
            int i2 = b.f1578a[fVar.ordinal()];
            if (i2 != 1) {
                if (i2 == 2 && this.c == 2) {
                    mapA.put("result", Integer.valueOf(i));
                    if (i != 1) {
                        mapA.put("reason", str);
                    }
                    this.f1576a.a(this.b, fVar, mapA);
                    return;
                }
                return;
            }
            mapA.put("cache", Integer.valueOf(this.c));
            this.f1576a.a(this.b, fVar, mapA);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }
}
