package rn;

import b2.w;
import com.google.android.gms.internal.ads.kj1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements nn.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f49704a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f49705b = new n("kotlin.Boolean", pn.b.f48496e);

    @Override // nn.a
    public final void a(f4.a aVar, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (aVar.f40617a) {
            aVar.j(String.valueOf(zBooleanValue));
        } else {
            ((w) ((bc.i) aVar.f40619c).f5553c).j(String.valueOf(zBooleanValue));
        }
    }

    @Override // nn.a
    public final Object b(kj1 decoder) {
        boolean z10;
        boolean z11;
        kotlin.jvm.internal.n.f(decoder, "decoder");
        i3.f fVar = (i3.f) decoder.f16465d;
        int iS = fVar.s();
        String str = (String) fVar.f42856f;
        if (iS == str.length()) {
            i3.f.n(fVar, "EOF", 0, 6);
            throw null;
        }
        if (str.charAt(iS) == '\"') {
            iS++;
            z10 = true;
        } else {
            z10 = false;
        }
        int iQ = fVar.q(iS);
        if (iQ >= str.length() || iQ == -1) {
            i3.f.n(fVar, "EOF", 0, 6);
            throw null;
        }
        int i10 = iQ + 1;
        int iCharAt = str.charAt(iQ) | ' ';
        if (iCharAt == 102) {
            fVar.f(i10, "alse");
            z11 = false;
        } else {
            if (iCharAt != 116) {
                i3.f.n(fVar, "Expected valid boolean literal prefix, but had '" + fVar.k() + '\'', 0, 6);
                throw null;
            }
            fVar.f(i10, "rue");
            z11 = true;
        }
        if (z10) {
            if (fVar.f42852b == str.length()) {
                i3.f.n(fVar, "EOF", 0, 6);
                throw null;
            }
            if (str.charAt(fVar.f42852b) != '\"') {
                i3.f.n(fVar, "Expected closing quotation mark", 0, 6);
                throw null;
            }
            fVar.f42852b++;
        }
        return Boolean.valueOf(z11);
    }

    @Override // nn.a
    public final pn.d d() {
        return f49705b;
    }
}
