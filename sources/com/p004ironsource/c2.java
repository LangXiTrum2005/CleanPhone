package com.p004ironsource;

import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.logger.IronLog;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class c2 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f24482p = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IronSource.AD_UNIT f24483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f24484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b2 f24485c;
    private final u7 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public si f24486e;
    public bn f;
    public gw g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public q4 f24487h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C3369m0 f24488i;
    public lw j;
    public xp k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map<z1, a> f24489l;
    private Map<z1, a> m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Map<z1, a> f24490n;
    private Map<z1, a> o;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f24491a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f24492b;

        public a(ac acVar, ac acVar2) {
            if (acVar != null) {
                this.f24491a = acVar.getId();
            } else {
                this.f24491a = -1;
            }
            if (acVar2 != null) {
                this.f24492b = acVar2.getId();
            } else {
                this.f24492b = -1;
            }
        }

        public int a(b bVar) {
            return b.MEDIATION.equals(bVar) ? this.f24491a : this.f24492b;
        }
    }

    public enum b {
        MEDIATION,
        PROVIDER
    }

    public c2(IronSource.AD_UNIT ad_unit, b bVar, b2 b2Var) {
        this(ad_unit, bVar, b2Var, a(ad_unit));
    }

    private int a(z1 z1Var) {
        a aVar;
        b bVar;
        try {
            if (IronSource.AD_UNIT.INTERSTITIAL.equals(this.f24483a) && this.f24489l.containsKey(z1Var)) {
                aVar = this.f24489l.get(z1Var);
                bVar = this.f24484b;
            } else if (IronSource.AD_UNIT.REWARDED_VIDEO.equals(this.f24483a) && this.m.containsKey(z1Var)) {
                aVar = this.m.get(z1Var);
                bVar = this.f24484b;
            } else if (IronSource.AD_UNIT.BANNER.equals(this.f24483a) && this.f24490n.containsKey(z1Var)) {
                aVar = this.f24490n.get(z1Var);
                bVar = this.f24484b;
            } else {
                if (!IronSource.AD_UNIT.NATIVE_AD.equals(this.f24483a) || !this.o.containsKey(z1Var)) {
                    return -1;
                }
                aVar = this.o.get(z1Var);
                bVar = this.f24484b;
            }
            return aVar.a(bVar);
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return -1;
        }
    }

    private void d() {
        HashMap map = new HashMap();
        this.o = map;
        map.put(z1.INIT_STARTED, new a(ac.NT_MANAGER_INIT_STARTED, null));
        this.o.put(z1.INIT_ENDED, new a(ac.NT_MANAGER_INIT_ENDED, null));
        this.o.put(z1.PLACEMENT_CAPPED, new a(ac.NT_PLACEMENT_CAPPED, null));
        this.o.put(z1.AUCTION_REQUEST, new a(ac.NT_AUCTION_REQUEST, null));
        this.o.put(z1.AUCTION_SUCCESS, new a(ac.NT_AUCTION_SUCCESS, null));
        Map<z1, a> map2 = this.o;
        z1 z1Var = z1.AUCTION_FAILED;
        ac acVar = ac.NT_AUCTION_FAILED;
        map2.put(z1Var, new a(acVar, null));
        this.o.put(z1.AUCTION_FAILED_NO_CANDIDATES, new a(acVar, null));
        this.o.put(z1.AUCTION_REQUEST_WATERFALL, new a(ac.NT_AUCTION_REQUEST_WATERFALL, null));
        this.o.put(z1.AUCTION_RESULT_WATERFALL, new a(ac.NT_AUCTION_RESPONSE_WATERFALL, null));
        this.o.put(z1.INIT_SUCCESS, new a(null, null));
        this.o.put(z1.INIT_FAILED, new a(null, null));
        this.o.put(z1.AD_OPENED, new a(ac.NT_CALLBACK_SHOW, ac.NT_INSTANCE_SHOW));
        this.o.put(z1.AD_CLICKED, new a(ac.NT_CALLBACK_CLICK, ac.NT_INSTANCE_CLICK));
        this.o.put(z1.LOAD_AD, new a(ac.NT_LOAD, ac.NT_INSTANCE_LOAD));
        this.o.put(z1.LOAD_AD_SUCCESS, new a(ac.NT_CALLBACK_LOAD_SUCCESS, ac.NT_INSTANCE_LOAD_SUCCESS));
        this.o.put(z1.LOAD_AD_FAILED_WITH_REASON, new a(ac.NT_CALLBACK_LOAD_ERROR, ac.NT_INSTANCE_LOAD_ERROR));
        this.o.put(z1.LOAD_AD_NO_FILL, new a(null, ac.NT_INSTANCE_LOAD_NO_FILL));
        this.o.put(z1.AD_FORMAT_CAPPED, new a(ac.NT_AD_UNIT_CAPPED, null));
        Map<z1, a> map3 = this.o;
        z1 z1Var2 = z1.COLLECT_TOKEN;
        ac acVar2 = ac.NT_COLLECT_TOKENS;
        ac acVar3 = ac.NT_INSTANCE_COLLECT_TOKEN;
        map3.put(z1Var2, new a(acVar2, acVar3));
        this.o.put(z1.COLLECT_TOKENS_COMPLETED, new a(ac.NT_COLLECT_TOKENS_COMPLETED, null));
        this.o.put(z1.COLLECT_TOKENS_FAILED, new a(ac.NT_COLLECT_TOKENS_FAILED, null));
        this.o.put(z1.INSTANCE_COLLECT_TOKEN, new a(acVar3, null));
        Map<z1, a> map4 = this.o;
        z1 z1Var3 = z1.INSTANCE_COLLECT_TOKEN_SUCCESS;
        ac acVar4 = ac.NT_INSTANCE_COLLECT_TOKEN_SUCCESS;
        map4.put(z1Var3, new a(acVar4, acVar4));
        Map<z1, a> map5 = this.o;
        z1 z1Var4 = z1.INSTANCE_COLLECT_TOKEN_FAILED;
        ac acVar5 = ac.NT_INSTANCE_COLLECT_TOKEN_FAILED;
        map5.put(z1Var4, new a(acVar5, acVar5));
        Map<z1, a> map6 = this.o;
        z1 z1Var5 = z1.INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        ac acVar6 = ac.NT_INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        map6.put(z1Var5, new a(acVar6, acVar6));
        this.o.put(z1.DESTROY_AD, new a(ac.NT_DESTROY, ac.NT_INSTANCE_DESTROY));
        Map<z1, a> map7 = this.o;
        z1 z1Var6 = z1.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING;
        ac acVar7 = ac.TROUBLESHOOTING_NT_PROVIDER_SETTINGS_MISSING;
        map7.put(z1Var6, new a(acVar7, acVar7));
        Map<z1, a> map8 = this.o;
        z1 z1Var7 = z1.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS;
        ac acVar8 = ac.TROUBLESHOOTING_NT_UNEXPECTED_INIT_SUCCESS;
        map8.put(z1Var7, new a(acVar8, acVar8));
        Map<z1, a> map9 = this.o;
        z1 z1Var8 = z1.TROUBLESHOOT_UNEXPECTED_INIT_FAILED;
        ac acVar9 = ac.TROUBLESHOOTING_NT_UNEXPECTED_INIT_FAILED;
        map9.put(z1Var8, new a(acVar9, acVar9));
        Map<z1, a> map10 = this.o;
        z1 z1Var9 = z1.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS;
        ac acVar10 = ac.TROUBLESHOOTING_NT_UNEXPECTED_AUCTION_SUCCESS;
        map10.put(z1Var9, new a(acVar10, acVar10));
        Map<z1, a> map11 = this.o;
        z1 z1Var10 = z1.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED;
        ac acVar11 = ac.TROUBLESHOOTING_NT_UNEXPECTED_AUCTION_FAILED;
        map11.put(z1Var10, new a(acVar11, acVar11));
        Map<z1, a> map12 = this.o;
        z1 z1Var11 = z1.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS;
        ac acVar12 = ac.TROUBLESHOOTING_NT_UNEXPECTED_LOAD_SUCCESS;
        map12.put(z1Var11, new a(acVar12, acVar12));
        Map<z1, a> map13 = this.o;
        z1 z1Var12 = z1.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED;
        ac acVar13 = ac.TROUBLESHOOTING_NT_UNEXPECTED_LOAD_FAILED;
        map13.put(z1Var12, new a(acVar13, acVar13));
        Map<z1, a> map14 = this.o;
        z1 z1Var13 = z1.TROUBLESHOOT_UNEXPECTED_TIMEOUT;
        ac acVar14 = ac.TROUBLESHOOTING_NT_UNEXPECTED_TIMEOUT;
        map14.put(z1Var13, new a(acVar14, acVar14));
        Map<z1, a> map15 = this.o;
        z1 z1Var14 = z1.TROUBLESHOOT_UNEXPECTED_OPENED;
        ac acVar15 = ac.TROUBLESHOOTING_NT_UNEXPECTED_OPENED;
        map15.put(z1Var14, new a(acVar15, acVar15));
        Map<z1, a> map16 = this.o;
        z1 z1Var15 = z1.TROUBLESHOOT_INTERNAL_ERROR;
        ac acVar16 = ac.TROUBLESHOOTING_NT_INTERNAL_ERROR;
        map16.put(z1Var15, new a(acVar16, acVar16));
        Map<z1, a> map17 = this.o;
        z1 z1Var16 = z1.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        ac acVar17 = ac.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        map17.put(z1Var16, new a(acVar17, acVar17));
        Map<z1, a> map18 = this.o;
        z1 z1Var17 = z1.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        ac acVar18 = ac.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        map18.put(z1Var17, new a(acVar18, acVar18));
        this.o.put(z1.TROUBLESHOOT_NOTIFICATION_ERROR, new a(ac.TROUBLESHOOTING_NT_NOTIFICATIONS_ERROR, null));
    }

    public void b() {
        c();
        e();
        a();
        d();
    }

    public void c() {
        HashMap map = new HashMap();
        this.f24489l = map;
        map.put(z1.INIT_STARTED, new a(ac.IS_MANAGER_INIT_STARTED, null));
        this.f24489l.put(z1.INIT_ENDED, new a(ac.IS_MANAGER_INIT_ENDED, null));
        this.f24489l.put(z1.SESSION_CAPPED, new a(null, ac.IS_CAP_SESSION));
        this.f24489l.put(z1.PLACEMENT_CAPPED, new a(ac.IS_CAP_PLACEMENT, null));
        this.f24489l.put(z1.CHECK_PLACEMENT_CAPPED, new a(ac.IS_CHECK_PLACEMENT_CAPPED, null));
        this.f24489l.put(z1.AUCTION_REQUEST, new a(ac.IS_AUCTION_REQUEST, null));
        this.f24489l.put(z1.AUCTION_SUCCESS, new a(ac.IS_AUCTION_SUCCESS, null));
        Map<z1, a> map2 = this.f24489l;
        z1 z1Var = z1.AUCTION_FAILED;
        ac acVar = ac.IS_AUCTION_FAILED;
        map2.put(z1Var, new a(acVar, null));
        this.f24489l.put(z1.AUCTION_FAILED_NO_CANDIDATES, new a(acVar, null));
        this.f24489l.put(z1.AUCTION_REQUEST_WATERFALL, new a(ac.IS_AUCTION_REQUEST_WATERFALL, null));
        this.f24489l.put(z1.AUCTION_RESULT_WATERFALL, new a(ac.IS_RESULT_WATERFALL, null));
        this.f24489l.put(z1.INIT_SUCCESS, new a(null, null));
        this.f24489l.put(z1.INIT_FAILED, new a(null, null));
        this.f24489l.put(z1.SHOW_AD_SUCCESS, new a(ac.IS_CALLBACK_AD_DISPLAYED, ac.IS_INSTANCE_SHOW_SUCCESS));
        this.f24489l.put(z1.AD_OPENED, new a(null, ac.IS_INSTANCE_OPENED));
        this.f24489l.put(z1.AD_CLOSED, new a(ac.IS_CALLBACK_AD_CLOSED, ac.IS_INSTANCE_CLOSED));
        this.f24489l.put(z1.AD_CLICKED, new a(ac.IS_CALLBACK_AD_CLICKED, ac.IS_INSTANCE_CLICKED));
        this.f24489l.put(z1.AD_INFO_CHANGED, new a(ac.IS_CALLBACK_AD_INFO_CHANGED, null));
        this.f24489l.put(z1.LOAD_AD, new a(ac.IS_LOAD_CALLED, ac.IS_INSTANCE_LOAD));
        this.f24489l.put(z1.LOAD_AD_SUCCESS, new a(ac.IS_CALLBACK_LOAD_SUCCESS, ac.IS_INSTANCE_LOAD_SUCCESS));
        this.f24489l.put(z1.LOAD_AD_FAILED_WITH_REASON, new a(ac.IS_CALLBACK_LOAD_ERROR, ac.IS_INSTANCE_LOAD_FAILED));
        this.f24489l.put(z1.LOAD_AD_NO_FILL, new a(null, ac.IS_INSTANCE_LOAD_NO_FILL));
        this.f24489l.put(z1.SHOW_AD, new a(ac.IS_SHOW_CALLED, ac.IS_INSTANCE_SHOW));
        this.f24489l.put(z1.SHOW_AD_FAILED, new a(ac.IS_CALLBACK_AD_SHOW_ERROR, ac.IS_INSTANCE_SHOW_FAILED));
        this.f24489l.put(z1.AD_FORMAT_CAPPED, new a(ac.IS_AD_FORMAT_CAPPED, null));
        this.f24489l.put(z1.AD_UNIT_CAPPED, new a(ac.IS_AD_UNIT_CAPPED, null));
        this.f24489l.put(z1.COLLECT_TOKEN, new a(ac.IS_COLLECT_TOKENS, null));
        this.f24489l.put(z1.COLLECT_TOKENS_COMPLETED, new a(ac.IS_COLLECT_TOKENS_COMPLETED, null));
        this.f24489l.put(z1.COLLECT_TOKENS_FAILED, new a(ac.IS_COLLECT_TOKENS_FAILED, null));
        this.f24489l.put(z1.INSTANCE_COLLECT_TOKEN, new a(ac.IS_INSTANCE_COLLECT_TOKEN, null));
        this.f24489l.put(z1.INSTANCE_COLLECT_TOKEN_SUCCESS, new a(ac.IS_INSTANCE_COLLECT_TOKEN_SUCCESS, null));
        this.f24489l.put(z1.INSTANCE_COLLECT_TOKEN_FAILED, new a(ac.IS_INSTANCE_COLLECT_TOKEN_FAILED, null));
        this.f24489l.put(z1.INSTANCE_COLLECT_TOKEN_TIMED_OUT, new a(ac.IS_INSTANCE_COLLECT_TOKEN_TIMED_OUT, null));
        this.f24489l.put(z1.AD_READY_TRUE, new a(ac.IS_CHECK_READY_TRUE, null));
        this.f24489l.put(z1.AD_READY_FALSE, new a(ac.IS_CHECK_READY_FALSE, null));
        this.f24489l.put(z1.OPERATIONAL_LOAD_AD, new a(ac.IS_OPERATIONAL_LOAD_AD, null));
        this.f24489l.put(z1.OPERATIONAL_LOAD_SUCCESS, new a(ac.IS_OPERATIONAL_LOAD_SUCCESS, null));
        this.f24489l.put(z1.OPERATIONAL_LOAD_FAILED, new a(ac.IS_OPERATIONAL_LOAD_FAILED, null));
        this.f24489l.put(z1.OPERATIONAL_SET_CONFIGURATIONS, new a(ac.IS_SET_CONFIGURATION, null));
        Map<z1, a> map3 = this.f24489l;
        z1 z1Var2 = z1.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING;
        ac acVar2 = ac.TROUBLESHOOTING_IS_PROVIDER_SETTINGS_MISSING;
        map3.put(z1Var2, new a(acVar2, acVar2));
        Map<z1, a> map4 = this.f24489l;
        z1 z1Var3 = z1.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS;
        ac acVar3 = ac.TROUBLESHOOTING_IS_UNEXPECTED_INIT_SUCCESS;
        map4.put(z1Var3, new a(acVar3, acVar3));
        Map<z1, a> map5 = this.f24489l;
        z1 z1Var4 = z1.TROUBLESHOOT_UNEXPECTED_INIT_FAILED;
        ac acVar4 = ac.TROUBLESHOOTING_IS_UNEXPECTED_INIT_FAILED;
        map5.put(z1Var4, new a(acVar4, acVar4));
        Map<z1, a> map6 = this.f24489l;
        z1 z1Var5 = z1.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS;
        ac acVar5 = ac.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_SUCCESS;
        map6.put(z1Var5, new a(acVar5, acVar5));
        Map<z1, a> map7 = this.f24489l;
        z1 z1Var6 = z1.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED;
        ac acVar6 = ac.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_FAILED;
        map7.put(z1Var6, new a(acVar6, acVar6));
        Map<z1, a> map8 = this.f24489l;
        z1 z1Var7 = z1.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS;
        ac acVar7 = ac.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_SUCCESS;
        map8.put(z1Var7, new a(acVar7, acVar7));
        Map<z1, a> map9 = this.f24489l;
        z1 z1Var8 = z1.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED;
        ac acVar8 = ac.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_FAILED;
        map9.put(z1Var8, new a(acVar8, acVar8));
        Map<z1, a> map10 = this.f24489l;
        z1 z1Var9 = z1.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED;
        ac acVar9 = ac.TROUBLESHOOTING_IS_UNEXPECTED_SHOW_FAILED;
        map10.put(z1Var9, new a(acVar9, acVar9));
        Map<z1, a> map11 = this.f24489l;
        z1 z1Var10 = z1.TROUBLESHOOT_UNEXPECTED_CLOSED;
        ac acVar10 = ac.TROUBLESHOOTING_IS_UNEXPECTED_CLOSED;
        map11.put(z1Var10, new a(acVar10, acVar10));
        Map<z1, a> map12 = this.f24489l;
        z1 z1Var11 = z1.TROUBLESHOOT_UNEXPECTED_TIMEOUT;
        ac acVar11 = ac.TROUBLESHOOTING_IS_UNEXPECTED_TIMEOUT;
        map12.put(z1Var11, new a(acVar11, acVar11));
        Map<z1, a> map13 = this.f24489l;
        z1 z1Var12 = z1.TROUBLESHOOT_INTERNAL_ERROR;
        ac acVar12 = ac.TROUBLESHOOTING_IS_INTERNAL_ERROR;
        map13.put(z1Var12, new a(acVar12, acVar12));
        Map<z1, a> map14 = this.f24489l;
        z1 z1Var13 = z1.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        ac acVar13 = ac.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        map14.put(z1Var13, new a(acVar13, acVar13));
        Map<z1, a> map15 = this.f24489l;
        z1 z1Var14 = z1.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        ac acVar14 = ac.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        map15.put(z1Var14, new a(acVar14, acVar14));
        this.f24489l.put(z1.TROUBLESHOOT_NOTIFICATION_ERROR, new a(ac.TROUBLESHOOTING_IS_NOTIFICATIONS_ERROR, null));
        Map<z1, a> map16 = this.f24489l;
        z1 z1Var15 = z1.TROUBLESHOOT_AD_EXPIRED;
        ac acVar15 = ac.TROUBLESHOOTING_IS_AD_EXPIRED;
        map16.put(z1Var15, new a(acVar15, acVar15));
        this.f24489l.put(z1.TROUBLESHOOT_LOAD, new a(ac.TROUBLESHOOTING_IS_LOAD, null));
        this.f24489l.put(z1.TROUBLESHOOT_LOAD_WHILE_LOADED, new a(ac.TROUBLESHOOTING_IS_LOAD_WHILE_LOADED, null));
        this.f24489l.put(z1.TROUBLESHOOT_LOAD_SUCCESS, new a(ac.TROUBLESHOOTING_IS_LOAD_SUCCESS, null));
        this.f24489l.put(z1.TROUBLESHOOT_LOAD_FAILED, new a(ac.TROUBLESHOOTING_IS_LOAD_FAILED, null));
        this.f24489l.put(z1.TROUBLESHOOT_SHOW, new a(ac.TROUBLESHOOTING_IS_SHOW, null));
        this.f24489l.put(z1.TROUBLESHOOT_SHOW_SUCCESS, new a(ac.TROUBLESHOOTING_IS_SHOW_SUCCESS, null));
        this.f24489l.put(z1.TROUBLESHOOT_SHOW_FAILED, new a(ac.TROUBLESHOOTING_IS_SHOW_FAILED, null));
        Map<z1, a> map17 = this.f24489l;
        z1 z1Var16 = z1.TROUBLESHOOT_ILLEGAL_STATE;
        ac acVar16 = ac.TROUBLESHOOTING_IS_ILLEGAL_STATE;
        map17.put(z1Var16, new a(acVar16, acVar16));
        this.f24489l.put(z1.TROUBLESHOOT_AD_INFO_CHANGED, new a(ac.TROUBLESHOOT_IS_AD_INFO_CHANGED, null));
        this.f24489l.put(z1.TROUBLESHOOT_DISPOSE, new a(ac.TROUBLESHOOTING_IS_DISPOSE, null));
    }

    public void e() {
        HashMap map = new HashMap();
        this.m = map;
        map.put(z1.INIT_STARTED, new a(ac.RV_MANAGER_INIT_STARTED, null));
        this.m.put(z1.INIT_ENDED, new a(ac.RV_MANAGER_INIT_ENDED, null));
        this.m.put(z1.SESSION_CAPPED, new a(null, ac.RV_CAP_SESSION));
        this.m.put(z1.PLACEMENT_CAPPED, new a(ac.RV_CAP_PLACEMENT, null));
        this.m.put(z1.CHECK_PLACEMENT_CAPPED, new a(ac.RV_CHECK_PLACEMENT_CAPPED, null));
        this.m.put(z1.AUCTION_REQUEST, new a(ac.RV_AUCTION_REQUEST, null));
        this.m.put(z1.AUCTION_SUCCESS, new a(ac.RV_AUCTION_SUCCESS, null));
        Map<z1, a> map2 = this.m;
        z1 z1Var = z1.AUCTION_FAILED;
        ac acVar = ac.RV_AUCTION_FAILED;
        map2.put(z1Var, new a(acVar, null));
        this.m.put(z1.AUCTION_FAILED_NO_CANDIDATES, new a(acVar, null));
        this.m.put(z1.AUCTION_REQUEST_WATERFALL, new a(ac.RV_AUCTION_REQUEST_WATERFALL, null));
        this.m.put(z1.AUCTION_RESULT_WATERFALL, new a(ac.RV_AUCTION_RESPONSE_WATERFALL, null));
        this.m.put(z1.INIT_SUCCESS, new a(null, null));
        this.m.put(z1.INIT_FAILED, new a(null, null));
        this.m.put(z1.AD_VISIBLE, new a(null, ac.RV_INSTANCE_VISIBLE));
        this.m.put(z1.SHOW_AD_SUCCESS, new a(ac.RV_CALLBACK_AD_DISPLAYED, null));
        this.m.put(z1.AD_OPENED, new a(null, ac.RV_BUSINESS_INSTANCE_OPENED));
        this.m.put(z1.AD_CLOSED, new a(null, ac.RV_INSTANCE_CLOSED));
        this.m.put(z1.AD_STARTED, new a(null, ac.RV_INSTANCE_STARTED));
        this.m.put(z1.AD_ENDED, new a(null, ac.RV_INSTANCE_ENDED));
        this.m.put(z1.AD_CLICKED, new a(ac.RV_CALLBACK_AD_CLICKED, ac.RV_BUSINESS_INSTANCE_CLICKED));
        this.m.put(z1.AD_INFO_CHANGED, new a(ac.RV_CALLBACK_AD_INFO_CHANGED, null));
        this.m.put(z1.AD_REWARDED, new a(null, ac.RV_BUSINESS_INSTANCE_REWARDED));
        this.m.put(z1.AD_AVAILABILITY_CHANGED_TRUE, new a(ac.RV_CALLBACK_AVAILABILITY_TRUE, ac.RV_INSTANCE_AVAILABILITY_TRUE));
        this.m.put(z1.AD_AVAILABILITY_CHANGED_FALSE, new a(ac.RV_CALLBACK_AVAILABILITY_FALSE, ac.RV_INSTANCE_AVAILABILITY_FALSE));
        this.m.put(z1.LOAD_AD, new a(ac.RV_BUSINESS_MEDIATION_LOAD, ac.RV_BUSINESS_INSTANCE_LOAD));
        this.m.put(z1.LOAD_AD_SUCCESS, new a(ac.RV_BUSINESS_MEDIATION_LOAD_SUCCESS, ac.RV_BUSINESS_INSTANCE_LOAD_SUCCESS));
        this.m.put(z1.LOAD_AD_FAILED, new a(null, ac.RV_INSTANCE_LOAD_FAILED));
        this.m.put(z1.LOAD_AD_FAILED_WITH_REASON, new a(ac.RV_MEDIATION_LOAD_ERROR, ac.RV_INSTANCE_LOAD_FAILED_REASON));
        this.m.put(z1.LOAD_AD_NO_FILL, new a(null, ac.RV_INSTANCE_LOAD_NO_FILL));
        this.m.put(z1.SHOW_AD, new a(ac.RV_API_SHOW_CALLED, ac.RV_INSTANCE_SHOW));
        this.m.put(z1.SHOW_AD_CHANCE, new a(null, ac.RV_INSTANCE_SHOW_CHANCE));
        this.m.put(z1.SHOW_AD_FAILED, new a(ac.RV_CALLBACK_SHOW_FAILED, ac.RV_INSTANCE_SHOW_FAILED));
        this.m.put(z1.AD_FORMAT_CAPPED, new a(ac.RV_AD_UNIT_CAPPED, null));
        this.m.put(z1.COLLECT_TOKEN, new a(ac.RV_COLLECT_TOKENS, null));
        this.m.put(z1.COLLECT_TOKENS_COMPLETED, new a(ac.RV_COLLECT_TOKENS_COMPLETED, null));
        this.m.put(z1.COLLECT_TOKENS_FAILED, new a(ac.RV_COLLECT_TOKENS_FAILED, null));
        this.m.put(z1.INSTANCE_COLLECT_TOKEN, new a(ac.RV_INSTANCE_COLLECT_TOKEN, null));
        Map<z1, a> map3 = this.m;
        z1 z1Var2 = z1.INSTANCE_COLLECT_TOKEN_SUCCESS;
        ac acVar2 = ac.RV_INSTANCE_COLLECT_TOKEN_SUCCESS;
        map3.put(z1Var2, new a(acVar2, acVar2));
        Map<z1, a> map4 = this.m;
        z1 z1Var3 = z1.INSTANCE_COLLECT_TOKEN_FAILED;
        ac acVar3 = ac.RV_INSTANCE_COLLECT_TOKEN_FAILED;
        map4.put(z1Var3, new a(acVar3, acVar3));
        Map<z1, a> map5 = this.m;
        z1 z1Var4 = z1.INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        ac acVar4 = ac.RV_INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        map5.put(z1Var4, new a(acVar4, acVar4));
        this.m.put(z1.AD_READY_TRUE, new a(ac.RV_CHECK_READY_TRUE, null));
        this.m.put(z1.AD_READY_FALSE, new a(ac.RV_CHECK_READY_FALSE, null));
        this.m.put(z1.OPERATIONAL_LOAD_AD, new a(ac.RV_OPERATIONAL_LOAD_AD, null));
        this.m.put(z1.OPERATIONAL_LOAD_SUCCESS, new a(ac.RV_OPERATIONAL_LOAD_SUCCESS, null));
        this.m.put(z1.OPERATIONAL_LOAD_FAILED, new a(ac.RV_OPERATIONAL_LOAD_FAILED, null));
        this.m.put(z1.OPERATIONAL_SET_CONFIGURATIONS, new a(ac.RV_SET_CONFIGURATION, null));
        Map<z1, a> map6 = this.m;
        z1 z1Var5 = z1.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING;
        ac acVar5 = ac.TROUBLESHOOTING_RV_PROVIDER_SETTINGS_MISSING;
        map6.put(z1Var5, new a(acVar5, acVar5));
        Map<z1, a> map7 = this.m;
        z1 z1Var6 = z1.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS;
        ac acVar6 = ac.TROUBLESHOOTING_RV_UNEXPECTED_INIT_SUCCESS;
        map7.put(z1Var6, new a(acVar6, acVar6));
        Map<z1, a> map8 = this.m;
        z1 z1Var7 = z1.TROUBLESHOOT_UNEXPECTED_INIT_FAILED;
        ac acVar7 = ac.TROUBLESHOOTING_RV_UNEXPECTED_INIT_FAILED;
        map8.put(z1Var7, new a(acVar7, acVar7));
        Map<z1, a> map9 = this.m;
        z1 z1Var8 = z1.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS;
        ac acVar8 = ac.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_SUCCESS;
        map9.put(z1Var8, new a(acVar8, acVar8));
        Map<z1, a> map10 = this.m;
        z1 z1Var9 = z1.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED;
        ac acVar9 = ac.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_FAILED;
        map10.put(z1Var9, new a(acVar9, acVar9));
        Map<z1, a> map11 = this.m;
        z1 z1Var10 = z1.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS;
        ac acVar10 = ac.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_SUCCESS;
        map11.put(z1Var10, new a(acVar10, acVar10));
        Map<z1, a> map12 = this.m;
        z1 z1Var11 = z1.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED;
        ac acVar11 = ac.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_FAILED;
        map12.put(z1Var11, new a(acVar11, acVar11));
        Map<z1, a> map13 = this.m;
        z1 z1Var12 = z1.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED;
        ac acVar12 = ac.TROUBLESHOOTING_RV_UNEXPECTED_SHOW_FAILED;
        map13.put(z1Var12, new a(acVar12, acVar12));
        Map<z1, a> map14 = this.m;
        z1 z1Var13 = z1.TROUBLESHOOT_UNEXPECTED_TIMEOUT;
        ac acVar13 = ac.TROUBLESHOOTING_RV_UNEXPECTED_TIMEOUT;
        map14.put(z1Var13, new a(acVar13, acVar13));
        Map<z1, a> map15 = this.m;
        z1 z1Var14 = z1.TROUBLESHOOT_UNEXPECTED_CLOSED;
        ac acVar14 = ac.TROUBLESHOOTING_RV_UNEXPECTED_CLOSED;
        map15.put(z1Var14, new a(acVar14, acVar14));
        Map<z1, a> map16 = this.m;
        z1 z1Var15 = z1.TROUBLESHOOT_LOAD_FAILED;
        ac acVar15 = ac.TROUBLESHOOTING_RV_LOAD_FAILED;
        map16.put(z1Var15, new a(acVar15, acVar15));
        Map<z1, a> map17 = this.m;
        z1 z1Var16 = z1.TROUBLESHOOT_INTERNAL_ERROR;
        ac acVar16 = ac.TROUBLESHOOTING_RV_INTERNAL_ERROR;
        map17.put(z1Var16, new a(acVar16, acVar16));
        Map<z1, a> map18 = this.m;
        z1 z1Var17 = z1.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        ac acVar17 = ac.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        map18.put(z1Var17, new a(acVar17, acVar17));
        Map<z1, a> map19 = this.m;
        z1 z1Var18 = z1.TROUBLESHOOT_WATERFALL_OVERHEAD;
        ac acVar18 = ac.TROUBLESHOOTING_RV_WATERFALL_OVERHEAD;
        map19.put(z1Var18, new a(acVar18, acVar18));
        this.m.put(z1.TROUBLESHOOT_NOTIFICATION_ERROR, new a(ac.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, null));
        Map<z1, a> map20 = this.m;
        z1 z1Var19 = z1.TROUBLESHOOT_AD_EXPIRED;
        ac acVar19 = ac.TROUBLESHOOTING_RV_AD_EXPIRED;
        map20.put(z1Var19, new a(acVar19, acVar19));
        this.m.put(z1.TROUBLESHOOT_LOAD, new a(ac.TROUBLESHOOTING_RV_LOAD, null));
        this.m.put(z1.TROUBLESHOOT_LOAD_WHILE_LOADED, new a(ac.TROUBLESHOOTING_RV_LOAD_WHILE_LOADED, null));
        this.m.put(z1.TROUBLESHOOT_LOAD_SUCCESS, new a(ac.TROUBLESHOOTING_RV_LOAD_SUCCESS, null));
        this.m.put(z1.TROUBLESHOOT_SHOW, new a(ac.TROUBLESHOOTING_RV_SHOW, null));
        this.m.put(z1.TROUBLESHOOT_SHOW_SUCCESS, new a(ac.TROUBLESHOOTING_RV_SHOW_SUCCESS, null));
        this.m.put(z1.TROUBLESHOOT_SHOW_FAILED, new a(ac.TROUBLESHOOTING_RV_SHOW_FAILED, null));
        Map<z1, a> map21 = this.m;
        z1 z1Var20 = z1.TROUBLESHOOT_ILLEGAL_STATE;
        ac acVar20 = ac.TROUBLESHOOTING_RV_ILLEGAL_STATE;
        map21.put(z1Var20, new a(acVar20, acVar20));
        this.m.put(z1.TROUBLESHOOT_AD_INFO_CHANGED, new a(ac.TROUBLESHOOT_RV_AD_INFO_CHANGED, null));
        this.m.put(z1.TROUBLESHOOT_DISPOSE, new a(ac.TROUBLESHOOTING_RV_DISPOSE, null));
    }

    public void f() {
        this.f24485c = null;
        this.g = null;
        this.f24487h = null;
        this.f24486e = null;
        this.f = null;
        this.f24488i = null;
        this.j = null;
        this.k = null;
    }

    public c2(IronSource.AD_UNIT ad_unit, b bVar, b2 b2Var, u7 u7Var) {
        this.f24483a = ad_unit;
        this.f24484b = bVar;
        this.f24485c = b2Var;
        this.d = u7Var == null ? a(ad_unit) : u7Var;
        b();
        this.f24486e = new si(this);
        this.f = new bn(this);
        this.g = new gw(this);
        this.f24487h = new q4(this);
        this.f24488i = new C3369m0(this);
        this.j = new lw(this);
        this.k = new xp(this);
    }

    private static u7 a(IronSource.AD_UNIT ad_unit) {
        return ad_unit.equals(IronSource.AD_UNIT.REWARDED_VIDEO) ? ds.i() : wj.i();
    }

    public void a() {
        HashMap map = new HashMap();
        this.f24490n = map;
        map.put(z1.INIT_STARTED, new a(ac.BN_MANAGER_INIT_STARTED, null));
        this.f24490n.put(z1.INIT_ENDED, new a(ac.BN_MANAGER_INIT_ENDED, null));
        this.f24490n.put(z1.PLACEMENT_CAPPED, new a(ac.BN_PLACEMENT_CAPPED, null));
        this.f24490n.put(z1.AUCTION_REQUEST, new a(ac.BN_AUCTION_REQUEST, null));
        this.f24490n.put(z1.AUCTION_SUCCESS, new a(ac.BN_AUCTION_SUCCESS, null));
        Map<z1, a> map2 = this.f24490n;
        z1 z1Var = z1.AUCTION_FAILED;
        ac acVar = ac.BN_AUCTION_FAILED;
        map2.put(z1Var, new a(acVar, null));
        this.f24490n.put(z1.AUCTION_FAILED_NO_CANDIDATES, new a(acVar, null));
        this.f24490n.put(z1.AUCTION_REQUEST_WATERFALL, new a(ac.BN_AUCTION_REQUEST_WATERFALL, null));
        this.f24490n.put(z1.AUCTION_RESULT_WATERFALL, new a(ac.BN_AUCTION_RESPONSE_WATERFALL, null));
        this.f24490n.put(z1.INIT_SUCCESS, new a(null, null));
        this.f24490n.put(z1.INIT_FAILED, new a(null, null));
        this.f24490n.put(z1.AD_OPENED, new a(ac.BN_CALLBACK_SHOW, ac.BN_INSTANCE_SHOW));
        this.f24490n.put(z1.AD_CLICKED, new a(ac.BN_CALLBACK_CLICK, ac.BN_INSTANCE_CLICK));
        this.f24490n.put(z1.LOAD_AD, new a(ac.BN_LOAD, ac.BN_INSTANCE_LOAD));
        this.f24490n.put(z1.RELOAD_AD, new a(ac.BN_RELOAD, ac.BN_INSTANCE_RELOAD));
        this.f24490n.put(z1.LOAD_AD_SUCCESS, new a(ac.BN_CALLBACK_LOAD_SUCCESS, ac.BN_INSTANCE_LOAD_SUCCESS));
        this.f24490n.put(z1.RELOAD_AD_SUCCESS, new a(ac.BN_CALLBACK_RELOAD_SUCCESS, ac.BN_INSTANCE_RELOAD_SUCCESS));
        this.f24490n.put(z1.LOAD_AD_FAILED_WITH_REASON, new a(ac.BN_CALLBACK_LOAD_ERROR, ac.BN_INSTANCE_LOAD_ERROR));
        this.f24490n.put(z1.RELOAD_AD_FAILED_WITH_REASON, new a(ac.BN_CALLBACK_RELOAD_ERROR, ac.BN_INSTANCE_RELOAD_ERROR));
        this.f24490n.put(z1.LOAD_AD_NO_FILL, new a(null, ac.BN_INSTANCE_LOAD_NO_FILL));
        this.f24490n.put(z1.RELOAD_AD_NO_FILL, new a(null, ac.BN_INSTANCE_RELOAD_NO_FILL));
        this.f24490n.put(z1.AD_FORMAT_CAPPED, new a(ac.BN_AD_UNIT_CAPPED, null));
        this.f24490n.put(z1.COLLECT_TOKEN, new a(ac.BN_COLLECT_TOKENS, null));
        this.f24490n.put(z1.COLLECT_TOKENS_COMPLETED, new a(ac.BN_COLLECT_TOKENS_COMPLETED, null));
        this.f24490n.put(z1.COLLECT_TOKENS_FAILED, new a(ac.BN_COLLECT_TOKENS_FAILED, null));
        this.f24490n.put(z1.INSTANCE_COLLECT_TOKEN, new a(ac.BN_INSTANCE_COLLECT_TOKEN, null));
        Map<z1, a> map3 = this.f24490n;
        z1 z1Var2 = z1.INSTANCE_COLLECT_TOKEN_SUCCESS;
        ac acVar2 = ac.BN_INSTANCE_COLLECT_TOKEN_SUCCESS;
        map3.put(z1Var2, new a(acVar2, acVar2));
        Map<z1, a> map4 = this.f24490n;
        z1 z1Var3 = z1.INSTANCE_COLLECT_TOKEN_FAILED;
        ac acVar3 = ac.BN_INSTANCE_COLLECT_TOKEN_FAILED;
        map4.put(z1Var3, new a(acVar3, acVar3));
        Map<z1, a> map5 = this.f24490n;
        z1 z1Var4 = z1.INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        ac acVar4 = ac.BN_INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        map5.put(z1Var4, new a(acVar4, acVar4));
        this.f24490n.put(z1.DESTROY_AD, new a(ac.BN_DESTROY, ac.BN_INSTANCE_DESTROY));
        this.f24490n.put(z1.SKIP_RELOAD_AD, new a(ac.BN_SKIP_RELOAD, null));
        this.f24490n.put(z1.AD_LEFT_APPLICATION, new a(ac.BN_CALLBACK_LEAVE_APP, ac.BN_INSTANCE_LEAVE_APP));
        this.f24490n.put(z1.AD_PRESENT_SCREEN, new a(ac.BN_CALLBACK_PRESENT_SCREEN, ac.BN_INSTANCE_PRESENT_SCREEN));
        this.f24490n.put(z1.AD_DISMISS_SCREEN, new a(ac.BN_CALLBACK_DISMISS_SCREEN, ac.BN_INSTANCE_DISMISS_SCREEN));
        this.f24490n.put(z1.AD_VIEW_BOUND, new a(ac.BN_BOUND, ac.BN_INSTANCE_BOUND));
        this.f24490n.put(z1.PAUSE_AD, new a(ac.BN_REFRESH_PAUSE, null));
        this.f24490n.put(z1.RESUME_AD, new a(ac.BN_REFRESH_RESUME, null));
        this.f24490n.put(z1.OPERATIONAL_SET_CONFIGURATIONS, new a(ac.BN_SET_CONFIGURATION, null));
        Map<z1, a> map6 = this.f24490n;
        z1 z1Var5 = z1.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING;
        ac acVar5 = ac.TROUBLESHOOTING_BN_PROVIDER_SETTINGS_MISSING;
        map6.put(z1Var5, new a(acVar5, acVar5));
        Map<z1, a> map7 = this.f24490n;
        z1 z1Var6 = z1.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS;
        ac acVar6 = ac.TROUBLESHOOTING_BN_UNEXPECTED_INIT_SUCCESS;
        map7.put(z1Var6, new a(acVar6, acVar6));
        Map<z1, a> map8 = this.f24490n;
        z1 z1Var7 = z1.TROUBLESHOOT_UNEXPECTED_INIT_FAILED;
        ac acVar7 = ac.TROUBLESHOOTING_BN_UNEXPECTED_INIT_FAILED;
        map8.put(z1Var7, new a(acVar7, acVar7));
        Map<z1, a> map9 = this.f24490n;
        z1 z1Var8 = z1.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS;
        ac acVar8 = ac.TROUBLESHOOTING_BN_UNEXPECTED_AUCTION_SUCCESS;
        map9.put(z1Var8, new a(acVar8, acVar8));
        Map<z1, a> map10 = this.f24490n;
        z1 z1Var9 = z1.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED;
        ac acVar9 = ac.TROUBLESHOOTING_BN_UNEXPECTED_AUCTION_FAILED;
        map10.put(z1Var9, new a(acVar9, acVar9));
        Map<z1, a> map11 = this.f24490n;
        z1 z1Var10 = z1.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS;
        ac acVar10 = ac.TROUBLESHOOTING_BN_UNEXPECTED_LOAD_SUCCESS;
        map11.put(z1Var10, new a(acVar10, acVar10));
        Map<z1, a> map12 = this.f24490n;
        z1 z1Var11 = z1.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED;
        ac acVar11 = ac.TROUBLESHOOTING_BN_UNEXPECTED_LOAD_FAILED;
        map12.put(z1Var11, new a(acVar11, acVar11));
        Map<z1, a> map13 = this.f24490n;
        z1 z1Var12 = z1.TROUBLESHOOT_UNEXPECTED_RELOAD_SUCCESS;
        ac acVar12 = ac.TROUBLESHOOTING_BN_UNEXPECTED_RELOAD_SUCCESS;
        map13.put(z1Var12, new a(acVar12, acVar12));
        Map<z1, a> map14 = this.f24490n;
        z1 z1Var13 = z1.TROUBLESHOOT_UNEXPECTED_RELOAD_FAILED;
        ac acVar13 = ac.TROUBLESHOOTING_BN_UNEXPECTED_RELOAD_FAILED;
        map14.put(z1Var13, new a(acVar13, acVar13));
        Map<z1, a> map15 = this.f24490n;
        z1 z1Var14 = z1.TROUBLESHOOT_UNEXPECTED_TIMEOUT;
        ac acVar14 = ac.TROUBLESHOOTING_BN_UNEXPECTED_TIMEOUT;
        map15.put(z1Var14, new a(acVar14, acVar14));
        Map<z1, a> map16 = this.f24490n;
        z1 z1Var15 = z1.TROUBLESHOOT_UNEXPECTED_OPENED;
        ac acVar15 = ac.TROUBLESHOOTING_BN_UNEXPECTED_OPENED;
        map16.put(z1Var15, new a(acVar15, acVar15));
        Map<z1, a> map17 = this.f24490n;
        z1 z1Var16 = z1.TROUBLESHOOT_INTERNAL_ERROR;
        ac acVar16 = ac.TROUBLESHOOTING_BN_INTERNAL_ERROR;
        map17.put(z1Var16, new a(acVar16, acVar16));
        Map<z1, a> map18 = this.f24490n;
        z1 z1Var17 = z1.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        ac acVar17 = ac.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        map18.put(z1Var17, new a(acVar17, acVar17));
        Map<z1, a> map19 = this.f24490n;
        z1 z1Var18 = z1.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        ac acVar18 = ac.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        map19.put(z1Var18, new a(acVar18, acVar18));
        this.f24490n.put(z1.TROUBLESHOOT_NOTIFICATION_ERROR, new a(ac.TROUBLESHOOTING_BN_NOTIFICATIONS_ERROR, null));
        this.f24490n.put(z1.TROUBLESHOOT_BN_RELOAD_EXCEPTION, new a(ac.TROUBLESHOOTING_BN_RELOAD_EXCEPTION, null));
        this.f24490n.put(z1.TROUBLESHOOT_IMPRESSION_TIMEOUT, new a(ac.TROUBLESHOOTING_BN_IMPRESSION_TIMEOUT_REACHED, null));
        this.f24490n.put(z1.TROUBLESHOOT_BANNER_REFRESH_PAUSED, new a(ac.TROUBLESHOOT_BN_BANNER_REFRESH_PAUSED, null));
        this.f24490n.put(z1.TROUBLESHOOT_BANNER_REFRESH_RESUMED, new a(ac.TROUBLESHOOT_BN_BANNER_REFRESH_RESUMED, null));
        this.f24490n.put(z1.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_PAUSE, new a(ac.TROUBLESHOOT_BN_BANNER_REFRESH_TRIGGER_PAUSE, null));
        this.f24490n.put(z1.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_RESUME, new a(ac.TROUBLESHOOT_BN_BANNER_REFRESH_TRIGGER_RESUME, null));
        Map<z1, a> map20 = this.f24490n;
        z1 z1Var19 = z1.TROUBLESHOOT_BANNER_REFRESH_TRANSITION;
        ac acVar19 = ac.TROUBLESHOOT_BN_BANNER_REFRESH_TRANSITION;
        map20.put(z1Var19, new a(acVar19, acVar19));
        Map<z1, a> map21 = this.f24490n;
        z1 z1Var20 = z1.TROUBLESHOOT_BANNER_REFRESH_ANIMATED;
        ac acVar20 = ac.TROUBLESHOOT_BN_BANNER_REFRESH_ANIMATED;
        map21.put(z1Var20, new a(acVar20, acVar20));
        Map<z1, a> map22 = this.f24490n;
        z1 z1Var21 = z1.TROUBLESHOOT_ILLEGAL_STATE;
        ac acVar21 = ac.TROUBLESHOOTING_BN_ILLEGAL_STATE;
        map22.put(z1Var21, new a(acVar21, acVar21));
        this.f24490n.put(z1.TROUBLESHOOT_RELOAD, new a(ac.TROUBLESHOOTING_BN_RELOAD, null));
        Map<z1, a> map23 = this.f24490n;
        z1 z1Var22 = z1.TROUBLESHOOT_LOAD_SKIPPED;
        ac acVar22 = ac.TROUBLESHOOTING_BN_LOAD_SKIPPED;
        map23.put(z1Var22, new a(acVar22, acVar22));
    }

    public void a(z1 z1Var, Map<String, Object> map) {
        a(z1Var, map, Calendar.getInstance().getTimeInMillis());
    }

    public void a(z1 z1Var, Map<String, Object> map, long j) {
        int iA = a(z1Var);
        if (-1 == iA) {
            return;
        }
        HashMap map2 = new HashMap();
        b2 b2Var = this.f24485c;
        if (b2Var != null) {
            map2.putAll(b2Var.a(z1Var));
        }
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        this.d.a(new zb(iA, j, new JSONObject(map2)));
    }
}
