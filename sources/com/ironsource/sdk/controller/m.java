package com.ironsource.sdk.controller;

import com.ironsource.C0514p8;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface m {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f30425a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f30426b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f30427c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f30428d;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(String funToCall) {
            this(funToCall, null, null, null, 14, null);
            kotlin.jvm.internal.n.f(funToCall, "funToCall");
        }

        @Override // com.ironsource.sdk.controller.m
        public String a() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SSA_CORE.SDKController.runFunction('" + this.f30425a);
            String str = this.f30426b;
            if (str != null && str.length() != 0) {
                sb2.append("?parameters=" + this.f30426b);
            }
            String str2 = this.f30427c;
            if (str2 != null && str2.length() != 0) {
                sb2.append("','" + this.f30427c);
            }
            String str3 = this.f30428d;
            if (str3 != null && str3.length() != 0) {
                sb2.append("','" + this.f30428d);
            }
            sb2.append("');");
            String string = sb2.toString();
            kotlin.jvm.internal.n.e(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(String funToCall, String str) {
            this(funToCall, str, null, null, 12, null);
            kotlin.jvm.internal.n.f(funToCall, "funToCall");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(String funToCall, String str, String str2) {
            this(funToCall, str, str2, null, 8, null);
            kotlin.jvm.internal.n.f(funToCall, "funToCall");
        }

        public a(String funToCall, String str, String str2, String str3) {
            kotlin.jvm.internal.n.f(funToCall, "funToCall");
            this.f30425a = funToCall;
            this.f30426b = str;
            this.f30427c = str2;
            this.f30428d = str3;
        }

        public /* synthetic */ a(String str, String str2, String str3, String str4, int i10, kotlin.jvm.internal.g gVar) {
            this(str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f30429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f30430b;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(m jsMethod, int i10) {
            this(jsMethod.a(), i10);
            kotlin.jvm.internal.n.f(jsMethod, "jsMethod");
        }

        @Override // com.ironsource.sdk.controller.m
        public String a() {
            String str = "console.log(\"JS exception: \" + JSON.stringify(e));";
            if (this.f30429a != C0514p8.d.MODE_0.b() && (this.f30429a < C0514p8.d.MODE_1.b() || this.f30429a > C0514p8.d.MODE_3.b())) {
                str = "empty";
            }
            String strH = d5.u.h(new StringBuilder("try{"), this.f30430b, "}catch(e){", str, "}");
            kotlin.jvm.internal.n.e(strH, "StringBuilder()\n        …}\")\n          .toString()");
            return strH;
        }

        public b(String script, int i10) {
            kotlin.jvm.internal.n.f(script, "script");
            this.f30430b = script;
            this.f30429a = i10;
        }
    }

    String a();
}
