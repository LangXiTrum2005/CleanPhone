package com.mbridge.msdk.newreward.player.model;

import com.mbridge.msdk.newreward.function.command.c;
import com.mbridge.msdk.newreward.function.command.f;
import com.mbridge.msdk.newreward.player.imodel.IModel;
import com.mbridge.msdk.newreward.player.redirect.RedirectModel;
import com.mbridge.msdk.newreward.player.redirect.RedirectType;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseModel implements IModel {
    protected c commandManager;

    public BaseModel(c cVar) {
        this.commandManager = cVar;
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IModel
    public boolean eventClickUrl(RedirectModel redirectModel) {
        if (this.commandManager == null) {
            return false;
        }
        sendDirectEvent(redirectModel.setRedirectType(RedirectType.CLICK_URL));
        return true;
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IModel
    public void eventNoticeUrl(RedirectModel redirectModel, int i) {
        if (this.commandManager != null) {
            redirectModel.setRedirectType(RedirectType.NOTICE_URL);
            c cVar = this.commandManager;
            cVar.e(cVar.a("campaign_redirect", redirectModel, "click_scenario", Integer.valueOf(i)), f.CAMPAIGN_REDIRECT);
        }
    }

    public void sendDirectEvent(RedirectModel redirectModel) {
        c cVar = this.commandManager;
        cVar.e(cVar.a("campaign_redirect", redirectModel), f.CAMPAIGN_REDIRECT);
    }
}
