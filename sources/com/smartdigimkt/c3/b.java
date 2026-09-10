package com.smartdigimkt.c3;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f34066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f34067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f34068c;
    private com.smartdigimkt.g7.a d;

    public b(String str, int i2, int i3) {
        this.f34066a = str;
        this.f34067b = i2;
        this.f34068c = i3;
        com.smartdigimkt.g7.a aVarA = com.smartdigimkt.g7.c.a().a(this.f34066a);
        this.d = aVarA;
        aVarA.a(new com.smartdigimkt.g7.b(i2, i3, 0L));
    }

    public void a(com.smartdigimkt.g7.a.b bVar) {
        this.d.a(bVar);
    }

    public void b() {
        this.d.n();
    }

    public void a() {
        this.d.m();
    }
}
