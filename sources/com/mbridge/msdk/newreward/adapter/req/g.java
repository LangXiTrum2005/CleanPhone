package com.mbridge.msdk.newreward.adapter.req;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import com.mbridge.msdk.newreward.function.core.resource.q;
import com.mbridge.msdk.newreward.function.core.resource.x;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class g implements com.mbridge.msdk.newreward.adapter.req.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.command.c f1585a;
    private com.mbridge.msdk.newreward.adapter.e b;
    private int c = 0;

    public class a implements x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.newreward.adapter.req.b f1586a;

        public a(com.mbridge.msdk.newreward.adapter.req.b bVar) {
            this.f1586a = bVar;
        }

        @Override // com.mbridge.msdk.newreward.function.core.resource.x
        public void a(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.function.core.campaign.a aVar, q qVar) {
        }

        @Override // com.mbridge.msdk.newreward.function.core.resource.x
        public void b(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.function.core.campaign.a aVar, q qVar) {
            if (bVar.I()) {
                this.f1586a.reqSuccessful(aVar);
            }
            g.this.a(com.mbridge.msdk.newreward.function.command.f.REPORT_DOWNLOAD_END, 1, aVar, null);
        }

        @Override // com.mbridge.msdk.newreward.function.core.resource.x
        public void a(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.function.core.campaign.a aVar, q qVar, MBridgeError mBridgeError) {
            if (bVar.I()) {
                this.f1586a.reqSuccessful(aVar);
            }
            g.this.a(com.mbridge.msdk.newreward.function.command.f.REPORT_DOWNLOAD_END, 3, aVar, mBridgeError);
        }

        @Override // com.mbridge.msdk.newreward.function.core.resource.x
        public void b(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.function.core.campaign.a aVar, q qVar, MBridgeError mBridgeError) {
            if (bVar.I()) {
                this.f1586a.reqSuccessful(aVar);
            }
            g.this.a(com.mbridge.msdk.newreward.function.command.f.REPORT_DOWNLOAD_END, 2, aVar, mBridgeError);
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1587a;

        static {
            int[] iArr = new int[com.mbridge.msdk.newreward.function.command.f.values().length];
            f1587a = iArr;
            try {
                iArr[com.mbridge.msdk.newreward.function.command.f.REPORT_DOWNLOAD_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1587a[com.mbridge.msdk.newreward.function.command.f.REPORT_DOWNLOAD_END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.adapter.req.a
    public void a(Object obj, com.mbridge.msdk.newreward.adapter.req.b bVar) throws IOException {
        com.mbridge.msdk.newreward.function.core.campaign.a aVar = (com.mbridge.msdk.newreward.function.core.campaign.a) obj;
        if (aVar != null && aVar.a() != null && aVar.a().isDynamicView()) {
            bVar.reqSuccessful(aVar);
            return;
        }
        com.mbridge.msdk.newreward.function.core.resource.h hVarC = aVar != null ? aVar.c() : null;
        if (aVar != null && aVar.h().l() != null) {
            if (aVar.h().l().containsKey("command_manager")) {
                this.f1585a = (com.mbridge.msdk.newreward.function.command.c) aVar.h().l().get("command_manager");
            }
            if (aVar.h().l().containsKey("adapter_model")) {
                this.b = (com.mbridge.msdk.newreward.adapter.e) aVar.h().l().get("adapter_model");
            }
        }
        if (hVarC == null) {
            bVar.reqSuccessful(aVar);
            return;
        }
        if (hVarC.i() == 1) {
            this.c = 1;
        } else {
            this.c = 2;
        }
        a(com.mbridge.msdk.newreward.function.command.f.REPORT_DOWNLOAD_START, 0, aVar, null);
        hVarC.g().a(0, new a(bVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.newreward.function.command.f fVar, int i, com.mbridge.msdk.newreward.function.core.campaign.a aVar, MBridgeError mBridgeError) {
        com.mbridge.msdk.newreward.function.command.c cVar = this.f1585a;
        if (cVar == null || this.b == null) {
            return;
        }
        try {
            Map mapA = cVar.a("resource_type", 6, "scenes", 1, "url", aVar.c().c(), "mraid_type", Integer.valueOf(aVar.k() ? 1 : 0));
            int i2 = b.f1587a[fVar.ordinal()];
            if (i2 != 1) {
                if (i2 == 2 && this.c == 2) {
                    mapA.put("result", Integer.valueOf(i));
                    if (i != 1 && mBridgeError != null) {
                        mapA.put("reason", mBridgeError.getErrorMessage());
                    }
                    this.f1585a.a(this.b, fVar, mapA);
                    return;
                }
                return;
            }
            mapA.put("cache", Integer.valueOf(this.c));
            this.f1585a.a(this.b, fVar, mapA);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }
}
