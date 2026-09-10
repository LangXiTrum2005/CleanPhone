package com.mbridge.msdk.newreward.function.command.receiver.concretereceiver;

import android.text.TextUtils;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class a implements com.mbridge.msdk.newreward.function.command.receiver.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.candidate.a f1628a;

    public Object a(Object obj) {
        if (obj == null) {
            return null;
        }
        Map map = (Map) obj;
        com.mbridge.msdk.foundation.error.b bVar = map.get("reason") != null ? (com.mbridge.msdk.foundation.error.b) map.get("reason") : null;
        com.mbridge.msdk.newreward.adapter.e eVar = map.get("adapter_model") != null ? (com.mbridge.msdk.newreward.adapter.e) map.get("adapter_model") : null;
        com.mbridge.msdk.newreward.function.command.c cVar = map.get("command_manager") != null ? (com.mbridge.msdk.newreward.function.command.c) map.get("command_manager") : null;
        if (eVar != null && cVar != null) {
            int iIntValue = map.get("candidate_type") != null ? ((Integer) map.get("candidate_type")).intValue() : 0;
            if (this.f1628a == null) {
                this.f1628a = new com.mbridge.msdk.newreward.function.candidate.a(eVar.R(), eVar.d() == 287, cVar);
            }
            com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = new com.mbridge.msdk.foundation.same.report.metrics.c();
            cVar2.h(eVar.A());
            if (iIntValue == 0) {
                String strF = eVar.f();
                if (TextUtils.isEmpty(strF)) {
                    return null;
                }
                try {
                    com.mbridge.msdk.newreward.function.cache.b bVarA = this.f1628a.a(cVar2, bVar, eVar, 1);
                    this.f1628a.a(cVar2, strF, bVarA, null, null, eVar, 3);
                    return bVarA;
                } catch (Exception e) {
                    AbstractC3888ke0.q(e, new StringBuilder("load error"), "CandidateReceiver");
                    return null;
                }
            }
            if (iIntValue == 1) {
                String strF2 = eVar.f();
                if (TextUtils.isEmpty(strF2)) {
                    return Boolean.FALSE;
                }
                try {
                    return Boolean.valueOf(this.f1628a.a(strF2));
                } catch (Exception e2) {
                    AbstractC3888ke0.q(e2, new StringBuilder("loadCallBack error"), "CandidateReceiver");
                    return Boolean.FALSE;
                }
            }
            if (iIntValue == 2) {
                String strF3 = eVar.f();
                if (TextUtils.isEmpty(strF3)) {
                    return null;
                }
                try {
                    com.mbridge.msdk.newreward.function.cache.b bVarA2 = this.f1628a.a(cVar2, bVar, eVar, 2);
                    com.mbridge.msdk.newreward.function.candidate.a aVar = this.f1628a;
                    if (aVar != null) {
                        aVar.a(cVar2, strF3, bVarA2, null, null, eVar, 1);
                    }
                    return bVarA2;
                } catch (Exception e3) {
                    AbstractC3888ke0.q(e3, new StringBuilder("loadCallBack error"), "CandidateReceiver");
                    return null;
                }
            }
            if (TextUtils.isEmpty(eVar.f())) {
                return null;
            }
            try {
                return this.f1628a.a(cVar2, bVar, eVar, 2);
            } catch (Exception e4) {
                AbstractC3888ke0.q(e4, new StringBuilder("load error"), "CandidateReceiver");
            }
        }
        return null;
    }
}
