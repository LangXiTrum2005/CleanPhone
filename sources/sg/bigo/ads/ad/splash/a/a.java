package sg.bigo.ads.ad.splash.a;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.Button;
import android.widget.ImageView;
import sg.bigo.ads.R;
import sg.bigo.ads.api.a.m;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final sg.bigo.ads.ad.splash.b f46812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f46813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f46814c;
    private final m d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ViewGroup f46815e;
    private boolean f;

    /* JADX WARN: Failed to calculate best type for var: r7v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v1 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v1 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v2 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v4 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v1 ??, new type: char
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public a(android.view.ViewGroup r23, sg.bigo.ads.ad.splash.b r24, sg.bigo.ads.api.a.m r25) {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.splash.a.a.<init>(android.view.ViewGroup, sg.bigo.ads.ad.splash.b, sg.bigo.ads.api.a.m):void");
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    public final void a() {
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    public final void b() {
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    public final void c() {
        this.f46814c = c.a.d;
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    public final int d() {
        return this.f46814c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final ImageView imageView) {
        sg.bigo.ads.ad.splash.a.a(this.f46812a.x, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.splash.a.a.3
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                final Bitmap bitmap2 = bitmap;
                imageView.post(new Runnable() { // from class: sg.bigo.ads.ad.splash.a.a.3.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        imageView.setImageBitmap(bitmap2);
                    }
                });
            }
        });
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    public final void a(boolean z2) {
    }

    /* JADX WARN: Type inference failed for: r9v8, types: [sg.bigo.ads.api.core.c] */
    @Override // sg.bigo.ads.ad.splash.a.c
    public final void a(boolean z2, ViewGroup viewGroup, int i2) {
        g gVar;
        if (!this.f) {
            this.f = true;
            this.f46815e.removeViewAt(1);
            this.f46815e.addView(this.f46813b, 1, new ViewGroup.LayoutParams(-1, -1));
            this.f46813b.setVisibility(8);
        }
        this.f46814c = z2 ? c.a.f46854b : c.a.f46855c;
        int i3 = 0;
        this.f46813b.setVisibility(z2 ? 0 : 8);
        if (z2) {
            sg.bigo.ads.ad.splash.a.f46785b = true;
            m mVar = this.d;
            int iA = mVar != null ? mVar.a("endpage.guide_click") : 0;
            ViewGroup viewGroup2 = (ViewGroup) this.f46813b.findViewById(R.id.bigo_ad_splash_btn_cta_container);
            Button button = (Button) this.f46813b.findViewById(R.id.bigo_ad_splash_btn_cta);
            if (viewGroup2 != null) {
                if (iA == 4 && button != null) {
                    button.setTextSize(2, 15.0f);
                    button.setBackground(null);
                    View viewFindViewById = this.f46813b.findViewById(R.id.splash_footer_bg);
                    if (viewFindViewById != null) {
                        viewFindViewById.setVisibility(0);
                        viewFindViewById.setTag(14);
                        sg.bigo.ads.ad.b.a.a(viewGroup, viewFindViewById, 8, this.f46812a.x, 0);
                    }
                }
                sg.bigo.ads.ad.splash.a.b(viewGroup2, iA);
            }
            View viewFindViewById2 = this.f46813b.findViewById(R.id.layout_playable_loading);
            if (viewFindViewById2 != null && (gVar = this.f46812a.f46925w) != null && gVar.g != 0) {
                m mVar2 = this.d;
                int i4 = (sg.bigo.ads.api.a.i.f46986a.p().a() && 2 == (mVar2 != null ? mVar2.a("endpage.ad_component_layout") : 1)) ? 1 : 0;
                viewFindViewById2.setVisibility(i4 == 0 ? 4 : 0);
                i3 = i4;
            }
            sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.c) this.f46812a.x.f(), i3 != 0 ? 4 : 1, i2);
        }
    }
}
