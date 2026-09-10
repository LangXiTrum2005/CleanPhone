package com.thinkup.core.basead.o;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.thinkup.core.basead.adx.api.TUAdxAPI;
import com.thinkup.core.basead.adx.api.TUAdxAdapterConfig;
import com.thinkup.core.basead.adx.api.TUAdxAdapterConfigListener;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.on.n00;
import com.thinkup.core.oo.mo;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class o0 {
    private static volatile o0 m = null;
    private static String o = "tpn_thinkup_adx_context";

    public static o0 o() {
        if (m == null) {
            synchronized (o0n.class) {
                try {
                    if (m == null) {
                        m = new o0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return m;
    }

    public final void o(Context context, String str, Map<String, Object> map, final TUAdxAdapterConfigListener tUAdxAdapterConfigListener) {
        if (context == null) {
            if (tUAdxAdapterConfigListener != null) {
                tUAdxAdapterConfigListener.onLoadFailed("context = null");
                return;
            }
            return;
        }
        String strO00 = o0n.m().o00();
        String strO0o = o0n.m().o0o();
        if (o0n.m().on() != null && !TextUtils.isEmpty(strO00) && !TextUtils.isEmpty(strO0o)) {
            if (TextUtils.isEmpty(str)) {
                if (tUAdxAdapterConfigListener != null) {
                    tUAdxAdapterConfigListener.onLoadFailed("placementId is empty");
                    return;
                }
                return;
            } else {
                if (map == null) {
                    if (tUAdxAdapterConfigListener != null) {
                        tUAdxAdapterConfigListener.onLoadFailed("requestMap = null");
                        return;
                    }
                    return;
                }
                Object obj = map.get(TUAdxAPI.KEY_A_WF_INFO);
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) obj;
                    Objects.toString(jSONObject);
                    mo.o(context).o(new n00(strO00, strO0o, str, o0n.m().o0(str), jSONObject), new mo.o() { // from class: com.thinkup.core.basead.o.o0.1
                        @Override // com.thinkup.core.oo.mo.o
                        public final void o(JSONObject jSONObject2) {
                            TUAdxAdapterConfigListener tUAdxAdapterConfigListener2 = tUAdxAdapterConfigListener;
                            if (tUAdxAdapterConfigListener2 != null) {
                                tUAdxAdapterConfigListener2.onLoadSuccess(TUAdxAdapterConfig.parse(jSONObject2));
                            }
                        }

                        @Override // com.thinkup.core.oo.mo.o
                        public final void o(String str2) {
                            TUAdxAdapterConfigListener tUAdxAdapterConfigListener2 = tUAdxAdapterConfigListener;
                            if (tUAdxAdapterConfigListener2 != null) {
                                tUAdxAdapterConfigListener2.onLoadFailed(str2);
                            }
                        }
                    });
                    return;
                } else {
                    if (tUAdxAdapterConfigListener != null) {
                        tUAdxAdapterConfigListener.onLoadFailed("waterfall info = null");
                        return;
                    }
                    return;
                }
            }
        }
        Log.e(o, "SDK init error!");
        if (tUAdxAdapterConfigListener != null) {
            tUAdxAdapterConfigListener.onLoadFailed("SDK init error!");
        }
    }
}
