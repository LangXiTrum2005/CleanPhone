package http;

import java.util.Objects;

/* JADX INFO: compiled from: WebMessageCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class competently {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final impromptu[] f27997attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final byte[] f27998dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f27999saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final int f28000wireman;

    public competently(String str) {
        this(str, (impromptu[]) null);
    }

    public final void attabal(int i) {
        if (i == this.f28000wireman) {
            return;
        }
        throw new IllegalStateException("Wrong data accessor type detected. " + dern(this.f28000wireman) + " expected, but got " + dern(i));
    }

    public final String dern(int i) {
        if (i != 0) {
            return i != 1 ? "Unknown" : "ArrayBuffer";
        }
        return "String";
    }

    public String saneness() {
        attabal(0);
        return this.f27999saneness;
    }

    public competently(String str, impromptu[] impromptuVarArr) {
        this.f27999saneness = str;
        this.f27998dern = null;
        this.f27997attabal = impromptuVarArr;
        this.f28000wireman = 0;
    }

    public competently(byte[] bArr, impromptu[] impromptuVarArr) {
        Objects.requireNonNull(bArr);
        this.f27998dern = bArr;
        this.f27999saneness = null;
        this.f27997attabal = impromptuVarArr;
        this.f28000wireman = 1;
    }
}
