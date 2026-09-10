package com.chartboost.sdk.impl;

import android.content.SharedPreferences;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class uf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f15298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f15300c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15301e;
    public int f;
    public int g;

    public uf(SharedPreferences mPrefs) {
        Intrinsics.f(mPrefs, "mPrefs");
        this.f15298a = mPrefs;
        this.f15299b = a();
        this.f15300c = System.currentTimeMillis();
        int iE = e() + 1;
        Integer numValueOf = iE < 0 ? null : Integer.valueOf(iE);
        this.d = numValueOf != null ? numValueOf.intValue() : Integer.MAX_VALUE;
        f();
    }

    public final void a(y type) {
        Intrinsics.f(type, "type");
        if (type.equals(y.b.g)) {
            this.f15301e++;
        } else if (type.equals(y.c.g)) {
            this.f++;
        } else if (type.equals(y.a.g)) {
            this.g++;
        }
    }

    public final int b() {
        return this.d;
    }

    public final long c() {
        return System.currentTimeMillis() - this.f15300c;
    }

    public final String d() {
        return this.f15299b;
    }

    public final int e() {
        return this.f15298a.getInt("session_key", 0);
    }

    public final void f() {
        SharedPreferences.Editor editorPutInt;
        SharedPreferences.Editor editorEdit = this.f15298a.edit();
        if (editorEdit == null || (editorPutInt = editorEdit.putInt("session_key", this.d)) == null) {
            return;
        }
        editorPutInt.apply();
    }

    public final vf g() {
        return new vf(this.f15299b, c(), this.d, b(y.a.g), b(y.c.g), b(y.b.g));
    }

    public final int b(y yVar) {
        if (Intrinsics.a(yVar, y.b.g)) {
            return this.f15301e;
        }
        if (Intrinsics.a(yVar, y.c.g)) {
            return this.f;
        }
        if (Intrinsics.a(yVar, y.a.g)) {
            return this.g;
        }
        return 0;
    }

    public final String a() {
        String string = UUID.randomUUID().toString();
        Intrinsics.e(string, "toString(...)");
        return l2.a(string);
    }
}
