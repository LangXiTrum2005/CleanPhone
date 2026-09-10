package com.mbridge.msdk.dycreator.error;

import d5.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f33267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f33268b;

    public a(b bVar) {
        if (bVar != null) {
            this.f33267a = bVar.g();
            this.f33268b = bVar.h();
        }
    }

    public String toString() {
        return u.g(new StringBuilder("DyError{errorCode="), this.f33267a, '}');
    }

    public a(int i10, String str) {
        this.f33267a = i10;
        this.f33268b = str;
    }
}
