package com.smartdigimkt.w2;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.smartdigimkt.p0.b;
import com.smartdigimkt.v0.n;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class a extends com.smartdigimkt.p0.a {
    public a(Context context) {
        super(context);
    }

    @Override // com.smartdigimkt.p0.a
    public void a(String str, b bVar) {
        super.a(str, bVar);
        bVar.a("platform", "1");
        bVar.a(com.smartdigimkt.b0.a.h1, Build.VERSION.RELEASE);
        bVar.a("package_name", n.i(this.f37495a));
        bVar.a(com.smartdigimkt.b0.a.j1, n.m(this.f37495a));
        bVar.a("app_version_code", n.l(this.f37495a) + "");
        bVar.a("orientation", n.p(this.f37495a) + "");
        bVar.a("gaid", "");
        bVar.a(com.smartdigimkt.b0.a.s1, com.smartdigimkt.f1.b.f34972a);
        if (com.smartdigimkt.n1.b.b().c(com.smartdigimkt.u.a.f().a()) != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                if (TextUtils.isEmpty(jSONObject.toString())) {
                    return;
                }
                String strC = com.smartdigimkt.r4.a.c(jSONObject.toString());
                if (TextUtils.isEmpty(strC)) {
                    return;
                }
                bVar.a("dvi", strC);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
