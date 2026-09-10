package com.google.firebase.sessions;

import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.PreferencesKt;
import java.io.IOException;
import kotlinx.coroutines.saran;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: SessionDatastore.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/saran;", "", "<anonymous>", "(Lkotlinx/coroutines/saran;)V"}, k = 3, mv = {1, 8, 0})
@igo.wireman(c = "com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1", f = "SessionDatastore.kt", l = {95}, m = "invokeSuspend")
public final class SessionDatastoreImpl$updateSessionId$1 extends SuspendLambda implements Function2<saran, wretchedly.dern<? super Unit>, Object> {
    final /* synthetic */ String $sessionId;
    int label;
    final /* synthetic */ SessionDatastoreImpl this$0;

    /* JADX INFO: renamed from: com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: SessionDatastore.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "preferences", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @igo.wireman(c = "com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1$1", f = "SessionDatastore.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<MutablePreferences, wretchedly.dern<? super Unit>, Object> {
        final /* synthetic */ String $sessionId;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, wretchedly.dern<? super AnonymousClass1> dernVar) {
            super(2, dernVar);
            this.$sessionId = str;
        }

        @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final wretchedly.dern<Unit> create(Object obj, wretchedly.dern<?> dernVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$sessionId, dernVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // p002kotlin.jvm.functions.Function2
        public final Object invoke(MutablePreferences mutablePreferences, wretchedly.dern<? super Unit> dernVar) {
            return ((AnonymousClass1) create(mutablePreferences, dernVar)).invokeSuspend(Unit.f29295attabal);
        }

        @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            p002kotlin.coroutines.intrinsics.attabal.beachfront();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
            ((MutablePreferences) this.L$0).taiyuan(SessionDatastoreImpl.saneness.f22884attabal.attabal(), this.$sessionId);
            return Unit.f29295attabal;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionDatastoreImpl$updateSessionId$1(SessionDatastoreImpl sessionDatastoreImpl, String str, wretchedly.dern<? super SessionDatastoreImpl$updateSessionId$1> dernVar) {
        super(2, dernVar);
        this.this$0 = sessionDatastoreImpl;
        this.$sessionId = str;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern<Unit> create(Object obj, wretchedly.dern<?> dernVar) {
        return new SessionDatastoreImpl$updateSessionId$1(this.this$0, this.$sessionId, dernVar);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.label;
        try {
            if (i == 0) {
                p002kotlin.dern.saneness(obj);
                androidx.datastore.core.competently competentlyVarSaneness = SessionDatastoreImpl.INSTANCE.saneness(this.this$0.appContext);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$sessionId, null);
                this.label = 1;
                if (PreferencesKt.attabal(competentlyVarSaneness, anonymousClass1, this) == objBeachfront) {
                    return objBeachfront;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p002kotlin.dern.saneness(obj);
            }
        } catch (IOException e) {
            e.toString();
        }
        return Unit.f29295attabal;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(saran saranVar, wretchedly.dern<? super Unit> dernVar) {
        return ((SessionDatastoreImpl$updateSessionId$1) create(saranVar, dernVar)).invokeSuspend(Unit.f29295attabal);
    }
}
