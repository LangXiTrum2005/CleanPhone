package com.chartboost.sdk.impl;

import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.TransformingSequence;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class g2 {
    public static final a f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b2 f13978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f13979c;
    public final AtomicReference d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final id f13980e;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class b extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ JSONObject f13981b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(JSONObject jSONObject) {
            super(1);
            this.f13981b = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pair invoke(String str) {
            return new Pair(str, this.f13981b.get(str));
        }
    }

    public g2(Context context, b2 base64Wrapper, p2 identity, AtomicReference sdkConfiguration, id openMeasurementManager) {
        Intrinsics.f(context, "context");
        Intrinsics.f(base64Wrapper, "base64Wrapper");
        Intrinsics.f(identity, "identity");
        Intrinsics.f(sdkConfiguration, "sdkConfiguration");
        Intrinsics.f(openMeasurementManager, "openMeasurementManager");
        this.f13977a = context;
        this.f13978b = base64Wrapper;
        this.f13979c = identity;
        this.d = sdkConfiguration;
        this.f13980e = openMeasurementManager;
    }

    public final String a() throws JSONException {
        List listI = CollectionsKt.I(new z8(this.f13979c), new cd(this.d, this.f13980e), new b6(this.f13977a, this.f13979c, y5.d.a()), new b5());
        Map mapJ = MapsKt.j(new Pair("package", this.f13977a.getPackageName()), new Pair("token_version", "1.1"), new Pair("android_api_level", Integer.valueOf(Build.VERSION.SDK_INT)));
        ArrayList arrayList = new ArrayList();
        Iterator it = listI.iterator();
        while (it.hasNext()) {
            JSONObject jSONObjectA = ((tg) it.next()).a();
            Iterator<String> itKeys = jSONObjectA.keys();
            Intrinsics.e(itKeys, "keys(...)");
            TransformingSequence.AnonymousClass1 anonymousClass1 = new TransformingSequence.AnonymousClass1();
            while (anonymousClass1.X.hasNext()) {
                arrayList.add(anonymousClass1.next());
            }
        }
        TreeMap treeMap = new TreeMap(MapsKt.n(mapJ, arrayList));
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : treeMap.entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        b2 b2Var = this.f13978b;
        String string = jSONObject.toString();
        Intrinsics.e(string, "toString(...)");
        return b2Var.c(string);
    }
}
