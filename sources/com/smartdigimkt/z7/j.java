package com.smartdigimkt.z7;

import com.applovin.impl.Z;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f40409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f40410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f40411c;
    public Throwable d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k f40412e;
    public Map<String, List<String>> f;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private i f40413a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f40414b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f40415c;
        private Throwable d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private k f40416e;
        private Map<String, List<String>> f;

        public b a(i iVar) {
            this.f40413a = iVar;
            return this;
        }

        public b a(int i2) {
            this.f40414b = i2;
            return this;
        }

        public b a(String str) {
            this.f40415c = str;
            return this;
        }

        public b a(Throwable th) {
            this.d = th;
            return this;
        }

        public b a(k kVar) {
            this.f40416e = kVar;
            return this;
        }

        public b a(Map<String, List<String>> map) {
            this.f = map;
            return this;
        }

        public j a() {
            j jVar = new j();
            jVar.f40409a = this.f40413a;
            jVar.f40410b = this.f40414b;
            jVar.f40411c = this.f40415c;
            jVar.d = this.d;
            jVar.f40412e = this.f40416e;
            jVar.f = this.f;
            return jVar;
        }
    }

    public boolean a() {
        int i2 = this.f40410b;
        return i2 == 200 || i2 == 201 || i2 == 204;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NetBridgeResponse{request=");
        sb.append(this.f40409a);
        sb.append(", code=");
        sb.append(this.f40410b);
        sb.append(", errorMsg='");
        sb.append(this.f40411c);
        sb.append("', exception=");
        sb.append(this.d);
        sb.append(", responseBody=");
        sb.append(this.f40412e);
        sb.append(", responseHeader=");
        return Z.o(sb, this.f, AbstractJsonLexerKt.END_OBJ);
    }

    private j() {
    }
}
