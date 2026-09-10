package com.inmobi.media;

import kotlinx.coroutines.flow.dern;
import kotlinx.coroutines.flow.formularize;
import kotlinx.coroutines.flow.wireman;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;

/* JADX INFO: loaded from: classes3.dex */
public final class Vm implements dern {
    public final /* synthetic */ formularize a;

    public Vm(formularize formularizeVar) {
        this.a = formularizeVar;
    }

    @Override // kotlinx.coroutines.flow.dern
    public final Object collect(wireman wiremanVar, wretchedly.dern dernVar) {
        Object objCollect = this.a.collect(new Um(wiremanVar), dernVar);
        return objCollect == attabal.beachfront() ? objCollect : Unit.f29295attabal;
    }
}
