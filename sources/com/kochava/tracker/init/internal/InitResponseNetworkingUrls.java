package com.kochava.tracker.init.internal;

import android.net.Uri;
import com.kochava.core.json.internal.JsonObject;
import com.kochava.core.json.internal.JsonObjectApi;
import com.kochava.core.util.internal.ObjectUtil;

/* JADX INFO: loaded from: classes5.dex */
public final class InitResponseNetworkingUrls implements InitResponseNetworkingUrlsApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f28211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f28212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f28213c;
    public final Uri d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Uri f28214e;
    public final Uri f;
    public final Uri g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Uri f28215h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Uri f28216i;
    public final Uri j;
    public final Uri k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Uri f28217l;
    public final JsonObjectApi m;

    public InitResponseNetworkingUrls() {
        Uri uri = Uri.EMPTY;
        this.f28211a = uri;
        this.f28212b = uri;
        this.f28213c = uri;
        this.d = uri;
        this.f28214e = uri;
        this.f = uri;
        this.g = uri;
        this.f28215h = uri;
        this.f28216i = uri;
        this.j = uri;
        this.k = uri;
        this.f28217l = uri;
        this.m = JsonObject.w();
    }

    @Override // com.kochava.tracker.init.internal.InitResponseNetworkingUrlsApi
    public final Uri a() {
        Uri uri = this.j;
        return ObjectUtil.d(uri) ? uri : this.f28216i;
    }

    @Override // com.kochava.tracker.init.internal.InitResponseNetworkingUrlsApi
    public final Uri b() {
        return this.f28213c;
    }

    @Override // com.kochava.tracker.init.internal.InitResponseNetworkingUrlsApi
    public final Uri c() {
        return this.f28212b;
    }

    @Override // com.kochava.tracker.init.internal.InitResponseNetworkingUrlsApi
    public final Uri d() {
        return this.d;
    }

    @Override // com.kochava.tracker.init.internal.InitResponseNetworkingUrlsApi
    public final JsonObjectApi e() {
        return this.m;
    }

    @Override // com.kochava.tracker.init.internal.InitResponseNetworkingUrlsApi
    public final Uri f() {
        return this.f28214e;
    }

    @Override // com.kochava.tracker.init.internal.InitResponseNetworkingUrlsApi
    public final Uri g() {
        return this.f28215h;
    }

    @Override // com.kochava.tracker.init.internal.InitResponseNetworkingUrlsApi
    public final Uri h() {
        return this.g;
    }

    @Override // com.kochava.tracker.init.internal.InitResponseNetworkingUrlsApi
    public final Uri i() {
        return this.f28217l;
    }

    @Override // com.kochava.tracker.init.internal.InitResponseNetworkingUrlsApi
    public final Uri j() {
        return this.f28211a;
    }

    @Override // com.kochava.tracker.init.internal.InitResponseNetworkingUrlsApi
    public final Uri k() {
        Uri uri = this.k;
        return ObjectUtil.d(uri) ? uri : this.f28216i;
    }

    @Override // com.kochava.tracker.init.internal.InitResponseNetworkingUrlsApi
    public final Uri l() {
        return this.f;
    }

    public InitResponseNetworkingUrls(Uri uri, Uri uri2, Uri uri3, Uri uri4, Uri uri5, Uri uri6, Uri uri7, Uri uri8, Uri uri9, Uri uri10, Uri uri11, Uri uri12, JsonObjectApi jsonObjectApi) {
        this.f28211a = uri;
        this.f28212b = uri2;
        this.f28213c = uri3;
        this.d = uri4;
        this.f28214e = uri5;
        this.f = uri6;
        this.g = uri7;
        this.f28215h = uri8;
        this.f28216i = uri9;
        this.j = uri10;
        this.k = uri11;
        this.f28217l = uri12;
        this.m = jsonObjectApi;
    }
}
