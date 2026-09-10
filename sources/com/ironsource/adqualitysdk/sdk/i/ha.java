package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC0435l1;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.MBridgeSDK;
import com.mintegral.msdk.MIntegralSDK;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class ha {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class a extends gt {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static int f2264 = 0;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f2266 = 1;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static char[] f2263 = {'c', 29252, 58427, 22191, 51393, 15029, 44400, 8004, 37180, 996, 30155, 59383, 23145, 52316, 15934, 45294, 8862, 38038, 1860, 31043, 60213, 24035, 53205, 16824, 46171, 9847, 38933, 'm', 29250, 58424, 22261, 51401, 15024, 44400, 8012, 37172};

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static long f2265 = -8812005333178027477L;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static String m2268(char c4, int i10, int i11) {
            String str;
            synchronized (c.f1153) {
                try {
                    char[] cArr = new char[i11];
                    c.f1154 = 0;
                    while (true) {
                        int i12 = c.f1154;
                        if (i12 < i11) {
                            cArr[i12] = (char) ((((long) f2263[i10 + i12]) ^ (((long) i12) * f2265)) ^ ((long) c4));
                            c.f1154 = i12 + 1;
                        } else {
                            str = new String(cArr);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* JADX INFO: renamed from: ﻛ */
        public final String mo2240() {
            char cRgb;
            int longPressTimeout;
            int packedPositionType;
            int i10 = f2266 + 53;
            f2264 = i10 % 128;
            if (i10 % 2 != 0) {
                cRgb = (char) (Color.rgb(0, 0, 1) - 16777216);
                longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) * 4;
                packedPositionType = ExpandableListView.getPackedPositionType(1L) + 124;
            } else {
                cRgb = (char) ((-16777216) - Color.rgb(0, 0, 0));
                longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 27;
                packedPositionType = ExpandableListView.getPackedPositionType(0L) + 9;
            }
            String strIntern = m2268(cRgb, longPressTimeout, packedPositionType).intern();
            f2264 = (f2266 + 19) % 128;
            return strIntern;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* JADX INFO: renamed from: ｋ */
        public final be mo2241() {
            bw.b bVar = new bw.b(mo2240());
            int i10 = f2266 + 1;
            f2264 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 98 / 0;
            }
            return bVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* JADX INFO: renamed from: ﾇ */
        public final String mo2242() {
            f2266 = (f2264 + 3) % 128;
            String strIntern = m2268((char) View.resolveSize(0, 0), ExpandableListView.getPackedPositionType(0L), View.resolveSize(0, 0) + 27).intern();
            int i10 = f2266 + 13;
            f2264 = i10 % 128;
            if (i10 % 2 == 0) {
                return strIntern;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* JADX INFO: renamed from: ﾒ */
        public final Class mo2243() {
            int i10 = (f2266 + 61) % 128;
            f2264 = i10;
            f2266 = (i10 + 13) % 128;
            return MBridgeSDK.class;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class d extends gt {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static long f2267 = 2221895149448900824L;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f2268 = 1;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static int f2269;

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* JADX INFO: renamed from: ﻛ */
        public final String mo2240() {
            int i10 = f2269 + InterfaceC0435l1.d.b.f29109f;
            f2268 = i10 % 128;
            return m2269("낵뛈뱄ꏇ\ua959郢陼鷶荼", i10 % 2 == 0 ? 1128 % ExpandableListView.getPackedPositionChild(0L) : 1656 - ExpandableListView.getPackedPositionChild(0L)).intern();
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* JADX INFO: renamed from: ｋ */
        public final be mo2241() {
            bw.a aVar = new bw.a(mo2240());
            f2268 = (f2269 + 99) % 128;
            return aVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* JADX INFO: renamed from: ﾇ */
        public final String mo2242() {
            int i10 = f2269 + 87;
            f2268 = i10 % 128;
            return m2269("낻묀ꟛ鏓鹩訢\uf6fc\ue2ad\ued05\ud9d0얌つ㰠⢽ᒷἒௌ瞔戨渀嫝䚵넖뷌ꦗ鑵耯賹\uf88f\ue327\uefe1", i10 % 2 == 0 ? 29809 << ImageFormat.getBitsPerPixel(0) : ImageFormat.getBitsPerPixel(0) + IronSourceError.ERROR_CAPPING_VALIDATION_FAILED).intern();
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* JADX INFO: renamed from: ﾒ */
        public final Class mo2243() {
            int i10 = f2269 + 57;
            f2268 = i10 % 128;
            if (i10 % 2 != 0) {
                return MIntegralSDK.class;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m2269(String str, int i10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (i.f2435) {
                try {
                    i.f2436 = i10;
                    char[] cArr2 = new char[cArr.length];
                    i.f2434 = 0;
                    while (true) {
                        int i11 = i.f2434;
                        if (i11 < cArr.length) {
                            cArr2[i11] = (char) (((long) (cArr[i11] ^ (i.f2436 * i11))) ^ f2267);
                            i.f2434++;
                        } else {
                            str2 = new String(cArr2);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str2;
        }
    }

    public ha() {
    }

    public ha(Context context) {
        context.getApplicationContext();
    }
}
