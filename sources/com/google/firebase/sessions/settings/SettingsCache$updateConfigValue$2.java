package com.google.firebase.sessions.settings;

import androidx.datastore.preferences.core.MutablePreferences;
import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: SettingsCache.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "preferences", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@igo.wireman(c = "com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2", f = "SettingsCache.kt", l = {}, m = "invokeSuspend")
public final class SettingsCache$updateConfigValue$2 extends SuspendLambda implements Function2<MutablePreferences, wretchedly.dern<? super Unit>, Object> {
    final /* synthetic */ androidx.datastore.preferences.core.dern.attabal<T> $key;
    final /* synthetic */ T $value;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SettingsCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsCache$updateConfigValue$2(T t, androidx.datastore.preferences.core.dern.attabal<T> attabalVar, SettingsCache settingsCache, wretchedly.dern<? super SettingsCache$updateConfigValue$2> dernVar) {
        super(2, dernVar);
        this.$value = t;
        this.$key = attabalVar;
        this.this$0 = settingsCache;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern<Unit> create(Object obj, wretchedly.dern<?> dernVar) {
        SettingsCache$updateConfigValue$2 settingsCache$updateConfigValue$2 = new SettingsCache$updateConfigValue$2(this.$value, this.$key, this.this$0, dernVar);
        settingsCache$updateConfigValue$2.L$0 = obj;
        return settingsCache$updateConfigValue$2;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(MutablePreferences mutablePreferences, wretchedly.dern<? super Unit> dernVar) {
        return ((SettingsCache$updateConfigValue$2) create(mutablePreferences, dernVar)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p002kotlin.dern.saneness(obj);
        MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
        T t = this.$value;
        if (t != 0) {
            mutablePreferences.taiyuan(this.$key, t);
        } else {
            mutablePreferences.impromptu(this.$key);
        }
        this.this$0.formularize(mutablePreferences);
        return Unit.f29295attabal;
    }
}
