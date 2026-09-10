package com.mbridge.msdk.foundation.cache;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f33373i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f33374j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f33375k = 3;
    public static int l = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f33376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f33377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33378c = 21;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f33379d = f33374j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList<String> f33380e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<String> f33381f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<String> f33382g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<String> f33383h = new ArrayList();

    public void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        this.f33376a = copyOnWriteArrayList;
    }

    public String b() {
        List<String> list = this.f33383h;
        return list == null ? "" : list.toString();
    }

    public CopyOnWriteArrayList<CampaignEx> c() {
        return this.f33376a;
    }

    public String d() {
        List<String> list = this.f33382g;
        return list == null ? "" : list.toString();
    }

    public String e() {
        return this.f33377b;
    }

    public String f() {
        List<String> list = this.f33381f;
        return list == null ? "" : list.toString();
    }

    public int g() {
        return this.f33379d;
    }

    public String a() {
        ArrayList<String> arrayList = this.f33380e;
        return arrayList == null ? "" : arrayList.toString();
    }

    public void c(String str) {
        try {
            List<String> list = this.f33381f;
            if (list != null) {
                list.add(str);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void b(String str) {
        try {
            List<String> list = this.f33382g;
            if (list != null) {
                list.add(str);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void d(String str) {
        this.f33377b = str;
    }

    public void a(String str) {
        try {
            ArrayList<String> arrayList = this.f33380e;
            if (arrayList != null) {
                arrayList.add(str);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(int i10) {
        this.f33379d = i10;
    }
}
