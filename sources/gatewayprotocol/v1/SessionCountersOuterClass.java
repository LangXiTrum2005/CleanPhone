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
public final class SessionCountersOuterClass {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class SessionCounters extends GeneratedMessageLite<SessionCounters, Builder> implements SessionCountersOrBuilder {
        public static final int ALL_ERRORS_COUNT_FIELD_NUMBER = 11;
        public static final int BANNER_IMPRESSIONS_FIELD_NUMBER = 5;
        public static final int BANNER_LOAD_REQUESTS_FIELD_NUMBER = 3;
        public static final int BANNER_REQUESTS_ADM_FIELD_NUMBER = 4;
        public static final int CACHE_TIMEOUT_ERRORS_COUNT_FIELD_NUMBER = 12;
        private static final SessionCounters DEFAULT_INSTANCE;
        public static final int FOCUS_CHANGE_COUNT_FIELD_NUMBER = 8;
        public static final int GLOBAL_ADS_FOCUS_CHANGE_COUNT_FIELD_NUMBER = 7;
        public static final int GLOBAL_ADS_FOCUS_TIME_FIELD_NUMBER = 6;
        public static final int INITIALIZATION_LATENCY_FIELD_NUMBER = 9;
        public static final int LAST_LOAD_LATENCY_FIELD_NUMBER = 10;
        public static final int LOAD_REQUESTS_ADM_FIELD_NUMBER = 2;
        public static final int LOAD_REQUESTS_FIELD_NUMBER = 1;
        private static volatile Parser<SessionCounters> PARSER = null;
        public static final int SUCCESS_COUNT_FIELD_NUMBER = 13;
        private int allErrorsCount_;
        private int bannerImpressions_;
        private int bannerLoadRequests_;
        private int bannerRequestsAdm_;
        private int cacheTimeoutErrorsCount_;
        private int focusChangeCount_;
        private int globalAdsFocusChangeCount_;
        private int globalAdsFocusTime_;
        private int initializationLatency_;
        private int lastLoadLatency_;
        private int loadRequestsAdm_;
        private int loadRequests_;
        private int successCount_;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class Builder extends GeneratedMessageLite.Builder<SessionCounters, Builder> implements SessionCountersOrBuilder {
            public /* synthetic */ Builder(ji.i0 i0Var) {
                this();
            }

            public Builder clearAllErrorsCount() {
                copyOnWrite();
                ((SessionCounters) this.instance).clearAllErrorsCount();
                return this;
            }

            public Builder clearBannerImpressions() {
                copyOnWrite();
                ((SessionCounters) this.instance).clearBannerImpressions();
                return this;
            }

            public Builder clearBannerLoadRequests() {
                copyOnWrite();
                ((SessionCounters) this.instance).clearBannerLoadRequests();
                return this;
            }

            public Builder clearBannerRequestsAdm() {
                copyOnWrite();
                ((SessionCounters) this.instance).clearBannerRequestsAdm();
                return this;
            }

            public Builder clearCacheTimeoutErrorsCount() {
                copyOnWrite();
                ((SessionCounters) this.instance).clearCacheTimeoutErrorsCount();
                return this;
            }

            public Builder clearFocusChangeCount() {
                copyOnWrite();
                ((SessionCounters) this.instance).clearFocusChangeCount();
                return this;
            }

            public Builder clearGlobalAdsFocusChangeCount() {
                copyOnWrite();
                ((SessionCounters) this.instance).clearGlobalAdsFocusChangeCount();
                return this;
            }

            public Builder clearGlobalAdsFocusTime() {
                copyOnWrite();
                ((SessionCounters) this.instance).clearGlobalAdsFocusTime();
                return this;
            }

            public Builder clearInitializationLatency() {
                copyOnWrite();
                ((SessionCounters) this.instance).clearInitializationLatency();
                return this;
            }

            public Builder clearLastLoadLatency() {
                copyOnWrite();
                ((SessionCounters) this.instance).clearLastLoadLatency();
                return this;
            }

            public Builder clearLoadRequests() {
                copyOnWrite();
                ((SessionCounters) this.instance).clearLoadRequests();
                return this;
            }

            public Builder clearLoadRequestsAdm() {
                copyOnWrite();
                ((SessionCounters) this.instance).clearLoadRequestsAdm();
                return this;
            }

            public Builder clearSuccessCount() {
                copyOnWrite();
                ((SessionCounters) this.instance).clearSuccessCount();
                return this;
            }

            @Override // gatewayprotocol.v1.SessionCountersOuterClass.SessionCountersOrBuilder
            public int getAllErrorsCount() {
                return ((SessionCounters) this.instance).getAllErrorsCount();
            }

            @Override // gatewayprotocol.v1.SessionCountersOuterClass.SessionCountersOrBuilder
            public int getBannerImpressions() {
                return ((SessionCounters) this.instance).getBannerImpressions();
            }

            @Override // gatewayprotocol.v1.SessionCountersOuterClass.SessionCountersOrBuilder
            public int getBannerLoadRequests() {
                return ((SessionCounters) this.instance).getBannerLoadRequests();
            }

            @Override // gatewayprotocol.v1.SessionCountersOuterClass.SessionCountersOrBuilder
            public int getBannerRequestsAdm() {
                return ((SessionCounters) this.instance).getBannerRequestsAdm();
            }

            @Override // gatewayprotocol.v1.SessionCountersOuterClass.SessionCountersOrBuilder
            public int getCacheTimeoutErrorsCount() {
                return ((SessionCounters) this.instance).getCacheTimeoutErrorsCount();
            }

            @Override // gatewayprotocol.v1.SessionCountersOuterClass.SessionCountersOrBuilder
            public int getFocusChangeCount() {
                return ((SessionCounters) this.instance).getFocusChangeCount();
            }

            @Override // gatewayprotocol.v1.SessionCountersOuterClass.SessionCountersOrBuilder
            public int getGlobalAdsFocusChangeCount() {
                return ((SessionCounters) this.instance).getGlobalAdsFocusChangeCount();
            }

            @Override // gatewayprotocol.v1.SessionCountersOuterClass.SessionCountersOrBuilder
            public int getGlobalAdsFocusTime() {
                return ((SessionCounters) this.instance).getGlobalAdsFocusTime();
            }

            @Override // gatewayprotocol.v1.SessionCountersOuterClass.SessionCountersOrBuilder
            public int getInitializationLatency() {
                return ((SessionCounters) this.instance).getInitializationLatency();
            }

            @Override // gatewayprotocol.v1.SessionCountersOuterClass.SessionCountersOrBuilder
            public int getLastLoadLatency() {
                return ((SessionCounters) this.instance).getLastLoadLatency();
            }

            @Override // gatewayprotocol.v1.SessionCountersOuterClass.SessionCountersOrBuilder
            public int getLoadRequests() {
                return ((SessionCounters) this.instance).getLoadRequests();
            }

            @Override // gatewayprotocol.v1.SessionCountersOuterClass.SessionCountersOrBuilder
            public int getLoadRequestsAdm() {
                return ((SessionCounters) this.instance).getLoadRequestsAdm();
            }

            @Override // gatewayprotocol.v1.SessionCountersOuterClass.SessionCountersOrBuilder
            public int getSuccessCount() {
                return ((SessionCounters) this.instance).getSuccessCount();
            }

            public Builder setAllErrorsCount(int i10) {
                copyOnWrite();
                ((SessionCounters) this.instance).setAllErrorsCount(i10);
                return this;
            }

            public Builder setBannerImpressions(int i10) {
                copyOnWrite();
                ((SessionCounters) this.instance).setBannerImpressions(i10);
                return this;
            }

            public Builder setBannerLoadRequests(int i10) {
                copyOnWrite();
                ((SessionCounters) this.instance).setBannerLoadRequests(i10);
                return this;
            }

            public Builder setBannerRequestsAdm(int i10) {
                copyOnWrite();
                ((SessionCounters) this.instance).setBannerRequestsAdm(i10);
                return this;
            }

            public Builder setCacheTimeoutErrorsCount(int i10) {
                copyOnWrite();
                ((SessionCounters) this.instance).setCacheTimeoutErrorsCount(i10);
                return this;
            }

            public Builder setFocusChangeCount(int i10) {
                copyOnWrite();
                ((SessionCounters) this.instance).setFocusChangeCount(i10);
                return this;
            }

            public Builder setGlobalAdsFocusChangeCount(int i10) {
                copyOnWrite();
                ((SessionCounters) this.instance).setGlobalAdsFocusChangeCount(i10);
                return this;
            }

            public Builder setGlobalAdsFocusTime(int i10) {
                copyOnWrite();
                ((SessionCounters) this.instance).setGlobalAdsFocusTime(i10);
                return this;
            }

            public Builder setInitializationLatency(int i10) {
                copyOnWrite();
                ((SessionCounters) this.instance).setInitializationLatency(i10);
                return this;
            }

            public Builder setLastLoadLatency(int i10) {
                copyOnWrite();
                ((SessionCounters) this.instance).setLastLoadLatency(i10);
                return this;
            }

            public Builder setLoadRequests(int i10) {
                copyOnWrite();
                ((SessionCounters) this.instance).setLoadRequests(i10);
                return this;
            }

            public Builder setLoadRequestsAdm(int i10) {
                copyOnWrite();
                ((SessionCounters) this.instance).setLoadRequestsAdm(i10);
                return this;
            }

            public Builder setSuccessCount(int i10) {
                copyOnWrite();
                ((SessionCounters) this.instance).setSuccessCount(i10);
                return this;
            }

            private Builder() {
                super(SessionCounters.DEFAULT_INSTANCE);
            }
        }

