package com.mbridge.msdk.config.component.inner;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.config.component.base.a;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class InnerCpt extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f32083h = "InnerCpt";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final String f32084i = "700001";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    com.mbridge.msdk.config.component.inner.model.a f32085j;

    private void a(Context context, String str, String str2, Map<String, Object> map) {
        String message;
        Intent intent;
        boolean z10 = false;
        try {
            message = "";
            if (!TextUtils.isEmpty(str)) {
                Uri uri = Uri.parse(str);
                String scheme = uri.getScheme();
                if (!TextUtils.isEmpty(scheme) && scheme.equals("intent")) {
                    intent = Intent.parseUri(str, 1);
                } else if (TextUtils.isEmpty(scheme) || !scheme.equals("android-app")) {
                    intent = new Intent("android.intent.action.VIEW", uri);
                    intent.setData(uri);
                } else {
                    intent = Intent.parseUri(str, 2);
                }
                if (map != null && !map.isEmpty()) {
                    for (Map.Entry<String, Object> entry : this.f32085j.b().entrySet()) {
                        intent.putExtra(entry.getKey(), String.valueOf(entry.getValue()));
                    }
                }
                if (intent != null) {
                    intent.setComponent(null);
                    intent.setSelector(null);
                    if (!TextUtils.isEmpty(str2)) {
                        intent.setPackage(str2);
                    }
                    if (context instanceof Activity) {
                        context.startActivity(intent);
                    } else {
                        intent.setFlags(268435456);
                        context.startActivity(intent);
                    }
                    z10 = true;
                }
            }
        } catch (Throwable th2) {
            q0.b("InnerCpt", th2.getMessage(), th2);
            message = th2.getMessage();
        }
        a(z10, message);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f31828f = "901001";
        this.f32085j = new com.mbridge.msdk.config.component.inner.model.a(map);
        if (e() != null) {
            this.f32085j.a(e().getContext());
        } else {
            this.f32085j.a(c.n().d());
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        if (this.f32085j.f().equals(com.mbridge.msdk.config.component.common.util.c.c("336"))) {
            String strC = this.f32085j.c();
            if (!TextUtils.isEmpty(strC) && strC.equals(com.mbridge.msdk.config.component.common.util.c.c("339"))) {
                g();
            }
            a("901006", (HashMap<String, Object>) null);
        }
    }

    public void g() {
        com.mbridge.msdk.config.component.inner.model.a aVar = this.f32085j;
        if (aVar != null) {
            a(aVar.a(), this.f32085j.d(), this.f32085j.e(), this.f32085j.b());
        }
    }

    private void a(boolean z10, String str) {
        HashMap map = new HashMap();
        map.put(com.mbridge.msdk.config.component.common.util.c.c("500"), String.valueOf(z10 ? 1 : 0));
        if (!z10) {
            map.put(com.mbridge.msdk.config.component.common.util.c.c("code"), "700001");
            map.put(com.mbridge.msdk.config.component.common.util.c.c("reason"), str);
        }
        a(a("901005", (Map<String, Object>) map));
    }
}
