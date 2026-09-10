package ads_mobile_sdk;

import java.io.IOException;
import java.io.OutputStream;
import saneness.attraction;
import saneness.transpositive;

/* JADX INFO: loaded from: classes.dex */
public abstract class g implements transpositive {
    public transient int a = 0;

    public abstract int a(attraction attractionVar);

    public final String a(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public final byte[] a() {
        try {
            int iA = ((xm0) this).a((attraction) null);
            byte[] bArr = new byte[iA];
            boolean z = mr.b;
            jr jrVar = new jr(bArr, iA);
            ((xm0) this).a(jrVar);
            jrVar.a();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(a("byte array"), e);
        }
    }

    public final void a(OutputStream outputStream) throws IOException {
        xm0 xm0Var = (xm0) this;
        int iA = xm0Var.a((attraction) null);
        boolean z = mr.b;
        if (iA > 4096) {
            iA = 4096;
        }
        lr lrVar = new lr(outputStream, iA);
        xm0Var.a(lrVar);
        int i = lrVar.e;
        if (i > 0) {
            outputStream.write(lrVar.c, 0, i);
            lrVar.e = 0;
        }
    }
}
