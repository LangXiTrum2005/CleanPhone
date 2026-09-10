package rn;

import b2.w;
import com.google.android.gms.internal.ads.hx0;
import com.google.android.gms.internal.ads.kj1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements nn.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f49706a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f49707b = new n("kotlin.Double", pn.b.f48497f);

    @Override // nn.a
    public final void a(f4.a aVar, Object obj) {
        double dDoubleValue = ((Number) obj).doubleValue();
        bc.i iVar = (bc.i) aVar.f40619c;
        if (aVar.f40617a) {
            aVar.j(String.valueOf(dDoubleValue));
        } else {
            ((w) iVar.f5553c).j(String.valueOf(dDoubleValue));
        }
        ((hx0) aVar.f40623g).getClass();
        if (Double.isInfinite(dDoubleValue) || Double.isNaN(dDoubleValue)) {
            throw new tn.d("Unexpected special floating-point value " + Double.valueOf(dDoubleValue) + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) tn.g.d(-1, ((w) iVar.f5553c).toString())));
        }
    }

    @Override // nn.a
    public final Object b(kj1 decoder) {
        kotlin.jvm.internal.n.f(decoder, "decoder");
        i3.f fVar = (i3.f) decoder.f16465d;
        String strK = fVar.k();
        try {
            double d10 = Double.parseDouble(strK);
            ((sn.b) decoder.f16463b).f50283a.getClass();
            if (!Double.isInfinite(d10) && !Double.isNaN(d10)) {
                return Double.valueOf(d10);
            }
            i3.f.n(fVar, "Unexpected special floating-point value " + Double.valueOf(d10) + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            i3.f.n(fVar, defpackage.e.f('\'', "Failed to parse type 'double' for input '", strK), 0, 6);
            throw null;
        }
    }

    @Override // nn.a
    public final pn.d d() {
        return f49707b;
    }
}
