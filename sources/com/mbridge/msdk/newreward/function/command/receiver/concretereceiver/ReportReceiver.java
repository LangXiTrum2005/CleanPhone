package com.mbridge.msdk.newreward.function.command.receiver.concretereceiver;

import android.text.TextUtils;
import com.mbridge.apt_anotation.ReceiverAction;
import com.mbridge.msdk.MBridgeConstans;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@ReceiverAction(id = "ReportReceiver", type = com.mbridge.msdk.newreward.function.command.receiver.b.class)
public class ReportReceiver implements com.mbridge.msdk.newreward.function.command.receiver.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.newreward.adapter.e f1626a;
    private com.mbridge.msdk.newreward.controller.b b;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1627a;

        static {
            int[] iArr = new int[com.mbridge.msdk.newreward.function.command.f.values().length];
            f1627a = iArr;
            try {
                iArr[com.mbridge.msdk.newreward.function.command.f.REPORT_LOAD_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public ReportReceiver() {
    }

    @Override // com.mbridge.msdk.newreward.function.command.receiver.b
    public void a(Object obj) {
        Map<String, String> map;
        com.mbridge.msdk.newreward.adapter.e eVar;
        if (!(obj instanceof com.mbridge.msdk.newreward.function.command.b)) {
            if (obj instanceof Map) {
                try {
                    Map map2 = (Map) obj;
                    if (map2.get("adapter_model") instanceof com.mbridge.msdk.newreward.adapter.e) {
                        this.f1626a = (com.mbridge.msdk.newreward.adapter.e) map2.get("adapter_model");
                    }
                    map = map2.get("metrics_data") instanceof Map ? (Map) map2.get("metrics_data") : null;
                    String str = map2.get("metrics_report_key") instanceof String ? (String) map2.get("metrics_report_key") : "";
                    if (TextUtils.isEmpty(str) || (eVar = this.f1626a) == null) {
                        return;
                    }
                    eVar.B().a(this.f1626a, map, str);
                    return;
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        e.printStackTrace();
                        return;
                    }
                    return;
                }
            }
            return;
        }
        com.mbridge.msdk.newreward.function.command.b bVar = (com.mbridge.msdk.newreward.function.command.b) obj;
        try {
            map = bVar.b() instanceof Map ? (Map) bVar.b() : null;
            com.mbridge.msdk.newreward.adapter.e eVar2 = this.f1626a;
            if (eVar2 == null || eVar2.B() == null) {
                if (this.b != null) {
                    com.mbridge.msdk.newreward.function.model.c cVar = new com.mbridge.msdk.newreward.function.model.c();
                    com.mbridge.msdk.newreward.controller.b bVar2 = this.b;
                    if (map == null) {
                        map = new HashMap<>();
                    }
                    cVar.a(bVar2, map, bVar.a());
                    return;
                }
                return;
            }
            if (a.f1627a[bVar.a().ordinal()] == 1) {
                this.f1626a.B().a(this.f1626a);
                return;
            }
            com.mbridge.msdk.newreward.function.model.c cVarB = this.f1626a.B();
            com.mbridge.msdk.newreward.adapter.e eVar3 = this.f1626a;
            if (map == null) {
                map = new HashMap<>();
            }
            cVarB.a(eVar3, map, bVar.a());
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    public ReportReceiver(Object obj) {
        if (obj instanceof com.mbridge.msdk.newreward.adapter.e) {
            this.f1626a = (com.mbridge.msdk.newreward.adapter.e) obj;
        }
        if (obj instanceof com.mbridge.msdk.newreward.controller.b) {
            this.b = (com.mbridge.msdk.newreward.controller.b) obj;
        }
    }
}
