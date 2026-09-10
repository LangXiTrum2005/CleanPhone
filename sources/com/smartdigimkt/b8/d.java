package com.smartdigimkt.b8;

import com.smartdigimkt.sdk.api.AdError;
import com.smartdigimkt.sdk.api.SDMAdRequest;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class d extends a {
    public static final String t = "custom";

    public d(com.smartdigimkt.c8.c cVar) {
        super(cVar);
    }

    @Override // com.smartdigimkt.b8.a
    public Object a(Map<String, List<String>> map, Object obj) {
        com.smartdigimkt.i7.d.a("app", (String) null, this.j, System.currentTimeMillis(), (SDMAdRequest) null);
        return obj;
    }

    @Override // com.smartdigimkt.b8.a
    public boolean h() {
        return true;
    }

    @Override // com.smartdigimkt.b8.a
    public void a(String str, AdError adError) {
        com.smartdigimkt.i7.d.a("app", adError.getCode(), adError.getMessage(), this.f33979e.m(), "", "", "");
    }
}
