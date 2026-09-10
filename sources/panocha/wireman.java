package panocha;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.blankj.utilcode.util.adultoid;
import com.inmobi.media.core.config.models.CrashConfig;
import com.yolo.networklibrary.common.model.HttpInstallInfoBean;
import com.yolo.networklibrary.common.model.HttpUserInfo;
import com.yolo.networklibrary.common.util.formularize;
import com.yolo.networklibrary.common.util.impassible;
import com.yolo.networklibrary.common.util.impromptu;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import okhttp3.graveside;

/* JADX INFO: compiled from: RequestManager.java */
/* JADX INFO: loaded from: classes3.dex */
public class wireman {

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static wireman f35065wireman;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public String f35066attabal = "RequestManager";

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public ambitiousness.attabal f35067dern = null;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public Context f35068saneness;

    public wireman(Context context) {
        this.f35068saneness = context.getApplicationContext();
        beachfront();
    }

    public static /* synthetic */ void attabal(wireman wiremanVar, String str, pancuronium.attabal attabalVar, attabal attabalVar2, Class cls) {
        if (!impromptu.marial(wiremanVar.f35068saneness)) {
            wiremanVar.competently(str, attabalVar, -17);
            return;
        }
        graveside gravesideVarImpassible = graveside.impassible(str);
        if (gravesideVarImpassible == null) {
            return;
        }
        graveside.attabal attabalVarApical = gravesideVarImpassible.apical();
        HashMap map = new HashMap();
        attabalVar2.wireman(com.yolo.networklibrary.common.util.dern.monoploid(wiremanVar.f35068saneness));
        HttpInstallInfoBean httpInstallInfoBeanWireman = wiremanVar.wireman();
        if (TextUtils.isEmpty(httpInstallInfoBeanWireman.impromptu())) {
            attabalVar2.trm(com.yolo.networklibrary.common.util.wireman.INSTANCE.attabal());
        } else {
            attabalVar2.saneness(httpInstallInfoBeanWireman.attabal());
            attabalVar2.triweekly(httpInstallInfoBeanWireman.saneness());
            attabalVar2.trm(httpInstallInfoBeanWireman.impromptu());
            attabalVar2.adultoid(httpInstallInfoBeanWireman.dern());
            attabalVar2.cuirassed(httpInstallInfoBeanWireman.competently());
            attabalVar2.gintrap(httpInstallInfoBeanWireman.wireman());
            attabalVar2.rotuma(httpInstallInfoBeanWireman.marial());
            attabalVar2.preprohormone(httpInstallInfoBeanWireman.beachfront());
        }
        attabalVar2.competently(com.yolo.networklibrary.common.util.dern.beachfront(wiremanVar.f35068saneness));
        attabalVar2.beachfront(com.yolo.networklibrary.common.util.dern.wireman(wiremanVar.f35068saneness));
        attabalVar2.apical(com.yolo.networklibrary.common.util.dern.taiyuan(wiremanVar.f35068saneness));
        attabalVar2.formularize(com.yolo.networklibrary.common.util.dern.cutely(wiremanVar.f35068saneness));
        attabalVar2.cutely(com.yolo.networklibrary.common.util.dern.formularize(wiremanVar.f35068saneness));
        attabalVar2.dern(com.blankj.utilcode.util.wireman.saneness());
        attabalVar2.molybdenite(com.yolo.networklibrary.common.util.dern.arytenoidectomy());
        attabalVar2.monoploid(com.blankj.utilcode.util.wireman.attabal());
        attabalVar2.impromptu(com.yolo.networklibrary.common.util.dern.molybdenite(wiremanVar.f35068saneness));
        attabalVar2.taiyuan(impromptu.beachfront());
        attabalVar2.kowloon(formularize.attabal());
        attabalVar2.arytenoidectomy(formularize.saneness());
        attabalVar2.impassible(formularize.dern());
        HttpUserInfo httpUserInfoAttabal = com.yolo.networklibrary.common.util.attabal.INSTANCE.attabal();
        if (httpUserInfoAttabal != null) {
            attabalVar2.graveside(httpUserInfoAttabal.saneness());
            attabalVar2.polloi(httpUserInfoAttabal.attabal());
        }
        String strTaiyuan = com.blankj.utilcode.util.impromptu.taiyuan(attabalVar2);
        petrol.attabal attabalVar3 = petrol.attabal.f35179attabal;
        String strTriweekly = attabalVar3.triweekly();
        map.put(hued.attabal.f28025saneness, strTriweekly);
        String strEncodeToString = Base64.encodeToString(attabalVar3.cutely(adultoid.attabal(), strTriweekly, strTaiyuan), 0);
        String strAttabal = regie.attabal.attabal(strEncodeToString, hued.saneness.attabal());
        if (!TextUtils.isEmpty(strAttabal)) {
            map.put(hued.attabal.f28017attabal, strAttabal);
        }
        map.put(hued.attabal.f28021dern, revolt.attabal.f36720attabal.dern().getHeaderXToken());
        try {
            beachfront.beachfront(wiremanVar.f35068saneness, str, wiremanVar.f35067dern.attabal(attabalVarApical.dern().getUrl(), map, strEncodeToString).execute(), cls, attabalVar);
        } catch (IOException e) {
            e.printStackTrace();
            if (e.getClass().equals(SocketTimeoutException.class)) {
                wiremanVar.competently(str, attabalVar, -18);
            } else {
                wiremanVar.competently(str, attabalVar, -11);
            }
        }
    }

