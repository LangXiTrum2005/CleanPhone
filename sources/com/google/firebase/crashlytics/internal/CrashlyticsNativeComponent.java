package com.google.firebase.crashlytics.internal;

import com.google.firebase.crashlytics.internal.model.StaticSessionData;

/* JADX INFO: loaded from: classes4.dex */
public interface CrashlyticsNativeComponent {
    NativeSessionFileProvider a(String str);

    boolean b();

    void c(String str, long j, StaticSessionData staticSessionData);

    boolean d(String str);
}
