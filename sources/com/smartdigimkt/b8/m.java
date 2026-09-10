package com.smartdigimkt.b8;

import com.smartdigimkt.sdk.api.AdError;
import com.smartdigimkt.sdk.api.SDMAdRequest;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class m extends h {
    public m(com.smartdigimkt.c8.l lVar) {
        super(lVar);
    }

    private String k() {
        com.smartdigimkt.c8.d dVar = this.f33979e;
        return dVar instanceof com.smartdigimkt.c8.l ? ((com.smartdigimkt.c8.l) dVar).n() : "";
    }

    @Override // com.smartdigimkt.b8.a
    public Object a(Map<String, List<String>> map, Object obj) {
        try {
            com.smartdigimkt.i7.d.a("placement", k(), this.j, System.currentTimeMillis(), (SDMAdRequest) null);
        } catch (Throwable unused) {
        }
        return obj;
    }

    @Override // com.smartdigimkt.b8.a
    public boolean h() {
        return true;
    }

    @Override // com.smartdigimkt.b8.a
    public void a(String str, AdError adError) {
        String code = adError.getCode();
        String message = adError.getMessage();
        com.smartdigimkt.c8.d dVar = this.f33979e;
        com.smartdigimkt.i7.d.a("placement", code, message, dVar != null ? dVar.m() : "", k(), "", "");
    }
}
