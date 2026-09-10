package com.bytedance.adsdk.ud.lnr;

import androidx.datastore.preferences.protobuf.a;
import com.bytedance.adsdk.ud.lnr.ud.jtx;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class mml {
    private final double lnr;
    private final double mml;
    private final String mo;
    private final String mzz;
    private final List<jtx> qdl;
    private final char ud;

    public mml(List<jtx> list, char c2, double d, double d2, String str, String str2) {
        this.qdl = list;
        this.ud = c2;
        this.lnr = d;
        this.mml = d2;
        this.mzz = str;
        this.mo = str2;
    }

    public static int qdl(char c2, String str, String str2) {
        return str2.hashCode() + a.b(str, c2 * 31, 31);
    }

    public int hashCode() {
        return qdl(this.ud, this.mo, this.mzz);
    }

    public double ud() {
        return this.mml;
    }

    public List<jtx> qdl() {
        return this.qdl;
    }
}
