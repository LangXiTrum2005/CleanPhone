package com.mbridge.msdk.newreward.function.command.concretecommand;

import com.mbridge.msdk.newreward.function.command.e;
import com.mbridge.msdk.newreward.function.command.receiver.concretereceiver.ReportReceiver;

/* JADX INFO: loaded from: classes2.dex */
public class b extends com.mbridge.msdk.newreward.function.command.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.command.receiver.b f1620a;

    public b(Object obj) {
        this.f1620a = new ReportReceiver(obj);
    }

    @Override // com.mbridge.msdk.newreward.function.command.a
    public void a(com.mbridge.msdk.newreward.function.command.b bVar, com.mbridge.msdk.newreward.adapter.req.b bVar2) {
    }

    @Override // com.mbridge.msdk.newreward.function.command.a
    public <T extends e> T a(com.mbridge.msdk.newreward.function.command.b bVar) {
        com.mbridge.msdk.newreward.function.command.receiver.b bVar2;
        if (bVar != null && (bVar2 = this.f1620a) != null) {
            bVar2.a(bVar);
        }
        return null;
    }
}
