package com.mbridge.msdk.newreward.function.command.receiver.concretereceiver;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.newreward.function.common.MBridgeDailyPlayModel;
import com.mbridge.msdk.newreward.function.common.MBridgeOffsetManager;
import com.mbridge.msdk.out.MBridgeIds;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class b implements com.mbridge.msdk.newreward.function.command.receiver.b {
    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    @Override // com.mbridge.msdk.newreward.function.command.receiver.b
    public void a(Object obj) {
        byte b;
        try {
            Map map = (Map) obj;
            com.mbridge.msdk.newreward.function.command.e eVar = (com.mbridge.msdk.newreward.function.command.e) map.get("result");
            Map map2 = (Map) map.get("obj_map");
            String str = (String) map.get("type");
            int iHashCode = str.hashCode();
            if (iHashCode != -2057274110) {
                if (iHashCode != -1019779949) {
                    if (iHashCode == 95346201 && str.equals("daily")) {
                        b = 0;
                    } else {
                        b = -1;
                    }
                } else if (str.equals(TypedValues.CycleType.S_WAVE_OFFSET)) {
                    b = 1;
                } else {
                    b = -1;
                }
            } else if (str.equals("bridge_ids")) {
                b = 2;
            } else {
                b = -1;
            }
            if (b == 0) {
                if (a("daily", eVar, map2)) {
                    return;
                }
                MBridgeDailyPlayModel mBridgeDailyPlayModel = new MBridgeDailyPlayModel(((Integer) map.get("mb_ad_type")).intValue(), (String) map.get("mb_ad_pid"), (String) map.get("mb_ad_unit_id"));
                map2.put("daily", mBridgeDailyPlayModel);
                eVar.a(mBridgeDailyPlayModel);
                return;
            }
            if (b == 1) {
                if (a(TypedValues.CycleType.S_WAVE_OFFSET, eVar, map2)) {
                    return;
                }
                MBridgeOffsetManager mBridgeOffsetManager = new MBridgeOffsetManager();
                map2.put(TypedValues.CycleType.S_WAVE_OFFSET, mBridgeOffsetManager);
                eVar.a(mBridgeOffsetManager);
                return;
            }
            if (b == 2 && !a("bridge_ids", eVar, map2)) {
                MBridgeIds mBridgeIds = new MBridgeIds((String) map.get("mb_ad_pid"), (String) map.get("mb_ad_unit_id"));
                map2.put("bridge_ids", mBridgeIds);
                eVar.a(mBridgeIds);
            }
        } catch (Exception e) {
            o0.b("CreateObjectReceiver", com.umeng.ccg.a.w, e);
        }
    }

    private boolean a(String str, com.mbridge.msdk.newreward.function.command.e eVar, Map map) {
        if (map.get(str) == null) {
            return false;
        }
        eVar.a(map.get(str));
        return true;
    }
}
