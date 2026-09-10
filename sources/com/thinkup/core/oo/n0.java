package com.thinkup.core.oo;

import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.model.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.smartdigimkt.l8.e;
import com.smartdigimkt.o1.b;
import com.thinkup.core.api.TUAdConst;
import com.thinkup.core.api.TUAdRequest;
import com.thinkup.core.api.TURewardInfo;
import com.thinkup.core.common.n.oom;
import com.thinkup.core.common.on.m0o;
import com.thinkup.core.common.on.mm0;
import com.thinkup.core.common.on.n0n;
import com.thinkup.core.common.on.n0o;
import com.thinkup.core.common.on.nno;
import com.thinkup.core.common.on.o0m0;
import com.thinkup.core.common.on.o0mm;
import com.thinkup.core.common.on.on0;
import com.thinkup.core.common.on.oon;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class n0 extends oo {
    public static final int m = 0;
    public static final int m0 = 3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f42457n = 1;
    public static final String o = "Placement";
    public static final int om = 1;
    public static final int on = 2;
    public static final int oo = 2;
    private o0m0 m00;
    private int m000;
    private int m00m;
    private int m00n;
    private int m00o;
    private String m0m;
    private JSONObject m0mm;
    private int m0n;
    private long m0n0;
    private int m0nn;
    private int m0no;
    private int m0o;
    private m0o m0o0;
    private JSONObject m0om;
    private List<String> m0oo;
    private String mm;
    private TURewardInfo mm0;
    private String mmm;
    private long mmn;
    private String mmo;
    private long mn;
    private String mn0;
    private int mnm;
    private long mnn;
    private long mno;
    TUAdRequest mo;
    private int mo0;
    private String mo00;
    private long mo0m;
    private double mo0n;
    private String mo0o;
    private Map<String, Object> mom;
    private JSONObject mom0;
    private Map<String, TURewardInfo> mon;
    private String moo;
    private int moo0;
    private int moom;
    private int moon;
    private int mooo;
    private long n0;
    private int n00;
    private n0n n0m;
    private long n0n;
    private List<n0o> n0o;
    private int nm;
    private String nm0;
    private String nmm;
    private long nmn;
    private String nmo;
    private int nn;
    private String nn0;
    private double nnm;
    private long nnn;
    private String nno;
    private int no;
    private double no0;
    private List<String> nom;
    private String non;
    private String noo;
    private long o00;
    private long o000;
    private long o00m;
    private int o00n;
    private long o00o;
    private long o0m;
    private JSONObject o0m0;
    private String o0mm;
    private int o0mn;
    private String o0mo;
    private int o0n;
    private int o0n0;
    private int o0nm;
    private int o0nn;
    private List<Integer> o0no;
    private long o0o;
    private int o0o0;
    private long o0om;
    private JSONObject o0on;
    private int o0oo;
    private Map<String, o0mm> om0;
    private long om00;
    private int om0m;
    private int om0n;
    private long om0o;
    private int omm;
    private JSONArray omm0;
    private JSONArray ommm;
    private JSONArray ommn;
    private JSONArray ommo;
    private long omn;
    private JSONArray omn0;
    private JSONArray omnm;
    private JSONArray omnn;
    private JSONArray omno;
    private int omo;
    private JSONArray omo0;
    private JSONArray omom;
    private JSONArray omon;
    private JSONArray omoo;
    private long on0;
    private long on00;
    private int on0m;
    private int on0n;
    private int on0o;
    private int onm;
    private int onm0;
    private int[] onmm;
    private int onmo;
    private String onn;
    private Boolean onn0;
    private String onnm;
    private mm0 onnn;
    private int onno;
    private long ono;
    private List<Integer> ono0;
    private int onom;
    private String onon;
    private int oo0;
    private int oo00;
    private int oo0m;
    private int oom;
    private int oom0;
    private boolean oomn;
    private om oomo;
    private List<o0mm> oon;
    private int oon0;
    private int oonm;
    private long oonn;
    private int oono;
    private int ooo;
    private double[][] ooom;
    private int oo0o = 0;
    private int oo0n = 10;
    private int ooo0 = 10;
    private int oooo = 2;
    private int ooon = 1;
    private com.thinkup.core.common.on.nn oomm = new com.thinkup.core.common.on.nn();
    private int onoo = 2;
    private int onmn = 2;
    private int m0on = 1;
    private int m0m0 = 10000;
    private int m0mo = 3000;
    private int m0mn = 1;
    private int m0nm = 2;

    public static class o {
        public static final String m = "addr_bid";
        public static final String m0 = "adx_st";
        public static final String m00 = "hb_start_time";
        private static final String m000 = "m_o_ks";
        private static final String m00m = "callback";
        private static final String m00n = "sc_list";
        private static final String m00o = "p_m_o";
        public static final String m0m = "bid_floor";
        private static final String m0m0 = "cc";
        private static final String m0mm = "acct_cy";
        private static final String m0mn = "req_ug_type_v2";
        private static final String m0mo = "exch_r";
        public static final String m0n = "max_unit_ids";
        private static final String m0n0 = "device_perf_sw";
        private static final String m0nm = "wf_req_wait_t";
        private static final String m0nn = "c2s_req_wait_t";
        private static final String m0no = "max_cached_num";
        public static final String m0o = "dsp_list";
        private static final String m0o0 = "rw_n";
        private static final String m0om = "reward";
        private static final String m0on = "currency";
        private static final String m0oo = "rw_num";
        public static final String mm = "hb_list";
        public static final String mm0 = "install_id_max";
        public static final String mmm = "exclude_ids";
        public static final String mmn = "is_test";
        public static final String mmo = "install_ids";
        public static final String mn = "inh_list";
        public static final String mn0 = "gsp_rates";
        public static final String mnm = "wf_id";
        public static final String mnn = "sysh_mtg_sw";
        public static final String mno = "adx_ext";
        public static final String mo = "ilrd";
        public static final String mo0 = "xdb_list";
        private static final String mo00 = "s2s_req_wait_t";
        private static final String mo0m = "auto_refresh_type_v2";
        private static final String mo0o = "auto_req_type";
        public static final String mom = "req_merge";
        public static final String mon = "exclude_id_max";
        public static final String moo = "s2s_bd_max";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f42458n = "load_fail_wtime";
        public static final String n0 = "fbhb_bid_wtime";
        public static final String n00 = "mid_gdt_sw";
        public static final String n0m = "wf_lscb_type";
        public static final String n0n = "reqid_pg_sw";
        public static final String n0o = "lm_lrqf_interval_sws";
        public static final String nm = "wf_bid_addr";
        public static final String nm0 = "upd_type";
        public static final String nmm = "value_n";
        public static final String nmn = "bid_value_n";
        public static final String nmo = "upd_th";
        public static final String nn = "ss_data";
        public static final String nn0 = "sto_stg";
        public static final String nnm = "wf2_mode_sw";
        public static final String nnn = "wf2_req_ug_type";
        public static final String nno = "lf_rt_itr";
        public static final String no = "burl_nt_firm";
        public static final String no0 = "sr_sw";
        public static final String nom = "has_1st_rl";
        public static final String non = "updateTime";
        public static final String noo = "p_c";
        public static final String o = "hb_bid_timeout";
        public static final String o0 = "load_cap";
        public static final String o00 = "cn_addr_bid";
        public static final String o000 = "wf2_mode_req_num";
        public static final String o00m = "share_pl_id";
        public static final String o00n = "s2s_sw";
        public static final String o00o = "am_est_num";
        public static final String o0m = "byuid_wt";
        public static final String o0m0 = "wf_sw";
        public static final String o0mm = "pl_wf_st_type";
        public static final String o0mn = "presetwf_reload_sw";
        public static final String o0mo = "wf_obj";
        public static final String o0n = "addr_bks";
        public static final String o0n0 = "wf2_nf_sw";
        public static final String o0nm = "adx_dsp";
        public static final String o0nn = "unique_id";
        public static final String o0no = "ps_ct_max";
        public static final String o0o = "cn_wf_bid_addr";
        public static final String o0o0 = "bd_req_bid_sw";
        public static final String o0om = "mix_click_type";
        public static final String o0on = "auto_refresh_type";
        public static final String o0oo = "bn_template_id";
        public static final String om = "cached_offers_num";
        public static final String om0 = "bottom_list";
        public static final String om00 = "addr_st";
        private static final String om0m = "ps_id_timeout";
        private static final String om0n = "ps_ct";
        public static final String om0o = "i_r_sw";
        public static final String omm = "cb_w_time";
        private static final String omm0 = "unit_caps_d";
        private static final String ommm = "unit_pacing";
        private static final String ommn = "wifi_auto_sw";
        private static final String ommo = "unit_caps_h";
        public static final String omn = "req_w_time";
        private static final String omn0 = "show_type";
        private static final String omnm = "ug_list";
        private static final String omnn = "ol_list";
        private static final String omno = "refresh";
        public static final String omo = "bottom_reqts";
        private static final String omo0 = "ps_ct_out";
        private static final String omom = "ad_delivery_sw";
        private static final String omon = "req_ug_num";
        private static final String omoo = "pucs";
        public static final String on = "adx_list";
        public static final String on0 = "wf_loadts";
        private static final String on00 = "gro_id";
        private static final String on0m = "s2shb_list";
        private static final String on0n = "format";
        private static final String on0o = "hb_list";
        public static final String onm = "req_ug_numsp";
        private static final String onm0 = "ra";
        private static final String onmm = "tp_ps";
        private static final String onmn = "t_g_id";
        private static final String onmo = "asid";
        public static final String onn = "bf_ldf_rf_sw";
        private static final String onn0 = "s_id";
        private static final String onnm = "m_o";
        private static final String onnn = "m_o_s";
        private static final String onno = "u_n_f_sw";
        public static final String ono = "req_ug_type";
        private static final String ono0 = "auto_refresh";
        private static final String onom = "s_t";
        private static final String onon = "l_s_t";
        private static final String onoo = "auto_refresh_time";
        public static final String oo = "load_cap_time";
        public static final String oo0 = "addr_subbks";
        public static final String oo00 = "e_key_data";
        public static final String oo0m = "s_id";
        public static final String oo0n = "c_id";
        public static final String oo0o = "c_pub_key";
        public static final String oom = "exch_rate_c2u";
        public static final String oom0 = "h_s_t_auto_sdk_to_time";
        public static final String oomm = "autoload_t";
        public static final String oomn = "ads_lg_st";
        public static final String oomo = "ps_ct_out_cus";
        public static final String oon = "doffer_list";
        public static final String oon0 = "rotation_num";
        public static final String oonm = "rotation_cache_ts";
        public static final String oonn = "adx_id_b_sw";
        public static final String oono = "rotation_inter";
        public static final String ooo = "s2sbks_list";
        public static final String ooo0 = "sp_sdk_pri_timeout";
        public static final String ooom = "dn_s2shb_list";
        public static final String ooon = "bid_wait_other_time";
        public static final String oooo = "dn_c2shb_list";
    }

    private n0(String str) {
        this.mm = str;
    }

    private String m0mm() {
        return this.mo0o;
    }

    private n0n m0mn() {
        return this.n0m;
    }

    private JSONObject m0mo() {
        return this.o0on;
    }

    private List<n0o> m0n0() {
        return this.n0o;
    }

    private int m0nm() {
        return this.onm;
    }

    private int m0nn() {
        return this.nm;
    }

    private String m0no() {
        return this.mn0;
    }

    private void m0o(int i2) {
        this.mnm = i2;
    }

    private int mo00() {
        return this.o0n;
    }

    private int mo0m() {
        return this.ooo;
    }

    private o0m0 mo0n() {
        return this.m00;
    }

    private int mo0o() {
        return this.oo0;
    }

    private int mom0() {
        return this.moom;
    }

    private int momm() {
        return this.o0n0;
    }

    private int momn() {
        return this.o0nn;
    }

    private int momo() {
        return this.moon;
    }

    private int[] mon0() {
        return this.onmm;
    }

    private o0mm monm() {
        List<o0mm> listO = ooo.o(this, this.omon);
        if (listO.size() > 0) {
            return listO.get(0);
        }
        return null;
    }

    private String monn() {
        return this.onnm;
    }

    private int mono() {
        return this.onoo;
    }

    private long moo0() {
        return this.mo0m;
    }

    private long moom() {
        return this.o000;
    }

    private long moon() {
        return this.o00o;
    }

    private String mooo() {
        return this.nmo;
    }

    private void n(int i2) {
        this.oon0 = i2;
    }

    private void o0(int i2) {
        this.oono = i2;
    }

    private void o0o(int i2) {
        this.o0oo = i2;
    }

    private void oo(int i2) {
        this.oonm = i2;
    }

    public final int m() {
        return this.oono;
    }

    public final int m0() {
        return this.om0n;
    }

    public final int m00() {
        return this.o0oo;
    }

    public final int m000() {
        return this.m0on;
    }

    public final int m00m() {
        return this.m0mo;
    }

    public final int m00n() {
        return this.m0nm;
    }

    public final int m00o() {
        return this.m0m0;
    }

    public final int m0m() {
        int i2 = this.o00n;
        if (i2 == 1) {
            return this.nn;
        }
        if (i2 != 2) {
            return 1;
        }
        return this.o0o0;
    }

    public final boolean m0m0() {
        int i2 = this.m0no;
        return i2 == 2 || i2 == 5;
    }

    public final long m0n() {
        return this.o00m;
    }

    public final JSONObject m0o0() {
        return this.m0mm;
    }

    public final long m0om() {
        return this.m0n0;
    }

    public final int m0on() {
        return this.m0no;
    }

    public final int m0oo() {
        return this.m0mn;
    }

    public final om mm() {
        return this.oomo;
    }

    public final String mm0() {
        return this.nno;
    }

    public final long mmm() {
        return this.nmn;
    }

    public final String mmn() {
        return this.nm0;
    }

    public final JSONArray mmo() {
        return this.ommm;
    }

    public final int mn() {
        return this.oom0;
    }

    public final String mn0() {
        return this.non;
    }

    public final double mnm() {
        return this.no0;
    }

    public final String mnn() {
        return this.noo;
    }

    public final List<String> mno() {
        return this.nom;
    }

    public final String mo() {
        return this.mm;
    }

    public final JSONArray mo0() {
        return this.omno;
    }

    public final double mom() {
        return this.nnm;
    }

    public final String mon() {
        return this.nn0;
    }

    public final long moo() {
        return this.nnn;
    }

    public final int n0() {
        return this.oo00;
    }

    public final long n00() {
        return this.n0n;
    }

    public final String n0m() {
        return this.mo00;
    }

    public final JSONArray n0n() {
        return this.omon;
    }

    public final JSONArray n0o() {
        return this.ommo;
    }

    public final int nm() {
        return this.on0m;
    }

    public final TURewardInfo nm0() {
        return this.mm0;
    }

    public final int nmm() {
        return this.mo0;
    }

    public final int nmn() {
        return this.m0o;
    }

    public final Map<String, Object> nmo() {
        return this.mom;
    }

    public final int nn() {
        return this.on0n;
    }

    public final String nn0() {
        return this.m0m;
    }

    public final long nnm() {
        return this.on0;
    }

    public final long nnn() {
        return this.ono;
    }

    public final int nno() {
        return this.m0n;
    }

    public final List<Integer> no() {
        return this.ono0;
    }

    public final long no0() {
        return this.mmn;
    }

    public final String nom() {
        return this.mmo;
    }

    public final String non() {
        return this.mmm;
    }

    public final Map<String, TURewardInfo> noo() {
        return this.mon;
    }

    public final int o() {
        return this.oon0;
    }

    public final int o00() {
        return this.on0o;
    }

    public final String o000() {
        return this.onn;
    }

    public final long o00m() {
        return this.omn;
    }

    public final int o00n() {
        return this.omo;
    }

    public final int o00o() {
        return this.omm;
    }

    public final long o0m() {
        return this.on00;
    }

    public final long o0m0() {
        return this.o00;
    }

    public final long o0mm() {
        return this.o0m;
    }

    public final int o0mn() {
        return this.oom;
    }

    public final long o0mo() {
        return this.o0o;
    }

    public final TUAdRequest o0n() {
        return this.mo;
    }

    public final JSONArray o0n0() {
        return this.omo0;
    }

    public final JSONArray o0nm() {
        return this.omom;
    }

    public final JSONArray o0nn() {
        return this.omm0;
    }

    public final JSONArray o0no() {
        return this.omoo;
    }

    public final long o0o0() {
        return this.mn;
    }

    public final int o0om() {
        return this.no;
    }

    public final int o0on() {
        return this.nn;
    }

    public final long o0oo() {
        return this.n0;
    }

    public final long om() {
        return this.om0o;
    }

    public final List<o0mm> om0() {
        return this.oon;
    }

    public final boolean om00() {
        return this.oo0m == 1;
    }

    public final boolean om0m() {
        return this.oo0o == 0;
    }

    public final int om0n() {
        return this.oo0n;
    }

    public final boolean om0o() {
        return this.oo0o == 2;
    }

    public final List<Integer> omm() {
        return this.o0no;
    }

    public final int omm0() {
        return this.ooon;
    }

    public final boolean ommm() {
        return this.onmn == 1;
    }

    public final com.thinkup.core.common.on.nn ommn() {
        return this.oomm;
    }

    public final int ommo() {
        return this.onmo;
    }

    public final String omn() {
        return this.o0mm;
    }

    public final boolean omn0() {
        return this.on0o == 1;
    }

    public final mm0 omnm() {
        return this.onnn;
    }

    public final boolean omnn() {
        return this.nm == 1;
    }

    public final boolean omno() {
        return this.onoo == 1;
    }

    public final int omo() {
        return this.o0nm;
    }

    public final int omo0() {
        return this.ooo0;
    }

    public final double[][] omom() {
        return this.ooom;
    }

    public final int omon() {
        return this.oo0o;
    }

    public final int omoo() {
        return this.oooo;
    }

    public final int on() {
        return this.om0m;
    }

    public final String on0() {
        return this.o0mo;
    }

    public final boolean on00() {
        System.currentTimeMillis();
        return System.currentTimeMillis() - this.mo0m > this.mn;
    }

    public final boolean on0m() {
        return !TextUtils.isEmpty(this.onon);
    }

    public final Boolean on0n() {
        return this.onn0;
    }

    public final boolean on0o() {
        System.currentTimeMillis();
        return System.currentTimeMillis() - this.mo0m > ((long) this.onno);
    }

    public final int onm() {
        return this.m0nn;
    }

    public final JSONArray onm0() {
        return this.omnm;
    }

    public final int onmm() {
        return this.m00o;
    }

    public final int onmn() {
        return this.m00m;
    }

    public final JSONArray onmo() {
        return this.omnn;
    }

    public final long onn() {
        return this.o0om;
    }

    public final int onn0() {
        return this.m00n;
    }

    public final List<String> onnm() {
        return this.m0oo;
    }

    public final JSONObject onnn() {
        return this.m0om;
    }

    public final m0o onno() {
        return this.m0o0;
    }

    public final JSONObject ono() {
        return this.o0m0;
    }

    public final int ono0() {
        return this.onno;
    }

    public final boolean onom() {
        return this.oomn;
    }

    public final void onon() {
        this.oomn = true;
    }

    public final int onoo() {
        return this.m000;
    }

    public final int oo0() {
        return this.onom;
    }

    public final long oo00() {
        return this.mno;
    }

    public final long oo0m() {
        return this.mnn;
    }

    public final int oo0n() {
        return this.n00;
    }

    public final int oo0o() {
        return this.mnm;
    }

    public final int oom() {
        return this.onm0;
    }

    public final int oom0() {
        return this.moo0;
    }

    public final int oomm() {
        return this.o0mn;
    }

    public final JSONObject oomn() {
        return this.mom0;
    }

    public final double oomo() {
        return this.mo0n;
    }

    public final Map<String, o0mm> oon() {
        return this.om0;
    }

    public final boolean oonn() {
        return this.oo0o == 1;
    }

    public final String ooo() {
        return this.onon;
    }

    public final String ooo0() {
        return this.nmm;
    }

    public final JSONArray ooom() {
        return this.omn0;
    }

    public final int ooon() {
        return this.mooo;
    }

    public final JSONArray oooo() {
        return this.ommn;
    }

    private void m(long j) {
        this.om00 = j;
    }

    private void m0(int i2) {
        this.oom0 = i2;
    }

    private void m00(int i2) {
        this.oom = i2;
    }

    private void m0n(int i2) {
        this.mooo = i2;
    }

    private void mm(int i2) {
        this.on0m = i2;
    }

    private void mm0(int i2) {
        this.o0n0 = i2;
    }

    private void mmm(int i2) {
        this.oo0m = i2;
    }

    private void mmn(int i2) {
        this.oo0n = i2;
    }

    private void mmo(int i2) {
        this.o0nn = i2;
    }

    private void mn(int i2) {
        this.on0n = i2;
    }

    private void mn0(int i2) {
        this.ooo0 = i2;
    }

    private void mnm(int i2) {
        this.ooon = i2;
    }

    private void mnn(int i2) {
        this.onmo = i2;
    }

    private void mno(int i2) {
        this.oooo = i2;
    }

    private void mo(int i2) {
        this.oo00 = i2;
    }

    private void mo0(int i2) {
        this.moo0 = i2;
    }

    private void mom(int i2) {
        this.moon = i2;
    }

    private void mon(int i2) {
        this.o0mn = i2;
    }

    private void moo(int i2) {
        this.moom = i2;
    }

    private void n0(int i2) {
        this.on0o = i2;
    }

    private void n00(int i2) {
        this.onmn = i2;
    }

    private void n0m(int i2) {
        this.onno = i2;
    }

    private void n0n(int i2) {
        this.m000 = i2;
    }

    private void n0o(int i2) {
        this.onoo = i2;
    }

    private void nm(int i2) {
        this.onm0 = i2;
    }

    private void nm0(int i2) {
        this.m0m0 = i2;
    }

    private void nmm(int i2) {
        this.m0nm = i2;
    }

    private void nmn(int i2) {
        this.m0mn = i2;
    }

    private void nmo(int i2) {
        this.m0mo = i2;
    }

    private void nn(int i2) {
        this.o0nm = i2;
    }

    private void no(int i2) {
        this.onom = i2;
    }

    private void no0(int i2) {
        this.m00o = i2;
    }

    private void nom(int i2) {
        this.m00n = i2;
    }

    private void non(int i2) {
        this.m0on = i2;
    }

    private void noo(int i2) {
        this.m00m = i2;
    }

    private void o(long j) {
        this.oonn = j;
    }

    private void o00(int i2) {
        this.m0nn = i2;
    }

    private void o0m(int i2) {
        this.o00n = i2;
    }

    private void o0n(int i2) {
        this.o0o0 = i2;
    }

    private void o0o(String str) {
        this.onn = str;
    }

    private void om(int i2) {
        this.om0m = i2;
    }

    private void om0(int i2) {
        this.omm = i2;
    }

    private void omm(int i2) {
        this.no = i2;
    }

    private void omn(int i2) {
        this.nm = i2;
    }

    private void omo(int i2) {
        this.omo = i2;
    }

    private void on(int i2) {
        this.om0n = i2;
    }

    private void on0(int i2) {
        this.nn = i2;
    }

    private void onm(int i2) {
        this.oo0 = i2;
    }

    private void onn(int i2) {
        this.ooo = i2;
    }

    private void ono(int i2) {
        this.o0n = i2;
    }

    private void oo0(int i2) {
        this.mo0 = i2;
    }

    private void oom(int i2) {
        this.m0n = i2;
    }

    private void oon(int i2) {
        this.onm = i2;
    }

    private void ooo(int i2) {
        this.m0o = i2;
    }

    public final int m0o() {
        int i2 = this.oon0;
        if (i2 != -1 && this.oono == 1) {
            this.o00n = i2;
        }
        return this.o00n;
    }

    public final int n() {
        return this.oonm;
    }

    public final long o0() {
        return this.oonn;
    }

    public final long oo() {
        return this.om00;
    }

    private static n0 m(String str, JSONObject jSONObject) {
        n0 n0Var;
        long jOptLong;
        n0 n0Var2;
        n0 n0Var3;
        int i2;
        JSONArray jSONArrayOptJSONArray;
        int length;
        if (jSONObject == null) {
            return null;
        }
        try {
            n0 n0Var4 = new n0(str);
            n0Var4.m0n0 = System.currentTimeMillis();
            n0Var4.m(jSONObject);
            n0Var4.n(jSONObject);
            n0Var4.o0(jSONObject);
            if (jSONObject.isNull(e.a.f36504a)) {
                n0Var4.mn = 0L;
            } else {
                n0Var4.mn = jSONObject.optLong(e.a.f36504a);
            }
            if (jSONObject.isNull(e.a.f36505b)) {
                n0Var4.n0 = 0L;
            } else {
                n0Var4.n0 = jSONObject.optLong(e.a.f36505b);
            }
            if (jSONObject.isNull(e.a.d)) {
                n0Var4.no = 1;
            } else {
                n0Var4.no = jSONObject.optInt(e.a.d);
            }
            if (jSONObject.isNull(e.a.f36507e)) {
                n0Var4.nm = 1;
            } else {
                n0Var4.nm = jSONObject.optInt(e.a.f36507e);
            }
            if (jSONObject.isNull("req_ug_num")) {
                n0Var4.nn = 1;
            } else {
                int iOptInt = jSONObject.optInt("req_ug_num", 1);
                if (iOptInt <= 0) {
                    iOptInt = 1;
                }
                n0Var4.nn = iOptInt;
            }
            if (jSONObject.isNull("unit_caps_d")) {
                n0Var4.o00 = -1L;
            } else {
                n0Var4.o00 = jSONObject.optLong("unit_caps_d");
            }
            if (jSONObject.isNull("unit_caps_h")) {
                n0Var4.o0o = -1L;
            } else {
                n0Var4.o0o = jSONObject.optLong("unit_caps_h");
            }
            if (jSONObject.isNull("unit_pacing")) {
                n0Var4.o0m = -1L;
            } else {
                n0Var4.o0m = jSONObject.optLong("unit_pacing");
            }
            if (jSONObject.isNull("wifi_auto_sw")) {
                n0Var4.o0n = 0;
            } else {
                n0Var4.o0n = jSONObject.optInt("wifi_auto_sw");
            }
            if (jSONObject.isNull(CampaignEx.KEY_SHOW_TYPE)) {
                n0Var4.oo0 = 0;
            } else {
                n0Var4.oo0 = jSONObject.optInt(CampaignEx.KEY_SHOW_TYPE);
            }
            if (jSONObject.isNull("refresh")) {
                n0Var4.ooo = 0;
            } else {
                n0Var4.ooo = jSONObject.optInt("refresh");
            }
            if (jSONObject.isNull("gro_id")) {
                n0Var4.oom = 0;
            } else {
                n0Var4.oom = jSONObject.optInt("gro_id");
            }
            if (jSONObject.isNull("format")) {
                n0Var4.omo = 0;
            } else {
                n0Var4.omo = jSONObject.optInt("format");
            }
            if (jSONObject.isNull("auto_refresh")) {
                n0Var4.omm = 0;
            } else {
                n0Var4.omm = jSONObject.optInt("auto_refresh");
            }
            if (jSONObject.isNull("auto_refresh_time")) {
                n0Var4.omn = 0L;
            } else {
                n0Var4.omn = jSONObject.optLong("auto_refresh_time");
            }
            if (jSONObject.isNull(e.a.g)) {
                n0Var4.on0 = 900000L;
            } else {
                n0Var4.on0 = jSONObject.optLong(e.a.g);
            }
            if (jSONObject.isNull("l_s_t")) {
                n0Var4.ono = 1800000L;
            } else {
                n0Var4.ono = jSONObject.optLong("l_s_t");
            }
            if (jSONObject.isNull("ra")) {
                n0Var4.onm = -1;
            } else {
                n0Var4.onm = jSONObject.optInt("ra");
            }
            if (jSONObject.isNull("asid")) {
                n0Var4.onn = "";
            } else {
                n0Var4.onn = jSONObject.optString("asid");
            }
            if (jSONObject.isNull("tp_ps")) {
                n0Var = null;
                try {
                    n0Var4.m00 = null;
                } catch (Exception unused) {
                    return n0Var;
                }
            } else {
                try {
                    o0m0 o0m0Var = new o0m0();
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("tp_ps");
                    o0m0Var.o = jSONObjectOptJSONObject.optInt(e.a.d) == 1;
                    o0m0Var.m = jSONObjectOptJSONObject.optLong("apdt");
                    o0m0Var.f42230n = jSONObjectOptJSONObject.optInt("aprn");
                    o0m0Var.o0 = jSONObjectOptJSONObject.optInt("puas") == 1;
                    o0m0Var.oo = jSONObjectOptJSONObject.optLong("cdt");
                    o0m0Var.om = jSONObjectOptJSONObject.optInt("ski_swt") == 1;
                    o0m0Var.on = jSONObjectOptJSONObject.optInt("aut_swt") == 1;
                    n0Var4.m00 = o0m0Var;
                } catch (Exception unused2) {
                }
            }
            if (jSONObject.isNull("ug_list")) {
                n0Var4.omo0 = new JSONArray();
            } else {
                n0Var4.omo0 = jSONObject.optJSONArray("ug_list");
            }
            if (jSONObject.isNull("ol_list")) {
                n0Var4.omoo = new JSONArray();
            } else {
                n0Var4.omoo = jSONObject.optJSONArray("ol_list");
            }
            if (jSONObject.isNull("s2shb_list")) {
                n0Var4.omom = new JSONArray();
            } else {
                n0Var4.omom = jSONObject.optJSONArray("s2shb_list");
            }
            if (jSONObject.isNull("adx_list")) {
                n0Var4.omon = new JSONArray();
            } else {
                n0Var4.omon = jSONObject.optJSONArray("adx_list");
            }
            if (jSONObject.isNull("hb_list")) {
                n0Var4.omm0 = new JSONArray();
            } else {
                n0Var4.omm0 = jSONObject.optJSONArray("hb_list");
            }
            if (jSONObject.isNull(o.mn)) {
                n0Var4.ommo = new JSONArray();
            } else {
                n0Var4.ommo = jSONObject.optJSONArray(o.mn);
            }
            if (jSONObject.isNull(o.ooo)) {
                n0Var4.ommm = new JSONArray();
            } else {
                n0Var4.ommm = jSONObject.optJSONArray(o.ooo);
            }
            if (jSONObject.isNull("doffer_list")) {
                n0Var4.ommn = new JSONArray();
            } else {
                n0Var4.ommn = jSONObject.optJSONArray("doffer_list");
            }
            if (jSONObject.isNull("updateTime")) {
                n0Var4.mo0m = 0L;
                jOptLong = 0;
            } else {
                jOptLong = jSONObject.optLong("updateTime");
                n0Var4.mo0m = jOptLong;
            }
            if (jSONObject.isNull("t_g_id")) {
                n0Var4.m0o = -1;
            } else {
                n0Var4.m0o = jSONObject.optInt("t_g_id");
            }
            if (jSONObject.isNull("s_id")) {
                n0Var4.m0m = "";
            } else {
                n0Var4.m0m = jSONObject.optString("s_id");
            }
            if (jSONObject.isNull("u_n_f_sw")) {
                n0Var4.m0n = 0;
            } else {
                n0Var4.m0n = jSONObject.optInt("u_n_f_sw");
            }
            if (!jSONObject.isNull("m_o_s")) {
                n0Var4.n0m = n0n.ooo(jSONObject.optString("m_o_s"));
            }
            if (jSONObject.isNull("m_o")) {
                n0Var2 = null;
                try {
                    n0Var4.n0o = null;
                } catch (Exception unused3) {
                    return n0Var2;
                }
            } else {
                n0Var4.n0o = o(jSONObject.optString("m_o"), jSONObject.optString("m_o_ks"), jOptLong, n0Var4.n0m);
            }
            if (jSONObject.isNull("p_m_o")) {
                n0Var4.mo0 = 0;
            } else {
                n0Var4.mo0 = jSONObject.optInt("p_m_o");
            }
            if (jSONObject.isNull(com.thinkup.core.common.n0.o0n.m)) {
                n0Var = null;
                n0Var4.mom = null;
            } else {
                JSONObject jSONObject2 = new JSONObject(jSONObject.optString(com.thinkup.core.common.n0.o0n.m));
                HashMap map = new HashMap();
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, jSONObject2.opt(next));
                }
                n0Var4.mom = map;
            }
            if (!jSONObject.isNull("callback")) {
                JSONObject jSONObject3 = new JSONObject(jSONObject.optString("callback"));
                if (!jSONObject3.isNull("sc_list")) {
                    JSONObject jSONObject4 = new JSONObject(jSONObject3.optString("sc_list"));
                    HashMap map2 = new HashMap();
                    Iterator<String> itKeys2 = jSONObject4.keys();
                    while (itKeys2.hasNext()) {
                        String next2 = itKeys2.next();
                        JSONObject jSONObject5 = new JSONObject(jSONObject4.optString(next2));
                        TURewardInfo tURewardInfo = new TURewardInfo();
                        tURewardInfo.rewardName = jSONObject5.optString("rw_n");
                        tURewardInfo.rewardNumber = jSONObject5.optInt("rw_num");
                        map2.put(next2, tURewardInfo);
                    }
                    n0Var4.mon = map2;
                }
                if (!jSONObject3.isNull("reward")) {
                    JSONObject jSONObject6 = new JSONObject(jSONObject3.optString("reward"));
                    TURewardInfo tURewardInfo2 = new TURewardInfo();
                    if (!jSONObject6.isNull("rw_n")) {
                        tURewardInfo2.rewardName = jSONObject6.optString("rw_n");
                    }
                    if (!jSONObject6.isNull("rw_num")) {
                        tURewardInfo2.rewardNumber = jSONObject6.optInt("rw_num");
                    }
                    n0Var4.mm0 = tURewardInfo2;
                }
                if (!jSONObject3.isNull("currency")) {
                    n0Var4.mmo = jSONObject3.optString("currency");
                }
                if (!jSONObject3.isNull(b.f37320h)) {
                    n0Var4.mmm = jSONObject3.optString(b.f37320h);
                }
                if (!jSONObject3.isNull("exch_r")) {
                    n0Var4.no0 = jSONObject3.optDouble("exch_r", 0.0d);
                }
                if (!jSONObject3.isNull("acct_cy")) {
                    n0Var4.noo = jSONObject3.optString("acct_cy");
                }
            }
            if (jSONObject.isNull("hb_bid_timeout")) {
                n0Var4.mmn = 10000L;
            } else {
                n0Var4.mmn = jSONObject.optLong("hb_bid_timeout");
            }
            if (jSONObject.isNull("addr_bid")) {
                n0Var4.mn0 = "";
            } else {
                n0Var4.mn0 = jSONObject.optString("addr_bid");
            }
            if (jSONObject.isNull(o.f42458n)) {
                n0Var4.mno = 10000L;
            } else {
                n0Var4.mno = jSONObject.optLong(o.f42458n);
            }
            if (jSONObject.isNull(o.o0)) {
                n0Var4.mnm = -1;
            } else {
                n0Var4.mnm = jSONObject.optInt(o.o0);
            }
            if (jSONObject.isNull(o.oo)) {
                n0Var4.mnn = 900000L;
            } else {
                n0Var4.mnn = jSONObject.optLong(o.oo);
            }
            if (jSONObject.isNull(o.om)) {
                n0Var4.n00 = 2;
            } else {
                int iOptInt2 = jSONObject.optInt(o.om, 1);
                if (iOptInt2 <= 0) {
                    iOptInt2 = 1;
                }
                n0Var4.n00 = iOptInt2;
            }
            if (jSONObject.isNull(o.mo)) {
                n0Var2 = null;
                n0Var4.mo00 = null;
            } else {
                n0Var4.mo00 = jSONObject.optString(o.mo);
            }
            if (jSONObject.isNull(o.m0)) {
                n0Var4.mo0o = "";
            } else {
                n0Var4.mo0o = jSONObject.optString(o.m0);
            }
            if (jSONObject.isNull(o.n0)) {
                n0Var4.n0n = 4000L;
            } else {
                n0Var4.n0n = jSONObject.optLong(o.n0);
            }
            if (jSONObject.isNull(o.no)) {
                n0Var3 = null;
                try {
                    n0Var4.nom = null;
                } catch (Exception unused4) {
                    return n0Var3;
                }
            } else {
                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(o.no);
                ArrayList arrayList = new ArrayList(3);
                for (int i3 = 0; i3 < jSONArrayOptJSONArray2.length(); i3++) {
                    arrayList.add(jSONArrayOptJSONArray2.optString(i3));
                }
                n0Var4.nom = arrayList;
            }
            if (jSONObject.isNull(o.nm)) {
                n0Var4.non = "";
            } else {
                n0Var4.non = jSONObject.optString(o.nm);
            }
            if (jSONObject.isNull(o.nn)) {
                n0Var4.nm0 = "";
            } else {
                n0Var4.nm0 = jSONObject.optString(o.nn);
            }
            if (jSONObject.isNull(o.o00)) {
                n0Var4.nmo = "";
            } else {
                n0Var4.nmo = jSONObject.optString(o.o00);
            }
            if (jSONObject.isNull(o.o0o)) {
                n0Var4.nmm = "";
            } else {
                n0Var4.nmm = jSONObject.optString(o.o0o);
            }
            if (jSONObject.isNull(o.o0m)) {
                n0Var4.nmn = 500L;
            } else {
                n0Var4.nmn = jSONObject.optLong(o.o0m);
            }
            if (jSONObject.isNull(o.o0n)) {
                n0Var4.nn0 = "";
            } else {
                n0Var4.nn0 = jSONObject.optString(o.o0n);
            }
            if (jSONObject.isNull(o.oo0)) {
                n0Var4.nno = "";
            } else {
                n0Var4.nno = jSONObject.optString(o.oo0);
            }
            if (jSONObject.isNull("exch_rate_c2u")) {
                n0Var4.nnm = 0.1614d;
            } else {
                n0Var4.nnm = jSONObject.optDouble("exch_rate_c2u");
            }
            if (jSONObject.isNull(o.om0)) {
                n0Var4.omno = new JSONArray();
            } else {
                n0Var4.omno = jSONObject.optJSONArray(o.om0);
            }
            if (jSONObject.isNull(o.omo)) {
                n0Var4.nnn = 1000L;
            } else {
                n0Var4.nnn = jSONObject.optLong(o.omo);
            }
            if (jSONObject.isNull(o.omm)) {
                n0Var4.o000 = 0L;
            } else {
                n0Var4.o000 = jSONObject.optLong(o.omm);
            }
            if (jSONObject.isNull(o.omn)) {
                n0Var4.o00o = 2000L;
            } else {
                n0Var4.o00o = jSONObject.optLong(o.omn);
            }
            if (jSONObject.isNull(o.on0)) {
                n0Var4.o00m = -1L;
            } else {
                n0Var4.o00m = jSONObject.optLong(o.on0);
            }
            if (jSONObject.isNull(o.ono)) {
                n0Var4.o00n = 1;
            } else {
                int iOptInt3 = jSONObject.optInt(o.ono);
                if (iOptInt3 != 1 && iOptInt3 != 2) {
                    iOptInt3 = 1;
                }
                n0Var4.o00n = iOptInt3;
            }
            if (jSONObject.isNull(o.onm)) {
                n0Var4.o0o0 = 1;
            } else {
                n0Var4.o0o0 = jSONObject.optInt(o.onm);
            }
            if (jSONObject.isNull(o.onn)) {
                n0Var4.o0oo = 2;
            } else {
                n0Var4.o0oo = jSONObject.optInt(o.onn);
            }
            if (jSONObject.isNull(o.m00)) {
                n0Var4.o0om = 2000L;
            } else {
                n0Var4.o0om = jSONObject.optLong(o.m00);
            }
            if (jSONObject.isNull(o.m0o)) {
                n0Var4.omn0 = new JSONArray();
            } else {
                n0Var4.omn0 = jSONObject.optJSONArray(o.m0o);
            }
            if (jSONObject.isNull("bid_floor")) {
                n0Var4.mo0n = 0.0d;
            } else {
                n0Var4.mo0n = jSONObject.optDouble("bid_floor");
            }
            if (jSONObject.isNull(o.m0n)) {
                n0Var4.o0on = null;
            } else {
                n0Var4.o0on = jSONObject.optJSONObject(o.m0n);
            }
            if (jSONObject.isNull("s2s_bd_max")) {
                n0Var4.moo0 = 0;
            } else {
                n0Var4.moo0 = jSONObject.optInt("s2s_bd_max");
            }
            if (jSONObject.isNull(o.mom)) {
                n0Var4.mooo = 2;
            } else {
                n0Var4.mooo = jSONObject.optInt(o.mom);
            }
            if (jSONObject.isNull("exclude_id_max")) {
                n0Var4.moon = 0;
            } else {
                n0Var4.moon = jSONObject.optInt("exclude_id_max");
            }
            if (jSONObject.isNull("install_id_max")) {
                n0Var4.moom = 0;
            } else {
                n0Var4.moom = jSONObject.optInt("install_id_max");
            }
            if (jSONObject.isNull("is_test")) {
                n0Var4.m0nn = 2;
            } else {
                n0Var4.m0nn = jSONObject.optInt("is_test");
            }
            n0Var4.o0m0 = jSONObject.optJSONObject(o.mn0);
            if (jSONObject.isNull("adx_ext")) {
                n0Var4.o0mo = "";
            } else {
                n0Var4.o0mo = jSONObject.optString("adx_ext");
            }
            if (jSONObject.isNull(o.mnm)) {
                n0Var4.o0mm = "";
            } else {
                n0Var4.o0mm = jSONObject.optString(o.mnm);
            }
            if (!jSONObject.isNull(o.mnn)) {
                n0Var4.o0mn = jSONObject.optInt(o.mnn);
            } else {
                n0Var4.o0mn = 2;
            }
            if (!jSONObject.isNull(o.n00)) {
                n0Var4.o0n0 = jSONObject.optInt(o.n00);
                i2 = 1;
            } else {
                i2 = 1;
                n0Var4.o0n0 = 1;
            }
            if (jSONObject.isNull(o.n0o)) {
                n0Var4.o0no = new ArrayList(i2);
            } else {
                ArrayList arrayList2 = new ArrayList(3);
                JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray(o.n0o);
                if (jSONArrayOptJSONArray3 != null) {
                    int length2 = jSONArrayOptJSONArray3.length();
                    for (int i4 = 0; i4 < length2; i4++) {
                        arrayList2.add(Integer.valueOf(jSONArrayOptJSONArray3.optInt(i4)));
                    }
                }
                n0Var4.o0no = arrayList2;
            }
            if (jSONObject.isNull(o.n0m)) {
                n0Var4.o0nm = 2;
            } else {
                n0Var4.o0nm = jSONObject.optInt(o.n0m);
            }
            if (!jSONObject.isNull(o.n0n)) {
                n0Var4.o0nn = jSONObject.optInt(o.n0n);
            } else {
                n0Var4.o0nn = 1;
            }
            if (jSONObject.isNull(o.no0)) {
                n0Var4.oo00 = 2;
            } else {
                n0Var4.oo00 = jSONObject.optInt(o.no0);
            }
            if (!jSONObject.isNull("p_c")) {
                n0Var4.mom0 = jSONObject.optJSONObject("p_c");
            }
            if (!jSONObject.isNull(o.nom)) {
                n0Var4.oo0m = jSONObject.optInt(o.nom);
            }
            if (!jSONObject.isNull(o.nmm)) {
                n0Var4.oo0n = jSONObject.optInt(o.nmm);
            }
            if (!jSONObject.isNull(o.nmn)) {
                n0Var4.ooo0 = jSONObject.optInt(o.nmn);
            }
            if (!jSONObject.isNull(o.nm0)) {
                n0Var4.oooo = jSONObject.optInt(o.nm0);
            }
            if (!jSONObject.isNull(o.nmo)) {
                try {
                    JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray(o.nmo);
                    if (jSONArrayOptJSONArray4 != null) {
                        double[][] dArr = new double[jSONArrayOptJSONArray4.length()][];
                        for (int i5 = 0; i5 < jSONArrayOptJSONArray4.length(); i5++) {
                            Object obj = jSONArrayOptJSONArray4.get(i5);
                            if (obj instanceof JSONArray) {
                                JSONArray jSONArray = (JSONArray) obj;
                                dArr[i5] = new double[]{Double.parseDouble(String.valueOf(jSONArray.get(0))), Double.parseDouble(String.valueOf(jSONArray.get(1)))};
                            }
                        }
                        n0Var4.ooom = dArr;
                    }
                } catch (Exception unused5) {
                }
            }
            if (!jSONObject.isNull(o.nn0)) {
                n0Var4.ooon = jSONObject.optInt(o.nn0);
            }
            n0Var4.on00 = jSONObject.optLong(o.nno, 2000L);
            n0Var4.on0o = jSONObject.optInt(o.nnm, 2);
            int iOptInt4 = jSONObject.optInt(o.nnn, 1);
            if (iOptInt4 != 1 && iOptInt4 != 2) {
                iOptInt4 = 1;
            }
            n0Var4.on0m = iOptInt4;
            int iOptInt5 = jSONObject.optInt(o.o000, 1);
            if (iOptInt5 <= 0) {
                iOptInt5 = 1;
            }
            n0Var4.on0n = iOptInt5;
            n0Var4.onom = jSONObject.optInt(o.o00o, 0);
            n0Var4.onon = jSONObject.optString(o.o00m, "");
            n0Var4.onm0 = jSONObject.optInt("s2s_sw", 2);
            JSONArray jSONArrayOptJSONArray5 = jSONObject.optJSONArray(o.o0o0);
            if (jSONArrayOptJSONArray5 != null && (length = jSONArrayOptJSONArray5.length()) > 0) {
                ArrayList arrayList3 = new ArrayList();
                for (int i6 = 0; i6 < length; i6++) {
                    Object obj2 = jSONArrayOptJSONArray5.get(i6);
                    if (obj2 instanceof Integer) {
                        arrayList3.add((Integer) obj2);
                    }
                }
                n0Var4.ono0 = arrayList3;
            }
            n0Var4.onmo = jSONObject.optInt(o.o0oo, 1);
            int[] iArr = {1, 2, 3, 4, 5};
            if (!jSONObject.isNull(o.o0om) && (jSONArrayOptJSONArray = jSONObject.optJSONArray(o.o0om)) != null && jSONArrayOptJSONArray.length() > 0) {
                try {
                    iArr = new int[jSONArrayOptJSONArray.length()];
                    for (int i7 = 0; i7 < jSONArrayOptJSONArray.length(); i7++) {
                        iArr[i7] = jSONArrayOptJSONArray.getInt(i7);
                    }
                } catch (Exception unused6) {
                    iArr = new int[]{1, 2, 3, 4, 5};
                }
            }
            n0Var4.onmm = iArr;
            n0Var4.oom0 = jSONObject.optInt(o.o0on, 1);
            if (jSONObject.optInt(o.o0m0, 2) == 1) {
                n0Var4.oomo = om.o(jSONObject.optString(o.o0mo));
            } else {
                n0Var3 = null;
                n0Var4.oomo = null;
            }
            n0Var4.oo0o = jSONObject.optInt("pl_wf_st_type", 0);
            n0Var4.onmn = jSONObject.optInt(o.o0mn, 2);
            n0Var4.onoo = jSONObject.optInt(o.o0n0);
            n0Var4.onno = jSONObject.optInt("ps_ct_max", 604800000);
            n0Var4.onnm = jSONObject.optString(o.o0nm);
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("e_key_data");
            if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.length() > 0) {
                mm0 mm0Var = new mm0();
                mm0Var.o(jSONObject.optString("unique_id"));
                mm0Var.n(jSONObjectOptJSONObject2.optString("c_pub_key"));
                mm0Var.o(jSONObjectOptJSONObject2.optInt("s_id"));
                mm0Var.m(jSONObjectOptJSONObject2.optInt("c_id"));
                n0Var4.onnn = mm0Var;
            }
            com.thinkup.core.common.ooo.o0n.o(n0Var4.nnm);
            n0Var4.m000 = jSONObject.optInt(o.ooo0, -1);
            JSONArray jSONArrayOptJSONArray6 = jSONObject.optJSONArray(o.oooo);
            if (jSONArrayOptJSONArray6 == null) {
                jSONArrayOptJSONArray6 = new JSONArray();
            }
            n0Var4.omnm = jSONArrayOptJSONArray6;
            JSONArray jSONArrayOptJSONArray7 = jSONObject.optJSONArray(o.ooom);
            if (jSONArrayOptJSONArray7 == null) {
                jSONArrayOptJSONArray7 = new JSONArray();
            }
            n0Var4.omnn = jSONArrayOptJSONArray7;
            n0Var4.m00o = jSONObject.optInt(o.ooon, -1);
            n0Var4.m00m = jSONObject.optInt(o.oom0, -1);
            n0Var4.m00n = jSONObject.optInt(o.oomo, 2000);
            n0Var4.m0o0 = m0o.o(jSONObject);
            n0Var4.m0oo = com.thinkup.core.common.ooo.o00.m(jSONObject.optJSONArray(o.oomm));
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject(o.oomn);
            if (jSONObjectOptJSONObject3 != null) {
                n0Var4.m0om = jSONObjectOptJSONObject3;
            }
            n0Var4.m0on = jSONObject.optInt(o.oon0, 1);
            n0Var4.m0m0 = jSONObject.optInt(o.oono, 10000);
            n0Var4.m0mo = jSONObject.optInt(o.oonm, 3000);
            n0Var4.m0nm = jSONObject.optInt(o.oonn, 2);
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("addr_st");
            if (jSONObjectOptJSONObject4 != null) {
                n0Var4.m0mm = jSONObjectOptJSONObject4;
            }
            n0Var4.m0mn = jSONObject.optInt(o.om0o, 2);
            n0Var4.oon0 = jSONObject.optInt("req_ug_type_v2", -1);
            n0Var4.oono = jSONObject.optInt("device_perf_sw", 0);
            n0Var4.oonm = jSONObject.optInt("max_cached_num", -1);
            n0Var4.oonn = jSONObject.optLong("wf_req_wait_t", 0L);
            n0Var4.om00 = jSONObject.optLong("c2s_req_wait_t", 0L);
            n0Var4.om0o = jSONObject.optLong("s2s_req_wait_t", 0L);
            n0Var4.om0m = jSONObject.optInt("auto_req_type", -1);
            n0Var4.om0n = jSONObject.optInt("auto_refresh_type_v2", -1);
            return n0Var4;
        } catch (Exception unused7) {
            return null;
        }
    }

    private void m0(long j) {
        this.nmn = j;
    }

    private void mm(String str) {
        this.noo = str;
    }

    private void mn(String str) {
        this.mo00 = str;
    }

    private void mo(String str) {
        this.non = str;
    }

    private void n(long j) {
        this.om0o = j;
    }

    private void n0(String str) {
        this.mo0o = str;
    }

    private void nm(String str) {
        this.mmo = str;
    }

    private void nn(String str) {
        this.mmm = str;
    }

    private void no(String str) {
        this.mn0 = str;
    }

    private void o(om omVar) {
        this.oomo = omVar;
    }

    private void o0(long j) {
        this.on00 = j;
    }

    private void o00(String str) {
        this.m0m = str;
    }

    private void o0m(long j) {
        this.o0m = j;
    }

    private void o0n(long j) {
        this.mo0m = j;
    }

    private void o0o(long j) {
        this.o0o = j;
    }

    private void om(long j) {
        this.o00m = j;
    }

    private void on(long j) {
        this.nnn = j;
    }

    private void oo(String str) {
        this.o0mo = str;
    }

    private void oo0(long j) {
        this.mno = j;
    }

    private void oom(long j) {
        this.o000 = j;
    }

    private void oon(long j) {
        this.o00o = j;
    }

    private void ooo(long j) {
        this.mnn = j;
    }

    private void m0(String str) {
        this.nm0 = str;
    }

    private void m0m(int i2) {
        this.n00 = i2;
    }

    private void mm(long j) {
        this.mmn = j;
    }

    private void mn(long j) {
        this.on0 = j;
    }

    private void mo(long j) {
        this.n0n = j;
    }

    private void n(String str) {
        this.onon = str;
    }

    private void n0(long j) {
        this.ono = j;
    }

    private void nm(long j) {
        this.mn = j;
    }

    private void nn(long j) {
        this.n0 = j;
    }

    private void no(long j) {
        this.omn = j;
    }

    private void o(List<Integer> list) {
        this.ono0 = list;
    }

    private void o0(String str) {
        this.o0mm = str;
    }

    private void o00(long j) {
        this.o00 = j;
    }

    private void o0m(String str) {
        this.nmo = str;
    }

    private void o0n(String str) {
        this.nmm = str;
    }

    private void om(String str) {
        this.nn0 = str;
    }

    private void on(String str) {
        this.nno = str;
    }

    private void oo(JSONObject jSONObject) {
        this.o0on = jSONObject;
    }

    private void oo0(String str) {
        this.onnm = str;
    }

    public final int o0o() {
        return this.on0o == 1 ? 2 : 1;
    }

    private void m0(JSONArray jSONArray) {
        this.omm0 = jSONArray;
    }

    private void mm(JSONArray jSONArray) {
        this.omn0 = jSONArray;
    }

    private void mn(JSONArray jSONArray) {
        this.omnm = jSONArray;
    }

    private void mo(JSONArray jSONArray) {
        this.ommn = jSONArray;
    }

    private void n(List<Integer> list) {
        this.o0no = list;
    }

    private void n0(JSONArray jSONArray) {
        this.omnn = jSONArray;
    }

    private void o0(List<String> list) {
        this.nom = list;
    }

    private void om(JSONArray jSONArray) {
        this.omoo = jSONArray;
    }

    private void on(JSONArray jSONArray) {
        this.omom = jSONArray;
    }

    private void oo(long j) {
        this.o0om = j;
    }

    public final void o(TUAdRequest tUAdRequest) {
        this.mo = tUAdRequest;
    }

    private void m0(JSONObject jSONObject) {
        this.m0mm = jSONObject;
    }

    private void n(JSONArray jSONArray) {
        this.ommo = jSONArray;
    }

    private void o(Map<String, o0mm> map) {
        this.om0 = map;
    }

    private void o0(JSONArray jSONArray) {
        this.omon = jSONArray;
    }

    private void om(JSONObject jSONObject) {
        this.mom0 = jSONObject;
    }

    private void on(JSONObject jSONObject) {
        this.m0om = jSONObject;
    }

    private void oo(List<n0o> list) {
        this.n0o = list;
    }

    private void n(Map<String, Object> map) {
        this.mom = map;
    }

    private void om(List<String> list) {
        this.m0oo = list;
    }

    private void oo(JSONArray jSONArray) {
        this.omo0 = jSONArray;
    }

    public final o0mm o(String str) {
        Map<String, o0mm> map = this.om0;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    private void n(double d) {
        this.mo0n = d;
    }

    private void o(JSONObject jSONObject) {
        this.o0m0 = jSONObject;
    }

    private void o(JSONArray jSONArray) {
        this.omno = jSONArray;
    }

    private void o(double d) {
        this.nnm = d;
    }

    private void o(n0n n0nVar) {
        this.n0m = n0nVar;
    }

    private void o(TURewardInfo tURewardInfo) {
        this.mm0 = tURewardInfo;
    }

    private void o(o0m0 o0m0Var) {
        this.m00 = o0m0Var;
    }

    private void o(double[][] dArr) {
        this.ooom = dArr;
    }

    public final void o(int i2) {
        this.oo0o = i2;
    }

    private void o(int[] iArr) {
        this.onmm = iArr;
    }

    public static n0 o(String str, JSONObject jSONObject) {
        n0 n0VarM = m(str, jSONObject);
        if (n0VarM != null) {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            ArrayList arrayList = new ArrayList();
            ooo.o(n0VarM, concurrentHashMap, arrayList);
            n0VarM.oon = arrayList;
            n0VarM.om0 = concurrentHashMap;
        }
        return n0VarM;
    }

    private static List<n0o> o(String str, String str2, long j, n0n n0nVar) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                n0o n0oVar = new n0o();
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
                n0oVar.mm(jSONObjectOptJSONObject.optString("o_id"));
                n0oVar.mn(jSONObjectOptJSONObject.optString("c_id"));
                n0oVar.n0(jSONObjectOptJSONObject.optString("t"));
                n0oVar.oon(jSONObjectOptJSONObject.optString("p_g"));
                n0oVar.no(jSONObjectOptJSONObject.optString("d"));
                n0oVar.nm(jSONObjectOptJSONObject.optString("ic_u"));
                n0oVar.nn(jSONObjectOptJSONObject.optString("im_u"));
                n0oVar.o00(jSONObjectOptJSONObject.optString("f_i_u"));
                n0oVar.o0o(jSONObjectOptJSONObject.optString("a_c_u"));
                n0oVar.o0m(jSONObjectOptJSONObject.optString("c_t"));
                n0oVar.o0n(jSONObjectOptJSONObject.optString("v_u"));
                n0oVar.m0(jSONObjectOptJSONObject.optInt("l_t"));
                n0oVar.oo0(jSONObjectOptJSONObject.optString("p_u"));
                n0oVar.ooo(jSONObjectOptJSONObject.optString("dl"));
                n0oVar.oom(jSONObjectOptJSONObject.optString("c_u"));
                n0oVar.n00(jSONObjectOptJSONObject.optString("ip_u"));
                n0oVar.n0o(jSONObjectOptJSONObject.optString("t_u"));
                n0oVar.n0m(jSONObjectOptJSONObject.optString("t_u_25"));
                n0oVar.n0n(jSONObjectOptJSONObject.optString("t_u_50"));
                n0oVar.no0(jSONObjectOptJSONObject.optString("t_u_75"));
                n0oVar.noo(jSONObjectOptJSONObject.optString("t_u_100"));
                n0oVar.nom(jSONObjectOptJSONObject.optString("s_e_c_t_u"));
                n0oVar.non(jSONObjectOptJSONObject.optString("c_t_u"));
                n0oVar.nm0(jSONObjectOptJSONObject.optString("ip_n_u"));
                n0oVar.nmo(jSONObjectOptJSONObject.optString("c_n_u"));
                n0oVar.f42210n = jSONObjectOptJSONObject.optInt("o_a_d_c");
                n0oVar.o0 = jSONObjectOptJSONObject.optLong("o_a_p");
                n0oVar.o(j);
                n0oVar.on(jSONObjectOptJSONObject.optInt("unit_type"));
                n0oVar.o(jSONObjectOptJSONObject.optInt("c_m"));
                n0oVar.m(jSONObjectOptJSONObject.optString("ext_h_pic"));
                n0oVar.mno(jSONObjectOptJSONObject.optString("ext_big_h_pic"));
                n0oVar.mnm(jSONObjectOptJSONObject.optString("ext_rect_h_pic"));
                n0oVar.mnn(jSONObjectOptJSONObject.optString("ext_home_h_pic"));
                n0oVar.o(str2);
                n0oVar.om0(jSONObjectOptJSONObject.optString("pub"));
                n0oVar.omo(jSONObjectOptJSONObject.optString("app_vc"));
                n0oVar.omm(jSONObjectOptJSONObject.optString("pvc"));
                n0oVar.omn(jSONObjectOptJSONObject.optString("pms"));
                n0oVar.o((oon) n0nVar);
                arrayList.add(n0oVar);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return arrayList;
    }

    public final Map<String, Object> o(String str, String str2, o0mm o0mmVar, TUAdRequest tUAdRequest) {
        com.thinkup.core.common.on.nn nnVar;
        on0 on0VarN0n;
        int iO;
        Map<String, Object> mapO0n = o0mmVar.o0n();
        boolean zM = com.thinkup.core.common.ooo.nn.m();
        m mVarH = a.h(a.i());
        if (!TextUtils.isEmpty(o0mmVar.mom())) {
            mapO0n.put("payload", o0mmVar.mom());
            if (o0mmVar.n0n() != null && !TextUtils.isEmpty(o0mmVar.n0n().o0o())) {
                mapO0n.put("bidtoken", o0mmVar.n0n().o0o());
            }
        }
        if (!TextUtils.isEmpty(o0mmVar.nm0())) {
            mapO0n.put("custom_inhouse_bid_result", o0mmVar.nm0());
        }
        boolean z2 = false;
        mapO0n.put("app_ccpa_switch", Boolean.valueOf(mVarH.ooo() == 3));
        if (mVarH.oom() == 2 && zM) {
            z2 = true;
        }
        mapO0n.put("app_coppa_switch", Boolean.valueOf(z2));
        mapO0n.put("gdpr_consent", Boolean.valueOf(oom.o(com.thinkup.core.common.n.o0n.m().on()).m(o0mmVar.nm())));
        if (o0mmVar.nm() == 66 && o0mmVar.n0n() != null && (iO = o0mmVar.n0n().o(this.omo)) >= 0) {
            mapO0n.put("ad_type", Integer.valueOf(iO));
        } else {
            mapO0n.put("ad_type", Integer.valueOf(o0mmVar.nnn()));
        }
        if (this.o0n0 == 1) {
            StringBuilder sbX = android.support.v4.media.a.x(str, "_");
            sbX.append(this.m0o);
            sbX.append("_");
            sbX.append(this.oom);
            sbX.append("_");
            sbX.append(str2);
            mapO0n.put(TUAdConst.NETWORK_REQUEST_PARAMS_KEY.MEDIATION_WF_ID, sbX.toString());
        }
        mapO0n.put(TUAdConst.NETWORK_REQUEST_PARAMS_KEY.STACK_INFO, com.thinkup.core.common.ooo.o().om(str));
        if (o0mmVar.nm() == 28 && (on0VarN0n = o0mmVar.n0n()) != null) {
            mapO0n.put(com.thinkup.core.common.n.mo.oon.no, Double.valueOf(com.thinkup.core.common.ooo.nn.o(o0mmVar) * on0VarN0n.n0));
        }
        String strNo = com.thinkup.core.common.ooo.n0.no();
        if (!TextUtils.isEmpty(strNo)) {
            mapO0n.put(TUAdConst.KEY.WECHAT_APPID, strNo);
        }
        if (o0mmVar.nm() == 35 || o0mmVar.om0() == 3 || o0mmVar.om0() == 4 || o0mmVar.om0() == 7) {
            com.thinkup.core.common.on.oom oomVar = new com.thinkup.core.common.on.oom();
            oomVar.mo = o0mmVar.mom();
            oomVar.mm = o0mmVar.nm();
            oomVar.oo = o0mmVar.m0o();
            oomVar.om = str2;
            oomVar.o = str;
            oomVar.f42254n = this.m0o;
            oomVar.o0 = this.oom;
            oomVar.m = this.omo;
            oomVar.mn = o0mmVar.nn();
            if (tUAdRequest != null) {
                oomVar.no = tUAdRequest.getChannelSource();
            }
            oomVar.nn = o0mmVar.o0m();
            on0 on0VarN0n2 = o0mmVar.n0n();
            if (on0VarN0n2 != null) {
                oomVar.nm = on0VarN0n2.o(this.omo);
                oomVar.m0 = on0VarN0n2.oon();
                oomVar.on = on0VarN0n2.getOriginRequestId();
            } else {
                oomVar.nm = -1;
            }
            String str3 = "";
            oomVar.n0 = on0VarN0n2 != null ? on0VarN0n2.on : "";
            if (on0VarN0n2 != null) {
                str3 = on0VarN0n2.m0;
            }
            oomVar.o0o = str3;
            if (o0mmVar.nm() == 35) {
                oomVar.oo0 = this.n0m;
            } else {
                oomVar.oo0 = nno.ooo(this.mo0o);
            }
            oon oonVar = oomVar.oo0;
            if (oonVar != null) {
                oonVar.o0m(this.omo);
            }
            oomVar.o00 = on0VarN0n2 != null ? on0VarN0n2.om : 0L;
            oomVar.o0m = this.moom;
            oomVar.o0n = this.moon;
            com.thinkup.core.o.m.o(mapO0n, o0mmVar, oomVar, oon0());
        }
        if (o0mmVar.nm() == 50 && this.o0nn == 1) {
            mapO0n.put("pangle_request_id", str2);
        }
        TUAdConst.CURRENCY currency = TUAdConst.CURRENCY.RMB;
        if (TextUtils.equals(o0mmVar.o0nn(), "USD")) {
            currency = TUAdConst.CURRENCY.USD;
        }
        mapO0n.put("gm_currency", currency);
        if (o0mmVar.nm() == 2) {
            mapO0n.put(com.thinkup.core.common.n.mo.oon.o0m, o0mmVar.oom0());
            mapO0n.put("admob_init_mode", Integer.valueOf(mVarH.o0mn()));
            mapO0n.put("admob_adsource_id", o0mmVar.m0o());
            if (o0mmVar.om0m() == 1 && (nnVar = this.oomm) != null) {
                mapO0n.put("admob_hybrid_status", Boolean.valueOf(nnVar.o()));
                if (this.oomm.o() || this.oomm.m) {
                    mapO0n.put("mediation_request_id", str2);
                }
            }
        }
        if (o0mmVar.nnn() == 0) {
            mapO0n.put(o.o0oo, Integer.valueOf(this.onmo));
            if (o0mmVar.oomm() == null) {
                mapO0n.put(o.o0om, this.onmm);
            } else {
                mapO0n.put(o.o0om, o0mmVar.oomm());
            }
            mapO0n.put("nw_firm_id", Integer.valueOf(o0mmVar.nm()));
        }
        JSONObject jSONObjectMnn = mVarH.mnn();
        if (jSONObjectMnn != null) {
            try {
                String string = jSONObjectMnn.getString(String.valueOf(o0mmVar.nm()));
                if (!TextUtils.isEmpty(string)) {
                    mapO0n.put("network_ext", string);
                }
            } catch (Exception unused) {
            }
        }
        JSONArray jSONArrayOono = o0mmVar.oono();
        if (jSONArrayOono != null && jSONArrayOono.length() > 0) {
            mapO0n.put("web_content_urls", jSONArrayOono);
        }
        int iOonm = o0mmVar.oonm();
        if (iOonm > 0) {
            mapO0n.put("sys_sp", Integer.valueOf(iOonm));
        }
        mapO0n.put("ad_s_reqf_mode", Integer.valueOf(o0mmVar.oonn()));
        mapO0n.put("ad_format", Integer.valueOf(this.omo));
        mapO0n.put("forbid_gm_refresh", Boolean.valueOf(mVarH.o0mo()));
        if (o0mmVar.nm() == 8) {
            mapO0n.put("load_params_switch", Integer.valueOf(o0mmVar.omm0()));
        }
        if (o0mmVar.nm() == 39) {
            mapO0n.put("bid_max_time", Long.valueOf(o0mmVar.omnn()));
            mapO0n.put("splash_type", Integer.valueOf(o0mmVar.on0m()));
        }
        if (o0mmVar.nm() == 77) {
            mapO0n.put("mediation_request_id", str2);
        }
        if (o0mmVar.nm() == 22) {
            mapO0n.put("bd_imp_type", Integer.valueOf(o0mmVar.o0om()));
        }
        mapO0n.put(com.thinkup.core.common.n.mo.oon.mom, Integer.valueOf(o0mmVar.oo()));
        return mapO0n;
    }

    public final void o(Boolean bool) {
        this.onn0 = bool;
    }

    private void o(mm0 mm0Var) {
        this.onnn = mm0Var;
    }

    private void o(m0o m0oVar) {
        this.m0o0 = m0oVar;
    }

    private boolean o(n0 n0Var) {
        if (n0Var == null) {
            return true;
        }
        return (TextUtils.equals(this.onn, n0Var.onn) || oono()) ? false : true;
    }

    private void m(List<o0mm> list) {
        this.oon = list;
    }

    private void m(JSONArray jSONArray) {
        this.ommm = jSONArray;
    }

    private void m(double d) {
        this.no0 = d;
    }

    private void m(Map<String, TURewardInfo> map) {
        this.mon = map;
    }

    public final n0o m(String str) {
        List<n0o> list = this.n0o;
        if (list == null) {
            return null;
        }
        for (n0o n0oVar : list) {
            if (n0oVar.on() == null) {
                n0oVar.o((oon) this.n0m);
            }
            if (TextUtils.equals(str, n0oVar.mo()) && !n0oVar.o(this.n0m)) {
                return n0oVar;
            }
        }
        return null;
    }

    public final void m(int i2) {
        this.m0no = i2;
    }
}
