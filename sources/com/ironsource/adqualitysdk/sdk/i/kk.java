package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.services.UnityAdsConstants;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class kk {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f3013 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f3014 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f3015;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean f3016;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f3017;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f3018;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static Map<d, Method> f3019;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class d {

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static int f3020 = 1;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static int f3021 = 0;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f3022 = 7;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private List<Class> f3023;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private Class f3024;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private String f3025;

        public d(Object obj, String str, List<Class> list) {
            if (obj instanceof Class) {
                this.f3024 = (Class) obj;
            } else {
                this.f3024 = obj.getClass();
            }
            this.f3025 = str;
            this.f3023 = list;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static String m2889(int i10, boolean z10, int i11, String str, int i12) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (com.ironsource.adqualitysdk.sdk.i.d.f1625) {
                try {
                    char[] cArr2 = new char[i10];
                    com.ironsource.adqualitysdk.sdk.i.d.f1622 = 0;
                    while (true) {
                        int i13 = com.ironsource.adqualitysdk.sdk.i.d.f1622;
                        if (i13 >= i10) {
                            break;
                        }
                        com.ironsource.adqualitysdk.sdk.i.d.f1624 = cArr[i13];
                        cArr2[com.ironsource.adqualitysdk.sdk.i.d.f1622] = (char) (com.ironsource.adqualitysdk.sdk.i.d.f1624 + i11);
                        int i14 = com.ironsource.adqualitysdk.sdk.i.d.f1622;
                        cArr2[i14] = (char) (cArr2[i14] - f3022);
                        com.ironsource.adqualitysdk.sdk.i.d.f1622 = i14 + 1;
                    }
                    if (i12 > 0) {
                        com.ironsource.adqualitysdk.sdk.i.d.f1623 = i12;
                        char[] cArr3 = new char[i10];
                        System.arraycopy(cArr2, 0, cArr3, 0, i10);
                        int i15 = com.ironsource.adqualitysdk.sdk.i.d.f1623;
                        System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                        int i16 = com.ironsource.adqualitysdk.sdk.i.d.f1623;
                        System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
                    }
                    if (z10) {
                        char[] cArr4 = new char[i10];
                        com.ironsource.adqualitysdk.sdk.i.d.f1622 = 0;
                        while (true) {
                            int i17 = com.ironsource.adqualitysdk.sdk.i.d.f1622;
                            if (i17 >= i10) {
                                break;
                            }
                            cArr4[i17] = cArr2[(i10 - i17) - 1];
                            com.ironsource.adqualitysdk.sdk.i.d.f1622 = i17 + 1;
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

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f3024.equals(dVar.f3024)) {
                if (this.f3025.equals(dVar.f3025)) {
                    return this.f3023.equals(dVar.f3023);
                }
                f3020 = (f3021 + 35) % 128;
                return false;
            }
            int i10 = f3021 + InterfaceC0435l1.d.b.f29114k;
            f3020 = i10 % 128;
            if (i10 % 2 != 0) {
                return false;
            }
            throw null;
        }

        public final int hashCode() {
            int i10 = f3021 + InterfaceC0435l1.d.b.f29107d;
            f3020 = i10 % 128;
            if (i10 % 2 == 0) {
                return ((this.f3025.hashCode() + (this.f3024.hashCode() >>> 42)) / 55) / this.f3023.hashCode();
            }
            return this.f3023.hashCode() + ((this.f3025.hashCode() + (this.f3024.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(m2889(17 - (Process.myTid() >> 22), false, 109 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), "\u0007\u0014￦\ufffe\r\u0001\b�\uffdd\ufffe\uffff\u0002\u0007\u0002\r\u0002\b", View.MeasureSpec.getSize(0) + 2).intern());
            sb2.append(m2889((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 13, false, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + InterfaceC0435l1.d.b.f29107d, "\u0000\u0012\u0012ￜ\f￮\u0001\t\u0004\u0002\u0013￢\u000b", Color.blue(0) + 4).intern());
            sb2.append(this.f3024);
            sb2.append(m2889(15 - ExpandableListView.getPackedPositionGroup(0L), true, TextUtils.lastIndexOf("", '0', 0) + 93, "\u0010\ufff8\u0018ￋￗￒ￨\u0010\u0018\f\ufff9\u000f\u001a\u0013\u001f", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 6).intern());
            sb2.append(this.f3025);
            sb2.append('\'');
            sb2.append(m2889(Process.getGidForName("") + 15, false, 96 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "\f\u001a￤ￓￇ\u0014￨\u0019\u000e￪\u0013\b\u001a\u001a", 2 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern());
            sb2.append(this.f3023);
            sb2.append('}');
            String string = sb2.toString();
            f3020 = (f3021 + InterfaceC0435l1.d.b.f29109f) % 128;
            return string;
        }
    }

    static {
        m2879();
        f3019 = new ConcurrentHashMap();
        int i10 = f3014 + 37;
        f3013 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 57 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static Class m2870(String str, boolean z10) {
        f3014 = (f3013 + 1) % 128;
        try {
            Class<?> cls = Class.forName(str);
            int i10 = f3013 + 13;
            f3014 = i10 % 128;
            if (i10 % 2 != 0) {
                return cls;
            }
            throw null;
        } catch (Throwable th2) {
            if (z10) {
                String strIntern = m2874(null, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + WebSocketProtocol.PAYLOAD_SHORT, null, "\u008b\u0084\u0087\u0086\u008a\u0089\u0088\u0087\u0086\u0085\u0082\u0084\u0083\u0082\u0081").intern();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m2874(null, (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + WebSocketProtocol.PAYLOAD_SHORT, null, "\u008e\u008b\u008b\u008d\u0084\u008c").intern());
                sb2.append(str);
                sb2.append(m2874(null, (Process.myTid() >> 22) + 127, null, "\u0090\u0089\u008f\u0088\u0083\u008e\u0086\u0088\u0089\u008e").intern());
                cn.m1708(strIntern, sb2.toString(), th2);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static Method m2875(Object obj, String str, List<Object> list) {
        f3014 = (f3013 + 27) % 128;
        Method methodM2885 = m2885(obj.getClass(), str, list, false);
        int i10 = f3014 + 85;
        f3013 = i10 % 128;
        if (i10 % 2 == 0) {
            return methodM2885;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m2879() {
        f3016 = true;
        f3015 = true;
        f3017 = 75;
        f3018 = new char[]{157, 176, 177, 183, 174, 191, 180, 186, 185, 160, 190, 142, 172, 'k', 192, 175, 144, 189, 178, 179, 184, 153, 'r', 'y', 188, 196};
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Object m2884(Class cls, List<Object> list, Class... clsArr) throws Exception {
        f3013 = (f3014 + 75) % 128;
        Object objNewInstance = cls.getConstructor(clsArr).newInstance(list.toArray());
        int i10 = f3014 + 119;
        f3013 = i10 % 128;
        if (i10 % 2 == 0) {
            return objNewInstance;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static boolean m2877(Class[] clsArr, List<Object> list) {
        int i10 = f3014 + 27;
        f3013 = i10 % 128;
        for (int i11 = i10 % 2 != 0 ? 1 : 0; i11 < clsArr.length; i11++) {
            int i12 = f3013 + 89;
            f3014 = i12 % 128;
            if (i12 % 2 == 0) {
                list.get(i11);
                throw null;
            }
            Object obj = list.get(i11);
            if ((obj == null && !Object.class.isAssignableFrom(clsArr[i11])) || (obj != null && !m2876(clsArr[i11], obj))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean m2881(Constructor constructor, List<Object> list) {
        int i10 = f3013 + 117;
        f3014 = i10 % 128;
        int i11 = i10 % 2;
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        if (i11 == 0) {
            m2877(parameterTypes, list);
            throw null;
        }
        boolean zM2877 = m2877(parameterTypes, list);
        f3013 = (f3014 + 27) % 128;
        return zM2877;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Object m2883(Class cls, List<Object> list) throws Exception {
        f3013 = (f3014 + 69) % 128;
        Object objNewInstance = m2871(cls, list).newInstance(list.toArray());
        int i10 = f3013 + 81;
        f3014 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 37 / 0;
        }
        return objNewInstance;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Class[] m2882(List<Class> list) {
        Class[] clsArr = new Class[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            f3014 = (f3013 + 23) % 128;
            clsArr[i10] = list.get(i10);
        }
        int i11 = f3013 + 59;
        f3014 = i11 % 128;
        if (i11 % 2 != 0) {
            return clsArr;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Method m2886(Object obj, String str, List<Object> list) {
        Method methodM2875;
        d dVar = new d(obj, str, m2873(list));
        Method method = f3019.get(dVar);
        if (method != null) {
            if (m2877(method.getParameterTypes(), list)) {
                return method;
            }
            String strIntern = m2874(null, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + WebSocketProtocol.PAYLOAD_SHORT, null, "\u008b\u0084\u0087\u0086\u008a\u0089\u0088\u0087\u0086\u0085\u0082\u0084\u0083\u0082\u0081").intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2874(null, 127 - ((Process.getThreadPriority(0) + 20) >> 6), null, "\u008e\u0090\u0088\u0094\u0086\u0082\u0095\u008e\u0090\u0082\u0094\u0085\u008d\u0085\u008e\u0093\u0089\u0087\u0086\u0086\u0082\u0093\u008e\u0092\u0088\u0092\u0092\u0091").intern());
            sb2.append(dVar);
            cn.m1706(strIntern, sb2.toString());
        }
        if (obj instanceof Class) {
            methodM2875 = m2885((Class) obj, str, list, true);
            if (methodM2875 == null) {
                methodM2875 = m2875(Class.class, str, list);
                f3013 = (f3014 + 25) % 128;
            }
        } else {
            methodM2875 = m2875(obj, str, list);
        }
        if (methodM2875 != null) {
            f3014 = (f3013 + 89) % 128;
            f3019.put(dVar, methodM2875);
        }
        f3014 = (f3013 + 65) % 128;
        return methodM2875;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Constructor m2871(Class cls, List<Object> list) {
        Constructor<?> constructor;
        int i10;
        Constructor<?>[] constructors = cls.getConstructors();
        int length = constructors.length;
        int i11 = 0;
        while (true) {
            constructor = null;
            if (i11 < length) {
                int i12 = f3014 + 69;
                f3013 = i12 % 128;
                if (i12 % 2 == 0) {
                    constructor = constructors[i11];
                    if (constructor.getParameterTypes().length == list.size() && m2881(constructor, list)) {
                        i10 = f3014 + 29;
                        break;
                    }
                    i11++;
                } else {
                    int length2 = constructors[i11].getParameterTypes().length;
                    list.size();
                    throw null;
                }
            } else {
                i10 = f3014 + 57;
                break;
            }
        }
        f3013 = i10 % 128;
        return constructor;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bc  */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static boolean m2880(Class cls, List<String> list) {
        if (cls != null) {
            if (list == null || list.isEmpty()) {
                return true;
            }
            Iterator<String> it = list.iterator();
            f3014 = (f3013 + 121) % 128;
            while (true) {
                if (it.hasNext()) {
                    String next = it.next();
                    if (next.equals("")) {
                        f3013 = (f3014 + 21) % 128;
                        if (cls.getPackage() == null) {
                            break;
                        }
                        int i10 = f3013 + 19;
                        f3014 = i10 % 128;
                        if (i10 % 2 != 0) {
                            if (!cls.getPackage().getName().equals("")) {
                                if (next.equals("") && cls.getName().startsWith(next)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            cls.getPackage().getName().equals("");
                            throw null;
                        }
                    } else if (next.equals("")) {
                    }
                } else if (!kk.class.getName().startsWith(m2874(null, 127 - KeyEvent.getDeadChar(0, 0), null, "\u009a\u0086\u0087\u0084\u008d\u008f\u0099\u0090\u008d\u0098\u0082\u0085\u0092\u008f\u0088\u008b\u0089\u0088\u0092\u0087\u0098\u0095\u0088\u0085").intern())) {
                    int i11 = f3014 + 75;
                    f3013 = i11 % 128;
                    if (i11 % 2 == 0) {
                        if (kk.class.getPackage() == null) {
                            f3013 = (f3014 + 85) % 128;
                            if (cls.getPackage() != null) {
                            }
                        }
                    }
                    int i12 = 79 / 0;
                    if (kk.class.getPackage() == null) {
                        f3013 = (f3014 + 85) % 128;
                        if (cls.getPackage() != null) {
                        }
                    }
                    return kk.class.getPackage() != null && kk.class.getPackage().equals(cls.getPackage());
                }
            }
            int i13 = f3014 + 21;
            f3013 = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 11 / 0;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0190  */
    /* JADX WARN: Code duplicated, block: B:103:0x0197  */
    /* JADX WARN: Code duplicated, block: B:107:0x01a1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:108:0x01a2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0070  */
    /* JADX WARN: Code duplicated, block: B:25:0x0077  */
    /* JADX WARN: Code duplicated, block: B:27:0x0083  */
    /* JADX WARN: Code duplicated, block: B:30:0x008a  */
    /* JADX WARN: Code duplicated, block: B:32:0x008e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0094  */
    /* JADX WARN: Code duplicated, block: B:36:0x009a  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:74:0x0126  */
    /* JADX WARN: Code duplicated, block: B:76:0x0136  */
    /* JADX WARN: Code duplicated, block: B:78:0x013c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0142  */
    /* JADX WARN: Code duplicated, block: B:94:0x016c  */
    /* JADX WARN: Code duplicated, block: B:96:0x017a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0182  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:78:0x013c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static boolean m2876(java.lang.Class r10, java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 419
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.kk.m2876(java.lang.Class, java.lang.Object):boolean");
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static List<Class> m2873(List<Object> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            f3013 = (f3014 + 119) % 128;
            if (obj != null) {
                f3013 = (f3014 + 97) % 128;
                arrayList.add(obj.getClass());
            } else {
                arrayList.add(Object.class);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0039 A[PHI: r3
  0x0039: PHI (r3v4 java.lang.reflect.Method) = (r3v3 java.lang.reflect.Method), (r3v5 java.lang.reflect.Method) binds: [B:10:0x0037, B:7:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x0044  */
    /* JADX WARN: Code duplicated, block: B:25:0x005d A[SYNTHETIC] */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static Method m2885(Class cls, String str, List<Object> list, boolean z10) {
        Method method;
        Method[] methods = cls.getMethods();
        int length = methods.length;
        f3013 = (f3014 + 23) % 128;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = f3013 + 63;
            f3014 = i11 % 128;
            if (i11 % 2 == 0) {
                method = methods[i10];
                int i12 = 90 / 0;
                if (!method.getName().equals(str)) {
                    continue;
                } else if (method.getParameterTypes().length == list.size()) {
                    f3014 = (f3013 + 11) % 128;
                    if (Modifier.isStatic(method.getModifiers()) == z10 && m2887(method, list)) {
                        return method;
                    }
                } else {
                    continue;
                }
            } else {
                method = methods[i10];
                if (!method.getName().equals(str)) {
                    continue;
                } else if (method.getParameterTypes().length == list.size()) {
                    f3014 = (f3013 + 11) % 128;
                    if (Modifier.isStatic(method.getModifiers()) == z10) {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static Method m2872(Object obj, String str, List<Class> list) {
        int i10 = f3013 + 75;
        f3014 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                Class<?>[] clsArrM2882 = m2882(list);
                if (obj instanceof Class) {
                    int i11 = f3013 + 95;
                    f3014 = i11 % 128;
                    try {
                        if (i11 % 2 != 0) {
                            return ((Class) obj).getMethod(str, clsArrM2882);
                        }
                        ((Class) obj).getMethod(str, clsArrM2882);
                        throw null;
                    } catch (NoSuchMethodException unused) {
                        return Class.class.getMethod(str, clsArrM2882);
                    }
                }
                return obj.getClass().getMethod(str, clsArrM2882);
            }
            m2882(list);
            throw null;
        } catch (NoSuchMethodException e10) {
            String strIntern = m2874(null, ExpandableListView.getPackedPositionChild(0L) + 128, null, "\u008b\u0084\u0087\u0086\u008a\u0089\u0088\u0087\u0086\u0085\u0082\u0084\u0083\u0082\u0081").intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2874(null, 127 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), null, "\u0097\u008e\u0088\u0096").intern());
            sb2.append(str);
            sb2.append(m2874(null, 127 - View.combineMeasuredStates(0, 0), null, "\u008e\u0092\u0088\u0083\u008e\u0090\u0089\u008f\u0088\u0083\u008e\u0090\u0088\u0094\u0086\u0082\u0095\u008e\u0097").intern());
            sb2.append(obj);
            cn.m1708(strIntern, sb2.toString(), e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean m2887(Method method, List<Object> list) {
        int i10 = f3014 + 123;
        f3013 = i10 % 128;
        int i11 = i10 % 2;
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (i11 == 0) {
            return m2877(parameterTypes, list);
        }
        m2877(parameterTypes, list);
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Method[] m2888(Method[] methodArr, Method[] methodArr2) {
        f3013 = (f3014 + 7) % 128;
        int length = methodArr.length;
        int length2 = methodArr2.length;
        Method[] methodArr3 = new Method[length + length2];
        System.arraycopy(methodArr, 0, methodArr3, 0, length);
        System.arraycopy(methodArr2, 0, methodArr3, length, length2);
        f3014 = (f3013 + 89) % 128;
        return methodArr3;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static Field[] m2878(Field[] fieldArr, Field[] fieldArr2) {
        int i10 = f3013 + 23;
        f3014 = i10 % 128;
        if (i10 % 2 == 0) {
            int length = fieldArr.length;
            int length2 = fieldArr2.length;
            Field[] fieldArr3 = new Field[length >> length2];
            System.arraycopy(fieldArr, 1, fieldArr3, 1, length);
            System.arraycopy(fieldArr2, 1, fieldArr3, length, length2);
            return fieldArr3;
        }
        int length3 = fieldArr.length;
        int length4 = fieldArr2.length;
        Field[] fieldArr4 = new Field[length3 + length4];
        System.arraycopy(fieldArr, 0, fieldArr4, 0, length3);
        System.arraycopy(fieldArr2, 0, fieldArr4, length3, length4);
        return fieldArr4;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2874(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (k.f2932) {
            try {
                char[] cArr2 = f3018;
                int i11 = f3017;
                if (f3015) {
                    int length = bArr.length;
                    k.f2931 = length;
                    char[] cArr3 = new char[length];
                    k.f2933 = 0;
                    while (k.f2933 < k.f2931) {
                        int i12 = k.f2933;
                        int i13 = k.f2931 - 1;
                        int i14 = k.f2933;
                        cArr3[i12] = (char) (cArr2[bArr[i13 - i14] + i10] - i11);
                        k.f2933 = i14 + 1;
                    }
                    return new String(cArr3);
                }
                if (f3016) {
                    int length2 = cArr.length;
                    k.f2931 = length2;
                    char[] cArr4 = new char[length2];
                    k.f2933 = 0;
                    while (k.f2933 < k.f2931) {
                        int i15 = k.f2933;
                        int i16 = k.f2931 - 1;
                        int i17 = k.f2933;
                        cArr4[i15] = (char) (cArr2[cArr[i16 - i17] - i10] - i11);
                        k.f2933 = i17 + 1;
                    }
                    return new String(cArr4);
                }
                int length3 = iArr.length;
                k.f2931 = length3;
                char[] cArr5 = new char[length3];
                k.f2933 = 0;
                while (k.f2933 < k.f2931) {
                    int i18 = k.f2933;
                    int i19 = k.f2931 - 1;
                    int i20 = k.f2933;
                    cArr5[i18] = (char) (cArr2[iArr[i19 - i20] - i10] - i11);
                    k.f2933 = i20 + 1;
                }
                return new String(cArr5);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
