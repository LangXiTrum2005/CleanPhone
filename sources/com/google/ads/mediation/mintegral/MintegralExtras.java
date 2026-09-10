package com.google.ads.mediation.mintegral;

import android.os.Bundle;
import com.applovin.mediation.AppLovinExtras;

/* JADX INFO: loaded from: classes2.dex */
public final class MintegralExtras {

    public static class Builder {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public boolean f18967attabal;

        public Bundle build() {
            Bundle bundle = new Bundle();
            bundle.putBoolean(AppLovinExtras.Keys.MUTE_AUDIO, this.f18967attabal);
            return bundle;
        }

        public Builder setMuteAudio(boolean z) {
            this.f18967attabal = z;
            return this;
        }
    }
}
