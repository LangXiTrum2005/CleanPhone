package com.ironsource;

import java.util.Date;

/* JADX INFO: renamed from: com.ironsource.g5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0350g5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f28737a = new Date().getTime();

    public static long a(C0350g5 c0350g5) {
        if (c0350g5 == null) {
            return 0L;
        }
        return new Date().getTime() - c0350g5.f28737a;
    }
}
