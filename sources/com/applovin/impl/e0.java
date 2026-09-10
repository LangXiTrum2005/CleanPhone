package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class e0 extends c0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f7769f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f7770g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f7771h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f7772i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f7773j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f7774k;
    private final a l;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface a {
        void a(Uri uri);
    }

    public e0(String str, com.applovin.impl.sdk.ad.b bVar, List list, boolean z10, String str2, com.applovin.impl.sdk.l lVar, a aVar) {
        super("AsyncTaskCacheResource", lVar);
        this.f7769f = str;
        this.f7770g = bVar;
        this.f7771h = list;
        this.f7772i = z10;
        this.f7773j = str2;
        this.f7774k = lVar;
        this.l = aVar;
    }

    private void a(Uri uri) {
        a aVar;
        if (this.f7615e.get() || (aVar = this.l) == null) {
            return;
        }
        aVar.a(uri);
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean call() {
        if (this.f7615e.get()) {
            return Boolean.FALSE;
        }
        String strA = this.f7774k.I().a(a(), this.f7769f, this.f7770g.getCachePrefix(), this.f7771h, this.f7772i, this.f7774k.I().a(this.f7769f, this.f7770g), this.f7773j, h2.a((AppLovinAdImpl) this.f7770g));
        if (TextUtils.isEmpty(strA)) {
            a((Uri) null);
            return Boolean.FALSE;
        }
        if (this.f7615e.get()) {
            return Boolean.FALSE;
        }
        File fileA = this.f7774k.I().a(strA, a());
        if (fileA == null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f7613c.b(this.f7612b, "Unable to retrieve File for cached filename = " + strA);
            }
            a((Uri) null);
            return Boolean.FALSE;
        }
        if (this.f7615e.get()) {
            return Boolean.FALSE;
        }
        Uri uriFromFile = Uri.fromFile(fileA);
        if (uriFromFile == null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f7613c.b(this.f7612b, "Unable to extract Uri from file");
            }
            a((Uri) null);
            return Boolean.FALSE;
        }
        if (this.f7615e.get()) {
            return Boolean.FALSE;
        }
        a(uriFromFile);
        return Boolean.TRUE;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f7769f.equals(((e0) obj).f7769f);
    }

    public int hashCode() {
        String str = this.f7769f;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
