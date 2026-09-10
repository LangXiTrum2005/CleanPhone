package com.unity3d.ads.core.data.datasource;

import ak.f;
import an.h;
import android.os.Bundle;
import ck.e;
import ck.i;
import cn.a0;
import cn.d0;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.B5;
import com.ironsource.X3;
import com.unity3d.ads.core.data.model.AdRevenueData;
import com.unity3d.ads.core.data.model.AdRevenueOrigin;
import com.unity3d.ads.core.domain.events.HandleAdRevenueEvent;
import com.unity3d.ads.core.log.Logger;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Set;
import jk.b;
import jk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import wi.d;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u000f*\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001e¨\u0006 "}, d2 = {"Lcom/unity3d/ads/core/data/datasource/MaxAdRevenueListener;", "", "Lcom/unity3d/ads/core/domain/events/HandleAdRevenueEvent;", "handleAdRevenueEvent", "Lcn/a0;", "scope", "Lcom/unity3d/ads/core/log/Logger;", "logger", "<init>", "(Lcom/unity3d/ads/core/domain/events/HandleAdRevenueEvent;Lcn/a0;Lcom/unity3d/ads/core/log/Logger;)V", "Landroid/os/Bundle;", "bundle", "Lcom/unity3d/ads/core/data/model/AdRevenueData;", "parseRevenueBundle", "(Landroid/os/Bundle;)Lcom/unity3d/ads/core/data/model/AdRevenueData;", "", "bundleToTraceString", "(Landroid/os/Bundle;)Ljava/lang/String;", "validateString", "(Ljava/lang/String;)Ljava/lang/String;", "formatStr", "Lcom/unity3d/ads/core/data/model/AdRevenueAdFormat;", "parseMaxAdFormatString", "(Ljava/lang/String;)Lcom/unity3d/ads/core/data/model/AdRevenueAdFormat;", "messageData", "Lwj/r;", "onMessageReceived", "(Landroid/os/Bundle;)V", "Lcom/unity3d/ads/core/domain/events/HandleAdRevenueEvent;", "Lcn/a0;", "Lcom/unity3d/ads/core/log/Logger;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class MaxAdRevenueListener {
    private static final String KEY_AD_FORMAT = "ad_format";
    private static final String KEY_COUNTRY_CODE = "country_code";
    private static final String KEY_MAX_AD_UNIT_ID = "max_ad_unit_id";
    private static final String KEY_NETWORK_NAME = "network_name";
    private static final String KEY_REVENUE = "revenue";
    private static final String KEY_THIRD_PARTY_AD_PLACEMENT_ID = "third_party_ad_placement_id";
    private static final int MAX_STRING_LENGTH = 500;
    private final HandleAdRevenueEvent handleAdRevenueEvent;
    private final Logger logger;
    private final a0 scope;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.MaxAdRevenueListener$bundleToTraceString$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", X3.i.W, "", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class AnonymousClass1 extends o implements b {
        final /* synthetic */ Bundle $bundle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Bundle bundle) {
            super(1);
            this.$bundle = bundle;
        }

        @Override // jk.b
        public final CharSequence invoke(String str) {
            String string;
            StringBuilder sb2;
            try {
                Object obj = this.$bundle.get(str);
                if (obj == null) {
                    string = "null";
                } else if (obj instanceof String) {
                    if (((String) obj).length() <= 500) {
                        sb2 = new StringBuilder("\"");
                        sb2.append(obj);
                        sb2.append('\"');
                    } else {
                        sb2 = new StringBuilder("\"");
                        sb2.append(h.S0(500, (String) obj));
                        sb2.append("...\"");
                    }
                    string = sb2.toString();
                } else {
                    string = obj.toString();
                }
                return str + B5.U + string;
            } catch (Throwable unused) {
                return d.h(str, "=<error>");
            }
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.MaxAdRevenueListener$onMessageReceived$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class C07381 extends o implements jk.a {
        final /* synthetic */ Bundle $messageData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07381(Bundle bundle) {
            super(0);
            this.$messageData = bundle;
        }

        @Override // jk.a
        public final String invoke() {
            return "Ad revenue subscribed event (raw): " + MaxAdRevenueListener.this.bundleToTraceString(this.$messageData);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.MaxAdRevenueListener$onMessageReceived$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.core.data.datasource.MaxAdRevenueListener$onMessageReceived$2", f = "MaxAdRevenueListener.kt", l = {45}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements c {
        final /* synthetic */ Bundle $messageData;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Bundle bundle, f fVar) {
            super(2, fVar);
            this.$messageData = bundle;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return MaxAdRevenueListener.this.new AnonymousClass2(this.$messageData, fVar);
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((AnonymousClass2) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            AdRevenueData revenueBundle;
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    t9.e.z(obj);
                    revenueBundle = MaxAdRevenueListener.this.parseRevenueBundle(this.$messageData);
                    if (revenueBundle != null) {
                        HandleAdRevenueEvent handleAdRevenueEvent = MaxAdRevenueListener.this.handleAdRevenueEvent;
                        ClientInfoOuterClass.MediationProvider mediationProvider = ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_MAX;
                        AdRevenueOrigin adRevenueOrigin = AdRevenueOrigin.AUTOMATIC_COLLECTION;
                        this.L$0 = revenueBundle;
                        this.label = 1;
                        Object objInvoke = handleAdRevenueEvent.invoke(revenueBundle, mediationProvider, adRevenueOrigin, this);
                        bk.a aVar = bk.a.f5708a;
                        if (objInvoke == aVar) {
                            return aVar;
                        }
                    } else {
                        Logger.DefaultImpls.trace$default(MaxAdRevenueListener.this.logger, "Failed to parse revenue event", null, 2, null);
                    }
                    return r.f53297a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                revenueBundle = (AdRevenueData) this.L$0;
                t9.e.z(obj);
                Logger.DefaultImpls.trace$default(MaxAdRevenueListener.this.logger, "Ad revenue event sent: revenue=" + revenueBundle.getRevenue() + ", network=" + revenueBundle.getNetworkName(), null, 2, null);
            } catch (Exception e10) {
                MaxAdRevenueListener.this.logger.trace("Failed to process ad revenue event", e10);
            }
            return r.f53297a;
        }
    }

    public MaxAdRevenueListener(HandleAdRevenueEvent handleAdRevenueEvent, a0 scope, Logger logger) {
        n.f(handleAdRevenueEvent, "handleAdRevenueEvent");
        n.f(scope, "scope");
        n.f(logger, "logger");
        this.handleAdRevenueEvent = handleAdRevenueEvent;
        this.scope = scope;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String bundleToTraceString(Bundle bundle) {
        try {
            if (bundle.isEmpty()) {
                return JsonUtils.EMPTY_JSON;
            }
            Set<String> setKeySet = bundle.keySet();
            n.e(setKeySet, "bundle.keySet()");
            return xj.n.u0(setKeySet, null, "{", "}", new AnonymousClass1(bundle), 25);
        } catch (Throwable unused) {
            return "<error serializing bundle>";
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        if (r1.equals("REWARDED_INTERSTITIAL") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        if (r1.equals("REWARDED_INTER") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
    
        if (r1.equals("REWARDED") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        return com.unity3d.ads.core.data.model.AdRevenueAdFormat.REWARDED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
    
        if (r1.equals("INTER") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
    
        if (r1.equals("INTERSTITIAL") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0067, code lost:
    
        return com.unity3d.ads.core.data.model.AdRevenueAdFormat.INTERSTITIAL;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.unity3d.ads.core.data.model.AdRevenueAdFormat parseMaxAdFormatString(java.lang.String r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L7a
            boolean r1 = an.h.y0(r2)
            if (r1 == 0) goto La
            goto L7a
        La:
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r1 = r2.toUpperCase(r1)
            java.lang.String r0 = "this as java.lang.String).toUpperCase(Locale.ROOT)"
            kotlin.jvm.internal.n.e(r1, r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1999289321: goto L68;
                case -1372958932: goto L5c;
                case 2374915: goto L50;
                case 69823676: goto L47;
                case 543046670: goto L3b;
                case 1654540619: goto L32;
                case 1854800829: goto L29;
                case 1951953708: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L70
        L1d:
            java.lang.String r0 = "BANNER"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L26
            goto L70
        L26:
            com.unity3d.ads.core.data.model.AdRevenueAdFormat r1 = com.unity3d.ads.core.data.model.AdRevenueAdFormat.BANNER
            return r1
        L29:
            java.lang.String r0 = "REWARDED_INTERSTITIAL"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L44
            goto L70
        L32:
            java.lang.String r0 = "REWARDED_INTER"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L44
            goto L70
        L3b:
            java.lang.String r0 = "REWARDED"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L44
            goto L70
        L44:
            com.unity3d.ads.core.data.model.AdRevenueAdFormat r1 = com.unity3d.ads.core.data.model.AdRevenueAdFormat.REWARDED
            return r1
        L47:
            java.lang.String r0 = "INTER"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L65
            goto L70
        L50:
            java.lang.String r0 = "MREC"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L59
            goto L70
        L59:
            com.unity3d.ads.core.data.model.AdRevenueAdFormat r1 = com.unity3d.ads.core.data.model.AdRevenueAdFormat.MREC
            return r1
        L5c:
            java.lang.String r0 = "INTERSTITIAL"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L65
            goto L70
        L65:
            com.unity3d.ads.core.data.model.AdRevenueAdFormat r1 = com.unity3d.ads.core.data.model.AdRevenueAdFormat.INTERSTITIAL
            return r1
        L68:
            java.lang.String r0 = "NATIVE"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L77
        L70:
            com.unity3d.ads.core.data.model.AdRevenueAdFormat$Companion r1 = com.unity3d.ads.core.data.model.AdRevenueAdFormat.INSTANCE
            com.unity3d.ads.core.data.model.AdRevenueAdFormat r1 = r1.fromString(r2)
            return r1
        L77:
            com.unity3d.ads.core.data.model.AdRevenueAdFormat r1 = com.unity3d.ads.core.data.model.AdRevenueAdFormat.NATIVE
            return r1
        L7a:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.MaxAdRevenueListener.parseMaxAdFormatString(java.lang.String):com.unity3d.ads.core.data.model.AdRevenueAdFormat");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x0052 A[Catch: Exception -> 0x0019, TryCatch #0 {Exception -> 0x0019, blocks: (B:3:0x0009, B:5:0x0010, B:17:0x004a, B:19:0x0052, B:21:0x0059, B:23:0x0061, B:25:0x0068, B:27:0x0070, B:29:0x0077, B:31:0x007f, B:33:0x0086, B:9:0x001c, B:11:0x0026, B:13:0x002c, B:15:0x0032, B:16:0x0038), top: B:37:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0058  */
    /* JADX WARN: Code duplicated, block: B:23:0x0061 A[Catch: Exception -> 0x0019, TryCatch #0 {Exception -> 0x0019, blocks: (B:3:0x0009, B:5:0x0010, B:17:0x004a, B:19:0x0052, B:21:0x0059, B:23:0x0061, B:25:0x0068, B:27:0x0070, B:29:0x0077, B:31:0x007f, B:33:0x0086, B:9:0x001c, B:11:0x0026, B:13:0x002c, B:15:0x0032, B:16:0x0038), top: B:37:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0067  */
    /* JADX WARN: Code duplicated, block: B:27:0x0070 A[Catch: Exception -> 0x0019, TryCatch #0 {Exception -> 0x0019, blocks: (B:3:0x0009, B:5:0x0010, B:17:0x004a, B:19:0x0052, B:21:0x0059, B:23:0x0061, B:25:0x0068, B:27:0x0070, B:29:0x0077, B:31:0x007f, B:33:0x0086, B:9:0x001c, B:11:0x0026, B:13:0x002c, B:15:0x0032, B:16:0x0038), top: B:37:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    /* JADX WARN: Code duplicated, block: B:31:0x007f A[Catch: Exception -> 0x0019, TryCatch #0 {Exception -> 0x0019, blocks: (B:3:0x0009, B:5:0x0010, B:17:0x004a, B:19:0x0052, B:21:0x0059, B:23:0x0061, B:25:0x0068, B:27:0x0070, B:29:0x0077, B:31:0x007f, B:33:0x0086, B:9:0x001c, B:11:0x0026, B:13:0x002c, B:15:0x0032, B:16:0x0038), top: B:37:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0085  */
    public final AdRevenueData parseRevenueBundle(Bundle bundle) {
        Double dValueOf;
        String string;
        String strValidateString;
        String string2;
        String strValidateString2;
        String string3;
        String strValidateString3;
        String string4;
        String strValidateString4;
        try {
            if (bundle.containsKey("revenue")) {
                double d10 = bundle.getDouble("revenue");
                if (d10 < 0.0d || Double.isInfinite(d10) || Double.isNaN(d10)) {
                    Logger.DefaultImpls.trace$default(this.logger, "Invalid or missing revenue in revenue event: " + d10, null, 2, null);
                } else {
                    dValueOf = Double.valueOf(d10);
                }
                string = bundle.getString(KEY_COUNTRY_CODE);
                if (string != null) {
                    strValidateString = validateString(string);
                } else {
                    strValidateString = null;
                }
                string2 = bundle.getString(KEY_NETWORK_NAME);
                if (string2 != null) {
                    strValidateString2 = validateString(string2);
                } else {
                    strValidateString2 = null;
                }
                string3 = bundle.getString(KEY_MAX_AD_UNIT_ID);
                if (string3 != null) {
                    strValidateString3 = validateString(string3);
                } else {
                    strValidateString3 = null;
                }
                string4 = bundle.getString(KEY_THIRD_PARTY_AD_PLACEMENT_ID);
                if (string4 != null) {
                    strValidateString4 = validateString(string4);
                } else {
                    strValidateString4 = null;
                }
                return new AdRevenueData(null, dValueOf, strValidateString, strValidateString2, strValidateString3, strValidateString4, parseMaxAdFormatString(bundle.getString(KEY_AD_FORMAT)), 1, null);
            }
            Logger.DefaultImpls.trace$default(this.logger, "Missing revenue key in revenue event", null, 2, null);
            dValueOf = null;
            string = bundle.getString(KEY_COUNTRY_CODE);
            if (string != null) {
                strValidateString = validateString(string);
            } else {
                strValidateString = null;
            }
            string2 = bundle.getString(KEY_NETWORK_NAME);
            if (string2 != null) {
                strValidateString2 = validateString(string2);
            } else {
                strValidateString2 = null;
            }
            string3 = bundle.getString(KEY_MAX_AD_UNIT_ID);
            if (string3 != null) {
                strValidateString3 = validateString(string3);
            } else {
                strValidateString3 = null;
            }
            string4 = bundle.getString(KEY_THIRD_PARTY_AD_PLACEMENT_ID);
            if (string4 != null) {
                strValidateString4 = validateString(string4);
            } else {
                strValidateString4 = null;
            }
            return new AdRevenueData(null, dValueOf, strValidateString, strValidateString2, strValidateString3, strValidateString4, parseMaxAdFormatString(bundle.getString(KEY_AD_FORMAT)), 1, null);
        } catch (Exception e10) {
            this.logger.trace("Failed to parse revenue Bundle", e10);
            return null;
        }
    }

    private final String validateString(String str) {
        if (h.y0(str) || str.length() > 500) {
            return null;
        }
        return str;
    }

    public final void onMessageReceived(Bundle messageData) {
        n.f(messageData, "messageData");
        this.logger.trace(new C07381(messageData));
        d0.w(this.scope, null, new AnonymousClass2(messageData, null), 3);
    }
}
