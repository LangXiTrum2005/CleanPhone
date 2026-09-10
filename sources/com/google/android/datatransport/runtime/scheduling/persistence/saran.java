package com.google.android.datatransport.runtime.scheduling.persistence;

import javax.inject.Provider;

/* JADX INFO: compiled from: SQLiteEventStore_Factory.java */
/* JADX INFO: loaded from: classes2.dex */
public final class saran implements delouse.saneness<grimness> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Provider<bramley.attabal> f19376attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Provider<marial> f19377dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final Provider<String> f19378marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Provider<bramley.attabal> f19379saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final Provider<splinterproof> f19380wireman;

    public saran(Provider<bramley.attabal> provider, Provider<bramley.attabal> provider2, Provider<marial> provider3, Provider<splinterproof> provider4, Provider<String> provider5) {
        this.f19376attabal = provider;
        this.f19379saneness = provider2;
        this.f19377dern = provider3;
        this.f19380wireman = provider4;
        this.f19378marial = provider5;
    }

    public static saran attabal(Provider<bramley.attabal> provider, Provider<bramley.attabal> provider2, Provider<marial> provider3, Provider<splinterproof> provider4, Provider<String> provider5) {
        return new saran(provider, provider2, provider3, provider4, provider5);
    }

    public static grimness dern(bramley.attabal attabalVar, bramley.attabal attabalVar2, Object obj, Object obj2, Provider<String> provider) {
        return new grimness(attabalVar, attabalVar2, (marial) obj, (splinterproof) obj2, provider);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public grimness get() {
        return dern(this.f19376attabal.get(), this.f19379saneness.get(), this.f19377dern.get(), this.f19380wireman.get(), this.f19378marial);
    }
}
