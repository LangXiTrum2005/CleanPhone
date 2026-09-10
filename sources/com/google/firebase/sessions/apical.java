package com.google.firebase.sessions;

import android.content.Context;
import com.google.firebase.sessions.settings.SessionsSettings;
import javax.inject.Singleton;
import p002kotlin.Metadata;
import p002kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: FirebaseSessionsComponent.kt */
/* JADX INFO: loaded from: classes3.dex */
@Singleton
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0002\u000f\u0013R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/google/firebase/sessions/apical;", "", "Lcom/google/firebase/sessions/FirebaseSessions;", "wireman", "()Lcom/google/firebase/sessions/FirebaseSessions;", "firebaseSessions", "Lcom/google/firebase/sessions/graveside;", "marial", "()Lcom/google/firebase/sessions/graveside;", "sessionDatastore", "Lcom/google/firebase/sessions/preprohormone;", "dern", "()Lcom/google/firebase/sessions/preprohormone;", "sessionFirelogPublisher", "Lcom/google/firebase/sessions/SessionGenerator;", "attabal", "()Lcom/google/firebase/sessions/SessionGenerator;", "sessionGenerator", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "saneness", "()Lcom/google/firebase/sessions/settings/SessionsSettings;", "sessionsSettings", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface apical {

    /* JADX INFO: compiled from: FirebaseSessionsComponent.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u00020\u00002\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u00020\u00002\b\b\u0001\u0010\n\u001a\u00020\u0006H'¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H'¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H'¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/google/firebase/sessions/apical$attabal;", "", "Landroid/content/Context;", "appContext", "beachfront", "(Landroid/content/Context;)Lcom/google/firebase/sessions/apical$attabal;", "Lkotlin/coroutines/CoroutineContext;", "backgroundDispatcher", "wireman", "(Lkotlin/coroutines/CoroutineContext;)Lcom/google/firebase/sessions/apical$attabal;", "blockingDispatcher", "marial", "Liiion/beachfront;", "firebaseApp", "dern", "(Liiion/beachfront;)Lcom/google/firebase/sessions/apical$attabal;", "Lingathering/competently;", "firebaseInstallationsApi", "saneness", "(Lingathering/competently;)Lcom/google/firebase/sessions/apical$attabal;", "Lfriedmanite/saneness;", "Lstaphylococcal/taiyuan;", "transportFactoryProvider", "attabal", "(Lfriedmanite/saneness;)Lcom/google/firebase/sessions/apical$attabal;", "Lcom/google/firebase/sessions/apical;", "build", "()Lcom/google/firebase/sessions/apical;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface attabal {
        attabal attabal(friedmanite.saneness<staphylococcal.taiyuan> transportFactoryProvider);

        attabal beachfront(Context appContext);

        apical build();

        attabal dern(iiion.beachfront firebaseApp);

        attabal marial(@capsulated.saneness CoroutineContext blockingDispatcher);

        attabal saneness(ingathering.competently firebaseInstallationsApi);

        attabal wireman(@capsulated.attabal CoroutineContext backgroundDispatcher);
    }

    /* JADX INFO: compiled from: FirebaseSessionsComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/firebase/sessions/apical$saneness;", "", "attabal", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = Companion.f22927attabal;

        /* JADX INFO: renamed from: com.google.firebase.sessions.apical$saneness$attabal, reason: from kotlin metadata */
        /* JADX INFO: compiled from: FirebaseSessionsComponent.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/google/firebase/sessions/apical$saneness$attabal;", "", "<init>", "()V", "Lcom/google/firebase/sessions/SessionGenerator;", "attabal", "()Lcom/google/firebase/sessions/SessionGenerator;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public static final /* synthetic */ Companion f22927attabal = new Companion();

            @Singleton
            public final SessionGenerator attabal() {
                return new SessionGenerator(supplicat.f23062attabal, null, 2, null);
            }
        }
    }

    SessionGenerator attabal();

    preprohormone dern();

    graveside marial();

    SessionsSettings saneness();

    FirebaseSessions wireman();
}
