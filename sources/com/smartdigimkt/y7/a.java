package com.smartdigimkt.y7;

import android.content.Context;
import android.text.TextUtils;
import com.smartdigimkt.n8.p;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class a extends d {
    public a(Context context) {
        super(context);
    }

    @Override // com.smartdigimkt.y7.d, com.smartdigimkt.y7.h
    public com.smartdigimkt.x7.e a(com.smartdigimkt.x7.c cVar) {
        if (!c(cVar)) {
            return null;
        }
        com.smartdigimkt.x7.e eVarA = super.a(cVar);
        if (eVarA != null && eVarA.g()) {
            eVarA.b(699);
        }
        return eVarA;
    }

    @Override // com.smartdigimkt.y7.d
    public boolean c(com.smartdigimkt.x7.c cVar) {
        if (this.f40264a != null && cVar != null) {
            String strC = cVar.c();
            String strB = cVar.b();
            if (("app_strategy".equals(strC) || "placement_strategy".equals(strC) || "get_plugin".equals(strC)) && !TextUtils.isEmpty(strB)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.smartdigimkt.y7.h
    public void a(com.smartdigimkt.x7.e eVar, com.smartdigimkt.x7.c cVar) {
        if (!c(cVar) || eVar == null) {
            return;
        }
        int iB = eVar.b();
        String strF = eVar.f();
        long jE = eVar.e();
        if (iB != 699 || jE <= 0) {
            return;
        }
        synchronized (this.f40266c) {
            a(strF, jE);
        }
    }

    public void a(String str, long j) {
        Map<String, Long> map = this.f40265b;
        if (map != null) {
            map.put(str, Long.valueOf(j));
        }
        p.b(this.f40264a, "sdm_app_pl_cl_retry", str, j);
    }
}
