package com.smartdigimkt.u;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class a {
    public static final String k = "a";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static volatile a f38759l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f38760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f38761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f38762c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private JSONObject f38763e;
    private boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private WeakReference<Context> f38764h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private WeakReference<Activity> f38765i;
    private String j;
    private int d = 0;
    private boolean f = false;

    private a() {
    }

    public static a f() {
        if (f38759l == null) {
            synchronized (a.class) {
                try {
                    if (f38759l == null) {
                        f38759l = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f38759l;
    }

    public void a(String str) {
        this.j = str;
    }

    public void b(Context context) {
        this.f38760a = context;
    }

    public String c() {
        return this.j;
    }

    public Context d() {
        return this.f38760a;
    }

    public Context e() {
        WeakReference<Context> weakReference = this.f38764h;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public String g() {
        try {
            Context context = this.f38760a;
            if (context != null) {
                return context.getPackageName();
            }
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public JSONObject h() {
        return this.f38763e;
    }

    public int i() {
        return this.d;
    }

    public void j() {
        if (this.f) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            this.f38763e = jSONObject;
            jSONObject.put("webgl", 0);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public String a() {
        return !TextUtils.isEmpty(this.f38761b) ? this.f38761b : "";
    }

    public void b(String str) {
        this.f38761b = str;
    }

    public void c(String str) {
        this.f38762c = str;
    }

    public String b() {
        if (!TextUtils.isEmpty(this.f38762c)) {
            return this.f38762c;
        }
        return "";
    }

    public void a(Context context) {
        this.f38764h = new WeakReference<>(context);
    }

    public void a(int i2) {
        this.d = i2;
    }

    public void a(JSONObject jSONObject) {
        this.f38763e = jSONObject;
    }
}
