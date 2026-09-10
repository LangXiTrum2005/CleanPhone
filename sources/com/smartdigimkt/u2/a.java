package com.smartdigimkt.u2;

import android.app.Activity;

/* JADX INFO: loaded from: classes6.dex */
public class a extends f {
    private Activity W;
    private com.smartdigimkt.x.d X;

    public a(Activity activity, com.smartdigimkt.x.d dVar) {
        this.W = activity;
        this.X = dVar;
    }

    @Override // com.smartdigimkt.u2.f, com.smartdigimkt.t2.a
    public void a(int i2, Object obj) {
        Activity activity;
        super.a(i2, obj);
        if (i2 != 106 || (activity = this.W) == null || this.X == null) {
            return;
        }
        activity.finish();
    }
}
