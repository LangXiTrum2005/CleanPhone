package androidx.room.support;

import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isReadOnly$1 extends PropertyReference1Impl {
    public static final AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isReadOnly$1 X = new AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isReadOnly$1("isReadOnly", SupportSQLiteDatabase.class, "isReadOnly()Z");

    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
    public final Object get(Object obj) {
        return Boolean.valueOf(((SupportSQLiteDatabase) obj).i0());
    }
}
