package jb;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public enum o0 implements com.google.crypto.tink.shaded.protobuf.z {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43781a;

    o0(int i10) {
        this.f43781a = i10;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f43781a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
