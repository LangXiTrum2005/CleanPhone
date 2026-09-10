package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sh1 implements xe1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final co.c f19974a = new co.c(4);

    public static dh1 b(cg1 cg1Var) throws GeneralSecurityException {
        byte[] bArr = dh1.f13543d;
        try {
            Cipher cipher = (Cipher) f19974a.get();
            if (cipher == null) {
                throw new GeneralSecurityException("AES GCM SIV cipher is invalid.");
            }
            if (dh1.b(cipher)) {
                return new dh1(((zq1) cg1Var.f13160c.f20839b).b(), cg1Var.f13161d.b());
            }
            throw new IllegalStateException("Cipher does not implement AES GCM SIV.");
        } catch (IllegalStateException e10) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e10);
        }
    }
}
