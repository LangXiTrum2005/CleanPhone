package com.chartboost.sdk.impl;

import android.text.TextUtils;
import java.net.URL;
import java.security.InvalidParameterException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class sj {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f15149e = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final URL f15151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15152c;
    public final String d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f15153a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f15154b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f15155c;
        public String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f15156e;

        public a(String javascriptResourceUrl) {
            Intrinsics.f(javascriptResourceUrl, "javascriptResourceUrl");
            this.f15153a = javascriptResourceUrl;
            this.f15154b = "omid";
        }

        public final a a(String str) {
            this.f15154b = str;
            return this;
        }

        public final String b() {
            return this.f15154b;
        }

        public final String c() {
            return this.f15153a;
        }

        public final String d() {
            return this.f15155c;
        }

        public final String e() {
            return this.f15156e;
        }

        public final String f() {
            return this.d;
        }

        public final sj a() {
            try {
                return new sj(this);
            } catch (Exception unused) {
                return null;
            }
        }

        public final a b(String str) {
            this.f15155c = str;
            return this;
        }

        public final a c(String str) {
            this.d = str;
            return this;
        }
    }

    public static final class b {
        public b() {
        }

        public final sj a(q0 adVerification) {
            String strB;
            Intrinsics.f(adVerification, "adVerification");
            ra raVarA = adVerification.a();
            if (raVarA == null || (strB = raVarA.b()) == null) {
                return null;
            }
            a aVar = new a(strB);
            String strA = raVarA.a();
            if (strA == null) {
                strA = "";
            }
            a aVarA = aVar.a(strA);
            String strB2 = adVerification.b();
            aVarA.b(strB2 != null ? strB2 : "").c(adVerification.c());
            return aVar.a();
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set a(List adVerifications) {
            Intrinsics.f(adVerifications, "adVerifications");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = adVerifications.iterator();
            while (it.hasNext()) {
                sj sjVarA = sj.f15149e.a((q0) it.next());
                if (sjVarA != null) {
                    linkedHashSet.add(sjVarA);
                }
            }
            return linkedHashSet;
        }
    }

    public sj(a builder) {
        Intrinsics.f(builder, "builder");
        if (!"omid".equalsIgnoreCase(builder.b()) || TextUtils.isEmpty(builder.c())) {
            throw new InvalidParameterException("ViewabilityVendor cannot be created.");
        }
        this.f15150a = builder.d();
        this.f15151b = new URL(builder.c());
        this.f15152c = builder.f();
        this.d = builder.e();
    }

    public final URL a() {
        return this.f15151b;
    }

    public final String b() {
        return this.f15150a;
    }

    public final String c() {
        return this.f15152c;
    }
}