        static {
            SessionCounters sessionCounters = new SessionCounters();
            DEFAULT_INSTANCE = sessionCounters;
            GeneratedMessageLite.registerDefaultInstance(SessionCounters.class, sessionCounters);
        }

        private SessionCounters() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAllErrorsCount() {
            this.allErrorsCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBannerImpressions() {
            this.bannerImpressions_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBannerLoadRequests() {
            this.bannerLoadRequests_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBannerRequestsAdm() {
            this.bannerRequestsAdm_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCacheTimeoutErrorsCount() {
            this.cacheTimeoutErrorsCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFocusChangeCount() {
            this.focusChangeCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGlobalAdsFocusChangeCount() {
            this.globalAdsFocusChangeCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGlobalAdsFocusTime() {
            this.globalAdsFocusTime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInitializationLatency() {
            this.initializationLatency_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLastLoadLatency() {
            this.lastLoadLatency_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLoadRequests() {
            this.loadRequests_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLoadRequestsAdm() {
            this.loadRequestsAdm_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSuccessCount() {
            this.successCount_ = 0;
        }

        public static SessionCounters getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SessionCounters parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SessionCounters) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SessionCounters parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SessionCounters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SessionCounters> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAllErrorsCount(int i10) {
            this.allErrorsCount_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBannerImpressions(int i10) {
            this.bannerImpressions_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBannerLoadRequests(int i10) {
            this.bannerLoadRequests_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBannerRequestsAdm(int i10) {
            this.bannerRequestsAdm_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCacheTimeoutErrorsCount(int i10) {
            this.cacheTimeoutErrorsCount_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFocusChangeCount(int i10) {
            this.focusChangeCount_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGlobalAdsFocusChangeCount(int i10) {
            this.globalAdsFocusChangeCount_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGlobalAdsFocusTime(int i10) {
            this.globalAdsFocusTime_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInitializationLatency(int i10) {
            this.initializationLatency_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLastLoadLatency(int i10) {
            this.lastLoadLatency_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLoadRequests(int i10) {
            this.loadRequests_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLoadRequestsAdm(int i10) {
            this.loadRequestsAdm_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSuccessCount(int i10) {
            this.successCount_ = i10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            int i10 = ji.i0.f43902a[methodToInvoke.ordinal()];
            ji.i0 i0Var = null;
            switch (i10) {
                case 1:
                    return new SessionCounters();
                case 2:
                    return new Builder(i0Var);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0000\u0001\r\r\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0004\u0007\u0004\b\u0004\t\u0004\n\u0004\u000b\u0004\f\u0004\r\u0004", new Object[]{"loadRequests_", "loadRequestsAdm_", "bannerLoadRequests_", "bannerRequestsAdm_", "bannerImpressions_", "globalAdsFocusTime_", "globalAdsFocusChangeCount_", "focusChangeCount_", "initializationLatency_", "lastLoadLatency_", "allErrorsCount_", "cacheTimeoutErrorsCount_", "successCount_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SessionCounters> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (SessionCounters.class) {
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

        @Override // gatewayprotocol.v1.SessionCountersOuterClass.SessionCountersOrBuilder
        public int getAllErrorsCount() {
            return this.allErrorsCount_;
        }

        @Override // gatewayprotocol.v1.SessionCountersOuterClass.SessionCountersOrBuilder
        public int getBannerImpressions() {
            return this.bannerImpressions_;
        }

        @Override // gatewayprotocol.v1.SessionCountersOuterClass.SessionCountersOrBuilder
        public int getBannerLoadRequests() {
            return this.bannerLoadRequests_;
        }

        @Override // gatewayprotocol.v1.SessionCountersOuterClass.SessionCountersOrBuilder
        public int getBannerRequestsAdm() {
            return this.bannerRequestsAdm_;
        }

        @Override // gatewayprotocol.v1.SessionCountersOuterClass.SessionCountersOrBuilder
        public int getCacheTimeoutErrorsCount() {
            return this.cacheTimeoutErrorsCount_;
        }

        @Override // gatewayprotocol.v1.SessionCountersOuterClass.SessionCountersOrBuilder
        public int getFocusChangeCount() {
            return this.focusChangeCount_;
        }

        @Override // gatewayprotocol.v1.SessionCountersOuterClass.SessionCountersOrBuilder
        public int getGlobalAdsFocusChangeCount() {
            return this.globalAdsFocusChangeCount_;
        }

        @Override // gatewayprotocol.v1.SessionCountersOuterClass.SessionCountersOrBuilder
        public int getGlobalAdsFocusTime() {
            return this.globalAdsFocusTime_;
        }

        @Override // gatewayprotocol.v1.SessionCountersOuterClass.SessionCountersOrBuilder
        public int getInitializationLatency() {
            return this.initializationLatency_;
        }

        @Override // gatewayprotocol.v1.SessionCountersOuterClass.SessionCountersOrBuilder
        public int getLastLoadLatency() {
            return this.lastLoadLatency_;
        }

        @Override // gatewayprotocol.v1.SessionCountersOuterClass.SessionCountersOrBuilder
        public int getLoadRequests() {
            return this.loadRequests_;
        }

        @Override // gatewayprotocol.v1.SessionCountersOuterClass.SessionCountersOrBuilder
        public int getLoadRequestsAdm() {
            return this.loadRequestsAdm_;
        }

        @Override // gatewayprotocol.v1.SessionCountersOuterClass.SessionCountersOrBuilder
        public int getSuccessCount() {
            return this.successCount_;
        }

        public static Builder newBuilder(SessionCounters sessionCounters) {
            return DEFAULT_INSTANCE.createBuilder(sessionCounters);
        }

        public static SessionCounters parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SessionCounters) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SessionCounters parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SessionCounters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SessionCounters parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SessionCounters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SessionCounters parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SessionCounters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SessionCounters parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SessionCounters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SessionCounters parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SessionCounters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SessionCounters parseFrom(InputStream inputStream) throws IOException {
            return (SessionCounters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SessionCounters parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SessionCounters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SessionCounters parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SessionCounters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SessionCounters parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SessionCounters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface SessionCountersOrBuilder extends MessageLiteOrBuilder {
        int getAllErrorsCount();

        int getBannerImpressions();

        int getBannerLoadRequests();

        int getBannerRequestsAdm();

        int getCacheTimeoutErrorsCount();

        int getFocusChangeCount();

        int getGlobalAdsFocusChangeCount();

        int getGlobalAdsFocusTime();

        int getInitializationLatency();

        int getLastLoadLatency();

        int getLoadRequests();

        int getLoadRequestsAdm();

        int getSuccessCount();
    }

    private SessionCountersOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
