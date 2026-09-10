package com.thinkup.core.common.o0m.o;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.a;
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

/* JADX INFO: loaded from: classes6.dex */
public abstract class o implements SharedPreferences, SharedPreferences.Editor {
    protected static final String m = "parse dara failed";
    static final String m0 = "gc finish";
    protected static final String mm = ".kvb";
    protected static final String mn = ".kvc";
    protected static final String mo = ".kva";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected static final String f42153n = "open file failed";
    protected static final String n0 = ".tmp";
    protected static final int nm = 1073741824;
    protected static final int no = 268435456;
    protected static final String o = "both files error";
    protected static final String o0 = "map failed";
    protected static final int o00 = 12;
    protected static final int o0m;
    protected static final int o0n;
    protected static final String om = "Encrypt failed";
    static final String on = "truncate finish";
    protected static final String oo = "miss cipher";
    protected static final int oo0 = 8192;
    protected static final int ooo = 80;
    protected int m00;
    protected int m0o;
    protected int mmm;
    protected String moo;
    protected final Map<String, com.thinkup.core.common.o0m.o.o.m> om0;
    protected final com.thinkup.core.common.o0m.o.o.o omm;
    protected int omn;
    protected long on0;
    protected om onn;
    protected final String oom;
    protected final String oon;
    private static final byte[] mno = new byte[0];
    protected static final int[] nn = {0, 1, 4, 4, 8, 8};
    protected final int o0o = m0.f42150n;
    protected final com.thinkup.core.common.o0m.o.o.n omo = m0.o;
    protected final HashMap<String, m.AbstractC0680m> ono = new HashMap<>();
    protected volatile boolean onm = false;
    protected final List<String> m0m = new ArrayList();
    protected boolean m0n = false;
    protected boolean mo0 = false;
    protected final no mom = new no();
    protected final no mon = new no();
    protected final oo mm0 = new oo();
    protected final Executor mmo = new mo();
    protected final ArrayList<C0681o> mmn = new ArrayList<>();
    protected final ArrayList<SharedPreferences.OnSharedPreferenceChangeListener> mn0 = new ArrayList<>();
    private final Handler mnm = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.thinkup.core.common.o0m.o.o$o, reason: collision with other inner class name */
    public static class C0681o implements Comparable<C0681o> {
        int m;
        int o;

        public C0681o(int i2, int i3) {
            this.o = i2;
            this.m = i3;
        }

        private int o(C0681o c0681o) {
            return this.o - c0681o.o;
        }

        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(C0681o c0681o) {
            return this.o - c0681o.o;
        }
    }

    static {
        int iM = n0.m();
        o0m = iM;
        o0n = Math.max(iM, 32768);
    }

    public o(String str, String str2, com.thinkup.core.common.o0m.o.o.m[] mVarArr, com.thinkup.core.common.o0m.o.o.o oVar) {
        this.oom = str;
        this.oon = str2;
        this.omm = oVar;
        HashMap map = new HashMap();
        if (mVarArr != null) {
            for (com.thinkup.core.common.o0m.o.o.m mVar : mVarArr) {
                String strO = mVar.o();
                if (map.containsKey(strO)) {
                    m("duplicate encoder tag:".concat(String.valueOf(strO)));
                } else {
                    map.put(strO, mVar);
                }
            }
        }
        map.put("StringSet", mn.o);
        this.om0 = map;
    }

    public static boolean m(int i2) {
        return (i2 & 1073741824) != 0;
    }

