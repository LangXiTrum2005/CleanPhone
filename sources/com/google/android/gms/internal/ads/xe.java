package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class xe extends pi1 {
    public String S;
    public final long T;
    public final String U;
    public final String V;
    public final String W;

    public xe(String str) {
        super(19);
        this.S = "E";
        this.T = -1L;
        this.U = "E";
        this.V = "E";
        this.W = "E";
        HashMap mapS = pi1.s(str);
        if (mapS != null) {
            this.S = mapS.get(0) == null ? "E" : (String) mapS.get(0);
            this.T = mapS.get(1) != null ? ((Long) mapS.get(1)).longValue() : -1L;
            this.U = mapS.get(2) == null ? "E" : (String) mapS.get(2);
            this.V = mapS.get(3) == null ? "E" : (String) mapS.get(3);
            this.W = mapS.get(4) != null ? (String) mapS.get(4) : "E";
        }
    }

    @Override // com.google.android.gms.internal.ads.pi1
    public final HashMap g() {
        HashMap map = new HashMap();
        map.put(0, this.S);
        map.put(4, this.W);
        map.put(3, this.V);
        map.put(2, this.U);
        map.put(1, Long.valueOf(this.T));
        return map;
    }
}
