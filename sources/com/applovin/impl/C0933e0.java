package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.io.File;
import java.util.List;

/* JADX INFO: renamed from: com.applovin.impl.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0933e0 extends AbstractCallableC0929c0 {
    private final String f;
    private final com.applovin.impl.sdk.ad.b g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f10755h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f10756i;
    private final String j;
    private final com.applovin.impl.sdk.k k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final a f10757l;

    /* JADX INFO: renamed from: com.applovin.impl.e0$a */
    public interface a {
        void a(Uri uri);
    }

    public C0933e0(String str, com.applovin.impl.sdk.ad.b bVar, String str2, com.applovin.impl.sdk.k kVar, a aVar) {
        this(str, bVar, bVar.S(), true, str2, kVar, aVar);
    }

    private void a(Uri uri) {
        a aVar;
        if (this.f10626e.get() || (aVar = this.f10757l) == null) {
            return;
        }
        aVar.a(uri);
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean call() {
        if (this.f10626e.get()) {
            return Boolean.FALSE;
        }
        String strA = this.k.G().a(a(), this.f, this.g.getCachePrefix(), this.f10755h, this.f10756i, this.k.G().a(this.f, this.g), this.j, f2.a((AppLovinAdImpl) this.g));
        if (TextUtils.isEmpty(strA)) {
            a((Uri) null);
            return Boolean.FALSE;
        }
        if (this.f10626e.get()) {
            return Boolean.FALSE;
        }
        File fileA = this.k.G().a(strA, a());
        if (fileA == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f10625c.b(this.f10624b, "Unable to retrieve File for cached filename = " + strA);
            }
            a((Uri) null);
            return Boolean.FALSE;
        }
        if (this.f10626e.get()) {
            return Boolean.FALSE;
        }
        Uri uriFromFile = Uri.fromFile(fileA);
        if (uriFromFile == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f10625c.b(this.f10624b, "Unable to extract Uri from file");
            }
            a((Uri) null);
            return Boolean.FALSE;
        }
        if (this.f10626e.get()) {
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
        return this.f.equals(((C0933e0) obj).f);
    }

    public int hashCode() {
        String str = this.f;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public C0933e0(String str, com.applovin.impl.sdk.ad.b bVar, List list, boolean z2, String str2, com.applovin.impl.sdk.k kVar, a aVar) {
        super("AsyncTaskCacheResource", kVar);
        this.f = str;
        this.g = bVar;
        this.f10755h = list;
        this.f10756i = z2;
        this.j = str2;
        this.k = kVar;
        this.f10757l = aVar;
    }
}
