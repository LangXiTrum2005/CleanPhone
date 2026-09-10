package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ei1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f13984c = Logger.getLogger(ei1.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ei1 f13985d = new ei1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f13986a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f13987b = new ConcurrentHashMap();

    public final synchronized void a(ki1 ki1Var, boolean z10) {
        c(ki1Var, 1, z10);
    }

    public final ki1 b(Class cls, String str) throws GeneralSecurityException {
        ki1 ki1VarD = d(str);
        if (ki1VarD.f16453b.equals(cls)) {
            return ki1VarD;
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(ki1VarD.getClass());
        String string = ki1VarD.f16453b.toString();
        StringBuilder sb2 = new StringBuilder(com.applovin.impl.ca.i(name.length() + 53, 23, strValueOf) + string.length());
        d5.u.r(sb2, "Primitive type ", name, " not supported by key manager of type ", strValueOf);
        throw new GeneralSecurityException(defpackage.e.q(", which only supports: ", string, sb2));
    }

    public final synchronized void c(ki1 ki1Var, int i10, boolean z10) {
        if (!jc1.e(i10)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        e(ki1Var, z10);
    }

    public final synchronized ki1 d(String str) {
        ConcurrentHashMap concurrentHashMap;
        concurrentHashMap = this.f13986a;
        if (!concurrentHashMap.containsKey(str)) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 98);
            sb2.append("No key manager found for key type ");
            sb2.append(str);
            sb2.append(", see https://developers.google.com/tink/faq/registration_errors");
            throw new GeneralSecurityException(sb2.toString());
        }
        return (ki1) concurrentHashMap.get(str);
    }

    public final synchronized void e(ki1 ki1Var, boolean z10) {
        try {
            String str = ki1Var.f16452a;
            if (z10) {
                ConcurrentHashMap concurrentHashMap = this.f13987b;
                if (concurrentHashMap.containsKey(str) && !((Boolean) concurrentHashMap.get(str)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
                }
            }
            ConcurrentHashMap concurrentHashMap2 = this.f13986a;
            ki1 ki1Var2 = (ki1) concurrentHashMap2.get(str);
            if (ki1Var2 != null && !ki1Var2.getClass().equals(ki1Var.getClass())) {
                f13984c.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(str));
                throw new GeneralSecurityException("typeUrl (" + str + ") is already registered with " + ki1Var2.getClass().getName() + ", cannot be re-registered with " + ki1Var.getClass().getName());
            }
            concurrentHashMap2.putIfAbsent(str, ki1Var);
            this.f13987b.put(str, Boolean.valueOf(z10));
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
