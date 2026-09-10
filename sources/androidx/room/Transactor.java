package androidx.room;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/room/Transactor;", "Landroidx/room/PooledConnection;", "SQLiteTransactionType", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface Transactor extends PooledConnection {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/Transactor$SQLiteTransactionType;", "", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SQLiteTransactionType {
        public static final SQLiteTransactionType X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final SQLiteTransactionType f8253Y;
        public static final /* synthetic */ SQLiteTransactionType[] Z;
        public static final /* synthetic */ EnumEntries e0;

        static {
            SQLiteTransactionType sQLiteTransactionType = new SQLiteTransactionType("DEFERRED", 0);
            X = sQLiteTransactionType;
            SQLiteTransactionType sQLiteTransactionType2 = new SQLiteTransactionType("IMMEDIATE", 1);
            f8253Y = sQLiteTransactionType2;
            SQLiteTransactionType[] sQLiteTransactionTypeArr = {sQLiteTransactionType, sQLiteTransactionType2, new SQLiteTransactionType("EXCLUSIVE", 2)};
            Z = sQLiteTransactionTypeArr;
            e0 = EnumEntriesKt.a(sQLiteTransactionTypeArr);
        }

        public static SQLiteTransactionType valueOf(String str) {
            return (SQLiteTransactionType) Enum.valueOf(SQLiteTransactionType.class, str);
        }

        public static SQLiteTransactionType[] values() {
            return (SQLiteTransactionType[]) Z.clone();
        }
    }

    Object a(SQLiteTransactionType sQLiteTransactionType, Function2 function2, SuspendLambda suspendLambda);

    Boolean c(Continuation continuation);
}
