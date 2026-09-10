package com.smartdigimkt.p6;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f37697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f37698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f37699c;
    private int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f37700e;

    public String a() {
        return TextUtils.isEmpty(this.f37698b) ? "" : this.f37698b;
    }

    public String b() {
        return TextUtils.isEmpty(this.f37700e) ? "" : this.f37700e;
    }

    public String c() {
        return TextUtils.isEmpty(this.f37699c) ? "" : this.f37699c;
    }

    public String d() {
        return TextUtils.isEmpty(this.f37697a) ? "" : this.f37697a;
    }

    public int e() {
        return this.d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AdxOfferTrackingRecordBean{placementId='");
        sb.append(this.f37697a);
        sb.append("', dspId='");
        sb.append(this.f37698b);
        sb.append("', offerId='");
        sb.append(this.f37699c);
        sb.append("', tkType=");
        sb.append(this.d);
        sb.append(", extraInfo='");
        return android.support.v4.media.a.r(sb, this.f37700e, "'}");
    }

    public void a(String str) {
        this.f37698b = str;
    }

    public void b(String str) {
        this.f37700e = str;
    }

    public void c(String str) {
        this.f37699c = str;
    }

    public void d(String str) {
        this.f37697a = str;
    }

    public void a(int i2) {
        this.d = i2;
    }
}
