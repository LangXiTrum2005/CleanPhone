package com.google.android.exoplayer2.extractor.mp4;

import com.applovin.impl.Z;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.thinkup.core.common.n.mo;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class PsshAtomUtil {

    public static class PsshAtom {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f17820a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f17821b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f17822c;

        public PsshAtom(UUID uuid, int i2, byte[] bArr) {
            this.f17820a = uuid;
            this.f17821b = i2;
            this.f17822c = bArr;
        }
    }

    public static PsshAtom a(byte[] bArr) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr);
        if (parsableByteArray.f18958c >= 32) {
            parsableByteArray.F(0);
            if (parsableByteArray.g() == parsableByteArray.a() + 4 && parsableByteArray.g() == 1886614376) {
                int iB = Atom.b(parsableByteArray.g());
                if (iB > 1) {
                    Z.s(iB, "Unsupported pssh version: ", "PsshAtomUtil");
                    return null;
                }
                UUID uuid = new UUID(parsableByteArray.o(), parsableByteArray.o());
                if (iB == 1) {
                    parsableByteArray.G(parsableByteArray.x() * 16);
                }
                int iX = parsableByteArray.x();
                if (iX == parsableByteArray.a()) {
                    byte[] bArr2 = new byte[iX];
                    parsableByteArray.e(bArr2, 0, iX);
                    return new PsshAtom(uuid, iB, bArr2);
                }
            }
        }
        return null;
    }

    public static byte[] b(byte[] bArr, UUID uuid) {
        PsshAtom psshAtomA = a(bArr);
        if (psshAtomA == null) {
            return null;
        }
        UUID uuid2 = psshAtomA.f17820a;
        if (uuid.equals(uuid2)) {
            return psshAtomA.f17822c;
        }
        Log.g("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + mo.ono);
        return null;
    }

    public static int c(byte[] bArr) {
        PsshAtom psshAtomA = a(bArr);
        if (psshAtomA == null) {
            return -1;
        }
        return psshAtomA.f17821b;
    }
}
