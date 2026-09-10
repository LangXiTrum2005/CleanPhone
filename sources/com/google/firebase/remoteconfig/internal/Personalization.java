package com.google.firebase.remoteconfig.internal;

import com.google.firebase.inject.Provider;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class Personalization {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f20993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f20994b = androidx.datastore.preferences.protobuf.a.r();

    public Personalization(Provider provider) {
        this.f20993a = provider;
    }
}
