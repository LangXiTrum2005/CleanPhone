package com.mbridge.msdk.newreward.function.cache;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class b {
    public static int i = 0;
    public static int j = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.core.campaign.b f1612a;
    private String b;
    private int c = 21;
    private int d = i;
    private ArrayList<String> e = new ArrayList<>();
    private List<String> f = new ArrayList();
    private List<String> g = new ArrayList();
    private List<String> h = new ArrayList();

    public void a(com.mbridge.msdk.newreward.function.core.campaign.b bVar) {
        this.f1612a = bVar;
    }

    public String b() {
        List<String> list = this.h;
        return list == null ? "" : list.toString();
    }

    public void c(String str) {
        try {
            List<String> list = this.f;
            if (list != null) {
                list.add(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String d() {
        List<String> list = this.g;
        return list == null ? "" : list.toString();
    }

    public com.mbridge.msdk.newreward.function.core.campaign.b e() {
        return this.f1612a;
    }

    public String f() {
        return this.b;
    }

    public String g() {
        List<String> list = this.f;
        return list == null ? "" : list.toString();
    }

    public int h() {
        return this.d;
    }

    public String a() {
        ArrayList<String> arrayList = this.e;
        return arrayList == null ? "" : arrayList.toString();
    }

    public void b(String str) {
        try {
            List<String> list = this.g;
            if (list != null) {
                list.add(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int c() {
        return this.c;
    }

    public void d(String str) {
        this.b = str;
    }

    public void a(String str) {
        try {
            ArrayList<String> arrayList = this.e;
            if (arrayList != null) {
                arrayList.add(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void a(int i2) {
        this.d = i2;
    }
}
