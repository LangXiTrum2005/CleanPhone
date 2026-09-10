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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/NativeConfigurationKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class NativeConfigurationKt {
    public static final NativeConfigurationKt INSTANCE = new NativeConfigurationKt();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0007\u0018\u0000 ¹\u00012\u00020\u0001:\nº\u0001¹\u0001»\u0001¼\u0001½\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000bJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u000bJ\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u000eJ\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u000bJ\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u000eJ\r\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u000bJ\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u000eJ\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u000bJ\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u000eJ\r\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u000bJ\r\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u000eJ\r\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u000bJ\r\u0010\u001c\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u000bJ'\u0010#\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d2\u0006\u0010 \u001a\u00020\u001eH\u0007¢\u0006\u0004\b!\u0010\"J(\u0010%\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d2\u0006\u0010 \u001a\u00020\u001eH\u0087\n¢\u0006\u0004\b$\u0010\"J-\u0010*\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001e0&H\u0007¢\u0006\u0004\b(\u0010)J.\u0010%\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001e0&H\u0087\n¢\u0006\u0004\b+\u0010)J0\u00100\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d2\u0006\u0010-\u001a\u00020,2\u0006\u0010 \u001a\u00020\u001eH\u0087\u0002¢\u0006\u0004\b.\u0010/J\u001f\u00103\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001dH\u0007¢\u0006\u0004\b1\u00102J\r\u00104\u001a\u00020\t¢\u0006\u0004\b4\u0010\u000bJ\r\u00105\u001a\u00020\f¢\u0006\u0004\b5\u0010\u000eJ'\u0010#\u001a\u00020\t*\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u0002070\u001d2\u0006\u0010 \u001a\u000206H\u0007¢\u0006\u0004\b8\u00109J(\u0010%\u001a\u00020\t*\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u0002070\u001d2\u0006\u0010 \u001a\u000206H\u0087\n¢\u0006\u0004\b:\u00109J-\u0010*\u001a\u00020\t*\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u0002070\u001d2\f\u0010'\u001a\b\u0012\u0004\u0012\u0002060&H\u0007¢\u0006\u0004\b;\u0010)J.\u0010%\u001a\u00020\t*\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u0002070\u001d2\f\u0010'\u001a\b\u0012\u0004\u0012\u0002060&H\u0087\n¢\u0006\u0004\b<\u0010)J0\u00100\u001a\u00020\t*\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u0002070\u001d2\u0006\u0010-\u001a\u00020,2\u0006\u0010 \u001a\u000206H\u0087\u0002¢\u0006\u0004\b=\u0010>J\u001f\u00103\u001a\u00020\t*\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u0002070\u001dH\u0007¢\u0006\u0004\b?\u00102J\r\u0010@\u001a\u00020\t¢\u0006\u0004\b@\u0010\u000bJ\r\u0010A\u001a\u00020\f¢\u0006\u0004\bA\u0010\u000eJ\r\u0010B\u001a\u00020\t¢\u0006\u0004\bB\u0010\u000bJ\r\u0010C\u001a\u00020\t¢\u0006\u0004\bC\u0010\u000bJ\r\u0010D\u001a\u00020\f¢\u0006\u0004\bD\u0010\u000eJ\r\u0010E\u001a\u00020\t¢\u0006\u0004\bE\u0010\u000bJ\r\u0010F\u001a\u00020\f¢\u0006\u0004\bF\u0010\u000eJ\r\u0010G\u001a\u00020\t¢\u0006\u0004\bG\u0010\u000bJ\r\u0010H\u001a\u00020\t¢\u0006\u0004\bH\u0010\u000bJ\r\u0010I\u001a\u00020\t¢\u0006\u0004\bI\u0010\u000bJ'\u0010#\u001a\u00020\t*\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020J0\u001d2\u0006\u0010 \u001a\u000206H\u0007¢\u0006\u0004\bK\u00109J(\u0010%\u001a\u00020\t*\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020J0\u001d2\u0006\u0010 \u001a\u000206H\u0087\n¢\u0006\u0004\bL\u00109J-\u0010*\u001a\u00020\t*\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020J0\u001d2\f\u0010'\u001a\b\u0012\u0004\u0012\u0002060&H\u0007¢\u0006\u0004\bM\u0010)J.\u0010%\u001a\u00020\t*\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020J0\u001d2\f\u0010'\u001a\b\u0012\u0004\u0012\u0002060&H\u0087\n¢\u0006\u0004\bN\u0010)J0\u00100\u001a\u00020\t*\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020J0\u001d2\u0006\u0010-\u001a\u00020,2\u0006\u0010 \u001a\u000206H\u0087\u0002¢\u0006\u0004\bO\u0010>J\u001f\u00103\u001a\u00020\t*\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020J0\u001dH\u0007¢\u0006\u0004\bP\u00102J'\u0010#\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020Q0\u001d2\u0006\u0010 \u001a\u00020,H\u0007¢\u0006\u0004\bR\u0010SJ(\u0010%\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020Q0\u001d2\u0006\u0010 \u001a\u00020,H\u0087\n¢\u0006\u0004\bT\u0010SJ-\u0010*\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020Q0\u001d2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020,0&H\u0007¢\u0006\u0004\bU\u0010)J.\u0010%\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020Q0\u001d2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020,0&H\u0087\n¢\u0006\u0004\bV\u0010)J0\u00100\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020Q0\u001d2\u0006\u0010-\u001a\u00020,2\u0006\u0010 \u001a\u00020,H\u0087\u0002¢\u0006\u0004\bW\u0010XJ\u001f\u00103\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020Q0\u001dH\u0007¢\u0006\u0004\bY\u00102J\r\u0010Z\u001a\u00020\t¢\u0006\u0004\bZ\u0010\u000bJ\r\u0010[\u001a\u00020\f¢\u0006\u0004\b[\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\\R$\u0010b\u001a\u00020]2\u0006\u0010 \u001a\u00020]8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR$\u0010h\u001a\u00020c2\u0006\u0010 \u001a\u00020c8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR$\u0010k\u001a\u00020c2\u0006\u0010 \u001a\u00020c8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bi\u0010e\"\u0004\bj\u0010gR$\u0010n\u001a\u00020c2\u0006\u0010 \u001a\u00020c8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bl\u0010e\"\u0004\bm\u0010gR$\u0010q\u001a\u00020c2\u0006\u0010 \u001a\u00020c8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bo\u0010e\"\u0004\bp\u0010gR$\u0010w\u001a\u00020r2\u0006\u0010 \u001a\u00020r8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR$\u0010}\u001a\u00020x2\u0006\u0010 \u001a\u00020x8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R&\u0010\u0081\u0001\u001a\u00020\f2\u0006\u0010 \u001a\u00020\f8G@GX\u0086\u000e¢\u0006\r\u001a\u0004\b~\u0010\u000e\"\u0005\b\u007f\u0010\u0080\u0001R(\u0010\u0084\u0001\u001a\u00020\f2\u0006\u0010 \u001a\u00020\f8G@GX\u0086\u000e¢\u0006\u000f\u001a\u0005\b\u0082\u0001\u0010\u000e\"\u0006\b\u0083\u0001\u0010\u0080\u0001R \u0010\u0087\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d8F¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R+\u0010\u008d\u0001\u001a\u00030\u0088\u00012\u0007\u0010 \u001a\u00030\u0088\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R \u0010\u008f\u0001\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u0002070\u001d8F¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u0086\u0001R+\u0010\u0092\u0001\u001a\u00030\u0088\u00012\u0007\u0010 \u001a\u00030\u0088\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0090\u0001\u0010\u008a\u0001\"\u0006\b\u0091\u0001\u0010\u008c\u0001R+\u0010\u0098\u0001\u001a\u00030\u0093\u00012\u0007\u0010 \u001a\u00030\u0093\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R)\u0010\u009d\u0001\u001a\u00020,2\u0006\u0010 \u001a\u00020,8G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001R'\u0010 \u0001\u001a\u00020c2\u0006\u0010 \u001a\u00020c8G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u009e\u0001\u0010e\"\u0005\b\u009f\u0001\u0010gR+\u0010¦\u0001\u001a\u00030¡\u00012\u0007\u0010 \u001a\u00030¡\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0006\b¤\u0001\u0010¥\u0001R)\u0010©\u0001\u001a\u00020,2\u0006\u0010 \u001a\u00020,8G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b§\u0001\u0010\u009a\u0001\"\u0006\b¨\u0001\u0010\u009c\u0001R)\u0010¬\u0001\u001a\u00020,2\u0006\u0010 \u001a\u00020,8G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\bª\u0001\u0010\u009a\u0001\"\u0006\b«\u0001\u0010\u009c\u0001R)\u0010¯\u0001\u001a\u00020,2\u0006\u0010 \u001a\u00020,8G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u00ad\u0001\u0010\u009a\u0001\"\u0006\b®\u0001\u0010\u009c\u0001R \u0010±\u0001\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020J0\u001d8F¢\u0006\b\u001a\u0006\b°\u0001\u0010\u0086\u0001R \u0010³\u0001\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020Q0\u001d8F¢\u0006\b\u001a\u0006\b²\u0001\u0010\u0086\u0001R)\u0010¸\u0001\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e8G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b´\u0001\u0010µ\u0001\"\u0006\b¶\u0001\u0010·\u0001¨\u0006¾\u0001"}, d2 = {"Lgatewayprotocol/v1/NativeConfigurationKt$Dsl;", "", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration$Builder;", "_builder", "<init>", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration$Builder;)V", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "_build", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "Lwj/r;", "clearDiagnosticEvents", "()V", "", "hasDiagnosticEvents", "()Z", "clearInitPolicy", "hasInitPolicy", "clearAdPolicy", "hasAdPolicy", "clearOperativeEventPolicy", "hasOperativeEventPolicy", "clearOtherPolicy", "hasOtherPolicy", "clearAdOperations", "hasAdOperations", "clearFeatureFlags", "hasFeatureFlags", "clearEnableIapEvent", "clearEnableOm", "Lcom/google/protobuf/kotlin/DslList;", "", "Lgatewayprotocol/v1/NativeConfigurationKt$Dsl$AdditionalStorePackagesProxy;", X3.i.X, "addAdditionalStorePackages", "(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/String;)V", "add", "plusAssignAdditionalStorePackages", "plusAssign", "", "values", "addAllAdditionalStorePackages", "(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/Iterable;)V", "addAll", "plusAssignAllAdditionalStorePackages", "", "index", "setAdditionalStorePackages", "(Lcom/google/protobuf/kotlin/DslList;ILjava/lang/String;)V", "set", "clearAdditionalStorePackages", "(Lcom/google/protobuf/kotlin/DslList;)V", "clear", "clearCachedAssetsConfiguration", "hasCachedAssetsConfiguration", "Lcom/google/protobuf/ByteString;", "Lgatewayprotocol/v1/NativeConfigurationKt$Dsl$ObservableAndroidActivitiesProxy;", "addObservableAndroidActivities", "(Lcom/google/protobuf/kotlin/DslList;Lcom/google/protobuf/ByteString;)V", "plusAssignObservableAndroidActivities", "addAllObservableAndroidActivities", "plusAssignAllObservableAndroidActivities", "setObservableAndroidActivities", "(Lcom/google/protobuf/kotlin/DslList;ILcom/google/protobuf/ByteString;)V", "clearObservableAndroidActivities", "clearCachedWebviewFilesConfiguration", "hasCachedWebviewFilesConfiguration", "clearDefaultShowCompletionState", "clearDownloadPolicy", "hasDownloadPolicy", "clearDebugSettings", "hasDebugSettings", "clearMaxExtrasSizeKb", "clearMaxReceiptSizeMb", "clearOverwriteIntentFlagActivity", "Lgatewayprotocol/v1/NativeConfigurationKt$Dsl$ObservableViewControllersProxy;", "addObservableViewControllers", "plusAssignObservableViewControllers", "addAllObservableViewControllers", "plusAssignAllObservableViewControllers", "setObservableViewControllers", "clearObservableViewControllers", "Lgatewayprotocol/v1/NativeConfigurationKt$Dsl$MonitoringIdsProxy;", "addMonitoringIds", "(Lcom/google/protobuf/kotlin/DslList;I)V", "plusAssignMonitoringIds", "addAllMonitoringIds", "plusAssignAllMonitoringIds", "setMonitoringIds", "(Lcom/google/protobuf/kotlin/DslList;II)V", "clearMonitoringIds", "clearLevelPlayAppKey", "hasLevelPlayAppKey", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration$Builder;", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$DiagnosticEventsConfiguration;", "getDiagnosticEvents", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$DiagnosticEventsConfiguration;", "setDiagnosticEvents", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$DiagnosticEventsConfiguration;)V", "diagnosticEvents", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestPolicy;", "getInitPolicy", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestPolicy;", "setInitPolicy", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestPolicy;)V", "initPolicy", "getAdPolicy", "setAdPolicy", "adPolicy", "getOperativeEventPolicy", "setOperativeEventPolicy", "operativeEventPolicy", "getOtherPolicy", "setOtherPolicy", "otherPolicy", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$AdOperationsConfiguration;", "getAdOperations", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$AdOperationsConfiguration;", "setAdOperations", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$AdOperationsConfiguration;)V", "adOperations", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags;", "getFeatureFlags", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags;", "setFeatureFlags", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags;)V", "featureFlags", "getEnableIapEvent", "setEnableIapEvent", "(Z)V", "enableIapEvent", "getEnableOm", "setEnableOm", "enableOm", "getAdditionalStorePackages", "()Lcom/google/protobuf/kotlin/DslList;", "additionalStorePackages", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$CachedAssetsConfiguration;", "getCachedAssetsConfiguration", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$CachedAssetsConfiguration;", "setCachedAssetsConfiguration", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$CachedAssetsConfiguration;)V", "cachedAssetsConfiguration", "getObservableAndroidActivities", "observableAndroidActivities", "getCachedWebviewFilesConfiguration", "setCachedWebviewFilesConfiguration", "cachedWebviewFilesConfiguration", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$ShowCompletionState;", "getDefaultShowCompletionState", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$ShowCompletionState;", "setDefaultShowCompletionState", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$ShowCompletionState;)V", "defaultShowCompletionState", "getDefaultShowCompletionStateValue", "()I", "setDefaultShowCompletionStateValue", "(I)V", "defaultShowCompletionStateValue", "getDownloadPolicy", "setDownloadPolicy", "downloadPolicy", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$DebugSettings;", "getDebugSettings", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$DebugSettings;", "setDebugSettings", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$DebugSettings;)V", "debugSettings", "getMaxExtrasSizeKb", "setMaxExtrasSizeKb", "maxExtrasSizeKb", "getMaxReceiptSizeMb", "setMaxReceiptSizeMb", "maxReceiptSizeMb", "getOverwriteIntentFlagActivity", "setOverwriteIntentFlagActivity", "overwriteIntentFlagActivity", "getObservableViewControllers", "observableViewControllers", "getMonitoringIds", "monitoringIds", "getLevelPlayAppKey", "()Ljava/lang/String;", "setLevelPlayAppKey", "(Ljava/lang/String;)V", "levelPlayAppKey", "Companion", "AdditionalStorePackagesProxy", "MonitoringIdsProxy", "ObservableAndroidActivitiesProxy", "ObservableViewControllersProxy", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    @ProtoDslMarker
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final NativeConfigurationOuterClass.NativeConfiguration.Builder _builder;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lgatewayprotocol/v1/NativeConfigurationKt$Dsl$AdditionalStorePackagesProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AdditionalStorePackagesProxy extends DslProxy {
            private AdditionalStorePackagesProxy() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/NativeConfigurationKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/NativeConfigurationKt$Dsl;", "builder", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(NativeConfigurationOuterClass.NativeConfiguration.Builder builder) {
                kotlin.jvm.internal.n.f(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lgatewayprotocol/v1/NativeConfigurationKt$Dsl$MonitoringIdsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class MonitoringIdsProxy extends DslProxy {
            private MonitoringIdsProxy() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lgatewayprotocol/v1/NativeConfigurationKt$Dsl$ObservableAndroidActivitiesProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class ObservableAndroidActivitiesProxy extends DslProxy {
            private ObservableAndroidActivitiesProxy() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lgatewayprotocol/v1/NativeConfigurationKt$Dsl$ObservableViewControllersProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class ObservableViewControllersProxy extends DslProxy {
            private ObservableViewControllersProxy() {
            }
        }

        public /* synthetic */ Dsl(NativeConfigurationOuterClass.NativeConfiguration.Builder builder, kotlin.jvm.internal.g gVar) {
            this(builder);
        }

        public final /* synthetic */ NativeConfigurationOuterClass.NativeConfiguration _build() {
            NativeConfigurationOuterClass.NativeConfiguration nativeConfigurationBuild = this._builder.build();
            kotlin.jvm.internal.n.e(nativeConfigurationBuild, "_builder.build()");
            return nativeConfigurationBuild;
        }

        public final /* synthetic */ void addAdditionalStorePackages(DslList dslList, String value) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.addAdditionalStorePackages(value);
        }

        public final /* synthetic */ void addAllAdditionalStorePackages(DslList dslList, Iterable values) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(values, "values");
            this._builder.addAllAdditionalStorePackages(values);
        }

        public final /* synthetic */ void addAllMonitoringIds(DslList dslList, Iterable values) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(values, "values");
            this._builder.addAllMonitoringIds(values);
        }

        public final /* synthetic */ void addAllObservableAndroidActivities(DslList dslList, Iterable values) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(values, "values");
            this._builder.addAllObservableAndroidActivities(values);
        }

        public final /* synthetic */ void addAllObservableViewControllers(DslList dslList, Iterable values) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(values, "values");
            this._builder.addAllObservableViewControllers(values);
        }

        public final /* synthetic */ void addMonitoringIds(DslList dslList, int i10) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            this._builder.addMonitoringIds(i10);
        }

        public final /* synthetic */ void addObservableAndroidActivities(DslList dslList, ByteString value) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.addObservableAndroidActivities(value);
        }

        public final /* synthetic */ void addObservableViewControllers(DslList dslList, ByteString value) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.addObservableViewControllers(value);
        }

        public final void clearAdOperations() {
            this._builder.clearAdOperations();
        }

        public final void clearAdPolicy() {
            this._builder.clearAdPolicy();
        }

        public final /* synthetic */ void clearAdditionalStorePackages(DslList dslList) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            this._builder.clearAdditionalStorePackages();
        }

        public final void clearCachedAssetsConfiguration() {
            this._builder.clearCachedAssetsConfiguration();
        }

        public final void clearCachedWebviewFilesConfiguration() {
            this._builder.clearCachedWebviewFilesConfiguration();
        }

        public final void clearDebugSettings() {
            this._builder.clearDebugSettings();
        }

        public final void clearDefaultShowCompletionState() {
            this._builder.clearDefaultShowCompletionState();
        }

        public final void clearDiagnosticEvents() {
            this._builder.clearDiagnosticEvents();
        }

        public final void clearDownloadPolicy() {
            this._builder.clearDownloadPolicy();
        }

        public final void clearEnableIapEvent() {
            this._builder.clearEnableIapEvent();
        }

        public final void clearEnableOm() {
            this._builder.clearEnableOm();
        }

        public final void clearFeatureFlags() {
            this._builder.clearFeatureFlags();
        }

        public final void clearInitPolicy() {
            this._builder.clearInitPolicy();
        }

        public final void clearLevelPlayAppKey() {
            this._builder.clearLevelPlayAppKey();
        }

        public final void clearMaxExtrasSizeKb() {
            this._builder.clearMaxExtrasSizeKb();
        }

        public final void clearMaxReceiptSizeMb() {
            this._builder.clearMaxReceiptSizeMb();
        }

        public final /* synthetic */ void clearMonitoringIds(DslList dslList) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            this._builder.clearMonitoringIds();
        }

        public final /* synthetic */ void clearObservableAndroidActivities(DslList dslList) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            this._builder.clearObservableAndroidActivities();
        }

        public final /* synthetic */ void clearObservableViewControllers(DslList dslList) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            this._builder.clearObservableViewControllers();
        }

        public final void clearOperativeEventPolicy() {
            this._builder.clearOperativeEventPolicy();
        }

        public final void clearOtherPolicy() {
            this._builder.clearOtherPolicy();
        }

        public final void clearOverwriteIntentFlagActivity() {
            this._builder.clearOverwriteIntentFlagActivity();
        }

        public final NativeConfigurationOuterClass.AdOperationsConfiguration getAdOperations() {
            NativeConfigurationOuterClass.AdOperationsConfiguration adOperations = this._builder.getAdOperations();
            kotlin.jvm.internal.n.e(adOperations, "_builder.getAdOperations()");
            return adOperations;
        }

        public final NativeConfigurationOuterClass.RequestPolicy getAdPolicy() {
            NativeConfigurationOuterClass.RequestPolicy adPolicy = this._builder.getAdPolicy();
            kotlin.jvm.internal.n.e(adPolicy, "_builder.getAdPolicy()");
            return adPolicy;
        }

        public final DslList<String, AdditionalStorePackagesProxy> getAdditionalStorePackages() {
            List<String> additionalStorePackagesList = this._builder.getAdditionalStorePackagesList();
            kotlin.jvm.internal.n.e(additionalStorePackagesList, "_builder.getAdditionalStorePackagesList()");
            return new DslList<>(additionalStorePackagesList);
        }

        public final NativeConfigurationOuterClass.CachedAssetsConfiguration getCachedAssetsConfiguration() {
            NativeConfigurationOuterClass.CachedAssetsConfiguration cachedAssetsConfiguration = this._builder.getCachedAssetsConfiguration();
            kotlin.jvm.internal.n.e(cachedAssetsConfiguration, "_builder.getCachedAssetsConfiguration()");
            return cachedAssetsConfiguration;
        }

        public final NativeConfigurationOuterClass.CachedAssetsConfiguration getCachedWebviewFilesConfiguration() {
            NativeConfigurationOuterClass.CachedAssetsConfiguration cachedWebviewFilesConfiguration = this._builder.getCachedWebviewFilesConfiguration();
            kotlin.jvm.internal.n.e(cachedWebviewFilesConfiguration, "_builder.getCachedWebviewFilesConfiguration()");
            return cachedWebviewFilesConfiguration;
        }

        public final NativeConfigurationOuterClass.DebugSettings getDebugSettings() {
            NativeConfigurationOuterClass.DebugSettings debugSettings = this._builder.getDebugSettings();
            kotlin.jvm.internal.n.e(debugSettings, "_builder.getDebugSettings()");
            return debugSettings;
        }

        public final NativeConfigurationOuterClass.ShowCompletionState getDefaultShowCompletionState() {
            NativeConfigurationOuterClass.ShowCompletionState defaultShowCompletionState = this._builder.getDefaultShowCompletionState();
            kotlin.jvm.internal.n.e(defaultShowCompletionState, "_builder.getDefaultShowCompletionState()");
            return defaultShowCompletionState;
        }

        public final int getDefaultShowCompletionStateValue() {
            return this._builder.getDefaultShowCompletionStateValue();
        }

        public final NativeConfigurationOuterClass.DiagnosticEventsConfiguration getDiagnosticEvents() {
            NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEvents = this._builder.getDiagnosticEvents();
            kotlin.jvm.internal.n.e(diagnosticEvents, "_builder.getDiagnosticEvents()");
            return diagnosticEvents;
        }

        public final NativeConfigurationOuterClass.RequestPolicy getDownloadPolicy() {
            NativeConfigurationOuterClass.RequestPolicy downloadPolicy = this._builder.getDownloadPolicy();
            kotlin.jvm.internal.n.e(downloadPolicy, "_builder.getDownloadPolicy()");
            return downloadPolicy;
        }

        public final boolean getEnableIapEvent() {
            return this._builder.getEnableIapEvent();
        }

        public final boolean getEnableOm() {
            return this._builder.getEnableOm();
        }

        public final NativeConfigurationOuterClass.FeatureFlags getFeatureFlags() {
            NativeConfigurationOuterClass.FeatureFlags featureFlags = this._builder.getFeatureFlags();
            kotlin.jvm.internal.n.e(featureFlags, "_builder.getFeatureFlags()");
            return featureFlags;
        }

        public final NativeConfigurationOuterClass.RequestPolicy getInitPolicy() {
            NativeConfigurationOuterClass.RequestPolicy initPolicy = this._builder.getInitPolicy();
            kotlin.jvm.internal.n.e(initPolicy, "_builder.getInitPolicy()");
            return initPolicy;
        }

        public final String getLevelPlayAppKey() {
            String levelPlayAppKey = this._builder.getLevelPlayAppKey();
            kotlin.jvm.internal.n.e(levelPlayAppKey, "_builder.getLevelPlayAppKey()");
            return levelPlayAppKey;
        }

        public final int getMaxExtrasSizeKb() {
            return this._builder.getMaxExtrasSizeKb();
        }

        public final int getMaxReceiptSizeMb() {
            return this._builder.getMaxReceiptSizeMb();
        }

        public final /* synthetic */ DslList getMonitoringIds() {
            List<Integer> monitoringIdsList = this._builder.getMonitoringIdsList();
            kotlin.jvm.internal.n.e(monitoringIdsList, "_builder.getMonitoringIdsList()");
            return new DslList(monitoringIdsList);
        }

        public final /* synthetic */ DslList getObservableAndroidActivities() {
            List<ByteString> observableAndroidActivitiesList = this._builder.getObservableAndroidActivitiesList();
            kotlin.jvm.internal.n.e(observableAndroidActivitiesList, "_builder.getObservableAndroidActivitiesList()");
            return new DslList(observableAndroidActivitiesList);
        }

        public final /* synthetic */ DslList getObservableViewControllers() {
            List<ByteString> observableViewControllersList = this._builder.getObservableViewControllersList();
            kotlin.jvm.internal.n.e(observableViewControllersList, "_builder.getObservableViewControllersList()");
            return new DslList(observableViewControllersList);
        }

        public final NativeConfigurationOuterClass.RequestPolicy getOperativeEventPolicy() {
            NativeConfigurationOuterClass.RequestPolicy operativeEventPolicy = this._builder.getOperativeEventPolicy();
            kotlin.jvm.internal.n.e(operativeEventPolicy, "_builder.getOperativeEventPolicy()");
            return operativeEventPolicy;
        }

        public final NativeConfigurationOuterClass.RequestPolicy getOtherPolicy() {
            NativeConfigurationOuterClass.RequestPolicy otherPolicy = this._builder.getOtherPolicy();
            kotlin.jvm.internal.n.e(otherPolicy, "_builder.getOtherPolicy()");
            return otherPolicy;
        }

        public final int getOverwriteIntentFlagActivity() {
            return this._builder.getOverwriteIntentFlagActivity();
        }

        public final boolean hasAdOperations() {
            return this._builder.hasAdOperations();
        }

        public final boolean hasAdPolicy() {
            return this._builder.hasAdPolicy();
        }

        public final boolean hasCachedAssetsConfiguration() {
            return this._builder.hasCachedAssetsConfiguration();
        }

        public final boolean hasCachedWebviewFilesConfiguration() {
            return this._builder.hasCachedWebviewFilesConfiguration();
        }

        public final boolean hasDebugSettings() {
            return this._builder.hasDebugSettings();
        }

        public final boolean hasDiagnosticEvents() {
            return this._builder.hasDiagnosticEvents();
        }

        public final boolean hasDownloadPolicy() {
            return this._builder.hasDownloadPolicy();
        }

        public final boolean hasFeatureFlags() {
            return this._builder.hasFeatureFlags();
        }

        public final boolean hasInitPolicy() {
            return this._builder.hasInitPolicy();
        }

        public final boolean hasLevelPlayAppKey() {
            return this._builder.hasLevelPlayAppKey();
        }

        public final boolean hasOperativeEventPolicy() {
            return this._builder.hasOperativeEventPolicy();
        }

        public final boolean hasOtherPolicy() {
            return this._builder.hasOtherPolicy();
        }

        public final /* synthetic */ void plusAssignAdditionalStorePackages(DslList<String, AdditionalStorePackagesProxy> dslList, String value) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(value, "value");
            addAdditionalStorePackages(dslList, value);
        }

        public final /* synthetic */ void plusAssignAllAdditionalStorePackages(DslList<String, AdditionalStorePackagesProxy> dslList, Iterable<String> values) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(values, "values");
            addAllAdditionalStorePackages(dslList, values);
        }

        public final /* synthetic */ void plusAssignAllMonitoringIds(DslList<Integer, MonitoringIdsProxy> dslList, Iterable<Integer> values) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(values, "values");
            addAllMonitoringIds(dslList, values);
        }

        public final /* synthetic */ void plusAssignAllObservableAndroidActivities(DslList<ByteString, ObservableAndroidActivitiesProxy> dslList, Iterable<? extends ByteString> values) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(values, "values");
            addAllObservableAndroidActivities(dslList, values);
        }

        public final /* synthetic */ void plusAssignAllObservableViewControllers(DslList<ByteString, ObservableViewControllersProxy> dslList, Iterable<? extends ByteString> values) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(values, "values");
            addAllObservableViewControllers(dslList, values);
        }

        public final /* synthetic */ void plusAssignMonitoringIds(DslList<Integer, MonitoringIdsProxy> dslList, int i10) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            addMonitoringIds(dslList, i10);
        }

        public final /* synthetic */ void plusAssignObservableAndroidActivities(DslList<ByteString, ObservableAndroidActivitiesProxy> dslList, ByteString value) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(value, "value");
            addObservableAndroidActivities(dslList, value);
        }

        public final /* synthetic */ void plusAssignObservableViewControllers(DslList<ByteString, ObservableViewControllersProxy> dslList, ByteString value) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(value, "value");
            addObservableViewControllers(dslList, value);
        }

        public final void setAdOperations(NativeConfigurationOuterClass.AdOperationsConfiguration value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setAdOperations(value);
        }

        public final void setAdPolicy(NativeConfigurationOuterClass.RequestPolicy value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setAdPolicy(value);
        }

        public final /* synthetic */ void setAdditionalStorePackages(DslList dslList, int i10, String value) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setAdditionalStorePackages(i10, value);
        }

        public final void setCachedAssetsConfiguration(NativeConfigurationOuterClass.CachedAssetsConfiguration value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setCachedAssetsConfiguration(value);
        }

        public final void setCachedWebviewFilesConfiguration(NativeConfigurationOuterClass.CachedAssetsConfiguration value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setCachedWebviewFilesConfiguration(value);
        }

        public final void setDebugSettings(NativeConfigurationOuterClass.DebugSettings value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setDebugSettings(value);
        }

        public final void setDefaultShowCompletionState(NativeConfigurationOuterClass.ShowCompletionState value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setDefaultShowCompletionState(value);
        }

        public final void setDefaultShowCompletionStateValue(int i10) {
            this._builder.setDefaultShowCompletionStateValue(i10);
        }

        public final void setDiagnosticEvents(NativeConfigurationOuterClass.DiagnosticEventsConfiguration value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setDiagnosticEvents(value);
        }

        public final void setDownloadPolicy(NativeConfigurationOuterClass.RequestPolicy value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setDownloadPolicy(value);
        }

        public final void setEnableIapEvent(boolean z10) {
            this._builder.setEnableIapEvent(z10);
        }

        public final void setEnableOm(boolean z10) {
            this._builder.setEnableOm(z10);
        }

        public final void setFeatureFlags(NativeConfigurationOuterClass.FeatureFlags value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setFeatureFlags(value);
        }

        public final void setInitPolicy(NativeConfigurationOuterClass.RequestPolicy value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setInitPolicy(value);
        }

        public final void setLevelPlayAppKey(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setLevelPlayAppKey(value);
        }

        public final void setMaxExtrasSizeKb(int i10) {
            this._builder.setMaxExtrasSizeKb(i10);
        }

        public final void setMaxReceiptSizeMb(int i10) {
            this._builder.setMaxReceiptSizeMb(i10);
        }

        public final /* synthetic */ void setMonitoringIds(DslList dslList, int i10, int i11) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            this._builder.setMonitoringIds(i10, i11);
        }

        public final /* synthetic */ void setObservableAndroidActivities(DslList dslList, int i10, ByteString value) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setObservableAndroidActivities(i10, value);
        }

        public final /* synthetic */ void setObservableViewControllers(DslList dslList, int i10, ByteString value) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setObservableViewControllers(i10, value);
        }

        public final void setOperativeEventPolicy(NativeConfigurationOuterClass.RequestPolicy value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setOperativeEventPolicy(value);
        }

        public final void setOtherPolicy(NativeConfigurationOuterClass.RequestPolicy value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setOtherPolicy(value);
        }

        public final void setOverwriteIntentFlagActivity(int i10) {
            this._builder.setOverwriteIntentFlagActivity(i10);
        }

        private Dsl(NativeConfigurationOuterClass.NativeConfiguration.Builder builder) {
            this._builder = builder;
        }
    }

    private NativeConfigurationKt() {
    }
}
