package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class F0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f26025p = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IronSource.a f26026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f26027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private E0 f26028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AbstractC0437l3 f26029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public X8 f26030e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0696zb f26031f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C0468mg f26032g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public T1 f26033h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public O f26034i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C0540qg f26035j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Tc f26036k;
    private Map<C0, a> l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Map<C0, a> f26037m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Map<C0, a> f26038n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Map<C0, a> f26039o;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f26040a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f26041b;

        public a(EnumC0672y5 enumC0672y5, EnumC0672y5 enumC0672y6) {
            if (enumC0672y5 != null) {
                this.f26040a = enumC0672y5.b();
            } else {
                this.f26040a = -1;
            }
            if (enumC0672y6 != null) {
                this.f26041b = enumC0672y6.b();
            } else {
                this.f26041b = -1;
            }
        }

        public int a(b bVar) {
            return b.MEDIATION.equals(bVar) ? this.f26040a : this.f26041b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum b {
        MEDIATION,
        PROVIDER
    }

    public F0(IronSource.a aVar, b bVar, E0 e10) {
        this(aVar, bVar, e10, a(aVar));
    }

    private static AbstractC0437l3 a(IronSource.a aVar) {
        return aVar.equals(IronSource.a.REWARDED_VIDEO) ? C0359ge.i() : G9.i();
    }

    private void d() {
        HashMap map = new HashMap();
        this.f26039o = map;
        map.put(C0.INIT_STARTED, new a(EnumC0672y5.NT_MANAGER_INIT_STARTED, null));
        this.f26039o.put(C0.INIT_ENDED, new a(EnumC0672y5.NT_MANAGER_INIT_ENDED, null));
        this.f26039o.put(C0.PLACEMENT_CAPPED, new a(EnumC0672y5.NT_PLACEMENT_CAPPED, null));
        this.f26039o.put(C0.AUCTION_REQUEST, new a(EnumC0672y5.NT_AUCTION_REQUEST, null));
        this.f26039o.put(C0.AUCTION_SUCCESS, new a(EnumC0672y5.NT_AUCTION_SUCCESS, null));
        Map<C0, a> map2 = this.f26039o;
        C0 c4 = C0.AUCTION_FAILED;
        EnumC0672y5 enumC0672y5 = EnumC0672y5.NT_AUCTION_FAILED;
        map2.put(c4, new a(enumC0672y5, null));
        this.f26039o.put(C0.AUCTION_FAILED_NO_CANDIDATES, new a(enumC0672y5, null));
        this.f26039o.put(C0.AUCTION_REQUEST_WATERFALL, new a(EnumC0672y5.NT_AUCTION_REQUEST_WATERFALL, null));
        this.f26039o.put(C0.AUCTION_RESULT_WATERFALL, new a(EnumC0672y5.NT_AUCTION_RESPONSE_WATERFALL, null));
        this.f26039o.put(C0.INIT_SUCCESS, new a(null, null));
        this.f26039o.put(C0.INIT_FAILED, new a(null, null));
        this.f26039o.put(C0.AD_OPENED, new a(EnumC0672y5.NT_CALLBACK_SHOW, EnumC0672y5.NT_INSTANCE_SHOW));
        this.f26039o.put(C0.AD_CLICKED, new a(EnumC0672y5.NT_CALLBACK_CLICK, EnumC0672y5.NT_INSTANCE_CLICK));
        this.f26039o.put(C0.LOAD_AD, new a(EnumC0672y5.NT_LOAD, EnumC0672y5.NT_INSTANCE_LOAD));
        this.f26039o.put(C0.LOAD_AD_SUCCESS, new a(EnumC0672y5.NT_CALLBACK_LOAD_SUCCESS, EnumC0672y5.NT_INSTANCE_LOAD_SUCCESS));
        this.f26039o.put(C0.LOAD_AD_FAILED_WITH_REASON, new a(EnumC0672y5.NT_CALLBACK_LOAD_ERROR, EnumC0672y5.NT_INSTANCE_LOAD_ERROR));
        this.f26039o.put(C0.LOAD_AD_NO_FILL, new a(null, EnumC0672y5.NT_INSTANCE_LOAD_NO_FILL));
        this.f26039o.put(C0.AD_FORMAT_CAPPED, new a(EnumC0672y5.NT_AD_UNIT_CAPPED, null));
        Map<C0, a> map3 = this.f26039o;
        C0 c5 = C0.COLLECT_TOKEN;
        EnumC0672y5 enumC0672y6 = EnumC0672y5.NT_COLLECT_TOKENS;
        EnumC0672y5 enumC0672y7 = EnumC0672y5.NT_INSTANCE_COLLECT_TOKEN;
        map3.put(c5, new a(enumC0672y6, enumC0672y7));
        this.f26039o.put(C0.COLLECT_TOKENS_COMPLETED, new a(EnumC0672y5.NT_COLLECT_TOKENS_COMPLETED, null));
        this.f26039o.put(C0.COLLECT_TOKENS_FAILED, new a(EnumC0672y5.NT_COLLECT_TOKENS_FAILED, null));
        this.f26039o.put(C0.INSTANCE_COLLECT_TOKEN, new a(enumC0672y7, null));
        Map<C0, a> map4 = this.f26039o;
        C0 c10 = C0.INSTANCE_COLLECT_TOKEN_SUCCESS;
        EnumC0672y5 enumC0672y8 = EnumC0672y5.NT_INSTANCE_COLLECT_TOKEN_SUCCESS;
        map4.put(c10, new a(enumC0672y8, enumC0672y8));
        Map<C0, a> map5 = this.f26039o;
        C0 c11 = C0.INSTANCE_COLLECT_TOKEN_FAILED;
        EnumC0672y5 enumC0672y9 = EnumC0672y5.NT_INSTANCE_COLLECT_TOKEN_FAILED;
        map5.put(c11, new a(enumC0672y9, enumC0672y9));
        Map<C0, a> map6 = this.f26039o;
        C0 c12 = C0.INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        EnumC0672y5 enumC0672y10 = EnumC0672y5.NT_INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        map6.put(c12, new a(enumC0672y10, enumC0672y10));
        this.f26039o.put(C0.DESTROY_AD, new a(EnumC0672y5.NT_DESTROY, EnumC0672y5.NT_INSTANCE_DESTROY));
        this.f26039o.put(C0.TROUBLESHOOT_ILR_REVENUE, new a(EnumC0672y5.TROUBLESHOOTING_NT_ILR_REVENUE, null));
        Map<C0, a> map7 = this.f26039o;
        C0 c13 = C0.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING;
        EnumC0672y5 enumC0672y11 = EnumC0672y5.TROUBLESHOOTING_NT_PROVIDER_SETTINGS_MISSING;
        map7.put(c13, new a(enumC0672y11, enumC0672y11));
        Map<C0, a> map8 = this.f26039o;
        C0 c14 = C0.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS;
        EnumC0672y5 enumC0672y12 = EnumC0672y5.TROUBLESHOOTING_NT_UNEXPECTED_INIT_SUCCESS;
        map8.put(c14, new a(enumC0672y12, enumC0672y12));
        Map<C0, a> map9 = this.f26039o;
        C0 c15 = C0.TROUBLESHOOT_UNEXPECTED_INIT_FAILED;
        EnumC0672y5 enumC0672y13 = EnumC0672y5.TROUBLESHOOTING_NT_UNEXPECTED_INIT_FAILED;
        map9.put(c15, new a(enumC0672y13, enumC0672y13));
        Map<C0, a> map10 = this.f26039o;
        C0 c16 = C0.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS;
        EnumC0672y5 enumC0672y14 = EnumC0672y5.TROUBLESHOOTING_NT_UNEXPECTED_AUCTION_SUCCESS;
        map10.put(c16, new a(enumC0672y14, enumC0672y14));
        Map<C0, a> map11 = this.f26039o;
        C0 c17 = C0.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED;
        EnumC0672y5 enumC0672y15 = EnumC0672y5.TROUBLESHOOTING_NT_UNEXPECTED_AUCTION_FAILED;
        map11.put(c17, new a(enumC0672y15, enumC0672y15));
        Map<C0, a> map12 = this.f26039o;
        C0 c18 = C0.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS;
        EnumC0672y5 enumC0672y16 = EnumC0672y5.TROUBLESHOOTING_NT_UNEXPECTED_LOAD_SUCCESS;
        map12.put(c18, new a(enumC0672y16, enumC0672y16));
        Map<C0, a> map13 = this.f26039o;
        C0 c19 = C0.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED;
        EnumC0672y5 enumC0672y17 = EnumC0672y5.TROUBLESHOOTING_NT_UNEXPECTED_LOAD_FAILED;
        map13.put(c19, new a(enumC0672y17, enumC0672y17));
        Map<C0, a> map14 = this.f26039o;
        C0 c20 = C0.TROUBLESHOOT_UNEXPECTED_TIMEOUT;
        EnumC0672y5 enumC0672y18 = EnumC0672y5.TROUBLESHOOTING_NT_UNEXPECTED_TIMEOUT;
        map14.put(c20, new a(enumC0672y18, enumC0672y18));
        Map<C0, a> map15 = this.f26039o;
        C0 c21 = C0.TROUBLESHOOT_UNEXPECTED_OPENED;
        EnumC0672y5 enumC0672y19 = EnumC0672y5.TROUBLESHOOTING_NT_UNEXPECTED_OPENED;
        map15.put(c21, new a(enumC0672y19, enumC0672y19));
        Map<C0, a> map16 = this.f26039o;
        C0 c22 = C0.TROUBLESHOOT_INTERNAL_ERROR;
        EnumC0672y5 enumC0672y20 = EnumC0672y5.TROUBLESHOOTING_NT_INTERNAL_ERROR;
        map16.put(c22, new a(enumC0672y20, enumC0672y20));
        Map<C0, a> map17 = this.f26039o;
        C0 c23 = C0.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        EnumC0672y5 enumC0672y21 = EnumC0672y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        map17.put(c23, new a(enumC0672y21, enumC0672y21));
        Map<C0, a> map18 = this.f26039o;
        C0 c24 = C0.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        EnumC0672y5 enumC0672y22 = EnumC0672y5.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        map18.put(c24, new a(enumC0672y22, enumC0672y22));
        this.f26039o.put(C0.TROUBLESHOOT_NOTIFICATION_ERROR, new a(EnumC0672y5.TROUBLESHOOTING_NT_NOTIFICATIONS_ERROR, null));
    }

    public void b() {
        c();
        e();
        a();
        d();
    }

    public void c() {
        HashMap map = new HashMap();
        this.l = map;
        map.put(C0.INIT_STARTED, new a(EnumC0672y5.IS_MANAGER_INIT_STARTED, null));
        this.l.put(C0.INIT_ENDED, new a(EnumC0672y5.IS_MANAGER_INIT_ENDED, null));
        this.l.put(C0.SESSION_CAPPED, new a(null, EnumC0672y5.IS_CAP_SESSION));
        this.l.put(C0.PLACEMENT_CAPPED, new a(EnumC0672y5.IS_CAP_PLACEMENT, null));
        this.l.put(C0.CHECK_PLACEMENT_CAPPED, new a(EnumC0672y5.IS_CHECK_PLACEMENT_CAPPED, null));
        this.l.put(C0.AUCTION_REQUEST, new a(EnumC0672y5.IS_AUCTION_REQUEST, null));
        this.l.put(C0.AUCTION_SUCCESS, new a(EnumC0672y5.IS_AUCTION_SUCCESS, null));
        Map<C0, a> map2 = this.l;
        C0 c4 = C0.AUCTION_FAILED;
        EnumC0672y5 enumC0672y5 = EnumC0672y5.IS_AUCTION_FAILED;
        map2.put(c4, new a(enumC0672y5, null));
        this.l.put(C0.AUCTION_FAILED_NO_CANDIDATES, new a(enumC0672y5, null));
        this.l.put(C0.AUCTION_REQUEST_WATERFALL, new a(EnumC0672y5.IS_AUCTION_REQUEST_WATERFALL, null));
        this.l.put(C0.AUCTION_RESULT_WATERFALL, new a(EnumC0672y5.IS_RESULT_WATERFALL, null));
        this.l.put(C0.INIT_SUCCESS, new a(null, null));
        this.l.put(C0.INIT_FAILED, new a(null, null));
        this.l.put(C0.AD_OPENED, new a(null, EnumC0672y5.IS_INSTANCE_OPENED));
        this.l.put(C0.AD_CLOSED, new a(EnumC0672y5.IS_CALLBACK_AD_CLOSED, EnumC0672y5.IS_INSTANCE_CLOSED));
        this.l.put(C0.AD_CLICKED, new a(EnumC0672y5.IS_CALLBACK_AD_CLICKED, EnumC0672y5.IS_INSTANCE_CLICKED));
        this.l.put(C0.AD_INFO_CHANGED, new a(EnumC0672y5.IS_CALLBACK_AD_INFO_CHANGED, null));
        this.l.put(C0.LOAD_AD, new a(EnumC0672y5.IS_LOAD_CALLED, EnumC0672y5.IS_INSTANCE_LOAD));
        this.l.put(C0.LOAD_AD_SUCCESS, new a(EnumC0672y5.IS_CALLBACK_LOAD_SUCCESS, EnumC0672y5.IS_INSTANCE_LOAD_SUCCESS));
        this.l.put(C0.LOAD_AD_FAILED_WITH_REASON, new a(EnumC0672y5.IS_CALLBACK_LOAD_ERROR, EnumC0672y5.IS_INSTANCE_LOAD_FAILED));
        this.l.put(C0.LOAD_AD_NO_FILL, new a(null, EnumC0672y5.IS_INSTANCE_LOAD_NO_FILL));
        this.l.put(C0.SHOW_AD, new a(EnumC0672y5.IS_SHOW_CALLED, EnumC0672y5.IS_INSTANCE_SHOW));
        this.l.put(C0.SHOW_AD_FAILED, new a(EnumC0672y5.IS_CALLBACK_AD_SHOW_ERROR, EnumC0672y5.IS_INSTANCE_SHOW_FAILED));
        this.l.put(C0.AD_FORMAT_CAPPED, new a(EnumC0672y5.IS_AD_FORMAT_CAPPED, null));
        this.l.put(C0.AD_UNIT_CAPPED, new a(EnumC0672y5.IS_AD_UNIT_CAPPED, null));
        this.l.put(C0.COLLECT_TOKEN, new a(EnumC0672y5.IS_COLLECT_TOKENS, null));
        this.l.put(C0.COLLECT_TOKENS_COMPLETED, new a(EnumC0672y5.IS_COLLECT_TOKENS_COMPLETED, null));
        this.l.put(C0.COLLECT_TOKENS_FAILED, new a(EnumC0672y5.IS_COLLECT_TOKENS_FAILED, null));
        this.l.put(C0.INSTANCE_COLLECT_TOKEN, new a(EnumC0672y5.IS_INSTANCE_COLLECT_TOKEN, null));
        this.l.put(C0.INSTANCE_COLLECT_TOKEN_SUCCESS, new a(EnumC0672y5.IS_INSTANCE_COLLECT_TOKEN_SUCCESS, null));
        this.l.put(C0.INSTANCE_COLLECT_TOKEN_FAILED, new a(EnumC0672y5.IS_INSTANCE_COLLECT_TOKEN_FAILED, null));
        this.l.put(C0.INSTANCE_COLLECT_TOKEN_TIMED_OUT, new a(EnumC0672y5.IS_INSTANCE_COLLECT_TOKEN_TIMED_OUT, null));
        this.l.put(C0.AD_READY_TRUE, new a(EnumC0672y5.IS_CHECK_READY_TRUE, null));
        this.l.put(C0.AD_READY_FALSE, new a(EnumC0672y5.IS_CHECK_READY_FALSE, null));
        this.l.put(C0.OPERATIONAL_LOAD_AD, new a(EnumC0672y5.IS_OPERATIONAL_LOAD_AD, null));
        this.l.put(C0.OPERATIONAL_LOAD_SUCCESS, new a(EnumC0672y5.IS_OPERATIONAL_LOAD_SUCCESS, null));
        this.l.put(C0.OPERATIONAL_LOAD_FAILED, new a(EnumC0672y5.IS_OPERATIONAL_LOAD_FAILED, null));
        this.l.put(C0.OPERATIONAL_SET_CONFIGURATIONS, new a(EnumC0672y5.IS_SET_CONFIGURATION, null));
        this.l.put(C0.PRELOAD_ADUNIT_INITIATED, new a(EnumC0672y5.IS_PRELOAD_ADUNIT_INITIATED, null));
        this.l.put(C0.PRELOAD_ADUNIT_FAILED, new a(EnumC0672y5.IS_PRELOAD_ADUNIT_FAILED, null));
        this.l.put(C0.PRELOAD_ADUNIT_LOAD_SUCCESS, new a(EnumC0672y5.IS_PRELOAD_ADUNIT_LOAD_SUCCESS, null));
        Map<C0, a> map3 = this.l;
        C0 c5 = C0.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING;
        EnumC0672y5 enumC0672y6 = EnumC0672y5.TROUBLESHOOTING_IS_PROVIDER_SETTINGS_MISSING;
        map3.put(c5, new a(enumC0672y6, enumC0672y6));
        Map<C0, a> map4 = this.l;
        C0 c10 = C0.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS;
        EnumC0672y5 enumC0672y7 = EnumC0672y5.TROUBLESHOOTING_IS_UNEXPECTED_INIT_SUCCESS;
        map4.put(c10, new a(enumC0672y7, enumC0672y7));
        Map<C0, a> map5 = this.l;
        C0 c11 = C0.TROUBLESHOOT_UNEXPECTED_INIT_FAILED;
        EnumC0672y5 enumC0672y8 = EnumC0672y5.TROUBLESHOOTING_IS_UNEXPECTED_INIT_FAILED;
        map5.put(c11, new a(enumC0672y8, enumC0672y8));
        Map<C0, a> map6 = this.l;
        C0 c12 = C0.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS;
        EnumC0672y5 enumC0672y9 = EnumC0672y5.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_SUCCESS;
        map6.put(c12, new a(enumC0672y9, enumC0672y9));
        Map<C0, a> map7 = this.l;
        C0 c13 = C0.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED;
        EnumC0672y5 enumC0672y10 = EnumC0672y5.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_FAILED;
        map7.put(c13, new a(enumC0672y10, enumC0672y10));
        Map<C0, a> map8 = this.l;
        C0 c14 = C0.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS;
        EnumC0672y5 enumC0672y11 = EnumC0672y5.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_SUCCESS;
        map8.put(c14, new a(enumC0672y11, enumC0672y11));
        Map<C0, a> map9 = this.l;
        C0 c15 = C0.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED;
        EnumC0672y5 enumC0672y12 = EnumC0672y5.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_FAILED;
        map9.put(c15, new a(enumC0672y12, enumC0672y12));
        Map<C0, a> map10 = this.l;
        C0 c16 = C0.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED;
        EnumC0672y5 enumC0672y13 = EnumC0672y5.TROUBLESHOOTING_IS_UNEXPECTED_SHOW_FAILED;
        map10.put(c16, new a(enumC0672y13, enumC0672y13));
        Map<C0, a> map11 = this.l;
        C0 c17 = C0.TROUBLESHOOT_UNEXPECTED_CLOSED;
        EnumC0672y5 enumC0672y14 = EnumC0672y5.TROUBLESHOOTING_IS_UNEXPECTED_CLOSED;
        map11.put(c17, new a(enumC0672y14, enumC0672y14));
        Map<C0, a> map12 = this.l;
        C0 c18 = C0.TROUBLESHOOT_UNEXPECTED_TIMEOUT;
        EnumC0672y5 enumC0672y15 = EnumC0672y5.TROUBLESHOOTING_IS_UNEXPECTED_TIMEOUT;
        map12.put(c18, new a(enumC0672y15, enumC0672y15));
        Map<C0, a> map13 = this.l;
        C0 c19 = C0.TROUBLESHOOT_INTERNAL_ERROR;
        EnumC0672y5 enumC0672y16 = EnumC0672y5.TROUBLESHOOTING_IS_INTERNAL_ERROR;
        map13.put(c19, new a(enumC0672y16, enumC0672y16));
        Map<C0, a> map14 = this.l;
        C0 c20 = C0.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        EnumC0672y5 enumC0672y17 = EnumC0672y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        map14.put(c20, new a(enumC0672y17, enumC0672y17));
        Map<C0, a> map15 = this.l;
        C0 c21 = C0.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        EnumC0672y5 enumC0672y18 = EnumC0672y5.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        map15.put(c21, new a(enumC0672y18, enumC0672y18));
        this.l.put(C0.TROUBLESHOOT_NOTIFICATION_ERROR, new a(EnumC0672y5.TROUBLESHOOTING_IS_NOTIFICATIONS_ERROR, null));
        Map<C0, a> map16 = this.l;
        C0 c22 = C0.TROUBLESHOOT_AD_EXPIRED;
        EnumC0672y5 enumC0672y19 = EnumC0672y5.TROUBLESHOOTING_IS_AD_EXPIRED;
        map16.put(c22, new a(enumC0672y19, enumC0672y19));
        this.l.put(C0.TROUBLESHOOT_LOAD, new a(EnumC0672y5.TROUBLESHOOTING_IS_LOAD, null));
        this.l.put(C0.TROUBLESHOOT_LOAD_WHILE_LOADED, new a(EnumC0672y5.TROUBLESHOOTING_IS_LOAD_WHILE_LOADED, null));
        this.l.put(C0.TROUBLESHOOT_LOAD_SUCCESS, new a(EnumC0672y5.TROUBLESHOOTING_IS_LOAD_SUCCESS, null));
        this.l.put(C0.TROUBLESHOOT_LOAD_FAILED, new a(EnumC0672y5.TROUBLESHOOTING_IS_LOAD_FAILED, null));
        this.l.put(C0.TROUBLESHOOT_SHOW, new a(EnumC0672y5.TROUBLESHOOTING_IS_SHOW, null));
        this.l.put(C0.TROUBLESHOOT_SHOW_SUCCESS, new a(EnumC0672y5.TROUBLESHOOTING_IS_SHOW_SUCCESS, null));
        this.l.put(C0.TROUBLESHOOT_SHOW_FAILED, new a(EnumC0672y5.TROUBLESHOOTING_IS_SHOW_FAILED, null));
        Map<C0, a> map17 = this.l;
        C0 c23 = C0.TROUBLESHOOT_ILLEGAL_STATE;
        EnumC0672y5 enumC0672y20 = EnumC0672y5.TROUBLESHOOTING_IS_ILLEGAL_STATE;
        map17.put(c23, new a(enumC0672y20, enumC0672y20));
        this.l.put(C0.TROUBLESHOOT_AD_INFO_CHANGED, new a(EnumC0672y5.TROUBLESHOOT_IS_AD_INFO_CHANGED, null));
        this.l.put(C0.TROUBLESHOOT_DESTROY_INSTANCES_READY_TO_SHOW, new a(EnumC0672y5.TROUBLESHOOTING_IS_DESTROY_READY_TO_SHOW_INSTANCES, null));
        this.l.put(C0.TROUBLESHOOT_ILR_REVENUE, new a(EnumC0672y5.TROUBLESHOOTING_IS_ILR_REVENUE, null));
        this.l.put(C0.TROUBLESHOOT_SHOW_RECOVERY_INITIATED, new a(EnumC0672y5.TROUBLESHOOT_IS_SHOW_RECOVERY_INITIATED, null));
    }

    public void e() {
        HashMap map = new HashMap();
        this.f26037m = map;
        map.put(C0.INIT_STARTED, new a(EnumC0672y5.RV_MANAGER_INIT_STARTED, null));
        this.f26037m.put(C0.INIT_ENDED, new a(EnumC0672y5.RV_MANAGER_INIT_ENDED, null));
        this.f26037m.put(C0.SESSION_CAPPED, new a(null, EnumC0672y5.RV_CAP_SESSION));
        this.f26037m.put(C0.PLACEMENT_CAPPED, new a(EnumC0672y5.RV_CAP_PLACEMENT, null));
        this.f26037m.put(C0.CHECK_PLACEMENT_CAPPED, new a(EnumC0672y5.RV_CHECK_PLACEMENT_CAPPED, null));
        this.f26037m.put(C0.AUCTION_REQUEST, new a(EnumC0672y5.RV_AUCTION_REQUEST, null));
        this.f26037m.put(C0.AUCTION_SUCCESS, new a(EnumC0672y5.RV_AUCTION_SUCCESS, null));
        Map<C0, a> map2 = this.f26037m;
        C0 c4 = C0.AUCTION_FAILED;
        EnumC0672y5 enumC0672y5 = EnumC0672y5.RV_AUCTION_FAILED;
        map2.put(c4, new a(enumC0672y5, null));
        this.f26037m.put(C0.AUCTION_FAILED_NO_CANDIDATES, new a(enumC0672y5, null));
        this.f26037m.put(C0.AUCTION_REQUEST_WATERFALL, new a(EnumC0672y5.RV_AUCTION_REQUEST_WATERFALL, null));
        this.f26037m.put(C0.AUCTION_RESULT_WATERFALL, new a(EnumC0672y5.RV_AUCTION_RESPONSE_WATERFALL, null));
        this.f26037m.put(C0.INIT_SUCCESS, new a(null, null));
        this.f26037m.put(C0.INIT_FAILED, new a(null, null));
        this.f26037m.put(C0.AD_VISIBLE, new a(null, EnumC0672y5.RV_INSTANCE_VISIBLE));
        this.f26037m.put(C0.AD_OPENED, new a(null, EnumC0672y5.RV_BUSINESS_INSTANCE_OPENED));
        this.f26037m.put(C0.AD_CLOSED, new a(null, EnumC0672y5.RV_INSTANCE_CLOSED));
        this.f26037m.put(C0.AD_STARTED, new a(null, EnumC0672y5.RV_INSTANCE_STARTED));
        this.f26037m.put(C0.AD_ENDED, new a(null, EnumC0672y5.RV_INSTANCE_ENDED));
        this.f26037m.put(C0.AD_CLICKED, new a(EnumC0672y5.RV_CALLBACK_AD_CLICKED, EnumC0672y5.RV_BUSINESS_INSTANCE_CLICKED));
        this.f26037m.put(C0.AD_INFO_CHANGED, new a(EnumC0672y5.RV_CALLBACK_AD_INFO_CHANGED, null));
        this.f26037m.put(C0.AD_REWARDED, new a(null, EnumC0672y5.RV_BUSINESS_INSTANCE_REWARDED));
        this.f26037m.put(C0.AD_AVAILABILITY_CHANGED_TRUE, new a(EnumC0672y5.RV_CALLBACK_AVAILABILITY_TRUE, EnumC0672y5.RV_INSTANCE_AVAILABILITY_TRUE));
        this.f26037m.put(C0.AD_AVAILABILITY_CHANGED_FALSE, new a(EnumC0672y5.RV_CALLBACK_AVAILABILITY_FALSE, EnumC0672y5.RV_INSTANCE_AVAILABILITY_FALSE));
        this.f26037m.put(C0.LOAD_AD, new a(EnumC0672y5.RV_BUSINESS_MEDIATION_LOAD, EnumC0672y5.RV_BUSINESS_INSTANCE_LOAD));
        this.f26037m.put(C0.LOAD_AD_SUCCESS, new a(EnumC0672y5.RV_BUSINESS_MEDIATION_LOAD_SUCCESS, EnumC0672y5.RV_BUSINESS_INSTANCE_LOAD_SUCCESS));
        this.f26037m.put(C0.LOAD_AD_FAILED, new a(null, EnumC0672y5.RV_INSTANCE_LOAD_FAILED));
        this.f26037m.put(C0.LOAD_AD_FAILED_WITH_REASON, new a(EnumC0672y5.RV_MEDIATION_LOAD_ERROR, EnumC0672y5.RV_INSTANCE_LOAD_FAILED_REASON));
        this.f26037m.put(C0.LOAD_AD_NO_FILL, new a(null, EnumC0672y5.RV_INSTANCE_LOAD_NO_FILL));
        this.f26037m.put(C0.SHOW_AD, new a(EnumC0672y5.RV_API_SHOW_CALLED, EnumC0672y5.RV_INSTANCE_SHOW));
        this.f26037m.put(C0.SHOW_AD_CHANCE, new a(null, EnumC0672y5.RV_INSTANCE_SHOW_CHANCE));
        this.f26037m.put(C0.SHOW_AD_FAILED, new a(EnumC0672y5.RV_CALLBACK_SHOW_FAILED, EnumC0672y5.RV_INSTANCE_SHOW_FAILED));
        this.f26037m.put(C0.AD_FORMAT_CAPPED, new a(EnumC0672y5.RV_AD_UNIT_CAPPED, null));
        this.f26037m.put(C0.COLLECT_TOKEN, new a(EnumC0672y5.RV_COLLECT_TOKENS, null));
        this.f26037m.put(C0.COLLECT_TOKENS_COMPLETED, new a(EnumC0672y5.RV_COLLECT_TOKENS_COMPLETED, null));
        this.f26037m.put(C0.COLLECT_TOKENS_FAILED, new a(EnumC0672y5.RV_COLLECT_TOKENS_FAILED, null));
        this.f26037m.put(C0.INSTANCE_COLLECT_TOKEN, new a(EnumC0672y5.RV_INSTANCE_COLLECT_TOKEN, null));
        Map<C0, a> map3 = this.f26037m;
        C0 c5 = C0.INSTANCE_COLLECT_TOKEN_SUCCESS;
        EnumC0672y5 enumC0672y6 = EnumC0672y5.RV_INSTANCE_COLLECT_TOKEN_SUCCESS;
        map3.put(c5, new a(enumC0672y6, enumC0672y6));
        Map<C0, a> map4 = this.f26037m;
        C0 c10 = C0.INSTANCE_COLLECT_TOKEN_FAILED;
        EnumC0672y5 enumC0672y7 = EnumC0672y5.RV_INSTANCE_COLLECT_TOKEN_FAILED;
        map4.put(c10, new a(enumC0672y7, enumC0672y7));
        Map<C0, a> map5 = this.f26037m;
        C0 c11 = C0.INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        EnumC0672y5 enumC0672y8 = EnumC0672y5.RV_INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        map5.put(c11, new a(enumC0672y8, enumC0672y8));
        this.f26037m.put(C0.AD_READY_TRUE, new a(EnumC0672y5.RV_CHECK_READY_TRUE, null));
        this.f26037m.put(C0.AD_READY_FALSE, new a(EnumC0672y5.RV_CHECK_READY_FALSE, null));
        this.f26037m.put(C0.OPERATIONAL_LOAD_AD, new a(EnumC0672y5.RV_OPERATIONAL_LOAD_AD, null));
        this.f26037m.put(C0.OPERATIONAL_LOAD_SUCCESS, new a(EnumC0672y5.RV_OPERATIONAL_LOAD_SUCCESS, null));
        this.f26037m.put(C0.OPERATIONAL_LOAD_FAILED, new a(EnumC0672y5.RV_OPERATIONAL_LOAD_FAILED, null));
        this.f26037m.put(C0.OPERATIONAL_SET_CONFIGURATIONS, new a(EnumC0672y5.RV_SET_CONFIGURATION, null));
        this.f26037m.put(C0.OPERATIONAL_GET_REWARD, new a(EnumC0672y5.RV_OPERATIONAL_GET_REWARD, null));
        this.f26037m.put(C0.PRELOAD_ADUNIT_INITIATED, new a(EnumC0672y5.RV_PRELOAD_ADUNIT_INITIATED, null));
        this.f26037m.put(C0.PRELOAD_ADUNIT_FAILED, new a(EnumC0672y5.RV_PRELOAD_ADUNIT_FAILED, null));
        this.f26037m.put(C0.PRELOAD_ADUNIT_LOAD_SUCCESS, new a(EnumC0672y5.RV_PRELOAD_ADUNIT_LOAD_SUCCESS, null));
        Map<C0, a> map6 = this.f26037m;
        C0 c12 = C0.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING;
        EnumC0672y5 enumC0672y9 = EnumC0672y5.TROUBLESHOOTING_RV_PROVIDER_SETTINGS_MISSING;
        map6.put(c12, new a(enumC0672y9, enumC0672y9));
        Map<C0, a> map7 = this.f26037m;
        C0 c13 = C0.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS;
        EnumC0672y5 enumC0672y10 = EnumC0672y5.TROUBLESHOOTING_RV_UNEXPECTED_INIT_SUCCESS;
        map7.put(c13, new a(enumC0672y10, enumC0672y10));
        Map<C0, a> map8 = this.f26037m;
        C0 c14 = C0.TROUBLESHOOT_UNEXPECTED_INIT_FAILED;
        EnumC0672y5 enumC0672y11 = EnumC0672y5.TROUBLESHOOTING_RV_UNEXPECTED_INIT_FAILED;
        map8.put(c14, new a(enumC0672y11, enumC0672y11));
        Map<C0, a> map9 = this.f26037m;
        C0 c15 = C0.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS;
        EnumC0672y5 enumC0672y12 = EnumC0672y5.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_SUCCESS;
        map9.put(c15, new a(enumC0672y12, enumC0672y12));
        Map<C0, a> map10 = this.f26037m;
        C0 c16 = C0.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED;
        EnumC0672y5 enumC0672y13 = EnumC0672y5.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_FAILED;
        map10.put(c16, new a(enumC0672y13, enumC0672y13));
        Map<C0, a> map11 = this.f26037m;
        C0 c17 = C0.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS;
        EnumC0672y5 enumC0672y14 = EnumC0672y5.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_SUCCESS;
        map11.put(c17, new a(enumC0672y14, enumC0672y14));
        Map<C0, a> map12 = this.f26037m;
        C0 c18 = C0.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED;
        EnumC0672y5 enumC0672y15 = EnumC0672y5.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_FAILED;
        map12.put(c18, new a(enumC0672y15, enumC0672y15));
        Map<C0, a> map13 = this.f26037m;
        C0 c19 = C0.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED;
        EnumC0672y5 enumC0672y16 = EnumC0672y5.TROUBLESHOOTING_RV_UNEXPECTED_SHOW_FAILED;
        map13.put(c19, new a(enumC0672y16, enumC0672y16));
        Map<C0, a> map14 = this.f26037m;
        C0 c20 = C0.TROUBLESHOOT_UNEXPECTED_TIMEOUT;
        EnumC0672y5 enumC0672y17 = EnumC0672y5.TROUBLESHOOTING_RV_UNEXPECTED_TIMEOUT;
        map14.put(c20, new a(enumC0672y17, enumC0672y17));
        Map<C0, a> map15 = this.f26037m;
        C0 c21 = C0.TROUBLESHOOT_UNEXPECTED_CLOSED;
        EnumC0672y5 enumC0672y18 = EnumC0672y5.TROUBLESHOOTING_RV_UNEXPECTED_CLOSED;
        map15.put(c21, new a(enumC0672y18, enumC0672y18));
        Map<C0, a> map16 = this.f26037m;
        C0 c22 = C0.TROUBLESHOOT_LOAD_FAILED;
        EnumC0672y5 enumC0672y19 = EnumC0672y5.TROUBLESHOOTING_RV_LOAD_FAILED;
        map16.put(c22, new a(enumC0672y19, enumC0672y19));
        Map<C0, a> map17 = this.f26037m;
        C0 c23 = C0.TROUBLESHOOT_INTERNAL_ERROR;
        EnumC0672y5 enumC0672y20 = EnumC0672y5.TROUBLESHOOTING_RV_INTERNAL_ERROR;
        map17.put(c23, new a(enumC0672y20, enumC0672y20));
        Map<C0, a> map18 = this.f26037m;
        C0 c24 = C0.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        EnumC0672y5 enumC0672y21 = EnumC0672y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        map18.put(c24, new a(enumC0672y21, enumC0672y21));
        Map<C0, a> map19 = this.f26037m;
        C0 c25 = C0.TROUBLESHOOT_WATERFALL_OVERHEAD;
        EnumC0672y5 enumC0672y22 = EnumC0672y5.TROUBLESHOOTING_RV_WATERFALL_OVERHEAD;
        map19.put(c25, new a(enumC0672y22, enumC0672y22));
        this.f26037m.put(C0.TROUBLESHOOT_NOTIFICATION_ERROR, new a(EnumC0672y5.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, null));
        Map<C0, a> map20 = this.f26037m;
        C0 c26 = C0.TROUBLESHOOT_AD_EXPIRED;
        EnumC0672y5 enumC0672y23 = EnumC0672y5.TROUBLESHOOTING_RV_AD_EXPIRED;
        map20.put(c26, new a(enumC0672y23, enumC0672y23));
        this.f26037m.put(C0.TROUBLESHOOT_LOAD, new a(EnumC0672y5.TROUBLESHOOTING_RV_LOAD, null));
        this.f26037m.put(C0.TROUBLESHOOT_LOAD_WHILE_LOADED, new a(EnumC0672y5.TROUBLESHOOTING_RV_LOAD_WHILE_LOADED, null));
        this.f26037m.put(C0.TROUBLESHOOT_LOAD_SUCCESS, new a(EnumC0672y5.TROUBLESHOOTING_RV_LOAD_SUCCESS, null));
        this.f26037m.put(C0.TROUBLESHOOT_SHOW, new a(EnumC0672y5.TROUBLESHOOTING_RV_SHOW, null));
        this.f26037m.put(C0.TROUBLESHOOT_SHOW_SUCCESS, new a(EnumC0672y5.TROUBLESHOOTING_RV_SHOW_SUCCESS, null));
        this.f26037m.put(C0.TROUBLESHOOT_SHOW_FAILED, new a(EnumC0672y5.TROUBLESHOOTING_RV_SHOW_FAILED, null));
        Map<C0, a> map21 = this.f26037m;
        C0 c27 = C0.TROUBLESHOOT_ILLEGAL_STATE;
        EnumC0672y5 enumC0672y24 = EnumC0672y5.TROUBLESHOOTING_RV_ILLEGAL_STATE;
        map21.put(c27, new a(enumC0672y24, enumC0672y24));
        this.f26037m.put(C0.TROUBLESHOOT_AD_INFO_CHANGED, new a(EnumC0672y5.TROUBLESHOOT_RV_AD_INFO_CHANGED, null));
        this.f26037m.put(C0.TROUBLESHOOT_DESTROY_INSTANCES_READY_TO_SHOW, new a(EnumC0672y5.TROUBLESHOOTING_RV_DESTROY_READY_TO_SHOW_INSTANCES, null));
        this.f26037m.put(C0.TROUBLESHOOT_ILR_REVENUE, new a(EnumC0672y5.TROUBLESHOOTING_RV_ILR_REVENUE, null));
        this.f26037m.put(C0.TROUBLESHOOT_SHOW_RECOVERY_INITIATED, new a(EnumC0672y5.TROUBLESHOOT_RV_SHOW_RECOVERY_INITIATED, null));
    }

    public void f() {
        this.f26028c = null;
        this.f26032g = null;
        this.f26033h = null;
        this.f26030e = null;
        this.f26031f = null;
        this.f26034i = null;
        this.f26035j = null;
        this.f26036k = null;
    }

    public F0(IronSource.a aVar, b bVar, E0 e10, AbstractC0437l3 abstractC0437l3) {
        this.f26026a = aVar;
        this.f26027b = bVar;
        this.f26028c = e10;
        this.f26029d = abstractC0437l3 == null ? a(aVar) : abstractC0437l3;
        b();
        this.f26030e = new X8(this);
        this.f26031f = new C0696zb(this);
        this.f26032g = new C0468mg(this);
        this.f26033h = new T1(this);
        this.f26034i = new O(this);
        this.f26035j = new C0540qg(this);
        this.f26036k = new Tc(this);
    }

    public void a(C0 c4, Map<String, Object> map) {
        a(c4, map, Calendar.getInstance().getTimeInMillis());
    }

    public void a(C0 c4, Map<String, Object> map, long j10) {
        int iA = a(c4);
        if (-1 == iA) {
            return;
        }
        HashMap map2 = new HashMap();
        E0 e10 = this.f26028c;
        if (e10 != null) {
            map2.putAll(e10.a(c4));
        }
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        this.f26029d.a(new C0654x5(iA, j10, new JSONObject(map2)));
    }

    private int a(C0 c4) {
        try {
            if (IronSource.a.INTERSTITIAL.equals(this.f26026a) && this.l.containsKey(c4)) {
                return this.l.get(c4).a(this.f26027b);
            }
            if (IronSource.a.REWARDED_VIDEO.equals(this.f26026a) && this.f26037m.containsKey(c4)) {
                return this.f26037m.get(c4).a(this.f26027b);
            }
            if (IronSource.a.BANNER.equals(this.f26026a) && this.f26038n.containsKey(c4)) {
                return this.f26038n.get(c4).a(this.f26027b);
            }
            if (IronSource.a.NATIVE_AD.equals(this.f26026a) && this.f26039o.containsKey(c4)) {
                return this.f26039o.get(c4).a(this.f26027b);
            }
            return -1;
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return -1;
        }
    }

    public void a() {
        HashMap map = new HashMap();
        this.f26038n = map;
        map.put(C0.INIT_STARTED, new a(EnumC0672y5.BN_MANAGER_INIT_STARTED, null));
        this.f26038n.put(C0.INIT_ENDED, new a(EnumC0672y5.BN_MANAGER_INIT_ENDED, null));
        this.f26038n.put(C0.PLACEMENT_CAPPED, new a(EnumC0672y5.BN_PLACEMENT_CAPPED, null));
        this.f26038n.put(C0.AUCTION_REQUEST, new a(EnumC0672y5.BN_AUCTION_REQUEST, null));
        this.f26038n.put(C0.AUCTION_SUCCESS, new a(EnumC0672y5.BN_AUCTION_SUCCESS, null));
        Map<C0, a> map2 = this.f26038n;
        C0 c4 = C0.AUCTION_FAILED;
        EnumC0672y5 enumC0672y5 = EnumC0672y5.BN_AUCTION_FAILED;
        map2.put(c4, new a(enumC0672y5, null));
        this.f26038n.put(C0.AUCTION_FAILED_NO_CANDIDATES, new a(enumC0672y5, null));
        this.f26038n.put(C0.AUCTION_REQUEST_WATERFALL, new a(EnumC0672y5.BN_AUCTION_REQUEST_WATERFALL, null));
        this.f26038n.put(C0.AUCTION_RESULT_WATERFALL, new a(EnumC0672y5.BN_AUCTION_RESPONSE_WATERFALL, null));
        this.f26038n.put(C0.INIT_SUCCESS, new a(null, null));
        this.f26038n.put(C0.INIT_FAILED, new a(null, null));
        this.f26038n.put(C0.AD_OPENED, new a(EnumC0672y5.BN_CALLBACK_SHOW, EnumC0672y5.BN_INSTANCE_SHOW));
        this.f26038n.put(C0.SHOW_AD_FAILED, new a(EnumC0672y5.BN_CALLBACK_SHOW_FAILED, EnumC0672y5.BN_INSTANCE_SHOW_FAILED));
        this.f26038n.put(C0.AD_CLICKED, new a(EnumC0672y5.BN_CALLBACK_CLICK, EnumC0672y5.BN_INSTANCE_CLICK));
        this.f26038n.put(C0.LOAD_AD, new a(EnumC0672y5.BN_LOAD, EnumC0672y5.BN_INSTANCE_LOAD));
        this.f26038n.put(C0.RELOAD_AD, new a(EnumC0672y5.BN_RELOAD, EnumC0672y5.BN_INSTANCE_RELOAD));
        this.f26038n.put(C0.LOAD_AD_SUCCESS, new a(EnumC0672y5.BN_CALLBACK_LOAD_SUCCESS, EnumC0672y5.BN_INSTANCE_LOAD_SUCCESS));
        this.f26038n.put(C0.RELOAD_AD_SUCCESS, new a(EnumC0672y5.BN_CALLBACK_RELOAD_SUCCESS, EnumC0672y5.BN_INSTANCE_RELOAD_SUCCESS));
        this.f26038n.put(C0.LOAD_AD_FAILED_WITH_REASON, new a(EnumC0672y5.BN_CALLBACK_LOAD_ERROR, EnumC0672y5.BN_INSTANCE_LOAD_ERROR));
        this.f26038n.put(C0.RELOAD_AD_FAILED_WITH_REASON, new a(EnumC0672y5.BN_CALLBACK_RELOAD_ERROR, EnumC0672y5.BN_INSTANCE_RELOAD_ERROR));
        this.f26038n.put(C0.LOAD_AD_NO_FILL, new a(null, EnumC0672y5.BN_INSTANCE_LOAD_NO_FILL));
        this.f26038n.put(C0.RELOAD_AD_NO_FILL, new a(null, EnumC0672y5.BN_INSTANCE_RELOAD_NO_FILL));
        this.f26038n.put(C0.AD_FORMAT_CAPPED, new a(EnumC0672y5.BN_AD_UNIT_CAPPED, null));
        this.f26038n.put(C0.COLLECT_TOKEN, new a(EnumC0672y5.BN_COLLECT_TOKENS, null));
        this.f26038n.put(C0.COLLECT_TOKENS_COMPLETED, new a(EnumC0672y5.BN_COLLECT_TOKENS_COMPLETED, null));
        this.f26038n.put(C0.COLLECT_TOKENS_FAILED, new a(EnumC0672y5.BN_COLLECT_TOKENS_FAILED, null));
        this.f26038n.put(C0.INSTANCE_COLLECT_TOKEN, new a(EnumC0672y5.BN_INSTANCE_COLLECT_TOKEN, null));
        Map<C0, a> map3 = this.f26038n;
        C0 c5 = C0.INSTANCE_COLLECT_TOKEN_SUCCESS;
        EnumC0672y5 enumC0672y6 = EnumC0672y5.BN_INSTANCE_COLLECT_TOKEN_SUCCESS;
        map3.put(c5, new a(enumC0672y6, enumC0672y6));
        Map<C0, a> map4 = this.f26038n;
        C0 c10 = C0.INSTANCE_COLLECT_TOKEN_FAILED;
        EnumC0672y5 enumC0672y7 = EnumC0672y5.BN_INSTANCE_COLLECT_TOKEN_FAILED;
        map4.put(c10, new a(enumC0672y7, enumC0672y7));
        Map<C0, a> map5 = this.f26038n;
        C0 c11 = C0.INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        EnumC0672y5 enumC0672y8 = EnumC0672y5.BN_INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        map5.put(c11, new a(enumC0672y8, enumC0672y8));
        this.f26038n.put(C0.DESTROY_AD, new a(EnumC0672y5.BN_DESTROY, EnumC0672y5.BN_INSTANCE_DESTROY));
        this.f26038n.put(C0.SKIP_RELOAD_AD, new a(EnumC0672y5.BN_SKIP_RELOAD, null));
        this.f26038n.put(C0.AD_LEFT_APPLICATION, new a(EnumC0672y5.BN_CALLBACK_LEAVE_APP, EnumC0672y5.BN_INSTANCE_LEAVE_APP));
        this.f26038n.put(C0.AD_PRESENT_SCREEN, new a(EnumC0672y5.BN_CALLBACK_PRESENT_SCREEN, EnumC0672y5.BN_INSTANCE_PRESENT_SCREEN));
        this.f26038n.put(C0.AD_DISMISS_SCREEN, new a(EnumC0672y5.BN_CALLBACK_DISMISS_SCREEN, EnumC0672y5.BN_INSTANCE_DISMISS_SCREEN));
        this.f26038n.put(C0.AD_VIEW_BOUND, new a(EnumC0672y5.BN_BOUND, EnumC0672y5.BN_INSTANCE_BOUND));
        this.f26038n.put(C0.PAUSE_AD, new a(EnumC0672y5.BN_REFRESH_PAUSE, null));
        this.f26038n.put(C0.RESUME_AD, new a(EnumC0672y5.BN_REFRESH_RESUME, null));
        this.f26038n.put(C0.OPERATIONAL_SET_CONFIGURATIONS, new a(EnumC0672y5.BN_SET_CONFIGURATION, null));
        Map<C0, a> map6 = this.f26038n;
        C0 c12 = C0.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING;
        EnumC0672y5 enumC0672y9 = EnumC0672y5.TROUBLESHOOTING_BN_PROVIDER_SETTINGS_MISSING;
        map6.put(c12, new a(enumC0672y9, enumC0672y9));
        Map<C0, a> map7 = this.f26038n;
        C0 c13 = C0.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS;
        EnumC0672y5 enumC0672y10 = EnumC0672y5.TROUBLESHOOTING_BN_UNEXPECTED_INIT_SUCCESS;
        map7.put(c13, new a(enumC0672y10, enumC0672y10));
        Map<C0, a> map8 = this.f26038n;
        C0 c14 = C0.TROUBLESHOOT_UNEXPECTED_INIT_FAILED;
        EnumC0672y5 enumC0672y11 = EnumC0672y5.TROUBLESHOOTING_BN_UNEXPECTED_INIT_FAILED;
        map8.put(c14, new a(enumC0672y11, enumC0672y11));
        Map<C0, a> map9 = this.f26038n;
        C0 c15 = C0.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS;
        EnumC0672y5 enumC0672y12 = EnumC0672y5.TROUBLESHOOTING_BN_UNEXPECTED_AUCTION_SUCCESS;
        map9.put(c15, new a(enumC0672y12, enumC0672y12));
        Map<C0, a> map10 = this.f26038n;
        C0 c16 = C0.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED;
        EnumC0672y5 enumC0672y13 = EnumC0672y5.TROUBLESHOOTING_BN_UNEXPECTED_AUCTION_FAILED;
        map10.put(c16, new a(enumC0672y13, enumC0672y13));
        Map<C0, a> map11 = this.f26038n;
        C0 c17 = C0.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS;
        EnumC0672y5 enumC0672y14 = EnumC0672y5.TROUBLESHOOTING_BN_UNEXPECTED_LOAD_SUCCESS;
        map11.put(c17, new a(enumC0672y14, enumC0672y14));
        Map<C0, a> map12 = this.f26038n;
        C0 c18 = C0.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED;
        EnumC0672y5 enumC0672y15 = EnumC0672y5.TROUBLESHOOTING_BN_UNEXPECTED_LOAD_FAILED;
        map12.put(c18, new a(enumC0672y15, enumC0672y15));
        Map<C0, a> map13 = this.f26038n;
        C0 c19 = C0.TROUBLESHOOT_UNEXPECTED_RELOAD_SUCCESS;
        EnumC0672y5 enumC0672y16 = EnumC0672y5.TROUBLESHOOTING_BN_UNEXPECTED_RELOAD_SUCCESS;
        map13.put(c19, new a(enumC0672y16, enumC0672y16));
        Map<C0, a> map14 = this.f26038n;
        C0 c20 = C0.TROUBLESHOOT_UNEXPECTED_RELOAD_FAILED;
        EnumC0672y5 enumC0672y17 = EnumC0672y5.TROUBLESHOOTING_BN_UNEXPECTED_RELOAD_FAILED;
        map14.put(c20, new a(enumC0672y17, enumC0672y17));
        Map<C0, a> map15 = this.f26038n;
        C0 c21 = C0.TROUBLESHOOT_UNEXPECTED_TIMEOUT;
        EnumC0672y5 enumC0672y18 = EnumC0672y5.TROUBLESHOOTING_BN_UNEXPECTED_TIMEOUT;
        map15.put(c21, new a(enumC0672y18, enumC0672y18));
        Map<C0, a> map16 = this.f26038n;
        C0 c22 = C0.TROUBLESHOOT_UNEXPECTED_OPENED;
        EnumC0672y5 enumC0672y19 = EnumC0672y5.TROUBLESHOOTING_BN_UNEXPECTED_OPENED;
        map16.put(c22, new a(enumC0672y19, enumC0672y19));
        Map<C0, a> map17 = this.f26038n;
        C0 c23 = C0.TROUBLESHOOT_INTERNAL_ERROR;
        EnumC0672y5 enumC0672y20 = EnumC0672y5.TROUBLESHOOTING_BN_INTERNAL_ERROR;
        map17.put(c23, new a(enumC0672y20, enumC0672y20));
        Map<C0, a> map18 = this.f26038n;
        C0 c24 = C0.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        EnumC0672y5 enumC0672y21 = EnumC0672y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        map18.put(c24, new a(enumC0672y21, enumC0672y21));
        Map<C0, a> map19 = this.f26038n;
        C0 c25 = C0.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        EnumC0672y5 enumC0672y22 = EnumC0672y5.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        map19.put(c25, new a(enumC0672y22, enumC0672y22));
        this.f26038n.put(C0.TROUBLESHOOT_NOTIFICATION_ERROR, new a(EnumC0672y5.TROUBLESHOOTING_BN_NOTIFICATIONS_ERROR, null));
        this.f26038n.put(C0.TROUBLESHOOT_BN_RELOAD_EXCEPTION, new a(EnumC0672y5.TROUBLESHOOTING_BN_RELOAD_EXCEPTION, null));
        this.f26038n.put(C0.TROUBLESHOOT_IMPRESSION_TIMEOUT, new a(EnumC0672y5.TROUBLESHOOTING_BN_IMPRESSION_TIMEOUT_REACHED, null));
        this.f26038n.put(C0.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_PAUSE, new a(EnumC0672y5.TROUBLESHOOT_BN_BANNER_REFRESH_TRIGGER_PAUSE, null));
        this.f26038n.put(C0.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_RESUME, new a(EnumC0672y5.TROUBLESHOOT_BN_BANNER_REFRESH_TRIGGER_RESUME, null));
        Map<C0, a> map20 = this.f26038n;
        C0 c26 = C0.TROUBLESHOOT_BANNER_REFRESH_TRANSITION;
        EnumC0672y5 enumC0672y23 = EnumC0672y5.TROUBLESHOOT_BN_BANNER_REFRESH_TRANSITION;
        map20.put(c26, new a(enumC0672y23, enumC0672y23));
        Map<C0, a> map21 = this.f26038n;
        C0 c27 = C0.TROUBLESHOOT_BANNER_REFRESH_ANIMATED;
        EnumC0672y5 enumC0672y24 = EnumC0672y5.TROUBLESHOOT_BN_BANNER_REFRESH_ANIMATED;
        map21.put(c27, new a(enumC0672y24, enumC0672y24));
        Map<C0, a> map22 = this.f26038n;
        C0 c28 = C0.TROUBLESHOOT_ILLEGAL_STATE;
        EnumC0672y5 enumC0672y25 = EnumC0672y5.TROUBLESHOOTING_BN_ILLEGAL_STATE;
        map22.put(c28, new a(enumC0672y25, enumC0672y25));
        this.f26038n.put(C0.TROUBLESHOOT_RELOAD, new a(EnumC0672y5.TROUBLESHOOTING_BN_RELOAD, null));
        Map<C0, a> map23 = this.f26038n;
        C0 c29 = C0.TROUBLESHOOT_LOAD_SKIPPED;
        EnumC0672y5 enumC0672y26 = EnumC0672y5.TROUBLESHOOTING_BN_LOAD_SKIPPED;
        map23.put(c29, new a(enumC0672y26, enumC0672y26));
        this.f26038n.put(C0.TROUBLESHOOT_ILR_REVENUE, new a(EnumC0672y5.TROUBLESHOOTING_BN_ILR_REVENUE, null));
    }
}
