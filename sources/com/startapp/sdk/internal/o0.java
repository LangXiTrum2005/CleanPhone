package com.startapp.sdk.internal;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public final class o0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f41286c = vi.a(71, 13, -10, 14, -3, -6, -5, -54, 66, -11, 13, -5, -4, 10, 0, -10, 6, -1, -64, 19, 2, 0, 2, 14, 0, 12);
    public static final String d = vi.a(66, 3, 5, -9);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f41287e = vi.a(61, 12, -14, 17, 1, -14);
    public static final String f = vi.a(56, -1, 2, 8, -4, 11, -3, 6, -7, -10);
    public static final String g = vi.a(86, -19, 3, -12, -2, 19, -11, 6, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f41288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f41289b = new AtomicInteger(0);

    public o0(Context context) {
        this.f41288a = context;
    }

    public final String a() {
        Context context = this.f41288a;
        StringBuilder sb = new StringBuilder();
        String str = f41286c;
        sb.append(str);
        sb.append(f41287e);
        String str2 = g;
        sb.append(str2);
        int[] iArrA = vi.a(context, sb.toString(), android.support.v4.media.a.r(android.support.v4.media.a.w(str), d, str2), android.support.v4.media.a.r(android.support.v4.media.a.w(str), f, str2));
        StringBuilder sb2 = new StringBuilder(iArrA.length);
        for (int i2 : iArrA) {
            sb2.append(i2);
        }
        return sb2.toString();
    }
}
