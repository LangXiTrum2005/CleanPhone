package ads_mobile_sdk;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.amphitheatre;
import saneness.pastie;
import saneness.resalable;

/* JADX INFO: loaded from: classes.dex */
public final class bz1 implements resalable {
    public final amphitheatre a;
    public final u13 b;
    public final long c;

    public bz1(amphitheatre amphitheatreVar, u13 u13Var, long j) {
        this.a = amphitheatreVar;
        this.b = u13Var;
        this.c = j;
    }

    @Override // saneness.resalable
    public final boolean a(i72 i72Var) {
        if (i72Var == null || i72Var.equals(i72.q())) {
            this.b.b(gf0.EVENT_ID_ORCAS_VALIDATOR_UPDATE_METADATA_NOT_FOUND);
            return true;
        }
        short sP = (short) i72Var.s().r().p();
        int iQ = i72Var.s().r().q();
        byte[] versionArray = pastie.b();
        Intrinsics.checkNotNullParameter(versionArray, "versionArray");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(6);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putShort(sP);
        byteBufferAllocate.putInt(iQ);
        byte[] bArrArray = byteBufferAllocate.array();
        Intrinsics.checkNotNullExpressionValue(bArrArray, "array(...)");
        if (!Arrays.equals(bArrArray, versionArray)) {
            this.b.b(gf0.EVENT_ID_ORCAS_VALIDATOR_UPDATE_VM_VERSION_MISMATCH);
            return true;
        }
        long jP = i72Var.s().p();
        this.a.getClass();
        boolean z = jP - System.currentTimeMillis() <= this.c;
        if (z) {
            this.b.b(gf0.EVENT_ID_ORCAS_VALIDATOR_UPDATE_PROGRAM_ALMOST_EXPIRED);
        }
        return z;
    }

    @Override // saneness.resalable
    public final boolean b(i72 i72Var) {
        if (i72Var == null || i72Var.equals(i72.q())) {
            this.b.b(gf0.EVENT_ID_ORCAS_VALIDATOR_INIT_METADATA_NOT_FOUND);
            return false;
        }
        short sP = (short) i72Var.s().r().p();
        int iQ = i72Var.s().r().q();
        byte[] versionArray = pastie.b();
        Intrinsics.checkNotNullParameter(versionArray, "versionArray");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(6);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putShort(sP);
        byteBufferAllocate.putInt(iQ);
        byte[] bArrArray = byteBufferAllocate.array();
        Intrinsics.checkNotNullExpressionValue(bArrArray, "array(...)");
        if (Arrays.equals(bArrArray, versionArray)) {
            return true;
        }
        this.b.b(gf0.EVENT_ID_ORCAS_VALIDATOR_INIT_VM_VERSION_MISMATCH);
        return false;
    }
}
