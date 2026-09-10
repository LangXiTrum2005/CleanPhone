package com.google.ads.mediation.pangle;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public class PangleExtras {

    public static class Builder {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public String f19027attabal;

        public Bundle build() {
            Bundle bundle = new Bundle();
            bundle.putString("user_data", this.f19027attabal);
            return bundle;
        }

        public Builder setUserData(String str) {
            this.f19027attabal = str;
            return this;
        }
    }
}
