package androidx.media3.exoplayer.mediacodec;

import android.content.Context;
import androidx.media3.common.rotuma;
import decarock.grimness;
import decarock.triweekly;
import java.io.IOException;

/* JADX INFO: compiled from: DefaultMediaCodecAdapterFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class dern implements wireman.saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Context f12073attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public int f12075saneness = 0;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public boolean f12074dern = true;

    public dern(Context context) {
        this.f12073attabal = context;
    }

    @Override // androidx.media3.exoplayer.mediacodec.wireman.saneness
    public wireman attabal(wireman.attabal attabalVar) throws IOException {
        int i;
        if (grimness.f25080attabal < 23 || !((i = this.f12075saneness) == 1 || (i == 0 && saneness()))) {
            return new impromptu.saneness().attabal(attabalVar);
        }
        int iBeachfront = rotuma.beachfront(attabalVar.f12106dern.f11218triweekly);
        triweekly.beachfront("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + grimness.coi(iBeachfront));
        attabal.saneness sanenessVar = new attabal.saneness(iBeachfront);
        sanenessVar.marial(this.f12074dern);
        return sanenessVar.attabal(attabalVar);
    }

    public final boolean saneness() {
        int i = grimness.f25080attabal;
        if (i >= 31) {
            return true;
        }
        Context context = this.f12073attabal;
        return context != null && i >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen");
    }
}
