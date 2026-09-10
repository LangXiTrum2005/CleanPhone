package com.umeng.analytics.pro;

import android.text.TextUtils;
import com.umeng.umcrash.UMCrash;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class ay {
    public static final String A = "rtd";
    public static final String B = "lepd";
    public static final String C = "ccfg";
    private static Map<String, String> D = null;
    private static String E = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f2502a = "env";
    public static final String b = "exp";
    public static final String c = "imp";
    public static final String d = "ua";
    public static final String e = "zc";
    public static final String f = "id";
    public static final String g = "zf";
    public static final String h = "exid";
    public static final String i = "ucc";
    public static final String j = "ugc";
    public static final String k = "usi";
    public static final String l = "uso";
    public static final String m = "user";
    public static final String n = "uspi";
    public static final String o = "dtfn";
    public static final String p = "pr";
    public static final String q = "upg";
    public static final String r = "pri";
    public static final String s = "probe";
    public static final String t = "bl";
    public static final String u = "wl";
    public static final String v = "subp";
    public static final String w = "subua";
    public static final String x = "sta";
    public static final String y = "emi";
    public static final String z = "sli";

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final ay f2503a = new ay();

        private a() {
        }
    }

    static {
        HashMap map = new HashMap();
        D = map;
        E = "";
        map.put(f2502a, "envelope");
        D.put(b, ".umeng");
        D.put(c, ".imprint");
        D.put(d, "ua.db");
        D.put(e, "umeng_zero_cache.db");
        D.put("id", "umeng_it.cache");
        D.put(g, "umeng_zcfg_flag");
        D.put(h, "exid.dat");
        D.put(i, "umeng_common_config");
        D.put(j, "umeng_general_config");
        D.put(k, UMCrash.KEY_CALLBACK_SESSION_ID);
        D.put(l, "umeng_sp_oaid");
        D.put(m, "mobclick_agent_user_");
        D.put(n, "umeng_subprocess_info");
        D.put(o, "delayed_transmission_flag_new");
        D.put("pr", "umeng_policy_result_flag");
        D.put(q, "um_policy_grant");
        D.put(r, "um_pri");
        D.put(s, "UM_PROBE_DATA");
        D.put(t, "ekv_bl");
        D.put(u, "ekv_wl");
        D.put(v, g.f2560a);
        D.put(w, "ua_");
        D.put(x, "stateless");
        D.put(y, ".emitter");
        D.put(z, "um_slmode_sp");
        D.put(A, "um_rtd_conf");
        D.put(B, "");
        D.put(C, ".dmpvedpogjhejs.cfg");
    }

    private ay() {
    }

    public void a(String str) {
        if (!TextUtils.isEmpty(str) && TextUtils.isEmpty(E)) {
            if (str.length() <= 3) {
                E = str.concat("_");
                return;
            }
            E = str.substring(0, 3) + "_";
        }
    }

    public String b(String str) {
        if (!D.containsKey(str)) {
            return "";
        }
        String str2 = D.get(str);
        if (!b.equalsIgnoreCase(str) && !c.equalsIgnoreCase(str) && !y.equalsIgnoreCase(str)) {
            return DM.m(new StringBuilder(), E, str2);
        }
        return "." + E + str2.substring(1);
    }

    public void a() {
        E = "";
    }

    public static ay b() {
        return a.f2503a;
    }
}
