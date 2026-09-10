package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public class jz {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2822 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f2823;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2824;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Map<e, Method> f2825;

    public static class e {

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f2826 = 0;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static int f2827 = 1;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static char[] f2828 = {25073, 41935, 58852, 10134, 27019, 43958, 60796, 12099, 29034, 45843, 62734, 14119, 30912, 47819, 64743, 16024, 16551, 'm', 49753, 33870, 17960, 2109, 51725, 36080, 20185, 4316, 53927, 38063, 22145, 6453, AbstractJsonLexerKt.COMMA, 49718, 33857, 17935, 2109, 51738, 36076, 20213, 4308, 53896, 38077, 22175, 6509, 56099, 40211, 19361, 35259, 53196, 3470, 17319, 33156, 51018, 1403, 23388, 39224, 57122, 7450, 21238, 37038};

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static long f2829 = -233828083858685418L;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private Class f2830;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private List<Class> f2831;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private String f2832;

        public e(Object obj, String str, List<Class> list) {
            if (obj instanceof Class) {
                this.f2830 = (Class) obj;
            } else {
                this.f2830 = obj.getClass();
            }
            this.f2832 = str;
            this.f2831 = list;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static String m2736(int i2, int i3, char c2) {
            String str;
            synchronized (a.f68) {
                try {
                    char[] cArr = new char[i2];
                    a.f69 = 0;
                    while (true) {
                        int i4 = a.f69;
                        if (i4 < i2) {
                            cArr[i4] = (char) ((((long) f2828[i3 + i4]) ^ (((long) i4) * f2829)) ^ ((long) c2));
                            a.f69 = i4 + 1;
                        } else {
                            str = new String(cArr);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                int i2 = f2827 + 61;
                f2826 = i2 % 128;
                return i2 % 2 == 0;
            }
            if (obj != null) {
                int i3 = f2826 + 103;
                f2827 = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
                if (e.class == obj.getClass()) {
                    e eVar = (e) obj;
                    if (!this.f2830.equals(eVar.f2830)) {
                        return false;
                    }
                    if (!this.f2832.equals(eVar.f2832)) {
                        f2827 = (f2826 + 113) % 128;
                        return false;
                    }
                    boolean zEquals = this.f2831.equals(eVar.f2831);
                    int i4 = f2827 + 71;
                    f2826 = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 53 / 0;
                    }
                    return zEquals;
                }
            }
            return false;
        }

        public final int hashCode() {
            f2826 = (f2827 + 115) % 128;
            int iHashCode = this.f2831.hashCode() + ((this.f2832.hashCode() + (this.f2830.hashCode() * 31)) * 31);
            f2826 = (f2827 + 41) % 128;
            return iHashCode;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(m2736('A' - AndroidCharacter.getMirror('0'), TextUtils.indexOf("", "", 0, 0), (char) (25020 - KeyEvent.keyCodeFromString(""))).intern());
            sb.append(m2736((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 12, 17 - Color.blue(0), (char) (ViewConfiguration.getScrollBarSize() >> 8)).intern());
            sb.append(this.f2830);
            sb.append(m2736(15 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 30 - KeyEvent.getDeadChar(0, 0), (char) (ViewConfiguration.getTapTimeout() >> 16)).intern());
            sb.append(this.f2832);
            sb.append('\'');
            sb.append(m2736(14 - View.combineMeasuredStates(0, 0), TextUtils.lastIndexOf("", '0', 0, 0) + 46, (char) (Color.argb(0, 0, 0, 0) + 19341)).intern());
            sb.append(this.f2831);
            sb.append(AbstractJsonLexerKt.END_OBJ);
            String string = sb.toString();
            int i2 = f2827 + 19;
            f2826 = i2 % 128;
            if (i2 % 2 == 0) {
                return string;
            }
            throw null;
        }
    }

    static {
        m2730();
        f2825 = new ConcurrentHashMap();
        int i2 = f2822 + 41;
        f2824 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 83 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean m2719(Constructor constructor, List<Object> list) {
        int i2 = f2824 + 41;
        f2822 = i2 % 128;
        int i3 = i2 % 2;
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        if (i3 != 0) {
            return m2728(parameterTypes, list);
        }
        m2728(parameterTypes, list);
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static Object m2721(Class cls, List<Object> list) throws Exception {
        f2824 = (f2822 + 11) % 128;
        Object objNewInstance = m2725(cls, list).newInstance(list.toArray());
        int i2 = f2824 + 37;
        f2822 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 69 / 0;
        }
        return objNewInstance;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static Class m2724(String str, boolean z2) {
        f2822 = (f2824 + 33) % 128;
        try {
            return Class.forName(str);
        } catch (Throwable th) {
            if (z2) {
                String strIntern = m2717("꓂\ue182⸘璙넩ﾠЮ䊸轇헑ባ壹\ue56d⏷桡", 17782 - ExpandableListView.getPackedPositionChild(0L)).intern();
                StringBuilder sb = new StringBuilder();
                sb.append(m2717("ꓓ硹᷻ㅬ훷\uea29", Color.red(0) + 56453).intern());
                sb.append(str);
                sb.append(m2717("꒰夛張嵋匤冏垡喦䯖䧹", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 64997).intern());
                cq.m1676(strIntern, sb.toString(), th);
            }
            f2822 = (f2824 + 93) % 128;
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m2730() {
        f2823 = 3592604619336492176L;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static List<Class> m2734(List<Object> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            f2822 = (f2824 + 5) % 128;
            if (obj != null) {
                int i2 = f2824 + 27;
                f2822 = i2 % 128;
                if (i2 % 2 == 0) {
                    arrayList.add(obj.getClass());
                    throw null;
                }
                arrayList.add(obj.getClass());
            } else {
                arrayList.add(Object.class);
                f2824 = (f2822 + 65) % 128;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static Method[] m2720(Method[] methodArr, Method[] methodArr2) {
        int i2 = f2824 + 35;
        f2822 = i2 % 128;
        if (i2 % 2 == 0) {
            int length = methodArr.length;
            int length2 = methodArr2.length;
            Method[] methodArr3 = new Method[length - length2];
            System.arraycopy(methodArr, 1, methodArr3, 0, length);
            System.arraycopy(methodArr2, 0, methodArr3, length, length2);
            return methodArr3;
        }
        int length3 = methodArr.length;
        int length4 = methodArr2.length;
        Method[] methodArr4 = new Method[length3 + length4];
        System.arraycopy(methodArr, 0, methodArr4, 0, length3);
        System.arraycopy(methodArr2, 0, methodArr4, length3, length4);
        return methodArr4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.reflect.Method] */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static Method m2722(Object obj, String str, List<Class> list) {
        try {
            Class<?>[] clsArrM2723 = m2723(list);
            if (!(obj instanceof Class)) {
                return obj.getClass().getMethod(str, clsArrM2723);
            }
            f2824 = (f2822 + 23) % 128;
            try {
                obj = ((Class) obj).getMethod(str, clsArrM2723);
                int i2 = f2822 + 29;
                f2824 = i2 % 128;
                if (i2 % 2 == 0) {
                    return obj;
                }
                throw null;
            } catch (NoSuchMethodException unused) {
                return Class.class.getMethod(str, clsArrM2723);
            }
        } catch (NoSuchMethodException e2) {
            String strIntern = m2717("꓂\ue182⸘璙넩ﾠЮ䊸轇헑ባ壹\ue56d⏷桡", Color.argb(0, 0, 0, 0) + 17783).intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m2717("ꓞ\ued68㞞硲", TextUtils.lastIndexOf("", '0', 0, 0) + 18840).intern());
            sb.append(str);
            sb.append(m2717("꒷欹㯯쩮髀\ua955秉ࡋ\ud8f8\uef27뾥丆Ẓⴁ\ufdce跱屯泻㌒", 53130 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern());
            sb.append(obj);
            cq.m1676(strIntern, sb.toString(), e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static Object m2729(Class cls, List<Object> list, Class... clsArr) throws Exception {
        int i2 = f2824 + 85;
        f2822 = i2 % 128;
        int i3 = i2 % 2;
        Constructor constructor = cls.getConstructor(clsArr);
        Object[] array = list.toArray();
        if (i3 != 0) {
            return constructor.newInstance(array);
        }
        Object objNewInstance = constructor.newInstance(array);
        int i4 = 53 / 0;
        return objNewInstance;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean m2731(Method method, List<Object> list) {
        int i2 = f2824 + 11;
        f2822 = i2 % 128;
        int i3 = i2 % 2;
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (i3 != 0) {
            return m2728(parameterTypes, list);
        }
        m2728(parameterTypes, list);
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static Constructor m2725(Class cls, List<Object> list) {
        Constructor<?>[] constructors;
        int length;
        int i2 = f2824 + 89;
        f2822 = i2 % 128;
        if (i2 % 2 == 0) {
            constructors = cls.getConstructors();
            length = constructors.length;
        } else {
            constructors = cls.getConstructors();
            length = constructors.length;
        }
        for (int i3 = 0; i3 < length; i3++) {
            Constructor<?> constructor = constructors[i3];
            if (constructor.getParameterTypes().length == list.size()) {
                int i4 = f2824 + 125;
                f2822 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 39 / 0;
                    if (m2719(constructor, list)) {
                        return constructor;
                    }
                } else if (m2719(constructor, list)) {
                    return constructor;
                }
            }
        }
        f2824 = (f2822 + 3) % 128;
        return null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static Method m2733(Object obj, String str, List<Object> list) {
        f2822 = (f2824 + 79) % 128;
        Method methodM2732 = m2732(obj.getClass(), str, list, false);
        int i2 = f2822 + 95;
        f2824 = i2 % 128;
        if (i2 % 2 == 0) {
            return methodM2732;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static Class[] m2723(List<Class> list) {
        f2824 = (f2822 + 63) % 128;
        Class[] clsArr = new Class[list.size()];
        f2824 = (f2822 + 17) % 128;
        int i2 = 0;
        while (i2 < list.size()) {
            int i3 = f2824 + 123;
            f2822 = i3 % 128;
            if (i3 % 2 == 0) {
                clsArr[i2] = list.get(i2);
                i2 += 61;
            } else {
                clsArr[i2] = list.get(i2);
                i2++;
            }
        }
        return clsArr;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static Method m2732(Class cls, String str, List<Object> list, boolean z2) {
        f2824 = (f2822 + 87) % 128;
        for (Method method : cls.getMethods()) {
            if (method.getName().equals(str) && method.getParameterTypes().length == list.size()) {
                f2824 = (f2822 + 69) % 128;
                if (Modifier.isStatic(method.getModifiers()) == z2 && m2731(method, list)) {
                    return method;
                }
            }
        }
        int i2 = f2822 + 105;
        f2824 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 22 / 0;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0081  */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static boolean m2718(Class cls, List<String> list) {
        if (cls != null) {
            if (list == null || list.isEmpty()) {
                return true;
            }
            for (String str : list) {
                f2824 = (f2822 + 83) % 128;
                if ((str.equals("") && (cls.getPackage() == null || cls.getPackage().getName().equals(""))) || (!str.equals("") && cls.getName().startsWith(str))) {
                    return true;
                }
            }
            if (!jz.class.getName().startsWith(m2717("ꓳ넨轓\ue53b\uf3a5집⟵㰟ਜ਼恰纃哟ꋧ뼞镼\ue368濾\ud7a6ⷻ㨄ူ湚䒞劸", Color.green(0) + 5591).intern())) {
                if (jz.class.getPackage() == null) {
                    f2822 = (f2824 + 67) % 128;
                    if (cls.getPackage() != null) {
                        if (jz.class.getPackage() != null || !jz.class.getPackage().equals(cls.getPackage())) {
                            return false;
                        }
                    }
                } else {
                    if (jz.class.getPackage() != null) {
                    }
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static Method m2726(Object obj, String str, List<Object> list) {
        Method methodM2733;
        e eVar = new e(obj, str, m2734(list));
        Method method = f2825.get(eVar);
        if (method != null) {
            if (m2728(method.getParameterTypes(), list)) {
                int i2 = f2822 + 17;
                f2824 = i2 % 128;
                if (i2 % 2 == 0) {
                    return method;
                }
                throw null;
            }
            String strIntern = m2717("꓂\ue182⸘璙넩ﾠЮ䊸轇헑ባ壹\ue56d⏷桡", 17783 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m2717("ꓕ錑쬄̦笮댏\ueb45⍐᭼卯讇쎏㮓珧ꮹ\ue3cc\udbc3Ꮫ䯣菽社㈒樗ꈱ騰퉄ਗ਼䈑", AndroidCharacter.getMirror('0') + 14275).intern());
            sb.append(eVar);
            cq.m1676(strIntern, sb.toString(), null);
        }
        if (obj instanceof Class) {
            methodM2733 = m2732((Class) obj, str, list, true);
            if (methodM2733 == null) {
                methodM2733 = m2733(Class.class, str, list);
                f2822 = (f2824 + 5) % 128;
            }
        } else {
            methodM2733 = m2733(obj, str, list);
        }
        if (methodM2733 != null) {
            f2825.put(eVar, methodM2733);
        }
        return methodM2733;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Field[] m2735(Field[] fieldArr, Field[] fieldArr2) {
        int i2 = f2822 + 61;
        f2824 = i2 % 128;
        if (i2 % 2 != 0) {
            int length = fieldArr.length;
            int length2 = fieldArr2.length;
            Field[] fieldArr3 = new Field[length * length2];
            System.arraycopy(fieldArr, 1, fieldArr3, 0, length);
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

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2717(String str, int i2) {
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
                        cArr2[i3] = (char) (((long) (cArr[i3] ^ (g.f2056 * i3))) ^ f2823);
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

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static boolean m2728(Class[] clsArr, List<Object> list) {
        f2822 = (f2824 + 87) % 128;
        for (int i2 = 0; i2 < clsArr.length; i2++) {
            f2822 = (f2824 + 55) % 128;
            Object obj = list.get(i2);
            if ((obj == null && !Object.class.isAssignableFrom(clsArr[i2])) || (obj != null && (!m2727(clsArr[i2], obj)))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0173 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x003c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    /* JADX WARN: Code duplicated, block: B:22:0x0053  */
    /* JADX WARN: Code duplicated, block: B:24:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x007b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0081  */
    /* JADX WARN: Code duplicated, block: B:46:0x009f  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00df  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:70:0x010f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0117  */
    /* JADX WARN: Code duplicated, block: B:99:0x016a  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Iterative traversal limit reached: limit: 500, visitor: jadx.core.dex.visitors.regions.IfRegionVisitor$RemoveRedundantElseVisitor, blocks count: 100
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:51)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:46)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static boolean m2727(java.lang.Class r9, java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p004ironsource.adqualitysdk.sdk.i.jz.m2727(java.lang.Class, java.lang.Object):boolean");
    }
}
