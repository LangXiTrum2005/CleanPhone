package com.startapp.sdk.internal;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class yf implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f41712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JSONObject f41713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ag f41714c;

    public yf(ag agVar, String str, JSONObject jSONObject) {
        this.f41714c = agVar;
        this.f41712a = str;
        this.f41713b = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f41714c.c(this.f41712a, this.f41713b);
    }
}
