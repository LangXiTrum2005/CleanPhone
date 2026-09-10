package androidx.datastore.migrations;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.datastore.core.DataMigration;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/datastore/migrations/SharedPreferencesMigration;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/core/DataMigration;", "Api24Impl", "datastore_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SharedPreferencesMigration<T> implements DataMigration<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function2 f4704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function3 f4705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f4706c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Lazy f4707e;
    public final LinkedHashSet f;

    /* JADX INFO: renamed from: androidx.datastore.migrations.SharedPreferencesMigration$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "it"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.migrations.SharedPreferencesMigration$1", f = "SharedPreferencesMigration.android.kt", l = {}, m = "invokeSuspend")
    final class AnonymousClass1 extends SuspendLambda implements Function2<Object, Continuation<? super Boolean>, Object> {
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((AnonymousClass1) create(obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
            return Boolean.TRUE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            ResultKt.b(obj);
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.migrations.SharedPreferencesMigration$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "it"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.migrations.SharedPreferencesMigration$2", f = "SharedPreferencesMigration.android.kt", l = {}, m = "invokeSuspend")
    final class AnonymousClass2 extends SuspendLambda implements Function2<Object, Continuation<? super Boolean>, Object> {
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((AnonymousClass2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
            return Boolean.TRUE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            ResultKt.b(obj);
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.migrations.SharedPreferencesMigration$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "it"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.migrations.SharedPreferencesMigration$3", f = "SharedPreferencesMigration.android.kt", l = {}, m = "invokeSuspend")
    final class AnonymousClass3 extends SuspendLambda implements Function2<Object, Continuation<? super Boolean>, Object> {
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass3(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((AnonymousClass3) create(obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
            return Boolean.TRUE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            ResultKt.b(obj);
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/datastore/migrations/SharedPreferencesMigration$Api24Impl;", "", "Landroid/content/Context;", "context", "", "name", "", "a", "(Landroid/content/Context;Ljava/lang/String;)Z", "datastore_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api24Impl {
        @JvmStatic
        public static final boolean a(Context context, String name) {
            Intrinsics.f(context, "context");
            Intrinsics.f(name, "name");
            return context.deleteSharedPreferences(name);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.migrations.SharedPreferencesMigration", f = "SharedPreferencesMigration.android.kt", l = {151}, m = "shouldMigrate")
    final class C09191 extends ContinuationImpl {
        public SharedPreferencesMigration X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public /* synthetic */ Object f4709Y;
        public int e0;

        public C09191(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4709Y = obj;
            this.e0 |= Integer.MIN_VALUE;
            return SharedPreferencesMigration.this.shouldMigrate(null, this);
        }
    }

    public SharedPreferencesMigration(final Context context, final String sharedPreferencesName, Function2 function2, Function3 function3) {
        LinkedHashSet keysToMigrate = SharedPreferencesMigration_androidKt.f4710a;
        Intrinsics.f(context, "context");
        Intrinsics.f(sharedPreferencesName, "sharedPreferencesName");
        Intrinsics.f(keysToMigrate, "keysToMigrate");
        Function0<SharedPreferences> function0 = new Function0<SharedPreferences>() { // from class: androidx.datastore.migrations.SharedPreferencesMigration.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SharedPreferences sharedPreferences = context.getSharedPreferences(sharedPreferencesName, 0);
                Intrinsics.e(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
                return sharedPreferences;
            }
        };
        this.f4704a = function2;
        this.f4705b = function3;
        this.f4706c = context;
        this.d = sharedPreferencesName;
        this.f4707e = LazyKt.b(function0);
        this.f = null;
    }

    @Override // androidx.datastore.core.DataMigration
    public final Object cleanUp(Continuation continuation) throws IOException {
        Context context;
        String str;
        Lazy lazy = this.f4707e;
        SharedPreferences.Editor editorEdit = ((SharedPreferences) lazy.getX()).edit();
        LinkedHashSet linkedHashSet = this.f;
        if (linkedHashSet == null) {
            editorEdit.clear();
        } else {
            Iterator<T> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                editorEdit.remove((String) it.next());
            }
        }
        if (!editorEdit.commit()) {
            throw new IOException("Unable to delete migrated keys from SharedPreferences.");
        }
        if (((SharedPreferences) lazy.getX()).getAll().isEmpty() && (context = this.f4706c) != null && (str = this.d) != null) {
            Api24Impl.a(context, str);
        }
        if (linkedHashSet != null) {
            linkedHashSet.clear();
        }
        return Unit.f43263a;
    }

    @Override // androidx.datastore.core.DataMigration
    public final Object migrate(Object obj, Continuation continuation) {
        return this.f4705b.invoke(new SharedPreferencesView((SharedPreferences) this.f4707e.getX(), this.f), obj, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.datastore.core.DataMigration
    public final Object shouldMigrate(Object obj, Continuation continuation) {
        C09191 c09191;
        SharedPreferencesMigration<T> sharedPreferencesMigration;
        if (continuation instanceof C09191) {
            c09191 = (C09191) continuation;
            int i2 = c09191.e0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c09191.e0 = i2 - Integer.MIN_VALUE;
            } else {
                c09191 = new C09191((ContinuationImpl) continuation);
            }
        } else {
            c09191 = new C09191((ContinuationImpl) continuation);
        }
        Object objInvoke = c09191.f4709Y;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = c09191.e0;
        boolean z2 = true;
        if (i3 == 0) {
            ResultKt.b(objInvoke);
            c09191.X = this;
            c09191.e0 = 1;
            objInvoke = this.f4704a.invoke(obj, c09191);
            if (objInvoke == coroutineSingletons) {
                return coroutineSingletons;
            }
            sharedPreferencesMigration = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sharedPreferencesMigration = c09191.X;
            ResultKt.b(objInvoke);
        }
        if (!((Boolean) objInvoke).booleanValue()) {
            return Boolean.FALSE;
        }
        LinkedHashSet linkedHashSet = sharedPreferencesMigration.f;
        Lazy lazy = sharedPreferencesMigration.f4707e;
        if (linkedHashSet == null) {
            Map<String, ?> all = ((SharedPreferences) lazy.getX()).getAll();
            Intrinsics.e(all, "sharedPrefs.all");
            if (all.isEmpty()) {
                z2 = false;
            }
        } else {
            SharedPreferences sharedPreferences = (SharedPreferences) lazy.getX();
            if (linkedHashSet.isEmpty()) {
                z2 = false;
            } else {
                Iterator<T> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    if (sharedPreferences.contains((String) it.next())) {
                    }
                }
                z2 = false;
            }
        }
        return Boolean.valueOf(z2);
    }
}
