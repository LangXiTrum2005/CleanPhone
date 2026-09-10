package com.mbridge.msdk.click.retry;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f31763k = 0;
    public static int l = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f31765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashSet<String> f31766c = new HashSet<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f31767d = System.currentTimeMillis();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CampaignEx f31768e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f31769f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f31770g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f31771h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f31772i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f31773j;

    public b(String str, String str2) {
        this.f31764a = str;
        a(str2);
    }

    public void a(boolean z10) {
        this.f31771h = z10;
    }

    public void b(boolean z10) {
        this.f31772i = z10;
    }

    public long c() {
        return this.f31767d;
    }

    public int d() {
        return this.f31773j;
    }

    public int e() {
        return this.f31765b;
    }

    public String f() {
        return this.f31769f;
    }

    public String g() {
        return this.f31764a;
    }

    public int h() {
        return this.f31770g;
    }

    public boolean i() {
        return this.f31771h;
    }

    public boolean j() {
        return this.f31772i;
    }

    public void a(int i10) {
        this.f31773j = i10;
    }

    public void b(int i10) {
        this.f31770g = i10;
    }

    public CampaignEx a() {
        return this.f31768e;
    }

    public void b(String str) {
        this.f31769f = str;
    }

    public void a(CampaignEx campaignEx) {
        this.f31768e = campaignEx;
    }

    public HashSet<String> b() {
        return this.f31766c;
    }

    public void a(String str) {
        this.f31765b++;
        this.f31766c.add(str);
    }
}
