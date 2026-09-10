package com.unity3d.services.ads.gmascar.utils;

import com.ironsource.C0663xe;
import com.unity3d.ads.AdFormat;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.core.extensions.AdFormatExtensions;
import com.unity3d.services.core.configuration.IExperiments;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import ph.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/unity3d/services/ads/gmascar/utils/ScarAdFormatProvider;", "Lcom/unity3d/services/ads/gmascar/utils/IScarAdFormatProvider;", "Lcom/unity3d/ads/TokenConfiguration;", "tokenConfiguration", "Lcom/unity3d/services/core/configuration/IExperiments;", C0663xe.f31076d, "<init>", "(Lcom/unity3d/ads/TokenConfiguration;Lcom/unity3d/services/core/configuration/IExperiments;)V", "", "Lph/d;", "buildAdFormatList", "()Ljava/util/List;", "Lcom/unity3d/ads/TokenConfiguration;", "getTokenConfiguration", "()Lcom/unity3d/ads/TokenConfiguration;", "Lcom/unity3d/services/core/configuration/IExperiments;", "getExperiments", "()Lcom/unity3d/services/core/configuration/IExperiments;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class ScarAdFormatProvider implements IScarAdFormatProvider {
    private final IExperiments experiments;
    private final TokenConfiguration tokenConfiguration;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdFormat.values().length];
            try {
                iArr[AdFormat.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ScarAdFormatProvider(TokenConfiguration tokenConfiguration, IExperiments experiments) {
        n.f(experiments, "experiments");
        this.tokenConfiguration = tokenConfiguration;
        this.experiments = experiments;
    }

    @Override // com.unity3d.services.ads.gmascar.utils.IScarAdFormatProvider
    public List<d> buildAdFormatList() {
        ArrayList arrayList = new ArrayList();
        TokenConfiguration tokenConfiguration = this.tokenConfiguration;
        d dVar = d.f48379d;
        if (tokenConfiguration == null) {
            arrayList.add(d.f48378c);
            arrayList.add(d.f48377b);
            if (this.experiments.isScarBannerHbEnabled()) {
                arrayList.add(dVar);
                return arrayList;
            }
        } else {
            if (WhenMappings.$EnumSwitchMapping$0[tokenConfiguration.getAdFormat().ordinal()] != 1) {
                arrayList.add(AdFormatExtensions.toUnityAdFormat(this.tokenConfiguration.getAdFormat()));
                return arrayList;
            }
            if (this.experiments.isScarBannerHbEnabled()) {
                arrayList.add(dVar);
            }
        }
        return arrayList;
    }

    public final IExperiments getExperiments() {
        return this.experiments;
    }

    public final TokenConfiguration getTokenConfiguration() {
        return this.tokenConfiguration;
    }
}
