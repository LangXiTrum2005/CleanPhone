package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2003mw extends BY {
    public final /* synthetic */ C2002mv A00;
    public final /* synthetic */ Map A01;
    public final /* synthetic */ Map A02;

    public C2003mw(C2002mv c2002mv, Map map, Map map2) {
        this.A00 = c2002mv;
        this.A02 = map;
        this.A01 = map2;
    }

    @Override // com.facebook.ads.redexgen.core.BY
    public final void A05() {
        if (!TextUtils.isEmpty(this.A00.A01.A7E())) {
            HashMap map = new HashMap();
            Map<String, String> extraData = this.A02;
            map.putAll(extraData);
            Map<String, String> extraData2 = this.A01;
            map.putAll(extraData2);
            this.A00.A0A.A0A().ABO(this.A00.A01.A7E(), map);
        }
    }
}
