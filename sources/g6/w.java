package g6;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends Exception {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final StackTraceElement[] f41703f = new StackTraceElement[0];
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f41704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e6.f f41705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f41706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Class f41707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f41708e;

    public w(String str) {
        this(str, Collections.EMPTY_LIST);
    }

    public static void a(Throwable th2, ArrayList arrayList) {
        if (!(th2 instanceof w)) {
            arrayList.add(th2);
            return;
        }
        Iterator it = ((w) th2).f41704a.iterator();
        while (it.hasNext()) {
            a((Throwable) it.next(), arrayList);
        }
    }

    public static void b(List list, v vVar) throws IOException {
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            vVar.append("Cause (");
            int i11 = i10 + 1;
            vVar.append(String.valueOf(i11));
            vVar.append(" of ");
            vVar.append(String.valueOf(size));
            vVar.append("): ");
            Throwable th2 = (Throwable) list.get(i10);
            if (th2 instanceof w) {
                ((w) th2).e(vVar);
            } else {
                c(th2, vVar);
            }
            i10 = i11;
        }
    }

    public static void c(Throwable th2, Appendable appendable) {
        try {
            appendable.append(th2.getClass().toString()).append(": ").append(th2.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th2);
        }
    }

    public final void d() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            StringBuilder sb2 = new StringBuilder("Root cause (");
            int i11 = i10 + 1;
            sb2.append(i11);
            sb2.append(" of ");
            sb2.append(size);
            sb2.append(")");
            Log.i("Glide", sb2.toString(), (Throwable) arrayList.get(i10));
            i10 = i11;
        }
    }

    public final void e(Appendable appendable) {
        c(this, appendable);
        try {
            b(this.f41704a, new v(appendable));
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb2 = new StringBuilder(71);
        sb2.append(this.f41708e);
        sb2.append(this.f41707d != null ? ", " + this.f41707d : "");
        int i10 = this.f41706c;
        sb2.append(i10 != 0 ? ", ".concat(d5.u.x(i10)) : "");
        sb2.append(this.f41705b != null ? ", " + this.f41705b : "");
        ArrayList<Throwable> arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb2.toString();
        }
        if (arrayList.size() == 1) {
            sb2.append("\nThere was 1 root cause:");
        } else {
            sb2.append("\nThere were ");
            sb2.append(arrayList.size());
            sb2.append(" root causes:");
        }
        for (Throwable th2 : arrayList) {
            sb2.append('\n');
            sb2.append(th2.getClass().getName());
            sb2.append('(');
            sb2.append(th2.getMessage());
            sb2.append(')');
        }
        sb2.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb2.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        e(System.err);
    }

    public w(String str, List list) {
        this.f41708e = str;
        setStackTrace(f41703f);
        this.f41704a = list;
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
