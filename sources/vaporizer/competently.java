package vaporizer;

import android.content.Context;
import javax.inject.Inject;

/* JADX INFO: compiled from: CreationContextFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class competently {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Context f39281attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final bramley.attabal f39282dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final bramley.attabal f39283saneness;

    @Inject
    public competently(Context context, bramley.attabal attabalVar, bramley.attabal attabalVar2) {
        this.f39281attabal = context;
        this.f39283saneness = attabalVar;
        this.f39282dern = attabalVar2;
    }

    public beachfront attabal(String str) {
        return beachfront.attabal(this.f39281attabal, this.f39283saneness, this.f39282dern, str);
    }
}
