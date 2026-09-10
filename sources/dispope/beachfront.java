package dispope;

import android.database.Cursor;
import com.ironsource.A5;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: compiled from: TableInfo.java */
/* JADX INFO: loaded from: classes.dex */
public class beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Map<String, attabal> f25333attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Set<wireman> f25334dern;
    public final String name;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Set<saneness> f25335saneness;

    /* JADX INFO: compiled from: TableInfo.java */
    public static class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final String f25336attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final int f25337beachfront;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final boolean f25338dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final String f25339marial;
        public final String name;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f25340saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final int f25341wireman;

        public attabal(String str, String str2, boolean z, int i, String str3, int i2) {
            this.name = str;
            this.f25336attabal = str2;
            this.f25338dern = z;
            this.f25341wireman = i;
            this.f25340saneness = attabal(str2);
            this.f25339marial = str3;
            this.f25337beachfront = i2;
        }

        public static int attabal(String str) {
            if (str == null) {
                return 5;
            }
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                return 3;
            }
            if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                return 2;
            }
            if (upperCase.contains("BLOB")) {
                return 5;
            }
            return (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                attabal attabalVar = (attabal) obj;
                if (this.f25341wireman != attabalVar.f25341wireman || !this.name.equals(attabalVar.name) || this.f25338dern != attabalVar.f25338dern) {
                    return false;
                }
                if (this.f25337beachfront == 1 && attabalVar.f25337beachfront == 2 && (str3 = this.f25339marial) != null && !str3.equals(attabalVar.f25339marial)) {
                    return false;
                }
                if (this.f25337beachfront == 2 && attabalVar.f25337beachfront == 1 && (str2 = attabalVar.f25339marial) != null && !str2.equals(this.f25339marial)) {
                    return false;
                }
                int i = this.f25337beachfront;
                if ((i == 0 || i != attabalVar.f25337beachfront || ((str = this.f25339marial) == null ? attabalVar.f25339marial == null : str.equals(attabalVar.f25339marial))) && this.f25340saneness == attabalVar.f25340saneness) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((this.name.hashCode() * 31) + this.f25340saneness) * 31) + (this.f25338dern ? 1231 : 1237)) * 31) + this.f25341wireman;
        }

        public String toString() {
            return "Column{name='" + this.name + "', type='" + this.f25336attabal + "', affinity='" + this.f25340saneness + "', notNull=" + this.f25338dern + ", primaryKeyPosition=" + this.f25341wireman + ", defaultValue='" + this.f25339marial + "'}";
        }
    }

    /* JADX INFO: compiled from: TableInfo.java */
    public static class dern implements Comparable<dern> {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final int f25342arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final int f25343kowloon;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public final String f25344monoploid;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public final String f25345polloi;

        public dern(int i, int i2, String str, String str2) {
            this.f25343kowloon = i;
            this.f25342arytenoidectomy = i2;
            this.f25344monoploid = str;
            this.f25345polloi = str2;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public int compareTo(dern dernVar) {
            int i = this.f25343kowloon - dernVar.f25343kowloon;
            return i == 0 ? this.f25342arytenoidectomy - dernVar.f25342arytenoidectomy : i;
        }
    }

    /* JADX INFO: compiled from: TableInfo.java */
    public static class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final String f25346attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final String f25347dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final List<String> f25348marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final String f25349saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final List<String> f25350wireman;

        public saneness(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.f25346attabal = str;
            this.f25349saneness = str2;
            this.f25347dern = str3;
            this.f25350wireman = Collections.unmodifiableList(list);
            this.f25348marial = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            saneness sanenessVar = (saneness) obj;
            if (this.f25346attabal.equals(sanenessVar.f25346attabal) && this.f25349saneness.equals(sanenessVar.f25349saneness) && this.f25347dern.equals(sanenessVar.f25347dern) && this.f25350wireman.equals(sanenessVar.f25350wireman)) {
                return this.f25348marial.equals(sanenessVar.f25348marial);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f25346attabal.hashCode() * 31) + this.f25349saneness.hashCode()) * 31) + this.f25347dern.hashCode()) * 31) + this.f25350wireman.hashCode()) * 31) + this.f25348marial.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f25346attabal + "', onDelete='" + this.f25349saneness + "', onUpdate='" + this.f25347dern + "', columnNames=" + this.f25350wireman + ", referenceColumnNames=" + this.f25348marial + '}';
        }
    }

    /* JADX INFO: compiled from: TableInfo.java */
    public static class wireman {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final boolean f25351attabal;
        public final String name;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final List<String> f25352saneness;

        public wireman(String str, boolean z, List<String> list) {
            this.name = str;
            this.f25351attabal = z;
            this.f25352saneness = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            wireman wiremanVar = (wireman) obj;
            if (this.f25351attabal == wiremanVar.f25351attabal && this.f25352saneness.equals(wiremanVar.f25352saneness)) {
                return this.name.startsWith("index_") ? wiremanVar.name.startsWith("index_") : this.name.equals(wiremanVar.name);
            }
            return false;
        }

        public int hashCode() {
            return ((((this.name.startsWith("index_") ? -1184239155 : this.name.hashCode()) * 31) + (this.f25351attabal ? 1 : 0)) * 31) + this.f25352saneness.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.name + "', unique=" + this.f25351attabal + ", columns=" + this.f25352saneness + '}';
        }
    }

    public beachfront(String str, Map<String, attabal> map, Set<saneness> set, Set<wireman> set2) {
        this.name = str;
        this.f25333attabal = Collections.unmodifiableMap(map);
        this.f25335saneness = Collections.unmodifiableSet(set);
        this.f25334dern = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    public static beachfront attabal(iconoclasm.saneness sanenessVar, String str) {
        return new beachfront(str, saneness(sanenessVar, str), wireman(sanenessVar, str), beachfront(sanenessVar, str));
    }

    public static Set<wireman> beachfront(iconoclasm.saneness sanenessVar, String str) {
        Cursor cursorCoffeecake = sanenessVar.coffeecake("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = cursorCoffeecake.getColumnIndex("name");
            int columnIndex2 = cursorCoffeecake.getColumnIndex("origin");
            int columnIndex3 = cursorCoffeecake.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                HashSet hashSet = new HashSet();
                while (cursorCoffeecake.moveToNext()) {
                    if ("c".equals(cursorCoffeecake.getString(columnIndex2))) {
                        String string = cursorCoffeecake.getString(columnIndex);
                        boolean z = true;
                        if (cursorCoffeecake.getInt(columnIndex3) != 1) {
                            z = false;
                        }
                        wireman wiremanVarMarial = marial(sanenessVar, string, z);
                        if (wiremanVarMarial == null) {
                            cursorCoffeecake.close();
                            return null;
                        }
                        hashSet.add(wiremanVarMarial);
                    }
                }
                cursorCoffeecake.close();
                return hashSet;
            }
            cursorCoffeecake.close();
            return null;
        } catch (Throwable th) {
            cursorCoffeecake.close();
            throw th;
        }
    }

    public static List<dern> dern(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new dern(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static wireman marial(iconoclasm.saneness sanenessVar, String str, boolean z) {
        Cursor cursorCoffeecake = sanenessVar.coffeecake("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorCoffeecake.getColumnIndex("seqno");
            int columnIndex2 = cursorCoffeecake.getColumnIndex(BidResponsedEx.KEY_CID);
            int columnIndex3 = cursorCoffeecake.getColumnIndex("name");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (cursorCoffeecake.moveToNext()) {
                    if (cursorCoffeecake.getInt(columnIndex2) >= 0) {
                        treeMap.put(Integer.valueOf(cursorCoffeecake.getInt(columnIndex)), cursorCoffeecake.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                return new wireman(str, z, arrayList);
            }
            return null;
        } finally {
            cursorCoffeecake.close();
        }
    }

    public static Map<String, attabal> saneness(iconoclasm.saneness sanenessVar, String str) {
        Cursor cursorCoffeecake = sanenessVar.coffeecake("PRAGMA table_info(`" + str + "`)");
        HashMap map = new HashMap();
        try {
            if (cursorCoffeecake.getColumnCount() > 0) {
                int columnIndex = cursorCoffeecake.getColumnIndex("name");
                int columnIndex2 = cursorCoffeecake.getColumnIndex("type");
                int columnIndex3 = cursorCoffeecake.getColumnIndex("notnull");
                int columnIndex4 = cursorCoffeecake.getColumnIndex("pk");
                int columnIndex5 = cursorCoffeecake.getColumnIndex("dflt_value");
                while (cursorCoffeecake.moveToNext()) {
                    String string = cursorCoffeecake.getString(columnIndex);
                    map.put(string, new attabal(string, cursorCoffeecake.getString(columnIndex2), cursorCoffeecake.getInt(columnIndex3) != 0, cursorCoffeecake.getInt(columnIndex4), cursorCoffeecake.getString(columnIndex5), 2));
                }
            }
            return map;
        } finally {
            cursorCoffeecake.close();
        }
    }

    public static Set<saneness> wireman(iconoclasm.saneness sanenessVar, String str) {
        HashSet hashSet = new HashSet();
        Cursor cursorCoffeecake = sanenessVar.coffeecake("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = cursorCoffeecake.getColumnIndex("id");
            int columnIndex2 = cursorCoffeecake.getColumnIndex("seq");
            int columnIndex3 = cursorCoffeecake.getColumnIndex(A5.R);
            int columnIndex4 = cursorCoffeecake.getColumnIndex("on_delete");
            int columnIndex5 = cursorCoffeecake.getColumnIndex("on_update");
            List<dern> listDern = dern(cursorCoffeecake);
            int count = cursorCoffeecake.getCount();
            for (int i = 0; i < count; i++) {
                cursorCoffeecake.moveToPosition(i);
                if (cursorCoffeecake.getInt(columnIndex2) == 0) {
                    int i2 = cursorCoffeecake.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (dern dernVar : listDern) {
                        if (dernVar.f25343kowloon == i2) {
                            arrayList.add(dernVar.f25344monoploid);
                            arrayList2.add(dernVar.f25345polloi);
                        }
                    }
                    hashSet.add(new saneness(cursorCoffeecake.getString(columnIndex3), cursorCoffeecake.getString(columnIndex4), cursorCoffeecake.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            return hashSet;
        } finally {
            cursorCoffeecake.close();
        }
    }

    public boolean equals(Object obj) {
        Set<wireman> set;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        beachfront beachfrontVar = (beachfront) obj;
        String str = this.name;
        if (str == null ? beachfrontVar.name != null : !str.equals(beachfrontVar.name)) {
            return false;
        }
        Map<String, attabal> map = this.f25333attabal;
        if (map == null ? beachfrontVar.f25333attabal != null : !map.equals(beachfrontVar.f25333attabal)) {
            return false;
        }
        Set<saneness> set2 = this.f25335saneness;
        if (set2 == null ? beachfrontVar.f25335saneness != null : !set2.equals(beachfrontVar.f25335saneness)) {
            return false;
        }
        Set<wireman> set3 = this.f25334dern;
        if (set3 == null || (set = beachfrontVar.f25334dern) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, attabal> map = this.f25333attabal;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<saneness> set = this.f25335saneness;
        return iHashCode2 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        return "TableInfo{name='" + this.name + "', columns=" + this.f25333attabal + ", foreignKeys=" + this.f25335saneness + ", indices=" + this.f25334dern + '}';
    }
}
