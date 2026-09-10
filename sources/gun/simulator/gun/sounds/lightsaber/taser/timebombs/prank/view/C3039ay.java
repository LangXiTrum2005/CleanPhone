package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ay, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3039ay extends Exception {
    public static final StackTraceElement[] f = new StackTraceElement[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f4149a;
    public InterfaceC4650tG b;
    public EnumC4516rl c;
    public Class d;
    public final String e;

    public C3039ay(String str) {
        this(str, Collections.emptyList());
    }

    public static void a(Throwable th, ArrayList arrayList) {
        if (!(th instanceof C3039ay)) {
            arrayList.add(th);
            return;
        }
        Iterator it = ((C3039ay) th).f4149a.iterator();
        while (it.hasNext()) {
            a((Throwable) it.next(), arrayList);
        }
    }

    public static void b(List list, C2949Zx c2949Zx) {
        try {
            c(list, c2949Zx);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void c(List list, C2949Zx c2949Zx) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            c2949Zx.append("Cause (");
            int i2 = i + 1;
            c2949Zx.append(String.valueOf(i2));
            c2949Zx.append(" of ");
            c2949Zx.append(String.valueOf(size));
            c2949Zx.append("): ");
            Throwable th = (Throwable) list.get(i);
            if (th instanceof C3039ay) {
                ((C3039ay) th).e(c2949Zx);
            } else {
                d(th, c2949Zx);
            }
            i = i2;
        }
    }

    public static void d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    public final void e(Appendable appendable) {
        d(this, appendable);
        b(this.f4149a, new C2949Zx(appendable));
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.e);
        sb.append(this.d != null ? ", " + this.d : "");
        sb.append(this.c != null ? ", " + this.c : "");
        sb.append(this.b != null ? ", " + this.b : "");
        ArrayList<Throwable> arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            sb.append(" root causes:");
        }
        for (Throwable th : arrayList) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        e(System.err);
    }

    public C3039ay(String str, List list) {
        this.e = str;
        setStackTrace(f);
        this.f4149a = list;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        e(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        e(printWriter);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
