package com.mbridge.msdk.config.dynamic.utils;

import com.mbridge.msdk.config.dynamic.baseview.cusview.XMLView;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class f {
    public static void a(XMLView xMLView, Object obj, Map<String, Object> map) {
        HashMap<String, Object> mapA;
        if (xMLView == null || xMLView.getXmlViewActionListener() == null) {
            return;
        }
        com.mbridge.msdk.config.dynamic.baseview.touch.a touchEventData = xMLView.getTouchEventData();
        HashMap map2 = new HashMap();
        if (touchEventData != null && (mapA = touchEventData.a()) != null) {
            com.mbridge.msdk.config.dynamic.baseview.touch.a.C0109a c0109aB = touchEventData.b();
            if (c0109aB != null) {
                mapA.put("click_x", String.valueOf(c0109aB.f32660b));
                mapA.put("click_y", String.valueOf(c0109aB.f32661c));
            }
            mapA.put("click_time", String.valueOf(System.currentTimeMillis()));
            map2.putAll(mapA);
        }
        if (map != null) {
            map2.putAll(map);
        }
        xMLView.getXmlViewActionListener().a(String.valueOf(obj), map2);
    }
}
