package imposure;

import com.google.common.base.formularize;
import imposure.impromptu;
import java.util.concurrent.Executors;
import org.chromium.net.CronetEngine;

/* JADX INFO: compiled from: com.google.net.cronet:cronet-okhttp@@0.1.1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class impromptu<SubBuilderT extends impromptu<?, ? extends ObjectBeingBuiltT>, ObjectBeingBuiltT> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final CronetEngine f28490attabal;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final impromptu f28493wireman;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public int f28492saneness = 4;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public wireman f28491dern = null;

    public impromptu(CronetEngine cronetEngine, Class cls) {
        this.f28490attabal = (CronetEngine) formularize.triweekly(cronetEngine);
        formularize.wireman(getClass().equals(cls));
        this.f28493wireman = this;
    }

    public ObjectBeingBuiltT attabal() {
        if (this.f28491dern == null) {
            this.f28491dern = wireman.attabal();
        }
        return (ObjectBeingBuiltT) saneness(new competently(this.f28490attabal, Executors.newFixedThreadPool(this.f28492saneness), com.google.net.cronet.okhttptransport.attabal.saneness(Executors.newCachedThreadPool()), new taiyuan(), this.f28491dern));
    }

    public abstract Object saneness(competently competentlyVar);
}
