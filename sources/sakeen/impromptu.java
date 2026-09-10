package sakeen;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: MetadataListReader.java */
/* JADX INFO: loaded from: classes.dex */
public class impromptu {

    /* JADX INFO: compiled from: MetadataListReader.java */
    public static class attabal implements dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final ByteBuffer f37038attabal;

        public attabal(ByteBuffer byteBuffer) {
            this.f37038attabal = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // sakeen.impromptu.dern
        public int attabal() throws IOException {
            return this.f37038attabal.getInt();
        }

        @Override // sakeen.impromptu.dern
        public long getPosition() {
            return this.f37038attabal.position();
        }

        @Override // sakeen.impromptu.dern
        public int readUnsignedShort() throws IOException {
            return impromptu.wireman(this.f37038attabal.getShort());
        }

        @Override // sakeen.impromptu.dern
        public long saneness() throws IOException {
            return impromptu.dern(this.f37038attabal.getInt());
        }

        @Override // sakeen.impromptu.dern
        public void skip(int i) throws IOException {
            ByteBuffer byteBuffer = this.f37038attabal;
            byteBuffer.position(byteBuffer.position() + i);
        }
    }

    /* JADX INFO: compiled from: MetadataListReader.java */
    public interface dern {
        int attabal() throws IOException;

        long getPosition();

        int readUnsignedShort() throws IOException;

        long saneness() throws IOException;

        void skip(int i) throws IOException;
    }

    /* JADX INFO: compiled from: MetadataListReader.java */
    public static class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final long f37039attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final long f37040saneness;

        public saneness(long j, long j2) {
            this.f37039attabal = j;
            this.f37040saneness = j2;
        }

        public long attabal() {
            return this.f37039attabal;
        }
    }

    public static saneness attabal(dern dernVar) throws IOException {
        long jSaneness;
        dernVar.skip(4);
        int unsignedShort = dernVar.readUnsignedShort();
        if (unsignedShort > 100) {
            throw new IOException("Cannot read metadata.");
        }
        dernVar.skip(6);
        int i = 0;
        while (true) {
            if (i >= unsignedShort) {
                jSaneness = -1;
                break;
            }
            int iAttabal = dernVar.attabal();
            dernVar.skip(4);
            jSaneness = dernVar.saneness();
            dernVar.skip(4);
            if (1835365473 == iAttabal) {
                break;
            }
            i++;
        }
        if (jSaneness != -1) {
            dernVar.skip((int) (jSaneness - dernVar.getPosition()));
            dernVar.skip(12);
            long jSaneness2 = dernVar.saneness();
            for (int i2 = 0; i2 < jSaneness2; i2++) {
                int iAttabal2 = dernVar.attabal();
                long jSaneness3 = dernVar.saneness();
                long jSaneness4 = dernVar.saneness();
                if (1164798569 == iAttabal2 || 1701669481 == iAttabal2) {
                    return new saneness(jSaneness3 + jSaneness, jSaneness4);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static long dern(int i) {
        return ((long) i) & 4294967295L;
    }

    public static immediately.saneness saneness(ByteBuffer byteBuffer) throws IOException {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position((int) attabal(new attabal(byteBufferDuplicate)).attabal());
        return immediately.saneness.impromptu(byteBufferDuplicate);
    }

    public static int wireman(short s) {
        return s & 65535;
    }
}
