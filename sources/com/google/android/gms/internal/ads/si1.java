package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class si1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final si1 f19978b = new si1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f19979a = new ConcurrentHashMap();

    public final void a(ri1 ri1Var, Class cls) throws GeneralSecurityException {
        ri1 ri1Var2 = (ri1) this.f19979a.putIfAbsent(cls, ri1Var);
        if (ri1Var2 != null && !ri1Var2.equals(ri1Var)) {
            throw new GeneralSecurityException("Different key creator for parameters class already inserted");
        }
    }
}
