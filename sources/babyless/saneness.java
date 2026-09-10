package babyless;

import android.content.Context;
import com.google.gson.GsonBuilder;

/* JADX INFO: compiled from: CacheBuilderV2.java */
/* JADX INFO: loaded from: classes3.dex */
public class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public Context f14830attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public manyplies.attabal f14831dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public dishoard.saneness f14832saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public ahermatype.saneness f14833wireman;

    public saneness(Context context) {
        this.f14830attabal = context;
    }

    public Context attabal() {
        return this.f14830attabal;
    }

    public dishoard.saneness dern() {
        if (this.f14832saneness == null) {
            this.f14832saneness = new dishoard.attabal(new GsonBuilder().serializeNulls().create());
        }
        return this.f14832saneness;
    }

    public ahermatype.saneness saneness() {
        if (this.f14833wireman == null) {
            ahermatype.attabal attabalVar = new ahermatype.attabal();
            this.f14833wireman = attabalVar;
            if (!attabalVar.attabal()) {
                return null;
            }
        }
        return this.f14833wireman;
    }

    public manyplies.attabal wireman() {
        if (this.f14831dern == null) {
            this.f14831dern = new manyplies.saneness();
        }
        return this.f14831dern;
    }
}
