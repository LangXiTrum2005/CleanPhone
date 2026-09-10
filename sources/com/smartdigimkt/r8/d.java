package com.smartdigimkt.r8;

import com.smartdigimkt.sdk.api.format.SDMLossInfo;
import com.smartdigimkt.sdk.api.format.SDMWinInfo;

/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.smartdigimkt.y4.c f38143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f38144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SDMWinInfo f38145c;
    private SDMLossInfo d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f38146e;
    private String f;
    private String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f38147h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f38148i;
    private String j;

    public d(com.smartdigimkt.y4.c cVar, boolean z2) {
        this.f38143a = cVar;
        this.f38144b = z2;
    }

    public void a(SDMWinInfo sDMWinInfo) {
        this.f38145c = sDMWinInfo;
    }

    public String b() {
        return this.j;
    }

    public String c() {
        return this.f;
    }

    public void d(String str) {
        this.f38147h = str;
    }

    public SDMLossInfo e() {
        return this.d;
    }

    public SDMWinInfo f() {
        return this.f38145c;
    }

    public String g() {
        return this.f38147h;
    }

    public String h() {
        return this.g;
    }

    public String i() {
        return this.f38146e;
    }

    public boolean j() {
        return this.f38144b;
    }

    public void a(SDMLossInfo sDMLossInfo) {
        this.d = sDMLossInfo;
    }

    public void b(String str) {
        this.j = str;
    }

    public void c(String str) {
        this.f = str;
    }

    public com.smartdigimkt.y4.c d() {
        return this.f38143a;
    }

    public void e(String str) {
        this.g = str;
    }

    public void f(String str) {
        this.f38146e = str;
    }

    public String a() {
        return this.f38148i;
    }

    public void a(String str) {
        this.f38148i = str;
    }
}
