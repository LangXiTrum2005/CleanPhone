package com.umeng.analytics.pro;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class cd implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f2533a;
    public final byte b;
    private final String c;
    private final boolean d;

    public cd(byte b, boolean z) {
        this.b = b;
        this.f2533a = false;
        this.c = null;
        this.d = z;
    }

    public boolean a() {
        return this.f2533a;
    }

    public String b() {
        return this.c;
    }

    public boolean c() {
        return this.b == 12;
    }

    public boolean d() {
        byte b = this.b;
        return b == 15 || b == 13 || b == 14;
    }

    public boolean e() {
        return this.d;
    }

    public cd(byte b) {
        this(b, false);
    }

    public cd(byte b, String str) {
        this.b = b;
        this.f2533a = true;
        this.c = str;
        this.d = false;
    }
}
