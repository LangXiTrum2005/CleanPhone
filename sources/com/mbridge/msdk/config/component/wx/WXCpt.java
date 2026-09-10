package com.mbridge.msdk.config.component.wx;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.config.component.base.a;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.foundation.tools.m0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class WXCpt extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final String f32491h = "400001";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final String f32492i = "400002";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final String f32493j = "400003";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.mbridge.msdk.config.component.wx.model.a f32494k;

    private void a(Context context, String str, String str2, String str3, String str4) {
        String message;
        int i10 = 0;
        boolean z10 = m0.G() == 1;
        boolean z11 = m0.E(context) == 1;
        if (!z10 || !z11) {
            a(0, "400002", "Wechat environment error.");
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                str = str4;
            }
            Object objD = m0.d(str);
            Class<?> cls = Class.forName("com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram$Req");
            Object objNewInstance = cls.newInstance();
            cls.getField("userName").set(objNewInstance, str2);
            cls.getField("path").set(objNewInstance, str3);
            cls.getField("miniprogramType").set(objNewInstance, cls.getField("MINIPTOGRAM_TYPE_RELEASE").get(null));
            Class.forName("com.tencent.mm.opensdk.openapi.IWXAPI").getMethod("sendReq", Class.forName("com.tencent.mm.opensdk.modelbase.BaseReq")).invoke(objD, objNewInstance);
            message = "";
            i10 = 1;
        } catch (Throwable th2) {
            message = th2.getMessage();
        }
        a(i10, i10 != 0 ? "" : "400003", i10 == 0 ? message : "");
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        super.b(map);
        this.f31828f = "907001";
        Object obj = map.get(c.c("144"));
        if (obj instanceof Map) {
            this.f32494k = new com.mbridge.msdk.config.component.wx.model.a((Map) obj);
            if (e() != null) {
                this.f32494k.a(e().getContext());
            } else {
                this.f32494k.a(com.mbridge.msdk.foundation.controller.c.n().d());
            }
        } else {
            a(0, "400001", "WXInfo is empty");
        }
        a("907003", (HashMap<String, Object>) null);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        com.mbridge.msdk.config.component.wx.model.a aVar = this.f32494k;
        if (aVar != null) {
            a(aVar.b(), this.f32494k.e(), this.f32494k.c(), this.f32494k.d(), this.f32494k.a());
        }
    }

    private void a(int i10, String str, String str2) {
        HashMap map = new HashMap();
        map.put(c.c("500"), String.valueOf(i10));
        if (i10 == 0) {
            map.put(c.c("code"), str);
            map.put(c.c("reason"), str2);
        }
        a(a("907002", (Map<String, Object>) map));
    }
}
