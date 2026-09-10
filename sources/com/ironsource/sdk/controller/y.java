package com.ironsource.sdk.controller;

import android.os.Handler;
import android.util.Log;
import com.google.android.gms.appset.AppSetIdInfo;
import com.ironsource.C0693z8;
import eb.d0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import ud.i0;
import ud.j0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y implements jk.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30671b;

    public /* synthetic */ y(Object obj, int i10) {
        this.f30670a = i10;
        this.f30671b = obj;
    }

    @Override // jk.b
    public final Object invoke(Object it) {
        int i10 = this.f30670a;
        Object obj = this.f30671b;
        switch (i10) {
            case 0:
                return ((v) obj).d((C0693z8) it);
            case 1:
                d0 d0Var = (d0) obj;
                ((Handler) d0Var.f39976b).post(new dg.f(d0Var, ((Double) it).doubleValue()));
                return wj.r.f53297a;
            case 2:
                dh.b it2 = (dh.b) it;
                kotlin.jvm.internal.n.f(it2, "it");
                return Boolean.valueOf(((Set) obj).contains(it2.f38876a));
            case 3:
                return Boolean.valueOf(((HashSet) obj).contains(it));
            case 4:
                String it3 = (String) it;
                kotlin.jvm.internal.n.f(it3, "it");
                ((ArrayList) obj).add(it3);
                return wj.r.f53297a;
            case 5:
                ((ln.c) obj).g(null);
                return wj.r.f53297a;
            case 6:
                String str = (String) obj;
                w0.b bVar = (w0.b) it;
                bVar.e(rc.i.f49565d, str);
                rc.i.d(bVar, str);
                return null;
            case 7:
                rn.m mVar = (rn.m) obj;
                int iIntValue = ((Integer) it).intValue();
                return mVar.f49730e[iIntValue] + ": " + mVar.g(iIntValue).h();
            case 8:
                s0.b ex = (s0.b) it;
                kotlin.jvm.internal.n.f(ex, "ex");
                Log.w("FirebaseSessions", "CorruptionException in session data DataStore", ex);
                return new i0(((j0) obj).f52114a.a(null), null, null);
            case 9:
                ((wi.j) obj).a(((AppSetIdInfo) it).getId());
                return wj.r.f53297a;
            case 10:
                return it == ((xj.a) obj) ? "(this Collection)" : String.valueOf(it);
            default:
                kotlin.jvm.internal.n.f(it, "it");
                return ((jk.a) obj).invoke();
        }
    }

    public /* synthetic */ y(ln.c cVar, ln.b bVar) {
        this.f30670a = 5;
        this.f30671b = cVar;
    }

    public /* synthetic */ y(rc.i iVar, String str) {
        this.f30670a = 6;
        this.f30671b = str;
    }
}
