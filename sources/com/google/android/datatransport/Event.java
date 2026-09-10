package com.google.android.datatransport;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.sessions.SessionEvent;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Event<T> {
    public static Event f(SessionEvent sessionEvent) {
        return new AutoValue_Event(sessionEvent, Priority.X);
    }

    public static Event g(CrashlyticsReport crashlyticsReport) {
        return new AutoValue_Event(crashlyticsReport, Priority.Z);
    }

    public abstract Integer a();

    public abstract EventContext b();

    public abstract Object c();

    public abstract Priority d();

    public abstract ProductData e();
}