    private static void m0(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("key is empty");
        }
    }

    private void mm() {
        om omVar = this.onn;
        if (omVar == null || omVar.o.length != o0m) {
            this.onn = new om(o0m);
        } else {
            omVar.o(4, 0L);
        }
        this.onn.o(0, o(0));
    }

    private float mn(String str) {
        return getFloat(str, 0.0f);
    }

    private synchronized boolean mo(String str) {
        return getBoolean(str, false);
    }

    private long n0(String str) {
        return getLong(str, 0L);
    }

    private String nm(String str) {
        return getString(str, "");
    }

    private byte[] nn(String str) {
        return m(str, mno);
    }

    private double no(String str) {
        return o(str, 0.0d);
    }

    public static long o(long j, int i2) {
        int i3 = (i2 & 7) << 3;
        return (j >>> (64 - i3)) | (j << i3);
    }

    private synchronized Set<String> o00(String str) {
        return (Set) o0(str);
    }

    private static void om(int i2) {
        if (i2 > 255) {
            throw new IllegalArgumentException("key's length must less than 256");
        }
    }

    private static int oo(int i2) {
        return i2 & (-1073741825);
    }

    @Override // android.content.SharedPreferences
    public synchronized boolean contains(String str) {
        return this.ono.containsKey(str);
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return this;
    }

    @Override // android.content.SharedPreferences
    public synchronized Map<String, Object> getAll() {
        Object objValueOf;
        int size = this.ono.size();
        if (size == 0) {
            return new HashMap();
        }
        HashMap map = new HashMap(((size * 4) / 3) + 1);
        for (Map.Entry<String, m.AbstractC0680m> entry : this.ono.entrySet()) {
            String key = entry.getKey();
            m.AbstractC0680m value = entry.getValue();
            switch (value.o()) {
                case 1:
                    objValueOf = Boolean.valueOf(((m.n) value).m);
                    break;
                case 2:
                    objValueOf = Integer.valueOf(((m.om) value).m);
                    break;
                case 3:
                    objValueOf = Float.valueOf(((m.oo) value).m);
                    break;
                case 4:
                    objValueOf = Long.valueOf(((m.on) value).m);
                    break;
                case 5:
                    objValueOf = Double.valueOf(((m.o0) value).m);
                    break;
                case 6:
                    m.mo moVar = (m.mo) value;
                    objValueOf = moVar.om ? o(moVar, this.omm) : moVar.f42149n;
                    break;
                case 7:
                    m.o oVar = (m.o) value;
                    objValueOf = oVar.om ? o(oVar, this.omm) : oVar.f42149n;
                    break;
                case 8:
                    m.m0 m0Var = (m.m0) value;
                    objValueOf = m0Var.om ? o(m0Var, this.omm) : ((m.m0) value).f42149n;
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
        m.AbstractC0680m abstractC0680m = this.ono.get(str);
        if (abstractC0680m != null && abstractC0680m.o() == 1) {
            return ((m.n) abstractC0680m).m;
        }
        return z2;
    }

    @Override // android.content.SharedPreferences
    public synchronized float getFloat(String str, float f) {
        m.AbstractC0680m abstractC0680m = this.ono.get(str);
        if (abstractC0680m != null && abstractC0680m.o() == 3) {
            return ((m.oo) abstractC0680m).m;
        }
        return f;
    }

    @Override // android.content.SharedPreferences
    public synchronized int getInt(String str, int i2) {
        m.AbstractC0680m abstractC0680m = this.ono.get(str);
        if (abstractC0680m != null && abstractC0680m.o() == 2) {
            return ((m.om) abstractC0680m).m;
        }
        return i2;
    }

    @Override // android.content.SharedPreferences
    public synchronized long getLong(String str, long j) {
        m.AbstractC0680m abstractC0680m = this.ono.get(str);
        if (abstractC0680m != null && abstractC0680m.o() == 4) {
            return ((m.on) abstractC0680m).m;
        }
        return j;
    }

    @Override // android.content.SharedPreferences
    public synchronized String getString(String str, String str2) {
        m.AbstractC0680m abstractC0680m = this.ono.get(str);
        if (abstractC0680m != null && abstractC0680m.o() == 6) {
            m.mo moVar = (m.mo) abstractC0680m;
            if (!moVar.om) {
                return (String) moVar.f42149n;
            }
            Object objO = this.mon.o(str);
            if (objO instanceof String) {
                return (String) objO;
            }
            String strO = o(moVar, this.omm);
            if (strO != null && !strO.isEmpty()) {
                this.mon.o(str, strO);
                return strO;
            }
            remove(str);
            return str2;
        }
        return str2;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        Set<String> setO00 = o00(str);
        return setO00 != null ? setO00 : set;
    }

    public abstract void m0();

    public abstract void mo();

    public final void n(int i2) {
        ArrayList<C0681o> arrayList = this.mmn;
        Collections.sort(arrayList);
        C0681o c0681o = arrayList.get(0);
        int size = arrayList.size();
        boolean z2 = true;
        int i3 = 0;
        for (int i4 = 1; i4 < size; i4++) {
            C0681o c0681o2 = arrayList.get(i4);
            if (c0681o2.o == c0681o.m) {
                c0681o.m = c0681o2.m;
            } else {
                i3++;
                if (i3 != i4) {
                    arrayList.set(i3, c0681o2);
                }
                c0681o = c0681o2;
            }
        }
        int i5 = i3 + 1;
        if (size > i5) {
            arrayList.subList(i5, size).clear();
        }
        C0681o c0681o3 = this.mmn.get(0);
        int i6 = c0681o3.o;
        int i7 = this.omn;
        int i8 = i7 - this.mmm;
        int i9 = i8 - 12;
        int i10 = i8 - i6;
        int i11 = i7 - i6;
        boolean z3 = i9 < i11 + i10;
        if (!z3) {
            this.on0 ^= this.onn.m(i6, i11);
        }
        int size2 = this.mmn.size();
        int i12 = size2 - 1;
        int i13 = this.omn - this.mmn.get(i12).m;
        int i14 = i13 > 0 ? size2 : i12;
        int[] iArr = new int[i14];
        int[] iArr2 = new int[i14];
        int i15 = c0681o3.o;
        int i16 = c0681o3.m;
        int i17 = 1;
        while (i17 < size2) {
            boolean z4 = z2;
            C0681o c0681o4 = this.mmn.get(i17);
            int i18 = i17;
            int i19 = c0681o4.o - i16;
            int i20 = size2;
            byte[] bArr = this.onn.o;
            System.arraycopy(bArr, i16, bArr, i15, i19);
            int i21 = i18 - 1;
            iArr[i21] = i16;
            iArr2[i21] = i16 - i15;
            i15 += i19;
            i16 = c0681o4.m;
            i17 = i18 + 1;
            z2 = z4;
            size2 = i20;
        }
        if (i13 > 0) {
            byte[] bArr2 = this.onn.o;
            System.arraycopy(bArr2, i16, bArr2, i15, i13);
            iArr[i12] = i16;
            iArr2[i12] = i16 - i15;
        }
        oo();
        if (z3) {
            this.on0 = this.onn.m(12, i9);
        } else {
            this.on0 ^= this.onn.m(i6, i10);
        }
        this.omn = i8;
        o(i6, i2, i10);
        for (m.AbstractC0680m abstractC0680m : this.ono.values()) {
            int i22 = abstractC0680m.o;
            if (i22 > i6) {
                int i23 = i14 - 1;
                int i24 = 0;
                while (i24 <= i23) {
                    int i25 = (i24 + i23) >>> 1;
                    int i26 = iArr[i25];
                    if (i26 >= i22) {
                        if (i26 <= i22) {
                            i23 = i25;
                            break;
                        }
                        i23 = i25 - 1;
                    } else {
                        i24 = i25 + 1;
                    }
                }
                int i27 = iArr2[i23];
                abstractC0680m.o -= i27;
                if (abstractC0680m.o() >= 6) {
                    ((m.mm) abstractC0680m).o0 -= i27;
                }
            }
        }
        n(m0);
    }

    public abstract void o(byte b2, int i2);

    public abstract void o(int i2, int i3, int i4);

    public abstract void o(int i2, long j, int i3);

    public abstract void o(long j, long j2, int i2);

    public abstract void o(on onVar);

    public void o0() {
        this.omn = 12;
        this.on0 = 0L;
        this.ono.clear();
        this.mon.o();
        this.mom.o();
        oo();
    }

    public abstract void o0(int i2);

    public abstract void om(String str);

    public void on() {
    }

    public abstract void on(String str);

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor putBoolean(String str, boolean z2) {
        try {
            if (this.mo0) {
                return this;
            }
            m0(str);
            on();
            m.AbstractC0680m abstractC0680m = this.ono.get(str);
            if (abstractC0680m != null && abstractC0680m.o() != 1) {
                remove(str);
                abstractC0680m = null;
            }
            m.n nVar = (m.n) abstractC0680m;
            if (nVar == null) {
                if (!o(str, (byte) 1)) {
                    return this;
                }
                om omVar = this.onn;
                int i2 = omVar.m;
                omVar.o(z2 ? (byte) 1 : (byte) 0);
                mo();
                this.ono.put(str, new m.n(i2, z2));
                om(str);
            } else if (nVar.m != z2) {
                nVar.m = z2;
                o(z2 ? (byte) 1 : (byte) 0, nVar.o);
                om(str);
            }
            return this;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor putFloat(String str, float f) {
        try {
            if (this.mo0) {
                return this;
            }
            m0(str);
            on();
            m.AbstractC0680m abstractC0680m = this.ono.get(str);
            if (abstractC0680m != null && abstractC0680m.o() != 3) {
                remove(str);
                abstractC0680m = null;
            }
            m.oo ooVar = (m.oo) abstractC0680m;
            if (ooVar == null) {
                if (!o(str, (byte) 3)) {
                    return this;
                }
                om omVar = this.onn;
                int i2 = omVar.m;
                omVar.m(o(f));
                mo();
                this.ono.put(str, new m.oo(i2, f));
                om(str);
            } else if (ooVar.m != f) {
                int iO = o(f);
                long jO = ((long) (this.onn.o(ooVar.o) ^ iO)) & 4294967295L;
                ooVar.m = f;
                o(iO, jO, ooVar.o);
                om(str);
            }
            return this;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor putInt(String str, int i2) {
        try {
            if (this.mo0) {
                return this;
            }
            m0(str);
            on();
            m.AbstractC0680m abstractC0680m = this.ono.get(str);
            if (abstractC0680m != null && abstractC0680m.o() != 2) {
                remove(str);
                abstractC0680m = null;
            }
            m.om omVar = (m.om) abstractC0680m;
            if (omVar == null) {
                if (!o(str, (byte) 2)) {
                    return this;
                }
                om omVar2 = this.onn;
                int i3 = omVar2.m;
                com.thinkup.core.common.o0m.o.o.o oVar = this.omm;
                omVar2.m(oVar != null ? oVar.n() : i2);
                mo();
                this.ono.put(str, new m.om(i3, i2));
                om(str);
            } else if (omVar.m != i2) {
                com.thinkup.core.common.o0m.o.o.o oVar2 = this.omm;
                int iN = oVar2 != null ? oVar2.n() : i2;
                int iO = this.omm != null ? this.onn.o(omVar.o) : omVar.m;
                omVar.m = i2;
                o(iN, ((long) (iO ^ iN)) & 4294967295L, omVar.o);
                om(str);
            }
            return this;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor putLong(String str, long j) throws Throwable {
        Throwable th;
        o oVar;
        try {
            try {
                if (this.mo0) {
                    return this;
                }
                m0(str);
                on();
                m.AbstractC0680m abstractC0680m = this.ono.get(str);
                if (abstractC0680m != null) {
                    try {
                        if (abstractC0680m.o() != 4) {
                            remove(str);
                            abstractC0680m = null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                m.on onVar = (m.on) abstractC0680m;
                if (onVar != null) {
                    if (onVar.m != j) {
                        com.thinkup.core.common.o0m.o.o.o oVar2 = this.omm;
                        long jOo = oVar2 != null ? oVar2.oo() : j;
                        long jN = (this.omm != null ? this.onn.n(onVar.o) : onVar.m) ^ jOo;
                        onVar.m = j;
                        oVar = this;
                        oVar.o(jOo, jN, onVar.o);
                        om(str);
                    }
                    return oVar;
                }
                if (!o(str, (byte) 4)) {
                    return this;
                }
                om omVar = this.onn;
                int i2 = omVar.m;
                com.thinkup.core.common.o0m.o.o.o oVar3 = this.omm;
                omVar.o(oVar3 != null ? oVar3.oo() : j);
                mo();
                this.ono.put(str, new m.on(i2, j));
                om(str);
                oVar = this;
                return oVar;
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
    public synchronized SharedPreferences.Editor putString(String str, String str2) {
        try {
            if (this.mo0) {
                return this;
            }
            m0(str);
            if (str2 == null) {
                remove(str);
            } else {
                m.AbstractC0680m abstractC0680m = this.ono.get(str);
                String str3 = null;
                if (abstractC0680m != null && abstractC0680m.o() != 6) {
                    remove(str);
                    abstractC0680m = null;
                }
                m.mo moVar = (m.mo) abstractC0680m;
                if (moVar != null && !moVar.om && str2.equals(moVar.f42149n)) {
                    return this;
                }
                on();
                if (this.omm != null || str2.length() * 3 >= this.o0o) {
                    byte[] bytes = str2.isEmpty() ? mno : str2.getBytes(StandardCharsets.UTF_8);
                    com.thinkup.core.common.o0m.o.o.o oVar = this.omm;
                    if (oVar != null) {
                        bytes = oVar.o();
                    }
                    byte[] bArr = bytes;
                    if (bArr == null) {
                        o(new Exception(om));
                        return this;
                    }
                    o(str, str2, bArr, moVar, (byte) 6);
                } else {
                    int iM = om.m(str2);
                    if (moVar == null) {
                        int iM2 = om.m(str);
                        om(iM2);
                        int i2 = iM2 + 4;
                        this.m0o = i2 + iM;
                        mn();
                        this.onn.o((byte) 6);
                        o(str, iM2);
                        m(str2, iM);
                        HashMap<String, m.AbstractC0680m> map = this.ono;
                        int i3 = this.m00;
                        map.put(str, new m.mo(i3, i2 + i3, str2, iM, false));
                        mo();
                    } else {
                        int i4 = moVar.o;
                        int i5 = i4 - moVar.o0;
                        int i6 = moVar.oo;
                        boolean z2 = false;
                        if (i6 == iM) {
                            this.on0 = this.onn.m(i4, i6) ^ this.on0;
                            if (iM == str2.length()) {
                                str2.getBytes(0, iM, this.onn.o, moVar.o);
                            } else {
                                om omVar = this.onn;
                                omVar.m = moVar.o;
                                omVar.o(str2);
                            }
                            this.m00 = moVar.o;
                            this.m0o = iM;
                        } else {
                            this.m0o = i5 + iM;
                            mn();
                            this.onn.o((byte) 6);
                            int i7 = i5 - 3;
                            om omVar2 = this.onn;
                            byte[] bArr2 = omVar2.o;
                            System.arraycopy(bArr2, moVar.o0 + 1, bArr2, omVar2.m, i7);
                            this.onn.m += i7;
                            m(str2, iM);
                            o((byte) 6, moVar.o0, moVar.o + moVar.oo);
                            str3 = moVar.om ? (String) moVar.f42149n : null;
                            moVar.om = false;
                            int i8 = this.m00;
                            moVar.o0 = i8;
                            moVar.o = i8 + i5;
                            moVar.oo = iM;
                            z2 = true;
                        }
                        moVar.f42149n = str2;
                        mo();
                        if (z2) {
                            m0();
                        }
                        if (str3 != null) {
                            on(str3);
                        }
                    }
                }
                om(str);
            }
            return this;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor putStringSet(String str, Set<String> set) {
        try {
            if (this.mo0) {
                return this;
            }
            if (set == null) {
                remove(str);
            } else {
                o(str, set, mn.o);
            }
            return this;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.SharedPreferences
    public synchronized void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        if (onSharedPreferenceChangeListener == null) {
            return;
        }
        if (!this.mn0.contains(onSharedPreferenceChangeListener)) {
            this.mn0.add(onSharedPreferenceChangeListener);
        }
    }

    @Override // android.content.SharedPreferences
    public synchronized void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.mn0.remove(onSharedPreferenceChangeListener);
    }

    private void mn() {
        o0(this.m0o);
        int i2 = this.omn;
        this.m00 = i2;
        this.omn = this.m0o + i2;
        this.onn.m = i2;
    }

    public final void m() {
        try {
            n0.n(new File(this.oom, this.oon + mn));
            n0.n(new File(this.oom, this.oon + n0));
        } catch (Exception e2) {
            o(e2);
        }
    }

    public final int o(int i2) {
        return this.omm == null ? i2 : i2 | 1073741824;
    }

    public final int om() {
        return this.omn <= 16384 ? 8192 : 16384;
    }

    public final void oo() {
        this.mmm = 0;
        this.mmn.clear();
    }

    public static int o(int i2, int i3) {
        if (i3 < no) {
            int i4 = o0m;
            if (i3 <= i4) {
                return i4;
            }
            while (i2 < i3) {
                i2 <<= 1;
            }
            return i2;
        }
        throw new IllegalStateException("data size out of limit");
    }

    public final synchronized void oo(final String str) {
        if (this.mn0.isEmpty()) {
            return;
        }
        for (final SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : this.mn0) {
            this.mnm.post(new Runnable() { // from class: com.thinkup.core.common.o0m.o.o.2
                @Override // java.lang.Runnable
                public final void run() {
                    onSharedPreferenceChangeListener.onSharedPreferenceChanged(o.this, str);
                }
            });
        }
    }

    private void m(int i2, int i3) {
        this.mmm = (i3 - i2) + this.mmm;
        this.mmn.add(new C0681o(i2, i3));
    }

    private int mm(String str) {
        return getInt(str, 0);
    }

    public final void o() throws Throwable {
        com.thinkup.core.common.o0m.o.o.m mVar;
        com.thinkup.core.common.o0m.o.o.m[] mVarArr = (com.thinkup.core.common.o0m.o.o.m[]) this.om0.values().toArray(new com.thinkup.core.common.o0m.o.o.m[this.om0.size()]);
        String str = "temp_" + this.oon;
        on onVar = new on(this.oom, str, mVarArr, this.omm, 2);
        onVar.n00 = false;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, m.AbstractC0680m> entry : this.ono.entrySet()) {
            String key = entry.getKey();
            m.AbstractC0680m value = entry.getValue();
            if (value instanceof m.mo) {
                m.mo moVar = (m.mo) value;
                if (moVar.om) {
                    arrayList.add((String) moVar.f42149n);
                    String strO = o(moVar, (com.thinkup.core.common.o0m.o.o.o) null);
                    if (strO != null) {
                        onVar.putString(key, strO);
                    }
                } else {
                    onVar.putString(key, (String) moVar.f42149n);
                }
            } else if (value instanceof m.n) {
                onVar.putBoolean(key, ((m.n) value).m);
            } else if (value instanceof m.om) {
                onVar.putInt(key, ((m.om) value).m);
            } else if (value instanceof m.on) {
                onVar.putLong(key, ((m.on) value).m);
            } else if (value instanceof m.oo) {
                onVar.putFloat(key, ((m.oo) value).m);
            } else if (value instanceof m.o0) {
                onVar.m(key, ((m.o0) value).m);
            } else if (value instanceof m.o) {
                m.o oVar = (m.o) value;
                if (oVar.om) {
                    arrayList.add((String) oVar.f42149n);
                    byte[] bArrO = o(oVar, (com.thinkup.core.common.o0m.o.o.o) null);
                    if (bArrO != null) {
                        onVar.o(key, bArrO);
                    }
                } else {
                    onVar.o(key, (byte[]) oVar.f42149n);
                }
            } else if (value instanceof m.m0) {
                m.m0 m0Var = (m.m0) value;
                if (m0Var.om) {
                    arrayList.add((String) m0Var.f42149n);
                    Object objO = o(m0Var, (com.thinkup.core.common.o0m.o.o.o) null);
                    if (objO != null && (mVar = m0Var.m) != null) {
                        onVar.o(key, objO, (com.thinkup.core.common.o0m.o.o.m<Object>) mVar);
                    }
                } else {
                    com.thinkup.core.common.o0m.o.o.m mVar2 = m0Var.m;
                    if (mVar2 != null) {
                        onVar.o(key, m0Var.f42149n, (com.thinkup.core.common.o0m.o.o.m<Object>) mVar2);
                    }
                }
            }
        }
        onVar.contains("");
        this.onn = onVar.onn;
        this.on0 = onVar.on0;
        this.omn = onVar.omn;
        oo();
        this.ono.clear();
        this.ono.putAll(onVar.ono);
        o(onVar);
        while (onVar.mm0.o()) {
            try {
                Thread.sleep(10L);
            } catch (Exception unused) {
            }
        }
        File file = new File(this.oom, str);
        String str2 = this.oom + this.oon;
        n0.o(file, str2);
        n0.n(file);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            n0.n(new File(str2, (String) it.next()));
        }
        this.m0n = false;
    }

    public final void m(String str) {
        com.thinkup.core.common.o0m.o.o.n nVar = this.omo;
        if (nVar != null) {
            nVar.m(this.oon, new Exception(str));
        }
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
    public final synchronized <T> T o0(String str) {
        m.AbstractC0680m abstractC0680m = this.ono.get(str);
        if (abstractC0680m != null && abstractC0680m.o() == 8) {
            m.m0 m0Var = (m.m0) abstractC0680m;
            if (m0Var.om) {
                T t = (T) this.mon.o(str);
                if (t != null) {
                    return t;
                }
                T t2 = (T) o(m0Var, this.omm);
                if (t2 == null) {
                    remove(str);
                    return null;
                }
                this.mon.o(str, t2);
                return t2;
            }
            return (T) m0Var.f42149n;
        }
        return null;
    }

    public final void m(Exception exc) {
        com.thinkup.core.common.o0m.o.o.n nVar = this.omo;
        if (nVar != null) {
            nVar.o(this.oon, exc);
        }
    }

    private synchronized byte[] m(String str, byte[] bArr) {
        m.AbstractC0680m abstractC0680m = this.ono.get(str);
        if (abstractC0680m != null && abstractC0680m.o() == 7) {
            m.o oVar = (m.o) abstractC0680m;
            if (oVar.om) {
                Object objO = this.mon.o(str);
                if (objO instanceof byte[]) {
                    return (byte[]) objO;
                }
                byte[] bArrO = o(oVar, this.omm);
                if (bArrO != null && bArrO.length != 0) {
                    this.mon.o(str, bArrO);
                    return bArrO;
                }
                remove(str);
                return bArr;
            }
            return (byte[]) oVar.f42149n;
        }
        return bArr;
    }

    public final synchronized SharedPreferences.Editor m(String str, double d) throws Throwable {
        Throwable th;
        o oVar;
        try {
            try {
                if (this.mo0) {
                    return this;
                }
                m0(str);
                on();
                m.AbstractC0680m abstractC0680m = this.ono.get(str);
                if (abstractC0680m != null) {
                    try {
                        if (abstractC0680m.o() != 5) {
                            remove(str);
                            abstractC0680m = null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                m.o0 o0Var = (m.o0) abstractC0680m;
                if (o0Var != null) {
                    if (o0Var.m != d) {
                        long jO = o(d);
                        long jN = jO ^ this.onn.n(o0Var.o);
                        o0Var.m = d;
                        oVar = this;
                        oVar.o(jO, jN, o0Var.o);
                        om(str);
                    }
                    return oVar;
                }
                if (!o(str, (byte) 5)) {
                    return this;
                }
                om omVar = this.onn;
                int i2 = omVar.m;
                omVar.o(o(d));
                mo();
                this.ono.put(str, new m.o0(i2, d));
                om(str);
                oVar = this;
                return oVar;
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

    public final void n() {
        o0();
        mm();
    }

    public final void n(String str) {
        com.thinkup.core.common.o0m.o.o.n nVar = this.omo;
        if (nVar != null) {
            nVar.o(this.oon, str);
        }
    }

    private void m(String str, int i2) {
        this.onn.o((short) i2);
        if (i2 == str.length()) {
            om omVar = this.onn;
            str.getBytes(0, i2, omVar.o, omVar.m);
        } else {
            this.onn.o(str);
        }
    }

    private int m(String str, byte[] bArr, byte b2) {
        if (!o(str, b2, bArr.length + 2)) {
            return 0;
        }
        this.onn.o((short) bArr.length);
        om omVar = this.onn;
        int i2 = omVar.m;
        omVar.o(bArr);
        return i2;
    }

    public final boolean o(File file) {
        long length = file.length();
        if (length != 0 && length < 268435456) {
            int i2 = (int) length;
            int iO = o(o0m, i2);
            om omVar = this.onn;
            if (omVar != null && omVar.o.length == iO) {
                omVar.m = 0;
            } else {
                omVar = new om(new byte[iO]);
                this.onn = omVar;
            }
            n0.o(file, omVar.o, i2);
            int iN = omVar.n();
            if (iN < 0) {
                return false;
            }
            int i3 = (-1073741825) & iN;
            boolean zM = m(iN);
            long jO0 = omVar.o0();
            this.omn = i3 + 12;
            if (i3 >= 0 && i3 <= i2 - 12 && jO0 == omVar.m(12, i3) && o(zM)) {
                this.on0 = jO0;
                return true;
            }
        }
        return false;
    }

    public final void o(final String str) {
        m0.o().execute(new Runnable() { // from class: com.thinkup.core.common.o0m.o.o.1
            @Override // java.lang.Runnable
            public final void run() {
                if (o.this.mm0.o(str)) {
                    return;
                }
                n0.n(new File(o.this.oom + o.this.oon, str));
            }
        });
    }

    public final boolean o(boolean z2) {
        int length;
        om omVar;
        Object objM;
        boolean z3 = false;
        if (z2 && this.omm == null) {
            m(oo);
            return false;
        }
        com.thinkup.core.common.o0m.o.o.o oVar = z2 ? this.omm : null;
        om omVar2 = this.onn;
        omVar2.m = 12;
        while (true) {
            try {
                int i2 = omVar2.m;
                int i3 = this.omn;
                boolean z4 = true;
                if (i2 >= i3) {
                    if (i2 != i3) {
                        o(new Exception(m));
                        return false;
                    }
                    if (!z2 && this.omm != null && i3 != 12) {
                        z3 = true;
                    }
                    this.m0n = z3;
                    return true;
                }
                byte bO = omVar2.o();
                byte b2 = (byte) (bO & 63);
                if (b2 > 0 && b2 <= 8) {
                    int iO = omVar2.o() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                    if (iO == 0) {
                        throw new IllegalStateException("invalid key size");
                    }
                    if (bO < 0) {
                        omVar2.m += iO;
                        int iM = omVar2.m + (b2 <= 5 ? nn[b2] : omVar2.m() & 65535);
                        omVar2.m = iM;
                        m(i2, iM);
                    } else {
                        String strO = omVar2.o(oVar, iO);
                        int i4 = omVar2.m;
                        if (b2 > 5) {
                            int iM2 = omVar2.m() & 65535;
                            boolean z5 = (bO & 64) != 0;
                            if (z5 && iM2 != 32) {
                                throw new IllegalStateException("name size not match");
                            }
                            if (b2 == 6) {
                                this.ono.put(strO, new m.mo(i2, i4 + 2, z5 ? omVar2.o0(iM2) : omVar2.o(oVar, iM2), iM2, z5));
                            } else if (b2 == 7) {
                                if (z5) {
                                    objM = omVar2.o0(iM2);
                                } else {
                                    objM = new byte[iM2];
                                    System.arraycopy(omVar2.o, omVar2.m, objM, 0, iM2);
                                    omVar2.m += iM2;
                                    if (oVar != null) {
                                        objM = oVar.m();
                                    }
                                }
                                this.ono.put(strO, new m.o(i2, i4 + 2, objM, iM2, z5));
                            } else if (z5) {
                                this.ono.put(strO, new m.m0(i2, i4 + 2, omVar2.o0(iM2), iM2, true));
                            } else {
                                if (oVar == null) {
                                    omVar = this.onn;
                                    length = iM2;
                                } else {
                                    om omVar3 = this.onn;
                                    System.arraycopy(omVar3.o, omVar3.m, new byte[iM2], 0, iM2);
                                    byte[] bArrM = oVar.m();
                                    om omVar4 = new om(bArrM);
                                    length = bArrM.length;
                                    omVar = omVar4;
                                }
                                int iO2 = omVar.o() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                String strO0 = omVar.o0(iO2);
                                com.thinkup.core.common.o0m.o.o.m mVar = this.om0.get(strO0);
                                int i5 = length - (iO2 + 1);
                                if (i5 >= 0) {
                                    if (mVar != null) {
                                        try {
                                            m.m0 m0Var = new m.m0(i2, i4 + 2, mVar.o(omVar.o, omVar.m, i5), iM2, false);
                                            m0Var.m = mVar;
                                            this.ono.put(strO, m0Var);
                                        } catch (Exception e2) {
                                            o(e2);
                                        }
                                    } else {
                                        m("object with tag: " + strO0 + " without encoder");
                                    }
                                    omVar2.m = i4 + 2 + iM2;
                                } else {
                                    throw new Exception(m);
                                }
                            }
                        } else if (b2 == 1) {
                            HashMap<String, m.AbstractC0680m> map = this.ono;
                            if (omVar2.o() != 1) {
                                z4 = false;
                            }
                            map.put(strO, new m.n(i4, z4));
                        } else if (b2 == 2) {
                            this.ono.put(strO, new m.om(i4, omVar2.o(oVar)));
                        } else if (b2 == 3) {
                            this.ono.put(strO, new m.oo(i4, Float.intBitsToFloat(omVar2.o(oVar))));
                        } else if (b2 != 4) {
                            this.ono.put(strO, new m.o0(i4, Double.longBitsToDouble(omVar2.m(oVar))));
                        } else {
                            this.ono.put(strO, new m.on(i4, omVar2.m(oVar)));
                        }
                    }
                } else {
                    throw new Exception(m);
                }
            } catch (Exception e3) {
                o(e3);
                return false;
            }
        }
    }

    private void o(int i2, String str, int i3, int i4, com.thinkup.core.common.o0m.o.o.o oVar) throws Exception {
        int length;
        om omVar;
        if (oVar == null) {
            omVar = this.onn;
            length = i2;
        } else {
            om omVar2 = this.onn;
            System.arraycopy(omVar2.o, omVar2.m, new byte[i2], 0, i2);
            byte[] bArrM = oVar.m();
            om omVar3 = new om(bArrM);
            length = bArrM.length;
            omVar = omVar3;
        }
        int iO = omVar.o() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        String strO0 = omVar.o0(iO);
        com.thinkup.core.common.o0m.o.o.m mVar = this.om0.get(strO0);
        int i5 = length - (iO + 1);
        if (i5 < 0) {
            throw new Exception(m);
        }
        if (mVar != null) {
            try {
                m.m0 m0Var = new m.m0(i3, i4 + 2, mVar.o(omVar.o, omVar.m, i5), i2, false);
                m0Var.m = mVar;
                this.ono.put(str, m0Var);
                return;
            } catch (Exception e2) {
                o(e2);
                return;
            }
        }
        m("object with tag: " + strO0 + " without encoder");
    }

    private static void o(ArrayList<C0681o> arrayList) {
        Collections.sort(arrayList);
        int i2 = 0;
        C0681o c0681o = arrayList.get(0);
        int size = arrayList.size();
        for (int i3 = 1; i3 < size; i3++) {
            C0681o c0681o2 = arrayList.get(i3);
            if (c0681o2.o == c0681o.m) {
                c0681o.m = c0681o2.m;
            } else {
                i2++;
                if (i2 != i3) {
                    arrayList.set(i2, c0681o2);
                }
                c0681o = c0681o2;
            }
        }
        int i4 = i2 + 1;
        if (size > i4) {
            arrayList.subList(i4, size).clear();
        }
    }

    private void o(int i2, int[] iArr, int[] iArr2) {
        for (m.AbstractC0680m abstractC0680m : this.ono.values()) {
            int i3 = abstractC0680m.o;
            if (i3 > i2) {
                int length = iArr.length - 1;
                int i4 = 0;
                while (i4 <= length) {
                    int i5 = (i4 + length) >>> 1;
                    int i6 = iArr[i5];
                    if (i6 >= i3) {
                        if (i6 <= i3) {
                            length = i5;
                            break;
                        }
                        length = i5 - 1;
                    } else {
                        i4 = i5 + 1;
                    }
                }
                int i7 = iArr2[length];
                abstractC0680m.o -= i7;
                if (abstractC0680m.o() >= 6) {
                    ((m.mm) abstractC0680m).o0 -= i7;
                }
            }
        }
    }

    public final void o(File file, File file2) {
        try {
            if (o(file)) {
                return;
            }
        } catch (IOException e2) {
            m(e2);
        }
        n();
        try {
            if (o(file2)) {
                return;
            }
        } catch (IOException e3) {
            m(e3);
        }
        n();
    }

    public final void o(Exception exc) {
        com.thinkup.core.common.o0m.o.o.n nVar = this.omo;
        if (nVar != null) {
            nVar.m(this.oon, exc);
        }
    }

    public final synchronized double o(String str, double d) {
        m.AbstractC0680m abstractC0680m = this.ono.get(str);
        if (abstractC0680m != null && abstractC0680m.o() == 5) {
            return ((m.o0) abstractC0680m).m;
        }
        return d;
    }

    private String o(m.mo moVar, com.thinkup.core.common.o0m.o.o.o oVar) {
        String str = (String) moVar.f42149n;
        byte[] bArrM = (byte[]) this.mom.o(str);
        if (bArrM == null) {
            try {
                bArrM = n0.m(new File(this.oom + this.oon, str));
            } catch (Exception e2) {
                o(e2);
            }
        }
        if (bArrM != null) {
            if (oVar != null) {
                bArrM = oVar.m();
            }
            if (bArrM != null) {
                return new String(bArrM, StandardCharsets.UTF_8);
            }
            return null;
        }
        return null;
    }

    private byte[] o(m.o oVar, com.thinkup.core.common.o0m.o.o.o oVar2) {
        String str = (String) oVar.f42149n;
        byte[] bArrM = (byte[]) this.mom.o(str);
        if (bArrM == null) {
            try {
                bArrM = n0.m(new File(this.oom + this.oon, str));
            } catch (Exception e2) {
                o(e2);
                return null;
            }
        }
        if (bArrM != null) {
            return oVar2 != null ? oVar2.m() : bArrM;
        }
        return null;
    }

    private Object o(m.m0 m0Var, com.thinkup.core.common.o0m.o.o.o oVar) {
        String str = (String) m0Var.f42149n;
        byte[] bArrM = (byte[]) this.mom.o(str);
        if (bArrM == null) {
            try {
                bArrM = n0.m(new File(this.oom + this.oon, str));
            } catch (Exception e2) {
                o(e2);
                return null;
            }
        }
        if (bArrM != null) {
            if (oVar != null) {
                bArrM = oVar.m();
            }
            int i2 = bArrM[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            String strO = this.onn.o(bArrM, 1, i2);
            com.thinkup.core.common.o0m.o.o.m mVar = this.om0.get(strO);
            if (mVar != null) {
                m0Var.m = mVar;
                int i3 = i2 + 1;
                return mVar.o(bArrM, i3, bArrM.length - i3);
            }
            m(new Exception("No encoder for tag:".concat(String.valueOf(strO))));
            return null;
        }
        m(new Exception("Read object data failed"));
        return null;
    }

    private void o(String str, String str2, m.mo moVar) {
        int iM = om.m(str2);
        if (moVar == null) {
            int iM2 = om.m(str);
            om(iM2);
            int i2 = iM2 + 4;
            this.m0o = i2 + iM;
            mn();
            this.onn.o((byte) 6);
            o(str, iM2);
            m(str2, iM);
            HashMap<String, m.AbstractC0680m> map = this.ono;
            int i3 = this.m00;
            map.put(str, new m.mo(i3, i2 + i3, str2, iM, false));
            mo();
            return;
        }
        int i4 = moVar.o;
        int i5 = i4 - moVar.o0;
        int i6 = moVar.oo;
        String str3 = null;
        boolean z2 = false;
        if (i6 == iM) {
            this.on0 = this.onn.m(i4, i6) ^ this.on0;
            if (iM == str2.length()) {
                str2.getBytes(0, iM, this.onn.o, moVar.o);
            } else {
                om omVar = this.onn;
                omVar.m = moVar.o;
                omVar.o(str2);
            }
            this.m00 = moVar.o;
            this.m0o = iM;
        } else {
            this.m0o = i5 + iM;
            mn();
            this.onn.o((byte) 6);
            int i7 = i5 - 3;
            om omVar2 = this.onn;
            byte[] bArr = omVar2.o;
            System.arraycopy(bArr, moVar.o0 + 1, bArr, omVar2.m, i7);
            this.onn.m += i7;
            m(str2, iM);
            o((byte) 6, moVar.o0, moVar.o + moVar.oo);
            str3 = moVar.om ? (String) moVar.f42149n : null;
            moVar.om = false;
            int i8 = this.m00;
            moVar.o0 = i8;
            moVar.o = i8 + i5;
            moVar.oo = iM;
            z2 = true;
        }
        moVar.f42149n = str2;
        mo();
        if (z2) {
            m0();
        }
        if (str3 != null) {
            on(str3);
        }
    }

    public final synchronized SharedPreferences.Editor o(String str, byte[] bArr) throws Throwable {
        Throwable th;
        o oVar;
        try {
            try {
                if (this.mo0) {
                    return this;
                }
                m0(str);
                try {
                    if (bArr == null) {
                        remove(str);
                        oVar = this;
                    } else {
                        on();
                        m.AbstractC0680m abstractC0680m = this.ono.get(str);
                        if (abstractC0680m != null && abstractC0680m.o() != 7) {
                            remove(str);
                            abstractC0680m = null;
                        }
                        m.o oVar2 = (m.o) abstractC0680m;
                        com.thinkup.core.common.o0m.o.o.o oVar3 = this.omm;
                        byte[] bArrO = oVar3 != null ? oVar3.o() : bArr;
                        if (bArrO == null) {
                            o(new Exception(om));
                            return this;
                        }
                        oVar = this;
                        oVar.o(str, bArr, bArrO, oVar2, (byte) 7);
                        om(str);
                    }
                    return oVar;
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

    public final synchronized <T> SharedPreferences.Editor o(String str, T t, com.thinkup.core.common.o0m.o.o.m<T> mVar) throws Throwable {
        Throwable th;
        byte[] bArrO;
        try {
            try {
                if (this.mo0) {
                    return this;
                }
                m0(str);
                if (mVar != null) {
                    String strO = mVar.o();
                    if (!strO.isEmpty() && strO.length() <= 50) {
                        if (!this.om0.containsKey(strO)) {
                            throw new IllegalArgumentException("Encoder hasn't been registered");
                        }
                        try {
                            if (t == null) {
                                remove(str);
                                return this;
                            }
                            m.AbstractC0680m abstractC0680m = null;
                            try {
                                bArrO = mVar.o(t);
                            } catch (Exception e2) {
                                o(e2);
                                bArrO = null;
                            }
                            if (bArrO == null) {
                                remove(str);
                                return this;
                            }
                            on();
                            m.AbstractC0680m abstractC0680m2 = this.ono.get(str);
                            if (abstractC0680m2 == null || abstractC0680m2.o() == 8) {
                                abstractC0680m = abstractC0680m2;
                            } else {
                                remove(str);
                            }
                            m.m0 m0Var = (m.m0) abstractC0680m;
                            int iM = om.m(strO);
                            om omVar = new om(iM + 1 + bArrO.length);
                            omVar.o((byte) iM);
                            omVar.o(strO);
                            omVar.o(bArrO);
                            byte[] bArrO2 = omVar.o;
                            com.thinkup.core.common.o0m.o.o.o oVar = this.omm;
                            if (oVar != null) {
                                bArrO2 = oVar.o();
                            }
                            byte[] bArr = bArrO2;
                            if (bArr == null) {
                                return this;
                            }
                            o(str, t, bArr, m0Var, (byte) 8);
                            om(str);
                            return this;
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                    throw new IllegalArgumentException("Invalid encoder tag:".concat(strO));
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

    public synchronized void o(Map<String, Object> map, Map<Class, com.thinkup.core.common.o0m.o.o.m> map2) {
        try {
            if (this.mo0) {
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
                        m(key, ((Double) value).doubleValue());
                    } else if (value instanceof byte[]) {
                        o(key, (byte[]) value);
                    } else {
                        if (value instanceof Set) {
                            Set<String> set = (Set) value;
                            if (set.isEmpty() || (set.iterator().next() instanceof String)) {
                                putStringSet(key, set);
                            }
                        }
                        if (map2 != null) {
                            com.thinkup.core.common.o0m.o.o.m mVar = map2.get(value.getClass());
                            if (mVar != null) {
                                o(key, value, (com.thinkup.core.common.o0m.o.o.m<Object>) mVar);
                            } else {
                                m(new Exception("missing encoder for type:" + value.getClass()));
                            }
                        } else {
                            m(new Exception("missing encoders"));
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void o(Map<String, Object> map) {
        o(map, (Map<Class, com.thinkup.core.common.o0m.o.o.m>) null);
    }

    private void o(String str, Object obj, Map<Class, com.thinkup.core.common.o0m.o.o.m> map) throws Throwable {
        if (obj instanceof Set) {
            Set<String> set = (Set) obj;
            if (set.isEmpty() || (set.iterator().next() instanceof String)) {
                putStringSet(str, set);
                return;
            }
        }
        if (map != null) {
            com.thinkup.core.common.o0m.o.o.m mVar = map.get(obj.getClass());
            if (mVar != null) {
                o(str, obj, (com.thinkup.core.common.o0m.o.o.m<Object>) mVar);
                return;
            }
            m(new Exception("missing encoder for type:" + obj.getClass()));
            return;
        }
        m(new Exception("missing encoders"));
    }

    private boolean o(String str, byte b2) {
        return o(str, b2, nn[b2]);
    }

    private boolean o(String str, byte b2, int i2) {
        com.thinkup.core.common.o0m.o.o.o oVar = this.omm;
        if (oVar != null) {
            str.getBytes(StandardCharsets.UTF_8);
            byte[] bArrO = oVar.o();
            if (bArrO == null) {
                o(new Exception(om));
                return false;
            }
            int length = bArrO.length;
            o(length, i2, b2);
            this.onn.o((byte) length);
            om omVar = this.onn;
            System.arraycopy(bArrO, 0, omVar.o, omVar.m, length);
            this.onn.m += length;
            return true;
        }
        int iM = om.m(str);
        o(iM, i2, b2);
        o(str, iM);
        return true;
    }

    private void o(int i2, int i3, byte b2) {
        om(i2);
        this.m0o = i2 + 2 + i3;
        mn();
        this.onn.o(b2);
    }

    private void o(String str, int i2) {
        this.onn.o((byte) i2);
        if (i2 == str.length()) {
            om omVar = this.onn;
            str.getBytes(0, i2, omVar.o, omVar.m);
            this.onn.m += i2;
            return;
        }
        this.onn.o(str);
    }

    public void o(byte b2, int i2, int i3) {
        m(i2, i3);
        byte b3 = (byte) (b2 | (-128));
        byte[] bArr = this.onn.o;
        this.on0 = ((((long) (bArr[i2] ^ b3)) & 255) << ((i2 & 7) << 3)) ^ this.on0;
        bArr[i2] = b3;
    }

    public void o(int i2, byte[] bArr) {
        int length = bArr.length;
        this.on0 ^= this.onn.m(i2, length);
        om omVar = this.onn;
        omVar.m = i2;
        omVar.o(bArr);
        this.on0 = this.onn.m(i2, length) ^ this.on0;
    }

    private int o(float f) {
        int iFloatToRawIntBits = Float.floatToRawIntBits(f);
        com.thinkup.core.common.o0m.o.o.o oVar = this.omm;
        return oVar != null ? oVar.n() : iFloatToRawIntBits;
    }

    private long o(double d) {
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d);
        com.thinkup.core.common.o0m.o.o.o oVar = this.omm;
        return oVar != null ? oVar.oo() : jDoubleToRawLongBits;
    }

    private void o(String str, Object obj, byte[] bArr, m.mm mmVar, byte b2) {
        if (mmVar == null) {
            o(str, obj, bArr, b2);
        } else if (!mmVar.om && mmVar.oo == bArr.length) {
            o(mmVar.o, bArr);
            mmVar.f42149n = obj;
        } else {
            o(str, obj, bArr, mmVar);
        }
    }

    private void o(String str, Object obj, byte[] bArr, byte b2) {
        int length;
        m.AbstractC0680m m0Var;
        int iO = o(str, bArr, b2);
        if (iO > 0) {
            boolean z2 = this.moo != null;
            if (z2) {
                this.mon.o(str, obj);
                obj = this.moo;
                this.moo = null;
                length = 32;
            } else {
                length = bArr.length;
            }
            Object obj2 = obj;
            int i2 = length;
            if (b2 == 6) {
                m0Var = new m.mo(this.m00, iO, (String) obj2, i2, z2);
            } else if (b2 == 7) {
                m0Var = new m.o(this.m00, iO, obj2, i2, z2);
            } else {
                m0Var = new m.m0(this.m00, iO, obj2, i2, z2);
            }
            this.ono.put(str, m0Var);
            mo();
        }
    }

    private void o(String str, Object obj, byte[] bArr, m.mm mmVar) {
        int iO = o(str, bArr, mmVar.o());
        if (iO > 0) {
            String str2 = mmVar.om ? (String) mmVar.f42149n : null;
            o(mmVar.o(), mmVar.o0, mmVar.o + mmVar.oo);
            boolean z2 = this.moo != null;
            mmVar.o0 = this.m00;
            mmVar.o = iO;
            mmVar.om = z2;
            if (z2) {
                this.mon.o(str, obj);
                mmVar.f42149n = this.moo;
                mmVar.oo = 32;
                this.moo = null;
            } else {
                mmVar.f42149n = obj;
                mmVar.oo = bArr.length;
            }
            mo();
            m0();
            if (str2 != null) {
                on(str2);
            }
        }
    }

    private int o(final String str, final byte[] bArr, byte b2) {
        this.moo = null;
        if (bArr.length < this.o0o) {
            return m(str, bArr, b2);
        }
        StringBuilder sbY = a.y("Large value, key: ", str, ", size: ");
        sbY.append(bArr.length);
        n(sbY.toString());
        final String strO = n0.o();
        byte[] bArr2 = new byte[32];
        strO.getBytes(0, 32, bArr2, 0);
        int iM = m(str, bArr2, (byte) (b2 | 64));
        if (iM > 0) {
            this.mom.o(strO, bArr);
            this.mm0.o(strO, new oo.o() { // from class: com.thinkup.core.common.o0m.o.o.3
                @Override // com.thinkup.core.common.o0m.o.oo.o
                public final void o(AtomicBoolean atomicBoolean) {
                    if (atomicBoolean == null || atomicBoolean.get()) {
                        return;
                    }
                    if (n0.o(new File(o.this.oom + o.this.oon, strO), bArr, atomicBoolean)) {
                        return;
                    }
                    o.this.n("Write large value with key:" + str + " failed");
                }
            });
            this.moo = strO;
        }
        return iM;
    }
}
