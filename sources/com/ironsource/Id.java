package com.ironsource;

import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class Id {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<String> f26297a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<String> f26298b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList<String> f26299c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayList<String> f26300d = new ArrayList<>();

    public ArrayList<String> a() {
        return this.f26299c;
    }

    public ArrayList<String> b() {
        return this.f26298b;
    }

    public ArrayList<String> c() {
        return this.f26300d;
    }

    public ArrayList<String> d() {
        return this.f26297a;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f26299c.add(str);
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f26298b.add(str);
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f26300d.add(str);
    }

    public void d(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f26297a.add(str);
    }
}
