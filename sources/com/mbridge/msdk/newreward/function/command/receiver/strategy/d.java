package com.mbridge.msdk.newreward.function.command.receiver.strategy;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.newreward.function.command.f;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1668a = 0;
    private long b = 0;

    public class a implements com.mbridge.msdk.newreward.adapter.req.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.newreward.adapter.req.b f1669a;
        final /* synthetic */ e b;

        public a(com.mbridge.msdk.newreward.adapter.req.b bVar, e eVar) {
            this.f1669a = bVar;
            this.b = eVar;
        }

        @Override // com.mbridge.msdk.newreward.adapter.req.b
        public void reqFailed(com.mbridge.msdk.foundation.error.b bVar) {
            if (this.f1669a != null) {
                d.this.a(f.REPORT_V3_RETRY_END, this.b, bVar != null ? bVar.h() : "", false);
                this.f1669a.reqFailed(bVar);
            }
        }

        @Override // com.mbridge.msdk.newreward.adapter.req.b
        public void reqSuccessful(Object obj) {
            if (this.f1669a != null) {
                d.this.a(f.REPORT_V3_RETRY_END, this.b, "", true);
                this.f1669a.reqSuccessful(obj);
            }
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1670a;

        static {
            int[] iArr = new int[f.values().length];
            f1670a = iArr;
            try {
                iArr[f.REPORT_V3_RETRY_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1670a[f.REPORT_V3_RETRY_END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public void a(e eVar, com.mbridge.msdk.newreward.adapter.req.b bVar) {
        com.mbridge.msdk.newreward.adapter.e eVarA;
        com.mbridge.msdk.newreward.function.core.campaign.b bVarA;
        if (eVar == null || (eVarA = eVar.a()) == null || eVarA.g() == null || (bVarA = eVarA.g().a()) == null) {
            return;
        }
        a(f.REPORT_V3_RETRY_START, eVar, "", false);
        eVarA.o0();
        eVarA.L().b(bVarA, new a(bVar, eVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        if (((java.lang.Boolean) r2).booleanValue() == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(com.mbridge.msdk.newreward.function.command.receiver.strategy.e r11) {
        /*
            r10 = this;
            r0 = 0
            if (r11 == 0) goto L8b
            com.mbridge.msdk.foundation.error.b r1 = r11.c()
            if (r1 == 0) goto L8b
            com.mbridge.msdk.newreward.adapter.e r1 = r11.a()
            if (r1 == 0) goto L8b
            com.mbridge.msdk.foundation.error.b r1 = r11.c()
            int r1 = r1.b()
            r2 = 2
            if (r1 != r2) goto L1b
            goto L8b
        L1b:
            com.mbridge.msdk.newreward.adapter.e r1 = r11.a()
            com.mbridge.msdk.newreward.function.model.a r1 = r1.g()
            if (r1 != 0) goto L26
            return r0
        L26:
            com.mbridge.msdk.newreward.function.core.campaign.b r1 = r1.a()
            if (r1 != 0) goto L2d
            return r0
        L2d:
            com.mbridge.msdk.newreward.adapter.e r1 = r11.a()
            com.mbridge.msdk.newreward.function.model.e r1 = r1.L()
            if (r1 != 0) goto L38
            return r0
        L38:
            com.mbridge.msdk.foundation.tools.q0 r1 = com.mbridge.msdk.foundation.tools.q0.a()
            java.lang.String r2 = "retry_strategy"
            java.lang.String r3 = "download_retry_max"
            int r1 = r1.b(r2, r3, r0)
            if (r1 != 0) goto L47
            return r0
        L47:
            com.mbridge.msdk.foundation.error.b r2 = r11.c()
            java.lang.String r3 = "can_retry"
            java.lang.Object r2 = r2.a(r3)
            if (r2 == 0) goto L5c
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Exception -> L5b
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Exception -> L5b
            if (r2 != 0) goto L5c
        L5b:
            return r0
        L5c:
            int r2 = r10.f1668a
            if (r2 != 0) goto L66
            long r2 = java.lang.System.currentTimeMillis()
            r10.b = r2
        L66:
            int r2 = r10.f1668a
            r3 = 1
            int r2 = r2 + r3
            r10.f1668a = r2
            com.mbridge.msdk.newreward.adapter.e r2 = r11.a()
            int r2 = r2.z()
            long r4 = (long) r2
            com.mbridge.msdk.newreward.adapter.e r11 = r11.a()
            long r6 = r11.y()
            long r8 = android.os.SystemClock.elapsedRealtime()
            long r8 = r8 - r6
            int r11 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r11 >= 0) goto L8b
            int r11 = r10.f1668a
            if (r11 > r1) goto L8b
            r0 = 1
        L8b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.newreward.function.command.receiver.strategy.d.a(com.mbridge.msdk.newreward.function.command.receiver.strategy.e):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(f fVar, e eVar, String str, boolean z) {
        if (eVar == null) {
            return;
        }
        com.mbridge.msdk.newreward.function.command.c cVarB = eVar.b();
        com.mbridge.msdk.newreward.adapter.e eVarA = eVar.a();
        if (cVarB == null || eVarA == null) {
            return;
        }
        try {
            int i = 1;
            Map mapA = cVarB.a("retry_count", Integer.valueOf(this.f1668a), "type", 3);
            int i2 = b.f1670a[fVar.ordinal()];
            if (i2 == 1) {
                cVarB.a(eVarA, f.REPORT_V3_RETRY_START, mapA);
                return;
            }
            if (i2 != 2) {
                return;
            }
            mapA.put("duration", Long.valueOf(System.currentTimeMillis() - this.b));
            if (!z) {
                mapA.put("reason", str);
            }
            if (!z) {
                i = 2;
            }
            mapA.put("result", Integer.valueOf(i));
            cVarB.a(eVarA, f.REPORT_V3_RETRY_END, mapA);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }
}
