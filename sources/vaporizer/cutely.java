package vaporizer;

import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: compiled from: MetadataBackendRegistry_Factory.java */
/* JADX INFO: loaded from: classes2.dex */
public final class cutely implements delouse.saneness<taiyuan> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Provider<Context> f39284attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Provider<competently> f39285saneness;

    public cutely(Provider<Context> provider, Provider<competently> provider2) {
        this.f39284attabal = provider;
        this.f39285saneness = provider2;
    }

    public static cutely attabal(Provider<Context> provider, Provider<competently> provider2) {
        return new cutely(provider, provider2);
    }

    public static taiyuan dern(Context context, Object obj) {
        return new taiyuan(context, (competently) obj);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public taiyuan get() {
        return dern(this.f39284attabal.get(), this.f39285saneness.get());
    }
}
