package j$.time.format;

/* JADX INFO: loaded from: classes2.dex */
final class l implements InterfaceC3555f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3555f f43104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f43105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final char f43106c;

    l(InterfaceC3555f interfaceC3555f, int i2, char c2) {
        this.f43104a = interfaceC3555f;
        this.f43105b = i2;
        this.f43106c = c2;
    }

    @Override // j$.time.format.InterfaceC3555f
    public final boolean p(z zVar, StringBuilder sb) {
        int length = sb.length();
        if (!this.f43104a.p(zVar, sb)) {
            return false;
        }
        int length2 = sb.length() - length;
        int i2 = this.f43105b;
        if (length2 <= i2) {
            for (int i3 = 0; i3 < i2 - length2; i3++) {
                sb.insert(length, this.f43106c);
            }
            return true;
        }
        throw new j$.time.c("Cannot print as output of " + length2 + " characters exceeds pad width of " + i2);
    }

    @Override // j$.time.format.InterfaceC3555f
    public final int r(w wVar, CharSequence charSequence, int i2) {
        boolean zL = wVar.l();
        if (i2 > charSequence.length()) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == charSequence.length()) {
            return ~i2;
        }
        int length = this.f43105b + i2;
        if (length > charSequence.length()) {
            if (zL) {
                return ~i2;
            }
            length = charSequence.length();
        }
        int i3 = i2;
        while (i3 < length && wVar.b(charSequence.charAt(i3), this.f43106c)) {
            i3++;
        }
        int iR = this.f43104a.r(wVar, charSequence.subSequence(0, length), i3);
        return (iR == length || !zL) ? iR : ~(i2 + i3);
    }

    public final String toString() {
        String str;
        char c2 = this.f43106c;
        if (c2 == ' ') {
            str = ")";
        } else {
            str = ",'" + c2 + "')";
        }
        return "Pad(" + this.f43104a + "," + this.f43105b + str;
    }
}
