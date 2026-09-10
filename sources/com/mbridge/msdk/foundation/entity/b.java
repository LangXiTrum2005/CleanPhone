package com.mbridge.msdk.foundation.entity;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.tools.FastKV;
import com.mbridge.msdk.foundation.tools.g0;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.Frame;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static final String JSON_KEY_ADS = "ads";
    public static final String JSON_KEY_AD_HTML = "cam_html";
    public static final String JSON_KEY_AD_TYPE = "ad_type";
    public static final String JSON_KEY_AD_ZIP = "cam_tpl_url";
    public static final String JSON_KEY_BANNER_HTML = "cam_html";
    public static final String JSON_KEY_BANNER_URL = "cam_tpl_url";
    public static final String JSON_KEY_CSP = "csp";
    public static final String JSON_KEY_C_I = "c_i";
    public static final String JSON_KEY_DO = "do";
    public static final String JSON_KEY_ENCRYPT_PRICE = "encrypt_p";
    public static final String JSON_KEY_END_SCREEN_URL = "end_screen_url";
    public static final String JSON_KEY_FRAME_ADS = "frames";
    public static final String JSON_KEY_HTML_URL = "html_url";
    public static final String JSON_KEY_IA_EXT1 = "ia_all_ext1";
    public static final String JSON_KEY_IA_EXT2 = "ia_all_ext2";
    public static final String JSON_KEY_IA_ICON = "ia_icon";
    public static final String JSON_KEY_IA_ORI = "ia_ori";
    public static final String JSON_KEY_IA_RST = "ia_rst";
    public static final String JSON_KEY_IA_URL = "ia_url";
    public static final String JSON_KEY_JM_DO = "jm_do";
    public static final String JSON_KEY_MOF_TEMPLATE_URL = "mof_template_url";
    public static final String JSON_KEY_MOF_TPLID = "mof_tplid";
    public static final String JSON_KEY_NSCPT = "nscpt";
    public static final String JSON_KEY_ONLY_IMPRESSION_URL = "only_impression_url";
    public static final String JSON_KEY_PARENT_SESSION_ID = "parent_session_id";
    public static final String JSON_KEY_PV_URLS = "pv_urls";
    public static final String JSON_KEY_REPLACE_TMP = "replace_tmp";
    public static final String JSON_KEY_REQ_EXT_DATA = "req_ext_data";
    public static final String JSON_KEY_RKS = "rks";
    public static final String JSON_KEY_SECOND_REQUEST_INDEX = "r_index";
    public static final String JSON_KEY_SECOND_SHOW_INDEX = "s_show_index";
    public static final String JSON_KEY_SESSION_ID = "a";
    public static final String JSON_KEY_SH = "sh";
    public static final String JSON_KEY_TEMPLATE = "template";
    public static final String JSON_KEY_TK_TCP_PORT = "tk_tcp_port";
    public static final String JSON_KEY_TOKEN_RULE = "token_r";
    public static final String JSON_KEY_UNIT_SIZE = "unit_size";
    public static final String JSON_KEY_VCN = "vcn";
    public static final String KEY_IRLFA = "irlfa";
    private static final String TAG = "b";
    private String adHtml;
    private int adType;
    private String adZip;
    public ArrayList<CampaignEx> ads;
    private String bannerHtml;
    private String bannerUrl;
    private String csp;
    private String domain;
    private double ecppv;
    private HashMap<String, String> epMap;
    private String htmlUrl;
    private String ia_all_ext1;
    private String ia_all_ext2;
    private String ia_icon;
    private int ia_ori;
    private int ia_rst;
    private String ia_url;
    private int jmDo;
    private List<Frame> listFrames;
    private String localRequestId;
    private com.mbridge.msdk.foundation.same.report.metrics.c metricsData;
    private String onlyImpressionUrl;
    private String parentSessionId;
    private String requestId;
    private HashMap<String, String> rks;
    private String sessionId;

    /* JADX INFO: renamed from: sh, reason: collision with root package name */
    private String f33545sh;
    private int template;
    private int tokenRule;
    private String unitSize;
    private int vcn;
    protected StringBuffer cParams = new StringBuffer();
    private String encryptPrice = "";
    private String msg = "";
    private int activitySwitch = 1;
    private int secondRequestIndex = 0;
    private int secondShowIndex = 0;

    private static void getSysIDAndBKUPID(JSONObject jSONObject) {
        FastKV fastKVBuild = null;
        if (com.mbridge.msdk.foundation.controller.d.a().e()) {
            try {
                fastKVBuild = new FastKV.Builder(com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_CONFIG), k0.a("H+tU+FeXHM==")).build();
            } catch (Exception unused) {
            }
        }
        if (jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
        String strOptString2 = jSONObject.optString("c");
        if (fastKVBuild != null) {
            try {
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.equals(com.mbridge.msdk.foundation.same.a.V, strOptString)) {
                        com.mbridge.msdk.foundation.same.a.V = strOptString;
                        com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, com.mbridge.msdk.foundation.same.a.V);
                        try {
                            fastKVBuild.putString(k0.a("H+tU+bfPhM=="), com.mbridge.msdk.foundation.same.a.V);
                        } catch (Exception unused2) {
                        }
                    }
                    if (!TextUtils.isEmpty(strOptString2) && !TextUtils.equals(com.mbridge.msdk.foundation.same.a.f33721g, strOptString2)) {
                        com.mbridge.msdk.foundation.same.a.f33721g = strOptString2;
                        com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("c", com.mbridge.msdk.foundation.same.a.f33721g);
                        try {
                            fastKVBuild.putString(k0.a("H+tU+Fz8"), com.mbridge.msdk.foundation.same.a.f33721g);
                        } catch (Exception unused3) {
                        }
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } else {
            try {
                Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                if (contextD != null) {
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.equals(com.mbridge.msdk.foundation.same.a.V, strOptString)) {
                        com.mbridge.msdk.foundation.same.a.V = strOptString;
                        com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, com.mbridge.msdk.foundation.same.a.V);
                        SharedPreferences sharedPreferences = contextD.getSharedPreferences(k0.a("H+tU+FeXHM=="), 0);
                        if (sharedPreferences != null) {
                            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                            editorEdit.putString(k0.a("H+tU+bfPhM=="), com.mbridge.msdk.foundation.same.a.V);
                            editorEdit.apply();
                        }
                    }
                    if (!TextUtils.isEmpty(strOptString2) && !TextUtils.equals(com.mbridge.msdk.foundation.same.a.f33721g, strOptString2)) {
                        com.mbridge.msdk.foundation.same.a.f33721g = strOptString2;
                        com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("c", com.mbridge.msdk.foundation.same.a.f33721g);
                        SharedPreferences sharedPreferences2 = contextD.getSharedPreferences(k0.a("H+tU+FeXHM=="), 0);
                        if (sharedPreferences2 != null) {
                            SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
                            editorEdit2.putString(k0.a("H+tU+Fz8"), com.mbridge.msdk.foundation.same.a.f33721g);
                            editorEdit2.apply();
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        try {
            if (TextUtils.isEmpty(strOptString) && TextUtils.isEmpty(strOptString2)) {
                return;
            }
            new com.mbridge.msdk.config.component.common.util.d().a(strOptString, strOptString2);
        } catch (Throwable th2) {
            q0.b(TAG, th2.getMessage());
        }
    }

    public static CampaignUnit parseCampaignUnit(JSONObject jSONObject) {
        return parseCampaignUnit(jSONObject, "");
    }

    public static CampaignUnit parseV5CampaignUnit(JSONObject jSONObject) {
        return parseV5CampaignUnit(jSONObject, "");
    }

    public abstract String assembCParams();

    public int getActivitySwitch() {
        return this.activitySwitch;
    }

    public String getAdHtml() {
        return this.adHtml;
    }

    public int getAdType() {
        return this.adType;
    }

    public String getAdZip() {
        return this.adZip;
    }

    public ArrayList<CampaignEx> getAds() {
        return this.ads;
    }

    public String getBannerHtml() {
        return this.bannerHtml;
    }

    public String getBannerUrl() {
        return this.bannerUrl;
    }

    public String getCsp() {
        return this.csp;
    }

    public String getDomain() {
        return this.domain;
    }

    public double getEcppv() {
        return this.ecppv;
    }

    public String getEncryptPrice() {
        return this.encryptPrice;
    }

    public HashMap<String, String> getEpMap() {
        return this.epMap;
    }

    public String getHtmlUrl() {
        return this.htmlUrl;
    }

    public String getIa_all_ext1() {
        return this.ia_all_ext1;
    }

    public String getIa_all_ext2() {
        return this.ia_all_ext2;
    }

    public String getIa_icon() {
        return this.ia_icon;
    }

    public int getIa_ori() {
        return this.ia_ori;
    }

    public int getIa_rst() {
        return this.ia_rst;
    }

    public String getIa_url() {
        return this.ia_url;
    }

    public int getJmDo() {
        return this.jmDo;
    }

    public List<Frame> getListFrames() {
        return this.listFrames;
    }

    public String getLocalRequestId() {
        return this.localRequestId;
    }

    public com.mbridge.msdk.foundation.same.report.metrics.c getMetricsData() {
        return this.metricsData;
    }

    public String getMsg() {
        return this.msg;
    }

    public String getOnlyImpressionUrl() {
        return this.onlyImpressionUrl;
    }

    public String getParentSessionId() {
        return this.parentSessionId;
    }

    public String getRequestId() {
        try {
            if (!TextUtils.isEmpty(this.requestId)) {
                return this.requestId;
            }
            if (TextUtils.isEmpty(this.onlyImpressionUrl)) {
                return "";
            }
            Uri uri = Uri.parse(this.onlyImpressionUrl);
            if (uri != null) {
                this.requestId = uri.getQueryParameter(CampaignEx.JSON_KEY_AD_K);
            }
            return this.requestId;
        } catch (Exception unused) {
            return "";
        }
    }

    public HashMap<String, String> getRks() {
        return this.rks;
    }

    public int getSecondRequestIndex() {
        return this.secondRequestIndex;
    }

    public int getSecondShowIndex() {
        return this.secondShowIndex;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public String getSh() {
        return this.f33545sh;
    }

    public int getTemplate() {
        return this.template;
    }

    public int getTokenRule() {
        int i10 = this.tokenRule;
        if (i10 == 1) {
            return i10;
        }
        return 0;
    }

    public String getUnitSize() {
        return this.unitSize;
    }

    public int getVcn() {
        int i10 = this.vcn;
        if (i10 > 1) {
            return i10;
        }
        return 1;
    }

    public Object nullToEmpty(Object obj) {
        return obj == null ? "" : obj;
    }

    public void setActivitySwitch(int i10) {
        this.activitySwitch = i10;
    }

    public void setAdHtml(String str) {
        this.adHtml = str;
    }

    public void setAdType(int i10) {
        this.adType = i10;
    }

    public void setAdZip(String str) {
        this.adZip = str;
    }

    public void setAds(ArrayList<CampaignEx> arrayList) {
        this.ads = arrayList;
    }

    public void setBannerHtml(String str) {
        this.bannerHtml = str;
    }

    public void setBannerUrl(String str) {
        this.bannerUrl = str;
    }

    public void setCsp(String str) {
        this.csp = str;
    }

    public void setDomain(String str) {
        this.domain = str;
    }

    public void setEcppv(double d10) {
        this.ecppv = d10;
    }

    public void setEncryptPrice(String str) {
        this.encryptPrice = str;
    }

    public void setEpMap(HashMap<String, String> map) {
        this.epMap = map;
    }

    public void setHtmlUrl(String str) {
        this.htmlUrl = str;
    }

    public void setIa_all_ext1(String str) {
        this.ia_all_ext1 = str;
    }

    public void setIa_all_ext2(String str) {
        this.ia_all_ext2 = str;
    }

    public void setIa_icon(String str) {
        this.ia_icon = str;
    }

    public void setIa_ori(int i10) {
        this.ia_ori = i10;
    }

    public void setIa_rst(int i10) {
        this.ia_rst = i10;
    }

    public void setIa_url(String str) {
        this.ia_url = str;
    }

    public void setJmDo(int i10) {
        this.jmDo = i10;
    }

    public void setListFrames(List<Frame> list) {
        this.listFrames = list;
    }

    public void setLocalRequestId(String str) {
        this.localRequestId = str;
        Iterator<CampaignEx> it = getAds().iterator();
        while (it.hasNext()) {
            it.next().setLocalRequestId(str);
        }
    }

    public void setMetricsData(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        this.metricsData = cVar;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setOnlyImpressionUrl(String str) {
        this.onlyImpressionUrl = str;
    }

    public void setParentSessionId(String str) {
        this.parentSessionId = str;
    }

    public void setRks(HashMap<String, String> map) {
        this.rks = map;
    }

    public void setSecondRequestIndex(int i10) {
        this.secondRequestIndex = i10;
    }

    public void setSecondShowIndex(int i10) {
        this.secondShowIndex = i10;
    }

    public void setSessionId(String str) {
        this.sessionId = str;
    }

    public void setSh(String str) {
        this.f33545sh = str;
    }

    public void setTemplate(int i10) {
        this.template = i10;
    }

    public void setTokenRule(int i10) {
        this.tokenRule = i10;
    }

    public void setUnitSize(String str) {
        this.unitSize = str;
    }

    public void setVcn(int i10) {
        this.vcn = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.mbridge.msdk.foundation.entity.CampaignUnit] */
    /* JADX WARN: Type inference failed for: r11v10, types: [com.mbridge.msdk.foundation.entity.CampaignEx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v2, types: [com.mbridge.msdk.foundation.entity.CampaignEx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v36, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r13v38 */
    /* JADX WARN: Type inference failed for: r13v39, types: [com.mbridge.msdk.foundation.entity.b] */
    /* JADX WARN: Type inference failed for: r13v40 */
    /* JADX WARN: Type inference failed for: r13v42, types: [com.mbridge.msdk.foundation.entity.b] */
    /* JADX WARN: Type inference failed for: r13v43 */
    /* JADX WARN: Type inference failed for: r13v44 */
    /* JADX WARN: Type inference failed for: r13v45, types: [com.mbridge.msdk.foundation.entity.b] */
    /* JADX WARN: Type inference failed for: r13v46 */
    /* JADX WARN: Type inference failed for: r13v48 */
    /* JADX WARN: Type inference failed for: r13v51 */
    /* JADX WARN: Type inference failed for: r13v55 */
    /* JADX WARN: Type inference failed for: r13v56 */
    /* JADX WARN: Type inference failed for: r13v57 */
    /* JADX WARN: Type inference failed for: r13v58 */
    /* JADX WARN: Type inference failed for: r15v8, types: [com.mbridge.msdk.foundation.tools.g0] */
    /* JADX WARN: Type inference failed for: r17v0, types: [com.mbridge.msdk.foundation.entity.CampaignUnit] */
    /* JADX WARN: Type inference failed for: r30v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public static CampaignUnit parseCampaignUnit(JSONObject jSONObject, String str) {
        ?? OptString;
        ArrayList arrayList;
        String str2;
        int i10;
        String str3 = JSON_KEY_ADS;
        String str4 = "a";
        String str5 = CampaignEx.JSON_KEY_ECPPV;
        String str6 = JSON_KEY_ONLY_IMPRESSION_URL;
        String str7 = JSON_KEY_HTML_URL;
        if (jSONObject != null) {
            try {
                CampaignUnit campaignUnit = new CampaignUnit();
                try {
                    String strOptString = jSONObject.optString(JSON_KEY_RKS);
                    if (!TextUtils.isEmpty(strOptString)) {
                        JSONObject jSONObject2 = new JSONObject(strOptString);
                        Iterator<String> itKeys = jSONObject2.keys();
                        HashMap<String, String> map = new HashMap<>();
                        while (itKeys != null && itKeys.hasNext()) {
                            String next = itKeys.next();
                            map.put(next, jSONObject2.optString(next));
                        }
                        campaignUnit.setRks(map);
                    }
                    if (!TextUtils.isEmpty(str)) {
                        HashMap<String, String> map2 = new HashMap<>();
                        map2.put("encrypt_p", "");
                        map2.put(KEY_IRLFA, "");
                        campaignUnit.setEpMap(map2);
                    }
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(JSON_KEY_REQ_EXT_DATA);
                    int iOptInt = jSONObject.optInt(JSON_KEY_NSCPT, 1);
                    String strOptString2 = jSONObject.optString(JSON_KEY_MOF_TEMPLATE_URL, "");
                    int iOptInt2 = jSONObject.optInt(JSON_KEY_MOF_TPLID, 0);
                    String string = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.toString() : "";
                    new JSONArray();
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("pv_urls");
                    if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                        arrayList = null;
                    } else {
                        ArrayList arrayList2 = new ArrayList(jSONArrayOptJSONArray.length());
                        for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                            arrayList2.add(jSONArrayOptJSONArray.getString(i11));
                        }
                        arrayList = arrayList2;
                    }
                    com.mbridge.msdk.foundation.db.middle.b.a().a(jSONObject.optJSONObject(JSON_KEY_REPLACE_TMP), true);
                    getSysIDAndBKUPID(jSONObject);
                    campaignUnit.setSessionId(jSONObject.optString("a"));
                    campaignUnit.setParentSessionId(jSONObject.optString(JSON_KEY_PARENT_SESSION_ID));
                    campaignUnit.setAdType(jSONObject.optInt("ad_type"));
                    campaignUnit.setUnitSize(jSONObject.optString(JSON_KEY_UNIT_SIZE));
                    campaignUnit.setHtmlUrl(jSONObject.optString(JSON_KEY_HTML_URL));
                    campaignUnit.setOnlyImpressionUrl(jSONObject.optString(JSON_KEY_ONLY_IMPRESSION_URL));
                    campaignUnit.setActivitySwitch(jSONObject.optInt(CampaignEx.KEY_ACTIVITY_CHECK_SWITCH));
                    campaignUnit.setEcppv(jSONObject.optDouble(CampaignEx.JSON_KEY_ECPPV));
                    campaignUnit.setTemplate(jSONObject.optInt("template"));
                    campaignUnit.setJmDo(jSONObject.optInt(JSON_KEY_JM_DO));
                    campaignUnit.setIa_icon(jSONObject.optString("ia_icon"));
                    campaignUnit.setIa_rst(jSONObject.optInt("ia_rst"));
                    campaignUnit.setIa_url(jSONObject.optString("ia_url"));
                    campaignUnit.setIa_ori(jSONObject.optInt("ia_ori"));
                    campaignUnit.setIa_all_ext1(jSONObject.optString(JSON_KEY_IA_EXT1));
                    campaignUnit.setIa_all_ext2(jSONObject.optString(JSON_KEY_IA_EXT2));
                    campaignUnit.setVcn(jSONObject.optInt("vcn"));
                    campaignUnit.setTokenRule(jSONObject.optInt("token_r"));
                    campaignUnit.setEncryptPrice(jSONObject.optString("encrypt_p"));
                    campaignUnit.setSecondRequestIndex(jSONObject.optInt("r_index", 0));
                    campaignUnit.setSecondShowIndex(jSONObject.optInt("s_show_index", 0));
                    JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(JSON_KEY_ADS);
                    JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray(JSON_KEY_FRAME_ADS);
                    OptString = jSONObject.optString(JSON_KEY_C_I, "");
                    g0.a().a(OptString);
                    String str8 = "web env is not support";
                    String str9 = JSON_KEY_END_SCREEN_URL;
                    try {
                        try {
                            if (jSONArrayOptJSONArray3 == null || jSONArrayOptJSONArray3.length() <= 0) {
                                String str10 = CampaignEx.JSON_KEY_ECPPV;
                                String str11 = JSON_KEY_ONLY_IMPRESSION_URL;
                                String str12 = JSON_KEY_HTML_URL;
                                String str13 = JSON_KEY_END_SCREEN_URL;
                                String str14 = string;
                                int i12 = iOptInt2;
                                OptString = campaignUnit;
                                if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
                                    ArrayList arrayList3 = new ArrayList();
                                    int i13 = 0;
                                    OptString = OptString;
                                    while (i13 < jSONArrayOptJSONArray2.length()) {
                                        JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(i13);
                                        JSONArray jSONArray = jSONArrayOptJSONArray2;
                                        String str15 = str11;
                                        String strOptString3 = jSONObject.optString(str15);
                                        ?? r17 = OptString;
                                        String str16 = str14;
                                        String str17 = str12;
                                        try {
                                            String strOptString4 = jSONObject.optString(str17);
                                            int i14 = i12;
                                            str12 = str17;
                                            String str18 = str13;
                                            String strOptString5 = jSONObject.optString(str18);
                                            String str19 = str10;
                                            str10 = str19;
                                            int i15 = i13;
                                            ?? campaign = CampaignEx.parseCampaign(jSONObjectOptJSONObject2, strOptString3, strOptString4, strOptString5, false, r17, str, jSONObject.optString(str19));
                                            ?? r13 = r17;
                                            if (campaign != 0) {
                                                campaign.setNetAddress(OptString);
                                                campaign.setMof_tplid(i14);
                                                campaign.setMof_template_url(strOptString2);
                                                campaign.setNscpt(iOptInt);
                                                campaign.setPv_urls(arrayList);
                                                campaign.setReq_ext_data(str16);
                                                campaign.setVcn(r13.getVcn());
                                                campaign.setTokenRule(r13.getTokenRule());
                                                campaign.setEncryptPrice(r13.getEncryptPrice());
                                                campaign.setAc_s(jSONObject.optInt(CampaignEx.KEY_ACTIVITY_CHECK_SWITCH, 1));
                                                arrayList3.add(campaign);
                                            } else {
                                                r13.setMsg(str8);
                                            }
                                            str14 = str16;
                                            str11 = str15;
                                            i12 = i14;
                                            i13 = i15 + 1;
                                            jSONArrayOptJSONArray2 = jSONArray;
                                            str13 = str18;
                                            OptString = r13;
                                        } catch (Exception unused) {
                                            OptString = r17;
                                        }
                                    }
                                    OptString.setAds(arrayList3);
                                }
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                String str20 = "template";
                                CampaignUnit campaignUnit2 = campaignUnit;
                                int i16 = 0;
                                ?? r14 = OptString;
                                while (i16 < jSONArrayOptJSONArray3.length()) {
                                    try {
                                        JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray3.optJSONObject(i16);
                                        int i17 = i16;
                                        JSONArray jSONArray2 = jSONObjectOptJSONObject3.getJSONArray(str3);
                                        String str21 = str3;
                                        ArrayList arrayList5 = new ArrayList();
                                        String str22 = str4;
                                        JSONObject jSONObject3 = jSONObjectOptJSONObject3;
                                        int i18 = 0;
                                        ?? r15 = r14;
                                        while (i18 < jSONArray2.length()) {
                                            JSONObject jSONObjectOptJSONObject4 = jSONArray2.optJSONObject(i18);
                                            ArrayList arrayList6 = arrayList4;
                                            String strOptString6 = jSONObject.optString(str6);
                                            ?? r30 = r15;
                                            String strOptString7 = jSONObject.optString(str7);
                                            JSONArray jSONArray3 = jSONArrayOptJSONArray3;
                                            String str23 = str9;
                                            String str24 = strOptString2;
                                            JSONArray jSONArray4 = jSONArray2;
                                            int i19 = iOptInt;
                                            int i20 = i18;
                                            JSONObject jSONObject4 = jSONObject3;
                                            String str25 = str7;
                                            String str26 = str8;
                                            CampaignUnit campaignUnit3 = campaignUnit2;
                                            String str27 = str5;
                                            String str28 = str6;
                                            ?? campaign2 = CampaignEx.parseCampaign(jSONObjectOptJSONObject4, strOptString6, strOptString7, jSONObject.optString(str9), false, campaignUnit3, str, jSONObject.optString(str5));
                                            if (campaign2 != 0) {
                                                campaign2.setNetAddress(r30);
                                                campaign2.setKeyIaUrl(campaignUnit3.getIa_url());
                                                campaign2.setKeyIaOri(campaignUnit3.getIa_ori());
                                                campaign2.setKeyIaRst(campaignUnit3.getIa_rst());
                                                campaign2.setKeyIaIcon(campaignUnit3.getIa_icon());
                                                campaign2.setAdType(jSONObject.optInt("ad_type"));
                                                campaign2.setIa_ext1(jSONObject.optString(CampaignEx.KEY_IA_EXT1));
                                                campaign2.setIa_ext2(jSONObject.optString(CampaignEx.KEY_IA_EXT2));
                                                campaign2.setAc_s(jSONObject.optInt(CampaignEx.KEY_ACTIVITY_CHECK_SWITCH, 1));
                                                campaign2.setVcn(campaignUnit3.getVcn());
                                                campaign2.setTokenRule(campaignUnit3.getTokenRule());
                                                campaign2.setEncryptPrice(campaignUnit3.getEncryptPrice());
                                                i10 = iOptInt2;
                                                campaign2.setMof_tplid(i10);
                                                campaign2.setMof_template_url(str24);
                                                campaign2.setNscpt(i19);
                                                campaign2.setPv_urls(arrayList);
                                                str2 = string;
                                                campaign2.setReq_ext_data(str2);
                                                arrayList5.add(campaign2);
                                            } else {
                                                str2 = string;
                                                i10 = iOptInt2;
                                                campaignUnit3.setMsg(str26);
                                            }
                                            int i21 = i20 + 1;
                                            r15 = r30;
                                            str5 = str27;
                                            campaignUnit2 = campaignUnit3;
                                            iOptInt = i19;
                                            str8 = str26;
                                            iOptInt2 = i10;
                                            string = str2;
                                            jSONArray2 = jSONArray4;
                                            str7 = str25;
                                            str6 = str28;
                                            arrayList4 = arrayList6;
                                            jSONArrayOptJSONArray3 = jSONArray3;
                                            jSONObject3 = jSONObject4;
                                            str9 = str23;
                                            strOptString2 = str24;
                                            i18 = i21;
                                        }
                                        ArrayList arrayList7 = arrayList4;
                                        Frame frame = new Frame();
                                        frame.setParentSessionId(jSONObject.optString(JSON_KEY_PARENT_SESSION_ID));
                                        frame.setSessionId(jSONObject.optString(str22));
                                        frame.setCampaigns(arrayList5);
                                        String str29 = str20;
                                        frame.setTemplate(jSONObject3.optInt(str29));
                                        arrayList7.add(frame);
                                        r14 = r15;
                                        str5 = str5;
                                        campaignUnit2 = campaignUnit2;
                                        str20 = str29;
                                        iOptInt = iOptInt;
                                        strOptString2 = strOptString2;
                                        str8 = str8;
                                        i16 = i17 + 1;
                                        str4 = str22;
                                        iOptInt2 = iOptInt2;
                                        string = string;
                                        str3 = str21;
                                        str7 = str7;
                                        jSONArrayOptJSONArray3 = jSONArrayOptJSONArray3;
                                        str9 = str9;
                                        arrayList4 = arrayList7;
                                        str6 = str6;
                                    } catch (Exception unused2) {
                                        OptString = campaignUnit2;
                                    }
                                }
                                OptString = campaignUnit2;
                                OptString.setListFrames(arrayList4);
                            }
                        } catch (Exception unused3) {
                        }
                    } catch (Exception unused4) {
                        OptString = str8;
                    }
                } catch (Exception unused5) {
                    OptString = campaignUnit;
                }
                return OptString;
            } catch (Exception unused6) {
            }
        }
        return null;
    }

    public static CampaignUnit parseV5CampaignUnit(JSONObject jSONObject, String str) {
        return parseCampaignUnit(jSONObject, str);
    }
}
