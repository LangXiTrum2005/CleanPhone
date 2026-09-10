package com.mbridge.msdk.newreward.function.command.receiver.concretereceiver;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.newreward.function.common.MBridgeDailyPlayModel;
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

/* JADX INFO: loaded from: classes2.dex */
public class e implements com.mbridge.msdk.newreward.function.command.receiver.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    com.mbridge.msdk.newreward.adapter.e f1636a;
    com.mbridge.msdk.newreward.function.command.c b;

    private void b() {
        try {
            Map<String, Long> map = com.mbridge.msdk.foundation.same.buffer.b.l;
            if (map == null || map.size() <= 0) {
                return;
            }
            com.mbridge.msdk.foundation.same.buffer.b.l.clear();
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    private int c() {
        com.mbridge.msdk.newreward.function.model.f fVarO;
        com.mbridge.msdk.videocommon.setting.c cVarC;
        Queue<Integer> queueZ;
        Integer numPoll;
        com.mbridge.msdk.newreward.adapter.e eVar = this.f1636a;
        if (eVar == null || (fVarO = eVar.O()) == null || (cVarC = fVarO.c()) == null || (queueZ = cVarC.z()) == null || queueZ.size() == 0 || (numPoll = queueZ.poll()) == null) {
            return 25000;
        }
        return numPoll.intValue() * 1000;
    }

    @Override // com.mbridge.msdk.newreward.function.command.receiver.a
    public void a(com.mbridge.msdk.newreward.function.command.b bVar, com.mbridge.msdk.newreward.adapter.req.b bVar2) {
        try {
            Map map = (Map) bVar.b();
            this.f1636a = (com.mbridge.msdk.newreward.adapter.e) map.get("adapter_model");
            this.b = (com.mbridge.msdk.newreward.function.command.c) map.get("command_manager");
            b();
            a();
            try {
                a(this.f1636a);
                if (((MBridgeDailyPlayModel) this.b.a(new HashMap(), com.mbridge.msdk.newreward.function.command.f.CREATE_DAILY)).isOverDailyCap()) {
                    bVar2.reqFailed(new com.mbridge.msdk.foundation.error.b(880019));
                } else {
                    this.f1636a.b(c());
                    bVar2.reqSuccessful(null);
                }
            } catch (MBridgeError e) {
                bVar2.reqFailed(new com.mbridge.msdk.foundation.error.b(e.getErrorCode(), e.getErrorMessage()));
            }
        } catch (Exception e2) {
            bVar2.reqFailed(new com.mbridge.msdk.foundation.error.b(880020, e2.getMessage()));
        }
    }

    private void a() {
        try {
            com.mbridge.msdk.foundation.db.i.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).a(this.f1636a.R());
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    public void a(com.mbridge.msdk.newreward.adapter.e eVar) throws MBridgeError {
        if (eVar.b() == 2 && TextUtils.isEmpty(eVar.f())) {
            com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880035, "errorCode: 3507 errorMessage: data load failed, errorMsg is bidToken null");
            throw new MBridgeError(bVarA.b(), bVarA.h());
        }
        if (com.mbridge.msdk.system.a.map != null) {
            return;
        }
        com.mbridge.msdk.foundation.error.b bVarA2 = com.mbridge.msdk.foundation.error.a.a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is not init sdk");
        throw new MBridgeError(bVarA2.b(), bVarA2.h());
    }
}
