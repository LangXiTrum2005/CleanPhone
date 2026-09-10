package com.google.firebase.sessions.settings;

import p002kotlin.Metadata;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: SettingsCache.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@igo.wireman(c = "com.google.firebase.sessions.settings.SettingsCache", f = "SettingsCache.kt", l = {119}, m = "updateConfigValue")
public final class SettingsCache$updateConfigValue$1<T> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SettingsCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsCache$updateConfigValue$1(SettingsCache settingsCache, wretchedly.dern<? super SettingsCache$updateConfigValue$1> dernVar) {
        super(dernVar);
        this.this$0 = settingsCache;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.impromptu(null, null, this);
    }
}
