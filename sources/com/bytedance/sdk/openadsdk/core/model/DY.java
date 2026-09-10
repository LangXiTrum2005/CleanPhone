package com.bytedance.sdk.openadsdk.core.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.CG;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.KG;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class DY extends tD {
    private tD JVA;
    private final Lxb nBu;
    private boolean sLN;

    public DY(Lxb lxb) {
        this.nBu = lxb;
        this.JVA = lxb.lc();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public JSONObject AcC() {
        return this.JVA.AcC();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public String Ax() {
        return this.JVA.Ax();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void BK() {
        this.JVA.BK();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int BcA() {
        return this.JVA.BcA();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public com.bytedance.sdk.component.QAg.LD.Lxb Bg() {
        return this.JVA.Bg();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean Bj() {
        return this.JVA.Bj();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int CG() {
        return this.JVA.CG();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int CSn() {
        return this.JVA.CSn();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int DY() {
        return this.JVA.DY();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean FA() {
        return this.JVA.LD;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public String FD() {
        return this.JVA.FD();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int FGm() {
        return this.JVA.FGm();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean FV() {
        return this.JVA.FV();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void FtP() {
        this.JVA.FtP();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public String GX() {
        return this.JVA.GX();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int HD() {
        return this.JVA.HD();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public KG HN() {
        return this.JVA.HN();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public Map<String, Object> Hu() {
        return this.JVA.Hu();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean IG() {
        return this.JVA.IG();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean II() {
        return this.JVA.Lxb;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public long IeN() {
        return this.JVA.IeN();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int Ivz() {
        return this.JVA.Ivz();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean Iyd() {
        return this.JVA.Iyd();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public JSONObject JD() {
        return this.JVA.JD();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public KG JJ() {
        return this.JVA.JJ();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean JP() {
        return this.JVA.JP();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public JXs JVA() {
        return this.JVA.JVA();
    }

    public boolean JW() {
        return this.nBu.ebl();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void JXs(String str) {
        this.JVA.JXs(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int JZE() {
        return this.JVA.JZE();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public NXR KOQ() {
        return this.JVA.KOQ();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public String KPU() {
        return this.JVA.KPU();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public CG Kue() {
        return this.JVA.Kue();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void LD(int i) {
        this.JVA.LD(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int LRt() {
        return this.JVA.LRt();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public List<String> LXE() {
        return this.JVA.LXE();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean LYC() {
        Lxb lxb = this.nBu;
        return lxb != null && lxb.sLN();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean Ld() {
        return this.JVA.Ld();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public IeN Lpq() {
        return this.JVA.Lpq();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public String Lv() {
        return this.JVA.Lv();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Lxb(JXs jXs) {
        this.JVA.Lxb(jXs);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public lk MGT() {
        return this.JVA.MGT();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean MH() {
        return this.JVA.MH();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public JSONObject Mvg() {
        return this.JVA.Mvg();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public String Mx() {
        return this.JVA.Mx();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int NDz() {
        return this.JVA.NDz();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int NXR() {
        return this.JVA.NXR();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean Njp() {
        return this.JVA.Njp();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public IeN Ns() {
        return this.JVA.Ns();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public String Nu() {
        return this.JVA.Nu();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean OY() {
        return this.JVA.OY();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean Of() {
        return this.JVA.Of();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public long Pd() {
        return this.JVA.Pd();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean Pw() {
        return this.JVA.Pw();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void QAg(boolean z) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void RC() {
        this.JVA.RC();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public com.bytedance.sdk.openadsdk.eK.Lxb.LD Rp() {
        return this.JVA.Rp();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int Rt() {
        return this.JVA.Rt();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public List<String> SS() {
        return this.JVA.SS();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int STP() {
        return this.JVA.STP();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public String Sfi() {
        return this.JVA.Sfi();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public com.bytedance.sdk.openadsdk.core.sLN.Lxb SlV() {
        return this.JVA.SlV();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public String Sv() {
        return this.JVA.Sv();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int TA() {
        return this.JVA.TA();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int Td() {
        return this.JVA.Td();
    }

    public boolean UQi() {
        return this.sLN;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int VB() {
        return this.JVA.VB();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public String VU() {
        return this.JVA.VU();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public eK VVE() {
        return this.JVA.VVE();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean Vs() {
        return this.JVA.Vs();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public List<FilterWord> Wi() {
        return this.JVA.Wi();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int XM() {
        return this.JVA.XM();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Xp() {
        this.JVA.Xp();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int YUS() {
        return this.JVA.YUS();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean YZq() {
        return this.JVA.YZq();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean Yc() {
        return this.JVA.Yc();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public com.bytedance.sdk.openadsdk.core.JVA.lc.Lxb Yw() {
        return this.JVA.Yw();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean ZE() {
        return this.JVA.ZE();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void ZU(int i) {
        this.JVA.ZU(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public float Za() {
        return this.JVA.Za();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int Zg() {
        return this.JVA.Zg();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int aBz() {
        return this.JVA.aBz();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean aE() {
        return this.JVA.aE();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean aH() {
        return this.JVA.aH();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void aHr() {
        this.JVA.aHr();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public String ae() {
        return this.JVA.ae();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public String bG() {
        return this.JVA.bG();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int bm() {
        return this.JVA.bm();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int brP() {
        return this.JVA.brP();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean cFD() {
        return this.JVA.cFD();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean cR() {
        return this.JVA.cR();
    }

    @NonNull
    public List<tD> cRD() {
        List<tD> listZU = this.nBu.ZU();
        return listZU != null ? listZU : new ArrayList();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    @Nullable
    public String cf() {
        return this.JVA.cf();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean chu() {
        return this.JVA.chu();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public id dR() {
        return this.JVA.dR();
    }

    public Lxb.C0108Lxb dm() {
        return this.nBu.QAg();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int eK() {
        return this.JVA.eK();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean eXY() {
        return this.JVA.eXY();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public String ebl() {
        return this.JVA.ebl();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public JSONObject ek() {
        return this.JVA.ek();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int eof() {
        return this.JVA.eof();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean eq() {
        return this.JVA.eq();
    }

    public boolean equals(Object obj) {
        return this.JVA.equals(obj);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int fG() {
        return this.JVA.fG();
    }

    public Lxb foF() {
        return this.nBu;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int foI() {
        return this.JVA.foI();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean gS() {
        return this.JVA.gS();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean goy() {
        return this.JVA.goy();
    }

    public int hashCode() {
        return this.JVA.hashCode();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public AdSlot hg() {
        return this.JVA.hg();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public JSONObject iC() {
        return this.JVA.iC();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public String iQi() {
        return this.JVA.iQi();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int id() {
        return this.JVA.id();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public String jeq() {
        return this.JVA.jeq();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public double kRz() {
        return this.JVA.kRz();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean kVf() {
        return this.JVA.kVf();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int kqm() {
        return this.JVA.kqm();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int lJ() {
        return this.JVA.lJ();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public String lc() {
        return this.JVA.lc();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean le() {
        return this.JVA.le();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void lk(int i) {
        this.JVA.lk(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean mOF() {
        return this.JVA.mOF();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean mW() {
        return this.JVA.mW();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int mb() {
        return this.JVA.mb();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public long mhk() {
        return this.JVA.mhk();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int mu() {
        return this.JVA.mu();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public VVE nBu() {
        return this.JVA.nBu();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int nE() {
        return this.JVA.nE();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int nH() {
        return this.JVA.nH();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public String nJ() {
        return this.JVA.nJ();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int nP() {
        return this.JVA.nP();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public JVA nTb() {
        return this.JVA.nTb();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean nYy() {
        return this.JVA.nYy();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public com.bytedance.sdk.openadsdk.core.JVA.lc.Lxb nrJ() {
        return this.JVA.nrJ();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public String oc() {
        return this.JVA.oc();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean oo() {
        return this.JVA.oo();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int op() {
        return this.JVA.op();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public String owi() {
        return this.JVA.owi();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int pyu() {
        return this.JVA.pyu();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean qEi() {
        return this.JVA.qEi();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int qK() {
        return this.JVA.qK();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public KG rK() {
        return this.JVA.rK();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public String rO() {
        return this.JVA.rO();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public tD.Lxb rW() {
        return this.JVA.rW();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public long ro() {
        return this.JVA.ro();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public ZU sLN() {
        return this.JVA.sLN();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int sRq() {
        return this.JVA.sRq();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int tD() {
        return this.JVA.tD();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int tv() {
        return this.JVA.tv();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public String uTT() {
        return this.JVA.uTT();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean uao() {
        return this.JVA.uao();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public List<IeN> uxf() {
        return this.JVA.uxf();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public String vSG() {
        return this.JVA.vSG();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public int wCT() {
        return this.JVA.wCT();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean wPa() {
        return this.JVA.wPa();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean wVL() {
        return this.JVA.wVL();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public HD wVT() {
        return this.JVA.wVT();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public List<String> wbY() {
        return this.JVA.wbY();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public String xNP() {
        return this.JVA.xNP();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public QAg xan() {
        return this.JVA.xan();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public String xr() {
        return this.JVA.xr();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean zqY() {
        return this.JVA.zqY();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void BcA(int i) {
        this.JVA.BcA(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void CG(int i) {
        this.JVA.CG(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void CSn(int i) {
        this.JVA.CSn(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void DY(int i) {
        this.JVA.DY(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void HD(int i) {
        this.JVA.HD(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void IeN(int i) {
        this.JVA.IeN(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Ivz(int i) {
        this.JVA.Ivz(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void JJ(int i) {
        this.JVA.JJ(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void JVA(int i) {
        this.JVA.JVA(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void JXs(int i) {
        this.JVA.JXs(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void KPU(int i) {
        this.JVA.KPU(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void LD(double d) {
        this.JVA.LD(d);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Lxb(brP brp) {
        this.JVA.Lxb(brp);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void NDz(int i) {
        this.JVA.NDz(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void NXR(int i) {
        this.JVA.NXR(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void OY(String str) {
        this.JVA.OY(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Pw(int i) {
        this.JVA.Pw(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public brP QAg() {
        return this.JVA.QAg();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void STP(int i) {
        this.JVA.STP(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Sfi(int i) {
        this.JVA.Sfi(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void VU(int i) {
        this.JVA.VU(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void VVE(int i) {
        this.JVA.VVE(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void ZU(boolean z) {
        this.JVA.ZU(z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void aH(int i) {
        this.JVA.aH(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void brP(int i) {
        this.JVA.brP(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void dR(int i) {
        this.JVA.dR(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void eK(int i) {
        this.JVA.eK(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void ebl(String str) {
        this.JVA.ebl(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void foI(int i) {
        this.JVA.foI(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void hg(int i) {
        this.JVA.hg(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void id(int i) {
        this.JVA.id(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void kqm(int i) {
        this.JVA.kqm(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void lc(String str) {
        this.JVA.lc(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void le(int i) {
        this.JVA.le(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void lk(IeN ieN) {
        this.JVA.lk(ieN);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void nBu(int i) {
        this.JVA.nBu(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void nE(int i) {
        this.JVA.nE(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void nJ(int i) {
        this.JVA.nJ(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void rW(int i) {
        this.JVA.rW(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void sLN(int i) {
        this.JVA.sLN(i);
    }

    public void sRq(int i) {
        List<tD> listZU = this.nBu.ZU();
        listZU.size();
        if (i >= listZU.size()) {
            i = 0;
        } else if (i < 0) {
            return;
        }
        this.JVA = listZU.get(i);
        this.sLN = true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void tD(int i) {
        this.JVA.tD(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void xan(int i) {
        this.JVA.xan(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public String CSn(String str) {
        return this.JVA.CSn(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void DY(String str) {
        this.JVA.DY(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void HD(String str) {
        this.JVA.HD(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void IeN(String str) {
        this.JVA.IeN(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Ivz(String str) {
        this.JVA.Ivz(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void JVA(String str) {
        this.JVA.JVA(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void JXs(JSONObject jSONObject) {
        this.JVA.JXs(jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void KPU(String str) {
        this.JVA.KPU(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void LD(JSONObject jSONObject) {
        this.JVA.LD(jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Lxb(VVE vve) {
        this.JVA.Lxb(vve);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void NXR(String str) {
        this.JVA.NXR(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void OY(int i) {
        this.JVA.OY(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void QAg(String str) {
        this.JVA.QAg(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void STP(String str) {
        this.JVA.STP(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Sfi(String str) {
        this.JVA.Sfi(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void VVE(String str) {
        this.JVA.VVE(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void ZU(JSONObject jSONObject) {
        this.JVA.ZU(jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void aH(String str) {
        this.JVA.aH(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void brP(String str) {
        this.JVA.brP(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void eK(String str) {
        this.JVA.eK(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void ebl(int i) {
        this.JVA.ebl(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void foI(String str) {
        this.JVA.foI(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void id(String str) {
        this.JVA.id(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void kqm(String str) {
        this.JVA.kqm(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void lc(int i) {
        this.JVA.lc(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void lk(JSONObject jSONObject) {
        this.JVA.lk(jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void nBu(String str) {
        this.JVA.nBu(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void sLN(String str) {
        this.JVA.sLN(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void tD(String str) {
        this.JVA.tD(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void JVA(boolean z) {
        this.JVA.JVA(z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean JXs() {
        return this.JVA.JXs();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void LD(IeN ieN) {
        this.JVA.LD(ieN);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Lxb(ZU zu) {
        this.JVA.Lxb(zu);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void OY(boolean z) {
        this.JVA.OY(z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void QAg(int i) {
        this.JVA.QAg(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public boolean ZU() {
        return this.JVA.ZU();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void ebl(boolean z) {
        this.JVA.ebl(z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void lc(boolean z) {
        this.JVA.lc(z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void lk(KG kg) {
        this.JVA.lk(kg);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void nBu(boolean z) {
        this.JVA.nBu(z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void JXs(boolean z) {
        this.JVA.JXs(z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void LD(long j) {
        this.JVA.LD(j);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Lxb(eK eKVar) {
        this.JVA.Lxb(eKVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void lk(boolean z) {
        this.JVA.lk(z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void LD(KG kg) {
        this.JVA.LD(kg);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Lxb(int i) {
        this.JVA.Lxb(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void lk(long j) {
        this.JVA.lk(j);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void LD(boolean z) {
        this.JVA.LD(z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Lxb(int i, int i2) {
        this.JVA.Lxb(i, i2);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void LD(com.bytedance.sdk.openadsdk.core.JVA.lc.Lxb lxb) {
        this.JVA.LD(lxb);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Lxb(double d) {
        this.JVA.Lxb(d);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Lxb(QAg qAg) {
        this.JVA.Lxb(qAg);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Lxb(AdSlot adSlot) {
        this.JVA.Lxb(adSlot);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Lxb(tD.Lxb lxb) {
        this.JVA.Lxb(lxb);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Lxb(id idVar) {
        this.JVA.Lxb(idVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Lxb(KG kg) {
        this.JVA.Lxb(kg);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Lxb(sLN sln) {
        this.JVA.Lxb(sln);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Lxb(IeN ieN) {
        this.JVA.Lxb(ieN);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Lxb(lk lkVar) {
        this.JVA.Lxb(lkVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Lxb(JVA jva) {
        this.JVA.Lxb(jva);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Lxb(FilterWord filterWord) {
        this.JVA.Lxb(filterWord);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Lxb(Map<String, Object> map) {
        this.JVA.Lxb(map);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Lxb(float f) {
        this.JVA.Lxb(f);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Lxb(com.bytedance.sdk.openadsdk.core.sLN.Lxb lxb) {
        this.JVA.Lxb(lxb);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Lxb(NXR nxr) {
        this.JVA.Lxb(nxr);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Lxb(boolean z) {
        this.JVA.Lxb(z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Lxb(com.bytedance.sdk.openadsdk.core.JVA.lc.Lxb lxb) {
        this.JVA.Lxb(lxb);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Lxb(HD hd) {
        this.JVA.Lxb(hd);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tD
    public void Lxb(com.bytedance.sdk.openadsdk.eK.Lxb.LD ld) {
        this.JVA.Lxb(ld);
    }
}
