package com.mbridge.msdk.video.signal.impl;

import android.app.Activity;
import com.mbridge.msdk.video.bt.module.MBridgeBTContainer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class j extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Activity f38161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MBridgeBTContainer f38162c;

    public j(Activity activity, MBridgeBTContainer mBridgeBTContainer) {
        this.f38161b = activity;
        this.f38162c = mBridgeBTContainer;
    }

    @Override // com.mbridge.msdk.video.signal.impl.c, com.mbridge.msdk.video.signal.c
    public void reactDeveloper(Object obj, String str) {
        super.reactDeveloper(obj, str);
        MBridgeBTContainer mBridgeBTContainer = this.f38162c;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.reactDeveloper(obj, str);
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.c, com.mbridge.msdk.video.signal.c
    public void reportUrls(Object obj, String str) {
        super.reportUrls(obj, str);
        MBridgeBTContainer mBridgeBTContainer = this.f38162c;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.reportUrls(obj, str);
        } else {
            com.mbridge.msdk.video.bt.component.d.c().c(obj, str);
        }
    }
}
