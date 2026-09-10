package com.chartboost.sdk.impl;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public final class ab {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f13420b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13421a;

    public static final class a {
        public a() {
        }

        public final ab a(Float f) {
            return new ab(android.support.v4.media.a.n("window.mraidbridge.notifyAudioVolumeChangeEvent(", f != null ? String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f.floatValue())}, 1)) : AbstractJsonLexerKt.NULL, ");"));
        }

        public final ab b() {
            return a("{hostSDKName: 'Chartboost-Android-SDK'}");
        }

        public final ab c(jc screenMetrics) {
            Intrinsics.f(screenMetrics, "screenMetrics");
            ka kaVarB = screenMetrics.b().b();
            int iC = kaVarB.c();
            int iD = kaVarB.d();
            int iB = kaVarB.b();
            int iA = kaVarB.a();
            StringBuilder sbP = androidx.datastore.preferences.protobuf.a.p(iC, iD, "window.mraidbridge.setDefaultPosition(", ", ", ", ");
            sbP.append(iB);
            sbP.append(", ");
            sbP.append(iA);
            sbP.append(");");
            return new ab(sbP.toString());
        }

        public final ab d(jc screenMetrics) {
            Intrinsics.f(screenMetrics, "screenMetrics");
            ka kaVarB = screenMetrics.c().b();
            return new ab(androidx.datastore.preferences.protobuf.a.e(kaVarB.b(), kaVarB.a(), "window.mraidbridge.setMaxSize(", ", ", ");"));
        }

        public final ab e(jc screenMetrics) {
            Intrinsics.f(screenMetrics, "screenMetrics");
            ka kaVarB = screenMetrics.d().b();
            return new ab(androidx.datastore.preferences.protobuf.a.e(kaVarB.b(), kaVarB.a(), "window.mraidbridge.setScreenSize(", ", ", ");"));
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ab b(jc screenMetrics) {
            Intrinsics.f(screenMetrics, "screenMetrics");
            ka kaVarB = screenMetrics.a().b();
            int iC = kaVarB.c();
            int iD = kaVarB.d();
            int iB = kaVarB.b();
            int iA = kaVarB.a();
            StringBuilder sbP = androidx.datastore.preferences.protobuf.a.p(iC, iD, "window.mraidbridge.setCurrentPosition(", ", ", ", ");
            sbP.append(iB);
            sbP.append(", ");
            sbP.append(iA);
            sbP.append(");");
            return new ab(sbP.toString());
        }

        public final ab a(gc command) {
            Intrinsics.f(command, "command");
            return new ab(android.support.v4.media.a.n("window.mraidbridge.nativeCallComplete({", command.b(), "});"));
        }

        public final ab b(String sdkVersion) {
            Intrinsics.f(sdkVersion, "sdkVersion");
            return a("{hostSDKVersion: '" + sdkVersion + "'}");
        }

        public final ab a(jc screenMetrics) {
            Intrinsics.f(screenMetrics, "screenMetrics");
            ka kaVarB = screenMetrics.c().b();
            return new ab(androidx.datastore.preferences.protobuf.a.e(kaVarB.b(), kaVarB.a(), "window.mraidbridge.notifySizeChangeEvent(", ", ", ");"));
        }

        public final ab a(ac state) {
            Intrinsics.f(state, "state");
            return a("{state: '" + state.b() + "'}");
        }

        public final ab a(boolean z2) {
            String lowerCase = String.valueOf(z2).toLowerCase(Locale.ROOT);
            Intrinsics.e(lowerCase, "toLowerCase(...)");
            return a("{viewable: " + lowerCase + "}");
        }

        public final ab a(yb orientation, boolean z2) {
            Intrinsics.f(orientation, "orientation");
            return a("{orientation: '" + orientation.b() + "', locked: " + z2 + "}");
        }

        public final ab a(zb placementType) {
            Intrinsics.f(placementType, "placementType");
            return new ab(android.support.v4.media.a.n("window.mraidbridge.setPlacementType('", placementType.b(), "');"));
        }

        public final ab a() {
            return new ab("window.mraidbridge.notifyReadyEvent();");
        }

        public final ab a(String str) {
            return new ab(android.support.v4.media.a.n("window.mraidbridge.fireChangeEvent(", str, ");"));
        }
    }

    public ab(String javascript) {
        Intrinsics.f(javascript, "javascript");
        this.f13421a = javascript;
    }

    public final String a() {
        return this.f13421a;
    }
}
