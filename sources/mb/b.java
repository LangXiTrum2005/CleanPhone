package mb;

import com.google.android.gms.internal.ads.fs1;
import com.google.android.gms.internal.ads.xd1;
import com.google.android.gms.internal.measurement.e1;
import com.google.android.gms.internal.measurement.rc;
import com.google.android.gms.internal.measurement.re;
import com.google.android.gms.internal.measurement.se;
import com.google.android.gms.internal.measurement.ze;
import go.k;
import java.io.InputStream;
import java.nio.ByteBuffer;
import m1.n;
import m1.o;
import m1.p;
import qk.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements se {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f45919a;

    public /* synthetic */ b(boolean z10) {
        this.f45919a = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.se
    public /* bridge */ /* synthetic */ Object a(re reVar) {
        rc rcVarA;
        InputStream inputStreamD = e1.d(reVar);
        try {
            int i10 = 4096;
            if (this.f45919a) {
                if (inputStreamD instanceof ze) {
                    long length = ((ze) inputStreamD).zza().length();
                    if (length == 0) {
                        i10 = 512;
                    } else if (length < 4096) {
                        i10 = (int) length;
                    }
                }
                rcVarA = rc.a(fs1.v(inputStreamD, i10), true);
            } else {
                rcVarA = rc.a(fs1.v(inputStreamD, 4096), false);
            }
            i0.j(inputStreamD, null);
            return rcVarA;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                i0.j(inputStreamD, th2);
                throw th3;
            }
        }
    }

    public void b(boolean z10) {
        if (this.f45919a == z10) {
            return;
        }
        this.f45919a = z10;
    }

    public b(n nVar, p pVar) throws o {
        int i10 = pVar.f45824a;
        ByteBuffer byteBuffer = pVar.f45825b;
        k.i(i10 == 6 || i10 == 3);
        int iMin = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[iMin];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        xd1 xd1Var = new xd1(bArr, iMin);
        nVar.getClass();
        if (xd1Var.h()) {
            this.f45919a = false;
            return;
        }
        int i11 = xd1Var.i(2);
        if (!xd1Var.h()) {
            this.f45919a = true;
            return;
        }
        if (i11 != 3 && i11 != 0) {
            xd1Var.h();
        }
        xd1Var.s();
        throw new o();
    }
}
