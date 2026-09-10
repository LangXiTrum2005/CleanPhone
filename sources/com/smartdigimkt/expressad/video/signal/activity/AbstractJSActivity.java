package com.smartdigimkt.expressad.video.signal.activity;

import android.content.res.Configuration;
import com.smartdigimkt.expressad.activity.ATBaseActivity;
import com.smartdigimkt.expressad.video.signal.factory.IJSFactory;
import com.smartdigimkt.x2.b;
import com.smartdigimkt.x2.c;
import com.smartdigimkt.x2.e;
import com.smartdigimkt.x2.g;
import com.smartdigimkt.x2.i;
import com.smartdigimkt.x2.j;
import com.smartdigimkt.y2.a;

/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractJSActivity extends ATBaseActivity implements IJSFactory {
    protected static final String g0 = "AbstractJSActivity";
    protected IJSFactory f0 = new a();

    public void a(IJSFactory iJSFactory) {
        this.f0 = iJSFactory;
    }

    public boolean f() {
        return false;
    }

    @Override // com.smartdigimkt.expressad.video.signal.factory.IJSFactory
    public com.smartdigimkt.x2.a getActivityProxy() {
        return this.f0.getActivityProxy();
    }

    @Override // com.smartdigimkt.expressad.video.signal.factory.IJSFactory
    public i getIJSRewardVideoV1() {
        return this.f0.getIJSRewardVideoV1();
    }

    @Override // com.smartdigimkt.expressad.video.signal.factory.IJSFactory
    public b getJSBTModule() {
        return this.f0.getJSBTModule();
    }

    @Override // com.smartdigimkt.expressad.video.signal.factory.IJSFactory
    public c getJSCommon() {
        return this.f0.getJSCommon();
    }

    @Override // com.smartdigimkt.expressad.video.signal.factory.IJSFactory
    public e getJSContainerModule() {
        return this.f0.getJSContainerModule();
    }

    @Override // com.smartdigimkt.expressad.video.signal.factory.IJSFactory
    public g getJSNotifyProxy() {
        return this.f0.getJSNotifyProxy();
    }

    @Override // com.smartdigimkt.expressad.video.signal.factory.IJSFactory
    public j getJSVideoModule() {
        return this.f0.getJSVideoModule();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (!getJSCommon().b()) {
            if (f()) {
                super.onBackPressed();
            }
        } else if (getJSContainerModule() == null || !getJSContainerModule().miniCardShowing()) {
            getActivityProxy().e();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (getJSCommon().b()) {
            getActivityProxy().a(configuration);
        }
    }

    @Override // com.smartdigimkt.expressad.activity.ATBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        if (getJSCommon().b()) {
            getActivityProxy().g();
        }
        getActivityProxy().a(1);
    }

    @Override // com.smartdigimkt.expressad.activity.ATBaseActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (com.smartdigimkt.z.b.f) {
            return;
        }
        if (getJSCommon().b()) {
            getActivityProxy().d();
        }
        getActivityProxy().a(0);
    }
}
