package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import com.applovin.sdk.AppLovinEventParameters;
import com.mbridge.msdk.MBridgeConstans;
import com.p004ironsource.d9;
import com.smartdigimkt.f3.b;
import com.thinkup.core.common.n.mo;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfhr {
    public final zzcbh zzA;
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
    public final zzfin zzV;
    public final boolean zzW;
    public final boolean zzX;
    public final int zzY;
    public final String zzZ;
    public final List zza;
    public final List zzaA;
    public final boolean zzaB;
    public final List zzaC;
    public final boolean zzaD;
    public final int zzaE;
    public final Bundle zzaF;
    public final int zzaG;
    public final int zzaa;
    public final String zzab;
    public final boolean zzac;
    public final zzbxe zzad;
    public final com.google.android.gms.ads.internal.client.zzt zzae;
    public final String zzaf;
    public final boolean zzag;
    public final JSONObject zzah;
    public final boolean zzai;
    public final JSONObject zzaj;
    public final boolean zzak;
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
    public final com.google.android.gms.ads.internal.util.client.zzv zzax;
    public final com.google.android.gms.ads.internal.util.client.zzw zzay;
    public final double zzaz;
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
    public final zzbzy zzl;
    public final List zzm;
    public final List zzn;
    public final List zzo;
    public final List zzp;
    public final int zzq;
    public final List zzr;
    public final zzfhw zzs;
    public final List zzt;
    public final List zzu;
    public final JSONObject zzv;
    public final String zzw;
    public final String zzx;
    public final String zzy;
    public final String zzz;

    /* JADX WARN: Code duplicated, block: B:273:0x0712 A[PHI: r91 r93
  0x0712: PHI (r91v95 java.util.List) = 
  (r91v4 java.util.List)
  (r91v5 java.util.List)
  (r91v6 java.util.List)
  (r91v7 java.util.List)
  (r91v8 java.util.List)
  (r91v9 java.util.List)
  (r91v10 java.util.List)
  (r91v11 java.util.List)
  (r91v12 java.util.List)
  (r91v13 java.util.List)
  (r91v14 java.util.List)
  (r91v15 java.util.List)
  (r91v16 java.util.List)
  (r91v17 java.util.List)
  (r91v18 java.util.List)
  (r91v19 java.util.List)
  (r91v20 java.util.List)
  (r91v21 java.util.List)
  (r91v22 java.util.List)
  (r91v23 java.util.List)
  (r91v24 java.util.List)
  (r91v25 java.util.List)
  (r91v26 java.util.List)
  (r91v27 java.util.List)
  (r91v28 java.util.List)
  (r91v29 java.util.List)
  (r91v30 java.util.List)
  (r91v31 java.util.List)
  (r91v32 java.util.List)
  (r91v33 java.util.List)
  (r91v34 java.util.List)
  (r91v35 java.util.List)
  (r91v36 java.util.List)
  (r91v37 java.util.List)
  (r91v38 java.util.List)
  (r91v39 java.util.List)
  (r91v40 java.util.List)
  (r91v41 java.util.List)
  (r91v42 java.util.List)
  (r91v43 java.util.List)
  (r91v44 java.util.List)
  (r91v45 java.util.List)
  (r91v46 java.util.List)
  (r91v47 java.util.List)
  (r91v48 java.util.List)
  (r91v49 java.util.List)
  (r91v50 java.util.List)
  (r91v51 java.util.List)
  (r91v52 java.util.List)
  (r91v53 java.util.List)
  (r91v54 java.util.List)
  (r91v55 java.util.List)
  (r91v56 java.util.List)
  (r91v57 java.util.List)
  (r91v58 java.util.List)
  (r91v59 java.util.List)
  (r91v60 java.util.List)
  (r91v61 java.util.List)
  (r91v62 java.util.List)
  (r91v63 java.util.List)
  (r91v64 java.util.List)
  (r91v65 java.util.List)
  (r91v66 java.util.List)
  (r91v67 java.util.List)
  (r91v68 java.util.List)
  (r91v69 java.util.List)
  (r91v70 java.util.List)
  (r91v71 java.util.List)
  (r91v72 java.util.List)
  (r91v73 java.util.List)
  (r91v74 java.util.List)
  (r91v75 java.util.List)
  (r91v76 java.util.List)
  (r91v77 java.util.List)
  (r91v78 java.util.List)
  (r91v79 java.util.List)
  (r91v80 java.util.List)
  (r91v81 java.util.List)
  (r91v82 java.util.List)
  (r91v83 java.util.List)
  (r91v84 java.util.List)
  (r91v85 java.util.List)
  (r91v86 java.util.List)
  (r91v87 java.util.List)
  (r91v88 java.util.List)
  (r91v89 java.util.List)
  (r91v90 java.util.List)
  (r91v96 java.util.List)
 binds: [B:271:0x070d, B:268:0x06fc, B:265:0x06eb, B:262:0x06da, B:259:0x06c9, B:256:0x06b8, B:253:0x06a6, B:250:0x0694, B:247:0x0682, B:244:0x0670, B:241:0x065e, B:238:0x064c, B:235:0x063a, B:232:0x0628, B:229:0x0616, B:226:0x0604, B:223:0x05f2, B:220:0x05e0, B:217:0x05ce, B:214:0x05bc, B:211:0x05aa, B:208:0x0598, B:205:0x0586, B:202:0x0574, B:199:0x0562, B:196:0x0550, B:193:0x053e, B:190:0x052c, B:187:0x051b, B:184:0x0509, B:181:0x04f7, B:178:0x04e5, B:175:0x04d3, B:172:0x04c1, B:169:0x04af, B:166:0x049d, B:163:0x048c, B:160:0x047a, B:157:0x0468, B:154:0x0456, B:151:0x0445, B:148:0x0433, B:145:0x0421, B:142:0x040f, B:139:0x03fd, B:136:0x03eb, B:133:0x03d9, B:130:0x03c7, B:127:0x03b5, B:124:0x03a3, B:121:0x0391, B:118:0x037f, B:115:0x036d, B:112:0x035b, B:109:0x0349, B:106:0x0337, B:103:0x0325, B:100:0x0314, B:97:0x0302, B:94:0x02f0, B:91:0x02de, B:88:0x02cc, B:85:0x02ba, B:82:0x02a8, B:79:0x0297, B:76:0x0285, B:73:0x0273, B:70:0x0261, B:67:0x024f, B:64:0x023d, B:61:0x022b, B:58:0x0219, B:55:0x0207, B:52:0x01f5, B:49:0x01e3, B:46:0x01d1, B:43:0x01bf, B:40:0x01ae, B:37:0x019c, B:34:0x018b, B:31:0x0179, B:28:0x0168, B:25:0x0156, B:22:0x0144, B:19:0x0132, B:16:0x0120, B:13:0x010e, B:11:0x00fc] A[DONT_GENERATE, DONT_INLINE]
  0x0712: PHI (r93v89 java.util.List) = 
  (r93v1 java.util.List)
  (r93v2 java.util.List)
  (r93v3 java.util.List)
  (r93v4 java.util.List)
  (r93v5 java.util.List)
  (r93v6 java.util.List)
  (r93v7 java.util.List)
  (r93v8 java.util.List)
  (r93v9 java.util.List)
  (r93v10 java.util.List)
  (r93v11 java.util.List)
  (r93v12 java.util.List)
  (r93v13 java.util.List)
  (r93v14 java.util.List)
  (r93v15 java.util.List)
  (r93v16 java.util.List)
  (r93v17 java.util.List)
  (r93v18 java.util.List)
  (r93v19 java.util.List)
  (r93v20 java.util.List)
  (r93v21 java.util.List)
  (r93v22 java.util.List)
  (r93v23 java.util.List)
  (r93v24 java.util.List)
  (r93v25 java.util.List)
  (r93v26 java.util.List)
  (r93v27 java.util.List)
  (r93v28 java.util.List)
  (r93v29 java.util.List)
  (r93v30 java.util.List)
  (r93v31 java.util.List)
  (r93v32 java.util.List)
  (r93v33 java.util.List)
  (r93v34 java.util.List)
  (r93v35 java.util.List)
  (r93v36 java.util.List)
  (r93v37 java.util.List)
  (r93v38 java.util.List)
  (r93v39 java.util.List)
  (r93v40 java.util.List)
  (r93v41 java.util.List)
  (r93v42 java.util.List)
  (r93v43 java.util.List)
  (r93v44 java.util.List)
  (r93v45 java.util.List)
  (r93v46 java.util.List)
  (r93v47 java.util.List)
  (r93v48 java.util.List)
  (r93v49 java.util.List)
  (r93v50 java.util.List)
  (r93v51 java.util.List)
  (r93v52 java.util.List)
  (r93v53 java.util.List)
  (r93v54 java.util.List)
  (r93v55 java.util.List)
  (r93v56 java.util.List)
  (r93v57 java.util.List)
  (r93v58 java.util.List)
  (r93v59 java.util.List)
  (r93v60 java.util.List)
  (r93v61 java.util.List)
  (r93v62 java.util.List)
  (r93v63 java.util.List)
  (r93v64 java.util.List)
  (r93v65 java.util.List)
  (r93v66 java.util.List)
  (r93v67 java.util.List)
  (r93v68 java.util.List)
  (r93v69 java.util.List)
  (r93v70 java.util.List)
  (r93v71 java.util.List)
  (r93v72 java.util.List)
  (r93v73 java.util.List)
  (r93v74 java.util.List)
  (r93v75 java.util.List)
  (r93v76 java.util.List)
  (r93v77 java.util.List)
  (r93v78 java.util.List)
  (r93v79 java.util.List)
  (r93v80 java.util.List)
  (r93v81 java.util.List)
  (r93v82 java.util.List)
  (r93v83 java.util.List)
  (r93v84 java.util.List)
  (r93v85 java.util.List)
  (r93v86 java.util.List)
  (r93v87 java.util.List)
  (r93v90 java.util.List)
 binds: [B:271:0x070d, B:268:0x06fc, B:265:0x06eb, B:262:0x06da, B:259:0x06c9, B:256:0x06b8, B:253:0x06a6, B:250:0x0694, B:247:0x0682, B:244:0x0670, B:241:0x065e, B:238:0x064c, B:235:0x063a, B:232:0x0628, B:229:0x0616, B:226:0x0604, B:223:0x05f2, B:220:0x05e0, B:217:0x05ce, B:214:0x05bc, B:211:0x05aa, B:208:0x0598, B:205:0x0586, B:202:0x0574, B:199:0x0562, B:196:0x0550, B:193:0x053e, B:190:0x052c, B:187:0x051b, B:184:0x0509, B:181:0x04f7, B:178:0x04e5, B:175:0x04d3, B:172:0x04c1, B:169:0x04af, B:166:0x049d, B:163:0x048c, B:160:0x047a, B:157:0x0468, B:154:0x0456, B:151:0x0445, B:148:0x0433, B:145:0x0421, B:142:0x040f, B:139:0x03fd, B:136:0x03eb, B:133:0x03d9, B:130:0x03c7, B:127:0x03b5, B:124:0x03a3, B:121:0x0391, B:118:0x037f, B:115:0x036d, B:112:0x035b, B:109:0x0349, B:106:0x0337, B:103:0x0325, B:100:0x0314, B:97:0x0302, B:94:0x02f0, B:91:0x02de, B:88:0x02cc, B:85:0x02ba, B:82:0x02a8, B:79:0x0297, B:76:0x0285, B:73:0x0273, B:70:0x0261, B:67:0x024f, B:64:0x023d, B:61:0x022b, B:58:0x0219, B:55:0x0207, B:52:0x01f5, B:49:0x01e3, B:46:0x01d1, B:43:0x01bf, B:40:0x01ae, B:37:0x019c, B:34:0x018b, B:31:0x0179, B:28:0x0168, B:25:0x0156, B:22:0x0144, B:19:0x0132, B:16:0x0120, B:13:0x010e, B:11:0x00fc] A[DONT_GENERATE, DONT_INLINE]] */
    public zzfhr(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException, NumberFormatException {
        List list;
        List listZzb;
        byte b2;
        List listZzb2 = Collections.EMPTY_LIST;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        zzgtd.zzi();
        zzgtd zzgtdVarZzi = zzgtd.zzi();
        HashMap map = new HashMap();
        zzgtd zzgtdVarZzi2 = zzgtd.zzi();
        zzgtd zzgtdVarZzi3 = zzgtd.zzi();
        Bundle bundle = new Bundle();
        jsonReader.beginObject();
        List listZza = listZzb2;
        List listZzb3 = listZza;
        List listZza2 = listZzb3;
        List listZzb4 = listZza2;
        JSONObject jSONObjectZzd = jSONObject;
        JSONObject jSONObjectZzd2 = jSONObject2;
        JSONObject jSONObjectZzd3 = jSONObject3;
        JSONObject jSONObjectZzd4 = jSONObject4;
        JSONObject jSONObjectZzd5 = jSONObject5;
        JSONObject jSONObjectZzd6 = jSONObject6;
        List listZzb5 = zzgtdVarZzi;
        Map mapZzc = map;
        List listZzb6 = zzgtdVarZzi2;
        zzgtd zzgtdVarZza = zzgtdVarZzi3;
        Bundle bundle2 = bundle;
        double dNextDouble = 0.0d;
        zzbzy zzbzyVarZza = null;
        zzcbh zzcbhVarZza = null;
        zzbxe zzbxeVarZza = null;
        com.google.android.gms.ads.internal.client.zzt zztVarZza = null;
        String strNextString = null;
        com.google.android.gms.ads.internal.util.client.zzv zzvVarZzb = null;
        com.google.android.gms.ads.internal.util.client.zzw zzwVarZzd = null;
        zzfhw zzfhwVar = null;
        String strNextString2 = "";
        String strNextString3 = strNextString2;
        String strNextString4 = strNextString3;
        String strNextString5 = strNextString4;
        String strNextString6 = strNextString5;
        String string = strNextString6;
        String strNextString7 = string;
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
        String strNextString19 = strNextString18;
        String strNextString20 = strNextString19;
        int iZzc = 0;
        int iZzd = 0;
        int iNextInt = 0;
        boolean zNextBoolean = false;
        boolean zNextBoolean2 = false;
        boolean zNextBoolean3 = false;
        boolean zNextBoolean4 = false;
        boolean zNextBoolean5 = false;
        boolean zNextBoolean6 = false;
        boolean zNextBoolean7 = false;
        int iZze = -1;
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
        int iZza = 2;
        boolean zNextBoolean20 = false;
        boolean zNextBoolean21 = false;
        int iNextInt6 = -1;
        List listZzb7 = listZzb4;
        List listZzb8 = listZzb7;
        List listZzb9 = listZzb8;
        List listZzb10 = listZzb9;
        List listZzb11 = listZzb10;
        List listZzb12 = listZzb11;
        List listZzb13 = listZzb12;
        List listZzb14 = listZzb13;
        List list2 = listZzb14;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            String str = strNextName == null ? "" : strNextName;
            switch (str.hashCode()) {
                case -2138196627:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("ad_source_instance_name")) {
                        b2 = -1;
                    } else {
                        b2 = 59;
                    }
                    break;
                case -1980587809:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("debug_signals")) {
                        b2 = -1;
                    } else {
                        b2 = 28;
                    }
                    break;
                case -1965512151:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("omid_settings")) {
                        b2 = -1;
                    } else {
                        b2 = 41;
                    }
                    break;
                case -1964744830:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("offline_ad_config")) {
                        b2 = -1;
                    } else {
                        b2 = 80;
                    }
                    break;
                case -1871425831:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("recursive_server_response_data")) {
                        b2 = -1;
                    } else {
                        b2 = 69;
                    }
                    break;
                case -1843156475:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("is_consent")) {
                        b2 = -1;
                    } else {
                        b2 = 71;
                    }
                    break;
                case -1840512279:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("presentation_urls")) {
                        b2 = -1;
                    } else {
                        b2 = 82;
                    }
                    break;
                case -1828733410:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("network_ping_config")) {
                        b2 = -1;
                    } else {
                        b2 = 79;
                    }
                    break;
                case -1812055556:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("play_prewarm_options")) {
                        b2 = -1;
                    } else {
                        b2 = 49;
                    }
                    break;
                case -1785028569:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("parallel_key")) {
                        b2 = -1;
                    } else {
                        b2 = 73;
                    }
                    break;
                case -1776946669:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("ad_source_name")) {
                        b2 = -1;
                    } else {
                        b2 = 57;
                    }
                    break;
                case -1662989631:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("is_interscroller")) {
                        b2 = -1;
                    } else {
                        b2 = 53;
                    }
                    break;
                case -1620552059:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("preload_sort_type")) {
                        b2 = -1;
                    } else {
                        b2 = 77;
                    }
                    break;
                case -1620470467:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("backend_query_id")) {
                        b2 = -1;
                    } else {
                        b2 = 47;
                    }
                    break;
                case -1550155393:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("nofill_urls")) {
                        b2 = -1;
                    } else {
                        b2 = 13;
                    }
                    break;
                case -1440104884:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("is_custom_close_blocked")) {
                        b2 = -1;
                    } else {
                        b2 = 35;
                    }
                    break;
                case -1439500848:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("orientation")) {
                        b2 = -1;
                    } else {
                        b2 = 37;
                    }
                    break;
                case -1428969291:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("enable_omid")) {
                        b2 = -1;
                    } else {
                        b2 = 39;
                    }
                    break;
                case -1406227629:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("buffer_click_url_as_ready_to_ping")) {
                        b2 = -1;
                    } else {
                        b2 = 67;
                    }
                    break;
                case -1403779768:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("showable_impression_type")) {
                        b2 = -1;
                    } else {
                        b2 = 44;
                    }
                    break;
                case -1375413093:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("ad_cover")) {
                        b2 = -1;
                    } else {
                        b2 = 54;
                    }
                    break;
                case -1360811658:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("ad_sizes")) {
                        b2 = -1;
                    } else {
                        b2 = 19;
                    }
                    break;
                case -1306015996:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("adapters")) {
                        b2 = -1;
                    } else {
                        b2 = 20;
                    }
                    break;
                case -1303332046:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("test_mode_enabled")) {
                        b2 = -1;
                    } else {
                        b2 = 34;
                    }
                    break;
                case -1289032093:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("extras")) {
                        b2 = -1;
                    } else {
                        b2 = 29;
                    }
                    break;
                case -1240082064:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("ad_event_value")) {
                        b2 = -1;
                    } else {
                        b2 = 51;
                    }
                    break;
                case -1234181075:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("allow_pub_rendered_attribution")) {
                        b2 = -1;
                    } else {
                        b2 = 30;
                    }
                    break;
                case -1168140544:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("presentation_error_urls")) {
                        b2 = -1;
                    } else {
                        b2 = 14;
                    }
                    break;
                case -1152230954:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("ad_type")) {
                        b2 = -1;
                    } else {
                        b2 = 1;
                    }
                    break;
                case -1146534047:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("is_scroll_aware")) {
                        b2 = -1;
                    } else {
                        b2 = 43;
                    }
                    break;
                case -1115838944:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("fill_urls")) {
                        b2 = -1;
                    } else {
                        b2 = 12;
                    }
                    break;
                case -1081936678:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("allocation_id")) {
                        b2 = -1;
                    } else {
                        b2 = 21;
                    }
                    break;
                case -1078050970:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("video_complete_urls")) {
                        b2 = -1;
                    } else {
                        b2 = 8;
                    }
                    break;
                case -1051269058:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("active_view")) {
                        b2 = -1;
                    } else {
                        b2 = 25;
                    }
                    break;
                case -982608540:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("valid_from_timestamp")) {
                        b2 = -1;
                    } else {
                        b2 = 10;
                    }
                    break;
                case -972056451:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("ad_source_instance_id")) {
                        b2 = -1;
                    } else {
                        b2 = 60;
                    }
                    break;
                case -776859333:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("click_urls")) {
                        b2 = -1;
                    } else {
                        b2 = 2;
                    }
                    break;
                case -652881372:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("on_device_storage_configs")) {
                        b2 = -1;
                    } else {
                        b2 = 84;
                    }
                    break;
                case -570101180:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("late_load_urls")) {
                        b2 = -1;
                    } else {
                        b2 = 74;
                    }
                    break;
                case -544216775:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("safe_browsing")) {
                        b2 = -1;
                    } else {
                        b2 = 26;
                    }
                    break;
                case -437057161:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("imp_urls")) {
                        b2 = -1;
                    } else {
                        b2 = 3;
                    }
                    break;
                case -404433734:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("rtb_native_required_assets")) {
                        b2 = -1;
                    } else {
                        b2 = 62;
                    }
                    break;
                case -404326515:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("render_timeout_ms")) {
                        b2 = -1;
                    } else {
                        b2 = 38;
                    }
                    break;
                case -397704715:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("ad_close_time_ms")) {
                        b2 = -1;
                    } else {
                        b2 = 45;
                    }
                    break;
                case -388807511:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("content_url")) {
                        b2 = -1;
                    } else {
                        b2 = 64;
                    }
                    break;
                case -369773488:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("is_close_button_enabled")) {
                        b2 = -1;
                    } else {
                        b2 = 50;
                    }
                    break;
                case -213449460:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("force_disable_hardware_acceleration")) {
                        b2 = -1;
                    } else {
                        b2 = 65;
                    }
                    break;
                case -213424028:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals(MBridgeConstans.EXTRA_KEY_WM)) {
                        b2 = -1;
                    } else {
                        b2 = 46;
                    }
                    break;
                case -180214626:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("native_required_asset_viewability")) {
                        b2 = -1;
                    } else {
                        b2 = 63;
                    }
                    break;
                case -154616268:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("is_offline_ad")) {
                        b2 = -1;
                    } else {
                        b2 = 61;
                    }
                    break;
                case -29338502:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("allow_custom_click_gesture")) {
                        b2 = -1;
                    } else {
                        b2 = 32;
                    }
                    break;
                case 3107:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("ad")) {
                        b2 = -1;
                    } else {
                        b2 = 18;
                    }
                    break;
                case 3355:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("id")) {
                        b2 = -1;
                    } else {
                        b2 = 23;
                    }
                    break;
                case 3076010:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("data")) {
                        b2 = -1;
                    } else {
                        b2 = 22;
                    }
                    break;
                case 37109963:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("request_id")) {
                        b2 = -1;
                    } else {
                        b2 = 68;
                    }
                    break;
                case 63195984:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("render_test_label")) {
                        b2 = -1;
                    } else {
                        b2 = 33;
                    }
                    break;
                case 107433883:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("qdata")) {
                        b2 = -1;
                    } else {
                        b2 = 24;
                    }
                    break;
                case 230323073:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("ad_load_urls")) {
                        b2 = -1;
                    } else {
                        b2 = 4;
                    }
                    break;
                case 418392395:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("is_closable_area_disabled")) {
                        b2 = -1;
                    } else {
                        b2 = 36;
                    }
                    break;
                case 542250332:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("consent_form_action_identifier")) {
                        b2 = -1;
                    } else {
                        b2 = 72;
                    }
                    break;
                case 549176928:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("presentation_error_timeout_ms")) {
                        b2 = -1;
                    } else {
                        b2 = 16;
                    }
                    break;
                case 597473788:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("debug_dialog_string")) {
                        b2 = -1;
                    } else {
                        b2 = 27;
                    }
                    break;
                case 639133141:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("response_info_extras_override")) {
                        b2 = -1;
                    } else {
                        b2 = 86;
                    }
                    break;
                case 754887508:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("container_sizes")) {
                        b2 = -1;
                    } else {
                        b2 = 17;
                    }
                    break;
                case 791122864:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("impression_type")) {
                        b2 = -1;
                    } else {
                        b2 = 5;
                    }
                    break;
                case 805095541:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("analytics_event_name_to_parameters_map")) {
                        b2 = -1;
                    } else {
                        b2 = 78;
                    }
                    break;
                case 1010584092:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER)) {
                        b2 = -1;
                    } else {
                        b2 = 9;
                    }
                    break;
                case 1100650276:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("rewards")) {
                        b2 = -1;
                    } else {
                        b2 = 11;
                    }
                    break;
                case 1141602460:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("adapter_response_info_key")) {
                        b2 = -1;
                    } else {
                        b2 = 56;
                    }
                    break;
                case 1186014765:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("cache_hit_urls")) {
                        b2 = -1;
                    } else {
                        b2 = 66;
                    }
                    break;
                case 1303622534:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("preload_sort_value")) {
                        b2 = -1;
                    } else {
                        b2 = 76;
                    }
                    break;
                case 1321720943:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("allow_pub_owned_ad_view")) {
                        b2 = -1;
                    } else {
                        b2 = 31;
                    }
                    break;
                case 1422388341:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("is_collapsible")) {
                        b2 = -1;
                    } else {
                        b2 = 70;
                    }
                    break;
                case 1437255331:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("ad_source_id")) {
                        b2 = -1;
                    } else {
                        b2 = 58;
                    }
                    break;
                case 1556932485:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("post_click_lifecycle_monitoring_duration_ms")) {
                        b2 = -1;
                    } else {
                        b2 = 81;
                    }
                    break;
                case 1565514205:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("adapter_only_third_party_impression")) {
                        b2 = -1;
                    } else {
                        b2 = 85;
                    }
                    break;
                case 1637553475:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("bid_response")) {
                        b2 = -1;
                    } else {
                        b2 = 40;
                    }
                    break;
                case 1638957285:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("video_start_urls")) {
                        b2 = -1;
                    } else {
                        b2 = 6;
                    }
                    break;
                case 1686319423:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("ad_network_class_name")) {
                        b2 = -1;
                    } else {
                        b2 = 55;
                    }
                    break;
                case 1688341040:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("video_reward_urls")) {
                        b2 = -1;
                    } else {
                        b2 = 7;
                    }
                    break;
                case 1799285870:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("use_third_party_container_height")) {
                        b2 = -1;
                    } else {
                        b2 = 48;
                    }
                    break;
                case 1839650832:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("renderers")) {
                        b2 = -1;
                    } else {
                        b2 = 0;
                    }
                    break;
                case 1875425491:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("is_analytics_logging_enabled")) {
                        b2 = -1;
                    } else {
                        b2 = 42;
                    }
                    break;
                case 2068142375:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("rule_line_external_id")) {
                        b2 = -1;
                    } else {
                        b2 = 52;
                    }
                    break;
                case 2072888499:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("manual_tracking_urls")) {
                        b2 = -1;
                    } else {
                        b2 = 15;
                    }
                    break;
                case 2075506442:
                    list = listZzb14;
                    listZzb = list2;
                    if (!str.equals("render_serially")) {
                        b2 = -1;
                    } else {
                        b2 = 75;
                    }
                    break;
                case 2117205836:
                    listZzb = list2;
                    list = listZzb14;
                    if (!str.equals("flow_control")) {
                        b2 = -1;
                    } else {
                        b2 = 83;
                    }
                    break;
                default:
                    list = listZzb14;
                    listZzb = list2;
                    b2 = -1;
                    break;
            }
            switch (b2) {
                case 0:
                    listZzb2 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    listZzb14 = list;
                    break;
                case 1:
                    iZzc = zzc(jsonReader.nextString());
                    listZzb14 = list;
                    break;
                case 2:
                    listZzb7 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    listZzb14 = list;
                    break;
                case 3:
                    listZzb8 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    listZzb14 = list;
                    break;
                case 4:
                    listZzb9 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    listZzb14 = list;
                    break;
                case 5:
                    iZzd = zzd(jsonReader.nextInt());
                    listZzb14 = list;
                    break;
                case 6:
                    listZzb10 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    listZzb14 = list;
                    break;
                case 7:
                    listZzb11 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    listZzb14 = list;
                    break;
                case 8:
                    listZzb12 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    listZzb14 = list;
                    break;
                case 9:
                    strNextString3 = jsonReader.nextString();
                    listZzb14 = list;
                    break;
                case 10:
                    strNextString2 = jsonReader.nextString();
                    listZzb14 = list;
                    break;
                case 11:
                    zzbzyVarZza = zzbzy.zza(com.google.android.gms.ads.internal.util.zzbp.zze(jsonReader));
                    listZzb14 = list;
                    break;
                case 12:
                    listZzb13 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    listZzb14 = list;
                    break;
                case 13:
                    listZzb14 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    break;
                case 14:
                    listZzb = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    listZzb14 = list;
                    break;
                case 15:
                    listZzb4 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    listZzb14 = list;
                    break;
                case 16:
                    iNextInt = jsonReader.nextInt();
                    listZzb14 = list;
                    break;
                case 17:
                    listZza2 = zzfhs.zza(jsonReader);
                    listZzb14 = list;
                    break;
                case 18:
                    zzfhwVar = new zzfhw(jsonReader);
                    listZzb14 = list;
                    break;
                case 19:
                    listZza = zzfhs.zza(jsonReader);
                    listZzb14 = list;
                    break;
                case 20:
                    listZzb3 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    listZzb14 = list;
                    break;
                case 21:
                    strNextString4 = jsonReader.nextString();
                    listZzb14 = list;
                    break;
                case 22:
                    jSONObjectZzd = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
                    listZzb14 = list;
                    break;
                case 23:
                    strNextString5 = jsonReader.nextString();
                    listZzb14 = list;
                    break;
                case 24:
                    strNextString6 = jsonReader.nextString();
                    listZzb14 = list;
                    break;
                case 25:
                    string = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader).toString();
                    listZzb14 = list;
                    break;
                case 26:
                    zzcbhVarZza = zzcbh.zza(com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader));
                    listZzb14 = list;
                    break;
                case 27:
                    strNextString7 = jsonReader.nextString();
                    listZzb14 = list;
                    break;
                case 28:
                    jSONObjectZzd2 = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
                    listZzb14 = list;
                    break;
                case 29:
                    jSONObjectZzd3 = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
                    listZzb14 = list;
                    break;
                case 30:
                    zNextBoolean = jsonReader.nextBoolean();
                    listZzb14 = list;
                    break;
                case 31:
                    zNextBoolean2 = jsonReader.nextBoolean();
                    listZzb14 = list;
                    break;
                case 32:
                    zNextBoolean3 = jsonReader.nextBoolean();
                    listZzb14 = list;
                    break;
                case 33:
                    zNextBoolean4 = jsonReader.nextBoolean();
                    listZzb14 = list;
                    break;
                case 34:
                    zNextBoolean5 = jsonReader.nextBoolean();
                    listZzb14 = list;
                    break;
                case 35:
                    zNextBoolean6 = jsonReader.nextBoolean();
                    listZzb14 = list;
                    break;
                case 36:
                    zNextBoolean7 = jsonReader.nextBoolean();
                    listZzb14 = list;
                    break;
                case 37:
                    iZze = zze(jsonReader.nextString());
                    listZzb14 = list;
                    break;
                case 38:
                    iNextInt2 = jsonReader.nextInt();
                    listZzb14 = list;
                    break;
                case 39:
                    zNextBoolean8 = jsonReader.nextBoolean();
                    listZzb14 = list;
                    break;
                case 40:
                    strNextString8 = jsonReader.nextString();
                    listZzb14 = list;
                    break;
                case 41:
                    jSONObjectZzd4 = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
                    listZzb14 = list;
                    break;
                case 42:
                    zNextBoolean9 = jsonReader.nextBoolean();
                    listZzb14 = list;
                    break;
                case 43:
                    zNextBoolean10 = jsonReader.nextBoolean();
                    listZzb14 = list;
                    break;
                case 44:
                    iNextInt3 = jsonReader.nextInt();
                    listZzb14 = list;
                    break;
                case 45:
                    iNextInt4 = jsonReader.nextInt();
                    listZzb14 = list;
                    break;
                case 46:
                    strNextString9 = jsonReader.nextString();
                    listZzb14 = list;
                    break;
                case 47:
                    strNextString10 = jsonReader.nextString();
                    listZzb14 = list;
                    break;
                case 48:
                    zNextBoolean11 = jsonReader.nextBoolean();
                    listZzb14 = list;
                    break;
                case 49:
                    zzbxeVarZza = zzbxe.zza(com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader));
                    listZzb14 = list;
                    break;
                case 50:
                    jsonReader.nextBoolean();
                    listZzb14 = list;
                    break;
                case AD_REWARD_USER_VALUE:
                    zztVarZza = com.google.android.gms.ads.internal.client.zzt.zza(com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader));
                    listZzb14 = list;
                    break;
                case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
                    strNextString11 = jsonReader.nextString();
                    listZzb14 = list;
                    break;
                case 53:
                    zNextBoolean12 = jsonReader.nextBoolean();
                    listZzb14 = list;
                    break;
                case AD_BACKGROUND_BEFORE_IMPRESSION_VALUE:
                    jSONObjectZzd5 = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
                    listZzb14 = list;
                    break;
                case AD_CLOSED_BEFORE_IMPRESSION_VALUE:
                    strNextString12 = jsonReader.nextString();
                    listZzb14 = list;
                    break;
                case 56:
                    strNextString19 = jsonReader.nextString();
                    listZzb14 = list;
                    break;
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                    strNextString13 = jsonReader.nextString();
                    listZzb14 = list;
                    break;
                case 58:
                    strNextString14 = jsonReader.nextString();
                    listZzb14 = list;
                    break;
                case 59:
                    strNextString15 = jsonReader.nextString();
                    listZzb14 = list;
                    break;
                case 60:
                    strNextString16 = jsonReader.nextString();
                    listZzb14 = list;
                    break;
                case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                    zNextBoolean13 = jsonReader.nextBoolean();
                    listZzb14 = list;
                    break;
                case 62:
                    jSONObjectZzd6 = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
                    listZzb14 = list;
                    break;
                case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                    zNextBoolean14 = jsonReader.nextBoolean();
                    listZzb14 = list;
                    break;
                case 64:
                    strNextString = jsonReader.nextString();
                    listZzb14 = list;
                    break;
                case 65:
                    zNextBoolean15 = jsonReader.nextBoolean();
                    listZzb14 = list;
                    break;
                case 66:
                    com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    listZzb14 = list;
                    break;
                case 67:
                    zNextBoolean16 = jsonReader.nextBoolean();
                    listZzb14 = list;
                    break;
                case 68:
                    strNextString17 = jsonReader.nextString();
                    listZzb14 = list;
                    break;
                case mo.oom.onn /* 69 */:
                    strNextString18 = jsonReader.nextString();
                    listZzb14 = list;
                    break;
                case b.B0 /* 70 */:
                    zNextBoolean17 = jsonReader.nextBoolean();
                    listZzb14 = list;
                    break;
                case 71:
                    zNextBoolean18 = jsonReader.nextBoolean();
                    listZzb14 = list;
                    break;
                case 72:
                    iNextInt5 = jsonReader.nextInt();
                    listZzb14 = list;
                    break;
                case 73:
                    strNextString20 = jsonReader.nextString();
                    listZzb14 = list;
                    break;
                case mo.oom.ooo /* 74 */:
                    listZzb5 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    listZzb14 = list;
                    break;
                case mo.oom.oom /* 75 */:
                    zNextBoolean19 = jsonReader.nextBoolean();
                    listZzb14 = list;
                    break;
                case 76:
                    dNextDouble = jsonReader.nextDouble();
                    listZzb14 = list;
                    break;
                case mo.oom.ono /* 77 */:
                    iZza = zzfql.zza(jsonReader.nextInt());
                    listZzb14 = list;
                    break;
                case 78:
                    if (((Boolean) zzbgk.zzaI.zzg()).booleanValue()) {
                        mapZzc = com.google.android.gms.ads.internal.util.zzbp.zzc(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb14 = list;
                    break;
                case mo.oom.on0 /* 79 */:
                    if (((Boolean) zzbgk.zzjM.zzg()).booleanValue()) {
                        zzvVarZzb = com.google.android.gms.ads.internal.util.client.zzv.zzb(com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader));
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb14 = list;
                    break;
                case 80:
                    if (((Boolean) zzbgk.zzjO.zzg()).booleanValue()) {
                        zzwVarZzd = com.google.android.gms.ads.internal.util.client.zzw.zzd(com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader));
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb14 = list;
                    break;
                case mo.oom.m00 /* 81 */:
                    if (((Boolean) zzbgk.zzoj.zzg()).booleanValue()) {
                        iNextInt6 = jsonReader.nextInt();
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb14 = list;
                    break;
                case 82:
                    listZzb6 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    listZzb14 = list;
                    break;
                case 83:
                    zNextBoolean20 = jsonReader.nextBoolean();
                    listZzb14 = list;
                    break;
                case 84:
                    if (((Boolean) zzbgk.zziK.zzg()).booleanValue()) {
                        zzgtdVarZza = zzdyi.zza(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb14 = list;
                    break;
                case 85:
                    zNextBoolean21 = jsonReader.nextBoolean();
                    listZzb14 = list;
                    break;
                case 86:
                    if (((Boolean) zzbgk.zzhE.zzg()).booleanValue()) {
                        try {
                            Bundle bundleZzl = com.google.android.gms.ads.internal.util.zzbp.zzl(com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader));
                            if (bundleZzl != null) {
                                bundle2 = bundleZzl;
                            }
                        } catch (IllegalStateException unused) {
                            jsonReader.skipValue();
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                    listZzb14 = list;
                    break;
                default:
                    jsonReader.skipValue();
                    listZzb14 = list;
                    break;
            }
            list2 = listZzb;
        }
        jsonReader.endObject();
        this.zza = listZzb2;
        this.zzb = iZzc;
        this.zzc = listZzb7;
        this.zzd = listZzb8;
        this.zzf = listZzb9;
        this.zze = iZzd;
        this.zzg = listZzb10;
        this.zzh = listZzb11;
        this.zzi = listZzb12;
        this.zzj = strNextString3;
        this.zzk = strNextString2;
        this.zzl = zzbzyVarZza;
        this.zzm = listZzb13;
        this.zzn = listZzb14;
        this.zzo = list2;
        this.zzp = listZzb4;
        this.zzq = iNextInt;
        this.zzr = listZza2;
        this.zzs = zzfhwVar;
        this.zzt = listZzb3;
        this.zzu = listZza;
        this.zzw = strNextString4;
        this.zzv = jSONObjectZzd;
        this.zzx = strNextString5;
        this.zzy = strNextString6;
        this.zzz = string;
        this.zzA = zzcbhVarZza;
        this.zzB = strNextString7;
        this.zzC = jSONObjectZzd2;
        this.zzD = jSONObjectZzd3;
        this.zzJ = zNextBoolean;
        this.zzK = zNextBoolean2;
        this.zzL = zNextBoolean3;
        this.zzM = zNextBoolean4;
        this.zzN = zNextBoolean5;
        this.zzO = zNextBoolean6;
        this.zzP = zNextBoolean7;
        this.zzQ = iZze;
        this.zzR = iNextInt2;
        this.zzT = zNextBoolean8;
        this.zzU = strNextString8;
        this.zzV = new zzfin(jSONObjectZzd4);
        this.zzW = zNextBoolean9;
        this.zzX = zNextBoolean10;
        this.zzY = iNextInt3;
        this.zzZ = strNextString9;
        this.zzaa = iNextInt4;
        this.zzab = strNextString10;
        this.zzac = zNextBoolean11;
        this.zzad = zzbxeVarZza;
        this.zzae = zztVarZza;
        this.zzaf = strNextString11;
        this.zzag = zNextBoolean12;
        this.zzah = jSONObjectZzd5;
        this.zzE = strNextString12;
        this.zzF = strNextString13;
        this.zzG = strNextString14;
        this.zzH = strNextString15;
        this.zzI = strNextString16;
        this.zzai = zNextBoolean13;
        this.zzaj = jSONObjectZzd6;
        this.zzak = zNextBoolean14;
        this.zzal = strNextString;
        this.zzam = zNextBoolean15;
        this.zzS = zNextBoolean16;
        this.zzan = strNextString17;
        this.zzao = strNextString18;
        this.zzap = strNextString19;
        this.zzaq = zNextBoolean17;
        this.zzar = zNextBoolean18;
        this.zzas = iNextInt5;
        this.zzau = listZzb5;
        this.zzat = strNextString20;
        this.zzav = zNextBoolean19;
        this.zzaw = mapZzc;
        this.zzax = zzvVarZzb;
        this.zzay = zzwVarZzd;
        this.zzaz = dNextDouble;
        this.zzaG = iZza;
        this.zzaA = listZzb6;
        this.zzaB = zNextBoolean20;
        this.zzaC = zzgtdVarZza;
        this.zzaD = zNextBoolean21;
        this.zzaE = iNextInt6;
        this.zzaF = bundle2;
    }

    public static String zza(int i2) {
        switch (i2) {
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
        if ("interstitial".equals(str)) {
            return 2;
        }
        if ("native_express".equals(str)) {
            return 3;
        }
        if ("native".equals(str)) {
            return 4;
        }
        if ("rewarded".equals(str)) {
            return 5;
        }
        if ("app_open_ad".equals(str)) {
            return 6;
        }
        return "rewarded_interstitial".equals(str) ? 7 : 0;
    }

    private static int zzd(int i2) {
        if (i2 == 0 || i2 == 1 || i2 == 3 || i2 == 4) {
            return i2;
        }
        return 0;
    }

    private static int zze(String str) {
        if (d9.h.C.equalsIgnoreCase(str)) {
            return 6;
        }
        return d9.h.D.equalsIgnoreCase(str) ? 7 : -1;
    }

    public final boolean zzb() {
        return this.zzai || this.zzay != null;
    }
}
