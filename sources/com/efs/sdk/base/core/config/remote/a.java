package com.efs.sdk.base.core.config.remote;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.efs.sdk.base.IConfigRefreshAction;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.NetworkUtil;
import com.efs.sdk.base.http.HttpResponse;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements IConfigRefreshAction {

    /* JADX INFO: renamed from: com.efs.sdk.base.core.config.remote.a$a, reason: collision with other inner class name */
    public static class C0121a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final a f399a = new a();
    }

    public static a a() {
        return C0121a.f399a;
    }

    @Override // com.efs.sdk.base.IConfigRefreshAction
    @NonNull
    public final String refresh() {
        String str = "";
        if (!NetworkUtil.isConnected(ControllerCenter.getGlobalEnvStruct().mAppContext)) {
            Log.i("efs.config", "Config refresh fail, network is disconnected.");
            return "";
        }
        String strA = b.a().a(true);
        com.efs.sdk.base.core.a.c cVarA = com.efs.sdk.base.core.a.c.a();
        for (int i = 0; i < 3; i++) {
            com.efs.sdk.base.core.a.a aVarA = com.efs.sdk.base.core.a.a.a();
            String strB = cVarA.b();
            if (aVarA.f368a) {
                Log.i("efs.px.api", "get config from server, wpkHeader is ".concat(String.valueOf(strB)));
            }
            String strH = DM.h(strA, "/apm_cc");
            if (aVarA.f368a) {
                Log.i("efs.px.api", "get config from server, url is ".concat(String.valueOf(strH)));
            }
            HashMap map = new HashMap(1);
            map.put("wpk-header", strB);
            com.efs.sdk.base.core.util.a.c cVarA2 = new com.efs.sdk.base.core.util.a.d(strH).a(map).a(com.efs.sdk.base.core.a.b.a()).a();
            cVarA2.f423a.e = "get";
            HttpResponse httpResponseA = cVarA2.a();
            if (httpResponseA.succ) {
                str = httpResponseA.data;
                break;
            }
            if (TextUtils.isEmpty(httpResponseA.getBizCode()) || !"1000".equals(httpResponseA.getBizCode())) {
                return "";
            }
        }
        Log.i("efs.config", "config request succ, config is:\n ".concat(String.valueOf(str)));
        return str;
    }
}
