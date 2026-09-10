package com.ironsource;

import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.vd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3795vd {
    private final ArrayList<String> a = new ArrayList<>();
    private final ArrayList<String> b = new ArrayList<>();
    private final ArrayList<String> c = new ArrayList<>();
    private final ArrayList<String> d = new ArrayList<>();

    public ArrayList<String> a() {
        return this.c;
    }

    public ArrayList<String> b() {
        return this.b;
    }

    public ArrayList<String> c() {
        return this.d;
    }

    public ArrayList<String> d() {
        return this.a;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.c.add(str);
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.b.add(str);
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.d.add(str);
    }

    public void d(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.a.add(str);
    }
}
