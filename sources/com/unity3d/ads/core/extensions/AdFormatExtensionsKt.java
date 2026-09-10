package com.unity3d.ads.core.extensions;

import com.unity3d.scar.adapter.common.scarads.UnityAdFormat;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class AdFormatExtensionsKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InitializationResponseOuterClass.AdFormat.values().length];
            try {
                iArr[InitializationResponseOuterClass.AdFormat.AD_FORMAT_REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InitializationResponseOuterClass.AdFormat.AD_FORMAT_INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InitializationResponseOuterClass.AdFormat.AD_FORMAT_BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final UnityAdFormat toUnityAdFormat(InitializationResponseOuterClass.AdFormat adFormat) {
        AbstractC2995aW.q(adFormat, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[adFormat.ordinal()];
        if (i == 1) {
            return UnityAdFormat.REWARDED;
        }
        if (i == 2) {
            return UnityAdFormat.INTERSTITIAL;
        }
        if (i != 3) {
            return null;
        }
        return UnityAdFormat.BANNER;
    }
}
