package com.google.android.gms.internal.measurement;

import android.net.Uri;
import android.os.Parcel;
import android.os.Process;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.X3;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h6 implements Continuation, com.google.android.gms.common.api.internal.k, se, ta.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f23540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f23541c;

    public /* synthetic */ h6(int i10, Object obj, Object obj2) {
        this.f23539a = i10;
        this.f23540b = obj;
        this.f23541c = obj2;
    }

    @Override // com.google.android.gms.internal.measurement.se
    public Object a(re reVar) throws IOException {
        Uri uri = reVar.f23938d;
        AtomicLong atomicLong = hf.f23549a;
        int iMyPid = Process.myPid();
        long id2 = Thread.currentThread().getId();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long andIncrement = hf.f23549a.getAndIncrement();
        int length = String.valueOf(iMyPid).length();
        StringBuilder sb2 = new StringBuilder(com.applovin.impl.ca.h(length + 15 + String.valueOf(id2).length(), 1, String.valueOf(jCurrentTimeMillis).length(), 1, String.valueOf(andIncrement).length()));
        sb2.append(".mobstore_tmp-");
        sb2.append(iMyPid);
        sb2.append("-");
        sb2.append(id2);
        q4.a.r(sb2, "-", jCurrentTimeMillis, "-");
        sb2.append(andIncrement);
        Uri uriBuild = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(sb2.toString())).build();
        jf jfVar = reVar.f23935a;
        ArrayList arrayListA = reVar.a(jfVar.d(uriBuild));
        h6[] h6VarArr = (h6[]) this.f23541c;
        if (h6VarArr != null) {
            h6VarArr[0].d(arrayListA);
        }
        try {
            OutputStream outputStream = (OutputStream) arrayListA.get(0);
            try {
                ((l0) this.f23540b).b(outputStream);
                h6[] h6VarArr2 = (h6[]) this.f23541c;
                if (h6VarArr2 != null) {
                    h6 h6Var = h6VarArr2[0];
                    if (((cf) h6Var.f23541c) == null) {
                        throw new b2.z("Cannot sync underlying stream");
                    }
                    ((OutputStream) h6Var.f23540b).flush();
                    ((cf) h6Var.f23541c).f23363a.getFD().sync();
                }
                outputStream.close();
                jfVar.f(uriBuild, uri);
                return null;
            } catch (Throwable th2) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (Exception e10) {
            try {
                jfVar.e(uriBuild);
            } catch (FileNotFoundException unused) {
            }
            if (e10 instanceof IOException) {
                throw ((IOException) e10);
            }
            throw new IOException(e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.k
    public void accept(Object obj, Object obj2) {
        int i10 = bb.l;
        za zaVar = new za((TaskCompletionSource) obj2);
        cb cbVar = (cb) ((db) obj).getService();
        String[] strArr = (String[]) this.f23541c;
        String str = (String) this.f23540b;
        Parcel parcelU1 = cbVar.u1();
        m6.c(parcelU1, zaVar);
        parcelU1.writeString(str);
        parcelU1.writeInt(0);
        parcelU1.writeStringArray(strArr);
        parcelU1.writeByteArray(null);
        cbVar.w1(parcelU1, 1);
    }

    public jd b(int i10, String str, boolean z10) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.f23540b;
        jd jdVar = (jd) atomicReferenceArray.get(i10);
        if (jdVar != null) {
            return jdVar;
        }
        fd fdVarC = ((q6) this.f23541c).c(str, z10);
        while (!atomicReferenceArray.compareAndSet(i10, null, fdVarC)) {
            if (atomicReferenceArray.get(i10) != null) {
                jd jdVar2 = (jd) atomicReferenceArray.get(i10);
                jdVar2.getClass();
                return jdVar2;
            }
        }
        return fdVarC;
    }

    public void c(g6 g6Var) {
        Iterator it = g6Var.f23504a.iterator();
        while (it.hasNext()) {
            ((HashMap) this.f23540b).put(Integer.valueOf(((k6) it.next()).f23673a).toString(), g6Var);
        }
    }

    @Override // ta.y
    public ListenableFuture call() {
        switch (this.f23539a) {
            case 7:
                mf mfVar = (mf) this.f23541c;
                String strValueOf = String.valueOf(mfVar.f23742a);
                f1 f1Var = mfVar.f23749h;
                String strConcat = "Initialize ".concat(strValueOf);
                f1Var.getClass();
                kg kgVarD = f1.d(strConcat);
                try {
                    synchronized (mfVar.f23748g) {
                        try {
                            if (((List) this.f23540b) == null) {
                                this.f23540b = mfVar.f23750i;
                                mfVar.f23750i = Collections.EMPTY_LIST;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                    ArrayList arrayList = new ArrayList(((List) this.f23540b).size());
                    sf sfVar = new sf((mf) this.f23541c);
                    Iterator it = ((List) this.f23540b).iterator();
                    while (it.hasNext()) {
                        try {
                            arrayList.add(((ta.z) it.next()).apply(sfVar));
                        } catch (Exception e10) {
                            arrayList.add(ta.k0.c(e10));
                        }
                    }
                    oa.j0 j0VarW = oa.j0.w(arrayList);
                    a aVar = new a(this, 2);
                    ta.b0 b0Var = new ta.b0(j0VarW, true);
                    b0Var.f50588n = new ta.a0(b0Var, aVar);
                    b0Var.s();
                    kgVarD.a(b0Var);
                    kgVarD.close();
                    return b0Var;
                } catch (Throwable th3) {
                    try {
                        kgVarD.close();
                        break;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            default:
                sg sgVar = (sg) this.f23540b;
                rg rgVarC = dg.c();
                sg sgVarB = dg.b(rgVarC, sgVar);
                try {
                    ListenableFuture listenableFutureCall = ((ta.y) this.f23541c).call();
                    dg.b(rgVarC, sgVarB);
                    kotlin.jvm.internal.n.e(listenableFutureCall, "wrapInTrace(...)");
                    return listenableFutureCall;
                } catch (Throwable th5) {
                    try {
                        cg.a(th5);
                        throw th5;
                    } catch (Throwable th6) {
                        dg.b(rgVarC, sgVarB);
                        throw th6;
                    }
                }
        }
    }

    public void d(ArrayList arrayList) {
        OutputStream outputStream = (OutputStream) oa.q.k(arrayList);
        if (outputStream instanceof cf) {
            this.f23541c = (cf) outputStream;
            this.f23540b = (OutputStream) arrayList.get(0);
        }
    }

    public b6 e(d8 d8Var, b6 b6Var) {
        yg.o(d8Var);
        if (!(b6Var instanceof c6)) {
            return b6Var;
        }
        c6 c6Var = (c6) b6Var;
        ArrayList arrayList = c6Var.f23351b;
        String str = c6Var.f23350a;
        HashMap map = (HashMap) this.f23540b;
        return (map.containsKey(str) ? (g6) map.get(str) : (g6) this.f23541c).a(str, d8Var, arrayList);
    }

    public jd f(int i10, long j10, String str) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.f23540b;
        jd jdVar = (jd) atomicReferenceArray.get(i10);
        if (jdVar != null) {
            return jdVar;
        }
        hd hdVar = new hd(str, (i9.i) ((q6) this.f23541c).f23891b, j10);
        while (!atomicReferenceArray.compareAndSet(i10, null, hdVar)) {
            if (atomicReferenceArray.get(i10) != null) {
                jd jdVar2 = (jd) atomicReferenceArray.get(i10);
                jdVar2.getClass();
                return jdVar2;
            }
        }
        return hdVar;
    }

    public void g(d8 d8Var, v9.e eVar) {
        ib ibVar = new ib(eVar);
        TreeMap treeMap = (TreeMap) this.f23540b;
        for (Integer num : treeMap.keySet()) {
            b bVarA = ((b) eVar.f52504c).clone();
            b6 b6VarA = ((a6) treeMap.get(num)).a(d8Var, Collections.singletonList(ibVar));
            int iK = b6VarA instanceof o3 ? yg.k(((o3) b6VarA).f23794a.doubleValue()) : -1;
            if (iK == 2 || iK == -1) {
                eVar.f52504c = bVarA;
            }
        }
        TreeMap treeMap2 = (TreeMap) this.f23541c;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            b6 b6VarA2 = ((a6) treeMap2.get((Integer) it.next())).a(d8Var, Collections.singletonList(ibVar));
            if (b6VarA2 instanceof o3) {
                yg.k(((o3) b6VarA2).f23794a.doubleValue());
            }
        }
    }

    public jd h(int i10, String str, String str2) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.f23540b;
        jd jdVar = (jd) atomicReferenceArray.get(i10);
        if (jdVar != null) {
            return jdVar;
        }
        id idVar = new id(str, (i9.i) ((q6) this.f23541c).f23891b, str2);
        while (!atomicReferenceArray.compareAndSet(i10, null, idVar)) {
            if (atomicReferenceArray.get(i10) != null) {
                jd jdVar2 = (jd) atomicReferenceArray.get(i10);
                jdVar2.getClass();
                return jdVar2;
            }
        }
        return idVar;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean z10 = task.getException() instanceof j9.p;
        bc bcVar = (bc) this.f23541c;
        bb bbVar = (bb) this.f23540b;
        if (z10) {
            return bbVar.d(bcVar.u());
        }
        if (task.getException() instanceof j9.e) {
            j9.e eVar = (j9.e) task.getException();
            eVar.getClass();
            if (eVar.f43728a.f11654a == 29514) {
                return bbVar.d(bcVar.u());
            }
        }
        return task;
    }

    public String toString() {
        switch (this.f23539a) {
            case 8:
                ta.y yVar = (ta.y) this.f23541c;
                StringBuilder sb2 = new StringBuilder(yVar.toString().length() + 14);
                sb2.append("propagating=[");
                sb2.append(yVar);
                sb2.append(X3.j.f27836e);
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public h6(l0 l0Var) {
        this.f23539a = 6;
        this.f23540b = l0Var;
    }

    public h6(int i10) {
        this.f23539a = i10;
        switch (i10) {
            case 5:
                break;
            case 9:
                this.f23540b = new TreeMap();
                this.f23541c = new TreeMap();
                break;
            default:
                this.f23540b = new HashMap();
                this.f23541c = new g6(6);
                g6 g6Var = new g6(0);
                k6 k6Var = k6.BITWISE_AND;
                ArrayList arrayList = g6Var.f23504a;
                arrayList.add(k6Var);
                arrayList.add(k6.BITWISE_LEFT_SHIFT);
                arrayList.add(k6.BITWISE_NOT);
                arrayList.add(k6.BITWISE_OR);
                arrayList.add(k6.BITWISE_RIGHT_SHIFT);
                arrayList.add(k6.BITWISE_UNSIGNED_RIGHT_SHIFT);
                arrayList.add(k6.BITWISE_XOR);
                c(g6Var);
                g6 g6Var2 = new g6(1);
                k6 k6Var2 = k6.EQUALS;
                ArrayList arrayList2 = g6Var2.f23504a;
                arrayList2.add(k6Var2);
                arrayList2.add(k6.GREATER_THAN);
                arrayList2.add(k6.GREATER_THAN_EQUALS);
                arrayList2.add(k6.IDENTITY_EQUALS);
                arrayList2.add(k6.IDENTITY_NOT_EQUALS);
                arrayList2.add(k6.LESS_THAN);
                arrayList2.add(k6.LESS_THAN_EQUALS);
                arrayList2.add(k6.NOT_EQUALS);
                c(g6Var2);
                g6 g6Var3 = new g6(2);
                k6 k6Var3 = k6.APPLY;
                ArrayList arrayList3 = g6Var3.f23504a;
                arrayList3.add(k6Var3);
                arrayList3.add(k6.BLOCK);
                arrayList3.add(k6.BREAK);
                arrayList3.add(k6.CASE);
                arrayList3.add(k6.DEFAULT);
                arrayList3.add(k6.CONTINUE);
                arrayList3.add(k6.DEFINE_FUNCTION);
                arrayList3.add(k6.FN);
                arrayList3.add(k6.IF);
                arrayList3.add(k6.QUOTE);
                arrayList3.add(k6.RETURN);
                arrayList3.add(k6.SWITCH);
                arrayList3.add(k6.TERNARY);
                c(g6Var3);
                g6 g6Var4 = new g6(3);
                k6 k6Var4 = k6.AND;
                ArrayList arrayList4 = g6Var4.f23504a;
                arrayList4.add(k6Var4);
                arrayList4.add(k6.NOT);
                arrayList4.add(k6.OR);
                c(g6Var4);
                g6 g6Var5 = new g6(4);
                k6 k6Var5 = k6.FOR_IN;
                ArrayList arrayList5 = g6Var5.f23504a;
                arrayList5.add(k6Var5);
                arrayList5.add(k6.FOR_IN_CONST);
                arrayList5.add(k6.FOR_IN_LET);
                arrayList5.add(k6.FOR_LET);
                arrayList5.add(k6.FOR_OF);
                arrayList5.add(k6.FOR_OF_CONST);
                arrayList5.add(k6.FOR_OF_LET);
                arrayList5.add(k6.WHILE);
                c(g6Var5);
                g6 g6Var6 = new g6(5);
                k6 k6Var6 = k6.ADD;
                ArrayList arrayList6 = g6Var6.f23504a;
                arrayList6.add(k6Var6);
                arrayList6.add(k6.DIVIDE);
                arrayList6.add(k6.MODULUS);
                arrayList6.add(k6.MULTIPLY);
                arrayList6.add(k6.NEGATE);
                arrayList6.add(k6.POST_DECREMENT);
                arrayList6.add(k6.POST_INCREMENT);
                arrayList6.add(k6.PRE_DECREMENT);
                arrayList6.add(k6.PRE_INCREMENT);
                arrayList6.add(k6.SUBTRACT);
                c(g6Var6);
                g6 g6Var7 = new g6(7);
                k6 k6Var7 = k6.ASSIGN;
                ArrayList arrayList7 = g6Var7.f23504a;
                arrayList7.add(k6Var7);
                arrayList7.add(k6.CONST);
                arrayList7.add(k6.CREATE_ARRAY);
                arrayList7.add(k6.CREATE_OBJECT);
                arrayList7.add(k6.EXPRESSION_LIST);
                arrayList7.add(k6.GET);
                arrayList7.add(k6.GET_INDEX);
                arrayList7.add(k6.GET_PROPERTY);
                arrayList7.add(k6.NULL);
                arrayList7.add(k6.SET_PROPERTY);
                arrayList7.add(k6.TYPEOF);
                arrayList7.add(k6.UNDEFINED);
                arrayList7.add(k6.VAR);
                c(g6Var7);
                break;
        }
    }

    public h6(q6 q6Var, int i10) {
        this.f23539a = 3;
        this.f23541c = q6Var;
        this.f23540b = new AtomicReferenceArray(i10);
    }

    public h6(ee eeVar, he heVar) {
        this.f23539a = 4;
        Objects.requireNonNull(eeVar);
        this.f23541c = eeVar;
        this.f23540b = heVar;
    }

    public /* synthetic */ h6(mf mfVar) {
        this.f23539a = 7;
        this.f23541c = mfVar;
    }
}
