package com.smartdigimkt.c4;

import android.util.Log;
import com.smartdigimkt.p4.s;
import com.thinkup.core.common.n.mo;
import java.nio.ByteBuffer;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f34266a = "PsshAtomUtil";

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final UUID f34267a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f34268b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final byte[] f34269c;

        public a(UUID uuid, int i2, byte[] bArr) {
            this.f34267a = uuid;
            this.f34268b = i2;
            this.f34269c = bArr;
        }
    }

    private h() {
    }

    public static byte[] a(UUID uuid, byte[] bArr) {
        return a(uuid, null, bArr);
    }

    public static UUID b(byte[] bArr) {
        a aVarA = a(bArr);
        if (aVarA == null) {
            return null;
        }
        return aVarA.f34267a;
    }

    public static int c(byte[] bArr) {
        a aVarA = a(bArr);
        if (aVarA == null) {
            return -1;
        }
        return aVarA.f34268b;
    }

    public static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        boolean z2 = uuidArr != null;
        int length = bArr != null ? bArr.length : 0;
        int length2 = length + 32;
        if (z2) {
            length2 += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
        byteBufferAllocate.putInt(length2);
        byteBufferAllocate.putInt(com.smartdigimkt.c4.a.a0);
        byteBufferAllocate.putInt(z2 ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (z2) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (length != 0) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static byte[] a(byte[] bArr, UUID uuid) {
        a aVarA = a(bArr);
        if (aVarA == null) {
            return null;
        }
        if (uuid == null || uuid.equals(aVarA.f34267a)) {
            return aVarA.f34269c;
        }
        Log.w(f34266a, "UUID mismatch. Expected: " + uuid + ", got: " + aVarA.f34267a + mo.ono);
        return null;
    }

    private static a a(byte[] bArr) {
        s sVar = new s(bArr);
        if (sVar.d() < 32) {
            return null;
        }
        sVar.e(0);
        if (sVar.i() != sVar.a() + 4 || sVar.i() != com.smartdigimkt.c4.a.a0) {
            return null;
        }
        int iC = com.smartdigimkt.c4.a.c(sVar.i());
        if (iC > 1) {
            androidx.datastore.preferences.protobuf.a.u(iC, "Unsupported pssh version: ", f34266a);
            return null;
        }
        UUID uuid = new UUID(sVar.t(), sVar.t());
        if (iC == 1) {
            sVar.f(sVar.B() * 16);
        }
        int iB = sVar.B();
        if (iB != sVar.a()) {
            return null;
        }
        byte[] bArr2 = new byte[iB];
        sVar.a(bArr2, 0, iB);
        return new a(uuid, iC, bArr2);
    }
}
