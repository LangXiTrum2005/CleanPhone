package com.mbridge.msdk.config.component.animation;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f31810c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f31808a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f31809b = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<e> f31811d = new ArrayList();

    public String a() {
        return this.f31809b;
    }

    public List<e> b() {
        return this.f31811d;
    }

    public void a(String str) {
        if (str == null) {
            str = "";
        }
        this.f31809b = str;
    }

    public void a(boolean z10) {
        this.f31810c = z10;
    }

    public void a(List<e> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.f31811d = list;
    }
}
