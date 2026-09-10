package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class qr1 implements Closeable, Flushable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f19174j = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String[] f19175k = new String[128];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ae.t f19176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f19177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final br1 f19179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f19180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f19181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f19182g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f19183h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f19184i;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f19175k[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f19175k;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public qr1(ae.t tVar) {
        int[] iArr = new int[32];
        this.f19177b = iArr;
        boolean z10 = false;
        this.f19178c = 0;
        if (iArr.length == 0) {
            this.f19177b = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f19177b;
        int i10 = this.f19178c;
        this.f19178c = i10 + 1;
        iArr2[i10] = 6;
        this.f19183h = 2;
        this.f19176a = tVar;
        br1 br1Var = br1.f12867d;
        Objects.requireNonNull(br1Var);
        String str = br1Var.f12868a;
        this.f19179d = br1Var;
        this.f19181f = ",";
        if (br1Var.f12870c) {
            this.f19180e = ": ";
            if (str.isEmpty()) {
                this.f19181f = ", ";
            }
        } else {
            this.f19180e = ":";
        }
        if (str.isEmpty() && br1Var.f12869b.isEmpty()) {
            z10 = true;
        }
        this.f19182g = z10;
    }

    public final void a(int i10, int i11, char c4) throws IOException {
        int iD = d();
        if (iD != i11 && iD != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        String str = this.f19184i;
        if (str != null) {
            throw new IllegalStateException("Dangling name: ".concat(str));
        }
        this.f19178c--;
        if (iD == i11) {
            k();
        }
        this.f19176a.write(c4);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f19176a.getClass();
        int i10 = this.f19178c;
        if (i10 > 1 || (i10 == 1 && this.f19177b[0] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f19178c = 0;
    }

    public final int d() {
        int i10 = this.f19178c;
        if (i10 != 0) {
            return this.f19177b[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.f19178c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f19176a.getClass();
    }

    public final void h() throws IOException {
        if (this.f19184i != null) {
            int iD = d();
            if (iD == 5) {
                this.f19176a.write(this.f19181f);
            } else if (iD != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            k();
            this.f19177b[this.f19178c - 1] = 4;
            j(this.f19184i);
            this.f19184i = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    public final void j(String str) throws IOException {
        String str2;
        ae.t tVar = this.f19176a;
        tVar.write(34);
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (cCharAt < 128) {
                str2 = f19175k[cCharAt];
                if (str2 != null) {
                    if (i11 < i10) {
                        tVar.write(str, i11, i10 - i11);
                    }
                    tVar.write(str2);
                    i11 = i12;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i11 < i10) {
                    tVar.write(str, i11, i10 - i11);
                }
                tVar.write(str2);
                i11 = i12;
            }
            i10 = i12;
        }
        if (i11 < length) {
            tVar.write(str, i11, length - i11);
        }
        tVar.write(34);
    }

    public final void k() throws IOException {
        if (this.f19182g) {
            return;
        }
        br1 br1Var = this.f19179d;
        String str = br1Var.f12868a;
        ae.t tVar = this.f19176a;
        tVar.write(str);
        int i10 = this.f19178c;
        for (int i11 = 1; i11 < i10; i11++) {
            tVar.write(br1Var.f12869b);
        }
    }

    public final void n() throws IOException {
        int iD = d();
        if (iD == 1) {
            this.f19177b[this.f19178c - 1] = 2;
            k();
            return;
        }
        ae.t tVar = this.f19176a;
        if (iD == 2) {
            tVar.append((CharSequence) this.f19181f);
            k();
        } else {
            if (iD == 4) {
                tVar.append((CharSequence) this.f19180e);
                this.f19177b[this.f19178c - 1] = 5;
                return;
            }
            if (iD != 6) {
                if (iD != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.f19183h != 1) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f19177b[this.f19178c - 1] = 7;
        }
    }
}
