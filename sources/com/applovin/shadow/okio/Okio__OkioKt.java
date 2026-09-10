package com.applovin.shadow.okio;

import com.google.android.gms.ads.RequestConfiguration;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.Closeable;
import jk.b;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import qk.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006\u001a\u000f\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001aC\u0010\u0010\u001a\u00028\u0001\"\u0010\b\u0000\u0010\f*\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\"\u0004\b\u0001\u0010\r*\u00028\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"Lcom/applovin/shadow/okio/Source;", "Lcom/applovin/shadow/okio/BufferedSource;", "buffer", "(Lcom/applovin/shadow/okio/Source;)Lcom/applovin/shadow/okio/BufferedSource;", "Lcom/applovin/shadow/okio/Sink;", "Lcom/applovin/shadow/okio/BufferedSink;", "(Lcom/applovin/shadow/okio/Sink;)Lcom/applovin/shadow/okio/BufferedSink;", "blackhole", "()Lcom/applovin/shadow/okio/Sink;", "blackholeSink", "Ljava/io/Closeable;", "Lcom/applovin/shadow/okio/Closeable;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", "Lkotlin/Function1;", "block", "use", "(Ljava/io/Closeable;Ljk/b;)Ljava/lang/Object;", "com.applovin.shadow.okio"}, k = 5, mv = {1, 9, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE, xs = "com/applovin/shadow/okio/Okio")
final /* synthetic */ class Okio__OkioKt {
    public static final Sink blackhole() {
        return new BlackholeSink();
    }

    public static final BufferedSource buffer(Source source) {
        n.f(source, "<this>");
        return new RealBufferedSource(source);
    }

    public static final <T extends Closeable, R> R use(T t10, b block) throws Throwable {
        R r2;
        n.f(block, "block");
        Throwable th2 = null;
        try {
            r2 = (R) block.invoke(t10);
            if (t10 != null) {
                try {
                    t10.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
        } catch (Throwable th4) {
            if (t10 != null) {
                try {
                    t10.close();
                } catch (Throwable th5) {
                    i0.c(th4, th5);
                }
            }
            th2 = th4;
            r2 = null;
        }
        if (th2 != null) {
            throw th2;
        }
        n.c(r2);
        return r2;
    }

    public static final BufferedSink buffer(Sink sink) {
        n.f(sink, "<this>");
        return new RealBufferedSink(sink);
    }
}
