package na;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f46627a;

    public c(char c4) {
        this.f46627a = c4;
    }

    @Override // na.b
    public final boolean a(char c4) {
        return c4 == this.f46627a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CharMatcher.is('");
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        char c4 = this.f46627a;
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(c4 & 15);
            c4 = (char) (c4 >> 4);
        }
        sb2.append(String.copyValueOf(cArr));
        sb2.append("')");
        return sb2.toString();
    }
}
