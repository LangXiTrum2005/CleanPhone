package zc;

import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f54858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f54859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f54860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f54861e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String[] f54862f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f54863g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f54864h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f54865i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f54866j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f54867k;
    public final String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f54868m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Uri f54869n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f54870o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Integer f54871p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Integer f54872q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Integer f54873r;

    public s(xh.e eVar) {
        String[] strArr;
        String[] strArr2;
        this.f54857a = eVar.j("gcm.n.title");
        this.f54858b = eVar.g("gcm.n.title");
        Object[] objArrF = eVar.f("gcm.n.title");
        if (objArrF == null) {
            strArr = null;
        } else {
            strArr = new String[objArrF.length];
            for (int i10 = 0; i10 < objArrF.length; i10++) {
                strArr[i10] = String.valueOf(objArrF[i10]);
            }
        }
        this.f54859c = strArr;
        this.f54860d = eVar.j("gcm.n.body");
        this.f54861e = eVar.g("gcm.n.body");
        Object[] objArrF2 = eVar.f("gcm.n.body");
        if (objArrF2 == null) {
            strArr2 = null;
        } else {
            strArr2 = new String[objArrF2.length];
            for (int i11 = 0; i11 < objArrF2.length; i11++) {
                strArr2[i11] = String.valueOf(objArrF2[i11]);
            }
        }
        this.f54862f = strArr2;
        this.f54863g = eVar.j("gcm.n.icon");
        String strJ = eVar.j("gcm.n.sound2");
        this.f54865i = TextUtils.isEmpty(strJ) ? eVar.j("gcm.n.sound") : strJ;
        this.f54866j = eVar.j("gcm.n.tag");
        this.f54867k = eVar.j("gcm.n.color");
        this.l = eVar.j("gcm.n.click_action");
        this.f54868m = eVar.j("gcm.n.android_channel_id");
        String strJ2 = eVar.j("gcm.n.link_android");
        strJ2 = TextUtils.isEmpty(strJ2) ? eVar.j("gcm.n.link") : strJ2;
        this.f54869n = TextUtils.isEmpty(strJ2) ? null : Uri.parse(strJ2);
        this.f54864h = eVar.j("gcm.n.image");
        this.f54870o = eVar.j("gcm.n.ticker");
        this.f54871p = eVar.c("gcm.n.notification_priority");
        this.f54872q = eVar.c("gcm.n.visibility");
        this.f54873r = eVar.c("gcm.n.notification_count");
        eVar.b("gcm.n.sticky");
        eVar.b("gcm.n.local_only");
        eVar.b("gcm.n.default_sound");
        eVar.b("gcm.n.default_vibrate_timings");
        eVar.b("gcm.n.default_light_settings");
        eVar.h();
        eVar.e();
        eVar.k();
    }
}
