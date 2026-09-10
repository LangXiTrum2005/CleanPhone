package com.smartdigimkt.m3;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class n {
    private static volatile n d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f36627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.smartdigimkt.k7.c f36628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.smartdigimkt.k7.f.c f36629c;

    private n() {
        Context contextK = com.smartdigimkt.m6.b.p().k();
        this.f36627a = contextK;
        this.f36628b = new com.smartdigimkt.k7.c(1, contextK, 50);
        this.f36629c = new com.smartdigimkt.k7.f.c(1);
    }

    public static n b() {
        if (d == null) {
            synchronized (l.class) {
                try {
                    if (d == null) {
                        d = new n();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public com.smartdigimkt.k7.c a() {
        return this.f36628b;
    }

    public com.smartdigimkt.k7.f.c c() {
        return this.f36629c;
    }
}
