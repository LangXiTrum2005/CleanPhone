package androidx.room;

import android.util.Log;
import android.view.inputmethod.InputMethodSubtype;
import androidx.datastore.core.CorruptionException;
import androidx.sqlite.SQLiteStatement;
import com.google.firebase.sessions.settings.SessionConfigsSerializer;
import com.startapp.sdk.internal.ha;
import com.startapp.sdk.internal.q7;
import com.zg.adlib.resource.Resource;
import com.zg.adlib.resource.ResourceExtKt;
import com.zg.adlib.service.MServiceUser;
import com.zg.adlib.service.ZGADLogManager;
import java.util.Map;
import kotlin.collections.ArraysKt;
import kotlin.collections.SetsKt;
import kotlin.collections.builders.SetBuilder;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Function1 {
    public final /* synthetic */ int X;

    public /* synthetic */ d(int i2) {
        this.X = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.X) {
            case 0:
                SQLiteStatement it = (SQLiteStatement) obj;
                Intrinsics.f(it, "it");
                return Boolean.valueOf(it.P0());
            case 1:
                SQLiteStatement statement = (SQLiteStatement) obj;
                Intrinsics.f(statement, "statement");
                SetBuilder setBuilder = new SetBuilder();
                while (statement.P0()) {
                    setBuilder.add(Integer.valueOf((int) statement.getLong(0)));
                }
                return SetsKt.a(setBuilder);
            case 2:
                throw null;
            case 3:
                return MServiceUser.createHttpLoggingInterceptor$lambda$2((String) obj);
            case 4:
                return MServiceUser.updateMLog$lambda$6((Resource) obj);
            case 5:
                return ZGADLogManager.sendCustomLog$lambda$0((Resource) obj);
            case 6:
                return ZGADLogManager.sendCustomLog$lambda$2((Resource) obj);
            case 7:
                CorruptionException ex = (CorruptionException) obj;
                Intrinsics.f(ex, "ex");
                Log.w("FirebaseSessions", "CorruptionException in session configs DataStore", ex);
                return SessionConfigsSerializer.f21169b;
            case 8:
                return Boolean.valueOf(ha.a((InputMethodSubtype) obj));
            case 9:
                return ha.b((InputMethodSubtype) obj);
            case 10:
                return Boolean.valueOf(ha.a((String) obj));
            case 11:
                return q7.a(((Boolean) obj).booleanValue());
            case 12:
                return ResourceExtKt.mapResource$lambda$1((Resource) obj);
            case 13:
                Sequence it2 = (Sequence) obj;
                Intrinsics.f(it2, "it");
                return it2.iterator();
            case 14:
                Iterable it3 = (Iterable) obj;
                Intrinsics.f(it3, "it");
                return it3.iterator();
            case 15:
                return obj;
            case 16:
                return Boolean.valueOf(obj == null);
            case 17:
                ArraysKt.k(null, obj);
                throw null;
            case 18:
                CoroutineContext.Element element = (CoroutineContext.Element) obj;
                if (element instanceof CoroutineDispatcher) {
                    return (CoroutineDispatcher) element;
                }
                return null;
            case 19:
                CoroutineContext.Element element2 = (CoroutineContext.Element) obj;
                if (element2 instanceof ExecutorCoroutineDispatcher) {
                    return (ExecutorCoroutineDispatcher) element2;
                }
                return null;
            case 20:
                return 1000L;
            case 21:
                return SerialDescriptorsKt.buildClassSerialDescriptor$lambda$0((ClassSerialDescriptorBuilder) obj);
            case 22:
                return SerialDescriptorsKt.buildSerialDescriptor$lambda$6((ClassSerialDescriptorBuilder) obj);
            case 23:
                return JsonElementSerializer.descriptor$lambda$5((ClassSerialDescriptorBuilder) obj);
            default:
                return JsonObject.toString$lambda$1((Map.Entry) obj);
        }
    }
}
