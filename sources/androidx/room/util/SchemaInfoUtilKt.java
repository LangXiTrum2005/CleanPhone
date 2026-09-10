package androidx.room.util;

import androidx.sqlite.SQLiteStatement;
import androidx.sqlite.driver.SupportSQLiteConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.jdk7.AutoCloseableKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"room-runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class SchemaInfoUtilKt {
    public static final List a(SQLiteStatement sQLiteStatement) {
        int iA = SQLiteStatementUtil.a(sQLiteStatement, "id");
        int iA2 = SQLiteStatementUtil.a(sQLiteStatement, "seq");
        int iA3 = SQLiteStatementUtil.a(sQLiteStatement, "from");
        int iA4 = SQLiteStatementUtil.a(sQLiteStatement, "to");
        ListBuilder listBuilderP = CollectionsKt.p();
        while (sQLiteStatement.P0()) {
            listBuilderP.add(new ForeignKeyWithSequence((int) sQLiteStatement.getLong(iA), (int) sQLiteStatement.getLong(iA2), sQLiteStatement.y0(iA3), sQLiteStatement.y0(iA4)));
        }
        return CollectionsKt.b0(CollectionsKt.m(listBuilderP));
    }

    public static final TableInfo.Index b(SupportSQLiteConnection supportSQLiteConnection, String str, boolean z2) throws Exception {
        SQLiteStatement sQLiteStatementR0 = supportSQLiteConnection.R0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int iA = SQLiteStatementUtil.a(sQLiteStatementR0, "seqno");
            int iA2 = SQLiteStatementUtil.a(sQLiteStatementR0, "cid");
            int iA3 = SQLiteStatementUtil.a(sQLiteStatementR0, "name");
            int iA4 = SQLiteStatementUtil.a(sQLiteStatementR0, "desc");
            if (iA != -1 && iA2 != -1 && iA3 != -1 && iA4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (sQLiteStatementR0.P0()) {
                    if (((int) sQLiteStatementR0.getLong(iA2)) >= 0) {
                        int i2 = (int) sQLiteStatementR0.getLong(iA);
                        String strY0 = sQLiteStatementR0.y0(iA3);
                        String str2 = sQLiteStatementR0.getLong(iA4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i2), strY0);
                        linkedHashMap2.put(Integer.valueOf(i2), str2);
                    }
                }
                List listC0 = CollectionsKt.c0(new SchemaInfoUtilKt$readIndex$lambda$13$$inlined$sortedBy$1(), linkedHashMap.entrySet());
                ArrayList arrayList = new ArrayList(CollectionsKt.n(listC0, 10));
                Iterator it = listC0.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List listI0 = CollectionsKt.i0(arrayList);
                List listC1 = CollectionsKt.c0(new SchemaInfoUtilKt$readIndex$lambda$13$$inlined$sortedBy$2(), linkedHashMap2.entrySet());
                ArrayList arrayList2 = new ArrayList(CollectionsKt.n(listC1, 10));
                Iterator it2 = listC1.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                TableInfo.Index index = new TableInfo.Index(str, listI0, CollectionsKt.i0(arrayList2), z2);
                sQLiteStatementR0.close();
                return index;
            }
            sQLiteStatementR0.close();
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AutoCloseableKt.a(sQLiteStatementR0, th);
                throw th2;
            }
        }
    }
}
