package com.applovin.impl;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f9144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f9145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a3 f9146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.applovin.impl.sdk.ad.b f9147d;

    public r1(Object obj, long j10) {
        this.f9144a = j10;
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) obj;
            this.f9147d = bVar;
            this.f9145b = bVar.getAdZone().d() != null ? this.f9147d.getAdZone().d().getLabel() : null;
        } else if (obj instanceof a3) {
            a3 a3Var = (a3) obj;
            this.f9146c = a3Var;
            this.f9145b = a3Var.getFormat().getLabel();
        }
    }

    public void a(Object obj) {
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            this.f9147d = (com.applovin.impl.sdk.ad.b) obj;
        } else if (obj instanceof a3) {
            this.f9146c = (a3) obj;
        }
    }

    public long b() {
        return this.f9144a;
    }

    public com.applovin.impl.sdk.ad.b c() {
        return this.f9147d;
    }

    public String d() {
        String str = this.f9145b;
        return str != null ? str : "Unknown";
    }

    public a3 e() {
        return this.f9146c;
    }

    public String f() {
        if (this.f9147d != null) {
            return "AppLovin";
        }
        a3 a3Var = this.f9146c;
        return a3Var != null ? a3Var.getNetworkName() : "Unknown";
    }

    public Object a() {
        com.applovin.impl.sdk.ad.b bVar = this.f9147d;
        return bVar != null ? bVar : this.f9146c;
    }
}
