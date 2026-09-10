package com.bytedance.sdk.openadsdk.core.sLN;

import android.util.Pair;
import android.view.View;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.bytedance2.adsession.media.Position;
import com.iab.omid.library.bytedance2.adsession.media.VastProperties;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class ebl {
    private final AdSession JXs;
    protected VastProperties ZU;
    private final AdEvents lc;
    protected String lk;
    private boolean ebl = false;
    protected boolean Lxb = false;
    protected int LD = 0;

    public ebl(AdSession adSession, AdEvents adEvents, View view) {
        this.JXs = adSession;
        this.lc = adEvents;
        this.lk = adSession.getAdSessionId();
        Lxb(view);
    }

    public void LD(int i) {
    }

    public void Lxb(float f, boolean z) {
    }

    public void ZU() {
        Lxb(3);
    }

    public void lk() {
        Lxb(4);
    }

    public void LD() {
        Lxb(1);
    }

    public void Lxb(boolean z) {
    }

    public void Lxb(boolean z, float f) {
    }

    public void Lxb(View view) {
        AdSession adSession;
        if (view == null || (adSession = this.JXs) == null) {
            return;
        }
        adSession.registerAdView(view);
    }

    public void Lxb(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        AdSession adSession = this.JXs;
        if (adSession != null) {
            adSession.addFriendlyObstruction(view, friendlyObstructionPurpose, null);
        }
    }

    public boolean Lxb() {
        return this.Lxb;
    }

    public void Lxb(int i) {
        int i2;
        if (this.JXs == null || this.lc == null || !JXs.lk()) {
            return;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 || (i2 = this.LD) == 0 || i2 == 4) {
                        return;
                    }
                    this.JXs.finish();
                    this.Lxb = false;
                } else {
                    if (this.ebl) {
                        return;
                    }
                    int i3 = this.LD;
                    if (i3 != 1 && i3 != 2) {
                        return;
                    }
                    this.lc.impressionOccurred();
                    this.ebl = true;
                }
            } else {
                if (this.LD != 0) {
                    return;
                }
                this.JXs.start();
                if (this.ZU == null) {
                    this.ZU = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
                }
                this.lc.loaded(this.ZU);
                this.Lxb = true;
                this.ZU = null;
            }
        } else {
            if (this.LD != 0) {
                return;
            }
            this.JXs.start();
            this.lc.loaded();
            this.Lxb = true;
        }
        this.LD = i;
    }

    public void Lxb(Set<Pair<View, FriendlyObstructionPurpose>> set) {
        for (Pair<View, FriendlyObstructionPurpose> pair : set) {
            Lxb((View) pair.first, (FriendlyObstructionPurpose) pair.second);
        }
    }
}
