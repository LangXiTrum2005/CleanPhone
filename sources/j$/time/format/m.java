package j$.time.format;

/* JADX INFO: loaded from: classes2.dex */
final class m extends n {
    @Override // j$.time.format.n
    protected final n e(String str, String str2, n nVar) {
        return new m(str, str2, nVar, 0);
    }

    @Override // j$.time.format.n
    protected final boolean c(char c2, char c3) {
        return w.c(c2, c3);
    }

    @Override // j$.time.format.n
    protected final boolean h(CharSequence charSequence, int i2, int i3) {
        int length = this.f43107a.length();
        if (length > i3 - i2) {
            return false;
        }
        int i4 = 0;
        while (true) {
            int i5 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i6 = i4 + 1;
            int i7 = i2 + 1;
            if (!w.c(this.f43107a.charAt(i4), charSequence.charAt(i2))) {
                return false;
            }
            i2 = i7;
            length = i5;
            i4 = i6;
        }
    }
}
