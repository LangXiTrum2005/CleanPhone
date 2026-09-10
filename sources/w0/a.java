package w0;

import com.ironsource.X3;
import java.util.Map;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends o implements jk.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f52734e = new a(1);

    @Override // jk.b
    public final Object invoke(Object obj) {
        String strValueOf;
        Map.Entry entry = (Map.Entry) obj;
        n.f(entry, "entry");
        Object value = entry.getValue();
        if (value instanceof byte[]) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((CharSequence) X3.j.f27834d);
            int i10 = 0;
            for (byte b10 : (byte[]) value) {
                i10++;
                if (i10 > 1) {
                    sb2.append((CharSequence) ", ");
                }
                sb2.append((CharSequence) String.valueOf((int) b10));
            }
            sb2.append((CharSequence) X3.j.f27836e);
            strValueOf = sb2.toString();
        } else {
            strValueOf = String.valueOf(entry.getValue());
        }
        return q4.a.j(new StringBuilder("  "), ((d) entry.getKey()).f52738a, " = ", strValueOf);
    }
}
