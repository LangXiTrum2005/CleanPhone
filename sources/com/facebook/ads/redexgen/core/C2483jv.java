package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2483jv extends AbstractRunnableC1787Wc {
    public final /* synthetic */ C2482ju A00;
    public final /* synthetic */ Map A01;
    public final /* synthetic */ Map A02;

    public C2483jv(C2482ju c2482ju, Map map, Map map2) {
        this.A00 = c2482ju;
        this.A02 = map;
        this.A01 = map2;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1787Wc
    public final void A07() {
        if (!TextUtils.isEmpty(this.A00.A01.A7O())) {
            HashMap map = new HashMap();
            Map<String, String> extraData = this.A02;
            map.putAll(extraData);
            Map<String, String> extraData2 = this.A01;
            map.putAll(extraData2);
            this.A00.A0A.A0A().AC3(this.A00.A01.A7O(), map);
        }
    }
}
