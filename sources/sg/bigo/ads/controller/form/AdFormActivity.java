package sg.bigo.ads.controller.form;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import java.util.Locale;
import java.util.Map;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.c;
import sg.bigo.ads.api.a.e;
import sg.bigo.ads.common.form.a;
import sg.bigo.ads.common.form.render.b;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.s;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.controller.landing.d;

/* JADX INFO: loaded from: classes7.dex */
public class AdFormActivity extends Activity implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c<?, ?> f48141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f48142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f48143c;
    private boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f48144e;
    private Map<String, Object> f;
    private sg.bigo.ads.common.form.c g;

    public static Intent a(Context context) {
        Intent intent = new Intent(context, (Class<?>) AdFormActivity.class);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        return intent;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            View currentFocus = getCurrentFocus();
            if ((currentFocus instanceof EditText) && !u.a(currentFocus, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                currentFocus.clearFocus();
                try {
                    ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(getWindow().getDecorView().getWindowToken(), 0);
                } catch (Throwable unused) {
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.d) {
            super.onBackPressed();
        }
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0156 A[PHI: r17
  0x0156: PHI (r17v20 android.widget.FrameLayout) = 
  (r17v1 android.widget.FrameLayout)
  (r17v2 android.widget.FrameLayout)
  (r17v3 android.widget.FrameLayout)
  (r17v4 android.widget.FrameLayout)
  (r17v5 android.widget.FrameLayout)
  (r17v6 android.widget.FrameLayout)
  (r17v7 android.widget.FrameLayout)
  (r17v8 android.widget.FrameLayout)
  (r17v9 android.widget.FrameLayout)
  (r17v10 android.widget.FrameLayout)
  (r17v11 android.widget.FrameLayout)
  (r17v12 android.widget.FrameLayout)
  (r17v13 android.widget.FrameLayout)
  (r17v14 android.widget.FrameLayout)
  (r17v15 android.widget.FrameLayout)
  (r17v16 android.widget.FrameLayout)
  (r17v18 android.widget.FrameLayout)
  (r17v21 android.widget.FrameLayout)
 binds: [B:73:0x0152, B:70:0x0147, B:67:0x013b, B:64:0x0131, B:61:0x0126, B:58:0x011a, B:55:0x0110, B:52:0x0106, B:49:0x00fb, B:46:0x00ed, B:118:?, B:117:?, B:116:?, B:115:?, B:114:?, B:113:?, B:112:?, B:22:0x00a0] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        sg.bigo.ads.api.core.c cVar;
        c<?, ?> cVar2;
        FrameLayout frameLayout;
        byte b2;
        byte b3;
        Locale locale;
        super.onCreate(bundle);
        try {
            this.f48142b = getIntent().getIntExtra("ad_identifier", -1);
            this.f48144e = getIntent().getIntExtra("open_form_time", 0);
            c<?, ?> cVarB = d.b(this.f48142b);
            this.f48141a = cVarB;
            if (cVarB == null) {
                finish();
                return;
            }
            int iHashCode = cVarB.f().hashCode();
            this.f48143c = iHashCode;
            this.f = a.a(iHashCode);
            setContentView(R.layout.bigo_ad_activity_form);
            Window window = getWindow();
            if (window != null) {
                s.a(window);
            }
            View viewFindViewById = findViewById(R.id.bigo_ad_btn_close);
            if (viewFindViewById != null) {
                viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.controller.form.AdFormActivity.1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AdFormActivity.this.finish();
                    }
                });
            }
            FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.inter_main);
            if (frameLayout2 == null || (cVar2 = this.f48141a) == null) {
                return;
            }
            e eVarF = cVar2.f().f();
            String strE = eVarF.e();
            a.f47163a = strE;
            switch (strE.hashCode()) {
                case 3121:
                    frameLayout = frameLayout2;
                    if (!strE.equals(com.smartdigimkt.d2.a.X)) {
                        b2 = -1;
                    } else {
                        b2 = 0;
                    }
                    break;
                case 3201:
                    frameLayout = frameLayout2;
                    if (!strE.equals("de")) {
                        b2 = -1;
                    } else {
                        b2 = 13;
                    }
                    break;
                case 3246:
                    frameLayout = frameLayout2;
                    if (!strE.equals("es")) {
                        b2 = -1;
                    } else {
                        b2 = 1;
                    }
                    break;
                case 3259:
                    frameLayout = frameLayout2;
                    if (!strE.equals("fa")) {
                        b2 = -1;
                    } else {
                        b2 = 2;
                    }
                    break;
                case 3276:
                    frameLayout = frameLayout2;
                    if (!strE.equals(com.smartdigimkt.d2.a.W)) {
                        b2 = -1;
                    } else {
                        b2 = 16;
                    }
                    break;
                case 3325:
                    frameLayout = frameLayout2;
                    if (!strE.equals("he")) {
                        b2 = -1;
                    } else {
                        b2 = 3;
                    }
                    break;
                case 3329:
                    frameLayout = frameLayout2;
                    if (!strE.equals("hi")) {
                        b2 = -1;
                    } else {
                        b2 = 4;
                    }
                    break;
                case 3355:
                    frameLayout = frameLayout2;
                    if (!strE.equals("id")) {
                        b2 = -1;
                    } else {
                        b2 = 5;
                    }
                    break;
                case 3383:
                    frameLayout = frameLayout2;
                    if (!strE.equals(com.smartdigimkt.d2.a.T)) {
                        b2 = -1;
                    } else {
                        b2 = 14;
                    }
                    break;
                case 3428:
                    frameLayout = frameLayout2;
                    if (!strE.equals(com.smartdigimkt.d2.a.f34402V)) {
                        b2 = -1;
                    } else {
                        b2 = 15;
                    }
                    break;
                case 3494:
                    if (!strE.equals("ms")) {
                        frameLayout = frameLayout2;
                        b2 = -1;
                    } else {
                        b3 = 6;
                        frameLayout = frameLayout2;
                        b2 = b3;
                    }
                    break;
                case 3588:
                    if (!strE.equals("pt")) {
                        frameLayout = frameLayout2;
                        b2 = -1;
                    } else {
                        b3 = 7;
                        frameLayout = frameLayout2;
                        b2 = b3;
                    }
                    break;
                case 3651:
                    if (!strE.equals(com.smartdigimkt.d2.a.f34403Y)) {
                        frameLayout = frameLayout2;
                        b2 = -1;
                    } else {
                        b3 = 8;
                        frameLayout = frameLayout2;
                        b2 = b3;
                    }
                    break;
                case 3700:
                    if (!strE.equals("th")) {
                        frameLayout = frameLayout2;
                        b2 = -1;
                    } else {
                        b3 = 10;
                        frameLayout = frameLayout2;
                        b2 = b3;
                    }
                    break;
                case 3710:
                    if (!strE.equals("tr")) {
                        frameLayout = frameLayout2;
                        b2 = -1;
                    } else {
                        b3 = 9;
                        frameLayout = frameLayout2;
                        b2 = b3;
                    }
                    break;
                case 3749:
                    if (!strE.equals("uz")) {
                        frameLayout = frameLayout2;
                        b2 = -1;
                    } else {
                        b3 = 11;
                        frameLayout = frameLayout2;
                        b2 = b3;
                    }
                    break;
                case 3763:
                    if (!strE.equals("vi")) {
                        frameLayout = frameLayout2;
                        b2 = -1;
                    } else {
                        b3 = 12;
                        frameLayout = frameLayout2;
                        b2 = b3;
                    }
                    break;
                default:
                    frameLayout = frameLayout2;
                    b2 = -1;
                    break;
            }
            switch (b2) {
                case 0:
                    locale = new Locale(com.smartdigimkt.d2.a.X, "");
                    break;
                case 1:
                    locale = new Locale("es", "");
                    break;
                case 2:
                    locale = new Locale("fa", "");
                    break;
                case 3:
                    locale = new Locale("he", "");
                    break;
                case 4:
                    locale = new Locale("hi", "");
                    break;
                case 5:
                    locale = new Locale("id", "");
                    break;
                case 6:
                    locale = new Locale("ms", "");
                    break;
                case 7:
                    locale = new Locale("pt", "");
                    break;
                case 8:
                    locale = new Locale(com.smartdigimkt.d2.a.f34403Y, "");
                    break;
                case 9:
                    locale = new Locale("tr", "");
                    break;
                case 10:
                    locale = new Locale("th", "");
                    break;
                case 11:
                    locale = new Locale("uz", "");
                    break;
                case 12:
                    locale = new Locale("vi", "");
                    break;
                case 13:
                    locale = Locale.GERMAN;
                    break;
                case 14:
                    locale = Locale.JAPANESE;
                    break;
                case 15:
                    locale = Locale.KOREAN;
                    break;
                case 16:
                    locale = Locale.FRENCH;
                    break;
                default:
                    locale = Locale.ENGLISH;
                    break;
            }
            a.f47164b = locale;
            boolean z2 = this.f48141a.j;
            this.d = z2;
            sg.bigo.ads.common.form.c cVarA = sg.bigo.ads.common.form.c.a(this, eVarF, this.f, z2, this.f48144e, this.f48143c, this);
            this.g = cVarA;
            cVar = null;
            try {
                u.a(cVarA.f47173b, frameLayout, null, -1);
                this.g.f47174c.c();
            } catch (Throwable th) {
                th = th;
                c<?, ?> cVar3 = this.f48141a;
                sg.bigo.ads.core.d.b.a(cVar3 != null ? cVar3.f() : cVar, 3000, 10221, Log.getStackTraceString(th));
                finish();
            }
        } catch (Throwable th2) {
            th = th2;
            cVar = null;
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        sg.bigo.ads.common.form.c cVar;
        b bVar;
        super.onDestroy();
        try {
            if (this.f48141a != null && (cVar = this.g) != null && (bVar = cVar.f47172a) != null) {
                Map<String, Object> mapA = a.a(bVar.f47197b, bVar.f47198c.b(), bVar.f47198c.a());
                boolean z2 = this.d;
                if (!z2) {
                    a.a(this.f48143c, mapA);
                } else if (z2) {
                    a.a(this.f48143c, 3);
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // sg.bigo.ads.common.form.render.b.a
    public final void a() {
        this.d = true;
        c<?, ?> cVar = this.f48141a;
        if (cVar != null) {
            cVar.j = true;
        }
    }

    @Override // sg.bigo.ads.common.form.render.b.a
    public final void a(String str) {
        if (q.a((CharSequence) str)) {
            return;
        }
        d.a(this, str, this.f48141a);
    }
}
