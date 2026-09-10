package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class hg extends pi1 {
    public final Long S;
    public final Long T;
    public final Long U;
    public final Long V;
    public final Long W;
    public final Long X;
    public final Long Y;
    public final Long Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Long f15275a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Long f15276b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final Long f15277c0;

    public hg(String str) {
        super(19);
        HashMap mapS = pi1.s(str);
        if (mapS != null) {
            this.S = (Long) mapS.get(0);
            this.T = (Long) mapS.get(1);
            this.U = (Long) mapS.get(2);
            this.V = (Long) mapS.get(3);
            this.W = (Long) mapS.get(4);
            this.X = (Long) mapS.get(5);
            this.Y = (Long) mapS.get(6);
            this.Z = (Long) mapS.get(7);
            this.f15275a0 = (Long) mapS.get(8);
            this.f15276b0 = (Long) mapS.get(9);
            this.f15277c0 = (Long) mapS.get(10);
        }
    }

    @Override // com.google.android.gms.internal.ads.pi1
    public final HashMap g() {
        HashMap map = new HashMap();
        map.put(0, this.S);
        map.put(1, this.T);
        map.put(2, this.U);
        map.put(3, this.V);
        map.put(4, this.W);
        map.put(5, this.X);
        map.put(6, this.Y);
        map.put(7, this.Z);
        map.put(8, this.f15275a0);
        map.put(9, this.f15276b0);
        map.put(10, this.f15277c0);
        return map;
    }
}
