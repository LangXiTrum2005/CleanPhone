package com.ironsource;

import java.util.Date;

/* JADX INFO: renamed from: com.ironsource.f5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3507f5 {
    private long a = new Date().getTime();

    public static long a(C3507f5 c3507f5) {
        if (c3507f5 == null) {
            return 0L;
        }
        return new Date().getTime() - c3507f5.a;
    }
}
