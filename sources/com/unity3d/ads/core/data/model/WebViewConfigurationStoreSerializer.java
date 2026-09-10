package com.unity3d.ads.core.data.model;

import ak.f;
import com.google.protobuf.InvalidProtocolBufferException;
import com.unity3d.ads.datastore.WebviewConfigurationStore;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import s0.a1;
import s0.b;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/data/model/WebViewConfigurationStoreSerializer;", "Ls0/a1;", "Lcom/unity3d/ads/datastore/WebviewConfigurationStore$WebViewConfigurationStore;", "<init>", "()V", "Ljava/io/InputStream;", "input", "readFrom", "(Ljava/io/InputStream;Lak/f;)Ljava/lang/Object;", "t", "Ljava/io/OutputStream;", "output", "Lwj/r;", "writeTo", "(Lcom/unity3d/ads/datastore/WebviewConfigurationStore$WebViewConfigurationStore;Ljava/io/OutputStream;Lak/f;)Ljava/lang/Object;", "defaultValue", "Lcom/unity3d/ads/datastore/WebviewConfigurationStore$WebViewConfigurationStore;", "getDefaultValue", "()Lcom/unity3d/ads/datastore/WebviewConfigurationStore$WebViewConfigurationStore;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class WebViewConfigurationStoreSerializer implements a1 {
    private final WebviewConfigurationStore.WebViewConfigurationStore defaultValue;

    public WebViewConfigurationStoreSerializer() {
        WebviewConfigurationStore.WebViewConfigurationStore defaultInstance = WebviewConfigurationStore.WebViewConfigurationStore.getDefaultInstance();
        n.e(defaultInstance, "getDefaultInstance()");
        this.defaultValue = defaultInstance;
    }

    @Override // s0.a1
    public Object readFrom(InputStream inputStream, f fVar) throws IOException {
        try {
            WebviewConfigurationStore.WebViewConfigurationStore from = WebviewConfigurationStore.WebViewConfigurationStore.parseFrom(inputStream);
            n.e(from, "parseFrom(input)");
            return from;
        } catch (InvalidProtocolBufferException e10) {
            throw new b("Cannot read proto.", e10);
        }
    }

    @Override // s0.a1
    public WebviewConfigurationStore.WebViewConfigurationStore getDefaultValue() {
        return this.defaultValue;
    }

    @Override // s0.a1
    public Object writeTo(WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, OutputStream outputStream, f fVar) throws IOException {
        webViewConfigurationStore.writeTo(outputStream);
        return r.f53297a;
    }
}
