package com.thinkup.core.common.no.m.o.o;

import android.support.v4.media.a;
import com.p004ironsource.d9;
import com.thinkup.core.common.no.m.omn;
import com.thinkup.core.common.no.n.nm;
import com.thinkup.core.common.no.n.oom;
import com.thinkup.core.common.no.n.oon;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class o0 implements Closeable, Flushable {
    static final String m = "journal.tmp";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final String f42033n = "journal.bkp";
    static final String o = "journal";
    static final String o0 = "libcore.io.DiskLruCache";
    static final /* synthetic */ boolean o0n = true;
    static final long om = -1;
    static final Pattern on = Pattern.compile("[a-z0-9_-]{1,120}");
    static final String oo = "1";
    private static final String oo0 = "CLEAN";
    private static final String oom = "REMOVE";
    private static final String oon = "READ";
    private static final String ooo = "DIRTY";
    final com.thinkup.core.common.no.m.o.om.o m0;
    com.thinkup.core.common.no.n.o0 mn;
    final File mo;
    boolean nm;
    boolean nn;
    int no;
    boolean o00;
    boolean o0m;
    boolean o0o;
    private final File om0;
    private final File omm;
    private final File omo;
    private long on0;
    private final Executor onn;
    private long ono = 0;
    final LinkedHashMap<String, m> n0 = new LinkedHashMap<>(0, 0.75f, true);
    private long onm = 0;
    private final Runnable m00 = new Runnable() { // from class: com.thinkup.core.common.no.m.o.o.o0.1
        @Override // java.lang.Runnable
        public final void run() {
            synchronized (o0.this) {
                o0 o0Var = o0.this;
                if ((!o0Var.nn) || o0Var.o00) {
                    return;
                }
                try {
                    o0Var.m0();
                } catch (IOException unused) {
                    o0.this.o0o = true;
                }
                try {
                    if (o0.this.om()) {
                        o0.this.m();
                        o0.this.no = 0;
                    }
                } catch (IOException unused2) {
                    o0 o0Var2 = o0.this;
                    o0Var2.o0m = true;
                    o0Var2.mn = nm.o(nm.o());
                }
            }
        }
    };
    private final int omn = 201105;
    final int mm = 2;

    public final class n implements Closeable {
        private final String m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final long f42036n;
        private final oon[] o0;
        private final long[] oo;

        public n(String str, long j, oon[] oonVarArr, long[] jArr) {
            this.m = str;
            this.f42036n = j;
            this.o0 = oonVarArr;
            this.oo = jArr;
        }

        private String m() {
            return this.m;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            for (oon oonVar : this.o0) {
                com.thinkup.core.common.no.m.o.n.o(oonVar);
            }
        }

        private long m(int i2) {
            return this.oo[i2];
        }

        public final o o() {
            return o0.this.o(this.m, this.f42036n);
        }

        public final oon o(int i2) {
            return this.o0[i2];
        }
    }

    private o0(com.thinkup.core.common.no.m.o.om.o oVar, File file, long j, Executor executor) {
        this.m0 = oVar;
        this.mo = file;
        this.om0 = new File(file, o);
        this.omo = new File(file, m);
        this.omm = new File(file, f42033n);
        this.on0 = j;
        this.onn = executor;
    }

    private void n0() {
        String strSubstring;
        com.thinkup.core.common.no.n.oo ooVarO = nm.o(this.m0.o(this.om0));
        try {
            String strOon = ooVarO.oon();
            String strOon2 = ooVarO.oon();
            String strOon3 = ooVarO.oon();
            String strOon4 = ooVarO.oon();
            String strOon5 = ooVarO.oon();
            if (!o0.equals(strOon) || !"1".equals(strOon2) || !Integer.toString(this.omn).equals(strOon3) || !Integer.toString(this.mm).equals(strOon4) || !"".equals(strOon5)) {
                throw new IOException("unexpected journal header: [" + strOon + ", " + strOon2 + ", " + strOon4 + ", " + strOon5 + d9.i.f24752e);
            }
            int i2 = 0;
            while (true) {
                try {
                    String strOon6 = ooVarO.oon();
                    int iIndexOf = strOon6.indexOf(32);
                    if (iIndexOf == -1) {
                        throw new IOException("unexpected journal line: ".concat(strOon6));
                    }
                    int i3 = iIndexOf + 1;
                    int iIndexOf2 = strOon6.indexOf(32, i3);
                    if (iIndexOf2 == -1) {
                        strSubstring = strOon6.substring(i3);
                        if (iIndexOf == 6 && strOon6.startsWith(oom)) {
                            this.n0.remove(strSubstring);
                        }
                        i2++;
                    } else {
                        strSubstring = strOon6.substring(i3, iIndexOf2);
                    }
                    m mVar = this.n0.get(strSubstring);
                    if (mVar == null) {
                        mVar = new m(strSubstring);
                        this.n0.put(strSubstring, mVar);
                    }
                    if (iIndexOf2 != -1 && iIndexOf == 5 && strOon6.startsWith(oo0)) {
                        String[] strArrSplit = strOon6.substring(iIndexOf2 + 1).split(" ");
                        mVar.oo = true;
                        mVar.om = null;
                        mVar.o(strArrSplit);
                    } else if (iIndexOf2 == -1 && iIndexOf == 5 && strOon6.startsWith(ooo)) {
                        mVar.om = new o(mVar);
                    } else if (iIndexOf2 != -1 || iIndexOf != 4 || !strOon6.startsWith(oon)) {
                        throw new IOException("unexpected journal line: ".concat(strOon6));
                    }
                    i2++;
                } catch (EOFException unused) {
                    this.no = i2 - this.n0.size();
                    if (ooVarO.on()) {
                        this.mn = no();
                    } else {
                        m();
                    }
                    ooVarO.close();
                    return;
                }
            }
        } catch (Throwable th) {
            try {
                ooVarO.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private void nm() {
        this.m0.o0(this.omo);
        Iterator<m> it = this.n0.values().iterator();
        while (it.hasNext()) {
            m next = it.next();
            int i2 = 0;
            if (next.om == null) {
                while (i2 < this.mm) {
                    this.ono += next.m[i2];
                    i2++;
                }
            } else {
                next.om = null;
                while (i2 < this.mm) {
                    this.m0.o0(next.f42035n[i2]);
                    this.m0.o0(next.o0[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    private synchronized void nn() {
        if (on()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private com.thinkup.core.common.no.n.o0 no() {
        return nm.o(new oo(this.m0.n(this.om0)) { // from class: com.thinkup.core.common.no.m.o.o.o0.2
            static final /* synthetic */ boolean o = true;

            @Override // com.thinkup.core.common.no.m.o.o.oo
            public final void m() {
                if (!o && !Thread.holdsLock(o0.this)) {
                    throw new AssertionError();
                }
                o0.this.nm = true;
            }
        });
    }

    private void o0(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i2 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i2);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i2);
            if (iIndexOf == 6 && str.startsWith(oom)) {
                this.n0.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i2, iIndexOf2);
        }
        m mVar = this.n0.get(strSubstring);
        if (mVar == null) {
            mVar = new m(strSubstring);
            this.n0.put(strSubstring, mVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith(oo0)) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            mVar.oo = true;
            mVar.om = null;
            mVar.o(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith(ooo)) {
            mVar.om = new o(mVar);
        } else if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith(oon)) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.nn && !this.o00) {
                for (m mVar : (m[]) this.n0.values().toArray(new m[this.n0.size()])) {
                    o oVar = mVar.om;
                    if (oVar != null) {
                        oVar.n();
                    }
                }
                m0();
                this.mn.close();
                this.mn = null;
                this.o00 = true;
                return;
            }
            this.o00 = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.nn) {
            nn();
            m0();
            this.mn.flush();
        }
    }

    public final synchronized void m() {
        try {
            com.thinkup.core.common.no.n.o0 o0Var = this.mn;
            if (o0Var != null) {
                o0Var.close();
            }
            com.thinkup.core.common.no.n.o0 o0VarO = nm.o(this.m0.m(this.omo));
            try {
                o0VarO.m(o0).n0(10);
                o0VarO.m("1").n0(10);
                o0VarO.nn(this.omn).n0(10);
                o0VarO.nn(this.mm).n0(10);
                o0VarO.n0(10);
                for (m mVar : this.n0.values()) {
                    if (mVar.om != null) {
                        o0VarO.m(ooo).n0(32);
                        o0VarO.m(mVar.o);
                        o0VarO.n0(10);
                    } else {
                        o0VarO.m(oo0).n0(32);
                        o0VarO.m(mVar.o);
                        mVar.o(o0VarO);
                        o0VarO.n0(10);
                    }
                }
                o0VarO.close();
                if (this.m0.oo(this.om0)) {
                    this.m0.o(this.om0, this.omm);
                }
                this.m0.o(this.omo, this.om0);
                this.m0.o0(this.omm);
                this.mn = no();
                this.nm = false;
                this.o0m = false;
            } catch (Throwable th) {
                try {
                    o0VarO.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final void m0() {
        while (this.ono > this.on0) {
            o(this.n0.values().iterator().next());
        }
        this.o0o = false;
    }

    public final synchronized void mm() {
        try {
            o();
            for (m mVar : (m[]) this.n0.values().toArray(new m[this.n0.size()])) {
                o(mVar);
            }
            this.o0o = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Iterator<n> mn() {
        o();
        return new Iterator<n>() { // from class: com.thinkup.core.common.no.m.o.o.o0.3
            n m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            n f42034n;
            final Iterator<m> o;

            {
                this.o = new ArrayList(o0.this.n0.values()).iterator();
            }

            private n o() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                n nVar = this.m;
                this.f42034n = nVar;
                this.m = null;
                return nVar;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                n nVarO;
                if (this.m != null) {
                    return true;
                }
                synchronized (o0.this) {
                    try {
                        if (o0.this.o00) {
                            return false;
                        }
                        while (this.o.hasNext()) {
                            m next = this.o.next();
                            if (next.oo && (nVarO = next.o()) != null) {
                                this.m = nVarO;
                                return true;
                            }
                        }
                        return false;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // java.util.Iterator
            public final /* synthetic */ n next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                n nVar = this.m;
                this.f42034n = nVar;
                this.m = null;
                return nVar;
            }

            @Override // java.util.Iterator
            public final void remove() {
                n nVar = this.f42034n;
                if (nVar == null) {
                    throw new IllegalStateException("remove() before next()");
                }
                try {
                    o0.this.n(nVar.m);
                } catch (IOException unused) {
                } finally {
                    this.f42034n = null;
                }
            }
        };
    }

    public final void mo() {
        close();
        this.m0.on(this.mo);
    }

    public final File n() {
        return this.mo;
    }

    public final synchronized void o() {
        try {
            if (!o0n && !Thread.holdsLock(this)) {
                throw new AssertionError();
            }
            if (this.nn) {
                return;
            }
            if (this.m0.oo(this.omm)) {
                if (this.m0.oo(this.om0)) {
                    this.m0.o0(this.omm);
                } else {
                    this.m0.o(this.omm, this.om0);
                }
            }
            if (this.m0.oo(this.om0)) {
                try {
                    n0();
                    nm();
                    this.nn = true;
                    return;
                } catch (IOException e2) {
                    com.thinkup.core.common.no.m.o.on.n.oo().o(5, "DiskLruCache " + this.mo + " is corrupt: " + e2.getMessage() + ", removing", e2);
                    try {
                        mo();
                        this.o00 = false;
                        m();
                        this.nn = true;
                    } catch (Throwable th) {
                        this.o00 = false;
                        throw th;
                    }
                }
            }
            m();
            this.nn = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final boolean om() {
        int i2 = this.no;
        return i2 >= 2000 && i2 >= this.n0.size();
    }

    public final synchronized boolean on() {
        return this.o00;
    }

    public final synchronized long oo() {
        o();
        return this.ono;
    }

    public final synchronized boolean n(String str) {
        o();
        nn();
        oo(str);
        m mVar = this.n0.get(str);
        if (mVar == null) {
            return false;
        }
        o(mVar);
        if (this.ono <= this.on0) {
            this.o0o = false;
        }
        return true;
    }

    private static void oo(String str) {
        if (!on.matcher(str).matches()) {
            throw new IllegalArgumentException(a.n("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
        }
    }

    public final class o {
        final boolean[] m;
        final m o;
        private boolean o0;

        public o(m mVar) {
            this.o = mVar;
            this.m = mVar.oo ? null : new boolean[o0.this.mm];
        }

        private oon m(int i2) {
            synchronized (o0.this) {
                if (this.o0) {
                    throw new IllegalStateException();
                }
                m mVar = this.o;
                if (!mVar.oo || mVar.om != this) {
                    return null;
                }
                try {
                    return o0.this.m0.o(mVar.f42035n[i2]);
                } catch (FileNotFoundException unused) {
                    return null;
                }
            }
        }

        private void o0() {
            synchronized (o0.this) {
                if (!this.o0 && this.o.om == this) {
                    try {
                        o0.this.o(this, false);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        public final void n() {
            synchronized (o0.this) {
                try {
                    if (this.o0) {
                        throw new IllegalStateException();
                    }
                    if (this.o.om == this) {
                        o0.this.o(this, false);
                    }
                    this.o0 = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void o() {
            if (this.o.om != this) {
                return;
            }
            int i2 = 0;
            while (true) {
                o0 o0Var = o0.this;
                if (i2 >= o0Var.mm) {
                    this.o.om = null;
                    return;
                } else {
                    try {
                        o0Var.m0.o0(this.o.o0[i2]);
                    } catch (IOException unused) {
                    }
                    i2++;
                }
            }
        }

        public final oom o(int i2) {
            synchronized (o0.this) {
                try {
                    if (!this.o0) {
                        m mVar = this.o;
                        if (mVar.om != this) {
                            return nm.o();
                        }
                        if (!mVar.oo) {
                            this.m[i2] = true;
                        }
                        try {
                            return new oo(o0.this.m0.m(mVar.o0[i2])) { // from class: com.thinkup.core.common.no.m.o.o.o0.o.1
                                @Override // com.thinkup.core.common.no.m.o.o.oo
                                public final void m() {
                                    synchronized (o0.this) {
                                        o.this.o();
                                    }
                                }
                            };
                        } catch (FileNotFoundException unused) {
                            return nm.o();
                        }
                    }
                    throw new IllegalStateException();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void m() {
            synchronized (o0.this) {
                try {
                    if (!this.o0) {
                        if (this.o.om == this) {
                            o0.this.o(this, true);
                        }
                        this.o0 = true;
                    } else {
                        throw new IllegalStateException();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final class m {
        final long[] m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final File[] f42035n;
        final String o;
        final File[] o0;
        o om;
        long on;
        boolean oo;

        public m(String str) {
            this.o = str;
            int i2 = o0.this.mm;
            this.m = new long[i2];
            this.f42035n = new File[i2];
            this.o0 = new File[i2];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i3 = 0; i3 < o0.this.mm; i3++) {
                sb.append(i3);
                this.f42035n[i3] = new File(o0.this.mo, sb.toString());
                sb.append(".tmp");
                this.o0[i3] = new File(o0.this.mo, sb.toString());
                sb.setLength(length);
            }
        }

        private static IOException m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public final void o(String[] strArr) throws IOException {
            if (strArr.length != o0.this.mm) {
                throw m(strArr);
            }
            for (int i2 = 0; i2 < strArr.length; i2++) {
                try {
                    this.m[i2] = Long.parseLong(strArr[i2]);
                } catch (NumberFormatException unused) {
                    throw m(strArr);
                }
            }
        }

        public final void o(com.thinkup.core.common.no.n.o0 o0Var) {
            for (long j : this.m) {
                o0Var.n0(32).nn(j);
            }
        }

        public final n o() {
            o0 o0Var;
            oon oonVar;
            if (Thread.holdsLock(o0.this)) {
                oon[] oonVarArr = new oon[o0.this.mm];
                long[] jArr = (long[]) this.m.clone();
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    try {
                        o0 o0Var2 = o0.this;
                        if (i3 < o0Var2.mm) {
                            oonVarArr[i3] = o0Var2.m0.o(this.f42035n[i3]);
                            i3++;
                        } else {
                            return o0Var2.new n(this.o, this.on, oonVarArr, jArr);
                        }
                    } catch (FileNotFoundException unused) {
                        while (true) {
                            o0Var = o0.this;
                            if (i2 >= o0Var.mm || (oonVar = oonVarArr[i2]) == null) {
                                break;
                            }
                            com.thinkup.core.common.no.m.o.n.o(oonVar);
                            i2++;
                        }
                        try {
                            o0Var.o(this);
                            return null;
                        } catch (IOException unused2) {
                            return null;
                        }
                    }
                }
            } else {
                throw new AssertionError();
            }
        }
    }

    public final synchronized long o0() {
        return this.on0;
    }

    public static o0 o(com.thinkup.core.common.no.m.o.om.o oVar, File file, long j) {
        if (j > 0) {
            return new o0(oVar, file, j, new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), com.thinkup.core.common.no.m.o.n.o(omn.o + " DiskLruCache", true)));
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final synchronized n o(String str) {
        o();
        nn();
        oo(str);
        m mVar = this.n0.get(str);
        if (mVar != null && mVar.oo) {
            n nVarO = mVar.o();
            if (nVarO == null) {
                return null;
            }
            this.no++;
            this.mn.m(oon).n0(32).m(str).n0(10);
            if (om()) {
                this.onn.execute(this.m00);
            }
            return nVarO;
        }
        return null;
    }

    public final o m(String str) {
        return o(str, -1L);
    }

    public final synchronized o o(String str, long j) {
        o();
        nn();
        oo(str);
        m mVar = this.n0.get(str);
        if (j != -1 && (mVar == null || mVar.on != j)) {
            return null;
        }
        if (mVar != null && mVar.om != null) {
            return null;
        }
        if (!this.o0o && !this.o0m) {
            this.mn.m(ooo).n0(32).m(str).n0(10);
            this.mn.flush();
            if (this.nm) {
                return null;
            }
            if (mVar == null) {
                mVar = new m(str);
                this.n0.put(str, mVar);
            }
            o oVar = new o(mVar);
            mVar.om = oVar;
            return oVar;
        }
        this.onn.execute(this.m00);
        return null;
    }

    private synchronized void o(long j) {
        this.on0 = j;
        if (this.nn) {
            this.onn.execute(this.m00);
        }
    }

    public final synchronized void o(o oVar, boolean z2) {
        m mVar = oVar.o;
        if (mVar.om == oVar) {
            if (z2 && !mVar.oo) {
                for (int i2 = 0; i2 < this.mm; i2++) {
                    if (oVar.m[i2]) {
                        if (!this.m0.oo(mVar.o0[i2])) {
                            oVar.n();
                            return;
                        }
                    } else {
                        oVar.n();
                        throw new IllegalStateException("Newly created entry didn't create value for index ".concat(String.valueOf(i2)));
                    }
                }
            }
            for (int i3 = 0; i3 < this.mm; i3++) {
                File file = mVar.o0[i3];
                if (z2) {
                    if (this.m0.oo(file)) {
                        File file2 = mVar.f42035n[i3];
                        this.m0.o(file, file2);
                        long j = mVar.m[i3];
                        long jOm = this.m0.om(file2);
                        mVar.m[i3] = jOm;
                        this.ono = (this.ono - j) + jOm;
                    }
                } else {
                    this.m0.o0(file);
                }
            }
            this.no++;
            mVar.om = null;
            if (mVar.oo | z2) {
                mVar.oo = true;
                this.mn.m(oo0).n0(32);
                this.mn.m(mVar.o);
                mVar.o(this.mn);
                this.mn.n0(10);
                if (z2) {
                    long j2 = this.onm;
                    this.onm = 1 + j2;
                    mVar.on = j2;
                }
            } else {
                this.n0.remove(mVar.o);
                this.mn.m(oom).n0(32);
                this.mn.m(mVar.o);
                this.mn.n0(10);
            }
            this.mn.flush();
            if (this.ono > this.on0 || om()) {
                this.onn.execute(this.m00);
            }
            return;
        }
        throw new IllegalStateException();
    }

    public final boolean o(m mVar) {
        o oVar = mVar.om;
        if (oVar != null) {
            oVar.o();
        }
        for (int i2 = 0; i2 < this.mm; i2++) {
            this.m0.o0(mVar.f42035n[i2]);
            long j = this.ono;
            long[] jArr = mVar.m;
            this.ono = j - jArr[i2];
            jArr[i2] = 0;
        }
        this.no++;
        this.mn.m(oom).n0(32).m(mVar.o).n0(10);
        this.n0.remove(mVar.o);
        if (om()) {
            this.onn.execute(this.m00);
        }
        return true;
    }
}
