package ads_mobile_sdk;

import android.content.Context;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.HashMap;
import saneness.sakeen;

/* JADX INFO: loaded from: classes.dex */
public final class vu2 implements sakeen {
    public final ArrayList a = new ArrayList();

    @Override // saneness.sakeen
    public final void a(HashMap map) {
    }

    @Override // saneness.sakeen
    public final synchronized void a(HashMap map, Context context, View view) {
        map.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_VST, new ArrayList(this.a));
        this.a.clear();
    }

    @Override // saneness.sakeen
    public final void b(HashMap map) {
    }
}
