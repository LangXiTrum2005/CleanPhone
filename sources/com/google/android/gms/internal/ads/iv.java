package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class iv extends md0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f15854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Activity f15855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f15856f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f15857g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f15858h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f15859i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f15860j;

    public iv(b30 b30Var, Map map) {
        long j10;
        super(10, b30Var, "createCalendarEvent");
        this.f15854d = map;
        this.f15855e = b30Var.zzj();
        this.f15856f = m("description");
        this.f15859i = m("summary");
        String str = (String) map.get("start_ticks");
        long j11 = -1;
        if (str == null) {
            j10 = -1;
        } else {
            try {
                j10 = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                j10 = -1;
            }
        }
        this.f15857g = j10;
        String str2 = (String) this.f15854d.get("end_ticks");
        if (str2 != null) {
            try {
                j11 = Long.parseLong(str2);
            } catch (NumberFormatException unused2) {
            }
        }
        this.f15858h = j11;
        this.f15860j = m("location");
    }

    public final String m(String str) {
        Map map = this.f15854d;
        return TextUtils.isEmpty((CharSequence) map.get(str)) ? "" : (String) map.get(str);
    }
}
