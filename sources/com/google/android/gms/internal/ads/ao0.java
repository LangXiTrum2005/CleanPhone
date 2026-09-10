package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ao0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f12473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f12474e;

    public ao0(String str, String str2, int i10, long j10, Integer num) {
        this.f12470a = str;
        this.f12471b = str2;
        this.f12472c = i10;
        this.f12473d = j10;
        this.f12474e = num;
    }

    public final String toString() {
        Integer num;
        int i10 = this.f12472c;
        long j10 = this.f12473d;
        String str = this.f12470a;
        StringBuilder sb2 = new StringBuilder(com.applovin.impl.ca.h(String.valueOf(str).length(), 1, String.valueOf(i10).length(), 1, String.valueOf(j10).length()));
        sb2.append(str);
        sb2.append(".");
        sb2.append(i10);
        sb2.append(".");
        sb2.append(j10);
        String string = sb2.toString();
        String str2 = this.f12471b;
        if (!TextUtils.isEmpty(str2)) {
            string = q4.a.j(new StringBuilder(string.length() + 1 + String.valueOf(str2).length()), string, ".", str2);
        }
        if (!((Boolean) zzba.zzc().a(am.f12339s2)).booleanValue() || (num = this.f12474e) == null || TextUtils.isEmpty(str2)) {
            return string;
        }
        StringBuilder sb3 = new StringBuilder(string.length() + 1 + num.toString().length());
        sb3.append(string);
        sb3.append(".");
        sb3.append(num);
        return sb3.toString();
    }
}
