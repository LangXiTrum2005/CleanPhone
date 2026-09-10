package com.google.firebase.sessions;

import javax.inject.Inject;
import javax.inject.Singleton;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.Charsets;

/* JADX INFO: compiled from: EventGDTLogger.kt */
/* JADX INFO: loaded from: classes3.dex */
@Singleton
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00112\u00020\u0001:\u0001\nB\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/google/firebase/sessions/competently;", "Lcom/google/firebase/sessions/impromptu;", "Lfriedmanite/saneness;", "Lstaphylococcal/taiyuan;", "transportFactoryProvider", "<init>", "(Lfriedmanite/saneness;)V", "Lcom/google/firebase/sessions/gintrap;", "sessionEvent", "", "attabal", "(Lcom/google/firebase/sessions/gintrap;)V", "value", "", "dern", "(Lcom/google/firebase/sessions/gintrap;)[B", "Lfriedmanite/saneness;", "saneness", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class competently implements impromptu {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final friedmanite.saneness<staphylococcal.taiyuan> transportFactoryProvider;

    @Inject
    public competently(friedmanite.saneness<staphylococcal.taiyuan> transportFactoryProvider) {
        Intrinsics.checkNotNullParameter(transportFactoryProvider, "transportFactoryProvider");
        this.transportFactoryProvider = transportFactoryProvider;
    }

    @Override // com.google.firebase.sessions.impromptu
    public void attabal(SessionEvent sessionEvent) {
        Intrinsics.checkNotNullParameter(sessionEvent, "sessionEvent");
        this.transportFactoryProvider.get().attabal("FIREBASE_APPQUALITY_SESSION", SessionEvent.class, staphylococcal.dern.saneness("json"), new staphylococcal.competently() { // from class: com.google.firebase.sessions.beachfront
            @Override // staphylococcal.competently
            public final Object apply(Object obj) {
                return this.f22938attabal.dern((SessionEvent) obj);
            }
        }).attabal(staphylococcal.wireman.beachfront(sessionEvent));
    }

    public final byte[] dern(SessionEvent value) {
        String strSaneness = rotuma.f23016attabal.dern().saneness(value);
        Intrinsics.checkNotNullExpressionValue(strSaneness, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        value.getEventType().name();
        byte[] bytes = strSaneness.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }
}
