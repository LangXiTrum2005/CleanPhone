package androidx.media3.extractor.mp4;

import androidx.datastore.preferences.protobuf.a;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import com.thinkup.core.common.n.mo;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class PsshAtomUtil {

    public static final class PsshAtom {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f7129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7130b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f7131c;

        public PsshAtom(UUID uuid, int i2, byte[] bArr) {
            this.f7129a = uuid;
            this.f7130b = i2;
            this.f7131c = bArr;
        }
    }

    public static PsshAtom a(byte[] bArr) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr);
        if (parsableByteArray.f5669c < 32) {
            return null;
        }
        parsableByteArray.G(0);
        int iA = parsableByteArray.a();
        int iG = parsableByteArray.g();
        if (iG != iA) {
            Log.g("PsshAtomUtil", "Advertised atom size (" + iG + ") does not match buffer size: " + iA);
            return null;
        }
        int iG2 = parsableByteArray.g();
        if (iG2 != 1886614376) {
            a.C(iG2, "Atom type is not pssh: ", "PsshAtomUtil");
            return null;
        }
        int iB = Atom.b(parsableByteArray.g());
        if (iB > 1) {
            a.C(iB, "Unsupported pssh version: ", "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(parsableByteArray.o(), parsableByteArray.o());
        if (iB == 1) {
            int iY = parsableByteArray.y();
            UUID[] uuidArr = new UUID[iY];
            for (int i2 = 0; i2 < iY; i2++) {
                uuidArr[i2] = new UUID(parsableByteArray.o(), parsableByteArray.o());
            }
        }
        int iY2 = parsableByteArray.y();
        int iA2 = parsableByteArray.a();
        if (iY2 == iA2) {
            byte[] bArr2 = new byte[iY2];
            parsableByteArray.e(bArr2, 0, iY2);
            return new PsshAtom(uuid, iB, bArr2);
        }
        Log.g("PsshAtomUtil", "Atom data size (" + iY2 + ") does not match the bytes left: " + iA2);
        return null;
    }

    public static byte[] b(byte[] bArr, UUID uuid) {
        PsshAtom psshAtomA = a(bArr);
        if (psshAtomA == null) {
            return null;
        }
        UUID uuid2 = psshAtomA.f7129a;
        if (uuid.equals(uuid2)) {
            return psshAtomA.f7131c;
        }
        Log.g("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + mo.ono);
        return null;
    }
}
