package com.thinkup.core.common.inner.mixad.oo;

import android.support.v4.media.a;
import android.util.Log;
import com.thinkup.core.api.TUAdAppInfo;
import com.thinkup.core.common.mn.on.o0;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.on.oon;
import com.thinkup.core.common.on.ooo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class o extends ooo implements Serializable {
    final String o = "o";

    public o(o0 o0Var) {
        nm(o0Var.getIconImageUrl());
        Double starRating = o0Var.getStarRating();
        if (starRating != null) {
            mo(starRating.intValue());
        }
        o00(o0Var.getMainImageUrl());
        n0(o0Var.getTitle());
        o0m(o0Var.getCallToActionText());
        no(o0Var.getDescriptionText());
        o0o(o0Var.getAdChoiceIconUrl());
        o(o0Var.getAdLogo());
        onn(o0Var.getAdFrom());
        onm(o0Var.getWarning());
        ono(o0Var.getDomain());
        TUAdAppInfo adAppInfo = o0Var.getAdAppInfo();
        if (adAppInfo != null) {
            if (o0n.m().m0o()) {
                Log.i("o", "AdAppInfo:" + o0Var.getAdAppInfo().toString());
            }
            om0(adAppInfo.getPublisher());
            omo(adAppInfo.getAppVersion());
            omm(adAppInfo.getAppPrivacyUrl());
            omn(adAppInfo.getAppPermissonUrl());
            n(adAppInfo.getFunctionUrl());
        }
        o(new n(o0Var));
    }

    @Override // com.thinkup.core.common.on.ooo
    public final List<String> m(oon oonVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(nm());
        return arrayList;
    }

    @Override // com.thinkup.core.common.on.ooo
    public final String m0() {
        return "";
    }

    @Override // com.thinkup.core.common.on.ooo
    public final List<String> n(oon oonVar) {
        return new ArrayList();
    }

    @Override // com.thinkup.core.common.on.ooo
    public final int o() {
        return 10;
    }

    @Override // com.thinkup.core.common.on.ooo
    public final boolean onn() {
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ThirdPartyAdContent{, offerId='");
        sb.append(this.no);
        sb.append("', creativeId='");
        sb.append(this.nm);
        sb.append("', title='");
        sb.append(this.nn);
        sb.append("', desc='");
        sb.append(this.o00);
        sb.append("', iconUrl='");
        sb.append(this.o0o);
        sb.append("', mainImageUrl='");
        sb.append(this.o0m);
        sb.append("', endCardImageUrl='");
        sb.append(this.o0n);
        sb.append("', adChoiceUrl='");
        sb.append(this.oo0);
        sb.append("', ctaText='");
        sb.append(this.ooo);
        sb.append("', videoUrl='");
        sb.append(this.oom);
        sb.append("', previewUrl='");
        sb.append(this.oon);
        sb.append("', deeplinkUrl='");
        sb.append(this.om0);
        sb.append("', clickUrl='");
        sb.append(this.omo);
        sb.append("', pkgName='");
        sb.append(this.omm);
        sb.append("', unitType=");
        sb.append(this.omn);
        sb.append(", clickType=");
        sb.append(this.onm);
        sb.append(", rating=");
        sb.append(this.onn);
        sb.append(", adLogoTitle='");
        sb.append(this.m00);
        sb.append("', offerNetworkFirmId=");
        sb.append(this.m0o);
        sb.append(", jumpUrl='");
        sb.append(this.m0m);
        sb.append("', publisher='");
        sb.append(this.m0n);
        sb.append("', appVersion='");
        sb.append(this.mo0);
        sb.append("', privacyUrl='");
        sb.append(this.moo);
        sb.append("', permissionUrl='");
        sb.append(this.mom);
        sb.append("', functionUrl='");
        sb.append(this.mon);
        sb.append("', templateVersion='");
        sb.append(this.mm0);
        sb.append("', adLogo=");
        sb.append(this.mmo);
        sb.append(", baseAdSetting=");
        sb.append(this.mmm);
        sb.append(", requestId='");
        sb.append(this.mmn);
        sb.append("', webControlObject='");
        sb.append(this.mn0);
        sb.append("', protocolType=");
        sb.append(this.mno);
        sb.append(", offerHtml='");
        sb.append(this.mnm);
        sb.append("', offerUrl='");
        sb.append(this.mnn);
        sb.append("', wxUserName='");
        sb.append(this.n00);
        sb.append("', wxPath='");
        sb.append(this.n0o);
        sb.append("', offerWidth=");
        sb.append(this.n0m);
        sb.append(", offerHeight=");
        sb.append(this.n0n);
        sb.append(", mApkDownloadStatus=");
        sb.append(this.no0);
        sb.append(", mNativeMainImageWidth=");
        sb.append(this.noo);
        sb.append(", mNativeMainImageHeight=");
        sb.append(this.nom);
        sb.append(", mVideoWidth=");
        sb.append(this.non);
        sb.append(", mVideoHeight=");
        sb.append(this.nm0);
        sb.append(", mVideoDuration=");
        sb.append(this.nmo);
        sb.append(", deeplinkPackageInstallState=");
        sb.append(this.nmm);
        sb.append(", mraidJSUrl='");
        return a.r(sb, this.nn0, "'}");
    }
}
