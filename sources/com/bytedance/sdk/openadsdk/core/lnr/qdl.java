package com.bytedance.sdk.openadsdk.core.lnr;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.utils.jl;
import com.bytedance.sdk.openadsdk.core.fco;
import com.bytedance.sdk.openadsdk.core.model.fs;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.model.tvp;
import com.bytedance.sdk.openadsdk.core.model.vu;
import com.bytedance.sdk.openadsdk.core.tvp.aaj;
import com.bytedance.sdk.openadsdk.core.tvp.jpc;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.gy;
import com.bytedance.sdk.openadsdk.utils.jtx;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class qdl extends ud {
    private int fco;
    private WeakReference<InterfaceC0118qdl> hkc;
    private boolean hzv;
    private boolean lnr;
    private boolean qdl;
    private boolean ud;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.lnr.qdl$qdl, reason: collision with other inner class name */
    public interface InterfaceC0118qdl {
        long getVideoProgress();
    }

    public qdl(Context context, ljh ljhVar, String str, int i2) {
        super(context, ljhVar, str, i2);
        this.qdl = true;
        this.ud = false;
        this.lnr = false;
        this.hzv = false;
    }

    private boolean jpc() {
        return this instanceof jpc;
    }

    private boolean tvp() {
        ljh ljhVar = ((ud) this).mo;
        if (ljhVar == null || jpc()) {
            return false;
        }
        if (ljhVar.vxg() != 5 && ljhVar.vxg() != 15) {
            return false;
        }
        if (this.fco == 0) {
            this.fco = ljhVar.vz();
        }
        ud();
        qdl();
        lnr();
        if (this.fco == 5 && wd() && qdl() && !ud() && !lnr()) {
            return false;
        }
        int i2 = this.fco;
        return i2 == 1 || i2 == 2 || i2 == 5;
    }

    private boolean wd() {
        ljh ljhVar = ((ud) this).mo;
        return ljh.mzz(ljhVar) && ljhVar.kab() == 1;
    }

    public boolean lnr() {
        return false;
    }

    public void mml(boolean z2) {
        this.hzv = z2;
    }

    public void qdl(boolean z2) {
        this.qdl = z2;
    }

    public boolean ud() {
        return false;
    }

    private boolean lnr(View view) {
        if (view == null) {
            return false;
        }
        if ((view instanceof com.bytedance.sdk.openadsdk.core.exu.ud.mo) || view.getId() == jtx.tdy || view.getId() == jtx.ax || view.getId() == jtx.ag || view.getId() == jtx.wc || view.getId() == jtx.om || view.getId() == 520093726 || view.getId() == jtx.hd) {
            return true;
        }
        if (view instanceof ViewGroup) {
            int i2 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i2 >= viewGroup.getChildCount()) {
                    break;
                }
                if (lnr(viewGroup.getChildAt(i2))) {
                    return true;
                }
                i2++;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0214  */
    /* JADX WARN: Code duplicated, block: B:167:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:173:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:175:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:177:0x0300  */
    /* JADX WARN: Code duplicated, block: B:178:0x0303  */
    /* JADX WARN: Code duplicated, block: B:184:0x0314  */
    /* JADX WARN: Code duplicated, block: B:186:0x031c  */
    /* JADX WARN: Code duplicated, block: B:187:0x031f  */
    /* JADX WARN: Code duplicated, block: B:193:0x0331  */
    /* JADX WARN: Code duplicated, block: B:196:0x0337  */
    /* JADX WARN: Code duplicated, block: B:197:0x0338  */
    /* JADX WARN: Code duplicated, block: B:199:0x033e  */
    /* JADX WARN: Code duplicated, block: B:202:0x034f A[Catch: Exception -> 0x0352, PHI: r0
  0x034f: PHI (r0v9 android.view.View) = (r0v5 android.view.View), (r0v6 android.view.View), (r0v10 android.view.View) binds: [B:197:0x0338, B:195:0x0335, B:201:0x034d] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {Exception -> 0x0352, blocks: (B:194:0x0333, B:200:0x0340, B:202:0x034f), top: B:228:0x0333 }] */
    /* JADX WARN: Code duplicated, block: B:204:0x0354  */
    /* JADX WARN: Code duplicated, block: B:206:0x035a  */
    /* JADX WARN: Code duplicated, block: B:207:0x035d  */
    /* JADX WARN: Code duplicated, block: B:210:0x0365  */
    /* JADX WARN: Code duplicated, block: B:213:0x036b  */
    /* JADX WARN: Code duplicated, block: B:216:0x0384  */
    /* JADX WARN: Code duplicated, block: B:218:0x038c  */
    /* JADX WARN: Code duplicated, block: B:219:0x038f  */
    /* JADX WARN: Code duplicated, block: B:226:0x0328 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00fc  */
    @Override // com.bytedance.sdk.openadsdk.core.lnr.ud, com.bytedance.sdk.openadsdk.core.lnr.lnr
    public void qdl(View view, float f, float f2, float f3, float f4, SparseArray<lnr.qdl> sparseArray, boolean z2) {
        String str;
        com.bytedance.sdk.openadsdk.core.fs.mml mmlVarQdl;
        boolean z3;
        JSONObject jSONObject;
        int i2;
        JSONObject jSONObject2;
        int i3;
        View view2;
        Activity activityQdl;
        Context context;
        boolean z4;
        int i4;
        String strOd;
        int i5;
        if (!qdl(view, 2, f, f2, f3, f4, sparseArray, z2)) {
            ljh ljhVar = ((ud) this).mo;
            ljhVar.fs(true);
            ljhVar.cor();
            if (!ljhVar.jtx()) {
                ljhVar.lnr(true);
            }
            if (ljh.mzz(ljhVar)) {
                com.bytedance.sdk.openadsdk.mml.lnr.ud(ljhVar, ((ud) this).wd, ljhVar.wb());
            }
            if (this.exu != null) {
                if (this.jtx == null) {
                    this.jtx = new HashMap();
                }
                this.jtx.put("duration", Long.valueOf(this.exu.mo()));
            }
            int iPw = ljhVar.pw();
            ljhVar.om(0);
            com.bytedance.sdk.openadsdk.exc.qdl.qdl.mo moVar = this.bjy;
            if (moVar != null) {
                moVar.qdl(iPw > 0 ? iPw : 0);
            }
            Map<String, Object> map = this.jtx;
            if (map != null) {
                map.remove("dsp_click_type");
                this.jtx.remove("click_probability_jump");
                this.jtx.remove("auto_click");
            }
            boolean zUj = ljhVar.uj();
            if (iPw > 0) {
                if (this.jtx == null) {
                    this.jtx = new HashMap();
                }
                if (zUj && iPw < 11) {
                    this.jtx.put("dsp_click_type", Integer.valueOf(iPw));
                }
                if (iPw >= 11 && ljhVar.ikv() == 0) {
                    this.jtx.put("click_probability_jump", Integer.valueOf(tvp.qdl(iPw)));
                }
            }
            com.bytedance.sdk.openadsdk.core.model.mml mmlVarZm = ljhVar.zm();
            if (zUj || mmlVarZm != null) {
                WeakReference<InterfaceC0118qdl> weakReference = this.hkc;
                long videoProgress = (weakReference == null || weakReference.get() == null) ? 0L : this.hkc.get().getVideoProgress();
                if (!zUj && mmlVarZm != null && (mmlVarQdl = mmlVarZm.qdl()) != null) {
                    mmlVarQdl.wd(videoProgress);
                }
                if (zUj) {
                    if (view != null) {
                        Object tag = view.getTag(570425345);
                        if (tag instanceof String) {
                            str = (String) tag;
                        } else {
                            str = "VAST_ACTION_BUTTON";
                        }
                    } else {
                        str = "VAST_ACTION_BUTTON";
                    }
                    com.bytedance.sdk.openadsdk.core.fs.qdl qdlVarAoy = ljhVar.aoy();
                    if (qdlVarAoy != null) {
                        qdlVarAoy.mzz(str);
                        if (!TextUtils.isEmpty(str)) {
                            qdl(str);
                        }
                        if ("VAST_ICON".equals(str)) {
                            com.bytedance.sdk.openadsdk.core.fs.ud udVarUd = qdlVarAoy.ud();
                            if (udVarUd != null) {
                                udVarUd.qdl(videoProgress);
                            }
                        } else if ("VAST_END_CARD".equals(str)) {
                            com.bytedance.sdk.openadsdk.core.fs.lnr lnrVarLnr = qdlVarAoy.lnr();
                            if (lnrVarLnr != null) {
                                lnrVarLnr.qdl(videoProgress);
                            }
                        } else {
                            com.bytedance.sdk.openadsdk.core.fs.mml mmlVarQdl2 = qdlVarAoy.qdl();
                            if (mmlVarQdl2 != null) {
                                mmlVarQdl2.wd(videoProgress);
                            }
                        }
                    }
                }
            }
            if (tvp() && lnr(view) && !this.lnr) {
                super.qdl(view, f, f2, f3, f4, sparseArray, z2);
                return;
            }
            if (this.mml == null) {
                this.mml = yt.qdl();
            }
            if (this.mml != null && qdl(view, z2)) {
                JSONObject jSONObjectQdl = aaj.qdl(view);
                com.bytedance.sdk.openadsdk.core.model.jtx jtxVar = this.mzz;
                if (jtxVar != null) {
                    int i6 = jtxVar.jpc;
                    JSONObject jSONObject3 = jtxVar.tvp;
                    JSONObject jSONObject4 = jtxVar.exu;
                    i2 = i6;
                    z3 = jtxVar.rdp;
                    jSONObject = jSONObject3;
                    jSONObject2 = jSONObject4;
                } else {
                    z3 = false;
                    jSONObject = jSONObjectQdl;
                    i2 = -1;
                    jSONObject2 = null;
                }
                long j = this.bch;
                long j2 = this.uw;
                WeakReference<View> weakReference2 = this.tvp;
                fs fsVarQdl = qdl(f, f2, f3, f4, sparseArray, j, j2, weakReference2 == null ? mml() : weakReference2.get(), mzz(), ax.jpc(this.mml), ax.to(this.mml), ax.tvp(this.mml), i2, jSONObject, jSONObject2);
                this.to = fsVarQdl;
                if (z3) {
                    com.bytedance.sdk.openadsdk.mml.lnr.qdl("click", ljhVar, fsVarQdl, ((ud) this).wd, true, this.jtx, z2 ? 1 : 2);
                    return;
                }
                int iYgv = ljhVar.ygv();
                if (iYgv == 2 || iYgv == 3) {
                    if (iYgv == 3) {
                        strOd = ljhVar.od();
                        if (!TextUtils.isEmpty(strOd) && strOd.contains("play.google.com/store")) {
                            if (com.bytedance.sdk.openadsdk.exc.qdl.qdl.mml.qdl(this.mml, strOd, strOd.substring(strOd.indexOf("?id=") + 4), ((ud) this).wd, ljhVar)) {
                                if (this.qdl) {
                                    fs fsVar = this.to;
                                    String str2 = ((ud) this).wd;
                                    Map<String, Object> map2 = this.jtx;
                                    if (z2) {
                                        i5 = 1;
                                    } else {
                                        i5 = 2;
                                    }
                                    com.bytedance.sdk.openadsdk.mml.lnr.qdl("click", ljhVar, fsVar, str2, true, map2, i5);
                                }
                                view2 = view;
                            }
                        }
                    }
                    if (this.fs == null || this.ud) {
                        fs fsVar2 = this.to;
                        String str3 = ((ud) this).wd;
                        Map<String, Object> map3 = this.jtx;
                        if (z2) {
                            i3 = 1;
                        } else {
                            i3 = 2;
                        }
                        com.bytedance.sdk.openadsdk.mml.lnr.qdl("click_button", ljhVar, fsVar2, str3, true, map3, i3);
                    }
                    if (view != null) {
                        try {
                            if (view.getId() != 520093726) {
                                view2 = view;
                                try {
                                    if (!(view2 instanceof com.bytedance.sdk.openadsdk.core.exu.ud.mo)) {
                                    }
                                } catch (Exception unused) {
                                }
                                activityQdl = view2 != null ? com.bytedance.sdk.component.utils.ud.qdl(view2) : null;
                                if (activityQdl == null) {
                                    context = this.mml;
                                } else {
                                    context = activityQdl;
                                }
                                if (com.bytedance.sdk.openadsdk.core.model.aaj.lnr(ljhVar) || !this.hzv) {
                                    boolean zQdl = fco.qdl(context, ljhVar, this.jpc, this.fs, this.yt, ((ud) this).wd, this.bjy, true, iPw);
                                    fco.qdl(false);
                                    z4 = zQdl;
                                } else {
                                    z4 = false;
                                }
                                if (this.qdl) {
                                    fs fsVar3 = this.to;
                                    String str4 = ((ud) this).wd;
                                    Map<String, Object> map4 = this.jtx;
                                    if (z2) {
                                        i4 = 1;
                                    } else {
                                        i4 = 2;
                                    }
                                    com.bytedance.sdk.openadsdk.mml.lnr.qdl("click", ljhVar, fsVar3, str4, z4, map4, i4);
                                }
                            } else {
                                view2 = view;
                            }
                            fco.qdl(true);
                        } catch (Exception unused2) {
                            view2 = view;
                        }
                        if (view2 != null) {
                        }
                        if (activityQdl == null) {
                            context = this.mml;
                        } else {
                            context = activityQdl;
                        }
                        if (com.bytedance.sdk.openadsdk.core.model.aaj.lnr(ljhVar)) {
                            boolean zQdl2 = fco.qdl(context, ljhVar, this.jpc, this.fs, this.yt, ((ud) this).wd, this.bjy, true, iPw);
                            fco.qdl(false);
                            z4 = zQdl2;
                        } else {
                            boolean zQdl3 = fco.qdl(context, ljhVar, this.jpc, this.fs, this.yt, ((ud) this).wd, this.bjy, true, iPw);
                            fco.qdl(false);
                            z4 = zQdl3;
                        }
                        if (this.qdl) {
                            fs fsVar4 = this.to;
                            String str5 = ((ud) this).wd;
                            Map<String, Object> map5 = this.jtx;
                            if (z2) {
                                i4 = 1;
                            } else {
                                i4 = 2;
                            }
                            com.bytedance.sdk.openadsdk.mml.lnr.qdl("click", ljhVar, fsVar4, str5, z4, map5, i4);
                        }
                    } else {
                        view2 = view;
                    }
                    if (((Boolean) view2.getTag(520093762)).booleanValue()) {
                        fco.qdl(true);
                    }
                    if (view2 != null) {
                    }
                    if (activityQdl == null) {
                        context = this.mml;
                    } else {
                        context = activityQdl;
                    }
                    if (com.bytedance.sdk.openadsdk.core.model.aaj.lnr(ljhVar)) {
                        boolean zQdl4 = fco.qdl(context, ljhVar, this.jpc, this.fs, this.yt, ((ud) this).wd, this.bjy, true, iPw);
                        fco.qdl(false);
                        z4 = zQdl4;
                    } else {
                        boolean zQdl5 = fco.qdl(context, ljhVar, this.jpc, this.fs, this.yt, ((ud) this).wd, this.bjy, true, iPw);
                        fco.qdl(false);
                        z4 = zQdl5;
                    }
                    if (this.qdl) {
                        fs fsVar5 = this.to;
                        String str6 = ((ud) this).wd;
                        Map<String, Object> map6 = this.jtx;
                        if (z2) {
                            i4 = 1;
                        } else {
                            i4 = 2;
                        }
                        com.bytedance.sdk.openadsdk.mml.lnr.qdl("click", ljhVar, fsVar5, str6, z4, map6, i4);
                    }
                } else {
                    if (iYgv != 4) {
                        if (iYgv == 5) {
                            String strUd = ud(((ud) this).wd);
                            if (!TextUtils.isEmpty(strUd)) {
                                com.bytedance.sdk.openadsdk.mml.lnr.qdl("click_call", ljhVar, this.to, strUd, true, this.jtx, z2 ? 1 : 2);
                            }
                            com.bytedance.sdk.openadsdk.mml.lnr.qdl("click", ljhVar, this.to, ((ud) this).wd, gy.ud(view.getContext(), ljhVar.nts()), this.jtx, z2 ? 1 : 2);
                        } else if (iYgv != 8) {
                            view2 = view;
                            iYgv = -1;
                        } else {
                            if (iYgv == 3) {
                                strOd = ljhVar.od();
                                if (!TextUtils.isEmpty(strOd)) {
                                    if (com.bytedance.sdk.openadsdk.exc.qdl.qdl.mml.qdl(this.mml, strOd, strOd.substring(strOd.indexOf("?id=") + 4), ((ud) this).wd, ljhVar)) {
                                        if (this.qdl) {
                                            fs fsVar6 = this.to;
                                            String str7 = ((ud) this).wd;
                                            Map<String, Object> map7 = this.jtx;
                                            if (z2) {
                                                i5 = 1;
                                            } else {
                                                i5 = 2;
                                            }
                                            com.bytedance.sdk.openadsdk.mml.lnr.qdl("click", ljhVar, fsVar6, str7, true, map7, i5);
                                        }
                                    }
                                }
                            }
                            if (this.fs == null) {
                                fs fsVar7 = this.to;
                                String str8 = ((ud) this).wd;
                                Map<String, Object> map8 = this.jtx;
                                if (z2) {
                                    i3 = 1;
                                } else {
                                    i3 = 2;
                                }
                                com.bytedance.sdk.openadsdk.mml.lnr.qdl("click_button", ljhVar, fsVar7, str8, true, map8, i3);
                            } else {
                                fs fsVar8 = this.to;
                                String str9 = ((ud) this).wd;
                                Map<String, Object> map9 = this.jtx;
                                if (z2) {
                                    i3 = 1;
                                } else {
                                    i3 = 2;
                                }
                                com.bytedance.sdk.openadsdk.mml.lnr.qdl("click_button", ljhVar, fsVar8, str9, true, map9, i3);
                            }
                            if (view != null) {
                                if (view.getId() != 520093726) {
                                    view2 = view;
                                    if (!(view2 instanceof com.bytedance.sdk.openadsdk.core.exu.ud.mo)) {
                                    }
                                    if (view2 != null) {
                                    }
                                    if (activityQdl == null) {
                                        context = this.mml;
                                    } else {
                                        context = activityQdl;
                                    }
                                    if (com.bytedance.sdk.openadsdk.core.model.aaj.lnr(ljhVar)) {
                                        boolean zQdl6 = fco.qdl(context, ljhVar, this.jpc, this.fs, this.yt, ((ud) this).wd, this.bjy, true, iPw);
                                        fco.qdl(false);
                                        z4 = zQdl6;
                                    } else {
                                        boolean zQdl7 = fco.qdl(context, ljhVar, this.jpc, this.fs, this.yt, ((ud) this).wd, this.bjy, true, iPw);
                                        fco.qdl(false);
                                        z4 = zQdl7;
                                    }
                                    if (this.qdl) {
                                        fs fsVar9 = this.to;
                                        String str10 = ((ud) this).wd;
                                        Map<String, Object> map10 = this.jtx;
                                        if (z2) {
                                            i4 = 1;
                                        } else {
                                            i4 = 2;
                                        }
                                        com.bytedance.sdk.openadsdk.mml.lnr.qdl("click", ljhVar, fsVar9, str10, z4, map10, i4);
                                    }
                                } else {
                                    view2 = view;
                                }
                                fco.qdl(true);
                                if (view2 != null) {
                                }
                                if (activityQdl == null) {
                                    context = this.mml;
                                } else {
                                    context = activityQdl;
                                }
                                if (com.bytedance.sdk.openadsdk.core.model.aaj.lnr(ljhVar)) {
                                    boolean zQdl8 = fco.qdl(context, ljhVar, this.jpc, this.fs, this.yt, ((ud) this).wd, this.bjy, true, iPw);
                                    fco.qdl(false);
                                    z4 = zQdl8;
                                } else {
                                    boolean zQdl9 = fco.qdl(context, ljhVar, this.jpc, this.fs, this.yt, ((ud) this).wd, this.bjy, true, iPw);
                                    fco.qdl(false);
                                    z4 = zQdl9;
                                }
                                if (this.qdl) {
                                    fs fsVar10 = this.to;
                                    String str11 = ((ud) this).wd;
                                    Map<String, Object> map11 = this.jtx;
                                    if (z2) {
                                        i4 = 1;
                                    } else {
                                        i4 = 2;
                                    }
                                    com.bytedance.sdk.openadsdk.mml.lnr.qdl("click", ljhVar, fsVar10, str11, z4, map11, i4);
                                }
                            } else {
                                view2 = view;
                            }
                            if (((Boolean) view2.getTag(520093762)).booleanValue()) {
                                fco.qdl(true);
                            }
                            if (view2 != null) {
                            }
                            if (activityQdl == null) {
                                context = this.mml;
                            } else {
                                context = activityQdl;
                            }
                            if (com.bytedance.sdk.openadsdk.core.model.aaj.lnr(ljhVar)) {
                                boolean zQdl10 = fco.qdl(context, ljhVar, this.jpc, this.fs, this.yt, ((ud) this).wd, this.bjy, true, iPw);
                                fco.qdl(false);
                                z4 = zQdl10;
                            } else {
                                boolean zQdl11 = fco.qdl(context, ljhVar, this.jpc, this.fs, this.yt, ((ud) this).wd, this.bjy, true, iPw);
                                fco.qdl(false);
                                z4 = zQdl11;
                            }
                            if (this.qdl) {
                                fs fsVar11 = this.to;
                                String str12 = ((ud) this).wd;
                                Map<String, Object> map12 = this.jtx;
                                if (z2) {
                                    i4 = 1;
                                } else {
                                    i4 = 2;
                                }
                                com.bytedance.sdk.openadsdk.mml.lnr.qdl("click", ljhVar, fsVar11, str12, z4, map12, i4);
                            }
                        }
                    } else if (!vu.ud(ljhVar) || (this.fs == null && this.yt == null)) {
                        com.bytedance.sdk.openadsdk.exc.qdl.qdl.mo moVar2 = this.bjy;
                        if (moVar2 != null) {
                            moVar2.lnr(ljhVar);
                            Map<String, Object> map13 = this.jtx;
                            if (ljhVar.jtx() && !ljhVar.bjy()) {
                                map13.put("auto_click", Boolean.TRUE);
                                ljhVar.mml(false);
                            }
                            if (this.qdl) {
                                com.bytedance.sdk.openadsdk.mml.lnr.qdl("click", ljhVar, this.to, ((ud) this).wd, true, map13, z2 ? 1 : 2);
                            }
                        }
                    } else {
                        activityQdl = view != null ? com.bytedance.sdk.component.utils.ud.qdl(view) : null;
                        boolean zQdl12 = fco.qdl(activityQdl == null ? this.mml : activityQdl, ljhVar, this.jpc, this.fs, this.yt, ((ud) this).wd, this.bjy, true, iPw);
                        if (this.qdl) {
                            com.bytedance.sdk.openadsdk.mml.lnr.qdl("click", ljhVar, this.to, ((ud) this).wd, zQdl12, this.jtx, z2 ? 1 : 2);
                        }
                    }
                    view2 = view;
                }
                ud.qdl qdlVar = this.rq;
                if (qdlVar != null) {
                    qdlVar.qdl(view2, iYgv);
                }
            }
        }
    }

    public void ud(boolean z2) {
        this.ud = z2;
    }

    private String ud(String str) {
        str.getClass();
        switch (str) {
            case "banner_ad":
                return "banner_call";
            case "open_ad":
                return "open_ad";
            case "embeded_ad":
                return "feed_call";
            case "interaction":
                return "interaction_call";
            case "slide_banner_ad":
                return "banner_call";
            default:
                return "";
        }
    }

    public void lnr(boolean z2) {
        this.lnr = z2;
    }

    public boolean qdl() {
        ljh ljhVar = ((ud) this).mo;
        if (ljhVar == null) {
            return true;
        }
        int iUd = yt.mml().ud(ljhVar.fz());
        int iLnr = jl.lnr(yt.qdl());
        if (iUd == 1) {
            return gy.mml(iLnr);
        }
        if (iUd == 2) {
            return gy.mzz(iLnr) || gy.mml(iLnr) || gy.mo(iLnr);
        }
        if (iUd != 3) {
            return iUd != 5 || gy.mml(iLnr) || gy.mo(iLnr);
        }
        return false;
    }

    public void qdl(InterfaceC0118qdl interfaceC0118qdl) {
        this.hkc = new WeakReference<>(interfaceC0118qdl);
    }
}
