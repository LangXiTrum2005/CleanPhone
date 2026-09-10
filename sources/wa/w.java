package wa;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import jb.a1;
import jb.s1;
import jb.w0;
import jb.z0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class w implements va.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f53132d = new byte[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Set f53133e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f53134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final va.i f53135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final db.b f53136c;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f53133e = Collections.unmodifiableSet(hashSet);
    }

    public w(a1 a1Var, db.b bVar) {
        if (!f53133e.contains(a1Var.D())) {
            throw new IllegalArgumentException("Unsupported DEK key type: " + a1Var.D() + ". Only Tink AEAD key types are supported.");
        }
        this.f53134a = a1Var.D();
        z0 z0VarG = a1.G(a1Var);
        z0VarG.h(s1.RAW);
        this.f53135b = x7.a.I(((a1) z0VarG.a()).d());
        this.f53136c = bVar;
    }

    @Override // va.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        qk.i0 i0VarB = eb.k.f39996b.b(this.f53135b, null);
        byte[] bArrA = this.f53136c.a(((eb.c0) eb.o.f40004b.g(i0VarB)).f39969c.q(), f53132d);
        if (bArrA.length > 4096) {
            throw new GeneralSecurityException("length of encrypted DEK too large");
        }
        byte[] bArrA2 = ((va.a) eb.n.f40002b.a(i0VarB, va.a.class)).a(bArr, bArr2);
        return ByteBuffer.allocate(bArrA.length + 4 + bArrA2.length).putInt(bArrA.length).put(bArrA).put(bArrA2).array();
    }

    @Override // va.a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i10 = byteBufferWrap.getInt();
            if (i10 <= 0 || i10 > 4096 || i10 > bArr.length - 4) {
                throw new GeneralSecurityException("length of encrypted DEK too large");
            }
            byte[] bArr3 = new byte[i10];
            byteBufferWrap.get(bArr3, 0, i10);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            byte[] bArrB = this.f53136c.b(bArr3, f53132d);
            String str = this.f53134a;
            com.google.crypto.tink.shaded.protobuf.h hVar = com.google.crypto.tink.shaded.protobuf.i.f24569b;
            return ((va.a) eb.n.f40002b.a(eb.o.f40004b.a(eb.c0.a(str, com.google.crypto.tink.shaded.protobuf.i.m(bArrB, 0, bArrB.length), w0.SYMMETRIC, s1.RAW, null)), va.a.class)).b(bArr4, bArr2);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e10) {
            throw new GeneralSecurityException("invalid ciphertext", e10);
        }
    }
}
