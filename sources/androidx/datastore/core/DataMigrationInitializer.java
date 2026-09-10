package androidx.datastore.core;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/datastore/core/DataMigrationInitializer;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Companion", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DataMigrationInitializer<T> {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/datastore/core/DataMigrationInitializer$Companion;", "", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Code duplicated, block: B:27:0x006d  */
        /* JADX WARN: Code duplicated, block: B:37:0x0093  */
        /* JADX WARN: Code duplicated, block: B:39:0x0096  */
        /* JADX WARN: Code duplicated, block: B:43:0x0095 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x0067->B:45:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0084 -> B:25:0x0067). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0087 -> B:25:0x0067). Please report as a decompilation issue!!! */
        public static final Object a(List list, InitializerApi initializerApi, ContinuationImpl continuationImpl) throws Throwable {
            DataMigrationInitializer$Companion$runMigrations$1 dataMigrationInitializer$Companion$runMigrations$1;
            List list2;
            Ref.ObjectRef objectRef;
            Iterator<T> it;
            Throwable th;
            Function1 function1;
            if (continuationImpl instanceof DataMigrationInitializer$Companion$runMigrations$1) {
                dataMigrationInitializer$Companion$runMigrations$1 = (DataMigrationInitializer$Companion$runMigrations$1) continuationImpl;
                int i2 = dataMigrationInitializer$Companion$runMigrations$1.e0;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    dataMigrationInitializer$Companion$runMigrations$1.e0 = i2 - Integer.MIN_VALUE;
                } else {
                    dataMigrationInitializer$Companion$runMigrations$1 = new DataMigrationInitializer$Companion$runMigrations$1(continuationImpl);
                }
            } else {
                dataMigrationInitializer$Companion$runMigrations$1 = new DataMigrationInitializer$Companion$runMigrations$1(continuationImpl);
            }
            Object obj = dataMigrationInitializer$Companion$runMigrations$1.Z;
            Object obj2 = CoroutineSingletons.X;
            int i3 = dataMigrationInitializer$Companion$runMigrations$1.e0;
            if (i3 != 0) {
                if (i3 == 1) {
                    list2 = (List) dataMigrationInitializer$Companion$runMigrations$1.X;
                    ResultKt.b(obj);
                } else {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = dataMigrationInitializer$Companion$runMigrations$1.f4602Y;
                    objectRef = (Ref.ObjectRef) dataMigrationInitializer$Companion$runMigrations$1.X;
                    try {
                        ResultKt.b(obj);
                    } catch (Throwable th2) {
                        Object obj3 = objectRef.X;
                        if (obj3 == null) {
                            objectRef.X = th2;
                        } else {
                            ExceptionsKt.a((Throwable) obj3, th2);
                        }
                    }
                }
                while (it.hasNext()) {
                    function1 = (Function1) it.next();
                    dataMigrationInitializer$Companion$runMigrations$1.X = objectRef;
                    dataMigrationInitializer$Companion$runMigrations$1.f4602Y = it;
                    dataMigrationInitializer$Companion$runMigrations$1.e0 = 2;
                    if (function1.invoke(dataMigrationInitializer$Companion$runMigrations$1) == obj2) {
                        return obj2;
                    }
                }
                th = (Throwable) objectRef.X;
                if (th == null) {
                    return Unit.f43263a;
                }
                throw th;
            }
            ResultKt.b(obj);
            ArrayList arrayList = new ArrayList();
            Function2 dataMigrationInitializer$Companion$runMigrations$2 = new DataMigrationInitializer$Companion$runMigrations$2(list, arrayList, null);
            dataMigrationInitializer$Companion$runMigrations$1.X = arrayList;
            dataMigrationInitializer$Companion$runMigrations$1.e0 = 1;
            if (initializerApi.a(dataMigrationInitializer$Companion$runMigrations$2, dataMigrationInitializer$Companion$runMigrations$1) == obj2) {
                return obj2;
            }
            list2 = arrayList;
            objectRef = new Ref.ObjectRef();
            it = list2.iterator();
            while (it.hasNext()) {
                function1 = (Function1) it.next();
                dataMigrationInitializer$Companion$runMigrations$1.X = objectRef;
                dataMigrationInitializer$Companion$runMigrations$1.f4602Y = it;
                dataMigrationInitializer$Companion$runMigrations$1.e0 = 2;
                if (function1.invoke(dataMigrationInitializer$Companion$runMigrations$1) == obj2) {
                    return obj2;
                }
            }
            th = (Throwable) objectRef.X;
            if (th == null) {
                return Unit.f43263a;
            }
            throw th;
        }
    }
}
