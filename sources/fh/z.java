package fh;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.google.android.gms.internal.play_billing.q1;
import com.storage.androidcleaner.activity.TrashConsentActivity;
import ea.f2;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import qk.i0;
import xj.b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class z implements sg.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f40950a = new z();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f40951b = new ConcurrentHashMap();

    public static Object d(ArrayList arrayList, x xVar) {
        cn.l lVar = new cn.l(1, q1.t(xVar));
        lVar.t();
        String strValueOf = String.valueOf(System.currentTimeMillis());
        f40951b.put(strValueOf, lVar);
        z zVar = f40950a;
        Intent intent = new Intent(super.h(), (Class<?>) TrashConsentActivity.class);
        intent.addFlags(268435456);
        intent.addFlags(134217728);
        intent.putParcelableArrayListExtra("uris", new ArrayList<>(arrayList));
        intent.putExtra("requestId", strValueOf);
        super.h().startActivity(intent);
        lVar.v(new cl.a(strValueOf, 2));
        return lVar.s();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [fh.z, sg.c] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r11v8, types: [ln.c] */
    /* JADX WARN: Type inference failed for: r3v2, types: [fh.z] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r7v4 */
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
    public final Object a(Set set, ck.c cVar) {
        w wVar;
        ?? r11;
        Map map;
        int i10;
        int iIntValue;
        ?? r10;
        ln.a aVar;
        ?? r3;
        Map map2;
        if (cVar instanceof w) {
            wVar = (w) cVar;
            int i11 = wVar.f40939m;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                wVar.f40939m = i11 - Integer.MIN_VALUE;
            } else {
                wVar = new w(this, cVar);
            }
        } else {
            wVar = new w(this, cVar);
        }
        Object objB = wVar.f40938k;
        int i12 = wVar.f40939m;
        Object obj = bk.a.f5708a;
        try {
            if (i12 == 0) {
                t9.e.z(objB);
                wVar.f40933f = set;
                wVar.f40939m = 1;
                objB = b(set, wVar);
                if (objB != obj) {
                }
                r11 = set;
                return obj;
            }
            if (i12 == 1) {
                Set set2 = wVar.f40933f;
                t9.e.z(objB);
                r11 = set2;
            } else {
                if (i12 == 2) {
                    int i13 = wVar.f40937j;
                    iIntValue = wVar.f40936i;
                    ln.a aVar2 = wVar.f40935h;
                    Map map3 = wVar.f40934g;
                    Set set3 = wVar.f40933f;
                    t9.e.z(objB);
                    map = map3;
                    i10 = i13;
                    aVar = aVar2;
                    r10 = set3;
                    r3 = f40950a;
                    wVar.f40933f = null;
                    wVar.f40934g = map;
                    wVar.f40935h = aVar;
                    wVar.f40936i = iIntValue;
                    wVar.f40937j = i10;
                    wVar.f40939m = 3;
                    if (r3.c(r10, wVar) != obj) {
                        map2 = map;
                    }
                    r11 = set;
                    return obj;
                }
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = wVar.f40935h;
                map2 = wVar.f40934g;
                t9.e.z(objB);
            }
            set = (ln.c) aVar;
            set.g(null);
            map = map2;
            super.h().getContentResolver().notifyChange(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, null);
            return map;
            r11 = set;
            map = (Map) objB;
            Object obj2 = map.get("deletedCount");
            Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
            i10 = 0;
            iIntValue = num != null ? num.intValue() : 0;
            if (iIntValue > 0) {
                ln.c cVar2 = s.f40911b;
                wVar.f40933f = r11;
                wVar.f40934g = map;
                wVar.f40935h = cVar2;
                wVar.f40936i = iIntValue;
                wVar.f40937j = 0;
                wVar.f40939m = 2;
                if (cVar2.e(wVar) != obj) {
                    r10 = r11;
                    aVar = cVar2;
                    r3 = f40950a;
                    wVar.f40933f = null;
                    wVar.f40934g = map;
                    wVar.f40935h = aVar;
                    wVar.f40936i = iIntValue;
                    wVar.f40937j = i10;
                    wVar.f40939m = 3;
                    if (r3.c(r10, wVar) != obj) {
                        map2 = map;
                        set = (ln.c) aVar;
                        set.g(null);
                        map = map2;
                    }
                }
                r11 = set;
                return obj;
            }
            super.h().getContentResolver().notifyChange(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, null);
            return map;
        } catch (Throwable th2) {
            ((ln.c) set).g(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Serializable b(Set set, ck.c cVar) throws IOException {
        x xVar;
        z zVar;
        Set<String> set2;
        ArrayList arrayList;
        Object objD;
        Exception e10;
        if (cVar instanceof x) {
            xVar = (x) cVar;
            int i10 = xVar.f40944j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                xVar.f40944j = i10 - Integer.MIN_VALUE;
                zVar = this;
            } else {
                zVar = this;
                xVar = new x(zVar, cVar);
            }
        } else {
            zVar = this;
            xVar = new x(zVar, cVar);
        }
        x xVar2 = xVar;
        Object obj = xVar2.f40942h;
        bk.a aVar = bk.a.f5708a;
        int i11 = xVar2.f40944j;
        if (i11 == 0) {
            t9.e.z(obj);
            ContentResolver contentResolver = super.h().getContentResolver();
            set2 = set;
            String strU0 = xj.n.u0(set2, ",", null, null, new bh.a(8), 30);
            Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            Uri uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Cursor cursorQuery = contentResolver.query(uri, new String[]{"_id"}, defpackage.e.o("_id IN (", strU0, ")"), (String[]) set2.toArray(new String[0]), null);
            if (cursorQuery != null) {
                Cursor cursor = cursorQuery;
                try {
                    Cursor cursor2 = cursor;
                    int columnIndexOrThrow = cursor2.getColumnIndexOrThrow("_id");
                    while (cursor2.moveToNext()) {
                        String strValueOf = String.valueOf(cursor2.getLong(columnIndexOrThrow));
                        linkedHashMap.put(strValueOf, ContentUris.withAppendedId(uri, Long.parseLong(strValueOf)));
                    }
                    cursor.close();
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        i0.j(cursor, th2);
                        throw th3;
                    }
                }
            }
            Cursor cursorQuery2 = contentResolver.query(uri2, new String[]{"_id"}, defpackage.e.o("_id IN (", strU0, ")"), (String[]) set2.toArray(new String[0]), null);
            if (cursorQuery2 != null) {
                Cursor cursor3 = cursorQuery2;
                try {
                    Cursor cursor4 = cursor3;
                    int columnIndexOrThrow2 = cursor4.getColumnIndexOrThrow("_id");
                    while (cursor4.moveToNext()) {
                        String strValueOf2 = String.valueOf(cursor4.getLong(columnIndexOrThrow2));
                        linkedHashMap2.put(strValueOf2, ContentUris.withAppendedId(uri2, Long.parseLong(strValueOf2)));
                    }
                    cursor3.close();
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        i0.j(cursor3, th4);
                        throw th5;
                    }
                }
            }
            arrayList = new ArrayList();
            for (String str : set2) {
                Uri uri3 = (Uri) linkedHashMap.get(str);
                if (uri3 == null) {
                    uri3 = (Uri) linkedHashMap2.get(str);
                }
                if (uri3 != null) {
                    arrayList.add(uri3);
                }
            }
            s sVar = s.f40910a;
            Set ids = linkedHashMap2.keySet();
            kotlin.jvm.internal.n.f(ids, "ids");
            if (!ids.isEmpty()) {
                LinkedHashSet linkedHashSet = s.f40920k;
                synchronized (linkedHashSet) {
                    linkedHashSet.addAll(ids);
                }
            }
            if (arrayList.isEmpty()) {
                return (Serializable) b0.Q(new wj.f("deletedCount", new Integer(0)), new wj.f("failedCount", new Integer(set2.size())));
            }
            try {
                xVar2.f40940f = set2;
                xVar2.f40941g = arrayList;
                xVar2.f40944j = 1;
                objD = d(arrayList, xVar2);
                if (objD == aVar) {
                    return aVar;
                }
            } catch (Exception e11) {
                e10 = e11;
                Log.e("AssetProcessingTrashService", "Error deleting assets", e10);
                return (Serializable) b0.Q(new wj.f("deletedCount", new Integer(0)), new wj.f("failedCount", new Integer(set2.size())));
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = xVar2.f40941g;
            Set set3 = xVar2.f40940f;
            try {
                t9.e.z(obj);
                objD = obj;
                set2 = set3;
            } catch (Exception e12) {
                e10 = e12;
                set2 = set3;
                Log.e("AssetProcessingTrashService", "Error deleting assets", e10);
                return (Serializable) b0.Q(new wj.f("deletedCount", new Integer(0)), new wj.f("failedCount", new Integer(set2.size())));
            }
        }
        boolean zBooleanValue = ((Boolean) objD).booleanValue();
        return (Serializable) b0.Q(new wj.f("deletedCount", new Integer(zBooleanValue ? arrayList.size() : 0)), new wj.f("failedCount", new Integer(zBooleanValue ? 0 : set2.size())));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(Set keys, ck.c cVar) {
        y yVar;
        List listO0;
        if (cVar instanceof y) {
            yVar = (y) cVar;
            int i10 = yVar.f40949j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                yVar.f40949j = i10 - Integer.MIN_VALUE;
            } else {
                yVar = new y(this, cVar);
            }
        } else {
            yVar = new y(this, cVar);
        }
        Object obj = yVar.f40947h;
        int i11 = yVar.f40949j;
        if (i11 == 0) {
            t9.e.z(obj);
            s sVar = s.f40910a;
            wj.f fVarE = com.bumptech.glide.c.e((List) com.bumptech.glide.d.K(s.f40919j), keys);
            List list = (List) fVarE.f53283a;
            List list2 = (List) fVarE.f53284b;
            listO0 = !list2.isEmpty() ? xj.n.O0(s.u(new f2(list2), list)) : list;
            eh.h hVar = eh.h.f40075a;
            yVar.f40945f = keys;
            yVar.f40946g = listO0;
            yVar.f40949j = 1;
            Object objB = hVar.b(keys, yVar);
            bk.a aVar = bk.a.f5708a;
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list3 = yVar.f40946g;
            Set set = yVar.f40945f;
            t9.e.z(obj);
            listO0 = list3;
            keys = set;
        }
        v vVar = v.f40930a;
        Map map = (Map) com.bumptech.glide.d.K(s.f40918i);
        kotlin.jvm.internal.n.f(keys, "keys");
        Set setR0 = xj.n.R0(keys);
        LinkedHashMap linkedHashMapY = b0.Y(map);
        Set setKeySet = linkedHashMapY.keySet();
        kotlin.jvm.internal.n.f(setKeySet, "<this>");
        setKeySet.removeAll(setR0);
        v.c(b0.S(linkedHashMapY), listO0);
        return wj.r.f53297a;
    }
}
