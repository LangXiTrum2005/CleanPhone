package kotlin.reflect.jvm.internal.impl.name;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class FqNamesUtilKt {

    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0034  */
    /* JADX WARN: Code duplicated, block: B:30:0x0033 A[SYNTHETIC] */
    public static final boolean a(String str) {
        if (str == null) {
            return false;
        }
        State state = State.X;
        int i2 = 0;
        while (true) {
            int length = str.length();
            State state2 = State.Z;
            if (i2 >= length) {
                return state != state2;
            }
            char cCharAt = str.charAt(i2);
            int iOrdinal = state.ordinal();
            if (iOrdinal == 0) {
                if (!Character.isJavaIdentifierStart(cCharAt)) {
                    return false;
                }
                state = State.f44186Y;
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    continue;
                } else {
                    if (!Character.isJavaIdentifierStart(cCharAt)) {
                        return false;
                    }
                    state = State.f44186Y;
                }
            } else if (cCharAt == '.') {
                state = state2;
            } else if (!Character.isJavaIdentifierPart(cCharAt)) {
                return false;
            }
            i2++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    /* JADX WARN: Code duplicated, block: B:15:0x003a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0040  */
    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    public static final FqName b(FqName fqName, FqName prefix) {
        Intrinsics.f(fqName, "<this>");
        Intrinsics.f(prefix, "prefix");
        if (!fqName.equals(prefix) && !prefix.d()) {
            String strB = fqName.b();
            String strB2 = prefix.b();
            if (StringsKt.M(strB, strB2, false) && strB.charAt(strB2.length()) == '.') {
                if (!prefix.d()) {
                    if (fqName.equals(prefix)) {
                        FqName ROOT = FqName.f44164c;
                        Intrinsics.e(ROOT, "ROOT");
                        return ROOT;
                    }
                    String strSubstring = fqName.b().substring(prefix.b().length() + 1);
                    Intrinsics.e(strSubstring, "this as java.lang.String).substring(startIndex)");
                    return new FqName(strSubstring);
                }
            }
        } else if (!prefix.d()) {
            if (fqName.equals(prefix)) {
                FqName ROOT2 = FqName.f44164c;
                Intrinsics.e(ROOT2, "ROOT");
                return ROOT2;
            }
            String strSubstring2 = fqName.b().substring(prefix.b().length() + 1);
            Intrinsics.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
            return new FqName(strSubstring2);
        }
        return fqName;
    }
}
