package com.mbridge.msdk.newreward.function.command.receiver.tagreceiver;

import android.text.TextUtils;
import com.mbridge.apt_anotation.ReceiverAction;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.newreward.function.command.receiver.b;
import com.mbridge.msdk.newreward.function.common.MBridgeSharedPreferenceModel;
import com.mbridge.msdk.newreward.function.utils.c;
import java.io.File;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@ReceiverAction(id = "SharePreReceiver", type = b.class)
public class SharePreReceiver implements b {
    @Override // com.mbridge.msdk.newreward.function.command.receiver.b
    public void a(Object obj) throws Throwable {
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if ((map.get("resource_type") instanceof Integer) && 2 == ((Integer) map.get("resource_type")).intValue()) {
                String str = map.get("metrics_config_path") instanceof String ? (String) map.get("metrics_config_path") : "";
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                a(str);
            }
        }
    }

    private void a(String str) throws Throwable {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String strA = c.a(new File(str));
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            MBridgeSharedPreferenceModel.getInstance().putString(MBridgeConstans.SP_DYNAMIC_METRICS_REPORT, strA);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }
}
