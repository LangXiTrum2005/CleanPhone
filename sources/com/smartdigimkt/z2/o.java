package com.smartdigimkt.z2;

import android.app.Activity;
import com.smartdigimkt.expressad.video.module.AnythinkContainerView;

/* JADX INFO: loaded from: classes6.dex */
public class o extends e {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Activity f40335n;
    private AnythinkContainerView o;

    public o(Activity activity, AnythinkContainerView anythinkContainerView) {
        this.f40335n = activity;
        this.o = anythinkContainerView;
    }

    @Override // com.smartdigimkt.z2.e, com.smartdigimkt.x2.g
    public void a(int i2, String str) {
        Activity activity;
        super.a(i2, str);
        int iIntValue = 1;
        if (i2 != 1) {
            if (i2 == 2 && (activity = this.f40335n) != null) {
                activity.finish();
                return;
            }
            return;
        }
        if (this.o != null) {
            try {
                iIntValue = Integer.valueOf(str).intValue();
            } catch (Throwable th) {
                th.printStackTrace();
            }
            this.o.showVideoClickView(iIntValue);
        }
    }
}
