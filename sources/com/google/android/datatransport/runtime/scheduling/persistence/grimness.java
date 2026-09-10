package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;
import javax.inject.Singleton;

/* JADX INFO: compiled from: SQLiteEventStore.java */
/* JADX INFO: loaded from: classes2.dex */
@Singleton
public class grimness implements com.google.android.datatransport.runtime.scheduling.persistence.wireman, cocoon.attabal, com.google.android.datatransport.runtime.scheduling.persistence.dern {

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public static final staphylococcal.dern f19343graveside = staphylococcal.dern.saneness("proto");

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final bramley.attabal f19344arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final splinterproof f19345kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final Provider<String> f19346molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final bramley.attabal f19347monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final marial f19348polloi;

    /* JADX INFO: compiled from: SQLiteEventStore.java */
    public static class dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final String f19349attabal;
        final String value;

        public dern(String str, String str2) {
            this.f19349attabal = str;
            this.value = str2;
        }
    }

    /* JADX INFO: compiled from: SQLiteEventStore.java */
    public interface saneness<T, U> {
        U apply(T t);
    }

    /* JADX INFO: compiled from: SQLiteEventStore.java */
    public interface wireman<T> {
        T attabal();
    }

    @Inject
    public grimness(bramley.attabal attabalVar, bramley.attabal attabalVar2, marial marialVar, splinterproof splinterproofVar, @Named("PACKAGE_NAME") Provider<String> provider) {
        this.f19345kowloon = splinterproofVar;
        this.f19344arytenoidectomy = attabalVar;
        this.f19347monoploid = attabalVar2;
        this.f19348polloi = marialVar;
        this.f19346molybdenite = provider;
    }

    public static /* synthetic */ List arytenoidectomy(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(lehua.arytenoidectomy.attabal().saneness(cursor.getString(1)).wireman(delphology.attabal.saneness(cursor.getInt(2))).dern(technofreak(cursor.getString(3))).attabal());
        }
        return arrayList;
    }

    public static <T> T attendance(Cursor cursor, saneness<Cursor, T> sanenessVar) {
        try {
            return sanenessVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static /* synthetic */ Long coi(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    public static /* synthetic */ Object creditor(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    public static /* synthetic */ Object cuirassed(final grimness grimnessVar, String str, String str2, SQLiteDatabase sQLiteDatabase) {
        grimnessVar.getClass();
        sQLiteDatabase.compileStatement(str).execute();
        attendance(sQLiteDatabase.rawQuery(str2, null), new saneness() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.dovishness
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.grimness.saneness
            public final Object apply(Object obj) {
                return grimness.monoploid(this.f19337attabal, (Cursor) obj);
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    public static /* synthetic */ nucleosidase.marial cutely(long j, Cursor cursor) {
        cursor.moveToNext();
        return nucleosidase.marial.dern().dern(cursor.getLong(0)).saneness(j).attabal();
    }

    public static /* synthetic */ nucleosidase.marial czestochowa(final long j, SQLiteDatabase sQLiteDatabase) {
        return (nucleosidase.marial) attendance(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new saneness() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.oilcan
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.grimness.saneness
            public final Object apply(Object obj) {
                return grimness.cutely(j, (Cursor) obj);
            }
        });
    }

    public static /* synthetic */ Object dent(Throwable th) {
        throw new SynchronizationException("Timed out while trying to acquire the lock.", th);
    }

    public static /* synthetic */ SQLiteDatabase dovishness(Throwable th) {
        throw new SynchronizationException("Timed out while trying to open db.", th);
    }

    public static /* synthetic */ List formularize(grimness grimnessVar, lehua.arytenoidectomy arytenoidectomyVar, SQLiteDatabase sQLiteDatabase) {
        List<apical> listHardpan = grimnessVar.hardpan(sQLiteDatabase, arytenoidectomyVar, grimnessVar.f19348polloi.wireman());
        for (Priority priority : Priority.values()) {
            if (priority != arytenoidectomyVar.wireman()) {
                int iWireman = grimnessVar.f19348polloi.wireman() - listHardpan.size();
                if (iWireman <= 0) {
                    break;
                }
                listHardpan.addAll(grimnessVar.hardpan(sQLiteDatabase, arytenoidectomyVar.beachfront(priority), iWireman));
            }
        }
        return grimnessVar.claque(listHardpan, grimnessVar.herdbook(sQLiteDatabase, listHardpan));
    }

    public static /* synthetic */ Integer itchy(final grimness grimnessVar, long j, SQLiteDatabase sQLiteDatabase) {
        grimnessVar.getClass();
        String[] strArr = {String.valueOf(j)};
        attendance(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new saneness() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.molybdenite
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.grimness.saneness
            public final Object apply(Object obj) {
                return grimness.rotuma(this.f19358attabal, (Cursor) obj);
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    public static /* synthetic */ Boolean kattegat(grimness grimnessVar, lehua.arytenoidectomy arytenoidectomyVar, SQLiteDatabase sQLiteDatabase) {
        Long lJulian = grimnessVar.julian(sQLiteDatabase, arytenoidectomyVar);
        return lJulian == null ? Boolean.FALSE : (Boolean) attendance(grimnessVar.gusty().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lJulian.toString()}), new saneness() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.adultoid
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.grimness.saneness
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    public static /* synthetic */ Object lerp(grimness grimnessVar, List list, lehua.arytenoidectomy arytenoidectomyVar, Cursor cursor) {
        grimnessVar.getClass();
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            boolean z = cursor.getInt(7) != 0;
            lehua.taiyuan.attabal attabalVarKowloon = lehua.taiyuan.attabal().triweekly(cursor.getString(1)).taiyuan(cursor.getLong(2)).kowloon(cursor.getLong(3));
            if (z) {
                attabalVarKowloon.impromptu(new lehua.impromptu(setterwort(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                attabalVarKowloon.impromptu(new lehua.impromptu(setterwort(cursor.getString(4)), grimnessVar.dhss(j)));
            }
            if (!cursor.isNull(6)) {
                attabalVarKowloon.competently(Integer.valueOf(cursor.getInt(6)));
            }
            if (!cursor.isNull(8)) {
                attabalVarKowloon.formularize(Integer.valueOf(cursor.getInt(8)));
            }
            if (!cursor.isNull(9)) {
                attabalVarKowloon.impassible(cursor.getString(9));
            }
            if (!cursor.isNull(10)) {
                attabalVarKowloon.cutely(cursor.getBlob(10));
            }
            if (!cursor.isNull(11)) {
                attabalVarKowloon.apical(cursor.getBlob(11));
            }
            list.add(apical.attabal(j, arytenoidectomyVar, attabalVarKowloon.wireman()));
        }
        return null;
    }

    public static String mastfed(Iterable<apical> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<apical> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().dern());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static /* synthetic */ byte[] merc(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int length = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            length += blob.length;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            byte[] bArr2 = (byte[]) arrayList.get(i);
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    public static /* synthetic */ Object milliradian(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j = cursor.getLong(0);
            Set hashSet = (Set) map.get(Long.valueOf(j));
            if (hashSet == null) {
                hashSet = new HashSet();
                map.put(Long.valueOf(j), hashSet);
            }
            hashSet.add(new dern(cursor.getString(1), cursor.getString(2)));
        }
    }

    public static /* synthetic */ Object monoploid(grimness grimnessVar, Cursor cursor) {
        grimnessVar.getClass();
        while (cursor.moveToNext()) {
            grimnessVar.marial(cursor.getInt(0), LogEventDropped.Reason.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    public static /* synthetic */ Object nosophobia(grimness grimnessVar, SQLiteDatabase sQLiteDatabase) {
        grimnessVar.getClass();
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + grimnessVar.f19344arytenoidectomy.attabal()).execute();
        return null;
    }

    public static /* synthetic */ List polder(SQLiteDatabase sQLiteDatabase) {
        return (List) attendance(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new saneness() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.polder
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.grimness.saneness
            public final Object apply(Object obj) {
                return grimness.arytenoidectomy((Cursor) obj);
            }
        });
    }

    public static /* synthetic */ Long privatdozent(grimness grimnessVar, lehua.taiyuan taiyuanVar, lehua.arytenoidectomy arytenoidectomyVar, SQLiteDatabase sQLiteDatabase) {
        if (grimnessVar.unconsolidated()) {
            grimnessVar.marial(1L, LogEventDropped.Reason.CACHE_FULL, taiyuanVar.triweekly());
            return -1L;
        }
        long jWostteth = grimnessVar.wostteth(sQLiteDatabase, arytenoidectomyVar);
        int iMarial = grimnessVar.f19348polloi.marial();
        byte[] bArrAttabal = taiyuanVar.marial().attabal();
        boolean z = bArrAttabal.length <= iMarial;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(jWostteth));
        contentValues.put("transport_name", taiyuanVar.triweekly());
        contentValues.put("timestamp_ms", Long.valueOf(taiyuanVar.beachfront()));
        contentValues.put("uptime_ms", Long.valueOf(taiyuanVar.kowloon()));
        contentValues.put("payload_encoding", taiyuanVar.marial().saneness().attabal());
        contentValues.put("code", taiyuanVar.wireman());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z));
        contentValues.put("payload", z ? bArrAttabal : new byte[0]);
        contentValues.put("product_id", taiyuanVar.formularize());
        contentValues.put("pseudonymous_id", taiyuanVar.impassible());
        contentValues.put("experiment_ids_clear_blob", taiyuanVar.competently());
        contentValues.put("experiment_ids_encrypted_blob", taiyuanVar.impromptu());
        long jInsert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z) {
            int iCeil = (int) Math.ceil(((double) bArrAttabal.length) / ((double) iMarial));
            for (int i = 1; i <= iCeil; i++) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrAttabal, (i - 1) * iMarial, Math.min(i * iMarial, bArrAttabal.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(jInsert));
                contentValues2.put("sequence_num", Integer.valueOf(i));
                contentValues2.put("bytes", bArrCopyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry<String, String> entry : taiyuanVar.apical().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(jInsert));
            contentValues3.put("name", entry.getKey());
            contentValues3.put("value", entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(jInsert);
    }

    public static /* synthetic */ Object restrictive(long j, lehua.arytenoidectomy arytenoidectomyVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{arytenoidectomyVar.saneness(), String.valueOf(delphology.attabal.attabal(arytenoidectomyVar.wireman()))}) < 1) {
            contentValues.put("backend_name", arytenoidectomyVar.saneness());
            contentValues.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, Integer.valueOf(delphology.attabal.attabal(arytenoidectomyVar.wireman())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    public static /* synthetic */ Object rotuma(grimness grimnessVar, Cursor cursor) {
        grimnessVar.getClass();
        while (cursor.moveToNext()) {
            grimnessVar.marial(cursor.getInt(0), LogEventDropped.Reason.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    public static /* synthetic */ nucleosidase.attabal sayid(final grimness grimnessVar, String str, final Map map, final nucleosidase.attabal.C0754attabal c0754attabal, SQLiteDatabase sQLiteDatabase) {
        grimnessVar.getClass();
        return (nucleosidase.attabal) attendance(sQLiteDatabase.rawQuery(str, new String[0]), new saneness() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.cuirassed
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.grimness.saneness
            public final Object apply(Object obj) {
                return grimness.seminary(this.f19333attabal, map, c0754attabal, (Cursor) obj);
            }
        });
    }

    public static /* synthetic */ nucleosidase.attabal seminary(grimness grimnessVar, Map map, nucleosidase.attabal.C0754attabal c0754attabal, Cursor cursor) {
        grimnessVar.getClass();
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            LogEventDropped.Reason reasonUnderbelly = grimnessVar.underbelly(cursor.getInt(1));
            long j = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(LogEventDropped.dern().dern(reasonUnderbelly).saneness(j).attabal());
        }
        grimnessVar.outmarry(c0754attabal, map);
        return c0754attabal.marial(grimnessVar.monroe()).wireman(grimnessVar.picketboat()).dern(grimnessVar.f19346molybdenite.get()).saneness();
    }

    public static staphylococcal.dern setterwort(String str) {
        return str == null ? f19343graveside : staphylococcal.dern.saneness(str);
    }

    public static /* synthetic */ Long starveling(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    public static byte[] technofreak(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    public static /* synthetic */ Object timberyard(String str, LogEventDropped.Reason reason, long j, SQLiteDatabase sQLiteDatabase) {
        if (((Boolean) attendance(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(reason.getNumber())}), new saneness() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.preprohormone
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.grimness.saneness
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).getCount() > 0);
            }
        })).booleanValue()) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(reason.getNumber())});
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("log_source", str);
        contentValues.put("reason", Integer.valueOf(reason.getNumber()));
        contentValues.put("events_dropped_count", Long.valueOf(j));
        sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        return null;
    }

    public <T> T achondroplasia(saneness<SQLiteDatabase, T> sanenessVar) {
        SQLiteDatabase sQLiteDatabaseGusty = gusty();
        sQLiteDatabaseGusty.beginTransaction();
        try {
            T tApply = sanenessVar.apply(sQLiteDatabaseGusty);
            sQLiteDatabaseGusty.setTransactionSuccessful();
            return tApply;
        } finally {
            sQLiteDatabaseGusty.endTransaction();
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.wireman
    public Iterable<lehua.arytenoidectomy> adultoid() {
        return (Iterable) achondroplasia(new saneness() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.kattegat
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.grimness.saneness
            public final Object apply(Object obj) {
                return grimness.polder((SQLiteDatabase) obj);
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.dern
    public void attabal() {
        achondroplasia(new saneness() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.monoploid
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.grimness.saneness
            public final Object apply(Object obj) {
                return grimness.nosophobia(this.f19359attabal, (SQLiteDatabase) obj);
            }
        });
    }

    public final List<apical> claque(List<apical> list, Map<Long, Set<dern>> map) {
        ListIterator<apical> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            apical next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.dern()))) {
                lehua.taiyuan.attabal attabalVarArytenoidectomy = next.saneness().arytenoidectomy();
                for (dern dernVar : map.get(Long.valueOf(next.dern()))) {
                    attabalVarArytenoidectomy.dern(dernVar.f19349attabal, dernVar.value);
                }
                listIterator.set(apical.attabal(next.dern(), next.wireman(), attabalVarArytenoidectomy.wireman()));
            }
        }
        return list;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f19345kowloon.close();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.wireman
    public int competently() {
        final long jAttabal = this.f19344arytenoidectomy.attabal() - this.f19348polloi.dern();
        return ((Integer) achondroplasia(new saneness() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.merc
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.grimness.saneness
            public final Object apply(Object obj) {
                return grimness.itchy(this.f19356attabal, jAttabal, (SQLiteDatabase) obj);
            }
        })).intValue();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.dern
    public nucleosidase.attabal dern() {
        final nucleosidase.attabal.C0754attabal c0754attabalMarial = nucleosidase.attabal.marial();
        final HashMap map = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (nucleosidase.attabal) achondroplasia(new saneness() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.graveside
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.grimness.saneness
            public final Object apply(Object obj) {
                return grimness.sayid(this.f19339attabal, str, map, c0754attabalMarial, (SQLiteDatabase) obj);
            }
        });
    }

    public final byte[] dhss(long j) {
        return (byte[]) attendance(gusty().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num"), new saneness() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.stratoscope
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.grimness.saneness
            public final Object apply(Object obj) {
                return grimness.merc((Cursor) obj);
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.wireman
    public void graveside(final lehua.arytenoidectomy arytenoidectomyVar, final long j) {
        achondroplasia(new saneness() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.arytenoidectomy
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.grimness.saneness
            public final Object apply(Object obj) {
                return grimness.restrictive(j, arytenoidectomyVar, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.wireman
    public long grimness(lehua.arytenoidectomy arytenoidectomyVar) {
        return ((Long) attendance(gusty().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{arytenoidectomyVar.saneness(), String.valueOf(delphology.attabal.attabal(arytenoidectomyVar.wireman()))}), new saneness() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.supplicat
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.grimness.saneness
            public final Object apply(Object obj) {
                return grimness.coi((Cursor) obj);
            }
        })).longValue();
    }

    public SQLiteDatabase gusty() {
        final splinterproof splinterproofVar = this.f19345kowloon;
        Objects.requireNonNull(splinterproofVar);
        return (SQLiteDatabase) vesuvio(new wireman() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.yemenite
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.grimness.wireman
            public final Object attabal() {
                return splinterproofVar.getWritableDatabase();
            }
        }, new saneness() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.sealless
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.grimness.saneness
            public final Object apply(Object obj) {
                return grimness.dovishness((Throwable) obj);
            }
        });
    }

    public final List<apical> hardpan(SQLiteDatabase sQLiteDatabase, final lehua.arytenoidectomy arytenoidectomyVar, int i) {
        final ArrayList arrayList = new ArrayList();
        Long lJulian = julian(sQLiteDatabase, arytenoidectomyVar);
        if (lJulian == null) {
            return arrayList;
        }
        attendance(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{lJulian.toString()}, null, null, null, String.valueOf(i)), new saneness() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.rotuma
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.grimness.saneness
            public final Object apply(Object obj) {
                return grimness.lerp(this.f19370attabal, arrayList, arytenoidectomyVar, (Cursor) obj);
            }
        });
        return arrayList;
    }

    public final Map<Long, Set<dern>> herdbook(SQLiteDatabase sQLiteDatabase, List<apical> list) {
        final HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).dern());
            if (i < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        attendance(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null), new saneness() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.cord
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.grimness.saneness
            public final Object apply(Object obj) {
                return grimness.milliradian(map, (Cursor) obj);
            }
        });
        return map;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.wireman
    public void hydrovane(Iterable<apical> iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + mastfed(iterable);
            final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
            achondroplasia(new saneness() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.seminary
                @Override // com.google.android.datatransport.runtime.scheduling.persistence.grimness.saneness
                public final Object apply(Object obj) {
                    return grimness.cuirassed(this.f19381attabal, str, str2, (SQLiteDatabase) obj);
                }
            });
        }
    }

    public long igbo() {
        return palmyra() * lightstruck();
    }

    public final Long julian(SQLiteDatabase sQLiteDatabase, lehua.arytenoidectomy arytenoidectomyVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(arytenoidectomyVar.saneness(), String.valueOf(delphology.attabal.attabal(arytenoidectomyVar.wireman()))));
        if (arytenoidectomyVar.dern() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(arytenoidectomyVar.dern(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) attendance(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new saneness() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.triweekly
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.grimness.saneness
            public final Object apply(Object obj) {
                return grimness.starveling((Cursor) obj);
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.wireman
    public apical kowloon(final lehua.arytenoidectomy arytenoidectomyVar, final lehua.taiyuan taiyuanVar) {
        unliveable.attabal.dern("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", arytenoidectomyVar.wireman(), taiyuanVar.triweekly(), arytenoidectomyVar.saneness());
        long jLongValue = ((Long) achondroplasia(new saneness() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.restrictive
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.grimness.saneness
            public final Object apply(Object obj) {
                return grimness.privatdozent(this.f19367attabal, taiyuanVar, arytenoidectomyVar, (SQLiteDatabase) obj);
            }
        })).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return apical.attabal(jLongValue, arytenoidectomyVar, taiyuanVar);
    }

    public final long lightstruck() {
        return gusty().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.dern
    public void marial(final long j, final LogEventDropped.Reason reason, final String str) {
        achondroplasia(new saneness() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.polloi
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.grimness.saneness
            public final Object apply(Object obj) {
                return grimness.timberyard(str, reason, j, (SQLiteDatabase) obj);
            }
        });
    }

    public final nucleosidase.marial monroe() {
        final long jAttabal = this.f19344arytenoidectomy.attabal();
        return (nucleosidase.marial) achondroplasia(new saneness() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.trm
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.grimness.saneness
            public final Object apply(Object obj) {
                return grimness.czestochowa(jAttabal, (SQLiteDatabase) obj);
            }
        });
    }

    public final void outmarry(nucleosidase.attabal.C0754attabal c0754attabal, Map<String, List<LogEventDropped>> map) {
        for (Map.Entry<String, List<LogEventDropped>> entry : map.entrySet()) {
            c0754attabal.attabal(nucleosidase.dern.dern().dern(entry.getKey()).saneness(entry.getValue()).attabal());
        }
    }

    public final long palmyra() {
        return gusty().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    public final nucleosidase.saneness picketboat() {
        return nucleosidase.saneness.saneness().saneness(nucleosidase.wireman.dern().saneness(igbo()).dern(marial.f19355attabal.beachfront()).attabal()).attabal();
    }

    public final void preterite(final SQLiteDatabase sQLiteDatabase) {
        vesuvio(new wireman() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.formularize
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.grimness.wireman
            public final Object attabal() {
                return grimness.creditor(sQLiteDatabase);
            }
        }, new saneness() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.gintrap
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.grimness.saneness
            public final Object apply(Object obj) {
                return grimness.dent((Throwable) obj);
            }
        });
    }

    @Override // cocoon.attabal
    public <T> T saneness(cocoon.attabal.InterfaceC0142attabal<T> interfaceC0142attabal) {
        SQLiteDatabase sQLiteDatabaseGusty = gusty();
        preterite(sQLiteDatabaseGusty);
        try {
            T tExecute = interfaceC0142attabal.execute();
            sQLiteDatabaseGusty.setTransactionSuccessful();
            return tExecute;
        } finally {
            sQLiteDatabaseGusty.endTransaction();
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.wireman
    public Iterable<apical> sealless(final lehua.arytenoidectomy arytenoidectomyVar) {
        return (Iterable) achondroplasia(new saneness() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.impassible
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.grimness.saneness
            public final Object apply(Object obj) {
                return grimness.formularize(this.f19350attabal, arytenoidectomyVar, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.wireman
    public void taiyuan(Iterable<apical> iterable) {
        if (iterable.iterator().hasNext()) {
            gusty().compileStatement("DELETE FROM events WHERE _id in " + mastfed(iterable)).execute();
        }
    }

    public final boolean unconsolidated() {
        return palmyra() * lightstruck() >= this.f19348polloi.beachfront();
    }

    public final LogEventDropped.Reason underbelly(int i) {
        LogEventDropped.Reason reason = LogEventDropped.Reason.REASON_UNKNOWN;
        if (i == reason.getNumber()) {
            return reason;
        }
        LogEventDropped.Reason reason2 = LogEventDropped.Reason.MESSAGE_TOO_OLD;
        if (i == reason2.getNumber()) {
            return reason2;
        }
        LogEventDropped.Reason reason3 = LogEventDropped.Reason.CACHE_FULL;
        if (i == reason3.getNumber()) {
            return reason3;
        }
        LogEventDropped.Reason reason4 = LogEventDropped.Reason.PAYLOAD_TOO_BIG;
        if (i == reason4.getNumber()) {
            return reason4;
        }
        LogEventDropped.Reason reason5 = LogEventDropped.Reason.MAX_RETRIES_REACHED;
        if (i == reason5.getNumber()) {
            return reason5;
        }
        LogEventDropped.Reason reason6 = LogEventDropped.Reason.INVALID_PAYLOD;
        if (i == reason6.getNumber()) {
            return reason6;
        }
        LogEventDropped.Reason reason7 = LogEventDropped.Reason.SERVER_ERROR;
        if (i == reason7.getNumber()) {
            return reason7;
        }
        unliveable.attabal.saneness("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i));
        return reason;
    }

    public final <T> T vesuvio(wireman<T> wiremanVar, saneness<Throwable, T> sanenessVar) {
        long jAttabal = this.f19347monoploid.attabal();
        while (true) {
            try {
                return wiremanVar.attabal();
            } catch (SQLiteDatabaseLockedException e) {
                if (this.f19347monoploid.attabal() >= ((long) this.f19348polloi.saneness()) + jAttabal) {
                    return sanenessVar.apply(e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.wireman
    public boolean wireman(final lehua.arytenoidectomy arytenoidectomyVar) {
        return ((Boolean) achondroplasia(new saneness() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.kowloon
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.grimness.saneness
            public final Object apply(Object obj) {
                return grimness.kattegat(this.f19353attabal, arytenoidectomyVar, (SQLiteDatabase) obj);
            }
        })).booleanValue();
    }

    public final long wostteth(SQLiteDatabase sQLiteDatabase, lehua.arytenoidectomy arytenoidectomyVar) {
        Long lJulian = julian(sQLiteDatabase, arytenoidectomyVar);
        if (lJulian != null) {
            return lJulian.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", arytenoidectomyVar.saneness());
        contentValues.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, Integer.valueOf(delphology.attabal.attabal(arytenoidectomyVar.wireman())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (arytenoidectomyVar.dern() != null) {
            contentValues.put(HandleInvocationsFromAdViewer.KEY_EXTRAS, Base64.encodeToString(arytenoidectomyVar.dern(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }
}
