package com.facebook.ads.redexgen.core;

import javax.annotation.CheckForNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1105Bw extends AbstractC2325k6<String> {
    public static String[] A05 = {"Y6GgR6t8IKI", "VFkkD7m5TZieTdIGcMhjlI6kmFQATLKN", "mG5qNJ2cuZKVjOSNlAyh8B4xR9rE0ZKh", "CM7cohX4W2k9cinGHwlxigjKg6gGPkMn", "nFCnUuwWiAgAe84yG3jEJO62AyGyzlur", "7r", "4QyinOl4Or1zHXh0KCFmZglNOrfMdCYS", "IPc7SPgKd69USKaPje1bIKNcFeLlsWuv"};
    public int A00;
    public int A01 = 0;
    public final CC A02;
    public final CharSequence A03;
    public final boolean A04;

    public abstract int A04(int separatorPosition);

    public abstract int A05(int start);

    public AbstractC1105Bw(C2368kp splitter, CharSequence toSplit) {
        this.A02 = splitter.A01;
        this.A04 = splitter.A03;
        this.A00 = splitter.A00;
        this.A03 = toSplit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:31:0x0099  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d3 A[LOOP:3: B:34:0x00c1->B:37:0x00d3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f4 A[EDGE_INSN: B:66:0x00f4->B:43:0x00f4 BREAK  A[LOOP:3: B:34:0x00c1->B:37:0x00d3], SYNTHETIC] */
    @Override // com.facebook.ads.redexgen.core.AbstractC2325k6
    @CheckForNull
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final String A03() {
        int start;
        int nextStart;
        int nextStart2;
        int i = this.A01;
        while (nextStart != -1) {
            int nextStart3 = this.A01;
            int separatorPosition = A05(nextStart3);
            if (separatorPosition == -1) {
                separatorPosition = this.A03.length();
                this.A01 = -1;
            } else {
                int nextStart4 = A04(separatorPosition);
                this.A01 = nextStart4;
            }
            int nextStart5 = this.A01;
            if (nextStart5 == i) {
                int nextStart6 = this.A01;
                this.A01 = nextStart6 + 1;
                int start2 = this.A01;
                int nextStart7 = this.A03.length();
                if (start2 > nextStart7) {
                    this.A01 = -1;
                }
            } else {
                while (i < separatorPosition && this.A02.A09(this.A03.charAt(i))) {
                    i++;
                }
                while (separatorPosition > i) {
                    int nextStart8 = separatorPosition - 1;
                    if (!this.A02.A09(this.A03.charAt(nextStart8))) {
                        break;
                    }
                    separatorPosition--;
                }
                boolean z = this.A04;
                int start3 = A05[7].charAt(13);
                if (start3 == 89) {
                    throw new RuntimeException();
                }
                String[] strArr = A05;
                strArr[5] = "Ef";
                strArr[0] = "Em1AIG0CRO3";
                if (z && i == separatorPosition) {
                    i = this.A01;
                } else {
                    int i2 = this.A00;
                    String[] strArr2 = A05;
                    String str = strArr2[3];
                    String str2 = strArr2[1];
                    int start4 = str.charAt(15);
                    int nextStart9 = str2.charAt(15);
                    if (start4 == nextStart9) {
                        String[] strArr3 = A05;
                        strArr3[3] = "tCIj44jeXfrUIeKGqWzYJFtUtJKCQpO9";
                        strArr3[1] = "3BTz6P6YlFAqNOcGdApEEEFNm8KDvcbh";
                        if (i2 == 1) {
                            separatorPosition = this.A03.length();
                            String[] strArr4 = A05;
                            String str3 = strArr4[4];
                            String str4 = strArr4[6];
                            start = str3.charAt(10);
                            nextStart = str4.charAt(10);
                            if (start != nextStart) {
                                String[] strArr5 = A05;
                                strArr5[4] = "SuB8QNIalYE0K4C3aNFCBNECGLTpXTA5";
                                strArr5[6] = "ZMjLx3riby3c0ZsVFXnt0BJdbQ1Fsr1P";
                                this.A01 = -1;
                            } else {
                                A05[7] = "d3Q1ejutGvqDbQDKCEC2qDkOl0TUQWTa";
                                this.A01 = -1;
                            }
                            while (separatorPosition > i) {
                                nextStart2 = separatorPosition - 1;
                                if (this.A02.A09(this.A03.charAt(nextStart2))) {
                                    break;
                                    break;
                                }
                                separatorPosition--;
                            }
                        } else {
                            int nextStart10 = this.A00;
                            this.A00 = nextStart10 - 1;
                        }
                    } else if (i2 == 1) {
                        separatorPosition = this.A03.length();
                        String[] strArr6 = A05;
                        String str5 = strArr6[4];
                        String str6 = strArr6[6];
                        start = str5.charAt(10);
                        nextStart = str6.charAt(10);
                        if (start != nextStart) {
                            String[] strArr7 = A05;
                            strArr7[4] = "SuB8QNIalYE0K4C3aNFCBNECGLTpXTA5";
                            strArr7[6] = "ZMjLx3riby3c0ZsVFXnt0BJdbQ1Fsr1P";
                            this.A01 = -1;
                        } else {
                            A05[7] = "d3Q1ejutGvqDbQDKCEC2qDkOl0TUQWTa";
                            this.A01 = -1;
                        }
                        while (separatorPosition > i) {
                            nextStart2 = separatorPosition - 1;
                            if (this.A02.A09(this.A03.charAt(nextStart2))) {
                                break;
                            }
                            separatorPosition--;
                        }
                    } else {
                        int nextStart11 = this.A00;
                        this.A00 = nextStart11 - 1;
                    }
                    return this.A03.subSequence(i, separatorPosition).toString();
                }
            }
        }
        return A02();
    }
}
