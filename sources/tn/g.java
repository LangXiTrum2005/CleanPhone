package tn;

import com.google.android.gms.internal.auth.o;
import d5.u;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f51597a = new h();

    public static final pn.d a(pn.d dVar, un.a module) {
        n.f(dVar, "<this>");
        n.f(module, "module");
        if (!n.a(dVar.getKind(), pn.e.f48501e)) {
            return dVar.isInline() ? a(dVar.g(0), module) : dVar;
        }
        com.google.android.gms.internal.auth.i.t(dVar);
        return dVar;
    }

    public static final byte b(char c4) {
        if (c4 < '~') {
            return c.f51594b[c4];
        }
        return (byte) 0;
    }

    public static final void c(i3.f fVar, String str) {
        fVar.m(fVar.f42852b - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final CharSequence d(int i10, CharSequence charSequence) {
        n.f(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            if (i10 != -1) {
                int i11 = i10 - 30;
                int i12 = i10 + 30;
                String str = i11 <= 0 ? "" : ".....";
                String str2 = i12 >= charSequence.length() ? "" : ".....";
                StringBuilder sbI = u.i(str);
                if (i11 < 0) {
                    i11 = 0;
                }
                int length = charSequence.length();
                if (i12 > length) {
                    i12 = length;
                }
                sbI.append(charSequence.subSequence(i11, i12).toString());
                sbI.append(str2);
                return sbI.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static final void e(pn.d dVar, sn.b json) {
        n.f(dVar, "<this>");
        n.f(json, "json");
        if (n.a(dVar.getKind(), pn.f.f48503e)) {
            json.f50283a.getClass();
        }
    }

    public static final j f(pn.d desc, sn.b bVar) {
        n.f(desc, "desc");
        o kind = desc.getKind();
        if (kind instanceof pn.a) {
            return j.POLY_OBJ;
        }
        if (n.a(kind, pn.f.f48504f)) {
            return j.LIST;
        }
        if (!n.a(kind, pn.f.f48505g)) {
            return j.OBJ;
        }
        pn.d dVarA = a(desc.g(0), bVar.f50284b);
        o kind2 = dVarA.getKind();
        if ((kind2 instanceof pn.c) || n.a(kind2, pn.e.f48502f)) {
            return j.MAP;
        }
        bVar.f50283a.getClass();
        throw new d("Value of type '" + dVarA.h() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + dVarA.getKind() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }
}
