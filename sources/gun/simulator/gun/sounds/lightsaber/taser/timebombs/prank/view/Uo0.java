package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Build;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class Uo0 implements Serializable {
    private long IeN;
    private String JVA;
    private KG JXs;
    public int LD;
    public String Lxb;
    private int NXR;
    private String STP;
    private boolean VVE;
    public int ZU;
    private int brP;
    private String ebl;
    private boolean kqm;
    private KG lc;
    private int sLN;
    private int tD;
    private int OY = 204800;
    private int QAg = 0;
    private int nBu = 0;
    public final HashMap<String, Object> lk = new HashMap<>();
    private int DY = 10000;
    private int Sfi = 10000;
    private int HD = 10000;
    private int eK = 0;
    private JSONObject aH = new JSONObject();

    public Uo0(String str, KG kg, KG kg2, int i, int i2) {
        this.brP = 0;
        this.tD = 0;
        this.ebl = str;
        this.JXs = kg;
        this.lc = kg2;
        this.brP = i;
        this.tD = i2;
    }

    public KG DY() {
        return this.JXs;
    }

    public int IeN() {
        return this.brP;
    }

    public boolean JVA() {
        KG kg;
        if (this.tD == 1 && (kg = this.lc) != null && !TextUtils.isEmpty(kg.g)) {
            if (Ro0.e == 2) {
                if (Build.VERSION.SDK_INT >= 26) {
                    return true;
                }
            } else if (this.brP == 1) {
                return true;
            }
        }
        return false;
    }

    public synchronized Object JXs(String str) {
        return this.lk.get(str);
    }

    public String LD() {
        return this.ebl;
    }

    public synchronized void Lxb(String str, Object obj) {
        this.lk.put(str, obj);
    }

    public String NXR() {
        if (JVA()) {
            return this.lc.g;
        }
        KG kg = this.JXs;
        if (kg != null) {
            return kg.g;
        }
        return null;
    }

    public boolean OY() {
        return this.VVE;
    }

    public long QAg() {
        if (JVA()) {
            return this.lc.c;
        }
        KG kg = this.JXs;
        if (kg != null) {
            return kg.c;
        }
        return 0L;
    }

    public String STP() {
        if (JVA()) {
            return this.lc.b();
        }
        KG kg = this.JXs;
        if (kg != null) {
            return kg.b();
        }
        return null;
    }

    public KG Sfi() {
        return this.lc;
    }

    public int VVE() {
        return this.DY;
    }

    public boolean ZU() {
        return this.kqm;
    }

    public int brP() {
        return this.HD;
    }

    public long ebl() {
        return this.IeN;
    }

    public int kqm() {
        return this.Sfi;
    }

    public int lc() {
        return this.NXR;
    }

    public int lk() {
        if (JVA()) {
            return this.lc.a();
        }
        KG kg = this.JXs;
        if (kg != null) {
            return kg.a();
        }
        return 0;
    }

    public boolean nBu() {
        if (JVA()) {
            return this.lc.o == 0;
        }
        KG kg = this.JXs;
        return kg == null || kg.o == 0;
    }

    public float sLN() {
        if (JVA()) {
            this.lc.getClass();
            return -1.0f;
        }
        KG kg = this.JXs;
        if (kg != null) {
            kg.getClass();
        }
        return -1.0f;
    }

    public int tD() {
        return this.eK;
    }

    public void LD(String str) {
        this.JVA = str;
    }

    public void ZU(String str) {
        this.Lxb = str;
    }

    public void ebl(int i) {
        this.eK = i;
    }

    public void lc(int i) {
        this.HD = i;
    }

    public int JXs() {
        return this.sLN;
    }

    public void LD(int i) {
        this.NXR = i;
    }

    public void ZU(int i) {
        this.DY = i;
    }

    public void JXs(int i) {
        this.Sfi = i;
    }

    public int Lxb() {
        return this.aH.optInt("pitaya_cache_size", 0);
    }

    public void Lxb(String str) {
        this.ebl = str;
    }

    public void lk(String str) {
        this.STP = str;
    }

    public void Lxb(int i) {
        this.sLN = i;
    }

    public void lk(int i) {
        this.LD = i;
    }

    public void Lxb(long j) {
        this.IeN = j;
    }

    public void Lxb(boolean z) {
        this.VVE = z;
    }
}
