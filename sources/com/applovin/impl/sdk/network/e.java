package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.l;
import com.applovin.impl.w4;
import com.applovin.impl.z4;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class e extends com.applovin.impl.sdk.network.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f9660s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f9661t;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class a extends com.applovin.impl.sdk.network.a.C0018a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private String f9662r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f9663s;

        public a(l lVar) {
            super(lVar);
            this.f9612h = ((Integer) lVar.a(z4.L2)).intValue();
            this.f9613i = ((Integer) lVar.a(z4.K2)).intValue();
            this.f9614j = ((Integer) lVar.a(z4.X2)).intValue();
        }

        @Override // com.applovin.impl.sdk.network.a.C0018a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a(String str) {
            this.f9607c = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0018a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a b(int i10) {
            this.f9614j = i10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0018a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public a b(String str) {
            this.f9606b = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0018a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public a c(String str) {
            this.f9605a = str;
            return this;
        }

        public a h(boolean z10) {
            this.f9663s = z10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0018a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public a b(boolean z10) {
            this.f9619p = z10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0018a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a b(Map map) {
            this.f9608d = map;
            return this;
        }

        public a e(String str) {
            this.f9662r = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0018a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public a c(int i10) {
            this.f9613i = i10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0018a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public a a(boolean z10) {
            this.f9617n = z10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0018a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a a(Map map) {
            this.f9609e = map;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0018a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a(int i10) {
            this.f9612h = i10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0018a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(JSONObject jSONObject) {
            this.f9610f = jSONObject;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0018a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(Object obj) {
            this.f9611g = obj;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0018a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(w4.a aVar) {
            this.f9620q = aVar;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0018a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e a() {
            return new e(this);
        }
    }

    public e(a aVar) {
        super(aVar);
        this.f9660s = aVar.f9662r;
        this.f9661t = aVar.f9663s;
    }

    public static a b(l lVar) {
        return new a(lVar);
    }

    public String s() {
        return this.f9660s;
    }

    public boolean t() {
        return this.f9660s != null;
    }

    public boolean u() {
        return this.f9661t;
    }
}
