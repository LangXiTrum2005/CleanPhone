package com.mbridge.msdk.newreward.function.command.receiver.concretereceiver;

import com.mbridge.msdk.foundation.tools.o0;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class i implements com.mbridge.msdk.newreward.function.command.receiver.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.foundation.error.b f1639a;

    @Override // com.mbridge.msdk.newreward.function.command.receiver.a
    public void a(com.mbridge.msdk.newreward.function.command.b bVar, com.mbridge.msdk.newreward.adapter.req.b bVar2) {
        if (bVar == null || bVar.b() == null) {
            a(bVar2, new com.mbridge.msdk.foundation.error.b(-1, "command or object is null"));
            return;
        }
        try {
            Map map = (Map) bVar.b();
            this.f1639a = (com.mbridge.msdk.foundation.error.b) map.get("reason");
            com.mbridge.msdk.newreward.adapter.e eVar = (com.mbridge.msdk.newreward.adapter.e) map.get("adapter_model");
            com.mbridge.msdk.newreward.function.command.c cVar = (com.mbridge.msdk.newreward.function.command.c) map.get("command_manager");
            map.put("candidate_type", 0);
            map.put(com.umeng.ccg.a.j, 2);
            com.mbridge.msdk.newreward.function.cache.b bVar3 = (com.mbridge.msdk.newreward.function.cache.b) cVar.a(map);
            if (!com.mbridge.msdk.newreward.function.utils.c.d(eVar.f())) {
                a(bVar2, this.f1639a);
                return;
            }
            eVar.j(true);
            if (bVar3 == null) {
                a(bVar2, this.f1639a);
            } else if (bVar3.h() != com.mbridge.msdk.newreward.function.cache.b.j) {
                a(bVar2, new com.mbridge.msdk.foundation.error.b(bVar3.c(), bVar3.f()));
            } else {
                eVar.g().b(bVar3.e());
                a(bVar2, bVar3);
            }
        } catch (Exception e) {
            o0.b("SmartLoadReceiver", com.umeng.ccg.a.w, e);
            if (bVar2 != null) {
                com.mbridge.msdk.foundation.error.b bVar4 = this.f1639a;
                if (bVar4 == null) {
                    a(bVar2, new com.mbridge.msdk.foundation.error.b(-1, "SmartLoadReceiver action exception"));
                } else {
                    a(bVar2, bVar4);
                }
            }
        }
    }

    private static void a(com.mbridge.msdk.newreward.adapter.req.b bVar, com.mbridge.msdk.newreward.function.cache.b bVar2) {
        if (bVar != null) {
            try {
                bVar.reqSuccessful(bVar2.e());
            } catch (Exception e) {
                o0.b("SmartLoadReceiver", "handlerCandidateSuccess", e);
            }
        }
    }

    private static void a(com.mbridge.msdk.newreward.adapter.req.b bVar, com.mbridge.msdk.foundation.error.b bVar2) {
        if (bVar != null) {
            try {
                bVar.reqFailed(bVar2);
            } catch (Exception e) {
                o0.b("SmartLoadReceiver", "handlerCandidateFailed", e);
            }
        }
    }
}
