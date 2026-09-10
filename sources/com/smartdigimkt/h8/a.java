package com.smartdigimkt.h8;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.applovin.impl.H0;
import com.inmobi.commons.core.configs.AdConfig;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a implements SharedPreferences, SharedPreferences.Editor {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    protected static final String f35701A = "parse dara failed";

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    protected static final String f35702B = "open file failed";
    protected static final String C = "map failed";
    protected static final String D = "miss cipher";

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    protected static final String f35703E = "Encrypt failed";

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    static final String f35704F = "truncate finish";
    static final String G = "gc finish";
    protected static final String H = ".kva";

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    protected static final String f35705I = ".kvb";

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    protected static final String f35706J = ".kvc";
    protected static final String K = ".tmp";
    protected static final int L = 268435456;
    protected static final int M = 1073741824;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final byte[] f35707N = new byte[0];
    protected static final int[] O = {0, 1, 4, 4, 8, 8};

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    protected static final int f35708P = 12;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    protected static final int f35709Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    protected static final int f35710R;
    protected static final int S = 8192;
    protected static final int T = 80;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected static final String f35711z = "both files error";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final String f35713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final String f35714c;
    protected final Map<String, com.smartdigimkt.i8.b> d;
    protected final com.smartdigimkt.i8.a f;
    protected int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected long f35716h;
    protected f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected int f35718l;
    protected int m;
    protected String q;
    protected int v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final int f35712a = h.f35759c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final com.smartdigimkt.i8.c f35715e = h.f35757a;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final HashMap<String, b.AbstractC0504b> f35717i = new HashMap<>();
    protected volatile boolean j = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected final List<String> f35719n = new ArrayList();
    protected boolean o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected boolean f35720p = false;
    protected final m r = new m();
    protected final m s = new m();
    protected final e t = new e();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected final Executor f35721u = new i();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected final ArrayList<C0503a> f35722w = new ArrayList<>();
    protected final ArrayList<SharedPreferences.OnSharedPreferenceChangeListener> x = new ArrayList<>();
    private final Handler y = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.smartdigimkt.h8.a$a, reason: collision with other inner class name */
    public static class C0503a implements Comparable<C0503a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35723a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f35724b;

        public C0503a(int i2, int i3) {
            this.f35723a = i2;
            this.f35724b = i3;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(C0503a c0503a) {
            return this.f35723a - c0503a.f35723a;
        }
    }

    static {
        int iA = l.a();
        f35709Q = iA;
        f35710R = Math.max(iA, 32768);
    }

    public a(String str, String str2, com.smartdigimkt.i8.b[] bVarArr, com.smartdigimkt.i8.a aVar) {
        this.f35713b = str;
        this.f35714c = str2;
        this.f = aVar;
        HashMap map = new HashMap();
        if (bVarArr != null) {
            for (com.smartdigimkt.i8.b bVar : bVarArr) {
                String strA = bVar.a();
                if (map.containsKey(strA)) {
                    c("duplicate encoder tag:" + strA);
                } else {
                    map.put(strA, bVar);
                }
            }
        }
        k kVar = k.f35774a;
        map.put(kVar.a(), kVar);
        this.d = map;
    }

    public static boolean d(int i2) {
        return (i2 & 1073741824) != 0;
    }

    public static int f(int i2) {
        return i2 & (-1073741825);
    }

    private void g() {
        f fVar = this.k;
        if (fVar == null || fVar.f35745b.length != f35709Q) {
            this.k = new f(f35709Q);
        } else {
            fVar.a(4, 0L);
        }
        this.k.b(0, e(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(String str) {
        if (this.t.a(str)) {
            return;
        }
        l.a(new File(this.f35713b + this.f35714c, str));
    }

    public abstract void a(byte b2, int i2);

    public abstract void a(int i2, int i3, int i4);

    public abstract void a(int i2, long j, int i3);

    public abstract void a(long j, long j2, int i2);

    public abstract void a(g gVar);

    public abstract void b();

    public abstract void b(int i2);

    @Override // android.content.SharedPreferences
    public synchronized boolean contains(String str) {
        return this.f35717i.containsKey(str);
    }

    public void e() {
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return this;
    }

    @Override // android.content.SharedPreferences
    public synchronized Map<String, Object> getAll() {
        Object objValueOf;
        int size = this.f35717i.size();
        if (size == 0) {
            return new HashMap();
        }
        HashMap map = new HashMap(((size * 4) / 3) + 1);
        for (Map.Entry<String, b.AbstractC0504b> entry : this.f35717i.entrySet()) {
            String key = entry.getKey();
            b.AbstractC0504b value = entry.getValue();
            switch (value.a()) {
                case 1:
                    objValueOf = Boolean.valueOf(((b.c) value).f35726b);
                    break;
                case 2:
                    objValueOf = Integer.valueOf(((b.f) value).f35729b);
                    break;
                case 3:
                    objValueOf = Float.valueOf(((b.e) value).f35728b);
                    break;
                case 4:
                    objValueOf = Long.valueOf(((b.g) value).f35730b);
                    break;
                case 5:
                    objValueOf = Double.valueOf(((b.d) value).f35727b);
                    break;
                case 6:
                    b.i iVar = (b.i) value;
                    objValueOf = iVar.f35733e ? a(iVar, this.f) : iVar.f35731b;
                    break;
                case 7:
                    b.a aVar = (b.a) value;
                    objValueOf = aVar.f35733e ? a(aVar, this.f) : aVar.f35731b;
                    break;
                case 8:
                    b.h hVar = (b.h) value;
                    objValueOf = hVar.f35733e ? a(hVar, this.f) : hVar.f35731b;
                    break;
                default:
                    objValueOf = null;
                    break;
            }
            if (objValueOf != null) {
                map.put(key, objValueOf);
            }
        }
        return map;
    }

    @Override // android.content.SharedPreferences
    public synchronized boolean getBoolean(String str, boolean z2) {
        b.AbstractC0504b abstractC0504b = this.f35717i.get(str);
        if (abstractC0504b != null && abstractC0504b.a() == 1) {
            z2 = ((b.c) abstractC0504b).f35726b;
        }
        return z2;
    }

    @Override // android.content.SharedPreferences
    public synchronized float getFloat(String str, float f) {
        b.AbstractC0504b abstractC0504b = this.f35717i.get(str);
        if (abstractC0504b != null && abstractC0504b.a() == 3) {
            f = ((b.e) abstractC0504b).f35728b;
        }
        return f;
    }

    @Override // android.content.SharedPreferences
    public synchronized int getInt(String str, int i2) {
        b.AbstractC0504b abstractC0504b = this.f35717i.get(str);
        if (abstractC0504b != null && abstractC0504b.a() == 2) {
            i2 = ((b.f) abstractC0504b).f35729b;
        }
        return i2;
    }

    @Override // android.content.SharedPreferences
    public synchronized long getLong(String str, long j) {
        b.AbstractC0504b abstractC0504b = this.f35717i.get(str);
        if (abstractC0504b != null && abstractC0504b.a() == 4) {
            j = ((b.g) abstractC0504b).f35730b;
        }
        return j;
    }

    @Override // android.content.SharedPreferences
    public synchronized String getString(String str, String str2) {
        b.AbstractC0504b abstractC0504b = this.f35717i.get(str);
        if (abstractC0504b != null && abstractC0504b.a() == 6) {
            b.i iVar = (b.i) abstractC0504b;
            if (!iVar.f35733e) {
                return (String) iVar.f35731b;
            }
            Object objA = this.s.a(str);
            if (objA instanceof String) {
                return (String) objA;
            }
            String strA = a(iVar, this.f);
            if (strA != null && !strA.isEmpty()) {
                this.s.a(str, strA);
                return strA;
            }
            remove(str);
            return str2;
        }
        return str2;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        Set<String> setL = l(str);
        return setL != null ? setL : set;
    }

    public void h() {
        this.g = 12;
        this.f35716h = 0L;
        this.f35717i.clear();
        this.s.b();
        this.r.b();
        c();
    }

    public final void i() {
        h();
        g();
    }

    public void j() throws Throwable {
        com.smartdigimkt.i8.b bVar;
        com.smartdigimkt.i8.b[] bVarArr = (com.smartdigimkt.i8.b[]) this.d.values().toArray(new com.smartdigimkt.i8.b[this.d.size()]);
        String str = "temp_" + this.f35714c;
        g gVar = new g(this.f35713b, str, bVarArr, this.f, 2);
        gVar.a0 = false;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b.AbstractC0504b> entry : this.f35717i.entrySet()) {
            String key = entry.getKey();
            b.AbstractC0504b value = entry.getValue();
            if (value instanceof b.i) {
                b.i iVar = (b.i) value;
                if (iVar.f35733e) {
                    arrayList.add((String) iVar.f35731b);
                    String strA = a(iVar, (com.smartdigimkt.i8.a) null);
                    if (strA != null) {
                        gVar.putString(key, strA);
                    }
                } else {
                    gVar.putString(key, (String) iVar.f35731b);
                }
            } else if (value instanceof b.c) {
                gVar.putBoolean(key, ((b.c) value).f35726b);
            } else if (value instanceof b.f) {
                gVar.putInt(key, ((b.f) value).f35729b);
            } else if (value instanceof b.g) {
                gVar.putLong(key, ((b.g) value).f35730b);
            } else if (value instanceof b.e) {
                gVar.putFloat(key, ((b.e) value).f35728b);
            } else if (value instanceof b.d) {
                gVar.b(key, ((b.d) value).f35727b);
            } else if (value instanceof b.a) {
                b.a aVar = (b.a) value;
                if (aVar.f35733e) {
                    arrayList.add((String) aVar.f35731b);
                    byte[] bArrA = a(aVar, (com.smartdigimkt.i8.a) null);
                    if (bArrA != null) {
                        gVar.b(key, bArrA);
                    }
                } else {
                    gVar.b(key, (byte[]) aVar.f35731b);
                }
            } else if (value instanceof b.h) {
                b.h hVar = (b.h) value;
                if (hVar.f35733e) {
                    arrayList.add((String) hVar.f35731b);
                    Object objA = a(hVar, (com.smartdigimkt.i8.a) null);
                    if (objA != null && (bVar = hVar.f) != null) {
                        gVar.a(key, objA, (com.smartdigimkt.i8.b<Object>) bVar);
                    }
                } else {
                    com.smartdigimkt.i8.b bVar2 = hVar.f;
                    if (bVar2 != null) {
                        gVar.a(key, hVar.f35731b, (com.smartdigimkt.i8.b<Object>) bVar2);
                    }
                }
            }
        }
        gVar.contains("");
        this.k = gVar.k;
        this.f35716h = gVar.f35716h;
        this.g = gVar.g;
        c();
        this.f35717i.clear();
        this.f35717i.putAll(gVar.f35717i);
        a(gVar);
        while (gVar.t.a()) {
            try {
                Thread.sleep(10L);
            } catch (Exception unused) {
            }
        }
        File file = new File(this.f35713b, str);
        String str2 = this.f35713b + this.f35714c;
        l.a(file, str2);
        l.a(file);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            l.a(new File(str2, (String) it.next()));
        }
        this.o = false;
    }

    public String k(String str) {
        return getString(str, "");
    }

    public abstract void k();

    public synchronized Set<String> l(String str) {
        return (Set) j(str);
    }

    public abstract void m(String str);

    public final void n(String str) {
        com.smartdigimkt.i8.c cVar = this.f35715e;
        if (cVar != null) {
            cVar.a(this.f35714c, str);
        }
    }

    public synchronized void p(String str) {
        if (this.x.isEmpty()) {
            return;
        }
        Iterator<SharedPreferences.OnSharedPreferenceChangeListener> it = this.x.iterator();
        while (it.hasNext()) {
            this.y.post(new H0(this, it.next(), str, 25));
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor putBoolean(String str, boolean z2) {
        try {
            if (this.f35720p) {
                return this;
            }
            a(str);
            e();
            b.AbstractC0504b abstractC0504b = this.f35717i.get(str);
            if (abstractC0504b != null && abstractC0504b.a() != 1) {
                remove(str);
                abstractC0504b = null;
            }
            b.c cVar = (b.c) abstractC0504b;
            if (cVar == null) {
                if (!a(str, (byte) 1)) {
                    return this;
                }
                f fVar = this.k;
                int i2 = fVar.f35746c;
                fVar.a(z2 ? (byte) 1 : (byte) 0);
                k();
                this.f35717i.put(str, new b.c(i2, z2));
                m(str);
            } else if (cVar.f35726b != z2) {
                cVar.f35726b = z2;
                a(z2 ? (byte) 1 : (byte) 0, cVar.f35725a);
                m(str);
            }
            return this;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor putFloat(String str, float f) {
        try {
            if (this.f35720p) {
                return this;
            }
            a(str);
            e();
            b.AbstractC0504b abstractC0504b = this.f35717i.get(str);
            if (abstractC0504b != null && abstractC0504b.a() != 3) {
                remove(str);
                abstractC0504b = null;
            }
            b.e eVar = (b.e) abstractC0504b;
            if (eVar == null) {
                if (!a(str, (byte) 3)) {
                    return this;
                }
                f fVar = this.k;
                int i2 = fVar.f35746c;
                fVar.g(a(f));
                k();
                this.f35717i.put(str, new b.e(i2, f));
                m(str);
            } else if (eVar.f35728b != f) {
                int iA = a(f);
                long jC = ((long) (this.k.c(eVar.f35725a) ^ iA)) & 4294967295L;
                eVar.f35728b = f;
                a(iA, jC, eVar.f35725a);
                m(str);
            }
            return this;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor putInt(String str, int i2) {
        try {
            if (this.f35720p) {
                return this;
            }
            a(str);
            e();
            b.AbstractC0504b abstractC0504b = this.f35717i.get(str);
            if (abstractC0504b != null && abstractC0504b.a() != 2) {
                remove(str);
                abstractC0504b = null;
            }
            b.f fVar = (b.f) abstractC0504b;
            if (fVar == null) {
                if (!a(str, (byte) 2)) {
                    return this;
                }
                f fVar2 = this.k;
                int i3 = fVar2.f35746c;
                com.smartdigimkt.i8.a aVar = this.f;
                fVar2.g(aVar != null ? aVar.a(i2) : i2);
                k();
                this.f35717i.put(str, new b.f(i3, i2));
                m(str);
            } else if (fVar.f35729b != i2) {
                com.smartdigimkt.i8.a aVar2 = this.f;
                int iA = aVar2 != null ? aVar2.a(i2) : i2;
                int iC = this.f != null ? this.k.c(fVar.f35725a) : fVar.f35729b;
                fVar.f35729b = i2;
                a(iA, ((long) (iC ^ iA)) & 4294967295L, fVar.f35725a);
                m(str);
            }
            return this;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor putLong(String str, long j) throws Throwable {
        Throwable th;
        a aVar;
        try {
            try {
                if (this.f35720p) {
                    return this;
                }
                a(str);
                e();
                b.AbstractC0504b abstractC0504b = this.f35717i.get(str);
                if (abstractC0504b != null) {
                    try {
                        if (abstractC0504b.a() != 4) {
                            remove(str);
                            abstractC0504b = null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                b.g gVar = (b.g) abstractC0504b;
                if (gVar != null) {
                    if (gVar.f35730b != j) {
                        com.smartdigimkt.i8.a aVar2 = this.f;
                        long jA = aVar2 != null ? aVar2.a(j) : j;
                        long jD = (this.f != null ? this.k.d(gVar.f35725a) : gVar.f35730b) ^ jA;
                        gVar.f35730b = j;
                        aVar = this;
                        aVar.a(jA, jD, gVar.f35725a);
                        m(str);
                    }
                    return aVar;
                }
                if (!a(str, (byte) 4)) {
                    return this;
                }
                f fVar = this.k;
                int i2 = fVar.f35746c;
                com.smartdigimkt.i8.a aVar3 = this.f;
                fVar.a(aVar3 != null ? aVar3.a(j) : j);
                k();
                this.f35717i.put(str, new b.g(i2, j));
                m(str);
                aVar = this;
                return aVar;
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
        }
        throw th;
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor putString(String str, String str2) throws Throwable {
        Throwable th;
        a aVar;
        String str3;
        try {
            try {
                if (this.f35720p) {
                    return this;
                }
                a(str);
                try {
                    if (str2 == null) {
                        remove(str);
                        aVar = this;
                    } else {
                        b.AbstractC0504b abstractC0504b = this.f35717i.get(str);
                        if (abstractC0504b != null && abstractC0504b.a() != 6) {
                            remove(str);
                            abstractC0504b = null;
                        }
                        b.i iVar = (b.i) abstractC0504b;
                        if (iVar != null && !iVar.f35733e && str2.equals(iVar.f35731b)) {
                            return this;
                        }
                        e();
                        if (this.f != null || str2.length() * 3 >= this.f35712a) {
                            byte[] bytes = str2.isEmpty() ? f35707N : str2.getBytes(StandardCharsets.UTF_8);
                            com.smartdigimkt.i8.a aVar2 = this.f;
                            if (aVar2 != null) {
                                bytes = aVar2.a(bytes);
                            }
                            byte[] bArr = bytes;
                            if (bArr == null) {
                                a(new Exception(f35703E));
                                return this;
                            }
                            aVar = this;
                            str3 = str;
                            aVar.a(str3, str2, bArr, iVar, (byte) 6);
                        } else {
                            a(str, str2, iVar);
                            aVar = this;
                            str3 = str;
                        }
                        m(str3);
                    }
                    return aVar;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
        }
        throw th;
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor putStringSet(String str, Set<String> set) {
        try {
            if (this.f35720p) {
                return this;
            }
            if (set == null) {
                remove(str);
            } else {
                a(str, set, k.f35774a);
            }
            return this;
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract void q(String str);

    @Override // android.content.SharedPreferences
    public synchronized void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        if (onSharedPreferenceChangeListener == null) {
            return;
        }
        if (!this.x.contains(onSharedPreferenceChangeListener)) {
            this.x.add(onSharedPreferenceChangeListener);
        }
    }

    @Override // android.content.SharedPreferences
    public synchronized void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.x.remove(onSharedPreferenceChangeListener);
    }

    public final long a(long j, int i2) {
        int i3 = (i2 & 7) << 3;
        return (j >>> (64 - i3)) | (j << i3);
    }

    public final int b(int i2, int i3) {
        if (i3 >= L) {
            throw new IllegalStateException("data size out of limit");
        }
        int i4 = f35709Q;
        if (i3 <= i4) {
            return i4;
        }
        while (i2 < i3) {
            i2 <<= 1;
        }
        return i2;
    }

    public void c(int i2) {
        a(this.f35722w);
        C0503a c0503a = this.f35722w.get(0);
        int i3 = c0503a.f35723a;
        int i4 = this.g;
        int i5 = i4 - this.v;
        int i6 = i5 - 12;
        int i7 = i5 - i3;
        int i8 = i4 - i3;
        int i9 = 1;
        boolean z2 = i6 < i8 + i7;
        if (!z2) {
            this.f35716h ^= this.k.a(i3, i8);
        }
        int size = this.f35722w.size();
        int i10 = size - 1;
        int i11 = this.g - this.f35722w.get(i10).f35724b;
        int i12 = i11 > 0 ? size : i10;
        int[] iArr = new int[i12];
        int[] iArr2 = new int[i12];
        int i13 = c0503a.f35723a;
        int i14 = c0503a.f35724b;
        while (i9 < size) {
            C0503a c0503a2 = this.f35722w.get(i9);
            int i15 = c0503a2.f35723a - i14;
            boolean z3 = z2;
            byte[] bArr = this.k.f35745b;
            System.arraycopy(bArr, i14, bArr, i13, i15);
            int i16 = i9 - 1;
            iArr[i16] = i14;
            iArr2[i16] = i14 - i13;
            i13 += i15;
            i14 = c0503a2.f35724b;
            i9++;
            z2 = z3;
        }
        boolean z4 = z2;
        if (i11 > 0) {
            byte[] bArr2 = this.k.f35745b;
            System.arraycopy(bArr2, i14, bArr2, i13, i11);
            iArr[i10] = i14;
            iArr2[i10] = i14 - i13;
        }
        c();
        if (z4) {
            this.f35716h = this.k.a(12, i6);
        } else {
            this.f35716h ^= this.k.a(i3, i7);
        }
        this.g = i5;
        a(i3, i2, i7);
        a(i3, iArr, iArr2);
        n(G);
    }

    public final void d() {
        try {
            l.a(new File(this.f35713b, this.f35714c + f35706J));
            l.a(new File(this.f35713b, this.f35714c + K));
        } catch (Exception e2) {
            a(e2);
        }
    }

    public final int e(int i2) {
        return this.f == null ? i2 : i2 | 1073741824;
    }

    public double f(String str) {
        return a(str, 0.0d);
    }

    public final boolean a(File file) throws IOException {
        long length = file.length();
        if (length != 0 && length < 268435456) {
            int i2 = (int) length;
            int iB = b(f35709Q, i2);
            f fVar = this.k;
            if (fVar != null && fVar.f35745b.length == iB) {
                fVar.f35746c = 0;
            } else {
                fVar = new f(new byte[iB]);
                this.k = fVar;
            }
            l.a(file, fVar.f35745b, i2);
            int iB2 = fVar.b();
            if (iB2 < 0) {
                return false;
            }
            int iF = f(iB2);
            boolean zD = d(iB2);
            long jC = fVar.c();
            this.g = iF + 12;
            if (iF >= 0 && iF <= i2 - 12 && jC == fVar.a(12, iF) && a(zD)) {
                this.f35716h = jC;
                return true;
            }
        }
        return false;
    }

    public synchronized boolean e(String str) {
        return getBoolean(str, false);
    }

    public void f() {
        b(this.m);
        int i2 = this.g;
        this.f35718l = i2;
        this.g = this.m + i2;
        this.k.f35746c = i2;
    }

    public long i(String str) {
        return getLong(str, 0L);
    }

    public final void b(String str) {
        h.a().execute(new o(1, this, str));
    }

    public final void b(Exception exc) {
        com.smartdigimkt.i8.c cVar = this.f35715e;
        if (cVar != null) {
            cVar.a(this.f35714c, exc);
        }
    }

    public byte[] d(String str) {
        return a(str, f35707N);
    }

    public float g(String str) {
        return getFloat(str, 0.0f);
    }

    public synchronized SharedPreferences.Editor b(String str, double d) throws Throwable {
        Throwable th;
        a aVar;
        try {
            try {
                if (this.f35720p) {
                    return this;
                }
                a(str);
                e();
                b.AbstractC0504b abstractC0504b = this.f35717i.get(str);
                if (abstractC0504b != null) {
                    try {
                        if (abstractC0504b.a() != 5) {
                            remove(str);
                            abstractC0504b = null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                b.d dVar = (b.d) abstractC0504b;
                if (dVar != null) {
                    if (dVar.f35727b != d) {
                        long jA = a(d);
                        long jD = jA ^ this.k.d(dVar.f35725a);
                        dVar.f35727b = d;
                        aVar = this;
                        aVar.a(jA, jD, dVar.f35725a);
                        m(str);
                    }
                    return aVar;
                }
                if (!a(str, (byte) 5)) {
                    return this;
                }
                f fVar = this.k;
                int i2 = fVar.f35746c;
                fVar.a(a(d));
                k();
                this.f35717i.put(str, new b.d(i2, d));
                m(str);
                aVar = this;
                return aVar;
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
        }
        throw th;
    }

    public int h(String str) {
        return getInt(str, 0);
    }

    public final boolean a(boolean z2) {
        boolean z3 = false;
        if (z2 && this.f == null) {
            c(D);
            return false;
        }
        com.smartdigimkt.i8.a aVar = z2 ? this.f : null;
        f fVar = this.k;
        fVar.f35746c = 12;
        while (true) {
            try {
                int i2 = fVar.f35746c;
                int i3 = this.g;
                boolean z4 = true;
                if (i2 >= i3) {
                    if (i2 != i3) {
                        a(new Exception(f35701A));
                        return false;
                    }
                    if (!z2 && this.f != null && i3 != 12) {
                        z3 = true;
                    }
                    this.o = z3;
                    return true;
                }
                byte bA = fVar.a();
                byte b2 = (byte) (bA & 63);
                if (b2 >= 1 && b2 <= 8) {
                    int iA = fVar.a() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                    if (iA == 0) {
                        throw new IllegalStateException("invalid key size");
                    }
                    if (bA < 0) {
                        fVar.f35746c += iA;
                        int iD = fVar.f35746c + (b2 <= 5 ? O[b2] : fVar.d() & 65535);
                        fVar.f35746c = iD;
                        a(i2, iD);
                    } else {
                        String strB = fVar.b(aVar, iA);
                        int i4 = fVar.f35746c;
                        if (b2 > 5) {
                            int iD2 = fVar.d() & 65535;
                            boolean z5 = (bA & 64) != 0;
                            if (z5 && iD2 != 32) {
                                throw new IllegalStateException("name size not match");
                            }
                            if (b2 == 6) {
                                this.f35717i.put(strB, new b.i(i2, i4 + 2, z5 ? fVar.e(iD2) : fVar.b(aVar, iD2), iD2, z5));
                            } else if (b2 == 7) {
                                this.f35717i.put(strB, new b.a(i2, i4 + 2, z5 ? fVar.e(iD2) : fVar.a(aVar, iD2), iD2, z5));
                            } else if (z5) {
                                this.f35717i.put(strB, new b.h(i2, i4 + 2, fVar.e(iD2), iD2, true));
                            } else {
                                a(iD2, strB, i2, i4, aVar);
                                fVar.f35746c = i4 + 2 + iD2;
                            }
                        } else if (b2 == 1) {
                            HashMap<String, b.AbstractC0504b> map = this.f35717i;
                            if (fVar.a() != 1) {
                                z4 = false;
                            }
                            map.put(strB, new b.c(i4, z4));
                        } else if (b2 == 2) {
                            this.f35717i.put(strB, new b.f(i4, fVar.c(aVar)));
                        } else if (b2 == 3) {
                            this.f35717i.put(strB, new b.e(i4, fVar.b(aVar)));
                        } else if (b2 != 4) {
                            this.f35717i.put(strB, new b.d(i4, fVar.a(aVar)));
                        } else {
                            this.f35717i.put(strB, new b.g(i4, fVar.d(aVar)));
                        }
                    }
                } else {
                    throw new Exception(f35701A);
                }
            } catch (Exception e2) {
                a(e2);
                return false;
            }
        }
    }

    public synchronized SharedPreferences.Editor b(String str, byte[] bArr) throws Throwable {
        Throwable th;
        a aVar;
        try {
            try {
                if (this.f35720p) {
                    return this;
                }
                a(str);
                try {
                    if (bArr == null) {
                        remove(str);
                        aVar = this;
                    } else {
                        e();
                        b.AbstractC0504b abstractC0504b = this.f35717i.get(str);
                        if (abstractC0504b != null && abstractC0504b.a() != 7) {
                            remove(str);
                            abstractC0504b = null;
                        }
                        b.a aVar2 = (b.a) abstractC0504b;
                        com.smartdigimkt.i8.a aVar3 = this.f;
                        byte[] bArrA = aVar3 != null ? aVar3.a(bArr) : bArr;
                        if (bArrA == null) {
                            a(new Exception(f35703E));
                            return this;
                        }
                        aVar = this;
                        aVar.a(str, bArr, bArrA, aVar2, (byte) 7);
                        m(str);
                    }
                    return aVar;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
        }
        throw th;
    }

    public final void c() {
        this.v = 0;
        this.f35722w.clear();
    }

    public final void c(String str) {
        com.smartdigimkt.i8.c cVar = this.f35715e;
        if (cVar != null) {
            cVar.b(this.f35714c, new Exception(str));
        }
    }

    private void b(String str, int i2) {
        this.k.a((short) i2);
        if (i2 == str.length()) {
            f fVar = this.k;
            str.getBytes(0, i2, fVar.f35745b, fVar.f35746c);
        } else {
            this.k.c(str);
        }
    }

    private int b(String str, byte[] bArr, byte b2) {
        if (!a(str, b2, bArr.length + 2)) {
            return 0;
        }
        this.k.a((short) bArr.length);
        f fVar = this.k;
        int i2 = fVar.f35746c;
        fVar.a(bArr);
        return i2;
    }

    private void a(int i2, String str, int i3, int i4, com.smartdigimkt.i8.a aVar) throws Exception {
        f fVar;
        int length;
        if (aVar == null) {
            fVar = this.k;
            length = i2;
        } else {
            byte[] bArr = new byte[i2];
            f fVar2 = this.k;
            System.arraycopy(fVar2.f35745b, fVar2.f35746c, bArr, 0, i2);
            byte[] bArrB = aVar.b(bArr);
            fVar = new f(bArrB);
            length = bArrB.length;
        }
        int iA = fVar.a() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        String strE = fVar.e(iA);
        com.smartdigimkt.i8.b bVar = this.d.get(strE);
        int i5 = length - (iA + 1);
        if (i5 < 0) {
            throw new Exception(f35701A);
        }
        if (bVar != null) {
            try {
                Object objA = bVar.a(fVar.f35745b, fVar.f35746c, i5);
                if (objA != null) {
                    b.h hVar = new b.h(i3, i4 + 2, objA, i2, false);
                    hVar.f = bVar;
                    this.f35717i.put(str, hVar);
                    return;
                }
                return;
            } catch (Exception e2) {
                a(e2);
                return;
            }
        }
        c("object with tag: " + strE + " without encoder");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public synchronized <T> T j(String str) {
        b.AbstractC0504b abstractC0504b = this.f35717i.get(str);
        if (abstractC0504b != null && abstractC0504b.a() == 8) {
            b.h hVar = (b.h) abstractC0504b;
            if (hVar.f35733e) {
                T t = (T) this.s.a(str);
                if (t != null) {
                    return t;
                }
                T t2 = (T) a(hVar, this.f);
                if (t2 == null) {
                    remove(str);
                    return null;
                }
                this.s.a(str, t2);
                return t2;
            }
            return (T) hVar.f35731b;
        }
        return null;
    }

    public final void a(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("key is empty");
        }
    }

    public final void a(int i2) {
        if (i2 > 255) {
            throw new IllegalArgumentException("key's length must less than 256");
        }
    }

    public static void a(ArrayList<C0503a> arrayList) {
        Collections.sort(arrayList);
        int i2 = 0;
        C0503a c0503a = arrayList.get(0);
        int size = arrayList.size();
        for (int i3 = 1; i3 < size; i3++) {
            C0503a c0503a2 = arrayList.get(i3);
            if (c0503a2.f35723a == c0503a.f35724b) {
                c0503a.f35724b = c0503a2.f35724b;
            } else {
                i2++;
                if (i2 != i3) {
                    arrayList.set(i2, c0503a2);
                }
                c0503a = c0503a2;
            }
        }
        int i4 = i2 + 1;
        if (size > i4) {
            arrayList.subList(i4, size).clear();
        }
    }

    public final void a(int i2, int[] iArr, int[] iArr2) {
        for (b.AbstractC0504b abstractC0504b : this.f35717i.values()) {
            int i3 = abstractC0504b.f35725a;
            if (i3 > i2) {
                int i4 = iArr2[l.a(iArr, i3)];
                abstractC0504b.f35725a -= i4;
                if (abstractC0504b.a() >= 6) {
                    ((b.j) abstractC0504b).f35732c -= i4;
                }
            }
        }
    }

    public final void a(File file, File file2) {
        try {
            if (a(file)) {
                return;
            }
        } catch (IOException e2) {
            b(e2);
        }
        i();
        try {
            if (a(file2)) {
                return;
            }
        } catch (IOException e3) {
            b(e3);
        }
        i();
    }

    private void a(int i2, int i3) {
        this.v = (i3 - i2) + this.v;
        this.f35722w.add(new C0503a(i2, i3));
    }

    public final void a(Exception exc) {
        com.smartdigimkt.i8.c cVar = this.f35715e;
        if (cVar != null) {
            cVar.b(this.f35714c, exc);
        }
    }

    public final int a() {
        return this.g <= 16384 ? 8192 : 16384;
    }

    public synchronized double a(String str, double d) {
        b.AbstractC0504b abstractC0504b = this.f35717i.get(str);
        if (abstractC0504b != null && abstractC0504b.a() == 5) {
            d = ((b.d) abstractC0504b).f35727b;
        }
        return d;
    }

    public String a(b.i iVar, com.smartdigimkt.i8.a aVar) {
        String str = (String) iVar.f35731b;
        byte[] bArrC = (byte[]) this.r.a(str);
        if (bArrC == null) {
            try {
                bArrC = l.c(new File(this.f35713b + this.f35714c, str));
            } catch (Exception e2) {
                a(e2);
            }
        }
        if (bArrC != null) {
            if (aVar != null) {
                bArrC = aVar.b(bArrC);
            }
            if (bArrC != null) {
                return new String(bArrC, StandardCharsets.UTF_8);
            }
            return null;
        }
        return null;
    }

    public synchronized byte[] a(String str, byte[] bArr) {
        b.AbstractC0504b abstractC0504b = this.f35717i.get(str);
        if (abstractC0504b != null && abstractC0504b.a() == 7) {
            b.a aVar = (b.a) abstractC0504b;
            if (aVar.f35733e) {
                Object objA = this.s.a(str);
                if (objA instanceof byte[]) {
                    return (byte[]) objA;
                }
                byte[] bArrA = a(aVar, this.f);
                if (bArrA != null && bArrA.length != 0) {
                    this.s.a(str, bArrA);
                    return bArrA;
                }
                remove(str);
                return bArr;
            }
            return (byte[]) aVar.f35731b;
        }
        return bArr;
    }

    public byte[] a(b.a aVar, com.smartdigimkt.i8.a aVar2) {
        String str = (String) aVar.f35731b;
        byte[] bArrC = (byte[]) this.r.a(str);
        if (bArrC == null) {
            try {
                bArrC = l.c(new File(this.f35713b + this.f35714c, str));
            } catch (Exception e2) {
                a(e2);
                return null;
            }
        }
        if (bArrC != null) {
            return aVar2 != null ? aVar2.b(bArrC) : bArrC;
        }
        return null;
    }

    private Object a(b.h hVar, com.smartdigimkt.i8.a aVar) {
        String str = (String) hVar.f35731b;
        byte[] bArrC = (byte[]) this.r.a(str);
        if (bArrC == null) {
            try {
                bArrC = l.c(new File(this.f35713b + this.f35714c, str));
            } catch (Exception e2) {
                a(e2);
                return null;
            }
        }
        if (bArrC != null) {
            if (aVar != null) {
                bArrC = aVar.b(bArrC);
            }
            int i2 = bArrC[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            String strA = this.k.a(bArrC, 1, i2);
            com.smartdigimkt.i8.b bVar = this.d.get(strA);
            if (bVar == null) {
                b(new Exception("No encoder for tag:" + strA));
                return null;
            }
            hVar.f = bVar;
            int i3 = i2 + 1;
            return bVar.a(bArrC, i3, bArrC.length - i3);
        }
        b(new Exception("Read object data failed"));
        return null;
    }

    public void a(String str, String str2, b.i iVar) {
        int iB = f.b(str2);
        if (iVar == null) {
            int iB2 = f.b(str);
            a(iB2);
            int i2 = iB2 + 4;
            this.m = i2 + iB;
            f();
            this.k.a((byte) 6);
            a(str, iB2);
            b(str2, iB);
            HashMap<String, b.AbstractC0504b> map = this.f35717i;
            int i3 = this.f35718l;
            map.put(str, new b.i(i3, i2 + i3, str2, iB, false));
            k();
            return;
        }
        int i4 = iVar.f35725a;
        int i5 = i4 - iVar.f35732c;
        int i6 = iVar.d;
        String str3 = null;
        boolean z2 = false;
        if (i6 == iB) {
            this.f35716h = this.k.a(i4, i6) ^ this.f35716h;
            if (iB == str2.length()) {
                str2.getBytes(0, iB, this.k.f35745b, iVar.f35725a);
            } else {
                f fVar = this.k;
                fVar.f35746c = iVar.f35725a;
                fVar.c(str2);
            }
            this.f35718l = iVar.f35725a;
            this.m = iB;
        } else {
            this.m = i5 + iB;
            f();
            this.k.a((byte) 6);
            int i7 = i5 - 3;
            f fVar2 = this.k;
            byte[] bArr = fVar2.f35745b;
            System.arraycopy(bArr, iVar.f35732c + 1, bArr, fVar2.f35746c, i7);
            this.k.f35746c += i7;
            b(str2, iB);
            a((byte) 6, iVar.f35732c, iVar.f35725a + iVar.d);
            str3 = iVar.f35733e ? (String) iVar.f35731b : null;
            iVar.f35733e = false;
            int i8 = this.f35718l;
            iVar.f35732c = i8;
            iVar.f35725a = i8 + i5;
            iVar.d = iB;
            z2 = true;
        }
        iVar.f35731b = str2;
        k();
        if (z2) {
            b();
        }
        if (str3 != null) {
            q(str3);
        }
    }

    public synchronized <T> SharedPreferences.Editor a(String str, T t, com.smartdigimkt.i8.b<T> bVar) throws Throwable {
        Throwable th;
        byte[] bArrA;
        try {
            try {
                if (this.f35720p) {
                    return this;
                }
                a(str);
                if (bVar != null) {
                    String strA = bVar.a();
                    if (strA != null && !strA.isEmpty() && strA.length() <= 50) {
                        if (!this.d.containsKey(strA)) {
                            throw new IllegalArgumentException("Encoder hasn't been registered");
                        }
                        try {
                            if (t == null) {
                                remove(str);
                                return this;
                            }
                            b.AbstractC0504b abstractC0504b = null;
                            try {
                                bArrA = bVar.a(t);
                            } catch (Exception e2) {
                                a(e2);
                                bArrA = null;
                            }
                            if (bArrA == null) {
                                remove(str);
                                return this;
                            }
                            e();
                            b.AbstractC0504b abstractC0504b2 = this.f35717i.get(str);
                            if (abstractC0504b2 == null || abstractC0504b2.a() == 8) {
                                abstractC0504b = abstractC0504b2;
                            } else {
                                remove(str);
                            }
                            b.h hVar = (b.h) abstractC0504b;
                            int iB = f.b(strA);
                            f fVar = new f(iB + 1 + bArrA.length);
                            fVar.a((byte) iB);
                            fVar.c(strA);
                            fVar.a(bArrA);
                            byte[] bArrA2 = fVar.f35745b;
                            com.smartdigimkt.i8.a aVar = this.f;
                            if (aVar != null) {
                                bArrA2 = aVar.a(bArrA2);
                            }
                            byte[] bArr = bArrA2;
                            if (bArr == null) {
                                return this;
                            }
                            a(str, t, bArr, hVar, (byte) 8);
                            m(str);
                            return this;
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                    throw new IllegalArgumentException("Invalid encoder tag:" + strA);
                }
                throw new IllegalArgumentException("Encoder is null");
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener, String str) {
        onSharedPreferenceChangeListener.onSharedPreferenceChanged(this, str);
    }

    public synchronized void a(Map<String, Object> map, Map<Class, com.smartdigimkt.i8.b> map2) {
        try {
            if (this.f35720p) {
                return;
            }
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (key != null && !key.isEmpty()) {
                    if (value instanceof String) {
                        putString(key, (String) value);
                    } else if (value instanceof Boolean) {
                        putBoolean(key, ((Boolean) value).booleanValue());
                    } else if (value instanceof Integer) {
                        putInt(key, ((Integer) value).intValue());
                    } else if (value instanceof Long) {
                        putLong(key, ((Long) value).longValue());
                    } else if (value instanceof Float) {
                        putFloat(key, ((Float) value).floatValue());
                    } else if (value instanceof Double) {
                        b(key, ((Double) value).doubleValue());
                    } else if (value instanceof byte[]) {
                        b(key, (byte[]) value);
                    } else {
                        a(key, value, map2);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void a(Map<String, Object> map) {
        a(map, (Map<Class, com.smartdigimkt.i8.b>) null);
    }

    private void a(String str, Object obj, Map<Class, com.smartdigimkt.i8.b> map) throws Throwable {
        if (obj instanceof Set) {
            Set<String> set = (Set) obj;
            if (set.isEmpty() || (set.iterator().next() instanceof String)) {
                putStringSet(str, set);
                return;
            }
        }
        if (map != null) {
            com.smartdigimkt.i8.b bVar = map.get(obj.getClass());
            if (bVar != null) {
                a(str, obj, (com.smartdigimkt.i8.b<Object>) bVar);
                return;
            }
            b(new Exception("missing encoder for type:" + obj.getClass()));
            return;
        }
        b(new Exception("missing encoders"));
    }

    private boolean a(String str, byte b2) {
        return a(str, b2, O[b2]);
    }

    private boolean a(String str, byte b2, int i2) {
        com.smartdigimkt.i8.a aVar = this.f;
        if (aVar != null) {
            byte[] bArrA = aVar.a(str.getBytes(StandardCharsets.UTF_8));
            if (bArrA == null) {
                a(new Exception(f35703E));
                return false;
            }
            int length = bArrA.length;
            a(length, i2, b2);
            this.k.a((byte) length);
            f fVar = this.k;
            System.arraycopy(bArrA, 0, fVar.f35745b, fVar.f35746c, length);
            this.k.f35746c += length;
            return true;
        }
        int iB = f.b(str);
        a(iB, i2, b2);
        a(str, iB);
        return true;
    }

    private void a(int i2, int i3, byte b2) {
        a(i2);
        this.m = i2 + 2 + i3;
        f();
        this.k.a(b2);
    }

    private void a(String str, int i2) {
        this.k.a((byte) i2);
        if (i2 == str.length()) {
            f fVar = this.k;
            str.getBytes(0, i2, fVar.f35745b, fVar.f35746c);
            this.k.f35746c += i2;
            return;
        }
        this.k.c(str);
    }

    public void a(byte b2, int i2, int i3) {
        a(i2, i3);
        byte b3 = (byte) (b2 | (-128));
        byte[] bArr = this.k.f35745b;
        this.f35716h = ((((long) (bArr[i2] ^ b3)) & 255) << ((i2 & 7) << 3)) ^ this.f35716h;
        bArr[i2] = b3;
    }

    public void a(int i2, byte[] bArr) {
        int length = bArr.length;
        this.f35716h ^= this.k.a(i2, length);
        f fVar = this.k;
        fVar.f35746c = i2;
        fVar.a(bArr);
        this.f35716h = this.k.a(i2, length) ^ this.f35716h;
    }

    private int a(float f) {
        int iFloatToRawIntBits = Float.floatToRawIntBits(f);
        com.smartdigimkt.i8.a aVar = this.f;
        return aVar != null ? aVar.a(iFloatToRawIntBits) : iFloatToRawIntBits;
    }

    private long a(double d) {
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d);
        com.smartdigimkt.i8.a aVar = this.f;
        return aVar != null ? aVar.a(jDoubleToRawLongBits) : jDoubleToRawLongBits;
    }

    public void a(String str, Object obj, byte[] bArr, b.j jVar, byte b2) {
        if (jVar == null) {
            a(str, obj, bArr, b2);
        } else if (!jVar.f35733e && jVar.d == bArr.length) {
            a(jVar.f35725a, bArr);
            jVar.f35731b = obj;
        } else {
            a(str, obj, bArr, jVar);
        }
    }

    private void a(String str, Object obj, byte[] bArr, byte b2) {
        int length;
        b.AbstractC0504b hVar;
        int iA = a(str, bArr, b2);
        if (iA > 0) {
            boolean z2 = this.q != null;
            if (z2) {
                this.s.a(str, obj);
                obj = this.q;
                this.q = null;
                length = 32;
            } else {
                length = bArr.length;
            }
            Object obj2 = obj;
            int i2 = length;
            if (b2 == 6) {
                hVar = new b.i(this.f35718l, iA, (String) obj2, i2, z2);
            } else if (b2 == 7) {
                hVar = new b.a(this.f35718l, iA, obj2, i2, z2);
            } else {
                hVar = new b.h(this.f35718l, iA, obj2, i2, z2);
            }
            this.f35717i.put(str, hVar);
            k();
        }
    }

    private void a(String str, Object obj, byte[] bArr, b.j jVar) {
        int iA = a(str, bArr, jVar.a());
        if (iA > 0) {
            String str2 = jVar.f35733e ? (String) jVar.f35731b : null;
            a(jVar.a(), jVar.f35732c, jVar.f35725a + jVar.d);
            boolean z2 = this.q != null;
            jVar.f35732c = this.f35718l;
            jVar.f35725a = iA;
            jVar.f35733e = z2;
            if (z2) {
                this.s.a(str, obj);
                jVar.f35731b = this.q;
                jVar.d = 32;
                this.q = null;
            } else {
                jVar.f35731b = obj;
                jVar.d = bArr.length;
            }
            k();
            b();
            if (str2 != null) {
                q(str2);
            }
        }
    }

    private int a(final String str, final byte[] bArr, byte b2) {
        this.q = null;
        if (bArr.length < this.f35712a) {
            return b(str, bArr, b2);
        }
        StringBuilder sbY = android.support.v4.media.a.y("Large value, key: ", str, ", size: ");
        sbY.append(bArr.length);
        n(sbY.toString());
        final String strB = l.b();
        byte[] bArr2 = new byte[32];
        strB.getBytes(0, 32, bArr2, 0);
        int iB = b(str, bArr2, (byte) (b2 | 64));
        if (iB > 0) {
            this.r.a(strB, bArr);
            this.t.a(strB, new e.b() { // from class: com.smartdigimkt.h8.n
                @Override // com.smartdigimkt.h8.e.b
                public final void a(AtomicBoolean atomicBoolean) {
                    this.f35782a.a(strB, bArr, str, atomicBoolean);
                }
            });
            this.q = strB;
        }
        return iB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, byte[] bArr, String str2, AtomicBoolean atomicBoolean) {
        if (atomicBoolean.get()) {
            return;
        }
        if (l.a(new File(this.f35713b + this.f35714c, str), bArr, atomicBoolean)) {
            return;
        }
        n("Write large value with key:" + str2 + " failed");
    }
}
