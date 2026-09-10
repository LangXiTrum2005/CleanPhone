package com.chartboost.sdk.impl;

import com.chartboost.sdk.privacy.model.DataUseConsent;

/* JADX INFO: loaded from: classes3.dex */
public class e8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fe f13791a;

    public e8(fe feVar) {
        this.f13791a = feVar;
    }

    public DataUseConsent a(String str) {
        return (DataUseConsent) this.f13791a.a().get(str);
    }
}
