package com.thinkup.core.common.mn.o0;

import com.thinkup.core.api.ITUBaseAdAdapter;
import com.thinkup.core.common.ooo.o00;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class m {
    public static final int o = -1;
    private Map<String, Object> m;
    private ITUBaseAdAdapter m0;
    private int mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Map<String, Object> f41873n;
    private int o0;
    private int om;
    private String on;
    private int oo;

    public m(Map<String, Object> map) {
        this.mo = 0;
        this.m = map;
        this.o0 = o00.o(map, "ad_format", -1);
        this.oo = o00.o(map, "ad_type", -1);
        this.om = o00.o(map, "onreward_type", 1);
        this.on = o00.o(map, "custom_ext", "");
        this.mo = o00.o(map, "render_type", 0);
    }

    public final int m() {
        return this.oo;
    }

    public final boolean m0() {
        return String.valueOf(this.o0).equals("3");
    }

    public final boolean mm() {
        return String.valueOf(this.o0).equals("0");
    }

    public final boolean mn() {
        int i2;
        int i3 = this.o0;
        return (i3 == -1 || (i2 = this.oo) == -1 || i3 == i2) ? false : true;
    }

    public final boolean mo() {
        return String.valueOf(this.o0).equals("1");
    }

    public final int n() {
        return this.om;
    }

    public final boolean n0() {
        return mn() && this.oo == 0;
    }

    public final boolean nm() {
        return mn() && this.oo == 2;
    }

    public final boolean nn() {
        return mn() && this.oo == 3;
    }

    public final boolean no() {
        return mn() && this.oo == 4;
    }

    public final <T> T o(String str, T t) {
        return (T) o00.o(this.m, str, t);
    }

    public final String o0() {
        return this.on;
    }

    public final int o00() {
        return this.mo;
    }

    public final ITUBaseAdAdapter o0m() {
        return this.m0;
    }

    public final Map<String, Object> o0o() {
        return this.f41873n;
    }

    public final boolean om() {
        return String.valueOf(this.o0).equals("2");
    }

    public final boolean on() {
        return String.valueOf(this.o0).equals("4");
    }

    public final int oo() {
        return this.o0;
    }

    private void m(int i2) {
        this.om = i2;
    }

    private void n(int i2) {
        this.o0 = i2;
    }

    public final Map<String, Object> o() {
        return this.m;
    }

    private void o(int i2) {
        this.oo = i2;
    }

    private void o(String str) {
        this.on = str;
    }

    public final void o(Map<String, Object> map) {
        this.f41873n = map;
    }

    public final void o(ITUBaseAdAdapter iTUBaseAdAdapter) {
        this.m0 = iTUBaseAdAdapter;
    }
}
