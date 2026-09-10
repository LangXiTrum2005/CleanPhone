package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GlideException extends Exception {
    public static final StackTraceElement[] g0 = new StackTraceElement[0];
    private static final long serialVersionUID = 1;
    public final List X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Key f12464Y;
    public DataSource Z;
    public Class e0;
    public final String f0;

    public GlideException(String str) {
        this(str, Collections.EMPTY_LIST);
    }

    public static void a(Throwable th, ArrayList arrayList) {
        if (!(th instanceof GlideException)) {
            arrayList.add(th);
            return;
        }
        Iterator it = ((GlideException) th).X.iterator();
        while (it.hasNext()) {
            a((Throwable) it.next(), arrayList);
        }
    }

    public static void b(List list, Appendable appendable) throws IOException {
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            IndentedAppendable indentedAppendable = (IndentedAppendable) appendable;
            indentedAppendable.append("Cause (");
            int i3 = i2 + 1;
            indentedAppendable.append(String.valueOf(i3));
            indentedAppendable.append(" of ");
            indentedAppendable.append(String.valueOf(size));
            indentedAppendable.append("): ");
            Throwable th = (Throwable) list.get(i2);
            if (th instanceof GlideException) {
                ((GlideException) th).e(indentedAppendable);
            } else {
                c(th, indentedAppendable);
            }
            i2 = i3;
        }
    }

    public static void c(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    public final void d() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            StringBuilder sb = new StringBuilder("Root cause (");
            int i3 = i2 + 1;
            sb.append(i3);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i("Glide", sb.toString(), (Throwable) arrayList.get(i2));
            i2 = i3;
        }
    }

    public final void e(Appendable appendable) {
        c(this, appendable);
        try {
            b(this.X, new IndentedAppendable(appendable));
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f0);
        sb.append(this.e0 != null ? ", " + this.e0 : "");
        sb.append(this.Z != null ? ", " + this.Z : "");
        sb.append(this.f12464Y != null ? ", " + this.f12464Y : "");
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

    public GlideException(String str, List list) {
        this.f0 = str;
        setStackTrace(g0);
        this.X = list;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        e(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        e(printWriter);
    }

    public static final class IndentedAppendable implements Appendable {
        public final Appendable X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public boolean f12465Y = true;

        public IndentedAppendable(Appendable appendable) {
            this.X = appendable;
        }

        @Override // java.lang.Appendable
        public final Appendable append(char c2) throws IOException {
            boolean z2 = this.f12465Y;
            Appendable appendable = this.X;
            if (z2) {
                this.f12465Y = false;
                appendable.append("  ");
            }
            this.f12465Y = c2 == '\n';
            appendable.append(c2);
            return this;
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            append(charSequence, 0, charSequence.length());
            return this;
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence, int i2, int i3) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            boolean z2 = this.f12465Y;
            Appendable appendable = this.X;
            boolean z3 = false;
            if (z2) {
                this.f12465Y = false;
                appendable.append("  ");
            }
            if (charSequence.length() > 0 && charSequence.charAt(i3 - 1) == '\n') {
                z3 = true;
            }
            this.f12465Y = z3;
            appendable.append(charSequence, i2, i3);
            return this;
        }
    }
}
