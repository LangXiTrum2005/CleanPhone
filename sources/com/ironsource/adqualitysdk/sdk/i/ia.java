package com.ironsource.adqualitysdk.sdk.i;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.InterfaceC0435l1;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.unity3d.services.UnityAdsConstants;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class ia {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static char[] f2437 = {'%', 17, '.', '-', 'm', 30, '/', '\"', '0', 'W', 'r', 'l', 17, '<', 'x', '.', '?', 197, 215, 'Q', 173, 17, 'J', 's', 'j', 'f', 'g', 'a', '@', 'N', 'Z', '.', 'A', 'j', 'j', 'b', 'a', '@', '\'', '\'', 'C', 'h', 'h', 'i', 'q', '[', '2', '.', 136, 135, 148, 'r', 134, 135, 148, 131, 138, 'u', 'D', '\\', 'D', 149, 149, 131, 142, 133, 129, 'D', 157, '\\', 'D', 131, 150, 131, 134, 129, 'D', 'N', 'D', 149, 135, 133, 144, 135, 148, 135};

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2438 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2439 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2440 = 5;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final List<String> f2442;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final int f2445;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final Set<Object> f2441 = new HashSet();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final Set<String> f2443 = new HashSet();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private int f2444 = 0;

    public ia(List<String> list, int i10) {
        this.f2442 = list;
        this.f2445 = i10;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private boolean m2345(Object obj) {
        int i10 = f2439 + 75;
        f2438 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        if (obj != null && kk.m2880(obj.getClass(), this.f2442)) {
            return true;
        }
        int i11 = f2438 + 39;
        f2439 = i11 % 128;
        if (i11 % 2 != 0) {
            return false;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static List<Object> m2346(Object obj) {
        ArrayList arrayList = new ArrayList();
        f2438 = (f2439 + 29) % 128;
        int i10 = 0;
        while (i10 < Array.getLength(obj)) {
            arrayList.add(Array.get(obj, i10));
            i10++;
            f2439 = (f2438 + 117) % 128;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2350(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2354(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, new int[]{12, 1, 0, 1}, false).intern());
        sb2.append(str.replace(m2347(1 - TextUtils.getOffsetBefore("", 0), false, Color.rgb(0, 0, 0) + 16777313, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, TextUtils.indexOf("", "") + 1).intern(), m2354("\u0000\u0000", new int[]{13, 2, 28, 0}, false).intern()).replace(m2354(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, new int[]{12, 1, 0, 1}, false).intern(), m2354("\u0000\u0000", new int[]{15, 2, 0, 0}, false).intern()).replace(m2347(-Process.getGidForName(""), true, (Process.myPid() >> 22) + 15, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, -((byte) KeyEvent.getModifierMetaStateMask())).intern(), m2354(null, new int[]{17, 2, InterfaceC0435l1.d.b.f29109f, 1}, true).intern()).replace(m2347((AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), true, 18 - (ViewConfiguration.getKeyRepeatDelay() >> 16), WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, 1 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern(), m2354("\u0000\u0000", new int[]{19, 2, 70, 0}, false).intern()).replace(m2347(Color.alpha(0) + 1, false, 13 - ExpandableListView.getPackedPositionChild(0L), WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, 1 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern(), m2347(2 - (ViewConfiguration.getFadingEdgeLength() >> 16), true, 110 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), "\f\ufff4", 2 - View.MeasureSpec.getMode(0)).intern()));
        String strM = f2.m(sb2, m2354(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, new int[]{12, 1, 0, 1}, false));
        f2438 = (f2439 + 69) % 128;
        return strM;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static Object m2353(Object obj) {
        int i10 = f2438;
        f2439 = (i10 + 43) % 128;
        if (obj instanceof WeakReference) {
            return ((WeakReference) obj).get();
        }
        if (!(obj instanceof AtomicReference)) {
            f2439 = (i10 + 17) % 128;
            return obj;
        }
        Object obj2 = ((AtomicReference) obj).get();
        f2439 = (f2438 + 1) % 128;
        return obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if (r21.f2441.contains(r22) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        r21.f2441.add(r22);
        r21.f2444++;
        r2 = new java.lang.StringBuilder(m2347(android.graphics.Color.green(0) + 10, true, 92 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), "ￋ\u001c\u001c\n\u0015\f\bￋ$￣", 9 - android.text.TextUtils.indexOf("", "")).intern());
        r2.append(m2350(r22.getClass().getSimpleName()));
        r3 = m2349(r22);
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x007a, code lost:
    
        if (android.text.TextUtils.isEmpty(r3) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007c, code lost:
    
        r2.append(m2347(13 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), false, 91 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), "\u001c\u0013\u0018\u0011ￌ￤ￖￌ\t\u001e\u0019�\u001e", 7 - (android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1))).intern());
        r2.append(m2358(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a8, code lost:
    
        r3 = m2351(r22.getClass());
        r4 = r3.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b1, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b2, code lost:
    
        if (r12 >= r4) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b4, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.ia.f2438 = (com.ironsource.adqualitysdk.sdk.i.ia.f2439 + com.ironsource.InterfaceC0435l1.d.b.f29105b) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00bc, code lost:
    
        r13 = r3[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c2, code lost:
    
        if (m2356(r13) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c4, code lost:
    
        r14 = com.ironsource.adqualitysdk.sdk.i.ia.f2439 + 17;
        com.ironsource.adqualitysdk.sdk.i.ia.f2438 = r14 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00cd, code lost:
    
        if ((r14 % r6) == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00cf, code lost:
    
        r13.setAccessible(false);
        r14 = m2353(r13.get(r22));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00de, code lost:
    
        if (m2360(r14) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e1, code lost:
    
        r17 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e4, code lost:
    
        r13.setAccessible(true);
        r14 = m2353(r13.get(r22));
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f3, code lost:
    
        if (m2360(r14) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f5, code lost:
    
        r17 = r10;
        r2.append(m2347(android.view.View.combineMeasuredStates(0, 0) + r6, true, android.graphics.Color.red(0) + 44, "\ufffb\u0005", (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > r17 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == r17 ? 0 : -1)) + 1).intern());
        r2.append(r13.getName());
        r2.append(m2354("\u0000\u0000", new int[]{1, 2, 0, 0}, false).intern());
        r2.append(m2361(r14));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0137, code lost:
    
        r12 = r12 + 1;
        com.ironsource.adqualitysdk.sdk.i.ia.f2439 = (com.ironsource.adqualitysdk.sdk.i.ia.f2438 + 93) % 128;
        r10 = r17;
        r6 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0146, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.ia.f2439 = (com.ironsource.adqualitysdk.sdk.i.ia.f2438 + 79) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
    
        if (r21.f2441.contains(r22) != false) goto L34;
     */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String m2355(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ia.m2355(java.lang.Object):java.lang.String");
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String m2359(Collection<?> collection) {
        StringBuilder sb2 = new StringBuilder(m2354("\u0001", new int[]{3, 1, 0, 1}, true).intern());
        f2438 = (f2439 + 77) % 128;
        boolean z10 = true;
        for (Object obj : collection) {
            f2438 = (f2439 + 45) % 128;
            if (!m2360(obj)) {
                if (!z10) {
                    sb2.append(m2347(1 - (Process.myTid() >> 22), true, (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 49, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, 1 - KeyEvent.keyCodeFromString("")).intern());
                }
                sb2.append(m2361(obj));
                z10 = false;
            }
        }
        return f2.m(sb2, m2354(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, new int[]{4, 1, 125, 0}, false));
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m2361(Object obj) {
        Object objM2353 = m2353(obj);
        if (objM2353 == null) {
            return m2347(Color.red(0) + 4, false, Color.argb(0, 0, 0, 0) + 115, "\ufffe\ufffe\u0000\u0007", 2 - TextUtils.indexOf("", "")).intern();
        }
        if (objM2353 instanceof String) {
            int i10 = f2439 + 5;
            f2438 = i10 % 128;
            if (i10 % 2 != 0) {
                m2358((String) objM2353);
                throw null;
            }
            String strM2358 = m2358((String) objM2353);
            f2439 = (f2438 + 71) % 128;
            return strM2358;
        }
        if (!(objM2353 instanceof Number)) {
            int i11 = f2439;
            int i12 = (i11 + 47) % 128;
            f2438 = i12;
            if (!(objM2353 instanceof Boolean)) {
                if (objM2353 instanceof Character) {
                    return m2350(String.valueOf(objM2353));
                }
                if (objM2353 instanceof JSONArray) {
                    f2438 = (i11 + 25) % 128;
                    return m2359((Collection<?>) kj.m2852((JSONArray) objM2353));
                }
                if (objM2353 instanceof JSONObject) {
                    int i13 = i12 + 71;
                    f2439 = i13 % 128;
                    if (i13 % 2 != 0) {
                        return m2352((Map<?, ?>) kj.m2859((JSONObject) objM2353));
                    }
                    m2352((Map<?, ?>) kj.m2859((JSONObject) objM2353));
                    throw null;
                }
                if (objM2353 instanceof Map) {
                    f2438 = (i11 + 31) % 128;
                    String strM2352 = m2352((Map<?, ?>) objM2353);
                    int i14 = f2438 + 53;
                    f2439 = i14 % 128;
                    if (i14 % 2 == 0) {
                        int i15 = 22 / 0;
                    }
                    return strM2352;
                }
                if (objM2353 instanceof Collection) {
                    return m2359((Collection<?>) objM2353);
                }
                if (objM2353.getClass().isArray()) {
                    int i16 = f2438 + 49;
                    f2439 = i16 % 128;
                    if (i16 % 2 != 0) {
                        return m2359((Collection<?>) m2346(objM2353));
                    }
                    m2359((Collection<?>) m2346(objM2353));
                    throw null;
                }
                if (objM2353 instanceof Bundle) {
                    return m2357((Bundle) objM2353);
                }
                if (objM2353 instanceof SharedPreferences) {
                    return m2348((SharedPreferences) objM2353);
                }
                if (m2345(objM2353)) {
                    return m2355(objM2353);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(objM2353.getClass().getSimpleName());
                sb2.append(m2354(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, new int[]{0, 1, 10, 1}, false).intern());
                sb2.append(Integer.toHexString(objM2353.hashCode()));
                return m2350(sb2.toString());
            }
        }
        return String.valueOf(objM2353);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String m2348(SharedPreferences sharedPreferences) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2354(null, new int[]{48, 38, 34, 21}, true).intern());
        sb2.append(m2352((Map<?, ?>) sharedPreferences.getAll()));
        String strM = f2.m(sb2, m2347(View.MeasureSpec.makeMeasureSpec(0, 0) + 1, true, 131 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, 1 - (Process.myTid() >> 22)));
        f2439 = (f2438 + 119) % 128;
        return strM;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2354(String str, int[] iArr, boolean z10) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (h.f2261) {
            try {
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = iArr[2];
                int i13 = iArr[3];
                char[] cArr = new char[i11];
                System.arraycopy(f2437, i10, cArr, 0, i11);
                if (bArr != null) {
                    char[] cArr2 = new char[i11];
                    h.f2262 = 0;
                    char c4 = 0;
                    while (true) {
                        int i14 = h.f2262;
                        if (i14 >= i11) {
                            break;
                        }
                        if (bArr[i14] == 1) {
                            cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c4);
                        } else {
                            cArr2[i14] = (char) ((cArr[i14] << 1) - c4);
                        }
                        c4 = cArr2[i14];
                        h.f2262 = i14 + 1;
                    }
                    cArr = cArr2;
                }
                if (i13 > 0) {
                    char[] cArr3 = new char[i11];
                    System.arraycopy(cArr, 0, cArr3, 0, i11);
                    int i15 = i11 - i13;
                    System.arraycopy(cArr3, 0, cArr, i15, i13);
                    System.arraycopy(cArr3, i13, cArr, 0, i15);
                }
                if (z10) {
                    char[] cArr4 = new char[i11];
                    h.f2262 = 0;
                    while (true) {
                        int i16 = h.f2262;
                        if (i16 >= i11) {
                            break;
                        }
                        cArr4[i16] = cArr[(i11 - i16) - 1];
                        h.f2262 = i16 + 1;
                    }
                    cArr = cArr4;
                }
                if (i12 > 0) {
                    h.f2262 = 0;
                    while (true) {
                        int i17 = h.f2262;
                        if (i17 >= i11) {
                            break;
                        }
                        cArr[i17] = (char) (cArr[i17] - iArr[2]);
                        h.f2262 = i17 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2349(Object obj) {
        f2439 = (f2438 + 59) % 128;
        try {
            String string = obj.toString();
            if (TextUtils.isEmpty(string)) {
                int i10 = f2439 + 115;
                f2438 = i10 % 128;
                if (i10 % 2 == 0) {
                    return null;
                }
                throw null;
            }
            String hexString = Integer.toHexString(obj.hashCode());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj.getClass().getName());
            sb2.append(m2354(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, new int[]{0, 1, 10, 1}, false).intern());
            sb2.append(hexString);
            if (!string.equals(sb2.toString())) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(obj.getClass().getSimpleName());
                sb3.append(m2354(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, new int[]{0, 1, 10, 1}, false).intern());
                sb3.append(hexString);
                if (!string.equals(sb3.toString())) {
                    return string;
                }
            }
            return null;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String m2358(String str) {
        f2439 = (f2438 + 91) % 128;
        if (str.length() > 30) {
            f2439 = (f2438 + 39) % 128;
            if (this.f2443.contains(str)) {
                f2438 = (f2439 + 65) % 128;
                return m2354("\u0000\u0000\u0000\u0000\u0000\u0001\u0001", new int[]{5, 7, 0, 2}, true).intern();
            }
            this.f2443.add(str);
        }
        String strM2350 = m2350(str);
        int i10 = f2438 + 107;
        f2439 = i10 % 128;
        if (i10 % 2 != 0) {
            return strM2350;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private Field[] m2351(Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        while (cls != null) {
            f2438 = (f2439 + InterfaceC0435l1.d.b.f29114k) % 128;
            if (!kk.m2880(cls, this.f2442)) {
                break;
            }
            arrayList.addAll(Arrays.asList(cls.getDeclaredFields()));
            cls = cls.getSuperclass();
        }
        Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
        f2438 = (f2439 + InterfaceC0435l1.d.b.f29107d) % 128;
        return fieldArr;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String m2357(Bundle bundle) {
        HashMap map = new HashMap();
        f2438 = (f2439 + 115) % 128;
        for (String str : bundle.keySet()) {
            f2439 = (f2438 + 89) % 128;
            map.put(str, bundle.get(str));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2354("\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000", new int[]{21, 27, 0, 9}, true).intern());
        sb2.append(m2352((Map<?, ?>) map));
        return f2.m(sb2, m2347((ViewConfiguration.getFadingEdgeLength() >> 16) + 1, true, 130 - TextUtils.indexOf("", ""), WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, 1 - (ViewConfiguration.getEdgeSlop() >> 16)));
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2347(int i10, boolean z10, int i11, String str, int i12) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (d.f1625) {
            try {
                char[] cArr2 = new char[i10];
                d.f1622 = 0;
                while (true) {
                    int i13 = d.f1622;
                    if (i13 >= i10) {
                        break;
                    }
                    d.f1624 = cArr[i13];
                    cArr2[d.f1622] = (char) (d.f1624 + i11);
                    int i14 = d.f1622;
                    cArr2[i14] = (char) (cArr2[i14] - f2440);
                    d.f1622 = i14 + 1;
                }
                if (i12 > 0) {
                    d.f1623 = i12;
                    char[] cArr3 = new char[i10];
                    System.arraycopy(cArr2, 0, cArr3, 0, i10);
                    int i15 = d.f1623;
                    System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                    int i16 = d.f1623;
                    System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
                }
                if (z10) {
                    char[] cArr4 = new char[i10];
                    d.f1622 = 0;
                    while (true) {
                        int i17 = d.f1622;
                        if (i17 >= i10) {
                            break;
                        }
                        cArr4[i17] = cArr2[(i10 - i17) - 1];
                        d.f1622 = i17 + 1;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean m2356(Field field) {
        if (!Modifier.isStatic(field.getModifiers())) {
            f2439 = (f2438 + InterfaceC0435l1.d.b.f29109f) % 128;
            return false;
        }
        Class<?> type = field.getType();
        if (type.isPrimitive()) {
            return true;
        }
        f2438 = (f2439 + 121) % 128;
        return type == String.class;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean m2360(Object obj) {
        if (obj == null) {
            return true;
        }
        if (obj instanceof String) {
            return ((String) obj).isEmpty();
        }
        if (obj instanceof Number) {
            f2439 = (f2438 + 43) % 128;
            return ((Number) obj).doubleValue() == 0.0d;
        }
        if (obj instanceof Boolean) {
            f2438 = (f2439 + 95) % 128;
            if (((Boolean) obj).booleanValue()) {
                return false;
            }
            f2438 = (f2439 + 89) % 128;
            return true;
        }
        if (obj instanceof Collection) {
            boolean zIsEmpty = ((Collection) obj).isEmpty();
            int i10 = f2438 + 125;
            f2439 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 30 / 0;
            }
            return zIsEmpty;
        }
        if (obj instanceof Map) {
            return ((Map) obj).isEmpty();
        }
        if (obj.getClass().isArray()) {
            if (Array.getLength(obj) == 0) {
                int i12 = f2438 + InterfaceC0435l1.d.b.f29112i;
                f2439 = i12 % 128;
                return i12 % 2 != 0;
            }
            f2439 = (f2438 + 7) % 128;
        }
        return false;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String m2352(Map<?, ?> map) {
        StringBuilder sb2 = new StringBuilder(m2347(1 - TextUtils.getTrimmedLength(""), false, 128 - View.MeasureSpec.getMode(0), WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, KeyEvent.keyCodeFromString("") + 1).intern());
        boolean z10 = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            f2438 = (f2439 + 59) % 128;
            if (!m2360(entry.getValue())) {
                f2438 = (f2439 + 71) % 128;
                if (!z10) {
                    sb2.append(m2347(1 - Gravity.getAbsoluteGravity(0, 0), true, 48 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, View.resolveSize(0, 0) + 1).intern());
                }
                sb2.append(m2350(String.valueOf(entry.getKey())));
                sb2.append(m2347((ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), false, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 62, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, 1 - TextUtils.getTrimmedLength("")).intern());
                sb2.append(m2361(entry.getValue()));
                f2438 = (f2439 + 95) % 128;
                z10 = false;
            }
        }
        return f2.m(sb2, m2347(TextUtils.indexOf("", "", 0, 0) + 1, true, View.MeasureSpec.getMode(0) + TsExtractor.TS_STREAM_TYPE_HDMV_DTS, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, 1 - Color.green(0)));
    }
}
