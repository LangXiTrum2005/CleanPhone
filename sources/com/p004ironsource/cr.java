package com.p004ironsource;

import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class cr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<String> f24565a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<String> f24566b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList<String> f24567c = new ArrayList<>();
    private final ArrayList<String> d = new ArrayList<>();

    public ArrayList<String> a() {
        return this.f24567c;
    }

    public ArrayList<String> b() {
        return this.f24566b;
    }

    public ArrayList<String> c() {
        return this.d;
    }

    public ArrayList<String> d() {
        return this.f24565a;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f24567c.add(str);
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f24566b.add(str);
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
        this.f24565a.add(str);
    }
}
