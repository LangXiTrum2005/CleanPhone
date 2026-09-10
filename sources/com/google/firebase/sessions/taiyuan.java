package com.google.firebase.sessions;

import javax.inject.Provider;

/* JADX INFO: compiled from: EventGDTLogger_Factory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class taiyuan implements lateral.saneness<competently> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Provider<friedmanite.saneness<staphylococcal.taiyuan>> f23063attabal;

    public taiyuan(Provider<friedmanite.saneness<staphylococcal.taiyuan>> provider) {
        this.f23063attabal = provider;
    }

    public static taiyuan attabal(Provider<friedmanite.saneness<staphylococcal.taiyuan>> provider) {
        return new taiyuan(provider);
    }

    public static competently dern(friedmanite.saneness<staphylococcal.taiyuan> sanenessVar) {
        return new competently(sanenessVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public competently get() {
        return dern(this.f23063attabal.get());
    }
}
