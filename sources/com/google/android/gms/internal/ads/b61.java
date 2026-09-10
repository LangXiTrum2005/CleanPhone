package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f12657a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public hf1 f12658b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public hf1 f12659c = null;

    public final boolean a(ch chVar) {
        byte[] bArrH = chVar.z().A().A().h();
        byte[] bArrH2 = chVar.z().C().h();
        try {
            try {
                if (!this.f12657a.getAndSet(true)) {
                    try {
                        rp1.a();
                        iw0 iw0VarA = vc1.a(new String(ps1.F("eyJwcmltYXJ5S2V5SWQiOjMzMTUxOTk4MTksImtleSI6W3sia2V5RGF0YSI6eyJ0eXBlVXJsIjoidHlwZS5nb29nbGVhcGlzLmNvbS9nb29nbGUuY3J5cHRvLnRpbmsuRWNkc2FQdWJsaWNLZXkiLCJ2YWx1ZSI6IkVnWUlBeEFDR0FFYUlRQVNoRGZwOUM5QjcrMU1nMmJQbHJ5WExPOHVScDd6YWZJMldSYURmR1ZqVmlJaEFJNFZzTmVrcCs0bVY0d2toZlhVb3pQZWs5TjgxcUdIK2plNnhjOFpoQkhQIiwia2V5TWF0ZXJpYWxUeXBlIjoiQVNZTU1FVFJJQ19QVUJMSUMifSwic3RhdHVzIjoiRU5BQkxFRCIsImtleUlkIjozMzE1MTk5ODE5LCJvdXRwdXRQcmVmaXhUeXBlIjoiVElOSyJ9XX0=", false)));
                        tt0 tt0Var = x10.f21695v;
                        this.f12658b = (hf1) iw0VarA.A(tt0Var, hf1.class);
                        this.f12659c = (hf1) vc1.a(new String(ps1.F("eyJwcmltYXJ5S2V5SWQiOjMwODI3ODA4ODgsImtleSI6W3sia2V5RGF0YSI6eyJ0eXBlVXJsIjoidHlwZS5nb29nbGVhcGlzLmNvbS9nb29nbGUuY3J5cHRvLnRpbmsuRWNkc2FQdWJsaWNLZXkiLCJ2YWx1ZSI6IkVnWUlBeEFDR0FFYUlRQkEyWW5HaWFpc3pEcGtJcWpjalorUTJ2alFUUldQZjhFcTlkZVlhNFpKa3lJaEFCQWFESTd6QWJkQXVpQmlnOWdHSkJ1VTUzSGg5Z0RCa0t2amswS2tabDhjIiwia2V5TWF0ZXJpYWxUeXBlIjoiQVNZTU1FVFJJQ19QVUJMSUMifSwic3RhdHVzIjoiRU5BQkxFRCIsImtleUlkIjozMDgyNzgwODg4LCJvdXRwdXRQcmVmaXhUeXBlIjoiVElOSyJ9XX0=", false))).A(tt0Var, hf1.class);
                    } catch (Exception e10) {
                        throw new GeneralSecurityException("Failed to verify program", e10);
                    }
                }
                hf1 hf1Var = this.f12658b;
                if (hf1Var == null) {
                    throw new GeneralSecurityException();
                }
                hf1Var.a(bArrH, bArrH2);
                return true;
            } catch (GeneralSecurityException unused) {
                return false;
            }
        } catch (GeneralSecurityException unused2) {
            hf1 hf1Var2 = this.f12659c;
            if (hf1Var2 != null) {
                hf1Var2.a(bArrH, bArrH2);
                return true;
            }
            return false;
        }
    }
}
