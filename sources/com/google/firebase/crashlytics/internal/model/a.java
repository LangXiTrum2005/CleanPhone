package com.google.firebase.crashlytics.internal.model;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.same.image.b;
import com.mbridge.msdk.foundation.same.report.l;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import com.p004ironsource.ac;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.q9;
import com.p004ironsource.sdk.utils.Logger;
import com.smartdigimkt.z1.c;
import com.thinkup.core.common.inner.ui.thirdparty.ThirdPartyBannerTUView;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.ooo.o00;
import com.thinkup.core.oo.m;
import com.thinkup.core.oo.o0;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class a {
    public static void A(Throwable th, c cVar, Object obj) {
        cVar.a(obj, th.getMessage());
        th.getMessage();
    }

    public static void B(char[] cArr, int i2, int i3, StringBuilder sb) {
        sb.append(String.valueOf(Arrays.copyOfRange(cArr, i2, i3)));
    }

    public static String C(StringBuilder sb, String str) {
        sb.append(str.intern());
        return sb.toString();
    }

    public static void D(String str, String str2, String str3) {
        q0.a(str3, str + str2);
    }

    public static int a(float f) {
        return v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), f);
    }

    public static int b(int i2, int i3, int i4, int i5) {
        return ((i2 + i3) - i4) % i5;
    }

    public static View c(ThirdPartyBannerTUView thirdPartyBannerTUView, String str, String str2) {
        return thirdPartyBannerTUView.findViewById(o00.o(thirdPartyBannerTUView.getContext(), str, str2));
    }

    public static b d() {
        return b.a(com.mbridge.msdk.foundation.controller.c.n().d());
    }

    public static l e(String str) {
        return new l.b(str).a();
    }

    public static g f(h hVar) {
        return hVar.d(com.mbridge.msdk.foundation.controller.c.n().b());
    }

    public static com.smartdigimkt.d7.b g() {
        return com.smartdigimkt.d7.b.a(com.smartdigimkt.m6.b.p().k());
    }

    public static m h(o0 o0Var) {
        return o0Var.m(o0n.m().o00());
    }

    public static o0 i() {
        return o0.o(o0n.m().on());
    }

    public static String j(Context context, float f, StringBuilder sb, String str) {
        sb.append(com.smartdigimkt.n8.h.b(context, f));
        sb.append(str);
        return sb.toString();
    }

    public static String k(Number number, String str) {
        return number.getClass().getName().concat(str);
    }

    public static String l(StringBuilder sb, int i2, String str, String str2, String str3) {
        sb.append(i2);
        sb.append(str);
        return str2.replaceAll(str3, sb.toString());
    }

    public static String m(StringBuilder sb, String str) {
        return str + ((Object) sb);
    }

    public static String n(StringBuilder sb, String str, String str2) {
        sb.append(str.intern());
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder o(Exception exc, String str) {
        q9.d().a(exc);
        return new StringBuilder(str);
    }

    public static StringBuilder p(String str, Throwable th) {
        q9.d().a(th);
        return new StringBuilder(str);
    }

    public static StringBuilder q(Throwable th, com.mbridge.msdk.video.bt.component.a aVar, Object obj, String str) {
        aVar.a(obj, th.getMessage());
        return new StringBuilder(str);
    }

    public static void r(int i2, String str, StringBuilder sb) {
        sb.append(str.length() % i2);
    }

    public static void s(ac acVar, Set set) {
        set.add(Integer.valueOf(acVar.getId()));
    }

    public static void t(Exception exc, StringBuilder sb, String str) {
        sb.append(exc.getMessage());
        q0.b(str, sb.toString());
    }

    public static void u(String str, int i2, RelativeLayout.LayoutParams layoutParams, int i3) {
        layoutParams.addRule(i3, str.substring(i2).hashCode());
    }

    public static void v(String str, String str2, String str3) {
        q0.b(str3, str + str2);
    }

    public static void w(String str, String str2, String str3, String str4) {
        Logger.i(str4, str + str2 + str3);
    }

    public static void x(String str, String str2, Throwable th) {
        q0.b(str2, str + th);
    }

    public static void y(StringBuilder sb, String str, String str2, IronLog ironLog) {
        sb.append(str);
        sb.append(str2);
        ironLog.verbose(sb.toString());
    }

    public static void z(StringBuilder sb, Throwable th, String str) {
        sb.append(th.getMessage());
        q0.a(str, sb.toString());
    }
}
