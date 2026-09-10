package com.bytedance.sdk.component.ebl.lk;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.webkit.ProxyConfig;
import com.bytedance.sdk.component.LD.Lxb.IeN;
import com.bytedance.sdk.component.LD.Lxb.NXR;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.net.InetAddress;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public class lc {
    private LD JXs;
    private JXs OY;
    private boolean ZU;
    private Context ebl;
    private Lxb lk;
    private int tD;
    private long LD = 0;
    private boolean lc = false;
    private int QAg = 0;
    private long nBu = 19700101000L;
    private int JVA = 0;
    private HashMap<String, Integer> sLN = new HashMap<>();
    private HashMap<String, Integer> NXR = new HashMap<>();
    private int STP = 0;
    private HashMap<String, Integer> IeN = new HashMap<>();
    private HashMap<String, Integer> VVE = new HashMap<>();
    private boolean kqm = true;
    private Map<String, Integer> brP = new HashMap();
    Handler Lxb = new Handler(Looper.getMainLooper()) { // from class: com.bytedance.sdk.component.ebl.lk.lc.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 10000) {
                return;
            }
            lc.this.LD(message.arg1 != 0);
        }
    };

    private lc() {
    }

    private boolean Lxb(int i) {
        return i >= 200 && i < 400;
    }

    private void QAg() {
        SharedPreferences sharedPreferences = this.ebl.getSharedPreferences(Lxb(), 0);
        this.QAg = sharedPreferences.getInt("tnc_probe_cmd", 0);
        this.nBu = sharedPreferences.getLong("tnc_probe_version", 19700101000L);
    }

    private void nBu() {
        this.JVA = 0;
        this.sLN.clear();
        this.NXR.clear();
        this.STP = 0;
        this.IeN.clear();
        this.VVE.clear();
    }

    public void JXs() {
        this.brP.clear();
    }

    public Lxb LD() {
        return this.lk;
    }

    public JXs OY() {
        return this.OY;
    }

    public LD ZU() {
        return this.JXs;
    }

    public Map<String, String> ebl() {
        ZU zuLc = lc();
        if (zuLc != null) {
            return zuLc.ZU;
        }
        return null;
    }

    public ZU lc() {
        JXs jXs = this.OY;
        if (jXs != null) {
            return jXs.lk();
        }
        return null;
    }

    public boolean lk() {
        return this.ZU;
    }

    private void LD(String str) {
        Map<String, String> mapEbl;
        if (TextUtils.isEmpty(str) || (mapEbl = ebl()) == null || !mapEbl.containsValue(str)) {
            return;
        }
        if (this.brP.get(str) == null) {
            this.brP.put(str, 1);
        } else {
            this.brP.put(str, Integer.valueOf(this.brP.get(str).intValue() + 1));
        }
    }

    private boolean ZU(String str) {
        Map<String, String> mapEbl = ebl();
        if (mapEbl == null) {
            return false;
        }
        String str2 = mapEbl.get(str);
        return (TextUtils.isEmpty(str2) || this.brP.get(str2) == null || this.brP.get(str2).intValue() < 3) ? false : true;
    }

    private void lk(String str) {
        if (!TextUtils.isEmpty(str) && this.brP.containsKey(str)) {
            this.brP.put(str, 0);
        }
    }

    public String Lxb() {
        return "ttnet_tnc_config" + this.tD;
    }

    public void Lxb(boolean z) {
        this.ZU = z;
    }

    public void Lxb(LD ld) {
        this.JXs = ld;
    }

    public synchronized void Lxb(Context context, boolean z) {
        try {
            if (!this.lc) {
                this.ebl = context;
                this.kqm = z;
                this.OY = new JXs(context, z, this.tD);
                if (z) {
                    QAg();
                }
                this.lk = OY.Lxb().Lxb(this.tD, this.ebl);
                this.lc = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void LD(boolean z) {
        ZU zuLc = lc();
        if (zuLc == null) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (!z) {
            if ((((long) zuLc.JVA) * 1000) + this.LD > jElapsedRealtime) {
                return;
            }
        }
        this.LD = jElapsedRealtime;
        OY.Lxb().Lxb(this.tD, this.ebl).lk();
    }

    private boolean LD(int i) {
        if (i < 100 || i >= 1000) {
            return true;
        }
        ZU zuLc = lc();
        return (zuLc == null || TextUtils.isEmpty(zuLc.NXR) || !zuLc.NXR.contains(String.valueOf(i))) ? false : true;
    }

    public String Lxb(String str) {
        String protocol;
        Map<String, String> mapEbl;
        if (TextUtils.isEmpty(str) || str.contains("/network/get_network") || str.contains("/get_domains/v4") || str.contains("/ies/speed")) {
            return str;
        }
        String host = null;
        try {
            URL url = new URL(str);
            protocol = url.getProtocol();
            try {
                host = url.getHost();
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            protocol = null;
        }
        if (TextUtils.isEmpty(protocol)) {
            return str;
        }
        if ((!ProxyConfig.MATCH_HTTP.equals(protocol) && !"https".equals(protocol)) || TextUtils.isEmpty(host) || ZU(host) || (mapEbl = ebl()) == null || !mapEbl.containsKey(host)) {
            return str;
        }
        String str2 = mapEbl.get(host);
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        String strI = DM.i(protocol, "://", host);
        return str.startsWith(strI) ? str.replaceFirst(strI, DM.i(protocol, "://", str2)) : str;
    }

    public lc(int i) {
        this.tD = i;
    }

    public synchronized void Lxb(NXR nxr, IeN ieN) {
        URL urlLxb;
        if (nxr == null || ieN == null) {
            return;
        }
        if (this.kqm) {
            if (com.bytedance.sdk.component.ebl.ZU.JXs.Lxb(this.ebl)) {
                try {
                    urlLxb = nxr.LD().Lxb();
                } catch (Exception unused) {
                    urlLxb = null;
                }
                if (urlLxb == null) {
                    return;
                }
                String protocol = urlLxb.getProtocol();
                String host = urlLxb.getHost();
                String path = urlLxb.getPath();
                String strLxb = Lxb(nxr);
                int iLk = ieN.lk();
                if (ProxyConfig.MATCH_HTTP.equals(protocol) || "https".equals(protocol)) {
                    if (TextUtils.isEmpty(strLxb)) {
                        return;
                    }
                    ZU zuLc = lc();
                    if (zuLc != null && zuLc.LD) {
                        Lxb(ieN, host);
                    }
                    if (zuLc == null) {
                        return;
                    }
                    this.sLN.size();
                    this.NXR.size();
                    this.IeN.size();
                    this.VVE.size();
                    if (iLk > 0) {
                        if (Lxb(iLk)) {
                            if (this.JVA > 0 || this.STP > 0) {
                                nBu();
                            }
                            lk(host);
                            return;
                        }
                        if (!LD(iLk)) {
                            this.STP++;
                            this.IeN.put(path, 0);
                            this.VVE.put(strLxb, 0);
                            if (this.STP >= zuLc.OY && this.IeN.size() >= zuLc.QAg && this.VVE.size() >= zuLc.nBu) {
                                Lxb(false, 0L);
                                nBu();
                            }
                            LD(host);
                        }
                    }
                }
            }
        }
    }

    private String Lxb(NXR nxr) {
        if (nxr == null || nxr.LD() == null || nxr.LD().Lxb() == null) {
            return "";
        }
        try {
            return InetAddress.getByName(nxr.LD().Lxb().getHost()).getHostAddress();
        } catch (Exception unused) {
            return "";
        }
    }

    public synchronized void Lxb(NXR nxr, Exception exc) {
        URL urlLxb;
        if (nxr != null) {
            if (nxr.LD() != null && exc != null) {
                if (this.kqm) {
                    if (com.bytedance.sdk.component.ebl.ZU.JXs.Lxb(this.ebl)) {
                        try {
                            urlLxb = nxr.LD().Lxb();
                        } catch (Exception unused) {
                            urlLxb = null;
                        }
                        if (urlLxb == null) {
                            return;
                        }
                        String protocol = urlLxb.getProtocol();
                        String host = urlLxb.getHost();
                        String path = urlLxb.getPath();
                        String strLxb = Lxb(nxr);
                        if (ProxyConfig.MATCH_HTTP.equals(protocol) || "https".equals(protocol)) {
                            ZU zuLc = lc();
                            if (zuLc == null) {
                                return;
                            }
                            this.sLN.size();
                            this.NXR.size();
                            this.IeN.size();
                            this.VVE.size();
                            this.JVA++;
                            this.sLN.put(path, 0);
                            this.NXR.put(strLxb, 0);
                            if (this.JVA >= zuLc.JXs && this.sLN.size() >= zuLc.lc && this.NXR.size() >= zuLc.ebl) {
                                Lxb(false, 0L);
                                nBu();
                            }
                            LD(host);
                        }
                    }
                }
            }
        }
    }

    private void Lxb(IeN ieN, String str) {
        String[] strArrSplit;
        int i;
        long j;
        ZU zuLc;
        if (ieN != null && this.kqm) {
            String strLxb = ieN.Lxb("tnc-cmd", null);
            if (TextUtils.isEmpty(strLxb) || (strArrSplit = strLxb.split("@")) == null || strArrSplit.length != 2) {
                return;
            }
            try {
                i = Integer.parseInt(strArrSplit[0]);
                try {
                    j = Long.parseLong(strArrSplit[1]);
                } catch (Throwable unused) {
                    j = 0;
                }
            } catch (Throwable unused2) {
                i = 0;
            }
            if (j <= this.nBu) {
                return;
            }
            this.QAg = i;
            this.nBu = j;
            this.ebl.getSharedPreferences(Lxb(), 0).edit().putInt("tnc_probe_cmd", i).putLong("tnc_probe_version", j).apply();
            if (this.QAg != 10000 || (zuLc = lc()) == null) {
                return;
            }
            Random random = new Random(System.currentTimeMillis());
            int i2 = zuLc.sLN;
            Lxb(true, i2 > 0 ? ((long) random.nextInt(i2)) * 1000 : 0L);
        }
    }

    private void Lxb(boolean z, long j) {
        if (this.Lxb.hasMessages(10000)) {
            return;
        }
        Message messageObtainMessage = this.Lxb.obtainMessage();
        messageObtainMessage.what = 10000;
        messageObtainMessage.arg1 = z ? 1 : 0;
        if (j > 0) {
            this.Lxb.sendMessageDelayed(messageObtainMessage, j);
        } else {
            this.Lxb.sendMessage(messageObtainMessage);
        }
    }
}
