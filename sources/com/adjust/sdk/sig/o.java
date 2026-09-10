package com.adjust.sdk.sig;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o extends w {
    public static String a(Iterable iterable, String str, String str2, r0 r0Var) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) str);
        Iterator it = iterable.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10++;
            if (i10 > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (r0Var != null) {
                sb2.append((CharSequence) r0Var.a(next));
            } else {
                if (next != null ? next instanceof CharSequence : true) {
                    sb2.append((CharSequence) next);
                } else if (next instanceof Character) {
                    sb2.append(((Character) next).charValue());
                } else {
                    sb2.append((CharSequence) next.toString());
                }
            }
        }
        sb2.append((CharSequence) str2);
        return sb2.toString();
    }
}
