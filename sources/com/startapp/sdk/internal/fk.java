package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import java.net.URL;

/* JADX INFO: loaded from: classes6.dex */
public final class fk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f40983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final URL f40984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f40985c;
    public final gj d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final hj f40986e;

    public fk(Context context, URL url, String str, gj gjVar, hj hjVar) {
        this.f40983a = context;
        this.f40984b = url;
        this.f40985c = str;
        this.d = gjVar;
        this.f40986e = hjVar;
    }

    public final void a() {
        String strA;
        try {
            strA = AdsCommonMetaData.k().F().q() ? qe.f41406a.a(this.f40983a, this.f40984b, this.f40985c, this.f40986e) : gk.a(this.f40983a, this.f40984b, this.f40985c);
        } catch (Exception unused) {
            strA = null;
        }
        new Handler(Looper.getMainLooper()).post(new dk(this, strA));
    }
}
