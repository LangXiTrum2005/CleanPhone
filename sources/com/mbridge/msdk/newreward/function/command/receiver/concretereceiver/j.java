package com.mbridge.msdk.newreward.function.command.receiver.concretereceiver;

import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.newreward.function.common.MBridgeTaskManager;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class j implements com.mbridge.msdk.newreward.function.command.receiver.a {

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.newreward.function.command.b f1640a;

        public a(com.mbridge.msdk.newreward.function.command.b bVar) {
            this.f1640a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.mbridge.msdk.video.bt.module.orglistener.f.a(com.mbridge.msdk.foundation.controller.c.n().d(), (String) ((Map) this.f1640a.b()).get("mb_ad_unit_id"));
                m0.a();
                m0.a(com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_RES));
                m0.a(com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_HTML));
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.function.command.receiver.a
    public void a(com.mbridge.msdk.newreward.function.command.b bVar, com.mbridge.msdk.newreward.adapter.req.b bVar2) {
        MBridgeTaskManager.commonExecute(new a(bVar));
    }
}
