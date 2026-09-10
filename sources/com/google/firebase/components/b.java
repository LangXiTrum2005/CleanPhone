package com.google.firebase.components;

import com.google.android.gms.common.util.Clock;
import com.google.firebase.inject.Provider;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Provider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20242a;

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        switch (this.f20242a) {
            case 0:
                return Collections.EMPTY_SET;
            default:
                Clock clock = RemoteConfigComponent.j;
            case 1:
                return null;
        }
    }
}
