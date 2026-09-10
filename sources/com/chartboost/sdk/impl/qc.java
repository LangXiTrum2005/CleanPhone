package com.chartboost.sdk.impl;

import android.content.ActivityNotFoundException;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.iab.omid.library.chartboost.adsession.VerificationScriptResource;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class qc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lh f14889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rh f14890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j8 f14891c;
    public float d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public t9 f14892e;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14893a;

        static {
            int[] iArr = new int[rc.values().length];
            try {
                iArr[rc.GET_PARAMETERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[rc.GET_MAX_SIZE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[rc.GET_SCREEN_SIZE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[rc.GET_CURRENT_POSITION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[rc.GET_DEFAULT_POSITION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[rc.GET_ORIENTATION_PROPERTIES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[rc.CLICK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[rc.CLOSE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[rc.SKIPPED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[rc.VIDEO_COMPLETED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[rc.VIDEO_RESUMED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[rc.VIDEO_PAUSED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[rc.VIDEO_REPLAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[rc.CURRENT_VIDEO_DURATION.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[rc.TOTAL_VIDEO_DURATION.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[rc.SHOW.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[rc.ERROR.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[rc.WARNING.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[rc.DEBUG.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[rc.TRACKING.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[rc.OPEN_URL.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[rc.SET_ORIENTATION_PROPERTIES.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[rc.REWARD.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[rc.REWARDED_VIDEO_COMPLETED.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[rc.PLAY_VIDEO.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[rc.PAUSE_VIDEO.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[rc.CLOSE_VIDEO.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[rc.MUTE_VIDEO.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[rc.UNMUTE_VIDEO.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[rc.OM_MEASUREMENT_RESOURCES.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[rc.START.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[rc.BUFFER_START.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[rc.BUFFER_END.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[rc.VIDEO_FINISHED.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[rc.VIDEO_STARTED.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[rc.ON_FOREGROUND.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[rc.VIDEO_ENDED.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[rc.VIDEO_FAILED.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[rc.PLAYBACK_TIME.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[rc.ON_BACKGROUND.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            f14893a = iArr;
        }
    }

    public static final class a0 extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a0 f14894b = new a0();

        public a0() {
            super(0);
        }

        public final void a() {
            za.b("Video replay command is run", (Throwable) null, 2, (Object) null);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public static final class b extends Lambda implements Function0 {
        public b() {
            super(0);
        }

        public final void a() {
            Unit unit;
            t9 t9Var = qc.this.f14892e;
            if (t9Var != null) {
                t9Var.u();
                unit = Unit.f43263a;
            } else {
                unit = null;
            }
            if (unit == null) {
                za.a("Impression interface is missing in template show", (Throwable) null, 2, (Object) null);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public static final class b0 extends Lambda implements Function0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ JSONObject f14897c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(JSONObject jSONObject) {
            super(0);
            this.f14897c = jSONObject;
        }

        public final void a() {
            qc.this.a(this.f14897c);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public static final class c extends Lambda implements Function0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ JSONObject f14899c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(JSONObject jSONObject) {
            super(0);
            this.f14899c = jSONObject;
        }

        public final void a() {
            qc.this.c(this.f14899c);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public static final class c0 extends Lambda implements Function0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ JSONObject f14901c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(JSONObject jSONObject) {
            super(0);
            this.f14901c = jSONObject;
        }

        public final void a() {
            qc.this.i(this.f14901c);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public static final class d extends Lambda implements Function0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ JSONObject f14903c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(JSONObject jSONObject) {
            super(0);
            this.f14903c = jSONObject;
        }

        public final void a() {
            qc.this.k(this.f14903c);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public static final class e extends Lambda implements Function0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ JSONObject f14905c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(JSONObject jSONObject) {
            super(0);
            this.f14905c = jSONObject;
        }

        public final void a() {
            qc.this.b(this.f14905c);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public static final class f extends Lambda implements Function0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ JSONObject f14907c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(JSONObject jSONObject) {
            super(0);
            this.f14907c = jSONObject;
        }

        public final void a() {
            qc.this.j(this.f14907c);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public static final class g extends Lambda implements Function0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ JSONObject f14909c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(JSONObject jSONObject) {
            super(0);
            this.f14909c = jSONObject;
        }

        public final void a() {
            qc.this.e(this.f14909c);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public static final class h extends Lambda implements Function0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ JSONObject f14911c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(JSONObject jSONObject) {
            super(0);
            this.f14911c = jSONObject;
        }

        public final void a() {
            qc.this.h(this.f14911c);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public static final class i extends Lambda implements Function0 {
        public i() {
            super(0);
        }

        public final void a() {
            t9 t9Var = qc.this.f14892e;
            if (t9Var != null) {
                t9Var.A();
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public static final class j extends Lambda implements Function0 {
        public j() {
            super(0);
        }

        public final void a() {
            Unit unit;
            t9 t9Var = qc.this.f14892e;
            if (t9Var != null) {
                t9Var.q();
                unit = Unit.f43263a;
            } else {
                unit = null;
            }
            if (unit == null) {
                za.a("Impression interface is missing in template rewarded video completed", (Throwable) null, 2, (Object) null);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public static final class k extends Lambda implements Function0 {
        public k() {
            super(0);
        }

        public final void a() {
            Unit unit;
            t9 t9Var = qc.this.f14892e;
            if (t9Var != null) {
                t9Var.v();
                unit = Unit.f43263a;
            } else {
                unit = null;
            }
            if (unit == null) {
                za.a("Impression interface is missing in template play video", (Throwable) null, 2, (Object) null);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public static final class l extends Lambda implements Function0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ JSONObject f14916c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(JSONObject jSONObject) {
            super(0);
            this.f14916c = jSONObject;
        }

        public final void a() {
            t9 t9Var = qc.this.f14892e;
            if (t9Var != null) {
                t9Var.b(qc.this.f14890b.b(this.f14916c));
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public static final class m extends Lambda implements Function0 {
        public m() {
            super(0);
        }

        public final void a() {
            Unit unit;
            t9 t9Var = qc.this.f14892e;
            if (t9Var != null) {
                t9Var.k();
                unit = Unit.f43263a;
            } else {
                unit = null;
            }
            if (unit == null) {
                za.a("Impression interface is missing in template pause video", (Throwable) null, 2, (Object) null);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public static final class n extends Lambda implements Function0 {
        public n() {
            super(0);
        }

        public final void a() {
            Unit unit;
            t9 t9Var = qc.this.f14892e;
            if (t9Var != null) {
                t9Var.z();
                unit = Unit.f43263a;
            } else {
                unit = null;
            }
            if (unit == null) {
                za.a("Impression interface is missing in template close video", (Throwable) null, 2, (Object) null);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public static final class o extends Lambda implements Function0 {
        public o() {
            super(0);
        }

        public final void a() {
            Unit unit;
            t9 t9Var = qc.this.f14892e;
            if (t9Var != null) {
                t9Var.f();
                unit = Unit.f43263a;
            } else {
                unit = null;
            }
            if (unit == null) {
                za.a("Impression interface is missing in template mute video", (Throwable) null, 2, (Object) null);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public static final class p extends Lambda implements Function0 {
        public p() {
            super(0);
        }

        public final void a() {
            Unit unit;
            t9 t9Var = qc.this.f14892e;
            if (t9Var != null) {
                t9Var.b();
                unit = Unit.f43263a;
            } else {
                unit = null;
            }
            if (unit == null) {
                za.a("Impression interface is missing in template unmute video", (Throwable) null, 2, (Object) null);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public static final class q extends Lambda implements Function0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ JSONObject f14922c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(JSONObject jSONObject) {
            super(0);
            this.f14922c = jSONObject;
        }

        public final void a() {
            qc.this.f(this.f14922c);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public static final class r extends Lambda implements Function0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ JSONObject f14924c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(JSONObject jSONObject) {
            super(0);
            this.f14924c = jSONObject;
        }

        public final void a() {
            qc.this.g(this.f14924c);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public static final class s extends Lambda implements Function0 {
        public s() {
            super(0);
        }

        public final void a() {
            qc.this.c();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public static final class t extends Lambda implements Function0 {
        public t() {
            super(0);
        }

        public final void a() {
            qc.this.b();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public static final class u extends Lambda implements Function0 {
        public u() {
            super(0);
        }

        public final void a() {
            qc.this.d();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public static final class v extends Lambda implements Function0 {
        public v() {
            super(0);
        }

        public final void a() {
            Unit unit;
            t9 t9Var = qc.this.f14892e;
            if (t9Var != null) {
                t9Var.t();
                unit = Unit.f43263a;
            } else {
                unit = null;
            }
            if (unit == null) {
                za.a("Impression interface is missing in template close", (Throwable) null, 2, (Object) null);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public static final class w extends Lambda implements Function0 {
        public w() {
            super(0);
        }

        public final void a() {
            t9 t9Var = qc.this.f14892e;
            if (t9Var != null) {
                t9Var.a(mi.SKIP);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public static final class x extends Lambda implements Function0 {
        public x() {
            super(0);
        }

        public final void a() {
            qc.this.g();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public static final class y extends Lambda implements Function0 {
        public y() {
            super(0);
        }

        public final void a() {
            qc.this.f();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public static final class z extends Lambda implements Function0 {
        public z() {
            super(0);
        }

        public final void a() {
            qc.this.e();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public qc(lh uiPost, rh urlParser) {
        Intrinsics.f(uiPost, "uiPost");
        Intrinsics.f(urlParser, "urlParser");
        this.f14889a = uiPost;
        this.f14890b = urlParser;
    }

    public final void k(JSONObject jSONObject) {
        String string;
        za.a("Javascript warning occurred", (Throwable) null, 2, (Object) null);
        if (jSONObject != null) {
            try {
                string = jSONObject.getString(PglCryptUtils.KEY_MESSAGE);
            } catch (Exception unused) {
                t9 t9Var = this.f14892e;
                if (t9Var != null) {
                    t9Var.c("Warning message is empty");
                    return;
                }
                return;
            }
        } else {
            string = null;
        }
        if (string == null) {
            string = "Missing message argument";
        }
        za.a("JS->Native Warning message: ".concat(string), (Throwable) null, 2, (Object) null);
        t9 t9Var2 = this.f14892e;
        if (t9Var2 != null) {
            t9Var2.c(string);
        }
    }

    public final void i(JSONObject jSONObject) {
        float fOptDouble;
        Unit unit;
        if (jSONObject != null) {
            try {
                fOptDouble = (float) jSONObject.optDouble("duration", 0.0d);
            } catch (Exception e2) {
                k(new JSONObject().put(PglCryptUtils.KEY_MESSAGE, "Parsing exception unknown field for total player duration: " + e2));
                return;
            }
        } else {
            fOptDouble = 0.0f;
        }
        float f2 = fOptDouble * 1000;
        za.a("######### JS->Native Video total player duration" + f2, (Throwable) null, 2, (Object) null);
        this.d = f2;
        t9 t9Var = this.f14892e;
        if (t9Var != null) {
            t9Var.b(f2);
            unit = Unit.f43263a;
        } else {
            unit = null;
        }
        if (unit == null) {
            za.a("Impression interface is missing in totalVideoDuration", (Throwable) null, 2, (Object) null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0026  */
    public final void j(JSONObject jSONObject) {
        Unit unit;
        Unit unit2;
        if (jSONObject != null) {
            try {
                String string = jSONObject.getString("event");
                if (string != null) {
                    t9 t9Var = this.f14892e;
                    unit = Unit.f43263a;
                    if (t9Var != null) {
                        t9Var.e(string);
                        unit2 = unit;
                    } else {
                        unit2 = null;
                    }
                    if (unit2 == null) {
                        za.a("JS->Native Track VAST event message: ".concat(string), (Throwable) null, 2, (Object) null);
                    }
                } else {
                    unit = null;
                }
            } catch (Exception e2) {
                za.b("Exception while parsing webview VAST tracking", e2);
                return;
            }
        } else {
            unit = null;
        }
        if (unit == null) {
            za.b("Tracking command received but event is missing!", (Throwable) null, 2, (Object) null);
        }
    }

    public final void a() {
        this.f14892e = null;
    }

    public final void b(JSONObject jSONObject) {
        try {
            za.a("Debug message: " + b(jSONObject, "JS->Native Debug message: "), (Throwable) null, 2, (Object) null);
        } catch (Exception e2) {
            za.b("Exception occurred while parsing the message for webview debug track event", e2);
        }
    }

    public final void c(JSONObject jSONObject) {
        za.a("Javascript Error occurred " + jSONObject, (Throwable) null, 2, (Object) null);
        d(jSONObject);
        try {
            t9 t9Var = this.f14892e;
            if (t9Var != null) {
                t9Var.i();
                if (t9Var.d(b(jSONObject, "JS->Native Error message: ")) != null) {
                    return;
                }
            }
            za.a("Impression interface is missing in error", (Throwable) null, 2, (Object) null);
        } catch (Exception unused) {
            za.b("Error message is empty", (Throwable) null, 2, (Object) null);
            t9 t9Var2 = this.f14892e;
            if (t9Var2 != null) {
                t9Var2.d("");
            }
        }
    }

    public final void d() {
        Unit unit;
        try {
            t9 t9Var = this.f14892e;
            if (t9Var != null) {
                t9Var.a(mi.COMPLETED);
                unit = Unit.f43263a;
            } else {
                unit = null;
            }
            if (unit == null) {
                za.a("Impression interface is missing in runVideoFinished", (Throwable) null, 2, (Object) null);
            }
        } catch (Exception e2) {
            za.b("Invalid buffer end command", e2);
        }
    }

    public final void e(JSONObject jSONObject) {
        Unit unit;
        try {
            t9 t9Var = this.f14892e;
            if (t9Var != null) {
                t9Var.c(this.f14890b.b(jSONObject));
                unit = Unit.f43263a;
            } else {
                unit = null;
            }
            if (unit == null) {
                za.a("Impression interface is missing in openUrl", (Throwable) null, 2, (Object) null);
            }
        } catch (ActivityNotFoundException e2) {
            za.b("ActivityNotFoundException occured when opening a url in a browser", e2);
        } catch (Exception e3) {
            za.b("Exception while opening a browser view with MRAID url", e3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007c  */
    public final void f(JSONObject jSONObject) {
        List listI0;
        Unit unit;
        Unit unit2;
        if (jSONObject != null) {
            try {
                String string = jSONObject.getString("resources");
                if (string != null) {
                    if (string.length() == 0) {
                        listI0 = EmptyList.X;
                    } else {
                        List<JSONObject> listAsList = w7.asList(new JSONArray(string));
                        ArrayList arrayList = new ArrayList(CollectionsKt.n(listAsList, 10));
                        for (JSONObject jSONObject2 : listAsList) {
                            arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithParameters(jSONObject2.getString("vendorKey"), new URL(jSONObject2.getString("url")), jSONObject2.getString("params")));
                        }
                        listI0 = CollectionsKt.i0(arrayList);
                    }
                    int iOptInt = jSONObject.optInt("skipOffset");
                    t9 t9Var = this.f14892e;
                    unit = Unit.f43263a;
                    if (t9Var != null) {
                        t9Var.a(listI0, Integer.valueOf(iOptInt));
                        unit2 = unit;
                    } else {
                        unit2 = null;
                    }
                    if (unit2 == null) {
                        za.a("Impression interface is missing in runOmResources", (Throwable) null, 2, (Object) null);
                    }
                } else {
                    unit = null;
                }
            } catch (Exception e2) {
                za.b("Invalid om resources command", e2);
                return;
            }
        } else {
            unit = null;
        }
        if (unit == null) {
            za.b("Invalid om resources command: missing json", (Throwable) null, 2, (Object) null);
        }
    }

    public final void g(JSONObject jSONObject) {
        Unit unit;
        double dOptDouble = 0.0d;
        if (jSONObject != null) {
            try {
                dOptDouble = jSONObject.optDouble("duration", 0.0d);
            } catch (Exception e2) {
                za.b("Invalid start command", e2);
                return;
            }
        }
        this.d = (float) dOptDouble;
        t9 t9Var = this.f14892e;
        if (t9Var != null) {
            t9Var.a(mi.START);
            unit = Unit.f43263a;
        } else {
            unit = null;
        }
        if (unit == null) {
            za.a("Impression interface is missing in runStart", (Throwable) null, 2, (Object) null);
        }
    }

    public final void h(JSONObject jSONObject) {
        Unit unit;
        boolean zOptBoolean = true;
        if (jSONObject != null) {
            try {
                zOptBoolean = jSONObject.optBoolean("allowOrientationChange", true);
            } catch (Exception unused) {
                za.b("Invalid set orientation command", (Throwable) null, 2, (Object) null);
                return;
            }
        }
        String str = "none";
        String strOptString = jSONObject != null ? jSONObject.optString("forceOrientation", "none") : null;
        if (strOptString != null) {
            str = strOptString;
        }
        t9 t9Var = this.f14892e;
        if (t9Var != null) {
            t9Var.a(zOptBoolean, str);
            unit = Unit.f43263a;
        } else {
            unit = null;
        }
        if (unit == null) {
            za.a("Impression interface is missing in setOrientation", (Throwable) null, 2, (Object) null);
        }
    }

    public final void a(JSONObject jSONObject) {
        float f2;
        Unit unit;
        if (jSONObject != null) {
            try {
                f2 = (float) jSONObject.getDouble("duration");
            } catch (Exception e2) {
                k(new JSONObject().put(PglCryptUtils.KEY_MESSAGE, "Parsing exception unknown field for current player duration: " + e2));
                return;
            }
        } else {
            f2 = 0.0f;
        }
        if (f2 > 0.0f) {
            float f3 = f2 * 1000;
            za.a("######### JS->Native Video current player duration: " + f3, (Throwable) null, 2, (Object) null);
            t9 t9Var = this.f14892e;
            if (t9Var != null) {
                t9Var.a(f3);
                t9Var.a(this.d, f3);
                unit = Unit.f43263a;
            } else {
                unit = null;
            }
            if (unit == null) {
                za.a("Impression interface is missing in currentVideoDuration", (Throwable) null, 2, (Object) null);
            }
        }
    }

    public final void d(JSONObject jSONObject) {
        String strOptString;
        if (nf.f14544a.d() && jSONObject != null && (strOptString = jSONObject.optString("msg")) != null && strOptString.equals("crash sdk")) {
            throw new RuntimeException("test crash");
        }
    }

    public final String b(JSONObject jSONObject, String str) {
        String string = jSONObject != null ? jSONObject.getString(PglCryptUtils.KEY_MESSAGE) : null;
        if (string == null) {
            string = "";
        }
        za.a(str + string, (Throwable) null, 2, (Object) null);
        return string;
    }

    public final void g() {
        Unit unit;
        j8 j8Var = this.f14891c;
        if (j8Var != null) {
            j8Var.onHideCustomView();
        }
        t9 t9Var = this.f14892e;
        if (t9Var != null) {
            t9Var.a(xd.IDLE);
            t9Var.l();
            unit = Unit.f43263a;
        } else {
            unit = null;
        }
        if (unit == null) {
            za.a("Impression interface is missing in videoCompleted", (Throwable) null, 2, (Object) null);
        }
    }

    public final void b() {
        Unit unit;
        try {
            t9 t9Var = this.f14892e;
            if (t9Var != null) {
                t9Var.a(mi.BUFFER_END);
                unit = Unit.f43263a;
            } else {
                unit = null;
            }
            if (unit == null) {
                za.a("Impression interface is missing in runBufferEnd", (Throwable) null, 2, (Object) null);
            }
        } catch (Exception e2) {
            za.b("Invalid buffer end command", e2);
        }
    }

    public final void e() {
        Unit unit;
        t9 t9Var = this.f14892e;
        if (t9Var != null) {
            t9Var.a(xd.PAUSED);
            t9Var.a(mi.PAUSE);
            unit = Unit.f43263a;
        } else {
            unit = null;
        }
        if (unit == null) {
            za.a("Impression interface is missing in runVideoResumedCommand", (Throwable) null, 2, (Object) null);
        }
    }

    public final void c() {
        Unit unit;
        try {
            t9 t9Var = this.f14892e;
            if (t9Var != null) {
                t9Var.a(mi.BUFFER_START);
                unit = Unit.f43263a;
            } else {
                unit = null;
            }
            if (unit == null) {
                za.a("Impression interface is missing in runBufferStart", (Throwable) null, 2, (Object) null);
            }
        } catch (Exception e2) {
            za.b("Invalid bufer start command", e2);
        }
    }

    public final String a(JSONObject jSONObject, String functionName) {
        Intrinsics.f(functionName, "functionName");
        rc rcVarA = rc.f15032c.a(functionName);
        if (rcVarA == null) {
            za.e("Native event unknown: ".concat(functionName), null, 2, null);
            return "Function name not recognized.";
        }
        za.a("TEMPLATE EVENT: " + rcVarA.c(), (Throwable) null, 2, (Object) null);
        return a(jSONObject, rcVarA);
    }

    public final void f() {
        Unit unit;
        t9 t9Var = this.f14892e;
        if (t9Var != null) {
            t9Var.a(mi.RESUME);
            t9Var.a(xd.PLAYING);
            unit = Unit.f43263a;
        } else {
            unit = null;
        }
        if (unit == null) {
            za.a("Impression interface is missing in runVideoResumedCommand", (Throwable) null, 2, (Object) null);
        }
    }

    public final void a(j8 j8Var) {
        this.f14891c = j8Var;
    }

    public final void a(t9 impressionInterface) {
        Intrinsics.f(impressionInterface, "impressionInterface");
        this.f14892e = impressionInterface;
    }

    public final String a(JSONObject jSONObject, rc rcVar) {
        String strJ;
        String strH;
        String strB;
        String strS;
        String strW;
        String strC;
        switch (a.f14893a[rcVar.ordinal()]) {
            case 1:
                za.a(android.support.v4.media.a.n("JavaScript to native ", rcVar.c(), " callback triggered."), (Throwable) null, 2, (Object) null);
                t9 t9Var = this.f14892e;
                return (t9Var == null || (strJ = t9Var.j()) == null) ? "" : strJ;
            case 2:
                za.a(android.support.v4.media.a.n("JavaScript to native ", rcVar.c(), " callback triggered."), (Throwable) null, 2, (Object) null);
                t9 t9Var2 = this.f14892e;
                return (t9Var2 == null || (strH = t9Var2.h()) == null) ? "" : strH;
            case 3:
                za.a(android.support.v4.media.a.n("JavaScript to native ", rcVar.c(), " callback triggered."), (Throwable) null, 2, (Object) null);
                t9 t9Var3 = this.f14892e;
                return (t9Var3 == null || (strB = t9Var3.B()) == null) ? "" : strB;
            case 4:
                za.a(android.support.v4.media.a.n("JavaScript to native ", rcVar.c(), " callback triggered."), (Throwable) null, 2, (Object) null);
                t9 t9Var4 = this.f14892e;
                return (t9Var4 == null || (strS = t9Var4.s()) == null) ? "" : strS;
            case 5:
                za.a(android.support.v4.media.a.n("JavaScript to native ", rcVar.c(), " callback triggered."), (Throwable) null, 2, (Object) null);
                t9 t9Var5 = this.f14892e;
                return (t9Var5 == null || (strW = t9Var5.w()) == null) ? "" : strW;
            case 6:
                za.a(android.support.v4.media.a.n("JavaScript to native ", rcVar.c(), " callback triggered."), (Throwable) null, 2, (Object) null);
                t9 t9Var6 = this.f14892e;
                return (t9Var6 == null || (strC = t9Var6.C()) == null) ? "" : strC;
            case 7:
                this.f14889a.a(new l(jSONObject));
                return "Native function successfully called.";
            case 8:
                this.f14889a.a(new v());
                return "Native function successfully called.";
            case 9:
                this.f14889a.a(new w());
                return "Native function successfully called.";
            case 10:
                this.f14889a.a(new x());
                return "Native function successfully called.";
            case 11:
                this.f14889a.a(new y());
                return "Native function successfully called.";
            case 12:
                this.f14889a.a(new z());
                return "Native function successfully called.";
            case 13:
                this.f14889a.a(a0.f14894b);
                return "Native function successfully called.";
            case 14:
                this.f14889a.a(new b0(jSONObject));
                return "Native function successfully called.";
            case 15:
                this.f14889a.a(new c0(jSONObject));
                return "Native function successfully called.";
            case 16:
                this.f14889a.a(new b());
                return "Native function successfully called.";
            case 17:
                this.f14889a.a(new c(jSONObject));
                return "Native function successfully called.";
            case 18:
                this.f14889a.a(new d(jSONObject));
                return "Native function successfully called.";
            case 19:
                this.f14889a.a(new e(jSONObject));
                return "Native function successfully called.";
            case 20:
                this.f14889a.a(new f(jSONObject));
                return "Native function successfully called.";
            case 21:
                this.f14889a.a(new g(jSONObject));
                return "Native function successfully called.";
            case 22:
                this.f14889a.a(new h(jSONObject));
                return "Native function successfully called.";
            case 23:
                this.f14889a.a(new i());
                return "Native function successfully called.";
            case 24:
                this.f14889a.a(new j());
                return "Native function successfully called.";
            case 25:
                this.f14889a.a(new k());
                return "Native function successfully called.";
            case 26:
                this.f14889a.a(new m());
                return "Native function successfully called.";
            case 27:
                this.f14889a.a(new n());
                return "Native function successfully called.";
            case 28:
                this.f14889a.a(new o());
                return "Native function successfully called.";
            case 29:
                this.f14889a.a(new p());
                return "Native function successfully called.";
            case 30:
                this.f14889a.a(new q(jSONObject));
                return "Native function successfully called.";
            case 31:
                this.f14889a.a(new r(jSONObject));
                return "Native function successfully called.";
            case 32:
                this.f14889a.a(new s());
                return "Native function successfully called.";
            case 33:
                this.f14889a.a(new t());
                return "Native function successfully called.";
            case 34:
                this.f14889a.a(new u());
                return "Native function successfully called.";
            default:
                return "Native function successfully called.";
        }
    }
}
