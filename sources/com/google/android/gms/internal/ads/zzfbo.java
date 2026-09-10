package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import androidx.annotation.Nullable;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.umeng.analytics.pro.bc;
import com.umeng.analytics.pro.cw;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2390Ej;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfbo {

    @Nullable
    public final zzbxr zzA;
    public final String zzB;
    public final JSONObject zzC;
    public final JSONObject zzD;
    public final String zzE;
    public final String zzF;
    public final String zzG;
    public final String zzH;
    public final String zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final int zzQ;
    public final int zzR;
    public final boolean zzS;
    public final boolean zzT;
    public final String zzU;
    public final zzfcm zzV;
    public final boolean zzW;
    public final boolean zzX;
    public final int zzY;
    public final String zzZ;
    public final List zza;
    public final int zzaa;
    public final String zzab;
    public final boolean zzac;

    @Nullable
    public final zzbtk zzad;

    @Nullable
    public final com.google.android.gms.ads.internal.client.zzu zzae;
    public final String zzaf;
    public final boolean zzag;
    public final JSONObject zzah;
    public final boolean zzai;
    public final JSONObject zzaj;
    public final boolean zzak;

    @Nullable
    public final String zzal;
    public final boolean zzam;
    public final String zzan;
    public final String zzao;
    public final String zzap;
    public final boolean zzaq;
    public final boolean zzar;
    public final int zzas;
    public final String zzat;
    public final List zzau;
    public final boolean zzav;
    public final Map zzaw;

    @Nullable
    public final com.google.android.gms.ads.internal.util.client.zzv zzax;

    @Nullable
    public final com.google.android.gms.ads.internal.util.client.zzw zzay;
    public final int zzb;
    public final List zzc;
    public final List zzd;
    public final int zze;
    public final List zzf;
    public final List zzg;
    public final List zzh;
    public final List zzi;
    public final String zzj;
    public final String zzk;

    @Nullable
    public final zzbwi zzl;
    public final List zzm;
    public final List zzn;
    public final List zzo;
    public final List zzp;
    public final int zzq;
    public final List zzr;

    @Nullable
    public final zzfbt zzs;
    public final List zzt;
    public final List zzu;
    public final JSONObject zzv;
    public final String zzw;
    public final String zzx;
    public final String zzy;
    public final String zzz;

    /* JADX WARN: Code duplicated, block: B:249:0x0693 A[PHI: r22 r83
  0x0693: PHI (r22v85 java.util.List) = 
  (r22v5 java.util.List)
  (r22v6 java.util.List)
  (r22v7 java.util.List)
  (r22v8 java.util.List)
  (r22v9 java.util.List)
  (r22v10 java.util.List)
  (r22v11 java.util.List)
  (r22v12 java.util.List)
  (r22v13 java.util.List)
  (r22v14 java.util.List)
  (r22v15 java.util.List)
  (r22v16 java.util.List)
  (r22v17 java.util.List)
  (r22v18 java.util.List)
  (r22v19 java.util.List)
  (r22v20 java.util.List)
  (r22v21 java.util.List)
  (r22v22 java.util.List)
  (r22v23 java.util.List)
  (r22v24 java.util.List)
  (r22v25 java.util.List)
  (r22v26 java.util.List)
  (r22v27 java.util.List)
  (r22v28 java.util.List)
  (r22v29 java.util.List)
  (r22v30 java.util.List)
  (r22v31 java.util.List)
  (r22v32 java.util.List)
  (r22v33 java.util.List)
  (r22v34 java.util.List)
  (r22v35 java.util.List)
  (r22v36 java.util.List)
  (r22v37 java.util.List)
  (r22v38 java.util.List)
  (r22v39 java.util.List)
  (r22v40 java.util.List)
  (r22v41 java.util.List)
  (r22v42 java.util.List)
  (r22v43 java.util.List)
  (r22v44 java.util.List)
  (r22v45 java.util.List)
  (r22v46 java.util.List)
  (r22v47 java.util.List)
  (r22v48 java.util.List)
  (r22v49 java.util.List)
  (r22v50 java.util.List)
  (r22v51 java.util.List)
  (r22v52 java.util.List)
  (r22v53 java.util.List)
  (r22v54 java.util.List)
  (r22v55 java.util.List)
  (r22v56 java.util.List)
  (r22v57 java.util.List)
  (r22v58 java.util.List)
  (r22v59 java.util.List)
  (r22v60 java.util.List)
  (r22v61 java.util.List)
  (r22v62 java.util.List)
  (r22v63 java.util.List)
  (r22v64 java.util.List)
  (r22v65 java.util.List)
  (r22v66 java.util.List)
  (r22v67 java.util.List)
  (r22v68 java.util.List)
  (r22v69 java.util.List)
  (r22v70 java.util.List)
  (r22v71 java.util.List)
  (r22v72 java.util.List)
  (r22v73 java.util.List)
  (r22v74 java.util.List)
  (r22v75 java.util.List)
  (r22v76 java.util.List)
  (r22v77 java.util.List)
  (r22v78 java.util.List)
  (r22v79 java.util.List)
  (r22v80 java.util.List)
  (r22v81 java.util.List)
  (r22v82 java.util.List)
  (r22v83 java.util.List)
  (r22v86 java.util.List)
 binds: [B:247:0x068e, B:244:0x067d, B:241:0x066c, B:238:0x065b, B:235:0x064a, B:232:0x0639, B:229:0x0627, B:226:0x0615, B:223:0x0603, B:220:0x05f1, B:217:0x05df, B:214:0x05cd, B:211:0x05bb, B:208:0x05a9, B:205:0x0597, B:202:0x0585, B:199:0x0573, B:196:0x0561, B:193:0x054f, B:190:0x053d, B:187:0x052b, B:184:0x0519, B:181:0x0507, B:178:0x04f5, B:175:0x04e3, B:172:0x04d1, B:169:0x04c0, B:166:0x04ae, B:163:0x049c, B:160:0x048a, B:157:0x0478, B:154:0x0466, B:151:0x0454, B:148:0x0442, B:145:0x0431, B:142:0x041f, B:139:0x040d, B:136:0x03fc, B:133:0x03ea, B:130:0x03d8, B:127:0x03c6, B:124:0x03b4, B:121:0x03a2, B:118:0x0390, B:115:0x037e, B:112:0x036c, B:109:0x035a, B:106:0x0348, B:103:0x0336, B:100:0x0324, B:97:0x0312, B:94:0x0300, B:91:0x02ee, B:88:0x02dc, B:85:0x02cb, B:82:0x02b9, B:79:0x02a7, B:76:0x0295, B:73:0x0283, B:70:0x0271, B:67:0x0260, B:64:0x024e, B:61:0x023c, B:58:0x022a, B:55:0x0218, B:52:0x0206, B:49:0x01f4, B:46:0x01e2, B:43:0x01d0, B:40:0x01be, B:37:0x01ad, B:34:0x019b, B:31:0x018a, B:28:0x0178, B:25:0x0167, B:22:0x0155, B:19:0x0143, B:16:0x0131, B:13:0x011f, B:11:0x010d] A[DONT_GENERATE, DONT_INLINE]
  0x0693: PHI (r83v81 java.util.List) = 
  (r83v1 java.util.List)
  (r83v2 java.util.List)
  (r83v3 java.util.List)
  (r83v4 java.util.List)
  (r83v5 java.util.List)
  (r83v6 java.util.List)
  (r83v7 java.util.List)
  (r83v8 java.util.List)
  (r83v9 java.util.List)
  (r83v10 java.util.List)
  (r83v11 java.util.List)
  (r83v12 java.util.List)
  (r83v13 java.util.List)
  (r83v14 java.util.List)
  (r83v15 java.util.List)
  (r83v16 java.util.List)
  (r83v17 java.util.List)
  (r83v18 java.util.List)
  (r83v19 java.util.List)
  (r83v20 java.util.List)
  (r83v21 java.util.List)
  (r83v22 java.util.List)
  (r83v23 java.util.List)
  (r83v24 java.util.List)
  (r83v25 java.util.List)
  (r83v26 java.util.List)
  (r83v27 java.util.List)
  (r83v28 java.util.List)
  (r83v29 java.util.List)
  (r83v30 java.util.List)
  (r83v31 java.util.List)
  (r83v32 java.util.List)
  (r83v33 java.util.List)
  (r83v34 java.util.List)
  (r83v35 java.util.List)
  (r83v36 java.util.List)
  (r83v37 java.util.List)
  (r83v38 java.util.List)
  (r83v39 java.util.List)
  (r83v40 java.util.List)
  (r83v41 java.util.List)
  (r83v42 java.util.List)
  (r83v43 java.util.List)
  (r83v44 java.util.List)
  (r83v45 java.util.List)
  (r83v46 java.util.List)
  (r83v47 java.util.List)
  (r83v48 java.util.List)
  (r83v49 java.util.List)
  (r83v50 java.util.List)
  (r83v51 java.util.List)
  (r83v52 java.util.List)
  (r83v53 java.util.List)
  (r83v54 java.util.List)
  (r83v55 java.util.List)
  (r83v56 java.util.List)
  (r83v57 java.util.List)
  (r83v58 java.util.List)
  (r83v59 java.util.List)
  (r83v60 java.util.List)
  (r83v61 java.util.List)
  (r83v62 java.util.List)
  (r83v63 java.util.List)
  (r83v64 java.util.List)
  (r83v65 java.util.List)
  (r83v66 java.util.List)
  (r83v67 java.util.List)
  (r83v68 java.util.List)
  (r83v69 java.util.List)
  (r83v70 java.util.List)
  (r83v71 java.util.List)
  (r83v72 java.util.List)
  (r83v73 java.util.List)
  (r83v74 java.util.List)
  (r83v75 java.util.List)
  (r83v76 java.util.List)
  (r83v77 java.util.List)
  (r83v78 java.util.List)
  (r83v79 java.util.List)
  (r83v82 java.util.List)
 binds: [B:247:0x068e, B:244:0x067d, B:241:0x066c, B:238:0x065b, B:235:0x064a, B:232:0x0639, B:229:0x0627, B:226:0x0615, B:223:0x0603, B:220:0x05f1, B:217:0x05df, B:214:0x05cd, B:211:0x05bb, B:208:0x05a9, B:205:0x0597, B:202:0x0585, B:199:0x0573, B:196:0x0561, B:193:0x054f, B:190:0x053d, B:187:0x052b, B:184:0x0519, B:181:0x0507, B:178:0x04f5, B:175:0x04e3, B:172:0x04d1, B:169:0x04c0, B:166:0x04ae, B:163:0x049c, B:160:0x048a, B:157:0x0478, B:154:0x0466, B:151:0x0454, B:148:0x0442, B:145:0x0431, B:142:0x041f, B:139:0x040d, B:136:0x03fc, B:133:0x03ea, B:130:0x03d8, B:127:0x03c6, B:124:0x03b4, B:121:0x03a2, B:118:0x0390, B:115:0x037e, B:112:0x036c, B:109:0x035a, B:106:0x0348, B:103:0x0336, B:100:0x0324, B:97:0x0312, B:94:0x0300, B:91:0x02ee, B:88:0x02dc, B:85:0x02cb, B:82:0x02b9, B:79:0x02a7, B:76:0x0295, B:73:0x0283, B:70:0x0271, B:67:0x0260, B:64:0x024e, B:61:0x023c, B:58:0x022a, B:55:0x0218, B:52:0x0206, B:49:0x01f4, B:46:0x01e2, B:43:0x01d0, B:40:0x01be, B:37:0x01ad, B:34:0x019b, B:31:0x018a, B:28:0x0178, B:25:0x0167, B:22:0x0155, B:19:0x0143, B:16:0x0131, B:13:0x011f, B:11:0x010d] A[DONT_GENERATE, DONT_INLINE]] */
    public zzfbo(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException, NumberFormatException {
        List list;
        List list2;
        byte b;
        List listEmptyList = Collections.emptyList();
        List listEmptyList2 = Collections.emptyList();
        List listEmptyList3 = Collections.emptyList();
        List listEmptyList4 = Collections.emptyList();
        List listEmptyList5 = Collections.emptyList();
        List listEmptyList6 = Collections.emptyList();
        List listEmptyList7 = Collections.emptyList();
        List listEmptyList8 = Collections.emptyList();
        List listEmptyList9 = Collections.emptyList();
        List listEmptyList10 = Collections.emptyList();
        List listEmptyList11 = Collections.emptyList();
        List listEmptyList12 = Collections.emptyList();
        List listEmptyList13 = Collections.emptyList();
        List listEmptyList14 = Collections.emptyList();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        zzfxn.zzn();
        zzfxn zzfxnVarZzn = zzfxn.zzn();
        HashMap map = new HashMap();
        jsonReader.beginObject();
        JSONObject jSONObjectZzi = jSONObject2;
        JSONObject jSONObjectZzi2 = jSONObject3;
        JSONObject jSONObjectZzi3 = jSONObject4;
        JSONObject jSONObjectZzi4 = jSONObject5;
        JSONObject jSONObjectZzi5 = jSONObject6;
        List listZzd = zzfxnVarZzn;
        Map mapZze = map;
        zzfbt zzfbtVar = null;
        zzbxr zzbxrVarZza = null;
        zzbtk zzbtkVarZza = null;
        com.google.android.gms.ads.internal.client.zzu zzuVarZza = null;
        String strNextString = null;
        com.google.android.gms.ads.internal.util.client.zzv zzvVarZza = null;
        com.google.android.gms.ads.internal.util.client.zzw zzwVarZzd = null;
        String strNextString2 = "";
        String strNextString3 = strNextString2;
        String strNextString4 = strNextString3;
        String string = strNextString4;
        String strNextString5 = string;
        String strNextString6 = strNextString5;
        String strNextString7 = strNextString6;
        String strNextString8 = strNextString7;
        String strNextString9 = strNextString8;
        String strNextString10 = strNextString9;
        String strNextString11 = strNextString10;
        String strNextString12 = strNextString11;
        String strNextString13 = strNextString12;
        String strNextString14 = strNextString13;
        String strNextString15 = strNextString14;
        String strNextString16 = strNextString15;
        String strNextString17 = strNextString16;
        String strNextString18 = strNextString17;
        int iNextInt = 0;
        boolean zNextBoolean = false;
        boolean zNextBoolean2 = false;
        boolean zNextBoolean3 = false;
        boolean zNextBoolean4 = false;
        boolean zNextBoolean5 = false;
        boolean zNextBoolean6 = false;
        boolean zNextBoolean7 = false;
        int iZzd = -1;
        int iNextInt2 = 0;
        boolean zNextBoolean8 = false;
        boolean zNextBoolean9 = false;
        boolean zNextBoolean10 = false;
        int iNextInt3 = 0;
        int iNextInt4 = -1;
        boolean zNextBoolean11 = false;
        boolean zNextBoolean12 = false;
        boolean zNextBoolean13 = false;
        boolean zNextBoolean14 = false;
        boolean zNextBoolean15 = false;
        boolean zNextBoolean16 = false;
        boolean zNextBoolean17 = false;
        boolean zNextBoolean18 = false;
        int iNextInt5 = 0;
        boolean zNextBoolean19 = false;
        List listZzd2 = listEmptyList11;
        List listZza = listEmptyList12;
        List listZzd3 = listEmptyList13;
        List listZza2 = listEmptyList14;
        JSONObject jSONObjectZzi6 = jSONObject;
        zzbwi zzbwiVarZza = null;
        String strNextString19 = strNextString18;
        String strNextString20 = strNextString19;
        int iZzc = 0;
        int iZze = 0;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            String str = strNextName == null ? "" : strNextName;
            switch (str.hashCode()) {
                case -2138196627:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("ad_source_instance_name")) {
                        b = -1;
                    } else {
                        b = 59;
                    }
                    break;
                case -1980587809:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("debug_signals")) {
                        b = -1;
                    } else {
                        b = 28;
                    }
                    break;
                case -1965512151:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("omid_settings")) {
                        b = -1;
                    } else {
                        b = 41;
                    }
                    break;
                case -1964744830:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("offline_ad_config")) {
                        b = -1;
                    } else {
                        b = 78;
                    }
                    break;
                case -1871425831:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("recursive_server_response_data")) {
                        b = -1;
                    } else {
                        b = 69;
                    }
                    break;
                case -1843156475:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("is_consent")) {
                        b = -1;
                    } else {
                        b = 71;
                    }
                    break;
                case -1828733410:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("network_ping_config")) {
                        b = -1;
                    } else {
                        b = 77;
                    }
                    break;
                case -1812055556:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("play_prewarm_options")) {
                        b = -1;
                    } else {
                        b = 49;
                    }
                    break;
                case -1785028569:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("parallel_key")) {
                        b = -1;
                    } else {
                        b = 73;
                    }
                    break;
                case -1776946669:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("ad_source_name")) {
                        b = -1;
                    } else {
                        b = 57;
                    }
                    break;
                case -1662989631:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("is_interscroller")) {
                        b = -1;
                    } else {
                        b = 53;
                    }
                    break;
                case -1620470467:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("backend_query_id")) {
                        b = -1;
                    } else {
                        b = 47;
                    }
                    break;
                case -1550155393:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("nofill_urls")) {
                        b = -1;
                    } else {
                        b = cw.k;
                    }
                    break;
                case -1440104884:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("is_custom_close_blocked")) {
                        b = -1;
                    } else {
                        b = 35;
                    }
                    break;
                case -1439500848:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals(AdUnitActivity.EXTRA_ORIENTATION)) {
                        b = -1;
                    } else {
                        b = 37;
                    }
                    break;
                case -1428969291:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("enable_omid")) {
                        b = -1;
                    } else {
                        b = 39;
                    }
                    break;
                case -1406227629:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("buffer_click_url_as_ready_to_ping")) {
                        b = -1;
                    } else {
                        b = 67;
                    }
                    break;
                case -1403779768:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("showable_impression_type")) {
                        b = -1;
                    } else {
                        b = 44;
                    }
                    break;
                case -1375413093:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("ad_cover")) {
                        b = -1;
                    } else {
                        b = 54;
                    }
                    break;
                case -1360811658:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("ad_sizes")) {
                        b = -1;
                    } else {
                        b = 19;
                    }
                    break;
                case -1306015996:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("adapters")) {
                        b = -1;
                    } else {
                        b = 20;
                    }
                    break;
                case -1303332046:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("test_mode_enabled")) {
                        b = -1;
                    } else {
                        b = 34;
                    }
                    break;
                case -1289032093:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("extras")) {
                        b = -1;
                    } else {
                        b = 29;
                    }
                    break;
                case -1240082064:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("ad_event_value")) {
                        b = -1;
                    } else {
                        b = 51;
                    }
                    break;
                case -1234181075:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("allow_pub_rendered_attribution")) {
                        b = -1;
                    } else {
                        b = 30;
                    }
                    break;
                case -1168140544:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("presentation_error_urls")) {
                        b = -1;
                    } else {
                        b = cw.l;
                    }
                    break;
                case -1152230954:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("ad_type")) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                case -1146534047:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("is_scroll_aware")) {
                        b = -1;
                    } else {
                        b = 43;
                    }
                    break;
                case -1115838944:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("fill_urls")) {
                        b = -1;
                    } else {
                        b = 12;
                    }
                    break;
                case -1081936678:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("allocation_id")) {
                        b = -1;
                    } else {
                        b = 21;
                    }
                    break;
                case -1078050970:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("video_complete_urls")) {
                        b = -1;
                    } else {
                        b = 8;
                    }
                    break;
                case -1051269058:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("active_view")) {
                        b = -1;
                    } else {
                        b = 25;
                    }
                    break;
                case -982608540:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("valid_from_timestamp")) {
                        b = -1;
                    } else {
                        b = 10;
                    }
                    break;
                case -972056451:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("ad_source_instance_id")) {
                        b = -1;
                    } else {
                        b = 60;
                    }
                    break;
                case -776859333:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("click_urls")) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case -570101180:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("late_load_urls")) {
                        b = -1;
                    } else {
                        b = 74;
                    }
                    break;
                case -544216775:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("safe_browsing")) {
                        b = -1;
                    } else {
                        b = 26;
                    }
                    break;
                case -437057161:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("imp_urls")) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                case -404433734:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("rtb_native_required_assets")) {
                        b = -1;
                    } else {
                        b = 62;
                    }
                    break;
                case -404326515:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("render_timeout_ms")) {
                        b = -1;
                    } else {
                        b = 38;
                    }
                    break;
                case -397704715:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("ad_close_time_ms")) {
                        b = -1;
                    } else {
                        b = 45;
                    }
                    break;
                case -388807511:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("content_url")) {
                        b = -1;
                    } else {
                        b = 64;
                    }
                    break;
                case -369773488:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("is_close_button_enabled")) {
                        b = -1;
                    } else {
                        b = 50;
                    }
                    break;
                case -213449460:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("force_disable_hardware_acceleration")) {
                        b = -1;
                    } else {
                        b = 65;
                    }
                    break;
                case -213424028:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals(MBridgeConstans.EXTRA_KEY_WM)) {
                        b = -1;
                    } else {
                        b = 46;
                    }
                    break;
                case -180214626:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("native_required_asset_viewability")) {
                        b = -1;
                    } else {
                        b = 63;
                    }
                    break;
                case -154616268:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("is_offline_ad")) {
                        b = -1;
                    } else {
                        b = 61;
                    }
                    break;
                case -29338502:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("allow_custom_click_gesture")) {
                        b = -1;
                    } else {
                        b = 32;
                    }
                    break;
                case GL20.GL_COLOR_WRITEMASK /* 3107 */:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals(bc.aC)) {
                        b = -1;
                    } else {
                        b = 18;
                    }
                    break;
                case 3355:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("id")) {
                        b = -1;
                    } else {
                        b = 23;
                    }
                    break;
                case 3076010:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("data")) {
                        b = -1;
                    } else {
                        b = 22;
                    }
                    break;
                case 37109963:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("request_id")) {
                        b = -1;
                    } else {
                        b = 68;
                    }
                    break;
                case 63195984:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("render_test_label")) {
                        b = -1;
                    } else {
                        b = 33;
                    }
                    break;
                case 107433883:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("qdata")) {
                        b = -1;
                    } else {
                        b = 24;
                    }
                    break;
                case 230323073:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("ad_load_urls")) {
                        b = -1;
                    } else {
                        b = 4;
                    }
                    break;
                case 418392395:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("is_closable_area_disabled")) {
                        b = -1;
                    } else {
                        b = 36;
                    }
                    break;
                case 542250332:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("consent_form_action_identifier")) {
                        b = -1;
                    } else {
                        b = 72;
                    }
                    break;
                case 549176928:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("presentation_error_timeout_ms")) {
                        b = -1;
                    } else {
                        b = cw.n;
                    }
                    break;
                case 597473788:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("debug_dialog_string")) {
                        b = -1;
                    } else {
                        b = 27;
                    }
                    break;
                case 754887508:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("container_sizes")) {
                        b = -1;
                    } else {
                        b = 17;
                    }
                    break;
                case 791122864:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("impression_type")) {
                        b = -1;
                    } else {
                        b = 5;
                    }
                    break;
                case 805095541:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("analytics_event_name_to_parameters_map")) {
                        b = -1;
                    } else {
                        b = 76;
                    }
                    break;
                case 1010584092:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("transaction_id")) {
                        b = -1;
                    } else {
                        b = 9;
                    }
                    break;
                case 1100650276:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("rewards")) {
                        b = -1;
                    } else {
                        b = 11;
                    }
                    break;
                case 1141602460:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("adapter_response_info_key")) {
                        b = -1;
                    } else {
                        b = 56;
                    }
                    break;
                case 1186014765:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("cache_hit_urls")) {
                        b = -1;
                    } else {
                        b = 66;
                    }
                    break;
                case 1321720943:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("allow_pub_owned_ad_view")) {
                        b = -1;
                    } else {
                        b = 31;
                    }
                    break;
                case 1422388341:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("is_collapsible")) {
                        b = -1;
                    } else {
                        b = 70;
                    }
                    break;
                case 1437255331:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals(CampaignEx.JSON_KEY_AD_SOURCE_ID)) {
                        b = -1;
                    } else {
                        b = 58;
                    }
                    break;
                case 1637553475:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("bid_response")) {
                        b = -1;
                    } else {
                        b = 40;
                    }
                    break;
                case 1638957285:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("video_start_urls")) {
                        b = -1;
                    } else {
                        b = 6;
                    }
                    break;
                case 1686319423:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("ad_network_class_name")) {
                        b = -1;
                    } else {
                        b = 55;
                    }
                    break;
                case 1688341040:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("video_reward_urls")) {
                        b = -1;
                    } else {
                        b = 7;
                    }
                    break;
                case 1799285870:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("use_third_party_container_height")) {
                        b = -1;
                    } else {
                        b = 48;
                    }
                    break;
                case 1839650832:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("renderers")) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                case 1875425491:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("is_analytics_logging_enabled")) {
                        b = -1;
                    } else {
                        b = 42;
                    }
                    break;
                case 2068142375:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("rule_line_external_id")) {
                        b = -1;
                    } else {
                        b = 52;
                    }
                    break;
                case 2072888499:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("manual_tracking_urls")) {
                        b = -1;
                    } else {
                        b = cw.m;
                    }
                    break;
                case 2075506442:
                    list2 = listEmptyList10;
                    list = listEmptyList9;
                    if (!str.equals("render_serially")) {
                        b = -1;
                    } else {
                        b = 75;
                    }
                    break;
                default:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                    listEmptyList = com.google.android.gms.ads.internal.util.zzbs.zzd(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 1:
                    iZzc = zzc(jsonReader.nextString());
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 2:
                    listEmptyList2 = com.google.android.gms.ads.internal.util.zzbs.zzd(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 3:
                    listEmptyList3 = com.google.android.gms.ads.internal.util.zzbs.zzd(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 4:
                    listEmptyList4 = com.google.android.gms.ads.internal.util.zzbs.zzd(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 5:
                    iZze = zze(jsonReader.nextInt());
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 6:
                    listEmptyList5 = com.google.android.gms.ads.internal.util.zzbs.zzd(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 7:
                    listEmptyList6 = com.google.android.gms.ads.internal.util.zzbs.zzd(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 8:
                    listEmptyList7 = com.google.android.gms.ads.internal.util.zzbs.zzd(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 9:
                    strNextString20 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 10:
                    strNextString19 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 11:
                    zzbwiVarZza = zzbwi.zza(com.google.android.gms.ads.internal.util.zzbs.zzf(jsonReader));
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 12:
                    listEmptyList8 = com.google.android.gms.ads.internal.util.zzbs.zzd(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 13:
                    listEmptyList9 = com.google.android.gms.ads.internal.util.zzbs.zzd(jsonReader);
                    listEmptyList10 = list2;
                    break;
                case 14:
                    listEmptyList10 = com.google.android.gms.ads.internal.util.zzbs.zzd(jsonReader);
                    listEmptyList9 = list;
                    break;
                case 15:
                    listZzd2 = com.google.android.gms.ads.internal.util.zzbs.zzd(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 16:
                    iNextInt = jsonReader.nextInt();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 17:
                    listZza = zzfbp.zza(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 18:
                    zzfbtVar = new zzfbt(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 19:
                    listZza2 = zzfbp.zza(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 20:
                    listZzd3 = com.google.android.gms.ads.internal.util.zzbs.zzd(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 21:
                    strNextString2 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 22:
                    jSONObjectZzi6 = com.google.android.gms.ads.internal.util.zzbs.zzi(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 23:
                    strNextString3 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 24:
                    strNextString4 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 25:
                    string = com.google.android.gms.ads.internal.util.zzbs.zzi(jsonReader).toString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 26:
                    zzbxrVarZza = zzbxr.zza(com.google.android.gms.ads.internal.util.zzbs.zzi(jsonReader));
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 27:
                    strNextString5 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 28:
                    jSONObjectZzi = com.google.android.gms.ads.internal.util.zzbs.zzi(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 29:
                    jSONObjectZzi2 = com.google.android.gms.ads.internal.util.zzbs.zzi(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 30:
                    zNextBoolean = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 31:
                    zNextBoolean2 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 32:
                    zNextBoolean3 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 33:
                    zNextBoolean4 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 34:
                    zNextBoolean5 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 35:
                    zNextBoolean6 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 36:
                    zNextBoolean7 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 37:
                    iZzd = zzd(jsonReader.nextString());
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 38:
                    iNextInt2 = jsonReader.nextInt();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 39:
                    zNextBoolean8 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 40:
                    strNextString6 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 41:
                    jSONObjectZzi3 = com.google.android.gms.ads.internal.util.zzbs.zzi(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 42:
                    zNextBoolean9 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 43:
                    zNextBoolean10 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 44:
                    iNextInt3 = jsonReader.nextInt();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 45:
                    iNextInt4 = jsonReader.nextInt();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 46:
                    strNextString7 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 47:
                    strNextString8 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 48:
                    zNextBoolean11 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 49:
                    zzbtkVarZza = zzbtk.zza(com.google.android.gms.ads.internal.util.zzbs.zzi(jsonReader));
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 50:
                    jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 51:
                    zzuVarZza = com.google.android.gms.ads.internal.client.zzu.zza(com.google.android.gms.ads.internal.util.zzbs.zzi(jsonReader));
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 52:
                    strNextString9 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 53:
                    zNextBoolean12 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 54:
                    jSONObjectZzi4 = com.google.android.gms.ads.internal.util.zzbs.zzi(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 55:
                    strNextString10 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case Input.Keys.PERIOD /* 56 */:
                    strNextString17 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case Input.Keys.ALT_LEFT /* 57 */:
                    strNextString11 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case Input.Keys.ALT_RIGHT /* 58 */:
                    strNextString12 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case Input.Keys.SHIFT_LEFT /* 59 */:
                    strNextString13 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 60:
                    strNextString14 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case Input.Keys.TAB /* 61 */:
                    zNextBoolean13 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case Input.Keys.SPACE /* 62 */:
                    jSONObjectZzi5 = com.google.android.gms.ads.internal.util.zzbs.zzi(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 63:
                    zNextBoolean14 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 64:
                    strNextString = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 65:
                    zNextBoolean15 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 66:
                    com.google.android.gms.ads.internal.util.zzbs.zzd(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 67:
                    zNextBoolean16 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case Input.Keys.GRAVE /* 68 */:
                    strNextString15 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case Input.Keys.MINUS /* 69 */:
                    strNextString16 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case Input.Keys.EQUALS /* 70 */:
                    zNextBoolean17 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case Input.Keys.LEFT_BRACKET /* 71 */:
                    zNextBoolean18 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case Input.Keys.RIGHT_BRACKET /* 72 */:
                    iNextInt5 = jsonReader.nextInt();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case Input.Keys.BACKSLASH /* 73 */:
                    strNextString18 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case Input.Keys.SEMICOLON /* 74 */:
                    listZzd = com.google.android.gms.ads.internal.util.zzbs.zzd(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case Input.Keys.APOSTROPHE /* 75 */:
                    zNextBoolean19 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case Input.Keys.SLASH /* 76 */:
                    if (((Boolean) zzbcl.zzam.zzj()).booleanValue()) {
                        mapZze = com.google.android.gms.ads.internal.util.zzbs.zze(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case Input.Keys.AT /* 77 */:
                    if (((Boolean) zzbcl.zziu.zzj()).booleanValue()) {
                        zzvVarZza = com.google.android.gms.ads.internal.util.client.zzv.zza(com.google.android.gms.ads.internal.util.zzbs.zzi(jsonReader));
                    } else {
                        jsonReader.skipValue();
                    }
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case Input.Keys.NUM /* 78 */:
                    if (((Boolean) zzbcl.zziw.zzj()).booleanValue()) {
                        zzwVarZzd = com.google.android.gms.ads.internal.util.client.zzw.zzd(com.google.android.gms.ads.internal.util.zzbs.zzi(jsonReader));
                    } else {
                        jsonReader.skipValue();
                    }
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                default:
                    jsonReader.skipValue();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
            }
        }
        jsonReader.endObject();
        this.zza = listEmptyList;
        this.zzb = iZzc;
        this.zzc = listEmptyList2;
        this.zzd = listEmptyList3;
        this.zzf = listEmptyList4;
        this.zze = iZze;
        this.zzg = listEmptyList5;
        this.zzh = listEmptyList6;
        this.zzi = listEmptyList7;
        this.zzj = strNextString20;
        this.zzk = strNextString19;
        this.zzl = zzbwiVarZza;
        this.zzm = listEmptyList8;
        this.zzn = listEmptyList9;
        this.zzo = listEmptyList10;
        this.zzp = listZzd2;
        this.zzq = iNextInt;
        this.zzr = listZza;
        this.zzs = zzfbtVar;
        this.zzt = listZzd3;
        this.zzu = listZza2;
        this.zzw = strNextString2;
        this.zzv = jSONObjectZzi6;
        this.zzx = strNextString3;
        this.zzy = strNextString4;
        this.zzz = string;
        this.zzA = zzbxrVarZza;
        this.zzB = strNextString5;
        this.zzC = jSONObjectZzi;
        this.zzD = jSONObjectZzi2;
        this.zzJ = zNextBoolean;
        this.zzK = zNextBoolean2;
        this.zzL = zNextBoolean3;
        this.zzM = zNextBoolean4;
        this.zzN = zNextBoolean5;
        this.zzO = zNextBoolean6;
        this.zzP = zNextBoolean7;
        this.zzQ = iZzd;
        this.zzR = iNextInt2;
        this.zzT = zNextBoolean8;
        this.zzU = strNextString6;
        this.zzV = new zzfcm(jSONObjectZzi3);
        this.zzW = zNextBoolean9;
        this.zzX = zNextBoolean10;
        this.zzY = iNextInt3;
        this.zzZ = strNextString7;
        this.zzaa = iNextInt4;
        this.zzab = strNextString8;
        this.zzac = zNextBoolean11;
        this.zzad = zzbtkVarZza;
        this.zzae = zzuVarZza;
        this.zzaf = strNextString9;
        this.zzag = zNextBoolean12;
        this.zzah = jSONObjectZzi4;
        this.zzE = strNextString10;
        this.zzF = strNextString11;
        this.zzG = strNextString12;
        this.zzH = strNextString13;
        this.zzI = strNextString14;
        this.zzai = zNextBoolean13;
        this.zzaj = jSONObjectZzi5;
        this.zzak = zNextBoolean14;
        this.zzal = strNextString;
        this.zzam = zNextBoolean15;
        this.zzS = zNextBoolean16;
        this.zzan = strNextString15;
        this.zzao = strNextString16;
        this.zzap = strNextString17;
        this.zzaq = zNextBoolean17;
        this.zzar = zNextBoolean18;
        this.zzas = iNextInt5;
        this.zzau = listZzd;
        this.zzat = strNextString18;
        this.zzav = zNextBoolean19;
        this.zzaw = mapZze;
        this.zzax = zzvVarZza;
        this.zzay = zzwVarZzd;
    }

    public static String zza(int i) {
        switch (i) {
            case 1:
                return "BANNER";
            case 2:
                return "INTERSTITIAL";
            case 3:
                return "NATIVE_EXPRESS";
            case 4:
                return "NATIVE";
            case 5:
                return "REWARDED";
            case 6:
                return "APP_OPEN_AD";
            case 7:
                return "REWARDED_INTERSTITIAL";
            default:
                return "UNKNOWN";
        }
    }

    private static int zzc(String str) {
        if ("banner".equals(str)) {
            return 1;
        }
        if (C2390Ej.PLACEMENT_TYPE_INTERSTITIAL.equals(str)) {
            return 2;
        }
        if ("native_express".equals(str)) {
            return 3;
        }
        if ("native".equals(str)) {
            return 4;
        }
        if (C2390Ej.PLACEMENT_TYPE_REWARDED.equals(str)) {
            return 5;
        }
        if ("app_open_ad".equals(str)) {
            return 6;
        }
        return "rewarded_interstitial".equals(str) ? 7 : 0;
    }

    private static int zzd(String str) {
        if ("landscape".equalsIgnoreCase(str)) {
            return 6;
        }
        return "portrait".equalsIgnoreCase(str) ? 7 : -1;
    }

    private static int zze(int i) {
        if (i == 0 || i == 1 || i == 3) {
            return i;
        }
        return 0;
    }

    public final boolean zzb() {
        return this.zzai || this.zzay != null;
    }
}
