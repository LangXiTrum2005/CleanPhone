package com.thinkup.core.o;

import com.thinkup.core.api.TUAdConst;
import com.thinkup.core.api.TUSDKGlobalSetting;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.on.o0mm;
import com.thinkup.core.common.on.oom;
import com.thinkup.core.common.ooo.n0;
import com.thinkup.core.common.ooo.nn;
import com.thinkup.core.o.o.m0;
import com.thinkup.core.o.o.om;
import com.thinkup.core.o.o.on;
import com.thinkup.core.o.o.oo;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class m {
    public static final String m = "pdf";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f42422n = "zlilbqdph";
    public static final String o = "lphl";
    public static final String o0 = "lpvl";

    public static void o(Map<String, Object> map, o0mm o0mmVar, oom oomVar, JSONObject jSONObject) {
        try {
            map.put("sdm_placement_strategy_obj", jSONObject);
            o0n o0nVarM = o0n.m();
            om omVar = new om();
            m0 m0Var = new m0(oomVar);
            on onVar = new on();
            com.thinkup.core.o.o.n nVar = new com.thinkup.core.o.o.n();
            if (o0mmVar != null && o0mmVar.n0n() != null) {
                nVar = o0mmVar.n0n().omm();
            }
            omVar.o(m0Var);
            omVar.o(onVar);
            omVar.o(nVar);
            map.put("sdm_load_data", n.o(omVar));
            oo ooVar = new oo();
            ooVar.o0(n0.m0());
            ooVar.m(n0.m0o());
            map.put("sdm_device_data", n.o(ooVar));
            com.thinkup.core.o.o.o oVar = new com.thinkup.core.o.o.o();
            oVar.o();
            oVar.o(nn.o());
            oVar.m(o0n.m().o00());
            oVar.n(o0n.m().o0o());
            map.put("sdm_app_data", n.o(oVar));
            Object objMn0 = o0nVarM.mn0();
            if (objMn0 != null) {
                map.put(TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_USER_DEVICE_INFO, objMn0);
            }
            String[] strArrOm = o0nVarM.om();
            if (strArrOm != null && strArrOm.length > 0) {
                map.put(TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_DENNY_DEVICE_INFO, strArrOm);
            }
            map.put(TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_APP_ID, o0nVarM.o00());
            map.put(TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_APP_KEY, o0nVarM.o0o());
            map.put(TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_PLACEMENT_ID, oomVar.o);
            map.put(TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_SYSTEM_DEV_FRAMEWORK_TYPE, n0.mn());
            Object objOo0 = o0nVarM.oo0();
            if (objOo0 != null) {
                map.put(TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_LOCATION, objOo0);
            }
            map.put(TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_WX_INSTALL_STATUS, Boolean.valueOf(o0nVarM.o0n()));
            map.put(TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_DELAY_INSPECT_TIME, Long.valueOf(TUSDKGlobalSetting.mDelayInspectTime));
            map.put(TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_INSPECT_INTERVAL, Long.valueOf(TUSDKGlobalSetting.mInspectInterval));
            map.put(TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_ENABLE_GET_RUNNING_APP_PROCESSES, Boolean.valueOf(!TUSDKGlobalSetting.isDenyApi_getRunningAppProcesses()));
            map.put(TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_ENABLE_GET_DEVICE_INFO_IN_BG, Boolean.valueOf(TUSDKGlobalSetting.enableGetDeviceInfoInBg));
            map.put(TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_EXCLUDE_PKG_LIST, o0n.m().mn());
        } catch (Throwable unused) {
        }
    }
}
