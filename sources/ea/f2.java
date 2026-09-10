package ea;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import androidx.work.impl.WorkDatabase_Impl;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.g10;
import com.google.android.gms.internal.ads.mk0;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.storage.androidcleaner.R;
import com.unity3d.services.UnityAdsConstants;
import dev.fluttercommunity.plus.share.SharePlusPendingIntent;
import java.io.File;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class f2 implements j2.p, m0.v, xi.h, Continuation, xi.n, hb.c, il.b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f39409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f39410c;

    public /* synthetic */ f2(int i10, Object obj, Object obj2) {
        this.f39408a = i10;
        this.f39409b = obj2;
        this.f39410c = obj;
    }

    public static void a(f2 f2Var, boolean z10, boolean z11) {
        synchronized (f2Var) {
            boolean z12 = false;
            if (z10) {
                if (((PowerManager.WakeLock) f2Var.f39410c) == null) {
                    if (((Context) f2Var.f39409b).checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                        l1.a.s("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                        return;
                    }
                    PowerManager powerManager = (PowerManager) ((Context) f2Var.f39409b).getSystemService("power");
                    if (powerManager == null) {
                        l1.a.s("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                        return;
                    } else {
                        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                        f2Var.f39410c = wakeLockNewWakeLock;
                        wakeLockNewWakeLock.setReferenceCounted(false);
                    }
                }
            }
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) f2Var.f39410c;
            if (wakeLock == null) {
                return;
            }
            if (z10 && z11) {
                z12 = true;
            }
            if (z12) {
                wakeLock.acquire();
            } else {
                wakeLock.release();
            }
        }
    }

    public static void c(String str) {
        if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e10) {
            Log.w("SupportSQLite", "delete failed: ", e10);
        }
    }

    public void A(String str) {
        i6.b bVar;
        synchronized (this) {
            try {
                Object obj = ((HashMap) this.f39409b).get(str);
                a7.h.c(obj, "Argument must not be null");
                bVar = (i6.b) obj;
                int i10 = bVar.f42894b;
                if (i10 < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + bVar.f42894b);
                }
                int i11 = i10 - 1;
                bVar.f42894b = i11;
                if (i11 == 0) {
                    i6.b bVar2 = (i6.b) ((HashMap) this.f39409b).remove(str);
                    if (!bVar2.equals(bVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + bVar + ", but actually removed: " + bVar2 + ", safeKey: " + str);
                    }
                    i6.c cVar = (i6.c) this.f39410c;
                    synchronized (cVar.f42895a) {
                        try {
                            if (cVar.f42895a.size() < 10) {
                                cVar.f42895a.offer(bVar2);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        bVar.f42893a.unlock();
    }

    public Object B() {
        h6.c cVar = (h6.c) this.f39409b;
        h6.c cVar2 = cVar.f42220d;
        while (true) {
            boolean zEquals = cVar2.equals(cVar);
            Object obj = cVar2.f42217a;
            if (zEquals) {
                return null;
            }
            ArrayList arrayList = cVar2.f42218b;
            int size = arrayList != null ? arrayList.size() : 0;
            Object objRemove = size > 0 ? cVar2.f42218b.remove(size - 1) : null;
            if (objRemove != null) {
                return objRemove;
            }
            h6.c cVar3 = cVar2.f42220d;
            cVar3.f42219c = cVar2.f42219c;
            cVar2.f42219c.f42220d = cVar3;
            ((HashMap) this.f39410c).remove(obj);
            ((h6.g) obj).a();
            cVar2 = cVar2.f42220d;
        }
    }

    public Task C() {
        ka.f fVar = (ka.f) this.f39409b;
        String str = fVar.f44545b;
        la.e eVar = ka.f.f44543c;
        eVar.a("requestInAppReview (%s)", str);
        la.k kVar = fVar.f44544a;
        if (kVar != null) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            kVar.a().post(new la.h(kVar, taskCompletionSource, taskCompletionSource, new ka.d(fVar, taskCompletionSource, taskCompletionSource)));
            return taskCompletionSource.getTask();
        }
        Object[] objArr = new Object[0];
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", la.e.c(eVar.f45249a, "Play Store app is either not installed or not the official version", objArr));
        }
        Locale locale = Locale.getDefault();
        HashMap map = ma.a.f45914a;
        return Tasks.forException(new j9.n(new Status(-1, String.format(locale, "Review Error(%d): %s", -1, !map.containsKey(-1) ? "" : q4.a.i((String) map.get(-1), " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#", (String) ma.a.f45915b.get(-1), ")")), null, null)));
    }

    public dm.g D(pm.y yVar, tl.d value, vl.f nameResolver) {
        kotlin.jvm.internal.n.f(value, "value");
        kotlin.jvm.internal.n.f(nameResolver, "nameResolver");
        boolean zBooleanValue = vl.e.M.c(value.f51176m).booleanValue();
        tl.c cVar = value.f51167c;
        switch (cVar == null ? -1 : lm.b.f45518a[cVar.ordinal()]) {
            case 1:
                byte b10 = (byte) value.f51168d;
                return zBooleanValue ? new dm.y(b10) : new dm.d(b10);
            case 2:
                return new dm.e(Character.valueOf((char) value.f51168d));
            case 3:
                short s10 = (short) value.f51168d;
                return zBooleanValue ? new dm.y(s10) : new dm.v(s10);
            case 4:
                int i10 = (int) value.f51168d;
                return zBooleanValue ? new dm.y(i10) : new dm.k(i10);
            case 5:
                long j10 = value.f51168d;
                return zBooleanValue ? new dm.y(j10) : new dm.t(j10);
            case 6:
                return new dm.c(value.f51169e);
            case 7:
                return new dm.c(value.f51170f);
            case 8:
                return new dm.c(Boolean.valueOf(value.f51168d != 0));
            case 9:
                return new dm.w(nameResolver.getString(value.f51171g));
            case 10:
                return new dm.s(com.bumptech.glide.c.r(nameResolver, value.f51172h), value.l);
            case 11:
                return new dm.i(com.bumptech.glide.c.r(nameResolver, value.f51172h), com.bumptech.glide.c.s(nameResolver, value.f51173i));
            case 12:
                tl.g gVar = value.f51174j;
                kotlin.jvm.internal.n.e(gVar, "value.annotation");
                return new dm.a((Object) d(gVar, nameResolver));
            case 13:
                List list = value.f51175k;
                kotlin.jvm.internal.n.e(list, "value.arrayElementList");
                List<tl.d> list2 = list;
                ArrayList arrayList = new ArrayList(xj.p.W(list2, 10));
                for (tl.d it : list2) {
                    pm.c0 c0VarE = ((zk.w) this.f39409b).d().e();
                    kotlin.jvm.internal.n.e(it, "it");
                    arrayList.add(D(c0VarE, it, nameResolver));
                }
                return new dm.x(arrayList, yVar);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + value.f51167c + " (expected " + yVar + ')').toString());
        }
    }

    public void E(int i10) throws InvalidAlgorithmParameterException {
        if (i10 != 32 && i10 != 48 && i10 != 64) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 32-byte, 48-byte and 64-byte AES-SIV keys are supported", Integer.valueOf(i10)));
        }
        this.f39409b = Integer.valueOf(i10);
    }

    public String[] F() {
        List listC0 = xj.k.C0(new Integer[]{Integer.valueOf(o().f40694a), Integer.valueOf(o().f40695b), Integer.valueOf(o().f40696c), Integer.valueOf(o().f40697d)});
        ArrayList arrayList = new ArrayList(xj.p.W(listC0, 10));
        Iterator it = listC0.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public Enum G(Object obj) throws GeneralSecurityException {
        Enum r2 = (Enum) ((Map) this.f39410c).get(obj);
        if (r2 != null) {
            return r2;
        }
        throw new GeneralSecurityException("Unable to convert object enum: " + obj);
    }

    public void H(l4.b bVar) {
        bVar.p("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        bVar.p("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
    }

    public bb.e b() throws GeneralSecurityException {
        Integer num = (Integer) this.f39409b;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (((bb.d) this.f39410c) != null) {
            return new bb.e(num.intValue(), (bb.d) this.f39410c);
        }
        throw new GeneralSecurityException("Variant is not set");
    }

    /* JADX WARN: Code duplicated, block: B:32:0x010b  */
    public al.d d(tl.g proto, vl.f nameResolver) {
        Map mapW;
        kotlin.jvm.internal.n.f(proto, "proto");
        kotlin.jvm.internal.n.f(nameResolver, "nameResolver");
        zk.e eVarF = zk.u.f((zk.w) this.f39409b, com.bumptech.glide.c.r(nameResolver, proto.f51232c), (zc.u) this.f39410c);
        if (proto.f51233d.size() == 0 || rm.i.f(eVarF) || !bm.e.n(eVarF, 5)) {
            mapW = xj.w.f53867a;
        } else {
            Collection collectionP = eVarF.p();
            kotlin.jvm.internal.n.e(collectionP, "annotationClass.constructors");
            cl.l lVar = (cl.l) xj.n.G0(collectionP);
            if (lVar != null) {
                List listB = lVar.B();
                kotlin.jvm.internal.n.e(listB, "constructor.valueParameters");
                List list = listB;
                int iO = xj.b0.O(xj.p.W(list, 10));
                if (iO < 16) {
                    iO = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iO);
                for (Object obj : list) {
                    linkedHashMap.put(((cl.x0) obj).getName(), obj);
                }
                List<tl.e> list2 = proto.f51233d;
                kotlin.jvm.internal.n.e(list2, "proto.argumentList");
                ArrayList arrayList = new ArrayList();
                for (tl.e it : list2) {
                    kotlin.jvm.internal.n.e(it, "it");
                    cl.x0 x0Var = (cl.x0) linkedHashMap.get(com.bumptech.glide.c.s(nameResolver, it.f51194c));
                    Object fVar = null;
                    if (x0Var != null) {
                        yl.f fVarS = com.bumptech.glide.c.s(nameResolver, it.f51194c);
                        pm.y type = x0Var.getType();
                        kotlin.jvm.internal.n.e(type, "parameter.type");
                        tl.d dVar = it.f51195d;
                        kotlin.jvm.internal.n.e(dVar, "proto.value");
                        dm.g gVarD = D(type, dVar, nameResolver);
                        fVar = e(gVarD, type, dVar) ? gVarD : null;
                        if (fVar == null) {
                            String message = "Unexpected argument value: actual type " + dVar.f51167c + " != expected type " + type;
                            kotlin.jvm.internal.n.f(message, "message");
                            fVar = new dm.j(message);
                        }
                        fVar = new wj.f(fVarS, fVar);
                    }
                    if (fVar != null) {
                        arrayList.add(fVar);
                    }
                }
                mapW = xj.b0.W(arrayList);
            } else {
                mapW = xj.w.f53867a;
            }
        }
        return new al.d(eVarF.g(), mapW, zk.j0.C9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean e(dm.g gVar, pm.y yVar, tl.d dVar) {
        zk.w wVar = (zk.w) this.f39409b;
        tl.c cVar = dVar.f51167c;
        int i10 = cVar == null ? -1 : lm.b.f45518a[cVar.ordinal()];
        if (i10 == 10) {
            zk.g gVarE = yVar.P().e();
            zk.e eVar = gVarE instanceof zk.e ? (zk.e) gVarE : null;
            if (eVar == null) {
                return true;
            }
            yl.f fVar = wk.h.f53310e;
            return wk.h.b(eVar, wk.l.P);
        }
        if (i10 != 13) {
            return kotlin.jvm.internal.n.a(gVar.a(wVar), yVar);
        }
        if (gVar instanceof dm.b) {
            Object obj = ((dm.b) gVar).f38953a;
            if (((List) obj).size() == dVar.f51175k.size()) {
                pm.y yVarF = wVar.d().f(yVar);
                pk.c cVarO = xj.o.O((Collection) obj);
                if ((cVarO instanceof Collection) && ((Collection) cVarO).isEmpty()) {
                    return true;
                }
                pk.b bVarB = cVarO.iterator();
                while (bVarB.f48398c) {
                    int iNextInt = bVarB.nextInt();
                    dm.g gVar2 = (dm.g) ((List) obj).get(iNextInt);
                    tl.d dVar2 = (tl.d) dVar.f51175k.get(iNextInt);
                    kotlin.jvm.internal.n.e(dVar2, "value.getArrayElement(i)");
                    if (!e(gVar2, yVarF, dVar2)) {
                        return false;
                    }
                }
                return true;
            }
        }
        throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + gVar).toString());
    }

    @Override // m0.v
    public m0.r1 f(View view, m0.r1 r1Var) {
        androidx.viewpager.widget.k kVar = (androidx.viewpager.widget.k) this.f39410c;
        m0.r1 r1VarD = m0.s0.d(view, r1Var);
        if (r1VarD.f45740a.n()) {
            return r1VarD;
        }
        Rect rect = (Rect) this.f39409b;
        rect.left = r1VarD.b();
        rect.top = r1VarD.d();
        rect.right = r1VarD.c();
        rect.bottom = r1VarD.a();
        int childCount = kVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            m0.r1 r1VarB = m0.s0.b(kVar.getChildAt(i10), r1VarD);
            rect.left = Math.min(r1VarB.b(), rect.left);
            rect.top = Math.min(r1VarB.d(), rect.top);
            rect.right = Math.min(r1VarB.c(), rect.right);
            rect.bottom = Math.min(r1VarB.a(), rect.bottom);
        }
        return r1VarD.e(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // xi.h
    public void g(xi.g gVar) {
        ArrayList arrayList = (ArrayList) this.f39409b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            gVar.b((Map) it.next());
        }
        arrayList.clear();
        this.f39410c = gVar;
    }

    public String[] h() {
        g10 g10Var = (g10) this.f39410c;
        if (g10Var == null) {
            kotlin.jvm.internal.n.l("durationConstraint");
            throw null;
        }
        Long lValueOf = Long.valueOf(g10Var.f14653a);
        g10 g10Var2 = (g10) this.f39410c;
        if (g10Var2 == null) {
            kotlin.jvm.internal.n.l("durationConstraint");
            throw null;
        }
        Long[] lArr = {lValueOf, Long.valueOf(g10Var2.f14654b)};
        ArrayList arrayList = new ArrayList(2);
        for (int i10 = 0; i10 < 2; i10++) {
            arrayList.add(String.valueOf(lArr[i10].longValue()));
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public void i(int i10, int[] iArr) {
        le.b bVar;
        le.b bVar2;
        le.b bVar3;
        le.a aVar = (le.a) this.f39409b;
        if (i10 == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        }
        int length = iArr.length - i10;
        if (length <= 0) {
            throw new IllegalArgumentException("No data bytes provided");
        }
        ArrayList arrayList = (ArrayList) this.f39410c;
        int i11 = 1;
        int i12 = 0;
        if (i10 >= arrayList.size()) {
            le.b bVar4 = (le.b) l1.d.d(arrayList, 1);
            int size = arrayList.size();
            while (size <= i10) {
                int[] iArr2 = {i11, aVar.f45323a[(size - 1) + aVar.f45328f]};
                if (iArr2[i12] == 0) {
                    int i13 = i11;
                    while (i13 < 2 && iArr2[i13] == 0) {
                        i13++;
                    }
                    if (i13 == 2) {
                        iArr2 = new int[]{i12};
                    } else {
                        int i14 = 2 - i13;
                        int[] iArr3 = new int[i14];
                        System.arraycopy(iArr2, i13, iArr3, i12, i14);
                        iArr2 = iArr3;
                    }
                }
                le.a aVar2 = bVar4.f45329a;
                if (!aVar2.equals(aVar)) {
                    throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                }
                int[] iArr4 = bVar4.f45330b;
                if (iArr4[i12] == 0 || iArr2[i12] == 0) {
                    bVar4 = aVar2.f45325c;
                } else {
                    int length2 = iArr4.length;
                    int length3 = iArr2.length;
                    int[] iArr5 = new int[(length2 + length3) - i11];
                    int i15 = i12;
                    while (i15 < length2) {
                        int i16 = iArr4[i15];
                        while (i12 < length3) {
                            int i17 = i15 + i12;
                            iArr5[i17] = iArr5[i17] ^ aVar2.a(i16, iArr2[i12]);
                            i12++;
                            iArr4 = iArr4;
                        }
                        i15++;
                        i12 = 0;
                    }
                    bVar4 = new le.b(aVar2, iArr5);
                }
                arrayList.add(bVar4);
                size++;
                i11 = 1;
                i12 = 0;
            }
        }
        le.b bVar5 = (le.b) arrayList.get(i10);
        int[] iArr6 = new int[length];
        System.arraycopy(iArr, 0, iArr6, 0, length);
        if (length == 0) {
            throw new IllegalArgumentException();
        }
        if (length > 1 && iArr6[0] == 0) {
            int i18 = 1;
            while (i18 < length && iArr6[i18] == 0) {
                i18++;
            }
            if (i18 == length) {
                iArr6 = new int[]{0};
            } else {
                int i19 = length - i18;
                int[] iArr7 = new int[i19];
                System.arraycopy(iArr6, i18, iArr7, 0, i19);
                iArr6 = iArr7;
            }
        }
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        int length4 = iArr6.length;
        int[] iArr8 = new int[length4 + i10];
        for (int i20 = 0; i20 < length4; i20++) {
            iArr8[i20] = aVar.a(iArr6[i20], 1);
        }
        le.b bVar6 = new le.b(aVar, iArr8);
        le.a aVar3 = bVar5.f45329a;
        int[] iArr9 = bVar5.f45330b;
        boolean zEquals = aVar.equals(aVar3);
        le.b bVar7 = aVar.f45325c;
        if (!zEquals) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (iArr9[0] == 0) {
            throw new IllegalArgumentException("Divide by 0");
        }
        int i21 = iArr9[(iArr9.length - 1) - bVar5.b()];
        if (i21 == 0) {
            throw new ArithmeticException();
        }
        int i22 = aVar.f45323a[(aVar.f45326d - aVar.f45324b[i21]) - 1];
        le.b bVarA = bVar7;
        while (true) {
            int[] iArr10 = bVar6.f45330b;
            if (bVar6.b() < bVar5.b() || iArr10[0] == 0) {
                break;
            }
            int iB = bVar6.b() - bVar5.b();
            int iA = aVar.a(iArr10[(iArr10.length - 1) - bVar6.b()], i22);
            le.a aVar4 = bVar5.f45329a;
            if (iB < 0) {
                throw new IllegalArgumentException();
            }
            if (iA == 0) {
                bVar2 = aVar4.f45325c;
                bVar = bVar5;
            } else {
                int length5 = iArr9.length;
                int[] iArr11 = new int[length5 + iB];
                int i23 = 0;
                while (i23 < length5) {
                    iArr11[i23] = aVar4.a(iArr9[i23], iA);
                    i23++;
                    bVar5 = bVar5;
                }
                bVar = bVar5;
                bVar2 = new le.b(aVar4, iArr11);
            }
            if (iB < 0) {
                throw new IllegalArgumentException();
            }
            if (iA == 0) {
                bVar3 = bVar7;
            } else {
                int[] iArr12 = new int[iB + 1];
                iArr12[0] = iA;
                bVar3 = new le.b(aVar, iArr12);
            }
            bVarA = bVarA.a(bVar3);
            bVar6 = bVar6.a(bVar2);
            bVar5 = bVar;
        }
        int[] iArr13 = new le.b[]{bVarA, bVar6}[1].f45330b;
        int length6 = i10 - iArr13.length;
        for (int i24 = 0; i24 < length6; i24++) {
            iArr[length + i24] = 0;
        }
        System.arraycopy(iArr13, 0, iArr, length + length6, iArr13.length);
    }

    @Override // j2.p
    public Object j(Uri uri, n1.j jVar) {
        a2.a aVar = (a2.a) ((j2.p) this.f39409b).j(uri, jVar);
        List list = (List) this.f39410c;
        return (list == null || list.isEmpty()) ? aVar : (a2.a) aVar.copy(list);
    }

    public void k(int i10) {
        int[] iArr = (int[]) this.f39409b;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i10, 10) + 1];
            this.f39409b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i10 >= iArr.length) {
            int length = iArr.length;
            while (length <= i10) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f39409b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f39409b;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public Object l(Enum r3) throws GeneralSecurityException {
        Object obj = ((Map) this.f39409b).get(r3);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: " + r3);
    }

    public Object m(h6.g gVar) {
        HashMap map = (HashMap) this.f39410c;
        h6.c cVar = (h6.c) map.get(gVar);
        if (cVar == null) {
            cVar = new h6.c(gVar);
            map.put(gVar, cVar);
        } else {
            gVar.a();
        }
        h6.c cVar2 = cVar.f42220d;
        cVar2.f42219c = cVar.f42219c;
        cVar.f42219c.f42220d = cVar2;
        h6.c cVar3 = (h6.c) this.f39409b;
        cVar.f42220d = cVar3;
        h6.c cVar4 = cVar3.f42219c;
        cVar.f42219c = cVar4;
        cVar4.f42220d = cVar;
        cVar.f42220d.f42219c = cVar;
        ArrayList arrayList = cVar.f42218b;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return cVar.f42218b.remove(size - 1);
        }
        return null;
    }

    public Long n(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f39409b;
        g4.h hVarB = g4.h.b(1, "SELECT long_value FROM Preference where `key`=?");
        hVarB.j(1, str);
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(hVarB);
        try {
            Long lValueOf = null;
            if (cursorG.moveToFirst() && !cursorG.isNull(0)) {
                lValueOf = Long.valueOf(cursorG.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorG.close();
            hVarB.k();
        }
    }

    public f8.d o() {
        f8.d dVar = (f8.d) this.f39409b;
        if (dVar != null) {
            return dVar;
        }
        kotlin.jvm.internal.n.l("sizeConstraint");
        throw null;
    }

    @Override // xi.h
    public void onCancel() {
        this.f39410c = null;
    }

    @Override // xi.n
    public void onMethodCall(xi.m call, xi.o oVar) {
        wi.j jVar;
        kotlin.jvm.internal.n.f(call, "call");
        Object obj = call.f53823b;
        if (!(obj instanceof Map)) {
            throw new IllegalArgumentException("Map arguments expected");
        }
        hi.b bVar = (hi.b) this.f39410c;
        bVar.getClass();
        AtomicBoolean atomicBoolean = bVar.f42358b;
        if (!atomicBoolean.compareAndSet(true, false) && (jVar = bVar.f42357a) != null) {
            jVar.a("dev.fluttercommunity.plus/share/unavailable");
        }
        SharePlusPendingIntent.f38840a = "";
        atomicBoolean.set(false);
        bVar.f42357a = (wi.j) oVar;
        if (!kotlin.jvm.internal.n.a(call.f53822a, AppLovinEventTypes.USER_SHARED_LINK)) {
            ((wi.j) oVar).c();
        } else {
            fc.f fVar = (fc.f) this.f39409b;
            cn.d0.w((hn.d) fVar.f40783e, null, new b4.b(fVar, new dn.d(1, this, (wi.j) oVar), (Map) obj, null, 6), 3);
        }
    }

    public String p(String str) {
        String str2 = (String) this.f39410c;
        Resources resources = (Resources) this.f39409b;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    @Override // hb.c
    public byte[] q(int i10, byte[] bArr) throws NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (i10 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength must not be larger than 16");
        }
        Mac mac = Mac.getInstance("AESCMAC", (Provider) this.f39410c);
        mac.init((SecretKeySpec) this.f39409b);
        byte[] bArrDoFinal = mac.doFinal(bArr);
        return i10 == bArrDoFinal.length ? bArrDoFinal : Arrays.copyOf(bArrDoFinal, i10);
    }

    public void r(m5.c cVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f39409b;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((m5.b) this.f39410c).e(cVar);
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
        }
    }

    public void s(int i10, int i11) {
        int[] iArr = (int[]) this.f39409b;
        if (iArr == null || i10 >= iArr.length) {
            return;
        }
        int i12 = i10 + i11;
        k(i12);
        int[] iArr2 = (int[]) this.f39409b;
        System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
        Arrays.fill((int[]) this.f39409b, i10, i12, -1);
        ArrayList arrayList = (ArrayList) this.f39410c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            androidx.recyclerview.widget.m1 m1Var = (androidx.recyclerview.widget.m1) ((ArrayList) this.f39410c).get(size);
            int i13 = m1Var.f4825a;
            if (i13 >= i10) {
                m1Var.f4825a = i13 + i11;
            }
        }
    }

    public void t(int i10, int i11) {
        int[] iArr = (int[]) this.f39409b;
        if (iArr == null || i10 >= iArr.length) {
            return;
        }
        int i12 = i10 + i11;
        k(i12);
        int[] iArr2 = (int[]) this.f39409b;
        System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
        int[] iArr3 = (int[]) this.f39409b;
        Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f39410c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            androidx.recyclerview.widget.m1 m1Var = (androidx.recyclerview.widget.m1) ((ArrayList) this.f39410c).get(size);
            int i13 = m1Var.f4825a;
            if (i13 >= i10) {
                if (i13 < i12) {
                    ((ArrayList) this.f39410c).remove(size);
                } else {
                    m1Var.f4825a = i13 - i11;
                }
            }
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        Bundle bundle;
        h9.c cVar = (h9.c) this.f39409b;
        Bundle bundle2 = (Bundle) this.f39410c;
        cVar.getClass();
        return (task.isSuccessful() && (bundle = (Bundle) task.getResult()) != null && bundle.containsKey("google.messenger")) ? cVar.b(bundle2).onSuccessTask(a7.g.f3425b, b0.l) : task;
    }

    public String toString() {
        switch (this.f39408a) {
            case 16:
                StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
                h6.c cVar = (h6.c) this.f39409b;
                h6.c cVar2 = cVar.f42219c;
                boolean z10 = false;
                while (!cVar2.equals(cVar)) {
                    sb2.append('{');
                    sb2.append(cVar2.f42217a);
                    sb2.append(':');
                    ArrayList arrayList = cVar2.f42218b;
                    sb2.append(arrayList != null ? arrayList.size() : 0);
                    sb2.append("}, ");
                    cVar2 = cVar2.f42219c;
                    z10 = true;
                }
                if (z10) {
                    sb2.delete(sb2.length() - 2, sb2.length());
                }
                sb2.append(" )");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public void u(n.a aVar) {
        zc.u uVar = (zc.u) this.f39409b;
        ((ActionMode.Callback) uVar.f54879b).onDestroyActionMode(uVar.q(aVar));
        k.v vVar = (k.v) this.f39410c;
        if (vVar.f44183w != null) {
            vVar.l.getDecorView().removeCallbacks(vVar.f44184x);
        }
        if (vVar.f44182v != null) {
            m0.w0 w0Var = vVar.f44185y;
            if (w0Var != null) {
                w0Var.b();
            }
            m0.w0 w0VarA = m0.s0.a(vVar.f44182v);
            w0VarA.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            vVar.f44185y = w0VarA;
            w0VarA.d(new k.n(this, 2));
        }
        vVar.f44181u = null;
        ViewGroup viewGroup = vVar.A;
        WeakHashMap weakHashMap = m0.s0.f45746a;
        viewGroup.requestApplyInsets();
        vVar.H();
    }

    public void v(Throwable th2) {
        p2 p2Var = (p2) this.f39410c;
        p2Var.G0();
        m1 m1Var = (m1) p2Var.f3623a;
        p2Var.f39691i = false;
        p2Var.e1().add((t3) this.f39409b);
        if (p2Var.f39692j > ((Integer) d0.f39335v0.a(null)).intValue()) {
            p2Var.f39692j = 1;
            s0 s0Var = m1Var.f39587f;
            m1.h(s0Var);
            s0Var.f39756i.d("registerTriggerAsync failed. May try later. App ID, throwable", s0.O0(m1Var.m().M0()), s0.O0(th2.toString()));
            return;
        }
        s0 s0Var2 = m1Var.f39587f;
        m1.h(s0Var2);
        s0Var2.f39756i.e("registerTriggerAsync failed. App ID, delay in seconds, throwable", s0.O0(m1Var.m().M0()), s0.O0(String.valueOf(p2Var.f39692j)), s0.O0(th2.toString()));
        int i10 = p2Var.f39692j;
        if (p2Var.f39693k == null) {
            p2Var.f39693k = new d2(p2Var, m1Var, 1);
        }
        p2Var.f39693k.b(((long) i10) * 1000);
        int i11 = p2Var.f39692j;
        p2Var.f39692j = i11 + i11;
    }

    public boolean w(n.a aVar, Menu menu) {
        ViewGroup viewGroup = ((k.v) this.f39410c).A;
        WeakHashMap weakHashMap = m0.s0.f45746a;
        viewGroup.requestApplyInsets();
        zc.u uVar = (zc.u) this.f39409b;
        ActionMode.Callback callback = (ActionMode.Callback) uVar.f54879b;
        n.e eVarQ = uVar.q(aVar);
        x.i iVar = (x.i) uVar.f54882e;
        Menu b0Var = (Menu) iVar.get(menu);
        if (b0Var == null) {
            b0Var = new o.b0((Context) uVar.f54880c, (o.m) menu);
            iVar.put(menu, b0Var);
        }
        return callback.onPrepareActionMode(eVarQ, b0Var);
    }

    public void x(j0.f fVar) {
        com.google.android.gms.common.api.internal.u uVar = (com.google.android.gms.common.api.internal.u) this.f39410c;
        od.c cVar = (od.c) this.f39409b;
        int i10 = fVar.f43562b;
        if (i10 != 0) {
            uVar.execute(new androidx.lifecycle.a0(cVar, i10));
        } else {
            uVar.execute(new ta.i0(26, cVar, fVar.f43561a));
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x005b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x002b  */
    /* JADX WARN: Code duplicated, block: B:18:0x003a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x003c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0041  */
    /* JADX WARN: Code duplicated, block: B:24:0x004f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:? A[LOOP:3: B:11:0x0024->B:98:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x006e A[SYNTHETIC] */
    public void y(l4.b bVar, int i10, int i11) {
        List list;
        TreeMap treeMap;
        Set setKeySet;
        Iterator it;
        boolean z10;
        int iIntValue;
        s4.i iVar = (s4.i) this.f39410c;
        mk0 mk0Var = (mk0) this.f39409b;
        if (mk0Var != null) {
            d5.e eVar = (d5.e) mk0Var.f17464f;
            eVar.getClass();
            if (i10 == i11) {
                list = Collections.EMPTY_LIST;
            } else {
                boolean z11 = i11 > i10;
                ArrayList arrayList = new ArrayList();
                int i12 = i10;
                while (true) {
                    if (z11) {
                        if (i12 < i11) {
                            treeMap = (TreeMap) eVar.f38688a.get(Integer.valueOf(i12));
                            if (treeMap != null) {
                                if (z11) {
                                    setKeySet = treeMap.descendingKeySet();
                                } else {
                                    setKeySet = treeMap.keySet();
                                }
                                it = setKeySet.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        z10 = false;
                                        break;
                                    }
                                    Integer num = (Integer) it.next();
                                    iIntValue = num.intValue();
                                    if (z11) {
                                        if (iIntValue <= i11 && iIntValue > i12) {
                                            arrayList.add(treeMap.get(num));
                                            z10 = true;
                                            i12 = iIntValue;
                                            break;
                                        }
                                    } else {
                                        if (iIntValue >= i11 && iIntValue < i12) {
                                            arrayList.add(treeMap.get(num));
                                            z10 = true;
                                            i12 = iIntValue;
                                            break;
                                            break;
                                        }
                                    }
                                }
                                if (!z10) {
                                }
                            }
                            list = null;
                        } else {
                            list = arrayList;
                        }
                    } else if (i12 > i11) {
                        treeMap = (TreeMap) eVar.f38688a.get(Integer.valueOf(i12));
                        if (treeMap != null) {
                            if (z11) {
                                setKeySet = treeMap.descendingKeySet();
                            } else {
                                setKeySet = treeMap.keySet();
                            }
                            it = setKeySet.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    z10 = false;
                                    break;
                                    break;
                                }
                                Integer num2 = (Integer) it.next();
                                iIntValue = num2.intValue();
                                if (z11) {
                                    if (iIntValue <= i11) {
                                        continue;
                                    }
                                } else if (iIntValue >= i11) {
                                    continue;
                                }
                            }
                            if (!z10) {
                            }
                        }
                        list = null;
                    } else {
                        list = arrayList;
                    }
                }
            }
            if (list != null) {
                ArrayList<String> arrayList2 = new ArrayList();
                Cursor cursorQ = bVar.q("SELECT name FROM sqlite_master WHERE type = 'trigger'");
                while (cursorQ.moveToNext()) {
                    try {
                        arrayList2.add(cursorQ.getString(0));
                    } catch (Throwable th2) {
                        cursorQ.close();
                        throw th2;
                    }
                }
                cursorQ.close();
                for (String str : arrayList2) {
                    if (str.startsWith("room_fts_content_sync_")) {
                        bVar.p("DROP TRIGGER IF EXISTS ".concat(str));
                    }
                }
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((h4.a) it2.next()).a(bVar);
                }
                g4.g gVarN = s4.i.n(bVar);
                if (!gVarN.f41505b) {
                    throw new IllegalStateException("Migration didn't properly handle: " + gVarN.f41504a);
                }
                H(bVar);
                return;
            }
        }
        mk0 mk0Var2 = (mk0) this.f39409b;
        if (mk0Var2 != null) {
            if (!((i10 <= i11 || !mk0Var2.f17460b) && mk0Var2.f17459a)) {
                bVar.p("DROP TABLE IF EXISTS `Dependency`");
                bVar.p("DROP TABLE IF EXISTS `WorkSpec`");
                bVar.p("DROP TABLE IF EXISTS `WorkTag`");
                bVar.p("DROP TABLE IF EXISTS `SystemIdInfo`");
                bVar.p("DROP TABLE IF EXISTS `WorkName`");
                bVar.p("DROP TABLE IF EXISTS `WorkProgress`");
                bVar.p("DROP TABLE IF EXISTS `Preference`");
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) iVar.f50111a;
                int i13 = WorkDatabase_Impl.f5022s;
                List list2 = workDatabase_Impl.f41501g;
                if (list2 != null) {
                    int size = list2.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        ((e5.g) workDatabase_Impl.f41501g.get(i14)).getClass();
                    }
                }
                s4.i.k(bVar);
                return;
            }
        }
        throw new IllegalStateException(l1.d.f("A migration from ", i10, " to ", i11, " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."));
    }

    public void z(h6.g gVar, Object obj) {
        HashMap map = (HashMap) this.f39410c;
        h6.c cVar = (h6.c) map.get(gVar);
        if (cVar == null) {
            cVar = new h6.c(gVar);
            cVar.f42220d = cVar;
            h6.c cVar2 = (h6.c) this.f39409b;
            cVar.f42220d = cVar2.f42220d;
            cVar.f42219c = cVar2;
            cVar2.f42220d = cVar;
            cVar.f42220d.f42219c = cVar;
            map.put(gVar, cVar);
        } else {
            gVar.a();
        }
        if (cVar.f42218b == null) {
            cVar.f42218b = new ArrayList();
        }
        cVar.f42218b.add(obj);
    }

    public /* synthetic */ f2(int i10, boolean z10) {
        this.f39408a = i10;
    }

    public /* synthetic */ f2(Object obj, boolean z10, Object obj2, int i10) {
        this.f39408a = i10;
        this.f39409b = obj;
        this.f39410c = obj2;
    }

    public f2(Context context, int i10) {
        this.f39408a = i10;
        switch (i10) {
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                this.f39409b = context;
                break;
            default:
                k9.c0.h(context);
                Resources resources = context.getResources();
                this.f39409b = resources;
                this.f39410c = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
                break;
        }
    }

    public f2(p3 p3Var) {
        this.f39408a = 11;
        this.f39410c = p3Var;
    }

    public f2(ka.f fVar) {
        this.f39408a = 25;
        this.f39410c = new Handler(Looper.getMainLooper());
        this.f39409b = fVar;
    }

    public f2(List list, List other) {
        this.f39408a = 9;
        kotlin.jvm.internal.n.f(other, "other");
        this.f39409b = xj.n.O0(list);
        this.f39410c = xj.n.O0(other);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f2(List others) {
        this(xj.v.f53866a, others);
        this.f39408a = 9;
        kotlin.jvm.internal.n.f(others, "others");
    }

    public f2(fc.f fVar, hi.b manager) {
        this.f39408a = 18;
        kotlin.jvm.internal.n.f(manager, "manager");
        this.f39409b = fVar;
        this.f39410c = manager;
    }

    public f2(WorkDatabase_Impl workDatabase_Impl) {
        this.f39408a = 29;
        this.f39409b = workDatabase_Impl;
        this.f39410c = new m5.b(workDatabase_Impl, 1);
    }

    public f2(le.a aVar) {
        this.f39408a = 27;
        this.f39409b = aVar;
        ArrayList arrayList = new ArrayList();
        this.f39410c = arrayList;
        arrayList.add(new le.b(aVar, new int[]{1}));
    }

    public f2(zk.w module, zc.u notFoundClasses) {
        this.f39408a = 28;
        kotlin.jvm.internal.n.f(module, "module");
        kotlin.jvm.internal.n.f(notFoundClasses, "notFoundClasses");
        this.f39409b = module;
        this.f39410c = notFoundClasses;
    }

    public f2(byte[] bArr, Provider provider) throws GeneralSecurityException {
        this.f39408a = 20;
        if (defpackage.e.c(1)) {
            this.f39409b = new SecretKeySpec(bArr, "AES");
            this.f39410c = provider;
            return;
        }
        throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode, as BoringCrypto module is not available");
    }

    public f2(Context context, String str, String str2) {
        this.f39408a = 8;
        if (str != null) {
            this.f39410c = str;
            Context applicationContext = context.getApplicationContext();
            if (str2 == null) {
                this.f39409b = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
                return;
            } else {
                this.f39409b = applicationContext.getSharedPreferences(str2, 0).edit();
                return;
            }
        }
        throw new IllegalArgumentException("keysetName cannot be null");
    }

    public f2(Map map) {
        this.f39408a = 21;
        this.f39409b = map;
        this.f39410c = new om.l("Java nullability annotation states").c(new al.f(this, 11));
    }

    public f2(int i10) {
        this.f39408a = i10;
        switch (i10) {
            case 16:
                this.f39409b = new h6.c(null);
                this.f39410c = new HashMap();
                break;
            case 19:
                this.f39409b = new HashMap();
                this.f39410c = new i6.c(0);
                break;
            default:
                this.f39409b = new ArrayList();
                break;
        }
    }

    public f2(Matcher matcher, CharSequence input) {
        this.f39408a = 2;
        kotlin.jvm.internal.n.f(input, "input");
        this.f39409b = matcher;
    }

    public f2(androidx.viewpager.widget.k kVar) {
        this.f39408a = 4;
        this.f39410c = kVar;
        this.f39409b = new Rect();
    }
}
