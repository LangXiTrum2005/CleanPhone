package sg.bigo.ads.ad.interstitial;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import sg.bigo.ads.common.view.RoundedImageView;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'b' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f45825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f45826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f45827c;
    public static final b d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f45828e;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final /* synthetic */ b[] f45829p;
    public final int f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f45830h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final sg.bigo.ads.common.ab.b f45831i;
    private final int j;
    private final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f45832l;
    private final int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f45833n;
    private final int o;

    static {
        b bVar = new b("WHITE", 0, null, d.f45977b, -10525849, 2, 1, 1);
        f45825a = bVar;
        sg.bigo.ads.common.ab.b bVarA = sg.bigo.ads.common.ab.b.a(1, 1, sg.bigo.ads.common.w.b.a(-16777216, 0.3f));
        int i2 = d.f45976a;
        b bVar2 = new b("DKGRAY_TRANSLUCENT", 1, bVarA, i2, i2, 0, 2, 2);
        f45826b = bVar2;
        sg.bigo.ads.common.ab.b bVarA2 = sg.bigo.ads.common.ab.b.a(1, 1, sg.bigo.ads.common.w.b.a(-16777216, 0.3f));
        int i3 = d.f45976a;
        b bVar3 = new b("MAIN_COLOR_TRANSLUCENT", 2, bVarA2, i3, i3, 0, 2, 2);
        f45827c = bVar3;
        sg.bigo.ads.common.ab.b bVarA3 = sg.bigo.ads.common.ab.b.a(4, 2, sg.bigo.ads.common.w.b.a(-16777216, 0.3f));
        int i4 = d.f45976a;
        b bVar4 = new b("LTGRAY_BLUR", 3, bVarA3, i4, i4, 0, 2, 2);
        d = bVar4;
        sg.bigo.ads.common.ab.b bVarA4 = sg.bigo.ads.common.ab.b.a(4, 2, sg.bigo.ads.common.w.b.a(-16777216, 0.3f));
        int i5 = d.f45976a;
        b bVar5 = new b("MAIN_COLOR_BLUR", 4, bVarA4, i5, i5, 0, 2, 2);
        f45828e = bVar5;
        f45829p = new b[]{bVar, bVar2, bVar3, bVar4, bVar5};
    }

    /* JADX WARN: Incorrect types in method signature: (Lsg/bigo/ads/common/ab/b;IIIIIII)V */
    private b(String str, int i2, sg.bigo.ads.common.ab.b bVar, int i3, int i4, int i5, int i6, int i7) {
        super(str, i2);
        this.f45831i = bVar;
        this.f = i3;
        this.g = i4;
        this.f45830h = i5;
        this.j = i6;
        this.k = i7;
        this.f45832l = -1;
        this.m = 134217728;
        this.f45833n = 1;
        this.o = 8;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f45829p.clone();
    }

    public final void a(View view) {
        if (view != null) {
            sg.bigo.ads.common.e.a.a(view, sg.bigo.ads.common.utils.e.a(view.getContext(), this.j));
        }
    }

    public final void b(View view) {
        if (view != null) {
            sg.bigo.ads.common.e.a.a(view, sg.bigo.ads.common.utils.e.a(view.getContext(), this.f45830h));
        }
    }

    public final void a(TextView textView, TextView textView2) {
        Context context;
        if (textView == null && textView2 == null) {
            return;
        }
        if (textView != null) {
            context = textView.getContext();
            textView.setTextColor(this.f);
        } else {
            context = null;
        }
        if (textView2 != null) {
            if (context == null) {
                context = textView2.getContext();
            }
            textView2.setTextColor(this.g);
        }
        sg.bigo.ads.common.ab.b bVar = this.f45831i;
        if (bVar == null) {
            if (textView != null) {
                textView.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            }
            if (textView2 != null) {
                textView2.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                return;
            }
            return;
        }
        int iA = sg.bigo.ads.common.utils.e.a(context, bVar.f47104a);
        int iA2 = sg.bigo.ads.common.utils.e.a(context, bVar.f47105b);
        int iA3 = sg.bigo.ads.common.utils.e.a(context, bVar.f47106c);
        if (textView != null) {
            textView.setShadowLayer(iA, iA2, iA3, bVar.d);
        }
        if (textView2 != null) {
            textView2.setShadowLayer(iA, iA2, iA3, bVar.d);
        }
    }

    public final void a(RoundedImageView roundedImageView) {
        if (roundedImageView == null) {
            return;
        }
        roundedImageView.setCornerRadius(sg.bigo.ads.common.utils.e.a(roundedImageView.getContext(), this.o));
    }
}
