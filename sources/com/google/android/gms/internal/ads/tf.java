package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class tf extends pi1 {
    public final /* synthetic */ int S = 0;
    public Long T;
    public Object U;
    public Object V;

    public /* synthetic */ tf() {
        super(19);
    }

    @Override // com.google.android.gms.internal.ads.pi1
    public final HashMap g() {
        switch (this.S) {
            case 0:
                HashMap map = new HashMap();
                map.put(0, this.T);
                map.put(1, (Long) this.U);
                map.put(2, (Long) this.V);
                return map;
            default:
                HashMap map2 = new HashMap();
                map2.put(0, this.T);
                map2.put(1, (Boolean) this.U);
                map2.put(2, (Boolean) this.V);
                return map2;
        }
    }

    public tf(String str) {
        super(19);
        HashMap mapS = pi1.s(str);
        if (mapS != null) {
            this.T = (Long) mapS.get(0);
            this.U = (Boolean) mapS.get(1);
            this.V = (Boolean) mapS.get(2);
        }
    }
}
