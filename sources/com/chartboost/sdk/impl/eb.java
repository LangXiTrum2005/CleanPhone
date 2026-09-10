package com.chartboost.sdk.impl;

import android.content.Context;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class eb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f13807a = MapsKt.j(new Pair(fi.TIMESTAMP, b.f13809b), new Pair(fi.CACHEBUSTING, c.f13810b), new Pair(fi.ERRORCODE, d.f13811b), new Pair(fi.REASON, e.f13812b), new Pair(fi.LIMITADTRACKING, f.f13813b), new Pair(fi.APPBUNDLE, g.f13814b), new Pair(fi.OMIDPARTNER, h.f13815b));

    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ bb f13808b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(bb bbVar) {
            super(1);
            this.f13808b = bbVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
        
            r0 = (java.lang.String) r0.invoke(r1);
         */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.CharSequence invoke(kotlin.text.MatchResult r4) {
            /*
                r3 = this;
                java.lang.String r0 = "match"
                kotlin.jvm.internal.Intrinsics.f(r4, r0)
                java.lang.String r4 = r4.getValue()
                com.chartboost.sdk.impl.fi$a r0 = com.chartboost.sdk.impl.fi.f13952c
                com.chartboost.sdk.impl.fi r0 = r0.a(r4)
                if (r0 == 0) goto L3e
                com.chartboost.sdk.impl.bb r1 = r3.f13808b
                java.util.Map r2 = com.chartboost.sdk.impl.eb.a()
                java.lang.Object r0 = r2.get(r0)
                kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
                if (r0 == 0) goto L39
                java.lang.Object r0 = r0.invoke(r1)
                java.lang.String r0 = (java.lang.String) r0
                if (r0 == 0) goto L39
                java.lang.String r1 = "UTF-8"
                java.lang.String r0 = java.net.URLEncoder.encode(r0, r1)     // Catch: java.io.UnsupportedEncodingException -> L2e
                goto L3a
            L2e:
                r1 = move-exception
                java.lang.String r2 = "Failed to encode macro value: "
                java.lang.String r2 = r2.concat(r0)
                com.chartboost.sdk.impl.za.b(r2, r1)
                goto L3a
            L39:
                r0 = 0
            L3a:
                if (r0 != 0) goto L3d
                goto L3e
            L3d:
                r4 = r0
            L3e:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.eb.a.invoke(kotlin.text.MatchResult):java.lang.CharSequence");
        }
    }

    public static final class b extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f13809b = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(bb context) {
            Intrinsics.f(context, "context");
            return eb.a(context.c());
        }
    }

    public static final class c extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f13810b = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(bb context) {
            Intrinsics.f(context, "context");
            return StringsKt.A(8, String.valueOf(context.b()));
        }
    }

    public static final class d extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f13811b = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(bb context) {
            Intrinsics.f(context, "context");
            Integer numD = context.d();
            return String.valueOf(numD != null ? numD.intValue() : -1);
        }
    }

    public static final class e extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f13812b = new e();

        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(bb context) {
            Intrinsics.f(context, "context");
            Integer numG = context.g();
            return String.valueOf(numG != null ? numG.intValue() : -1);
        }
    }

    public static final class f extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f13813b = new f();

        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(bb context) {
            Intrinsics.f(context, "context");
            return String.valueOf(context.e());
        }
    }

    public static final class g extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final g f13814b = new g();

        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(bb context) {
            Intrinsics.f(context, "context");
            return context.a();
        }
    }

    public static final class h extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final h f13815b = new h();

        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(bb context) {
            Intrinsics.f(context, "context");
            return context.f();
        }
    }

    public static final String a(String str, bb context) {
        Intrinsics.f(str, "<this>");
        Intrinsics.f(context, "context");
        return new Regex("\\[[A-Z0-9]+]").d(str, new a(context));
    }

    public static final String a(long j) {
        String str = Instant.ofEpochMilli(j).atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSXXX"));
        Intrinsics.e(str, "format(...)");
        return str;
    }

    public static final bb a(Context context, id openMeasurementManager, p2 identity, Function1 block) {
        Intrinsics.f(context, "context");
        Intrinsics.f(openMeasurementManager, "openMeasurementManager");
        Intrinsics.f(identity, "identity");
        Intrinsics.f(block, "block");
        cb cbVar = new cb(context, openMeasurementManager, identity);
        block.invoke(cbVar);
        return cbVar.a();
    }
}
