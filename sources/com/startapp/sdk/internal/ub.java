package com.startapp.sdk.internal;

import com.startapp.sdk.ads.list3d.List3DActivity;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class ub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d9 f41541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f41542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f41543c = "";

    public ub(d9 d9Var) {
        this.f41541a = d9Var;
    }

    public final void a(List3DActivity list3DActivity) {
        d9 d9Var = this.f41541a;
        d9Var.f = list3DActivity;
        d9Var.f40904e.clear();
        d9Var.g = 0;
        d9Var.f40905h.clear();
        HashMap map = d9Var.f40903c;
        if (map != null) {
            for (ag agVar : map.values()) {
                if (agVar != null) {
                    agVar.a("AD_CLOSED_TOO_QUICKLY", null);
                }
            }
            d9Var.f40903c.clear();
        }
    }
}
