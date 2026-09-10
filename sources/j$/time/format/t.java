package j$.time.format;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import java.text.ParsePosition;
import java.util.AbstractMap;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
class t implements InterfaceC3555f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile AbstractMap.SimpleImmutableEntry f43121c;
    private static volatile AbstractMap.SimpleImmutableEntry d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j$.time.temporal.t f43122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f43123b;

    t(j$.time.temporal.t tVar, String str) {
        this.f43122a = tVar;
        this.f43123b = str;
    }

    @Override // j$.time.format.InterfaceC3555f
    public boolean p(z zVar, StringBuilder sb) {
        ZoneId zoneId = (ZoneId) zVar.f(this.f43122a);
        if (zoneId == null) {
            return false;
        }
        sb.append(zoneId.s());
        return true;
    }

    protected n a(w wVar) {
        Set setA = j$.time.zone.j.a();
        int size = setA.size();
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = wVar.k() ? f43121c : d;
        if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
            synchronized (this) {
                try {
                    simpleImmutableEntry = wVar.k() ? f43121c : d;
                    if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
                        simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), n.g(setA, wVar));
                        if (wVar.k()) {
                            f43121c = simpleImmutableEntry;
                        } else {
                            d = simpleImmutableEntry;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (n) simpleImmutableEntry.getValue();
    }

    @Override // j$.time.format.InterfaceC3555f
    public final int r(w wVar, CharSequence charSequence, int i2) {
        int i3;
        int length = charSequence.length();
        if (i2 > length) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == length) {
            return ~i2;
        }
        char cCharAt = charSequence.charAt(i2);
        if (cCharAt == '+' || cCharAt == '-') {
            return b(wVar, charSequence, i2, i2, k.f43100e);
        }
        int i4 = i2 + 2;
        if (length >= i4) {
            char cCharAt2 = charSequence.charAt(i2 + 1);
            if (wVar.b(cCharAt, 'U') && wVar.b(cCharAt2, 'T')) {
                int i5 = i2 + 3;
                if (length >= i5 && wVar.b(charSequence.charAt(i4), 'C')) {
                    return b(wVar, charSequence, i2, i5, k.f);
                }
                return b(wVar, charSequence, i2, i4, k.f);
            }
            if (wVar.b(cCharAt, 'G') && length >= (i3 = i2 + 3) && wVar.b(cCharAt2, 'M') && wVar.b(charSequence.charAt(i4), 'T')) {
                int i6 = i2 + 4;
                if (length >= i6 && wVar.b(charSequence.charAt(i3), '0')) {
                    wVar.n(ZoneId.J("GMT0"));
                    return i6;
                }
                return b(wVar, charSequence, i2, i3, k.f);
            }
        }
        n nVarA = a(wVar);
        ParsePosition parsePosition = new ParsePosition(i2);
        String strD = nVarA.d(charSequence, parsePosition);
        if (strD == null) {
            if (!wVar.b(cCharAt, 'Z')) {
                return ~i2;
            }
            wVar.n(ZoneOffset.UTC);
            return i2 + 1;
        }
        wVar.n(ZoneId.J(strD));
        return parsePosition.getIndex();
    }

    private static int b(w wVar, CharSequence charSequence, int i2, int i3, k kVar) {
        String upperCase = charSequence.subSequence(i2, i3).toString().toUpperCase();
        if (i3 >= charSequence.length()) {
            wVar.n(ZoneId.J(upperCase));
            return i3;
        }
        if (charSequence.charAt(i3) == '0' || wVar.b(charSequence.charAt(i3), 'Z')) {
            wVar.n(ZoneId.J(upperCase));
            return i3;
        }
        w wVarD = wVar.d();
        int iR = kVar.r(wVarD, charSequence, i3);
        try {
            if (iR < 0) {
                if (kVar == k.f43100e) {
                    return ~i2;
                }
                wVar.n(ZoneId.J(upperCase));
                return i3;
            }
            wVar.n(ZoneId.V(upperCase, ZoneOffset.f0((int) wVarD.j(j$.time.temporal.a.OFFSET_SECONDS).longValue())));
            return iR;
        } catch (j$.time.c unused) {
            return ~i2;
        }
    }

    public final String toString() {
        return this.f43123b;
    }
}
