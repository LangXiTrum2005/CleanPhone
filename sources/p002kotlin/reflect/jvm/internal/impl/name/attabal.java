package p002kotlin.reflect.jvm.internal.impl.name;

import byname.dern;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.dovishness;

/* JADX INFO: compiled from: FqNamesUtil.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class attabal {

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.name.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FqNamesUtil.kt */
    public /* synthetic */ class C0692attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f31069attabal;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.BEGINNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.AFTER_DOT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[State.MIDDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f31069attabal = iArr;
        }
    }

    public static final <V> V attabal(dern dernVar, Map<dern, ? extends V> values) {
        Object next;
        Intrinsics.checkNotNullParameter(dernVar, "<this>");
        Intrinsics.checkNotNullParameter(values, "values");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<dern, ? extends V> entry : values.entrySet()) {
            dern key = entry.getKey();
            if (Intrinsics.wireman(dernVar, key) || saneness(dernVar, key)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            return null;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int length = competently((dern) ((Map.Entry) next).getKey(), dernVar).saneness().length();
                do {
                    Object next2 = it.next();
                    int length2 = competently((dern) ((Map.Entry) next2).getKey(), dernVar).saneness().length();
                    if (length > length2) {
                        next = next2;
                        length = length2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry2 = (Map.Entry) next;
        if (entry2 != null) {
            return (V) entry2.getValue();
        }
        return null;
    }

    public static final dern beachfront(dern dernVar) {
        Intrinsics.checkNotNullParameter(dernVar, "<this>");
        if (dernVar.wireman()) {
            return null;
        }
        return dernVar.marial();
    }

    public static final dern competently(dern dernVar, dern prefix) {
        Intrinsics.checkNotNullParameter(dernVar, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (!dern(dernVar, prefix) || prefix.wireman()) {
            return dernVar;
        }
        if (Intrinsics.wireman(dernVar, prefix)) {
            dern ROOT = dern.f15248dern;
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            return ROOT;
        }
        String strSaneness = dernVar.saneness();
        Intrinsics.checkNotNullExpressionValue(strSaneness, "asString(...)");
        String strSubstring = strSaneness.substring(prefix.saneness().length() + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return new dern(strSubstring);
    }

    public static final boolean dern(dern dernVar, dern packageName) {
        Intrinsics.checkNotNullParameter(dernVar, "<this>");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        if (Intrinsics.wireman(dernVar, packageName) || packageName.wireman()) {
            return true;
        }
        String strSaneness = dernVar.saneness();
        Intrinsics.checkNotNullExpressionValue(strSaneness, "asString(...)");
        String strSaneness2 = packageName.saneness();
        Intrinsics.checkNotNullExpressionValue(strSaneness2, "asString(...)");
        return wireman(strSaneness, strSaneness2);
    }

    public static final boolean marial(String str) {
        if (str == null) {
            return false;
        }
        State state = State.BEGINNING;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            int i2 = C0692attabal.f31069attabal[state.ordinal()];
            if (i2 == 1 || i2 == 2) {
                if (!Character.isJavaIdentifierStart(cCharAt)) {
                    return false;
                }
                state = State.MIDDLE;
            } else if (i2 != 3) {
                continue;
            } else if (cCharAt == '.') {
                state = State.AFTER_DOT;
            } else if (!Character.isJavaIdentifierPart(cCharAt)) {
                return false;
            }
        }
        return state != State.AFTER_DOT;
    }

    public static final boolean saneness(dern dernVar, dern packageName) {
        Intrinsics.checkNotNullParameter(dernVar, "<this>");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        return Intrinsics.wireman(beachfront(dernVar), packageName);
    }

    public static final boolean wireman(String str, String str2) {
        return dovishness.starveling(str, str2, false, 2, null) && str.charAt(str2.length()) == '.';
    }
}
