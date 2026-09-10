package com.applovin.impl.mediation;

import androidx.annotation.NonNull;
import com.applovin.mediation.MaxAdViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class MaxAdViewConfigurationImpl extends MaxAdViewConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MaxAdViewConfiguration.AdaptiveType f8420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f8421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f8422c;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class BuilderImpl implements MaxAdViewConfiguration.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MaxAdViewConfiguration.AdaptiveType f8423a = MaxAdViewConfiguration.AdaptiveType.NONE;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f8424b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f8425c = -1;

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration build() {
            return new MaxAdViewConfigurationImpl(this);
        }

        public MaxAdViewConfiguration.AdaptiveType getAdaptiveType() {
            return this.f8423a;
        }

        public int getAdaptiveWidth() {
            return this.f8424b;
        }

        public int getInlineMaximumHeight() {
            return this.f8425c;
        }

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration.Builder setAdaptiveType(MaxAdViewConfiguration.AdaptiveType adaptiveType) {
            com.applovin.impl.sdk.p.e("MaxAdViewConfiguration", "setAdaptiveType(adaptiveType=" + adaptiveType + ")");
            this.f8423a = adaptiveType;
            return this;
        }

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration.Builder setAdaptiveWidth(int i10) {
            com.applovin.impl.sdk.p.e("MaxAdViewConfiguration", "setAdaptiveWidth(adaptiveWidth=" + i10 + ")");
            this.f8424b = i10;
            return this;
        }

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration.Builder setInlineMaximumHeight(int i10) {
            com.applovin.impl.sdk.p.e("MaxAdViewConfiguration", "setInlineMaximumHeight(inlineMaximumHeight=" + i10 + ")");
            this.f8425c = i10;
            return this;
        }

        @NonNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("MaxAdViewConfiguration.Builder{adaptiveType=");
            sb2.append(this.f8423a);
            sb2.append(", adaptiveWidth=");
            sb2.append(this.f8424b);
            sb2.append(", inlineMaximumHeight=");
            return l1.d.i(sb2, this.f8425c, "}");
        }
    }

    @Override // com.applovin.mediation.MaxAdViewConfiguration
    public MaxAdViewConfiguration.AdaptiveType getAdaptiveType() {
        return this.f8420a;
    }

    @Override // com.applovin.mediation.MaxAdViewConfiguration
    public int getAdaptiveWidth() {
        return this.f8421b;
    }

    @Override // com.applovin.mediation.MaxAdViewConfiguration
    public int getInlineMaximumHeight() {
        return this.f8422c;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("MaxAdViewConfiguration{adaptiveType=");
        sb2.append(this.f8420a);
        sb2.append(", adaptiveWidth=");
        sb2.append(this.f8421b);
        sb2.append(", inlineMaximumHeight=");
        return l1.d.i(sb2, this.f8422c, "}");
    }

    private MaxAdViewConfigurationImpl(BuilderImpl builderImpl) {
        this.f8420a = builderImpl.f8423a;
        this.f8421b = builderImpl.f8424b;
        this.f8422c = builderImpl.f8425c;
    }
}
