package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class mh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f17445a = new HashMap();

    public final synchronized void a(String str, wu0 wu0Var) {
        fv fvVarZzH;
        if (this.f17445a.containsKey(str)) {
            return;
        }
        fv fvVarM = null;
        if (wu0Var == null) {
            fvVarZzH = null;
        } else {
            try {
                fvVarZzH = wu0Var.f21609a.zzH();
            } catch (Throwable th2) {
                try {
                    throw new qu0(th2);
                } catch (qu0 unused) {
                }
            }
        }
        if (wu0Var != null) {
            try {
                fvVarM = wu0Var.f21609a.m();
            } catch (Throwable th3) {
                try {
                    throw new qu0(th3);
                } catch (qu0 unused2) {
                }
            }
        }
        boolean z10 = true;
        if (((Boolean) zzba.zzc().a(am.Sa)).booleanValue()) {
            if (wu0Var == null) {
                z10 = false;
            } else {
                try {
                    wu0Var.a();
                } catch (qu0 unused3) {
                    z10 = false;
                }
            }
        }
        this.f17445a.put(str, new lh0(str, fvVarZzH, fvVarM, z10));
    }

    public final synchronized lh0 b(String str) {
        return (lh0) this.f17445a.get(str);
    }
}
