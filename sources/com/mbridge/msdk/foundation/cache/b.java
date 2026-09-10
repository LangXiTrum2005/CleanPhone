package com.mbridge.msdk.foundation.cache;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.k0;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f33363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f33364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f33365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f33366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f33367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f33368f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f33369g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f33370h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f33371i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f33372j;

    public void a(long j10) {
        this.f33372j = j10;
    }

    public double b() {
        return this.f33364b;
    }

    public long c() {
        return this.f33372j;
    }

    public String d() {
        return this.f33365c;
    }

    public String e() {
        return this.f33366d;
    }

    public int f() {
        return this.f33367e;
    }

    public int g() {
        return this.f33369g;
    }

    public long h() {
        return this.f33370h;
    }

    public CopyOnWriteArrayList<CampaignEx> a() {
        return this.f33363a;
    }

    public void b(String str) {
        this.f33365c = str;
    }

    public void c(String str) {
        this.f33366d = str;
    }

    public void d(String str) {
        this.f33371i = str;
    }

    public void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        this.f33363a = copyOnWriteArrayList;
    }

    public void b(int i10) {
        this.f33369g = i10;
    }

    public void c(long j10) {
        this.f33370h = j10;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strA = k0.a(str);
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        try {
            double d10 = Double.parseDouble(strA);
            if (d10 <= 0.0d) {
                return;
            }
            this.f33364b = d10;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void b(long j10) {
        this.f33368f = j10;
    }

    public void a(int i10) {
        this.f33367e = i10;
    }
}
