package com.smartdigimkt.z3;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f40345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f40346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f40347c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f40348e;
    public int f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f40349h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f40350i;

    public synchronized void a() {
    }

    public void a(d dVar) {
        this.f40345a += dVar.f40345a;
        this.f40346b += dVar.f40346b;
        this.f40347c += dVar.f40347c;
        this.d += dVar.d;
        this.f40348e += dVar.f40348e;
        this.f += dVar.f;
        this.g += dVar.g;
        this.f40349h = Math.max(this.f40349h, dVar.f40349h);
        this.f40350i += dVar.f40350i;
    }
}
