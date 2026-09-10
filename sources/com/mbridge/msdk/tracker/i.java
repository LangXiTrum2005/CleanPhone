package com.mbridge.msdk.tracker;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class i implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static String f36863i = "CREATE TABLE IF NOT EXISTS %s (id INTEGER PRIMARY KEY,uuid TEXT,name TEXT,type INTEGER,time_stamp INTEGER,duration INTEGER,properties TEXT,priority INTEGER,state INTEGER,invalid_time INTEGER,ignore_max_timeout INTEGER,ignore_max_retry_times INTEGER,report_error_message TEXT,report_count INTEGER)";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static String f36864j = "DROP TABLE IF EXISTS %s";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f36865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f36868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f36869e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f36870f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f36871g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f36872h;

    public i(e eVar) {
        this.f36865a = eVar;
        this.f36868d = eVar.n();
    }

    public void a(boolean z10) {
        this.f36871g = z10;
    }

    public void b(boolean z10) {
        this.f36870f = z10;
    }

    public e d() {
        return this.f36865a;
    }

    public long g() {
        return this.f36869e;
    }

    public int h() {
        return this.f36866b;
    }

    public String i() {
        return this.f36872h;
    }

    public int j() {
        return this.f36867c;
    }

    public String k() {
        return this.f36868d;
    }

    public boolean l() {
        return this.f36871g;
    }

    public boolean m() {
        return this.f36870f;
    }

    public void a(int i10) {
        this.f36866b = i10;
    }

    public void b(int i10) {
        this.f36867c = i10;
    }

    public void a(long j10) {
        this.f36869e = j10;
    }

    public void a(String str) {
        this.f36872h = str;
    }
}
