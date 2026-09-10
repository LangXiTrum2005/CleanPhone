package com.p004ironsource;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class al {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private yk f24382a;

    public al(yk ykVar) {
        this.f24382a = ykVar;
    }

    public void a(zk zkVar, JSONObject jSONObject) {
        this.f24382a.a(false, zkVar.a(), jSONObject);
    }

    public void b(zk zkVar, JSONObject jSONObject) {
        this.f24382a.a(true, zkVar.d(), jSONObject);
    }
}
