package com.google.common.escape;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class Escapers {

    /* JADX INFO: renamed from: com.google.common.escape.Escapers$1, reason: invalid class name */
    public class AnonymousClass1 extends CharEscaper {
    }

    /* JADX INFO: renamed from: com.google.common.escape.Escapers$2, reason: invalid class name */
    class AnonymousClass2 extends UnicodeEscaper {
    }

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashMap f19987a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public char f19988b = 65535;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f19989c = null;

        /* JADX INFO: renamed from: com.google.common.escape.Escapers$Builder$1, reason: invalid class name */
        class AnonymousClass1 extends ArrayBasedCharEscaper {
        }

        public final void a() {
            char[][] cArr;
            HashMap map = this.f19987a;
            map.getClass();
            if (map.isEmpty()) {
                cArr = ArrayBasedEscaperMap.f19986a;
            } else {
                char[][] cArr2 = new char[((Character) Collections.max(map.keySet())).charValue() + 1][];
                for (Character ch : map.keySet()) {
                    cArr2[ch.charValue()] = ((String) map.get(ch)).toCharArray();
                }
                cArr = cArr2;
            }
            int length = cArr.length;
            String str = this.f19989c;
            if (str != null) {
                str.toCharArray();
            }
        }
    }
}
