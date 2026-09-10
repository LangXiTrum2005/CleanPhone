package com.smartdigimkt.z2;

import android.app.Activity;
import com.smartdigimkt.expressad.video.bt.module.AnythinkBTContainer;

/* JADX INFO: loaded from: classes6.dex */
public class i extends b {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private Activity f40328Y;
    private AnythinkBTContainer Z;

    public i(Activity activity, AnythinkBTContainer anythinkBTContainer) {
        this.f40328Y = activity;
        this.Z = anythinkBTContainer;
    }

    @Override // com.smartdigimkt.z2.b, com.smartdigimkt.x2.d
    public void click(int i2, String str) {
        super.click(i2, str);
        AnythinkBTContainer anythinkBTContainer = this.Z;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.click(i2, str);
        }
    }

    @Override // com.smartdigimkt.z2.b, com.smartdigimkt.x2.d
    public void handlerH5Exception(int i2, String str) {
        super.handlerH5Exception(i2, str);
        AnythinkBTContainer anythinkBTContainer = this.Z;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.handlerH5Exception(i2, str);
        }
    }

    @Override // com.smartdigimkt.z2.b, com.smartdigimkt.x2.b
    public void reactDeveloper(Object obj, String str) {
        super.reactDeveloper(obj, str);
        AnythinkBTContainer anythinkBTContainer = this.Z;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.reactDeveloper(obj, str);
        }
    }

    @Override // com.smartdigimkt.z2.b, com.smartdigimkt.x2.b
    public void reportUrls(Object obj, String str) {
        super.reportUrls(obj, str);
        AnythinkBTContainer anythinkBTContainer = this.Z;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.reportUrls(obj, str);
        } else {
            com.smartdigimkt.z1.c.c().c(obj, str);
        }
    }
}
