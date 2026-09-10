package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class iw0 implements yd1, z.j, ij1, wk1, xi0, y22 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static iw0 f15862d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f15864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f15865c;

    public iw0(int i10) {
        this.f15863a = i10;
        switch (i10) {
            case 7:
                this(7, new ay0(6), new long[10]);
                break;
            case 8:
            default:
                x11 x11Var = new x11(28);
                this.f15864b = x11Var;
                this.f15865c = new uo0(x11Var, 7);
                break;
            case 9:
                this.f15864b = null;
                this.f15865c = null;
                break;
            case 10:
                this.f15864b = new HashMap();
                break;
        }
    }

    public static kj1 C(an1 an1Var) {
        return kj1.t(an1Var.A().z(), an1Var.A().A(), an1Var.A().B(), an1Var.C(), an1Var.C() == on1.RAW ? null : Integer.valueOf(an1Var.B()));
    }

    public static boolean D(int i10) {
        int i11 = i10 - 2;
        return i11 == 1 || i11 == 2 || i11 == 3;
    }

    public static final iw0 d(bn1 bn1Var) throws GeneralSecurityException {
        jc1 ni1Var;
        boolean z10;
        if (bn1Var == null || bn1Var.B() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        ArrayList arrayList = new ArrayList(bn1Var.B());
        for (an1 an1Var : bn1Var.A()) {
            int iB = an1Var.B();
            try {
                kj1 kj1VarC = C(an1Var);
                vi1 vi1Var = vi1.f21181b;
                qj1 qj1Var = (qj1) vi1Var.f21182a.get();
                qj1Var.getClass();
                ni1Var = !qj1Var.f19111b.containsKey(new oj1(kj1.class, (zq1) kj1VarC.f16464c)) ? new ni1(kj1VarC) : vi1Var.e(kj1VarC);
                z10 = false;
            } catch (GeneralSecurityException e10) {
                if (((AtomicBoolean) th1.f20394a.f21612b).get()) {
                    throw e10;
                }
                ni1Var = new ni1(C(an1Var));
                z10 = true;
            }
            if (((AtomicBoolean) th1.f20394a.f21612b).get() && !D(an1Var.H())) {
                throw new GeneralSecurityException("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
            }
            arrayList.add(new cf1(ni1Var, an1Var.H(), iB, iB == bn1Var.z(), z10));
        }
        return new iw0(new HashMap(), Collections.unmodifiableList(arrayList));
    }

    public static final wx1 i(wx1 wx1Var, List list) {
        HashMap map = new HashMap(wx1Var.f21619a);
        HashSet hashSet = new HashSet(list);
        for (String str : wx1Var.f21619a.keySet()) {
            if (!hashSet.contains(str)) {
                map.remove(str);
            }
        }
        return new wx1(map);
    }

    public static void k(iw0 iw0Var, f81 f81Var) {
        ay0 ay0Var = (ay0) f81Var.f14317b;
        ay0 ay0Var2 = (ay0) iw0Var.f15864b;
        long[] jArr = (long[]) ay0Var2.f12537b;
        long[] jArr2 = (long[]) ay0Var.f12537b;
        long[] jArr3 = (long[]) f81Var.f14318c;
        ps1.S(jArr, jArr2, jArr3);
        long[] jArr4 = (long[]) ay0Var2.f12538c;
        long[] jArr5 = (long[]) ay0Var.f12538c;
        long[] jArr6 = (long[]) ay0Var.f12539d;
        ps1.S(jArr4, jArr5, jArr6);
        ps1.S((long[]) ay0Var2.f12539d, jArr6, jArr3);
        ps1.S((long[]) iw0Var.f15865c, jArr2, jArr5);
    }

    public static final iw0 z(ff1 ff1Var) throws GeneralSecurityException {
        int i10;
        int i11;
        t6.l lVar = new t6.l(9);
        ArrayList<bf1> arrayList = (ArrayList) lVar.f50550c;
        bf1 bf1Var = new bf1(ff1Var);
        s6 s6Var = s6.f19864h;
        bf1Var.f12756c = s6Var;
        bf1Var.f12754a = true;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((bf1) it.next()).f12754a = false;
        }
        arrayList.add(bf1Var);
        if (lVar.f50549b) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        lVar.f50549b = true;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int i12 = 0;
        while (i12 < arrayList.size() - 1) {
            int i13 = i12 + 1;
            if (((bf1) arrayList.get(i12)).f12756c == s6Var && ((bf1) arrayList.get(i13)).f12756c != s6Var) {
                throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
            i12 = i13;
        }
        HashSet hashSet = new HashSet();
        Integer num = null;
        for (bf1 bf1Var2 : arrayList) {
            bf1Var2.getClass();
            ff1 ff1Var2 = bf1Var2.f12755b;
            s6 s6Var2 = bf1Var2.f12756c;
            if (s6Var2 == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            int i14 = 3;
            if (s6Var2 == s6Var) {
                int i15 = 0;
                while (true) {
                    if (i15 != 0 && !hashSet.contains(Integer.valueOf(i15))) {
                        break;
                    }
                    int i16 = rj1.f19601a;
                    i15 = 0;
                    while (i15 == 0) {
                        byte[] bArrA = mj1.a(4);
                        i15 = (bArrA[3] & 255) | ((bArrA[2] & 255) << 8) | ((bArrA[0] & 255) << 24) | ((bArrA[1] & 255) << 16);
                    }
                }
                i10 = i15;
            } else {
                i10 = 0;
            }
            Integer numValueOf = Integer.valueOf(i10);
            if (hashSet.contains(numValueOf)) {
                int i17 = i10;
                throw new GeneralSecurityException(com.applovin.impl.ca.m(new StringBuilder(String.valueOf(i17).length() + 31), "Id ", i17, " is used twice in the keyset"));
            }
            hashSet.add(numValueOf);
            jc1 jc1VarB = qi1.f19092b.b(ff1Var2, true != ff1Var2.a() ? null : numValueOf);
            Object obj = af1.f12010c;
            if (obj.equals(obj)) {
                i11 = i14;
            } else if (af1.f12011d.equals(obj)) {
                i11 = 4;
            } else {
                if (!af1.f12012e.equals(obj)) {
                    throw new IllegalStateException("Unknown key status");
                }
                i14 = 5;
                i11 = i14;
            }
            boolean z10 = bf1Var2.f12754a;
            cf1 cf1Var = new cf1(jc1VarB, i11, i10, z10, false);
            if (z10) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                num = numValueOf;
            }
            arrayList2.add(cf1Var);
        }
        if (num == null) {
            throw new GeneralSecurityException("No primary was set");
        }
        HashMap map = (HashMap) lVar.f50551d;
        iw0 iw0Var = new iw0(map, arrayList2);
        if (map.get(pi1.class) == null) {
            return iw0Var;
        }
        throw new ClassCastException();
    }

    public Object A(ye1 ye1Var, Class cls) throws GeneralSecurityException {
        List list = (List) this.f15864b;
        bn1 bn1VarH = h();
        int i10 = jf1.f16086a;
        int iZ = bn1VarH.z();
        int i11 = 0;
        boolean z10 = false;
        boolean z11 = true;
        for (an1 an1Var : bn1VarH.A()) {
            if (an1Var.H() == 3) {
                if (!an1Var.z()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(an1Var.B())));
                }
                if (an1Var.C() == on1.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(an1Var.B())));
                }
                if (an1Var.H() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(an1Var.B())));
                }
                if (an1Var.B() == iZ) {
                    if (z10) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z10 = true;
                }
                z11 &= an1Var.A().B() == 4;
                i11++;
            }
        }
        if (i11 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z10 && !z11) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (((cf1) list.get(i12)).f13157e || !D(((cf1) list.get(i12)).f13158f)) {
                String strZ = bn1VarH.C(i12).A().z();
                StringBuilder sb2 = new StringBuilder(String.valueOf(strZ).length() + String.valueOf(i12).length() + 44 + 32);
                sb2.append("Key parsing of key with index ");
                sb2.append(i12);
                sb2.append(" and type_url ");
                sb2.append(strZ);
                sb2.append(" failed, unable to get primitive");
                throw new GeneralSecurityException(sb2.toString());
            }
        }
        return ye1Var.a(this, cls);
    }

    public void B(ag0 ag0Var) {
        for (t32 t32Var : (CopyOnWriteArrayList) this.f15865c) {
            Object obj = t32Var.f20155b;
            Handler handler = t32Var.f20154a;
            f12 f12Var = new f12(3, ag0Var, obj);
            String str = uu0.f20901a;
            Looper looper = handler.getLooper();
            if (looper.getThread().isAlive()) {
                if (looper == Looper.myLooper()) {
                    f12Var.run();
                } else {
                    handler.post(f12Var);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.xi0
    public /* synthetic */ void a(Object obj, z02 z02Var) {
        a02 a02Var = (a02) obj;
        a02Var.m((mu1) this.f15865c, new iw0(z02Var, ((d02) this.f15864b).f13330e));
    }

    @Override // z.j
    public /* synthetic */ Object c(z.i iVar) {
        q61.d((Context) this.f15864b, (h21) this.f15865c, iVar);
        return "";
    }

    public synchronized Map e() {
        try {
            if (((Map) this.f15865c) == null) {
                this.f15865c = Collections.unmodifiableMap(new HashMap((HashMap) this.f15864b));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (Map) this.f15865c;
    }

    @Override // com.google.android.gms.internal.ads.ij1
    public Object f(cf1 cf1Var) {
        return ((hj1) this.f15864b).a(cf1Var.f13153a, ((jj1) this.f15865c).zzb());
    }

    public /* synthetic */ void g(wx1 wx1Var) {
        for (Map.Entry entry : new HashMap((HashMap) this.f15864b).entrySet()) {
            if (entry.getKey() != null) {
                throw new ClassCastException();
            }
            List list = (List) entry.getValue();
            if (!i(wx1Var, list).equals(i((wx1) this.f15865c, list))) {
                throw null;
            }
        }
        this.f15865c = wx1Var;
    }

    public bn1 h() {
        try {
            ym1 ym1VarF = bn1.F();
            for (cf1 cf1Var : (List) this.f15864b) {
                jc1 jc1Var = cf1Var.f13153a;
                int i10 = cf1Var.f13155c;
                int i11 = cf1Var.f13158f;
                kj1 kj1Var = (kj1) vi1.f21181b.f(jc1Var);
                Integer numG = jc1Var.g();
                if (numG != null && numG.intValue() != i10) {
                    throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
                }
                zm1 zm1VarD = an1.D();
                tm1 tm1VarC = um1.C();
                String str = (String) kj1Var.f16463b;
                tm1VarC.b();
                ((um1) tm1VarC.f19193b).E(str);
                cs1 cs1Var = (cs1) kj1Var.f16465d;
                tm1VarC.b();
                ((um1) tm1VarC.f19193b).F(cs1Var);
                int i12 = kj1Var.f16462a;
                tm1VarC.b();
                ((um1) tm1VarC.f19193b).G(i12);
                zm1VarD.b();
                ((an1) zm1VarD.f19193b).E((um1) tm1VarC.e());
                zm1VarD.b();
                ((an1) zm1VarD.f19193b).I(i11);
                zm1VarD.b();
                ((an1) zm1VarD.f19193b).F(i10);
                on1 on1Var = (on1) kj1Var.f16466e;
                zm1VarD.b();
                ((an1) zm1VarD.f19193b).G(on1Var);
                an1 an1Var = (an1) zm1VarD.e();
                ym1VarF.b();
                ((bn1) ym1VarF.f19193b).H(an1Var);
                if (cf1Var.f13156d) {
                    ym1VarF.b();
                    ((bn1) ym1VarF.f19193b).G(i10);
                }
            }
            return (bn1) ym1VarF.e();
        } catch (GeneralSecurityException e10) {
            throw new aa.b(e10, 7);
        }
    }

    @Override // com.google.android.gms.internal.ads.wk1
    public long l(po1 po1Var) {
        wk1 wk1Var = (wk1) this.f15864b;
        this.f15865c = po1Var.f18750a;
        Map map = Collections.EMPTY_MAP;
        try {
            long jL = wk1Var.l(po1Var);
            if (wk1Var.zzc() != null) {
            }
            return jL;
        } finally {
            Uri uriZzc = wk1Var.zzc();
            if (uriZzc != null) {
                this.f15865c = uriZzc;
            }
            wk1Var.zzj();
        }
    }

    @Override // com.google.android.gms.internal.ads.wk1
    public void n(ox1 ox1Var) {
        ox1Var.getClass();
        ((wk1) this.f15864b).n(ox1Var);
    }

    public void o(Object obj, String str) throws IOException {
        boolean zCommit;
        String str2 = (String) this.f15864b;
        SharedPreferences sharedPreferences = (SharedPreferences) this.f15865c;
        if (obj instanceof String) {
            zCommit = sharedPreferences.edit().putString(str, (String) obj).commit();
        } else if (obj instanceof Long) {
            zCommit = sharedPreferences.edit().putLong(str, ((Long) obj).longValue()).commit();
        } else {
            if (!(obj instanceof Boolean)) {
                if (obj instanceof Integer) {
                    zCommit = sharedPreferences.edit().putInt(str, ((Integer) obj).intValue()).commit();
                } else {
                    String strValueOf = String.valueOf(obj.getClass());
                    Log.e("GpidLifecycleSPHandler", d5.u.h(new StringBuilder(strValueOf.length() + 33 + String.valueOf(str2).length()), "Unexpected object class ", strValueOf, " for app ", str2));
                }
                throw new IOException(d5.u.h(new StringBuilder(str.length() + 25 + String.valueOf(str2).length()), "Failed to store ", str, " for app ", str2));
            }
            zCommit = sharedPreferences.edit().putBoolean(str, ((Boolean) obj).booleanValue()).commit();
        }
        if (zCommit) {
            return;
        }
        throw new IOException(d5.u.h(new StringBuilder(str.length() + 25 + String.valueOf(str2).length()), "Failed to store ", str, " for app ", str2));
    }

    public boolean q(int i10) {
        return ((z02) this.f15864b).f22445a.get(i10);
    }

    public cf1 r() {
        for (cf1 cf1Var : (List) this.f15864b) {
            if (cf1Var != null && cf1Var.f13156d) {
                if (cf1Var.f13154b == af1.f12010c) {
                    return cf1Var;
                }
                throw new IllegalStateException("Keyset has primary which isn't enabled");
            }
        }
        throw new IllegalStateException("Keyset has no valid primary");
    }

    public so1 s() throws GeneralSecurityException {
        ECPoint eCPoint;
        to1 to1Var = (to1) this.f15864b;
        if (to1Var == null) {
            throw new GeneralSecurityException("Cannot build without a ecdsa public key");
        }
        wv0 wv0Var = (wv0) this.f15865c;
        if (wv0Var == null) {
            throw new GeneralSecurityException("Cannot build without a private value");
        }
        BigInteger bigInteger = (BigInteger) wv0Var.f21612b;
        ECPoint eCPoint2 = to1Var.f20451c;
        qo1 qo1Var = to1Var.f20450b.f19631b;
        BigInteger order = qo1Var.f19152b.getOrder();
        if (bigInteger.signum() <= 0 || bigInteger.compareTo(order) >= 0) {
            throw new GeneralSecurityException("Invalid private value");
        }
        ECParameterSpec eCParameterSpec = qo1Var.f19152b;
        if (!zh1.b(eCParameterSpec, zh1.f22621a) && !zh1.b(eCParameterSpec, zh1.f22622b) && !zh1.b(eCParameterSpec, zh1.f22623c)) {
            throw new GeneralSecurityException("spec must be NIST P256, P384 or P521");
        }
        if (bigInteger.signum() != 1) {
            throw new GeneralSecurityException("k must be positive");
        }
        if (bigInteger.compareTo(eCParameterSpec.getOrder()) >= 0) {
            throw new GeneralSecurityException("k must be smaller than the order of the generator");
        }
        EllipticCurve curve = eCParameterSpec.getCurve();
        ECPoint generator = eCParameterSpec.getGenerator();
        zh1.a(generator, curve);
        BigInteger a8 = eCParameterSpec.getCurve().getA();
        BigInteger bigIntegerC = zh1.c(curve);
        yh1 yh1VarD = zh1.d(ECPoint.POINT_INFINITY, bigIntegerC);
        yh1 yh1VarD2 = zh1.d(generator, bigIntegerC);
        for (int iBitLength = bigInteger.bitLength(); iBitLength >= 0; iBitLength--) {
            if (bigInteger.testBit(iBitLength)) {
                yh1VarD = zh1.f(yh1VarD, yh1VarD2, a8, bigIntegerC);
                yh1VarD2 = zh1.e(yh1VarD2, a8, bigIntegerC);
            } else {
                yh1VarD2 = zh1.f(yh1VarD, yh1VarD2, a8, bigIntegerC);
                yh1VarD = zh1.e(yh1VarD, a8, bigIntegerC);
            }
        }
        if (yh1VarD.f22260c.equals(BigInteger.ZERO)) {
            eCPoint = ECPoint.POINT_INFINITY;
        } else {
            BigInteger bigIntegerModInverse = yh1VarD.f22260c.modInverse(bigIntegerC);
            BigInteger bigIntegerMod = bigIntegerModInverse.multiply(bigIntegerModInverse).mod(bigIntegerC);
            eCPoint = new ECPoint(yh1VarD.f22258a.multiply(bigIntegerMod).mod(bigIntegerC), yh1VarD.f22259b.multiply(bigIntegerMod).mod(bigIntegerC).multiply(bigIntegerModInverse).mod(bigIntegerC));
        }
        zh1.a(eCPoint, curve);
        if (eCPoint.equals(eCPoint2)) {
            return new so1((to1) this.f15864b, (wv0) this.f15865c);
        }
        throw new GeneralSecurityException("Invalid private value");
    }

    @Override // com.google.android.gms.internal.ads.vx1
    public int t(byte[] bArr, int i10, int i11) {
        return ((wk1) this.f15864b).t(bArr, i10, i11);
    }

    public String toString() {
        switch (this.f15863a) {
            case 6:
                bn1 bn1VarH = h();
                int i10 = jf1.f16086a;
                cn1 cn1VarZ = fn1.z();
                int iZ = bn1VarH.z();
                cn1VarZ.b();
                ((fn1) cn1VarZ.f19193b).A(iZ);
                for (an1 an1Var : bn1VarH.A()) {
                    dn1 dn1VarZ = en1.z();
                    String strZ = an1Var.A().z();
                    dn1VarZ.b();
                    ((en1) dn1VarZ.f19193b).A(strZ);
                    int iH = an1Var.H();
                    dn1VarZ.b();
                    ((en1) dn1VarZ.f19193b).D(iH);
                    on1 on1VarC = an1Var.C();
                    dn1VarZ.b();
                    ((en1) dn1VarZ.f19193b).C(on1VarC);
                    int iB = an1Var.B();
                    dn1VarZ.b();
                    ((en1) dn1VarZ.f19193b).B(iB);
                    en1 en1Var = (en1) dn1VarZ.e();
                    cn1VarZ.b();
                    ((fn1) cn1VarZ.f19193b).B(en1Var);
                }
                return ((fn1) cn1VarZ.e()).toString();
            default:
                return super.toString();
        }
    }

    public cf1 u(int i10) {
        List list = (List) this.f15864b;
        if (i10 < 0 || i10 >= list.size()) {
            int size = list.size();
            throw new IndexOutOfBoundsException(l1.d.j(new StringBuilder(String.valueOf(i10).length() + 34 + String.valueOf(size).length()), i10, "Invalid index ", size, " for keyset of size "));
        }
        cf1 cf1Var = (cf1) list.get(i10);
        if (!D(cf1Var.f13158f)) {
            throw new IllegalStateException(com.applovin.impl.ca.m(new StringBuilder(String.valueOf(i10).length() + 42), "Keyset-Entry at position ", i10, " has wrong status"));
        }
        if (cf1Var.f13157e) {
            throw new IllegalStateException(com.applovin.impl.ca.m(new StringBuilder(String.valueOf(i10).length() + 48), "Keyset-Entry at position ", i10, " didn't parse correctly"));
        }
        return (cf1) list.get(i10);
    }

    public void w(String str) throws IOException {
        if (((SharedPreferences) this.f15865c).edit().remove(str).commit()) {
            return;
        }
        String str2 = (String) this.f15864b;
        throw new IOException(d5.u.h(new StringBuilder(str.length() + 26 + String.valueOf(str2).length()), "Failed to remove ", str, " for app ", str2));
    }

    @Override // com.google.android.gms.internal.ads.y22
    public int zza(Object obj) {
        p22 p22Var = (p22) obj;
        HashMap map = z22.f22480a;
        Context context = (Context) this.f15864b;
        g22 g22Var = (g22) this.f15865c;
        String str = p22Var.f18453b;
        return ((str.equals(g22Var.f14678o) || str.equals(z22.d(g22Var))) && p22Var.f(context, g22Var, false) && p22Var.g(g22Var)) ? 1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.wk1
    public Uri zzc() {
        return ((wk1) this.f15864b).zzc();
    }

    @Override // com.google.android.gms.internal.ads.wk1
    public void zzd() {
        ((wk1) this.f15864b).zzd();
    }

    @Override // com.google.android.gms.internal.ads.wk1
    public Map zzj() {
        return ((wk1) this.f15864b).zzj();
    }

    public /* synthetic */ iw0(int i10, Object obj, Object obj2) {
        this.f15863a = i10;
        this.f15864b = obj;
        this.f15865c = obj2;
    }

    public /* synthetic */ iw0(Object obj, boolean z10, Object obj2, int i10) {
        this.f15863a = i10;
        this.f15865c = obj;
        this.f15864b = obj2;
    }

    @Override // com.google.android.gms.internal.ads.yd1
    public void zza(Throwable th2) {
        fw0 fw0Var = (fw0) this.f15865c;
        fw0Var.a(th2);
        fw0Var.zzd(false);
        ((jw0) this.f15864b).a(fw0Var);
    }

    public iw0(Context context) {
        this.f15863a = 3;
        this.f15864b = context.getPackageName();
        this.f15865c = context.getSharedPreferences("paid_storage_sp", 0);
    }

    public iw0(ya1 ya1Var, int[] iArr) {
        this.f15863a = 4;
        this.f15864b = ca1.y(ya1Var);
        this.f15865c = iArr;
    }

    public iw0(wk1 wk1Var) {
        this.f15863a = 11;
        this.f15864b = wk1Var;
        this.f15865c = Uri.EMPTY;
        Map map = Collections.EMPTY_MAP;
    }

    public /* synthetic */ iw0(ry1 ry1Var) {
        this.f15863a = 12;
        this.f15864b = new HashMap();
        this.f15865c = wx1.f21618b;
    }

    public iw0(z02 z02Var, SparseArray sparseArray) {
        this.f15863a = 13;
        this.f15864b = z02Var;
        SparseBooleanArray sparseBooleanArray = z02Var.f22445a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
            int iA = z02Var.a(i10);
            zz1 zz1Var = (zz1) sparseArray.get(iA);
            zz1Var.getClass();
            sparseArray2.append(iA, zz1Var);
        }
        this.f15865c = sparseArray2;
    }

    public iw0(Map map, List list) throws GeneralSecurityException {
        this.f15863a = 6;
        this.f15864b = list;
        this.f15865c = map;
        if (((AtomicBoolean) th1.f20394a.f21612b).get()) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                cf1 cf1Var = (cf1) it.next();
                int i10 = cf1Var.f13155c;
                if (!hashSet.contains(Integer.valueOf(i10))) {
                    hashSet.add(Integer.valueOf(i10));
                    z10 |= cf1Var.f13156d;
                } else {
                    throw new GeneralSecurityException(com.applovin.impl.ca.m(new StringBuilder(String.valueOf(i10).length() + 121), "KeyID ", i10, " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing."));
                }
            }
            if (!z10) {
                throw new GeneralSecurityException("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.yd1
    /* JADX INFO: renamed from: zzb */
    public void mo164zzb(Object obj) {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public iw0(f81 f81Var) {
        this(7);
        this.f15863a = 7;
        k(this, f81Var);
    }
}
