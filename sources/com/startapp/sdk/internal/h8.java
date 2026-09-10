package com.startapp.sdk.internal;

import org.json.JSONArray;

/* JADX INFO: loaded from: classes6.dex */
public final class h8 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hg f41037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i8 f41038b;

    public h8(i8 i8Var, hg hgVar) {
        this.f41038b = i8Var;
        this.f41037a = hgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JSONArray jSONArrayA;
        this.f41037a.b();
        x1 x1Var = this.f41038b.f41698b;
        try {
            jSONArrayA = this.f41037a.f41060b.a();
        } catch (Exception unused) {
            jSONArrayA = null;
        }
        x1Var.a(jSONArrayA);
    }
}
