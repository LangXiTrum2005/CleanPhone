package gatewayprotocol.v1;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Internal;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class AdFormatOuterClass {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum AdFormat implements Internal.EnumLite {
        AD_FORMAT_UNSPECIFIED(0),
        AD_FORMAT_INTERSTITIAL(1),
        AD_FORMAT_REWARDED(2),
        AD_FORMAT_BANNER(3),
        AD_FORMAT_MREC(4),
        AD_FORMAT_NATIVE(5),
        UNRECOGNIZED(-1);

        public static final int AD_FORMAT_BANNER_VALUE = 3;
        public static final int AD_FORMAT_INTERSTITIAL_VALUE = 1;
        public static final int AD_FORMAT_MREC_VALUE = 4;
        public static final int AD_FORMAT_NATIVE_VALUE = 5;
        public static final int AD_FORMAT_REWARDED_VALUE = 2;
        public static final int AD_FORMAT_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap<AdFormat> internalValueMap = new a();
        private final int value;

        AdFormat(int i10) {
            this.value = i10;
        }

        public static AdFormat forNumber(int i10) {
            if (i10 == 0) {
                return AD_FORMAT_UNSPECIFIED;
            }
            if (i10 == 1) {
                return AD_FORMAT_INTERSTITIAL;
            }
            if (i10 == 2) {
                return AD_FORMAT_REWARDED;
            }
            if (i10 == 3) {
                return AD_FORMAT_BANNER;
            }
            if (i10 == 4) {
                return AD_FORMAT_MREC;
            }
            if (i10 != 5) {
                return null;
            }
            return AD_FORMAT_NATIVE;
        }

        public static Internal.EnumLiteMap<AdFormat> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f41780a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static AdFormat valueOf(int i10) {
            return forNumber(i10);
        }
    }

    private AdFormatOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
