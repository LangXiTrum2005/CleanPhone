package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.ironsource.X3;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/TransactionEventRequestKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class TransactionEventRequestKt {
    public static final TransactionEventRequestKt INSTANCE = new TransactionEventRequestKt();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 k2\u00020\u0001:\u0002klB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000bJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u000bJ\r\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u000bJ'\u0010\u0019\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u0016\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u001b\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u0016\u001a\u00020\u0014H\u0087\n¢\u0006\u0004\b\u001a\u0010\u0018J-\u0010 \u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ.\u0010\u001b\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u001cH\u0087\n¢\u0006\u0004\b!\u0010\u001fJ0\u0010&\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u0014H\u0087\u0002¢\u0006\u0004\b$\u0010%J\u001f\u0010)\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0007¢\u0006\u0004\b'\u0010(J\r\u0010*\u001a\u00020\t¢\u0006\u0004\b*\u0010\u000bJ\r\u0010+\u001a\u00020\t¢\u0006\u0004\b+\u0010\u000bJ\r\u0010,\u001a\u00020\t¢\u0006\u0004\b,\u0010\u000bJ\r\u0010-\u001a\u00020\t¢\u0006\u0004\b-\u0010\u000bJ\r\u0010.\u001a\u00020\f¢\u0006\u0004\b.\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010/R$\u00105\u001a\u0002002\u0006\u0010\u0016\u001a\u0002008G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u0010;\u001a\u0002062\u0006\u0010\u0016\u001a\u0002068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010A\u001a\u00020<2\u0006\u0010\u0016\u001a\u00020<8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010F\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\"8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER$\u0010L\u001a\u00020G2\u0006\u0010\u0016\u001a\u00020G8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001d\u0010O\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00138F¢\u0006\u0006\u001a\u0004\bM\u0010NR$\u0010U\u001a\u00020P2\u0006\u0010\u0016\u001a\u00020P8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR$\u0010X\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\"8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bV\u0010C\"\u0004\bW\u0010ER$\u0010^\u001a\u00020Y2\u0006\u0010\u0016\u001a\u00020Y8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R$\u0010a\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\"8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b_\u0010C\"\u0004\b`\u0010ER$\u0010d\u001a\u00020G2\u0006\u0010\u0016\u001a\u00020G8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bb\u0010I\"\u0004\bc\u0010KR$\u0010j\u001a\u00020e2\u0006\u0010\u0016\u001a\u00020e8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bf\u0010g\"\u0004\bh\u0010i¨\u0006m"}, d2 = {"Lgatewayprotocol/v1/TransactionEventRequestKt$Dsl;", "", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest$Builder;", "_builder", "<init>", "(Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest$Builder;)V", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest;", "_build", "()Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest;", "Lwj/r;", "clearStaticDeviceInfo", "()V", "", "hasStaticDeviceInfo", "()Z", "clearDynamicDeviceInfo", "hasDynamicDeviceInfo", "clearAppStore", "clearCustomStore", "Lcom/google/protobuf/kotlin/DslList;", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionData;", "Lgatewayprotocol/v1/TransactionEventRequestKt$Dsl$TransactionDataProxy;", X3.i.X, "addTransactionData", "(Lcom/google/protobuf/kotlin/DslList;Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionData;)V", "add", "plusAssignTransactionData", "plusAssign", "", "values", "addAllTransactionData", "(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/Iterable;)V", "addAll", "plusAssignAllTransactionData", "", "index", "setTransactionData", "(Lcom/google/protobuf/kotlin/DslList;ILgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionData;)V", "set", "clearTransactionData", "(Lcom/google/protobuf/kotlin/DslList;)V", "clear", "clearOrigin", "clearStoreKitVersion", "clearGooglePlayBillingLibraryVersion", "clearReceipt", "hasReceipt", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest$Builder;", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "getStaticDeviceInfo", "()Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "setStaticDeviceInfo", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;)V", "staticDeviceInfo", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "getDynamicDeviceInfo", "()Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "setDynamicDeviceInfo", "(Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;)V", "dynamicDeviceInfo", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$StoreType;", "getAppStore", "()Lgatewayprotocol/v1/TransactionEventRequestOuterClass$StoreType;", "setAppStore", "(Lgatewayprotocol/v1/TransactionEventRequestOuterClass$StoreType;)V", "appStore", "getAppStoreValue", "()I", "setAppStoreValue", "(I)V", "appStoreValue", "", "getCustomStore", "()Ljava/lang/String;", "setCustomStore", "(Ljava/lang/String;)V", "customStore", "getTransactionData", "()Lcom/google/protobuf/kotlin/DslList;", "transactionData", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionOrigin;", "getOrigin", "()Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionOrigin;", "setOrigin", "(Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionOrigin;)V", "origin", "getOriginValue", "setOriginValue", "originValue", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$StoreKitVersion;", "getStoreKitVersion", "()Lgatewayprotocol/v1/TransactionEventRequestOuterClass$StoreKitVersion;", "setStoreKitVersion", "(Lgatewayprotocol/v1/TransactionEventRequestOuterClass$StoreKitVersion;)V", "storeKitVersion", "getStoreKitVersionValue", "setStoreKitVersionValue", "storeKitVersionValue", "getGooglePlayBillingLibraryVersion", "setGooglePlayBillingLibraryVersion", "googlePlayBillingLibraryVersion", "Lcom/google/protobuf/ByteString;", "getReceipt", "()Lcom/google/protobuf/ByteString;", "setReceipt", "(Lcom/google/protobuf/ByteString;)V", "receipt", "Companion", "TransactionDataProxy", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    @ProtoDslMarker
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final TransactionEventRequestOuterClass.TransactionEventRequest.Builder _builder;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/TransactionEventRequestKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/TransactionEventRequestKt$Dsl;", "builder", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(TransactionEventRequestOuterClass.TransactionEventRequest.Builder builder) {
                kotlin.jvm.internal.n.f(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lgatewayprotocol/v1/TransactionEventRequestKt$Dsl$TransactionDataProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class TransactionDataProxy extends DslProxy {
            private TransactionDataProxy() {
            }
        }

        public /* synthetic */ Dsl(TransactionEventRequestOuterClass.TransactionEventRequest.Builder builder, kotlin.jvm.internal.g gVar) {
            this(builder);
        }

        public final /* synthetic */ TransactionEventRequestOuterClass.TransactionEventRequest _build() {
            TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequestBuild = this._builder.build();
            kotlin.jvm.internal.n.e(transactionEventRequestBuild, "_builder.build()");
            return transactionEventRequestBuild;
        }

        public final /* synthetic */ void addAllTransactionData(DslList dslList, Iterable values) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(values, "values");
            this._builder.addAllTransactionData(values);
        }

        public final /* synthetic */ void addTransactionData(DslList dslList, TransactionEventRequestOuterClass.TransactionData value) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.addTransactionData(value);
        }

        public final void clearAppStore() {
            this._builder.clearAppStore();
        }

        public final void clearCustomStore() {
            this._builder.clearCustomStore();
        }

        public final void clearDynamicDeviceInfo() {
            this._builder.clearDynamicDeviceInfo();
        }

        public final void clearGooglePlayBillingLibraryVersion() {
            this._builder.clearGooglePlayBillingLibraryVersion();
        }

        public final void clearOrigin() {
            this._builder.clearOrigin();
        }

        public final void clearReceipt() {
            this._builder.clearReceipt();
        }

        public final void clearStaticDeviceInfo() {
            this._builder.clearStaticDeviceInfo();
        }

        public final void clearStoreKitVersion() {
            this._builder.clearStoreKitVersion();
        }

        public final /* synthetic */ void clearTransactionData(DslList dslList) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            this._builder.clearTransactionData();
        }

        public final TransactionEventRequestOuterClass.StoreType getAppStore() {
            TransactionEventRequestOuterClass.StoreType appStore = this._builder.getAppStore();
            kotlin.jvm.internal.n.e(appStore, "_builder.getAppStore()");
            return appStore;
        }

        public final int getAppStoreValue() {
            return this._builder.getAppStoreValue();
        }

        public final String getCustomStore() {
            String customStore = this._builder.getCustomStore();
            kotlin.jvm.internal.n.e(customStore, "_builder.getCustomStore()");
            return customStore;
        }

        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this._builder.getDynamicDeviceInfo();
            kotlin.jvm.internal.n.e(dynamicDeviceInfo, "_builder.getDynamicDeviceInfo()");
            return dynamicDeviceInfo;
        }

        public final String getGooglePlayBillingLibraryVersion() {
            String googlePlayBillingLibraryVersion = this._builder.getGooglePlayBillingLibraryVersion();
            kotlin.jvm.internal.n.e(googlePlayBillingLibraryVersion, "_builder.getGooglePlayBillingLibraryVersion()");
            return googlePlayBillingLibraryVersion;
        }

        public final TransactionEventRequestOuterClass.TransactionOrigin getOrigin() {
            TransactionEventRequestOuterClass.TransactionOrigin origin = this._builder.getOrigin();
            kotlin.jvm.internal.n.e(origin, "_builder.getOrigin()");
            return origin;
        }

        public final int getOriginValue() {
            return this._builder.getOriginValue();
        }

        public final ByteString getReceipt() {
            ByteString receipt = this._builder.getReceipt();
            kotlin.jvm.internal.n.e(receipt, "_builder.getReceipt()");
            return receipt;
        }

        public final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = this._builder.getStaticDeviceInfo();
            kotlin.jvm.internal.n.e(staticDeviceInfo, "_builder.getStaticDeviceInfo()");
            return staticDeviceInfo;
        }

        public final TransactionEventRequestOuterClass.StoreKitVersion getStoreKitVersion() {
            TransactionEventRequestOuterClass.StoreKitVersion storeKitVersion = this._builder.getStoreKitVersion();
            kotlin.jvm.internal.n.e(storeKitVersion, "_builder.getStoreKitVersion()");
            return storeKitVersion;
        }

        public final int getStoreKitVersionValue() {
            return this._builder.getStoreKitVersionValue();
        }

        public final /* synthetic */ DslList getTransactionData() {
            List<TransactionEventRequestOuterClass.TransactionData> transactionDataList = this._builder.getTransactionDataList();
            kotlin.jvm.internal.n.e(transactionDataList, "_builder.getTransactionDataList()");
            return new DslList(transactionDataList);
        }

        public final boolean hasDynamicDeviceInfo() {
            return this._builder.hasDynamicDeviceInfo();
        }

        public final boolean hasReceipt() {
            return this._builder.hasReceipt();
        }

        public final boolean hasStaticDeviceInfo() {
            return this._builder.hasStaticDeviceInfo();
        }

        public final /* synthetic */ void plusAssignAllTransactionData(DslList<TransactionEventRequestOuterClass.TransactionData, TransactionDataProxy> dslList, Iterable<TransactionEventRequestOuterClass.TransactionData> values) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(values, "values");
            addAllTransactionData(dslList, values);
        }

        public final /* synthetic */ void plusAssignTransactionData(DslList<TransactionEventRequestOuterClass.TransactionData, TransactionDataProxy> dslList, TransactionEventRequestOuterClass.TransactionData value) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(value, "value");
            addTransactionData(dslList, value);
        }

        public final void setAppStore(TransactionEventRequestOuterClass.StoreType value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setAppStore(value);
        }

        public final void setAppStoreValue(int i10) {
            this._builder.setAppStoreValue(i10);
        }

        public final void setCustomStore(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setCustomStore(value);
        }

        public final void setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setDynamicDeviceInfo(value);
        }

        public final void setGooglePlayBillingLibraryVersion(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setGooglePlayBillingLibraryVersion(value);
        }

        public final void setOrigin(TransactionEventRequestOuterClass.TransactionOrigin value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setOrigin(value);
        }

        public final void setOriginValue(int i10) {
            this._builder.setOriginValue(i10);
        }

        public final void setReceipt(ByteString value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setReceipt(value);
        }

        public final void setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setStaticDeviceInfo(value);
        }

        public final void setStoreKitVersion(TransactionEventRequestOuterClass.StoreKitVersion value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setStoreKitVersion(value);
        }

        public final void setStoreKitVersionValue(int i10) {
            this._builder.setStoreKitVersionValue(i10);
        }

        public final /* synthetic */ void setTransactionData(DslList dslList, int i10, TransactionEventRequestOuterClass.TransactionData value) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setTransactionData(i10, value);
        }

        private Dsl(TransactionEventRequestOuterClass.TransactionEventRequest.Builder builder) {
            this._builder = builder;
        }
    }

    private TransactionEventRequestKt() {
    }
}
