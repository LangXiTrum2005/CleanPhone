package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ui1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ui1 f20803b = new ui1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f20804a = new AtomicReference(new hj1(new f81(3)));

    public final synchronized void a(ej1 ej1Var) {
        AtomicReference atomicReference = this.f20804a;
        f81 f81Var = new f81((hj1) atomicReference.get());
        f81Var.b(ej1Var);
        atomicReference.set(new hj1(f81Var));
    }

    public final synchronized void b(jj1 jj1Var) {
        AtomicReference atomicReference = this.f20804a;
        f81 f81Var = new f81((hj1) atomicReference.get());
        HashMap map = (HashMap) f81Var.f14318c;
        Class clsZza = jj1Var.zza();
        if (map.containsKey(clsZza)) {
            jj1 jj1Var2 = (jj1) map.get(clsZza);
            if (!jj1Var2.equals(jj1Var) || !jj1Var.equals(jj1Var2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(clsZza.toString()));
            }
        } else {
            map.put(clsZza, jj1Var);
        }
        atomicReference.set(new hj1(f81Var));
    }
}
