package com.mbridge.msdk.config.component.wx.model;

import android.content.Context;
import com.mbridge.msdk.config.component.common.util.c;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f32495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f32496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f32497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f32498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f32499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f32500f;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get(c.c("145"));
            if (obj != null) {
                e(String.valueOf(obj));
            }
            Object obj2 = map.get(c.c("147"));
            if (obj2 != null) {
                c(String.valueOf(obj2));
            }
            Object obj3 = map.get(c.c("148"));
            if (obj3 != null) {
                d(String.valueOf(obj3));
            }
            Object obj4 = map.get(c.c("193"));
            if (obj4 != null) {
                a(String.valueOf(obj4));
            }
            Object obj5 = map.get(c.c("146"));
            if (obj5 != null) {
                b(String.valueOf(obj5));
            }
        }
    }

    public Context b() {
        return this.f32495a;
    }

    public String c() {
        return this.f32497c;
    }

    public String d() {
        return this.f32498d;
    }

    public String e() {
        return this.f32496b;
    }

    public void b(String str) {
        this.f32500f = str;
    }

    public void c(String str) {
        this.f32497c = str;
    }

    public void d(String str) {
        this.f32498d = str;
    }

    public void e(String str) {
        this.f32496b = str;
    }

    public void a(Context context) {
        this.f32495a = context;
    }

    public String a() {
        return this.f32499e;
    }

    public void a(String str) {
        this.f32499e = str;
    }
}
