package com.thinkup.core.debugger;

import android.content.Context;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.TUSDK;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.n0.m;
import com.thinkup.core.common.n0.o0m;
import com.thinkup.core.common.n0.o0o;
import com.thinkup.core.common.n0.oo;
import com.thinkup.core.common.on.nnn;
import com.thinkup.core.common.on.oo0;
import com.thinkup.core.debugger.api.DebuggerAdSourceInfo;
import com.thinkup.core.debugger.api.DebuggerDeviceInfo;
import com.thinkup.core.debugger.api.DebuggerPlacementInfo;
import com.thinkup.core.debugger.api.DebuggerSdkInfo;
import com.thinkup.core.debugger.api.IDeviceInfoGetter;
import com.thinkup.core.debugger.api.IOnlinePlcCfgGetter;
import com.thinkup.core.debugger.api.ISdkInfoGetter;
import com.thinkup.core.oo.n;
import com.thinkup.core.oo.n0;
import com.thinkup.core.oo.nm;
import com.thinkup.core.oo.nn;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class CoreDebuggerManager {
    private static volatile CoreDebuggerManager m = null;
    public static final String o = "thinkup_debug_place_strategy_obj";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final DebuggerDeviceInfo f42378n = new DebuggerDeviceInfo();
    private final DebuggerSdkInfo o0 = new DebuggerSdkInfo();

    private CoreDebuggerManager() {
    }

    public static CoreDebuggerManager getInstance() {
        if (m == null) {
            synchronized (CoreDebuggerManager.class) {
                try {
                    if (m == null) {
                        m = new CoreDebuggerManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return m;
    }

    public DebuggerSdkInfo getSdkInfo() {
        return this.o0;
    }

    public void reqPlacementConfig(Context context, String str, final IOnlinePlcCfgGetter iOnlinePlcCfgGetter) {
        this.o0.setDebugKey(str);
        oo0 oo0Var = new oo0(this.o0.getAppId(), this.o0.getAppKey());
        oo0Var.o(str);
        new n().o(context, oo0Var, new m() { // from class: com.thinkup.core.debugger.CoreDebuggerManager.1
            @Override // com.thinkup.core.common.n0.o0o
            public final void onLoadError(int i2, String str2, AdError adError) {
                IOnlinePlcCfgGetter iOnlinePlcCfgGetter2 = iOnlinePlcCfgGetter;
                if (iOnlinePlcCfgGetter2 != null) {
                    iOnlinePlcCfgGetter2.onOnlinePlcCfgError(str2);
                }
            }

            @Override // com.thinkup.core.common.n0.o0o
            public final void onLoadFinish(int i2, Object obj) {
                IOnlinePlcCfgGetter iOnlinePlcCfgGetter2 = iOnlinePlcCfgGetter;
                if (iOnlinePlcCfgGetter2 != null) {
                    iOnlinePlcCfgGetter2.onOnlinePlcCfgCallback(DebuggerPlacementInfo.create(obj, null));
                }
            }
        });
    }

    public void reqPlacementGroupInfo(Context context, String str, String str2, final IOnlinePlcCfgGetter iOnlinePlcCfgGetter) {
        new o0m(context, new nnn(this.o0.getAppId(), this.o0.getAppKey(), str, str2)).o(0, (o0o) new m() { // from class: com.thinkup.core.debugger.CoreDebuggerManager.2
            @Override // com.thinkup.core.common.n0.o0o
            public final void onLoadError(int i2, String str3, AdError adError) {
                IOnlinePlcCfgGetter iOnlinePlcCfgGetter2 = iOnlinePlcCfgGetter;
                if (iOnlinePlcCfgGetter2 != null) {
                    iOnlinePlcCfgGetter2.onOnlinePlcCfgError(str3);
                }
            }

            @Override // com.thinkup.core.common.n0.o0o
            public final void onLoadFinish(int i2, Object obj) {
                IOnlinePlcCfgGetter iOnlinePlcCfgGetter2 = iOnlinePlcCfgGetter;
                if (iOnlinePlcCfgGetter2 != null) {
                    iOnlinePlcCfgGetter2.onOnlinePlcCfgCallback(DebuggerPlacementInfo.create(obj));
                }
            }
        });
    }

    public void reqPlacementStrategy(final Context context, final String str, String str2, JSONObject jSONObject, final IOnlinePlcCfgGetter iOnlinePlcCfgGetter) {
        nnn nnnVar = new nnn(this.o0.getAppId(), this.o0.getAppKey(), str, str2);
        nnnVar.o(jSONObject);
        new nn().o(context, nnnVar, new m() { // from class: com.thinkup.core.debugger.CoreDebuggerManager.3
            @Override // com.thinkup.core.common.n0.o0o
            public final void onLoadError(int i2, String str3, AdError adError) {
                IOnlinePlcCfgGetter iOnlinePlcCfgGetter2 = iOnlinePlcCfgGetter;
                if (iOnlinePlcCfgGetter2 != null) {
                    iOnlinePlcCfgGetter2.onOnlinePlcCfgError(str3);
                }
            }

            @Override // com.thinkup.core.common.n0.o0o
            public final void onLoadFinish(int i2, Object obj) {
                try {
                    n0 n0VarO = n0.o(str, (JSONObject) obj);
                    if (n0VarO != null) {
                        n0VarO.onon();
                        nm.o(context).o(str, n0VarO, null, 0);
                        if (iOnlinePlcCfgGetter != null) {
                            DebuggerPlacementInfo debuggerPlacementInfoCreate = DebuggerPlacementInfo.create(null, n0VarO);
                            debuggerPlacementInfoCreate.setDebuggerAdSourceInfo(new DebuggerAdSourceInfo.Builder().setNormalUnitGroupListStr(n0VarO.o0n0() != null ? n0VarO.o0n0().toString() : "[]").setAdxUnitGroupListStr(n0VarO.n0n() != null ? n0VarO.n0n().toString() : "[]").setC2sHeadBiddingUnitGroupListStr(n0VarO.o0nn() != null ? n0VarO.o0nn().toString() : "[]").setS2sHeadBiddingUnitGroupListStr(n0VarO.o0nm() != null ? n0VarO.o0nm().toString() : "[]").setAdxOpenUnitGroupListStr(n0VarO.ooom() != null ? n0VarO.ooom().toString() : "[]").setCustomInHouseHeadBiddingUnitGroupListStr(n0VarO.mmo() != null ? n0VarO.mmo().toString() : "[]").setDefaultUnitGroupListStr(n0VarO.mo0() != null ? n0VarO.mo0().toString() : "[]").setDirectlyUnitGroupListStr(n0VarO.oooo() != null ? n0VarO.oooo().toString() : "[]").setC2sDynamicPriceAdSourceListStr(n0VarO.onm0() != null ? n0VarO.onm0().toString() : "[]").setS2sDynamicPriceAdSourceListStr(n0VarO.onmo() != null ? n0VarO.onmo().toString() : "[]").setOnlineUnitGroupListStr(n0VarO.o0no() != null ? n0VarO.o0no().toString() : "[]").setFbInHouseHeadBiddingUnitGroupListStr(n0VarO.n0o() != null ? n0VarO.n0o().toString() : "[]").build());
                            iOnlinePlcCfgGetter.onOnlinePlcCfgCallback(debuggerPlacementInfoCreate);
                        }
                    }
                } catch (Throwable th) {
                    IOnlinePlcCfgGetter iOnlinePlcCfgGetter2 = iOnlinePlcCfgGetter;
                    if (iOnlinePlcCfgGetter2 != null) {
                        iOnlinePlcCfgGetter2.onOnlinePlcCfgError("request debug place strategy error: " + th.getMessage());
                    }
                }
            }
        });
    }

    public void setDeviceInfoGetter(Context context, IDeviceInfoGetter iDeviceInfoGetter) {
        if (iDeviceInfoGetter != null) {
            if (this.f42378n.getDeviceInfoJsonObj() != null) {
                iDeviceInfoGetter.onDeviceInfoCallback(this.f42378n);
                return;
            }
            try {
                JSONObject jSONObjectO = oo.o(-1);
                JSONObject jSONObjectM = oo.m(-1);
                Iterator<String> itKeys = jSONObjectM.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObjectO.put(next, jSONObjectM.opt(next));
                }
                this.f42378n.setDeviceInfoJsonObj(jSONObjectO);
            } catch (Throwable unused) {
            }
            iDeviceInfoGetter.onDeviceInfoCallback(this.f42378n);
        }
    }

    public void setSdkInfoGetter(ISdkInfoGetter iSdkInfoGetter) {
        o0n o0nVarM = o0n.m();
        if (iSdkInfoGetter != null) {
            this.o0.setInitSdk(o0nVarM.n0o());
            this.o0.setAppId(o0nVarM.o00());
            this.o0.setAppKey(o0nVarM.o0o());
            this.o0.setDeniedUploadDeviceInfo(o0nVarM.om());
            this.o0.setHaveLoadAd(o0nVarM.f41918n);
            this.o0.setHavePreInitNetwork(o0nVarM.mmn());
            this.o0.setVersionName(TUSDK.getSDKVersionName());
            iSdkInfoGetter.onSdkInfoCallback(this.o0);
        }
    }
}
