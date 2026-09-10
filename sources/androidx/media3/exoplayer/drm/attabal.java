package androidx.media3.exoplayer.drm;

import android.net.Uri;
import androidx.media3.common.adultoid;
import com.google.common.collect.immediately;
import com.google.common.primitives.Ints;
import decarock.grimness;
import java.util.Map;
import puffin.monoploid;

/* JADX INFO: compiled from: DefaultDrmSessionManagerProvider.java */
/* JADX INFO: loaded from: classes.dex */
public final class attabal implements monoploid {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Object f11851attabal = new Object();

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public androidx.media3.exoplayer.upstream.saneness f11852beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public dern f11853dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public String f11854marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public adultoid.beachfront f11855saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public androidx.media3.datasource.attabal.InterfaceC0080attabal f11856wireman;

    @Override // puffin.monoploid
    public dern attabal(adultoid adultoidVar) {
        dern dernVar;
        decarock.attabal.marial(adultoidVar.f10619saneness);
        adultoid.beachfront beachfrontVar = adultoidVar.f10619saneness.f10709dern;
        if (beachfrontVar == null) {
            return dern.f11863attabal;
        }
        synchronized (this.f11851attabal) {
            try {
                if (!grimness.dern(beachfrontVar, this.f11855saneness)) {
                    this.f11855saneness = beachfrontVar;
                    this.f11853dern = saneness(beachfrontVar);
                }
                dernVar = (dern) decarock.attabal.marial(this.f11853dern);
            } catch (Throwable th) {
                throw th;
            }
        }
        return dernVar;
    }

    public final dern saneness(adultoid.beachfront beachfrontVar) {
        androidx.media3.datasource.attabal.InterfaceC0080attabal interfaceC0080attabalSaneness = this.f11856wireman;
        if (interfaceC0080attabalSaneness == null) {
            interfaceC0080attabalSaneness = new androidx.media3.datasource.dern.saneness().saneness(this.f11854marial);
        }
        Uri uri = beachfrontVar.f10655dern;
        taiyuan taiyuanVar = new taiyuan(uri == null ? null : uri.toString(), beachfrontVar.f10656impromptu, interfaceC0080attabalSaneness);
        immediately<Map.Entry<String, String>> it = beachfrontVar.f10657marial.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            taiyuanVar.marial(next.getKey(), next.getValue());
        }
        DefaultDrmSessionManager.saneness sanenessVarMarial = new DefaultDrmSessionManager.saneness().beachfront(beachfrontVar.f10651attabal, impromptu.f11865wireman).dern(beachfrontVar.f10652beachfront).wireman(beachfrontVar.f10653competently).marial(Ints.impassible(beachfrontVar.f10654cutely));
        androidx.media3.exoplayer.upstream.saneness sanenessVar = this.f11852beachfront;
        if (sanenessVar != null) {
            sanenessVarMarial.saneness(sanenessVar);
        }
        DefaultDrmSessionManager defaultDrmSessionManagerAttabal = sanenessVarMarial.attabal(taiyuanVar);
        defaultDrmSessionManagerAttabal.sealless(0, beachfrontVar.dern());
        return defaultDrmSessionManagerAttabal;
    }
}
