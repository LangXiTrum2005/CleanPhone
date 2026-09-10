package com.chartboost.heliumsdk.domain;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/chartboost/heliumsdk/domain/AdFormat;", "", "key", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "INTERSTITIAL", "REWARDED", "BANNER", "ADAPTIVE_BANNER", "REWARDED_INTERSTITIAL", "UNKNOWN", "Companion", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum AdFormat {
    INTERSTITIAL("interstitial"),
    REWARDED("rewarded"),
    BANNER("banner"),
    ADAPTIVE_BANNER("adaptive_banner"),
    REWARDED_INTERSTITIAL("rewarded_interstitial"),
    UNKNOWN("unknown");


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String key;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¨\u0006\u000b"}, d2 = {"Lcom/chartboost/heliumsdk/domain/AdFormat$Companion;", "", "()V", "fromAdType", "Lcom/chartboost/heliumsdk/domain/AdFormat;", "value", "", "(Ljava/lang/Integer;)Lcom/chartboost/heliumsdk/domain/AdFormat;", "fromString", "", "toAdType", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AdFormat.values().length];
                try {
                    iArr[AdFormat.INTERSTITIAL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AdFormat.REWARDED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AdFormat.BANNER.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AdFormat.ADAPTIVE_BANNER.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AdFormat.REWARDED_INTERSTITIAL.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AdFormat fromAdType(Integer value) {
            if (value != null && value.intValue() == 0) {
                return AdFormat.INTERSTITIAL;
            }
            if (value != null && value.intValue() == 1) {
                return AdFormat.REWARDED;
            }
            if (value != null && value.intValue() == 2) {
                return AdFormat.BANNER;
            }
            if (value != null && value.intValue() == 4) {
                return AdFormat.BANNER;
            }
            return (value != null && value.intValue() == 3) ? AdFormat.REWARDED_INTERSTITIAL : AdFormat.UNKNOWN;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001c  */
        /* JADX WARN: Code duplicated, block: B:12:0x001f A[RETURN] */
        public final AdFormat fromString(String value) {
            for (AdFormat adFormat : AdFormat.values()) {
                if (StringsKt.r(adFormat.getKey(), value, true)) {
                    if (adFormat == null) {
                        return AdFormat.UNKNOWN;
                    }
                    return adFormat;
                }
            }
            adFormat = null;
            if (adFormat == null) {
                return AdFormat.UNKNOWN;
            }
            return adFormat;
        }

        public final int toAdType(AdFormat value) {
            int i2 = value == null ? -1 : WhenMappings.$EnumSwitchMapping$0[value.ordinal()];
            if (i2 == 1) {
                return 0;
            }
            int i3 = 2;
            if (i2 == 2) {
                return 1;
            }
            if (i2 != 3) {
                i3 = 4;
                if (i2 != 4) {
                    return i2 != 5 ? -1 : 3;
                }
            }
            return i3;
        }

        private Companion() {
        }
    }

    AdFormat(String str) {
        this.key = str;
    }

    public final String getKey() {
        return this.key;
    }
}
