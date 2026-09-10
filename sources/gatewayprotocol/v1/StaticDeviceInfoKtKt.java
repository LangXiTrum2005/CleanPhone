package gatewayprotocol.v1;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\b\u001a\u00020\n*\u00020\n2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\f\u001a+\u0010\b\u001a\u00020\r*\u00020\r2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\u000f\"\u0017\u0010\u0013\u001a\u0004\u0018\u00010\n*\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\"\u0017\u0010\u0016\u001a\u0004\u0018\u00010\r*\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/StaticDeviceInfoKt$Dsl;", "Lwj/r;", "block", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "-initializestaticDeviceInfo", "(Ljk/b;)Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "staticDeviceInfo", "copy", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;Ljk/b;)Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android;", "Lgatewayprotocol/v1/StaticDeviceInfoKt$AndroidKt$Dsl;", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android;Ljk/b;)Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android;", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios;", "Lgatewayprotocol/v1/StaticDeviceInfoKt$IosKt$Dsl;", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios;Ljk/b;)Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios;", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder;", "getAndroidOrNull", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder;)Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android;", "androidOrNull", "getIosOrNull", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder;)Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios;", "iosOrNull", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class StaticDeviceInfoKtKt {
    /* JADX INFO: renamed from: -initializestaticDeviceInfo, reason: not valid java name */
    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo m3319initializestaticDeviceInfo(jk.b block) {
        kotlin.jvm.internal.n.f(block, "block");
        StaticDeviceInfoKt.Dsl.Companion companion = StaticDeviceInfoKt.Dsl.INSTANCE;
        StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builderNewBuilder = StaticDeviceInfoOuterClass.StaticDeviceInfo.newBuilder();
        kotlin.jvm.internal.n.e(builderNewBuilder, "newBuilder()");
        StaticDeviceInfoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo copy(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo, jk.b block) {
        kotlin.jvm.internal.n.f(staticDeviceInfo, "<this>");
        kotlin.jvm.internal.n.f(block, "block");
        StaticDeviceInfoKt.Dsl.Companion companion = StaticDeviceInfoKt.Dsl.INSTANCE;
        StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder = staticDeviceInfo.toBuilder();
        kotlin.jvm.internal.n.e(builder, "this.toBuilder()");
        StaticDeviceInfoKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo.Android getAndroidOrNull(StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder staticDeviceInfoOrBuilder) {
        kotlin.jvm.internal.n.f(staticDeviceInfoOrBuilder, "<this>");
        if (staticDeviceInfoOrBuilder.hasAndroid()) {
            return staticDeviceInfoOrBuilder.getAndroid();
        }
        return null;
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios getIosOrNull(StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder staticDeviceInfoOrBuilder) {
        kotlin.jvm.internal.n.f(staticDeviceInfoOrBuilder, "<this>");
        if (staticDeviceInfoOrBuilder.hasIos()) {
            return staticDeviceInfoOrBuilder.getIos();
        }
        return null;
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo.Android copy(StaticDeviceInfoOuterClass.StaticDeviceInfo.Android android2, jk.b block) {
        kotlin.jvm.internal.n.f(android2, "<this>");
        kotlin.jvm.internal.n.f(block, "block");
        StaticDeviceInfoKt.AndroidKt.Dsl.Companion companion = StaticDeviceInfoKt.AndroidKt.Dsl.INSTANCE;
        StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder builder = android2.toBuilder();
        kotlin.jvm.internal.n.e(builder, "this.toBuilder()");
        StaticDeviceInfoKt.AndroidKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios copy(StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios ios, jk.b block) {
        kotlin.jvm.internal.n.f(ios, "<this>");
        kotlin.jvm.internal.n.f(block, "block");
        StaticDeviceInfoKt.IosKt.Dsl.Companion companion = StaticDeviceInfoKt.IosKt.Dsl.INSTANCE;
        StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder builder = ios.toBuilder();
        kotlin.jvm.internal.n.e(builder, "this.toBuilder()");
        StaticDeviceInfoKt.IosKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
