package com.mbridge.msdk.setting;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class m extends c {
    public static m N() {
        return new m();
    }

    public static m h(String str) {
        m mVar = new m();
        try {
            mVar.e(str);
            mVar.r(1);
            mVar.x(1);
            mVar.z(5);
            mVar.b(1);
            mVar.c(1);
            return mVar;
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("UnitSetting", e10.getMessage());
            }
            return mVar;
        }
    }

    public static m i(String str) {
        m mVar = new m();
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(8);
        arrayList2.add(8);
        mVar.r(1);
        mVar.e(str);
        mVar.a(arrayList);
        mVar.b(arrayList2);
        mVar.x(1);
        mVar.b(-2);
        mVar.c(-2);
        mVar.z(5);
        mVar.d(3600L);
        mVar.k(2);
        mVar.d(1);
        mVar.u(100);
        mVar.g(0);
        mVar.i(1);
        mVar.m(0);
        mVar.v(60);
        mVar.p(10);
        mVar.q(60);
        return mVar;
    }

    public static m j(String str) {
        m mVar = new m();
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(1);
            mVar.a(arrayList);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(30);
            mVar.b(arrayList2);
            mVar.e(str);
            mVar.r(1);
            mVar.x(1);
            mVar.b(-2);
            mVar.c(-2);
            mVar.z(5);
            mVar.d(3600L);
            mVar.k(2);
            mVar.d(3);
            return mVar;
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("UnitSetting", e10.getMessage());
            }
            return mVar;
        }
    }

    public static m k(String str) {
        m mVarN = N();
        mVarN.d(0);
        return mVarN;
    }

    public static m l(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return c.a(new JSONObject(str));
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("UnitSetting", "parseSetting", e10);
            }
            return null;
        }
    }
}
