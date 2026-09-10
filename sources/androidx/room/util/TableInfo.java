package androidx.room.util;

import androidx.media3.extractor.text.ttml.a;
import androidx.sqlite.SQLiteStatement;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import androidx.sqlite.driver.SupportSQLiteConnection;
import com.google.android.gms.ads.AdError;
import com.p004ironsource.dc;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.SetsKt;
import kotlin.collections.builders.MapBuilder;
import kotlin.collections.builders.SetBuilder;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Landroidx/room/util/TableInfo;", "", "CreatedFrom", "Companion", "Column", "ForeignKey", "Index", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TableInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractSet f8342c;
    public final AbstractSet d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/room/util/TableInfo$Column;", "", "Companion", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Column {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8343a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f8344b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f8345c;
        public final int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f8346e;
        public final int f;
        public final int g;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/util/TableInfo$Column$Companion;", "", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
        }

        public Column(int i2, String name, String type, String str, boolean z2, int i3) {
            Intrinsics.f(name, "name");
            Intrinsics.f(type, "type");
            this.f8343a = name;
            this.f8344b = type;
            this.f8345c = z2;
            this.d = i2;
            this.f8346e = str;
            this.f = i3;
            String upperCase = type.toUpperCase(Locale.ROOT);
            Intrinsics.e(upperCase, "toUpperCase(...)");
            this.g = StringsKt.l(upperCase, "INT", false) ? 3 : (StringsKt.l(upperCase, "CHAR", false) || StringsKt.l(upperCase, "CLOB", false) || StringsKt.l(upperCase, AdPreferences.TYPE_TEXT, false)) ? 2 : StringsKt.l(upperCase, "BLOB", false) ? 5 : (StringsKt.l(upperCase, "REAL", false) || StringsKt.l(upperCase, "FLOA", false) || StringsKt.l(upperCase, "DOUB", false)) ? 4 : 1;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Column) {
                    Column column = (Column) obj;
                    if ((this.d > 0) == (column.d > 0) && Intrinsics.a(this.f8343a, column.f8343a) && this.f8345c == column.f8345c) {
                        int i2 = column.f;
                        String str = column.f8346e;
                        int i3 = this.f;
                        String str2 = this.f8346e;
                        if ((i3 != 1 || i2 != 2 || str2 == null || TableInfoKt.a(str2, str)) && ((i3 != 2 || i2 != 1 || str == null || TableInfoKt.a(str, str2)) && ((i3 == 0 || i3 != i2 || (str2 == null ? str == null : TableInfoKt.a(str2, str))) && this.g == column.g))) {
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (((((this.f8343a.hashCode() * 31) + this.g) * 31) + (this.f8345c ? 1231 : 1237)) * 31) + this.d;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
            sb.append(this.f8343a);
            sb.append("',\n            |   type = '");
            sb.append(this.f8344b);
            sb.append("',\n            |   affinity = '");
            sb.append(this.g);
            sb.append("',\n            |   notNull = '");
            sb.append(this.f8345c);
            sb.append("',\n            |   primaryKeyPosition = '");
            sb.append(this.d);
            sb.append("',\n            |   defaultValue = '");
            String str = this.f8346e;
            if (str == null) {
                str = AdError.UNDEFINED_DOMAIN;
            }
            sb.append(str);
            sb.append("'\n            |}\n        ");
            return StringsKt.B(StringsKt.d0(sb.toString()));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Landroidx/room/util/TableInfo$Companion;", "", "", "CREATED_FROM_UNKNOWN", "I", "CREATED_FROM_ENTITY", "CREATED_FROM_DATABASE", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/room/util/TableInfo$CreatedFrom;", "", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention
    public @interface CreatedFrom {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/util/TableInfo$ForeignKey;", "", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ForeignKey {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f8348b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f8349c;
        public final List d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List f8350e;

        public ForeignKey(String referenceTable, String onDelete, String onUpdate, List columnNames, List referenceColumnNames) {
            Intrinsics.f(referenceTable, "referenceTable");
            Intrinsics.f(onDelete, "onDelete");
            Intrinsics.f(onUpdate, "onUpdate");
            Intrinsics.f(columnNames, "columnNames");
            Intrinsics.f(referenceColumnNames, "referenceColumnNames");
            this.f8347a = referenceTable;
            this.f8348b = onDelete;
            this.f8349c = onUpdate;
            this.d = columnNames;
            this.f8350e = referenceColumnNames;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ForeignKey)) {
                return false;
            }
            ForeignKey foreignKey = (ForeignKey) obj;
            if (Intrinsics.a(this.f8347a, foreignKey.f8347a) && Intrinsics.a(this.f8348b, foreignKey.f8348b) && Intrinsics.a(this.f8349c, foreignKey.f8349c) && Intrinsics.a(this.d, foreignKey.d)) {
                return Intrinsics.a(this.f8350e, foreignKey.f8350e);
            }
            return false;
        }

        public final int hashCode() {
            return this.f8350e.hashCode() + a.c(androidx.datastore.preferences.protobuf.a.b(this.f8349c, androidx.datastore.preferences.protobuf.a.b(this.f8348b, this.f8347a.hashCode() * 31, 31), 31), 31, this.d);
        }

        public final String toString() {
            return StringsKt.B(StringsKt.d0("\n            |ForeignKey {\n            |   referenceTable = '" + this.f8347a + "',\n            |   onDelete = '" + this.f8348b + "',\n            |   onUpdate = '" + this.f8349c + "',\n            |   columnNames = {" + TableInfoKt.d(CollectionsKt.b0(this.d)) + "\n            |   referenceColumnNames = {" + TableInfoKt.c(CollectionsKt.b0(this.f8350e)) + "\n            |}\n        "));
        }
    }

    public TableInfo(String str, Map map, AbstractSet foreignKeys, AbstractSet abstractSet) {
        Intrinsics.f(foreignKeys, "foreignKeys");
        this.f8340a = str;
        this.f8341b = map;
        this.f8342c = foreignKeys;
        this.d = abstractSet;
    }

    public static final TableInfo a(FrameworkSQLiteDatabase frameworkSQLiteDatabase, String str) {
        Map mapD;
        SetBuilder setBuilderA;
        SupportSQLiteConnection supportSQLiteConnection = new SupportSQLiteConnection(frameworkSQLiteDatabase);
        SQLiteStatement sQLiteStatementR0 = supportSQLiteConnection.R0("PRAGMA table_info(`" + str + "`)");
        try {
            long j = 0;
            if (sQLiteStatementR0.P0()) {
                int iA = SQLiteStatementUtil.a(sQLiteStatementR0, "name");
                int iA2 = SQLiteStatementUtil.a(sQLiteStatementR0, "type");
                int iA3 = SQLiteStatementUtil.a(sQLiteStatementR0, "notnull");
                int iA4 = SQLiteStatementUtil.a(sQLiteStatementR0, "pk");
                int iA5 = SQLiteStatementUtil.a(sQLiteStatementR0, "dflt_value");
                MapBuilder mapBuilder = new MapBuilder();
                do {
                    String strY0 = sQLiteStatementR0.y0(iA);
                    mapBuilder.put(strY0, new Column((int) sQLiteStatementR0.getLong(iA4), strY0, sQLiteStatementR0.y0(iA2), sQLiteStatementR0.isNull(iA5) ? null : sQLiteStatementR0.y0(iA5), sQLiteStatementR0.getLong(iA3) != 0, 2));
                } while (sQLiteStatementR0.P0());
                mapD = mapBuilder.d();
                sQLiteStatementR0.close();
            } else {
                mapD = EmptyMap.X;
                sQLiteStatementR0.close();
            }
            SQLiteStatement sQLiteStatementR1 = supportSQLiteConnection.R0("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int iA6 = SQLiteStatementUtil.a(sQLiteStatementR1, "id");
                int iA7 = SQLiteStatementUtil.a(sQLiteStatementR1, "seq");
                int iA8 = SQLiteStatementUtil.a(sQLiteStatementR1, dc.f24777Q);
                int iA9 = SQLiteStatementUtil.a(sQLiteStatementR1, "on_delete");
                int iA10 = SQLiteStatementUtil.a(sQLiteStatementR1, "on_update");
                List listA = SchemaInfoUtilKt.a(sQLiteStatementR1);
                sQLiteStatementR1.reset();
                SetBuilder setBuilder = new SetBuilder();
                while (sQLiteStatementR1.P0()) {
                    if (sQLiteStatementR1.getLong(iA7) == j) {
                        int i2 = (int) sQLiteStatementR1.getLong(iA6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i3 = iA6;
                        ArrayList<ForeignKeyWithSequence> arrayList3 = new ArrayList();
                        for (Object obj : listA) {
                            int i4 = iA7;
                            List list = listA;
                            if (((ForeignKeyWithSequence) obj).X == i2) {
                                arrayList3.add(obj);
                            }
                            iA7 = i4;
                            listA = list;
                        }
                        int i5 = iA7;
                        List list2 = listA;
                        for (ForeignKeyWithSequence foreignKeyWithSequence : arrayList3) {
                            arrayList.add(foreignKeyWithSequence.Z);
                            arrayList2.add(foreignKeyWithSequence.e0);
                        }
                        setBuilder.add(new ForeignKey(sQLiteStatementR1.y0(iA8), sQLiteStatementR1.y0(iA9), sQLiteStatementR1.y0(iA10), arrayList, arrayList2));
                        iA6 = i3;
                        iA7 = i5;
                        listA = list2;
                        j = 0;
                    }
                }
                SetBuilder setBuilderA2 = SetsKt.a(setBuilder);
                sQLiteStatementR1.close();
                SQLiteStatement sQLiteStatementR2 = supportSQLiteConnection.R0("PRAGMA index_list(`" + str + "`)");
                try {
                    int iA11 = SQLiteStatementUtil.a(sQLiteStatementR2, "name");
                    int iA12 = SQLiteStatementUtil.a(sQLiteStatementR2, "origin");
                    int iA13 = SQLiteStatementUtil.a(sQLiteStatementR2, "unique");
                    if (iA11 != -1 && iA12 != -1 && iA13 != -1) {
                        SetBuilder setBuilder2 = new SetBuilder();
                        while (true) {
                            if (!sQLiteStatementR2.P0()) {
                                setBuilderA = SetsKt.a(setBuilder2);
                                sQLiteStatementR2.close();
                                break;
                            }
                            if ("c".equals(sQLiteStatementR2.y0(iA12))) {
                                Index indexB = SchemaInfoUtilKt.b(supportSQLiteConnection, sQLiteStatementR2.y0(iA11), sQLiteStatementR2.getLong(iA13) == 1);
                                if (indexB == null) {
                                    sQLiteStatementR2.close();
                                } else {
                                    setBuilder2.add(indexB);
                                }
                            }
                        }
                        return new TableInfo(str, mapD, setBuilderA2, setBuilderA);
                    }
                    sQLiteStatementR2.close();
                    setBuilderA = null;
                    return new TableInfo(str, mapD, setBuilderA2, setBuilderA);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AutoCloseableKt.a(sQLiteStatementR2, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    AutoCloseableKt.a(sQLiteStatementR1, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                AutoCloseableKt.a(sQLiteStatementR0, th5);
                throw th6;
            }
        }
    }

    public final boolean equals(Object obj) {
        AbstractSet abstractSet;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TableInfo)) {
            return false;
        }
        TableInfo tableInfo = (TableInfo) obj;
        if (!this.f8340a.equals(tableInfo.f8340a) || !this.f8341b.equals(tableInfo.f8341b) || !Intrinsics.a(this.f8342c, tableInfo.f8342c)) {
            return false;
        }
        AbstractSet abstractSet2 = this.d;
        if (abstractSet2 == null || (abstractSet = tableInfo.d) == null) {
            return true;
        }
        return abstractSet2.equals(abstractSet);
    }

    public final int hashCode() {
        return this.f8342c.hashCode() + ((this.f8341b.hashCode() + (this.f8340a.hashCode() * 31)) * 31);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(this.f8340a);
        sb.append("',\n            |    columns = {");
        sb.append(TableInfoKt.b(CollectionsKt.c0(new TableInfoKt$toStringCommon$$inlined$sortedBy$1(), this.f8341b.values())));
        sb.append("\n            |    foreignKeys = {");
        sb.append(TableInfoKt.b(this.f8342c));
        sb.append("\n            |    indices = {");
        AbstractSet abstractSet = this.d;
        sb.append(TableInfoKt.b(abstractSet != null ? CollectionsKt.c0(new TableInfoKt$toStringCommon$$inlined$sortedBy$2(), abstractSet) : EmptyList.X));
        sb.append("\n            |}\n        ");
        return StringsKt.d0(sb.toString());
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/room/util/TableInfo$Index;", "", "Companion", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Index {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f8352b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f8353c;
        public final List d;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/room/util/TableInfo$Index$Companion;", "", "", "DEFAULT_PREFIX", "Ljava/lang/String;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r4v2 */
        /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
        public Index(String name, List columns, List list, boolean z2) {
            Intrinsics.f(name, "name");
            Intrinsics.f(columns, "columns");
            this.f8351a = name;
            this.f8352b = z2;
            this.f8353c = columns;
            this.d = list;
            List arrayList = list;
            if (arrayList.isEmpty()) {
                int size = columns.size();
                arrayList = new ArrayList(size);
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.add("ASC");
                }
            }
            this.d = (List) arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Index) {
                Index index = (Index) obj;
                if (this.f8352b == index.f8352b && Intrinsics.a(this.f8353c, index.f8353c) && Intrinsics.a(this.d, index.d)) {
                    String str = this.f8351a;
                    boolean zM = StringsKt.M(str, "index_", false);
                    String str2 = index.f8351a;
                    return zM ? StringsKt.M(str2, "index_", false) : str.equals(str2);
                }
            }
            return false;
        }

        public final int hashCode() {
            String str = this.f8351a;
            return this.d.hashCode() + a.c((((StringsKt.M(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.f8352b ? 1 : 0)) * 31, 31, this.f8353c);
        }

        public final String toString() {
            return StringsKt.B(StringsKt.d0("\n            |Index {\n            |   name = '" + this.f8351a + "',\n            |   unique = '" + this.f8352b + "',\n            |   columns = {" + TableInfoKt.d(this.f8353c) + "\n            |   orders = {" + TableInfoKt.c(this.d) + "\n            |}\n        "));
        }

        public Index(String str, List columns) {
            Intrinsics.f(columns, "columns");
            int size = columns.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add("ASC");
            }
            this(str, columns, arrayList, false);
        }
    }
}
