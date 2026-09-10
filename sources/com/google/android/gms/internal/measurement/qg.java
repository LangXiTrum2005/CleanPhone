package com.google.android.gms.internal.measurement;

import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.ironsource.X3;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Formattable;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class qg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f23907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f23908f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f23909g;

    public qg(g gVar, Object[] objArr, StringBuilder sb2) {
        this.f23903a = 1;
        this.f23904b = 0;
        this.f23905c = -1;
        gb.b(gVar, "context");
        this.f23907e = gVar;
        this.f23906d = 0;
        this.f23908f = objArr;
        this.f23909g = sb2;
    }

    public static void h(StringBuilder sb2, Object obj, String str) {
        sb2.append("[INVALID: format=");
        sb2.append(str);
        sb2.append(", type=");
        sb2.append(obj.getClass().getCanonicalName());
        sb2.append(", value=");
        sb2.append(zh.a(obj));
        sb2.append(X3.j.f27836e);
    }

    public void a() {
        this.f23904b = 1;
        this.f23908f = (x0.n) this.f23907e;
        this.f23906d = 0;
    }

    public boolean b() {
        y0.a aVarB = ((x0.n) this.f23908f).f53537b.b();
        int iA = aVarB.a(6);
        return !(iA == 0 || ((ByteBuffer) aVarB.f45720d).get(iA + aVarB.f45717a) == 0) || this.f23905c == 65039;
    }

    public void c() {
        if (this.f23905c == 0) {
            return;
        }
        HashMap map = ((pg) this.f23909g).f23866d;
        int[] iArr = (int[]) this.f23907e;
        pg pgVar = (pg) map.get(Integer.valueOf(iArr[this.f23904b]));
        while (true) {
            int i10 = (pgVar.f23864b - pgVar.f23863a) + 1;
            int i11 = this.f23905c;
            if (i10 > i11) {
                return;
            }
            int i12 = this.f23904b + i10;
            this.f23904b = i12;
            this.f23909g = pgVar;
            int i13 = i11 - i10;
            this.f23905c = i13;
            if (i13 > 0) {
                pgVar = (pg) pgVar.f23866d.get(Integer.valueOf(iArr[i12]));
            }
        }
    }

    public void d() {
        pg pgVar = ((pg) this.f23909g).f23865c;
        if (pgVar != null) {
            this.f23909g = pgVar;
        } else {
            this.f23909g = (pg) this.f23908f;
            int i10 = this.f23905c;
            if (i10 > 0) {
                this.f23905c = i10 - 1;
            }
            if (this.f23906d > 0) {
                this.f23904b++;
            }
        }
        c();
    }

    /* JADX WARN: Code duplicated, block: B:106:0x012c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0132  */
    /* JADX WARN: Code duplicated, block: B:14:0x0027  */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    /* JADX WARN: Code duplicated, block: B:64:0x0092  */
    public void e(Object obj, wh whVar, xh xhVar) {
        String simpleName;
        xh xhVar2;
        boolean zIsValidCodePoint;
        StringBuilder sb2 = (StringBuilder) this.f23909g;
        int i10 = whVar.f24131b;
        String string = whVar.f24133d;
        int iC = v0.i.c(i10);
        if (iC != 0) {
            if (iC == 1) {
                zIsValidCodePoint = obj instanceof Boolean;
            } else if (iC != 2) {
                if (iC != 3) {
                    if (iC != 4) {
                        throw null;
                    }
                    if ((obj instanceof Double) || (obj instanceof Float) || (obj instanceof BigDecimal)) {
                        zIsValidCodePoint = true;
                    } else {
                        zIsValidCodePoint = false;
                    }
                } else if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof BigInteger)) {
                    zIsValidCodePoint = true;
                } else {
                    zIsValidCodePoint = false;
                }
            } else if (obj instanceof Character) {
                zIsValidCodePoint = true;
            } else if ((obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short)) {
                zIsValidCodePoint = Character.isValidCodePoint(((Number) obj).intValue());
            } else {
                zIsValidCodePoint = false;
            }
            if (!zIsValidCodePoint) {
                h(sb2, obj, string);
                return;
            }
        }
        int iOrdinal = whVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                if (xhVar.a()) {
                    sb2.append(obj);
                    return;
                }
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal == 5) {
                        if (xhVar.a()) {
                            xhVar2 = xhVar;
                        } else {
                            int i11 = xhVar.f24158a;
                            int i12 = i11 & 128;
                            if (i12 == 0) {
                                xhVar2 = xh.f24157e;
                            } else if (i12 == i11 && xhVar.f24159b == -1 && xhVar.f24160c == -1) {
                                xhVar2 = xhVar;
                            } else {
                                xhVar2 = new xh(i12, -1, -1);
                            }
                        }
                        if (xhVar2.equals(xhVar)) {
                            Number number = (Number) obj;
                            Locale locale = zh.f24211a;
                            boolean zC = xhVar.c();
                            long jLongValue = number.longValue();
                            if (number instanceof Long) {
                                zh.b(sb2, jLongValue, zC);
                                return;
                            }
                            if (number instanceof Integer) {
                                zh.b(sb2, jLongValue & 4294967295L, zC);
                                return;
                            }
                            if (number instanceof Byte) {
                                zh.b(sb2, jLongValue & 255, zC);
                                return;
                            }
                            if (number instanceof Short) {
                                zh.b(sb2, jLongValue & WebSocketProtocol.PAYLOAD_SHORT_MAX, zC);
                                return;
                            } else {
                                if (!(number instanceof BigInteger)) {
                                    throw new IllegalStateException("unsupported number type: ".concat(String.valueOf(number.getClass())));
                                }
                                String string2 = ((BigInteger) number).toString(16);
                                if (zC) {
                                    string2 = string2.toUpperCase(zh.f24211a);
                                }
                                sb2.append(string2);
                                return;
                            }
                        }
                    }
                } else if (xhVar.a()) {
                    sb2.append(obj);
                    return;
                }
            } else if (xhVar.a()) {
                if (obj instanceof Character) {
                    sb2.append(obj);
                    return;
                }
                int iIntValue = ((Number) obj).intValue();
                if ((iIntValue >>> 16) == 0) {
                    sb2.append((char) iIntValue);
                    return;
                } else {
                    sb2.append(Character.toChars(iIntValue));
                    return;
                }
            }
        } else {
            if (obj instanceof Formattable) {
                Formattable formattable = (Formattable) obj;
                Locale locale2 = zh.f24211a;
                int i13 = xhVar.f24158a;
                int i14 = i13 & 162;
                if (i14 != 0) {
                    i14 = ((i13 & 32) == 0 ? 0 : 1) | ((i13 & 128) != 0 ? 2 : 0) | ((i13 & 2) == 0 ? 0 : 4);
                }
                int length = sb2.length();
                Formatter formatter = new Formatter(sb2, zh.f24211a);
                try {
                    formattable.formatTo(formatter, i14, xhVar.f24159b, xhVar.f24160c);
                    return;
                } catch (RuntimeException e10) {
                    sb2.setLength(length);
                    try {
                        Appendable appendableOut = formatter.out();
                        try {
                            simpleName = e10.toString();
                        } catch (RuntimeException e11) {
                            simpleName = e11.getClass().getSimpleName();
                        }
                        appendableOut.append(zh.c(formattable, simpleName));
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
            }
            if (xhVar.a()) {
                sb2.append(zh.a(obj));
                return;
            }
        }
        if (!xhVar.a()) {
            int i15 = whVar.f24130a;
            if (xhVar.c()) {
                i15 &= 65503;
            }
            StringBuilder sb3 = new StringBuilder("%");
            xhVar.d(sb3);
            sb3.append((char) i15);
            string = sb3.toString();
        }
        sb2.append(String.format(zh.f24211a, string, obj));
    }

    public void f(pg pgVar, StringBuilder sb2) {
        for (pg pgVar2 : pgVar.f23866d.values()) {
            sb2.append("  ");
            sb2.append(pgVar);
            sb2.append(" -> ");
            sb2.append(pgVar2);
            sb2.append(" [label=\"");
            int[] iArr = (int[]) this.f23907e;
            sb2.append(Arrays.toString(Arrays.copyOfRange(iArr, pgVar2.f23863a, Math.min(iArr.length, pgVar2.f23864b + 1))));
            sb2.append("\"]\n");
            f(pgVar2, sb2);
        }
    }

    public boolean g(int i10, int i11, int i12, int i13) {
        if (i10 >= 0 && i12 >= 0) {
            int[] iArr = (int[]) this.f23907e;
            int length = iArr.length;
            int iMin = Math.min(length, i11);
            if (iMin - i10 == Math.min(length, i13) - i12) {
                for (int i14 = i10; i14 <= iMin; i14++) {
                    if (iArr[i14] != iArr[(i12 + i14) - i10]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public String toString() {
        switch (this.f23903a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("digraph {\n");
                f((pg) this.f23908f, sb2);
                sb2.append("}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public qg(int[] iArr) {
        this.f23903a = 0;
        this.f23907e = iArr;
        pg pgVar = new pg(-1, -1);
        this.f23908f = pgVar;
        this.f23909g = pgVar;
    }

    public qg(x0.n nVar) {
        this.f23903a = 2;
        this.f23904b = 1;
        this.f23907e = nVar;
        this.f23908f = nVar;
    }
}
