package com.adcolony.sdk;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
class f0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final SimpleDateFormat f9138e = new SimpleDateFormat("yyyyMMdd'T'HHmmss.SSSZ", Locale.US);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Date f9139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f9140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b0 f9141c;
    protected String d;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected f0 f9142a = new f0();

        public a a(int i2) {
            this.f9142a.f9140b = i2;
            return this;
        }

        public a a(b0 b0Var) {
            this.f9142a.f9141c = b0Var;
            return this;
        }

        public a a(String str) {
            this.f9142a.d = str;
            return this;
        }

        public f0 a() {
            if (this.f9142a.f9139a == null) {
                this.f9142a.f9139a = new Date(System.currentTimeMillis());
            }
            return this.f9142a;
        }
    }

    public String b() {
        int i2 = this.f9140b;
        if (i2 == -1) {
            return "Fatal";
        }
        if (i2 == 0) {
            return "Error";
        }
        if (i2 == 1) {
            return "Warn";
        }
        if (i2 != 2) {
            return i2 != 3 ? "UNKNOWN LOG LEVEL" : "Debug";
        }
        return "Info";
    }

    public String c() {
        return this.d;
    }

    public String d() {
        return f9138e.format(this.f9139a);
    }

    public String toString() {
        return d() + " " + b() + "/" + a().a() + ": " + c();
    }

    public b0 a() {
        return this.f9141c;
    }
}
