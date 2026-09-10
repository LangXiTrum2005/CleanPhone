package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class AdResponseOuterClass {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class AdResponse extends GeneratedMessageLite<AdResponse, Builder> implements AdResponseOrBuilder {
        public static final int AD_DATA_FIELD_NUMBER = 6;
        public static final int AD_DATA_REFRESH_TOKEN_FIELD_NUMBER = 5;
        public static final int AD_DATA_VERSION_FIELD_NUMBER = 7;
        public static final int CAMPAIGN_METADATA_FIELD_NUMBER = 9;
        private static final AdResponse DEFAULT_INSTANCE;
        public static final int ERROR_FIELD_NUMBER = 8;
        public static final int IMPRESSION_CONFIGURATION_FIELD_NUMBER = 2;
        public static final int IMPRESSION_CONFIGURATION_VERSION_FIELD_NUMBER = 3;
        private static volatile Parser<AdResponse> PARSER = null;
        public static final int TRACKING_TOKEN_FIELD_NUMBER = 1;
        public static final int WEBVIEW_CONFIGURATION_FIELD_NUMBER = 4;
        private ByteString adDataRefreshToken_;
        private int adDataVersion_;
        private ByteString adData_;
        private int bitField0_;
        private CampaignMetadataOuterClass.CampaignMetadata campaignMetadata_;
        private ErrorOuterClass.Error error_;
        private int impressionConfigurationVersion_;
        private ByteString impressionConfiguration_;
        private ByteString trackingToken_;
        private WebviewConfiguration.WebViewConfiguration webviewConfiguration_;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class Builder extends GeneratedMessageLite.Builder<AdResponse, Builder> implements AdResponseOrBuilder {
            public /* synthetic */ Builder(ji.f fVar) {
                this();
            }

            public Builder clearAdData() {
                copyOnWrite();
                ((AdResponse) this.instance).clearAdData();
                return this;
            }

            public Builder clearAdDataRefreshToken() {
                copyOnWrite();
                ((AdResponse) this.instance).clearAdDataRefreshToken();
                return this;
            }

            public Builder clearAdDataVersion() {
                copyOnWrite();
                ((AdResponse) this.instance).clearAdDataVersion();
                return this;
            }

            public Builder clearCampaignMetadata() {
                copyOnWrite();
                ((AdResponse) this.instance).clearCampaignMetadata();
                return this;
            }

            public Builder clearError() {
                copyOnWrite();
                ((AdResponse) this.instance).clearError();
                return this;
            }

            public Builder clearImpressionConfiguration() {
                copyOnWrite();
                ((AdResponse) this.instance).clearImpressionConfiguration();
                return this;
            }

            public Builder clearImpressionConfigurationVersion() {
                copyOnWrite();
                ((AdResponse) this.instance).clearImpressionConfigurationVersion();
                return this;
            }

            public Builder clearTrackingToken() {
                copyOnWrite();
                ((AdResponse) this.instance).clearTrackingToken();
                return this;
            }

            public Builder clearWebviewConfiguration() {
                copyOnWrite();
                ((AdResponse) this.instance).clearWebviewConfiguration();
                return this;
            }

            @Override // gatewayprotocol.v1.AdResponseOuterClass.AdResponseOrBuilder
            public ByteString getAdData() {
                return ((AdResponse) this.instance).getAdData();
            }

            @Override // gatewayprotocol.v1.AdResponseOuterClass.AdResponseOrBuilder
            public ByteString getAdDataRefreshToken() {
                return ((AdResponse) this.instance).getAdDataRefreshToken();
            }

            @Override // gatewayprotocol.v1.AdResponseOuterClass.AdResponseOrBuilder
            public int getAdDataVersion() {
                return ((AdResponse) this.instance).getAdDataVersion();
            }

            @Override // gatewayprotocol.v1.AdResponseOuterClass.AdResponseOrBuilder
            public CampaignMetadataOuterClass.CampaignMetadata getCampaignMetadata() {
                return ((AdResponse) this.instance).getCampaignMetadata();
            }

            @Override // gatewayprotocol.v1.AdResponseOuterClass.AdResponseOrBuilder
            public ErrorOuterClass.Error getError() {
                return ((AdResponse) this.instance).getError();
            }

            @Override // gatewayprotocol.v1.AdResponseOuterClass.AdResponseOrBuilder
            public ByteString getImpressionConfiguration() {
                return ((AdResponse) this.instance).getImpressionConfiguration();
            }

            @Override // gatewayprotocol.v1.AdResponseOuterClass.AdResponseOrBuilder
            public int getImpressionConfigurationVersion() {
                return ((AdResponse) this.instance).getImpressionConfigurationVersion();
            }

            @Override // gatewayprotocol.v1.AdResponseOuterClass.AdResponseOrBuilder
            public ByteString getTrackingToken() {
                return ((AdResponse) this.instance).getTrackingToken();
            }

            @Override // gatewayprotocol.v1.AdResponseOuterClass.AdResponseOrBuilder
            public WebviewConfiguration.WebViewConfiguration getWebviewConfiguration() {
                return ((AdResponse) this.instance).getWebviewConfiguration();
            }

            @Override // gatewayprotocol.v1.AdResponseOuterClass.AdResponseOrBuilder
            public boolean hasCampaignMetadata() {
                return ((AdResponse) this.instance).hasCampaignMetadata();
            }

            @Override // gatewayprotocol.v1.AdResponseOuterClass.AdResponseOrBuilder
            public boolean hasError() {
                return ((AdResponse) this.instance).hasError();
            }

            @Override // gatewayprotocol.v1.AdResponseOuterClass.AdResponseOrBuilder
            public boolean hasWebviewConfiguration() {
                return ((AdResponse) this.instance).hasWebviewConfiguration();
            }

            public Builder mergeCampaignMetadata(CampaignMetadataOuterClass.CampaignMetadata campaignMetadata) {
                copyOnWrite();
                ((AdResponse) this.instance).mergeCampaignMetadata(campaignMetadata);
                return this;
            }

            public Builder mergeError(ErrorOuterClass.Error error) {
                copyOnWrite();
                ((AdResponse) this.instance).mergeError(error);
                return this;
            }

            public Builder mergeWebviewConfiguration(WebviewConfiguration.WebViewConfiguration webViewConfiguration) {
                copyOnWrite();
                ((AdResponse) this.instance).mergeWebviewConfiguration(webViewConfiguration);
                return this;
            }

            public Builder setAdData(ByteString byteString) {
                copyOnWrite();
                ((AdResponse) this.instance).setAdData(byteString);
                return this;
            }

            public Builder setAdDataRefreshToken(ByteString byteString) {
                copyOnWrite();
                ((AdResponse) this.instance).setAdDataRefreshToken(byteString);
                return this;
            }

            public Builder setAdDataVersion(int i10) {
                copyOnWrite();
                ((AdResponse) this.instance).setAdDataVersion(i10);
                return this;
            }

            public Builder setCampaignMetadata(CampaignMetadataOuterClass.CampaignMetadata campaignMetadata) {
                copyOnWrite();
                ((AdResponse) this.instance).setCampaignMetadata(campaignMetadata);
                return this;
            }

            public Builder setError(ErrorOuterClass.Error error) {
                copyOnWrite();
                ((AdResponse) this.instance).setError(error);
                return this;
            }

            public Builder setImpressionConfiguration(ByteString byteString) {
                copyOnWrite();
                ((AdResponse) this.instance).setImpressionConfiguration(byteString);
                return this;
            }

            public Builder setImpressionConfigurationVersion(int i10) {
                copyOnWrite();
                ((AdResponse) this.instance).setImpressionConfigurationVersion(i10);
                return this;
            }

            public Builder setTrackingToken(ByteString byteString) {
                copyOnWrite();
                ((AdResponse) this.instance).setTrackingToken(byteString);
                return this;
            }

            public Builder setWebviewConfiguration(WebviewConfiguration.WebViewConfiguration webViewConfiguration) {
                copyOnWrite();
                ((AdResponse) this.instance).setWebviewConfiguration(webViewConfiguration);
                return this;
            }

            private Builder() {
                super(AdResponse.DEFAULT_INSTANCE);
            }

            public Builder setCampaignMetadata(CampaignMetadataOuterClass.CampaignMetadata.Builder builder) {
                copyOnWrite();
                ((AdResponse) this.instance).setCampaignMetadata(builder.build());
                return this;
            }

            public Builder setError(ErrorOuterClass.Error.Builder builder) {
                copyOnWrite();
                ((AdResponse) this.instance).setError(builder.build());
                return this;
            }

            public Builder setWebviewConfiguration(WebviewConfiguration.WebViewConfiguration.Builder builder) {
                copyOnWrite();
                ((AdResponse) this.instance).setWebviewConfiguration(builder.build());
                return this;
            }
        }

        static {
            AdResponse adResponse = new AdResponse();
            DEFAULT_INSTANCE = adResponse;
            GeneratedMessageLite.registerDefaultInstance(AdResponse.class, adResponse);
        }

        private AdResponse() {
            ByteString byteString = ByteString.EMPTY;
            this.trackingToken_ = byteString;
            this.impressionConfiguration_ = byteString;
            this.adDataRefreshToken_ = byteString;
            this.adData_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdData() {
            this.adData_ = getDefaultInstance().getAdData();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdDataRefreshToken() {
            this.adDataRefreshToken_ = getDefaultInstance().getAdDataRefreshToken();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdDataVersion() {
            this.adDataVersion_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCampaignMetadata() {
            this.campaignMetadata_ = null;
            this.bitField0_ &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearError() {
            this.error_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImpressionConfiguration() {
            this.impressionConfiguration_ = getDefaultInstance().getImpressionConfiguration();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImpressionConfigurationVersion() {
            this.impressionConfigurationVersion_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTrackingToken() {
            this.trackingToken_ = getDefaultInstance().getTrackingToken();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWebviewConfiguration() {
            this.webviewConfiguration_ = null;
            this.bitField0_ &= -2;
        }

        public static AdResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCampaignMetadata(CampaignMetadataOuterClass.CampaignMetadata campaignMetadata) {
            campaignMetadata.getClass();
            CampaignMetadataOuterClass.CampaignMetadata campaignMetadata2 = this.campaignMetadata_;
            if (campaignMetadata2 == null || campaignMetadata2 == CampaignMetadataOuterClass.CampaignMetadata.getDefaultInstance()) {
                this.campaignMetadata_ = campaignMetadata;
            } else {
                this.campaignMetadata_ = CampaignMetadataOuterClass.CampaignMetadata.newBuilder(this.campaignMetadata_).mergeFrom(campaignMetadata).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeError(ErrorOuterClass.Error error) {
            error.getClass();
            ErrorOuterClass.Error error2 = this.error_;
            if (error2 == null || error2 == ErrorOuterClass.Error.getDefaultInstance()) {
                this.error_ = error;
            } else {
                this.error_ = ErrorOuterClass.Error.newBuilder(this.error_).mergeFrom(error).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeWebviewConfiguration(WebviewConfiguration.WebViewConfiguration webViewConfiguration) {
            webViewConfiguration.getClass();
            WebviewConfiguration.WebViewConfiguration webViewConfiguration2 = this.webviewConfiguration_;
            if (webViewConfiguration2 == null || webViewConfiguration2 == WebviewConfiguration.WebViewConfiguration.getDefaultInstance()) {
                this.webviewConfiguration_ = webViewConfiguration;
            } else {
                this.webviewConfiguration_ = WebviewConfiguration.WebViewConfiguration.newBuilder(this.webviewConfiguration_).mergeFrom(webViewConfiguration).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AdResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AdResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AdResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AdResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<AdResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdData(ByteString byteString) {
            byteString.getClass();
            this.adData_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdDataRefreshToken(ByteString byteString) {
            byteString.getClass();
            this.adDataRefreshToken_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdDataVersion(int i10) {
            this.adDataVersion_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCampaignMetadata(CampaignMetadataOuterClass.CampaignMetadata campaignMetadata) {
            campaignMetadata.getClass();
            this.campaignMetadata_ = campaignMetadata;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setError(ErrorOuterClass.Error error) {
            error.getClass();
            this.error_ = error;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImpressionConfiguration(ByteString byteString) {
            byteString.getClass();
            this.impressionConfiguration_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImpressionConfigurationVersion(int i10) {
            this.impressionConfigurationVersion_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrackingToken(ByteString byteString) {
            byteString.getClass();
            this.trackingToken_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWebviewConfiguration(WebviewConfiguration.WebViewConfiguration webViewConfiguration) {
            webViewConfiguration.getClass();
            this.webviewConfiguration_ = webViewConfiguration;
            this.bitField0_ |= 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            int i10 = ji.f.f43895a[methodToInvoke.ordinal()];
            ji.f fVar = null;
            switch (i10) {
                case 1:
                    return new AdResponse();
                case 2:
                    return new Builder(fVar);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001\n\u0002\n\u0003\u0004\u0004ဉ\u0000\u0005\n\u0006\n\u0007\u0004\bဉ\u0001\tဉ\u0002", new Object[]{"bitField0_", "trackingToken_", "impressionConfiguration_", "impressionConfigurationVersion_", "webviewConfiguration_", "adDataRefreshToken_", "adData_", "adDataVersion_", "error_", "campaignMetadata_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<AdResponse> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (AdResponse.class) {
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

        @Override // gatewayprotocol.v1.AdResponseOuterClass.AdResponseOrBuilder
        public ByteString getAdData() {
            return this.adData_;
        }

        @Override // gatewayprotocol.v1.AdResponseOuterClass.AdResponseOrBuilder
        public ByteString getAdDataRefreshToken() {
            return this.adDataRefreshToken_;
        }

        @Override // gatewayprotocol.v1.AdResponseOuterClass.AdResponseOrBuilder
        public int getAdDataVersion() {
            return this.adDataVersion_;
        }

        @Override // gatewayprotocol.v1.AdResponseOuterClass.AdResponseOrBuilder
        public CampaignMetadataOuterClass.CampaignMetadata getCampaignMetadata() {
            CampaignMetadataOuterClass.CampaignMetadata campaignMetadata = this.campaignMetadata_;
            return campaignMetadata == null ? CampaignMetadataOuterClass.CampaignMetadata.getDefaultInstance() : campaignMetadata;
        }

        @Override // gatewayprotocol.v1.AdResponseOuterClass.AdResponseOrBuilder
        public ErrorOuterClass.Error getError() {
            ErrorOuterClass.Error error = this.error_;
            return error == null ? ErrorOuterClass.Error.getDefaultInstance() : error;
        }

        @Override // gatewayprotocol.v1.AdResponseOuterClass.AdResponseOrBuilder
        public ByteString getImpressionConfiguration() {
            return this.impressionConfiguration_;
        }

        @Override // gatewayprotocol.v1.AdResponseOuterClass.AdResponseOrBuilder
        public int getImpressionConfigurationVersion() {
            return this.impressionConfigurationVersion_;
        }

        @Override // gatewayprotocol.v1.AdResponseOuterClass.AdResponseOrBuilder
        public ByteString getTrackingToken() {
            return this.trackingToken_;
        }

        @Override // gatewayprotocol.v1.AdResponseOuterClass.AdResponseOrBuilder
        public WebviewConfiguration.WebViewConfiguration getWebviewConfiguration() {
            WebviewConfiguration.WebViewConfiguration webViewConfiguration = this.webviewConfiguration_;
            return webViewConfiguration == null ? WebviewConfiguration.WebViewConfiguration.getDefaultInstance() : webViewConfiguration;
        }

        @Override // gatewayprotocol.v1.AdResponseOuterClass.AdResponseOrBuilder
        public boolean hasCampaignMetadata() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // gatewayprotocol.v1.AdResponseOuterClass.AdResponseOrBuilder
        public boolean hasError() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // gatewayprotocol.v1.AdResponseOuterClass.AdResponseOrBuilder
        public boolean hasWebviewConfiguration() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(AdResponse adResponse) {
            return DEFAULT_INSTANCE.createBuilder(adResponse);
        }

        public static AdResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AdResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AdResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AdResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AdResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AdResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AdResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AdResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AdResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AdResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AdResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AdResponse parseFrom(InputStream inputStream) throws IOException {
            return (AdResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AdResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AdResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AdResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AdResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface AdResponseOrBuilder extends MessageLiteOrBuilder {
        ByteString getAdData();

        ByteString getAdDataRefreshToken();

        int getAdDataVersion();

        CampaignMetadataOuterClass.CampaignMetadata getCampaignMetadata();

        ErrorOuterClass.Error getError();

        ByteString getImpressionConfiguration();

        int getImpressionConfigurationVersion();

        ByteString getTrackingToken();

        WebviewConfiguration.WebViewConfiguration getWebviewConfiguration();

        boolean hasCampaignMetadata();

        boolean hasError();

        boolean hasWebviewConfiguration();
    }

    private AdResponseOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
