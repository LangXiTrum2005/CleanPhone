package com.p004ironsource;

import android.text.TextUtils;
import java.util.HashSet;

/* JADX INFO: loaded from: classes5.dex */
public class d4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f24613c;
    private String d;
    private int f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashSet<String> f24612b = new HashSet<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f24611a = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f24614e = false;
    private boolean g = true;

    public int a() {
        return this.f;
    }

    public HashSet<String> b() {
        return this.f24612b;
    }

    public String c() {
        return this.d;
    }

    public String d() {
        return this.f24613c;
    }

    public boolean e() {
        return this.f24614e;
    }

    public boolean f() {
        return this.f24611a;
    }

    public boolean g() {
        return this.g;
    }

    public void a(int i2) {
        this.f = i2;
    }

    public void b(String str) {
        this.d = str;
    }

    public void c(String str) {
        this.f24613c = str;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f24612b.add(str);
    }

    public void b(boolean z2) {
        this.g = z2;
    }

    public void c(boolean z2) {
        this.f24614e = z2;
    }

    public void a(boolean z2) {
        this.f24611a = z2;
    }
}
