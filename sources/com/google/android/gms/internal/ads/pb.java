package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.util.SparseArray;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class pb implements e2, kc, li0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f18581d = new b(13);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f18583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f18584c;

    public pb(int i10, String str, Object obj) {
        this.f18583b = str;
        this.f18584c = obj;
        this.f18582a = i10;
    }

    public static pb c(String str, boolean z10) {
        return new pb(1, str, Boolean.valueOf(z10));
    }

    public static pb g(long j10, String str) {
        return new pb(2, str, Long.valueOf(j10));
    }

    @Override // com.google.android.gms.internal.ads.e2
    public d2 a(n2 n2Var, long j10) {
        long j11;
        long jZzn = n2Var.zzn();
        int iMin = (int) Math.min(112800L, n2Var.zzo() - jZzn);
        np0 np0Var = (np0) this.f18584c;
        np0Var.y(iMin);
        n2Var.v(np0Var.f17880a, 0, iMin);
        int i10 = np0Var.f17882c;
        long j12 = -1;
        long j13 = -1;
        long j14 = C.TIME_UNSET;
        while (true) {
            if (np0Var.B() < 188) {
                j11 = C.TIME_UNSET;
                break;
            }
            byte[] bArr = np0Var.f17880a;
            int i11 = np0Var.f17881b;
            while (true) {
                if (i11 >= i10) {
                    j11 = C.TIME_UNSET;
                    break;
                }
                byte b10 = bArr[i11];
                j11 = C.TIME_UNSET;
                if (b10 == 71) {
                    break;
                }
                i11++;
            }
            int i12 = i11 + 188;
            if (i12 > i10) {
                break;
            }
            long jN = dv.n(np0Var, i11, this.f18582a);
            if (jN != j11) {
                long jC = ((st0) this.f18583b).c(jN);
                if (jC > j10) {
                    return j14 == j11 ? new d2(-1, jC, jZzn) : new d2(0, C.TIME_UNSET, jZzn + j13);
                }
                j14 = jC;
                long j15 = i11;
                if (100000 + j14 > j10) {
                    return new d2(0, C.TIME_UNSET, jZzn + j15);
                }
                j13 = j15;
            }
            np0Var.E(i12);
            j12 = i12;
        }
        return j14 != j11 ? new d2(-2, j14, jZzn + j12) : d2.f13361d;
    }

    public int b() {
        int i10 = this.f18582a;
        if (i10 != 2) {
            return i10 != 3 ? 0 : 512;
        }
        return com.ironsource.mediationsdk.metadata.a.f29616n;
    }

    public Object d(int i10) {
        SparseArray sparseArray = (SparseArray) this.f18583b;
        if (this.f18582a == -1) {
            this.f18582a = 0;
        }
        while (true) {
            int i11 = this.f18582a;
            if (i11 <= 0 || i10 >= sparseArray.keyAt(i11)) {
                break;
            }
            this.f18582a--;
        }
        while (this.f18582a < sparseArray.size() - 1 && i10 >= sparseArray.keyAt(this.f18582a + 1)) {
            this.f18582a++;
        }
        return sparseArray.valueAt(this.f18582a);
    }

    public void e(Object obj, Object obj2) {
        int i10 = this.f18582a + 1;
        Object[] objArr = (Object[]) this.f18583b;
        int length = objArr.length;
        int i11 = i10 + i10;
        if (i11 > length) {
            this.f18583b = Arrays.copyOf(objArr, x91.d(length, i11));
        }
        rb0.j(obj, obj2);
        Object[] objArr2 = (Object[]) this.f18583b;
        int i12 = this.f18582a;
        int i13 = i12 + i12;
        objArr2[i13] = obj;
        objArr2[i13 + 1] = obj2;
        this.f18582a = i12 + 1;
    }

    public synchronized byte[] f(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f18584c;
            if (i11 >= arrayList.size()) {
                return new byte[i10];
            }
            byte[] bArr = (byte[]) arrayList.get(i11);
            int length = bArr.length;
            if (length >= i10) {
                this.f18582a -= length;
                arrayList.remove(i11);
                ((ArrayList) this.f18583b).remove(bArr);
                return bArr;
            }
            i11++;
        }
    }

    public void h(gi giVar) {
        synchronized (this.f18583b) {
            try {
                Iterator it = ((LinkedList) this.f18584c).iterator();
                while (it.hasNext()) {
                    gi giVar2 = (gi) it.next();
                    if (zzt.zzh().g().zzc()) {
                        if (!zzt.zzh().g().zze() && !giVar.equals(giVar2) && giVar2.f14876q.equals(giVar.f14876q)) {
                            it.remove();
                            return;
                        }
                    } else if (!giVar.equals(giVar2) && giVar2.f14874o.equals(giVar.f14874o)) {
                        it.remove();
                        return;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i(Set set) {
        if (set != null) {
            int size = set.size() + this.f18582a;
            Object[] objArr = (Object[]) this.f18583b;
            int length = objArr.length;
            int i10 = size + size;
            if (i10 > length) {
                this.f18583b = Arrays.copyOf(objArr, x91.d(length, i10));
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            e(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.ads.kc
    public byte j(qc qcVar, int i10) {
        byte[] bArr = (byte[]) this.f18583b;
        int i11 = ((((~1264448664) & 231739608) | 1128901767) + ((1264448664 & 479203675) | 860794247)) - 1823332376;
        int i12 = 1761855727 % 1384724137;
        int i13 = (((((~143154913) & 992498304) | 439467622) + ((143154913 & 1627930754) | 1212551295)) - (-2089988634)) ^ (2033018190 % 70061690);
        int i14 = ((((~1661299468) & 613450408) | 2017391535) + ((1661299468 & 109051904) | 2071555381)) - (-441392543);
        int i15 = 1694830070 % 1383960411;
        int i16 = i10 >>> i13;
        if (i16 != this.f18582a) {
            ((b2.w) this.f18584c).l(i16, bArr);
            this.f18582a = i16;
        }
        int i17 = i14 ^ i15;
        return (byte) (((qcVar.b(i10) ^ bArr[i10 % (i11 ^ i12)]) << i17) >> i17);
    }

    @Override // com.google.android.gms.internal.ads.kc
    public qc k(qc qcVar, int i10, int i11) {
        if (i10 < 0 || i10 > i11 || i11 > qcVar.f19023a.length) {
            throw new IndexOutOfBoundsException();
        }
        byte[] bArr = new byte[i11 - i10];
        int i12 = 0;
        while (i10 < i11) {
            bArr[i12] = j(qcVar, i10);
            i10++;
            i12++;
        }
        return qc.e(bArr);
    }

    public synchronized void l(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= 4096) {
                ((ArrayList) this.f18583b).add(bArr);
                ArrayList arrayList = (ArrayList) this.f18584c;
                int iBinarySearch = Collections.binarySearch(arrayList, bArr, f18581d);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                arrayList.add(iBinarySearch, bArr);
                this.f18582a += length;
                synchronized (this) {
                    while (this.f18582a > 4096) {
                        byte[] bArr2 = (byte[]) ((ArrayList) this.f18583b).remove(0);
                        ((ArrayList) this.f18584c).remove(bArr2);
                        this.f18582a -= bArr2.length;
                    }
                }
            }
        }
    }

    public db1 m() {
        return p(true);
    }

    public void n(gi giVar) {
        synchronized (this.f18583b) {
            try {
                LinkedList linkedList = (LinkedList) this.f18584c;
                if (linkedList.size() >= 10) {
                    int size = linkedList.size();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(size).length() + 30);
                    sb2.append("Queue is full, current size = ");
                    sb2.append(size);
                    String string = sb2.toString();
                    int i10 = zze.zza;
                    zzo.zzd(string);
                    linkedList.remove(0);
                }
                int i11 = this.f18582a;
                this.f18582a = i11 + 1;
                giVar.l = i11;
                synchronized (giVar.f14867g) {
                    try {
                        int i12 = giVar.f14871k;
                        int i13 = giVar.l;
                        int i14 = giVar.f14862b;
                        if (!giVar.f14864d) {
                            i14 = (i13 * i14) + (i12 * giVar.f14861a);
                        }
                        if (i14 > giVar.f14873n) {
                            giVar.f14873n = i14;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                linkedList.add(giVar);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public Object o() {
        String str = (String) this.f18583b;
        Object obj = this.f18584c;
        xl xlVar = (xl) un.f20825a.get();
        if (xlVar == null) {
            if (un.f20826b.get() == null) {
                return obj;
            }
            throw new ClassCastException();
        }
        SharedPreferences sharedPreferences = xlVar.f21916a;
        int i10 = this.f18582a - 1;
        if (i10 == 0) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            try {
                return Boolean.valueOf(sharedPreferences.getBoolean(str, zBooleanValue));
            } catch (ClassCastException unused) {
                return Boolean.valueOf(sharedPreferences.getString(str, String.valueOf(zBooleanValue)));
            }
        }
        if (i10 == 1) {
            long jLongValue = ((Long) obj).longValue();
            try {
                return Long.valueOf(sharedPreferences.getLong(str, jLongValue));
            } catch (ClassCastException unused2) {
                return Long.valueOf(sharedPreferences.getInt(str, (int) jLongValue));
            }
        }
        if (i10 != 2) {
            return sharedPreferences.getString(str, (String) obj);
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        try {
            return Double.valueOf(sharedPreferences.getFloat(str, (float) dDoubleValue));
        } catch (ClassCastException unused3) {
            return Double.valueOf(sharedPreferences.getString(str, String.valueOf(dDoubleValue)));
        }
    }

    public db1 p(boolean z10) {
        da1 da1Var;
        da1 da1Var2;
        if (z10 && (da1Var2 = (da1) this.f18584c) != null) {
            throw da1Var2.a();
        }
        db1 db1VarH = db1.h(this.f18582a, (Object[]) this.f18583b, this);
        if (!z10 || (da1Var = (da1) this.f18584c) == null) {
            return db1VarH;
        }
        throw da1Var.a();
    }

    @Override // com.google.android.gms.internal.ads.li0
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo161zza(Object obj) {
        int i10 = ry1.f19707e0;
        ((oe) obj).n((jf) this.f18583b, (jf) this.f18584c, this.f18582a);
    }

    @Override // com.google.android.gms.internal.ads.e2
    public void zzb() {
        byte[] bArr = uu0.f20902b;
        int length = bArr.length;
        ((np0) this.f18584c).z(0, bArr);
    }

    @Override // com.google.android.gms.internal.ads.kc
    /* JADX INFO: renamed from: zzc */
    public /* bridge */ /* synthetic */ kc mo167zzc() {
        return new pb((b2.w) this.f18584c);
    }

    public pb(b2.w wVar) {
        this.f18582a = -1;
        this.f18583b = new byte[8];
        this.f18584c = wVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public pb(int i10, boolean z10) {
        this(4);
        switch (i10) {
            case 4:
                this.f18583b = new Object();
                this.f18584c = new LinkedList();
                break;
            case 7:
                break;
            case 9:
                this.f18583b = new SparseArray();
                this.f18584c = l42.f16713a;
                this.f18582a = -1;
                break;
            default:
                this.f18583b = new ArrayList();
                this.f18584c = new ArrayList(64);
                this.f18582a = 0;
                break;
        }
    }

    public pb(int i10) {
        this.f18583b = new Object[i10 + i10];
        this.f18582a = 0;
    }
}
