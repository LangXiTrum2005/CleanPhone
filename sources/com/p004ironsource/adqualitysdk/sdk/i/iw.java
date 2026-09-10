package com.p004ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.firebase.crashlytics.internal.model.a;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class iw {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2498 = 1;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static boolean f2499 = true;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2500 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2501 = 44;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f2502 = {'z', 145, 160, 163, 155, 158, 151, 'y', 141, 154, 147, 129, 142, 152, 'L', 156, 159, 143, 161, 153, 157, 149, 148, '~', 'x', 't', 144, 162, 127};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean f2503 = true;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final iz f2504;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private boolean f2505 = false;

    public interface b {
        /* JADX INFO: renamed from: ﾇ */
        iu mo2473();
    }

    public iw(Context context) {
        this.f2504 = new iz(context.getApplicationContext());
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ iz m2466(iw iwVar) {
        int i2 = f2498;
        int i3 = i2 + 15;
        f2500 = i3 % 128;
        int i4 = i3 % 2;
        iz izVar = iwVar.f2504;
        if (i4 != 0) {
            int i5 = 90 / 0;
        }
        int i6 = i2 + 115;
        f2500 = i6 % 128;
        if (i6 % 2 == 0) {
            return izVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2469(String str, int[] iArr, int i2, String str2) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes(CharEncoding.ISO_8859_1);
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (o.f2877) {
            try {
                char[] cArr2 = f2502;
                int i3 = f2501;
                if (f2499) {
                    int length = bArr.length;
                    o.f2878 = length;
                    char[] cArr3 = new char[length];
                    o.f2879 = 0;
                    while (o.f2879 < o.f2878) {
                        int i4 = o.f2879;
                        int i5 = o.f2878 - 1;
                        int i6 = o.f2879;
                        cArr3[i4] = (char) (cArr2[bArr[i5 - i6] + i2] - i3);
                        o.f2879 = i6 + 1;
                    }
                    return new String(cArr3);
                }
                if (f2503) {
                    int length2 = cArr.length;
                    o.f2878 = length2;
                    char[] cArr4 = new char[length2];
                    o.f2879 = 0;
                    while (o.f2879 < o.f2878) {
                        int i7 = o.f2879;
                        int i8 = o.f2878 - 1;
                        int i9 = o.f2879;
                        cArr4[i7] = (char) (cArr2[cArr[i8 - i9] - i2] - i3);
                        o.f2879 = i9 + 1;
                    }
                    return new String(cArr4);
                }
                int length3 = iArr.length;
                o.f2878 = length3;
                char[] cArr5 = new char[length3];
                o.f2879 = 0;
                while (o.f2879 < o.f2878) {
                    int i10 = o.f2879;
                    int i11 = o.f2878 - 1;
                    int i12 = o.f2879;
                    cArr5[i10] = (char) (cArr2[iArr[i11 - i12] - i2] - i3);
                    o.f2879 = i12 + 1;
                }
                return new String(cArr5);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m2470() {
        f2500 = (f2498 + 27) % 128;
        this.f2504.m2504();
        this.f2505 = true;
        f2498 = (f2500 + 77) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final iz m2471() {
        int i2 = (f2498 + 91) % 128;
        f2500 = i2;
        iz izVar = this.f2504;
        f2498 = (i2 + 95) % 128;
        return izVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ void m2467(iw iwVar, iy iyVar, b bVar) {
        f2498 = (f2500 + 93) % 128;
        iwVar.m2468(iyVar, bVar);
        f2500 = (f2498 + 85) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m2472(final String str, final JSONObject jSONObject, iy iyVar) {
        f2498 = (f2500 + 45) % 128;
        if (!TextUtils.isEmpty(str)) {
            m2468(iyVar, new b() { // from class: com.ironsource.adqualitysdk.sdk.i.iw.1
                @Override // com.ironsource.adqualitysdk.sdk.i.iw.b
                /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                public final iu mo2473() {
                    return iv.m2453(jSONObject, str);
                }
            });
            return;
        }
        int i2 = f2500 + 41;
        f2498 = i2 % 128;
        if (i2 % 2 == 0) {
            n.m2825(m2469(null, null, 20 / (ViewConfiguration.getWindowTouchSlop() / 33), "\u0086\u0082\u008b\u0089\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), m2469(null, null, 65 % ExpandableListView.getPackedPositionType(1L), "\u009b\u0082\u009b\u0096\u009c\u0085\u0086\u0090\u008f\u0083\u0085\u008a\u008f\u0082\u0086\u0082\u0084\u008f\u0086\u0082\u008e\u009b\u008a\u0089\u009a\u0082\u0091\u008a\u0085\u0090\u0091\u0082\u0086\u008f\u0086\u0085\u008f\u0099\u0098\u008c\u008f\u0086\u0082\u0097\u0083\u0096\u0082\u008f\u0083\u0091\u0082\u0093\u0095\u0082\u0086\u008f\u0094\u0085\u0083\u0091\u0093\u0092\u008f\u0083\u0091\u0085\u0090\u008f\u0085\u0083\u008f\u0082\u008e\u008d\u0089\u008a\u008c").intern());
        } else {
            n.m2825(m2469(null, null, (ViewConfiguration.getWindowTouchSlop() >> 8) + 127, "\u0086\u0082\u008b\u0089\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), m2469(null, null, ExpandableListView.getPackedPositionType(0L) + 127, "\u009b\u0082\u009b\u0096\u009c\u0085\u0086\u0090\u008f\u0083\u0085\u008a\u008f\u0082\u0086\u0082\u0084\u008f\u0086\u0082\u008e\u009b\u008a\u0089\u009a\u0082\u0091\u008a\u0085\u0090\u0091\u0082\u0086\u008f\u0086\u0085\u008f\u0099\u0098\u008c\u008f\u0086\u0082\u0097\u0083\u0096\u0082\u008f\u0083\u0091\u0082\u0093\u0095\u0082\u0086\u008f\u0094\u0085\u0083\u0091\u0093\u0092\u008f\u0083\u0091\u0085\u0090\u008f\u0085\u0083\u008f\u0082\u008e\u008d\u0089\u008a\u008c").intern());
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m2468(final iy iyVar, final b bVar) {
        f2500 = (f2498 + 99) % 128;
        if (this.f2505) {
            n.m2835(m2469(null, null, 127 - (ViewConfiguration.getDoubleTapTimeout() >> 16), "\u0086\u0082\u008b\u0089\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), m2469(null, null, 127 - View.resolveSizeAndState(0, 0, 0), "\u008a\u0084\u0085\u009b\u0083\u0093\u0097\u0091\u008f\u0091\u0089\u0084\u008f\u0086\u0082\u008b\u0089\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081\u008f\u008a\u0082\u0097\u0084\u008f\u0083\u0091\u0082\u0093\u0095\u0082\u0098\u0082\u0087\u0085\u009c\u008a\u0096\u008f\u0085\u0083\u008f\u009b\u0082\u0096\u0086\u0083\u008f\u0082\u008a\u0085\u0082\u0094\u0085\u009d").intern());
            return;
        }
        ju.m2663(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.iw.4

            /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
            private static int f2508 = 1;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static long f2509 = 6296192607542500884L;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static int f2510;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private void m2474(final iy iyVar2, b bVar2) {
                if (!iw.m2466(iw.this).m2507()) {
                    m2475(iyVar2, bVar2);
                    f2510 = (f2508 + 83) % 128;
                    return;
                }
                try {
                    final iu iuVarMo2473 = bVar2.mo2473();
                    if (iuVarMo2473 == null) {
                        s.m2922(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.iw.4.2

                            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                            private static int f2514 = 1;

                            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                            private static int f2515 = 0;

                            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                            private static char[] f2516 = {'G', 'o', 't', ' ', 'a', 's', 'e', 'r', 'v', AbstractJsonLexerKt.UNICODE_ESC, 'c', 'd', 'i', 'f', 'n', 'h', '2', '0', 'p', AbstractJsonLexerKt.COLON, 'H', 'I', 'J', 'K', 'L'};

                            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                            private static char f2517 = 5;

                            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                            private static String m2477(byte b2, String str, int i2) {
                                String str2;
                                Object charArray = str;
                                if (str != null) {
                                    charArray = str.toCharArray();
                                }
                                char[] cArr = (char[]) charArray;
                                synchronized (i.f2343) {
                                    try {
                                        char[] cArr2 = f2516;
                                        char c2 = f2517;
                                        char[] cArr3 = new char[i2];
                                        if (i2 % 2 != 0) {
                                            i2--;
                                            cArr3[i2] = (char) (cArr[i2] - b2);
                                        }
                                        if (i2 > 1) {
                                            i.f2348 = 0;
                                            while (true) {
                                                int i3 = i.f2348;
                                                if (i3 >= i2) {
                                                    break;
                                                }
                                                i.f2347 = cArr[i3];
                                                i.f2345 = cArr[i.f2348 + 1];
                                                if (i.f2347 == i.f2345) {
                                                    cArr3[i.f2348] = (char) (i.f2347 - b2);
                                                    cArr3[i.f2348 + 1] = (char) (i.f2345 - b2);
                                                } else {
                                                    i.f2346 = i.f2347 / c2;
                                                    i.f2342 = i.f2347 % c2;
                                                    i.f2344 = i.f2345 / c2;
                                                    i.f2341 = i.f2345 % c2;
                                                    if (i.f2342 == i.f2341) {
                                                        i.f2346 = a.b(i.f2346, c2, 1, c2);
                                                        i.f2344 = a.b(i.f2344, c2, 1, c2);
                                                        int i4 = (i.f2346 * c2) + i.f2342;
                                                        int i5 = (i.f2344 * c2) + i.f2341;
                                                        int i6 = i.f2348;
                                                        cArr3[i6] = cArr2[i4];
                                                        cArr3[i6 + 1] = cArr2[i5];
                                                    } else if (i.f2346 == i.f2344) {
                                                        i.f2342 = a.b(i.f2342, c2, 1, c2);
                                                        i.f2341 = a.b(i.f2341, c2, 1, c2);
                                                        int i7 = (i.f2346 * c2) + i.f2342;
                                                        int i8 = (i.f2344 * c2) + i.f2341;
                                                        int i9 = i.f2348;
                                                        cArr3[i9] = cArr2[i7];
                                                        cArr3[i9 + 1] = cArr2[i8];
                                                    } else {
                                                        int i10 = (i.f2346 * c2) + i.f2341;
                                                        int i11 = (i.f2344 * c2) + i.f2342;
                                                        int i12 = i.f2348;
                                                        cArr3[i12] = cArr2[i10];
                                                        cArr3[i12 + 1] = cArr2[i11];
                                                    }
                                                }
                                                i.f2348 += 2;
                                            }
                                        }
                                        str2 = new String(cArr3);
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                return str2;
                            }

                            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                            /* JADX INFO: renamed from: ﾒ */
                            public final void mo276() throws Exception {
                                int iM2450;
                                int i2 = f2514 + 59;
                                f2515 = i2 % 128;
                                if (i2 % 2 != 0) {
                                    throw null;
                                }
                                iu iuVar = iuVarMo2473;
                                if (iuVar != null) {
                                    iM2450 = iuVar.m2449().m2450();
                                    f2514 = (f2515 + 73) % 128;
                                } else {
                                    iM2450 = -1;
                                }
                                iy iyVar3 = iyVar2;
                                iu iuVar2 = iuVarMo2473;
                                StringBuilder sb = new StringBuilder();
                                sb.append(m2477((byte) (70 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), "\u0001\u0002\u0003\u0004\u0000\u0004\u0006\u0007\b\t\u0007\b\u0001\b¸¸\u0002\u0006\u0004\u0002\b\u0002\u0007\u0000\u0000\u0003\u0005\u0006\u0000\r\u0006\u0010\b\u0001\f\r¬¬\u0007\b\t\u000b\u0003\u0004\u0000\u0011\t\u0013\u0001\u0012vv\u0004\u0002\b\u0002\u000b\u0004\u0002\b\u0007\u0006\u0010\u0003\n\t\t\u0010f", 69 - (ViewConfiguration.getTouchSlop() >> 8)).intern());
                                sb.append(iM2450);
                                iyVar3.mo382(iuVar2, sb.toString());
                            }
                        });
                        return;
                    }
                    String strM2465 = iv.m2465(iuVarMo2473);
                    String strIntern = m2476("\ude5a焲胦펪捷눩역ᒌꑭ\uf721۫妒\ue955㠁", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 44866).intern();
                    StringBuilder sb = new StringBuilder();
                    sb.append(m2476("\ude53䛊\uef02ᐧ벱╁䩁\uf2b6᯿聎⢛凼\uf62bỉ蟈Ⱞ啷ﶥ戉譙㎳壴섂榕軾㜲徃쒟活鉼㫘ꌍ졑炷馶㹐ꚙ쿵琺鳃טꨬ퍪篎\ue042ऩ", 39089 - View.combineMeasuredStates(0, 0)).intern());
                    sb.append(strM2465);
                    n.m2826(strIntern, sb.toString());
                    s.m2922(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.iw.4.3
                        @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo276() throws Exception {
                            iyVar2.mo381(iuVarMo2473);
                        }
                    });
                    f2510 = (f2508 + 27) % 128;
                } catch (Exception e2) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m2476("\ude41踋纗⼥龼䱄㲒\ued77巳\u0dcd嗀ꪪᬶ쯍렚棨\ud971触禒☘隭䝱㟐\ue456哽ը\uf50bꖌሼ싹", TextUtils.lastIndexOf("", '0', 0, 0) + 20594).intern());
                    sb2.append(e2.getLocalizedMessage());
                    iyVar2.mo382(null, sb2.toString());
                }
            }

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private void m2475(final iy iyVar2, final b bVar2) {
                iw.m2466(iw.this).m2503(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.iw.4.4
                    @Override // com.p004ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ｋ */
                    public final void mo376() {
                        iw.m2466(iw.this).m2506(this);
                        iw.m2467(iw.this, iyVar2, bVar2);
                    }
                });
                int i2 = f2508 + 27;
                f2510 = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
            }

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static String m2476(String str, int i2) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (g.f2055) {
                    try {
                        g.f2056 = i2;
                        char[] cArr2 = new char[cArr.length];
                        g.f2054 = 0;
                        while (true) {
                            int i3 = g.f2054;
                            if (i3 < cArr.length) {
                                cArr2[i3] = (char) (((long) (cArr[i3] ^ (g.f2056 * i3))) ^ f2509);
                                g.f2054++;
                            } else {
                                str2 = new String(cArr2);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }

            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                int i2 = f2510 + 11;
                f2508 = i2 % 128;
                if (i2 % 2 != 0) {
                    m2474(iyVar, bVar);
                } else {
                    m2474(iyVar, bVar);
                    int i3 = 4 / 0;
                }
            }
        });
        int i2 = f2498 + 55;
        f2500 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }
}
