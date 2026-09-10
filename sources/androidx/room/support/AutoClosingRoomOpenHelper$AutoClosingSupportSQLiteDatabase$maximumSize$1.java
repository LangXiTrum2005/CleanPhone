package androidx.room.support;

import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$maximumSize$1 extends PropertyReference1Impl {
    public static final AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$maximumSize$1 X = new AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$maximumSize$1("maximumSize", SupportSQLiteDatabase.class, "getMaximumSize()J");

    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
    public final Object get(Object obj) {
        return Long.valueOf(((SupportSQLiteDatabase) obj).p0());
    }
}
