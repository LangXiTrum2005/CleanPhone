package androidx.room;

import androidx.sqlite.db.SupportSQLiteOpenHelper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class RoomDatabase$closeBarrier$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws Exception {
        RoomDatabase roomDatabase = (RoomDatabase) this.receiver;
        ContextScope contextScope = roomDatabase.f8217a;
        if (contextScope == null) {
            Intrinsics.m("coroutineScope");
            throw null;
        }
        CoroutineScopeKt.c(contextScope, null);
        MultiInstanceInvalidationClient multiInstanceInvalidationClient = roomDatabase.g().f8186i;
        if (multiInstanceInvalidationClient != null) {
            multiInstanceInvalidationClient.a();
        }
        RoomConnectionManager roomConnectionManager = roomDatabase.f8220e;
        if (roomConnectionManager == null) {
            Intrinsics.m("connectionManager");
            throw null;
        }
        roomConnectionManager.f8214b.close();
        SupportSQLiteOpenHelper supportSQLiteOpenHelper = roomConnectionManager.f8215c;
        if (supportSQLiteOpenHelper != null) {
            supportSQLiteOpenHelper.close();
        }
        return Unit.f43263a;
    }
}
