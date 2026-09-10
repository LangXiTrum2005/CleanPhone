package com.startapp.sdk.internal;

import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public abstract class kh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f41188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f41189b = new HashMap();

    public static synchronized Object a(int i2, Class cls) {
        try {
        } catch (RuntimeException e2) {
            g9.a(e2);
            return null;
        }
        return cls.cast(f41189b.remove(Integer.valueOf(i2)));
    }
}
