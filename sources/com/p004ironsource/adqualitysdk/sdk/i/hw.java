package com.p004ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.firebase.crashlytics.internal.model.a;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes5.dex */
public final class hw {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2306 = 0;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2307 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2311 = 169;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean f2312 = true;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean f2313 = true;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private Map<hz.a, hu> f2314;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2310 = {248, 267, 275, 270, 268, 285, 239, 274, 279, 269, 283, 238, 280, 201, 272, 271, 286, 278, 281, 266, 273, 284, 277, 289, 236, 246, 213, 287, 227};

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static char f2309 = 6;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static char[] f2308 = {' ', 't', 'y', 'p', 'e', 'f', 'r', 'o', 'm', 'c', 'l', 'a', 's', AbstractJsonLexerKt.COLON, 'h', 'i', AbstractJsonLexerKt.COMMA, 'n', AbstractJsonLexerKt.UNICODE_ESC, 'd', 'E', 'g', 'O', 'b', 'j', 'F', '!', AbstractJsonLexerKt.STRING, '#', '$', '%', '&', '\'', '(', ')', '*'};

    public hw() {
        m2301(null, null, 126 - TextUtils.indexOf((CharSequence) "", '0', 0), "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
        this.f2314 = new HashMap();
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private <T> ht<T> m2292(Object obj, hu huVar) {
        f2306 = (f2307 + 47) % 128;
        try {
            ht<T> htVarM2298 = m2298(m2305(obj, huVar.m2263().get(0), (ht) null), huVar, 1);
            int i2 = f2307 + 123;
            f2306 = i2 % 128;
            if (i2 % 2 == 0) {
                return htVarM2298;
            }
            throw null;
        } catch (Exception e2) {
            n.m2832(m2301(null, null, TextUtils.lastIndexOf("", '0', 0) + 128, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), m2301(null, null, Color.blue(0) + 127, "\u0095\u0086\u0094\u0093\u008e\u0092\u008d\u008b\u0090\u008e\u008a\u0097\u0084\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081\u008e\u008f\u0089\u0088\u0086\u0086\u0084\u008f\u008e\u008b\u008d\u008b\u008b\u008c").intern(), e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static List<Object> m2302(Class cls, Object obj, hp hpVar) {
        ArrayList arrayList = new ArrayList();
        try {
            Iterator<Field> it = hr.m2242().m2244().m2218(cls, hpVar).iterator();
            f2306 = (f2307 + 125) % 128;
            while (it.hasNext()) {
                arrayList.add(it.next().get(obj));
            }
        } catch (Throwable unused) {
            String strIntern = m2301(null, null, 127 - ((Process.getThreadPriority(0) + 20) >> 6), "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m2301(null, null, 126 - MotionEvent.axisFromString(""), "\u008e\u008f\u0089\u0088\u0086\u0086\u0084\u008f\u008e\u008b\u008d\u008b\u008b\u008c").intern());
            sb.append(hpVar.m2226());
            sb.append(m2310((byte) (View.MeasureSpec.makeMeasureSpec(0, 0) + 44), "\u0001\u0002\u0003\u0004\u0005\u0001\u0000\u000b\b\tL", KeyEvent.normalizeMetaState(0) + 11).intern());
            sb.append(cls);
            sb.append(m2310((byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 72), "\u0003\u0006\u000b\u0006¼¼", Drawable.resolveOpacity(0, 0) + 6).intern());
            n.m2835(strIntern, sb.toString());
        }
        int i2 = f2306 + 121;
        f2307 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 67 / 0;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static <T> T m2309(Class cls, Object obj, hp hpVar, T t) {
        int i2 = f2306 + 67;
        f2307 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                hr.m2242().m2244().m2216(cls, hpVar);
                throw null;
            }
            Field fieldM2216 = hr.m2242().m2244().m2216(cls, hpVar);
            if (fieldM2216 == null) {
                return t;
            }
            T t2 = (T) fieldM2216.get(obj);
            int i3 = f2307 + 117;
            f2306 = i3 % 128;
            if (i3 % 2 == 0) {
                return t2;
            }
            throw null;
        } catch (Throwable unused) {
            String strIntern = m2301(null, null, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 127, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m2301(null, null, 127 - View.MeasureSpec.getSize(0), "\u008e\u008f\u0089\u0088\u0086\u0086\u0084\u008f\u008e\u008b\u008d\u008b\u008b\u008c").intern());
            sb.append(hpVar.m2226());
            sb.append(m2310((byte) (MotionEvent.axisFromString("") + 45), "\u0001\u0002\u0003\u0004\u0005\u0001\u0000\u000b\b\tL", TextUtils.indexOf((CharSequence) "", '0', 0) + 12).intern());
            sb.append(cls);
            sb.append(m2310((byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 74), "\u0003\u0006\u000b\u0006¼¼", TextUtils.indexOf((CharSequence) "", '0') + 7).intern());
            n.m2835(strIntern, sb.toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final <T> ht<T> m2313(Object obj, hy hyVar, hq hqVar, List<String> list, int i2) {
        ht<T> htVarM2315 = m2315(obj, new hz.d().m2378(true).m2374(hyVar, hqVar, list, i2));
        f2306 = (f2307 + 91) % 128;
        return htVarM2315;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final <T> ht<T> m2315(Object obj, hz hzVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        hz.a aVarM2337 = hzVar.m2337(obj.getClass());
        hu huVar = this.f2314.get(aVarM2337);
        if (huVar != null) {
            f2307 = (f2306 + 17) % 128;
            ht<T> htVarM2292 = m2292(obj, huVar);
            if (htVarM2292 != null && m2296(hzVar.m2334(), htVarM2292)) {
                StringBuilder sb = new StringBuilder();
                sb.append(m2301(null, null, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 127, "\u008e\u0089\u0088\u008e\u0095\u0086\u0094\u0093\u008e\u0092\u008d\u008b\u0090\u008e\u008a\u0089\u0091\u008d\u0090").intern());
                sb.append(System.currentTimeMillis() - jCurrentTimeMillis);
                m2307(htVarM2292, obj, a.C(sb, m2310((byte) (80 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), "\u0006\u000e", Color.argb(0, 0, 0, 0) + 2)));
                return htVarM2292;
            }
            String strIntern = m2301(null, null, 127 - TextUtils.getTrimmedLength(""), "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(m2310((byte) (TextUtils.getCapsMode("", 0, 0) + 4), "\f\u0001\u0005\t\u0002\r\u0002\u0006\u0010\rw", 11 - View.MeasureSpec.getSize(0)).intern());
            n.m2835(strIntern, sb2.toString());
            this.f2314.remove(aVarM2337);
            f2306 = (f2307 + 123) % 128;
        }
        ia<T> iaVar = new ia<>(hzVar);
        ht<T> htVarM2293 = m2293(obj, iaVar, 0, null);
        if (htVarM2293 == null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m2310((byte) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 15), "\r\u000b\u0002\u0001\u0001\u000b\u0017\f\u0012\u0001\u0010\f/", 12 - Process.getGidForName("")).intern());
            sb3.append(System.currentTimeMillis() - jCurrentTimeMillis);
            sb3.append(m2310((byte) ((ViewConfiguration.getLongPressTimeout() >> 16) + 9), "\u0006\u000e\f\u0004", 4 - View.MeasureSpec.getSize(0)).intern());
            sb3.append(iaVar.m2385().size());
            m2307((ht) null, obj, a.C(sb3, m2301(null, null, 127 - View.MeasureSpec.makeMeasureSpec(0, 0), "\u0086\u0084\u0096\u008e\u0089\u0088\u008e\u0096\u0086\u0085\u0084\u0083\u0082\u008d\u008e")));
            return null;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(m2301(null, null, MotionEvent.axisFromString("") + 128, "\u008e\u0089\u0088\u008e\u008a\u0089\u0091\u008d\u0090").intern());
        sb4.append(System.currentTimeMillis() - jCurrentTimeMillis);
        sb4.append(m2310((byte) (9 - TextUtils.getOffsetBefore("", 0)), "\u0006\u000e\f\u0004", TextUtils.lastIndexOf("", '0', 0) + 5).intern());
        sb4.append(iaVar.m2385().size());
        m2307(htVarM2293, obj, a.C(sb4, m2301(null, null, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 126, "\u0086\u0084\u0096\u008e\u0089\u0088\u008e\u0096\u0086\u0085\u0084\u0083\u0082\u008d\u008e")));
        this.f2314.put(aVarM2337, iaVar.m2387());
        return htVarM2293;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static <T> ht<T> m2305(Object obj, List<Field> list, ht htVar) throws IllegalAccessException {
        Object obj2;
        Iterator<Field> it = list.iterator();
        while (!(!it.hasNext())) {
            f2307 = (f2306 + 17) % 128;
            Field next = it.next();
            if (WeakReference.class.isAssignableFrom(next.getType())) {
                f2306 = (f2307 + 71) % 128;
                obj2 = ((WeakReference) next.get(obj)).get();
            } else {
                obj2 = next.get(obj);
            }
            htVar = m2294(next, obj, htVar);
            obj = obj2;
        }
        return htVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private <T> ht<T> m2293(Object obj, ia<T> iaVar, int i2, ht htVar) {
        Field[] fieldArrM2311;
        if (i2 != iaVar.m2382().m2335()) {
            int i3 = f2307 + 77;
            f2306 = i3 % 128;
            if (i3 % 2 == 0) {
                if (obj != null && !iaVar.m2385().contains(obj) && (i2 <= 0 || !(obj instanceof Activity))) {
                    iaVar.m2385().add(obj);
                    try {
                        if (iaVar.m2382().m2340() != null) {
                            fieldArrM2311 = iaVar.m2382().m2340().mo2241(obj);
                            f2307 = (f2306 + 13) % 128;
                        } else {
                            fieldArrM2311 = m2311(obj.getClass(), iaVar.m2382().m2333(i2));
                        }
                        hu huVarM2387 = iaVar.m2387();
                        f2306 = (f2307 + 119) % 128;
                        for (Field field : fieldArrM2311) {
                            field.setAccessible(true);
                            huVarM2387.m2265(field);
                            ht<T> htVarM2299 = m2299(m2294(field, obj, htVar), iaVar, i2);
                            if (htVarM2299 != null) {
                                f2307 = (f2306 + 21) % 128;
                                if (!iaVar.m2388()) {
                                    return htVarM2299;
                                }
                            }
                            huVarM2387.m2266(field);
                        }
                    } catch (Throwable th) {
                        n.m2832(m2301(null, null, 127 - View.MeasureSpec.makeMeasureSpec(0, 0), "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), m2310((byte) (23 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), "\u0012\b\u0007\b\f\u0006\u0016\u0003\u008a\u008a\u0010\f\u0012\u0003\u0017\u0012\u001c\u0000\u0007\u0003\u001b\r\n\u0010z", Gravity.getAbsoluteGravity(0, 0) + 25).intern(), th);
                    }
                    return null;
                }
            } else {
                throw null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final List<ht> m2318(Object obj, hz hzVar) {
        ia iaVar = new ia(hzVar);
        iaVar.m2384();
        m2293(obj, iaVar, 0, null);
        ArrayList arrayList = new ArrayList(iaVar.m2381());
        int i2 = f2306 + 17;
        f2307 = i2 % 128;
        if (i2 % 2 != 0) {
            return arrayList;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private <T> ht<T> m2298(ht htVar, hu huVar, int i2) {
        if (i2 >= huVar.m2263().size()) {
            return htVar;
        }
        List<Field> list = huVar.m2263().get(i2);
        Object objMo2260 = htVar.mo2260();
        List listM2306 = m2306(objMo2260);
        if (listM2306 == null) {
            String strIntern = m2301(null, null, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 127, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m2301(null, null, (KeyEvent.getMaxKeyCode() >> 16) + 127, "\u008e\u008a\u0084\u009c\u0088\u0084\u0085\u0084\u008b\u008e\u009b\u0093\u0094\u009a\u008e\u008b\u008d\u008e\u0089\u008d\u0088\u0086\u0085\u0084\u0097\u0097\u008d\u0099\u008e\u008a\u0084\u0086\u0085\u0084\u0093\u0098\u008c").intern());
            sb.append(objMo2260.getClass());
            n.m2835(strIntern, sb.toString());
            return null;
        }
        f2307 = (f2306 + 37) % 128;
        for (Object obj : listM2306) {
            f2306 = (f2307 + 55) % 128;
            try {
                ht htVarM2305 = m2305(obj, list, m2304(objMo2260, obj, htVar));
                if (htVarM2305 != null) {
                    return m2298(htVarM2305, huVar, i2 + 1);
                }
                continue;
            } catch (Exception unused) {
            }
        }
        int i3 = f2307 + 123;
        f2306 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 78 / 0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static <T> ht<T> m2304(Object obj, Object obj2, ht htVar) {
        hx hxVar;
        int i2;
        f2306 = (f2307 + 53) % 128;
        if (obj instanceof Collection) {
            hxVar = new hx((Collection) obj, obj2, htVar);
            i2 = f2306 + 105;
        } else {
            if (!(obj instanceof Map)) {
                return null;
            }
            hxVar = new hx((Map) obj, obj2, htVar);
            i2 = f2306 + 23;
        }
        f2307 = i2 % 128;
        return hxVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0034 A[PHI: r5
  0x0034: PHI (r5v4 java.lang.Class) = (r5v2 java.lang.Class), (r5v5 java.lang.Class) binds: [B:12:0x0032, B:9:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static Field[] m2311(Class cls, int i2) {
        Field[] declaredFields = cls.getDeclaredFields();
        f2306 = (f2307 + 77) % 128;
        int i3 = 0;
        while (cls != null) {
            int i4 = (f2306 + 55) % 128;
            f2307 = i4;
            if (i3 == i2) {
                break;
            }
            int i5 = i4 + 27;
            f2306 = i5 % 128;
            if (i5 % 2 != 0) {
                cls = cls.getSuperclass();
                int i6 = 61 / 0;
                if (cls != null) {
                    declaredFields = jz.m2735(declaredFields, cls.getDeclaredFields());
                }
            } else {
                cls = cls.getSuperclass();
                if (cls != null) {
                    declaredFields = jz.m2735(declaredFields, cls.getDeclaredFields());
                }
            }
            i3++;
        }
        return declaredFields;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String m2314(Class cls, String str) {
        int i2 = f2307 + 5;
        f2306 = i2 % 128;
        if (i2 % 2 != 0) {
            m2300((Object) null, cls, str);
            throw null;
        }
        String strM2300 = m2300((Object) null, cls, str);
        int i3 = f2306 + 107;
        f2307 = i3 % 128;
        if (i3 % 2 != 0) {
            return strM2300;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m2317(Object obj, String str) {
        int i2 = f2306 + 33;
        f2307 = i2 % 128;
        if (i2 % 2 != 0) {
            return m2300(obj, obj.getClass(), str);
        }
        String strM2300 = m2300(obj, obj.getClass(), str);
        int i3 = 40 / 0;
        return strM2300;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2310(byte b2, String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (i.f2343) {
            try {
                char[] cArr2 = f2308;
                char c2 = f2309;
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

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private ht m2299(ht htVar, ia iaVar, int i2) {
        Object objMo2260 = htVar.mo2260();
        ht htVarM2299 = null;
        if (!iaVar.m2385().contains(objMo2260)) {
            int i3 = f2307 + 71;
            f2306 = i3 % 128;
            if (i3 % 2 == 0) {
                if (!iaVar.m2380().contains(objMo2260)) {
                    if (iaVar.m2382().m2341(i2) && m2296(iaVar.m2382().m2334(), htVar)) {
                        int i4 = f2307 + 15;
                        f2306 = i4 % 128;
                        if (i4 % 2 == 0) {
                            if (!iaVar.m2388()) {
                                return htVar;
                            }
                            int i5 = f2307 + 33;
                            f2306 = i5 % 128;
                            if (i5 % 2 == 0) {
                                iaVar.m2383(htVar);
                                iaVar.m2386(objMo2260);
                                return htVar;
                            }
                            iaVar.m2383(htVar);
                            iaVar.m2386(objMo2260);
                            throw null;
                        }
                        iaVar.m2388();
                        throw null;
                    }
                    if (objMo2260 instanceof WeakReference) {
                        WeakReference weakReference = (WeakReference) objMo2260;
                        if (weakReference.get() != null) {
                            f2306 = (f2307 + 71) % 128;
                            if (iaVar.m2382().m2343(i2) && m2297(weakReference.get(), iaVar.m2382().m2342())) {
                                return m2293(weakReference.get(), iaVar, i2 + 1, htVar);
                            }
                        }
                    }
                    if (m2297(objMo2260, iaVar.m2382().m2342())) {
                        return m2293(objMo2260, iaVar, i2 + 1, htVar);
                    }
                    if (iaVar.m2382().m2338()) {
                        f2307 = (f2306 + 59) % 128;
                        if (objMo2260 != null) {
                            iaVar.m2385().add(objMo2260);
                        }
                    }
                    List listM2303 = m2303(objMo2260, iaVar.m2382(), i2);
                    hu huVarM2387 = iaVar.m2387();
                    if (listM2303 != null) {
                        Iterator it = listM2303.iterator();
                        while (it.hasNext()) {
                            ht htVarM2304 = m2304(objMo2260, it.next(), htVar);
                            huVarM2387.m2264();
                            htVarM2299 = m2299(htVarM2304, iaVar, i2);
                            if (htVarM2299 != null) {
                                int i6 = f2306 + 125;
                                f2307 = i6 % 128;
                                if (i6 % 2 == 0) {
                                    int i7 = 81 / 0;
                                    if (!iaVar.m2388()) {
                                        return htVarM2299;
                                    }
                                } else if (!iaVar.m2388()) {
                                    return htVarM2299;
                                }
                            }
                            huVarM2387.m2262();
                        }
                    }
                    return htVarM2299;
                }
            } else {
                iaVar.m2380().contains(objMo2260);
                throw null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean m2296(hy hyVar, ht htVar) {
        boolean zMo1822;
        int i2 = f2307 + 9;
        f2306 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                zMo1822 = hyVar.mo1822(htVar);
                int i3 = 4 / 0;
            } else {
                zMo1822 = hyVar.mo1822(htVar);
            }
            f2307 = (f2306 + 59) % 128;
            return zMo1822;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean m2297(Object obj, List<String> list) {
        int i2 = (f2307 + 3) % 128;
        f2306 = i2;
        if (obj == null) {
            return false;
        }
        int i3 = i2 + 59;
        f2307 = i3 % 128;
        if (i3 % 2 != 0) {
            return jz.m2718(obj.getClass(), list);
        }
        jz.m2718(obj.getClass(), list);
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final List<String> m2316(Object obj, List<String> list, int i2) {
        ia iaVar = new ia(new hz.d().m2371(true).m2373(true).m2367(-1).m2379(new hy() { // from class: com.ironsource.adqualitysdk.sdk.i.hw.5
            @Override // com.p004ironsource.adqualitysdk.sdk.i.hy
            /* JADX INFO: renamed from: ﾇ */
            public final boolean mo1822(ht htVar) {
                return htVar.mo2260() instanceof String;
            }
        }, list, i2));
        iaVar.m2384();
        m2293(obj, iaVar, 0, null);
        ArrayList arrayList = new ArrayList(iaVar.m2380());
        int i3 = f2307 + 93;
        f2306 = i3 % 128;
        if (i3 % 2 == 0) {
            return arrayList;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static List m2295(Object obj, boolean z2, boolean z3) {
        int i2 = f2307;
        f2306 = (i2 + 107) % 128;
        if (obj instanceof Collection) {
            f2306 = (i2 + 17) % 128;
            if (z2) {
                ArrayList arrayList = new ArrayList((Collection) obj);
                f2306 = (f2307 + 111) % 128;
                return arrayList;
            }
        }
        if (!(obj instanceof Map) || !z3) {
            return null;
        }
        Map map = (Map) obj;
        ArrayList arrayList2 = new ArrayList(map.values());
        arrayList2.addAll(map.keySet());
        return arrayList2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static List m2306(Object obj) {
        f2306 = (f2307 + 33) % 128;
        List listM2295 = m2295(obj, true, true);
        f2306 = (f2307 + 73) % 128;
        return listM2295;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static <T> ht<T> m2294(Field field, Object obj, ht htVar) {
        hx hxVar = new hx(field, obj, htVar);
        int i2 = f2307 + 1;
        f2306 = i2 % 128;
        if (i2 % 2 == 0) {
            return hxVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Field[] m2308(Class cls) {
        ArrayList arrayList = new ArrayList();
        Field[] declaredFields = cls.getDeclaredFields();
        int length = declaredFields.length;
        int i2 = 0;
        while (i2 < length) {
            f2307 = (f2306 + 93) % 128;
            Field field = declaredFields[i2];
            if (field.getType().equals(String.class)) {
                int i3 = f2307 + 91;
                f2306 = i3 % 128;
                if (i3 % 2 == 0) {
                    arrayList.add(field);
                    f2307 = (f2306 + 1) % 128;
                } else {
                    arrayList.add(field);
                    throw null;
                }
            }
            i2++;
            f2306 = (f2307 + 23) % 128;
        }
        return (Field[]) arrayList.toArray(new Field[0]);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final String m2312(Object obj, JSONArray jSONArray) {
        if (jSONArray != null) {
            f2306 = (f2307 + 23) % 128;
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                int i3 = f2307 + 119;
                f2306 = i3 % 128;
                if (i3 % 2 == 0) {
                    String strM2317 = m2317(obj, jSONArray.optString(i2));
                    if (strM2317 != null) {
                        int i4 = f2306 + 47;
                        f2307 = i4 % 128;
                        if (i4 % 2 != 0) {
                            return strM2317;
                        }
                        throw null;
                    }
                } else {
                    m2317(obj, jSONArray.optString(i2));
                    throw null;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m2307(ht htVar, Object obj, String str) {
        int i2 = f2307 + 53;
        f2306 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (htVar == null) {
            String strIntern = m2301(null, null, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
            StringBuilder sb = new StringBuilder();
            sb.append(obj);
            sb.append(m2301(null, null, 127 - (ViewConfiguration.getScrollDefaultDelay() >> 16), "\u008e\u009d").intern());
            sb.append(str);
            n.m2826(strIntern, sb.toString());
            return;
        }
        String strIntern2 = m2301(null, null, (Process.myPid() >> 22) + 127, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append(m2301(null, null, (Process.myTid() >> 22) + 127, "\u008e\u009d").intern());
        sb2.append(str);
        sb2.append(m2301(null, null, 127 - (ViewConfiguration.getFadingEdgeLength() >> 16), "\u008e\u0084\u0091\u0097\u0094\u009c\u008e\u009b").intern());
        sb2.append(htVar.mo2260());
        n.m2826(strIntern2, sb2.toString());
        int i3 = f2306 + 13;
        f2307 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 13 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static List m2303(Object obj, hz hzVar, int i2) {
        int i3 = f2306 + 9;
        f2307 = i3 % 128;
        if (i3 % 2 != 0) {
            return m2295(obj, hzVar.m2336(i2), hzVar.m2339(i2));
        }
        m2295(obj, hzVar.m2336(i2), hzVar.m2339(i2));
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String m2300(Object obj, Class cls, String str) {
        while (cls != null) {
            f2307 = (f2306 + 99) % 128;
            if (cls.equals(Object.class)) {
                return null;
            }
            for (Field field : m2308(cls)) {
                field.setAccessible(true);
                try {
                    String str2 = (String) field.get(obj);
                    if (str2 != null) {
                        f2306 = (f2307 + 21) % 128;
                        if (Pattern.compile(str).matcher(str2).matches()) {
                            int i2 = f2307 + 85;
                            f2306 = i2 % 128;
                            if (i2 % 2 != 0) {
                                int i3 = 53 / 0;
                            }
                            return str2;
                        }
                    }
                    f2307 = (f2306 + 97) % 128;
                } catch (Exception unused) {
                }
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2301(String str, int[] iArr, int i2, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f2310;
                int i3 = f2311;
                if (f2313) {
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
                if (f2312) {
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
}
