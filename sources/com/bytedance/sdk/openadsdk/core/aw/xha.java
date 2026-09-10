package com.bytedance.sdk.openadsdk.core.aw;

import android.util.Pair;
import android.view.View;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.bytedance2.adsession.media.Position;
import com.iab.omid.library.bytedance2.adsession.media.VastProperties;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class xha {
    private final AdEvents di;
    private final AdSession fi;
    protected String ik;
    protected VastProperties ka;
    private boolean xha = false;
    protected boolean ri = false;
    protected int lr = 0;

    public xha(AdSession adSession, AdEvents adEvents, View view) {
        this.fi = adSession;
        this.di = adEvents;
        this.ik = adSession.getAdSessionId();
        ri(view);
    }

    public void ik() {
        ri(4);
    }

    public void ka() {
        ri(3);
    }

    public void lr(int i) {
    }

    public void ri(float f, boolean z) {
    }

    public void lr() {
        ri(1);
    }

    public void ri(boolean z) {
    }

    public void ri(boolean z, float f) {
    }

    public void ri(View view) {
        AdSession adSession;
        if (view == null || (adSession = this.fi) == null) {
            return;
        }
        adSession.registerAdView(view);
    }

    public void ri(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        AdSession adSession = this.fi;
        if (adSession != null) {
            adSession.addFriendlyObstruction(view, friendlyObstructionPurpose, null);
        }
    }

    public boolean ri() {
        return this.ri;
    }

    public void ri(int i) {
        int i2;
        if (this.fi == null || this.di == null || !fi.ik()) {
            return;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 || (i2 = this.lr) == 0 || i2 == 4) {
                        return;
                    }
                    this.fi.finish();
                    this.ri = false;
                } else {
                    if (this.xha) {
                        return;
                    }
                    int i3 = this.lr;
                    if (i3 != 1 && i3 != 2) {
                        return;
                    }
                    this.di.impressionOccurred();
                    this.xha = true;
                }
            } else {
                if (this.lr != 0) {
                    return;
                }
                this.fi.start();
                if (this.ka == null) {
                    this.ka = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
                }
                this.di.loaded(this.ka);
                this.ri = true;
                this.ka = null;
            }
        } else {
            if (this.lr != 0) {
                return;
            }
            this.fi.start();
            this.di.loaded();
            this.ri = true;
        }
        this.lr = i;
    }

    public void ri(Set<Pair<View, FriendlyObstructionPurpose>> set) {
        for (Pair<View, FriendlyObstructionPurpose> pair : set) {
            ri((View) pair.first, (FriendlyObstructionPurpose) pair.second);
        }
    }
}
