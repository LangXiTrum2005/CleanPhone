package com.thinkup.nativead.o;

import android.content.Context;
import android.text.TextUtils;
import com.thinkup.core.api.TUAdInfo;
import com.thinkup.core.api.TUAdMultipleLoadedListener;
import com.thinkup.core.api.TUAdRequest;
import com.thinkup.core.api.TUAdStatusInfo;
import com.thinkup.core.api.TUShowConfig;
import com.thinkup.core.common.n.n;
import com.thinkup.core.common.om;
import com.thinkup.core.common.on.mmm;
import com.thinkup.core.common.on.n0;
import com.thinkup.core.common.on.ono;
import com.thinkup.core.common.ooo.m0m;
import com.thinkup.core.common.ooo.o0o;
import com.thinkup.nativead.unitgroup.api.CustomNativeAdapter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class o {
    public static final String o = "o";
    private static Map<String, o> oo = new ConcurrentHashMap(3);
    private Context m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f42487n;
    private om o0;

    private o(Context context, String str) {
        this.m = context.getApplicationContext();
        this.f42487n = str;
        this.o0 = om.o(context, str, "0");
    }

    private ono m(Map<String, Object> map) {
        ono onoVar = new ono();
        onoVar.o(map);
        om omVar = this.o0;
        if (omVar != null) {
            onoVar.o(omVar.mo());
        }
        return onoVar;
    }

    public static o o(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        o oVar = oo.get(str);
        if (oVar != null) {
            return oVar;
        }
        synchronized (o.class) {
            if (oVar == null) {
                try {
                    oVar = new o(context, str);
                    oo.put(str, oVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return oVar;
    }

    public final com.thinkup.core.common.on.o o(Map<String, Object> map) {
        ono onoVarM = m(map);
        om omVar = this.o0;
        if (omVar != null) {
            return omVar.m(this.m, false, false, onoVarM);
        }
        return null;
    }

    public final com.thinkup.core.common.on.o o(TUShowConfig tUShowConfig, Map<String, Object> map) {
        String scenarioId;
        String showCustomExt;
        final com.thinkup.core.common.on.o oVarM = this.o0.m(this.m, false, true, m(map));
        if (oVarM == null || oVarM.om() == null || !(oVarM.oo() instanceof CustomNativeAdapter)) {
            return null;
        }
        n0 detail = oVarM.om().getDetail();
        if (tUShowConfig != null) {
            scenarioId = tUShowConfig.getScenarioId();
            showCustomExt = tUShowConfig.getShowCustomExt();
            o0o.o(tUShowConfig.getTUCustomContentResult(), detail);
        } else {
            scenarioId = "";
            showCustomExt = "";
        }
        detail.m0o = scenarioId;
        detail.omm(showCustomExt);
        detail.omo = this.o0.m0();
        oVarM.o(oVarM.n() + 1);
        com.thinkup.core.common.ooo.m.m.o().o(new Runnable() { // from class: com.thinkup.nativead.o.o.1
            @Override // java.lang.Runnable
            public final void run() {
                com.thinkup.core.common.o.o().o(oVarM);
            }
        });
        m0m.o(map, detail);
        m0m.o(this.f42487n, detail);
        return oVarM;
    }

    public final void o(Context context, com.thinkup.core.common.n.o oVar, n nVar, TUAdMultipleLoadedListener tUAdMultipleLoadedListener, Map<String, Object> map, TUAdRequest tUAdRequest) {
        mmm mmmVar = new mmm();
        mmmVar.o(context);
        mmmVar.o(tUAdRequest);
        mmmVar.o0 = nVar;
        mmmVar.om = tUAdMultipleLoadedListener;
        mmmVar.f42198n = 0;
        if (map != null) {
            try {
                mmmVar.on = new HashMap(map);
            } catch (Throwable unused) {
            }
        }
        if (tUAdRequest != null) {
            mmmVar.n0 = tUAdRequest.getTUAdxBidFloorInfo();
        }
        this.o0.m(this.m, "0", this.f42487n, mmmVar, oVar);
    }

    public final List<TUAdInfo> o(Context context) {
        return this.o0.o(context);
    }

    public final TUAdStatusInfo o(Context context, Map<String, Object> map) {
        return this.o0.o(context, map);
    }
}
