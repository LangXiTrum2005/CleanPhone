package com.mbridge.msdk.config.component.animation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f31800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, Object> f31801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<e> f31802c;

    public e() {
        this.f31800a = "";
        this.f31801b = new HashMap();
        this.f31802c = new ArrayList();
    }

    public void a(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        this.f31801b = map;
    }

    public Map<String, Object> b() {
        return this.f31801b;
    }

    public String c() {
        return this.f31800a;
    }

    public List<e> a() {
        return this.f31802c;
    }

    public void a(List<e> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.f31802c = list;
    }

    public void a(String str, Object obj) {
        if (this.f31801b == null) {
            this.f31801b = new HashMap();
        }
        this.f31801b.put(str, obj);
    }

    public e(String str) {
        this.f31800a = "";
        this.f31801b = new HashMap();
        this.f31802c = new ArrayList();
        this.f31800a = str;
    }
}
