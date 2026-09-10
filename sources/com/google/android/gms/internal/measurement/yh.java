package com.google.android.gms.internal.measurement;

import com.applovin.shadow.okio.Utf8;
import com.ironsource.B5;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class yh {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashSet f24184c = new HashSet(Arrays.asList(Boolean.class, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f24185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f24186b = false;

    public yh(StringBuilder sb2) {
        this.f24185a = sb2;
    }

    public static int b(int i10, String str) {
        while (i10 < str.length()) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < ' ' || cCharAt == '\"' || cCharAt == '\\') {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public final void a(Object obj, String str) {
        boolean z10 = this.f24186b;
        StringBuilder sb2 = this.f24185a;
        if (z10) {
            sb2.append(' ');
        } else {
            if (sb2.length() > 0) {
                sb2.append((sb2.length() > 1000 || sb2.indexOf("\n") != -1) ? '\n' : ' ');
            }
            sb2.append("[CONTEXT ");
            this.f24186b = true;
        }
        sb2.append(str);
        sb2.append(B5.U);
        if (obj == null) {
            sb2.append(true);
            return;
        }
        if (f24184c.contains(obj.getClass())) {
            sb2.append(obj);
            return;
        }
        sb2.append('\"');
        String string = obj.toString();
        int i10 = 0;
        while (true) {
            int iB = b(i10, string);
            if (iB == -1) {
                sb2.append((CharSequence) string, i10, string.length());
                sb2.append('\"');
                return;
            }
            sb2.append((CharSequence) string, i10, iB);
            i10 = iB + 1;
            char cCharAt = string.charAt(iB);
            if (cCharAt == '\t') {
                cCharAt = 't';
            } else if (cCharAt == '\n') {
                cCharAt = 'n';
            } else if (cCharAt == '\r') {
                cCharAt = 'r';
            } else if (cCharAt != '\"' && cCharAt != '\\') {
                sb2.append(Utf8.REPLACEMENT_CHARACTER);
            }
            sb2.append("\\");
            sb2.append(cCharAt);
        }
    }
}
