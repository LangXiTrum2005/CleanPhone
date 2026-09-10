package com.thinkup.core.common.n0.o;

import com.applovin.impl.Z;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public final class mm {
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f41955n;
    public mo o;
    public Throwable o0;
    public Map<String, List<String>> om;
    public mn oo;

    public static class o {
        private int m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f41956n;
        private mo o;
        private Throwable o0;
        private Map<String, List<String>> om;
        private mn oo;

        public final o o(mo moVar) {
            this.o = moVar;
            return this;
        }

        public final o o(int i2) {
            this.m = i2;
            return this;
        }

        public final o o(String str) {
            this.f41956n = str;
            return this;
        }

        public final o o(Throwable th) {
            this.o0 = th;
            return this;
        }

        public final o o(mn mnVar) {
            this.oo = mnVar;
            return this;
        }

        public final o o(Map<String, List<String>> map) {
            this.om = map;
            return this;
        }

        public final mm o() {
            mm mmVar = new mm((byte) 0);
            mmVar.o = this.o;
            mmVar.m = this.m;
            mmVar.f41955n = this.f41956n;
            mmVar.o0 = this.o0;
            mmVar.oo = this.oo;
            mmVar.om = this.om;
            return mmVar;
        }
    }

    public /* synthetic */ mm(byte b2) {
        this();
    }

    private boolean o() {
        int i2 = this.m;
        return i2 == 200 || i2 == 201 || i2 == 204;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetBridgeResponse{request=");
        sb.append(this.o);
        sb.append(", code=");
        sb.append(this.m);
        sb.append(", errorMsg='");
        sb.append(this.f41955n);
        sb.append("', exception=");
        sb.append(this.o0);
        sb.append(", responseBody=");
        sb.append(this.oo);
        sb.append(", responseHeader=");
        return Z.o(sb, this.om, AbstractJsonLexerKt.END_OBJ);
    }

    private mm() {
    }
}
