package larchwood;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: compiled from: AesCmacPrfParameters.java */
/* JADX INFO: loaded from: classes3.dex */
public final class saneness extends marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f32598attabal;

    public saneness(int i) {
        this.f32598attabal = i;
    }

    public static saneness saneness(int i) throws GeneralSecurityException {
        if (i == 16 || i == 32) {
            return new saneness(i);
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", Integer.valueOf(i * 8)));
    }

    @Override // discernable.molybdenite
    public boolean attabal() {
        return false;
    }

    public int dern() {
        return this.f32598attabal;
    }

    public boolean equals(Object obj) {
        return (obj instanceof saneness) && ((saneness) obj).dern() == dern();
    }

    public int hashCode() {
        return Objects.hash(saneness.class, Integer.valueOf(this.f32598attabal));
    }

    public String toString() {
        return "AesCmac PRF Parameters (" + this.f32598attabal + "-byte key)";
    }
}
