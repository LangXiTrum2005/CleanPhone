package com.adjust.sdk.sig;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 extends IllegalArgumentException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6984a;

    /* JADX WARN: Illegal instructions before constructor call */
    public m1(String str, String str2) {
        String strConcat;
        StringBuilder sbI = d5.u.i(str);
        if (str2 != null) {
            for (int i10 = 0; i10 < str2.length(); i10++) {
                char cCharAt = str2.charAt(i10);
                if (!Character.isWhitespace(cCharAt) && !Character.isSpaceChar(cCharAt)) {
                    strConcat = "\n".concat(str2);
                }
            }
            strConcat = "";
        } else {
            strConcat = "";
        }
        sbI.append(strConcat);
        String string = sbI.toString();
        super(string);
        this.f6984a = string;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f6984a;
    }
}
