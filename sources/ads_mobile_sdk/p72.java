package ads_mobile_sdk;

import astronautic.premeiotic;
import discernable.dovishness;
import discernable.gintrap;
import discernable.preprohormone;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicBoolean;
import saneness.fatness;

/* JADX INFO: loaded from: classes.dex */
public final class p72 {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public dovishness b = null;
    public dovishness c = null;

    public final void a() throws GeneralSecurityException {
        if (this.a.getAndSet(true)) {
            return;
        }
        try {
            premeiotic.dern();
            this.b = (dovishness) preprohormone.attabal(new String(fatness.saneness("eyJwcmltYXJ5S2V5SWQiOjMzMTUxOTk4MTksImtleSI6W3sia2V5RGF0YSI6eyJ0eXBlVXJsIjoidHlwZS5nb29nbGVhcGlzLmNvbS9nb29nbGUuY3J5cHRvLnRpbmsuRWNkc2FQdWJsaWNLZXkiLCJ2YWx1ZSI6IkVnWUlBeEFDR0FFYUlRQVNoRGZwOUM5QjcrMU1nMmJQbHJ5WExPOHVScDd6YWZJMldSYURmR1ZqVmlJaEFJNFZzTmVrcCs0bVY0d2toZlhVb3pQZWs5TjgxcUdIK2plNnhjOFpoQkhQIiwia2V5TWF0ZXJpYWxUeXBlIjoiQVNZTU1FVFJJQ19QVUJMSUMifSwic3RhdHVzIjoiRU5BQkxFRCIsImtleUlkIjozMzE1MTk5ODE5LCJvdXRwdXRQcmVmaXhUeXBlIjoiVElOSyJ9XX0=", false))).adultoid(gintrap.attabal(), dovishness.class);
            this.c = (dovishness) preprohormone.attabal(new String(fatness.saneness("eyJwcmltYXJ5S2V5SWQiOjMwODI3ODA4ODgsImtleSI6W3sia2V5RGF0YSI6eyJ0eXBlVXJsIjoidHlwZS5nb29nbGVhcGlzLmNvbS9nb29nbGUuY3J5cHRvLnRpbmsuRWNkc2FQdWJsaWNLZXkiLCJ2YWx1ZSI6IkVnWUlBeEFDR0FFYUlRQkEyWW5HaWFpc3pEcGtJcWpjalorUTJ2alFUUldQZjhFcTlkZVlhNFpKa3lJaEFCQWFESTd6QWJkQXVpQmlnOWdHSkJ1VTUzSGg5Z0RCa0t2amswS2tabDhjIiwia2V5TWF0ZXJpYWxUeXBlIjoiQVNZTU1FVFJJQ19QVUJMSUMifSwic3RhdHVzIjoiRU5BQkxFRCIsImtleUlkIjozMDgyNzgwODg4LCJvdXRwdXRQcmVmaXhUeXBlIjoiVElOSyJ9XX0=", false))).adultoid(gintrap.attabal(), dovishness.class);
        } catch (Exception e) {
            throw new GeneralSecurityException("Failed to verify program", e);
        }
    }

    public final boolean a(s5 s5Var) {
        byte[] bArrC = s5Var.p().q().q().c();
        byte[] bArrC2 = s5Var.p().p().c();
        try {
            a();
            dovishness dovishnessVar = this.b;
            if (dovishnessVar != null) {
                dovishnessVar.attabal(bArrC, bArrC2);
                return true;
            }
            throw new GeneralSecurityException();
        } catch (GeneralSecurityException unused) {
            try {
                dovishness dovishnessVar2 = this.c;
                if (dovishnessVar2 != null) {
                    dovishnessVar2.attabal(bArrC, bArrC2);
                    return true;
                }
            } catch (GeneralSecurityException unused2) {
            }
            return false;
        }
    }
}
