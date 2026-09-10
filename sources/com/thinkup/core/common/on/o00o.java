package com.thinkup.core.common.on;

import androidx.media3.extractor.text.ttml.a;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public final class o00o {
    public String m;
    public ConcurrentHashMap<String, o> m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f42227n;
    public int o;
    public int o0;
    public String om;
    public String on;
    public long oo;

    public static class o {
        public String m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public String f42228n;
        public String o;
        public int o0;
        public long om;
        public int oo;

        public final String toString() {
            StringBuilder sb = new StringBuilder("AdSourceImpressionInfo{unitId='");
            sb.append(this.o);
            sb.append("', hourTimeFormat='");
            sb.append(this.m);
            sb.append("', dateTimeFormat='");
            sb.append(this.f42228n);
            sb.append("', dayShowCount=");
            sb.append(this.o0);
            sb.append(", hourShowCount=");
            sb.append(this.oo);
            sb.append(", showTime=");
            return a.o(sb, this.om, AbstractJsonLexerKt.END_OBJ);
        }
    }

    public final o o(String str) {
        ConcurrentHashMap<String, o> concurrentHashMap = this.m0;
        if (concurrentHashMap != null) {
            return concurrentHashMap.get(str);
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlacementImpressionInfo{format=");
        sb.append(this.o);
        sb.append(", placementId='");
        sb.append(this.m);
        sb.append("', dayShowCount=");
        sb.append(this.f42227n);
        sb.append(", hourShowCount=");
        sb.append(this.o0);
        sb.append(", showTime=");
        sb.append(this.oo);
        sb.append(", hourTimeFormat='");
        sb.append(this.om);
        sb.append("', dateTimeFormat='");
        return android.support.v4.media.a.r(sb, this.on, "'}");
    }

    private synchronized void o(String str, o oVar) {
        try {
            if (this.m0 == null) {
                this.m0 = new ConcurrentHashMap<>(3);
            }
            this.m0.put(str, oVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
