package com.applovin.shadow.okhttp3.internal.ws;

import an.h;
import an.o;
import an.p;
import com.applovin.shadow.okhttp3.Headers;
import com.applovin.shadow.okhttp3.internal.Util;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.ironsource.B5;
import defpackage.e;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\b\u0018\u0000 #2\u00020\u0001:\u0001#BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0010J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0010J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJP\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010!R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010!¨\u0006$"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/ws/WebSocketExtensions;", "", "", "perMessageDeflate", "", "clientMaxWindowBits", "clientNoContextTakeover", "serverMaxWindowBits", "serverNoContextTakeover", "unknownValues", "<init>", "(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)V", "clientOriginated", "noContextTakeover", "(Z)Z", "component1", "()Z", "component2", "()Ljava/lang/Integer;", "component3", "component4", "component5", "component6", "", InAppPurchaseConstants.METHOD_TO_STRING, "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "copy", "(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)Ljava/lang/Object;", "Z", "Ljava/lang/Integer;", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final /* data */ class WebSocketExtensions {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String HEADER_WEB_SOCKET_EXTENSION = "Sec-WebSocket-Extensions";
    public final Integer clientMaxWindowBits;
    public final boolean clientNoContextTakeover;
    public final boolean perMessageDeflate;
    public final Integer serverMaxWindowBits;
    public final boolean serverNoContextTakeover;
    public final boolean unknownValues;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/ws/WebSocketExtensions$Companion;", "", "()V", "HEADER_WEB_SOCKET_EXTENSION", "", "parse", "Lcom/applovin/shadow/okhttp3/internal/ws/WebSocketExtensions;", "responseHeaders", "Lcom/applovin/shadow/okhttp3/Headers;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:37:0x00bd A[PHI: r7 r9 r11
  0x00bd: PHI (r7v5 java.lang.Integer) = (r7v4 java.lang.Integer), (r7v9 java.lang.Integer) binds: [B:52:0x00e8, B:34:0x00b4] A[DONT_GENERATE, DONT_INLINE]
  0x00bd: PHI (r9v8 java.lang.Integer) = (r9v6 java.lang.Integer), (r9v4 java.lang.Integer) binds: [B:52:0x00e8, B:34:0x00b4] A[DONT_GENERATE, DONT_INLINE]
  0x00bd: PHI (r11v16 boolean) = (r11v10 boolean), (r11v19 boolean) binds: [B:52:0x00e8, B:34:0x00b4] A[DONT_GENERATE, DONT_INLINE]] */
        public final WebSocketExtensions parse(Headers responseHeaders) throws IOException {
            boolean z10;
            String strTrimSubstring;
            n.f(responseHeaders, "responseHeaders");
            int size = responseHeaders.size();
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            Integer numE0 = null;
            Integer numE1 = null;
            for (int i10 = 0; i10 < size; i10++) {
                if (p.i0(responseHeaders.name(i10), WebSocketExtensions.HEADER_WEB_SOCKET_EXTENSION)) {
                    String strValue = responseHeaders.value(i10);
                    int i11 = 0;
                    while (i11 < strValue.length()) {
                        int iDelimiterOffset$default = Util.delimiterOffset$default(strValue, ',', i11, 0, 4, (Object) null);
                        char c4 = ';';
                        int iDelimiterOffset = Util.delimiterOffset(strValue, ';', i11, iDelimiterOffset$default);
                        String strTrimSubstring2 = Util.trimSubstring(strValue, i11, iDelimiterOffset);
                        int i12 = iDelimiterOffset + 1;
                        boolean z15 = true;
                        if (p.i0(strTrimSubstring2, "permessage-deflate")) {
                            if (z11) {
                                z14 = true;
                            }
                            i11 = i12;
                            while (i11 < iDelimiterOffset$default) {
                                int iDelimiterOffset2 = Util.delimiterOffset(strValue, c4, i11, iDelimiterOffset$default);
                                int iDelimiterOffset3 = Util.delimiterOffset(strValue, B5.U, i11, iDelimiterOffset2);
                                String strTrimSubstring3 = Util.trimSubstring(strValue, i11, iDelimiterOffset3);
                                if (iDelimiterOffset3 < iDelimiterOffset2) {
                                    strTrimSubstring = Util.trimSubstring(strValue, iDelimiterOffset3 + 1, iDelimiterOffset2);
                                    n.f(strTrimSubstring, "<this>");
                                    if (strTrimSubstring.length() >= 2 && h.L0(strTrimSubstring, "\"") && p.h0(strTrimSubstring, "\"", false)) {
                                        z10 = z15;
                                        strTrimSubstring = strTrimSubstring.substring(z10 ? 1 : 0, strTrimSubstring.length() - 1);
                                        n.e(strTrimSubstring, "substring(...)");
                                    } else {
                                        z10 = z15;
                                    }
                                } else {
                                    z10 = z15;
                                    strTrimSubstring = null;
                                }
                                i11 = iDelimiterOffset2 + 1;
                                if (p.i0(strTrimSubstring3, "client_max_window_bits")) {
                                    if (numE0 != null) {
                                        z14 = z10;
                                    }
                                    numE0 = strTrimSubstring != null ? o.e0(strTrimSubstring) : null;
                                    if (numE0 == null) {
                                        z14 = z10;
                                        z15 = z14 ? 1 : 0;
                                    } else {
                                        z15 = z10;
                                    }
                                } else if (p.i0(strTrimSubstring3, "client_no_context_takeover")) {
                                    if (z12) {
                                        z14 = z10;
                                    }
                                    if (strTrimSubstring != null) {
                                        z14 = z10;
                                    }
                                    z12 = z10;
                                    z15 = z12 ? 1 : 0;
                                } else {
                                    if (p.i0(strTrimSubstring3, "server_max_window_bits")) {
                                        if (numE1 != null) {
                                            z14 = z10;
                                        }
                                        numE1 = strTrimSubstring != null ? o.e0(strTrimSubstring) : null;
                                        if (numE1 != null) {
                                            z15 = z10;
                                        }
                                    } else if (p.i0(strTrimSubstring3, "server_no_context_takeover")) {
                                        if (z13) {
                                            z14 = z10;
                                        }
                                        if (strTrimSubstring != null) {
                                            z14 = z10;
                                        }
                                        z13 = z10;
                                        z15 = z13 ? 1 : 0;
                                    }
                                    z14 = z10;
                                    z15 = z14 ? 1 : 0;
                                }
                                c4 = ';';
                            }
                            z11 = z15 ? 1 : 0;
                        } else {
                            i11 = i12;
                            z14 = true;
                        }
                    }
                }
            }
            return new WebSocketExtensions(z11, numE0, z12, numE1, z13, z14);
        }

        private Companion() {
        }
    }

    public WebSocketExtensions() {
        this(false, null, false, null, false, false, 63, null);
    }

    public static /* synthetic */ WebSocketExtensions copy$default(WebSocketExtensions webSocketExtensions, boolean z10, Integer num, boolean z11, Integer num2, boolean z12, boolean z13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = webSocketExtensions.perMessageDeflate;
        }
        if ((i10 & 2) != 0) {
            num = webSocketExtensions.clientMaxWindowBits;
        }
        if ((i10 & 4) != 0) {
            z11 = webSocketExtensions.clientNoContextTakeover;
        }
        if ((i10 & 8) != 0) {
            num2 = webSocketExtensions.serverMaxWindowBits;
        }
        if ((i10 & 16) != 0) {
            z12 = webSocketExtensions.serverNoContextTakeover;
        }
        if ((i10 & 32) != 0) {
            z13 = webSocketExtensions.unknownValues;
        }
        boolean z14 = z12;
        boolean z15 = z13;
        return webSocketExtensions.copy(z10, num, z11, num2, z14, z15);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getPerMessageDeflate() {
        return this.perMessageDeflate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getClientMaxWindowBits() {
        return this.clientMaxWindowBits;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getClientNoContextTakeover() {
        return this.clientNoContextTakeover;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getServerMaxWindowBits() {
        return this.serverMaxWindowBits;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getServerNoContextTakeover() {
        return this.serverNoContextTakeover;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getUnknownValues() {
        return this.unknownValues;
    }

    public final WebSocketExtensions copy(boolean z10, Integer num, boolean z11, Integer num2, boolean z12, boolean z13) {
        return new WebSocketExtensions(z10, num, z11, num2, z12, z13);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebSocketExtensions)) {
            return false;
        }
        WebSocketExtensions webSocketExtensions = (WebSocketExtensions) other;
        return this.perMessageDeflate == webSocketExtensions.perMessageDeflate && n.a(this.clientMaxWindowBits, webSocketExtensions.clientMaxWindowBits) && this.clientNoContextTakeover == webSocketExtensions.clientNoContextTakeover && n.a(this.serverMaxWindowBits, webSocketExtensions.serverMaxWindowBits) && this.serverNoContextTakeover == webSocketExtensions.serverNoContextTakeover && this.unknownValues == webSocketExtensions.unknownValues;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public int hashCode() {
        boolean z10 = this.perMessageDeflate;
        ?? r0 = z10;
        if (z10) {
            r0 = 1;
        }
        int i10 = r0 * 31;
        Integer num = this.clientMaxWindowBits;
        int iHashCode = (i10 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z11 = this.clientNoContextTakeover;
        ?? r2 = z11;
        if (z11) {
            r2 = 1;
        }
        int i11 = (iHashCode + r2) * 31;
        Integer num2 = this.serverMaxWindowBits;
        int iHashCode2 = (i11 + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z12 = this.serverNoContextTakeover;
        ?? r3 = z12;
        if (z12) {
            r3 = 1;
        }
        int i12 = (iHashCode2 + r3) * 31;
        boolean z13 = this.unknownValues;
        return i12 + (z13 ? 1 : z13);
    }

    public final boolean noContextTakeover(boolean clientOriginated) {
        return clientOriginated ? this.clientNoContextTakeover : this.serverNoContextTakeover;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("WebSocketExtensions(perMessageDeflate=");
        sb2.append(this.perMessageDeflate);
        sb2.append(", clientMaxWindowBits=");
        sb2.append(this.clientMaxWindowBits);
        sb2.append(", clientNoContextTakeover=");
        sb2.append(this.clientNoContextTakeover);
        sb2.append(", serverMaxWindowBits=");
        sb2.append(this.serverMaxWindowBits);
        sb2.append(", serverNoContextTakeover=");
        sb2.append(this.serverNoContextTakeover);
        sb2.append(", unknownValues=");
        return e.t(sb2, this.unknownValues, ')');
    }

    public WebSocketExtensions(boolean z10, Integer num, boolean z11, Integer num2, boolean z12, boolean z13) {
        this.perMessageDeflate = z10;
        this.clientMaxWindowBits = num;
        this.clientNoContextTakeover = z11;
        this.serverMaxWindowBits = num2;
        this.serverNoContextTakeover = z12;
        this.unknownValues = z13;
    }

    public /* synthetic */ WebSocketExtensions(boolean z10, Integer num, boolean z11, Integer num2, boolean z12, boolean z13, int i10, g gVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? null : num2, (i10 & 16) != 0 ? false : z12, (i10 & 32) != 0 ? false : z13);
    }
}
