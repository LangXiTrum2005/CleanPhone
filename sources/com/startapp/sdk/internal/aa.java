package com.startapp.sdk.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class aa implements j7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f40796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb f40797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lb f40798c;

    public aa(Context context, lb lbVar, lb lbVar2) {
        this.f40796a = context;
        this.f40797b = lbVar;
        this.f40798c = lbVar2;
    }

    @Override // com.startapp.sdk.internal.j7
    public final Object a(Object obj, Object obj2, Object obj3) {
        g9 g9Var = (g9) obj;
        j9 j9Var = (j9) obj2;
        q9 q9Var = (q9) obj3;
        if (g9Var == null || j9Var == null) {
            return null;
        }
        return h9.j.equals(g9Var.f40999a) ? new ba(this.f40797b, this.f40798c, g9Var, j9Var, q9Var) : new y9(this.f40796a, g9Var, j9Var, q9Var);
    }
}
