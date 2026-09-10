package ads_mobile_sdk;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import saneness.fatness;
import saneness.pastie;

/* JADX INFO: loaded from: classes.dex */
public final class bp2 {
    public final pastie a;
    public final long b;
    public final long c;
    public final String d;

    public bp2(pastie pastieVar, long j, long j2, String str) {
        this.a = pastieVar;
        this.b = j;
        this.c = j2;
        this.d = str;
    }

    public final String a(HashMap map) {
        return fatness.attabal(true).competently((byte[]) ((nb3) this.a).a(this.b, Optional.of(map)));
    }

    public final void b(HashMap map) throws v81, t73 {
        ((nb3) this.a).a(this.c, Optional.of(map));
    }

    public static bp2 a(pastie pastieVar, byte[] bArr, boolean z) throws v81, t73 {
        byte[] bArr2;
        nb3 nb3Var = (nb3) pastieVar;
        nb3Var.a();
        uc3 uc3Var = nb3Var.a;
        int length = bArr.length;
        if (length == 0) {
            bArr2 = new byte[0];
        } else {
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, 0, bArr3, 0, length);
            bArr2 = bArr3;
        }
        uc3Var.c.b = new dc3(bArr2);
        List list = (List) nb3Var.a(Optional.empty());
        long jLongValue = ((Long) list.get(0)).longValue();
        long jLongValue2 = ((Long) list.get(1)).longValue();
        long jLongValue3 = ((Long) list.get(2)).longValue();
        nb3Var.a(jLongValue, Optional.empty());
        StringBuilder sb = new StringBuilder("3.869935264.");
        sb.append(fatness.attabal(false).competently(pastie.b()));
        sb.append(z ? "-s" : "");
        return new bp2(nb3Var, jLongValue2, jLongValue3, sb.toString());
    }
}
