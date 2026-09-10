package j$.time.format;

/* JADX INFO: renamed from: j$.time.format.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3553d implements InterfaceC3555f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char f43091a;

    C3553d(char c2) {
        this.f43091a = c2;
    }

    @Override // j$.time.format.InterfaceC3555f
    public final boolean p(z zVar, StringBuilder sb) {
        sb.append(this.f43091a);
        return true;
    }

    @Override // j$.time.format.InterfaceC3555f
    public final int r(w wVar, CharSequence charSequence, int i2) {
        if (i2 == charSequence.length()) {
            return ~i2;
        }
        char cCharAt = charSequence.charAt(i2);
        char c2 = this.f43091a;
        return (cCharAt == c2 || (!wVar.k() && (Character.toUpperCase(cCharAt) == Character.toUpperCase(c2) || Character.toLowerCase(cCharAt) == Character.toLowerCase(c2)))) ? i2 + 1 : ~i2;
    }

    public final String toString() {
        char c2 = this.f43091a;
        if (c2 == '\'') {
            return "''";
        }
        return "'" + c2 + "'";
    }
}
