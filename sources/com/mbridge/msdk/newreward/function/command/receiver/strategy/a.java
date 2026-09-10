package com.mbridge.msdk.newreward.function.command.receiver.strategy;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.newreward.function.command.f;
import com.mbridge.msdk.newreward.function.common.MBridgeTaskManager;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.command.concretecommand.a f1658a;
    private long c;
    private volatile boolean b = false;
    private int d = 0;
    private long e = 0;

    /* JADX INFO: renamed from: com.mbridge.msdk.newreward.function.command.receiver.strategy.a$a, reason: collision with other inner class name */
    public class RunnableC0209a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f1659a;
        final /* synthetic */ com.mbridge.msdk.newreward.adapter.req.b b;

        /* JADX INFO: renamed from: com.mbridge.msdk.newreward.function.command.receiver.strategy.a$a$a, reason: collision with other inner class name */
        public class C0210a implements com.mbridge.msdk.newreward.adapter.req.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.mbridge.msdk.newreward.adapter.e f1660a;

            public C0210a(com.mbridge.msdk.newreward.adapter.e eVar) {
                this.f1660a = eVar;
            }

            @Override // com.mbridge.msdk.newreward.adapter.req.b
            public void reqFailed(com.mbridge.msdk.foundation.error.b bVar) {
                o0.a("CampaignRetryStrategy", "reqFailed，try retry");
                RunnableC0209a runnableC0209a = RunnableC0209a.this;
                if (a.this.a(bVar, runnableC0209a.f1659a, this.f1660a)) {
                    RunnableC0209a.this.f1659a.a(bVar);
                    RunnableC0209a runnableC0209a2 = RunnableC0209a.this;
                    a.this.b(runnableC0209a2.f1659a, runnableC0209a2.b);
                } else {
                    a.this.b = true;
                    RunnableC0209a runnableC0209a3 = RunnableC0209a.this;
                    a.this.a(f.REPORT_V3_RETRY_END, runnableC0209a3.f1659a, bVar != null ? bVar.h() : "", false);
                    RunnableC0209a.this.b.reqFailed(bVar);
                }
            }

            @Override // com.mbridge.msdk.newreward.adapter.req.b
            public void reqSuccessful(Object obj) {
                RunnableC0209a runnableC0209a = RunnableC0209a.this;
                a.this.a(f.REPORT_V3_RETRY_END, runnableC0209a.f1659a, "", true);
                RunnableC0209a.this.b.reqSuccessful(obj);
            }
        }

        public RunnableC0209a(e eVar, com.mbridge.msdk.newreward.adapter.req.b bVar) {
            this.f1659a = eVar;
            this.b = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.newreward.function.command.b bVar = new com.mbridge.msdk.newreward.function.command.b();
            bVar.a(f.REQ_CAMPAIGN);
            HashMap map = new HashMap();
            com.mbridge.msdk.newreward.adapter.e eVarA = this.f1659a.a();
            map.put("adapter_model", eVarA);
            map.put("command_manager", this.f1659a.b());
            bVar.a(map);
            eVarA.n0();
            a.this.f1658a.a(bVar, new C0210a(eVarA));
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1661a;

        static {
            int[] iArr = new int[f.values().length];
            f1661a = iArr;
            try {
                iArr[f.REPORT_V3_RETRY_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1661a[f.REPORT_V3_RETRY_END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public a(com.mbridge.msdk.newreward.function.command.concretecommand.a aVar) {
        this.f1658a = aVar;
    }

    public void b(e eVar, com.mbridge.msdk.newreward.adapter.req.b bVar) {
        if (eVar == null) {
            return;
        }
        RunnableC0209a runnableC0209a = new RunnableC0209a(eVar, bVar);
        o0.a("CampaignRetryStrategy", "retryReqCampaign，retryReqCampaign: " + this.c);
        MBridgeTaskManager.directorExecute(runnableC0209a, this.c);
    }

    public boolean a() {
        return this.b;
    }

    public void a(e eVar, com.mbridge.msdk.newreward.adapter.req.b bVar) {
        a(f.REPORT_V3_RETRY_START, eVar, "", false);
        b(eVar, bVar);
    }

    public boolean a(e eVar) {
        if (eVar == null) {
            return false;
        }
        return a(eVar.c(), eVar, eVar.a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (((java.lang.Boolean) r9).booleanValue() == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(com.mbridge.msdk.foundation.error.b r9, com.mbridge.msdk.newreward.function.command.receiver.strategy.e r10, com.mbridge.msdk.newreward.adapter.e r11) {
        /*
            r8 = this;
            r0 = 0
            if (r11 == 0) goto L86
            if (r9 == 0) goto L86
            if (r10 == 0) goto L86
            int r10 = r9.b()
            r1 = 2
            if (r10 != r1) goto L10
            goto L86
        L10:
            com.mbridge.msdk.foundation.tools.q0 r10 = com.mbridge.msdk.foundation.tools.q0.a()
            java.lang.String r1 = "campaign_request_interval"
            r2 = 3000(0xbb8, float:4.204E-42)
            java.lang.String r3 = "retry_strategy"
            int r10 = r10.b(r3, r1, r2)
            long r1 = (long) r10
            r8.c = r1
            com.mbridge.msdk.foundation.tools.q0 r10 = com.mbridge.msdk.foundation.tools.q0.a()
            java.lang.String r1 = "campaign_request_max"
            int r10 = r10.b(r3, r1, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "campaignRequestRetryInvalidTime = "
            r1.<init>(r2)
            long r2 = r8.c
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "CampaignRetryStrategy"
            com.mbridge.msdk.foundation.tools.o0.a(r2, r1)
            long r1 = r8.c
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L86
            if (r10 > 0) goto L4b
            goto L86
        L4b:
            java.lang.String r1 = "can_retry"
            java.lang.Object r9 = r9.a(r1)
            if (r9 == 0) goto L5c
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Exception -> L5b
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Exception -> L5b
            if (r9 != 0) goto L5c
        L5b:
            return r0
        L5c:
            int r9 = r8.d
            if (r9 != 0) goto L66
            long r1 = java.lang.System.currentTimeMillis()
            r8.e = r1
        L66:
            int r9 = r8.d
            r1 = 1
            int r9 = r9 + r1
            r8.d = r9
            long r2 = r11.h()
            int r9 = r11.i()
            long r4 = (long) r9
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r6 = r6 - r2
            long r2 = r8.c
            long r4 = r4 - r2
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 >= 0) goto L86
            int r9 = r8.d
            if (r9 > r10) goto L86
            r0 = 1
        L86:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.newreward.function.command.receiver.strategy.a.a(com.mbridge.msdk.foundation.error.b, com.mbridge.msdk.newreward.function.command.receiver.strategy.e, com.mbridge.msdk.newreward.adapter.e):boolean");
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
            Map mapA = cVarB.a("retry_count", Integer.valueOf(this.d), "type", 1);
            int i2 = b.f1661a[fVar.ordinal()];
            if (i2 == 1) {
                cVarB.a(eVarA, f.REPORT_V3_RETRY_START, mapA);
                return;
            }
            if (i2 != 2) {
                return;
            }
            mapA.put("duration", Long.valueOf(System.currentTimeMillis() - this.e));
            if (z) {
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
