package com.google.firebase.sessions;

import android.content.Context;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import com.google.android.gms.ads.RequestConfiguration;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlinx.coroutines.privatdozent;
import kotlinx.coroutines.saran;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.PropertyReference2Impl;

/* JADX INFO: compiled from: SessionDatastore.kt */
/* JADX INFO: loaded from: classes3.dex */
@Singleton
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0002\r\u000bB\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\r\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/google/firebase/sessions/SessionDatastoreImpl;", "Lcom/google/firebase/sessions/graveside;", "Landroid/content/Context;", "appContext", "Lkotlin/coroutines/CoroutineContext;", "backgroundDispatcher", "<init>", "(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)V", "", JsonStorageKeyNames.SESSION_ID_KEY, "", "saneness", "(Ljava/lang/String;)V", "attabal", "()Ljava/lang/String;", "Landroidx/datastore/preferences/core/dern;", "preferences", "Lcom/google/firebase/sessions/impassible;", "taiyuan", "(Landroidx/datastore/preferences/core/dern;)Lcom/google/firebase/sessions/impassible;", "Landroid/content/Context;", "dern", "Lkotlin/coroutines/CoroutineContext;", "Ljava/util/concurrent/atomic/AtomicReference;", "wireman", "Ljava/util/concurrent/atomic/AtomicReference;", "currentSessionFromDatastore", "Lkotlinx/coroutines/flow/dern;", "marial", "Lkotlinx/coroutines/flow/dern;", "firebaseSessionDataFlow", "beachfront", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SessionDatastoreImpl implements graveside {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final bren.dern<Context, androidx.datastore.core.competently<androidx.datastore.preferences.core.dern>> f22877competently = PreferenceDataStoreDelegateKt.saneness(molybdenite.f23003attabal.attabal(), new libyan.saneness(new Function1<CorruptionException, androidx.datastore.preferences.core.dern>() { // from class: com.google.firebase.sessions.SessionDatastoreImpl$Companion$dataStore$2
        @Override // p002kotlin.jvm.functions.Function1
        public final androidx.datastore.preferences.core.dern invoke(CorruptionException ex) throws Throwable {
            Intrinsics.checkNotNullParameter(ex, "ex");
            polloi.f23013attabal.marial();
            return androidx.datastore.preferences.core.wireman.attabal();
        }
    }), null, null, 12, null);

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final CoroutineContext backgroundDispatcher;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final kotlinx.coroutines.flow.dern<FirebaseSessionsData> firebaseSessionDataFlow;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final Context appContext;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final AtomicReference<FirebaseSessionsData> currentSessionFromDatastore;

    /* JADX INFO: renamed from: com.google.firebase.sessions.SessionDatastoreImpl$1, reason: invalid class name */
    /* JADX INFO: compiled from: SessionDatastore.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/saran;", "", "<anonymous>", "(Lkotlinx/coroutines/saran;)V"}, k = 3, mv = {1, 8, 0})
    @igo.wireman(c = "com.google.firebase.sessions.SessionDatastoreImpl$1", f = "SessionDatastore.kt", l = {88}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<saran, wretchedly.dern<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.google.firebase.sessions.SessionDatastoreImpl$1$attabal */
        /* JADX INFO: compiled from: SessionDatastore.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/google/firebase/sessions/impassible;", "it", "", "saneness", "(Lcom/google/firebase/sessions/impassible;Lwretchedly/dern;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        public static final class attabal<T> implements kotlinx.coroutines.flow.wireman {

            /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
            public final /* synthetic */ SessionDatastoreImpl f22882kowloon;

            public attabal(SessionDatastoreImpl sessionDatastoreImpl) {
                this.f22882kowloon = sessionDatastoreImpl;
            }

            @Override // kotlinx.coroutines.flow.wireman
            /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
            public final Object emit(FirebaseSessionsData firebaseSessionsData, wretchedly.dern<? super Unit> dernVar) {
                this.f22882kowloon.currentSessionFromDatastore.set(firebaseSessionsData);
                return Unit.f29295attabal;
            }
        }

        public AnonymousClass1(wretchedly.dern<? super AnonymousClass1> dernVar) {
            super(2, dernVar);
        }

        @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final wretchedly.dern<Unit> create(Object obj, wretchedly.dern<?> dernVar) {
            return SessionDatastoreImpl.this.new AnonymousClass1(dernVar);
        }

        @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
            int i = this.label;
            if (i == 0) {
                p002kotlin.dern.saneness(obj);
                kotlinx.coroutines.flow.dern dernVar = SessionDatastoreImpl.this.firebaseSessionDataFlow;
                attabal attabalVar = new attabal(SessionDatastoreImpl.this);
                this.label = 1;
                if (dernVar.collect(attabalVar, this) == objBeachfront) {
                    return objBeachfront;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p002kotlin.dern.saneness(obj);
            }
            return Unit.f29295attabal;
        }

        @Override // p002kotlin.jvm.functions.Function2
        public final Object invoke(saran saranVar, wretchedly.dern<? super Unit> dernVar) {
            return ((AnonymousClass1) create(saranVar, dernVar)).invokeSuspend(Unit.f29295attabal);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.SessionDatastoreImpl$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: SessionDatastore.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/google/firebase/sessions/SessionDatastoreImpl$attabal;", "", "<init>", "()V", "Landroid/content/Context;", "Landroidx/datastore/core/competently;", "Landroidx/datastore/preferences/core/dern;", "dataStore$delegate", "Lbren/dern;", "saneness", "(Landroid/content/Context;)Landroidx/datastore/core/competently;", "dataStore", "", "TAG", "Ljava/lang/String;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ kurbash.formularize<Object>[] f22883attabal = {p002kotlin.jvm.internal.polloi.apical(new PropertyReference2Impl(Companion.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final androidx.datastore.core.competently<androidx.datastore.preferences.core.dern> saneness(Context context) {
            return (androidx.datastore.core.competently) SessionDatastoreImpl.f22877competently.getValue(context, f22883attabal[0]);
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: SessionDatastore.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/google/firebase/sessions/SessionDatastoreImpl$saneness;", "", "<init>", "()V", "Landroidx/datastore/preferences/core/dern$attabal;", "", "saneness", "Landroidx/datastore/preferences/core/dern$attabal;", "attabal", "()Landroidx/datastore/preferences/core/dern$attabal;", "SESSION_ID", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final saneness f22884attabal = new saneness();

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public static final androidx.datastore.preferences.core.dern.attabal<String> SESSION_ID = androidx.datastore.preferences.core.marial.competently("session_id");

        public final androidx.datastore.preferences.core.dern.attabal<String> attabal() {
            return SESSION_ID;
        }
    }

    @Inject
    public SessionDatastoreImpl(Context appContext, @capsulated.attabal CoroutineContext backgroundDispatcher) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        this.appContext = appContext;
        this.backgroundDispatcher = backgroundDispatcher;
        this.currentSessionFromDatastore = new AtomicReference<>();
        final kotlinx.coroutines.flow.dern dernVarBeachfront = kotlinx.coroutines.flow.marial.beachfront(INSTANCE.saneness(appContext).getData(), new SessionDatastoreImpl$firebaseSessionDataFlow$1(null));
        this.firebaseSessionDataFlow = new kotlinx.coroutines.flow.dern<FirebaseSessionsData>() { // from class: com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1

            /* JADX INFO: renamed from: com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", "value", "", "emit", "(Ljava/lang/Object;Lwretchedly/dern;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.wireman {

                /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
                public final /* synthetic */ SessionDatastoreImpl f22888arytenoidectomy;

                /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.wireman f22889kowloon;

                /* JADX INFO: renamed from: com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @igo.wireman(c = "com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2", f = "SessionDatastore.kt", l = {Sdk$SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(wretchedly.dern dernVar) {
                        super(dernVar);
                    }

                    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.wireman wiremanVar, SessionDatastoreImpl sessionDatastoreImpl) {
                    this.f22889kowloon = wiremanVar;
                    this.f22888arytenoidectomy = sessionDatastoreImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.wireman
                public final Object emit(Object obj, wretchedly.dern dernVar) {
                    AnonymousClass1 anonymousClass1;
                    if (dernVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dernVar;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(dernVar);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(dernVar);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        p002kotlin.dern.saneness(obj2);
                        kotlinx.coroutines.flow.wireman wiremanVar = this.f22889kowloon;
                        FirebaseSessionsData firebaseSessionsDataTaiyuan = this.f22888arytenoidectomy.taiyuan((androidx.datastore.preferences.core.dern) obj);
                        anonymousClass1.label = 1;
                        if (wiremanVar.emit(firebaseSessionsDataTaiyuan, anonymousClass1) == objBeachfront) {
                            return objBeachfront;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p002kotlin.dern.saneness(obj2);
                    }
                    return Unit.f29295attabal;
                }
            }

            @Override // kotlinx.coroutines.flow.dern
            public Object collect(kotlinx.coroutines.flow.wireman<? super FirebaseSessionsData> wiremanVar, wretchedly.dern dernVar) {
                Object objCollect = dernVarBeachfront.collect(new AnonymousClass2(wiremanVar, this), dernVar);
                return objCollect == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objCollect : Unit.f29295attabal;
            }
        };
        kotlinx.coroutines.cutely.wireman(privatdozent.attabal(backgroundDispatcher), null, null, new AnonymousClass1(null), 3, null);
    }

    @Override // com.google.firebase.sessions.graveside
    public String attabal() {
        FirebaseSessionsData firebaseSessionsData = this.currentSessionFromDatastore.get();
        if (firebaseSessionsData != null) {
            return firebaseSessionsData.getSessionId();
        }
        return null;
    }

    @Override // com.google.firebase.sessions.graveside
    public void saneness(String sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        kotlinx.coroutines.cutely.wireman(privatdozent.attabal(this.backgroundDispatcher), null, null, new SessionDatastoreImpl$updateSessionId$1(this, sessionId, null), 3, null);
    }

    public final FirebaseSessionsData taiyuan(androidx.datastore.preferences.core.dern preferences) {
        return new FirebaseSessionsData((String) preferences.saneness(saneness.f22884attabal.attabal()));
    }
}
