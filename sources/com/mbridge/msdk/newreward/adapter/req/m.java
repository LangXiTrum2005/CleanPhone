package com.mbridge.msdk.newreward.adapter.req;

import android.text.TextUtils;
import androidx.browser.trusted.sharing.ShareTarget;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.newreward.function.common.MBridgeTaskManager;
import com.mbridge.msdk.tracker.network.u;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class m implements com.mbridge.msdk.newreward.adapter.req.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f1598a;

    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.foundation.error.b f1599a;
        private final com.mbridge.msdk.newreward.adapter.req.b b;

        public a(com.mbridge.msdk.foundation.error.b bVar, com.mbridge.msdk.newreward.adapter.req.b bVar2) {
            this.f1599a = bVar;
            this.b = bVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.error.b bVar;
            com.mbridge.msdk.newreward.adapter.req.b bVar2 = this.b;
            if (bVar2 == null || (bVar = this.f1599a) == null) {
                return;
            }
            bVar2.reqFailed(bVar);
        }
    }

    public static class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f1601a;
        private JSONObject b;
        private final com.mbridge.msdk.newreward.adapter.req.b c;

        public c(String str, JSONObject jSONObject, com.mbridge.msdk.newreward.adapter.req.b bVar) {
            this.f1601a = str;
            this.b = jSONObject;
            this.c = bVar;
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0091 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:7:0x000a, B:9:0x001a, B:11:0x0026, B:13:0x0030, B:15:0x0040, B:18:0x0054, B:20:0x0060, B:21:0x007a, B:25:0x0091, B:26:0x009e, B:22:0x0085), top: B:30:0x000a }] */
        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.videocommon.setting.c cVarA;
            if (this.c == null || this.b == null) {
                return;
            }
            try {
                String strB = com.mbridge.msdk.foundation.controller.c.n().b();
                if (t0.a(this.b)) {
                    JSONObject jSONObjectOptJSONObject = this.b.optJSONObject("data");
                    this.b = jSONObjectOptJSONObject;
                    if (jSONObjectOptJSONObject != null) {
                        if (jSONObjectOptJSONObject.optInt("vtag_status", 0) == 1) {
                            String strC = com.mbridge.msdk.videocommon.setting.b.b().c(strB, this.f1601a);
                            if (!TextUtils.isEmpty(strC)) {
                                this.b = com.mbridge.msdk.setting.h.b().a(new JSONObject(strC), this.b);
                            }
                        }
                        if (com.mbridge.msdk.videocommon.setting.b.c(this.b.toString())) {
                            this.b.put("current_time", System.currentTimeMillis());
                            com.mbridge.msdk.videocommon.setting.b.b().a(strB, this.f1601a, this.b.toString());
                        }
                        cVarA = com.mbridge.msdk.videocommon.setting.c.a(this.b.toString());
                    }
                    if (cVarA != null) {
                        com.mbridge.msdk.videocommon.setting.b.b().a(this.f1601a, cVarA.c());
                    }
                    this.c.reqSuccessful(cVarA);
                }
                com.mbridge.msdk.videocommon.setting.b.b().h(strB, this.f1601a);
                cVarA = null;
                if (cVarA != null) {
                    com.mbridge.msdk.videocommon.setting.b.b().a(this.f1601a, cVarA.c());
                }
                this.c.reqSuccessful(cVarA);
            } catch (Throwable th) {
                o0.b("ReqRewardUnitSettingService", th.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.adapter.req.a
    public void a(Object obj, com.mbridge.msdk.newreward.adapter.req.b bVar) throws IOException {
        int i;
        if (obj == null) {
            throw new IOException("ReqRewardUnitSettingService doReq: params is null");
        }
        com.mbridge.msdk.newreward.function.paramter.d dVar = (com.mbridge.msdk.newreward.function.paramter.d) obj;
        String strB = com.mbridge.msdk.foundation.controller.c.n().b();
        this.f1598a = dVar.e();
        dVar.b(com.mbridge.msdk.newreward.function.core.request.h.A);
        if (com.mbridge.msdk.videocommon.setting.b.b().e(this.f1598a)) {
            return;
        }
        com.mbridge.msdk.videocommon.setting.b.b().a(this.f1598a);
        try {
            com.mbridge.msdk.videocommon.setting.c cVarE = com.mbridge.msdk.videocommon.setting.b.b().e(strB, this.f1598a);
            dVar.b(cVarE == null ? "" : cVarE.G());
        } catch (Throwable th) {
            o0.b("ReqRewardUnitSettingService", th.getMessage());
        }
        try {
            String str = com.mbridge.msdk.foundation.same.net.utils.d.h().s ? com.mbridge.msdk.foundation.same.net.utils.d.h().U : com.mbridge.msdk.foundation.same.net.utils.d.h().T;
            if (com.mbridge.msdk.foundation.same.net.utils.d.h().s) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("uri", str);
                jSONObject.put("data", dVar.c());
                com.mbridge.msdk.foundation.same.net.f.b().a(com.mbridge.msdk.foundation.same.net.utils.d.h().m, com.mbridge.msdk.foundation.same.net.utils.d.h().q, jSONObject.toString(), true, new b(this.f1598a, bVar));
                return;
            }
            com.mbridge.msdk.newreward.function.core.request.h hVar = new com.mbridge.msdk.newreward.function.core.request.h(str);
            hVar.a(dVar.d());
            hVar.a((com.mbridge.msdk.newreward.function.core.request.e) new b(this.f1598a, bVar));
            byte[] bArrB = hVar.b();
            int length = bArrB != null ? bArrB.length : 0;
            HashMap map = new HashMap();
            map.put(com.mbridge.msdk.foundation.same.net.wrapper.e.k, String.valueOf(length));
            hVar.a((Map<String, String>) map);
            if (bArrB != null && (i = com.mbridge.msdk.foundation.same.net.utils.d.h().i()) > 0 && length > i) {
                hVar.b(1);
                hVar.b("Content-Type", ShareTarget.ENCODING_TYPE_URL_ENCODED);
            }
            com.mbridge.msdk.newreward.function.core.request.f.b().a(hVar);
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    public static final class b implements com.mbridge.msdk.foundation.same.net.b<JSONObject>, com.mbridge.msdk.newreward.function.core.request.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f1600a;
        private final com.mbridge.msdk.newreward.adapter.req.b b;

        public b(String str, com.mbridge.msdk.newreward.adapter.req.b bVar) {
            this.f1600a = str;
            this.b = bVar;
        }

        @Override // com.mbridge.msdk.newreward.function.core.request.e
        public void a(JSONObject jSONObject, u<JSONObject> uVar) {
            com.mbridge.msdk.videocommon.setting.b.b().f(this.f1600a);
            MBridgeTaskManager.commonExecute(new c(this.f1600a, jSONObject, this.b));
        }

        @Override // com.mbridge.msdk.foundation.same.net.b
        public void onError(com.mbridge.msdk.foundation.same.net.exception.a aVar) {
            com.mbridge.msdk.videocommon.setting.b.b().f(this.f1600a);
            MBridgeTaskManager.commonExecute(new a(new com.mbridge.msdk.foundation.error.b(880002, aVar.getMessage()), this.b));
        }

        @Override // com.mbridge.msdk.foundation.same.net.b
        public void onSuccess(com.mbridge.msdk.foundation.same.net.e<JSONObject> eVar) {
            com.mbridge.msdk.videocommon.setting.b.b().f(this.f1600a);
            MBridgeTaskManager.commonExecute(new c(this.f1600a, eVar.c, this.b));
        }

        @Override // com.mbridge.msdk.newreward.function.core.request.e
        public void a(u<JSONObject> uVar, com.mbridge.msdk.newreward.function.core.request.d dVar) {
            com.mbridge.msdk.videocommon.setting.b.b().f(this.f1600a);
            MBridgeTaskManager.commonExecute(new a(new com.mbridge.msdk.foundation.error.b(880002, dVar.a()), this.b));
        }
    }
}
