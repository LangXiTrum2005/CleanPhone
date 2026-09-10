package nattier;

import decarock.stratoscope;
import java.nio.ByteBuffer;
import java.util.UUID;

/* JADX INFO: compiled from: PsshAtomUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class kowloon {

    /* JADX INFO: compiled from: PsshAtomUtil.java */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final UUID f33809attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final byte[] f33810dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f33811saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final UUID[] f33812wireman;

        public attabal(UUID uuid, int i, byte[] bArr, UUID[] uuidArr) {
            this.f33809attabal = uuid;
            this.f33811saneness = i;
            this.f33810dern = bArr;
            this.f33812wireman = uuidArr;
        }
    }

    public static byte[] attabal(UUID uuid, byte[] bArr) {
        return saneness(uuid, null, bArr);
    }

    public static UUID beachfront(byte[] bArr) {
        attabal attabalVarWireman = wireman(bArr);
        if (attabalVarWireman == null) {
            return null;
        }
        return attabalVarWireman.f33809attabal;
    }

    public static int competently(byte[] bArr) {
        attabal attabalVarWireman = wireman(bArr);
        if (attabalVarWireman == null) {
            return -1;
        }
        return attabalVarWireman.f33811saneness;
    }

    public static boolean dern(byte[] bArr) {
        return wireman(bArr) != null;
    }

    public static byte[] marial(byte[] bArr, UUID uuid) {
        attabal attabalVarWireman = wireman(bArr);
        if (attabalVarWireman == null) {
            return null;
        }
        if (uuid.equals(attabalVarWireman.f33809attabal)) {
            return attabalVarWireman.f33810dern;
        }
        decarock.triweekly.impromptu("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + attabalVarWireman.f33809attabal + ".");
        return null;
    }

    public static byte[] saneness(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            byteBufferAllocate.putInt(0);
        } else {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static attabal wireman(byte[] bArr) {
        UUID[] uuidArr;
        stratoscope stratoscopeVar = new stratoscope(bArr);
        if (stratoscopeVar.competently() < 32) {
            return null;
        }
        stratoscopeVar.mathsort(0);
        int iAttabal = stratoscopeVar.attabal();
        int iMonoploid = stratoscopeVar.monoploid();
        if (iMonoploid != iAttabal) {
            decarock.triweekly.impromptu("PsshAtomUtil", "Advertised atom size (" + iMonoploid + ") does not match buffer size: " + iAttabal);
            return null;
        }
        int iMonoploid2 = stratoscopeVar.monoploid();
        if (iMonoploid2 != 1886614376) {
            decarock.triweekly.impromptu("PsshAtomUtil", "Atom type is not pssh: " + iMonoploid2);
            return null;
        }
        int iDern = nattier.attabal.dern(stratoscopeVar.monoploid());
        if (iDern > 1) {
            decarock.triweekly.impromptu("PsshAtomUtil", "Unsupported pssh version: " + iDern);
            return null;
        }
        UUID uuid = new UUID(stratoscopeVar.cuirassed(), stratoscopeVar.cuirassed());
        if (iDern == 1) {
            int iSeminary = stratoscopeVar.seminary();
            uuidArr = new UUID[iSeminary];
            for (int i = 0; i < iSeminary; i++) {
                uuidArr[i] = new UUID(stratoscopeVar.cuirassed(), stratoscopeVar.cuirassed());
            }
        } else {
            uuidArr = null;
        }
        int iSeminary2 = stratoscopeVar.seminary();
        int iAttabal2 = stratoscopeVar.attabal();
        if (iSeminary2 == iAttabal2) {
            byte[] bArr2 = new byte[iSeminary2];
            stratoscopeVar.formularize(bArr2, 0, iSeminary2);
            return new attabal(uuid, iDern, bArr2, uuidArr);
        }
        decarock.triweekly.impromptu("PsshAtomUtil", "Atom data size (" + iSeminary2 + ") does not match the bytes left: " + iAttabal2);
        return null;
    }
}
