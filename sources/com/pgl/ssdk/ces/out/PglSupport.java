package com.pgl.ssdk.ces.out;

import com.pgl.ssdk.aw;
import com.pgl.ssdk.ces.a;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes4.dex */
public class PglSupport {
    private static String a;

    static {
        aw.b("nms");
    }

    public static String getBootid() {
        String str;
        String str2 = a;
        if (str2 != null) {
            return str2;
        }
        try {
            if (!aw.a("nms") || (str = (String) a.meta(Opcodes.IRETURN, null, null)) == null) {
                return "";
            }
            a = str;
            return str;
        } catch (Throwable unused) {
            return "";
        }
    }
}
