package com.mbridge.msdk.config.component.wei.model;

import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.mbridge.msdk.config.component.common.file.b;
import com.mbridge.msdk.config.component.common.util.c;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f32480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f32481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f32482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f32483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f32484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AdSession f32485f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f32486g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f32487h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<Map<String, Object>> f32488i;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(String str) {
        this.f32483d = str;
    }

    public void b(String str) {
        this.f32482c = str;
    }

    public String c() {
        return this.f32487h;
    }

    public void d(String str) {
        this.f32480a = str;
    }

    public void e(String str) {
        this.f32484e = str;
    }

    public String f() {
        return this.f32481b;
    }

    public String g() {
        return this.f32480a;
    }

    public String h() {
        return this.f32484e;
    }

    public boolean i() {
        return this.f32486g;
    }

    public AdSession a() {
        return this.f32485f;
    }

    public String b() {
        return this.f32483d;
    }

    public void c(String str) {
        this.f32481b = str;
    }

    public String d() {
        return this.f32482c;
    }

    public List<Map<String, Object>> e() {
        return this.f32488i;
    }

    public void a(List<Map<String, Object>> list) {
        this.f32488i = list;
    }

    public void a(Map<String, Object> map) {
        b bVarA;
        if (map != null) {
            Object obj = map.get(c.c("116"));
            if (obj != null) {
                String strValueOf = String.valueOf(obj);
                if (strValueOf.contains(".zip") && (bVarA = com.mbridge.msdk.config.component.common.file.a.a(strValueOf, 1, null)) != null && bVarA.e()) {
                    c(com.mbridge.msdk.config.component.common.file.a.a(strValueOf, bVarA.d()));
                }
                if (strValueOf.startsWith("assets://")) {
                    strValueOf = strValueOf.replace("assets://", "file:///android_asset/");
                }
                d(strValueOf);
            }
            Object obj2 = map.get(c.c("125"));
            if (obj2 != null) {
                b(String.valueOf(obj2));
            }
            Object obj3 = map.get(c.c("100"));
            if (obj3 != null) {
                a(String.valueOf(obj3));
            }
            Object obj4 = map.get(c.c("123"));
            if (obj4 != null) {
                e(String.valueOf(obj4));
            }
            Object obj5 = map.get(c.c("127"));
            if (obj5 instanceof List) {
                a((List<Map<String, Object>>) obj5);
            }
        }
    }
}
