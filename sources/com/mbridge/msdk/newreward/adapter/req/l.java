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
public class l implements com.mbridge.msdk.newreward.adapter.req.a {

    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.foundation.error.b f1595a;
        private final com.mbridge.msdk.newreward.adapter.req.b b;

        public a(com.mbridge.msdk.foundation.error.b bVar, com.mbridge.msdk.newreward.adapter.req.b bVar2) {
            this.f1595a = bVar;
            this.b = bVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.error.b bVar;
            com.mbridge.msdk.newreward.adapter.req.b bVar2 = this.b;
            if (bVar2 == null || (bVar = this.f1595a) == null) {
                return;
            }
            bVar2.reqFailed(bVar);
        }
    }

    public static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private JSONObject f1596a;
        private final com.mbridge.msdk.newreward.adapter.req.b b;

        public b(JSONObject jSONObject, com.mbridge.msdk.newreward.adapter.req.b bVar) {
            this.f1596a = jSONObject;
            this.b = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.videocommon.setting.a aVarA;
            if (this.b == null || this.f1596a == null) {
                return;
            }
            try {
                String strB = com.mbridge.msdk.foundation.controller.c.n().b();
                if (t0.a(this.f1596a)) {
                    JSONObject jSONObjectOptJSONObject = this.f1596a.optJSONObject("data");
                    this.f1596a = jSONObjectOptJSONObject;
                    if (jSONObjectOptJSONObject != null) {
                        if (jSONObjectOptJSONObject.optInt("vtag_status", 0) == 1) {
                            String strD = com.mbridge.msdk.videocommon.setting.b.b().d(strB);
                            if (!TextUtils.isEmpty(strD)) {
                                this.f1596a = com.mbridge.msdk.setting.h.b().a(new JSONObject(strD), this.f1596a);
                            }
                        }
                        this.f1596a.put("current_time", System.currentTimeMillis());
                        com.mbridge.msdk.videocommon.setting.b.b().g(strB, this.f1596a.toString());
                        aVarA = com.mbridge.msdk.videocommon.setting.a.a(this.f1596a.toString());
                    }
                    this.b.reqSuccessful(aVarA);
                }
                com.mbridge.msdk.videocommon.setting.b.b().g(strB);
                aVarA = null;
                this.b.reqSuccessful(aVarA);
            } catch (Throwable th) {
                o0.b("ReqRewardSettingService", th.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.adapter.req.a
    public void a(Object obj, com.mbridge.msdk.newreward.adapter.req.b bVar) throws IOException {
        int i;
        if (obj == null) {
            throw new IOException("ReqRewardSettingService doReq: params is null");
        }
        com.mbridge.msdk.newreward.function.paramter.d dVar = (com.mbridge.msdk.newreward.function.paramter.d) obj;
        dVar.b(com.mbridge.msdk.newreward.function.core.request.h.z);
        if (com.mbridge.msdk.videocommon.setting.b.b().e()) {
            return;
        }
        com.mbridge.msdk.videocommon.setting.b.b().b(true);
        try {
            com.mbridge.msdk.videocommon.setting.a aVarD = com.mbridge.msdk.videocommon.setting.b.b().d();
            dVar.b(aVarD == null ? "" : aVarD.j());
        } catch (Throwable th) {
            o0.b("ReqRewardSettingService", th.getMessage());
        }
        try {
            String str = com.mbridge.msdk.foundation.same.net.utils.d.h().s ? com.mbridge.msdk.foundation.same.net.utils.d.h().U : com.mbridge.msdk.foundation.same.net.utils.d.h().T;
            if (com.mbridge.msdk.foundation.same.net.utils.d.h().s) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("uri", str);
                jSONObject.put("data", dVar.c());
                com.mbridge.msdk.foundation.same.net.f.b().a(com.mbridge.msdk.foundation.same.net.utils.d.h().m, com.mbridge.msdk.foundation.same.net.utils.d.h().q, jSONObject.toString(), true, new c(bVar));
                return;
            }
            com.mbridge.msdk.newreward.function.core.request.h hVar = new com.mbridge.msdk.newreward.function.core.request.h(str);
            hVar.a(dVar.d());
            hVar.a((com.mbridge.msdk.newreward.function.core.request.e) new c(bVar));
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

    public static final class c implements com.mbridge.msdk.foundation.same.net.b<JSONObject>, com.mbridge.msdk.newreward.function.core.request.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.adapter.req.b f1597a;

        public c(com.mbridge.msdk.newreward.adapter.req.b bVar) {
            this.f1597a = bVar;
        }

        @Override // com.mbridge.msdk.newreward.function.core.request.e
        public void a(JSONObject jSONObject, u<JSONObject> uVar) {
            com.mbridge.msdk.videocommon.setting.b.b().b(false);
            MBridgeTaskManager.commonExecute(new b(jSONObject, this.f1597a));
        }

        @Override // com.mbridge.msdk.foundation.same.net.b
        public void onError(com.mbridge.msdk.foundation.same.net.exception.a aVar) {
            com.mbridge.msdk.videocommon.setting.b.b().b(false);
            MBridgeTaskManager.commonExecute(new a(new com.mbridge.msdk.foundation.error.b(880002, aVar.getMessage()), this.f1597a));
        }

        @Override // com.mbridge.msdk.foundation.same.net.b
        public void onSuccess(com.mbridge.msdk.foundation.same.net.e<JSONObject> eVar) {
            com.mbridge.msdk.videocommon.setting.b.b().b(false);
            MBridgeTaskManager.commonExecute(new b(eVar.c, this.f1597a));
        }

        @Override // com.mbridge.msdk.newreward.function.core.request.e
        public void a(u<JSONObject> uVar, com.mbridge.msdk.newreward.function.core.request.d dVar) {
            com.mbridge.msdk.videocommon.setting.b.b().b(false);
            MBridgeTaskManager.commonExecute(new a(new com.mbridge.msdk.foundation.error.b(880002, dVar.a()), this.f1597a));
        }
    }
}
