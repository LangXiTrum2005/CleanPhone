package com.mbridge.msdk.newreward.adapter.req;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.browser.trusted.sharing.ShareTarget;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.newreward.function.common.MBridgeTaskManager;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class c implements com.mbridge.msdk.newreward.adapter.req.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.newreward.adapter.e f1572a;

    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.function.core.campaign.b f1573a;
        private final com.mbridge.msdk.newreward.function.core.request.b b;
        private final boolean c;
        private final int d;
        private final com.mbridge.msdk.newreward.adapter.req.b e;
        private final String f;

        public a(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.function.core.request.b bVar2, boolean z, int i, com.mbridge.msdk.newreward.adapter.req.b bVar3, String str) {
            this.f1573a = bVar;
            this.b = bVar2;
            this.c = z;
            this.d = i;
            this.e = bVar3;
            this.f = str;
        }

        private com.mbridge.msdk.foundation.error.b a(int i) {
            String strB;
            boolean z;
            String strB2 = "load exception with no mCampaignRequestError";
            com.mbridge.msdk.foundation.error.b bVarA = null;
            int iC = 0;
            int i2 = 880002;
            try {
                com.mbridge.msdk.newreward.function.core.request.b bVar = this.b;
                if (bVar != null) {
                    String strE = "";
                    if (bVar.a() == 9) {
                        iC = this.b.c();
                        strB2 = this.b.d();
                        i2 = this.b.a() == -1 ? 880017 : 880003;
                        z = true;
                        strE = this.b.e();
                        strB = "";
                    } else if (this.b.a() == 10) {
                        try {
                            strB2 = this.b.b();
                            strB = "";
                            iC = 880023;
                            i2 = 880023;
                            z = false;
                        } catch (Exception e) {
                            e = e;
                            iC = 880023;
                            e.printStackTrace();
                        }
                    } else {
                        switch (this.b.a()) {
                            case 1:
                            case 3:
                            case 4:
                            case 5:
                            case 8:
                                break;
                            case 2:
                            case 7:
                                i2 = 880003;
                                break;
                            case 6:
                            default:
                                i2 = 880020;
                                break;
                        }
                        if (this.b.f() != null) {
                            int iC2 = this.b.f().c();
                            try {
                                strB2 = this.b.f().b();
                                iC = iC2;
                                strB = this.b.b();
                            } catch (Exception e2) {
                                e = e2;
                                iC = iC2;
                                e.printStackTrace();
                            }
                        } else {
                            strB = "";
                        }
                        z = false;
                    }
                    bVarA = com.mbridge.msdk.foundation.error.a.a(iC, i2, strB2);
                    bVarA.a("can_retry", Boolean.valueOf(this.c));
                    bVarA.a("campaign_request_error_type", Integer.valueOf(i));
                    bVarA.a("campaign_request_error", this.b);
                    bVarA.a(z);
                    if (!TextUtils.isEmpty(strE)) {
                        bVarA.f(strE);
                    }
                    if (!TextUtils.isEmpty(strB)) {
                        bVarA.b(strB);
                    }
                    bVarA.a(this.f);
                }
            } catch (Exception e3) {
                e = e3;
            }
            return bVarA == null ? com.mbridge.msdk.foundation.error.a.a(iC, i2, strB2) : bVarA;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.newreward.adapter.req.b bVar = this.e;
            if (bVar == null || this.b == null) {
                return;
            }
            try {
                bVar.reqFailed(a(this.d));
            } catch (Exception e) {
                o0.b("ReqCampaignService", "run: ", e);
            }
        }
    }

    public static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.function.core.campaign.b f1574a;
        private final com.mbridge.msdk.newreward.adapter.req.b b;

        public b(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.adapter.req.b bVar2) {
            this.f1574a = bVar;
            this.b = bVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.newreward.function.core.campaign.b bVar;
            com.mbridge.msdk.newreward.adapter.req.b bVar2 = this.b;
            if (bVar2 == null || (bVar = this.f1574a) == null) {
                return;
            }
            try {
                bVar2.reqSuccessful(bVar);
            } catch (Exception e) {
                o0.b("ReqCampaignService", "run: ", e);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.newreward.adapter.req.c$c, reason: collision with other inner class name */
    public static class C0202c implements com.mbridge.msdk.newreward.function.core.request.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.adapter.req.b f1575a;

        public C0202c(com.mbridge.msdk.newreward.adapter.req.b bVar) {
            this.f1575a = bVar;
        }

        @Override // com.mbridge.msdk.newreward.function.core.request.c
        public void a(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.function.core.request.a aVar) {
            MBridgeTaskManager.commonExecute(new b(bVar, this.f1575a));
        }

        @Override // com.mbridge.msdk.newreward.function.core.request.c
        public void b(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.function.core.request.a aVar, com.mbridge.msdk.newreward.function.core.request.b bVar2) {
            MBridgeTaskManager.commonExecute(new a(bVar, bVar2, true, 401, this.f1575a, aVar.t()));
        }

        @Override // com.mbridge.msdk.newreward.function.core.request.c
        public void a(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.function.core.request.a aVar, com.mbridge.msdk.newreward.function.core.request.b bVar2) {
            MBridgeTaskManager.commonExecute(new a(bVar, bVar2, false, 402, this.f1575a, aVar.t()));
        }

        @Override // com.mbridge.msdk.newreward.function.core.request.c
        public void a(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.function.core.request.a aVar, long j, com.mbridge.msdk.newreward.function.core.request.b bVar2) {
            MBridgeTaskManager.commonExecute(new a(bVar, bVar2, false, 405, this.f1575a, aVar.t()));
        }
    }

    public c(com.mbridge.msdk.newreward.adapter.e eVar) {
        this.f1572a = eVar;
    }

    @Override // com.mbridge.msdk.newreward.adapter.req.a
    public void a(Object obj, com.mbridge.msdk.newreward.adapter.req.b bVar) throws IOException {
        int i;
        if (obj == null) {
            throw new IOException("ReqCampaignService doReq: params is null");
        }
        try {
            long jH = this.f1572a.h();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jH <= 0) {
                this.f1572a.a(jElapsedRealtime);
                jH = jElapsedRealtime;
            }
            com.mbridge.msdk.newreward.function.paramter.e eVar = (com.mbridge.msdk.newreward.function.paramter.e) obj;
            int iC = eVar.c();
            String strE = eVar.e();
            String strG = eVar.g();
            String strD = eVar.d();
            long jI = ((long) this.f1572a.i()) - (jElapsedRealtime - jH);
            Map<String, String> mapF = eVar.f();
            com.mbridge.msdk.newreward.function.core.request.i iVar = new com.mbridge.msdk.newreward.function.core.request.i(iC, strE, strG, Math.max(jI, 0L), strD);
            iVar.a(mapF);
            iVar.f(this.f1572a.A());
            iVar.a((com.mbridge.msdk.newreward.function.core.request.c) new C0202c(bVar));
            byte[] bArrB = iVar.b();
            int length = bArrB != null ? bArrB.length : 0;
            iVar.c(com.mbridge.msdk.foundation.same.net.wrapper.e.k, String.valueOf(length));
            if (bArrB != null && (i = com.mbridge.msdk.foundation.same.net.utils.d.h().i()) > 0 && length > i) {
                iVar.b(1);
                iVar.b("Content-Type", ShareTarget.ENCODING_TYPE_URL_ENCODED);
            }
            com.mbridge.msdk.newreward.function.core.request.f.b().a((com.mbridge.msdk.newreward.function.core.request.a) iVar);
        } catch (Exception e) {
            throw new IOException(e);
        }
    }
}
