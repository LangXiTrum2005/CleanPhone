package com.google.firebase.sessions.settings;

import p002kotlin.Metadata;
import p002kotlin.Unit;

/* JADX INFO: compiled from: SettingsProvider.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001f\u0010\f\u001a\u0004\u0018\u00010\t8&X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, d2 = {"Lcom/google/firebase/sessions/settings/marial;", "", "", "wireman", "(Lwretchedly/dern;)Ljava/lang/Object;", "", "attabal", "()Ljava/lang/Boolean;", "sessionEnabled", "Lkotlin/time/saneness;", "saneness", "()Lkotlin/time/saneness;", "sessionRestartTimeout", "", "dern", "()Ljava/lang/Double;", "samplingRate", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface marial {

    /* JADX INFO: compiled from: SettingsProvider.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class attabal {
        public static Object attabal(marial marialVar, wretchedly.dern<? super Unit> dernVar) {
            return Unit.f29295attabal;
        }
    }

    Boolean attabal();

    Double dern();

    p002kotlin.time.saneness saneness();

    Object wireman(wretchedly.dern<? super Unit> dernVar);
}
