package n2;

import i1.b0;
import i1.c0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import oa.e0;
import oa.f0;
import oa.j0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f46484c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f46485a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f46486b = -1;

    public final boolean a(String str) {
        Matcher matcher = f46484c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            String str2 = l1.y.f44830a;
            int i10 = Integer.parseInt(strGroup, 16);
            int i11 = Integer.parseInt(matcher.group(2), 16);
            if (i10 <= 0 && i11 <= 0) {
                return false;
            }
            this.f46485a = i10;
            this.f46486b = i11;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008d  */
    public final void b(c0 c0Var) {
        b0 b0Var;
        c0Var.getClass();
        e0 e0VarU = j0.u();
        b0[] b0VarArr = c0Var.f42527a;
        int length = b0VarArr.length;
        int i10 = 0;
        while (true) {
            b0 b0Var2 = null;
            if (i10 >= length) {
                break;
            }
            b0 b0Var3 = b0VarArr[i10];
            if (b3.e.class.isAssignableFrom(b0Var3.getClass())) {
                b0 b0Var4 = (b0) b3.e.class.cast(b0Var3);
                if (((b3.e) b0Var4).f5451c.equals("iTunSMPB")) {
                    b0Var2 = b0Var4;
                }
            }
            if (b0Var2 != null) {
                e0VarU.b(b0Var2);
            }
            i10++;
        }
        f0 f0VarListIterator = e0VarU.g().listIterator(0);
        while (f0VarListIterator.hasNext()) {
            if (a(((b3.e) f0VarListIterator.next()).f5452d)) {
                return;
            }
        }
        e0 e0VarU2 = j0.u();
        for (b0 b0Var5 : b0VarArr) {
            if (b3.l.class.isAssignableFrom(b0Var5.getClass())) {
                b0Var = (b0) b3.l.class.cast(b0Var5);
                b3.l lVar = (b3.l) b0Var;
                if (!(lVar.f5464b.equals("com.apple.iTunes") && lVar.f5465c.equals("iTunSMPB"))) {
                    b0Var = null;
                }
            } else {
                b0Var = null;
            }
            if (b0Var != null) {
                e0VarU2.b(b0Var);
            }
        }
        f0 f0VarListIterator2 = e0VarU2.g().listIterator(0);
        while (f0VarListIterator2.hasNext() && !a(((b3.l) f0VarListIterator2.next()).f5466d)) {
        }
    }
}
