package com.ironsource;

import android.text.TextUtils;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class G1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f26124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f26125d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f26127f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashSet<String> f26123b = new HashSet<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f26122a = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f26126e = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f26128g = true;

    public void a(boolean z10) {
        this.f26122a = z10;
    }

    public HashSet<String> b() {
        return this.f26123b;
    }

    public void c(String str) {
        this.f26124c = str;
    }

    public String d() {
        return this.f26124c;
    }

    public boolean e() {
        return this.f26126e;
    }

    public boolean f() {
        return this.f26122a;
    }

    public boolean g() {
        return this.f26128g;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f26123b.add(str);
    }

    public void b(String str) {
        this.f26125d = str;
    }

    public String c() {
        return this.f26125d;
    }

    public void b(boolean z10) {
        this.f26128g = z10;
    }

    public void c(boolean z10) {
        this.f26126e = z10;
    }

    public int a() {
        return this.f26127f;
    }

    public void a(int i10) {
        this.f26127f = i10;
    }
}
