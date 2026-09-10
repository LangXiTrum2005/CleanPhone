package com.mbridge.msdk.newreward.function.command.receiver.strategy;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.newreward.function.command.f;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.command.concretecommand.a f1662a;
    private volatile boolean b = false;
    private int c = 0;
    private long d = 0;

    public class a implements com.mbridge.msdk.newreward.adapter.req.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f1663a;
        final /* synthetic */ com.mbridge.msdk.newreward.adapter.req.b b;

        public a(e eVar, com.mbridge.msdk.newreward.adapter.req.b bVar) {
            this.f1663a = eVar;
            this.b = bVar;
        }

        @Override // com.mbridge.msdk.newreward.adapter.req.b
        public void reqFailed(com.mbridge.msdk.foundation.error.b bVar) {
            b.this.a(f.REPORT_V3_RETRY_END, this.f1663a, bVar != null ? bVar.h() : "", false);
            b.this.b = true;
            this.b.reqFailed(bVar);
        }

        @Override // com.mbridge.msdk.newreward.adapter.req.b
        public void reqSuccessful(Object obj) {
            b.this.a(f.REPORT_V3_RETRY_END, this.f1663a, "", true);
            this.b.reqSuccessful(obj);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.newreward.function.command.receiver.strategy.b$b, reason: collision with other inner class name */
    public static /* synthetic */ class C0211b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1664a;

        static {
            int[] iArr = new int[f.values().length];
            f1664a = iArr;
            try {
                iArr[f.REPORT_V3_RETRY_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1664a[f.REPORT_V3_RETRY_END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public b(com.mbridge.msdk.newreward.function.command.concretecommand.a aVar) {
        this.f1662a = aVar;
    }

    public boolean a(e eVar) {
        return true;
    }

    public void b(e eVar, com.mbridge.msdk.newreward.adapter.req.b bVar) {
        a(f.REPORT_V3_RETRY_START, eVar, null, false);
        a(eVar, bVar);
    }

    public boolean a() {
        return this.b;
    }

    public void a(e eVar, com.mbridge.msdk.newreward.adapter.req.b bVar) {
        if (eVar == null) {
            return;
        }
        com.mbridge.msdk.newreward.function.command.b bVar2 = new com.mbridge.msdk.newreward.function.command.b();
        bVar2.a(f.REQ_CAMPAIGN);
        HashMap map = new HashMap();
        com.mbridge.msdk.newreward.adapter.e eVarA = eVar.a();
        map.put("adapter_model", eVarA);
        map.put("command_manager", eVar.b());
        bVar2.a(map);
        eVarA.n0();
        this.f1662a.a(bVar2, new a(eVar, bVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(f fVar, e eVar, String str, boolean z) {
        if (eVar == null) {
            return;
        }
        if (this.d == 0) {
            this.d = System.currentTimeMillis();
        }
        com.mbridge.msdk.newreward.function.command.c cVarB = eVar.b();
        com.mbridge.msdk.newreward.adapter.e eVarA = eVar.a();
        if (cVarB == null || eVarA == null) {
            return;
        }
        try {
            int i = 1;
            Map mapA = cVarB.a("retry_count", 1, "type", 2);
            int i2 = C0211b.f1664a[fVar.ordinal()];
            if (i2 == 1) {
                cVarB.a(eVarA, f.REPORT_V3_RETRY_START, mapA);
                return;
            }
            if (i2 != 2) {
                return;
            }
            mapA.put("duration", Long.valueOf(System.currentTimeMillis() - this.d));
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
