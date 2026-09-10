package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.cf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3186cf implements InterfaceC3156cG, InterfaceC3098bf {
    public static final Map b;
    public static final LinkedHashMap c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f4234a;

    static {
        int i = 0;
        List listK = AbstractC2340Cl.K(InterfaceC2714Qw.class, InterfaceC2766Sw.class, InterfaceC3567gx.class, InterfaceC3655hx.class, InterfaceC3741ix.class, InterfaceC3829jx.class, InterfaceC3917kx.class, InterfaceC4005lx.class, InterfaceC4093mx.class, InterfaceC4181nx.class, InterfaceC2740Rw.class, InterfaceC2792Tw.class, InterfaceC2818Uw.class, InterfaceC2844Vw.class, InterfaceC2870Ww.class, InterfaceC2896Xw.class, InterfaceC2922Yw.class, InterfaceC2948Zw.class, InterfaceC3038ax.class, InterfaceC3127bx.class, InterfaceC3303dx.class, InterfaceC3391ex.class, InterfaceC3479fx.class);
        ArrayList arrayList = new ArrayList(AbstractC2749Sf.Y(10, listK));
        for (Object obj : listK) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC2340Cl.S();
                throw null;
            }
            arrayList.add(new C4839vT((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        b = U5.A0(arrayList);
        HashMap map = new HashMap();
        map.put(TypedValues.Custom.S_BOOLEAN, "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put(TypedValues.Custom.S_FLOAT, "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        AbstractC2995aW.p(collectionValues, "primitiveFqNames.values");
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            AbstractC2995aW.p(str, "kotlinName");
            sb.append(AbstractC3089ba0.S0(str, '.'));
            sb.append("CompanionObject");
            map3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            map3.put(cls.getName(), "kotlin.Function" + iIntValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC3375el.N(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), AbstractC3089ba0.S0((String) entry2.getValue(), '.'));
        }
        c = linkedHashMap;
    }

    public C3186cf(Class cls) {
        AbstractC2995aW.q(cls, "jClass");
        this.f4234a = cls;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3098bf
    public final Class a() {
        return this.f4234a;
    }

    public final String b() {
        String str;
        Class cls = this.f4234a;
        AbstractC2995aW.q(cls, "jClass");
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            boolean zIsArray = cls.isArray();
            LinkedHashMap linkedHashMap = c;
            if (!zIsArray) {
                String str2 = (String) linkedHashMap.get(cls.getName());
                return str2 == null ? cls.getSimpleName() : str2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                strConcat = str.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return AbstractC3089ba0.Q0(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            return AbstractC3089ba0.Q0(simpleName, enclosingConstructor.getName() + '$');
        }
        int iS0 = AbstractC3089ba0.s0(simpleName, '$', 0, false, 6);
        if (iS0 == -1) {
            return simpleName;
        }
        String strSubstring = simpleName.substring(iS0 + 1, simpleName.length());
        AbstractC2995aW.p(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C3186cf) && AbstractC2995aW.i(AbstractC2995aW.L(this), AbstractC2995aW.L((InterfaceC3156cG) obj));
    }

    public final int hashCode() {
        return AbstractC2995aW.L(this).hashCode();
    }

    public final String toString() {
        return this.f4234a.toString() + " (Kotlin reflection is not available)";
    }
}