    public static synchronized wireman marial() {
        try {
            if (f35065wireman == null) {
                f35065wireman = new wireman(revolt.attabal.mContext);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f35065wireman;
    }

    public static /* synthetic */ void saneness(wireman wiremanVar, String str, pancuronium.attabal attabalVar, attabal attabalVar2, Class cls) {
        if (!impromptu.marial(wiremanVar.f35068saneness)) {
            wiremanVar.competently(str, attabalVar, -17);
            return;
        }
        graveside.attabal attabalVarApical = graveside.impassible(str).apical();
        HashMap map = new HashMap();
        attabalVar2.wireman(com.yolo.networklibrary.common.util.dern.monoploid(wiremanVar.f35068saneness));
        if (attabalVar2.attabal() == null || attabalVar2.attabal().isEmpty()) {
            HttpInstallInfoBean httpInstallInfoBeanWireman = wiremanVar.wireman();
            if (TextUtils.isEmpty(httpInstallInfoBeanWireman.impromptu())) {
                attabalVar2.trm(com.yolo.networklibrary.common.util.wireman.INSTANCE.attabal());
            } else {
                attabalVar2.saneness(httpInstallInfoBeanWireman.attabal());
                attabalVar2.triweekly(httpInstallInfoBeanWireman.saneness());
                attabalVar2.trm(httpInstallInfoBeanWireman.impromptu());
                attabalVar2.adultoid(httpInstallInfoBeanWireman.dern());
                attabalVar2.cuirassed(httpInstallInfoBeanWireman.competently());
                attabalVar2.gintrap(httpInstallInfoBeanWireman.wireman());
                attabalVar2.rotuma(httpInstallInfoBeanWireman.marial());
                attabalVar2.preprohormone(httpInstallInfoBeanWireman.beachfront());
            }
        }
        attabalVar2.competently(com.yolo.networklibrary.common.util.dern.beachfront(wiremanVar.f35068saneness));
        attabalVar2.beachfront(com.yolo.networklibrary.common.util.dern.wireman(wiremanVar.f35068saneness));
        attabalVar2.apical(com.yolo.networklibrary.common.util.dern.taiyuan(wiremanVar.f35068saneness));
        attabalVar2.formularize(com.yolo.networklibrary.common.util.dern.cutely(wiremanVar.f35068saneness));
        attabalVar2.cutely(com.yolo.networklibrary.common.util.dern.formularize(wiremanVar.f35068saneness));
        attabalVar2.dern(com.blankj.utilcode.util.wireman.saneness());
        attabalVar2.molybdenite(com.yolo.networklibrary.common.util.dern.arytenoidectomy());
        attabalVar2.monoploid(com.blankj.utilcode.util.wireman.attabal());
        attabalVar2.impromptu(com.yolo.networklibrary.common.util.dern.molybdenite(wiremanVar.f35068saneness));
        attabalVar2.taiyuan(impromptu.beachfront());
        attabalVar2.kowloon(formularize.attabal());
        attabalVar2.arytenoidectomy(formularize.saneness());
        attabalVar2.impassible(formularize.dern());
        HttpUserInfo httpUserInfoAttabal = com.yolo.networklibrary.common.util.attabal.INSTANCE.attabal();
        if (httpUserInfoAttabal != null) {
            attabalVar2.graveside(httpUserInfoAttabal.saneness());
            attabalVar2.polloi(httpUserInfoAttabal.attabal());
        }
        String strTaiyuan = com.blankj.utilcode.util.impromptu.taiyuan(attabalVar2);
        petrol.attabal attabalVar3 = petrol.attabal.f35179attabal;
        String strTriweekly = attabalVar3.triweekly();
        map.put(hued.attabal.f28025saneness, strTriweekly);
        String strEncodeToString = Base64.encodeToString(attabalVar3.apical(adultoid.attabal(), strTriweekly, strTaiyuan), 0);
        String strAttabal = regie.attabal.attabal(strEncodeToString, hued.saneness.saneness());
        if (!TextUtils.isEmpty(strAttabal)) {
            map.put(hued.attabal.f28017attabal, strAttabal);
        }
        map.put(hued.attabal.f28021dern, revolt.attabal.f36720attabal.marial().getHeaderXToken());
        try {
            beachfront.saneness(wiremanVar.f35068saneness, str, wiremanVar.f35067dern.attabal(attabalVarApical.dern().getUrl(), map, strEncodeToString).execute(), cls, attabalVar);
        } catch (IOException e) {
            e.printStackTrace();
            if (e.getClass().equals(SocketTimeoutException.class)) {
                wiremanVar.competently(str, attabalVar, -18);
            } else {
                wiremanVar.competently(str, attabalVar, -11);
            }
        }
    }

    public final void beachfront() {
        ambitiousness.saneness sanenessVar = new ambitiousness.saneness();
        sanenessVar.f3966attabal = 20000L;
        sanenessVar.f3968saneness = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
        sanenessVar.f3967dern = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
        sanenessVar.f3969wireman = null;
        this.f35067dern = new ambitiousness.attabal(sanenessVar);
    }

    public final <TResult> void competently(String str, pancuronium.attabal<TResult> attabalVar, int i) {
        marial marialVar = new marial();
        marialVar.marial(i);
        beachfront.wireman(this.f35068saneness, str, marialVar, attabalVar);
    }

    public <TResult> void dern(final String str, final attabal attabalVar, final Class cls, final pancuronium.attabal<TResult> attabalVar2) {
        impassible.attabal().execute(new Runnable() { // from class: panocha.dern
            @Override // java.lang.Runnable
            public final void run() {
                wireman.attabal(this.f35051kowloon, str, attabalVar2, attabalVar, cls);
            }
        });
    }

    public <TResult> void impromptu(final String str, final attabal attabalVar, final Class cls, final pancuronium.attabal<TResult> attabalVar2) {
        impassible.attabal().execute(new Runnable() { // from class: panocha.saneness
            @Override // java.lang.Runnable
            public final void run() {
                wireman.saneness(this.f35061kowloon, str, attabalVar2, attabalVar, cls);
            }
        });
    }

    public HttpInstallInfoBean wireman() {
        HttpInstallInfoBean httpInstallInfoBeanSaneness = com.yolo.networklibrary.common.util.wireman.INSTANCE.saneness();
        return httpInstallInfoBeanSaneness == null ? new HttpInstallInfoBean() : httpInstallInfoBeanSaneness;
    }
}
