package com.applovin.shadow.okio;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import defpackage.e;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import jk.b;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import l1.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0011\u001a'\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0080\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a;\u0010\u0013\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00110\u0010H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a;\u0010\u0016\u001a\u00020\u0011*\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00110\u0010H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a;\u0010\u0019\u001a\u00020\u0011*\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00110\u0010H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0017\u001a;\u0010\u001a\u001a\u00020\u0001*\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00110\u0010H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a;\u0010\u001c\u001a\u00020\u0001*\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00110\u0010H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001b\u001a;\u0010\u001d\u001a\u00020\u0001*\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00110\u0010H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001b\"\u0014\u0010\u001e\u001a\u00020\f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\"\u0014\u0010 \u001a\u00020\u00188\u0000X\u0080T¢\u0006\u0006\n\u0004\b \u0010!\"\u0014\u0010\"\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b\"\u0010#\"\u0014\u0010$\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b$\u0010#\"\u0014\u0010%\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b%\u0010#\"\u0014\u0010&\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b&\u0010#\"\u0014\u0010'\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b'\u0010#\"\u0014\u0010(\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b(\u0010#\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006)"}, d2 = {"", "", "beginIndex", "endIndex", "", "size", "(Ljava/lang/String;II)J", "utf8Size", "codePoint", "", "isIsoControl", "(I)Z", "", "byte", "isUtf8Continuation", "(B)Z", "Lkotlin/Function1;", "Lwj/r;", "yield", "processUtf8Bytes", "(Ljava/lang/String;IILjk/b;)V", "", "processUtf8CodePoints", "([BIILjk/b;)V", "", "processUtf16Chars", "process2Utf8Bytes", "([BIILjk/b;)I", "process3Utf8Bytes", "process4Utf8Bytes", "REPLACEMENT_BYTE", "B", "REPLACEMENT_CHARACTER", "C", "REPLACEMENT_CODE_POINT", "I", "HIGH_SURROGATE_HEADER", "LOG_SURROGATE_HEADER", "MASK_2BYTES", "MASK_3BYTES", "MASK_4BYTES", "com.applovin.shadow.okio"}, k = 2, mv = {1, 9, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class Utf8 {
    public static final int HIGH_SURROGATE_HEADER = 55232;
    public static final int LOG_SURROGATE_HEADER = 56320;
    public static final int MASK_2BYTES = 3968;
    public static final int MASK_3BYTES = -123008;
    public static final int MASK_4BYTES = 3678080;
    public static final byte REPLACEMENT_BYTE = 63;
    public static final char REPLACEMENT_CHARACTER = 65533;
    public static final int REPLACEMENT_CODE_POINT = 65533;

    public static final boolean isIsoControl(int i10) {
        if (i10 < 0 || i10 >= 32) {
            return 127 <= i10 && i10 < 160;
        }
        return true;
    }

    public static final boolean isUtf8Continuation(byte b10) {
        return (b10 & 192) == 128;
    }

    public static final int process2Utf8Bytes(byte[] bArr, int i10, int i11, b yield) {
        Integer numValueOf = Integer.valueOf(REPLACEMENT_CODE_POINT);
        n.f(bArr, "<this>");
        n.f(yield, "yield");
        int i12 = i10 + 1;
        if (i11 <= i12) {
            yield.invoke(numValueOf);
            return 1;
        }
        byte b10 = bArr[i10];
        byte b11 = bArr[i12];
        if ((b11 & 192) != 128) {
            yield.invoke(numValueOf);
            return 1;
        }
        int i13 = (b11 ^ 3968) ^ (b10 << 6);
        if (i13 < 128) {
            yield.invoke(numValueOf);
            return 2;
        }
        yield.invoke(Integer.valueOf(i13));
        return 2;
    }

    public static final int process3Utf8Bytes(byte[] bArr, int i10, int i11, b yield) {
        Integer numValueOf = Integer.valueOf(REPLACEMENT_CODE_POINT);
        n.f(bArr, "<this>");
        n.f(yield, "yield");
        int i12 = i10 + 2;
        if (i11 <= i12) {
            yield.invoke(numValueOf);
            int i13 = i10 + 1;
            return (i11 <= i13 || (bArr[i13] & 192) != 128) ? 1 : 2;
        }
        byte b10 = bArr[i10];
        byte b11 = bArr[i10 + 1];
        if ((b11 & 192) != 128) {
            yield.invoke(numValueOf);
            return 1;
        }
        byte b12 = bArr[i12];
        if ((b12 & 192) != 128) {
            yield.invoke(numValueOf);
            return 2;
        }
        int i14 = ((b12 ^ (-123008)) ^ (b11 << 6)) ^ (b10 << 12);
        if (i14 < 2048) {
            yield.invoke(numValueOf);
            return 3;
        }
        if (55296 > i14 || i14 >= 57344) {
            yield.invoke(Integer.valueOf(i14));
            return 3;
        }
        yield.invoke(numValueOf);
        return 3;
    }

    public static final int process4Utf8Bytes(byte[] bArr, int i10, int i11, b yield) {
        Integer numValueOf = Integer.valueOf(REPLACEMENT_CODE_POINT);
        n.f(bArr, "<this>");
        n.f(yield, "yield");
        int i12 = i10 + 3;
        if (i11 <= i12) {
            yield.invoke(numValueOf);
            int i13 = i10 + 1;
            if (i11 <= i13 || (bArr[i13] & 192) != 128) {
                return 1;
            }
            int i14 = i10 + 2;
            return (i11 <= i14 || (bArr[i14] & 192) != 128) ? 2 : 3;
        }
        byte b10 = bArr[i10];
        byte b11 = bArr[i10 + 1];
        if ((b11 & 192) != 128) {
            yield.invoke(numValueOf);
            return 1;
        }
        byte b12 = bArr[i10 + 2];
        if ((b12 & 192) != 128) {
            yield.invoke(numValueOf);
            return 2;
        }
        byte b13 = bArr[i12];
        if ((b13 & 192) != 128) {
            yield.invoke(numValueOf);
            return 3;
        }
        int i15 = (((b13 ^ 3678080) ^ (b12 << 6)) ^ (b11 << 12)) ^ (b10 << 18);
        if (i15 > 1114111) {
            yield.invoke(numValueOf);
            return 4;
        }
        if (55296 <= i15 && i15 < 57344) {
            yield.invoke(numValueOf);
            return 4;
        }
        if (i15 < 65536) {
            yield.invoke(numValueOf);
            return 4;
        }
        yield.invoke(Integer.valueOf(i15));
        return 4;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0047  */
    public static final void processUtf16Chars(byte[] bArr, int i10, int i11, b yield) {
        Character chValueOf = Character.valueOf(REPLACEMENT_CHARACTER);
        n.f(bArr, "<this>");
        n.f(yield, "yield");
        while (i10 < i11) {
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                yield.invoke(Character.valueOf((char) b10));
                i10++;
                while (i10 < i11) {
                    byte b11 = bArr[i10];
                    if (b11 < 0) {
                        break;
                    }
                    i10++;
                    yield.invoke(Character.valueOf((char) b11));
                }
            } else {
                int i12 = 2;
                if ((b10 >> 5) == -2) {
                    int i13 = i10 + 1;
                    if (i11 > i13) {
                        byte b12 = bArr[i13];
                        if ((b12 & 192) == 128) {
                            int i14 = (b10 << 6) ^ (b12 ^ 3968);
                            yield.invoke(Character.valueOf(i14 < 128 ? (char) REPLACEMENT_CODE_POINT : (char) i14));
                        }
                        i10 += i12;
                    }
                    yield.invoke(Character.valueOf((char) REPLACEMENT_CODE_POINT));
                    i12 = 1;
                    i10 += i12;
                } else if ((b10 >> 4) == -2) {
                    int i15 = i10 + 2;
                    if (i11 <= i15) {
                        yield.invoke(Character.valueOf((char) REPLACEMENT_CODE_POINT));
                        int i16 = i10 + 1;
                        if (i11 <= i16 || (bArr[i16] & 192) != 128) {
                            i12 = 1;
                        }
                    } else {
                        byte b13 = bArr[i10 + 1];
                        if ((b13 & 192) == 128) {
                            byte b14 = bArr[i15];
                            if ((b14 & 192) == 128) {
                                int i17 = (b10 << 12) ^ ((b14 ^ (-123008)) ^ (b13 << 6));
                                yield.invoke(Character.valueOf((i17 >= 2048 && (55296 > i17 || i17 >= 57344)) ? (char) i17 : (char) REPLACEMENT_CODE_POINT));
                                i12 = 3;
                            } else {
                                yield.invoke(Character.valueOf((char) REPLACEMENT_CODE_POINT));
                            }
                        } else {
                            yield.invoke(Character.valueOf((char) REPLACEMENT_CODE_POINT));
                            i12 = 1;
                        }
                    }
                    i10 += i12;
                } else if ((b10 >> 3) == -2) {
                    int i18 = i10 + 3;
                    if (i11 <= i18) {
                        yield.invoke(chValueOf);
                        int i19 = i10 + 1;
                        if (i11 <= i19 || (bArr[i19] & 192) != 128) {
                            i12 = 1;
                        } else {
                            int i20 = i10 + 2;
                            if (i11 > i20 && (bArr[i20] & 192) == 128) {
                                i12 = 3;
                            }
                        }
                    } else {
                        byte b15 = bArr[i10 + 1];
                        if ((b15 & 192) == 128) {
                            byte b16 = bArr[i10 + 2];
                            if ((b16 & 192) == 128) {
                                byte b17 = bArr[i18];
                                if ((b17 & 192) == 128) {
                                    int i21 = (b10 << 18) ^ (((b17 ^ 3678080) ^ (b16 << 6)) ^ (b15 << 12));
                                    if (i21 <= 1114111 && ((55296 > i21 || i21 >= 57344) && i21 >= 65536 && i21 != 65533)) {
                                        yield.invoke(Character.valueOf((char) ((i21 >>> 10) + HIGH_SURROGATE_HEADER)));
                                        yield.invoke(Character.valueOf((char) ((i21 & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) + LOG_SURROGATE_HEADER)));
                                    } else {
                                        yield.invoke(chValueOf);
                                    }
                                    i12 = 4;
                                } else {
                                    yield.invoke(chValueOf);
                                    i12 = 3;
                                }
                            } else {
                                yield.invoke(chValueOf);
                            }
                        } else {
                            yield.invoke(chValueOf);
                            i12 = 1;
                        }
                    }
                    i10 += i12;
                } else {
                    yield.invoke(chValueOf);
                    i10++;
                }
            }
        }
    }

    public static final void processUtf8Bytes(String str, int i10, int i11, b yield) {
        int i12;
        char cCharAt;
        n.f(str, "<this>");
        n.f(yield, "yield");
        while (i10 < i11) {
            char cCharAt2 = str.charAt(i10);
            if (n.h(cCharAt2, 128) < 0) {
                yield.invoke(Byte.valueOf((byte) cCharAt2));
                i10++;
                while (i10 < i11 && n.h(str.charAt(i10), 128) < 0) {
                    yield.invoke(Byte.valueOf((byte) str.charAt(i10)));
                    i10++;
                }
            } else {
                if (n.h(cCharAt2, a.f29616n) < 0) {
                    yield.invoke(Byte.valueOf((byte) ((cCharAt2 >> 6) | PsExtractor.AUDIO_STREAM)));
                    yield.invoke(Byte.valueOf((byte) ((cCharAt2 & '?') | 128)));
                } else if (55296 > cCharAt2 || cCharAt2 >= 57344) {
                    yield.invoke(Byte.valueOf((byte) ((cCharAt2 >> '\f') | 224)));
                    yield.invoke(Byte.valueOf((byte) (((cCharAt2 >> 6) & 63) | 128)));
                    yield.invoke(Byte.valueOf((byte) ((cCharAt2 & '?') | 128)));
                } else if (n.h(cCharAt2, 56319) > 0 || i11 <= (i12 = i10 + 1) || 56320 > (cCharAt = str.charAt(i12)) || cCharAt >= 57344) {
                    yield.invoke(Byte.valueOf(REPLACEMENT_BYTE));
                } else {
                    int iCharAt = (str.charAt(i12) + (cCharAt2 << '\n')) - 56613888;
                    yield.invoke(Byte.valueOf((byte) ((iCharAt >> 18) | PsExtractor.VIDEO_STREAM_MASK)));
                    yield.invoke(Byte.valueOf((byte) (((iCharAt >> 12) & 63) | 128)));
                    yield.invoke(Byte.valueOf((byte) (((iCharAt >> 6) & 63) | 128)));
                    yield.invoke(Byte.valueOf((byte) ((iCharAt & 63) | 128)));
                    i10 += 2;
                }
                i10++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0040  */
    public static final void processUtf8CodePoints(byte[] bArr, int i10, int i11, b yield) {
        Integer numValueOf = Integer.valueOf(REPLACEMENT_CODE_POINT);
        n.f(bArr, "<this>");
        n.f(yield, "yield");
        while (i10 < i11) {
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                yield.invoke(Integer.valueOf(b10));
                i10++;
                while (i10 < i11) {
                    byte b11 = bArr[i10];
                    if (b11 < 0) {
                        break;
                    }
                    i10++;
                    yield.invoke(Integer.valueOf(b11));
                }
            } else {
                int i12 = 2;
                if ((b10 >> 5) == -2) {
                    int i13 = i10 + 1;
                    if (i11 > i13) {
                        byte b12 = bArr[i13];
                        if ((b12 & 192) == 128) {
                            int i14 = (b10 << 6) ^ (b12 ^ 3968);
                            if (i14 < 128) {
                                yield.invoke(numValueOf);
                            } else {
                                yield.invoke(Integer.valueOf(i14));
                            }
                        }
                        i10 += i12;
                    }
                    yield.invoke(numValueOf);
                    i12 = 1;
                    i10 += i12;
                } else if ((b10 >> 4) == -2) {
                    int i15 = i10 + 2;
                    if (i11 <= i15) {
                        yield.invoke(numValueOf);
                        int i16 = i10 + 1;
                        if (i11 <= i16 || (bArr[i16] & 192) != 128) {
                            i12 = 1;
                        }
                    } else {
                        byte b13 = bArr[i10 + 1];
                        if ((b13 & 192) == 128) {
                            byte b14 = bArr[i15];
                            if ((b14 & 192) == 128) {
                                int i17 = (b10 << 12) ^ ((b14 ^ (-123008)) ^ (b13 << 6));
                                if (i17 >= 2048 && (55296 > i17 || i17 >= 57344)) {
                                    yield.invoke(Integer.valueOf(i17));
                                } else {
                                    yield.invoke(numValueOf);
                                }
                                i12 = 3;
                            } else {
                                yield.invoke(numValueOf);
                            }
                        } else {
                            yield.invoke(numValueOf);
                            i12 = 1;
                        }
                    }
                    i10 += i12;
                } else if ((b10 >> 3) == -2) {
                    int i18 = i10 + 3;
                    if (i11 <= i18) {
                        yield.invoke(numValueOf);
                        int i19 = i10 + 1;
                        if (i11 <= i19 || (bArr[i19] & 192) != 128) {
                            i12 = 1;
                        } else {
                            int i20 = i10 + 2;
                            if (i11 > i20 && (bArr[i20] & 192) == 128) {
                                i12 = 3;
                            }
                        }
                    } else {
                        byte b15 = bArr[i10 + 1];
                        if ((b15 & 192) == 128) {
                            byte b16 = bArr[i10 + 2];
                            if ((b16 & 192) == 128) {
                                byte b17 = bArr[i18];
                                if ((b17 & 192) == 128) {
                                    int i21 = (b10 << 18) ^ (((b17 ^ 3678080) ^ (b16 << 6)) ^ (b15 << 12));
                                    if (i21 <= 1114111 && ((55296 > i21 || i21 >= 57344) && i21 >= 65536)) {
                                        yield.invoke(Integer.valueOf(i21));
                                    } else {
                                        yield.invoke(numValueOf);
                                    }
                                    i12 = 4;
                                } else {
                                    yield.invoke(numValueOf);
                                    i12 = 3;
                                }
                            } else {
                                yield.invoke(numValueOf);
                            }
                        } else {
                            yield.invoke(numValueOf);
                            i12 = 1;
                        }
                    }
                    i10 += i12;
                } else {
                    yield.invoke(numValueOf);
                    i10++;
                }
            }
        }
    }

    public static final long size(String str) {
        n.f(str, "<this>");
        return size$default(str, 0, 0, 3, null);
    }

    public static /* synthetic */ long size$default(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return size(str, i10, i11);
    }

    public static final long size(String str, int i10) {
        n.f(str, "<this>");
        return size$default(str, i10, 0, 2, null);
    }

    public static final long size(String str, int i10, int i11) {
        int i12;
        n.f(str, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(d.e(i10, "beginIndex < 0: ").toString());
        }
        if (i11 >= i10) {
            if (i11 > str.length()) {
                StringBuilder sbU = e.u(i11, "endIndex > string.length: ", " > ");
                sbU.append(str.length());
                throw new IllegalArgumentException(sbU.toString().toString());
            }
            long j10 = 0;
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (cCharAt < 128) {
                    j10++;
                } else {
                    if (cCharAt < 2048) {
                        i12 = 2;
                    } else if (cCharAt < 55296 || cCharAt > 57343) {
                        i12 = 3;
                    } else {
                        int i13 = i10 + 1;
                        char cCharAt2 = i13 < i11 ? str.charAt(i13) : (char) 0;
                        if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                            j10++;
                            i10 = i13;
                        } else {
                            j10 += (long) 4;
                            i10 += 2;
                        }
                    }
                    j10 += (long) i12;
                }
                i10++;
            }
            return j10;
        }
        throw new IllegalArgumentException(e.g(i11, i10, "endIndex < beginIndex: ", " < ").toString());
    }
}
