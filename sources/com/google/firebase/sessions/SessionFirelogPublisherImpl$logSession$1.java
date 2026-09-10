package com.google.firebase.sessions;

import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.api.SessionSubscriber;
import com.google.firebase.sessions.settings.SessionsSettings;
import java.util.Map;
import kotlinx.coroutines.saran;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: SessionFirelogPublisher.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/saran;", "", "<anonymous>", "(Lkotlinx/coroutines/saran;)V"}, k = 3, mv = {1, 8, 0})
@igo.wireman(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl$logSession$1", f = "SessionFirelogPublisher.kt", l = {69, 70, 76}, m = "invokeSuspend")
public final class SessionFirelogPublisherImpl$logSession$1 extends SuspendLambda implements Function2<saran, wretchedly.dern<? super Unit>, Object> {
    final /* synthetic */ SessionDetails $sessionDetails;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ SessionFirelogPublisherImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionFirelogPublisherImpl$logSession$1(SessionFirelogPublisherImpl sessionFirelogPublisherImpl, SessionDetails sessionDetails, wretchedly.dern<? super SessionFirelogPublisherImpl$logSession$1> dernVar) {
        super(2, dernVar);
        this.this$0 = sessionFirelogPublisherImpl;
        this.$sessionDetails = sessionDetails;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern<Unit> create(Object obj, wretchedly.dern<?> dernVar) {
        return new SessionFirelogPublisherImpl$logSession$1(this.this$0, this.$sessionDetails, dernVar);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0096  */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InstallationId installationId;
        SessionFirelogPublisherImpl sessionFirelogPublisherImpl;
        rotuma rotumaVar;
        iiion.beachfront beachfrontVar;
        SessionDetails sessionDetails;
        SessionsSettings sessionsSettings;
        Object objDern;
        iiion.beachfront beachfrontVar2;
        SessionDetails sessionDetails2;
        rotuma rotumaVar2;
        SessionsSettings sessionsSettings2;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.label;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            SessionFirelogPublisherImpl sessionFirelogPublisherImpl2 = this.this$0;
            this.label = 1;
            obj = sessionFirelogPublisherImpl2.taiyuan(this);
            if (obj != objBeachfront) {
            }
            return objBeachfront;
        }
        if (i == 1) {
            p002kotlin.dern.saneness(obj);
        } else {
            if (i == 2) {
                p002kotlin.dern.saneness(obj);
                installationId = (InstallationId) obj;
                sessionFirelogPublisherImpl = this.this$0;
                rotumaVar = rotuma.f23016attabal;
                beachfrontVar = sessionFirelogPublisherImpl.firebaseApp;
                sessionDetails = this.$sessionDetails;
                sessionsSettings = this.this$0.sessionSettings;
                FirebaseSessionsDependencies firebaseSessionsDependencies = FirebaseSessionsDependencies.f22920attabal;
                this.L$0 = installationId;
                this.L$1 = sessionFirelogPublisherImpl;
                this.L$2 = rotumaVar;
                this.L$3 = beachfrontVar;
                this.L$4 = sessionDetails;
                this.L$5 = sessionsSettings;
                this.label = 3;
                objDern = firebaseSessionsDependencies.dern(this);
                if (objDern != objBeachfront) {
                    beachfrontVar2 = beachfrontVar;
                    obj = objDern;
                    sessionDetails2 = sessionDetails;
                    rotumaVar2 = rotumaVar;
                    sessionsSettings2 = sessionsSettings;
                }
                return objBeachfront;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SessionsSettings sessionsSettings3 = (SessionsSettings) this.L$5;
            SessionDetails sessionDetails3 = (SessionDetails) this.L$4;
            iiion.beachfront beachfrontVar3 = (iiion.beachfront) this.L$3;
            rotuma rotumaVar3 = (rotuma) this.L$2;
            sessionFirelogPublisherImpl = (SessionFirelogPublisherImpl) this.L$1;
            installationId = (InstallationId) this.L$0;
            p002kotlin.dern.saneness(obj);
            sessionsSettings2 = sessionsSettings3;
            rotumaVar2 = rotumaVar3;
            sessionDetails2 = sessionDetails3;
            beachfrontVar2 = beachfrontVar3;
        }
        SessionFirelogPublisherImpl sessionFirelogPublisherImpl3 = sessionFirelogPublisherImpl;
        Map<SessionSubscriber.Name, ? extends SessionSubscriber> map = (Map) obj;
        InstallationId installationId2 = installationId;
        sessionFirelogPublisherImpl3.competently(rotumaVar2.attabal(beachfrontVar2, sessionDetails2, sessionsSettings2, map, installationId2.getFid(), installationId2.getAuthToken()));
        return Unit.f29295attabal;
        if (((Boolean) obj).booleanValue()) {
            InstallationId.Companion companion = InstallationId.INSTANCE;
            ingathering.competently competentlyVar = this.this$0.firebaseInstallations;
            this.label = 2;
            obj = companion.attabal(competentlyVar, this);
            if (obj != objBeachfront) {
                installationId = (InstallationId) obj;
                sessionFirelogPublisherImpl = this.this$0;
                rotumaVar = rotuma.f23016attabal;
                beachfrontVar = sessionFirelogPublisherImpl.firebaseApp;
                sessionDetails = this.$sessionDetails;
                sessionsSettings = this.this$0.sessionSettings;
                FirebaseSessionsDependencies firebaseSessionsDependencies2 = FirebaseSessionsDependencies.f22920attabal;
                this.L$0 = installationId;
                this.L$1 = sessionFirelogPublisherImpl;
                this.L$2 = rotumaVar;
                this.L$3 = beachfrontVar;
                this.L$4 = sessionDetails;
                this.L$5 = sessionsSettings;
                this.label = 3;
                objDern = firebaseSessionsDependencies2.dern(this);
                if (objDern != objBeachfront) {
                    beachfrontVar2 = beachfrontVar;
                    obj = objDern;
                    sessionDetails2 = sessionDetails;
                    rotumaVar2 = rotumaVar;
                    sessionsSettings2 = sessionsSettings;
                    SessionFirelogPublisherImpl sessionFirelogPublisherImpl4 = sessionFirelogPublisherImpl;
                    Map<SessionSubscriber.Name, ? extends SessionSubscriber> map2 = (Map) obj;
                    InstallationId installationId3 = installationId;
                    sessionFirelogPublisherImpl4.competently(rotumaVar2.attabal(beachfrontVar2, sessionDetails2, sessionsSettings2, map2, installationId3.getFid(), installationId3.getAuthToken()));
                }
            }
            return objBeachfront;
        }
        return Unit.f29295attabal;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(saran saranVar, wretchedly.dern<? super Unit> dernVar) {
        return ((SessionFirelogPublisherImpl$logSession$1) create(saranVar, dernVar)).invokeSuspend(Unit.f29295attabal);
    }
}
