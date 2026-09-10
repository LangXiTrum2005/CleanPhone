package i4;

import android.database.Cursor;
import com.ironsource.B5;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f42882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f42883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f42884d;

    public e(String str, HashMap map, HashSet hashSet, HashSet hashSet2) {
        this.f42881a = str;
        this.f42882b = Collections.unmodifiableMap(map);
        this.f42883c = Collections.unmodifiableSet(hashSet);
        this.f42884d = hashSet2 == null ? null : Collections.unmodifiableSet(hashSet2);
    }

    public static e a(l4.b bVar, String str) {
        int i10;
        ArrayList arrayList;
        Cursor cursorQ = bVar.q(defpackage.e.o("PRAGMA table_info(`", str, "`)"));
        HashMap map = new HashMap();
        try {
            if (cursorQ.getColumnCount() > 0) {
                int columnIndex = cursorQ.getColumnIndex("name");
                int columnIndex2 = cursorQ.getColumnIndex("type");
                int columnIndex3 = cursorQ.getColumnIndex("notnull");
                int columnIndex4 = cursorQ.getColumnIndex("pk");
                int columnIndex5 = cursorQ.getColumnIndex("dflt_value");
                while (cursorQ.moveToNext()) {
                    String string = cursorQ.getString(columnIndex);
                    map.put(string, new a(cursorQ.getInt(columnIndex4), 2, string, cursorQ.getString(columnIndex2), cursorQ.getString(columnIndex5), cursorQ.getInt(columnIndex3) != 0));
                }
            }
            cursorQ.close();
            HashSet hashSet = new HashSet();
            Cursor cursorQ2 = bVar.q("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = cursorQ2.getColumnIndex("id");
                int columnIndex7 = cursorQ2.getColumnIndex("seq");
                int columnIndex8 = cursorQ2.getColumnIndex(B5.R);
                int columnIndex9 = cursorQ2.getColumnIndex("on_delete");
                int columnIndex10 = cursorQ2.getColumnIndex("on_update");
                ArrayList<c> arrayListB = b(cursorQ2);
                int count = cursorQ2.getCount();
                int i11 = 0;
                while (i11 < count) {
                    cursorQ2.moveToPosition(i11);
                    if (cursorQ2.getInt(columnIndex7) != 0) {
                        i10 = columnIndex7;
                        arrayList = arrayListB;
                    } else {
                        int i12 = cursorQ2.getInt(columnIndex6);
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        for (c cVar : arrayListB) {
                            int i13 = columnIndex7;
                            ArrayList arrayList4 = arrayListB;
                            if (cVar.f42874a == i12) {
                                arrayList2.add(cVar.f42876c);
                                arrayList3.add(cVar.f42877d);
                            }
                            columnIndex7 = i13;
                            arrayListB = arrayList4;
                        }
                        i10 = columnIndex7;
                        arrayList = arrayListB;
                        hashSet.add(new b(cursorQ2.getString(columnIndex8), cursorQ2.getString(columnIndex9), cursorQ2.getString(columnIndex10), arrayList2, arrayList3));
                    }
                    i11++;
                    columnIndex6 = columnIndex6;
                    columnIndex7 = i10;
                    arrayListB = arrayList;
                }
                cursorQ2.close();
                Cursor cursorQ3 = bVar.q("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex11 = cursorQ3.getColumnIndex("name");
                    int columnIndex12 = cursorQ3.getColumnIndex("origin");
                    int columnIndex13 = cursorQ3.getColumnIndex("unique");
                    HashSet hashSet2 = null;
                    if (columnIndex11 == -1 || columnIndex12 == -1 || columnIndex13 == -1) {
                        cursorQ3.close();
                        break;
                    }
                    HashSet hashSet3 = new HashSet();
                    while (true) {
                        if (!cursorQ3.moveToNext()) {
                            cursorQ3.close();
                            hashSet2 = hashSet3;
                            break;
                        }
                        if ("c".equals(cursorQ3.getString(columnIndex12))) {
                            d dVarC = c(bVar, cursorQ3.getString(columnIndex11), cursorQ3.getInt(columnIndex13) == 1);
                            if (dVarC == null) {
                                cursorQ3.close();
                                break;
                            }
                            hashSet3.add(dVarC);
                        }
                    }
                    return new e(str, map, hashSet, hashSet2);
                } catch (Throwable th2) {
                    cursorQ3.close();
                    throw th2;
                }
            } catch (Throwable th3) {
                cursorQ2.close();
                throw th3;
            }
        } catch (Throwable th4) {
            cursorQ.close();
            throw th4;
        }
    }

    public static ArrayList b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < count; i10++) {
            cursor.moveToPosition(i10);
            arrayList.add(new c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static d c(l4.b bVar, String str, boolean z10) {
        Cursor cursorQ = bVar.q(defpackage.e.o("PRAGMA index_xinfo(`", str, "`)"));
        try {
            int columnIndex = cursorQ.getColumnIndex("seqno");
            int columnIndex2 = cursorQ.getColumnIndex(BidResponsedEx.KEY_CID);
            int columnIndex3 = cursorQ.getColumnIndex("name");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (cursorQ.moveToNext()) {
                    if (cursorQ.getInt(columnIndex2) >= 0) {
                        int i10 = cursorQ.getInt(columnIndex);
                        treeMap.put(Integer.valueOf(i10), cursorQ.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                return new d(str, arrayList, z10);
            }
            return null;
        } finally {
            cursorQ.close();
        }
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        Set set2 = eVar.f42883c;
        Map map = eVar.f42882b;
        String str = eVar.f42881a;
        String str2 = this.f42881a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        Map map2 = this.f42882b;
        if (map2 == null ? map != null : !map2.equals(map)) {
            return false;
        }
        Set set3 = this.f42883c;
        if (set3 == null ? set2 != null : !set3.equals(set2)) {
            return false;
        }
        Set set4 = this.f42884d;
        if (set4 == null || (set = eVar.f42884d) == null) {
            return true;
        }
        return set4.equals(set);
    }

    public final int hashCode() {
        String str = this.f42881a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map map = this.f42882b;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set set = this.f42883c;
        return iHashCode2 + (set != null ? set.hashCode() : 0);
    }

    public final String toString() {
        return "TableInfo{name='" + this.f42881a + "', columns=" + this.f42882b + ", foreignKeys=" + this.f42883c + ", indices=" + this.f42884d + '}';
    }
}
