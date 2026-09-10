package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.jp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3821jp implements Closeable, Flushable {
    public static final C3439fY v = new C3439fY("[a-z0-9_-]{1,120}");
    public static final String w = "CLEAN";
    public static final String x = "DIRTY";
    public static final String y = "REMOVE";
    public static final String z = "READ";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3035au f4573a;
    public final File b;
    public final int c;
    public final int d;
    public final long e;
    public final File f;
    public final File g;
    public final File h;
    public long i;
    public InterfaceC2434Gb j;
    public final LinkedHashMap k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public long s;
    public final C4234ob0 t;
    public final C3734ip u;

    public C3821jp(File file, long j, C4497rb0 c4497rb0) {
        C2945Zt c2945Zt = InterfaceC3035au.f4146a;
        AbstractC2995aW.q(file, "directory");
        AbstractC2995aW.q(c4497rb0, "taskRunner");
        this.f4573a = c2945Zt;
        this.b = file;
        this.c = 201105;
        this.d = 2;
        this.e = j;
        this.k = new LinkedHashMap(0, 0.75f, true);
        this.t = c4497rb0.f();
        this.u = new C3734ip(0, this, AbstractC2995aW.v0(" Cache", Vg0.g));
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        this.f = new File(file, "journal");
        this.g = new File(file, "journal.tmp");
        this.h = new File(file, "journal.bkp");
    }

    public static void w(String str) {
        C3439fY c3439fY = v;
        c3439fY.getClass();
        AbstractC2995aW.q(str, "input");
        if (!c3439fY.f4369a.matcher(str).matches()) {
            throw new IllegalArgumentException(AbstractC3950lJ.r("keys must match regex [a-z0-9_-]{1,120}: \"", str, '\"').toString());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.o && !this.p) {
                Collection collectionValues = this.k.values();
                AbstractC2995aW.p(collectionValues, "lruEntries.values");
                int i = 0;
                Object[] array = collectionValues.toArray(new C3383ep[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                C3383ep[] c3383epArr = (C3383ep[]) array;
                int length = c3383epArr.length;
                while (i < length) {
                    C3383ep c3383ep = c3383epArr[i];
                    i++;
                    C3877kY c3877kY = c3383ep.g;
                    if (c3877kY != null && c3877kY != null) {
                        c3877kY.g();
                    }
                }
                v();
                InterfaceC2434Gb interfaceC2434Gb = this.j;
                AbstractC2995aW.n(interfaceC2434Gb);
                interfaceC2434Gb.close();
                this.j = null;
                this.p = true;
                return;
            }
            this.p = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.o) {
            h();
            v();
            InterfaceC2434Gb interfaceC2434Gb = this.j;
            AbstractC2995aW.n(interfaceC2434Gb);
            interfaceC2434Gb.flush();
        }
    }

    public final synchronized void h() {
        if (!(!this.p)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    public final synchronized void i(C3877kY c3877kY, boolean z2) {
        AbstractC2995aW.q(c3877kY, "editor");
        C3383ep c3383ep = (C3383ep) c3877kY.c;
        if (!AbstractC2995aW.i(c3383ep.g, c3877kY)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        int i = 0;
        if (z2 && !c3383ep.e) {
            int i2 = this.d;
            int i3 = 0;
            while (i3 < i2) {
                int i4 = i3 + 1;
                boolean[] zArr = (boolean[]) c3877kY.d;
                AbstractC2995aW.n(zArr);
                if (!zArr[i3]) {
                    c3877kY.c();
                    throw new IllegalStateException(AbstractC2995aW.v0(Integer.valueOf(i3), "Newly created entry didn't create value for index "));
                }
                if (!((C2945Zt) this.f4573a).c((File) c3383ep.d.get(i3))) {
                    c3877kY.c();
                    return;
                }
                i3 = i4;
            }
        }
        int i5 = this.d;
        int i6 = 0;
        while (i6 < i5) {
            int i7 = i6 + 1;
            File file = (File) c3383ep.d.get(i6);
            if (!z2 || c3383ep.f) {
                ((C2945Zt) this.f4573a).a(file);
            } else if (((C2945Zt) this.f4573a).c(file)) {
                File file2 = (File) c3383ep.c.get(i6);
                ((C2945Zt) this.f4573a).d(file, file2);
                long j = c3383ep.b[i6];
                ((C2945Zt) this.f4573a).getClass();
                long length = file2.length();
                c3383ep.b[i6] = length;
                this.i = (this.i - j) + length;
            }
            i6 = i7;
        }
        c3383ep.g = null;
        if (c3383ep.f) {
            u(c3383ep);
            return;
        }
        this.l++;
        InterfaceC2434Gb interfaceC2434Gb = this.j;
        AbstractC2995aW.n(interfaceC2434Gb);
        if (c3383ep.e || z2) {
            c3383ep.e = true;
            interfaceC2434Gb.A(w).writeByte(32);
            interfaceC2434Gb.A(c3383ep.f4341a);
            long[] jArr = c3383ep.b;
            int length2 = jArr.length;
            while (i < length2) {
                long j2 = jArr[i];
                i++;
                interfaceC2434Gb.writeByte(32).E(j2);
            }
            interfaceC2434Gb.writeByte(10);
            if (z2) {
                long j3 = this.s;
                this.s = 1 + j3;
                c3383ep.i = j3;
            }
        } else {
            this.k.remove(c3383ep.f4341a);
            interfaceC2434Gb.A(y).writeByte(32);
            interfaceC2434Gb.A(c3383ep.f4341a);
            interfaceC2434Gb.writeByte(10);
        }
        interfaceC2434Gb.flush();
        if (this.i > this.e || o()) {
            this.t.c(this.u, 0L);
        }
    }

    public final synchronized C3877kY k(long j, String str) {
        try {
            AbstractC2995aW.q(str, "key");
            n();
            h();
            w(str);
            C3383ep c3383ep = (C3383ep) this.k.get(str);
            if (j != -1 && (c3383ep == null || c3383ep.i != j)) {
                return null;
            }
            if ((c3383ep == null ? null : c3383ep.g) != null) {
                return null;
            }
            if (c3383ep != null && c3383ep.h != 0) {
                return null;
            }
            if (!this.q && !this.r) {
                InterfaceC2434Gb interfaceC2434Gb = this.j;
                AbstractC2995aW.n(interfaceC2434Gb);
                interfaceC2434Gb.A(x).writeByte(32).A(str).writeByte(10);
                interfaceC2434Gb.flush();
                if (this.m) {
                    return null;
                }
                if (c3383ep == null) {
                    c3383ep = new C3383ep(this, str);
                    this.k.put(str, c3383ep);
                }
                C3877kY c3877kY = new C3877kY(this, c3383ep);
                c3383ep.g = c3877kY;
                return c3877kY;
            }
            this.t.c(this.u, 0L);
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized C3559gp m(String str) {
        AbstractC2995aW.q(str, "key");
        n();
        h();
        w(str);
        C3383ep c3383ep = (C3383ep) this.k.get(str);
        if (c3383ep == null) {
            return null;
        }
        C3559gp c3559gpA = c3383ep.a();
        if (c3559gpA == null) {
            return null;
        }
        this.l++;
        InterfaceC2434Gb interfaceC2434Gb = this.j;
        AbstractC2995aW.n(interfaceC2434Gb);
        interfaceC2434Gb.A(z).writeByte(32).A(str).writeByte(10);
        if (o()) {
            this.t.c(this.u, 0L);
        }
        return c3559gpA;
    }

    public final synchronized void n() {
        boolean z2;
        try {
            byte[] bArr = Vg0.f3884a;
            if (this.o) {
                return;
            }
            if (((C2945Zt) this.f4573a).c(this.h)) {
                if (((C2945Zt) this.f4573a).c(this.f)) {
                    ((C2945Zt) this.f4573a).a(this.h);
                } else {
                    ((C2945Zt) this.f4573a).d(this.h, this.f);
                }
            }
            InterfaceC3035au interfaceC3035au = this.f4573a;
            File file = this.h;
            AbstractC2995aW.q(interfaceC3035au, "<this>");
            AbstractC2995aW.q(file, "file");
            C2945Zt c2945Zt = (C2945Zt) interfaceC3035au;
            C5076y6 c5076y6E = c2945Zt.e(file);
            try {
                c2945Zt.a(file);
                AbstractC3375el.n(c5076y6E, null);
                z2 = true;
            } catch (IOException unused) {
                AbstractC3375el.n(c5076y6E, null);
                c2945Zt.a(file);
                z2 = false;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3375el.n(c5076y6E, th);
                    throw th2;
                }
            }
            this.n = z2;
            if (((C2945Zt) this.f4573a).c(this.f)) {
                try {
                    r();
                    q();
                    this.o = true;
                    return;
                } catch (IOException e) {
                    C5104yU c5104yU = C5104yU.f5278a;
                    C5104yU c5104yU2 = C5104yU.f5278a;
                    String str = "DiskLruCache " + this.b + " is corrupt: " + ((Object) e.getMessage()) + ", removing";
                    c5104yU2.getClass();
                    C5104yU.i(5, str, e);
                    try {
                        close();
                        ((C2945Zt) this.f4573a).b(this.b);
                        this.p = false;
                        t();
                        this.o = true;
                    } catch (Throwable th3) {
                        this.p = false;
                        throw th3;
                    }
                }
            }
            t();
            this.o = true;
        } catch (Throwable th4) {
            throw th4;
        }
    }

    public final boolean o() {
        int i = this.l;
        return i >= 2000 && i >= this.k.size();
    }

    public final DX p() {
        C5076y6 c5076y6D;
        ((C2945Zt) this.f4573a).getClass();
        File file = this.f;
        AbstractC2995aW.q(file, "file");
        try {
            c5076y6D = AbstractC4496rb.d(file);
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            c5076y6D = AbstractC4496rb.d(file);
        }
        return AbstractC4496rb.e(new C2452Gt(c5076y6D, new C4140nX(this, 21)));
    }

    public final void q() throws IOException {
        File file = this.g;
        C2945Zt c2945Zt = (C2945Zt) this.f4573a;
        c2945Zt.a(file);
        Iterator it = this.k.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC2995aW.p(next, "i.next()");
            C3383ep c3383ep = (C3383ep) next;
            C3877kY c3877kY = c3383ep.g;
            int i = this.d;
            int i2 = 0;
            if (c3877kY == null) {
                while (i2 < i) {
                    this.i += c3383ep.b[i2];
                    i2++;
                }
            } else {
                c3383ep.g = null;
                while (i2 < i) {
                    c2945Zt.a((File) c3383ep.c.get(i2));
                    c2945Zt.a((File) c3383ep.d.get(i2));
                    i2++;
                }
                it.remove();
            }
        }
    }

    public final void r() throws IllegalAccessException, IOException, InvocationTargetException {
        File file = this.f;
        ((C2945Zt) this.f4573a).getClass();
        AbstractC2995aW.q(file, "file");
        Logger logger = AbstractC4926wS.f5180a;
        EX exF = AbstractC4496rb.f(new C5164z6(new FileInputStream(file), Ic0.d));
        try {
            String strJ = exF.j(Long.MAX_VALUE);
            String strJ2 = exF.j(Long.MAX_VALUE);
            String strJ3 = exF.j(Long.MAX_VALUE);
            String strJ4 = exF.j(Long.MAX_VALUE);
            String strJ5 = exF.j(Long.MAX_VALUE);
            if (!AbstractC2995aW.i("libcore.io.DiskLruCache", strJ) || !AbstractC2995aW.i("1", strJ2) || !AbstractC2995aW.i(String.valueOf(this.c), strJ3) || !AbstractC2995aW.i(String.valueOf(this.d), strJ4) || strJ5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strJ + ", " + strJ2 + ", " + strJ4 + ", " + strJ5 + ']');
            }
            int i = 0;
            while (true) {
                try {
                    s(exF.j(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.l = i - this.k.size();
                    if (exF.K()) {
                        this.j = p();
                    } else {
                        t();
                    }
                    AbstractC3375el.n(exF, null);
                    return;
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3375el.n(exF, th);
                throw th2;
            }
        }
    }

    public final void s(String str) throws IOException {
        String strSubstring;
        int i = 0;
        int iS0 = AbstractC3089ba0.s0(str, ' ', 0, false, 6);
        if (iS0 == -1) {
            throw new IOException(AbstractC2995aW.v0(str, "unexpected journal line: "));
        }
        int i2 = iS0 + 1;
        int iS1 = AbstractC3089ba0.s0(str, ' ', i2, false, 4);
        LinkedHashMap linkedHashMap = this.k;
        if (iS1 == -1) {
            strSubstring = str.substring(i2);
            AbstractC2995aW.p(strSubstring, "this as java.lang.String).substring(startIndex)");
            String str2 = y;
            if (iS0 == str2.length() && AbstractC3089ba0.N0(str, str2, false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i2, iS1);
            AbstractC2995aW.p(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        C3383ep c3383ep = (C3383ep) linkedHashMap.get(strSubstring);
        if (c3383ep == null) {
            c3383ep = new C3383ep(this, strSubstring);
            linkedHashMap.put(strSubstring, c3383ep);
        }
        if (iS1 != -1) {
            String str3 = w;
            if (iS0 == str3.length() && AbstractC3089ba0.N0(str, str3, false)) {
                String strSubstring2 = str.substring(iS1 + 1);
                AbstractC2995aW.p(strSubstring2, "this as java.lang.String).substring(startIndex)");
                List listK0 = AbstractC3089ba0.K0(strSubstring2, new char[]{' '});
                c3383ep.e = true;
                c3383ep.g = null;
                if (listK0.size() != c3383ep.j.d) {
                    throw new IOException(AbstractC2995aW.v0(listK0, "unexpected journal line: "));
                }
                try {
                    int size = listK0.size();
                    while (i < size) {
                        int i3 = i + 1;
                        c3383ep.b[i] = Long.parseLong((String) listK0.get(i));
                        i = i3;
                    }
                    return;
                } catch (NumberFormatException unused) {
                    throw new IOException(AbstractC2995aW.v0(listK0, "unexpected journal line: "));
                }
            }
        }
        if (iS1 == -1) {
            String str4 = x;
            if (iS0 == str4.length() && AbstractC3089ba0.N0(str, str4, false)) {
                c3383ep.g = new C3877kY(this, c3383ep);
                return;
            }
        }
        if (iS1 == -1) {
            String str5 = z;
            if (iS0 == str5.length() && AbstractC3089ba0.N0(str, str5, false)) {
                return;
            }
        }
        throw new IOException(AbstractC2995aW.v0(str, "unexpected journal line: "));
    }

    public final synchronized void t() {
        try {
            InterfaceC2434Gb interfaceC2434Gb = this.j;
            if (interfaceC2434Gb != null) {
                interfaceC2434Gb.close();
            }
            DX dxE = AbstractC4496rb.e(((C2945Zt) this.f4573a).e(this.g));
            try {
                dxE.A("libcore.io.DiskLruCache");
                dxE.writeByte(10);
                dxE.A("1");
                dxE.writeByte(10);
                dxE.E(this.c);
                dxE.writeByte(10);
                dxE.E(this.d);
                dxE.writeByte(10);
                dxE.writeByte(10);
                Iterator it = this.k.values().iterator();
                while (true) {
                    int i = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    C3383ep c3383ep = (C3383ep) it.next();
                    if (c3383ep.g != null) {
                        dxE.A(x);
                        dxE.writeByte(32);
                        dxE.A(c3383ep.f4341a);
                        dxE.writeByte(10);
                    } else {
                        dxE.A(w);
                        dxE.writeByte(32);
                        dxE.A(c3383ep.f4341a);
                        long[] jArr = c3383ep.b;
                        int length = jArr.length;
                        while (i < length) {
                            long j = jArr[i];
                            i++;
                            dxE.writeByte(32);
                            dxE.E(j);
                        }
                        dxE.writeByte(10);
                    }
                }
                AbstractC3375el.n(dxE, null);
                if (((C2945Zt) this.f4573a).c(this.f)) {
                    ((C2945Zt) this.f4573a).d(this.f, this.h);
                }
                ((C2945Zt) this.f4573a).d(this.g, this.f);
                ((C2945Zt) this.f4573a).a(this.h);
                this.j = p();
                this.m = false;
                this.r = false;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3375el.n(dxE, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final void u(C3383ep c3383ep) throws IOException {
        InterfaceC2434Gb interfaceC2434Gb;
        AbstractC2995aW.q(c3383ep, "entry");
        boolean z2 = this.n;
        String str = c3383ep.f4341a;
        if (!z2) {
            if (c3383ep.h > 0 && (interfaceC2434Gb = this.j) != null) {
                interfaceC2434Gb.A(x);
                interfaceC2434Gb.writeByte(32);
                interfaceC2434Gb.A(str);
                interfaceC2434Gb.writeByte(10);
                interfaceC2434Gb.flush();
            }
            if (c3383ep.h > 0 || c3383ep.g != null) {
                c3383ep.f = true;
                return;
            }
        }
        C3877kY c3877kY = c3383ep.g;
        if (c3877kY != null) {
            c3877kY.g();
        }
        for (int i = 0; i < this.d; i++) {
            ((C2945Zt) this.f4573a).a((File) c3383ep.c.get(i));
            long j = this.i;
            long[] jArr = c3383ep.b;
            this.i = j - jArr[i];
            jArr[i] = 0;
        }
        this.l++;
        InterfaceC2434Gb interfaceC2434Gb2 = this.j;
        if (interfaceC2434Gb2 != null) {
            interfaceC2434Gb2.A(y);
            interfaceC2434Gb2.writeByte(32);
            interfaceC2434Gb2.A(str);
            interfaceC2434Gb2.writeByte(10);
        }
        this.k.remove(str);
        if (o()) {
            this.t.c(this.u, 0L);
        }
    }

    public final void v() throws IOException {
        while (this.i > this.e) {
            for (C3383ep c3383ep : this.k.values()) {
                if (!c3383ep.f) {
                    u(c3383ep);
                }
            }
            return;
        }
        this.q = false;
    }
}
