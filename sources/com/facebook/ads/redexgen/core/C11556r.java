package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import com.facebook.ads.NativeAd;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C11556r extends C1337Ek {
    public static byte[] A0F;
    public static String[] A0G = {"Cb7nBOTqt", "Uv90YERdy9SZ9btNePue9j4WSufKww0d", "5tFdsnJl1aHC8QazlewrqKxrXvRcdsO5", "4XUHzfDXngka", "6zmG8GCKaenNI", "iTvfTfiU680tAW5ZUJpNe0fUcB62AaOp", "iIjhxtVkNHrsB", "9VdyyBhNHsky"};
    public static final String A0H;
    public Uri A00;
    public NativeAd A01;
    public VA A02;
    public InterfaceC1855Yv A03;
    public C1347Eu A04;
    public C4L A05;
    public String A06;
    public String A07;
    public String A08;
    public final NL A09;
    public final C2300gi A0A;
    public final EA A0B;
    public final E4 A0C;
    public final E2 A0D;
    public final String A0E;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            byte b2 = bArrCopyOfRange[i5];
            if (A0G[0].length() == 17) {
                throw new RuntimeException();
            }
            A0G[2] = "GV7dEmS9dQikFIsLGq03TvmmBp0PGqms";
            bArrCopyOfRange[i5] = (byte) ((b2 ^ i4) ^ 4);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A0F = new byte[]{32, 2, 13, 68, 23, 67, 16, 23, 2, 17, 23, 67, 34, 22, 7, 10, 6, 13, 0, 6, 45, 6, 23, 20, 12, 17, 8, 34, 0, 23, 10, 21, 10, 23, 26, 77, 67, 46, 2, 8, 6, 67, 16, 22, 17, 6, 67, 23, 11, 2, 23, 67, 10, 23, 68, 16, 67, 10, 13, 67, 26, 12, 22, 17, 67, 34, 13, 7, 17, 12, 10, 7, 46, 2, 13, 10, 5, 6, 16, 23, 77, 27, 14, 15, 67, 5, 10, 15, 6, 77, 29, 42, 42, 55, 42, 98, 120, 35, 39, 36, 16, 1, 12, 0, 11, 6, 0, 43, 0, 17, 18, 10, 23, 14, 21, 45, 43, 44, 120, 43, 61, 44, 27, 52, 49, 61, 54, 44, 12, 55, 51, 61, 54, 120, 62, 49, 42, 43, 44, 3, 59, 61, 58, 110, 61, 43, 58, 24, 39, 42, 43, 33, 27, 28, 7, 110, 33, 60, 110, 61, 43, 58, 24, 39, 42, 43, 33, 3, 30, 10, 110, 40, 39, 60, 61, 58, 30, 17, 32, 30, 28, 11, 22, 9, 22, 11, 6, 51, 60, 57, 53, 62, 36, 4, 63, 59, 53, 62, 62, 47, 60, 61, 39, 32, 41, 23, 21, 2, 3, 2, 1, 14, 9, 2, 3, 40, 21, 14, 2, 9, 19, 6, 19, 14, 8, 9, 44, 2, 30, 86, 77, 74, 82, 86, 70, 106, 71, 42, 44, 58, 17, 62, 43, 54, 41, 58, 28, 43, 62, 29, 42, 43, 43, 48, 49, 117, 106, 103, 102, 108, 79, 108, 100, 100, 102, 113, 85, 74, 71, 70, 76, 110, 115, 103, 66, 93, 80, 81, 91, 103, 81, 81, 95, 96, 93, 89, 81, 99, 124, 113, 112, 122, 64, 71, 89, 17, 14, 3, 2, 8, 56, 19, 14, 10, 2, 56, 23, 8, 11, 11, 14, 9, 0, 56, 14, 9, 19, 2, 21, 17, 6, 11, 19, 12, 0, 18, 49, 28, 21, 0};
    }

    static {
        A03();
        A0H = C11556r.class.getSimpleName();
    }

    public C11556r(C2300gi c2300gi) {
        super(c2300gi);
        this.A0E = UUID.randomUUID().toString();
        this.A0D = new E2() { // from class: com.facebook.ads.redexgen.X.6u
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(E3 e3) {
                if (this.A00.A03 != null) {
                    this.A00.A03.AFC();
                }
            }
        };
        this.A0C = new E4() { // from class: com.facebook.ads.redexgen.X.6t
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C4B c4b) {
                if (this.A00.A03 != null) {
                    this.A00.A03.onPause();
                }
            }
        };
        this.A0B = new EA() { // from class: com.facebook.ads.redexgen.X.6s
            public static String[] A01 = {"NidaN7FoPBbaKg721Bw4T4ZedkUEC8Kp", "T6", "FoXhB5efLBt1Ix1VLvHMf2xPaJTvayS4", "Ki7KmbouuPEeN63k7Tf8VIoYM6z8lFxL", "sQ99pP", "JVozQuP1BqTf", "NfzwiYkR35AXK2rv0hn4uIoCH9D93AVk", "I59WEHRkBvEx"};

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C4K c4k) {
                if (this.A00.A03 != null) {
                    this.A00.A03.ADQ();
                    if (A01[3].charAt(11) == 'F') {
                        throw new RuntimeException();
                    }
                    A01[3] = "dba5oiQ8v4CkqUII5uWz8sPENBYPSf9M";
                }
            }
        };
        this.A09 = new NL(this, c2300gi);
        this.A0A = c2300gi;
        A02();
    }

    public C11556r(C2300gi c2300gi, AttributeSet attributeSet) {
        super(c2300gi, attributeSet);
        this.A0E = UUID.randomUUID().toString();
        this.A0D = new E2() { // from class: com.facebook.ads.redexgen.X.6u
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(E3 e3) {
                if (this.A00.A03 != null) {
                    this.A00.A03.AFC();
                }
            }
        };
        this.A0C = new E4() { // from class: com.facebook.ads.redexgen.X.6t
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C4B c4b) {
                if (this.A00.A03 != null) {
                    this.A00.A03.onPause();
                }
            }
        };
        this.A0B = new EA() { // from class: com.facebook.ads.redexgen.X.6s
            public static String[] A01 = {"NidaN7FoPBbaKg721Bw4T4ZedkUEC8Kp", "T6", "FoXhB5efLBt1Ix1VLvHMf2xPaJTvayS4", "Ki7KmbouuPEeN63k7Tf8VIoYM6z8lFxL", "sQ99pP", "JVozQuP1BqTf", "NfzwiYkR35AXK2rv0hn4uIoCH9D93AVk", "I59WEHRkBvEx"};

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C4K c4k) {
                if (this.A00.A03 != null) {
                    this.A00.A03.ADQ();
                    if (A01[3].charAt(11) == 'F') {
                        throw new RuntimeException();
                    }
                    A01[3] = "dba5oiQ8v4CkqUII5uWz8sPENBYPSf9M";
                }
            }
        };
        this.A09 = new NL(this, c2300gi);
        this.A0A = c2300gi;
        A02();
    }

    public C11556r(C2300gi c2300gi, AttributeSet attributeSet, int i2) {
        super(c2300gi, attributeSet, i2);
        this.A0E = UUID.randomUUID().toString();
        this.A0D = new E2() { // from class: com.facebook.ads.redexgen.X.6u
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(E3 e3) {
                if (this.A00.A03 != null) {
                    this.A00.A03.AFC();
                }
            }
        };
        this.A0C = new E4() { // from class: com.facebook.ads.redexgen.X.6t
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C4B c4b) {
                if (this.A00.A03 != null) {
                    this.A00.A03.onPause();
                }
            }
        };
        this.A0B = new EA() { // from class: com.facebook.ads.redexgen.X.6s
            public static String[] A01 = {"NidaN7FoPBbaKg721Bw4T4ZedkUEC8Kp", "T6", "FoXhB5efLBt1Ix1VLvHMf2xPaJTvayS4", "Ki7KmbouuPEeN63k7Tf8VIoYM6z8lFxL", "sQ99pP", "JVozQuP1BqTf", "NfzwiYkR35AXK2rv0hn4uIoCH9D93AVk", "I59WEHRkBvEx"};

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C4K c4k) {
                if (this.A00.A03 != null) {
                    this.A00.A03.ADQ();
                    if (A01[3].charAt(11) == 'F') {
                        throw new RuntimeException();
                    }
                    A01[3] = "dba5oiQ8v4CkqUII5uWz8sPENBYPSf9M";
                }
            }
        };
        this.A09 = new NL(this, c2300gi);
        this.A0A = c2300gi;
        A02();
    }

    private void A02() {
        getEventBus().A03(this.A0D, this.A0C, this.A0B);
    }

    private void A04(Intent intent) {
        if (this.A05 == null) {
            A05(A01(114, 25, 92));
            return;
        }
        if (this.A00 == null && this.A08 == null) {
            A05(A01(139, 37, 74));
            String[] strArr = A0G;
            if (strArr[4].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            A0G[0] = "rwc2";
            return;
        }
        intent.putExtra(A01(237, 18, 91), this.A07);
        intent.putExtra(A01(322, 8, 97), WK.A09);
        intent.putExtra(A01(287, 8, 17), this.A00.toString());
        intent.putExtra(A01(187, 11, 84), this.A06 == null ? A01(0, 0, 6) : this.A06);
        intent.putExtra(A01(266, 8, 39), this.A08);
        intent.putExtra(A01(205, 24, 99), XX.A00(this.A0A));
        intent.putExtra(A01(274, 13, 48), getCurrentPositionInMillis());
        String[] strArr2 = A0G;
        if (strArr2[7].length() != strArr2[3].length()) {
            throw new RuntimeException();
        }
        A0G[0] = "bFTSk0Gp6QusC65PcsD";
        intent.putExtra(A01(229, 8, 39), this.A0E);
        intent.putExtra(A01(255, 11, 7), this.A05.A0c());
        intent.putExtra(A01(295, 27, 99), getVideoProgressReportIntervalMs());
        intent.addFlags(268435456);
    }

    private void A05(String str) {
        this.A0A.A08().ABC(A01(198, 7, 74), AbstractC1712Td.A28, new C1713Te(AdErrorType.PARSER_FAILURE.getDefaultErrorMessage(), A01(90, 7, 92) + str));
        if (AdInternalSettings.isDebugBuild()) {
            Log.w(A0H, str);
        }
    }

    public final void A0r() {
        if (this.A01 != null) {
            this.A01.onCtaBroadcast();
        }
    }

    public final void A0s() {
        AdActivityIntent adActivityIntentA05 = C1804Wu.A05(this.A0A);
        A04(adActivityIntentA05);
        try {
            A0i(false, 6);
            setVisibility(8);
            C1804Wu.A0B(this.A0A, adActivityIntentA05);
        } catch (Exception e2) {
            this.A0A.A08().ABC(A01(176, 11, 123), AbstractC1712Td.A0D, new C1713Te(e2));
            Log.e(A01(97, 17, 97), A01(0, 90, 103), e2);
        }
    }

    public InterfaceC1855Yv getListener() {
        return this.A03;
    }

    public String getUniqueId() {
        return this.A0E;
    }

    @Override // com.facebook.ads.redexgen.core.C1337Ek, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A09.A02();
    }

    @Override // com.facebook.ads.redexgen.core.C1337Ek, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.A09.A03();
        super.onDetachedFromWindow();
    }

    public void setAdEventManager(VA va) {
        this.A02 = va;
    }

    public void setClientToken(String str) {
        C4L c4l;
        if (this.A04 != null) {
            C1347Eu c1347Eu = this.A04;
            String[] strArr = A0G;
            if (strArr[5].charAt(7) == strArr[1].charAt(7)) {
                throw new RuntimeException();
            }
            A0G[2] = "geldSN57Uojbab2WOS9MzcIW4E8sQ4xA";
            c1347Eu.A07();
        }
        if (this.A05 != null) {
            this.A05.A0p();
        }
        this.A06 = str;
        C1347Eu c1347Eu2 = null;
        if (str != null) {
            c4l = new C4L(this.A0A, this.A02, this, str);
        } else {
            c4l = null;
        }
        this.A05 = c4l;
        if (this.A05 != null && C1750Up.A20(this.A0A)) {
            if (str != null) {
                c1347Eu2 = new C1347Eu(this.A0A, this.A02, this, str, false, this.A05, null);
            }
            this.A04 = c1347Eu2;
            return;
        }
        this.A04 = null;
    }

    public void setEnableBackgroundVideo(boolean z2) {
        super.A0E.setBackgroundPlaybackEnabled(z2);
    }

    public void setListener(InterfaceC1855Yv interfaceC1855Yv) {
        this.A03 = interfaceC1855Yv;
    }

    public void setNativeAd(NativeAd nativeAd) {
        this.A01 = nativeAd;
    }

    public void setVideoCTA(String str) {
        this.A07 = str;
    }

    @Override // com.facebook.ads.redexgen.core.C1337Ek
    public void setVideoMPD(String str) {
        if (str != null && this.A05 == null) {
            A05(A01(114, 25, 92));
            return;
        }
        this.A08 = str;
        String[] strArr = A0G;
        if (strArr[7].length() != strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0G;
        strArr2[4] = "ao7Mn74HmNnh4";
        strArr2[6] = "E6rOC8IWnX5Ja";
        super.setVideoMPD(str);
    }

    @Override // com.facebook.ads.redexgen.core.C1337Ek
    public void setVideoURI(Uri uri) {
        if (uri != null && this.A05 == null) {
            A05(A01(114, 25, 92));
            return;
        }
        this.A00 = uri;
        super.setVideoURI(uri);
        String[] strArr = A0G;
        if (strArr[5].charAt(7) == strArr[1].charAt(7)) {
            throw new RuntimeException();
        }
        A0G[0] = "z2OQUaNXEwktMvnJ8h1OzGBt0";
    }
}
