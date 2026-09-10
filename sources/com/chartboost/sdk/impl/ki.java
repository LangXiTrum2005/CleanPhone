package com.chartboost.sdk.impl;

import android.content.Context;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ki {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14368a;

    public static final class a extends ki {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f14369b = new a();

        public a() {
            super("click", null);
        }

        @Override // com.chartboost.sdk.impl.ki
        public void a(rj rjVar, dh dhVar, Context androidContext, id omManager, p2 identity) {
            Intrinsics.f(androidContext, "androidContext");
            Intrinsics.f(omManager, "omManager");
            Intrinsics.f(identity, "identity");
            if (rjVar != null) {
                rjVar.a(this);
            }
            a(dhVar, androidContext, omManager, identity, null, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 1811085104;
        }

        public String toString() {
            return "Click";
        }
    }

    public static final class b extends ki {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f14370b = new b();

        public b() {
            super("close", null);
        }

        @Override // com.chartboost.sdk.impl.ki
        public void a(rj rjVar, dh dhVar, Context androidContext, id omManager, p2 identity) {
            Intrinsics.f(androidContext, "androidContext");
            Intrinsics.f(omManager, "omManager");
            Intrinsics.f(identity, "identity");
            ki.a(this, dhVar, androidContext, omManager, identity, null, null, 48, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 1811091360;
        }

        public String toString() {
            return "Close";
        }
    }

    public static final class c extends ki {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f14371b = new c();

        public c() {
            super("closeLinear", null);
        }

        @Override // com.chartboost.sdk.impl.ki
        public void a(rj rjVar, dh dhVar, Context androidContext, id omManager, p2 identity) {
            Intrinsics.f(androidContext, "androidContext");
            Intrinsics.f(omManager, "omManager");
            Intrinsics.f(identity, "identity");
            ki.a(this, dhVar, androidContext, omManager, identity, null, null, 48, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 2126271205;
        }

        public String toString() {
            return "CloseLinear";
        }
    }

    public static final class d extends ki {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f14372b = new d();

        public d() {
            super("complete", null);
        }

        @Override // com.chartboost.sdk.impl.ki
        public void a(rj rjVar, dh dhVar, Context androidContext, id omManager, p2 identity) {
            Intrinsics.f(androidContext, "androidContext");
            Intrinsics.f(omManager, "omManager");
            Intrinsics.f(identity, "identity");
            if (rjVar != null) {
                rjVar.a(this);
            }
            a(dhVar, androidContext, omManager, identity, null, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return -848642415;
        }

        public String toString() {
            return "Complete";
        }
    }

    public static final class e extends ki {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f14373b = new e();

        public e() {
            super("creativeView", null);
        }

        @Override // com.chartboost.sdk.impl.ki
        public void a(rj rjVar, dh dhVar, Context androidContext, id omManager, p2 identity) {
            Intrinsics.f(androidContext, "androidContext");
            Intrinsics.f(omManager, "omManager");
            Intrinsics.f(identity, "identity");
            ki.a(this, dhVar, androidContext, omManager, identity, null, null, 48, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return 141283404;
        }

        public String toString() {
            return "CreativeView";
        }
    }

    public static final class f extends ki {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f14374b = new f();

        public f() {
            super("error", null);
        }

        @Override // com.chartboost.sdk.impl.ki
        public void a(rj rjVar, dh dhVar, Context androidContext, id omManager, p2 identity) {
            Map mapB;
            Intrinsics.f(androidContext, "androidContext");
            Intrinsics.f(omManager, "omManager");
            Intrinsics.f(identity, "identity");
            Object obj = (dhVar == null || (mapB = dhVar.b()) == null) ? null : mapB.get("VAST_ERROR_CODE");
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            if (rjVar != null) {
                rjVar.a(this);
            }
            a(dhVar, androidContext, omManager, identity, num, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public int hashCode() {
            return 1813119920;
        }

        public String toString() {
            return "Error";
        }
    }

    public static final class g extends ki {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final g f14375b = new g();

        public g() {
            super("firstQuartile", null);
        }

        @Override // com.chartboost.sdk.impl.ki
        public void a(rj rjVar, dh dhVar, Context androidContext, id omManager, p2 identity) {
            Intrinsics.f(androidContext, "androidContext");
            Intrinsics.f(omManager, "omManager");
            Intrinsics.f(identity, "identity");
            if (rjVar != null) {
                rjVar.a(this);
            }
            a(dhVar, androidContext, omManager, identity, null, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public int hashCode() {
            return 1356419579;
        }

        public String toString() {
            return "FirstQuartile";
        }
    }

    public static final class h extends ki {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final h f14376b = new h();

        public h() {
            super("impression", null);
        }

        @Override // com.chartboost.sdk.impl.ki
        public void a(rj rjVar, dh dhVar, Context androidContext, id omManager, p2 identity) {
            Intrinsics.f(androidContext, "androidContext");
            Intrinsics.f(omManager, "omManager");
            Intrinsics.f(identity, "identity");
            if (rjVar != null) {
                rjVar.a(this);
            }
            a(dhVar, androidContext, omManager, identity, null, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public int hashCode() {
            return 1160259937;
        }

        public String toString() {
            return "Impression";
        }
    }

    public static final class i extends ki {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final i f14377b = new i();

        public i() {
            super("midpoint", null);
        }

        @Override // com.chartboost.sdk.impl.ki
        public void a(rj rjVar, dh dhVar, Context androidContext, id omManager, p2 identity) {
            Intrinsics.f(androidContext, "androidContext");
            Intrinsics.f(omManager, "omManager");
            Intrinsics.f(identity, "identity");
            if (rjVar != null) {
                rjVar.a(this);
            }
            a(dhVar, androidContext, omManager, identity, null, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public int hashCode() {
            return -1888032352;
        }

        public String toString() {
            return "Midpoint";
        }
    }

    public static final class j extends ki {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final j f14378b = new j();

        public j() {
            super("pause", null);
        }

        @Override // com.chartboost.sdk.impl.ki
        public void a(rj rjVar, dh dhVar, Context androidContext, id omManager, p2 identity) {
            Intrinsics.f(androidContext, "androidContext");
            Intrinsics.f(omManager, "omManager");
            Intrinsics.f(identity, "identity");
            if (rjVar != null) {
                rjVar.a(this);
            }
            a(dhVar, androidContext, omManager, identity, null, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public int hashCode() {
            return 1822775198;
        }

        public String toString() {
            return "Pause";
        }
    }

    public static final class k extends ki {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f14379b;

        public k(int i2) {
            super(android.support.v4.media.a.h(i2, "progress"), null);
            this.f14379b = i2;
        }

        @Override // com.chartboost.sdk.impl.ki
        public void a(rj rjVar, dh dhVar, Context androidContext, id omManager, p2 identity) {
            Intrinsics.f(androidContext, "androidContext");
            Intrinsics.f(omManager, "omManager");
            Intrinsics.f(identity, "identity");
            ki.a(this, dhVar, androidContext, omManager, identity, null, null, 48, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.f14379b == ((k) obj).f14379b;
        }

        public int hashCode() {
            return Integer.hashCode(this.f14379b);
        }

        public String toString() {
            return androidx.datastore.preferences.protobuf.a.k("Progress(offsetSeconds=", this.f14379b, ")");
        }
    }

    public static final class l extends ki {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final l f14380b = new l();

        public l() {
            super("resume", null);
        }

        @Override // com.chartboost.sdk.impl.ki
        public void a(rj rjVar, dh dhVar, Context androidContext, id omManager, p2 identity) {
            Intrinsics.f(androidContext, "androidContext");
            Intrinsics.f(omManager, "omManager");
            Intrinsics.f(identity, "identity");
            if (rjVar != null) {
                rjVar.a(this);
            }
            a(dhVar, androidContext, omManager, identity, null, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public int hashCode() {
            return 732351365;
        }

        public String toString() {
            return "Resume";
        }
    }

    public static final class m extends ki {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final m f14381b = new m();

        public m() {
            super("start", null);
        }

        @Override // com.chartboost.sdk.impl.ki
        public void a(rj rjVar, dh dhVar, Context androidContext, id omManager, p2 identity) {
            Map mapB;
            Map mapB2;
            Intrinsics.f(androidContext, "androidContext");
            Intrinsics.f(omManager, "omManager");
            Intrinsics.f(identity, "identity");
            Object obj = (dhVar == null || (mapB2 = dhVar.b()) == null) ? null : mapB2.get("duration");
            Float f = obj instanceof Float ? (Float) obj : null;
            float fFloatValue = f != null ? f.floatValue() : 0.0f;
            if (fFloatValue < 1.0f) {
                fFloatValue = 30.0f;
            }
            Object obj2 = (dhVar == null || (mapB = dhVar.b()) == null) ? null : mapB.get("volume");
            Float f2 = obj2 instanceof Float ? (Float) obj2 : null;
            float fFloatValue2 = f2 != null ? f2.floatValue() : 1.0f;
            if (rjVar != null) {
                rjVar.a(fFloatValue, fFloatValue2);
            }
            a(dhVar, androidContext, omManager, identity, null, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public int hashCode() {
            return 1826092554;
        }

        public String toString() {
            return "Start";
        }
    }

    public static final class n extends ki {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final n f14382b = new n();

        public n() {
            super("thirdQuartile", null);
        }

        @Override // com.chartboost.sdk.impl.ki
        public void a(rj rjVar, dh dhVar, Context androidContext, id omManager, p2 identity) {
            Intrinsics.f(androidContext, "androidContext");
            Intrinsics.f(omManager, "omManager");
            Intrinsics.f(identity, "identity");
            if (rjVar != null) {
                rjVar.a(this);
            }
            a(dhVar, androidContext, omManager, identity, null, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public int hashCode() {
            return -541631054;
        }

        public String toString() {
            return "ThirdQuartile";
        }
    }

    public static final class o extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Integer f14383b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Integer f14384c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Integer num, Integer num2) {
            super(1);
            this.f14383b = num;
            this.f14384c = num2;
        }

        public final void a(cb macroContext) {
            Intrinsics.f(macroContext, "$this$macroContext");
            macroContext.a(this.f14383b);
            macroContext.b(this.f14384c);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((cb) obj);
            return Unit.f43263a;
        }
    }

    public ki(String str) {
        this.f14368a = str;
    }

    public abstract void a(rj rjVar, dh dhVar, Context context, id idVar, p2 p2Var);

    public /* synthetic */ ki(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final void a(dh dhVar, Context androidContext, id omManager, p2 identity, Integer num, Integer num2) {
        String strE;
        Unit unit;
        Intrinsics.f(androidContext, "androidContext");
        Intrinsics.f(omManager, "omManager");
        Intrinsics.f(identity, "identity");
        if (dhVar == null || (strE = dhVar.e()) == null) {
            za.a(android.support.v4.media.a.n("Failed to fire tracking URL for event `", this.f14368a, "`. URL is null in TrackingEvent."), (Throwable) null, 2, (Object) null);
            return;
        }
        String strA = eb.a(strE, eb.a(androidContext, omManager, identity, new o(num, num2)));
        z2 z2VarB = yh.f15659a.b();
        if (z2VarB != null) {
            z2VarB.a(new li(strA));
            unit = Unit.f43263a;
        } else {
            unit = null;
        }
        if (unit == null) {
            za.b(android.support.v4.media.a.n("Failed to submit tracking request for ", strA, ". Network service is null."), (Throwable) null, 2, (Object) null);
        }
        za.c(android.support.v4.media.a.r(androidx.datastore.preferences.protobuf.a.q("Tracking URL for event `", this.f14368a, "` fired: ", strA, " (raw: "), strE, ")"), null, 2, null);
    }

    public static /* synthetic */ void a(ki kiVar, dh dhVar, Context context, id idVar, p2 p2Var, Integer num, Integer num2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fireTracker");
        }
        if ((i2 & 16) != 0) {
            num = null;
        }
        if ((i2 & 32) != 0) {
            num2 = null;
        }
        kiVar.a(dhVar, context, idVar, p2Var, num, num2);
    }

    public final String a() {
        return this.f14368a;
    }
}
