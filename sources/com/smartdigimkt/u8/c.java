package com.smartdigimkt.u8;

import android.os.Bundle;
import com.smartdigimkt.n8.s;
import com.smartdigimkt.sdk.api.SDMAdRequest;
import com.smartdigimkt.sdk.core.bridge.entity.LoadInfoEntity;
import com.thinkup.core.common.n.mo;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class c extends com.smartdigimkt.s8.c {
    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    @Override // com.smartdigimkt.s8.c
    public boolean b(com.smartdigimkt.s8.b bVar) {
        LoadInfoEntity loadInfoEntity;
        com.smartdigimkt.l8.f fVarC;
        SDMAdRequest sDMAdRequestC = bVar.c();
        Map<String, Object> extraMap = sDMAdRequestC != null ? sDMAdRequestC.getExtraMap() : null;
        if (extraMap == null || extraMap.isEmpty()) {
            loadInfoEntity = null;
        } else {
            Object obj = extraMap.get("sdm_load_data");
            if (obj instanceof Bundle) {
                loadInfoEntity = (LoadInfoEntity) com.smartdigimkt.n6.b.a((Bundle) obj, LoadInfoEntity.class);
            } else {
                loadInfoEntity = null;
            }
        }
        if (loadInfoEntity == null) {
            return true;
        }
        if (!loadInfoEntity.isValid()) {
            bVar.a(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.f39190i, "It's request from mediation sdk, the loadInfoEntity is not valid, fail message:" + loadInfoEntity.getValidCheckMessage() + mo.ono));
            return false;
        }
        bVar.n();
        com.smartdigimkt.v6.a aVarConvertToBaseAdRequestInfo = loadInfoEntity.getRequestInfoEntity() != null ? loadInfoEntity.getRequestInfoEntity().convertToBaseAdRequestInfo() : null;
        if (aVarConvertToBaseAdRequestInfo == null) {
            bVar.a(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.f39190i, "It's request from mediation sdk, the baseAdRequestInfo is not valid."));
            return false;
        }
        com.smartdigimkt.y6.b bVarConverToBiddingResult = loadInfoEntity.getBiddingResultInfoEntity() != null ? loadInfoEntity.getBiddingResultInfoEntity().converToBiddingResult() : null;
        if (bVarConverToBiddingResult == null) {
            bVar.a(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.f39190i, "It's request from mediation sdk, the biddingResult is not valid."));
            return false;
        }
        com.smartdigimkt.l8.e eVarA = com.smartdigimkt.k8.c.a().a(bVar.n());
        if (eVarA == null || eVarA.W()) {
            Object obj2 = extraMap.get("sdm_placement_strategy_obj");
            if (obj2 instanceof JSONObject) {
                eVarA = com.smartdigimkt.l8.e.b(bVar.n(), (JSONObject) obj2);
            }
        }
        if (eVarA == null) {
            bVar.a(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.f39190i, "It's request from mediation sdk, the placeStrategy is not valid."));
            return false;
        }
        com.smartdigimkt.k8.c.a().a(bVar.n(), eVarA, null, 0);
        int i2 = aVarConvertToBaseAdRequestInfo.j;
        if (i2 != 35) {
            fVarC = i2 != 67 ? eVarA.j() : eVarA.a(aVarConvertToBaseAdRequestInfo.f39166e);
        } else {
            fVarC = eVarA.c(aVarConvertToBaseAdRequestInfo.f39166e);
        }
        if (fVarC == null) {
            bVar.a(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.f39190i, "It's request from mediation sdk, the unitGroupInfo is not valid."));
            return false;
        }
        fVarC.a(bVarConverToBiddingResult);
        fVarC.a(bVarConverToBiddingResult, 0, bVarConverToBiddingResult.i() ? 1 : 0);
        bVar.c(true);
        bVar.a(aVarConvertToBaseAdRequestInfo.f);
        bVar.a(eVarA);
        bVar.a(fVarC);
        bVar.a(aVarConvertToBaseAdRequestInfo);
        bVar.a(bVarConverToBiddingResult);
        bVar.a(s.a(bVar));
        return true;
    }
}
