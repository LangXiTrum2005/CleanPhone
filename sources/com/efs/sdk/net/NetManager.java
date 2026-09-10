package com.efs.sdk.net;

import android.content.Context;
import androidx.browser.trusted.sharing.ShareTarget;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.core.util.Log;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3887ke;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4750uS;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4838vS;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5021xZ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.GY;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ID;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2539Kc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2839Vr;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JD;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.MX;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.NY;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RO;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class NetManager {
    private static final String TAG = "OkHttpManager";
    private static Context mContext;
    private static NetConfigManager mNetConfigManager;
    private static EfsReporter mReporter;

    public static void get(String str, InterfaceC2539Kc interfaceC2539Kc) {
        C4750uS c4750uS = new C4750uS();
        InterfaceC2839Vr interfaceC2839Vr = OkHttpListener.get();
        AbstractC2995aW.q(interfaceC2839Vr, "eventListenerFactory");
        c4750uS.e = interfaceC2839Vr;
        c4750uS.d.add(new OkHttpInterceptor());
        C4838vS c4838vS = new C4838vS(c4750uS);
        GY gy = new GY();
        gy.g(str);
        c4838vS.b(gy.b()).d(interfaceC2539Kc);
    }

    public static NetConfigManager getNetConfigManager() {
        return mNetConfigManager;
    }

    public static EfsReporter getReporter() {
        return mReporter;
    }

    public static void init(Context context, EfsReporter efsReporter) {
        if (context == null || efsReporter == null) {
            Log.e(TAG, "init net manager error! parameter is null!");
            return;
        }
        mReporter = efsReporter;
        mNetConfigManager = new NetConfigManager(context, efsReporter);
        mContext = context;
    }

    public static void post(String str, Map<String, Object> map, InterfaceC2539Kc interfaceC2539Kc) {
        StringBuilder sb = new StringBuilder();
        for (String str2 : map.keySet()) {
            sb.append(str2);
            sb.append("=");
            sb.append(map.get(str2));
            sb.append("&");
        }
        C4750uS c4750uS = new C4750uS();
        InterfaceC2839Vr interfaceC2839Vr = OkHttpListener.get();
        AbstractC2995aW.q(interfaceC2839Vr, "eventListenerFactory");
        c4750uS.e = interfaceC2839Vr;
        c4750uS.d.add(new OkHttpInterceptor());
        C4838vS c4838vS = new C4838vS(c4750uS);
        Pattern pattern = RO.c;
        NY nyCreate = NY.create(C3887ke.u(ShareTarget.ENCODING_TYPE_URL_ENCODED), sb.toString());
        GY gy = new GY();
        gy.g(str);
        gy.f(nyCreate);
        c4838vS.b(gy.b()).d(interfaceC2539Kc);
    }

    public static void postJson(String str, String str2, InterfaceC2539Kc interfaceC2539Kc) {
        for (int i = 0; i < 100; i++) {
            C4750uS c4750uS = new C4750uS();
            InterfaceC2839Vr interfaceC2839Vr = OkHttpListener.get();
            AbstractC2995aW.q(interfaceC2839Vr, "eventListenerFactory");
            c4750uS.e = interfaceC2839Vr;
            c4750uS.d.add(new OkHttpInterceptor());
            C4838vS c4838vS = new C4838vS(c4750uS);
            Pattern pattern = RO.c;
            NY nyCreate = NY.create(str2, C3887ke.u("application/json;charset=utf-8"));
            GY gy = new GY();
            gy.g(str + i);
            gy.f(nyCreate);
            c4838vS.b(gy.b()).d(interfaceC2539Kc);
        }
    }

    public static void postJsonWithUrlUpdate(String str, final String str2, String str3, InterfaceC2539Kc interfaceC2539Kc) {
        C4750uS c4750uS = new C4750uS();
        InterfaceC2839Vr interfaceC2839Vr = OkHttpListener.get();
        AbstractC2995aW.q(interfaceC2839Vr, "eventListenerFactory");
        c4750uS.e = interfaceC2839Vr;
        c4750uS.d.add(new OkHttpInterceptor());
        c4750uS.c.add(new JD() { // from class: com.efs.sdk.net.NetManager.1
            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JD
            public final C5021xZ intercept(ID id) {
                MX mx = (MX) id;
                GY gyA = mx.e.a();
                gyA.g(str2);
                return mx.b(gyA.b());
            }
        });
        C4838vS c4838vS = new C4838vS(c4750uS);
        Pattern pattern = RO.c;
        NY nyCreate = NY.create(str3, C3887ke.u("application/json;charset=utf-8"));
        GY gy = new GY();
        gy.g(str);
        gy.f(nyCreate);
        c4838vS.b(gy.b()).d(interfaceC2539Kc);
    }
}
