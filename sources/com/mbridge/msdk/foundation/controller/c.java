package com.mbridge.msdk.foundation.controller;

import android.annotation.SuppressLint;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class c extends a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile c f33426t;

    private c() {
    }

    public static c n() {
        if (f33426t == null) {
            synchronized (c.class) {
                try {
                    if (f33426t == null) {
                        f33426t = new c();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f33426t;
    }

    @Override // com.mbridge.msdk.foundation.controller.a
    public void a(a.e eVar) {
    }
}
