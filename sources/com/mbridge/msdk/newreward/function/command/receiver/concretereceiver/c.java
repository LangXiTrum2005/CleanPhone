package com.mbridge.msdk.newreward.function.command.receiver.concretereceiver;

import com.mbridge.msdk.foundation.tools.o0;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class c implements com.mbridge.msdk.newreward.function.command.receiver.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.model.b f1629a;

    public Object a(Object obj) {
        if (this.f1629a != null || obj == null) {
            return null;
        }
        try {
            Map map = (Map) obj;
            com.mbridge.msdk.newreward.controller.b bVar = (com.mbridge.msdk.newreward.controller.b) map.get("controller_model");
            com.mbridge.msdk.newreward.function.command.c cVar = (com.mbridge.msdk.newreward.function.command.c) map.get("command_manager");
            com.mbridge.msdk.newreward.adapter.d dVar = (com.mbridge.msdk.newreward.adapter.d) map.get("adapter_manager");
            if (bVar != null && cVar != null && dVar != null) {
                com.mbridge.msdk.newreward.function.model.b bVar2 = new com.mbridge.msdk.newreward.function.model.b(bVar.f(), bVar.b(), bVar.e(), bVar.g());
                this.f1629a = bVar2;
                bVar2.a(cVar, dVar);
                return null;
            }
            return null;
        } catch (Exception e) {
            o0.b("LoadCheckReceiver", com.umeng.ccg.a.w, e);
        }
    }
}
