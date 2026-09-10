package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class db {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bg f40906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bg f40907b;

    public db(bg bgVar, bg bgVar2) {
        this.f40906a = bgVar;
        this.f40907b = bgVar2;
    }

    public final void a(ge... geVarArr) {
        for (ge geVar : geVarArr) {
            if (geVar.d) {
                this.f40907b.a(geVar, geVar.f41014e.longValue());
            } else {
                this.f40906a.a(geVar, geVar.f41014e.longValue());
            }
        }
    }
}
