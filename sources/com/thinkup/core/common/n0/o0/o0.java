package com.thinkup.core.common.n0.o0;

import com.google.firebase.crashlytics.internal.model.a;
import com.thinkup.core.common.n0.m.m0;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class o0 {
    public static final int m0 = 3;
    public static final int mo = 4;
    public static final int o0 = 1;
    public static final int om = 6;
    public static final int on = 2;
    public static final int oo = 2;
    protected int mm;
    protected String mn;

    public interface o {
        void o(Object obj);

        void o(Throwable th);
    }

    public m0 c_() {
        com.thinkup.core.oo.m mVarH = a.h(a.i());
        if (mVarH != null) {
            return new m0(mVarH.omn(), mVarH.on0());
        }
        return null;
    }

    public final JSONObject m0() {
        return com.thinkup.core.common.n0.oo.o(on());
    }

    public final JSONObject mo() {
        return com.thinkup.core.common.n0.oo.m(on());
    }

    public abstract int n();

    public void o(String str, String str2, String str3, int i2) {
    }

    public abstract int o0();

    public abstract boolean om();

    public int on() {
        return 0;
    }

    public abstract byte[] oo();

    public final void o(int i2, String str) {
        this.mm = i2;
        this.mn = str;
    }

    public static byte[] o(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes("utf-8"));
            gZIPOutputStream.close();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }

    public final void o(o oVar) {
        oo.o().o(this, oVar);
    }
}
