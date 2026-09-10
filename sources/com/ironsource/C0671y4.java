package com.ironsource;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.y4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0671y4 implements B4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f31098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences.Editor f31099b;

    public C0671y4(Context context, String fileName) {
        kotlin.jvm.internal.n.f(context, "context");
        kotlin.jvm.internal.n.f(fileName, "fileName");
        SharedPreferences sharedPreferences = context.getSharedPreferences(fileName, 0);
        this.f31098a = sharedPreferences;
        this.f31099b = sharedPreferences.edit();
    }

    @Override // com.ironsource.B4
    public String a(String key, String str) {
        kotlin.jvm.internal.n.f(key, "key");
        try {
            return this.f31098a.getString(key, str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ironsource.B4
    public Map<String, ?> allData() {
        Map<String, ?> all = this.f31098a.getAll();
        kotlin.jvm.internal.n.e(all, "sharedPreferences.all");
        return all;
    }

    @Override // com.ironsource.B4
    public void b(String key, String value) {
        kotlin.jvm.internal.n.f(key, "key");
        kotlin.jvm.internal.n.f(value, "value");
        this.f31099b.putString(key, value).apply();
    }

    @Override // com.ironsource.B4
    public void a(String key) {
        kotlin.jvm.internal.n.f(key, "key");
        this.f31099b.remove(key).apply();
    }
}
