package lehua;

import java.util.Arrays;

/* JADX INFO: compiled from: EncodedPayload.java */
/* JADX INFO: loaded from: classes2.dex */
public final class impromptu {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final staphylococcal.dern f32685attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final byte[] f32686saneness;

    public impromptu(staphylococcal.dern dernVar, byte[] bArr) {
        if (dernVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f32685attabal = dernVar;
        this.f32686saneness = bArr;
    }

    public byte[] attabal() {
        return this.f32686saneness;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof impromptu)) {
            return false;
        }
        impromptu impromptuVar = (impromptu) obj;
        if (this.f32685attabal.equals(impromptuVar.f32685attabal)) {
            return Arrays.equals(this.f32686saneness, impromptuVar.f32686saneness);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f32685attabal.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f32686saneness);
    }

    public staphylococcal.dern saneness() {
        return this.f32685attabal;
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f32685attabal + ", bytes=[...]}";
    }
}
