package ak;

import android.util.Log;
import androidx.lifecycle.p;
import cn.a2;
import cn.d0;
import com.google.android.gms.internal.play_billing.q1;
import hn.x;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.n;
import qk.i0;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements jk.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3615a;

    public /* synthetic */ c(int i10) {
        this.f3615a = i10;
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        e eVar;
        Object obj3;
        switch (this.f3615a) {
            case 0:
                String acc = (String) obj;
                i element = (i) obj2;
                n.f(acc, "acc");
                n.f(element, "element");
                if (acc.length() == 0) {
                    return element.toString();
                }
                return acc + ", " + element;
            case 1:
                k acc2 = (k) obj;
                i element2 = (i) obj2;
                n.f(acc2, "acc");
                n.f(element2, "element");
                k kVarMinusKey = acc2.minusKey(element2.getKey());
                l lVar = l.f3620a;
                if (kVarMinusKey == lVar) {
                    return element2;
                }
                g gVar = g.f3619a;
                h hVar = (h) kVarMinusKey.get(gVar);
                if (hVar == null) {
                    eVar = new e(element2, kVarMinusKey);
                } else {
                    k kVarMinusKey2 = kVarMinusKey.minusKey(gVar);
                    if (kVarMinusKey2 == lVar) {
                        return new e(hVar, element2);
                    }
                    eVar = new e(hVar, new e(element2, kVarMinusKey2));
                }
                return eVar;
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                obj3 = bool;
                break;
            case 3:
                return ((k) obj).plus((i) obj2);
            case 4:
                return ((k) obj).plus((i) obj2);
            case 5:
                dh.b lhs = (dh.b) obj;
                dh.b rhs = (dh.b) obj2;
                n.f(lhs, "lhs");
                n.f(rhs, "rhs");
                Boolean bool2 = (Boolean) d0.C(l.f3620a, new p(lhs, rhs, null, 6));
                bool2.getClass();
                return bool2;
            case 6:
                Map data = (Map) obj;
                File file = (File) obj2;
                n.f(data, "data");
                n.f(file, "file");
                File file2 = new File(file.getParentFile(), wi.d.h(file.getName(), ".tmp"));
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        og.c cVar = new og.c(q1.b(q1.z(fileOutputStream)));
                        cVar.n();
                        cVar.q("assetsDictionary");
                        cVar.k();
                        Iterator it = data.values().iterator();
                        int i10 = 0;
                        while (it.hasNext()) {
                            r9.b.M(cVar, (dh.b) it.next());
                            i10++;
                            if (i10 % 200 == 0) {
                                cVar.flush();
                            }
                        }
                        cVar.o(1, 2, ']');
                        cVar.p();
                        cVar.flush();
                        fileOutputStream.getFD().sync();
                        fileOutputStream.close();
                        if (!file2.renameTo(file)) {
                            Log.w("ProjectLogger", "CGAssetsFileStorage: Atomic rename failed, using copy fallback");
                            x7.a.N(file2, file);
                            file2.delete();
                        }
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            i0.j(fileOutputStream, th2);
                            throw th3;
                        }
                    }
                } catch (Exception e10) {
                    Log.e("ProjectLogger", "JSON Writing: Error writing assets JSON", e10);
                    if (file2.exists()) {
                        file2.delete();
                    }
                }
                return r.f53297a;
            case 7:
                List data2 = (List) obj;
                File file3 = (File) obj2;
                n.f(data2, "data");
                n.f(file3, "file");
                File file4 = new File(file3.getParentFile(), wi.d.h(file3.getName(), ".tmp"));
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file4);
                    try {
                        og.c cVar2 = new og.c(q1.b(q1.z(fileOutputStream2)));
                        cVar2.n();
                        cVar2.q("folders");
                        cVar2.k();
                        Iterator it2 = data2.iterator();
                        int i11 = 0;
                        while (it2.hasNext()) {
                            i0.p0(cVar2, (dh.a) it2.next());
                            i11++;
                            if (i11 % 50 == 0) {
                                cVar2.flush();
                            }
                        }
                        cVar2.o(1, 2, ']');
                        cVar2.p();
                        cVar2.flush();
                        fileOutputStream2.getFD().sync();
                        fileOutputStream2.close();
                        if (!file4.renameTo(file3)) {
                            Log.w("ProjectLogger", "AssetFolderStorage: Atomic rename failed, using copy fallback");
                            x7.a.N(file4, file3);
                            file4.delete();
                        }
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            i0.j(fileOutputStream2, th4);
                            throw th5;
                        }
                    }
                } catch (Exception e11) {
                    Log.e("ProjectLogger", "JSON Writing: Error writing folders JSON", e11);
                    if (file4.exists()) {
                        file4.delete();
                    }
                }
                return r.f53297a;
            case 8:
                Map data3 = (Map) obj;
                File file5 = (File) obj2;
                n.f(data3, "data");
                n.f(file5, "file");
                File file6 = new File(file5.getParentFile(), wi.d.h(file5.getName(), ".tmp"));
                try {
                    FileOutputStream fileOutputStream3 = new FileOutputStream(file6);
                    try {
                        og.c cVar3 = new og.c(q1.b(q1.z(fileOutputStream3)));
                        cVar3.n();
                        cVar3.q("duplicates");
                        cVar3.n();
                        for (Map.Entry entry : data3.entrySet()) {
                            String str = (String) entry.getKey();
                            Set set = (Set) entry.getValue();
                            cVar3.q(str);
                            cVar3.k();
                            Iterator it3 = set.iterator();
                            while (it3.hasNext()) {
                                cVar3.w((String) it3.next());
                            }
                            cVar3.o(1, 2, ']');
                        }
                        cVar3.p();
                        cVar3.p();
                        cVar3.flush();
                        fileOutputStream3.getFD().sync();
                        fileOutputStream3.close();
                        if (!file6.renameTo(file5)) {
                            Log.w("ProjectLogger", "DuplicateReferenceStorage: Atomic rename failed, using copy fallback");
                            x7.a.N(file6, file5);
                            file6.delete();
                        }
                        return r.f53297a;
                    } catch (Throwable th6) {
                        try {
                            throw th6;
                        } catch (Throwable th7) {
                            i0.j(fileOutputStream3, th6);
                            throw th7;
                        }
                    }
                } catch (Exception e12) {
                    Log.e("ProjectLogger", "JSON Writing: Error writing duplicates JSON", e12);
                    if (file6.exists()) {
                        file6.delete();
                    }
                }
                break;
            case 9:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 10:
                i iVar = (i) obj2;
                if (!(iVar instanceof a2)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? iVar : Integer.valueOf(iIntValue + 1);
            case 11:
                a2 a2Var = (a2) obj;
                i iVar2 = (i) obj2;
                if (a2Var != null) {
                    return a2Var;
                }
                if (iVar2 instanceof a2) {
                    return (a2) iVar2;
                }
                return null;
            default:
                obj3 = (x) obj;
                break;
        }
        return obj3;
    }
}
