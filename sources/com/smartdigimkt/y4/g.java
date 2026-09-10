package com.smartdigimkt.y4;

import android.app.Activity;
import android.content.Context;
import com.smartdigimkt.v3.i;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class g extends c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f40227p = "g";

    public g(Context context, c.g gVar, com.smartdigimkt.v6.a aVar, com.smartdigimkt.l8.f fVar) {
        super(context, gVar, aVar, fVar);
    }

    public void a(Activity activity) {
        String str;
        try {
            String strA = a(this.f);
            Map<String, Object> mapE = e();
            if (mapE == null) {
                mapE = new HashMap<>(2);
            }
            Map<String, Object> map = mapE;
            if (this.d != null) {
                str = this.d.f + this.d.f39166e;
            } else {
                str = "";
            }
            this.k.a(activity, map, strA, com.smartdigimkt.n8.h.a(map, "extra_scenario", ""), str);
        } catch (Exception e2) {
            e2.printStackTrace();
            com.smartdigimkt.f5.a aVar = this.g;
            if (aVar != null) {
                aVar.onShowFailed(i.a("-9999", e2.getMessage()));
            }
        }
    }

    @Override // com.smartdigimkt.y4.c
    public void c() {
        super.c();
        this.g = null;
    }
}
