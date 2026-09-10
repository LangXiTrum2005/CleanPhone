package com.thinkup.network.ironsource;

import com.p004ironsource.mediationsdk.config.VersionInfo;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes6.dex */
public class IronsourceTUConst {
    public static final int NETWORK_FIRM_ID = 11;
    private static String o;

    public static class DEBUGGER_CONFIG {
        public static final int Ironsource_NETWORK = 11;
    }

    public static String getNetworkVersion() {
        String str = o;
        if (str != null) {
            return str;
        }
        try {
            Field field = VersionInfo.class.getField("VERSION");
            field.setAccessible(true);
            Object obj = field.get(VersionInfo.class);
            if (obj != null) {
                String string = obj.toString();
                o = string;
                return string;
            }
        } catch (Throwable unused) {
        }
        o = "";
        return "";
    }
}
