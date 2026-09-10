package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements ba {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f19743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f19744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f19745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f19746e;

    public s(ea eaVar, int i10) {
        Objects.requireNonNull(eaVar);
        this.f19746e = eaVar;
        this.f19743b = new gp0(new byte[5], 5);
        this.f19744c = new SparseArray();
        this.f19745d = new SparseIntArray();
        this.f19742a = i10;
    }

    public boolean b(int i10) {
        return ((tz1[]) this.f19743b)[i10] != null;
    }

    public boolean c(s sVar, int i10) {
        return sVar != null && Objects.equals(((tz1[]) this.f19743b)[i10], ((tz1[]) sVar.f19743b)[i10]) && Objects.equals(((p[]) this.f19744c)[i10], ((p[]) sVar.f19744c)[i10]);
    }

    public synchronized void d() {
        bt0 bt0Var;
        if (((Boolean) zzba.zzc().a(am.f12315q7)).booleanValue() && !zzt.zzh().g().zzi().f12966j) {
            ((ArrayDeque) this.f19745d).clear();
            return;
        }
        synchronized (this) {
            try {
                if (((ty0) this.f19746e) == null) {
                    while (true) {
                        ArrayDeque arrayDeque = (ArrayDeque) this.f19745d;
                        if (!arrayDeque.isEmpty()) {
                            bt0Var = (bt0) arrayDeque.pollFirst();
                            if (bt0Var == null) {
                                break;
                            }
                            gv0 gv0Var = bt0Var.f12887g;
                            if (gv0Var != null) {
                                vu0 vu0Var = (vu0) this.f19743b;
                                synchronized (vu0Var) {
                                    av0 av0Var = (av0) ((ConcurrentHashMap) vu0Var.f21274b).get(gv0Var);
                                    if (av0Var != null) {
                                        ev0 ev0Var = (ev0) vu0Var.f21275c;
                                        av0Var.a();
                                        if (av0Var.f12527a.size() < ev0Var.f14095e) {
                                        }
                                    }
                                }
                                break;
                            }
                        }
                    }
                    ty0 ty0Var = new ty0((vu0) this.f19743b, (at0) this.f19744c, bt0Var);
                    this.f19746e = ty0Var;
                    md0 md0Var = new md0((Object) this, false, (Object) bt0Var, 26);
                    synchronized (ty0Var) {
                        fd1 fd1VarX = zw1.x((kc1) ty0Var.f20531d, c60.f13067m, bt0Var.f12885e);
                        fd1VarX.addListener(new zd1(0, fd1VarX, md0Var), bt0Var.f12885e);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x021d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0220  */
    /* JADX WARN: Code duplicated, block: B:124:0x032d  */
    /* JADX WARN: Code duplicated, block: B:125:0x0341  */
    /* JADX WARN: Code duplicated, block: B:128:0x035f  */
    /* JADX WARN: Code duplicated, block: B:19:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:22:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:25:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:53:0x014e A[PHI: r20 r21
  0x014e: PHI (r20v4 java.lang.String) = (r20v2 java.lang.String), (r20v1 java.lang.String), (r20v1 java.lang.String) binds: [B:52:0x013f, B:45:0x0126, B:27:0x00f5] A[DONT_GENERATE, DONT_INLINE]
  0x014e: PHI (r21v4 int) = (r21v2 int), (r21v1 int), (r21v1 int) binds: [B:52:0x013f, B:45:0x0126, B:27:0x00f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:76:0x01da  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e1  */
    @Override // com.google.android.gms.internal.ads.ba
    public void g(np0 np0Var) {
        SparseArray sparseArray;
        pb pbVar;
        List listUnmodifiableList;
        int i10;
        Object x9Var;
        Object x9Var2;
        int i11;
        if (np0Var.K() != 2) {
            return;
        }
        ea eaVar = (ea) this.f19746e;
        List list = eaVar.f13900a;
        SparseArray sparseArray2 = eaVar.f13905f;
        SparseBooleanArray sparseBooleanArray = eaVar.f13906g;
        int i12 = 0;
        st0 st0Var = (st0) list.get(0);
        if ((np0Var.K() & 128) != 0) {
            np0Var.G(1);
            int iL = np0Var.L();
            int i13 = 3;
            np0Var.G(3);
            gp0 gp0Var = (gp0) this.f19743b;
            np0Var.H(gp0Var.f14921a, 0, 2);
            gp0Var.d(0);
            gp0Var.f(3);
            int i14 = 13;
            eaVar.f13913o = gp0Var.h(13);
            np0Var.H(gp0Var.f14921a, 0, 2);
            gp0Var.d(0);
            int i15 = 4;
            gp0Var.f(4);
            np0Var.G(gp0Var.h(12));
            SparseArray sparseArray3 = (SparseArray) this.f19744c;
            sparseArray3.clear();
            SparseIntArray sparseIntArray = (SparseIntArray) this.f19745d;
            sparseIntArray.clear();
            int iB = np0Var.B();
            while (iB > 0) {
                np0Var.H(gp0Var.f14921a, i12, 5);
                gp0Var.d(i12);
                int iH = gp0Var.h(8);
                gp0Var.f(i13);
                int iH2 = gp0Var.h(i14);
                gp0Var.f(i15);
                int iH3 = gp0Var.h(12);
                int i16 = np0Var.f17881b;
                int i17 = i16 + iH3;
                int i18 = -1;
                String strTrim = null;
                ArrayList arrayList = null;
                int iK = 0;
                while (np0Var.f17881b < i17) {
                    int iK2 = np0Var.K();
                    int iK3 = np0Var.f17881b + np0Var.K();
                    if (iK3 > i17) {
                        SparseArray sparseArray4 = sparseArray2;
                        gp0 gp0Var2 = gp0Var;
                        np0Var.E(i17);
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(np0Var.f17880a, i16, i17);
                        pbVar = new pb();
                        pbVar.f18582a = iK;
                        if (arrayList == null) {
                            listUnmodifiableList = Collections.EMPTY_LIST;
                        } else {
                            listUnmodifiableList = Collections.unmodifiableList(arrayList);
                        }
                        pbVar.f18583b = listUnmodifiableList;
                        pbVar.f18584c = bArrCopyOfRange;
                        if (iH != 6 || iH == 5) {
                            iH = i18;
                        }
                        iB -= iH3 + 5;
                        if (sparseBooleanArray.get(iH2)) {
                            i10 = 3;
                        } else {
                            g9 g9Var = eaVar.f13903d;
                            if (iH != 2) {
                                i10 = 3;
                                if (iH != 3 || iH == 4) {
                                    x9Var = new x9(new u9(pbVar.b(), 0, strTrim, "video/mp2t"));
                                } else {
                                    if (iH == 21) {
                                        x9Var2 = new x9(new i9(1));
                                    } else if (iH == 27) {
                                        x9Var = new x9(new q9(new da(g9Var.a(pbVar), 0)));
                                    } else if (iH == 36) {
                                        x9Var = new x9(new s9(new da(g9Var.a(pbVar), 0)));
                                    } else if (iH == 45) {
                                        x9Var2 = new x9(new v9(0));
                                    } else if (iH == 89) {
                                        x9Var = new x9(new i9((List) pbVar.f18583b, 0));
                                    } else if (iH == 172) {
                                        x9Var = new x9(new c9(pbVar.b(), 1, strTrim, "video/mp2t"));
                                    } else if (iH == 257) {
                                        x9Var2 = new ca(new vu0("application/vnd.dvb.ait"));
                                    } else if (iH != 128) {
                                        if (iH == 129) {
                                            x9Var = new x9(new c9(pbVar.b(), 0, strTrim, "video/mp2t"));
                                        } else if (iH == 138) {
                                            x9Var = new x9(new h9(strTrim, pbVar.b(), 4096, 0));
                                        } else if (iH != 139) {
                                            switch (iH) {
                                                case 15:
                                                    x9Var = new x9(new f9(strTrim, pbVar.b(), "video/mp2t", false));
                                                    break;
                                                case 16:
                                                    x9Var = new x9(new o9(new da(g9Var.a(pbVar), 1)));
                                                    break;
                                                case 17:
                                                    x9Var = new x9(new t9(strTrim, pbVar.b(), 0));
                                                    break;
                                                default:
                                                    switch (iH) {
                                                        case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                                                            x9Var2 = new ca(new vu0(MimeTypes.APPLICATION_SCTE35));
                                                            break;
                                                        case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
                                                            x9Var = new x9(new c9(pbVar.b(), 0, strTrim, "video/mp2t"));
                                                            break;
                                                        case 136:
                                                            x9Var = new x9(new h9(strTrim, pbVar.b(), 4096, 0));
                                                            break;
                                                        default:
                                                            x9Var = null;
                                                            break;
                                                    }
                                                    break;
                                            }
                                        } else {
                                            x9Var = new x9(new h9(strTrim, pbVar.b(), 5408, 0));
                                        }
                                    }
                                    x9Var = x9Var2;
                                }
                                sparseIntArray.put(iH2, iH2);
                                sparseArray3.put(iH2, x9Var);
                            } else {
                                i10 = 3;
                            }
                            x9Var = new x9(new l9(new da(g9Var.a(pbVar), 1), "video/mp2t"));
                            sparseIntArray.put(iH2, iH2);
                            sparseArray3.put(iH2, x9Var);
                        }
                        i13 = i10;
                        sparseArray2 = sparseArray4;
                        gp0Var = gp0Var2;
                        i12 = 0;
                        i14 = 13;
                        i15 = 4;
                    } else {
                        gp0 gp0Var3 = gp0Var;
                        if (iK2 == 5) {
                            long jP = np0Var.P();
                            if (jP == 1094921523) {
                                sparseArray2 = sparseArray2;
                                i11 = iK3;
                                i18 = TsExtractor.TS_STREAM_TYPE_AC3;
                            } else if (jP == 1161904947) {
                                i11 = iK3;
                                i18 = 135;
                                sparseArray2 = sparseArray2;
                            } else if (jP == 1094921524) {
                                sparseArray2 = sparseArray2;
                                i11 = iK3;
                                i18 = 172;
                            } else if (jP == 1212503619) {
                                sparseArray2 = sparseArray2;
                                i11 = iK3;
                                i18 = 36;
                            } else {
                                i11 = iK3;
                            }
                        } else if (iK2 == 106) {
                            sparseArray2 = sparseArray2;
                            i11 = iK3;
                            i18 = TsExtractor.TS_STREAM_TYPE_AC3;
                        } else if (iK2 == 122) {
                            i11 = iK3;
                            i18 = 135;
                            sparseArray2 = sparseArray2;
                        } else if (iK2 == 127) {
                            int iK4 = np0Var.K();
                            if (iK4 == 21) {
                                sparseArray2 = sparseArray2;
                                i11 = iK3;
                                i18 = 172;
                            } else if (iK4 == 14) {
                                i18 = 136;
                                i11 = iK3;
                            } else if (iK4 == 33) {
                                sparseArray2 = sparseArray2;
                                i11 = iK3;
                                i18 = 139;
                            } else {
                                i11 = iK3;
                            }
                        } else if (iK2 == 123) {
                            sparseArray2 = sparseArray2;
                            i11 = iK3;
                            i18 = TsExtractor.TS_STREAM_TYPE_DTS;
                        } else if (iK2 == 10) {
                            strTrim = np0Var.k(3, StandardCharsets.UTF_8).trim();
                            iK = np0Var.K();
                            i11 = iK3;
                        } else if (iK2 == 89) {
                            ArrayList arrayList2 = new ArrayList();
                            while (np0Var.f17881b < iK3) {
                                String strTrim2 = np0Var.k(3, StandardCharsets.UTF_8).trim();
                                np0Var.K();
                                byte[] bArr = new byte[4];
                                np0Var.H(bArr, 0, 4);
                                arrayList2.add(new fa(strTrim2, bArr));
                                iK3 = iK3;
                                sparseArray2 = sparseArray2;
                            }
                            sparseArray2 = sparseArray2;
                            i11 = iK3;
                            arrayList = arrayList2;
                            i18 = 89;
                        } else {
                            sparseArray2 = sparseArray2;
                            i11 = iK3;
                            if (iK2 == 111) {
                                i18 = 257;
                            }
                        }
                        np0Var.G(i11 - np0Var.f17881b);
                        sparseArray2 = sparseArray2;
                        gp0Var = gp0Var3;
                    }
                }
                SparseArray sparseArray5 = sparseArray2;
                gp0 gp0Var4 = gp0Var;
                np0Var.E(i17);
                byte[] bArrCopyOfRange2 = Arrays.copyOfRange(np0Var.f17880a, i16, i17);
                pbVar = new pb();
                pbVar.f18582a = iK;
                if (arrayList == null) {
                    listUnmodifiableList = Collections.EMPTY_LIST;
                } else {
                    listUnmodifiableList = Collections.unmodifiableList(arrayList);
                }
                pbVar.f18583b = listUnmodifiableList;
                pbVar.f18584c = bArrCopyOfRange2;
                if (iH != 6) {
                    iH = i18;
                } else {
                    iH = i18;
                }
                iB -= iH3 + 5;
                if (sparseBooleanArray.get(iH2)) {
                    g9 g9Var2 = eaVar.f13903d;
                    if (iH != 2) {
                        i10 = 3;
                        if (iH != 3) {
                            x9Var = new x9(new u9(pbVar.b(), 0, strTrim, "video/mp2t"));
                        } else {
                            x9Var = new x9(new u9(pbVar.b(), 0, strTrim, "video/mp2t"));
                        }
                        sparseIntArray.put(iH2, iH2);
                        sparseArray3.put(iH2, x9Var);
                    } else {
                        i10 = 3;
                    }
                    x9Var = new x9(new l9(new da(g9Var2.a(pbVar), 1), "video/mp2t"));
                    sparseIntArray.put(iH2, iH2);
                    sparseArray3.put(iH2, x9Var);
                } else {
                    i10 = 3;
                }
                i13 = i10;
                sparseArray2 = sparseArray5;
                gp0Var = gp0Var4;
                i12 = 0;
                i14 = 13;
                i15 = 4;
            }
            SparseArray sparseArray6 = sparseArray2;
            int size = sparseIntArray.size();
            int i19 = 0;
            while (i19 < size) {
                int iKeyAt = sparseIntArray.keyAt(i19);
                int iValueAt = sparseIntArray.valueAt(i19);
                sparseBooleanArray.put(iKeyAt, true);
                eaVar.f13907h.put(iValueAt, true);
                ha haVar = (ha) sparseArray3.valueAt(i19);
                if (haVar != null) {
                    haVar.a(st0Var, eaVar.f13910k, new ga(iL, iKeyAt, Segment.SIZE, 0));
                    sparseArray = sparseArray6;
                    sparseArray.put(iValueAt, haVar);
                } else {
                    sparseArray = sparseArray6;
                }
                i19++;
                sparseArray6 = sparseArray;
            }
            sparseArray6.remove(this.f19742a);
            eaVar.f13910k.zzv();
            eaVar.l = true;
        }
    }

    public s(vu0 vu0Var, zu0 zu0Var, at0 at0Var) {
        this.f19742a = 1;
        this.f19743b = vu0Var;
        this.f19744c = at0Var;
        this.f19745d = new ArrayDeque();
        zu0Var.f22722a = new at0(this, 2);
    }

    public s(tz1[] tz1VarArr, p[] pVarArr, yo yoVar, r rVar) {
        int length = tz1VarArr.length;
        ps1.v(length == pVarArr.length);
        this.f19743b = tz1VarArr;
        this.f19744c = (p[]) pVarArr.clone();
        this.f19745d = yoVar;
        this.f19746e = rVar;
        this.f19742a = length;
    }

    @Override // com.google.android.gms.internal.ads.ba
    public void a(st0 st0Var, o2 o2Var, ga gaVar) {
    }
}
