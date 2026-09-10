package androidx.room.util;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.TransactionElement;
import androidx.room.b;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"androidx/room/util/DBUtil__DBUtilKt", "androidx/room/util/DBUtil__DBUtil_androidKt"}, k = 4, mv = {2, 1, 0}, xi = 48)
public final class DBUtil {
    public static final CoroutineContext a(RoomDatabase roomDatabase, boolean z2, ContinuationImpl continuationImpl) {
        TransactionElement transactionElement = (TransactionElement) continuationImpl.getF45023Y().get(TransactionElement.f8251Y);
        CoroutineContext coroutineContext = transactionElement != null ? transactionElement.X : null;
        if (!roomDatabase.i()) {
            ContextScope contextScope = roomDatabase.f8217a;
            if (contextScope == null) {
                Intrinsics.m("coroutineScope");
                throw null;
            }
            if (coroutineContext == null) {
                coroutineContext = EmptyCoroutineContext.X;
            }
            return contextScope.X.plus(coroutineContext);
        }
        if (coroutineContext != null) {
            ContextScope contextScope2 = roomDatabase.f8217a;
            if (contextScope2 != null) {
                return contextScope2.X.plus(coroutineContext);
            }
            Intrinsics.m("coroutineScope");
            throw null;
        }
        if (z2) {
            CoroutineContext coroutineContext2 = roomDatabase.f8218b;
            if (coroutineContext2 != null) {
                return coroutineContext2;
            }
            Intrinsics.m("transactionContext");
            throw null;
        }
        ContextScope contextScope3 = roomDatabase.f8217a;
        if (contextScope3 != null) {
            return contextScope3.X;
        }
        Intrinsics.m("coroutineScope");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(boolean z2, b bVar, Continuation continuation) throws Throwable {
        DBUtil__DBUtil_androidKt$performSuspending$1 dBUtil__DBUtil_androidKt$performSuspending$1;
        if (continuation instanceof DBUtil__DBUtil_androidKt$performSuspending$1) {
            dBUtil__DBUtil_androidKt$performSuspending$1 = (DBUtil__DBUtil_androidKt$performSuspending$1) continuation;
            int i2 = dBUtil__DBUtil_androidKt$performSuspending$1.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dBUtil__DBUtil_androidKt$performSuspending$1.Z = i2 - Integer.MIN_VALUE;
            } else {
                dBUtil__DBUtil_androidKt$performSuspending$1 = new DBUtil__DBUtil_androidKt$performSuspending$1(continuation);
            }
        } else {
            dBUtil__DBUtil_androidKt$performSuspending$1 = new DBUtil__DBUtil_androidKt$performSuspending$1(continuation);
        }
        Object obj = dBUtil__DBUtil_androidKt$performSuspending$1.f8336Y;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = dBUtil__DBUtil_androidKt$performSuspending$1.Z;
        if (i3 == 0) {
            ResultKt.b(obj);
            throw null;
        }
        if (i3 == 1) {
            ResultKt.b(obj);
            return obj;
        }
        if (i3 != 2) {
            if (i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        Function1 function1 = dBUtil__DBUtil_androidKt$performSuspending$1.X;
        ResultKt.b(obj);
        DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1 dBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1 = new DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1(null, null, function1, false);
        dBUtil__DBUtil_androidKt$performSuspending$1.X = null;
        dBUtil__DBUtil_androidKt$performSuspending$1.Z = 3;
        Object objF = BuildersKt.f((CoroutineContext) obj, dBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1, dBUtil__DBUtil_androidKt$performSuspending$1);
        return objF == coroutineSingletons ? coroutineSingletons : objF;
    }

    public static final Cursor c(RoomDatabase db, RoomSQLiteQuery roomSQLiteQuery, boolean z2) throws IOException {
        Intrinsics.f(db, "db");
        db.a();
        db.b();
        Cursor c2 = db.h().getWritableDatabase().V(roomSQLiteQuery);
        if (z2 && (c2 instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) c2;
            int count = abstractWindowedCursor.getCount();
            if ((abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) {
                Intrinsics.f(c2, "c");
                try {
                    MatrixCursor matrixCursor = new MatrixCursor(c2.getColumnNames(), c2.getCount());
                    while (c2.moveToNext()) {
                        Object[] objArr = new Object[c2.getColumnCount()];
                        int columnCount = c2.getColumnCount();
                        for (int i2 = 0; i2 < columnCount; i2++) {
                            int type = c2.getType(i2);
                            if (type == 0) {
                                objArr[i2] = null;
                            } else if (type == 1) {
                                objArr[i2] = Long.valueOf(c2.getLong(i2));
                            } else if (type == 2) {
                                objArr[i2] = Double.valueOf(c2.getDouble(i2));
                            } else if (type == 3) {
                                objArr[i2] = c2.getString(i2);
                            } else {
                                if (type != 4) {
                                    throw new IllegalStateException();
                                }
                                objArr[i2] = c2.getBlob(i2);
                            }
                        }
                        matrixCursor.addRow(objArr);
                    }
                    c2.close();
                    return matrixCursor;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.a(c2, th);
                        throw th2;
                    }
                }
            }
        }
        return c2;
    }
}
