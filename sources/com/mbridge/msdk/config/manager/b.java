package com.mbridge.msdk.config.manager;

import android.content.Context;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static AtomicBoolean f32835a = new AtomicBoolean(false);

    public static void a(Context context, Map<String, Object> map, final com.mbridge.msdk.config.manager.callback.a aVar) {
        try {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            if (com.mbridge.msdk.foundation.controller.c.n().d() == null) {
                com.mbridge.msdk.foundation.controller.c.n().b(context);
            }
            if (!MBDownloadManager.getInstance().isInitialize()) {
                v0.f();
            }
            if (aVar == null) {
                try {
                    Object obj = map.get("callback");
                    if (obj instanceof com.mbridge.msdk.config.manager.callback.a) {
                        aVar = (com.mbridge.msdk.config.manager.callback.a) obj;
                    }
                } catch (Throwable th2) {
                    q0.b("ComponentSDKInitManager", th2.getMessage());
                }
            }
            HashMap map2 = new HashMap();
            map2.put("callback", new com.mbridge.msdk.config.manager.callback.a() { // from class: com.mbridge.msdk.config.manager.c
                @Override // com.mbridge.msdk.config.manager.callback.a
                public final void a(Map map3) {
                    b.a(aVar, jCurrentTimeMillis, map3);
                }
            });
            if (map == null) {
                map = new HashMap<>();
            }
            HashMap map3 = new HashMap(map);
            if (!map3.containsKey(MBridgeConstans.APP_ID)) {
                map3.put(MBridgeConstans.APP_ID, com.mbridge.msdk.config.component.common.util.b.a(context).a(MBridgeConstans.APP_ID, ""));
            }
            if (!map3.containsKey(MBridgeConstans.APP_KEY)) {
                map3.put(MBridgeConstans.APP_KEY, com.mbridge.msdk.config.component.common.util.b.a(context).a(MBridgeConstans.APP_KEY, ""));
            }
            map3.put("sdk_context", map2);
            a.c().a(com.mbridge.msdk.config.component.common.util.c.a(), "c0", map3);
            if (a.c().d()) {
                com.mbridge.msdk.config.component.common.metrics.b.a("m_pipe_sdk_init_start", new HashMap());
            }
        } catch (Throwable th3) {
            q0.b("ComponentSDKInitManager", th3.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.mbridge.msdk.config.manager.callback.a aVar, long j10, Map map) {
        String strValueOf;
        f32835a.compareAndSet(false, true);
        a.c().f32828f.set(2);
        a.c().f32833k.get().a(2);
        if (map != null) {
            Object obj = map.get("init_status");
            int iIntValue = obj instanceof Integer ? ((Integer) obj).intValue() : 1;
            Object obj2 = map.get("reason");
            if (obj2 instanceof String) {
                strValueOf = String.valueOf(obj2);
            } else {
                strValueOf = "";
            }
            if (aVar != null) {
                HashMap map2 = new HashMap();
                map2.put("result", Integer.valueOf(iIntValue));
                map2.put("reason", strValueOf);
                map2.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(System.currentTimeMillis() - j10));
                aVar.a(map2);
            }
            HashMap map3 = new HashMap();
            map3.put("result", Integer.valueOf(iIntValue));
            map3.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(System.currentTimeMillis() - j10));
            com.mbridge.msdk.config.component.common.metrics.b.a("m_pipe_sdk_init_end", map3);
        }
    }
}
