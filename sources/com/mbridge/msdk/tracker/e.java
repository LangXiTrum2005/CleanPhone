package com.mbridge.msdk.tracker;

import java.io.Serializable;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f36848a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private JSONObject f36851d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private h f36856i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36849b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36850c = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f36854g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f36855h = 604800000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f36857j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f36858k = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f36853f = System.currentTimeMillis();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f36852e = UUID.randomUUID().toString();

    public e(String str) {
        this.f36848a = str;
    }

    public void a(int i10) {
        this.f36850c = i10;
    }

    public void b(int i10) {
        this.f36849b = i10;
    }

    public void c(long j10) {
        this.f36853f = j10;
    }

    public long d() {
        return this.f36854g;
    }

    public String g() {
        return this.f36848a;
    }

    public int h() {
        return this.f36850c;
    }

    public JSONObject i() {
        JSONObject jSONObject = this.f36851d;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        this.f36851d = jSONObject2;
        return jSONObject2;
    }

    public h j() {
        return this.f36856i;
    }

    public long k() {
        return this.f36855h;
    }

    public long l() {
        return this.f36853f;
    }

    public int m() {
        return this.f36849b;
    }

    public String n() {
        return this.f36852e;
    }

    public boolean o() {
        return this.f36858k;
    }

    public boolean p() {
        return this.f36857j;
    }

    public void a(JSONObject jSONObject) {
        this.f36851d = jSONObject;
    }

    public void b(long j10) {
        this.f36855h = j10;
    }

    public void a(String str) {
        this.f36852e = str;
    }

    public void a(long j10) {
        this.f36854g = j10;
    }

    public void a(h hVar) {
        this.f36856i = hVar;
    }

    public void a(boolean z10) {
        this.f36858k = z10;
    }
}
