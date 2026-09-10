package com.adcolony.sdk;

import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f9169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f1 f9170b;

    public h0(f1 f1Var) {
        if (f1Var == null) {
            try {
                f1Var = new f1();
            } catch (JSONException e2) {
                new e0.a().a("JSON Error in ADCMessage constructor: ").a(e2.toString()).a(e0.f9132i);
                return;
            }
        }
        this.f9170b = f1Var;
        this.f9169a = f1Var.e("m_type");
    }

    public h0 a(f1 f1Var) {
        try {
            h0 h0Var = new h0("reply", this.f9170b.b("m_origin"), f1Var);
            h0Var.f9170b.b("m_id", this.f9170b.b("m_id"));
            return h0Var;
        } catch (JSONException e2) {
            new e0.a().a("JSON error in ADCMessage's createReply(): ").a(e2.toString()).a(e0.f9132i);
            return new h0("JSONException", 0);
        }
    }

    public void b(f1 f1Var) {
        if (f1Var == null) {
            f1Var = new f1();
        }
        this.f9170b = f1Var;
    }

    public void c() {
        a.a(this.f9169a, this.f9170b);
    }

    public String b() {
        return this.f9169a;
    }

    public f1 a() {
        return this.f9170b;
    }

    public h0(String str, int i2) {
        try {
            this.f9169a = str;
            f1 f1Var = new f1();
            this.f9170b = f1Var;
            f1Var.b("m_target", i2);
        } catch (JSONException e2) {
            new e0.a().a("JSON Error in ADCMessage constructor: ").a(e2.toString()).a(e0.f9132i);
        }
    }

    public h0(String str, int i2, f1 f1Var) {
        try {
            this.f9169a = str;
            f1Var = f1Var == null ? new f1() : f1Var;
            this.f9170b = f1Var;
            f1Var.b("m_target", i2);
        } catch (JSONException e2) {
            new e0.a().a("JSON Error in ADCMessage constructor: ").a(e2.toString()).a(e0.f9132i);
        }
    }
}
