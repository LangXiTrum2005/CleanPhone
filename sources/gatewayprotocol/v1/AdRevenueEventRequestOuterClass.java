package gatewayprotocol.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class AdRevenueEventRequestOuterClass {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class AdRevenueData extends GeneratedMessageLite<AdRevenueData, Builder> implements AdRevenueDataOrBuilder {
        public static final int AD_FORMAT_FIELD_NUMBER = 7;
        public static final int AD_UNIT_ID_FIELD_NUMBER = 5;
        public static final int COUNTRY_CODE_FIELD_NUMBER = 3;
        private static final AdRevenueData DEFAULT_INSTANCE;
        public static final int EVENT_ID_FIELD_NUMBER = 1;
        public static final int NETWORK_NAME_FIELD_NUMBER = 4;
        private static volatile Parser<AdRevenueData> PARSER = null;
        public static final int REVENUE_FIELD_NUMBER = 2;
        public static final int THIRD_PARTY_AD_PLACEMENT_ID_FIELD_NUMBER = 6;
        private int adFormat_;
        private int bitField0_;
        private double revenue_;
        private ByteString eventId_ = ByteString.EMPTY;
        private String countryCode_ = "";
        private String networkName_ = "";
        private String adUnitId_ = "";
        private String thirdPartyAdPlacementId_ = "";

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class Builder extends GeneratedMessageLite.Builder<AdRevenueData, Builder> implements AdRevenueDataOrBuilder {
            public /* synthetic */ Builder(ji.g gVar) {
                this();
            }

            public Builder clearAdFormat() {
                copyOnWrite();
                ((AdRevenueData) this.instance).clearAdFormat();
                return this;
            }

            public Builder clearAdUnitId() {
                copyOnWrite();
                ((AdRevenueData) this.instance).clearAdUnitId();
                return this;
            }

            public Builder clearCountryCode() {
                copyOnWrite();
                ((AdRevenueData) this.instance).clearCountryCode();
                return this;
            }

            public Builder clearEventId() {
                copyOnWrite();
                ((AdRevenueData) this.instance).clearEventId();
                return this;
            }

            public Builder clearNetworkName() {
                copyOnWrite();
                ((AdRevenueData) this.instance).clearNetworkName();
                return this;
            }

            public Builder clearRevenue() {
                copyOnWrite();
                ((AdRevenueData) this.instance).clearRevenue();
                return this;
            }

            public Builder clearThirdPartyAdPlacementId() {
                copyOnWrite();
                ((AdRevenueData) this.instance).clearThirdPartyAdPlacementId();
                return this;
            }

            @Override // gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueDataOrBuilder
            public AdFormatOuterClass.AdFormat getAdFormat() {
                return ((AdRevenueData) this.instance).getAdFormat();
            }

            @Override // gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueDataOrBuilder
            public int getAdFormatValue() {
                return ((AdRevenueData) this.instance).getAdFormatValue();
            }

            @Override // gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueDataOrBuilder
            public String getAdUnitId() {
                return ((AdRevenueData) this.instance).getAdUnitId();
            }

            @Override // gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueDataOrBuilder
            public ByteString getAdUnitIdBytes() {
                return ((AdRevenueData) this.instance).getAdUnitIdBytes();
            }

            @Override // gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueDataOrBuilder
            public String getCountryCode() {
                return ((AdRevenueData) this.instance).getCountryCode();
            }

            @Override // gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueDataOrBuilder
            public ByteString getCountryCodeBytes() {
                return ((AdRevenueData) this.instance).getCountryCodeBytes();
            }

            @Override // gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueDataOrBuilder
            public ByteString getEventId() {
                return ((AdRevenueData) this.instance).getEventId();
            }

            @Override // gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueDataOrBuilder
            public String getNetworkName() {
                return ((AdRevenueData) this.instance).getNetworkName();
            }

            @Override // gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueDataOrBuilder
            public ByteString getNetworkNameBytes() {
                return ((AdRevenueData) this.instance).getNetworkNameBytes();
            }

            @Override // gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueDataOrBuilder
            public double getRevenue() {
                return ((AdRevenueData) this.instance).getRevenue();
            }

            @Override // gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueDataOrBuilder
            public String getThirdPartyAdPlacementId() {
                return ((AdRevenueData) this.instance).getThirdPartyAdPlacementId();
            }

            @Override // gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueDataOrBuilder
            public ByteString getThirdPartyAdPlacementIdBytes() {
                return ((AdRevenueData) this.instance).getThirdPartyAdPlacementIdBytes();
            }

            @Override // gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueDataOrBuilder
            public boolean hasAdUnitId() {
                return ((AdRevenueData) this.instance).hasAdUnitId();
            }

            @Override // gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueDataOrBuilder
            public boolean hasCountryCode() {
                return ((AdRevenueData) this.instance).hasCountryCode();
            }

            @Override // gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueDataOrBuilder
            public boolean hasNetworkName() {
                return ((AdRevenueData) this.instance).hasNetworkName();
            }

            @Override // gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueDataOrBuilder
            public boolean hasRevenue() {
                return ((AdRevenueData) this.instance).hasRevenue();
            }

            @Override // gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueDataOrBuilder
            public boolean hasThirdPartyAdPlacementId() {
                return ((AdRevenueData) this.instance).hasThirdPartyAdPlacementId();
            }

            public Builder setAdFormat(AdFormatOuterClass.AdFormat adFormat) {
                copyOnWrite();
                ((AdRevenueData) this.instance).setAdFormat(adFormat);
                return this;
            }

            public Builder setAdFormatValue(int i10) {
                copyOnWrite();
                ((AdRevenueData) this.instance).setAdFormatValue(i10);
                return this;
            }

            public Builder setAdUnitId(String str) {
                copyOnWrite();
                ((AdRevenueData) this.instance).setAdUnitId(str);
                return this;
            }

            public Builder setAdUnitIdBytes(ByteString byteString) {
                copyOnWrite();
                ((AdRevenueData) this.instance).setAdUnitIdBytes(byteString);
                return this;
            }

            public Builder setCountryCode(String str) {
                copyOnWrite();
                ((AdRevenueData) this.instance).setCountryCode(str);
                return this;
            }

            public Builder setCountryCodeBytes(ByteString byteString) {
                copyOnWrite();
                ((AdRevenueData) this.instance).setCountryCodeBytes(byteString);
                return this;
            }

            public Builder setEventId(ByteString byteString) {
                copyOnWrite();
                ((AdRevenueData) this.instance).setEventId(byteString);
                return this;
            }

            public Builder setNetworkName(String str) {
                copyOnWrite();
                ((AdRevenueData) this.instance).setNetworkName(str);
                return this;
            }

            public Builder setNetworkNameBytes(ByteString byteString) {
                copyOnWrite();
                ((AdRevenueData) this.instance).setNetworkNameBytes(byteString);
                return this;
            }

            public Builder setRevenue(double d10) {
                copyOnWrite();
                ((AdRevenueData) this.instance).setRevenue(d10);
                return this;
            }

            public Builder setThirdPartyAdPlacementId(String str) {
                copyOnWrite();
                ((AdRevenueData) this.instance).setThirdPartyAdPlacementId(str);
                return this;
            }

            public Builder setThirdPartyAdPlacementIdBytes(ByteString byteString) {
                copyOnWrite();
                ((AdRevenueData) this.instance).setThirdPartyAdPlacementIdBytes(byteString);
                return this;
            }

            private Builder() {
                super(AdRevenueData.DEFAULT_INSTANCE);
            }
        }

        static {
            AdRevenueData adRevenueData = new AdRevenueData();
            DEFAULT_INSTANCE = adRevenueData;
            GeneratedMessageLite.registerDefaultInstance(AdRevenueData.class, adRevenueData);
        }

        private AdRevenueData() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdFormat() {
            this.adFormat_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdUnitId() {
            this.bitField0_ &= -9;
            this.adUnitId_ = getDefaultInstance().getAdUnitId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCountryCode() {
            this.bitField0_ &= -3;
            this.countryCode_ = getDefaultInstance().getCountryCode();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEventId() {
            this.eventId_ = getDefaultInstance().getEventId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNetworkName() {
            this.bitField0_ &= -5;
            this.networkName_ = getDefaultInstance().getNetworkName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRevenue() {
            this.bitField0_ &= -2;
            this.revenue_ = 0.0d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearThirdPartyAdPlacementId() {
            this.bitField0_ &= -17;
            this.thirdPartyAdPlacementId_ = getDefaultInstance().getThirdPartyAdPlacementId();
        }

        public static AdRevenueData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AdRevenueData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AdRevenueData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AdRevenueData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AdRevenueData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<AdRevenueData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdFormat(AdFormatOuterClass.AdFormat adFormat) {
            this.adFormat_ = adFormat.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdFormatValue(int i10) {
            this.adFormat_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdUnitId(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.adUnitId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdUnitIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.adUnitId_ = byteString.toStringUtf8();
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCountryCode(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.countryCode_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCountryCodeBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.countryCode_ = byteString.toStringUtf8();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventId(ByteString byteString) {
            byteString.getClass();
            this.eventId_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNetworkName(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.networkName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNetworkNameBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.networkName_ = byteString.toStringUtf8();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRevenue(double d10) {
            this.bitField0_ |= 1;
            this.revenue_ = d10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setThirdPartyAdPlacementId(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.thirdPartyAdPlacementId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setThirdPartyAdPlacementIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.thirdPartyAdPlacementId_ = byteString.toStringUtf8();
            this.bitField0_ |= 16;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            int i10 = ji.g.f43897a[methodToInvoke.ordinal()];
            ji.g gVar = null;
            switch (i10) {
                case 1:
                    return new AdRevenueData();
                case 2:
                    return new Builder(gVar);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\n\u0002က\u0000\u0003ለ\u0001\u0004ለ\u0002\u0005ለ\u0003\u0006ለ\u0004\u0007\f", new Object[]{"bitField0_", "eventId_", "revenue_", "countryCode_", "networkName_", "adUnitId_", "thirdPartyAdPlacementId_", "adFormat_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<AdRevenueData> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (AdRevenueData.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueDataOrBuilder
        public AdFormatOuterClass.AdFormat getAdFormat() {
            AdFormatOuterClass.AdFormat adFormatForNumber = AdFormatOuterClass.AdFormat.forNumber(this.adFormat_);
            return adFormatForNumber == null ? AdFormatOuterClass.AdFormat.UNRECOGNIZED : adFormatForNumber;
        }

        @Override // gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueDataOrBuilder
        public int getAdFormatValue() {
            return this.adFormat_;
        }

        @Override // gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueDataOrBuilder
        public String getAdUnitId() {
            return this.adUnitId_;
        }

        @Override // gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueDataOrBuilder
        public ByteString getAdUnitIdBytes() {
            return ByteString.copyFromUtf8(this.adUnitId_);
        }

        @Override // gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueDataOrBuilder
        public String getCountryCode() {
            return this.countryCode_;
        }

        @Override // gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueDataOrBuilder
        public ByteString getCountryCodeBytes() {
            return ByteString.copyFromUtf8(this.countryCode_);
        }

        @Override // gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueDataOrBuilder
        public ByteString getEventId() {
            return this.eventId_;
        }

        @Override // gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueDataOrBuilder
        public String getNetworkName() {
            return this.networkName_;
        }

        @Override // gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueDataOrBuilder
        public ByteString getNetworkNameBytes() {
            return ByteString.copyFromUtf8(this.networkName_);
        }

        @Override // gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueDataOrBuilder
        public double getRevenue() {
            return this.revenue_;
        }

        @Override // gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueDataOrBuilder
        public String getThirdPartyAdPlacementId() {
            return this.thirdPartyAdPlacementId_;
        }

        @Override // gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueDataOrBuilder
        public ByteString getThirdPartyAdPlacementIdBytes() {
            return ByteString.copyFromUtf8(this.thirdPartyAdPlacementId_);
        }

        @Override // gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueDataOrBuilder
        public boolean hasAdUnitId() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueDataOrBuilder
        public boolean hasCountryCode() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueDataOrBuilder
        public boolean hasNetworkName() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueDataOrBuilder
        public boolean hasRevenue() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueDataOrBuilder
        public boolean hasThirdPartyAdPlacementId() {
            return (this.bitField0_ & 16) != 0;
        }

        public static Builder newBuilder(AdRevenueData adRevenueData) {
            return DEFAULT_INSTANCE.createBuilder(adRevenueData);
        }

        public static AdRevenueData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdRevenueData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AdRevenueData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AdRevenueData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AdRevenueData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AdRevenueData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AdRevenueData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AdRevenueData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AdRevenueData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AdRevenueData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AdRevenueData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AdRevenueData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AdRevenueData parseFrom(InputStream inputStream) throws IOException {
            return (AdRevenueData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AdRevenueData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdRevenueData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AdRevenueData parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AdRevenueData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AdRevenueData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdRevenueData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface AdRevenueDataOrBuilder extends MessageLiteOrBuilder {
        AdFormatOuterClass.AdFormat getAdFormat();

        int getAdFormatValue();

        String getAdUnitId();

        ByteString getAdUnitIdBytes();

        String getCountryCode();

        ByteString getCountryCodeBytes();

        ByteString getEventId();

        String getNetworkName();

        ByteString getNetworkNameBytes();

        double getRevenue();

        String getThirdPartyAdPlacementId();

        ByteString getThirdPartyAdPlacementIdBytes();

        boolean hasAdUnitId();

        boolean hasCountryCode();

        boolean hasNetworkName();

        boolean hasRevenue();

        boolean hasThirdPartyAdPlacementId();
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class AdRevenueEventRequest extends GeneratedMessageLite<AdRevenueEventRequest, Builder> implements AdRevenueEventRequestOrBuilder {
        public static final int AD_REVENUE_DATA_FIELD_NUMBER = 3;
        public static final int AD_REVENUE_ORIGIN_FIELD_NUMBER = 5;
        private static final AdRevenueEventRequest DEFAULT_INSTANCE;
        public static final int DYNAMIC_DEVICE_INFO_FIELD_NUMBER = 2;
        public static final int MEDIATION_PROVIDER_FIELD_NUMBER = 4;
        private static volatile Parser<AdRevenueEventRequest> PARSER = null;
        public static final int STATIC_DEVICE_INFO_FIELD_NUMBER = 1;
        private AdRevenueData adRevenueData_;
        private int adRevenueOrigin_;
        private int bitField0_;
        private DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo_;
        private int mediationProvider_;
        private StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo_;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class Builder extends GeneratedMessageLite.Builder<AdRevenueEventRequest, Builder> implements AdRevenueEventRequestOrBuilder {
            public /* synthetic */ Builder(ji.g gVar) {
                this();
            }

            public Builder clearAdRevenueData() {
                copyOnWrite();
                ((AdRevenueEventRequest) this.instance).clearAdRevenueData();
                return this;
            }

            public Builder clearAdRevenueOrigin() {
                copyOnWrite();
                ((AdRevenueEventRequest) this.instance).clearAdRevenueOrigin();
                return this;
            }

            public Builder clearDynamicDeviceInfo() {
                copyOnWrite();
                ((AdRevenueEventRequest) this.instance).clearDynamicDeviceInfo();
                return this;
            }

            public Builder clearMediationProvider() {
                copyOnWrite();
                ((AdRevenueEventRequest) this.instance).clearMediationProvider();
                return this;
            }

            public Builder clearStaticDeviceInfo() {
                copyOnWrite();
                ((AdRevenueEventRequest) this.instance).clearStaticDeviceInfo();
                return this;
            }

            @Override // gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueEventRequestOrBuilder
            public AdRevenueData getAdRevenueData() {
                return ((AdRevenueEventRequest) this.instance).getAdRevenueData();
            }

            @Override // gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueEventRequestOrBuilder
            public AdRevenueOrigin getAdRevenueOrigin() {
                return ((AdRevenueEventRequest) this.instance).getAdRevenueOrigin();
            }

            @Override // gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueEventRequestOrBuilder
            public int getAdRevenueOriginValue() {
                return ((AdRevenueEventRequest) this.instance).getAdRevenueOriginValue();
            }

            @Override // gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueEventRequestOrBuilder
            public DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
                return ((AdRevenueEventRequest) this.instance).getDynamicDeviceInfo();
            }

            @Override // gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueEventRequestOrBuilder
            public ClientInfoOuterClass.MediationProvider getMediationProvider() {
                return ((AdRevenueEventRequest) this.instance).getMediationProvider();
            }

            @Override // gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueEventRequestOrBuilder
            public int getMediationProviderValue() {
                return ((AdRevenueEventRequest) this.instance).getMediationProviderValue();
            }

            @Override // gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueEventRequestOrBuilder
            public StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
                return ((AdRevenueEventRequest) this.instance).getStaticDeviceInfo();
            }

            @Override // gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueEventRequestOrBuilder
            public boolean hasAdRevenueData() {
                return ((AdRevenueEventRequest) this.instance).hasAdRevenueData();
            }

            @Override // gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueEventRequestOrBuilder
            public boolean hasDynamicDeviceInfo() {
                return ((AdRevenueEventRequest) this.instance).hasDynamicDeviceInfo();
            }

            @Override // gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueEventRequestOrBuilder
            public boolean hasStaticDeviceInfo() {
                return ((AdRevenueEventRequest) this.instance).hasStaticDeviceInfo();
            }

            public Builder mergeAdRevenueData(AdRevenueData adRevenueData) {
                copyOnWrite();
                ((AdRevenueEventRequest) this.instance).mergeAdRevenueData(adRevenueData);
                return this;
            }

            public Builder mergeDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
                copyOnWrite();
                ((AdRevenueEventRequest) this.instance).mergeDynamicDeviceInfo(dynamicDeviceInfo);
                return this;
            }

            public Builder mergeStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
                copyOnWrite();
                ((AdRevenueEventRequest) this.instance).mergeStaticDeviceInfo(staticDeviceInfo);
                return this;
            }

            public Builder setAdRevenueData(AdRevenueData adRevenueData) {
                copyOnWrite();
                ((AdRevenueEventRequest) this.instance).setAdRevenueData(adRevenueData);
                return this;
            }

            public Builder setAdRevenueOrigin(AdRevenueOrigin adRevenueOrigin) {
                copyOnWrite();
                ((AdRevenueEventRequest) this.instance).setAdRevenueOrigin(adRevenueOrigin);
                return this;
            }

            public Builder setAdRevenueOriginValue(int i10) {
                copyOnWrite();
                ((AdRevenueEventRequest) this.instance).setAdRevenueOriginValue(i10);
                return this;
            }

            public Builder setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
                copyOnWrite();
                ((AdRevenueEventRequest) this.instance).setDynamicDeviceInfo(dynamicDeviceInfo);
                return this;
            }

            public Builder setMediationProvider(ClientInfoOuterClass.MediationProvider mediationProvider) {
                copyOnWrite();
                ((AdRevenueEventRequest) this.instance).setMediationProvider(mediationProvider);
                return this;
            }

            public Builder setMediationProviderValue(int i10) {
                copyOnWrite();
                ((AdRevenueEventRequest) this.instance).setMediationProviderValue(i10);
                return this;
            }

            public Builder setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
                copyOnWrite();
                ((AdRevenueEventRequest) this.instance).setStaticDeviceInfo(staticDeviceInfo);
                return this;
            }

            private Builder() {
                super(AdRevenueEventRequest.DEFAULT_INSTANCE);
            }

            public Builder setAdRevenueData(AdRevenueData.Builder builder) {
                copyOnWrite();
                ((AdRevenueEventRequest) this.instance).setAdRevenueData(builder.build());
                return this;
            }

            public Builder setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builder) {
                copyOnWrite();
                ((AdRevenueEventRequest) this.instance).setDynamicDeviceInfo(builder.build());
                return this;
            }

            public Builder setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder) {
                copyOnWrite();
                ((AdRevenueEventRequest) this.instance).setStaticDeviceInfo(builder.build());
                return this;
            }
        }

        static {
            AdRevenueEventRequest adRevenueEventRequest = new AdRevenueEventRequest();
            DEFAULT_INSTANCE = adRevenueEventRequest;
            GeneratedMessageLite.registerDefaultInstance(AdRevenueEventRequest.class, adRevenueEventRequest);
        }

        private AdRevenueEventRequest() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdRevenueData() {
            this.adRevenueData_ = null;
            this.bitField0_ &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdRevenueOrigin() {
            this.adRevenueOrigin_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDynamicDeviceInfo() {
            this.dynamicDeviceInfo_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMediationProvider() {
            this.mediationProvider_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStaticDeviceInfo() {
            this.staticDeviceInfo_ = null;
            this.bitField0_ &= -2;
        }

        public static AdRevenueEventRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAdRevenueData(AdRevenueData adRevenueData) {
            adRevenueData.getClass();
            AdRevenueData adRevenueData2 = this.adRevenueData_;
            if (adRevenueData2 == null || adRevenueData2 == AdRevenueData.getDefaultInstance()) {
                this.adRevenueData_ = adRevenueData;
            } else {
                this.adRevenueData_ = AdRevenueData.newBuilder(this.adRevenueData_).mergeFrom(adRevenueData).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.getClass();
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo2 = this.dynamicDeviceInfo_;
            if (dynamicDeviceInfo2 == null || dynamicDeviceInfo2 == DynamicDeviceInfoOuterClass.DynamicDeviceInfo.getDefaultInstance()) {
                this.dynamicDeviceInfo_ = dynamicDeviceInfo;
            } else {
                this.dynamicDeviceInfo_ = DynamicDeviceInfoOuterClass.DynamicDeviceInfo.newBuilder(this.dynamicDeviceInfo_).mergeFrom(dynamicDeviceInfo).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.getClass();
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo2 = this.staticDeviceInfo_;
            if (staticDeviceInfo2 == null || staticDeviceInfo2 == StaticDeviceInfoOuterClass.StaticDeviceInfo.getDefaultInstance()) {
                this.staticDeviceInfo_ = staticDeviceInfo;
            } else {
                this.staticDeviceInfo_ = StaticDeviceInfoOuterClass.StaticDeviceInfo.newBuilder(this.staticDeviceInfo_).mergeFrom(staticDeviceInfo).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AdRevenueEventRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AdRevenueEventRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AdRevenueEventRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AdRevenueEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<AdRevenueEventRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdRevenueData(AdRevenueData adRevenueData) {
            adRevenueData.getClass();
            this.adRevenueData_ = adRevenueData;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdRevenueOrigin(AdRevenueOrigin adRevenueOrigin) {
            this.adRevenueOrigin_ = adRevenueOrigin.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdRevenueOriginValue(int i10) {
            this.adRevenueOrigin_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.getClass();
            this.dynamicDeviceInfo_ = dynamicDeviceInfo;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMediationProvider(ClientInfoOuterClass.MediationProvider mediationProvider) {
            this.mediationProvider_ = mediationProvider.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMediationProviderValue(int i10) {
            this.mediationProvider_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.getClass();
            this.staticDeviceInfo_ = staticDeviceInfo;
            this.bitField0_ |= 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            int i10 = ji.g.f43897a[methodToInvoke.ordinal()];
            ji.g gVar = null;
            switch (i10) {
                case 1:
                    return new AdRevenueEventRequest();
                case 2:
                    return new Builder(gVar);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\f\u0005\f", new Object[]{"bitField0_", "staticDeviceInfo_", "dynamicDeviceInfo_", "adRevenueData_", "mediationProvider_", "adRevenueOrigin_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<AdRevenueEventRequest> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (AdRevenueEventRequest.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueEventRequestOrBuilder
        public AdRevenueData getAdRevenueData() {
            AdRevenueData adRevenueData = this.adRevenueData_;
            return adRevenueData == null ? AdRevenueData.getDefaultInstance() : adRevenueData;
        }

        @Override // gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueEventRequestOrBuilder
        public AdRevenueOrigin getAdRevenueOrigin() {
            AdRevenueOrigin adRevenueOriginForNumber = AdRevenueOrigin.forNumber(this.adRevenueOrigin_);
            return adRevenueOriginForNumber == null ? AdRevenueOrigin.UNRECOGNIZED : adRevenueOriginForNumber;
        }

        @Override // gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueEventRequestOrBuilder
        public int getAdRevenueOriginValue() {
            return this.adRevenueOrigin_;
        }

        @Override // gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueEventRequestOrBuilder
        public DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this.dynamicDeviceInfo_;
            return dynamicDeviceInfo == null ? DynamicDeviceInfoOuterClass.DynamicDeviceInfo.getDefaultInstance() : dynamicDeviceInfo;
        }

        @Override // gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueEventRequestOrBuilder
        public ClientInfoOuterClass.MediationProvider getMediationProvider() {
            ClientInfoOuterClass.MediationProvider mediationProviderForNumber = ClientInfoOuterClass.MediationProvider.forNumber(this.mediationProvider_);
            return mediationProviderForNumber == null ? ClientInfoOuterClass.MediationProvider.UNRECOGNIZED : mediationProviderForNumber;
        }

        @Override // gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueEventRequestOrBuilder
        public int getMediationProviderValue() {
            return this.mediationProvider_;
        }

        @Override // gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueEventRequestOrBuilder
        public StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = this.staticDeviceInfo_;
            return staticDeviceInfo == null ? StaticDeviceInfoOuterClass.StaticDeviceInfo.getDefaultInstance() : staticDeviceInfo;
        }

        @Override // gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueEventRequestOrBuilder
        public boolean hasAdRevenueData() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueEventRequestOrBuilder
        public boolean hasDynamicDeviceInfo() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueEventRequestOrBuilder
        public boolean hasStaticDeviceInfo() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(AdRevenueEventRequest adRevenueEventRequest) {
            return DEFAULT_INSTANCE.createBuilder(adRevenueEventRequest);
        }

        public static AdRevenueEventRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdRevenueEventRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AdRevenueEventRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AdRevenueEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AdRevenueEventRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AdRevenueEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AdRevenueEventRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AdRevenueEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AdRevenueEventRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AdRevenueEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AdRevenueEventRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AdRevenueEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AdRevenueEventRequest parseFrom(InputStream inputStream) throws IOException {
            return (AdRevenueEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AdRevenueEventRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdRevenueEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AdRevenueEventRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AdRevenueEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AdRevenueEventRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdRevenueEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface AdRevenueEventRequestOrBuilder extends MessageLiteOrBuilder {
        AdRevenueData getAdRevenueData();

        AdRevenueOrigin getAdRevenueOrigin();

        int getAdRevenueOriginValue();

        DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo();

        ClientInfoOuterClass.MediationProvider getMediationProvider();

        int getMediationProviderValue();

        StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo();

        boolean hasAdRevenueData();

        boolean hasDynamicDeviceInfo();

        boolean hasStaticDeviceInfo();
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum AdRevenueOrigin implements Internal.EnumLite {
        AD_REVENUE_ORIGIN_UNSPECIFIED(0),
        AD_REVENUE_ORIGIN_AUTOMATIC_COLLECTION(1),
        AD_REVENUE_ORIGIN_MANUAL_COLLECTION(2),
        UNRECOGNIZED(-1);

        public static final int AD_REVENUE_ORIGIN_AUTOMATIC_COLLECTION_VALUE = 1;
        public static final int AD_REVENUE_ORIGIN_MANUAL_COLLECTION_VALUE = 2;
        public static final int AD_REVENUE_ORIGIN_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap<AdRevenueOrigin> internalValueMap = new g();
        private final int value;

        AdRevenueOrigin(int i10) {
            this.value = i10;
        }

        public static AdRevenueOrigin forNumber(int i10) {
            if (i10 == 0) {
                return AD_REVENUE_ORIGIN_UNSPECIFIED;
            }
            if (i10 == 1) {
                return AD_REVENUE_ORIGIN_AUTOMATIC_COLLECTION;
            }
            if (i10 != 2) {
                return null;
            }
            return AD_REVENUE_ORIGIN_MANUAL_COLLECTION;
        }

        public static Internal.EnumLiteMap<AdRevenueOrigin> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return h.f41791a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static AdRevenueOrigin valueOf(int i10) {
            return forNumber(i10);
        }
    }

    private AdRevenueEventRequestOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
