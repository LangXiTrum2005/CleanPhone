package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class hz extends hy {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private int f2420;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private final List<Class> f2421;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private boolean f2422;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Class f2423;

    public hz() {
        ArrayList arrayList = new ArrayList();
        this.f2421 = arrayList;
        super.mo2323();
        this.f2423 = null;
        this.f2420 = 0;
        this.f2422 = true;
        arrayList.clear();
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final int m2329() {
        return this.f2420;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final boolean m2330() {
        return this.f2422;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final List<Class> m2331() {
        return this.f2421;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final Class m2332() {
        return this.f2423;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.hy
    /* JADX INFO: renamed from: ﾇ */
    public final void mo2323() {
        super.mo2323();
        this.f2423 = null;
        this.f2420 = 0;
        this.f2422 = true;
        this.f2421.clear();
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class d extends hy.e implements ch {

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static int f2425 = 1;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static short[] f2426 = null;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static int f2428 = 0;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static int f2430 = 609678762;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static int f2431 = 111;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static int f2432 = 1377972141;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private hz f2433 = new hz();

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static byte[] f2429 = {-76, 71, 97, -107, 89, -83, -73, -75, 103, -94, 77, -80, -64, 55, -56, 51, -20, 25, -56, 49, 55, -27, 11, -19, -19, 15, -41, 50, -1, 5, -27, -23, 24, -25, 25, -31, 17, -58, 13, -28, -25, 44, 62, -39, 37, -35, 33, -39, -41, 14, -55, 9, -51, 41, -35, 61, -48, -34, 7, -6, 6, -5, -78, 75, -72, 70, -74, 72, 78, 76, 108, -83, -75, 74, -79, 110, 52, -113, -58, 52, -57, 60, -53, 126, -120, -36, 62, -58, 32, -64, 125, -127, -52, 53, -58, 56, -56, 54, 48, 50, 18, -45, -53, 52, -49, 16, 21, -118, -54, 54, -58, -52, 33, -51, -34, 32, 118, -120, -54, 48, 50, -62, 100, -99, 48, -50, 51, 30, 0, 0, 0, 0, 0, 0, 0};

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static char f2427 = 5;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static char[] f2424 = {'s', 'e', 'a', 'r', 'c', 'h', 'F', 'o', 'E', 'x', 't', 'T', 'y', 'p', 'd', 'M', 'i', 'f', 'I', 'n', 'l', 'u', 'g', 'b', '\''};

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private d m2336(Class cls) {
            int i10 = f2428 + 19;
            f2425 = i10 % 128;
            if (i10 % 2 == 0) {
                this.f2433.f2421.add(cls);
                throw null;
            }
            this.f2433.f2421.add(cls);
            f2425 = (f2428 + 5) % 128;
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private d m2338(int i10) {
            f2425 = (f2428 + 51) % 128;
            this.f2433.f2420 = i10;
            f2428 = (f2425 + 91) % 128;
            return this;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final d m2341(int i10) {
            int i11 = (f2428 + 119) % 128;
            f2425 = i11;
            hz hzVar = this.f2433;
            hzVar.f2416 = i10 | hzVar.f2416;
            f2428 = (i11 + 47) % 128;
            return this;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final d m2342(Class cls) {
            f2428 = (f2425 + 1) % 128;
            this.f2433.f2423 = cls;
            int i10 = f2425 + 25;
            f2428 = i10 % 128;
            if (i10 % 2 == 0) {
                return this;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final d m2343(int i10) {
            int i11 = f2428 + 99;
            f2425 = i11 % 128;
            int i12 = i11 % 2;
            hz hzVar = this.f2433;
            hzVar.f2417 = i10 | hzVar.f2417;
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private d m2335() {
            int i10 = f2428 + 83;
            f2425 = i10 % 128;
            if (i10 % 2 != 0) {
                this.f2433.mo2323();
                int i11 = f2425 + 39;
                f2428 = i11 % 128;
                if (i11 % 2 == 0) {
                    return this;
                }
                throw null;
            }
            this.f2433.mo2323();
            throw null;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private d m2334(boolean z10) {
            f2428 = (f2425 + 57) % 128;
            this.f2433.f2422 = z10;
            f2428 = (f2425 + InterfaceC0435l1.d.b.f29114k) % 128;
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private d m2339(boolean z10, int i10) {
            int i11 = f2428;
            f2425 = (i11 + 47) % 128;
            hz hzVar = this.f2433;
            hzVar.f2419 = z10;
            hzVar.f2418 = i10;
            f2425 = (i11 + 63) % 128;
            return this;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final hz m2344() {
            int i10 = f2425 + 45;
            f2428 = i10 % 128;
            int i11 = i10 % 2;
            hz hzVar = this.f2433;
            if (i11 != 0) {
                int i12 = 2 / 0;
            }
            return hzVar;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static String m2337(short s10, int i10, int i11, int i12, byte b10) {
            String string;
            synchronized (n.f3070) {
                try {
                    StringBuilder sb2 = new StringBuilder();
                    int i13 = f2431;
                    int i14 = i11 + i13;
                    int i15 = i14 == -1 ? 1 : 0;
                    if (i15 != 0) {
                        byte[] bArr = f2429;
                        if (bArr != null) {
                            i14 = (byte) (bArr[f2432 + i12] + i13);
                        } else {
                            i14 = (short) (f2426[f2432 + i12] + i13);
                        }
                    }
                    if (i14 > 0) {
                        n.f3072 = ((i12 + i14) - 2) + f2432 + i15;
                        n.f3073 = b10;
                        char c4 = (char) (i10 + f2430);
                        n.f3074 = c4;
                        sb2.append(c4);
                        n.f3075 = n.f3074;
                        n.f3071 = 1;
                        while (n.f3071 < i14) {
                            byte[] bArr2 = f2429;
                            if (bArr2 != null) {
                                int i16 = n.f3072;
                                n.f3072 = i16 - 1;
                                n.f3074 = (char) (n.f3075 + (((byte) (bArr2[i16] + s10)) ^ n.f3073));
                            } else {
                                short[] sArr = f2426;
                                int i17 = n.f3072;
                                n.f3072 = i17 - 1;
                                n.f3074 = (char) (n.f3075 + (((short) (sArr[i17] + s10)) ^ n.f3073));
                            }
                            sb2.append(n.f3074);
                            n.f3075 = n.f3074;
                            n.f3071++;
                        }
                    }
                    string = sb2.toString();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return string;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0065 A[PHI: r12 r19
  0x0065: PHI (r12v9 float) = (r12v54 float), (r12v55 float) binds: [B:10:0x0063, B:46:0x0206] A[DONT_GENERATE, DONT_INLINE]
  0x0065: PHI (r19v4 int) = (r19v3 int), (r19v5 int) binds: [B:10:0x0063, B:46:0x0206] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:49:0x020d A[PHI: r12 r19
  0x020d: PHI (r12v32 float) = 
  (r12v39 float)
  (r12v40 float)
  (r12v41 float)
  (r12v42 float)
  (r12v34 float)
  (r12v43 float)
  (r12v44 float)
  (r12v36 float)
  (r12v38 float)
  (r12v2 float)
 binds: [B:10:0x0063, B:44:0x01fa, B:41:0x01d7, B:38:0x019f, B:35:0x0162, B:28:0x0130, B:24:0x00ef, B:20:0x00b1, B:17:0x0090, B:6:0x0024] A[DONT_GENERATE, DONT_INLINE]
  0x020d: PHI (r19v14 int) = 
  (r19v3 int)
  (r19v5 int)
  (r19v6 int)
  (r19v7 int)
  (r19v8 int)
  (r19v9 int)
  (r19v10 int)
  (r19v11 int)
  (r19v12 int)
  (r19v15 int)
 binds: [B:10:0x0063, B:44:0x01fa, B:41:0x01d7, B:38:0x019f, B:35:0x0162, B:28:0x0130, B:24:0x00ef, B:20:0x00b1, B:17:0x0090, B:6:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:52:0x0218 A[Catch: Exception -> 0x0068, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0068, blocks: (B:52:0x0218, B:9:0x0057, B:16:0x0071, B:19:0x0094, B:23:0x00c0, B:27:0x00ff, B:34:0x0147, B:37:0x0168, B:40:0x01a3, B:43:0x01db), top: B:94:0x0021 }] */
        /* JADX WARN: Code duplicated, block: B:57:0x025d A[Catch: Exception -> 0x025a, TryCatch #1 {Exception -> 0x025a, blocks: (B:54:0x024e, B:57:0x025d, B:59:0x0264, B:61:0x026b, B:63:0x0278, B:67:0x0296, B:68:0x029a, B:70:0x02a2, B:72:0x02a9, B:69:0x029d, B:74:0x02ae, B:76:0x02bf, B:80:0x02d9, B:82:0x02e8, B:84:0x02f9), top: B:93:0x0215 }] */
        /* JADX WARN: Code duplicated, block: B:59:0x0264 A[Catch: Exception -> 0x025a, TryCatch #1 {Exception -> 0x025a, blocks: (B:54:0x024e, B:57:0x025d, B:59:0x0264, B:61:0x026b, B:63:0x0278, B:67:0x0296, B:68:0x029a, B:70:0x02a2, B:72:0x02a9, B:69:0x029d, B:74:0x02ae, B:76:0x02bf, B:80:0x02d9, B:82:0x02e8, B:84:0x02f9), top: B:93:0x0215 }] */
        /* JADX WARN: Code duplicated, block: B:61:0x026b A[Catch: Exception -> 0x025a, TryCatch #1 {Exception -> 0x025a, blocks: (B:54:0x024e, B:57:0x025d, B:59:0x0264, B:61:0x026b, B:63:0x0278, B:67:0x0296, B:68:0x029a, B:70:0x02a2, B:72:0x02a9, B:69:0x029d, B:74:0x02ae, B:76:0x02bf, B:80:0x02d9, B:82:0x02e8, B:84:0x02f9), top: B:93:0x0215 }] */
        /* JADX WARN: Code duplicated, block: B:63:0x0278 A[Catch: Exception -> 0x025a, TRY_LEAVE, TryCatch #1 {Exception -> 0x025a, blocks: (B:54:0x024e, B:57:0x025d, B:59:0x0264, B:61:0x026b, B:63:0x0278, B:67:0x0296, B:68:0x029a, B:70:0x02a2, B:72:0x02a9, B:69:0x029d, B:74:0x02ae, B:76:0x02bf, B:80:0x02d9, B:82:0x02e8, B:84:0x02f9), top: B:93:0x0215 }] */
        /* JADX WARN: Code duplicated, block: B:65:0x028a  */
        /* JADX WARN: Code duplicated, block: B:67:0x0296 A[Catch: Exception -> 0x025a, TRY_ENTER, TryCatch #1 {Exception -> 0x025a, blocks: (B:54:0x024e, B:57:0x025d, B:59:0x0264, B:61:0x026b, B:63:0x0278, B:67:0x0296, B:68:0x029a, B:70:0x02a2, B:72:0x02a9, B:69:0x029d, B:74:0x02ae, B:76:0x02bf, B:80:0x02d9, B:82:0x02e8, B:84:0x02f9), top: B:93:0x0215 }] */
        /* JADX WARN: Code duplicated, block: B:69:0x029d A[Catch: Exception -> 0x025a, TryCatch #1 {Exception -> 0x025a, blocks: (B:54:0x024e, B:57:0x025d, B:59:0x0264, B:61:0x026b, B:63:0x0278, B:67:0x0296, B:68:0x029a, B:70:0x02a2, B:72:0x02a9, B:69:0x029d, B:74:0x02ae, B:76:0x02bf, B:80:0x02d9, B:82:0x02e8, B:84:0x02f9), top: B:93:0x0215 }] */
        /* JADX WARN: Code duplicated, block: B:71:0x02a7  */
        /* JADX WARN: Code duplicated, block: B:74:0x02ae A[Catch: Exception -> 0x025a, TryCatch #1 {Exception -> 0x025a, blocks: (B:54:0x024e, B:57:0x025d, B:59:0x0264, B:61:0x026b, B:63:0x0278, B:67:0x0296, B:68:0x029a, B:70:0x02a2, B:72:0x02a9, B:69:0x029d, B:74:0x02ae, B:76:0x02bf, B:80:0x02d9, B:82:0x02e8, B:84:0x02f9), top: B:93:0x0215 }] */
        /* JADX WARN: Code duplicated, block: B:76:0x02bf A[Catch: Exception -> 0x025a, TRY_LEAVE, TryCatch #1 {Exception -> 0x025a, blocks: (B:54:0x024e, B:57:0x025d, B:59:0x0264, B:61:0x026b, B:63:0x0278, B:67:0x0296, B:68:0x029a, B:70:0x02a2, B:72:0x02a9, B:69:0x029d, B:74:0x02ae, B:76:0x02bf, B:80:0x02d9, B:82:0x02e8, B:84:0x02f9), top: B:93:0x0215 }] */
        /* JADX WARN: Code duplicated, block: B:79:0x02d7  */
        /* JADX WARN: Code duplicated, block: B:82:0x02e8 A[Catch: Exception -> 0x025a, TryCatch #1 {Exception -> 0x025a, blocks: (B:54:0x024e, B:57:0x025d, B:59:0x0264, B:61:0x026b, B:63:0x0278, B:67:0x0296, B:68:0x029a, B:70:0x02a2, B:72:0x02a9, B:69:0x029d, B:74:0x02ae, B:76:0x02bf, B:80:0x02d9, B:82:0x02e8, B:84:0x02f9), top: B:93:0x0215 }] */
        /* JADX WARN: Code duplicated, block: B:84:0x02f9 A[Catch: Exception -> 0x025a, TRY_LEAVE, TryCatch #1 {Exception -> 0x025a, blocks: (B:54:0x024e, B:57:0x025d, B:59:0x0264, B:61:0x026b, B:63:0x0278, B:67:0x0296, B:68:0x029a, B:70:0x02a2, B:72:0x02a9, B:69:0x029d, B:74:0x02ae, B:76:0x02bf, B:80:0x02d9, B:82:0x02e8, B:84:0x02f9), top: B:93:0x0215 }] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ironsource.adqualitysdk.sdk.i.ch
        /* JADX INFO: renamed from: ﾒ */
        public final Object mo821(cl clVar, String str, List<Object> list, ck ckVar, ee eeVar) {
            cl clVar2;
            int i10;
            float f10;
            float scrollFriction;
            int iIntValue;
            int i11;
            Object objM1805;
            try {
                float f11 = -9.516227E16f;
                f11 = -9.516227E16f;
                f = -9.516227E16f;
                f11 = -9.516227E16f;
                f = -9.516227E16f;
                f11 = -9.516227E16f;
                float f12 = -9.516227E16f;
                int i12 = 6;
                try {
                    switch (str.hashCode()) {
                        case -1347544616:
                            i10 = -1;
                            int mode = 18 - View.MeasureSpec.getMode(0);
                            scrollFriction = ViewConfiguration.getScrollFriction();
                            boolean zEquals = str.equals(m2340(mode, "\u0001\u0002\u0003\u0004\u0000\t\u0007\b\b\r\u0007\u0004\u0000\u000e\f\r\u000b\u0003", (byte) ((scrollFriction > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (scrollFriction == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 53)).intern());
                            f11 = scrollFriction;
                            if (zEquals) {
                                int i13 = f2425 + 75;
                                f2428 = i13 % 128;
                                if (i13 % 2 != 0) {
                                    f10 = scrollFriction;
                                    i12 = 4;
                                    f12 = f10;
                                } else {
                                    f10 = scrollFriction;
                                    i12 = 2;
                                    f12 = scrollFriction;
                                }
                            } else {
                                i12 = i10;
                                f12 = f11;
                            }
                            try {
                                switch (i12) {
                                    case 0:
                                        return m2342((Class) cw.m1805(list, 0, Class.class));
                                    case 1:
                                        return m2338(((Integer) cw.m1805(list, 0, Integer.class)).intValue());
                                    case 2:
                                        return m2334(((Boolean) cw.m1805(list, 0, Boolean.class)).booleanValue());
                                    case 3:
                                        d dVarM2341 = m2341(((Integer) cw.m1805(list, 0, Integer.class)).intValue());
                                        f2425 = (f2428 + 7) % 128;
                                        return dVarM2341;
                                    case 4:
                                        return m2343(((Integer) cw.m1805(list, 0, Integer.class)).intValue());
                                    case 5:
                                        boolean zBooleanValue = ((Boolean) cw.m1805(list, 0, Boolean.class)).booleanValue();
                                        if (list.size() > 1) {
                                            i11 = f2428 + 121;
                                            f2425 = i11 % 128;
                                            if (i11 % 2 == 0) {
                                                objM1805 = cw.m1805(list, 1, Integer.class);
                                            } else {
                                                objM1805 = cw.m1805(list, 1, Integer.class);
                                            }
                                            iIntValue = ((Integer) objM1805).intValue();
                                        } else {
                                            iIntValue = i10;
                                        }
                                        return m2339(zBooleanValue, iIntValue);
                                    case 6:
                                        return m2336((Class) cw.m1805(list, 0, Class.class));
                                    case 7:
                                        return m2335();
                                    case 8:
                                        return m2344();
                                    default:
                                        new ds(clVar, eeVar, m2337((short) TextUtils.getCapsMode("", 0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 609678693, (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 96, (-1377972079) - (ViewConfiguration.getLongPressTimeout() >> 16), (byte) (TextUtils.getTrimmedLength("") + 77)).intern(), str).m2034(clVar.m1643());
                                        return null;
                                }
                            } catch (Exception e10) {
                                e = e10;
                                clVar2 = f12;
                            }
                            e = e;
                            clVar2 = clVar;
                            String strM1643 = clVar2.m1643();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(m2337((short) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), Process.getGidForName("") - 609678692, (-58) - ExpandableListView.getPackedPositionType(0L), (-1377972065) - (ViewConfiguration.getScrollBarSize() >> 8), (byte) (51 - (Process.myPid() >> 22))).intern());
                            sb2.append(str);
                            sb2.append(m2340((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "r", (byte) (TextUtils.lastIndexOf("", '0') + 76)).intern());
                            cn.m1708(strM1643, sb2.toString(), e);
                            return null;
                        case -923635536:
                            i10 = -1;
                            short size = (short) View.MeasureSpec.getSize(0);
                            int iBlue = Color.blue(0) - 609678647;
                            int iKeyCodeFromString = KeyEvent.keyCodeFromString("") - 98;
                            int scrollBarFadeDuration = (-1377972141) - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            byte maximumFlingVelocity = (byte) (66 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                            boolean zEquals2 = str.equals(m2337(size, iBlue, iKeyCodeFromString, scrollBarFadeDuration, maximumFlingVelocity).intern());
                            f11 = maximumFlingVelocity;
                            if (zEquals2) {
                                i12 = 0;
                                f12 = maximumFlingVelocity;
                            } else {
                                i12 = i10;
                                f12 = f11;
                            }
                            switch (i12) {
                                case 0:
                                    return m2342((Class) cw.m1805(list, 0, Class.class));
                                case 1:
                                    return m2338(((Integer) cw.m1805(list, 0, Integer.class)).intValue());
                                case 2:
                                    return m2334(((Boolean) cw.m1805(list, 0, Boolean.class)).booleanValue());
                                case 3:
                                    d dVarM2342 = m2341(((Integer) cw.m1805(list, 0, Integer.class)).intValue());
                                    f2425 = (f2428 + 7) % 128;
                                    return dVarM2342;
                                case 4:
                                    return m2343(((Integer) cw.m1805(list, 0, Integer.class)).intValue());
                                case 5:
                                    boolean zBooleanValue2 = ((Boolean) cw.m1805(list, 0, Boolean.class)).booleanValue();
                                    if (list.size() > 1) {
                                        i11 = f2428 + 121;
                                        f2425 = i11 % 128;
                                        if (i11 % 2 == 0) {
                                            objM1805 = cw.m1805(list, 1, Integer.class);
                                        } else {
                                            objM1805 = cw.m1805(list, 1, Integer.class);
                                        }
                                        iIntValue = ((Integer) objM1805).intValue();
                                    } else {
                                        iIntValue = i10;
                                    }
                                    return m2339(zBooleanValue2, iIntValue);
                                case 6:
                                    return m2336((Class) cw.m1805(list, 0, Class.class));
                                case 7:
                                    return m2335();
                                case 8:
                                    return m2344();
                                default:
                                    new ds(clVar, eeVar, m2337((short) TextUtils.getCapsMode("", 0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 609678693, (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 96, (-1377972079) - (ViewConfiguration.getLongPressTimeout() >> 16), (byte) (TextUtils.getTrimmedLength("") + 77)).intern(), str).m2034(clVar.m1643());
                                    return null;
                            }
                            e = e;
                            clVar2 = clVar;
                            String strM1644 = clVar2.m1643();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(m2337((short) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), Process.getGidForName("") - 609678692, (-58) - ExpandableListView.getPackedPositionType(0L), (-1377972065) - (ViewConfiguration.getScrollBarSize() >> 8), (byte) (51 - (Process.myPid() >> 22))).intern());
                            sb3.append(str);
                            sb3.append(m2340((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "r", (byte) (TextUtils.lastIndexOf("", '0') + 76)).intern());
                            cn.m1708(strM1644, sb3.toString(), e);
                            return null;
                        case -216533736:
                            i10 = -1;
                            short maxKeyCode = (short) (KeyEvent.getMaxKeyCode() >> 16);
                            int i14 = (-609678646) - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1));
                            boolean zEquals3 = str.equals(m2337(maxKeyCode, i14, (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 102, Color.blue(0) - 1377972129, (byte) (((Process.getThreadPriority(0) + 20) >> 6) - 49)).intern());
                            f11 = i14;
                            if (zEquals3) {
                                i12 = 1;
                                f12 = i14;
                            } else {
                                i12 = i10;
                                f12 = f11;
                            }
                            switch (i12) {
                                case 0:
                                    return m2342((Class) cw.m1805(list, 0, Class.class));
                                case 1:
                                    return m2338(((Integer) cw.m1805(list, 0, Integer.class)).intValue());
                                case 2:
                                    return m2334(((Boolean) cw.m1805(list, 0, Boolean.class)).booleanValue());
                                case 3:
                                    d dVarM2343 = m2341(((Integer) cw.m1805(list, 0, Integer.class)).intValue());
                                    f2425 = (f2428 + 7) % 128;
                                    return dVarM2343;
                                case 4:
                                    return m2343(((Integer) cw.m1805(list, 0, Integer.class)).intValue());
                                case 5:
                                    boolean zBooleanValue3 = ((Boolean) cw.m1805(list, 0, Boolean.class)).booleanValue();
                                    if (list.size() > 1) {
                                        i11 = f2428 + 121;
                                        f2425 = i11 % 128;
                                        if (i11 % 2 == 0) {
                                            objM1805 = cw.m1805(list, 1, Integer.class);
                                        } else {
                                            objM1805 = cw.m1805(list, 1, Integer.class);
                                        }
                                        iIntValue = ((Integer) objM1805).intValue();
                                    } else {
                                        iIntValue = i10;
                                    }
                                    return m2339(zBooleanValue3, iIntValue);
                                case 6:
                                    return m2336((Class) cw.m1805(list, 0, Class.class));
                                case 7:
                                    return m2335();
                                case 8:
                                    return m2344();
                                default:
                                    new ds(clVar, eeVar, m2337((short) TextUtils.getCapsMode("", 0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 609678693, (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 96, (-1377972079) - (ViewConfiguration.getLongPressTimeout() >> 16), (byte) (TextUtils.getTrimmedLength("") + 77)).intern(), str).m2034(clVar.m1643());
                                    return null;
                            }
                            e = e;
                            clVar2 = clVar;
                            String strM1645 = clVar2.m1643();
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(m2337((short) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), Process.getGidForName("") - 609678692, (-58) - ExpandableListView.getPackedPositionType(0L), (-1377972065) - (ViewConfiguration.getScrollBarSize() >> 8), (byte) (51 - (Process.myPid() >> 22))).intern());
                            sb4.append(str);
                            sb4.append(m2340((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "r", (byte) (TextUtils.lastIndexOf("", '0') + 76)).intern());
                            cn.m1708(strM1645, sb4.toString(), e);
                            return null;
                        case 94094958:
                            i10 = -1;
                            if (str.equals(m2340(5 - TextUtils.indexOf("", "", 0), "\u0018\u0016\u000f\u0015u", (byte) (MotionEvent.axisFromString("") + 18)).intern())) {
                                i12 = 8;
                            } else {
                                i12 = i10;
                                f12 = f11;
                            }
                            switch (i12) {
                                case 0:
                                    return m2342((Class) cw.m1805(list, 0, Class.class));
                                case 1:
                                    return m2338(((Integer) cw.m1805(list, 0, Integer.class)).intValue());
                                case 2:
                                    return m2334(((Boolean) cw.m1805(list, 0, Boolean.class)).booleanValue());
                                case 3:
                                    d dVarM2344 = m2341(((Integer) cw.m1805(list, 0, Integer.class)).intValue());
                                    f2425 = (f2428 + 7) % 128;
                                    return dVarM2344;
                                case 4:
                                    return m2343(((Integer) cw.m1805(list, 0, Integer.class)).intValue());
                                case 5:
                                    boolean zBooleanValue4 = ((Boolean) cw.m1805(list, 0, Boolean.class)).booleanValue();
                                    if (list.size() > 1) {
                                        i11 = f2428 + 121;
                                        f2425 = i11 % 128;
                                        if (i11 % 2 == 0) {
                                            objM1805 = cw.m1805(list, 1, Integer.class);
                                        } else {
                                            objM1805 = cw.m1805(list, 1, Integer.class);
                                        }
                                        iIntValue = ((Integer) objM1805).intValue();
                                    } else {
                                        iIntValue = i10;
                                    }
                                    return m2339(zBooleanValue4, iIntValue);
                                case 6:
                                    return m2336((Class) cw.m1805(list, 0, Class.class));
                                case 7:
                                    return m2335();
                                case 8:
                                    return m2344();
                                default:
                                    new ds(clVar, eeVar, m2337((short) TextUtils.getCapsMode("", 0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 609678693, (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 96, (-1377972079) - (ViewConfiguration.getLongPressTimeout() >> 16), (byte) (TextUtils.getTrimmedLength("") + 77)).intern(), str).m2034(clVar.m1643());
                                    return null;
                            }
                            e = e;
                            clVar2 = clVar;
                            String strM1646 = clVar2.m1643();
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(m2337((short) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), Process.getGidForName("") - 609678692, (-58) - ExpandableListView.getPackedPositionType(0L), (-1377972065) - (ViewConfiguration.getScrollBarSize() >> 8), (byte) (51 - (Process.myPid() >> 22))).intern());
                            sb5.append(str);
                            sb5.append(m2340((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "r", (byte) (TextUtils.lastIndexOf("", '0') + 76)).intern());
                            cn.m1708(strM1646, sb5.toString(), e);
                            return null;
                        case 108404047:
                            i10 = -1;
                            short packedPositionChild = (short) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                            int capsMode = (-609678648) - TextUtils.getCapsMode("", 0, 0);
                            int iIndexOf = (-107) - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                            int deadChar = KeyEvent.getDeadChar(0, 0) - 1377972083;
                            boolean zEquals4 = str.equals(m2337(packedPositionChild, capsMode, iIndexOf, deadChar, (byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 7)).intern());
                            f11 = deadChar;
                            if (zEquals4) {
                                int i15 = f2425 + 31;
                                f2428 = i15 % 128;
                                if (i15 % 2 != 0) {
                                    i12 = 51;
                                    f12 = deadChar;
                                } else {
                                    i12 = 7;
                                    f12 = deadChar;
                                }
                            } else {
                                i12 = i10;
                                f12 = f11;
                            }
                            switch (i12) {
                                case 0:
                                    return m2342((Class) cw.m1805(list, 0, Class.class));
                                case 1:
                                    return m2338(((Integer) cw.m1805(list, 0, Integer.class)).intValue());
                                case 2:
                                    return m2334(((Boolean) cw.m1805(list, 0, Boolean.class)).booleanValue());
                                case 3:
                                    d dVarM2345 = m2341(((Integer) cw.m1805(list, 0, Integer.class)).intValue());
                                    f2425 = (f2428 + 7) % 128;
                                    return dVarM2345;
                                case 4:
                                    return m2343(((Integer) cw.m1805(list, 0, Integer.class)).intValue());
                                case 5:
                                    boolean zBooleanValue5 = ((Boolean) cw.m1805(list, 0, Boolean.class)).booleanValue();
                                    if (list.size() > 1) {
                                        i11 = f2428 + 121;
                                        f2425 = i11 % 128;
                                        if (i11 % 2 == 0) {
                                            objM1805 = cw.m1805(list, 1, Integer.class);
                                        } else {
                                            objM1805 = cw.m1805(list, 1, Integer.class);
                                        }
                                        iIntValue = ((Integer) objM1805).intValue();
                                    } else {
                                        iIntValue = i10;
                                    }
                                    return m2339(zBooleanValue5, iIntValue);
                                case 6:
                                    return m2336((Class) cw.m1805(list, 0, Class.class));
                                case 7:
                                    return m2335();
                                case 8:
                                    return m2344();
                                default:
                                    new ds(clVar, eeVar, m2337((short) TextUtils.getCapsMode("", 0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 609678693, (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 96, (-1377972079) - (ViewConfiguration.getLongPressTimeout() >> 16), (byte) (TextUtils.getTrimmedLength("") + 77)).intern(), str).m2034(clVar.m1643());
                                    return null;
                            }
                            e = e;
                            clVar2 = clVar;
                            String strM1647 = clVar2.m1643();
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append(m2337((short) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), Process.getGidForName("") - 609678692, (-58) - ExpandableListView.getPackedPositionType(0L), (-1377972065) - (ViewConfiguration.getScrollBarSize() >> 8), (byte) (51 - (Process.myPid() >> 22))).intern());
                            sb6.append(str);
                            sb6.append(m2340((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "r", (byte) (TextUtils.lastIndexOf("", '0') + 76)).intern());
                            cn.m1708(strM1647, sb6.toString(), e);
                            return null;
                        case 387034026:
                            i10 = -1;
                            short offsetBefore = (short) TextUtils.getOffsetBefore("", 0);
                            int i16 = (-609678646) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                            boolean zEquals5 = str.equals(m2337(offsetBefore, i16, (-93) - TextUtils.indexOf("", "", 0), (-1377972100) - TextUtils.getOffsetBefore("", 0), (byte) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 44)).intern());
                            f11 = i16;
                            if (zEquals5) {
                                f2428 = (f2425 + 95) % 128;
                                i12 = 5;
                                f12 = i16;
                            } else {
                                i12 = i10;
                                f12 = f11;
                            }
                            switch (i12) {
                                case 0:
                                    return m2342((Class) cw.m1805(list, 0, Class.class));
                                case 1:
                                    return m2338(((Integer) cw.m1805(list, 0, Integer.class)).intValue());
                                case 2:
                                    return m2334(((Boolean) cw.m1805(list, 0, Boolean.class)).booleanValue());
                                case 3:
                                    d dVarM2346 = m2341(((Integer) cw.m1805(list, 0, Integer.class)).intValue());
                                    f2425 = (f2428 + 7) % 128;
                                    return dVarM2346;
                                case 4:
                                    return m2343(((Integer) cw.m1805(list, 0, Integer.class)).intValue());
                                case 5:
                                    boolean zBooleanValue6 = ((Boolean) cw.m1805(list, 0, Boolean.class)).booleanValue();
                                    if (list.size() > 1) {
                                        i11 = f2428 + 121;
                                        f2425 = i11 % 128;
                                        if (i11 % 2 == 0) {
                                            objM1805 = cw.m1805(list, 1, Integer.class);
                                        } else {
                                            objM1805 = cw.m1805(list, 1, Integer.class);
                                        }
                                        iIntValue = ((Integer) objM1805).intValue();
                                    } else {
                                        iIntValue = i10;
                                    }
                                    return m2339(zBooleanValue6, iIntValue);
                                case 6:
                                    return m2336((Class) cw.m1805(list, 0, Class.class));
                                case 7:
                                    return m2335();
                                case 8:
                                    return m2344();
                                default:
                                    new ds(clVar, eeVar, m2337((short) TextUtils.getCapsMode("", 0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 609678693, (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 96, (-1377972079) - (ViewConfiguration.getLongPressTimeout() >> 16), (byte) (TextUtils.getTrimmedLength("") + 77)).intern(), str).m2034(clVar.m1643());
                                    return null;
                            }
                            e = e;
                            clVar2 = clVar;
                            String strM1648 = clVar2.m1643();
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append(m2337((short) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), Process.getGidForName("") - 609678692, (-58) - ExpandableListView.getPackedPositionType(0L), (-1377972065) - (ViewConfiguration.getScrollBarSize() >> 8), (byte) (51 - (Process.myPid() >> 22))).intern());
                            sb7.append(str);
                            sb7.append(m2340((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "r", (byte) (TextUtils.lastIndexOf("", '0') + 76)).intern());
                            cn.m1708(strM1648, sb7.toString(), e);
                            return null;
                        case 391966482:
                            i10 = -1;
                            if (str.equals(m2340(TextUtils.getOffsetBefore("", 0) + 21, "\u0004\f\n\u0013\t\f\u0011\u0012\u0015\u0006\u0004\u0001\f\u0006\u0013\u000f\u0000\u0018\u0018\u000b¸", (byte) (Color.red(0) + 83)).intern())) {
                                f2428 = (f2425 + 49) % 128;
                                i12 = 3;
                            } else {
                                i12 = i10;
                                f12 = f11;
                            }
                            switch (i12) {
                                case 0:
                                    return m2342((Class) cw.m1805(list, 0, Class.class));
                                case 1:
                                    return m2338(((Integer) cw.m1805(list, 0, Integer.class)).intValue());
                                case 2:
                                    return m2334(((Boolean) cw.m1805(list, 0, Boolean.class)).booleanValue());
                                case 3:
                                    d dVarM2347 = m2341(((Integer) cw.m1805(list, 0, Integer.class)).intValue());
                                    f2425 = (f2428 + 7) % 128;
                                    return dVarM2347;
                                case 4:
                                    return m2343(((Integer) cw.m1805(list, 0, Integer.class)).intValue());
                                case 5:
                                    boolean zBooleanValue7 = ((Boolean) cw.m1805(list, 0, Boolean.class)).booleanValue();
                                    if (list.size() > 1) {
                                        i11 = f2428 + 121;
                                        f2425 = i11 % 128;
                                        if (i11 % 2 == 0) {
                                            objM1805 = cw.m1805(list, 1, Integer.class);
                                        } else {
                                            objM1805 = cw.m1805(list, 1, Integer.class);
                                        }
                                        iIntValue = ((Integer) objM1805).intValue();
                                    } else {
                                        iIntValue = i10;
                                    }
                                    return m2339(zBooleanValue7, iIntValue);
                                case 6:
                                    return m2336((Class) cw.m1805(list, 0, Class.class));
                                case 7:
                                    return m2335();
                                case 8:
                                    return m2344();
                                default:
                                    new ds(clVar, eeVar, m2337((short) TextUtils.getCapsMode("", 0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 609678693, (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 96, (-1377972079) - (ViewConfiguration.getLongPressTimeout() >> 16), (byte) (TextUtils.getTrimmedLength("") + 77)).intern(), str).m2034(clVar.m1643());
                                    return null;
                            }
                            e = e;
                            clVar2 = clVar;
                            String strM1649 = clVar2.m1643();
                            StringBuilder sb8 = new StringBuilder();
                            sb8.append(m2337((short) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), Process.getGidForName("") - 609678692, (-58) - ExpandableListView.getPackedPositionType(0L), (-1377972065) - (ViewConfiguration.getScrollBarSize() >> 8), (byte) (51 - (Process.myPid() >> 22))).intern());
                            sb8.append(str);
                            sb8.append(m2340((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "r", (byte) (TextUtils.lastIndexOf("", '0') + 76)).intern());
                            cn.m1708(strM1649, sb8.toString(), e);
                            return null;
                        case 1067445448:
                            i10 = -1;
                            if (!str.equals(m2340((ViewConfiguration.getJumpTapTimeout() >> 16) + 15, "\u0004\f\n\f\r\u000e\u0006\u0010\b\u0011\u0018\u0011\b\u0002§", (byte) (TextUtils.indexOf("", "", 0, 0) + 66)).intern())) {
                                i12 = i10;
                                f12 = f11;
                            }
                            switch (i12) {
                                case 0:
                                    return m2342((Class) cw.m1805(list, 0, Class.class));
                                case 1:
                                    return m2338(((Integer) cw.m1805(list, 0, Integer.class)).intValue());
                                case 2:
                                    return m2334(((Boolean) cw.m1805(list, 0, Boolean.class)).booleanValue());
                                case 3:
                                    d dVarM2348 = m2341(((Integer) cw.m1805(list, 0, Integer.class)).intValue());
                                    f2425 = (f2428 + 7) % 128;
                                    return dVarM2348;
                                case 4:
                                    return m2343(((Integer) cw.m1805(list, 0, Integer.class)).intValue());
                                case 5:
                                    boolean zBooleanValue8 = ((Boolean) cw.m1805(list, 0, Boolean.class)).booleanValue();
                                    if (list.size() > 1) {
                                        i11 = f2428 + 121;
                                        f2425 = i11 % 128;
                                        if (i11 % 2 == 0) {
                                            objM1805 = cw.m1805(list, 1, Integer.class);
                                        } else {
                                            objM1805 = cw.m1805(list, 1, Integer.class);
                                        }
                                        iIntValue = ((Integer) objM1805).intValue();
                                    } else {
                                        iIntValue = i10;
                                    }
                                    return m2339(zBooleanValue8, iIntValue);
                                case 6:
                                    return m2336((Class) cw.m1805(list, 0, Class.class));
                                case 7:
                                    return m2335();
                                case 8:
                                    return m2344();
                                default:
                                    new ds(clVar, eeVar, m2337((short) TextUtils.getCapsMode("", 0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 609678693, (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 96, (-1377972079) - (ViewConfiguration.getLongPressTimeout() >> 16), (byte) (TextUtils.getTrimmedLength("") + 77)).intern(), str).m2034(clVar.m1643());
                                    return null;
                            }
                            e = e;
                            clVar2 = clVar;
                            String strM16410 = clVar2.m1643();
                            StringBuilder sb9 = new StringBuilder();
                            sb9.append(m2337((short) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), Process.getGidForName("") - 609678692, (-58) - ExpandableListView.getPackedPositionType(0L), (-1377972065) - (ViewConfiguration.getScrollBarSize() >> 8), (byte) (51 - (Process.myPid() >> 22))).intern());
                            sb9.append(str);
                            sb9.append(m2340((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "r", (byte) (TextUtils.lastIndexOf("", '0') + 76)).intern());
                            cn.m1708(strM16410, sb9.toString(), e);
                            return null;
                        case 1423210564:
                            try {
                                short s10 = (short) (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1));
                                int i17 = (-609678664) - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1));
                                int i18 = (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 90;
                                int i19 = (-1377972119) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                i10 = -1;
                                boolean zEquals6 = str.equals(m2337(s10, i17, i18, i19, (byte) ((-28) - (ViewConfiguration.getKeyRepeatTimeout() >> 16))).intern());
                                f11 = i19;
                                f10 = i19;
                                if (zEquals6) {
                                    f10 = scrollFriction;
                                    i12 = 4;
                                    f12 = f10;
                                } else {
                                    i12 = i10;
                                    f12 = f11;
                                }
                                switch (i12) {
                                    case 0:
                                        return m2342((Class) cw.m1805(list, 0, Class.class));
                                    case 1:
                                        return m2338(((Integer) cw.m1805(list, 0, Integer.class)).intValue());
                                    case 2:
                                        return m2334(((Boolean) cw.m1805(list, 0, Boolean.class)).booleanValue());
                                    case 3:
                                        d dVarM2349 = m2341(((Integer) cw.m1805(list, 0, Integer.class)).intValue());
                                        f2425 = (f2428 + 7) % 128;
                                        return dVarM2349;
                                    case 4:
                                        return m2343(((Integer) cw.m1805(list, 0, Integer.class)).intValue());
                                    case 5:
                                        boolean zBooleanValue9 = ((Boolean) cw.m1805(list, 0, Boolean.class)).booleanValue();
                                        if (list.size() > 1) {
                                            i11 = f2428 + 121;
                                            f2425 = i11 % 128;
                                            if (i11 % 2 == 0) {
                                                objM1805 = cw.m1805(list, 1, Integer.class);
                                            } else {
                                                objM1805 = cw.m1805(list, 1, Integer.class);
                                            }
                                            iIntValue = ((Integer) objM1805).intValue();
                                        } else {
                                            iIntValue = i10;
                                        }
                                        return m2339(zBooleanValue9, iIntValue);
                                    case 6:
                                        return m2336((Class) cw.m1805(list, 0, Class.class));
                                    case 7:
                                        return m2335();
                                    case 8:
                                        return m2344();
                                    default:
                                        new ds(clVar, eeVar, m2337((short) TextUtils.getCapsMode("", 0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 609678693, (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 96, (-1377972079) - (ViewConfiguration.getLongPressTimeout() >> 16), (byte) (TextUtils.getTrimmedLength("") + 77)).intern(), str).m2034(clVar.m1643());
                                        return null;
                                }
                            } catch (Exception e11) {
                                e = e11;
                                clVar2 = clVar;
                            }
                            e = e;
                            clVar2 = clVar;
                            String strM16411 = clVar2.m1643();
                            StringBuilder sb10 = new StringBuilder();
                            sb10.append(m2337((short) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), Process.getGidForName("") - 609678692, (-58) - ExpandableListView.getPackedPositionType(0L), (-1377972065) - (ViewConfiguration.getScrollBarSize() >> 8), (byte) (51 - (Process.myPid() >> 22))).intern());
                            sb10.append(str);
                            sb10.append(m2340((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "r", (byte) (TextUtils.lastIndexOf("", '0') + 76)).intern());
                            cn.m1708(strM16411, sb10.toString(), e);
                            return null;
                        default:
                            i10 = -1;
                            i12 = i10;
                            f12 = f11;
                            switch (i12) {
                                case 0:
                                    return m2342((Class) cw.m1805(list, 0, Class.class));
                                case 1:
                                    return m2338(((Integer) cw.m1805(list, 0, Integer.class)).intValue());
                                case 2:
                                    return m2334(((Boolean) cw.m1805(list, 0, Boolean.class)).booleanValue());
                                case 3:
                                    d dVarM23410 = m2341(((Integer) cw.m1805(list, 0, Integer.class)).intValue());
                                    f2425 = (f2428 + 7) % 128;
                                    return dVarM23410;
                                case 4:
                                    return m2343(((Integer) cw.m1805(list, 0, Integer.class)).intValue());
                                case 5:
                                    boolean zBooleanValue10 = ((Boolean) cw.m1805(list, 0, Boolean.class)).booleanValue();
                                    if (list.size() > 1) {
                                        i11 = f2428 + 121;
                                        f2425 = i11 % 128;
                                        if (i11 % 2 == 0) {
                                            objM1805 = cw.m1805(list, 1, Integer.class);
                                        } else {
                                            objM1805 = cw.m1805(list, 1, Integer.class);
                                        }
                                        iIntValue = ((Integer) objM1805).intValue();
                                    } else {
                                        iIntValue = i10;
                                    }
                                    return m2339(zBooleanValue10, iIntValue);
                                case 6:
                                    return m2336((Class) cw.m1805(list, 0, Class.class));
                                case 7:
                                    return m2335();
                                case 8:
                                    return m2344();
                                default:
                                    new ds(clVar, eeVar, m2337((short) TextUtils.getCapsMode("", 0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 609678693, (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 96, (-1377972079) - (ViewConfiguration.getLongPressTimeout() >> 16), (byte) (TextUtils.getTrimmedLength("") + 77)).intern(), str).m2034(clVar.m1643());
                                    return null;
                            }
                            e = e;
                            clVar2 = clVar;
                            String strM16412 = clVar2.m1643();
                            StringBuilder sb11 = new StringBuilder();
                            sb11.append(m2337((short) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), Process.getGidForName("") - 609678692, (-58) - ExpandableListView.getPackedPositionType(0L), (-1377972065) - (ViewConfiguration.getScrollBarSize() >> 8), (byte) (51 - (Process.myPid() >> 22))).intern());
                            sb11.append(str);
                            sb11.append(m2340((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "r", (byte) (TextUtils.lastIndexOf("", '0') + 76)).intern());
                            cn.m1708(strM16412, sb11.toString(), e);
                            return null;
                    }
                } catch (Exception e12) {
                    e = e12;
                }
            } catch (Exception e13) {
                e = e13;
                clVar2 = clVar;
            }
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m2340(int i10, String str, byte b10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (j.f2647) {
                try {
                    char[] cArr2 = f2424;
                    char c4 = f2427;
                    char[] cArr3 = new char[i10];
                    if (i10 % 2 != 0) {
                        i10--;
                        cArr3[i10] = (char) (cArr[i10] - b10);
                    }
                    if (i10 > 1) {
                        j.f2654 = 0;
                        while (true) {
                            int i11 = j.f2654;
                            if (i11 >= i10) {
                                break;
                            }
                            j.f2653 = cArr[i11];
                            j.f2650 = cArr[j.f2654 + 1];
                            if (j.f2653 == j.f2650) {
                                cArr3[j.f2654] = (char) (j.f2653 - b10);
                                cArr3[j.f2654 + 1] = (char) (j.f2650 - b10);
                            } else {
                                j.f2652 = j.f2653 / c4;
                                j.f2649 = j.f2653 % c4;
                                j.f2651 = j.f2650 / c4;
                                j.f2648 = j.f2650 % c4;
                                if (j.f2649 == j.f2648) {
                                    j.f2652 = f2.A(j.f2652, c4, 1, c4);
                                    j.f2651 = f2.A(j.f2651, c4, 1, c4);
                                    int i12 = (j.f2652 * c4) + j.f2649;
                                    int i13 = (j.f2651 * c4) + j.f2648;
                                    int i14 = j.f2654;
                                    cArr3[i14] = cArr2[i12];
                                    cArr3[i14 + 1] = cArr2[i13];
                                } else if (j.f2652 == j.f2651) {
                                    j.f2649 = f2.A(j.f2649, c4, 1, c4);
                                    j.f2648 = f2.A(j.f2648, c4, 1, c4);
                                    int i15 = (j.f2652 * c4) + j.f2649;
                                    int i16 = (j.f2651 * c4) + j.f2648;
                                    int i17 = j.f2654;
                                    cArr3[i17] = cArr2[i15];
                                    cArr3[i17 + 1] = cArr2[i16];
                                } else {
                                    int i18 = (j.f2652 * c4) + j.f2648;
                                    int i19 = (j.f2651 * c4) + j.f2649;
                                    int i20 = j.f2654;
                                    cArr3[i20] = cArr2[i18];
                                    cArr3[i20 + 1] = cArr2[i19];
                                }
                            }
                            j.f2654 += 2;
                        }
                    }
                    str2 = new String(cArr3);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str2;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m2333(Class cls) {
        this.f2423 = cls;
    }
}
