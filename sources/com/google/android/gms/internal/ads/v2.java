package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class v2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f21003c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21004a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21005b = -1;

    public final void a(s8 s8Var) {
        ya1 ya1VarA = s8Var.a(v4.class, u2.f20597c);
        int i10 = ya1VarA.f22210d;
        int i11 = 0;
        int i12 = 0;
        while (i12 < i10) {
            boolean zB = b(((v4) ya1VarA.get(i12)).f21019d);
            i12++;
            if (zB) {
                return;
            }
        }
        ya1 ya1VarA2 = s8Var.a(z4.class, u2.f20596b);
        int i13 = ya1VarA2.f22210d;
        while (i11 < i13) {
            boolean zB2 = b(((z4) ya1VarA2.get(i11)).f22490d);
            i11++;
            if (zB2) {
                return;
            }
        }
    }

    public final boolean b(String str) {
        Matcher matcher = f21003c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            String str2 = uu0.f20901a;
            int i10 = Integer.parseInt(strGroup, 16);
            int i11 = Integer.parseInt(matcher.group(2), 16);
            if (i10 <= 0 && i11 <= 0) {
                return false;
            }
            this.f21004a = i10;
            this.f21005b = i11;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
